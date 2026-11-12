package com.huami.jac.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.view.View;
import com.amap.api.mapcore.util.hl;
import com.huami.arch.core.State;
import com.huami.jac.repo.config.JacConfig;
import com.huami.jac.repo.event.JacEventApi;
import com.huami.jac.repo.viewapi.JacLoadingWidgetApi;
import com.huami.jac.repo.viewmodel.BaseViewModelKt;
import com.huami.jac.repo.viewmodel.JacCarViewModel;
import com.huami.jac.ui.amazfit.R;
import com.huami.jac.ui.amazfit.fragment.JacCardNoKeyFragment;
import com.huami.jac.ui.amazfit.navigation.JacNavigationApi;
import com.huami.jac.ui.amazfit.utils.JacTipsKt;
import com.huami.jac.ui.amazfit.view.CarItemView;
import com.huami.jac.ui.amazfit.view.JacLoadingWidgetImpl;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.nfc.car.entity.VCardInfo;
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
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/jac/ui/amazfit/fragment/JacCardNoKeyFragment;", "Lcom/huami/jac/ui/amazfit/fragment/JacBaseFragment;", "", "setViewId", "", "initViewModel", "initView", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "Lcom/huami/jac/repo/event/JacEventApi;", "e", "Lkotlin/Lazy;", hl.k, "()Lcom/huami/jac/repo/event/JacEventApi;", "jacEventApi", "Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "f", "m", "()Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "navigationApi", "Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "g", z.j, "()Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "jacCarViewModel", "Lcom/huami/jac/repo/viewapi/JacLoadingWidgetApi;", "h", "l", "()Lcom/huami/jac/repo/viewapi/JacLoadingWidgetApi;", "loadingView", "<init>", "()V", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacCardNoKeyFragment extends JacBaseFragment {

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
    private final Lazy loadingView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/nfc/car/entity/VCardInfo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<State<? extends VCardInfo>, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull State<VCardInfo> state) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends VCardInfo> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/jac/ui/amazfit/view/JacLoadingWidgetImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<JacLoadingWidgetImpl> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JacLoadingWidgetImpl invoke() {
            return new JacLoadingWidgetImpl(JacCardNoKeyFragment.this.requireContext(), false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JacCardNoKeyFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.jacEventApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JacEventApi>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardNoKeyFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.jac.repo.event.JacEventApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final JacEventApi invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JacEventApi.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JacNavigationApi>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardNoKeyFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.jac.ui.amazfit.navigation.JacNavigationApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final JacNavigationApi invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(JacNavigationApi.class), objArr2, objArr3);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardNoKeyFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.jacCarViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<JacCarViewModel>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardNoKeyFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.jac.repo.viewmodel.JacCarViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final JacCarViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(JacCarViewModel.class), function0, objArr5);
            }
        });
        this.loadingView = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final JacCarViewModel j() {
        return (JacCarViewModel) this.jacCarViewModel.getValue();
    }

    private final JacEventApi k() {
        return (JacEventApi) this.jacEventApi.getValue();
    }

    private final JacLoadingWidgetApi l() {
        return (JacLoadingWidgetApi) this.loadingView.getValue();
    }

    private final JacNavigationApi m() {
        return (JacNavigationApi) this.navigationApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(JacCardNoKeyFragment jacCardNoKeyFragment, View view) {
        jacCardNoKeyFragment.k().detailToFaq();
        JacConfig jacConfig = JacConfig.INSTANCE;
        jacConfig.getGoToWeb().invoke(jacCardNoKeyFragment.requireActivity(), jacConfig.getQaUrl().invoke(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(JacCardNoKeyFragment jacCardNoKeyFragment, View view) {
        JacTipsKt.showGoToJacDialog(jacCardNoKeyFragment.requireContext(), jacCardNoKeyFragment.getChildFragmentManager());
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
        ((CarItemView) (view == null ? null : view.findViewById(R.id.carHelp))).setOnClickListener(new View.OnClickListener() { // from class: ai4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JacCardNoKeyFragment.n(this.a, view2);
            }
        });
        View view2 = getView();
        ((CarItemView) (view2 != null ? view2.findViewById(R.id.createVKey) : null)).setOnClickListener(new View.OnClickListener() { // from class: bi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                JacCardNoKeyFragment.o(this.a, view3);
            }
        });
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void initViewModel() {
        BaseViewModelKt.observeOnSuccessJac$default(j().getCardListLiveData(), this, l(), null, a.a, 4, null);
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public int setViewId() {
        return R.layout.jac_fragment_car_no_key;
    }
}
