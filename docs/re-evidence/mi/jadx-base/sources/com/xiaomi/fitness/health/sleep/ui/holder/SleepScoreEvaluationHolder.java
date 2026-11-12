package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepQualityDetailFragment;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepScoreEvaluationHolder;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.jce;
import defpackage.lpi;
import defpackage.ne5;
import defpackage.qxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 G2\u00020\u0001:\u0001GB\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bE\u0010FJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010/\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00100\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00101\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+R\u0014\u00102\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010+R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u0014\u00107\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+R\u0014\u00108\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+R\u0014\u00109\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010+R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepScoreEvaluationHolder;", "", "", "requestAssistGuideIfNeed", "()V", "showFuzzyCard", "showAccurateCard", "updateAccurateScoreTip", "", "childStr", "wholeStr", "Landroid/text/SpannableString;", "getSpannableString", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "report", "", "checkHasRem", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)Z", "hasRem", "preReport", "gotoSleepQualityFragment", "(ZLcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "updateReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "showGuide", "refreshViewOnAssistGuideResult", "(Z)V", LifecycleConstantKt.ON_RESUME, "Ljce;", "scoreBinding", "Ljce;", "", "dayWeekMonthPosition", "I", "Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepScore;", "sleepInterface", "Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepScore;", "Landroid/view/View;", "layoutAccurate", "Landroid/view/View;", "Landroid/widget/TextView;", "tvAccurateTitle", "Landroid/widget/TextView;", "tvScore", "tvScoreUnit", "tvEvaluationResult", "tvAccurateScoreTip", "layoutFuzzy", "tvFuzzyTitle", "tvFuzzyEvaluation", "Landroidx/appcompat/widget/AppCompatImageView;", "ivFuzzyEvaluationDetail", "Landroidx/appcompat/widget/AppCompatImageView;", "viewDividerLine", "tvOpenTip", "tvOpen", "tvEmpty", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "preDaySleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "currentDayReport", "showAssistEnable", "Ljava/lang/Boolean;", "<init>", "(Ljce;ILcom/xiaomi/fitness/health/sleep/ui/holder/ISleepScore;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepScoreEvaluationHolder {

    @NotNull
    public static final String TAG = "SleepScoreEvaluationHolder";

    @Nullable
    private AllDaySleepReport currentDayReport;
    private final int dayWeekMonthPosition;

    @Nullable
    private WearableDeviceModel deviceModel;

    @NotNull
    private final AppCompatImageView ivFuzzyEvaluationDetail;

    @NotNull
    private final View layoutAccurate;

    @NotNull
    private final View layoutFuzzy;

    @NotNull
    private final Context mContext;

    @Nullable
    private AllDaySleepReport preDaySleepReport;

    @NotNull
    private final jce scoreBinding;

    @Nullable
    private Boolean showAssistEnable;

    @NotNull
    private final ISleepScore sleepInterface;

    @NotNull
    private final TextView tvAccurateScoreTip;

    @NotNull
    private final TextView tvAccurateTitle;

    @NotNull
    private final TextView tvEmpty;

    @NotNull
    private final TextView tvEvaluationResult;

    @NotNull
    private final TextView tvFuzzyEvaluation;

    @NotNull
    private final TextView tvFuzzyTitle;

    @NotNull
    private final TextView tvOpen;

    @NotNull
    private final TextView tvOpenTip;

    @NotNull
    private final TextView tvScore;

    @NotNull
    private final TextView tvScoreUnit;

    @NotNull
    private final View viewDividerLine;

    public SleepScoreEvaluationHolder(@NotNull jce scoreBinding, int i, @NotNull ISleepScore sleepInterface) {
        Intrinsics.checkNotNullParameter(scoreBinding, "scoreBinding");
        Intrinsics.checkNotNullParameter(sleepInterface, "sleepInterface");
        this.scoreBinding = scoreBinding;
        this.dayWeekMonthPosition = i;
        this.sleepInterface = sleepInterface;
        RelativeLayout layoutAccurate = scoreBinding.C;
        Intrinsics.checkNotNullExpressionValue(layoutAccurate, "layoutAccurate");
        this.layoutAccurate = layoutAccurate;
        TextView tvAccurateScoreTitle = scoreBinding.H;
        Intrinsics.checkNotNullExpressionValue(tvAccurateScoreTitle, "tvAccurateScoreTitle");
        this.tvAccurateTitle = tvAccurateScoreTitle;
        TextView tvSleepScore = scoreBinding.N;
        Intrinsics.checkNotNullExpressionValue(tvSleepScore, "tvSleepScore");
        this.tvScore = tvSleepScore;
        TextView tvSleepScoreUnit = scoreBinding.O;
        Intrinsics.checkNotNullExpressionValue(tvSleepScoreUnit, "tvSleepScoreUnit");
        this.tvScoreUnit = tvSleepScoreUnit;
        TextView tvAccurateEvaluateResult = scoreBinding.F;
        Intrinsics.checkNotNullExpressionValue(tvAccurateEvaluateResult, "tvAccurateEvaluateResult");
        this.tvEvaluationResult = tvAccurateEvaluateResult;
        TextView tvAccurateScoreTip = scoreBinding.G;
        Intrinsics.checkNotNullExpressionValue(tvAccurateScoreTip, "tvAccurateScoreTip");
        this.tvAccurateScoreTip = tvAccurateScoreTip;
        RelativeLayout layoutFuzzy = scoreBinding.D;
        Intrinsics.checkNotNullExpressionValue(layoutFuzzy, "layoutFuzzy");
        this.layoutFuzzy = layoutFuzzy;
        TextView tvFuzzyScoreTitle = scoreBinding.K;
        Intrinsics.checkNotNullExpressionValue(tvFuzzyScoreTitle, "tvFuzzyScoreTitle");
        this.tvFuzzyTitle = tvFuzzyScoreTitle;
        TextView tvFuzzyEvaluation = scoreBinding.J;
        Intrinsics.checkNotNullExpressionValue(tvFuzzyEvaluation, "tvFuzzyEvaluation");
        this.tvFuzzyEvaluation = tvFuzzyEvaluation;
        AppCompatImageView ivFuzzyEvaluationDetail = scoreBinding.B;
        Intrinsics.checkNotNullExpressionValue(ivFuzzyEvaluationDetail, "ivFuzzyEvaluationDetail");
        this.ivFuzzyEvaluationDetail = ivFuzzyEvaluationDetail;
        View dividerLine = scoreBinding.A;
        Intrinsics.checkNotNullExpressionValue(dividerLine, "dividerLine");
        this.viewDividerLine = dividerLine;
        TextView tvOpenTip = scoreBinding.M;
        Intrinsics.checkNotNullExpressionValue(tvOpenTip, "tvOpenTip");
        this.tvOpenTip = tvOpenTip;
        TextView tvOpen = scoreBinding.L;
        Intrinsics.checkNotNullExpressionValue(tvOpen, "tvOpen");
        this.tvOpen = tvOpen;
        TextView tvEmptyText = scoreBinding.I;
        Intrinsics.checkNotNullExpressionValue(tvEmptyText, "tvEmptyText");
        this.tvEmpty = tvEmptyText;
        Context context = scoreBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final boolean checkHasRem(AllDaySleepReport report) {
        Integer remDuration;
        if (report == null) {
            return false;
        }
        List<SleepSegmentReport> sleepSegments = report.getSleepSegments();
        List<SleepSegmentReport> list = sleepSegments;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (sleepSegments.get(i).getSleepDuration() >= 180 && (remDuration = sleepSegments.get(i).getRemDuration()) != null && remDuration.intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    private final SpannableString getSpannableString(String childStr, String wholeStr) {
        SpannableString spannableString = new SpannableString(wholeStr);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) wholeStr, childStr, 0, false, 6, (Object) null);
        int length = childStr.length() + iIndexOf$default;
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#997AFF")), iIndexOf$default, length, 17);
        Typeface font = this.mContext.getResources().getFont(lpi.e);
        if (font != null) {
            spannableString.setSpan(new ne5(font), iIndexOf$default, length, 17);
        }
        return spannableString;
    }

    private final void gotoSleepQualityFragment(boolean hasRem, AllDaySleepReport report, AllDaySleepReport preReport) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(SleepQualityDetailFragment.KEY_SHOW_ACCURATE, hasRem);
        if (report != null) {
            bundle.putSerializable("sleep_report", report);
        }
        if (preReport != null) {
            bundle.putSerializable(SleepQualityDetailFragment.KEY_SLEEP_PRE_REPORT, preReport);
        }
        HealthUtil.INSTANCE.gotoPage(this.mContext, SleepQualityDetailFragment.class, bundle, null);
        SleepTrackHelper.INSTANCE.trackSleepScoreIconClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshViewOnAssistGuideResult$lambda$2(SleepScoreEvaluationHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = this$0.deviceModel;
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showToast(this$0.mContext.getString(c0j.f4801r));
        } else {
            Bundle bundle = new Bundle();
            bundle.putBoolean(SleepSettingFragment.KEY_ORIGIN_ASSIST_GUIDE, true);
            HealthUtil.INSTANCE.gotoPage(this$0.mContext, SleepSettingFragment.class, bundle, null);
        }
        SleepTrackHelper.INSTANCE.trackOpenAssistClick();
    }

    private final void requestAssistGuideIfNeed() {
        AllDaySleepReport allDaySleepReport = this.currentDayReport;
        if (allDaySleepReport == null) {
            return;
        }
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        Intrinsics.checkNotNull(allDaySleepReport);
        if (timeUtils.isToday(allDaySleepReport.getTime() * ((long) 1000))) {
            AllDaySleepReport allDaySleepReport2 = this.currentDayReport;
            Intrinsics.checkNotNull(allDaySleepReport2);
            if (allDaySleepReport2.getScore() > 0) {
                this.sleepInterface.requestShowSleepAssistGuide();
            }
        }
    }

    private final void showAccurateCard() {
        AllDaySleepReport allDaySleepReport = this.currentDayReport;
        if (allDaySleepReport == null) {
            return;
        }
        boolean z = this.dayWeekMonthPosition == 0;
        Intrinsics.checkNotNull(allDaySleepReport);
        int score = allDaySleepReport.getScore();
        ViewExtKt.setVisible(this.layoutAccurate, true);
        ViewExtKt.setVisible(this.layoutFuzzy, false);
        if (z) {
            this.tvAccurateTitle.setText(c0j.ai);
        } else {
            this.tvAccurateTitle.setText(c0j.Od);
        }
        this.tvScore.setText(String.valueOf(score));
        this.tvScoreUnit.setText(this.mContext.getResources().getQuantityText(qxi.R0, score));
        this.tvEvaluationResult.setText(SleepExtKt.getSleepAccurateEvaluation(this.mContext, score));
        this.tvEvaluationResult.setOnClickListener(new View.OnClickListener() { // from class: kwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepScoreEvaluationHolder.showAccurateCard$lambda$1(this.f24377a, view);
            }
        });
        updateAccurateScoreTip();
        SleepTrackHelper sleepTrackHelper = SleepTrackHelper.INSTANCE;
        AllDaySleepReport allDaySleepReport2 = this.currentDayReport;
        Intrinsics.checkNotNull(allDaySleepReport2);
        sleepTrackHelper.trackSleepEvaluationCard(true, allDaySleepReport2.getScore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAccurateCard$lambda$1(SleepScoreEvaluationHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AllDaySleepReport allDaySleepReport = this$0.currentDayReport;
        Intrinsics.checkNotNull(allDaySleepReport);
        this$0.gotoSleepQualityFragment(true, allDaySleepReport, this$0.preDaySleepReport);
    }

    private final void showFuzzyCard() {
        AllDaySleepReport allDaySleepReport = this.currentDayReport;
        if (allDaySleepReport == null) {
            return;
        }
        Intrinsics.checkNotNull(allDaySleepReport);
        int score = allDaySleepReport.getScore();
        ViewExtKt.setVisible(this.layoutAccurate, false);
        ViewExtKt.setVisible(this.layoutFuzzy, true);
        this.tvFuzzyTitle.setText(c0j.Xh);
        this.tvFuzzyEvaluation.setText(SleepExtKt.getSleepShortEvaluation(this.mContext, score));
        this.ivFuzzyEvaluationDetail.setOnClickListener(new View.OnClickListener() { // from class: jwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepScoreEvaluationHolder.showFuzzyCard$lambda$0(this.f23207a, view);
            }
        });
        SleepTrackHelper sleepTrackHelper = SleepTrackHelper.INSTANCE;
        AllDaySleepReport allDaySleepReport2 = this.currentDayReport;
        Intrinsics.checkNotNull(allDaySleepReport2);
        sleepTrackHelper.trackSleepEvaluationCard(false, allDaySleepReport2.getScore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFuzzyCard$lambda$0(SleepScoreEvaluationHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoSleepQualityFragment(false, null, null);
    }

    private final void updateAccurateScoreTip() {
        SpannableString spannableString;
        AllDaySleepReport allDaySleepReport;
        CharSequence spannableString2;
        AllDaySleepReport allDaySleepReport2 = this.currentDayReport;
        if (allDaySleepReport2 == null) {
            return;
        }
        Intrinsics.checkNotNull(allDaySleepReport2);
        Integer scoreOutperformedPercent = allDaySleepReport2.getScoreOutperformedPercent();
        if (scoreOutperformedPercent == null || scoreOutperformedPercent.intValue() < 0) {
            spannableString = null;
        } else {
            String string = this.mContext.getString(c0j.vh, scoreOutperformedPercent);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this.mContext.getString(c0j.Yh, string);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            spannableString = getSpannableString(string, string2);
        }
        if (checkHasRem(this.preDaySleepReport) && (allDaySleepReport = this.preDaySleepReport) != null) {
            Intrinsics.checkNotNull(allDaySleepReport);
            if (allDaySleepReport.getScore() > 0) {
                ViewExtKt.setVisible(this.tvAccurateScoreTip, true);
                AllDaySleepReport allDaySleepReport3 = this.currentDayReport;
                Intrinsics.checkNotNull(allDaySleepReport3);
                int score = allDaySleepReport3.getScore();
                AllDaySleepReport allDaySleepReport4 = this.preDaySleepReport;
                Intrinsics.checkNotNull(allDaySleepReport4);
                int score2 = score - allDaySleepReport4.getScore();
                if (score2 == 0) {
                    spannableString2 = ExtUtilKt.getString(c0j.Zh);
                } else {
                    String quantityString = this.mContext.getResources().getQuantityString(qxi.S0, Math.abs(score2), Integer.valueOf(Math.abs(score2)));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    String string3 = this.mContext.getString(score2 > 0 ? c0j.bi : c0j.Sh, quantityString);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    spannableString2 = getSpannableString(quantityString, string3);
                }
                if (spannableString == null) {
                    this.tvAccurateScoreTip.setText(spannableString2);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append(spannableString2);
                this.tvAccurateScoreTip.setText(spannableStringBuilder);
                return;
            }
        }
        if (spannableString == null || StringsKt__StringsKt.isBlank(spannableString)) {
            ViewExtKt.setVisible(this.tvAccurateScoreTip, false);
        } else {
            ViewExtKt.setVisible(this.tvAccurateScoreTip, true);
            this.tvAccurateScoreTip.setText(spannableString);
        }
    }

    public final void onResume() {
        requestAssistGuideIfNeed();
    }

    public final void refreshViewOnAssistGuideResult(boolean showGuide) {
        this.showAssistEnable = Boolean.valueOf(showGuide);
        if (showGuide) {
            showFuzzyCard();
            ViewExtKt.setVisible(this.viewDividerLine, true);
            ViewExtKt.setVisible(this.tvOpen, true);
            ViewExtKt.setVisible(this.tvOpenTip, true);
            this.tvOpen.setOnClickListener(new View.OnClickListener() { // from class: lwm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepScoreEvaluationHolder.refreshViewOnAssistGuideResult$lambda$2(this.f25503a, view);
                }
            });
            return;
        }
        if (checkHasRem(this.currentDayReport)) {
            showAccurateCard();
        } else {
            showFuzzyCard();
        }
        ViewExtKt.setVisible(this.viewDividerLine, false);
        ViewExtKt.setVisible(this.tvOpen, false);
        ViewExtKt.setVisible(this.tvOpenTip, false);
    }

    public final void updateReport(@Nullable AllDaySleepReport report, @Nullable AllDaySleepReport preReport) {
        AllDaySleepReport allDaySleepReport = this.currentDayReport;
        this.currentDayReport = report;
        this.preDaySleepReport = preReport;
        if (report == null || report.getScore() <= 0) {
            ViewExtKt.setVisible(this.tvEmpty, true);
            this.tvEmpty.setText(c0j.L6);
            ViewExtKt.setVisible(this.layoutAccurate, false);
            ViewExtKt.setVisible(this.layoutFuzzy, false);
            return;
        }
        ViewExtKt.setVisible(this.tvEmpty, false);
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        AllDaySleepReport allDaySleepReport2 = this.currentDayReport;
        Intrinsics.checkNotNull(allDaySleepReport2);
        if (!timeUtils.isToday(allDaySleepReport2.getTime() * ((long) 1000))) {
            if (checkHasRem(report)) {
                showAccurateCard();
                return;
            } else {
                showFuzzyCard();
                return;
            }
        }
        if (this.showAssistEnable != null) {
            AllDaySleepReport allDaySleepReport3 = this.currentDayReport;
            if (Intrinsics.areEqual(allDaySleepReport3 != null ? Long.valueOf(allDaySleepReport3.getTime()) : null, allDaySleepReport != null ? Long.valueOf(allDaySleepReport.getTime()) : null)) {
                Boolean bool = this.showAssistEnable;
                Intrinsics.checkNotNull(bool);
                refreshViewOnAssistGuideResult(bool.booleanValue());
                return;
            }
        }
        this.sleepInterface.requestShowSleepAssistGuide();
    }
}
