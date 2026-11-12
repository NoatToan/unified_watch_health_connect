package com.huawei.pluginachievement.ui.report;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.RecentWeekRecordFromDB;
import com.huawei.pluginachievement.manager.model.WeekAndMonthRecord;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.reportchart.HwHealthReportBarChart;
import defpackage.njy;
import defpackage.osa;
import defpackage.out;
import defpackage.ozk;
import defpackage.pad;
import defpackage.paj;
import defpackage.pal;
import defpackage.pat;
import defpackage.pav;
import defpackage.paw;
import defpackage.pbf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AchieveWeekReportActivity extends BaseReportActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f22262a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22263c;
    private HwHealthReportBarChart e;

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected int getContentType() {
        return 2;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected int getReportType() {
        return 1;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getClassName() {
        return PersonalData.CLASS_NAME_ACHIEVE_WEEK_REPORT_ACTIVITY;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getCachedMinReportNo() {
        return osa.e(this.mContext, "_weekMinReportNo");
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getCachedMaxReportNo() {
        return osa.e(this.mContext, "_weekReportNo");
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void initData() {
        this.mUsernameTextColor = this.mResource.getColor(R.color.achieve_week_report_nickname_text_color);
        super.initData();
        long jD = pal.d(1, 1, System.currentTimeMillis(), Utils.o());
        e(jD, pal.d(2, 1, System.currentTimeMillis(), Utils.o()));
        initBreakInfo(jD, getReportType());
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshMedalView(WeekAndMonthRecord weekAndMonthRecord) {
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "refreshMedalView currentRecord is null. return!");
            initMedalView(8);
            return;
        }
        RecentWeekRecordFromDB recentWeekRecordFromDBE = pav.e(weekAndMonthRecord);
        if (recentWeekRecordFromDBE == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "refreshViewFromDb weekRecord is null. return!");
            initMedalView(8);
            return;
        }
        ArrayList<String> arrayListAcquireMedalId = recentWeekRecordFromDBE.acquireMedalId();
        if (njy.e(arrayListAcquireMedalId)) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "refreshViewFromDb weekMedalIdList is empty. return!");
            initMedalView(8);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveWeekReportActivity", "refreshViewFromDb weekMedalIdListSize = ", Integer.valueOf(arrayListAcquireMedalId.size()));
            initMedalView(0);
            setMedalData(arrayListAcquireMedalId);
        }
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getNoReportHint() {
        return this.mResource.getString(R.string.IDS_plugin_achievement_no_weekly_report);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshExerciseTypeView(WeekAndMonthRecord weekAndMonthRecord) {
        String string;
        String str;
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "refreshExerciseTypeView currentRecord is null.");
            return;
        }
        List<ozk> listD = pbf.d(this, weekAndMonthRecord, 1);
        int size = listD.size();
        if (size <= 0) {
            this.mExerciseTypeItemLayout.setVisibility(8);
        } else {
            this.mExerciseTypeItemLayout.setVisibility(0);
        }
        if (size <= 1) {
            string = getString(R.string.IDS_report_exercise_type_desc1);
            str = "乐在其中";
        } else if (size <= 3) {
            string = getString(R.string.IDS_report_exercise_type_desc2);
            str = "不止一面";
        } else {
            string = getString(R.string.IDS_report_exercise_type_desc3);
            str = "多种快乐";
        }
        if (LanguageUtil.l(this)) {
            this.mReportExerciseTypeDec.setText(pat.c(string, str));
        } else {
            this.mReportExerciseTypeDec.setText(string);
        }
        this.mReportExerciseTypeTitle.setText(getString(R.string.IDS_report_week_exercise_type));
        this.mReportTypePieChart.setSportCardViewData(pbf.a(this, listD), listD, 1);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshExerciseView(Context context, WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, pad padVar) {
        if (padVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "refreshExerciseView parameter is null.");
        } else {
            padVar.e(this.e);
            pav.d(context, weekAndMonthRecord, weekAndMonthRecord2, padVar);
        }
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshAchieveReportView(WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, Context context, pad padVar) {
        pav.c(context, weekAndMonthRecord, weekAndMonthRecord2, padVar);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshBarChart(WeekAndMonthRecord weekAndMonthRecord) {
        RecentWeekRecordFromDB recentWeekRecordFromDB;
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "refreshBarChart weekAndMonthRecord is null");
            if (this.mReportStepBarChart != null) {
                this.mReportStepBarChart.setVisibility(8);
                return;
            }
            return;
        }
        try {
            recentWeekRecordFromDB = (RecentWeekRecordFromDB) HiJsonUtil.d(weekAndMonthRecord.getValue(), RecentWeekRecordFromDB.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e("PLGACHIEVE_AchieveWeekReportActivity", "refreshBarChart JsonSyntaxException, e is ", e.getMessage());
            recentWeekRecordFromDB = null;
        }
        if (recentWeekRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "Report_refreshWeekBarChart recentWeekRecordFromDb is null");
        } else {
            c(recentWeekRecordFromDB);
        }
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected CharSequence getMedalNumbersText(int i) {
        String strE = UnitUtil.e(i, 1, 0);
        return pat.c(this.mResource.getQuantityString(R.plurals.IDS_report_week_medal_number, i, strE), strE);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getExerciseAvgCaloriesTitle() {
        return this.mResource.getString(R.string.IDS_report_avg_consume_cal);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getExerciseCaloriesTitleText() {
        return this.mResource.getString(R.string.IDS_track_total_calories);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void startHistoricalActivityForResult() {
        LogUtil.a("PLGACHIEVE_AchieveWeekReportActivity", "startHistoricalActivityForResult");
        Intent intent = new Intent(this, (Class<?>) AchieveHistoricalWeekReportActivity.class);
        intent.putExtra(BaseHistoricalReportActivity.EXTRA_KEY_REPORT_MAX_NUMBER, this.mMaxReportNo);
        intent.putExtra(BaseHistoricalReportActivity.EXTRA_KEY_REPORT_MIN_NUMBER, this.mMinReportNo);
        startActivityForResult(intent, 100);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "onActivityResult resultCode = ", Integer.valueOf(i2));
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveWeekReportActivity", "onActivityResult requestCode = ", Integer.valueOf(i));
        if (i != 100) {
            return;
        }
        if (intent == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "onActivityResult data is null.");
            return;
        }
        long longExtra = intent.getLongExtra(BaseHistoricalReportActivity.EXTRA_KEY_START_TIMESTAMP, System.currentTimeMillis());
        long longExtra2 = intent.getLongExtra(BaseHistoricalReportActivity.EXTRA_KEY_END_TIMESTAMP, System.currentTimeMillis());
        LogUtil.a("PLGACHIEVE_AchieveWeekReportActivity", "onActivityResult startTimestamp = ", Long.valueOf(longExtra), ", endTimestamp = ", Long.valueOf(longExtra2));
        b(longExtra, longExtra2);
    }

    private void b(long j, long j2) {
        long jD = pal.d(1, 0, j, Utils.o());
        long jD2 = pal.d(2, 0, j2, Utils.o());
        long jD3 = pal.d(1, 1, j, Utils.o());
        e(jD, jD2);
        initStepData(jD3, jD2);
        initBreakInfo(jD, getReportType());
    }

    private void c(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        super.initStepBarChartSet(paj.d(new ArrayList(8), recentWeekRecordFromDB, this.mIsRtlLanguage), pal.e(recentWeekRecordFromDB.acquireMonday(), Utils.o()), 10, recentWeekRecordFromDB.acquireMaxSteps());
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getReportRecentType() {
        return String.valueOf(1);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected long getBarChartEndTime() {
        return pal.d(2, 1, Utils.o());
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected long getBarChartStartTime() {
        return pal.d(1, 2, Utils.o());
    }

    private void e(long j, long j2) {
        String str = paw.d(j, 2) + " - " + paw.d(j2, 3);
        this.mReportIntervalDateText.setTextColor(this.mUsernameTextColor);
        this.mReportIntervalDateText.setText(str);
        this.mReportIntervalDateNoText.setTextColor(this.mUsernameTextColor);
        this.mReportIntervalDateNoText.setText(str);
        if (LanguageUtil.l(this.mContext)) {
            this.f22263c.setVisibility(8);
            this.f22262a.setVisibility(0);
        } else {
            this.f22262a.setVisibility(8);
            this.f22263c.setVisibility(0);
            this.f22263c.setText(this.mResource.getString(R.string.IDS_plugin_achievement_report_weekly));
        }
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getComparedStepTitleText() {
        return this.mResource.getString(R.string.IDS_report_compare_week_title);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getAvgDailyStepTitleText() {
        return this.mResource.getString(R.string.IDS_report_week_avg_day_step);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void setBreakInfoBg(ImageView imageView) {
        pal.b(imageView, "", "/sandbox/cch5/health/health-resource/achieve/report/img_report_week_break_info_big.png", this.mResource.getDrawable(R.drawable.img_report_week_break_info));
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void findViewsById() {
        this.f22262a = (ImageView) out.d(this, R.id.report_week_title_img);
        this.f22263c = (HealthTextView) out.d(this, R.id.week_title_text);
        pal.e(this.mReportHeadRootBackground, "/sandbox/cch5/health/health-resource/achieve/report/img_weekly_report_bg.jpg", "/sandbox/cch5/health/health-resource/achieve/report/img_weekly_report_bg_big.jpg", this.mResource.getDrawable(R.drawable.img_weekly_report_bg));
        this.e = (HwHealthReportBarChart) out.d(this, R.id.bar_chart_exercise_time);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void setMedalImageHeight(ImageView imageView, int i) {
        LogUtil.a("PLGACHIEVE_AchieveWeekReportActivity", "setMedalImageHeight() medalLength = ", Integer.valueOf(i));
        if (imageView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.addRule(10);
            layoutParams2.addRule(21);
            imageView.setLayoutParams(layoutParams2);
        }
        pal.e(imageView, "", "/sandbox/cch5/health/health-resource/achieve/report/achieve_week_report_more_medals_bg_low_big.png", this.mResource.getDrawable(R.drawable.achieve_week_report_more_medals_bg));
        c();
    }

    private void c() {
        int i;
        if (this.mMedalDescTextView == null) {
            LogUtil.j("PLGACHIEVE_AchieveWeekReportActivity", "setWeekMedalDescLayout() medalDescView is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mMedalDescTextView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (qrs.af(this.mContext)) {
            i = qrs.d(this.mContext, 50.0f);
        } else {
            i = (((qrs.i(this.mContext) + this.mResource.getDimensionPixelSize(R.dimen.defaultPaddingStart)) + this.mResource.getDimensionPixelSize(R.dimen.defaultPaddingEnd)) + this.mResource.getDimensionPixelSize(R.dimen.defaultCornerRadiusS)) / 3;
        }
        if (layoutParams2 == null) {
            return;
        }
        if (LanguageUtil.ba(this.mContext)) {
            layoutParams2.leftMargin = i;
        } else {
            layoutParams2.rightMargin = i;
        }
        this.mMedalDescTextView.setLayoutParams(layoutParams2);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        c();
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getSuccessShareBiValue() {
        return AnalyticsValue.SUCCESSES_SHARE_1100012.value();
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getCustomTitleBarText() {
        return this.mResource.getString(R.string.IDS_plugin_achievement_report_weekly);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected int getLayoutId() {
        return R.layout.activity_achieve_week_report;
    }
}
