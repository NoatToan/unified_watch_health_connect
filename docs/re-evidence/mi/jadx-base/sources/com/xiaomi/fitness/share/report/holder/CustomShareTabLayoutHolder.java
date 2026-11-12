package com.xiaomi.fitness.share.report.holder;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.baseui.widget.ZoomOutPageTransformer;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.share.report.adapter.CustomizeSharePreviewItemDecoration;
import com.xiaomi.fitness.share.report.adapter.CustomizeSwitchAdapter;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import defpackage.dki;
import defpackage.pah;
import defpackage.tli;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/share/report/holder/CustomShareTabLayoutHolder;", "", "customizeViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "mViewModel", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;)V", "customizeSwitchAdapter", "Lcom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter;", "initHolder", "", "setDataViewUserInfo", "accountCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "isCommonSport", "", "setSportName", "sportName", "", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomShareTabLayoutHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomShareTabLayoutHolder.kt\ncom/xiaomi/fitness/share/report/holder/CustomShareTabLayoutHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,103:1\n81#2:104\n*S KotlinDebug\n*F\n+ 1 CustomShareTabLayoutHolder.kt\ncom/xiaomi/fitness/share/report/holder/CustomShareTabLayoutHolder\n*L\n52#1:104\n*E\n"})
public final class CustomShareTabLayoutHolder {

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
    private final SportReportShareViewModel mViewModel;

    @NotNull
    private final SportBasicReport sportReport;

    public CustomShareTabLayoutHolder(@NotNull ViewPager2 customizeViewPager, @NotNull CarouselIndicator carouselIndicator, @NotNull SportBasicReport sportReport, @NotNull LifecycleOwner lifecycleOwner, @NotNull SportReportShareViewModel mViewModel) {
        Intrinsics.checkNotNullParameter(customizeViewPager, "customizeViewPager");
        Intrinsics.checkNotNullParameter(carouselIndicator, "carouselIndicator");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.customizeViewPager = customizeViewPager;
        this.carouselIndicator = carouselIndicator;
        this.sportReport = sportReport;
        this.lifecycleOwner = lifecycleOwner;
        this.mViewModel = mViewModel;
    }

    public final void initHolder() {
        this.carouselIndicator.setColor(dki.H0, dki.I0);
        this.carouselIndicator.initIndicatorCount(6);
        this.customizeViewPager.setOffscreenPageLimit(1);
        this.customizeViewPager.setClipChildren(false);
        this.customizeViewPager.setTag("customize_share_view_pager");
        this.customizeViewPager.setPageTransformer(new ZoomOutPageTransformer());
        this.customizeSwitchAdapter = new CustomizeSwitchAdapter(this.sportReport, this.lifecycleOwner);
        final int dimen = (int) ResourceExtKt.getDimen(ApplicationExtKt.getApplication(), tli.f34834k);
        final ViewPager2 viewPager2 = this.customizeViewPager;
        pah.a(viewPager2, new Runnable() { // from class: com.xiaomi.fitness.share.report.holder.CustomShareTabLayoutHolder$initHolder$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.customizeViewPager.a(new CustomizeSharePreviewItemDecoration(dimen));
                final int dp = dimen + ExtUtilsKt.getDp(40);
                this.customizeViewPager.setPageTransformer(new ViewPager2.k() { // from class: com.xiaomi.fitness.share.report.holder.CustomShareTabLayoutHolder$initHolder$1$pageTransformer$1
                    @Override // androidx.viewpager2.widget.ViewPager2.k
                    public final void transformPage(View page, float f) {
                        Intrinsics.checkNotNullParameter(page, "page");
                        page.setTranslationX((-dp) * f);
                        page.setScaleY(1 - (Math.abs(f) * 0.25f));
                    }
                });
                ViewPager2 viewPager3 = this.customizeViewPager;
                viewPager3.setAdapter(this.customizeSwitchAdapter);
                final CustomShareTabLayoutHolder customShareTabLayoutHolder = this;
                viewPager3.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.share.report.holder.CustomShareTabLayoutHolder$initHolder$1$1$1
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

    public final void setSportName(@NotNull String sportName) {
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        CustomizeSwitchAdapter customizeSwitchAdapter = this.customizeSwitchAdapter;
        if (customizeSwitchAdapter != null) {
            customizeSwitchAdapter.setSportName(sportName);
        }
        CustomizeSwitchAdapter customizeSwitchAdapter2 = this.customizeSwitchAdapter;
        if (customizeSwitchAdapter2 != null) {
            customizeSwitchAdapter2.notifyDataSetChanged();
        }
    }
}
