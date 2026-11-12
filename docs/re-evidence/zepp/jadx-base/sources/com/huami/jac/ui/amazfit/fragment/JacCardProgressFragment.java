package com.huami.jac.ui.amazfit.fragment;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavArgsLazy;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.jac.repo.exception.JacException;
import com.huami.jac.repo.viewmodel.JacCarViewModel;
import com.huami.jac.ui.amazfit.R;
import com.huami.jac.ui.amazfit.fragment.JacCardProgressFragment;
import com.huami.jac.ui.amazfit.navigation.JacArgs;
import com.huami.jac.ui.amazfit.navigation.JacNavigationApi;
import com.huami.jac.ui.amazfit.utils.RainbowTitleBarExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/jac/ui/amazfit/fragment/JacCardProgressFragment;", "Lcom/huami/jac/ui/amazfit/fragment/JacBaseFragment;", "", "m", "i", "", "setViewId", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "loadData", "initView", "initViewModel", "onDestroy", "onBackButtonClick", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "mProgressAnimator", "", "f", "J", "mProgressDuration", "Lcom/huami/jac/ui/amazfit/fragment/JacCardProgressFragmentArgs;", "g", "Landroidx/navigation/NavArgsLazy;", z.j, "()Lcom/huami/jac/ui/amazfit/fragment/JacCardProgressFragmentArgs;", "args", "Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "h", "Lkotlin/Lazy;", "l", "()Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "viewModel", "Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", hl.k, "()Lcom/huami/jac/ui/amazfit/navigation/JacNavigationApi;", "navigationApi", "<init>", "()V", "Companion", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public final class JacCardProgressFragment extends JacBaseFragment {
    public static final long PROGRESS_DURATION_TIME = 40;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mProgressAnimator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long mProgressDuration = TimeUnit.SECONDS.toMillis(40);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(JacCardProgressFragmentArgs.class), new Function0<Bundle>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardProgressFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Bundle invoke() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<Unit>, Unit> {

        /* JADX INFO: renamed from: com.huami.jac.ui.amazfit.fragment.JacCardProgressFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0457a extends Lambda implements Function1<Success<? extends Unit>, Unit> {
            public final /* synthetic */ JacCardProgressFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0457a(JacCardProgressFragment jacCardProgressFragment) {
                super(1);
                this.a = jacCardProgressFragment;
            }

            public final void a(@NotNull Success<Unit> success) {
                View view = this.a.getView();
                ProgressBar progressBar = (ProgressBar) (view == null ? null : view.findViewById(R.id.car_progress_bar));
                if (progressBar != null) {
                    progressBar.setProgress(progressBar.getMax());
                }
                JacNavigationApi.DefaultImpls.progressToResult$default(this.a.k(), this.a.getNavController(), true, null, null, 12, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Unit> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Unit>, Unit> {
            public final /* synthetic */ JacCardProgressFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(JacCardProgressFragment jacCardProgressFragment) {
                super(1);
                this.a = jacCardProgressFragment;
            }

            public final void a(@NotNull Fail<Unit> fail) {
                String code;
                String msgForUi = null;
                if (fail.getError() instanceof JacException) {
                    msgForUi = ((JacException) fail.getError()).getMsgForUi();
                    code = ((JacException) fail.getError()).getCode();
                } else {
                    code = null;
                }
                this.a.k().progressToResult(this.a.getNavController(), false, msgForUi, code);
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
            stateBuilder.onSuccess(new C0457a(JacCardProgressFragment.this));
            stateBuilder.onFail(new b(JacCardProgressFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Unit> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JacCardProgressFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardProgressFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<JacCarViewModel>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardProgressFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.jac.repo.viewmodel.JacCarViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final JacCarViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(JacCarViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<JacNavigationApi>() { // from class: com.huami.jac.ui.amazfit.fragment.JacCardProgressFragment$special$$inlined$inject$default$1
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
    }

    private final void i() {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mProgressAnimator.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final JacCardProgressFragmentArgs j() {
        return (JacCardProgressFragmentArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JacNavigationApi k() {
        return (JacNavigationApi) this.navigationApi.getValue();
    }

    private final JacCarViewModel l() {
        return (JacCarViewModel) this.viewModel.getValue();
    }

    private final void m() {
        i();
        int[] iArr = new int[2];
        iArr[0] = 0;
        View view = getView();
        iArr[1] = ((ProgressBar) (view == null ? null : view.findViewById(R.id.car_progress_bar))).getMax();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.setDuration(this.mProgressDuration);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ci4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                JacCardProgressFragment.n(this.a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.mProgressAnimator = valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(JacCardProgressFragment jacCardProgressFragment, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        View view = jacCardProgressFragment.getView();
        ProgressBar progressBar = (ProgressBar) (view == null ? null : view.findViewById(R.id.car_progress_bar));
        if (progressBar == null) {
            return;
        }
        progressBar.setProgress(iIntValue);
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
        RainbowTitleBarExtKt.hideNavigationIcon(rainbowTitleBarInitTitleBar);
        return rainbowTitleBarInitTitleBar;
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void initView() {
        m();
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void initViewModel() {
        LiveDataExtensionKt.observeState$default(l().getIssueCardLiveData(), this, null, new a(), 2, null);
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void loadData() {
        JacCarViewModel jacCarViewModelL = l();
        String action = j().getAction();
        String token = j().getToken();
        String keyToken = j().getKeyToken();
        JacArgs jacArgs = JacArgs.INSTANCE;
        jacCarViewModelL.issueCard(action, token, keyToken, jacArgs.getWatchId(), jacArgs.getVin());
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public void onBackButtonClick() {
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        i();
        super.onDestroy();
    }

    @Override // com.huami.jac.ui.amazfit.fragment.JacBaseFragment
    public int setViewId() {
        return R.layout.jac_fragment_card_in_progress;
    }
}
