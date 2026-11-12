package com.huami.account.ui.common.repo;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.common.entity.PhoneBaseForm;
import com.huami.account.ui.common.entity.PhoneLoginResponse;
import com.huami.account.ui.login.entity.PhoneLoginForm;
import com.huami.passport.AccountManager;
import com.huami.passport.AccountManagerExt;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.OperationResult;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.SmsCode;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000bJ0\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ:\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010JB\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010J*\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010J\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\fJ:\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/huami/account/ui/common/repo/PhoneAccountRepository;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/ui/login/entity/PhoneLoginForm;", "loginForm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/account/ui/common/entity/PhoneLoginResponse;", "Lcom/huami/passport/entity/LoginToken;", "loginWithPhone", "Lcom/huami/passport/OperationResult;", "(Lcom/huami/account/ui/login/entity/PhoneLoginForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "sendCodeForm", "Lkotlin/Pair;", "", "", "registerSendCode", "phoneNum", "areaCode", "inputCode", "codeType", "Lcom/huami/passport/entity/SmsCode;", "verifyCode", "password", "returnCode", "countryCode", "Lcom/huami/passport/entity/LoginInfo;", "registerWithPhone", "code", "registerAutoLogin", "forgetPwdParams", "forgetPwdSendCode", "changePassword", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneAccountRepository {

    @NotNull
    public static final String TAG = "PhoneAccount";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "手机登录...";
        }
    }

    @NotNull
    public final MutableLiveData<PhoneLoginResponse<String>> changePassword(@NotNull Context context, @NotNull String phoneNum, @NotNull String areaCode, @NotNull String password, @NotNull String returnCode) {
        HMLog.i(TAG, "手机重置密码...", new Object[0]);
        final MutableLiveData<PhoneLoginResponse<String>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new PhoneLoginResponse<>(0, null, null, 6, null));
        AccountManager.getDefault(context).changePassword(areaCode + phoneNum, password, new IAccount.Callback<String, ErrorCode>() { // from class: com.huami.account.ui.common.repo.PhoneAccountRepository.changePassword.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneAccountRepository.TAG, "手机重置密码失败,errorCode=" + (errorCode == null ? null : errorCode.getErrorCode()), new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(2, errorCode, null, 4, null));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable String data) {
                HMLog.i(PhoneAccountRepository.TAG, "手机重置密码成功", new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, data, 2, null));
            }
        }, returnCode);
        return mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<PhoneLoginResponse<String>> forgetPwdSendCode(@NotNull Context context, @NotNull PhoneBaseForm forgetPwdParams) {
        HMLog.i(TAG, "手机找回密码求情验证码...", new Object[0]);
        final MutableLiveData<PhoneLoginResponse<String>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new PhoneLoginResponse<>(0, null, null, 6, null));
        AccountManager.getDefault(context).resetPassword(forgetPwdParams.getAreaCode() + forgetPwdParams.getPhoneNumber(), new IAccount.Callback<String, ErrorCode>() { // from class: com.huami.account.ui.common.repo.PhoneAccountRepository.forgetPwdSendCode.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@NotNull ErrorCode errorCode) {
                HMLog.i(PhoneAccountRepository.TAG, "手机找回密码求情验证码失败,errorCode=" + errorCode.getErrorCode(), new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(2, errorCode, null, 4, null));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@NotNull String s) {
                HMLog.i(PhoneAccountRepository.TAG, "手机找回密码求情验证码成功", new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, s, 2, null));
            }
        });
        return mutableLiveData;
    }

    @Deprecated(message = "Repo 层不应传入 Context，使用无 Context 参数版本 loginWithPhone")
    @NotNull
    public final MutableLiveData<PhoneLoginResponse<LoginToken>> loginWithPhone(@NotNull Context context, @NotNull PhoneLoginForm loginForm) {
        HMLog.i(TAG, "手机登录...", new Object[0]);
        final MutableLiveData<PhoneLoginResponse<LoginToken>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new PhoneLoginResponse<>(0, null, null, 6, null));
        AccountManager.getDefault(context).login(loginForm.getAreaCode() + loginForm.getTeleNumber(), loginForm.getPassword(), false, new IAccount.Callback<LoginToken, ErrorCode>() { // from class: com.huami.account.ui.common.repo.PhoneAccountRepository.loginWithPhone.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneAccountRepository.TAG, "手机登录请求失败,errorCode=" + (errorCode == null ? null : errorCode.getErrorCode()), new Object[0]);
                mutableLiveData.postValue(new PhoneLoginResponse<>(2, errorCode, null, 4, null));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable LoginToken loginToken) {
                mutableLiveData.postValue(new PhoneLoginResponse<>(1, null, loginToken, 2, null));
            }
        });
        return mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<PhoneLoginResponse<LoginToken>> registerAutoLogin(@NotNull Context context, @NotNull String code, @NotNull String countryCode) {
        HMLog.i(TAG, "手机注册成功自动登录...", new Object[0]);
        final MutableLiveData<PhoneLoginResponse<LoginToken>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new PhoneLoginResponse<>(0, null, null, 6, null));
        AccountManager.getDefault(context).registerIdV2(context, "huami_phone", code, countryCode, new IAccount.Callback<LoginToken, ErrorCode>() { // from class: com.huami.account.ui.common.repo.PhoneAccountRepository.registerAutoLogin.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneAccountRepository.TAG, "手机注册成功自动登录失败,errorCode=" + (errorCode == null ? null : errorCode.getErrorCode()), new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(2, errorCode, null, 4, null));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable LoginToken loginToken) {
                HMLog.i(PhoneAccountRepository.TAG, "手机注册成功自动登录成功", new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, loginToken, 2, null));
            }
        });
        return mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<PhoneLoginResponse<Pair<Boolean, String>>> registerSendCode(@NotNull Context context, @NotNull PhoneBaseForm sendCodeForm) {
        HMLog.i(TAG, "手机注册发送验证码...", new Object[0]);
        final MutableLiveData<PhoneLoginResponse<Pair<Boolean, String>>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new PhoneLoginResponse<>(0, null, null, 6, null));
        AccountManager.getDefault(context).checkUserNameStatus(sendCodeForm.getAreaCode() + sendCodeForm.getPhoneNumber(), sendCodeForm.getCountryCode(), new IAccount.Callback<String, ErrorCode>() { // from class: com.huami.account.ui.common.repo.PhoneAccountRepository.registerSendCode.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneAccountRepository.TAG, "手机注册发送验证码失败,errorCode=" + (errorCode == null ? null : errorCode.getErrorCode()), new Object[0]);
                if (Intrinsics.areEqual("404", errorCode != null ? errorCode.getErrorCode() : null)) {
                    mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, new Pair(Boolean.FALSE, errorCode.getErrorMsg()), 2, null));
                } else {
                    mutableLiveData.setValue(new PhoneLoginResponse<>(2, errorCode, null, 4, null));
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable String message) {
                HMLog.i(PhoneAccountRepository.TAG, "手机注册发送验证码成功", new Object[0]);
                if (Intrinsics.areEqual("200", message)) {
                    mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, new Pair(Boolean.TRUE, message), 2, null));
                } else {
                    mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, new Pair(Boolean.FALSE, message), 2, null));
                }
            }
        });
        return mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<PhoneLoginResponse<LoginInfo>> registerWithPhone(@NotNull Context context, @NotNull String phoneNum, @NotNull String areaCode, @NotNull String password, @NotNull String returnCode, @NotNull String countryCode) {
        HMLog.i(TAG, "手机注册...", new Object[0]);
        final MutableLiveData<PhoneLoginResponse<LoginInfo>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new PhoneLoginResponse<>(0, null, null, 6, null));
        AccountManager.getDefault(context).registrations("", areaCode + phoneNum, password, returnCode, countryCode, new IAccount.Callback<LoginInfo, ErrorCode>() { // from class: com.huami.account.ui.common.repo.PhoneAccountRepository.registerWithPhone.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneAccountRepository.TAG, "手机注册失败:" + (errorCode == null ? null : Integer.valueOf(errorCode.getCode())), new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(2, errorCode, null, 4, null));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable LoginInfo loginInfo) {
                HMLog.i(PhoneAccountRepository.TAG, "手机注册成功", new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, loginInfo, 2, null));
            }
        });
        return mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<PhoneLoginResponse<SmsCode>> verifyCode(@NotNull Context context, @NotNull String phoneNum, @NotNull String areaCode, @NotNull String inputCode, @NotNull String codeType) {
        HMLog.i(TAG, "验证验证码...", new Object[0]);
        final MutableLiveData<PhoneLoginResponse<SmsCode>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new PhoneLoginResponse<>(0, null, null, 6, null));
        AccountManager.getDefault(context).verfyCode(areaCode + phoneNum, codeType, inputCode, new IAccount.Callback<SmsCode, ErrorCode>() { // from class: com.huami.account.ui.common.repo.PhoneAccountRepository.verifyCode.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode error) {
                HMLog.i(PhoneAccountRepository.TAG, "验证验证码失败,errorCode=" + (error == null ? null : error.getErrorCode()), new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(2, error, null, 4, null));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable SmsCode result) {
                HMLog.i(PhoneAccountRepository.TAG, "验证验证码成功", new Object[0]);
                mutableLiveData.setValue(new PhoneLoginResponse<>(1, null, result, 2, null));
            }
        });
        return mutableLiveData;
    }

    @Nullable
    public final Object loginWithPhone(@NotNull PhoneLoginForm phoneLoginForm, @NotNull Continuation<? super OperationResult<? extends LoginToken>> continuation) {
        HMLog.info(TAG, a.a);
        return AccountManagerExt.awaitLogin(AccountManager.getDefault(AccountExternalsKt.getAppContext()), phoneLoginForm.getAreaCode() + phoneLoginForm.getTeleNumber(), phoneLoginForm.getPassword(), false, continuation);
    }
}
