package com.huawei.pluginachievement.ui.report;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.data.BarEntry;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.marketing.datatype.SingleMonth;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.RecentMonthRecordFromDB;
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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AchieveMonthReportActivity extends BaseReportActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f22253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22254c;
    private LinearLayout d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private ImageView i;
    private HealthTextView j;
    private HealthTextView k;
    private LinearLayout n;
    private HwHealthReportBarChart o;

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected int getContentType() {
        return 3;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected int getReportType() {
        return 0;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void findViewsById() {
        this.f22253b = (LinearLayout) out.d(this, R.id.report_month_title);
        this.h = (HealthTextView) out.d(this, R.id.month_text);
        this.i = (ImageView) out.d(this, R.id.month_title_image);
        this.f = (HealthTextView) out.d(this, R.id.month_title_text);
        this.g = (HealthTextView) out.d(this, R.id.report_month_desc);
        HealthTextView healthTextView = (HealthTextView) out.d(this, R.id.report_compared_exercise_total_time);
        this.e = healthTextView;
        healthTextView.setText(this.mResource.getString(R.string.IDS_report_compare_month_title));
        HealthTextView healthTextView2 = (HealthTextView) out.d(this, R.id.report_weekly_distribution_title);
        this.f22254c = healthTextView2;
        healthTextView2.setText(this.mResource.getString(R.string.IDS_report_weekly_distribution, this.mResource.getString(R.string.IDS_min)));
        this.n = (LinearLayout) out.d(this, R.id.report_weekly_distribution_percentage_view);
        this.f22252a = (HealthTextView) out.d(this, R.id.report_avg_compared_calorie);
        HealthTextView healthTextView3 = (HealthTextView) out.d(this, R.id.report_weekly_kcal_distribution_title);
        this.k = healthTextView3;
        healthTextView3.setText(this.mResource.getString(R.string.IDS_report_weekly_distribution, this.mResource.getString(R.string.IDS_band_data_sport_energy_unit)));
        this.o = (HwHealthReportBarChart) out.d(this, R.id.report_weekly_kcal_distribution_barchart);
        this.j = (HealthTextView) out.d(this, R.id.report_calorie_extension_layout_title);
        this.d = (LinearLayout) out.d(this, R.id.hw_health_report_extension_layout);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getClassName() {
        return PersonalData.CLASS_NAME_ACHIEVE_MONTH_REPORT_ACTIVITY;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getCachedMinReportNo() {
        return osa.e(this.mContext, "_monthMinReportNo");
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getCachedMaxReportNo() {
        return osa.e(this.mContext, "_monthReportNo");
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void initData() {
        long jC = pal.c(-1, System.currentTimeMillis(), 1);
        long jC2 = pal.c(-1, System.currentTimeMillis(), 2);
        this.mUsernameTextColor = a(jC);
        super.initData();
        a(jC, jC2);
        initBreakInfo(jC, getReportType());
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshMedalView(WeekAndMonthRecord weekAndMonthRecord) {
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "refreshMedalView currentRecord is null. return!");
            initMedalView(8);
            return;
        }
        RecentMonthRecordFromDB recentMonthRecordFromDBA = pav.a(weekAndMonthRecord);
        if (recentMonthRecordFromDBA == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "refreshMedalView monthRecord is null. return!");
            initMedalView(8);
            return;
        }
        ArrayList<String> arrayListAcquireMedalId = recentMonthRecordFromDBA.acquireMedalId();
        if (njy.e(arrayListAcquireMedalId)) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "refreshMedalView monthMedalIdList is empty. return!");
            initMedalView(8);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "refreshMedalView monthMedalIdListSize = ", Integer.valueOf(arrayListAcquireMedalId.size()));
            initMedalView(0);
            setMedalData(arrayListAcquireMedalId);
        }
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getNoReportHint() {
        return this.mResource.getString(R.string.IDS_plugin_achievement_no_monthly_report);
    }

    private int a(long j) {
        int iA = pal.a(j);
        if (iA != 1 && iA != 2) {
            switch (iA) {
                case 6:
                case 7:
                case 8:
                    return this.mResource.getColor(R.color.achieve_month_report_title_summer_text_color);
                case 9:
                case 10:
                case 11:
                    return this.mResource.getColor(R.color.achieve_month_report_title_autumn_text_color);
                case 12:
                    break;
                default:
                    return this.mResource.getColor(R.color.achieve_month_report_title_spring_text_color);
            }
        }
        return this.mResource.getColor(R.color.achieve_month_report_title_winter_text_color);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshExerciseTypeView(WeekAndMonthRecord weekAndMonthRecord) {
        String string;
        String str;
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "refreshExerciseTypeView currentRecord is null.");
            return;
        }
        List<ozk> listD = pbf.d(this, weekAndMonthRecord, 0);
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
        this.mReportExerciseTypeTitle.setText(getString(R.string.IDS_report_month_exercise_type));
        this.mReportTypePieChart.setSportCardViewData(pbf.a(this, listD), listD, 0);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshExerciseView(Context context, WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, pad padVar) {
        if (padVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "refreshExerciseView parameter is null!");
            return;
        }
        padVar.e(this.n);
        padVar.e(this.f22252a);
        padVar.l(this.k);
        padVar.c(this.o);
        padVar.d(this.j);
        padVar.b(this.d);
        pav.a(context, weekAndMonthRecord, weekAndMonthRecord2, padVar);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshAchieveReportView(WeekAndMonthRecord weekAndMonthRecord, WeekAndMonthRecord weekAndMonthRecord2, Context context, pad padVar) {
        pav.e(context, weekAndMonthRecord, weekAndMonthRecord2, padVar);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void refreshBarChart(WeekAndMonthRecord weekAndMonthRecord) {
        RecentMonthRecordFromDB recentMonthRecordFromDB;
        if (weekAndMonthRecord == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "refreshBarChart weekAndMonthRecord is null");
            this.mReportStepBarChart.setVisibility(8);
            if (this.mReportStepGoalText == null || this.mReportStepGoalText.getVisibility() == 8) {
                return;
            }
            this.mReportStepGoalText.setVisibility(8);
            return;
        }
        try {
            recentMonthRecordFromDB = (RecentMonthRecordFromDB) HiJsonUtil.d(weekAndMonthRecord.getValue(), RecentMonthRecordFromDB.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e("PLGACHIEVE_AchieveMonthReportActivity", "refreshBarChart JsonSyntaxException, exception is ", e.getMessage());
            recentMonthRecordFromDB = null;
        }
        if (recentMonthRecordFromDB == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "refreshBarChart recentMonthRecordFromDb is null");
        } else {
            b(recentMonthRecordFromDB);
        }
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected CharSequence getMedalNumbersText(int i) {
        String strE = UnitUtil.e(i, 1, 0);
        return pat.c(this.mResource.getQuantityString(R.plurals.IDS_report_month_medal_number, i, strE), strE);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getExerciseAvgCaloriesTitle() {
        return this.mResource.getString(R.string.IDS_fitness_average_calorie_data_title);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getExerciseCaloriesTitleText() {
        return this.mResource.getString(R.string.IDS_track_total_calories);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void setBreakInfoBg(ImageView imageView) {
        pal.b(imageView, "", "/sandbox/cch5/health/health-resource/achieve/report/img_report_month_break_info_big.png", this.mResource.getDrawable(R.drawable.img_report_month_break_info));
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void startHistoricalActivityForResult() {
        LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "startHistoricalActivityForResult");
        Intent intent = new Intent(this, (Class<?>) AchieveHistoricalMonthReportActivity.class);
        intent.putExtra(BaseHistoricalReportActivity.EXTRA_KEY_REPORT_MAX_NUMBER, this.mMaxReportNo);
        intent.putExtra(BaseHistoricalReportActivity.EXTRA_KEY_REPORT_MIN_NUMBER, this.mMinReportNo);
        startActivityForResult(intent, 100);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "onActivityResult resultCode ", Integer.valueOf(i2));
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "onActivityResult requestCode ", Integer.valueOf(i));
        if (i != 100) {
            return;
        }
        if (intent == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "onActivityResult data is null.");
            return;
        }
        long longExtra = intent.getLongExtra(BaseHistoricalReportActivity.EXTRA_KEY_START_TIMESTAMP, System.currentTimeMillis());
        LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "onActivityResult startTimestamp = ", Long.valueOf(longExtra));
        c(longExtra);
    }

    private void c(long j) {
        long jC = pal.c(0, j, 1);
        long jC2 = pal.c(0, j, 2);
        long jC3 = pal.c(-1, j, 1);
        this.mUsernameTextColor = a(jC);
        if (this.mUsernameText != null) {
            this.mUsernameText.setTextColor(this.mUsernameTextColor);
        }
        a(jC, jC2);
        initStepData(jC3, jC2);
        initBreakInfo(jC, getReportType());
    }

    private void b(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        List<BarEntry> listA = paj.a(new ArrayList(31), recentMonthRecordFromDB, this.mIsRtlLanguage);
        long jAcquireFirstday = recentMonthRecordFromDB.acquireFirstday();
        long jAcquireLastDay = recentMonthRecordFromDB.acquireLastDay();
        super.initStepBarChartSet(listA, pal.d(jAcquireFirstday, jAcquireLastDay), 4, recentMonthRecordFromDB.acquireMaxSteps());
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getReportRecentType() {
        return String.valueOf(2);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected long getBarChartEndTime() {
        return pal.c(-1, System.currentTimeMillis(), 2);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected long getBarChartStartTime() {
        return pal.c(-2, System.currentTimeMillis(), 1);
    }

    private void a(long j, long j2) {
        String str = paw.d(j, 2) + " - " + paw.d(j2, 3);
        this.mReportIntervalDateText.setTextColor(this.mUsernameTextColor);
        this.mReportIntervalDateText.setText(str);
        this.mReportIntervalDateNoText.setTextColor(this.mUsernameTextColor);
        this.mReportIntervalDateNoText.setText(str);
        if (LanguageUtil.l(this.mContext)) {
            this.f22253b.setVisibility(0);
            this.f.setVisibility(8);
            this.i.setImageDrawable(e(j));
            this.h.setTextColor(this.mUsernameTextColor);
            this.h.setTypeface(Typeface.createFromAsset(this.mContext.getAssets(), "fonts/hw-italic.ttf"));
            this.h.setText(String.valueOf(pal.a(j)) + " ");
        } else {
            this.f22253b.setVisibility(8);
            this.f.setVisibility(0);
            String str2 = paw.d(j, 5) + " | " + this.mContext.getString(R.string.IDS_plugin_achievement_report_monthly) + " ";
            this.f.setTextColor(this.mUsernameTextColor);
            this.f.setText(str2);
        }
        List<SingleMonth> listB = pal.b();
        final int iA = pal.a(j);
        if (njy.b(listB)) {
            LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "singleMonths is isNotEmpty.");
            e(this.mReportHeadRootBackground, this.g, listB, iA);
        } else {
            pal.b(new AchieveCallback() { // from class: com.huawei.pluginachievement.ui.report.AchieveMonthReportActivity.5
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i, final Object obj) {
                    AchieveMonthReportActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.pluginachievement.ui.report.AchieveMonthReportActivity.5.4
                        @Override // java.lang.Runnable
                        public void run() {
                            AchieveMonthReportActivity.this.e(iA, obj);
                        }
                    });
                }
            });
        }
        this.g.setVisibility(0);
        this.g.setTextColor(this.mUsernameTextColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void e(int i, T t) {
        if (this.g == null) {
            return;
        }
        if (!(t instanceof List)) {
            c(i);
            return;
        }
        List<SingleMonth> list = (List) t;
        if (njy.e(list)) {
            c(i);
        } else {
            e(this.mReportHeadRootBackground, this.g, list, i);
        }
    }

    private void c(int i) {
        LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "singleMonths is initBackgroundDefault.");
        a(this.mReportHeadRootBackground, i);
        this.g.setText(pat.d(this.mContext, i));
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getComparedStepTitleText() {
        return this.mResource.getString(R.string.IDS_report_compare_month_title);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getAvgDailyStepTitleText() {
        return this.mResource.getString(R.string.IDS_report_month_avg_day_step);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected void setMedalImageHeight(ImageView imageView, int i) {
        LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "setMedalImageHeight() medalLength ", Integer.valueOf(i));
        if (imageView == null) {
            LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "medalItemBackground is null");
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(10);
            layoutParams2.addRule(12);
            imageView.setLayoutParams(layoutParams2);
        }
        pal.b(imageView, "", "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_more_medals_bg_low_big.png", this.mResource.getDrawable(R.drawable.achieve_month_report_more_medals_bg));
        ViewGroup.LayoutParams layoutParams3 = this.mMedalRecyclerView.getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            if (i >= 4) {
                layoutParams4.bottomMargin = qrs.d(this.mContext, 160.0f);
                this.mMedalRecyclerView.setLayoutParams(layoutParams4);
            } else {
                layoutParams4.bottomMargin = qrs.d(this.mContext, 80.0f);
                this.mMedalRecyclerView.setLayoutParams(layoutParams4);
            }
        }
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getSuccessShareBiValue() {
        return AnalyticsValue.SUCCESSES_SHARE_1100013.value();
    }

    private Drawable e(long j) {
        int iA = pal.a(j);
        if (iA != 1 && iA != 2) {
            switch (iA) {
                case 6:
                case 7:
                case 8:
                    return this.mResource.getDrawable(R.drawable.achieve_month_report_summer_text);
                case 9:
                case 10:
                case 11:
                    return this.mResource.getDrawable(R.drawable.achieve_month_report_autumn_text);
                case 12:
                    break;
                default:
                    return this.mResource.getDrawable(R.drawable.achieve_month_report_spring_text);
            }
        }
        return this.mResource.getDrawable(R.drawable.achieve_month_report_winter_text);
    }

    private void a(ImageView imageView, int i) {
        if (i != 1 && i != 2) {
            switch (i) {
                case 6:
                case 7:
                case 8:
                    pal.e(imageView, "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_summer_bg.png", "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_summer_bg_big.jpg", this.mResource.getDrawable(R.drawable.achieve_month_report_summer_bg));
                    break;
                case 9:
                case 10:
                case 11:
                    pal.e(imageView, "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_autumn_bg.png", "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_autumn_bg_big.jpg", this.mResource.getDrawable(R.drawable.achieve_month_report_autumn_bg));
                    break;
                case 12:
                    break;
                default:
                    pal.e(imageView, "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_spring_bg.png", "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_spring_bg_big.jpg", this.mResource.getDrawable(R.drawable.achieve_month_report_spring_bg));
                    break;
            }
            return;
        }
        pal.e(imageView, "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_winter_bg.png", "/sandbox/cch5/health/health-resource/achieve/report/achieve_month_report_winter_bg_big.jpg", this.mResource.getDrawable(R.drawable.achieve_month_report_winter_bg));
    }

    private void e(ImageView imageView, HealthTextView healthTextView, List<SingleMonth> list, int i) {
        if (njy.e(list) || b(imageView, healthTextView, list, i)) {
            return;
        }
        c(i);
    }

    private boolean b(ImageView imageView, HealthTextView healthTextView, List<SingleMonth> list, int i) {
        if (njy.e(list)) {
            return false;
        }
        for (SingleMonth singleMonth : list) {
            if (i == singleMonth.getMonth()) {
                LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "singleMonths isContainMonth month ", Integer.valueOf(i));
                if (TextUtils.isEmpty(singleMonth.getPicture()) && TextUtils.isEmpty(singleMonth.getTheme())) {
                    return false;
                }
                if (TextUtils.isEmpty(singleMonth.getPicture())) {
                    LogUtil.j("PLGACHIEVE_AchieveMonthReportActivity", "singleMonths getPicture || getTahitiPicture || getTheme isEmpty!");
                    a(this.mReportHeadRootBackground, i);
                } else {
                    e(imageView, i, singleMonth);
                }
                if (TextUtils.isEmpty(singleMonth.getTheme())) {
                    healthTextView.setText(pat.d(this.mContext, i));
                    return true;
                }
                healthTextView.setText(singleMonth.getTheme());
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    private void e(ImageView imageView, int i, SingleMonth singleMonth) {
        Drawable drawable;
        if (i != 1 && i != 2) {
            switch (i) {
                case 6:
                case 7:
                case 8:
                    drawable = ContextCompat.getDrawable(this.mContext, R.drawable.achieve_month_report_summer_bg);
                    break;
                case 9:
                case 10:
                case 11:
                    drawable = ContextCompat.getDrawable(this.mContext, R.drawable.achieve_month_report_autumn_bg);
                    break;
                case 12:
                    drawable = ContextCompat.getDrawable(this.mContext, R.drawable.achieve_month_report_winter_bg);
                    break;
                default:
                    drawable = ContextCompat.getDrawable(this.mContext, R.drawable.achieve_month_report_spring_bg);
                    break;
            }
        } else {
            drawable = ContextCompat.getDrawable(this.mContext, R.drawable.achieve_month_report_winter_bg);
        }
        String tahitiPicture = singleMonth.getTahitiPicture();
        if (TextUtils.isEmpty(tahitiPicture)) {
            tahitiPicture = singleMonth.getPicture();
        }
        LogUtil.a("PLGACHIEVE_AchieveMonthReportActivity", "singleMonths isContainMonth picture ", singleMonth.getPicture());
        pal.a(imageView, singleMonth.getPicture(), tahitiPicture, drawable);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected String getCustomTitleBarText() {
        return this.mResource.getString(R.string.IDS_plugin_achievement_report_monthly);
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity
    protected int getLayoutId() {
        return R.layout.activity_achieve_month_report;
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pal.e();
    }

    @Override // com.huawei.pluginachievement.ui.report.BaseReportActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
