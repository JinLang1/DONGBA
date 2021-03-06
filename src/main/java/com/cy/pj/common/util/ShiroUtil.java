package com.cy.pj.common.util;

import org.apache.shiro.SecurityUtils;

import com.cy.pj.sys.entity.SysUser;

public class ShiroUtil {

	public static String getUsername() {
		return getLoginUser().getUsername();
	}
	/**
	 * 获取登录用户
	 * @return
	 */
	public static SysUser getLoginUser() {
		return (SysUser)SecurityUtils.getSubject().getPrincipal();
	}
}
