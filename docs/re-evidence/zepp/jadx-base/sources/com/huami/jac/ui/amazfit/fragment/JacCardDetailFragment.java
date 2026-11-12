package com.huami.jac.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.p010navigation.NavArgsLazy;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.jac.repo.config.JacConfig;
import com.huami.jac.repo.event.JacEventApi;
import com.huami.jac.repo.viewapi.JacLoadingWidgetApi;
import com.huami.jac.repo.viewmodel.BaseViewModelKt;
import com.huami.jac.repo.viewmodel.JacCarViewModel;
import com.huami.jac.ui.amazfit.R;
import com.huami.jac.ui.amazfit.fragment.JacCardDetailFragment;
import com.huami.jac.ui.amazfit.navigation.JacArgs;
import com.huami.jac.ui.amazfit.navigation.JacNavigationApi;
import com.huami.jac.ui.amazfit.utils.JacTipsKt;
import com.huami.jac.ui.amazfit.view.CarItemView;
import com.huami.jac.ui.amazfit.view.JacLoadingWidgetImpl;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/jac/ui/amazfit/fragment/JacCardDetailFragment;", "Lcom/huami/jac/ui/amazfit/fragment/JacBaseFragment;", "", "result", "", "v", "w", "", "setViewId", "initViewModel", "initView", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "Lcom/huami/jac/repo/event/JacEventApi;", "e", "Lkotlin/Lazy;", "o", "()Lcom/huami/jac/repo/event/JacEventApi;", "jacEventApi", "Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "f", DTransferConstants.SEARCH_KEY, "()Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "navigationApi", "Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "g", GoogleApiAvailabilityLight.b, "()Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "jacCarViewModel", "Lcom/huami/jac/ui/amazfit/fragment/JacCardDetailFragmentArgs;", "h", "Landroidx/navigation/NavArgsLazy;", "m", "()Lcom/huami/jac/ui/amazfit/fragment/JacCardDetailFragmentArgs;", "args", "Lcom/huami/jac/repo/viewapi/JacLoadingWidgetApi;", "i", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/jac/repo/viewapi/JacLoadingWidgetApi;", "loadingView", "<init>", "()V", "Companion", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacCardDetailFragment extends JacBaseFragment {
    public static final long DELAY_TIME = 1500;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy jacEventApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy jacCarViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final NavArgsLazy args;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingView;

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
            JacCardDetailFragment.this.p().dismiss();
            JacNavigationApi.DefaultImpls.toJacAppCardManager$default(JacCardDetailFragment.this.q(), JacCardDetailFragment.this.requireContext(), false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<State<? extends Unit>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull State<Unit> state) {
            JacCardDetailFragment.this.requireActivity().finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends Unit> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<State<? extends Boolean>, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull State<Boolean> state) {
            JacCardDetailFragment.this.v(Intrinsics.areEqual((Boolean) ((Success) state).getValue(), Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends Boolean> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<State<? extends Boolean>, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull State<Boolean> state) {
            JacCardDetailFragment.this.v(Intrinsics.areEqual((Boolean) ((Success) state).getValue(), Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends Boolean> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/jac/ui/amazfit/view/JacLoadingWidgetImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<JacLoadingWidgetImpl> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JacLoadingWidgetImpl getA() {
            return new JacLoadingWidgetImpl(JacCardDetailFragment.this.requireContext(), false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JacCardDetailFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.jacEventApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JacEventApi>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardDetailFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.jac.repo.event.JacEventApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JacEventApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JacEventApi.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JacNavigationApi>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardDetailFragment$special$$inlined$inject$default$2
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JacNavigationApi.class), objArr2, objArr3);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardDetailFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.jacCarViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<JacCarViewModel>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardDetailFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.jac.repo.viewmodel.JacCarViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final JacCarViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(JacCarViewModel.class), function0, objArr5);
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(JacCardDetailFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardDetailFragment$special$$inlined$navArgs$1
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
        this.loadingView = LazyKt__LazyJVMKt.lazy(new e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final JacCardDetailFragmentArgs m() {
        return (JacCardDetailFragmentArgs) this.args.getValue();
    }

    private final JacCarViewModel n() {
        return (JacCarViewModel) this.jacCarViewModel.getValue();
    }

    private final JacEventApi o() {
        return (JacEventApi) this.jacEventApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JacLoadingWidgetApi p() {
        return (JacLoadingWidgetApi) this.loadingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JacNavigationApi q() {
        return (JacNavigationApi) this.navigationApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(JacCardDetailFragment jacCardDetailFragment, View view) {
        jacCardDetailFragment.o().detailToFaq();
        JacConfig jacConfig = JacConfig.INSTANCE;
        jacConfig.getGoToWeb().invoke(jacCardDetailFragment.requireActivity(), jacConfig.getQaUrl().getA(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(JacCardDetailFragment jacCardDetailFragment, View view) {
        jacCardDetailFragment.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(JacCardDetailFragment jacCardDetailFragment, View view) {
        JacTipsKt.showGoToJacDialog(jacCardDetailFragment.requireContext(), jacCardDetailFragment.getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(JacCardDetailFragment jacCardDetailFragment, View view) {
        jacCardDetailFragment.n().setDefaultCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(boolean result) {
        if (result) {
            View view = getView();
            ((TextView) (view == null ? null : view.findViewById(R.id.carStatus))).setVisibility(0);
            View view2 = getView();
            ((CarItemView) (view2 != null ? view2.findViewById(R.id.keyDefault) : null)).setVisibility(8);
            return;
        }
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.carStatus))).setVisibility(8);
        View view4 = getView();
        ((CarItemView) (view4 != null ? view4.findViewById(R.id.keyDefault) : null)).setVisibility(0);
    }

    private final void w() {
        new AlertDialogFragment.Builder(getContext()).setCancelable(true).setMessage(R.string.jac_car_s_delete_tips).setPositiveButton(R.string.jac_car_s_delete_sure, new DialogInterface.OnClickListener() { // from class: uh4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                JacCardDetailFragment.x(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.jac_car_s_cancel, (DialogInterface.OnClickListener) null).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(JacCardDetailFragment jacCardDetailFragment, DialogInterface dialogInterface, int i) {
        jacCardDetailFragment.o().detailToDelete();
        JacCarViewModel jacCarViewModelN = jacCardDetailFragment.n();
        JacArgs jacArgs = JacArgs.INSTANCE;
        jacCarViewModelN.deleteCard(jacArgs.getWatchId(), jacArgs.getVin());
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
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void initView() {
        View view = getView();
        ((CarItemView) (view == null ? null : view.findViewById(R.id.keyHelp))).setOnClickListener(new View.OnClickListener() { // from class: xh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JacCardDetailFragment.r(this.a, view2);
            }
        });
        View view2 = getView();
        ((CarItemView) (view2 == null ? null : view2.findViewById(R.id.keyDelete))).setOnClickListener(new View.OnClickListener() { // from class: yh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                JacCardDetailFragment.s(this.a, view3);
            }
        });
        View view3 = getView();
        ((CarItemView) (view3 == null ? null : view3.findViewById(R.id.keyAdd))).setOnClickListener(new View.OnClickListener() { // from class: vh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                JacCardDetailFragment.t(this.a, view4);
            }
        });
        View view4 = getView();
        ((CarItemView) (view4 != null ? view4.findViewById(R.id.keyDefault) : null)).setOnClickListener(new View.OnClickListener() { // from class: wh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                JacCardDetailFragment.u(this.a, view5);
            }
        });
        if (m().getBackToJac()) {
            p().showLoading(getString(R.string.jac_car_s_to_jac_loading));
            n().delayed(1500L, new a());
        }
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void initViewModel() {
        BaseViewModelKt.observeOnSuccessJac(n().getDeleteCardLiveData(), this, p(), getString(R.string.jac_car_s_delete_loading), new b());
        BaseViewModelKt.observeOnSuccessJac$default(n().isDefaultCardLiveData(), this, null, null, new c(), 4, null);
        BaseViewModelKt.observeOnSuccessJac(n().getSetDefaultCardLiveData(), this, p(), getString(R.string.jac_car_default_card_loading), new d());
        n().isDefaultCard();
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public int setViewId() {
        return R.layout.jac_fragment_car_detial;
    }
}
