package com.huami.account.ui.forget.viewmodel;

import android.app.Application;
import androidx.arch.core.util.Function;
import androidx.autofill.HintConstants;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.bind.PhoneBindPasswordActivity;
import com.huami.account.ui.common.entity.PhoneBaseForm;
import com.huami.account.ui.common.entity.PhoneLoginResponse;
import com.huami.account.ui.common.entity.VerifyCodeForm;
import com.huami.account.ui.common.repo.PhoneAccountRepository;
import com.huami.account.ui.forget.entity.ChangePasswordForm;
import com.huami.account.ui.forget.entity.ChangePasswordResult;
import com.huami.account.ui.forget.viewmodel.PhoneForgetPasswordViewModel;
import com.huami.passport.entity.SmsCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b:\u0010;J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0#0\"8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\"\u00101\u001a\b\u0012\u0004\u0012\u00020+0\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR\"\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001cR(\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060#0\"8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'¨\u0006<"}, d2 = {"Lcom/huami/account/ui/forget/viewmodel/PhoneForgetPasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "areaCode", "countryCode", "", "postSendCodeForm", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "phoneBaseForm", "code", "codeType", "postVerifyForm", PhoneBindPasswordActivity.EXTRA_SMS_CODE, "password", "postChangePasswordForm", "Landroid/app/Application;", "a", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "Lcom/huami/account/ui/common/repo/PhoneAccountRepository;", "b", "Lcom/huami/account/ui/common/repo/PhoneAccountRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "getSendVerifyCodeFormLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sendVerifyCodeFormLiveData", "Lcom/huami/account/ui/common/entity/VerifyCodeForm;", GoogleApiAvailabilityLight.a, "getPhoneVerifyCodeFormLiveData$accountui_release", "phoneVerifyCodeFormLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/huami/account/ui/common/entity/PhoneLoginResponse;", "e", "Landroidx/lifecycle/LiveData;", "getGetVerifyCodeResponse", "()Landroidx/lifecycle/LiveData;", "setGetVerifyCodeResponse", "(Landroidx/lifecycle/LiveData;)V", "getVerifyCodeResponse", "Lcom/huami/passport/entity/SmsCode;", "f", "getPhoneVerifyResponse$accountui_release", "phoneVerifyResponse", "g", "getSmsCodeLiveData$accountui_release", "smsCodeLiveData", "Lcom/huami/account/ui/forget/entity/ChangePasswordForm;", "h", "getChangePasswordFormLivaData$accountui_release", "changePasswordFormLivaData", "Lcom/huami/account/ui/forget/entity/ChangePasswordResult;", "i", "getChangePasswordResponse$accountui_release", "changePasswordResponse", "<init>", "(Landroid/app/Application;Lcom/huami/account/ui/common/repo/PhoneAccountRepository;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneForgetPasswordViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application application;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PhoneAccountRepository repository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PhoneBaseForm> sendVerifyCodeFormLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<VerifyCodeForm> phoneVerifyCodeFormLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private LiveData<PhoneLoginResponse<String>> getVerifyCodeResponse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PhoneLoginResponse<SmsCode>> phoneVerifyResponse;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SmsCode> smsCodeLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ChangePasswordForm> changePasswordFormLivaData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PhoneLoginResponse<ChangePasswordResult>> changePasswordResponse;

    public PhoneForgetPasswordViewModel(@NotNull Application application, @NotNull PhoneAccountRepository phoneAccountRepository) {
        this.application = application;
        this.repository = phoneAccountRepository;
        MutableLiveData<PhoneBaseForm> mutableLiveData = new MutableLiveData<>();
        this.sendVerifyCodeFormLiveData = mutableLiveData;
        MutableLiveData<VerifyCodeForm> mutableLiveData2 = new MutableLiveData<>();
        this.phoneVerifyCodeFormLiveData = mutableLiveData2;
        this.smsCodeLiveData = new MutableLiveData<>();
        MutableLiveData<ChangePasswordForm> mutableLiveData3 = new MutableLiveData<>();
        this.changePasswordFormLivaData = mutableLiveData3;
        this.getVerifyCodeResponse = Transformations.switchMap(mutableLiveData, new Function() { // from class: cx5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PhoneForgetPasswordViewModel.e(this.a, (PhoneBaseForm) obj);
            }
        });
        this.phoneVerifyResponse = Transformations.switchMap(mutableLiveData2, new Function() { // from class: dx5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PhoneForgetPasswordViewModel.f(this.a, (VerifyCodeForm) obj);
            }
        });
        this.changePasswordResponse = Transformations.switchMap(mutableLiveData3, new Function() { // from class: ex5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PhoneForgetPasswordViewModel.g(this.a, (ChangePasswordForm) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(PhoneForgetPasswordViewModel phoneForgetPasswordViewModel, PhoneBaseForm phoneBaseForm) {
        return phoneForgetPasswordViewModel.repository.forgetPwdSendCode(phoneForgetPasswordViewModel.application, phoneBaseForm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData f(PhoneForgetPasswordViewModel phoneForgetPasswordViewModel, VerifyCodeForm verifyCodeForm) {
        return phoneForgetPasswordViewModel.repository.verifyCode(phoneForgetPasswordViewModel.application, verifyCodeForm.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String(), verifyCodeForm.getAreaCode(), verifyCodeForm.getCode(), verifyCodeForm.getCodeType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData g(PhoneForgetPasswordViewModel phoneForgetPasswordViewModel, final ChangePasswordForm changePasswordForm) {
        return Transformations.map(phoneForgetPasswordViewModel.repository.changePassword(phoneForgetPasswordViewModel.application, changePasswordForm.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String(), changePasswordForm.getAreaCode(), changePasswordForm.getPassword(), changePasswordForm.getInputCode()), new Function<PhoneLoginResponse<String>, PhoneLoginResponse<ChangePasswordResult>>() { // from class: com.huami.account.ui.forget.viewmodel.PhoneForgetPasswordViewModel$_init_$lambda-3$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final PhoneLoginResponse<ChangePasswordResult> apply(PhoneLoginResponse<String> phoneLoginResponse) {
                PhoneLoginResponse<String> phoneLoginResponse2 = phoneLoginResponse;
                return new PhoneLoginResponse<>(phoneLoginResponse2.getStatus(), phoneLoginResponse2.getErrorCode(), new ChangePasswordResult(phoneLoginResponse2.getData(), changePasswordForm));
            }
        });
    }

    @NotNull
    public final MutableLiveData<ChangePasswordForm> getChangePasswordFormLivaData$accountui_release() {
        return this.changePasswordFormLivaData;
    }

    @NotNull
    public final LiveData<PhoneLoginResponse<ChangePasswordResult>> getChangePasswordResponse$accountui_release() {
        return this.changePasswordResponse;
    }

    @NotNull
    public final LiveData<PhoneLoginResponse<String>> getGetVerifyCodeResponse() {
        return this.getVerifyCodeResponse;
    }

    @NotNull
    public final MutableLiveData<VerifyCodeForm> getPhoneVerifyCodeFormLiveData$accountui_release() {
        return this.phoneVerifyCodeFormLiveData;
    }

    @NotNull
    public final LiveData<PhoneLoginResponse<SmsCode>> getPhoneVerifyResponse$accountui_release() {
        return this.phoneVerifyResponse;
    }

    @NotNull
    public final MutableLiveData<PhoneBaseForm> getSendVerifyCodeFormLiveData() {
        return this.sendVerifyCodeFormLiveData;
    }

    @NotNull
    public final MutableLiveData<SmsCode> getSmsCodeLiveData$accountui_release() {
        return this.smsCodeLiveData;
    }

    public final void postChangePasswordForm(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String smsCode, @NotNull String password) {
        this.changePasswordFormLivaData.postValue(new ChangePasswordForm(phoneNumber, areaCode, smsCode, password));
    }

    public final void postSendCodeForm(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String countryCode) {
        postSendCodeForm(new PhoneBaseForm(phoneNumber, areaCode, countryCode));
    }

    public final void postVerifyForm(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String code, @NotNull String codeType) {
        this.phoneVerifyCodeFormLiveData.postValue(new VerifyCodeForm(phoneNumber, areaCode, code, codeType));
    }

    public final void setGetVerifyCodeResponse(@NotNull LiveData<PhoneLoginResponse<String>> liveData) {
        this.getVerifyCodeResponse = liveData;
    }

    public final void postSendCodeForm(@NotNull PhoneBaseForm phoneBaseForm) {
        this.sendVerifyCodeFormLiveData.postValue(phoneBaseForm);
    }
}
