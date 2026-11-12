package com.huami.account.ui.forget;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.event.EventQuickLoginSuccess;
import com.huami.account.ui.R;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogHelper;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.ui.forget.ResetPwdSuccessFragment;
import com.huami.account.ui.login.LoginViewComponent;
import com.huami.account.ui.login.LoginViewExtKt;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.account.ui.login.viewmodel.LoginViewModel;
import com.huami.account.ui.login.viewmodel.LoginViewModelContract;
import com.huami.account.utils.UtilsKt;
import de.greenrobot.event.EventBus;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/account/ui/forget/ResetPwdSuccessFragment;", "Lcom/huami/account/ui/forget/HMPhoneFragment;", "Lcom/huami/account/ui/login/LoginViewComponent;", "", "getTitleRes", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Landroidx/appcompat/app/AppCompatActivity;", "provideViewHost", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "provideDialogContainer", "Lcom/huami/account/ui/login/viewmodel/LoginViewModelContract;", "provideViewModelContract", "c", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialogContainer", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/account/ui/login/viewmodel/LoginViewModel;", "viewModel", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class ResetPwdSuccessFragment extends HMPhoneFragment implements LoginViewComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "username";

    @NotNull
    private static final String f = "password";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LoadingDialogContainer dialogContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/account/ui/forget/ResetPwdSuccessFragment$Companion;", "", "", "username", "password", "Lcom/huami/account/ui/forget/ResetPwdSuccessFragment;", "newInstance", "ARG_PASSWORD", "Ljava/lang/String;", "ARG_USERNAME", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ResetPwdSuccessFragment newInstance(@NotNull String username, @NotNull String password) {
            Bundle bundle = new Bundle();
            bundle.putString("username", username);
            bundle.putString("password", password);
            ResetPwdSuccessFragment resetPwdSuccessFragment = new ResetPwdSuccessFragment();
            resetPwdSuccessFragment.setArguments(bundle);
            return resetPwdSuccessFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
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
            ResetPwdSuccessFragment.this.requireActivity().finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResetPwdSuccessFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.account.ui.forget.ResetPwdSuccessFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LoginViewModel>() { // from class: com.huami.account.ui.forget.ResetPwdSuccessFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.account.ui.login.viewmodel.LoginViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final LoginViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(LoginViewModel.class), function0, objArr);
            }
        });
    }

    private final LoginViewModel c() {
        return (LoginViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ResetPwdSuccessFragment resetPwdSuccessFragment, Function0 function0, View view) {
        String string = resetPwdSuccessFragment.requireArguments().getString("username");
        String string2 = resetPwdSuccessFragment.requireArguments().getString("password");
        if (string == null || string2 == null) {
            function0.getA();
        } else {
            resetPwdSuccessFragment.c().doLogin(string, string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ResetPwdSuccessFragment resetPwdSuccessFragment, Function0 function0, StateWrapper stateWrapper) {
        if (stateWrapper instanceof StateWrapper.Success) {
            LoginViewExtKt.handleLoginSuccess(resetPwdSuccessFragment, (LoginSuccess) ((StateWrapper.Success) stateWrapper).getData());
            EventBus.getDefault().postSticky(new EventQuickLoginSuccess());
        } else if (stateWrapper instanceof StateWrapper.Loading) {
            LoginViewExtKt.handleLoadingState(resetPwdSuccessFragment, (StateWrapper.Loading) stateWrapper);
        } else {
            function0.getA();
        }
    }

    @Override // com.huami.account.ui.forget.HMPhoneFragment
    public int getTitleRes() {
        return R.string.account_ui_account_set_new_pwd;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_ui_fragment_reset_password_by_phone_success, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.dialogContainer = new LoadingDialogHelper(requireActivity());
        hideSoftKeyBoard();
        final a aVar = new a();
        UtilsKt.findViewById(this, R.id.reset_success_go_to_login_btn).setOnClickListener(new View.OnClickListener() { // from class: ce6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ResetPwdSuccessFragment.d(this.a, aVar, view2);
            }
        });
        c().getLoginUiState().observe(getViewLifecycleOwner(), new Observer() { // from class: de6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ResetPwdSuccessFragment.e(this.a, aVar, (StateWrapper) obj);
            }
        });
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public LoadingDialogContainer provideDialogContainer() {
        LoadingDialogContainer loadingDialogContainer = this.dialogContainer;
        Objects.requireNonNull(loadingDialogContainer);
        return loadingDialogContainer;
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public LoginViewModelContract provideViewModelContract() {
        return c();
    }

    @Override // com.huami.account.ui.login.LoginViewComponent
    @NotNull
    public AppCompatActivity provideViewHost() {
        return (AppCompatActivity) requireActivity();
    }
}
