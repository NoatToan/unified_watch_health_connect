package com.huami.xiaopeng.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavArgsLazy;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.xiaopeng.repo.exception.XpException;
import com.huami.xiaopeng.repo.viewmodel.XiaopengCarCheckViewModel;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.databinding.FragmentCarCheckBinding;
import com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi;
import com.huami.xiaopeng.ui.amazfit.utils.RainbowTitleBarExtKt;
import com.loc.z;
import java.util.Objects;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/fragment/CarCheckFragment;", "Lcom/huami/xiaopeng/ui/amazfit/fragment/XpBaseFragment;", "", "setViewId", "", "showBleStatusBar", "showBleStatusMaskView", "", "initView", "initViewModel", "onBackButtonClick", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "loadData", "Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "e", "Lkotlin/Lazy;", hl.k, "()Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "navigationApi", "Lcom/huami/xiaopeng/ui/amazfit/fragment/CarCheckFragmentArgs;", "f", "Landroidx/navigation/NavArgsLazy;", z.j, "()Lcom/huami/xiaopeng/ui/amazfit/fragment/CarCheckFragmentArgs;", "args", "Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarCheckViewModel;", "g", "l", "()Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarCheckViewModel;", "viewModel", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarCheckBinding;", "h", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarCheckBinding;", "binding", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CarCheckFragment extends XpBaseFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final NavArgsLazy args;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private FragmentCarCheckBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        /* JADX INFO: renamed from: com.huami.xiaopeng.ui.amazfit.fragment.CarCheckFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0720a extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ CarCheckFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0720a(CarCheckFragment carCheckFragment) {
                super(1);
                this.a = carCheckFragment;
            }

            public final void a(@NotNull Success<Boolean> success) {
                FragmentCarCheckBinding fragmentCarCheckBinding = this.a.binding;
                Objects.requireNonNull(fragmentCarCheckBinding);
                fragmentCarCheckBinding.carCheckProgressBar.stopLoading();
                this.a.k().checkToProgress(this.a.getNavController(), this.a.j().getAction(), this.a.j().getToken(), this.a.j().getKeyToken());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ CarCheckFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CarCheckFragment carCheckFragment) {
                super(1);
                this.a = carCheckFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(CarCheckFragment carCheckFragment, View view) {
                FragmentCarCheckBinding fragmentCarCheckBinding = carCheckFragment.binding;
                Objects.requireNonNull(fragmentCarCheckBinding);
                fragmentCarCheckBinding.carCheckProgressBar.reset();
                carCheckFragment.loadData();
            }

            public final void b(@NotNull Fail<Boolean> fail) {
                if (fail.getError() instanceof XpException) {
                    FragmentCarCheckBinding fragmentCarCheckBinding = this.a.binding;
                    Objects.requireNonNull(fragmentCarCheckBinding);
                    fragmentCarCheckBinding.carCheckProgressBar.setFailed();
                    FragmentCarCheckBinding fragmentCarCheckBinding2 = this.a.binding;
                    Objects.requireNonNull(fragmentCarCheckBinding2);
                    fragmentCarCheckBinding2.carCheckTv.setText(((XpException) fail.getError()).getMsgForUi());
                } else {
                    FragmentCarCheckBinding fragmentCarCheckBinding3 = this.a.binding;
                    Objects.requireNonNull(fragmentCarCheckBinding3);
                    fragmentCarCheckBinding3.carCheckProgressBar.setFailed();
                    FragmentCarCheckBinding fragmentCarCheckBinding4 = this.a.binding;
                    Objects.requireNonNull(fragmentCarCheckBinding4);
                    fragmentCarCheckBinding4.carCheckTv.setText(fail.getError().getMessage());
                }
                FragmentCarCheckBinding fragmentCarCheckBinding5 = this.a.binding;
                Objects.requireNonNull(fragmentCarCheckBinding5);
                Button button = fragmentCarCheckBinding5.carRetryBt;
                final CarCheckFragment carCheckFragment = this.a;
                button.setOnClickListener(new View.OnClickListener() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CarCheckFragment.a.b.c(carCheckFragment, view);
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
            stateBuilder.onSuccess(new C0720a(CarCheckFragment.this));
            stateBuilder.onFail(new b(CarCheckFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CarCheckFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XpNavigationApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CarCheckFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XpNavigationApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(XpNavigationApi.class), qualifier, objArr);
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(CarCheckFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CarCheckFragment$special$$inlined$navArgs$1
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
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CarCheckFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<XiaopengCarCheckViewModel>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CarCheckFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.xiaopeng.repo.viewmodel.XiaopengCarCheckViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XiaopengCarCheckViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(XiaopengCarCheckViewModel.class), function0, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final CarCheckFragmentArgs j() {
        return (CarCheckFragmentArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XpNavigationApi k() {
        return (XpNavigationApi) this.navigationApi.getValue();
    }

    private final XiaopengCarCheckViewModel l() {
        return (XiaopengCarCheckViewModel) this.viewModel.getValue();
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    @Nullable
    public RainbowTitleBar initTitleBar() {
        RainbowTitleBar rainbowTitleBarInitTitleBar = super.initTitleBar();
        if (rainbowTitleBarInitTitleBar == null) {
            return null;
        }
        rainbowTitleBarInitTitleBar.setTitle(R.string.car_s_xiaopeng_title);
        rainbowTitleBarInitTitleBar.setBackgroundResource(R.color.xp_theme_black);
        RainbowTitleBarExtKt.useWhiteMode(rainbowTitleBarInitTitleBar);
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initView() {
        super.initView();
        this.binding = FragmentCarCheckBinding.bind(findBindingView());
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initViewModel() {
        LiveDataExtensionKt.observeState$default(l().getCheckConditionListLiveData(), this, null, new a(), 2, null);
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void loadData() {
        FragmentCarCheckBinding fragmentCarCheckBinding = this.binding;
        Objects.requireNonNull(fragmentCarCheckBinding);
        fragmentCarCheckBinding.carCheckTv.setText("");
        FragmentCarCheckBinding fragmentCarCheckBinding2 = this.binding;
        Objects.requireNonNull(fragmentCarCheckBinding2);
        fragmentCarCheckBinding2.carRetryBt.setVisibility(8);
        FragmentCarCheckBinding fragmentCarCheckBinding3 = this.binding;
        Objects.requireNonNull(fragmentCarCheckBinding3);
        fragmentCarCheckBinding3.carCheckProgressBar.startLoading();
        l().checkCondition(j().getAction());
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void onBackButtonClick() {
        requireActivity().finish();
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public int setViewId() {
        return R.layout.fragment_car_check;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public boolean showBleStatusBar() {
        return false;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public boolean showBleStatusMaskView() {
        return false;
    }
}
