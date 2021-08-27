package com.kh.happve.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kh.happve.dto.PasswordForm;
import com.kh.happve.repository.MemberRepository;

import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public class PasswordFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return PasswordForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		 PasswordForm passwordForm = (PasswordForm)target;
	     if (!passwordForm.getNewPassword().equals(passwordForm.getNewPasswordConfirm())) {
	            errors.rejectValue("newPasswordConfirm", "wrong.value", "입력한 새 패스워드가 일치하지 않습니다.");
	        }
	    }
}
