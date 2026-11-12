package com.xiaomi.fitness.training_plan.report;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.baseui.widget.ZoomOutPageTransformer;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.eki;
import defpackage.jvi;
import defpackage.yup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/DefaultTrainPlanReportShareFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "Lyup;", "", "setUpBasicUi", "()V", "initTabLayoutAndCarouselIndicatorHolder", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "", "bitmapUriStr", "Ljava/lang/String;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "DefaultShareTabLayoutHolder", "DefaultSwitchFragmentStateAdapter", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DefaultTrainPlanReportShareFragment extends BaseBindingFragment<TrainPlanReportShareViewModel, yup> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DefaultTrainPlanReportShareFragment";

    @NotNull
    private String bitmapUriStr = "";
    private CarouselIndicator carouselIndicator;
    private ViewPager2 viewPager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/DefaultTrainPlanReportShareFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/training_plan/report/DefaultTrainPlanReportShareFragment;", "longPicBitmapUriStr", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultTrainPlanReportShareFragment newInstance(@NotNull String longPicBitmapUriStr) {
            Intrinsics.checkNotNullParameter(longPicBitmapUriStr, "longPicBitmapUriStr");
            DefaultTrainPlanReportShareFragment defaultTrainPlanReportShareFragment = new DefaultTrainPlanReportShareFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TrainPlanReportShareActivityKt.BUNDLE_PARAM_URI, longPicBitmapUriStr);
            defaultTrainPlanReportShareFragment.setArguments(bundle);
            return defaultTrainPlanReportShareFragment;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/DefaultTrainPlanReportShareFragment$DefaultShareTabLayoutHolder;", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "bitmapUriStr", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;Landroidx/viewpager2/widget/ViewPager2;Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;Ljava/lang/String;)V", "initHolder", "", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultShareTabLayoutHolder {

        @NotNull
        public static final String TAG = "DefaultShareTabLayoutHolder";

        @Nullable
        private final String bitmapUriStr;

        @NotNull
        private final CarouselIndicator carouselIndicator;

        @NotNull
        private final FragmentActivity fragmentActivity;

        @NotNull
        private final ViewPager2 viewPager;

        public DefaultShareTabLayoutHolder(@NotNull FragmentActivity fragmentActivity, @NotNull ViewPager2 viewPager, @NotNull CarouselIndicator carouselIndicator, @Nullable String str) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            Intrinsics.checkNotNullParameter(carouselIndicator, "carouselIndicator");
            this.fragmentActivity = fragmentActivity;
            this.viewPager = viewPager;
            this.carouselIndicator = carouselIndicator;
            this.bitmapUriStr = str;
        }

        public final void initHolder() {
            this.viewPager.setAdapter(new DefaultSwitchFragmentStateAdapter(this.fragmentActivity, this.bitmapUriStr));
            this.viewPager.setTag(CustomerTrainPlanReportShareFragment.TAG_DEFAULT_SHARE_VIEW_PAGER);
            this.viewPager.setUserInputEnabled(true);
            this.viewPager.k(0, false);
            this.viewPager.setOffscreenPageLimit(1);
            this.viewPager.setClipChildren(false);
            this.viewPager.setPageTransformer(new ZoomOutPageTransformer());
            this.viewPager.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.training_plan.report.DefaultTrainPlanReportShareFragment$DefaultShareTabLayoutHolder$initHolder$1
                @Override // androidx.viewpager2.widget.ViewPager2.i
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                    this.this$0.carouselIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.i
                public void onPageSelected(int position) {
                    super.onPageSelected(position);
                    Logger.i("DefaultShareTabLayoutHolder", "registerOnPageChangeCallback position=" + position);
                }
            });
            this.carouselIndicator.setColor(eki.e, eki.f);
            this.carouselIndicator.initIndicatorCount(1);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/DefaultTrainPlanReportShareFragment$DefaultSwitchFragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "bitmapUriStr", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)V", "getItemCount", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultSwitchFragmentStateAdapter extends FragmentStateAdapter {

        @Nullable
        private final String bitmapUriStr;

        @NotNull
        private final FragmentActivity fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultSwitchFragmentStateAdapter(@NotNull FragmentActivity fragment, @Nullable String str) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
            this.bitmapUriStr = str;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int position) {
            return position == 0 ? DefaultShareWholeReportFragment.INSTANCE.newInstance(this.bitmapUriStr) : DefaultShareWholeReportFragment.INSTANCE.newInstance(this.bitmapUriStr);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return 1;
        }
    }

    private final void initTabLayoutAndCarouselIndicatorHolder() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ViewPager2 viewPager2 = this.viewPager;
        CarouselIndicator carouselIndicator = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        CarouselIndicator carouselIndicator2 = this.carouselIndicator;
        if (carouselIndicator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("carouselIndicator");
        } else {
            carouselIndicator = carouselIndicator2;
        }
        new DefaultShareTabLayoutHolder(fragmentActivityRequireActivity, viewPager2, carouselIndicator, this.bitmapUriStr).initHolder();
    }

    private final void setUpBasicUi() {
        setActionBarDisplayable(false);
        this.viewPager = getMBinding().B;
        this.carouselIndicator = getMBinding().A;
        Bundle arguments = getArguments();
        this.bitmapUriStr = String.valueOf(arguments != null ? arguments.getString(TrainPlanReportShareActivityKt.BUNDLE_PARAM_URI, "") : null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.b0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setUpBasicUi();
        initTabLayoutAndCarouselIndicatorHolder();
    }
}
