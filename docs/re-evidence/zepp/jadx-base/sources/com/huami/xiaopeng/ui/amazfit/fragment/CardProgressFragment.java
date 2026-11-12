package com.huami.xiaopeng.ui.amazfit.fragment;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavArgsLazy;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.xiaopeng.repo.exception.XpException;
import com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.databinding.FragmentCardInProgressBinding;
import com.huami.xiaopeng.ui.amazfit.fragment.CardProgressFragment;
import com.huami.xiaopeng.ui.amazfit.navigation.XpNavigationApi;
import com.huami.xiaopeng.ui.amazfit.utils.RainbowTitleBarExtKt;
import com.loc.z;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/fragment/CardProgressFragment;", "Lcom/huami/xiaopeng/ui/amazfit/fragment/XpBaseFragment;", "", "o", hl.k, "", "setViewId", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "loadData", "initView", "initViewModel", "onDestroy", "onBackButtonClick", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "mProgressAnimator", "", "f", "J", "mProgressDuration", "Lcom/huami/xiaopeng/ui/amazfit/fragment/CardProgressFragmentArgs;", "g", "Landroidx/navigation/NavArgsLazy;", "l", "()Lcom/huami/xiaopeng/ui/amazfit/fragment/CardProgressFragmentArgs;", "args", "Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "h", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "viewModel", "Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "i", "m", "()Lcom/huami/xiaopeng/ui/amazfit/navigation/XpNavigationApi;", "navigationApi", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCardInProgressBinding;", z.j, "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentCardInProgressBinding;", "binding", "<init>", "()V", "Companion", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class CardProgressFragment extends XpBaseFragment {
    public static final long PROGRESS_DURATION_TIME = 40;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mProgressAnimator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long mProgressDuration = TimeUnit.SECONDS.toMillis(40);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(CardProgressFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardProgressFragment$special$$inlined$navArgs$1
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

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private FragmentCardInProgressBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<Unit>, Unit> {

        /* JADX INFO: renamed from: com.huami.xiaopeng.ui.amazfit.fragment.CardProgressFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0721a extends Lambda implements Function1<Success<? extends Unit>, Unit> {
            public final /* synthetic */ CardProgressFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0721a(CardProgressFragment cardProgressFragment) {
                super(1);
                this.a = cardProgressFragment;
            }

            public final void a(@NotNull Success<Unit> success) {
                FragmentCardInProgressBinding fragmentCardInProgressBinding = this.a.binding;
                Objects.requireNonNull(fragmentCardInProgressBinding);
                ProgressBar progressBar = fragmentCardInProgressBinding.carProgressBar;
                progressBar.setProgress(progressBar.getMax());
                XpNavigationApi.DefaultImpls.progressToResult$default(this.a.m(), this.a.getNavController(), true, null, null, 12, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Unit> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Unit>, Unit> {
            public final /* synthetic */ CardProgressFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CardProgressFragment cardProgressFragment) {
                super(1);
                this.a = cardProgressFragment;
            }

            public final void a(@NotNull Fail<Unit> fail) {
                String code;
                String msgForUi = null;
                if (fail.getError() instanceof XpException) {
                    msgForUi = ((XpException) fail.getError()).getMsgForUi();
                    code = ((XpException) fail.getError()).getCode();
                } else {
                    code = null;
                }
                this.a.m().progressToResult(this.a.getNavController(), false, msgForUi, code);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Unit> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Unit> stateBuilder) {
            stateBuilder.onSuccess(new C0721a(CardProgressFragment.this));
            stateBuilder.onFail(new b(CardProgressFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Unit> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardProgressFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardProgressFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XiaopengCarViewModel>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardProgressFragment$special$$inlined$viewModel$default$2
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
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(XiaopengCarViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<XpNavigationApi>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.CardProgressFragment$special$$inlined$inject$default$1
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
    }

    private final void k() {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mProgressAnimator.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CardProgressFragmentArgs l() {
        return (CardProgressFragmentArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XpNavigationApi m() {
        return (XpNavigationApi) this.navigationApi.getValue();
    }

    private final XiaopengCarViewModel n() {
        return (XiaopengCarViewModel) this.viewModel.getValue();
    }

    private final void o() {
        k();
        FragmentCardInProgressBinding fragmentCardInProgressBinding = this.binding;
        Objects.requireNonNull(fragmentCardInProgressBinding);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, fragmentCardInProgressBinding.carProgressBar.getMax());
        valueAnimatorOfInt.setDuration(this.mProgressDuration);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ll0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CardProgressFragment.p(this.a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.mProgressAnimator = valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(CardProgressFragment cardProgressFragment, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        FragmentCardInProgressBinding fragmentCardInProgressBinding = cardProgressFragment.binding;
        Objects.requireNonNull(fragmentCardInProgressBinding);
        fragmentCardInProgressBinding.carProgressBar.setProgress(iIntValue);
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
        RainbowTitleBarExtKt.hideNavigationIcon(rainbowTitleBarInitTitleBar);
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initView() {
        this.binding = FragmentCardInProgressBinding.bind(findBindingView());
        o();
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void initViewModel() {
        LiveDataExtensionKt.observeState$default(n().getIssueCardLiveData(), this, null, new a(), 2, null);
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void loadData() {
        n().issueCard(l().getAction(), l().getToken(), l().getKeyToken());
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public void onBackButtonClick() {
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        k();
        super.onDestroy();
    }

    @Override // com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment
    public int setViewId() {
        return R.layout.fragment_card_in_progress;
    }
}
