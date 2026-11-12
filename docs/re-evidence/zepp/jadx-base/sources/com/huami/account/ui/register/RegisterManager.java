package com.huami.account.ui.register;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.bean.LoginResult;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.R;
import com.huami.account.ui.login.HMThridPartOauthErrorMainlandLimitDialog;
import com.huami.account.usecase.RegisterFailedCustomTipUseCase;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.net.HttpConfig;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "使用 UI 和 Logic 分离的 ThirdAuthRegisterUseCase/HandleThirdRegSuccessUseCase")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\r\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/account/ui/register/RegisterManager;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "provider", "accessToken", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "Lcom/huami/account/ui/register/RegisterManager$RegActionCallback;", "callback", "", "register", "a", "Ljava/lang/String;", "TAG", "REGISTER_ERROR_CUSTOM_TIP", "<init>", "()V", "RegActionCallback", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class RegisterManager {

    @NotNull
    public static final RegisterManager INSTANCE = new RegisterManager();

    @NotNull
    public static final String REGISTER_ERROR_CUSTOM_TIP = "0129";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ThirdPartRegManager";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/account/ui/register/RegisterManager$RegActionCallback;", "", "", "onRegisterSuccess", "", "res", "showLoading", "hideLoading", "onAlreadyRegisterConfirmed", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public interface RegActionCallback {
        void hideLoading();

        void onAlreadyRegisterConfirmed();

        void onRegisterSuccess();

        void showLoading(int res);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0019\u0010\u0016\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010 \u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006&"}, d2 = {"com/huami/account/ui/register/RegisterManager$a", "Lcom/huami/passport/IAccount$Callback;", "Lcom/huami/passport/entity/LoginToken;", "Lcom/huami/passport/ErrorCode;", "", z.j, "", "res", hl.k, GoogleApiAvailabilityLight.a, "", "provider", "Landroidx/appcompat/app/AppCompatActivity;", GoogleApiAvailabilityLight.b, LoginViewOptions.EXTRA_LOGIN_TOKEN, "l", "errorCode", "i", "a", "Landroidx/appcompat/app/AppCompatActivity;", "f", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "Lcom/huami/account/ui/register/RegisterManager$RegActionCallback;", "c", "Lcom/huami/account/ui/register/RegisterManager$RegActionCallback;", "g", "()Lcom/huami/account/ui/register/RegisterManager$RegActionCallback;", "callback", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "reference", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Lcom/huami/account/ui/register/RegisterManager$RegActionCallback;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements IAccount.Callback<LoginToken, ErrorCode> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final AppCompatActivity activity;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String provider;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final RegActionCallback callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<AppCompatActivity> reference;

        /* JADX INFO: renamed from: com.huami.account.ui.register.RegisterManager$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0268a extends Lambda implements Function0<String> {
            public final /* synthetic */ ErrorCode a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0268a(ErrorCode errorCode) {
                super(0);
                this.a = errorCode;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onError:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.this.j();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ Map<String, String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, Map<String, String> map) {
                super(0);
                this.a = str;
                this.b = map;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                String str = this.a;
                return "onError-" + str + ":" + ((Object) this.b.get(str));
            }
        }

        public a(@NotNull AppCompatActivity appCompatActivity, @NotNull String str, @NotNull RegActionCallback regActionCallback) {
            this.activity = appCompatActivity;
            this.provider = str;
            this.callback = regActionCallback;
            this.reference = new WeakReference<>(appCompatActivity);
        }

        private final void d() {
            this.callback.hideLoading();
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this.activity);
            builder.setTitle(R.string.account_ui_had_regist);
            builder.setNeutralButton(R.string.account_ui_got_it, new DialogInterface.OnClickListener() { // from class: com.huami.account.ui.register.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RegisterManager.a.e(this.a, dialogInterface, i);
                }
            });
            builder.show(this.activity.getSupportFragmentManager());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, DialogInterface dialogInterface, int i) {
            aVar.getCallback().onAlreadyRegisterConfirmed();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j() {
            k(R.string.account_ui_login_email_regist_failed);
        }

        private final void k(int res) {
            AppCompatActivity appCompatActivity = this.activity;
            IconToast.showError(appCompatActivity, appCompatActivity.getString(res));
            this.callback.hideLoading();
            HMAccountKeeper.INSTANCE.keepLoginData(null, null, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(AppCompatActivity appCompatActivity, LoginToken loginToken, a aVar, LoginResult loginResult) {
            if (appCompatActivity.isFinishing()) {
                return;
            }
            if (!loginResult.isSuccess()) {
                aVar.j();
            } else {
                HMLoginManager.verifyLoginSuccessHref(loginToken);
                aVar.getCallback().onRegisterSuccess();
            }
        }

        private final AppCompatActivity n(String provider) {
            AppCompatActivity appCompatActivity = this.activity;
            if (provider != null) {
                int iHashCode = provider.hashCode();
                if (iHashCode != -791770330) {
                    if (iHashCode != 3321844) {
                        if (iHashCode == 497130182 && provider.equals("facebook")) {
                            IconToast.showError(appCompatActivity, appCompatActivity.getString(R.string.account_ui_facebook_uninstall));
                        }
                    } else if (provider.equals("line")) {
                        IconToast.showError(appCompatActivity, appCompatActivity.getString(R.string.account_ui_line_uninstall));
                    }
                } else if (provider.equals("wechat")) {
                    IconToast.showError(appCompatActivity, appCompatActivity.getString(R.string.account_ui_wechat_uninstall));
                }
            }
            return appCompatActivity;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final AppCompatActivity getActivity() {
            return this.activity;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final RegActionCallback getCallback() {
            return this.callback;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getProvider() {
            return this.provider;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull ErrorCode errorCode) {
            HMLog.info(RegisterManager.TAG, new C0268a(errorCode));
            AppCompatActivity appCompatActivity = this.reference.get();
            if (appCompatActivity == null || appCompatActivity.isFinishing()) {
                return;
            }
            String errorCode2 = errorCode.getErrorCode();
            if (Intrinsics.areEqual(errorCode2, ErrorCode.USER_CANCEL_ERROR)) {
                this.callback.hideLoading();
                return;
            }
            if (Intrinsics.areEqual(errorCode2, ErrorCode.UNINSTALL_TPAPP_ERROR)) {
                n(this.provider);
                this.callback.hideLoading();
                return;
            }
            if (Intrinsics.areEqual(errorCode2, HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_ALREADY_REGISTER)) {
                d();
                return;
            }
            if (HMLoginManager.thirdPartOauthErrorCodes().contains(errorCode2)) {
                k(R.string.account_ui_third_part_oauth_error);
                return;
            }
            if (Intrinsics.areEqual(errorCode2, HMWebAccess.AUTH_SERVER_ERROR_USER_IN_ERROR_REGION)) {
                HMThridPartOauthErrorMainlandLimitDialog.showDialog(appCompatActivity, false);
                return;
            }
            if (Intrinsics.areEqual(errorCode2, "0129")) {
                this.callback.hideLoading();
                RegisterFailedCustomTipUseCase.execute(appCompatActivity.getSupportFragmentManager(), errorCode, new b());
                return;
            }
            j();
            Map<String, String> headers = HttpConfig.getHeaders();
            Iterator<String> it2 = headers.keySet().iterator();
            while (it2.hasNext()) {
                HMLog.info(RegisterManager.TAG, new c(it2.next(), headers));
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@Nullable final LoginToken loginToken) {
            final AppCompatActivity appCompatActivity = this.reference.get();
            if (appCompatActivity == null || appCompatActivity.isFinishing()) {
                return;
            }
            this.callback.showLoading(R.string.account_ui_login_email_registing);
            HMProcessLoginDataManager.processRegisterLoginSuccess(new HMProcessLoginDataManager.LoginCallBack() { // from class: com.huami.account.ui.register.c
                @Override // com.huami.account.HMProcessLoginDataManager.LoginCallBack
                public final void onResult(LoginResult loginResult) {
                    RegisterManager.a.m(appCompatActivity, loginToken, this, loginResult);
                }
            });
        }
    }

    private RegisterManager() {
    }

    @JvmStatic
    public static final void register(@NotNull AppCompatActivity activity, @NotNull String provider, @Nullable String accessToken, @NotNull Area area, @NotNull RegActionCallback callback) {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(activity, activity.getString(R.string.no_network_connection));
            return;
        }
        callback.showLoading(R.string.account_ui_wait);
        HMLoginManager.initAccountManager();
        a aVar = new a(activity, provider, callback);
        if (TextUtils.isEmpty(accessToken)) {
            AccountManager.getDefault(activity).registrationBase(activity, provider, area.getValue(), area.getSubAreaValue(), aVar);
        } else {
            AccountManager.getDefault(activity).registration(activity, provider, accessToken, area.getValue(), area.getSubAreaValue(), aVar);
        }
    }
}
