package com.huami.account.auth.quicklogin;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.auth.R;
import com.huami.account.auth.databinding.ActivityLoginByLastAccountBinding;
import com.huami.account.auth.entity.LastLoginInfo;
import com.huami.account.auth.quicklogin.QuickLoginActivity;
import com.huami.account.auth.quicklogin.QuickLoginUiState;
import com.huami.account.service.AuthNavigation;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.ui.login.LoginViewComponent;
import com.huami.account.ui.login.LoginViewExtKt;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.account.ui.login.state.PassportOperationState;
import com.huami.account.ui.login.viewmodel.LoginViewModelContract;
import com.huami.lib.view.image.CircleImageView;
import com.huami.passport.AccountManager;
import com.huami.passport.OperationResult;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.loc.z;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.ext.ImageLoadExtentionsKt;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/huami/account/auth/quicklogin/QuickLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/account/ui/login/LoginViewComponent;", "", "r", "Lcom/huami/account/auth/databinding/ActivityLoginByLastAccountBinding;", "binding", "Lcom/huami/account/auth/entity/LastLoginInfo;", "info", "v", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/fragment/app/FragmentActivity;", "provideViewHost", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "provideDialogContainer", "Lcom/huami/account/ui/login/viewmodel/LoginViewModelContract;", "provideViewModelContract", "Lcom/huami/account/service/AuthNavigation;", "a", "Lkotlin/Lazy;", "l", "()Lcom/huami/account/service/AuthNavigation;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/huami/account/auth/quicklogin/QuickLoginViewModel;", "b", "m", "()Lcom/huami/account/auth/quicklogin/QuickLoginViewModel;", "viewModel", "Lcom/huami/account/ui/common/LoadingDialogHelper;", "c", hl.k, "()Lcom/huami/account/ui/common/LoadingDialogHelper;", "dialog", GoogleApiAvailabilityLight.a, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", z.j, "()Lcom/huami/account/auth/databinding/ActivityLoginByLastAccountBinding;", "Lcom/huami/account/service/model/LoginViewOptions;", "e", "Lcom/huami/account/service/model/LoginViewOptions;", "options", "Lcom/huami/passport/AccountManager;", "f", "Lcom/huami/passport/AccountManager;", "accountManager", "<init>", "()V", "Companion", "auth_release"}, k = 1, mv = {1, 5, 1})
public final class QuickLoginActivity extends AppCompatActivity implements LoginViewComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] g;

    @NotNull
    private static final String h = "loginOptions";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LoginViewOptions options;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private AccountManager accountManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/account/auth/quicklogin/QuickLoginActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/service/model/LoginViewOptions;", "options", "Landroid/os/Bundle;", "extras", "", "start", "", "EXTRA_LOGIN_OPTION", "Ljava/lang/String;", "<init>", "()V", "auth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, LoginViewOptions loginViewOptions, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            companion.start(context, loginViewOptions, bundle);
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull LoginViewOptions options, @Nullable Bundle extras) {
            Intent intentPutExtra = new Intent(context, (Class<?>) QuickLoginActivity.class).putExtra(QuickLoginActivity.h, options);
            if (extras != null) {
                intentPutExtra.putExtras(extras);
            }
            context.startActivity(intentPutExtra);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/account/ui/common/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialogHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(QuickLoginActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.auth.quicklogin.QuickLoginActivity$onCreate$4$1", f = "QuickLoginActivity.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PassportOperationState c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PassportOperationState passportOperationState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = passportOperationState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return QuickLoginActivity.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                QuickLoginActivity quickLoginActivity = QuickLoginActivity.this;
                AccountManager accountManager = quickLoginActivity.accountManager;
                Objects.requireNonNull(accountManager);
                PassportOperationState passportOperationState = this.c;
                this.a = 1;
                obj = LoginViewExtKt.handlePassportEvent(quickLoginActivity, accountManager, passportOperationState, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            QuickLoginActivity.this.m().handlePassportResult(this.c.getProvider(), (OperationResult) obj);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(QuickLoginActivity.class), "binding", "getBinding()Lcom/huami/account/auth/databinding/ActivityLoginByLastAccountBinding;"));
        g = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuickLoginActivity() {
        super(R.layout.activity_login_by_last_account);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigation = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AuthNavigation>() { // from class: com.huami.account.auth.quicklogin.QuickLoginActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.service.AuthNavigation, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AuthNavigation invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(AuthNavigation.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.account.auth.quicklogin.QuickLoginActivity$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<QuickLoginViewModel>() { // from class: com.huami.account.auth.quicklogin.QuickLoginActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.account.auth.quicklogin.QuickLoginViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final QuickLoginViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(QuickLoginViewModel.class), function0, objArr3);
            }
        });
        this.dialog = LazyKt__LazyJVMKt.lazy(new a());
        this.binding = ActivityViewBindingsKt.viewBinding(new QuickLoginActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityLoginByLastAccountBinding.class)));
    }

    private final ActivityLoginByLastAccountBinding j() {
        return (ActivityLoginByLastAccountBinding) this.binding.getValue(this, g[3]);
    }

    private final LoadingDialogHelper k() {
        return (LoadingDialogHelper) this.dialog.getValue();
    }

    private final AuthNavigation l() {
        return (AuthNavigation) this.navigation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QuickLoginViewModel m() {
        return (QuickLoginViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(QuickLoginActivity quickLoginActivity, LastLoginInfo lastLoginInfo) {
        if (lastLoginInfo == null) {
            return;
        }
        quickLoginActivity.v(quickLoginActivity.j(), lastLoginInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(QuickLoginActivity quickLoginActivity, StateWrapper stateWrapper) {
        if (stateWrapper instanceof StateWrapper.Failed) {
            LoginViewExtKt.handleLoginFailedState(quickLoginActivity, (LoginFailed) ((StateWrapper.Failed) stateWrapper).getError());
        } else if (stateWrapper instanceof StateWrapper.Loading) {
            LoginViewExtKt.handleLoadingState(quickLoginActivity, (StateWrapper.Loading) stateWrapper);
        } else if (stateWrapper instanceof StateWrapper.Success) {
            LoginViewExtKt.handleLoginSuccess(quickLoginActivity, (LoginSuccess) ((StateWrapper.Success) stateWrapper).getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(QuickLoginActivity quickLoginActivity, QuickLoginUiState.NavigateNormalLogin navigateNormalLogin) {
        AuthNavigation authNavigationL = quickLoginActivity.l();
        LoginViewOptions loginViewOptions = quickLoginActivity.options;
        Objects.requireNonNull(loginViewOptions);
        AuthNavigation.DefaultImpls.navigateToNormalLogin$default(authNavigationL, quickLoginActivity, LoginViewOptions.copy$default(loginViewOptions, navigateNormalLogin.getUsername(), null, false, false, null, 30, null), null, 4, null);
        quickLoginActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(QuickLoginActivity quickLoginActivity, PassportOperationState passportOperationState) {
        e.f(LifecycleOwnerKt.getLifecycleScope(quickLoginActivity), null, null, quickLoginActivity.new b(passportOperationState, null), 3, null);
    }

    private final void r() {
        j().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: c66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickLoginActivity.s(this.a, view);
            }
        });
        j().buttonLogin.setOnClickListener(new View.OnClickListener() { // from class: e66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickLoginActivity.t(this.a, view);
            }
        });
        j().buttonLoginOther.setOnClickListener(new View.OnClickListener() { // from class: d66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickLoginActivity.u(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(QuickLoginActivity quickLoginActivity, View view) {
        quickLoginActivity.finish();
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull LoginViewOptions loginViewOptions, @Nullable Bundle bundle) {
        INSTANCE.start(context, loginViewOptions, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(QuickLoginActivity quickLoginActivity, View view) {
        quickLoginActivity.m().login();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(QuickLoginActivity quickLoginActivity, View view) {
        AuthNavigation authNavigationL = quickLoginActivity.l();
        LoginViewOptions loginViewOptions = quickLoginActivity.options;
        Objects.requireNonNull(loginViewOptions);
        AuthNavigation.DefaultImpls.navigateToNormalLogin$default(authNavigationL, quickLoginActivity, loginViewOptions, null, 4, null);
        quickLoginActivity.finish();
    }

    private final void v(ActivityLoginByLastAccountBinding binding, LastLoginInfo info) {
        binding.tvNickname.setText(info.getNickname());
        binding.tvLastLoginType.setText(LoginViewExtKt.providerToLastLoginPrompt(info.getProvider()));
        String str = info.getCom.xiaomi.hm.health.relation.cloud.WebAPI.PARAM_SHARE_INVITE_AVATAR java.lang.String();
        boolean z = false;
        if (str != null && (!m.isBlank(str))) {
            z = true;
        }
        if (z) {
            CircleImageView circleImageView = binding.imageAvatar;
            try {
                HMImageLoader.with(circleImageView).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).load(str).crossFade().centerCrop().into(circleImageView);
            } catch (Exception e) {
                HMLog.e(ImageLoadExtentionsKt.TAG, e);
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(j().getRoot());
        r();
        LoginViewOptions loginViewOptions = (LoginViewOptions) getIntent().getParcelableExtra(h);
        if (loginViewOptions == null) {
            loginViewOptions = new LoginViewOptions(null, null, false, false, null, 31, null);
        }
        this.options = loginViewOptions;
        Objects.requireNonNull(loginViewOptions);
        if (!loginViewOptions.getShowBack()) {
            j().titleBar.setNavigationIcon((Drawable) null);
        }
        this.accountManager = AccountManager.getDefault(this);
        m().getLastLoginInfo().observe(this, new Observer() { // from class: f66
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                QuickLoginActivity.n(this.a, (LastLoginInfo) obj);
            }
        });
        m().getUiState().observe(this, new Observer() { // from class: h66
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                QuickLoginActivity.o(this.a, (StateWrapper) obj);
            }
        });
        m().getNavigateToLogin().observe(this, new Observer() { // from class: g66
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                QuickLoginActivity.p(this.a, (QuickLoginUiState.NavigateNormalLogin) obj);
            }
        });
        m().getPassportOperationState().observe(this, new Observer() { // from class: i66
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                QuickLoginActivity.q(this.a, (PassportOperationState) obj);
            }
        });
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public LoadingDialogContainer provideDialogContainer() {
        return k();
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public FragmentActivity provideViewHost() {
        return this;
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public LoginViewModelContract provideViewModelContract() {
        return m();
    }
}
