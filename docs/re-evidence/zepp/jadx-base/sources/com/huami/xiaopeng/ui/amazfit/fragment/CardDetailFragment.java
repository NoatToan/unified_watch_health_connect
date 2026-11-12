package com.huami.xiaopeng.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.p010navigation.NavArgsLazy;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.xiaopeng.repo.ActionToXpApp;
import com.huami.xiaopeng.repo.config.XpConfig;
import com.huami.xiaopeng.repo.event.XpEventApi;
import com.huami.xiaopeng.repo.viewapi.XpLoadingWidgetApi;
import com.huami.xiaopeng.repo.viewmodel.BaseViewModelKt;
import com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.databinding.FragmentCarDetialBinding;
import com.huami.xiaopeng.ui.amazfit.fragment.CardDetailFragment;
import com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi;
import com.huami.xiaopeng.ui.amazfit.utils.XpTipsKt;
import com.huami.xiaopeng.ui.amazfit.view.XpLoadingWidgetImpl;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
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
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/fragment/CardDetailFragment;", "Lcom/huami/xiaopeng/ui/amazfit/fragment/XpBaseFragment;", "", "result", "", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "setViewId", "initViewModel", "initView", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "Lcom/huami/xiaopeng/repo/event/XpEventApi;", "e", "Lkotlin/Lazy;", "t", "()Lcom/huami/xiaopeng/repo/event/XpEventApi;", "xpEventApi", "Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "f", "r", "()Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "navigationApi", "Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "g", SOAP.XMLNS, "()Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "xiaopengCarViewModel", "Lcom/huami/xiaopeng/ui/amazfit/fragment/CardDetailFragmentArgs;", "h", "Landroidx/navigation/NavArgsLazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/xiaopeng/ui/amazfit/fragment/CardDetailFragmentArgs;", "args", "Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "i", DTransferConstants.SEARCH_KEY, "()Lcom/huami/xiaopeng/repo/viewapi/XpLoadingWidgetApi;", "loadingView", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarDetialBinding;", z.j, "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCarDetialBinding;", "binding", "<init>", "()V", "Companion", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CardDetailFragment extends XpBaseFragment {
    public static final long DELAY_TIME = 1500;

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
    private final NavArgsLazy args;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private FragmentCarDetialBinding binding;

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
            CardDetailFragment.this.q().dismiss();
            XpNavigationApi.DefaultImpls.toXpAppCardManager$default(CardDetailFragment.this.r(), CardDetailFragment.this.requireContext(), false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<State<? extends Unit>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull State<Unit> state) {
            CardDetailFragment.this.requireActivity().finish();
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
            CardDetailFragment.this.z(Intrinsics.areEqual((Boolean) ((Success) state).getValue(), Boolean.TRUE));
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
            CardDetailFragment.this.z(Intrinsics.areEqual((Boolean) ((Success) state).getValue(), Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State<? extends Boolean> state) {
            a(state);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/view/XpLoadingWidgetImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<XpLoadingWidgetImpl> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final XpLoadingWidgetImpl getA() {
            return new XpLoadingWidgetImpl(CardDetailFragment.this.requireContext(), false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardDetailFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.xpEventApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XpEventApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardDetailFragment$special$$inlined$inject$default$1
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
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XpNavigationApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardDetailFragment$special$$inlined$inject$default$2
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
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardDetailFragment$special$$inlined$sharedViewModel$default$1
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
        this.xiaopengCarViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<XiaopengCarViewModel>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardDetailFragment$special$$inlined$sharedViewModel$default$2
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
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(CardDetailFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardDetailFragment$special$$inlined$navArgs$1
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

    private final void A() {
        new AlertDialogFragment.Builder(getContext()).setCancelable(true).setMessage(R.string.car_s_delete_tips).setPositiveButton(R.string.car_s_delete_sure, new DialogInterface.OnClickListener() { // from class: qk0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CardDetailFragment.B(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.car_s_cancel, (DialogInterface.OnClickListener) null).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(CardDetailFragment cardDetailFragment, DialogInterface dialogInterface, int i) {
        cardDetailFragment.t().detailToDelete();
        cardDetailFragment.s().deleteCard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CardDetailFragmentArgs p() {
        return (CardDetailFragmentArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XpLoadingWidgetApi q() {
        return (XpLoadingWidgetApi) this.loadingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XpNavigationApi r() {
        return (XpNavigationApi) this.navigationApi.getValue();
    }

    private final XiaopengCarViewModel s() {
        return (XiaopengCarViewModel) this.xiaopengCarViewModel.getValue();
    }

    private final XpEventApi t() {
        return (XpEventApi) this.xpEventApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(CardDetailFragment cardDetailFragment, View view) {
        cardDetailFragment.t().detailToFaq();
        XpConfig xpConfig = XpConfig.INSTANCE;
        xpConfig.getGoToWeb().invoke(cardDetailFragment.requireActivity(), xpConfig.getQaUrl().getA(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CardDetailFragment cardDetailFragment, View view) {
        cardDetailFragment.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(CardDetailFragment cardDetailFragment, View view) {
        if (!XpTipsKt.isXpInstalled(cardDetailFragment.requireContext())) {
            XpTipsKt.showNotInstallXpDialog(cardDetailFragment.requireContext(), cardDetailFragment.getChildFragmentManager());
        } else {
            cardDetailFragment.t().detailToAdd();
            cardDetailFragment.r().toXpApp(cardDetailFragment.requireContext(), ActionToXpApp.KeyCard.getAction());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(CardDetailFragment cardDetailFragment, View view) {
        cardDetailFragment.t().detailToQuery();
        cardDetailFragment.r().toXpAppKeyList(cardDetailFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(CardDetailFragment cardDetailFragment, View view) {
        cardDetailFragment.s().setDefaultCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean result) {
        if (result) {
            FragmentCarDetialBinding fragmentCarDetialBinding = this.binding;
            Objects.requireNonNull(fragmentCarDetialBinding);
            fragmentCarDetialBinding.carStatus.setVisibility(0);
            FragmentCarDetialBinding fragmentCarDetialBinding2 = this.binding;
            Objects.requireNonNull(fragmentCarDetialBinding2);
            fragmentCarDetialBinding2.keyDefault.setVisibility(8);
            return;
        }
        FragmentCarDetialBinding fragmentCarDetialBinding3 = this.binding;
        Objects.requireNonNull(fragmentCarDetialBinding3);
        fragmentCarDetialBinding3.carStatus.setVisibility(8);
        FragmentCarDetialBinding fragmentCarDetialBinding4 = this.binding;
        Objects.requireNonNull(fragmentCarDetialBinding4);
        fragmentCarDetialBinding4.keyDefault.setVisibility(0);
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
        FragmentCarDetialBinding fragmentCarDetialBindingBind = FragmentCarDetialBinding.bind(findBindingView());
        this.binding = fragmentCarDetialBindingBind;
        Objects.requireNonNull(fragmentCarDetialBindingBind);
        fragmentCarDetialBindingBind.keyHelp.setOnClickListener(new View.OnClickListener() { // from class: vk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardDetailFragment.u(this.a, view);
            }
        });
        FragmentCarDetialBinding fragmentCarDetialBinding = this.binding;
        Objects.requireNonNull(fragmentCarDetialBinding);
        fragmentCarDetialBinding.keyDelete.setOnClickListener(new View.OnClickListener() { // from class: rk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardDetailFragment.v(this.a, view);
            }
        });
        FragmentCarDetialBinding fragmentCarDetialBinding2 = this.binding;
        Objects.requireNonNull(fragmentCarDetialBinding2);
        fragmentCarDetialBinding2.keyAdd.setOnClickListener(new View.OnClickListener() { // from class: tk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardDetailFragment.w(this.a, view);
            }
        });
        FragmentCarDetialBinding fragmentCarDetialBinding3 = this.binding;
        Objects.requireNonNull(fragmentCarDetialBinding3);
        fragmentCarDetialBinding3.openedKeys.setOnClickListener(new View.OnClickListener() { // from class: sk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardDetailFragment.x(this.a, view);
            }
        });
        FragmentCarDetialBinding fragmentCarDetialBinding4 = this.binding;
        Objects.requireNonNull(fragmentCarDetialBinding4);
        fragmentCarDetialBinding4.keyDefault.setOnClickListener(new View.OnClickListener() { // from class: uk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardDetailFragment.y(this.a, view);
            }
        });
        if (p().getBackToXp()) {
            q().showLoading(getString(R.string.car_s_to_xpp_loading));
            s().delayed(1500L, new a());
        }
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initViewModel() {
        BaseViewModelKt.observeOnSuccessXp(s().getDeleteCardLiveData(), this, q(), getString(R.string.car_s_delete_loading), new b());
        BaseViewModelKt.observeOnSuccessXp$default(s().isDefaultCardLiveData(), this, null, null, new c(), 4, null);
        BaseViewModelKt.observeOnSuccessXp(s().getSetDefaultCardLiveData(), this, q(), getString(R.string.car_default_card_loading), new d());
        s().isDefaultCard();
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public int setViewId() {
        return R.layout.fragment_car_detial;
    }
}
