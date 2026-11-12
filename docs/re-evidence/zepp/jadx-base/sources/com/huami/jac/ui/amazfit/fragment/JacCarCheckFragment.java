package com.huami.jac.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavArgsLazy;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.android.design.dialog.loading.LoadingView;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.jac.repo.exception.JacException;
import com.huami.jac.repo.viewmodel.JacCarCheckViewModel;
import com.huami.jac.ui.amazfit.R;
import com.huami.jac.ui.amazfit.navigation.JacNavigationApi;
import com.huami.jac.ui.amazfit.utils.RainbowTitleBarExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/jac/ui/amazfit/fragment/JacCarCheckFragment;", "Lcom/huami/jac/ui/amazfit/fragment/JacBaseFragment;", "", "setViewId", "", "showBleStatusBar", "showBleStatusMaskView", "", "initViewModel", "onBackButtonClick", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "loadData", "Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "e", "Lkotlin/Lazy;", "i", "()Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "navigationApi", "Lcom/huami/jac/ui/amazfit/fragment/JacCarCheckFragmentArgs;", "f", "Landroidx/navigation/NavArgsLazy;", "h", "()Lcom/huami/jac/ui/amazfit/fragment/JacCarCheckFragmentArgs;", "args", "Lcom/huami/jac/repo/viewmodel/JacCarCheckViewModel;", "g", z.j, "()Lcom/huami/jac/repo/viewmodel/JacCarCheckViewModel;", "viewModel", "<init>", "()V", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacCarCheckFragment extends JacBaseFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final NavArgsLazy args;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        /* JADX INFO: renamed from: com.huami.jac.ui.amazfit.fragment.JacCarCheckFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0456a extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ JacCarCheckFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0456a(JacCarCheckFragment jacCarCheckFragment) {
                super(1);
                this.a = jacCarCheckFragment;
            }

            public final void a(@NotNull Success<Boolean> success) {
                View view = this.a.getView();
                ((LoadingView) (view == null ? null : view.findViewById(R.id.car_check_progress_bar))).stopLoading();
                this.a.i().checkToProgress(this.a.getNavController(), this.a.h().getAction(), this.a.h().getToken(), this.a.h().getKeyToken());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ JacCarCheckFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(JacCarCheckFragment jacCarCheckFragment) {
                super(1);
                this.a = jacCarCheckFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(JacCarCheckFragment jacCarCheckFragment, View view) {
                View view2 = jacCarCheckFragment.getView();
                ((LoadingView) (view2 == null ? null : view2.findViewById(R.id.car_check_progress_bar))).reset();
                jacCarCheckFragment.loadData();
            }

            public final void b(@NotNull Fail<Boolean> fail) {
                if (fail.getError() instanceof JacException) {
                    View view = this.a.getView();
                    ((LoadingView) (view == null ? null : view.findViewById(R.id.car_check_progress_bar))).setFailed();
                    View view2 = this.a.getView();
                    ((TextView) (view2 == null ? null : view2.findViewById(R.id.car_check_tv))).setText(((JacException) fail.getError()).getMsgForUi());
                } else {
                    View view3 = this.a.getView();
                    ((LoadingView) (view3 == null ? null : view3.findViewById(R.id.car_check_progress_bar))).setFailed();
                    View view4 = this.a.getView();
                    ((TextView) (view4 == null ? null : view4.findViewById(R.id.car_check_tv))).setText(fail.getError().getMessage());
                }
                View view5 = this.a.getView();
                View viewFindViewById = view5 != null ? view5.findViewById(R.id.car_retry_bt) : null;
                final JacCarCheckFragment jacCarCheckFragment = this.a;
                Button button = (Button) viewFindViewById;
                button.setOnClickListener(new View.OnClickListener() { // from class: com.huami.jac.ui.amazfit.fragment.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        JacCarCheckFragment.a.b.c(jacCarCheckFragment, view6);
                    }
                });
                button.setVisibility(0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Boolean> fail) {
                b(fail);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onSuccess(new C0456a(JacCarCheckFragment.this));
            stateBuilder.onFail(new b(JacCarCheckFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JacCarCheckFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JacNavigationApi>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCarCheckFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.jac.ui.amazfit.navigation.JacNavigationApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JacNavigationApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JacNavigationApi.class), qualifier, objArr);
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(JacCarCheckFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCarCheckFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Bundle getA() {
                Bundle arguments = this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + this + " has null arguments");
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCarCheckFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<JacCarCheckViewModel>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCarCheckFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.jac.repo.viewmodel.JacCarCheckViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JacCarCheckViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(JacCarCheckViewModel.class), function0, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final JacCarCheckFragmentArgs h() {
        return (JacCarCheckFragmentArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JacNavigationApi i() {
        return (JacNavigationApi) this.navigationApi.getValue();
    }

    private final JacCarCheckViewModel j() {
        return (JacCarCheckViewModel) this.viewModel.getValue();
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    @Nullable
    public RainbowTitleBar initTitleBar() {
        RainbowTitleBar rainbowTitleBarInitTitleBar = super.initTitleBar();
        if (rainbowTitleBarInitTitleBar == null) {
            return null;
        }
        rainbowTitleBarInitTitleBar.setTitle(R.string.jac_car_s_title);
        rainbowTitleBarInitTitleBar.setBackgroundResource(R.color.jac_theme_black);
        RainbowTitleBarExtKt.useWhiteMode(rainbowTitleBarInitTitleBar);
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void initViewModel() {
        LiveDataExtensionKt.observeState$default(j().getCheckConditionListLiveData(), this, null, new a(), 2, null);
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void loadData() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.car_check_tv))).setText("");
        View view2 = getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.car_retry_bt))).setVisibility(8);
        View view3 = getView();
        ((LoadingView) (view3 != null ? view3.findViewById(R.id.car_check_progress_bar) : null)).startLoading();
        j().checkCondition(h().getAction());
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void onBackButtonClick() {
        requireActivity().finish();
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public int setViewId() {
        return R.layout.jac_fragment_car_check;
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public boolean showBleStatusBar() {
        return false;
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public boolean showBleStatusMaskView() {
        return false;
    }
}
