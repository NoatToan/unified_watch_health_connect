package com.huami.wallet.ui.fragment;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import cn.bingoogolapple.bgabanner.BGABanner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.common.helper.ViewExtensionKt;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.wallet.ui.entity.IntroPagerData;
import com.huami.wallet.ui.fragment.OpenBusCardInProgressFragment;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.wallet.ui.viewmodel.OpenBusCardViewModel;
import java.util.ArrayList;
import java.util.List;
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
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001d\u0010)\u001a\u00020%8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/huami/wallet/ui/fragment/OpenBusCardInProgressFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", "i", hl.k, "g", "e", "Landroid/graphics/drawable/Drawable;", "drawable", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/huami/wallet/ui/fragment/OpenBusCardInProgressFragment$ViewHolder;", "b", "Lcom/huami/wallet/ui/fragment/OpenBusCardInProgressFragment$ViewHolder;", "mViewHolder", "Landroid/animation/ValueAnimator;", "c", "Landroid/animation/ValueAnimator;", "mProgressAnimator", "", GoogleApiAvailabilityLight.a, "J", "mProgressDuration", "Lcom/huami/wallet/ui/resource/IWalletRes;", "Lcom/huami/wallet/ui/resource/IWalletRes;", "iWalletRes", "Lcom/huami/wallet/ui/viewmodel/OpenBusCardViewModel;", "Lkotlin/Lazy;", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/OpenBusCardViewModel;", "viewModel", "<init>", "()V", "Companion", "ViewHolder", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class OpenBusCardInProgressFragment extends BaseFragment {
    public static final int IMAGE_SIZE = 3;

    @NotNull
    public static final String TAG = "Wallet-OpenBusCardInProgress";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ViewHolder mViewHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mProgressAnimator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long mProgressDuration = TimeUnit.SECONDS.toMillis(100);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IWalletRes iWalletRes = KoinModuleKt.deviceRes();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/wallet/ui/fragment/OpenBusCardInProgressFragment$ViewHolder;", "", "Lcn/bingoogolapple/bgabanner/BGABanner;", "a", "Lcn/bingoogolapple/bgabanner/BGABanner;", "getViewPager", "()Lcn/bingoogolapple/bgabanner/BGABanner;", "viewPager", "Landroid/widget/ProgressBar;", "b", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final BGABanner viewPager;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ProgressBar progressBar;

        public ViewHolder(@NotNull View view) {
            this.viewPager = (BGABanner) view.findViewById(R.id.banner_guide_content);
            this.progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
        }

        @NotNull
        public final ProgressBar getProgressBar() {
            return this.progressBar;
        }

        @NotNull
        public final BGABanner getViewPager() {
            return this.viewPager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n"}, d2 = {"", "", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<List<String>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<String> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> list) {
            OpenBusCardInProgressFragment.this.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenBusCardInProgressFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.OpenBusCardInProgressFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<OpenBusCardViewModel>() { // from class: com.huami.wallet.ui.fragment.OpenBusCardInProgressFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.OpenBusCardViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final OpenBusCardViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(OpenBusCardViewModel.class), function0, objArr);
            }
        });
    }

    private final void e() {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mProgressAnimator.cancel();
    }

    private final Drawable f(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            int i = 0;
            if (numberOfLayers > 0) {
                while (true) {
                    int i2 = i + 1;
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof ScaleDrawable) {
                        drawable2.setLevel(1);
                    }
                    if (i2 >= numberOfLayers) {
                        break;
                    }
                    i = i2;
                }
            }
        } else if (drawable instanceof ScaleDrawable) {
            ((ScaleDrawable) drawable).setLevel(1);
        }
        return drawable;
    }

    private final void g() {
        final ProgressBar progressBar = this.mViewHolder.getProgressBar();
        e();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (progressBar.getMax() * 0.9f));
        valueAnimatorOfInt.setDuration(this.mProgressDuration);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cl5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OpenBusCardInProgressFragment.h(progressBar, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.mProgressAnimator = valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ProgressBar progressBar, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
    }

    private final void i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntroPagerData("", getString(this.iWalletRes.getOpenBusCardInProgressResDescribe())));
        arrayList.add(new IntroPagerData("", getString(R.string.wl_open_bus_card_intro1)));
        arrayList.add(new IntroPagerData("", getString(R.string.wl_open_bus_card_intro2)));
        ArrayList arrayList2 = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList2.add(View.inflate(getContext(), R.layout.wl_item_open_bus_card_intro_progress, null));
        }
        this.mViewHolder.getViewPager().setAdapter(new BGABanner.Adapter() { // from class: dl5
            @Override // cn.bingoogolapple.bgabanner.BGABanner.Adapter
            public final void fillBannerItem(BGABanner bGABanner, View view, Object obj, int i2) {
                OpenBusCardInProgressFragment.j(bGABanner, view, (IntroPagerData) obj, i2);
            }
        });
        this.mViewHolder.getViewPager().setData(arrayList2, arrayList, (List<String>) null);
    }

    private final void initViewModel() {
        LiveDataExtensionKt.observeWithNotNull(getViewModel().imageUrlList, this, new a());
        getViewModel().getBusImageUrl(this.iWalletRes.getOpenBusCardInProgressResP0(), this.iWalletRes.getOpenBusCardInProgressResP1(), this.iWalletRes.getOpenBusCardInProgressResP2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BGABanner bGABanner, View view, IntroPagerData introPagerData, int i) {
        if (introPagerData == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.intro_image);
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById2 = view.findViewById(R.id.wl_bus_intro_text);
        Objects.requireNonNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ViewExtensionKt.loadImage$default((ImageView) viewFindViewById, introPagerData.introImageUrl, 0, 2, null);
        ((TextView) viewFindViewById2).setText(introPagerData.introText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        List<String> value = getViewModel().imageUrlList.getValue();
        if (value == null || value.size() != 3) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntroPagerData(value.get(0), getString(this.iWalletRes.getOpenBusCardInProgressResDescribe())));
        arrayList.add(new IntroPagerData(value.get(1), getString(R.string.wl_open_bus_card_intro1)));
        arrayList.add(new IntroPagerData(value.get(2), getString(R.string.wl_open_bus_card_intro2)));
        ArrayList arrayList2 = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList2.add(View.inflate(getContext(), R.layout.wl_item_open_bus_card_intro_progress, null));
        }
        this.mViewHolder.getViewPager().setData(arrayList2, arrayList, (List<String>) null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final OpenBusCardViewModel getViewModel() {
        return (OpenBusCardViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_open_bus_card_in_progress, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new ViewHolder(view);
        i();
        g();
        initViewModel();
    }
}
