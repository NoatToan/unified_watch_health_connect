package com.xiaomi.fitness.share.report.holder;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.baseui.widget.ZoomOutPageTransformer;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.adapter.DefaultSwitchFragmentStateAdapter;
import defpackage.dki;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/share/report/holder/DefaultShareTabLayoutHolder;", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "bitmapUriStr", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;Landroidx/viewpager2/widget/ViewPager2;Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/lang/String;)V", "initHolder", "", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultShareTabLayoutHolder {

    @NotNull
    public static final String TAG = "DefaultShareTabLayoutHolder";

    @Nullable
    private final String bitmapUriStr;

    @NotNull
    private final CarouselIndicator carouselIndicator;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final SportBasicReport sportReport;

    @NotNull
    private final ViewPager2 viewPager;

    public DefaultShareTabLayoutHolder(@NotNull FragmentActivity fragmentActivity, @NotNull ViewPager2 viewPager, @NotNull CarouselIndicator carouselIndicator, @NotNull SportBasicReport sportReport, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(carouselIndicator, "carouselIndicator");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        this.fragmentActivity = fragmentActivity;
        this.viewPager = viewPager;
        this.carouselIndicator = carouselIndicator;
        this.sportReport = sportReport;
        this.bitmapUriStr = str;
    }

    public final void initHolder() {
        this.viewPager.setAdapter(new DefaultSwitchFragmentStateAdapter(this.fragmentActivity, this.sportReport, this.bitmapUriStr));
        this.viewPager.setTag(SportReportShareExtKt.TAG_DEFAULT_SHARE_VIEW_PAGER);
        this.viewPager.setUserInputEnabled(true);
        this.viewPager.k(0, false);
        this.viewPager.setOffscreenPageLimit(2);
        this.viewPager.setClipChildren(false);
        this.viewPager.setPageTransformer(new ZoomOutPageTransformer());
        this.viewPager.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.share.report.holder.DefaultShareTabLayoutHolder.initHolder.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                DefaultShareTabLayoutHolder.this.carouselIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Logger.i("DefaultShareTabLayoutHolder", "registerOnPageChangeCallback position=" + position);
            }
        });
        this.carouselIndicator.setColor(dki.H0, dki.I0);
        this.carouselIndicator.initIndicatorCount(1);
    }
}
