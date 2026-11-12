package com.xiaomi.fitness.share.report.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongList;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragmentKt;
import com.xiaomi.fitness.share.report.holder.JustDanceSongShareTabLayoutHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import defpackage.af5;
import defpackage.dki;
import defpackage.ivi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/JustDanceSongSportReportShareFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Laf5;", "", "setUpBasicUi", "()V", "initCustomShareTabLayoutHolder", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "switchSongList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class JustDanceSongSportReportShareFragment extends BaseBindingFragment<SportReportShareViewModel, af5> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CustomizeSportReportShareFragment";
    private CarouselIndicator carouselIndicator;
    private SportBasicReport sportReport;
    private SwitchSongList switchSongList;
    public ViewPager2 viewPager;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/JustDanceSongSportReportShareFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/share/report/fragment/JustDanceSongSportReportShareFragment;", "sportBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "switchSongList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JustDanceSongSportReportShareFragment newInstance(@NotNull SportBasicReport sportBasicReport, @NotNull SwitchSongList switchSongList) {
            Intrinsics.checkNotNullParameter(sportBasicReport, "sportBasicReport");
            Intrinsics.checkNotNullParameter(switchSongList, "switchSongList");
            JustDanceSongSportReportShareFragment justDanceSongSportReportShareFragment = new JustDanceSongSportReportShareFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putSerializable(SportDetailJustDanceDataFragmentKt.BUNDLE_PARAMS_SPORT_DETAIL_JUST_DANCE_LIST, switchSongList);
            justDanceSongSportReportShareFragment.setArguments(bundle);
            return justDanceSongSportReportShareFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initCustomShareTabLayoutHolder() {
        CarouselIndicator carouselIndicator;
        SportBasicReport sportBasicReport;
        ViewPager2 viewPager = getViewPager();
        CarouselIndicator carouselIndicator2 = this.carouselIndicator;
        SwitchSongList switchSongList = null;
        if (carouselIndicator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("carouselIndicator");
            carouselIndicator = null;
        } else {
            carouselIndicator = carouselIndicator2;
        }
        SportBasicReport sportBasicReport2 = this.sportReport;
        if (sportBasicReport2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportReport");
            sportBasicReport = null;
        } else {
            sportBasicReport = sportBasicReport2;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        JustDanceSongShareTabLayoutHolder justDanceSongShareTabLayoutHolder = new JustDanceSongShareTabLayoutHolder(viewPager, carouselIndicator, sportBasicReport, viewLifecycleOwner, (SportReportShareViewModel) getMViewModel());
        SwitchSongList switchSongList2 = this.switchSongList;
        if (switchSongList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchSongList");
        } else {
            switchSongList = switchSongList2;
        }
        justDanceSongShareTabLayoutHolder.initHolder(switchSongList);
    }

    private final void setUpBasicUi() {
        setActionBarDisplayable(false);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("sport_report") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportBasicReport");
        this.sportReport = (SportBasicReport) serializable;
        Bundle arguments2 = getArguments();
        Serializable serializable2 = arguments2 != null ? arguments2.getSerializable(SportDetailJustDanceDataFragmentKt.BUNDLE_PARAMS_SPORT_DETAIL_JUST_DANCE_LIST) : null;
        Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.SwitchSongList");
        this.switchSongList = (SwitchSongList) serializable2;
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, dki.h);
        setViewPager(getMBinding().B);
        this.carouselIndicator = getMBinding().A;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.h;
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

    public final void setViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.viewPager = viewPager2;
    }
}
