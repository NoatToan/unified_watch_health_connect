package com.huami.wallet.ui.fragment;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.common.helper.ViewExtensionKt;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.ShiftCardActivity;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.wallet.ui.fragment.ShiftCardProgressFragment;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.viewmodel.ImgViewModel;
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
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&¨\u0006,"}, d2 = {"Lcom/huami/wallet/ui/fragment/ShiftCardProgressFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", "f", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/huami/wallet/ui/fragment/ShiftCardProgressFragment$ViewHolder;", "b", "Lcom/huami/wallet/ui/fragment/ShiftCardProgressFragment$ViewHolder;", "mViewHolder", "Landroid/animation/ValueAnimator;", "c", "Landroid/animation/ValueAnimator;", "mProgressAnimator", "", "J", "mProgressDuration", "Lcom/huami/wallet/ui/resource/IWalletRes;", "e", "Lcom/huami/wallet/ui/resource/IWalletRes;", "iWalletRes", "", "Z", "isShiftIn", "Lcom/huami/wallet/ui/viewmodel/ImgViewModel;", "g", "Lkotlin/Lazy;", "()Lcom/huami/wallet/ui/viewmodel/ImgViewModel;", "viewModel", "<init>", "()V", "Companion", "ViewHolder", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftCardProgressFragment extends BaseFragment {
    public static final long SHIFT_IN_TIME = 100;
    public static final long SHIFT_OUT_TIME = 30;

    @NotNull
    public static final String TAG = "Wallet-ShiftCardProgressFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ViewHolder mViewHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mProgressAnimator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long mProgressDuration = TimeUnit.SECONDS.toMillis(100);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IWalletRes iWalletRes = KoinModuleKt.deviceRes();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isShiftIn = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huami/wallet/ui/fragment/ShiftCardProgressFragment$ViewHolder;", "", "Landroid/widget/ProgressBar;", "a", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "getShiftInIV", "()Landroid/widget/ImageView;", "shiftInIV", "c", "getShiftInOut", "shiftInOut", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "isShiftIn", "<init>", "(Landroid/view/View;Z)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ProgressBar progressBar;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final ImageView shiftInIV;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final ImageView shiftInOut;

        public ViewHolder(@NotNull View view, boolean z) {
            this.progressBar = (ProgressBar) view.findViewById(R.id.wl_shift_progress_bar);
            this.shiftInIV = z ? (ImageView) view.findViewById(R.id.wl_shift_in_iv) : null;
            this.shiftInOut = z ? null : (ImageView) view.findViewById(R.id.wl_shift_out_iv);
        }

        @NotNull
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        @Nullable
        public final ImageView getShiftInIV() {
            return this.shiftInIV;
        }

        @Nullable
        public final ImageView getShiftInOut() {
            return this.shiftInOut;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            ImageView shiftInOut;
            ImageView shiftInIV;
            if (ShiftCardProgressFragment.this.isShiftIn) {
                ViewHolder viewHolder = ShiftCardProgressFragment.this.mViewHolder;
                if (viewHolder == null || (shiftInIV = viewHolder.getShiftInIV()) == null) {
                    return;
                }
                ViewExtensionKt.loadImage$default(shiftInIV, resource.data, 0, 2, null);
                return;
            }
            ViewHolder viewHolder2 = ShiftCardProgressFragment.this.mViewHolder;
            if (viewHolder2 == null || (shiftInOut = viewHolder2.getShiftInOut()) == null) {
                return;
            }
            ViewExtensionKt.loadImage$default(shiftInOut, resource.data, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShiftCardProgressFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.ShiftCardProgressFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ImgViewModel>() { // from class: com.huami.wallet.ui.fragment.ShiftCardProgressFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ImgViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ImgViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ImgViewModel.class), function0, objArr);
            }
        });
    }

    private final void d() {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mProgressAnimator.cancel();
    }

    private final ImgViewModel e() {
        return (ImgViewModel) this.viewModel.getValue();
    }

    private final void f() {
        final ProgressBar progressBar = this.mViewHolder.getProgressBar();
        d();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (progressBar.getMax() * 0.9f));
        valueAnimatorOfInt.setDuration(this.mProgressDuration);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jt6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShiftCardProgressFragment.g(progressBar, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.mProgressAnimator = valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ProgressBar progressBar, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
    }

    private final void initViewModel() {
        if (this.isShiftIn) {
            e().getBusImageUrl(this.iWalletRes.getShiftInProgressResP0());
        } else {
            e().getBusImageUrl(this.iWalletRes.getOpenBusCardInProgressResP0());
        }
        LiveDataExtensionKt.observeResourceWithNotNull(e().getBusImageUrlLiveData(), this, new a());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        boolean zBooleanValue = (arguments == null ? null : Boolean.valueOf(arguments.getBoolean(ShiftCardActivity.EXTRA_IS_SHIFT_IN, true))).booleanValue();
        this.isShiftIn = zBooleanValue;
        if (zBooleanValue) {
            this.mProgressDuration = TimeUnit.SECONDS.toMillis(100L);
            return inflater.inflate(R.layout.wl_fragment_shift_in_card_in_progress, container, false);
        }
        this.mProgressDuration = TimeUnit.SECONDS.toMillis(30L);
        return inflater.inflate(R.layout.wl_fragment_shift_out_card_in_progress, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new ViewHolder(view, this.isShiftIn);
        f();
        initViewModel();
    }
}
