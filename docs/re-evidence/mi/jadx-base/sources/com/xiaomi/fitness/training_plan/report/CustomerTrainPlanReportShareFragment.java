package com.xiaomi.fitness.training_plan.report;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.baseui.widget.ZoomOutPageTransformer;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.report.CustomerTrainPlanReportShareFragment;
import defpackage.csi;
import defpackage.eki;
import defpackage.ioi;
import defpackage.jvi;
import defpackage.pah;
import defpackage.wup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004$%&'B\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "Lwup;", "", "setUpBasicUi", "()V", "initCustomShareTabLayoutHolder", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "getCarouselIndicator", "()Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "setCarouselIndicator", "(Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;)V", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "mCustomerSharePlanReport", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "CustomShareTabLayoutHolder", "CustomizeSharePreviewItemDecoration", "CustomizeSwitchAdapter", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CustomerTrainPlanReportShareFragment extends BaseBindingFragment<TrainPlanReportShareViewModel, wup> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CustomerTrainPlanReportShareFragment";

    @NotNull
    public static final String TAG_DEFAULT_SHARE_VIEW_PAGER = "TAG_DEFAULT_SHARE_VIEW_PAGER";
    public CarouselIndicator carouselIndicator;

    @Nullable
    private CustomerSharePlanReport mCustomerSharePlanReport;
    public ViewPager2 viewPager;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$Companion;", "", "<init>", "()V", "TAG", "", CustomerTrainPlanReportShareFragment.TAG_DEFAULT_SHARE_VIEW_PAGER, "newInstance", "Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment;", "longPicBitmapUriStr", "report", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomerTrainPlanReportShareFragment newInstance(@NotNull String longPicBitmapUriStr, @Nullable CustomerSharePlanReport report) {
            Intrinsics.checkNotNullParameter(longPicBitmapUriStr, "longPicBitmapUriStr");
            CustomerTrainPlanReportShareFragment customerTrainPlanReportShareFragment = new CustomerTrainPlanReportShareFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TrainPlanReportShareActivityKt.BUNDLE_PARAM_URI, longPicBitmapUriStr);
            bundle.putSerializable(TrainPlanReportShareActivityKt.BUNDLE_PARAM_REPORT_INFO, report);
            customerTrainPlanReportShareFragment.setArguments(bundle);
            return customerTrainPlanReportShareFragment;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomShareTabLayoutHolder;", "", "customizeViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "mViewModel", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;)V", "customizeSwitchAdapter", "Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter;", "initHolder", "", "setDataViewUserInfo", "accountCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "isCommonSport", "", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCustomerTrainPlanReportShareFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerTrainPlanReportShareFragment.kt\ncom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomShareTabLayoutHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,316:1\n81#2:317\n*S KotlinDebug\n*F\n+ 1 CustomerTrainPlanReportShareFragment.kt\ncom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomShareTabLayoutHolder\n*L\n118#1:317\n*E\n"})
    public static final class CustomShareTabLayoutHolder {

        @NotNull
        public static final String TAG = "CustomShareTabLayoutHolder";

        @NotNull
        private final CarouselIndicator carouselIndicator;

        @Nullable
        private CustomizeSwitchAdapter customizeSwitchAdapter;

        @NotNull
        private final ViewPager2 customizeViewPager;

        @NotNull
        private final LifecycleOwner lifecycleOwner;

        @NotNull
        private final TrainPlanReportShareViewModel mViewModel;

        public CustomShareTabLayoutHolder(@NotNull ViewPager2 customizeViewPager, @NotNull CarouselIndicator carouselIndicator, @NotNull LifecycleOwner lifecycleOwner, @NotNull TrainPlanReportShareViewModel mViewModel) {
            Intrinsics.checkNotNullParameter(customizeViewPager, "customizeViewPager");
            Intrinsics.checkNotNullParameter(carouselIndicator, "carouselIndicator");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
            this.customizeViewPager = customizeViewPager;
            this.carouselIndicator = carouselIndicator;
            this.lifecycleOwner = lifecycleOwner;
            this.mViewModel = mViewModel;
        }

        public final void initHolder() {
            this.carouselIndicator.setColor(eki.e, eki.f);
            this.carouselIndicator.initIndicatorCount(6);
            this.customizeViewPager.setOffscreenPageLimit(1);
            this.customizeViewPager.setClipChildren(false);
            this.customizeViewPager.setTag("customize_share_view_pager");
            this.customizeViewPager.setPageTransformer(new ZoomOutPageTransformer());
            this.customizeSwitchAdapter = new CustomizeSwitchAdapter(this.lifecycleOwner);
            final int dp = ExtUtilsKt.getDp(Float.valueOf(70.0f));
            final ViewPager2 viewPager2 = this.customizeViewPager;
            pah.a(viewPager2, new Runnable() { // from class: com.xiaomi.fitness.training_plan.report.CustomerTrainPlanReportShareFragment$CustomShareTabLayoutHolder$initHolder$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.customizeViewPager.a(new CustomerTrainPlanReportShareFragment.CustomizeSharePreviewItemDecoration(dp));
                    final int dp2 = dp + ExtUtilsKt.getDp(40);
                    this.customizeViewPager.setPageTransformer(new ViewPager2.k() { // from class: com.xiaomi.fitness.training_plan.report.CustomerTrainPlanReportShareFragment$CustomShareTabLayoutHolder$initHolder$1$pageTransformer$1
                        @Override // androidx.viewpager2.widget.ViewPager2.k
                        public final void transformPage(View page, float f) {
                            Intrinsics.checkNotNullParameter(page, "page");
                            page.setTranslationX((-dp2) * f);
                            page.setScaleY(1 - (Math.abs(f) * 0.25f));
                        }
                    });
                    ViewPager2 viewPager3 = this.customizeViewPager;
                    viewPager3.setAdapter(this.customizeSwitchAdapter);
                    final CustomerTrainPlanReportShareFragment.CustomShareTabLayoutHolder customShareTabLayoutHolder = this;
                    viewPager3.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.training_plan.report.CustomerTrainPlanReportShareFragment$CustomShareTabLayoutHolder$initHolder$1$1$1
                        @Override // androidx.viewpager2.widget.ViewPager2.i
                        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                            super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                            Logger.i("CustomShareTabLayoutHolder", "registerOnPageChangeCallback position=" + position);
                            customShareTabLayoutHolder.carouselIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
                        }

                        @Override // androidx.viewpager2.widget.ViewPager2.i
                        public void onPageSelected(int position) {
                            super.onPageSelected(position);
                            Logger.i("CustomShareTabLayoutHolder", "onPageSelected position=" + position);
                            customShareTabLayoutHolder.mViewModel.setMCustomizeSelectedTabPosition(position);
                        }
                    });
                    this.customizeViewPager.k(this.mViewModel.getMCustomizeSelectedTabPosition(), !RomUtils.INSTANCE.isHuawei());
                }
            });
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public final void setDataViewUserInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
            CustomizeSwitchAdapter customizeSwitchAdapter = this.customizeSwitchAdapter;
            if (customizeSwitchAdapter != null) {
                customizeSwitchAdapter.setUserInfo(accountCoreInfo, isCommonSport);
            }
            CustomizeSwitchAdapter customizeSwitchAdapter2 = this.customizeSwitchAdapter;
            if (customizeSwitchAdapter2 != null) {
                customizeSwitchAdapter2.notifyDataSetChanged();
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSharePreviewItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "spacing", "I", "<init>", "(I)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class CustomizeSharePreviewItemDecoration extends RecyclerView.n {
        private final int spacing;

        public CustomizeSharePreviewItemDecoration(int i) {
            this.spacing = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int i = this.spacing;
            outRect.right = i;
            outRect.left = i;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&'(B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "getItemViewType", "(I)I", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "", "isCommonSport", "", "setUserInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "", "Landroid/net/Uri;", "bgUris", "Ljava/util/List;", "accountInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "", "sportName", "Ljava/lang/String;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "RectangleViewHolder", "SquareViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class CustomizeSwitchAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

        @NotNull
        public static final String TAG = "CustomizeSwitchAdapter";
        public static final int TYPE_RECTANGLE = 0;
        public static final int TYPE_SQUARE = 1;

        @Nullable
        private AccountCoreInfo accountInfo;

        @NotNull
        private final List<Uri> bgUris;

        @NotNull
        private final LifecycleOwner lifecycleOwner;

        @NotNull
        private String sportName;

        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b-\u0010.J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001c\u001a\n \u0015*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter$RectangleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "sportName", "", "initSloganView", "(Ljava/lang/String;)V", "", "position", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountInfo", "bindData", "(ILcom/xiaomi/fitness/account/manager/AccountCoreInfo;Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "bgIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "qrCodeIv", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "qrCodeBg", "Landroidx/appcompat/widget/AppCompatImageView;", "maskIv", "Landroidx/appcompat/widget/AppCompatImageView;", "bottomAppNameTv", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView;", "basicInfoView", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView;", "Lcom/xiaomi/fitness/training_plan/report/ShareSloganView;", "shareSloganView", "Lcom/xiaomi/fitness/training_plan/report/ShareSloganView;", "Landroid/widget/FrameLayout;", "stickerParentView", "Landroid/widget/FrameLayout;", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "<init>", "(Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter;Landroid/view/View;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class RectangleViewHolder extends RecyclerView.d0 {
            private final TextView appNameTv;

            @Nullable
            private TrainPlanReportBasicInfoView basicInfoView;

            @NotNull
            private final ImageView bgIv;
            private final TextView bottomAppNameTv;

            @NotNull
            private final CardView cardView;
            private final AppCompatImageView maskIv;
            private final ImageView qrCodeBg;
            private final ImageView qrCodeIv;

            @NotNull
            private ShareSloganView shareSloganView;

            @NotNull
            private final FrameLayout stickerParentView;
            final /* synthetic */ CustomizeSwitchAdapter this$0;

            @NotNull
            private final View view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RectangleViewHolder(@NotNull CustomizeSwitchAdapter customizeSwitchAdapter, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0 = customizeSwitchAdapter;
                this.view = view;
                View viewFindViewById = view.findViewById(csi.m);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.bgIv = (ImageView) viewFindViewById;
                this.qrCodeIv = (ImageView) view.findViewById(csi.n2);
                this.appNameTv = (TextView) view.findViewById(csi.f);
                this.qrCodeBg = (ImageView) view.findViewById(csi.o2);
                this.maskIv = (AppCompatImageView) view.findViewById(csi.e1);
                this.bottomAppNameTv = (TextView) view.findViewById(csi.g);
                this.basicInfoView = (TrainPlanReportBasicInfoView) view.findViewById(csi.f14678k);
                View viewFindViewById2 = view.findViewById(csi.T2);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.shareSloganView = (ShareSloganView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(csi.n3);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                this.stickerParentView = (FrameLayout) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(csi.f14679r);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                this.cardView = (CardView) viewFindViewById4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit bindData$lambda$0(RectangleViewHolder this$0, Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView qrCodeBg = this$0.qrCodeBg;
                Intrinsics.checkNotNullExpressionValue(qrCodeBg, "qrCodeBg");
                ViewExtKt.visible(qrCodeBg);
                ImageView qrCodeIv = this$0.qrCodeIv;
                Intrinsics.checkNotNullExpressionValue(qrCodeIv, "qrCodeIv");
                ViewExtKt.visible(qrCodeIv);
                this$0.qrCodeIv.setImageBitmap(bitmap);
                return Unit.INSTANCE;
            }

            private final void initSloganView(String sportName) {
            }

            public final void bindData(int position, @Nullable AccountCoreInfo accountInfo, @NotNull String sportName) {
                Intrinsics.checkNotNullParameter(sportName, "sportName");
                ShareExtKt.loadImgWithHardwareRenderingDisabled$default(this.bgIv, (Uri) this.this$0.bgUris.get(position), 0.0f, false, 12, null);
                Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), ioi.L);
                if (resourceDrawable != null) {
                    resourceDrawable.setBounds(0, 0, 40, 40);
                }
                this.appNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
                this.bottomAppNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
                ShareExtKt.getCommonQrCodeBitmapLiveData().observe(this.this$0.lifecycleOwner, new CustomerTrainPlanReportShareFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xe5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return CustomerTrainPlanReportShareFragment.CustomizeSwitchAdapter.RectangleViewHolder.bindData$lambda$0(this.f39040a, (Bitmap) obj);
                    }
                }));
                this.maskIv.setImageResource(ioi.M);
                initSloganView(sportName);
            }

            @NotNull
            public final CardView getCardView() {
                return this.cardView;
            }

            @NotNull
            public final View getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b0\u00101J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n \u0015*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u001c\u0010\u001e\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\n \u0015*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter$SquareViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "", "position", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountInfo", "", "sportName", "", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ILcom/xiaomi/fitness/account/manager/AccountCoreInfo;Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "bgIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "qrCodeIv", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "qrCodeBg", "bottomAppNameTv", "algoDataSourceCenter", "algoDataSourceLeft", "algoDataSourceLeftTxt", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "Landroidx/appcompat/widget/AppCompatImageView;", "maskIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView;", "basicInfoView", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportBasicInfoView;", "Lcom/xiaomi/fitness/training_plan/report/ShareSloganView;", "shareSloganView", "Lcom/xiaomi/fitness/training_plan/report/ShareSloganView;", "Landroid/widget/FrameLayout;", "stickerParentView", "Landroid/widget/FrameLayout;", "<init>", "(Lcom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter;Landroid/view/View;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nCustomerTrainPlanReportShareFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerTrainPlanReportShareFragment.kt\ncom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter$SquareViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,316:1\n54#2,3:317\n24#2:320\n59#2,6:321\n*S KotlinDebug\n*F\n+ 1 CustomerTrainPlanReportShareFragment.kt\ncom/xiaomi/fitness/training_plan/report/CustomerTrainPlanReportShareFragment$CustomizeSwitchAdapter$SquareViewHolder\n*L\n256#1:317,3\n256#1:320\n256#1:321,6\n*E\n"})
        public final class SquareViewHolder extends RecyclerView.d0 {
            private final TextView algoDataSourceCenter;
            private final View algoDataSourceLeft;
            private final TextView algoDataSourceLeftTxt;
            private final TextView appNameTv;

            @Nullable
            private TrainPlanReportBasicInfoView basicInfoView;

            @NotNull
            private final ImageView bgIv;
            private final TextView bottomAppNameTv;

            @NotNull
            private final CardView cardView;
            private final AppCompatImageView maskIv;
            private final ImageView qrCodeBg;
            private final ImageView qrCodeIv;

            @NotNull
            private ShareSloganView shareSloganView;

            @NotNull
            private final FrameLayout stickerParentView;
            final /* synthetic */ CustomizeSwitchAdapter this$0;

            @NotNull
            private final View view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SquareViewHolder(@NotNull CustomizeSwitchAdapter customizeSwitchAdapter, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0 = customizeSwitchAdapter;
                this.view = view;
                View viewFindViewById = view.findViewById(csi.m);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.bgIv = (ImageView) viewFindViewById;
                this.qrCodeIv = (ImageView) view.findViewById(csi.n2);
                this.appNameTv = (TextView) view.findViewById(csi.f);
                this.qrCodeBg = (ImageView) view.findViewById(csi.o2);
                this.bottomAppNameTv = (TextView) view.findViewById(csi.g);
                this.algoDataSourceCenter = (TextView) view.findViewById(csi.Y2);
                this.algoDataSourceLeft = view.findViewById(csi.Z2);
                this.algoDataSourceLeftTxt = (TextView) view.findViewById(csi.a3);
                View viewFindViewById2 = view.findViewById(csi.f14679r);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.cardView = (CardView) viewFindViewById2;
                this.maskIv = (AppCompatImageView) view.findViewById(csi.e1);
                this.basicInfoView = (TrainPlanReportBasicInfoView) view.findViewById(csi.f14678k);
                View viewFindViewById3 = view.findViewById(csi.T2);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                this.shareSloganView = (ShareSloganView) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(csi.n3);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                this.stickerParentView = (FrameLayout) viewFindViewById4;
            }

            public final void bindData(@NotNull SportBasicReport sportReport, int position, @Nullable AccountCoreInfo accountInfo, @NotNull String sportName) {
                Intrinsics.checkNotNullParameter(sportReport, "sportReport");
                Intrinsics.checkNotNullParameter(sportName, "sportName");
                ImageView imageView = this.bgIv;
                Object obj = this.this$0.bgUris.get(position);
                ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
                builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
                builderTarget.allowHardware(false);
                imageLoader.enqueue(builderTarget.build());
                Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), ioi.L);
                if (resourceDrawable != null) {
                    resourceDrawable.setBounds(0, 0, 40, 40);
                }
                this.appNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
                this.bottomAppNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
            }

            @NotNull
            public final CardView getCardView() {
                return this.cardView;
            }

            @NotNull
            public final View getView() {
                return this.view;
            }
        }

        public CustomizeSwitchAdapter(@NotNull LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            this.lifecycleOwner = lifecycleOwner;
            this.bgUris = ShareExtKt.getCustomizeSharePreviewUris();
            this.sportName = "";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return 6;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position < 3 ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.setIsRecyclable(false);
            if (holder instanceof RectangleViewHolder) {
                ((RectangleViewHolder) holder).getCardView().setTag(Integer.valueOf(position));
            } else if (holder instanceof SquareViewHolder) {
                ((SquareViewHolder) holder).getCardView().setTag(Integer.valueOf(position));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (viewType == 0) {
                View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jvi.Y, parent, false);
                Intrinsics.checkNotNull(viewInflate);
                return new RectangleViewHolder(this, viewInflate);
            }
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jvi.a0, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new SquareViewHolder(this, viewInflate2);
        }

        public final void setUserInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
            this.accountInfo = accountCoreInfo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initCustomShareTabLayoutHolder() {
        ViewPager2 viewPager = getViewPager();
        CarouselIndicator carouselIndicator = getCarouselIndicator();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        final CustomShareTabLayoutHolder customShareTabLayoutHolder = new CustomShareTabLayoutHolder(viewPager, carouselIndicator, viewLifecycleOwner, (TrainPlanReportShareViewModel) getMViewModel());
        customShareTabLayoutHolder.initHolder();
        ((TrainPlanReportShareViewModel) getMViewModel()).m625getUserInfoLiveData();
        ((TrainPlanReportShareViewModel) getMViewModel()).getUserInfoLiveData().observe(getViewLifecycleOwner(), new CustomerTrainPlanReportShareFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: we5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CustomerTrainPlanReportShareFragment.initCustomShareTabLayoutHolder$lambda$0(customShareTabLayoutHolder, (AccountCoreInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomShareTabLayoutHolder$lambda$0(CustomShareTabLayoutHolder holder, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        holder.setDataViewUserInfo(accountCoreInfo, true);
        return Unit.INSTANCE;
    }

    private final void setUpBasicUi() {
        setActionBarDisplayable(false);
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, eki.f16738a);
        setViewPager(getMBinding().B);
        setCarouselIndicator(getMBinding().A);
    }

    @NotNull
    public final CarouselIndicator getCarouselIndicator() {
        CarouselIndicator carouselIndicator = this.carouselIndicator;
        if (carouselIndicator != null) {
            return carouselIndicator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("carouselIndicator");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.Z;
    }

    @NotNull
    public final ViewPager2 getViewPager() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setUpBasicUi();
        initCustomShareTabLayoutHolder();
    }

    public final void setCarouselIndicator(@NotNull CarouselIndicator carouselIndicator) {
        Intrinsics.checkNotNullParameter(carouselIndicator, "<set-?>");
        this.carouselIndicator = carouselIndicator;
    }

    public final void setViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.viewPager = viewPager2;
    }
}
