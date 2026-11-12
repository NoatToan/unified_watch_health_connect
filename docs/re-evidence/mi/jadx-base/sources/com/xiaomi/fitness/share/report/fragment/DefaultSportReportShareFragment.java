package com.xiaomi.fitness.share.report.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.holder.DefaultShareTabLayoutHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import defpackage.bx5;
import defpackage.ivi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0007¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/DefaultSportReportShareFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Lbx5;", "", "setUpBasicUi", "()V", "initTabLayoutAndCarouselIndicatorHolder", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "getCarouselIndicator", "()Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "setCarouselIndicator", "(Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setSportReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "", "bitmapUriStr", "Ljava/lang/String;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DefaultSportReportShareFragment extends BaseBindingFragment<SportReportShareViewModel, bx5> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DefaultSportReportShareFragment";

    @NotNull
    private String bitmapUriStr = "";
    public CarouselIndicator carouselIndicator;
    public SportBasicReport sportReport;
    public ViewPager2 viewPager;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/DefaultSportReportShareFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/share/report/fragment/DefaultSportReportShareFragment;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "longPicBitmapUriStr", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultSportReportShareFragment newInstance(@NotNull SportBasicReport sportReport, @NotNull String longPicBitmapUriStr) {
            Intrinsics.checkNotNullParameter(sportReport, "sportReport");
            Intrinsics.checkNotNullParameter(longPicBitmapUriStr, "longPicBitmapUriStr");
            DefaultSportReportShareFragment defaultSportReportShareFragment = new DefaultSportReportShareFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("sport_report", sportReport);
            bundle.putString(SportReportShareExtKt.KEY_BITMAP_URI_STR, longPicBitmapUriStr);
            defaultSportReportShareFragment.setArguments(bundle);
            return defaultSportReportShareFragment;
        }
    }

    private final void initTabLayoutAndCarouselIndicatorHolder() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        new DefaultShareTabLayoutHolder(fragmentActivityRequireActivity, getViewPager(), getCarouselIndicator(), getSportReport(), this.bitmapUriStr).initHolder();
    }

    private final void setUpBasicUi() {
        setActionBarDisplayable(false);
        setViewPager(getMBinding().B);
        setCarouselIndicator(getMBinding().A);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("sport_report") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportBasicReport");
        setSportReport((SportBasicReport) serializable);
        Bundle arguments2 = getArguments();
        this.bitmapUriStr = String.valueOf(arguments2 != null ? arguments2.getString(SportReportShareExtKt.KEY_BITMAP_URI_STR, "") : null);
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
        return ivi.f22139k;
    }

    @NotNull
    public final SportBasicReport getSportReport() {
        SportBasicReport sportBasicReport = this.sportReport;
        if (sportBasicReport != null) {
            return sportBasicReport;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportReport");
        return null;
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
        Logger.i(TAG, "onViewCreated sportReport=" + getSportReport());
        initTabLayoutAndCarouselIndicatorHolder();
    }

    public final void setCarouselIndicator(@NotNull CarouselIndicator carouselIndicator) {
        Intrinsics.checkNotNullParameter(carouselIndicator, "<set-?>");
        this.carouselIndicator = carouselIndicator;
    }

    public final void setSportReport(@NotNull SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<set-?>");
        this.sportReport = sportBasicReport;
    }

    public final void setViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.viewPager = viewPager2;
    }
}
