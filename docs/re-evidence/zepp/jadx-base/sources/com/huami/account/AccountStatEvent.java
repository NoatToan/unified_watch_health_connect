package com.huami.account;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b?\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u0016\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0004R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0016\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0004R\u0016\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0004R\u0016\u00105\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0004R\u0016\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0004R\u0016\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0004R\u0016\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0004R\u0016\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0004R\u0016\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0004R\u0016\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0016\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0004R\u0016\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0004R\u0016\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0004¨\u0006A"}, d2 = {"Lcom/huami/account/AccountStatEvent;", "", "", "EVENT_LOGIN_VIEW_NUM", "Ljava/lang/String;", "EVENT_LOGIN_VIEW_PRIVACY", "EVENT_LOGIN_PRIVACY_DIALOG_NUM", "EVENT_LOGIN_PRIVACY_EXIT", "EVENT_LOGIN_ACCOUNT_SIGN", "EVENT_LOGIN_ACCOUNT_THIRD", "EVENT_LOGIN_THIRD_AUTH_STATUS", "KEY_ACCOUNT_SIGN_TYPE", "KEY_ACCOUNT_SIGN_THIRD_NAME", "KEY_ACCOUNT_SIGN_THIRD_STATUS", "VALUE_SOFTWARE_LICENSE", "VALUE_PRIVACY_POLICY", "VALUE_USER", "VALUE_EXIT", "VALUE_AGREE", "VALUE_ACCOUNT_SIGN_PHONE", "VALUE_ACCOUNT_SIGN_EMAIL", "VALUE_SIGN_THIRD_STATUS_SIGNIN", "VALUE_SIGN_THIRD_STATUS_SINGUP", "VALUE_SIGN_THIRD_STATUS_UNKNOW", "EVENT_REGISTER_ACCOUNT_SIGNUP", "EVENT_SIGNUP_CAPTCHA_VERIFY", "EVENT_SIGNUP_RESULT", "KEY_ACCOUNT_SIGNUP_TYPE", "KEY_ACCOUNT_SIGNUP_RESULT", "KEY_ACCOUNT_SIGHUP_RESOURCE", "KEY_ACCOUNT_SIGHUP_CODE", "VALUE_ACCOUNT_SIGNUP_PHONE", "VALUE_ACCOUNT_SIGNUP_EMAIL", "VALUE_ACCOUNT_SIGNUP_RESULT_SUCCESS", "VALUE_ACCOUNT_SIGNUP_RESULT_FAIL", "EVENT_SET_NEW_USER_INFO_VIEW_NUM", "EVENT_LOGOUT_OUT", "EVENT_LOGIN_OVERDUE", "VALUE_LOGOUT", "VALUE_RE_LOGIN", "EVENT_SETTING_ACCOUNT_VIEW_NUM", "EVENT_SETTING_ACCOUNT_ERROR", "VALUE_ERROR_BY_NET", "VALUE_ACCOUNT_EXISTS", "VALUE_OTHER_ERROR", "EVENT_LOGIN_RESULT", "EVENT_SIGN_IN_RESULT", "KEY_SIGN_IN_RESULT", "KEY_SIGN_IN_ERROR_CODE", "KEY_SIGN_IN_SOURCE", "VALUE_SIGN_IN_SUCCESS", "VALUE_SIGN_IN_Fail", "VALUE_REQUEST_SUCCESS_CODE", "VALUE_WEIXIN_SUCCESS", "VALUE_WEIXIN_FAIL", "VALUE_XIAOMI_SUCCESS", "VALUE_XIAOMI_FAIL", "EVENT_SETTING_OUT", "VALUE_LOG_OUT", "MINE_SETTING_OUT", "EVENT_SELECT_AREA", "KEY_SELECT_AREA_RECOMMENDED_AREA_CODE", "KEY_SELECT_AREA_CODE", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AccountStatEvent {

    @NotNull
    public static final String EVENT_LOGIN_ACCOUNT_SIGN = "Account_Sign_C";

    @NotNull
    public static final String EVENT_LOGIN_ACCOUNT_THIRD = "Account_Third_C";

    @NotNull
    public static final String EVENT_LOGIN_OVERDUE = "Login_Overdue";

    @NotNull
    public static final String EVENT_LOGIN_PRIVACY_DIALOG_NUM = "Login_PrivacyDialogNum";

    @NotNull
    public static final String EVENT_LOGIN_PRIVACY_EXIT = "Login_PrivacyExit";

    @NotNull
    public static final String EVENT_LOGIN_RESULT = "Login_Result";

    @NotNull
    public static final String EVENT_LOGIN_THIRD_AUTH_STATUS = "Account_Third_Auth_Status_C";

    @NotNull
    public static final String EVENT_LOGIN_VIEW_NUM = "Login_ViewNum";

    @NotNull
    public static final String EVENT_LOGIN_VIEW_PRIVACY = "Login_ViewPrivacy";

    @NotNull
    public static final String EVENT_LOGOUT_OUT = "Logout_Out";

    @NotNull
    public static final String EVENT_REGISTER_ACCOUNT_SIGNUP = "Account_Signup_C";

    @NotNull
    public static final String EVENT_SELECT_AREA = "Account_Select_Area_C";

    @NotNull
    public static final String EVENT_SETTING_ACCOUNT_ERROR = "Setting_AccountError";

    @NotNull
    public static final String EVENT_SETTING_ACCOUNT_VIEW_NUM = "Setting_AccountViewNum";

    @NotNull
    public static final String EVENT_SETTING_OUT = "Setting_Out";

    @NotNull
    public static final String EVENT_SET_NEW_USER_INFO_VIEW_NUM = "SetNewUserInfo_ViewNum";

    @NotNull
    public static final String EVENT_SIGNUP_CAPTCHA_VERIFY = "Account_Signup_Captcha_Verify_C";

    @NotNull
    public static final String EVENT_SIGNUP_RESULT = "Account_Signup_Result_C";

    @NotNull
    public static final String EVENT_SIGN_IN_RESULT = "Account_Signin_Result_C";

    @NotNull
    public static final AccountStatEvent INSTANCE = new AccountStatEvent();

    @NotNull
    public static final String KEY_ACCOUNT_SIGHUP_CODE = "Code";

    @NotNull
    public static final String KEY_ACCOUNT_SIGHUP_RESOURCE = "Source";

    @NotNull
    public static final String KEY_ACCOUNT_SIGNUP_RESULT = "Result";

    @NotNull
    public static final String KEY_ACCOUNT_SIGNUP_TYPE = "type";

    @NotNull
    public static final String KEY_ACCOUNT_SIGN_THIRD_NAME = "thirdName";

    @NotNull
    public static final String KEY_ACCOUNT_SIGN_THIRD_STATUS = "Status";

    @NotNull
    public static final String KEY_ACCOUNT_SIGN_TYPE = "type";

    @NotNull
    public static final String KEY_SELECT_AREA_CODE = "AreaCode";

    @NotNull
    public static final String KEY_SELECT_AREA_RECOMMENDED_AREA_CODE = "recommendAreaCode";

    @NotNull
    public static final String KEY_SIGN_IN_ERROR_CODE = "Code";

    @NotNull
    public static final String KEY_SIGN_IN_RESULT = "Result";

    @NotNull
    public static final String KEY_SIGN_IN_SOURCE = "Source";

    @NotNull
    public static final String MINE_SETTING_OUT = "Setting_Out";

    @NotNull
    public static final String VALUE_ACCOUNT_EXISTS = "AccountExists";

    @NotNull
    public static final String VALUE_ACCOUNT_SIGNUP_EMAIL = "Email";

    @NotNull
    public static final String VALUE_ACCOUNT_SIGNUP_PHONE = "Phone";

    @NotNull
    public static final String VALUE_ACCOUNT_SIGNUP_RESULT_FAIL = "Fail";

    @NotNull
    public static final String VALUE_ACCOUNT_SIGNUP_RESULT_SUCCESS = "Success";

    @NotNull
    public static final String VALUE_ACCOUNT_SIGN_EMAIL = "Email";

    @NotNull
    public static final String VALUE_ACCOUNT_SIGN_PHONE = "Phone";

    @NotNull
    public static final String VALUE_AGREE = "Agree";

    @NotNull
    public static final String VALUE_ERROR_BY_NET = "ErrorByNet";

    @NotNull
    public static final String VALUE_EXIT = "Exit";

    @NotNull
    public static final String VALUE_LOGOUT = "Logout";

    @NotNull
    public static final String VALUE_LOG_OUT = "LogOut";

    @NotNull
    public static final String VALUE_OTHER_ERROR = "OtherError";

    @NotNull
    public static final String VALUE_PRIVACY_POLICY = "PrivacyPolicy";

    @NotNull
    public static final String VALUE_REQUEST_SUCCESS_CODE = "200";

    @NotNull
    public static final String VALUE_RE_LOGIN = "ReLogin";

    @NotNull
    public static final String VALUE_SIGN_IN_Fail = "Fail";

    @NotNull
    public static final String VALUE_SIGN_IN_SUCCESS = "Success";

    @NotNull
    public static final String VALUE_SIGN_THIRD_STATUS_SIGNIN = "Signin";

    @NotNull
    public static final String VALUE_SIGN_THIRD_STATUS_SINGUP = "Signup";

    @NotNull
    public static final String VALUE_SIGN_THIRD_STATUS_UNKNOW = "Unknow";

    @NotNull
    public static final String VALUE_SOFTWARE_LICENSE = "SoftwareLicense";

    @NotNull
    public static final String VALUE_USER = "User";

    @NotNull
    public static final String VALUE_WEIXIN_FAIL = "WeixinFail";

    @NotNull
    public static final String VALUE_WEIXIN_SUCCESS = "WeixinSuccess";

    @NotNull
    public static final String VALUE_XIAOMI_FAIL = "XiaomiFail";

    @NotNull
    public static final String VALUE_XIAOMI_SUCCESS = "XiaomiSuccess";

    private AccountStatEvent() {
    }
}
