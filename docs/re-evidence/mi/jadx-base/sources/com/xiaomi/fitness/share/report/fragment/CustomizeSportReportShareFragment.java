package com.xiaomi.fitness.share.report.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseData;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseTrainSummary;
import com.xiaomi.fitness.share.report.fragment.CustomizeSportReportShareFragment;
import com.xiaomi.fitness.share.report.holder.CustomShareTabLayoutHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import defpackage.af5;
import defpackage.byi;
import defpackage.dki;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.lp5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/CustomizeSportReportShareFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Laf5;", "", "setUpBasicUi", "()V", "initCustomShareTabLayoutHolder", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "carouselIndicator", "Lcom/xiaomi/fitness/baseui/widget/CarouselIndicator;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CustomizeSportReportShareFragment extends BaseBindingFragment<SportReportShareViewModel, af5> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "CustomizeSportReportShareFragment";
    private CarouselIndicator carouselIndicator;
    private SportBasicReport sportReport;
    public ViewPager2 viewPager;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/CustomizeSportReportShareFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/share/report/fragment/CustomizeSportReportShareFragment;", "sportBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomizeSportReportShareFragment newInstance(@NotNull SportBasicReport sportBasicReport) {
            Intrinsics.checkNotNullParameter(sportBasicReport, "sportBasicReport");
            CustomizeSportReportShareFragment customizeSportReportShareFragment = new CustomizeSportReportShareFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("sport_report", sportBasicReport);
            customizeSportReportShareFragment.setArguments(bundle);
            return customizeSportReportShareFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initCustomShareTabLayoutHolder() {
        CarouselIndicator carouselIndicator;
        SportBasicReport sportBasicReport;
        ViewPager2 viewPager = getViewPager();
        CarouselIndicator carouselIndicator2 = this.carouselIndicator;
        SportBasicReport sportBasicReport2 = null;
        if (carouselIndicator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("carouselIndicator");
            carouselIndicator = null;
        } else {
            carouselIndicator = carouselIndicator2;
        }
        SportBasicReport sportBasicReport3 = this.sportReport;
        if (sportBasicReport3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportReport");
            sportBasicReport = null;
        } else {
            sportBasicReport = sportBasicReport3;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        final CustomShareTabLayoutHolder customShareTabLayoutHolder = new CustomShareTabLayoutHolder(viewPager, carouselIndicator, sportBasicReport, viewLifecycleOwner, (SportReportShareViewModel) getMViewModel());
        customShareTabLayoutHolder.initHolder();
        ((SportReportShareViewModel) getMViewModel()).m242getUserInfoLiveData();
        ((SportReportShareViewModel) getMViewModel()).getUserInfoLiveData().observe(getViewLifecycleOwner(), new CustomizeSportReportShareFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ye5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CustomizeSportReportShareFragment.initCustomShareTabLayoutHolder$lambda$0(customShareTabLayoutHolder, (AccountCoreInfo) obj);
            }
        }));
        FitnessPersistKey fitnessPersistKey = FitnessPersistKey.INSTANCE;
        SportBasicReport sportBasicReport4 = this.sportReport;
        if (sportBasicReport4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportReport");
            sportBasicReport4 = null;
        }
        SportReportKey sportReportKey = fitnessPersistKey.getSportReportKey(sportBasicReport4.getSportType());
        if (sportReportKey != null) {
            SportReportShareViewModel sportReportShareViewModel = (SportReportShareViewModel) getMViewModel();
            SportBasicReport sportBasicReport5 = this.sportReport;
            if (sportBasicReport5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportReport");
                sportBasicReport5 = null;
            }
            String sid = sportBasicReport5.getSid();
            if (sid == null) {
                sid = "";
            }
            String str = sid;
            String key = sportReportKey.getKey();
            SportBasicReport sportBasicReport6 = this.sportReport;
            if (sportBasicReport6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportReport");
                sportBasicReport6 = null;
            }
            long startTime = sportBasicReport6.getStartTime();
            SportBasicReport sportBasicReport7 = this.sportReport;
            if (sportBasicReport7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportReport");
                sportBasicReport7 = null;
            }
            long endTime = sportBasicReport7.getEndTime();
            SportBasicReport sportBasicReport8 = this.sportReport;
            if (sportBasicReport8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportReport");
                sportBasicReport8 = null;
            }
            Long cloudCourseId = sportBasicReport8.getCloudCourseId();
            String string = cloudCourseId != null ? cloudCourseId.toString() : null;
            SportBasicReport sportBasicReport9 = this.sportReport;
            if (sportBasicReport9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportReport");
                sportBasicReport9 = null;
            }
            sportReportShareViewModel.getReportInfoFromNet(str, key, startTime, endTime, string, sportBasicReport9.getCloudCourseSource());
        }
        SportBasicReport sportBasicReport10 = this.sportReport;
        if (sportBasicReport10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportReport");
        } else {
            sportBasicReport2 = sportBasicReport10;
        }
        String strC = lp5.c(lp5.a(sportBasicReport2));
        Intrinsics.checkNotNull(strC);
        customShareTabLayoutHolder.setSportName(strC);
        ((SportReportShareViewModel) getMViewModel()).getSportsReportOperationalCourseInfo().observe(getViewLifecycleOwner(), new CustomizeSportReportShareFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ze5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CustomizeSportReportShareFragment.initCustomShareTabLayoutHolder$lambda$1(customShareTabLayoutHolder, this, (SportsReportOperationalCourseData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomShareTabLayoutHolder$lambda$0(CustomShareTabLayoutHolder holder, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        holder.setDataViewUserInfo(accountCoreInfo, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomShareTabLayoutHolder$lambda$1(CustomShareTabLayoutHolder holder, CustomizeSportReportShareFragment this$0, SportsReportOperationalCourseData sportsReportOperationalCourseData) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sportsReportOperationalCourseData != null) {
            SportsReportOperationalCourseTrainSummary trainSummary = sportsReportOperationalCourseData.getTrainSummary();
            Integer numValueOf = trainSummary != null ? Integer.valueOf(trainSummary.getTrainTimes()) : null;
            String name = sportsReportOperationalCourseData.getCourseInfo().getName();
            if (!TextUtils.isEmpty(name)) {
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    holder.setSportName(name);
                } else {
                    String string = this$0.getString(j1j.course_record_summary, name, ResourceExtKt.getQuantityString(AppUtil.getApp(), byi.course_record_times, numValueOf.intValue(), numValueOf));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    holder.setSportName(string);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void setUpBasicUi() {
        setActionBarDisplayable(false);
        Bundle arguments = getArguments();
        SportBasicReport sportBasicReport = null;
        Serializable serializable = arguments != null ? arguments.getSerializable("sport_report") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportBasicReport");
        this.sportReport = (SportBasicReport) serializable;
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, dki.h);
        SportBasicReport sportBasicReport2 = this.sportReport;
        if (sportBasicReport2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportReport");
        } else {
            sportBasicReport = sportBasicReport2;
        }
        Logger.i("CustomizeSportReportShareFragment", "onViewCreated sportReport=" + sportBasicReport);
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
