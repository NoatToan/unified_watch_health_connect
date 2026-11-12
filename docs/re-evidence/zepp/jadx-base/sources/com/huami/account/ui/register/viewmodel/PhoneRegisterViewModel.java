package com.huami.account.ui.register.viewmodel;

import android.app.Application;
import androidx.arch.core.util.Function;
import androidx.autofill.HintConstants;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.common.entity.AutoLoginForm;
import com.huami.account.ui.common.entity.PhoneBaseForm;
import com.huami.account.ui.common.entity.PhoneLoginResponse;
import com.huami.account.ui.common.entity.VerifyCodeForm;
import com.huami.account.ui.common.repo.PhoneAccountRepository;
import com.huami.account.ui.register.entity.RegisterForm;
import com.huami.account.ui.register.viewmodel.PhoneRegisterViewModel;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.SmsCode;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\bG\u0010HJ&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bJ.\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR.\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001dR(\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u00100R<\u00107\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u00010\u0002020 0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R(\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080 0\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%R\"\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010\u001b\u001a\u0004\b>\u0010\u001dR(\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0 0\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010#\u001a\u0004\bB\u0010%R\"\u0010F\u001a\b\u0012\u0004\u0012\u0002080\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010\u001b\u001a\u0004\bE\u0010\u001d¨\u0006I"}, d2 = {"Lcom/huami/account/ui/register/viewmodel/PhoneRegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "areaCode", "code", "codeType", "", "postVerifyForm", "countryCode", "postSendCodeForm", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "phoneSendCodeForm", "password", "returnCode", "postRegisterForm", "Landroid/app/Application;", "a", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "Lcom/huami/account/ui/common/repo/PhoneAccountRepository;", "b", "Lcom/huami/account/ui/common/repo/PhoneAccountRepository;", "phoneAccountRepository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/account/ui/common/entity/AutoLoginForm;", "c", "Landroidx/lifecycle/MutableLiveData;", "getPhoneLoginForm$accountui_release", "()Landroidx/lifecycle/MutableLiveData;", "phoneLoginForm", "Landroidx/lifecycle/LiveData;", "Lcom/huami/account/ui/common/entity/PhoneLoginResponse;", "Lcom/huami/passport/entity/LoginToken;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getPhoneLoginResponse$accountui_release", "()Landroidx/lifecycle/LiveData;", "setPhoneLoginResponse$accountui_release", "(Landroidx/lifecycle/LiveData;)V", "phoneLoginResponse", "Lcom/huami/account/ui/common/entity/VerifyCodeForm;", "e", "getPhoneVerifyCodeFormLiveData$accountui_release", "phoneVerifyCodeFormLiveData", "f", "getPhoneSendCodeFormLiveData$accountui_release", "setPhoneSendCodeFormLiveData$accountui_release", "(Landroidx/lifecycle/MutableLiveData;)V", "phoneSendCodeFormLiveData", "Lkotlin/Pair;", "", "g", "getPhoneGetVerifyResponse$accountui_release", "setPhoneGetVerifyResponse$accountui_release", "phoneGetVerifyResponse", "Lcom/huami/passport/entity/SmsCode;", "h", "getPhoneVerifyResponse$accountui_release", "phoneVerifyResponse", "Lcom/huami/account/ui/register/entity/RegisterForm;", "i", "getPhoneRegisterFormLiveData$accountui_release", "phoneRegisterFormLiveData", "Lcom/huami/passport/entity/LoginInfo;", z.j, "getPhoneRegisterResponse$accountui_release", "phoneRegisterResponse", hl.k, "getSmsCodeLiveData$accountui_release", "smsCodeLiveData", "<init>", "(Landroid/app/Application;Lcom/huami/account/ui/common/repo/PhoneAccountRepository;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneRegisterViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application application;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PhoneAccountRepository phoneAccountRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AutoLoginForm> phoneLoginForm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private LiveData<PhoneLoginResponse<LoginToken>> phoneLoginResponse;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<VerifyCodeForm> phoneVerifyCodeFormLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<PhoneBaseForm> phoneSendCodeFormLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private LiveData<PhoneLoginResponse<Pair<Boolean, String>>> phoneGetVerifyResponse;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PhoneLoginResponse<SmsCode>> phoneVerifyResponse;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RegisterForm> phoneRegisterFormLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PhoneLoginResponse<LoginInfo>> phoneRegisterResponse;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SmsCode> smsCodeLiveData;

    public PhoneRegisterViewModel(@NotNull Application application, @NotNull PhoneAccountRepository phoneAccountRepository) {
        this.application = application;
        this.phoneAccountRepository = phoneAccountRepository;
        MutableLiveData<AutoLoginForm> mutableLiveData = new MutableLiveData<>();
        this.phoneLoginForm = mutableLiveData;
        MutableLiveData<VerifyCodeForm> mutableLiveData2 = new MutableLiveData<>();
        this.phoneVerifyCodeFormLiveData = mutableLiveData2;
        this.phoneSendCodeFormLiveData = new MutableLiveData<>();
        MutableLiveData<RegisterForm> mutableLiveData3 = new MutableLiveData<>();
        this.phoneRegisterFormLiveData = mutableLiveData3;
        this.smsCodeLiveData = new MutableLiveData<>();
        this.phoneGetVerifyResponse = Transformations.switchMap(this.phoneSendCodeFormLiveData, new Function() { // from class: ox5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PhoneRegisterViewModel.f(this.a, (PhoneBaseForm) obj);
            }
        });
        this.phoneVerifyResponse = Transformations.switchMap(mutableLiveData2, new Function() { // from class: px5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PhoneRegisterViewModel.g(this.a, (VerifyCodeForm) obj);
            }
        });
        this.phoneRegisterResponse = Transformations.switchMap(mutableLiveData3, new Function() { // from class: qx5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PhoneRegisterViewModel.h(this.a, (RegisterForm) obj);
            }
        });
        this.phoneLoginResponse = Transformations.switchMap(mutableLiveData, new Function() { // from class: nx5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PhoneRegisterViewModel.i(this.a, (AutoLoginForm) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData f(PhoneRegisterViewModel phoneRegisterViewModel, PhoneBaseForm phoneBaseForm) {
        return phoneRegisterViewModel.phoneAccountRepository.registerSendCode(phoneRegisterViewModel.application, phoneBaseForm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData g(PhoneRegisterViewModel phoneRegisterViewModel, VerifyCodeForm verifyCodeForm) {
        return phoneRegisterViewModel.phoneAccountRepository.verifyCode(phoneRegisterViewModel.application, verifyCodeForm.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_NUMBER java.lang.String(), verifyCodeForm.getAreaCode(), verifyCodeForm.getCode(), verifyCodeForm.getCodeType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData h(PhoneRegisterViewModel phoneRegisterViewModel, RegisterForm registerForm) {
        return phoneRegisterViewModel.phoneAccountRepository.registerWithPhone(phoneRegisterViewModel.application, registerForm.getPhoneNumber(), registerForm.getAreaCode(), registerForm.getPassword(), registerForm.getReturnCode(), registerForm.getCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData i(PhoneRegisterViewModel phoneRegisterViewModel, AutoLoginForm autoLoginForm) {
        return phoneRegisterViewModel.phoneAccountRepository.registerAutoLogin(phoneRegisterViewModel.application, autoLoginForm.getLoginInfo().getAccess(), autoLoginForm.getCountryCode());
    }

    @NotNull
    public final LiveData<PhoneLoginResponse<Pair<Boolean, String>>> getPhoneGetVerifyResponse$accountui_release() {
        return this.phoneGetVerifyResponse;
    }

    @NotNull
    public final MutableLiveData<AutoLoginForm> getPhoneLoginForm$accountui_release() {
        return this.phoneLoginForm;
    }

    @NotNull
    public final LiveData<PhoneLoginResponse<LoginToken>> getPhoneLoginResponse$accountui_release() {
        return this.phoneLoginResponse;
    }

    @NotNull
    public final MutableLiveData<RegisterForm> getPhoneRegisterFormLiveData$accountui_release() {
        return this.phoneRegisterFormLiveData;
    }

    @NotNull
    public final LiveData<PhoneLoginResponse<LoginInfo>> getPhoneRegisterResponse$accountui_release() {
        return this.phoneRegisterResponse;
    }

    @NotNull
    public final MutableLiveData<PhoneBaseForm> getPhoneSendCodeFormLiveData$accountui_release() {
        return this.phoneSendCodeFormLiveData;
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
    public final MutableLiveData<SmsCode> getSmsCodeLiveData$accountui_release() {
        return this.smsCodeLiveData;
    }

    public final void postRegisterForm(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String password, @NotNull String returnCode, @NotNull String countryCode) {
        this.phoneRegisterFormLiveData.postValue(new RegisterForm(phoneNumber, areaCode, password, returnCode, countryCode));
    }

    public final void postSendCodeForm(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String countryCode) {
        postSendCodeForm(new PhoneBaseForm(phoneNumber, areaCode, countryCode));
    }

    public final void postVerifyForm(@NotNull String phoneNumber, @NotNull String areaCode, @NotNull String code, @NotNull String codeType) {
        this.phoneVerifyCodeFormLiveData.postValue(new VerifyCodeForm(phoneNumber, areaCode, code, codeType));
    }

    public final void setPhoneGetVerifyResponse$accountui_release(@NotNull LiveData<PhoneLoginResponse<Pair<Boolean, String>>> liveData) {
        this.phoneGetVerifyResponse = liveData;
    }

    public final void setPhoneLoginResponse$accountui_release(@NotNull LiveData<PhoneLoginResponse<LoginToken>> liveData) {
        this.phoneLoginResponse = liveData;
    }

    public final void setPhoneSendCodeFormLiveData$accountui_release(@NotNull MutableLiveData<PhoneBaseForm> mutableLiveData) {
        this.phoneSendCodeFormLiveData = mutableLiveData;
    }

    public final void postSendCodeForm(@NotNull PhoneBaseForm phoneSendCodeForm) {
        this.phoneSendCodeFormLiveData.postValue(phoneSendCodeForm);
    }
}
