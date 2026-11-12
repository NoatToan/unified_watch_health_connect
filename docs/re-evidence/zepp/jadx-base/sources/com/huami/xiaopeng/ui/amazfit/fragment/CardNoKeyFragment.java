package com.huami.xiaopeng.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.State;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.nfc.car.entity.VCardInfo;
import com.huami.xiaopeng.repo.ActionToXpApp;
import com.huami.xiaopeng.repo.config.XpConfig;
import com.huami.xiaopeng.repo.event.XpEventApi;
import com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi;
import com.huami.xiaopeng.repo.viewmodel.BaseViewModelKt;
import com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.databinding.FragmentCarNoKeyBinding;
import com.huami.xiaopeng.ui.amazfit.fragment.CardNoKeyFragment;
import com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi;
import com.huami.xiaopeng.ui.amazfit.utils.XpTipsKt;
import com.huami.xiaopeng.ui.amazfit.view.XpLoadingWidgetImpl;
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
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/fragment/CardNoKeyFragment;", "Lcom/huami/xiaopeng/ui/amazfit/fragment/XpBaseFragment;", "", "setViewId", "", "initViewModel", "initView", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "Lcom/huami/xiaopeng/repo/event/XpEventApi;", "e", "Lkotlin/Lazy;", "o", "()Lcom/huami/xiaopeng/repo/event/XpEventApi;", "xpEventApi", "Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "f", "m", "()Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "navigationApi", "Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "g", GoogleApiAvailabilityLight.b, "()Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "xiaopengCarViewModel", "Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "h", "l", "()Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "loadingView", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarNoKeyBinding;", "i", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarNoKeyBinding;", "binding", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CardNoKeyFragment extends XpBaseFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy xpEventApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaopengCarViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private FragmentCarNoKeyBinding binding;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/view/XpLoadingWidgetImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<XpLoadingWidgetImpl> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final XpLoadingWidgetImpl getA() {
            return new XpLoadingWidgetImpl(CardNoKeyFragment.this.requireContext(), false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardNoKeyFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.xpEventApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XpEventApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardNoKeyFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.xiaopeng.repo.event.XpEventApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XpEventApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(XpEventApi.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XpNavigationApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardNoKeyFragment$special$$inlined$inject$default$2
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
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(XpNavigationApi.class), objArr2, objArr3);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardNoKeyFragment$special$$inlined$sharedViewModel$default$1
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
        this.xiaopengCarViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<XiaopengCarViewModel>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardNoKeyFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final XiaopengCarViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(XiaopengCarViewModel.class), function0, objArr5);
            }
        });
        this.loadingView = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final XpLoadingWidgetApi l() {
        return (XpLoadingWidgetApi) this.loadingView.getValue();
    }

    private final XpNavigationApi m() {
        return (XpNavigationApi) this.navigationApi.getValue();
    }

    private final XiaopengCarViewModel n() {
        return (XiaopengCarViewModel) this.xiaopengCarViewModel.getValue();
    }

    private final XpEventApi o() {
        return (XpEventApi) this.xpEventApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(CardNoKeyFragment cardNoKeyFragment, View view) {
        cardNoKeyFragment.o().detailToFaq();
        XpConfig xpConfig = XpConfig.INSTANCE;
        xpConfig.getGoToWeb().invoke(cardNoKeyFragment.requireActivity(), xpConfig.getQaUrl().getA(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(CardNoKeyFragment cardNoKeyFragment, View view) {
        if (!XpTipsKt.isXpInstalled(cardNoKeyFragment.requireContext())) {
            XpTipsKt.showNotInstallXpDialog(cardNoKeyFragment.requireContext(), cardNoKeyFragment.getChildFragmentManager());
        } else {
            cardNoKeyFragment.o().detailToCreate();
            cardNoKeyFragment.m().toXpApp(cardNoKeyFragment.requireContext(), ActionToXpApp.BigCard.getAction());
        }
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    @Nullable
    public RainbowTitleBar initTitleBar() {
        RainbowTitleBar rainbowTitleBarInitTitleBar = super.initTitleBar();
        if (rainbowTitleBarInitTitleBar == null) {
            return null;
        }
        rainbowTitleBarInitTitleBar.setTitle(R.string.car_s_xiaopeng_title);
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initView() {
        FragmentCarNoKeyBinding fragmentCarNoKeyBindingBind = FragmentCarNoKeyBinding.bind(findBindingView());
        this.binding = fragmentCarNoKeyBindingBind;
        Objects.requireNonNull(fragmentCarNoKeyBindingBind);
        fragmentCarNoKeyBindingBind.carHelp.setOnClickListener(new View.OnClickListener() { // from class: kl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardNoKeyFragment.p(this.a, view);
            }
        });
        FragmentCarNoKeyBinding fragmentCarNoKeyBinding = this.binding;
        Objects.requireNonNull(fragmentCarNoKeyBinding);
        fragmentCarNoKeyBinding.createVKey.setOnClickListener(new View.OnClickListener() { // from class: jl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardNoKeyFragment.q(this.a, view);
            }
        });
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initViewModel() {
        BaseViewModelKt.observeOnSuccessXp$default(n().getCardListLiveData(), this, l(), null, a.a, 4, null);
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public int setViewId() {
        return R.layout.fragment_car_no_key;
    }
}
