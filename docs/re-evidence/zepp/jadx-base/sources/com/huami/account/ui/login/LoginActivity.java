package com.huami.account.ui.login;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountStatEvent;
import com.huami.account.HMLoginErrorManager;
import com.huami.account.event.EventQuickLoginSuccess;
import com.huami.account.event.EventRegisterErrorTipExit;
import com.huami.account.service.AnonymousService;
import com.huami.account.service.AuthNavigation;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.common.DebugUi;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.common.SetTestUrlActivity;
import com.huami.account.ui.common.VariantDiffManager;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.ui.forget.EmailActivity;
import com.huami.account.ui.forget.HMPhoneActivity;
import com.huami.account.ui.login.LoginActivity;
import com.huami.account.ui.login.entity.PasswordAttemptData;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.account.ui.login.state.PassportOperationState;
import com.huami.account.ui.login.viewmodel.LoginViewModel;
import com.huami.account.ui.login.viewmodel.LoginViewModelContract;
import com.huami.account.ui.register.BaseRegisterFragmentKt;
import com.huami.account.utils.AppChannel;
import com.huami.account.utils.AppChannelKt;
import com.huami.account.utils.DeprecatedFunc;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.http.serverfault.handler.AccountFaultHandler;
import com.huami.http.serverfault.widget.ServerFaultView;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.AccountManager;
import com.huami.passport.OperationResult;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Õ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0001{\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0002\u0083\u0001B\t¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u0005H\u0002J\b\u0010\"\u001a\u00020\u0005H\u0002J\b\u0010#\u001a\u00020\u0005H\u0002J\b\u0010$\u001a\u00020\u0005H\u0002J$\u0010(\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0002J\b\u0010)\u001a\u00020\u0005H\u0002J\u0012\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010-\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\u0012\u00104\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000102H\u0014J\u0012\u00105\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u00106\u001a\u00020\u0005H\u0014J\"\u0010;\u001a\u00020\u00052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0003H\u0014J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020?R%\u0010F\u001a\n A*\u0004\u0018\u00010@0@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\u001bR\u001d\u0010R\u001a\u00020N8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010QR%\u0010W\u001a\n A*\u0004\u0018\u00010S0S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010C\u001a\u0004\bU\u0010VR%\u0010Z\u001a\n A*\u0004\u0018\u00010S0S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bY\u0010VR%\u0010^\u001a\n A*\u0004\u0018\u00010[0[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\b\\\u0010]R%\u0010b\u001a\n A*\u0004\u0018\u00010_0_8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010C\u001a\u0004\b`\u0010aR%\u0010e\u001a\n A*\u0004\u0018\u00010[0[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010C\u001a\u0004\bd\u0010]R%\u0010j\u001a\n A*\u0004\u0018\u00010f0f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010C\u001a\u0004\bh\u0010iR%\u0010n\u001a\n A*\u0004\u0018\u00010k0k8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\bl\u0010mR%\u0010p\u001a\n A*\u0004\u0018\u00010[0[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bo\u0010]R%\u0010t\u001a\n A*\u0004\u0018\u00010q0q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\br\u0010sR%\u0010u\u001a\n A*\u0004\u0018\u00010f0f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bg\u0010iR%\u0010v\u001a\n A*\u0004\u0018\u00010f0f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bc\u0010iR%\u0010z\u001a\n A*\u0004\u0018\u00010w0w8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bx\u0010yR\u0016\u0010}\u001a\u00020{8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010|R\u001e\u0010\u0080\u0001\u001a\u00020.8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\b~\u0010\u007f¨\u0006\u0084\u0001"}, d2 = {"Lcom/huami/account/ui/login/LoginActivity;", "Lcom/huami/account/ui/common/BaseTitleOauthActivity;", "Lcom/huami/account/ui/login/LoginViewComponent;", "Landroid/content/Intent;", "intent", "", "Y", "e0", "X", "H0", "n0", PointCategory.INIT, "t0", "j0", "E0", "z0", "G", "F0", "", "username", "p0", "r0", "Lcom/huami/account/ui/login/LoginTypeAdapter;", "adapter", "v0", "Lcom/huami/account/ui/login/state/LoginFailed;", "failed", "Z", "Lcom/huami/account/ui/login/state/LoginFailed$AttemptLimit;", "a0", "Lcom/huami/account/ui/login/state/LoginFailed$AccountOrPasswordIncorrect;", "state", "W", "D0", "l0", "f0", "h0", "Lkotlin/Function0;", "miAccountCallback", "negativeCallback", "H", "o0", "responseType", "d0", "Landroidx/appcompat/app/AppCompatActivity;", "provideViewHost", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "provideDialogContainer", "Lcom/huami/account/ui/login/viewmodel/LoginViewModelContract;", "provideViewModelContract", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onNewIntent", "onDestroy", "", "requestCode", "resultCode", "data", "onActivityResult", "Lcom/huami/account/event/EventRegisterErrorTipExit;", "event", "onEventMainThread", "Lcom/huami/account/event/EventQuickLoginSuccess;", "Lcom/huami/passport/AccountManager;", "kotlin.jvm.PlatformType", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Lazy;", "P", "()Lcom/huami/passport/AccountManager;", "mAccountManager", "Lcom/huami/account/HMLoginErrorManager;", "B", "Lcom/huami/account/HMLoginErrorManager;", "mManager", "", "C", "isAutoLoggingIn", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel;", LogUtil.D, "O", "()Lcom/huami/account/ui/login/viewmodel/LoginViewModel;", "loginViewModel", "Landroid/widget/EditText;", "E", "L", "()Landroid/widget/EditText;", "etUsername", "F", "K", "etPassword", "Landroid/widget/TextView;", "V", "()Landroid/widget/TextView;", "tvRegister", "Landroidx/recyclerview/widget/RecyclerView;", "Q", "()Landroidx/recyclerview/widget/RecyclerView;", "rvThirdPart", LogUtil.I, ExifInterface.GPS_DIRECTION_TRUE, "tvLogin", "Landroid/view/View;", "J", "M", "()Landroid/view/View;", "icLoginTypeVisibility", "Landroid/widget/ImageView;", "N", "()Landroid/widget/ImageView;", "ivShowPassword", "U", "tvLoginPrompt", "Lcom/huami/http/serverfault/widget/ServerFaultView;", "R", "()Lcom/huami/http/serverfault/widget/ServerFaultView;", "serverFaultView", "btnUsernameClear", "btnPasswordClear", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", ExifInterface.LATITUDE_SOUTH, "()Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "titleBar", "com/huami/account/ui/login/LoginActivity$languageReceiver$1", "Lcom/huami/account/ui/login/LoginActivity$languageReceiver$1;", "languageReceiver", "getDialog", "()Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialog", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginActivity extends BaseTitleOauthActivity implements LoginViewComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LOGIN_TYPE = "LOGIN_TYPE";

    @NotNull
    public static final String TAG = "LoginActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAccountManager = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final HMLoginErrorManager mManager = new HMLoginErrorManager();

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isAutoLoggingIn;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy loginViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy etUsername;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy etPassword;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvRegister;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Lazy rvThirdPart;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvLogin;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Lazy icLoginTypeVisibility;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivShowPassword;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvLoginPrompt;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverFaultView;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnUsernameClear;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnPasswordClear;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleBar;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private final LoginActivity$languageReceiver$1 languageReceiver;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/login/LoginActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", LoginViewOptions.EXTRA_LOGIN_TOKEN, "", "startTokenLogin", LoginActivity.LOGIN_TYPE, "Ljava/lang/String;", "TAG", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "使用 AuthService#navigateToLogin 进行替换", replaceWith = @ReplaceWith(expression = "getKoinProxy().get<AuthService>().navigateToLogin(context, LoginViewOptions(loginToken = loginToken))", imports = {"com.huami.account.service.proxy.getKoinProxy", "com.huami.account.service.AuthService", "com.huami.account.service.model.LoginViewOptions"}))
        public final void startTokenLogin(@NotNull Context context, @NotNull String loginToken) {
            AuthNavigation.DefaultImpls.navigateToNormalLogin$default((AuthNavigation) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AuthNavigation.class), null, null), context, new LoginViewOptions(null, null, false, false, loginToken, 15, null), null, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<View> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return LoginActivity.this.findViewById(R.id.btn_password_clear);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return LoginActivity.this.findViewById(R.id.btn_username_clear);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/ui/common/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LoadingDialogHelper> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(LoginActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EditText> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) LoginActivity.this.findViewById(R.id.et_password);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<EditText> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            return (EditText) LoginActivity.this.findViewById(R.id.et_username);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoginActivity.this.getDialog().hideDialog();
            LoginActivity.this.O().thirdAuthLogin("xiaomi");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LoginFailed b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LoginFailed loginFailed) {
            super(0);
            this.b = loginFailed;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoginActivity.this.W((LoginFailed.AccountOrPasswordIncorrect) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ LoginFailed.AttemptLimit a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LoginFailed.AttemptLimit attemptLimit) {
            super(0);
            this.a = attemptLimit;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "错误的 provider 信息 " + this.a.getProvider();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<View> {
        public i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return LoginActivity.this.findViewById(R.id.ic_login_type_visibility);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<ImageView> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView invoke() {
            return (ImageView) LoginActivity.this.findViewById(R.id.iv_show_password);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/passport/AccountManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<AccountManager> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountManager invoke() {
            return AccountManager.getDefault(LoginActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<RecyclerView> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView invoke() {
            return (RecyclerView) LoginActivity.this.findViewById(R.id.rv_third_part);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/http/serverfault/widget/ServerFaultView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<ServerFaultView> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ServerFaultView invoke() {
            return (ServerFaultView) LoginActivity.this.findViewById(R.id.server_fault_view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.login.LoginActivity$setupViewModels$3$1", f = "LoginActivity.kt", i = {}, l = {455}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PassportOperationState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(PassportOperationState passportOperationState, Continuation<? super n> continuation) {
            super(2, continuation);
            this.c = passportOperationState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginActivity.this.new n(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LoginActivity loginActivity = LoginActivity.this;
                AccountManager accountManagerP = loginActivity.P();
                PassportOperationState passportOperationState = this.c;
                this.a = 1;
                obj = LoginViewExtKt.handlePassportEvent(loginActivity, accountManagerP, passportOperationState, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LoginActivity.this.O().handlePassportResult(this.c.getProvider(), (OperationResult) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "provider", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<String, Unit> {
        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            LoginActivity.this.O().thirdAuthLogin(str);
            Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_LOGIN_ACCOUNT_THIRD).addExtra(AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, str));
            Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_LOGIN_THIRD_AUTH_STATUS).addExtra("Status", AccountStatEvent.VALUE_SIGN_THIRD_STATUS_SIGNIN));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel$LoginType;", "otherTypes", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<List<? extends LoginViewModel.LoginType>, Unit> {
        public p() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(LoginActivity loginActivity, List list, DialogInterface dialogInterface, int i) {
            loginActivity.O().thirdAuthLogin(((LoginViewModel.LoginType) list.get(i)).getProvider());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends LoginViewModel.LoginType> list) {
            invoke2((List<LoginViewModel.LoginType>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull final List<LoginViewModel.LoginType> list) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(LoginActivity.this);
            AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer displayNameRes = ((LoginViewModel.LoginType) it2.next()).getDisplayNameRes();
                if (displayNameRes != null) {
                    arrayList.add(displayNameRes);
                }
            }
            LoginActivity loginActivity = LoginActivity.this;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(loginActivity.getString(((Number) it3.next()).intValue()));
            }
            Object[] array = arrayList2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            AlertDialogFragment.ChoiceItems items = choiceItems.setItems((String[]) array);
            final LoginActivity loginActivity2 = LoginActivity.this;
            builder.setSingleChoiceItemsList(items, new DialogInterface.OnClickListener() { // from class: com.huami.account.ui.login.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LoginActivity.p.b(loginActivity2, list, dialogInterface, i);
                }
            }).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(LoginActivity.this.getSupportFragmentManager());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<Unit> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoginActivity.q0(LoginActivity.this, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Unit> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoginActivity.s0(LoginActivity.this, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<RainbowTitleBar> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RainbowTitleBar invoke() {
            return (RainbowTitleBar) LoginActivity.this.findViewById(R.id.title_bar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<TextView> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) LoginActivity.this.findViewById(R.id.tv_login);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<TextView> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) LoginActivity.this.findViewById(R.id.tv_login_prompt);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<TextView> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) LoginActivity.this.findViewById(R.id.tv_register);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.huami.account.ui.login.LoginActivity$languageReceiver$1] */
    public LoginActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.account.ui.login.LoginActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.loginViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LoginViewModel>() { // from class: com.huami.account.ui.login.LoginActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.account.ui.login.viewmodel.LoginViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LoginViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(LoginViewModel.class), function0, objArr);
            }
        });
        this.etUsername = LazyKt__LazyJVMKt.lazy(new e());
        this.etPassword = LazyKt__LazyJVMKt.lazy(new d());
        this.tvRegister = LazyKt__LazyJVMKt.lazy(new v());
        this.rvThirdPart = LazyKt__LazyJVMKt.lazy(new l());
        this.tvLogin = LazyKt__LazyJVMKt.lazy(new t());
        this.icLoginTypeVisibility = LazyKt__LazyJVMKt.lazy(new i());
        this.ivShowPassword = LazyKt__LazyJVMKt.lazy(new j());
        this.tvLoginPrompt = LazyKt__LazyJVMKt.lazy(new u());
        this.serverFaultView = LazyKt__LazyJVMKt.lazy(new m());
        this.btnUsernameClear = LazyKt__LazyJVMKt.lazy(new b());
        this.btnPasswordClear = LazyKt__LazyJVMKt.lazy(new a());
        this.titleBar = LazyKt__LazyJVMKt.lazy(new s());
        this.languageReceiver = new BroadcastReceiver() { // from class: com.huami.account.ui.login.LoginActivity$languageReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                this.a.O().refreshLoginTypes();
                this.a.H0();
            }
        };
        this.dialog = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(LoginActivity loginActivity, View view) {
        loginActivity.G();
        VariantDiffManager.INSTANCE.navigateToRegister(loginActivity, 1000, loginActivity.getDialog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(LoginActivity loginActivity, View view) {
        loginActivity.G();
        if (AccountExternalsKt.getAccountDelegate().isChineseOnly()) {
            s0(loginActivity, null, 1, null);
        } else {
            loginActivity.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(LoginActivity loginActivity, View view) {
        loginActivity.G();
        loginActivity.O().doLogin(loginActivity.L().getText().toString(), loginActivity.K().getText().toString());
    }

    private final void D0() {
        getDialog().hideDialog();
        U().setVisibility(0);
        U().setText(getString(R.string.account_ui_account_account_or_pwd_incorrect));
    }

    private final void E0() {
        if (getIntent().getBooleanExtra(LoginViewOptions.EXTRA_SHOW_LOGIN_TIP, false)) {
            Toast.makeText(this, R.string.account_ui_account_login_first, 0).show();
        }
    }

    private final void F0() {
        final Map mapMapOf = kotlin.collections.r.mapOf(TuplesKt.to(getString(R.string.account_ui_account_find_pwd_from_email), new q()), TuplesKt.to(getString(R.string.account_ui_account_find_pwd_from_phone), new r()));
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        Object[] array = mapMapOf.keySet().toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        builder.setSingleChoiceItemsList(choiceItems.setItems((String[]) array), new DialogInterface.OnClickListener() { // from class: ds4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LoginActivity.G0(mapMapOf, dialogInterface, i2);
            }
        }).setNeutralButton(R.string.account_ui_cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    private final void G() {
        L().clearFocus();
        K().clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(Map map, DialogInterface dialogInterface, int i2) {
        Object[] array = map.values().toArray(new Function0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        ((Function0[]) array)[i2].invoke();
    }

    private final void H(Function0<Unit> miAccountCallback, Function0<Unit> negativeCallback) {
        if (!AccountExternalsKt.getConfigDelegate().isShowXiaomiAccountWhenFail()) {
            negativeCallback.invoke();
        } else if (this.isAutoLoggingIn) {
            negativeCallback.invoke();
        } else {
            LoginViewExtKt.showMiAccountTip(this, miAccountCallback, negativeCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0() {
        if (AccountExternalsKt.getAccountDelegate().isChineseOnly()) {
            L().setHint(R.string.account_ui_account_input_phone);
            L().setInputType(3);
        } else if (DeprecatedFunc.INSTANCE.isSimplifiedChinese()) {
            L().setHint(R.string.account_ui_input_phone_or_email);
        } else {
            L().setHint(R.string.account_ui_input_email);
        }
    }

    private final View I() {
        return (View) this.btnPasswordClear.getValue();
    }

    private final View J() {
        return (View) this.btnUsernameClear.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText K() {
        return (EditText) this.etPassword.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText L() {
        return (EditText) this.etUsername.getValue();
    }

    private final View M() {
        return (View) this.icLoginTypeVisibility.getValue();
    }

    private final ImageView N() {
        return (ImageView) this.ivShowPassword.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginViewModel O() {
        return (LoginViewModel) this.loginViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountManager P() {
        return (AccountManager) this.mAccountManager.getValue();
    }

    private final RecyclerView Q() {
        return (RecyclerView) this.rvThirdPart.getValue();
    }

    private final ServerFaultView R() {
        return (ServerFaultView) this.serverFaultView.getValue();
    }

    private final RainbowTitleBar S() {
        return (RainbowTitleBar) this.titleBar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView T() {
        return (TextView) this.tvLogin.getValue();
    }

    private final TextView U() {
        return (TextView) this.tvLoginPrompt.getValue();
    }

    private final TextView V() {
        return (TextView) this.tvRegister.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(LoginFailed.AccountOrPasswordIncorrect state) {
        String quantityString;
        PasswordAttemptData attemptData = state.getAttemptData();
        if (attemptData == null) {
            D0();
            return;
        }
        getDialog().hideDialog();
        U().setVisibility(0);
        TextView textViewU = U();
        if (attemptData.getAttempts() == 1) {
            quantityString = getString(R.string.account_ui_account_account_or_pwd_incorrect);
        } else {
            int maxAttempts = attemptData.getMaxAttempts() - attemptData.getAttempts();
            quantityString = getResources().getQuantityString(R.plurals.account_ui_password_error_with_times, maxAttempts, Integer.valueOf(maxAttempts));
        }
        textViewU.setText(quantityString);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    private final void X(Intent intent) {
        boolean z;
        boolean z2;
        String stringExtra = intent == null ? null : intent.getStringExtra("username");
        String stringExtra2 = intent != null ? intent.getStringExtra("password") : null;
        if (stringExtra != null) {
            L().setText(stringExtra);
            L().setSelection(stringExtra.length());
        }
        if (stringExtra2 != null) {
            K().setText(stringExtra2);
            K().setSelection(stringExtra2.length());
        }
        if (stringExtra != null) {
            if (stringExtra.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            if (stringExtra2 != null) {
                if (stringExtra2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                O().doLogin(stringExtra, stringExtra2);
                this.isAutoLoggingIn = true;
            }
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            K().requestFocus();
            K().postDelayed(new Runnable() { // from class: com.huami.account.ui.login.LoginActivity$handleAutoFillForm$$inlined$postDelayed$1
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity loginActivity = this.a;
                    UtilsKt.showKeyboard(loginActivity, loginActivity.K());
                }
            }, 200L);
        }
    }

    private final void Y(Intent intent) {
        if (intent == null) {
            return;
        }
        X(intent);
        e0(intent);
        t0();
    }

    private final void Z(LoginFailed failed) {
        if (failed instanceof LoginFailed.AccountOrPasswordIncorrect) {
            H(new f(), new g(failed));
        } else if (!(failed instanceof LoginFailed.AttemptLimit)) {
            LoginViewExtKt.handleLoginFailedState(this, failed);
        } else {
            getDialog().hideDialog();
            a0((LoginFailed.AttemptLimit) failed);
        }
    }

    private final void a0(final LoginFailed.AttemptLimit failed) {
        U().setVisibility(8);
        Integer blockTime = failed.getBlockTime();
        if (blockTime == null) {
            D0();
            return;
        }
        blockTime.intValue();
        int iIntValue = (failed.getBlockTime().intValue() / 60) + 1;
        new AlertDialogFragment.Builder(this).setMessage(getResources().getQuantityString(R.plurals.account_ui_login_failed_with_block_minutes, iIntValue, Integer.valueOf(iIntValue))).setPositiveButton(R.string.account_ui_login_forget_password, new DialogInterface.OnClickListener() { // from class: yr4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LoginActivity.b0(failed, this, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.account_ui_cancel, new DialogInterface.OnClickListener() { // from class: es4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LoginActivity.c0(dialogInterface, i2);
            }
        }).show(getSupportFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(LoginFailed.AttemptLimit attemptLimit, LoginActivity loginActivity, DialogInterface dialogInterface, int i2) {
        String provider = attemptLimit.getProvider();
        if (Intrinsics.areEqual(provider, "huami")) {
            loginActivity.p0(attemptLimit.getUsername());
        } else if (Intrinsics.areEqual(provider, "huami_phone")) {
            loginActivity.r0(attemptLimit.getUsername());
        } else {
            HMLog.info$default(null, new h(attemptLimit), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(DialogInterface dialogInterface, int i2) {
    }

    private final void d0(String responseType) {
        if (responseType != null) {
            int iHashCode = responseType.hashCode();
            if (iHashCode == -82377867) {
                if (responseType.equals(SelectAreaActivity.TYPE_RESPONSE_PHONE)) {
                    LoginViewExtKt.processAccount(this, false);
                }
            } else if (iHashCode == 1858482086) {
                if (responseType.equals("TYPE_RESPONSE")) {
                    LoginViewExtKt.processAccount(this, false);
                }
            } else if (iHashCode == 2085024192 && responseType.equals(SelectAreaActivity.TYPE_RESPONSE_REGISTER_SUCCESS)) {
                LoadingDialogContainerKt.showLoadingDialog(getDialog(), R.string.account_ui_logining);
                LoginViewExtKt.processAccount(this, true);
            }
        }
    }

    private final void e0(Intent intent) {
        String stringExtra = intent.getStringExtra(LoginViewOptions.EXTRA_LOGIN_TOKEN);
        if (stringExtra == null) {
            return;
        }
        LoadingDialogContainerKt.showLoadingDialog(getDialog(), R.string.account_ui_logining);
        AccountManager.getDefault(this).tokenLogin(stringExtra, null, null, O().handlePassportCallback("sso"));
    }

    private final void f0() {
        View viewFindViewById;
        if (GlobalUtil.isInnerFlavor() && (viewFindViewById = findViewById(R.id.layout_login_type)) != null) {
            viewFindViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: ls4
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return LoginActivity.g0(this.a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g0(LoginActivity loginActivity, View view) {
        loginActivity.O().switchLoginTypes();
        return true;
    }

    private final void h0() {
        if (AccountExternalsKt.getConfigDelegate().debug()) {
            findViewById(R.id.tv_register).setOnLongClickListener(new View.OnLongClickListener() { // from class: ks4
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return LoginActivity.i0(this.a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i0(LoginActivity loginActivity, View view) {
        DebugUi.INSTANCE.shareLoginFailedLog(loginActivity, loginActivity.getDialog());
        return true;
    }

    private final void init() {
        setContentView(R.layout.account_ui_activity_login_layout_new);
        t0();
        z0();
        l0();
        E0();
        f0();
        h0();
        j0();
        o0();
        EventBus.getDefault().registerSticky(this);
    }

    private final void j0() {
        AccountFaultHandler.INSTANCE.getShouldShowTip().observe(this, new Observer() { // from class: bs4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginActivity.k0(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(LoginActivity loginActivity, Boolean bool) {
        loginActivity.R().setVisibility(bool.booleanValue() ? 0 : 8);
    }

    private final void l0() {
        if (AccountExternalsKt.getConfigDelegate().supportSetServerHost()) {
            TextView textView = (TextView) findViewById(R.id.checkout_server_tv);
            textView.setVisibility(0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: is4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.m0(this.a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(LoginActivity loginActivity, View view) {
        SetTestUrlActivity.show(loginActivity);
    }

    private final void n0() {
        if (Intrinsics.areEqual("xiaomi", getIntent().getStringExtra(LOGIN_TYPE))) {
            O().thirdAuthLogin("xiaomi");
        }
    }

    private final void o0() {
        registerReceiver(this.languageReceiver, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    private final void p0(String username) {
        Intent intent = new Intent(this, (Class<?>) EmailActivity.class);
        intent.putExtra(EmailActivity.REQUEST_PHONE_FORGET_PASSWORD, true);
        intent.putExtra(EmailActivity.EXTRA_INITIAL_EMAIL, username);
        startActivity(intent);
    }

    public static /* synthetic */ void q0(LoginActivity loginActivity, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        loginActivity.p0(str);
    }

    private final void r0(String username) {
        Intent intent = new Intent(this, (Class<?>) HMPhoneActivity.class);
        intent.putExtra(HMPhoneActivity.REQUEST_PHONE_FORGET_PASSWORD, true);
        intent.putExtra("initial_phone", username);
        startActivity(intent);
    }

    public static /* synthetic */ void s0(LoginActivity loginActivity, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        loginActivity.r0(str);
    }

    private final void t0() {
        setStyle(BaseTitleActivity.STYLE.NONE, R.color.account_ui_transparency, !RainbowUtils.isDarkMode(this));
        S().setNavigationOnClickListener(new View.OnClickListener() { // from class: gs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.u0(this.a, view);
            }
        });
        S().setVisibility(getIntent().getBooleanExtra(LoginViewOptions.EXTRA_SHOW_BACK, false) ^ true ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(LoginActivity loginActivity, View view) {
        loginActivity.finish();
    }

    private final void v0(final LoginTypeAdapter adapter) {
        O().getAvailableLoginType().observe(this, new Observer() { // from class: cs4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginActivity.y0(adapter, (List) obj);
            }
        });
        O().getLoginUiState().observe(this, new Observer() { // from class: zr4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginActivity.w0(this.a, (StateWrapper) obj);
            }
        });
        O().getPassportOperationState().observe(this, new Observer() { // from class: as4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LoginActivity.x0(this.a, (PassportOperationState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(LoginActivity loginActivity, StateWrapper stateWrapper) {
        if (stateWrapper == null) {
            return;
        }
        UtilsKt.hideKeyboard(loginActivity);
        if (stateWrapper instanceof StateWrapper.Failed) {
            loginActivity.Z((LoginFailed) ((StateWrapper.Failed) stateWrapper).getError());
            loginActivity.isAutoLoggingIn = false;
        } else if (stateWrapper instanceof StateWrapper.Loading) {
            LoginViewExtKt.handleLoadingState(loginActivity, (StateWrapper.Loading) stateWrapper);
        } else {
            if (!(stateWrapper instanceof StateWrapper.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            LoginViewExtKt.handleLoginSuccess(loginActivity, (LoginSuccess) ((StateWrapper.Success) stateWrapper).getData());
            loginActivity.U().setVisibility(8);
            loginActivity.isAutoLoggingIn = false;
        }
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(LoginActivity loginActivity, PassportOperationState passportOperationState) {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(loginActivity), null, null, loginActivity.new n(passportOperationState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(LoginTypeAdapter loginTypeAdapter, List list) {
        loginTypeAdapter.setLoginTypes$accountui_release(list);
        loginTypeAdapter.notifyDataSetChanged();
    }

    private final void z0() {
        View viewM;
        V().setOnClickListener(new View.OnClickListener() { // from class: js4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.A0(this.a, view);
            }
        });
        LoginTypeAdapter loginTypeAdapter = new LoginTypeAdapter(this);
        Q().setLayoutManager(new LinearLayoutManager(this, 0, false));
        Q().suppressLayout(true);
        Q().setNestedScrollingEnabled(false);
        Q().setOverScrollMode(2);
        Q().setAdapter(loginTypeAdapter);
        v0(loginTypeAdapter);
        TextWatcher textWatcher = new TextWatcher() { // from class: com.huami.account.ui.login.LoginActivity$setupViews$loginEditTextWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable s2) {
                this.a.T().setEnabled((this.a.L().length() == 0 || this.a.K().length() == 0) ? false : true);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence s2, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence s2, int start, int before, int count) {
            }
        };
        L().addTextChangedListener(textWatcher);
        K().addTextChangedListener(textWatcher);
        findViewById(R.id.tv_forget_password).setOnClickListener(new View.OnClickListener() { // from class: fs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.B0(this.a, view);
            }
        });
        BaseRegisterFragmentKt.setupPasswordVisible(K(), N());
        T().setOnClickListener(new View.OnClickListener() { // from class: hs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.C0(this.a, view);
            }
        });
        V().setVisibility(AccountExternalsKt.getConfigDelegate().supportRegister() ? 0 : 8);
        if (AppChannelKt.getAppChannel(this) == AppChannel.MiFit && (viewM = M()) != null) {
            viewM.setVisibility(8);
        }
        H0();
        loginTypeAdapter.setOnLoginTypeClickListener(new o());
        loginTypeAdapter.setOnOtherClickListener(new p());
        UtilsKt.setupEditorClearBtn(L(), J());
        UtilsKt.setupEditorClearBtn(K(), I());
    }

    @NotNull
    public final LoadingDialogContainer getDialog() {
        return (LoadingDialogContainer) this.dialog.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        P().onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1) {
            return;
        }
        if (requestCode != 111 && requestCode != 112) {
            if (requestCode == 222) {
                d0(data == null ? null : data.getStringExtra("TYPE_RESPONSE"));
                return;
            } else if (requestCode != 1000) {
                return;
            }
        }
        LoginViewExtKt.processAccount(this, false);
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        init();
        n0();
        Analytics.recordEvent(new CountEventBuilder("Login_ViewNum"));
        Y(getIntent());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mManager.deleteZipFile();
        unregisterReceiver(this.languageReceiver);
        getDialog().hideDialog();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventRegisterErrorTipExit event) {
        EventBus.getDefault().removeStickyEvent(event);
        if (((AnonymousService) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AnonymousService.class), null, null)).isAnonymousUser()) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        Y(intent);
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public LoadingDialogContainer provideDialogContainer() {
        return getDialog();
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public AppCompatActivity provideViewHost() {
        return this;
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public LoginViewModelContract provideViewModelContract() {
        return O();
    }

    public final void onEventMainThread(@NotNull EventQuickLoginSuccess event) {
        EventBus.getDefault().removeStickyEvent(event);
        finish();
    }
}
