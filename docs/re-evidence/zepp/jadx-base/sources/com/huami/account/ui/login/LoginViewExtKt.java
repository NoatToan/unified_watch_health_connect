package com.huami.account.ui.login;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Lifecycle;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginErrorManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.UserLegalInfoComponents;
import com.huami.account.WebHelper;
import com.huami.account.bean.LoginResult;
import com.huami.account.bean.LoginResultKt;
import com.huami.account.keeper.FrozenAccountKeeper;
import com.huami.account.service.model.Area;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.ReselectAreaContract;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.account.ui.areas.SelectAreaContract;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.ui.login.LoginViewExtKt;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.account.ui.login.state.PassportOperationState;
import com.huami.account.ui.login.state.RegistrationState;
import com.huami.account.ui.login.state.ThirdPartAuthState;
import com.huami.account.ui.login.viewmodel.LoginViewModelContract;
import com.huami.account.ui.register.RegErrorActionTipFragment;
import com.huami.account.utils.ActivityResultExtKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.passport.AccountManager;
import com.huami.passport.AccountManagerExt;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.OperationResult;
import com.huami.passport.entity.Data;
import com.huami.passport.entity.LoginToken;
import com.huami.tools.log.HMLog;
import com.huami.web.service.WebItem;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\b*\u0001C\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u001a(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0012\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012\u001a(\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002\u001a\"\u0010\u001e\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00030\u001bH\u0002\u001a\u001e\u0010 \u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002\u001a\u001e\u0010!\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002\u001a\u0016\u0010#\u001a\u00020\u0003*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0015H\u0002\u001a\u0012\u0010$\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\f\u001a\u001e\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002\u001a$\u0010(\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0015H\u0002\u001a\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0010\u0010*\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015\u001a,\u0010.\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010\u0015\u001a\u0014\u00100\u001a\u00020\u0003*\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0015\u001a\n\u00101\u001a\u00020\u0003*\u00020\u0000\u001a&\u00105\u001a\u00020\u0003*\u00020\u00002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0003022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000302\u001a1\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\t\u001a\u0002062\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0086@ø\u0001\u0000¢\u0006\u0004\b=\u0010>\"\u001a\u0010\u0010\u001a\u00020\u000f*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\"\u001a\u0010\t\u001a\u00020\b*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u001a\u0010F\u001a\u00020C*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001a\u0010I\u001a\u00020\f*\u0002068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"Lcom/huami/account/ui/login/LoginViewComponent;", "Lcom/huami/account/ui/common/state/StateWrapper$Loading;", "loadingState", "", "handleLoadingState", "Lcom/huami/account/ui/login/state/LoginSuccess;", "success", "handleLoginSuccess", "Landroidx/fragment/app/FragmentActivity;", "activity", GoogleApiAvailabilityLight.b, "w", "", "isNewUser", "isShowSuccessDialog", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialog", SOAP.XMLNS, "Lcom/huami/account/ui/login/state/LoginFailed;", "failed", "handleLoginFailedState", "", "provider", "Lcom/huami/passport/ErrorCode;", "errorCode", "specifiedCountryCode", hl.k, "Lkotlin/Function1;", "Lcom/huami/account/service/model/Area;", "selectAreaCallback", "x", "accessToken", LogUtil.D, "r", "responseType", "t", "processAccount", "F", "countryCode", "tempAccess", "v", "y", "providerToLastLoginPrompt", "id", "url", "appToken", "accountFrozen", "userId", "showAccountExceptionDialog", "alreadyRegister", "Lkotlin/Function0;", "navigateToMiLogin", "negativeCallback", "showMiAccountTip", "Landroid/app/Activity;", "Lcom/huami/passport/AccountManager;", "accountManager", "Lcom/huami/account/ui/login/state/PassportOperationState;", "state", "Lcom/huami/passport/OperationResult;", "Lcom/huami/passport/entity/LoginToken;", "handlePassportEvent", "(Landroid/app/Activity;Lcom/huami/passport/AccountManager;Lcom/huami/account/ui/login/state/PassportOperationState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.google.android.exoplayer2.text.ttml.b.r, "(Lcom/huami/account/ui/login/LoginViewComponent;)Lcom/huami/account/ui/common/LoadingDialogContainer;", "o", "(Lcom/huami/account/ui/login/LoginViewComponent;)Landroidx/fragment/app/FragmentActivity;", "com/huami/account/ui/login/LoginViewExtKt$loginCallback$1", DTransferConstants.SEARCH_KEY, "(Lcom/huami/account/ui/login/LoginViewComponent;)Lcom/huami/account/ui/login/LoginViewExtKt$loginCallback$1;", "loginCallback", "u", "(Landroid/app/Activity;)Z", "isFromOauth", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class LoginViewExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "has not access!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/account/service/model/Area;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Area, Unit> {
        public final /* synthetic */ LoginViewComponent a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ErrorCode c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LoginViewComponent loginViewComponent, String str, ErrorCode errorCode, String str2) {
            super(1);
            this.a = loginViewComponent;
            this.b = str;
            this.c = errorCode;
            this.d = str2;
        }

        public final void a(@Nullable Area area) {
            String value = area == null ? null : area.getValue();
            if (value == null || value.length() == 0) {
                LoginViewModelContract.DefaultImpls.handleUnknownFailed$default(this.a.provideViewModelContract(), this.b, true, 0, LoginResultKt.toResult(this.c), 4, null);
            } else {
                LoginViewExtKt.v(this.a, this.b, value, this.d);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Area area) {
            a(area);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "responseType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ LoginViewComponent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LoginViewComponent loginViewComponent) {
            super(1);
            this.a = loginViewComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable String str) {
            LoginViewExtKt.t(this.a, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "IgnoredError";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Function0 function0, View view) {
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(Function0 function0, View view) {
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(AlertDialog alertDialog, Function0 function0, View view) {
        alertDialog.dismiss();
        function0.getA();
    }

    private static final void D(final LoginViewComponent loginViewComponent, final String str, final String str2) {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(o(loginViewComponent));
        builder.setMessage(R.string.account_ui_gpdr_login_unregiste);
        builder.setPositiveButton(R.string.account_ui_account_register_now, new DialogInterface.OnClickListener() { // from class: rs4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LoginViewExtKt.E(loginViewComponent, str, str2, dialogInterface, i);
            }
        });
        builder.setNegativeButton(R.string.account_ui_cancel, (DialogInterface.OnClickListener) null);
        builder.show(o(loginViewComponent).getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(LoginViewComponent loginViewComponent, String str, String str2, DialogInterface dialogInterface, int i) {
        if (AccountExternalsKt.getAccountDelegate().isChineseOnly()) {
            F(loginViewComponent, str, str2);
        } else {
            r(loginViewComponent, str, str2);
        }
    }

    private static final void F(final LoginViewComponent loginViewComponent, final String str, final String str2) {
        final Area areaByCountryCode = SelectAreaManager.INSTANCE.getAreaByCountryCode("CN");
        if (areaByCountryCode == null) {
            return;
        }
        UserLegalInfoComponents.INSTANCE.showAgreementDialogForReg(o(loginViewComponent), areaByCountryCode, new UserLegalInfoComponents.AgreementDialogCallback() { // from class: com.huami.account.ui.login.LoginViewExtKt$thirdPartRegisterInChina$1
            @Override // com.huami.account.UserLegalInfoComponents.AgreementDialogCallback
            public void onAgree() {
                loginViewComponent.provideViewModelContract().thirdAuthRegister(str, str2, areaByCountryCode);
            }

            @Override // com.huami.account.UserLegalInfoComponents.AgreementDialogCallback
            public void onCancel() {
            }
        });
    }

    public static final void accountFrozen(@NotNull LoginViewComponent loginViewComponent, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @Nullable final String str4) {
        new AlertDialogFragment.Builder(loginViewComponent.provideViewHost()).setTitle(R.string.account_ui_account_frozen_title).setParagraph(AccountExternalsKt.getAppContext().getString(R.string.account_ui_account_frozen_content, str2)).setCancelable(false).setPositiveButton(R.string.account_ui_account_unfreeze, new DialogInterface.OnClickListener() { // from class: ss4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LoginViewExtKt.i(str2, str4, str, str3, dialogInterface, i);
            }
        }).setNegativeButton(R.string.account_ui_close, new DialogInterface.OnClickListener() { // from class: us4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LoginViewExtKt.j(dialogInterface, i);
            }
        }).themed().show(loginViewComponent.provideViewHost().getSupportFragmentManager()).setGravity(17);
    }

    public static final void alreadyRegister(@NotNull LoginViewComponent loginViewComponent) {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(o(loginViewComponent));
        builder.setTitle(R.string.account_ui_had_regist);
        builder.setNeutralButton(R.string.account_ui_got_it, new DialogInterface.OnClickListener() { // from class: ts4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LoginViewExtKt.m(dialogInterface, i);
            }
        });
        builder.show(o(loginViewComponent).getSupportFragmentManager());
    }

    public static final void handleLoadingState(@NotNull LoginViewComponent loginViewComponent, @NotNull StateWrapper.Loading loading) {
        p(loginViewComponent).showLoadingDialog(loading.getMessage());
    }

    public static final void handleLoginFailedState(@NotNull LoginViewComponent loginViewComponent, @NotNull LoginFailed loginFailed) {
        if (loginFailed instanceof LoginFailed.AccountException) {
            p(loginViewComponent).hideDialog();
            showAccountExceptionDialog(loginViewComponent, ((LoginFailed.AccountException) loginFailed).getUserId());
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.AccountFrozen) {
            p(loginViewComponent).hideDialog();
            LoginFailed.AccountFrozen accountFrozen = (LoginFailed.AccountFrozen) loginFailed;
            accountFrozen(loginViewComponent, accountFrozen.getProvider(), accountFrozen.getUserId(), accountFrozen.getUrl(), accountFrozen.getAppToken());
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (Intrinsics.areEqual(loginFailed, LoginFailed.CommonLoginError.INSTANCE)) {
            p(loginViewComponent).hideDialog();
            y(o(loginViewComponent), p(loginViewComponent));
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.CustomMessageTip) {
            p(loginViewComponent).hideDialog();
            CustomToast.makeText(o(loginViewComponent), ((LoginFailed.CustomMessageTip) loginFailed).getMessage(), 0).show();
            Unit unit4 = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.NormalMessageError) {
            p(loginViewComponent).hideDialog();
            IconToast.showError(o(loginViewComponent), ((LoginFailed.NormalMessageError) loginFailed).getMessage());
            Unit unit5 = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.RegionLimit) {
            p(loginViewComponent).hideDialog();
            HMThridPartOauthErrorMainlandLimitDialog.showDialog(o(loginViewComponent), ((LoginFailed.RegionLimit) loginFailed).getIsLogin());
            Unit unit6 = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.ThirdPartNotRegister) {
            p(loginViewComponent).hideDialog();
            LoginFailed.ThirdPartNotRegister thirdPartNotRegister = (LoginFailed.ThirdPartNotRegister) loginFailed;
            D(loginViewComponent, thirdPartNotRegister.getProvider(), thirdPartNotRegister.getAccessToken());
            Unit unit7 = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.RegisterErrorUrl) {
            p(loginViewComponent).hideDialog();
            RegErrorActionTipFragment.INSTANCE.show(o(loginViewComponent).getSupportFragmentManager(), ((LoginFailed.RegisterErrorUrl) loginFailed).getHref());
            Unit unit8 = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.AttemptLimit ? true : loginFailed instanceof LoginFailed.AccountOrPasswordIncorrect) {
            LoadingDialog loadingDialog = p(loginViewComponent).getLoadingDialog();
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setFailed(o(loginViewComponent).getString(R.string.account_ui_account_account_or_pwd_incorrect));
            Unit unit9 = Unit.INSTANCE;
            return;
        }
        if (loginFailed instanceof LoginFailed.AccountV2NotRegister) {
            p(loginViewComponent).hideDialog();
            LoginFailed.AccountV2NotRegister accountV2NotRegister = (LoginFailed.AccountV2NotRegister) loginFailed;
            k(loginViewComponent, accountV2NotRegister.getProvider(), accountV2NotRegister.getErrorCode(), accountV2NotRegister.getSpecifiedCountryCode());
            Unit unit10 = Unit.INSTANCE;
            return;
        }
        if (Intrinsics.areEqual(loginFailed, LoginFailed.AccountAlreadyRegister.INSTANCE)) {
            p(loginViewComponent).hideDialog();
            alreadyRegister(loginViewComponent);
            Unit unit11 = Unit.INSTANCE;
        } else {
            if (!(loginFailed instanceof LoginFailed.IgnoredError)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.info$default(null, d.a, 1, null);
            Unit unit12 = Unit.INSTANCE;
        }
    }

    public static final void handleLoginSuccess(@NotNull LoginViewComponent loginViewComponent, @NotNull LoginSuccess loginSuccess) {
        s(o(loginViewComponent), loginSuccess.getIsNewUser(), loginSuccess.getShowLoginSuccessDialog(), p(loginViewComponent));
    }

    @Nullable
    public static final Object handlePassportEvent(@NotNull Activity activity, @NotNull AccountManager accountManager, @NotNull PassportOperationState passportOperationState, @NotNull Continuation<? super OperationResult<? extends LoginToken>> continuation) {
        if (passportOperationState instanceof RegistrationState.RegistrationBase) {
            String provider = passportOperationState.getProvider();
            RegistrationState.RegistrationBase registrationBase = (RegistrationState.RegistrationBase) passportOperationState;
            return AccountManagerExt.awaitRegistrationBase(accountManager, activity, provider, registrationBase.getCountryCode(), registrationBase.getCountryState(), continuation);
        }
        if (passportOperationState instanceof RegistrationState.RegistrationV2) {
            String provider2 = passportOperationState.getProvider();
            RegistrationState.RegistrationV2 registrationV2 = (RegistrationState.RegistrationV2) passportOperationState;
            return AccountManagerExt.awaitRegistration(accountManager, activity, provider2, registrationV2.getCountryCode(), registrationV2.getCountryState(), registrationV2.getAccessToken(), continuation);
        }
        if (passportOperationState instanceof ThirdPartAuthState) {
            return AccountManagerExt.awaitLoginWithoutRef(accountManager, activity, passportOperationState.getProvider(), ((ThirdPartAuthState) passportOperationState).getAreaValue(), false, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String str, String str2, String str3, String str4, DialogInterface dialogInterface, int i) {
        FrozenAccountKeeper frozenAccountKeeper = FrozenAccountKeeper.INSTANCE;
        frozenAccountKeeper.setUserId(str);
        frozenAccountKeeper.setUserToken(str2);
        frozenAccountKeeper.setUserProvider(str3);
        WebItem webItem = new WebItem(str4);
        webItem.hasFinishEvent = true;
        WebHelper.launch(webItem);
        EventBus.getDefault().register(new FrozenWebViewExitReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private static final void k(LoginViewComponent loginViewComponent, String str, ErrorCode errorCode, String str2) {
        String tempAccess = errorCode.getTempAccess();
        if (TextUtils.isEmpty(tempAccess)) {
            HMLog.info(LoginActivity.TAG, a.a);
            LoginViewModelContract.DefaultImpls.handleUnknownFailed$default(loginViewComponent.provideViewModelContract(), str, true, 0, LoginResultKt.toResult(errorCode), 4, null);
        } else {
            if (str2 != null) {
                v(loginViewComponent, str, str2, tempAccess);
                return;
            }
            if (errorCode.getData() != null) {
                Data data = errorCode.getData();
                if (!TextUtils.isEmpty(data == null ? null : data.getCountryCode())) {
                    v(loginViewComponent, str, errorCode.getData().getCountryCode(), tempAccess);
                    return;
                }
            }
            p(loginViewComponent).hideDialog();
            x(loginViewComponent, new b(loginViewComponent, str, errorCode, tempAccess));
        }
    }

    public static /* synthetic */ void l(LoginViewComponent loginViewComponent, String str, ErrorCode errorCode, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        k(loginViewComponent, str, errorCode, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(FragmentActivity fragmentActivity) {
        if (u(fragmentActivity)) {
            fragmentActivity.setResult(-1);
        } else {
            HMProcessLoginDataManager.goBindPhoneOrMainTabPage(fragmentActivity);
        }
        fragmentActivity.finish();
    }

    private static final FragmentActivity o(LoginViewComponent loginViewComponent) {
        return loginViewComponent.provideViewHost();
    }

    private static final LoadingDialogContainer p(LoginViewComponent loginViewComponent) {
        return loginViewComponent.provideDialogContainer();
    }

    public static final void processAccount(@NotNull LoginViewComponent loginViewComponent, boolean z) {
        loginViewComponent.provideViewModelContract().handleProcessLoginDataSuccess(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final String providerToLastLoginPrompt(@NotNull String str) {
        Context appContext = AccountExternalsKt.getAppContext();
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    return appContext.getString(R.string.account_ui_login_list_google);
                }
                return null;
            case -791770330:
                if (str.equals("wechat")) {
                    return appContext.getString(R.string.account_ui_login_list_wechat);
                }
                return null;
            case -759499589:
                if (str.equals("xiaomi")) {
                    return appContext.getString(R.string.account_ui_login_list_xiaomi);
                }
                return null;
            case -433231361:
                if (str.equals("huami_phone")) {
                    return appContext.getString(R.string.account_ui_login_list_phone);
                }
                return null;
            case 3321844:
                if (str.equals("line")) {
                    return appContext.getString(R.string.account_ui_login_list_line);
                }
                return null;
            case 99628432:
                if (str.equals("huami")) {
                    return appContext.getString(R.string.account_ui_login_list_email);
                }
                return null;
            case 497130182:
                if (str.equals("facebook")) {
                    return appContext.getString(R.string.account_ui_login_list_facebook);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.account.ui.login.LoginViewExtKt$loginCallback$1] */
    private static final LoginViewExtKt$loginCallback$1 q(final LoginViewComponent loginViewComponent) {
        return new IAccount.Callback<LoginToken, ErrorCode>() { // from class: com.huami.account.ui.login.LoginViewExtKt$loginCallback$1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@NotNull ErrorCode errorCode) {
                LoginViewModelContract.DefaultImpls.handleLoginFailed$default(loginViewComponent.provideViewModelContract(), "sso", errorCode, null, 4, null);
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@NotNull LoginToken loginToken) {
                loginViewComponent.provideViewModelContract().handleLoginSuccess("sso", loginToken);
            }
        };
    }

    private static final void r(LoginViewComponent loginViewComponent, String str, String str2) {
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(SelectAreaActivity.REGISTER_PROVIDER, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(SelectAreaActivity.REGISTER_ACCESS_TOKEN, str2);
        }
        intent.setClass(o(loginViewComponent), SelectAreaActivity.class);
        ActivityResultExtKt.launchWithCallback(new SelectAreaContract(), o(loginViewComponent).getActivityResultRegistry(), intent, new c(loginViewComponent));
    }

    private static final void s(final FragmentActivity fragmentActivity, final boolean z, boolean z2, LoadingDialogContainer loadingDialogContainer) {
        if (z2) {
            LoadingDialog loadingDialog = loadingDialogContainer.getLoadingDialog();
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setSuccess(fragmentActivity.getString(R.string.account_ui_login_success), new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.login.LoginViewExtKt$handleLoginSuccessNav$1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@NotNull LoadingDialog dialog) {
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@NotNull LoadingDialog dialog) {
                    if (z) {
                        LoginViewExtKt.w(fragmentActivity);
                    } else {
                        LoginViewExtKt.n(fragmentActivity);
                    }
                }
            });
            return;
        }
        loadingDialogContainer.hideDialog();
        if (z) {
            w(fragmentActivity);
        } else {
            n(fragmentActivity);
        }
    }

    public static final void showAccountExceptionDialog(@NotNull LoginViewComponent loginViewComponent, @Nullable String str) {
        AccountErrorFragment.Builder.get().setTitleRes(R.string.account_ui_login_failed).setId(str).setContentRes(R.string.account_ui_account_feedback_message).show(o(loginViewComponent));
    }

    public static final void showMiAccountTip(@NotNull LoginViewComponent loginViewComponent, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function1) {
        View viewInflate = View.inflate(o(loginViewComponent), R.layout.account_ui_dialog_is_mi_account, null);
        int i = R.id.tv_xiaomi_account_yes;
        viewInflate.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: ys4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginViewExtKt.A(function0, view);
            }
        });
        int i2 = R.id.tv_xiaomi_account_no;
        viewInflate.findViewById(i2).setOnClickListener(new View.OnClickListener() { // from class: xs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginViewExtKt.B(function1, view);
            }
        });
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(o(loginViewComponent)).setView(viewInflate).setCancelable(false).create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        if (o(loginViewComponent).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            alertDialogCreate.show();
        }
        viewInflate.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: ws4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginViewExtKt.C(alertDialogCreate, function0, view);
            }
        });
        viewInflate.findViewById(i2).setOnClickListener(new View.OnClickListener() { // from class: vs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginViewExtKt.z(alertDialogCreate, function1, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(LoginViewComponent loginViewComponent, String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -82377867) {
                if (str.equals(SelectAreaActivity.TYPE_RESPONSE_PHONE)) {
                    processAccount(loginViewComponent, false);
                }
            } else if (iHashCode == 1858482086) {
                if (str.equals("TYPE_RESPONSE")) {
                    processAccount(loginViewComponent, false);
                }
            } else if (iHashCode == 2085024192 && str.equals(SelectAreaActivity.TYPE_RESPONSE_REGISTER_SUCCESS)) {
                LoadingDialogContainerKt.showLoadingDialog(p(loginViewComponent), R.string.account_ui_logining);
                processAccount(loginViewComponent, true);
            }
        }
    }

    private static final boolean u(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra(BaseTitleOauthActivity.IS_OAUTH, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(LoginViewComponent loginViewComponent, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            LoginViewModelContract.DefaultImpls.handleUnknownFailed$default(loginViewComponent.provideViewModelContract(), str, true, 0, new LoginResult.Failed.MissParam("loginAccountSystem, countryCode is empty"), 4, null);
        } else {
            LoadingDialogContainerKt.showLoadingDialog(p(loginViewComponent), R.string.account_ui_logining);
            AccountManager.getDefault(o(loginViewComponent)).registerIdV2(o(loginViewComponent).getApplicationContext(), "huami", str3, str2, q(loginViewComponent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(FragmentActivity fragmentActivity) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        hMPersonInfo.getUserInfo().setAvatar(((AccountManager) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountManager.class), null, null)).getUserInfo().getAvatar());
        hMPersonInfo.saveInfoAsync();
        HMProcessLoginDataManager.goBindPhoneOrSetInfoPage(fragmentActivity, null);
        fragmentActivity.finish();
    }

    private static final void x(LoginViewComponent loginViewComponent, Function1<? super Area, Unit> function1) {
        ActivityResultExtKt.launchWithCallback(new ReselectAreaContract(), o(loginViewComponent).getActivityResultRegistry(), null, function1);
    }

    private static final void y(final FragmentActivity fragmentActivity, final LoadingDialogContainer loadingDialogContainer) {
        ((HMLoginErrorManager) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HMLoginErrorManager.class), null, null)).showLoginErrorFragment(fragmentActivity, new HMLoginErrorManager.Callback() { // from class: com.huami.account.ui.login.LoginViewExtKt$showLoginErrorFragment$1
            @Override // com.huami.account.HMLoginErrorManager.Callback
            public void onFail() {
                LoadingDialog loadingDialog;
                if (fragmentActivity.isFinishing() || (loadingDialog = loadingDialogContainer.getLoadingDialog()) == null) {
                    return;
                }
                loadingDialog.setFailed(fragmentActivity.getString(R.string.account_ui_feedback_submit_failed));
            }

            @Override // com.huami.account.HMLoginErrorManager.Callback
            public void onStart() {
                if (fragmentActivity.isFinishing()) {
                    return;
                }
                LoadingDialogContainerKt.showLoadingDialog(loadingDialogContainer, R.string.account_ui_submitting_feedback);
            }

            @Override // com.huami.account.HMLoginErrorManager.Callback
            public void onSuccess() {
                LoadingDialog loadingDialog;
                if (fragmentActivity.isFinishing() || (loadingDialog = loadingDialogContainer.getLoadingDialog()) == null) {
                    return;
                }
                loadingDialog.setSuccess(fragmentActivity.getString(R.string.account_ui_feedback_submit_success), null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(AlertDialog alertDialog, Function0 function0, View view) {
        alertDialog.dismiss();
        function0.getA();
    }
}
