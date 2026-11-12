package com.xiaomi.fitness.health.sleep.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.example.statistics.export.EffectiveExposeExtKt;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepBaseWeekMonthItemFragment;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepWmDurationHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepWmEfficiencyHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepWmRegularityHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepWmScoreHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.c0j;
import defpackage.jui;
import defpackage.lce;
import defpackage.nce;
import defpackage.pce;
import defpackage.rce;
import defpackage.sca;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000 T*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0001TB\u0007¢\u0006\u0004\bS\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\u001aH$¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000bR$\u0010.\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010\u000bR\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u001c¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepBaseWeekMonthItemFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "VM", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lsca;", "", "initCurrentLocalDate", "()V", "Landroid/view/View;", "view", "initViewAndHolder", "(Landroid/view/View;)V", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "result", "onReportResult", "(Ljava/util/List;)V", "", "isMonth", "()Z", "isWeek", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "fragmentPosition", "()I", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "getMCurrentLocalDate", "()Lorg/joda/time/LocalDate;", "setMCurrentLocalDate", "(Lorg/joda/time/LocalDate;)V", "Ljava/lang/Integer;", "getFragmentPosition", "()Ljava/lang/Integer;", "setFragmentPosition", "(Ljava/lang/Integer;)V", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "emptyView", "getEmptyView", "setEmptyView", "Landroid/widget/TextView;", "tvLoadingOrEmpty", "Landroid/widget/TextView;", "detailParentView", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmDurationHolder;", "durationWmHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmDurationHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmScoreHolder;", "scoreWmHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmScoreHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmRegularityHolder;", "sleepWmRegularityHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmRegularityHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmEfficiencyHolder;", "sleepWmEfficiencyHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepWmEfficiencyHolder;", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "healthBannerCardSetView", "Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "getHealthBannerCardSetView", "()Lcom/xiaomi/fitness/view/HealthBannerCardSetView;", "setHealthBannerCardSetView", "(Lcom/xiaomi/fitness/view/HealthBannerCardSetView;)V", "pagerOffset", "I", "", "oneTrackReportData", "Ljava/lang/String;", "getOneTrackReportData", "()Ljava/lang/String;", "setOneTrackReportData", "(Ljava/lang/String;)V", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class SleepBaseWeekMonthItemFragment<VM extends SleepViewModel> extends BaseBindingFragment<VM, sca> {

    @NotNull
    public static final String TAG = "SleepWmLog";

    @Nullable
    private View containerView;

    @Nullable
    private View detailParentView;

    @Nullable
    private SleepWmDurationHolder durationWmHolder;

    @Nullable
    private View emptyView;

    @Nullable
    private Integer fragmentPosition;
    public HealthBannerCardSetView healthBannerCardSetView;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @NotNull
    private String oneTrackReportData = "0";
    private int pagerOffset;

    @Nullable
    private SleepWmScoreHolder scoreWmHolder;

    @Nullable
    private SleepWmEfficiencyHolder sleepWmEfficiencyHolder;

    @Nullable
    private SleepWmRegularityHolder sleepWmRegularityHolder;

    @Nullable
    private TextView tvLoadingOrEmpty;

    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    private final void initCurrentLocalDate() {
        LocalDate weekMonday;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        this.pagerOffset = numValueOf != null ? numValueOf.intValue() : 0;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            weekMonday = isMonth() ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue));
            if (weekMonday == null) {
                if (isMonth()) {
                    weekMonday = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                } else {
                    weekMonday = TimeDateUtil.getWeekMonday(LocalDate.now());
                }
            }
        } else if (isMonth()) {
            weekMonday = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
        } else {
            weekMonday = TimeDateUtil.getWeekMonday(LocalDate.now());
        }
        this.mCurrentLocalDate = weekMonday;
        if (weekMonday == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initViewAndHolder(View view) {
        setActionBarDisplayable(false);
        this.containerView = getMBinding().G;
        this.detailParentView = getMBinding().I;
        this.emptyView = getMBinding().A.getRoot();
        this.tvLoadingOrEmpty = getMBinding().A.A;
        CardUnderstandView cardUnderstandView = getMBinding().K;
        if (cardUnderstandView != null) {
            cardUnderstandView.setOnClickListener(new View.OnClickListener() { // from class: eim
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SleepBaseWeekMonthItemFragment.initViewAndHolder$lambda$3(this.f16690a, view2);
                }
            });
        }
        SleepHealthBannerCardSetLayout.setSleepHealthBanner$default(getMBinding().H, null, 1, null);
        lce cardSleepWmSummary = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(cardSleepWmSummary, "cardSleepWmSummary");
        Integer num = this.fragmentPosition;
        Intrinsics.checkNotNull(num);
        this.durationWmHolder = new SleepWmDurationHolder(cardSleepWmSummary, num.intValue());
        rce cardSleepWmScore = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(cardSleepWmScore, "cardSleepWmScore");
        Integer num2 = this.fragmentPosition;
        Intrinsics.checkNotNull(num2);
        SleepWmScoreHolder sleepWmScoreHolder = new SleepWmScoreHolder(cardSleepWmScore, num2.intValue());
        this.scoreWmHolder = sleepWmScoreHolder;
        Intrinsics.checkNotNull(sleepWmScoreHolder);
        sleepWmScoreHolder.updateSleepDistributeConfig(getMViewModel().getSleepDistributeConfig());
        pce cardSleepRegularity = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(cardSleepRegularity, "cardSleepRegularity");
        Integer num3 = this.fragmentPosition;
        Intrinsics.checkNotNull(num3);
        this.sleepWmRegularityHolder = new SleepWmRegularityHolder(cardSleepRegularity, num3.intValue());
        nce cardSleepWmEfficiency = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(cardSleepWmEfficiency, "cardSleepWmEfficiency");
        Integer num4 = this.fragmentPosition;
        Intrinsics.checkNotNull(num4);
        this.sleepWmEfficiencyHolder = new SleepWmEfficiencyHolder(cardSleepWmEfficiency, num4.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewAndHolder$lambda$3(SleepBaseWeekMonthItemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), this$0.getString(c0j.Ck), false, false, null, false, null, false, 252, null);
    }

    private final boolean isMonth() {
        Integer num = this.fragmentPosition;
        return num != null && num.intValue() == 2;
    }

    private final boolean isWeek() {
        Integer num = this.fragmentPosition;
        return num != null && num.intValue() == 1;
    }

    private final void onReportResult(List<? extends DailyBasicReport> result) {
        AllDaySleepReport allDaySleepReport;
        LocalDate localDateMinusMonths;
        Logger.i(TAG, "onReportResult result.size=" + (result != null ? result.size() : 0));
        if (this.mCurrentLocalDate == null) {
            return;
        }
        AllDaySleepReport allDaySleepReport2 = null;
        if (ArrayUtils.isEmpty(result)) {
            allDaySleepReport = null;
        } else {
            Intrinsics.checkNotNull(result);
            allDaySleepReport = null;
            for (DailyBasicReport dailyBasicReport : result) {
                if (dailyBasicReport instanceof AllDaySleepReport) {
                    AllDaySleepReport allDaySleepReport3 = (AllDaySleepReport) dailyBasicReport;
                    long time = allDaySleepReport3.getTime();
                    LocalDate localDate = this.mCurrentLocalDate;
                    Intrinsics.checkNotNull(localDate);
                    if (time == TimeDateUtil.changZeroOfTheDay(localDate)) {
                        allDaySleepReport2 = allDaySleepReport3;
                    } else {
                        long time2 = allDaySleepReport3.getTime();
                        if (isWeek()) {
                            LocalDate localDate2 = this.mCurrentLocalDate;
                            Intrinsics.checkNotNull(localDate2);
                            localDateMinusMonths = localDate2.minusWeeks(1);
                        } else {
                            LocalDate localDate3 = this.mCurrentLocalDate;
                            Intrinsics.checkNotNull(localDate3);
                            localDateMinusMonths = localDate3.minusMonths(1);
                        }
                        Intrinsics.checkNotNull(localDateMinusMonths);
                        if (time2 == TimeDateUtil.changZeroOfTheDay(localDateMinusMonths)) {
                            allDaySleepReport = allDaySleepReport3;
                        }
                    }
                }
            }
        }
        Logger.i(TAG, "Sleep wm onReportResult allDaySleepReport " + allDaySleepReport2 + ";preDaySleepReport " + allDaySleepReport);
        if (allDaySleepReport2 == null || ArrayUtils.isEmpty(allDaySleepReport2.getDayReportList())) {
            this.oneTrackReportData = "0";
            TextView textView = this.tvLoadingOrEmpty;
            if (textView != null) {
                textView.setText(getString(c0j.L6));
            }
            View view = this.emptyView;
            if (view != null) {
                ViewExtKt.setVisible(view, true);
            }
            View view2 = this.detailParentView;
            if (view2 != null) {
                ViewExtKt.setVisible(view2, false);
                return;
            }
            return;
        }
        this.oneTrackReportData = "1";
        View view3 = this.detailParentView;
        if (view3 != null) {
            ViewExtKt.setVisible(view3, true);
        }
        View view4 = this.emptyView;
        if (view4 != null) {
            ViewExtKt.setVisible(view4, false);
        }
        SleepWmDurationHolder sleepWmDurationHolder = this.durationWmHolder;
        if (sleepWmDurationHolder != null) {
            LocalDate localDate4 = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate4);
            sleepWmDurationHolder.updateReport(localDate4, allDaySleepReport2, allDaySleepReport);
        }
        SleepWmScoreHolder sleepWmScoreHolder = this.scoreWmHolder;
        if (sleepWmScoreHolder != null) {
            LocalDate localDate5 = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate5);
            sleepWmScoreHolder.updateReport(localDate5, allDaySleepReport2, allDaySleepReport);
        }
        SleepWmRegularityHolder sleepWmRegularityHolder = this.sleepWmRegularityHolder;
        if (sleepWmRegularityHolder != null) {
            sleepWmRegularityHolder.updateReport(allDaySleepReport2);
        }
        SleepWmEfficiencyHolder sleepWmEfficiencyHolder = this.sleepWmEfficiencyHolder;
        if (sleepWmEfficiencyHolder != null) {
            sleepWmEfficiencyHolder.updateReport(allDaySleepReport2);
        }
        NestedScrollView nestedScrollView = getMBinding().J;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "nestedScrollView");
        EffectiveExposeExtKt.manualTriggerCheckExpose$default(nestedScrollView, SleepTrackHelper.INSTANCE.getSleepWmSharedTrackRecordSharedSet(), 0, 1000L, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SleepBaseWeekMonthItemFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onReportResult(list);
        return Unit.INSTANCE;
    }

    public abstract int fragmentPosition();

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final View getEmptyView() {
        return this.emptyView;
    }

    @Nullable
    public final Integer getFragmentPosition() {
        return this.fragmentPosition;
    }

    @NotNull
    public final HealthBannerCardSetView getHealthBannerCardSetView() {
        HealthBannerCardSetView healthBannerCardSetView = this.healthBannerCardSetView;
        if (healthBannerCardSetView != null) {
            return healthBannerCardSetView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("healthBannerCardSetView");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.Y0;
    }

    @Nullable
    public final LocalDate getMCurrentLocalDate() {
        return this.mCurrentLocalDate;
    }

    @NotNull
    public final String getOneTrackReportData() {
        return this.oneTrackReportData;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
        SleepWmDurationHolder sleepWmDurationHolder = this.durationWmHolder;
        if (sleepWmDurationHolder != null) {
            sleepWmDurationHolder.onParentResume();
        }
        SleepWmScoreHolder sleepWmScoreHolder = this.scoreWmHolder;
        if (sleepWmScoreHolder != null) {
            sleepWmScoreHolder.onParentResume();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.fragmentPosition = Integer.valueOf(fragmentPosition());
        initViewAndHolder(view);
        initCurrentLocalDate();
        getMBinding().D.getRoot().setTag(SleepTrackHelper.INSTANCE.buildSleepWeekMonthRegularCardExpose(isWeek(), this.pagerOffset));
        VM mViewModel = getMViewModel();
        String str = isWeek() ? "weeks" : "months";
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        mViewModel.triggerFetchFitnessReport(ISleepRepository.class, str, TimeDateUtil.changZeroOfTheDay(localDate), 1, 0, "").observe(getViewLifecycleOwner(), new SleepBaseWeekMonthItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dim
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepBaseWeekMonthItemFragment.onViewCreated$lambda$0(this.f15569a, (List) obj);
            }
        }));
        getMBinding().J.setNestedScrollingEnabled(true);
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setEmptyView(@Nullable View view) {
        this.emptyView = view;
    }

    public final void setFragmentPosition(@Nullable Integer num) {
        this.fragmentPosition = num;
    }

    public final void setHealthBannerCardSetView(@NotNull HealthBannerCardSetView healthBannerCardSetView) {
        Intrinsics.checkNotNullParameter(healthBannerCardSetView, "<set-?>");
        this.healthBannerCardSetView = healthBannerCardSetView;
    }

    public final void setMCurrentLocalDate(@Nullable LocalDate localDate) {
        this.mCurrentLocalDate = localDate;
    }

    public final void setOneTrackReportData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oneTrackReportData = str;
    }
}
