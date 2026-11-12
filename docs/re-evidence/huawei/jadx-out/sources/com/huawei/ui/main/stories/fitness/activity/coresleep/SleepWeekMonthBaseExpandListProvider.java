package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hms.network.embedded.a2;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.main.R;
import defpackage.fso;
import defpackage.fsr;
import defpackage.gxi;
import defpackage.gxl;
import defpackage.gxn;
import defpackage.gxo;
import defpackage.gxp;
import defpackage.gxq;
import defpackage.njy;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.uck;
import defpackage.uik;
import defpackage.uyr;
import defpackage.wud;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class SleepWeekMonthBaseExpandListProvider extends SleepBaseExpandListProvider {
    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected boolean isEffectiveDate() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (gxq) obj);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected String getTag() {
        return "SleepWeekMonthBaseExpandListProvider";
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void setSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        setProviderActive(gxqVar);
        sectionBean.d(this, gxqVar);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        super.parseParams(context, map, gxqVar);
        map.put("REPORT_TEXT", b(gxqVar));
        map.put("IS_WEEK_MONTH_TAB", true);
    }

    private String c(gxq gxqVar) {
        int iV;
        int iY;
        int iBu;
        if (gxqVar == null) {
            LogUtil.j("SleepWeekMonthBaseExpandListProvider", "sleepVeiwData is null");
            return "";
        }
        int i = AnonymousClass1.f26866a[gxqVar.n().ordinal()];
        if (i == 1) {
            iV = ((gxl) gxqVar.b()).v();
            iY = ((gxl) gxqVar.b()).y();
        } else if (i == 2) {
            iV = ((gxn) gxqVar.h()).ac();
            iY = ((gxn) gxqVar.h()).ad();
        } else {
            if (i == 3) {
                iV = ((gxo) gxqVar.g()).al() + ((gxo) gxqVar.g()).ak();
                iY = ((gxo) gxqVar.g()).an();
            } else if (i != 4) {
                LogUtil.j("SleepWeekMonthBaseExpandListProvider", "other sleep types");
                iBu = 0;
            } else {
                iBu = isAASMVersion() ? ((gxp) gxqVar.k()).bu() : ((gxp) gxqVar.k()).bw();
                int iBn = ((gxp) gxqVar.k()).bn();
                int iBr = ((gxp) gxqVar.k()).br();
                if (!((gxp) gxqVar.k()).bx()) {
                    iBu = iBn + iBu + iBr;
                }
            }
            double d = iBu;
            return qre.e(R.plurals.IDS_user_profile_achieve_num_day, iBu, UnitUtil.e(d, 1, 0)).replace("%s", UnitUtil.e(d, 1, 0));
        }
        iBu = iV + iY;
        double d2 = iBu;
        return qre.e(R.plurals.IDS_user_profile_achieve_num_day, iBu, UnitUtil.e(d2, 1, 0)).replace("%s", UnitUtil.e(d2, 1, 0));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepWeekMonthBaseExpandListProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26866a;

        static {
            int[] iArr = new int[SleepViewConstants.SleepTypeEnum.values().length];
            f26866a = iArr;
            try {
                iArr[SleepViewConstants.SleepTypeEnum.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26866a[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26866a[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26866a[SleepViewConstants.SleepTypeEnum.SCIENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private boolean e(gxq gxqVar) {
        return ((b(gxqVar.k()) + b(gxqVar.b())) + b(gxqVar.g())) + b(gxqVar.h()) > 1;
    }

    private int b(gxi gxiVar) {
        return gxiVar.n() ? 1 : 0;
    }

    public String b(gxq gxqVar) {
        if (gxqVar == null || gxqVar.q()) {
            ReleaseLogUtil.e("R_Sleep_SleepWeekMonthBaseExpandListProvider", "sleepViewData is null or onlyNotCountSleep");
            return "";
        }
        if (!e(gxqVar)) {
            ReleaseLogUtil.e("R_Sleep_SleepWeekMonthBaseExpandListProvider", "is not type mixed");
            return a(gxqVar);
        }
        int i = AnonymousClass1.f26866a[gxqVar.n().ordinal()];
        if (i == 1) {
            return qre.a(R.string.IDS_hw_sleep_week_count, qre.f(R.string.IDS_manual_sleep_wear_normal_sleep), c(gxqVar));
        }
        if (i == 2) {
            return qre.a(R.string.IDS_hw_sleep_week_count, qre.f(R.string.IDS_manual_sleep_manual_sleep_input), c(gxqVar));
        }
        if (i == 3) {
            return qre.a(R.string.IDS_hw_sleep_week_count, qre.f(R.string.IDS_manual_sleep_instruction_phone), c(gxqVar));
        }
        if (i == 4) {
            return a(gxqVar);
        }
        ReleaseLogUtil.e("R_Sleep_SleepWeekMonthBaseExpandListProvider", "unknow sleep type: ", gxqVar.n());
        return "";
    }

    private String a(gxq gxqVar) {
        if (!((gxp) gxqVar.k()).bx()) {
            if (!e(gxqVar)) {
                return "";
            }
            return qre.a(R.string.IDS_hw_sleep_week_count, qre.f(R.string.IDS_sleep_sleep_wear_core), c(gxqVar));
        }
        if (isAASMVersion()) {
            return qre.a(R.string.IDS_hw_sleep_week_aasm_count, c(gxqVar));
        }
        return qre.a(R.string.IDS_hw_sleep_week_core_count, c(gxqVar));
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void updateDataUi() {
        if (this.mSleepViewData == null) {
            LogUtil.j(getTag(), "updateDataUi mSleepViewData null");
            return;
        }
        int i = AnonymousClass1.f26866a[this.mSleepViewData.n().ordinal()];
        if (i == 1) {
            LogUtil.a(getTag(), "common sleep");
            h();
        } else if (i == 2) {
            LogUtil.a(getTag(), "manual sleep");
            f();
        } else if (i == 3) {
            LogUtil.a(getTag(), "phone sleep");
            l();
        } else if (i == 4) {
            LogUtil.a(getTag(), "core sleep");
            i();
        } else {
            LogUtil.a(getTag(), "other sleep types unknown");
        }
        sortBeanList();
    }

    public static View e(Context context) {
        if (qrs.y()) {
            return LayoutInflater.from(context).inflate(R.layout.sleep_detail_item_layout_large_mode, (ViewGroup) null);
        }
        return LayoutInflater.from(context).inflate(R.layout.expand_report_ext_item_layout, (ViewGroup) null);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void handleTruSleepData(CharSequence[] charSequenceArr, SleepBaseExpandListProvider.c cVar) {
        if (cVar == null || njy.e(charSequenceArr, 3)) {
            return;
        }
        charSequenceArr[1] = "";
        String strF = qre.f(R.string.IDS_physiological_index_invalid);
        if (getSleepStatData().d(cVar.f26766c)) {
            if ("TRUSLEEP_FIVE_SpO2".equals(cVar.f26766c)) {
                strF = uck.e(uyr.g.get(cVar.f26766c).intValue(), cVar.d[0], cVar.d[1]);
            } else {
                strF = qre.e(uyr.g.get(cVar.f26766c).intValue(), cVar.d[1], UnitUtil.e(cVar.d[0], 1, 0), UnitUtil.e(cVar.d[1], 1, 0));
            }
        }
        SpannableString spannableString = new SpannableString(strF);
        qri.c(spannableString, qre.a(R.string.IDS_base_line_percent, UnitUtil.e(cVar.d[0], 1, 0), UnitUtil.e(cVar.d[1], 1, 0)), qre.b(R.dimen.health_common_24sp));
        charSequenceArr[2] = spannableString;
        charSequenceArr[3] = "";
    }

    private void i() {
        LogUtil.a(getTag(), "processWeekAndMonthData");
        if (this.mSleepViewData.k().i() > 0) {
            g();
        }
        if (this.mSleepViewData.k().ar() > 0) {
            this.mExpandReportListBean.b(new fso(BaseApplication.getContext().getString(R.string.IDS_fitness_core_sleep_avg_noontime_sleep_new), a(this.mSleepViewData.k().ar(), 13, 13), this.mArrowRes, new View.OnClickListener() { // from class: ubi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(view);
                }
            }).a(uyr.f50749c.get("NOON_SLEEP").intValue()));
        }
    }

    public /* synthetic */ void d(View view) {
        a(this.mSleepViewData.k().ar());
    }

    private void g() {
        if (this.mWeakRef == null) {
            LogUtil.a(getTag(), "updateCoreSleepDetailList, mWeakRef is invalid");
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        if (knitSleepDetailActivity == null) {
            LogUtil.j(getTag(), "updateCoreSleepDetailList, context is invalid");
            return;
        }
        f(knitSleepDetailActivity);
        if (this.mSleepViewData.k().bh() || getSleepStatData().bh()) {
            this.mExpandReportListBean.e(e().d(uyr.f50749c.get("TRUSLEEP_FIVE_BREATH_RATE").intValue()));
            this.mExpandReportListBean.e(a().d(uyr.f50749c.get("TRUSLEEP_FIVE_HEART_RATE").intValue()));
            this.mExpandReportListBean.e(b().d(uyr.f50749c.get("TRUSLEEP_FIVE_HRV").intValue()));
            this.mExpandReportListBean.e(d().d(uyr.f50749c.get("TRUSLEEP_FIVE_SpO2").intValue()));
        } else {
            this.mExpandReportListBean.b(getSleepPhysiologicalItem(knitSleepDetailActivity, "SLEEP_HEART_RATE").a(uyr.f50749c.get("SLEEP_HEART_RATE").intValue()));
            this.mExpandReportListBean.b(getSleepPhysiologicalItem(knitSleepDetailActivity, "SLEEP_BLOOD_OX").a(uyr.f50749c.get("SLEEP_BLOOD_OX").intValue()));
            this.mExpandReportListBean.b(getSleepPhysiologicalItem(knitSleepDetailActivity, "SLEEP_BREATH_RATIO").a(uyr.f50749c.get("SLEEP_BREATH_RATIO").intValue()));
        }
        this.mExpandReportListBean.e(a(knitSleepDetailActivity).d(uyr.f50749c.get("GO_BED_REGULARITY").intValue()));
        this.mExpandReportListBean.e(c(knitSleepDetailActivity).d(uyr.f50749c.get("FALL_ASLEEP_TIME").intValue()));
        this.mExpandReportListBean.e(d(knitSleepDetailActivity).d(uyr.f50749c.get("OFF_BED_REGULARITY").intValue()));
        this.mExpandReportListBean.e(i(knitSleepDetailActivity).d(uyr.f50749c.get("WAKE_UP_TIME").intValue()));
    }

    private void f(Context context) {
        int i = isAASMVersion() ? R.string.IDS_hw_aasm_label_sleep_deepsleep_mean_rate : R.string.IDS_fitness_core_sleep_avg_deep_sleep_percent_new;
        int i2 = isAASMVersion() ? R.string.IDS_hw_aasm_label_sleep_shallowsleep_mean_rate : R.string.IDS_fitness_core_sleep_avg_light_sleep_percent_new;
        int i3 = isAASMVersion() ? R.string.IDS_hw_aasm_label_sleep_rem_mean_rate : R.string.IDS_fitness_core_sleep_avg_rem_sleep_percent_new;
        this.mExpandReportListBean.e(getCoreNightSleepBean(context, R.string.IDS_fitness_core_sleep_avg_night_sleep_new).d(uyr.f50749c.get("SLEEP_DURATION").intValue()));
        this.mExpandReportListBean.e(getDeepSleepBean(context, i).d(uyr.f50749c.get("DEEP_RATIO").intValue()));
        this.mExpandReportListBean.e(getLightSleepBean(context, i2).d(uyr.f50749c.get("SHALLOW_RATIO").intValue()));
        this.mExpandReportListBean.e(getRemSleepBean(context, i3).d(uyr.f50749c.get("REM_RATIO").intValue()));
        this.mExpandReportListBean.e(getDeepSleepContinuityBean(context, R.string.IDS_fitness_core_sleep_avg_deep_sleep_continuity_new).d(uyr.f50749c.get("DEEP_CONT").intValue()));
        this.mExpandReportListBean.e(getWakeTimesBean(context, R.string.IDS_fitness_core_sleep_sleep_avg_latency_time_new).d(uyr.f50749c.get("AWAKE_NUMS").intValue()));
        this.mExpandReportListBean.e(getBreathQualityBean(context, R.string.IDS_fitness_core_sleep_avg_rdi_score_new).d(uyr.f50749c.get("BREATH_QUALITY").intValue()));
        if (isAASMVersion()) {
            this.mExpandReportListBean.e(getSleepStableRateBean(context, R.string.IDS_hw_aasm_label_sleep_stable_mean_rate).d(uyr.f50749c.get("STABLE_SLEEP_RATIO_ALERT").intValue()));
        }
    }

    private fsr e() {
        gxp sleepStatData = getSleepStatData();
        return d(sleepStatData.bl(), sleepStatData.bj(), "TRUSLEEP_FIVE_BREATH_RATE", sleepStatData);
    }

    private fsr d(int i, int i2, String str, gxp gxpVar) {
        String strA = qre.a(uyr.i.get(str).intValue(), "");
        String strF = qre.f(R.string.IDS_physiological_index_invalid);
        if (gxpVar.d(str)) {
            if ("TRUSLEEP_FIVE_SpO2".equals(str)) {
                strF = uck.e(uyr.g.get(str).intValue(), i, i2);
            } else {
                strF = qre.e(uyr.g.get(str).intValue(), i2, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0));
            }
        }
        return new fsr(strA, "", strF, qre.e(R.color.health_secondary_color), this.mArrowRes, new SleepBaseExpandListProvider.d(this, getTag()).b(str, new int[]{i, i2}, 0, "", 0));
    }

    private fsr a() {
        gxp sleepStatData = getSleepStatData();
        return d(sleepStatData.bo(), sleepStatData.bi(), "TRUSLEEP_FIVE_HEART_RATE", sleepStatData);
    }

    private fsr b() {
        gxp sleepStatData = getSleepStatData();
        return d(sleepStatData.bq(), sleepStatData.bm(), "TRUSLEEP_FIVE_HRV", sleepStatData);
    }

    private fsr d() {
        gxp sleepStatData = getSleepStatData();
        return d(sleepStatData.bp(), sleepStatData.bk(), "TRUSLEEP_FIVE_SpO2", sleepStatData);
    }

    private void l() {
        LogUtil.a(getTag(), "updatePhoneDataUi");
        if (this.mWeakRef == null) {
            LogUtil.a(getTag(), "updateMannerSleepDataUi, mWeakRef is invalid");
        } else if (this.mWeakRef.get() == null) {
            LogUtil.a(getTag(), "updateMannerSleepDataUi, context == null");
        } else {
            j();
        }
    }

    private void j() {
        LogUtil.a(getTag(), "processWeekAndMonthPhoneData mTotalDaySleepTime ", Integer.valueOf(this.mSleepViewData.g().u()));
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        if (this.mSleepViewData.g().u() > 0) {
            this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_fitness_core_sleep_avg_noontime_sleep_new), a(this.mSleepViewData.g().u(), 13, 13), this.mArrowRes, new View.OnClickListener() { // from class: ubl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.e(view);
                }
            }).a(uyr.f50749c.get("NOON_SLEEP").intValue()));
        }
        if (this.mSleepViewData.g().i() > 0) {
            this.mExpandReportListBean.e(getSleepEfficientBean(knitSleepDetailActivity, getSleepEfficientValue(), R.string.IDS_avg_sleep_efficiency_new).d(uyr.f50749c.get("SLEEP_EFFICIENCY").intValue()));
            this.mExpandReportListBean.e(getBedTimeBean(getBedTime(), R.string.IDS_manual_sleep_average_bed_duration_new).d(uyr.f50749c.get("BED_TIME").intValue()));
            this.mExpandReportListBean.e(getSleepTimeBean(getItemTitle(c()[1], getFormatTime(c()[0] / 60, c()[0] % 60)), c()[0]).d(uyr.f50749c.get("SLEEP_DURATION").intValue()));
            this.mExpandReportListBean.e(c(knitSleepDetailActivity).d(uyr.f50749c.get("FALL_ASLEEP_TIME").intValue()));
            this.mExpandReportListBean.e(i(knitSleepDetailActivity).d(uyr.f50749c.get("WAKE_UP_TIME").intValue()));
            this.mExpandReportListBean.e(getSleepLatencyBean(getSleepLatency(), R.string.IDS_avg_sleep_latency_new).d(uyr.f50749c.get("SLEEP_LATENCY").intValue()));
            this.mExpandReportListBean.e(a(knitSleepDetailActivity).d(uyr.f50749c.get("GO_BED_REGULARITY").intValue()));
            this.mExpandReportListBean.e(d(knitSleepDetailActivity).d(uyr.f50749c.get("OFF_BED_REGULARITY").intValue()));
            this.mExpandReportListBean.e(getWakeTimesBean(knitSleepDetailActivity, R.string.IDS_fitness_core_sleep_sleep_avg_latency_time_new).d(uyr.f50749c.get("AWAKE_NUMS").intValue()));
        }
    }

    public /* synthetic */ void e(View view) {
        a(this.mSleepViewData.g().u());
    }

    private void a(int i) {
        int i2 = i % 60;
        String strE = UnitUtil.e(((double) (i - i2)) / 60.0d, 1, 0);
        String strE2 = UnitUtil.e(i2, 1, 0);
        ArrayList arrayList = (ArrayList) new uik().f();
        if (this.mWeakRef == null || this.mWeakRef.get() == null) {
            LogUtil.a(getTag(), "gotoDayNoonSleepActivity, mWeakRef is invalid");
        } else {
            DaySleepActivity.d(this.mWeakRef.get(), strE, strE2, getDaySleepStatus(i), arrayList);
        }
    }

    private String a(int i, int i2, int i3) {
        if (i == 0) {
            return "";
        }
        int i4 = i / 60;
        int i5 = i % 60;
        String strE = UnitUtil.e(i4, 1, 0);
        String strE2 = UnitUtil.e(i5, 1, 0);
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_min_unit, i5, strE2);
        if (i4 != 0) {
            quantityString = BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_two_parts, BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hour_unit, i4, strE), quantityString);
        }
        a(new SpannableString(quantityString), quantityString.indexOf(strE2), quantityString.indexOf(strE), strE2.length(), strE.length(), i3, i2);
        return quantityString;
    }

    private void a(SpannableString spannableString, int i, int i2, int i3, int i4, int i5, int i6) {
        if (spannableString == null || spannableString.length() == 0) {
            return;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(i6, true), 0, spannableString.length(), 17);
        if (i >= 0) {
            int i7 = i3 + i;
            spannableString.setSpan(new AbsoluteSizeSpan(i5, true), i, i7, 17);
            spannableString.setSpan(Typeface.create(Constants.FONT, 0), i, i7, 17);
        }
        if (i2 >= 0) {
            int i8 = i4 + i2;
            spannableString.setSpan(new AbsoluteSizeSpan(i5, true), i2, i8, 17);
            spannableString.setSpan(Typeface.create(Constants.FONT, 0), i2, i8, 17);
        }
    }

    private void h() {
        LogUtil.a(getTag(), "updateCommonTotalDataUi");
        int iP = this.mSleepViewData.b().p();
        this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_fitness_core_sleep_sleep_avg_latency_time_new), qre.e(R.plurals.IDS_details_awake_times, iP, Integer.valueOf(iP)), -1, null).a(uyr.f50749c.get("AWAKE_NUMS").intValue()));
    }

    private void f() {
        LogUtil.a(getTag(), "updateMannerSleepDataUi");
        if (this.mWeakRef == null) {
            LogUtil.a(getTag(), "updateMannerSleepDataUi, mWeakRef is invalid");
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        if (knitSleepDetailActivity == null) {
            LogUtil.a(getTag(), "updateMannerSleepDataUi, context == null");
        } else {
            j(knitSleepDetailActivity);
        }
    }

    private void j(Context context) {
        this.mExpandReportListBean.e(getSleepEfficientBean(context, getSleepEfficientValue(), R.string.IDS_avg_sleep_efficiency_new).d(uyr.f50749c.get("SLEEP_EFFICIENCY").intValue()));
        this.mExpandReportListBean.e(getBedTimeBean(getBedTime(), R.string.IDS_manual_sleep_average_bed_duration_new).d(uyr.f50749c.get("BED_TIME").intValue()));
        this.mExpandReportListBean.e(getSleepTimeBean(getItemTitle(c()[1], getFormatTime(c()[0] / 60, c()[0] % 60)), c()[0]).d(uyr.f50749c.get("SLEEP_DURATION").intValue()));
        this.mExpandReportListBean.e(b(context).d(uyr.f50749c.get("GO_BED_TIME").intValue()));
        this.mExpandReportListBean.e(c(context).d(uyr.f50749c.get("FALL_ASLEEP_TIME").intValue()));
        this.mExpandReportListBean.e(i(context).d(uyr.f50749c.get("WAKE_UP_TIME").intValue()));
        this.mExpandReportListBean.e(g(context).d(uyr.f50749c.get("RISING_TIME").intValue()));
        this.mExpandReportListBean.e(a(context).d(uyr.f50749c.get("GO_BED_REGULARITY").intValue()));
        this.mExpandReportListBean.e(d(context).d(uyr.f50749c.get("OFF_BED_REGULARITY").intValue()));
        this.mExpandReportListBean.e(getSleepLatencyBean(getSleepLatency(), R.string.IDS_avg_sleep_latency_new).d(uyr.f50749c.get("SLEEP_LATENCY").intValue()));
    }

    private int[] c() {
        int[] iArr = {0, R.string.IDS_manual_sleep_average_sleep_duration};
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iArr[0] = this.mSleepViewData.h().i();
            iArr[1] = R.string.IDS_manual_sleep_average_sleep_duration;
            return iArr;
        }
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iArr[0] = this.mSleepViewData.g().i();
            iArr[1] = R.string.IDS_fitness_core_sleep_avg_night_sleep_new;
            return iArr;
        }
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            iArr[0] = this.mSleepViewData.k().i();
            iArr[1] = R.string.IDS_fitness_core_sleep_avg_night_sleep_new;
            return iArr;
        }
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            iArr[0] = this.mSleepViewData.b().i();
            iArr[1] = R.string.IDS_manual_sleep_average_sleep_duration;
            return iArr;
        }
        LogUtil.a(getTag(), "getSleepTimeBean sleepType", this.mSleepViewData.n());
        return iArr;
    }

    private fsr b(final Context context) {
        int iAf;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iAf = ((gxn) this.mSleepViewData.h()).x();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iAf = ((gxo) this.mSleepViewData.g()).af();
        } else {
            LogUtil.j(getTag(), a2.d);
            return new fsr();
        }
        if (iAf == -1) {
            LogUtil.j(getTag(), "not satified");
            return new fsr();
        }
        int i = (iAf + 1200) % ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
        ReleaseLogUtil.d(getTag(), "getAvgBedTimeBean getAvgPhoneBedTime is ", Integer.valueOf(i), " source ", this.mSleepViewData.n());
        final int iA = wud.a(i);
        String strE = uck.e(context, iA, true);
        int iE = uck.e(iA);
        final String str = String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i / 60)) + ":" + String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i % 60));
        return new fsr(getItemTitle(R.string.IDS_manual_sleep_average_bed_time_new, UnitUtil.c(a(str))), qre.a(R.string.IDS_sleep_referece_title_smaller_string, UnitUtil.c(0)), strE, iE, this.mArrowRes, new View.OnClickListener() { // from class: ubj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49889c.e(context, str, iA, view);
            }
        });
    }

    public /* synthetic */ void e(Context context, String str, int i, View view) {
        if (qrs.r()) {
            return;
        }
        c(context, UnitUtil.c(a(str)), i);
    }

    private int a(String str) {
        String[] strArrSplit = str.split(":");
        try {
            if (strArrSplit.length > 1) {
                return (Integer.parseInt(strArrSplit[0]) * 3600) + (Integer.parseInt(strArrSplit[1]) * 60);
            }
        } catch (NumberFormatException e) {
            LogUtil.e(getTag(), "getSeconds exception = ", e.getMessage());
        }
        return 0;
    }

    private void c(Context context, String str, int i) {
        LogUtil.a(getTag(), "setAvgBedTimeClickEvent");
        SleepTimeActivity.a(context, 1, str, i);
    }

    private fsr c(final Context context) {
        int iBe;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iBe = ((gxn) this.mSleepViewData.h()).v();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iBe = ((gxo) this.mSleepViewData.g()).ah();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            iBe = ((gxp) this.mSleepViewData.k()).be();
        } else {
            LogUtil.j(getTag(), a2.d);
            return new fsr();
        }
        if (iBe == -1) {
            LogUtil.j(getTag(), "not satified");
            return new fsr();
        }
        int i = (iBe + 1200) % ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
        ReleaseLogUtil.d(getTag(), " getAvgFallSleepTimeBean dailyFallTime ", Integer.valueOf(i), " source ", this.mSleepViewData.n());
        final int iA = wud.a(i);
        String strE = uck.e(context, iA, true);
        int iE = uck.e(iA);
        final String str = String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i / 60)) + ":" + String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i % 60));
        return new fsr(getItemTitle(R.string.IDS_fitness_core_sleep_avg_start_sleep_new, UnitUtil.c(a(str))), qre.a(R.string.IDS_sleep_referece_title_smaller_string, UnitUtil.c(0)), strE, iE, this.mArrowRes, new View.OnClickListener() { // from class: ubp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(context, str, iA, view);
            }
        });
    }

    public /* synthetic */ void d(Context context, String str, int i, View view) {
        if (qrs.r()) {
            return;
        }
        a(context, UnitUtil.c(a(str)), i);
    }

    private void a(Context context, String str, int i) {
        LogUtil.a(getTag(), "setFallSleepTimeClickEvent");
        SleepTimeActivity.a(context, 2, str, i);
    }

    private fsr i(final Context context) {
        int iBf;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iBf = ((gxn) this.mSleepViewData.h()).y();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iBf = ((gxo) this.mSleepViewData.g()).ai();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            iBf = ((gxp) this.mSleepViewData.k()).bf();
        } else {
            LogUtil.j(getTag(), a2.d);
            return new fsr();
        }
        if (iBf == -1) {
            LogUtil.j(getTag(), "not satified");
            return new fsr();
        }
        int i = (iBf + 1200) % ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
        ReleaseLogUtil.d(getTag(), " getMeanWakingTimeBean meanWakingTime ", Integer.valueOf(i), " source ", this.mSleepViewData.n());
        final int iQ = wud.q(i);
        String strE = uck.e(context, iQ, true);
        int iE = uck.e(iQ);
        final String str = String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i / 60)) + ":" + String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i % 60));
        return new fsr(getItemTitle(R.string.IDS_manual_sleep_mean_waking_time_new, UnitUtil.c(a(str))), qre.a(R.string.IDS_sleep_referece_title_bigger_string, UnitUtil.c(21600)), strE, iE, this.mArrowRes, new View.OnClickListener() { // from class: ubn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49895b.b(context, str, iQ, view);
            }
        });
    }

    public /* synthetic */ void b(Context context, String str, int i, View view) {
        if (qrs.r()) {
            return;
        }
        d(context, UnitUtil.c(a(str)), i);
    }

    private void d(Context context, String str, int i) {
        LogUtil.a(getTag(), "setMeanWakingTimeClickEvent");
        SleepTimeActivity.a(context, 3, str, i);
    }

    private fsr g(final Context context) {
        int iAg;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iAg = ((gxn) this.mSleepViewData.h()).w();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iAg = ((gxo) this.mSleepViewData.g()).ag();
        } else {
            LogUtil.j(getTag(), a2.d);
            return new fsr();
        }
        if (iAg == -1) {
            LogUtil.j(getTag(), "not satified");
            return new fsr();
        }
        int i = (iAg + 1200) % ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
        ReleaseLogUtil.d(getTag(), "getWakeUpTimeBean source ", this.mSleepViewData.n(), "wakeUpTime", Integer.valueOf(i));
        final int iQ = wud.q(i);
        String strE = uck.e(context, iQ, true);
        int iE = uck.e(iQ);
        final String str = String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i / 60)) + ":" + String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i % 60));
        return new fsr(getItemTitle(R.string.IDS_fitness_core_sleep_avg_end_sleep_new, UnitUtil.c(a(str))), qre.a(R.string.IDS_sleep_referece_title_bigger_string, UnitUtil.c(21600)), strE, iE, this.mArrowRes, new View.OnClickListener() { // from class: ubr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49906c.a(context, str, iQ, view);
            }
        });
    }

    public /* synthetic */ void a(Context context, String str, int i, View view) {
        if (qrs.r()) {
            return;
        }
        b(context, UnitUtil.c(a(str)), i);
    }

    private void b(Context context, String str, int i) {
        LogUtil.a(getTag(), "setWakeUpTimeClickEvent");
        SleepTimeActivity.a(context, 4, str, i);
    }

    private fsr a(final Context context) {
        final int iBg;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iBg = ((gxn) this.mSleepViewData.h()).aa();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iBg = ((gxo) this.mSleepViewData.g()).aj();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            iBg = ((gxp) this.mSleepViewData.k()).bg();
        } else {
            LogUtil.j(getTag(), a2.d);
            return new fsr();
        }
        if (iBg == -1) {
            LogUtil.j(getTag(), "not satified");
            return new fsr();
        }
        ReleaseLogUtil.d(getTag(), " getBedTimeRegularityBean ", Integer.valueOf(iBg), " source ", this.mSleepViewData.n());
        final int iK = wud.k(iBg);
        return new fsr(getItemTitle(R.string.IDS_manual_sleep_bedtime_regularity, qre.e(R.plurals.IDS_sleep_referece_title_score_string, iBg, UnitUtil.e(iBg, 1, 0))), uck.b(70, 100, 0), uck.e(iK, "TYPE_FALL_GO_TO_BED_REGULAR"), uck.e(iK), this.mArrowRes, new View.OnClickListener() { // from class: ubm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49892a.b(context, iBg, iK, view);
            }
        });
    }

    public /* synthetic */ void b(Context context, int i, int i2, View view) {
        if (qrs.r()) {
            return;
        }
        d(context, i, i2);
    }

    private void d(Context context, int i, int i2) {
        LogUtil.a(getTag(), "setBedTimeRegularityClickEvent");
        SleepScoreTimesActivity.b(context, "TYPE_FALL_GO_TO_BED_REGULAR", i, i2);
    }

    private fsr d(final Context context) {
        final int iBv;
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            iBv = ((gxn) this.mSleepViewData.h()).z();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            iBv = ((gxo) this.mSleepViewData.g()).am();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            iBv = ((gxp) this.mSleepViewData.k()).bv();
        } else {
            LogUtil.j(getTag(), a2.d);
            return new fsr();
        }
        if (iBv == -1) {
            LogUtil.j(getTag(), "not satified");
            return new fsr();
        }
        ReleaseLogUtil.d(getTag(), "getEndSleepRegularityBean TYPE ", this.mSleepViewData.n(), " endSleepRegularity ", Integer.valueOf(iBv));
        final int iK = wud.k(iBv);
        return new fsr(getItemTitle(R.string.IDS_fitness_core_sleep_end_sleep_regularity, qre.e(R.plurals.IDS_sleep_referece_title_score_string, iBv, UnitUtil.e(iBv, 1, 0))), uck.b(70, 100, 0), uck.e(iK, "TYPE_WAKE_UP_REGULAR"), uck.e(iK), this.mArrowRes, new View.OnClickListener() { // from class: ubk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49890b.e(context, iBv, iK, view);
            }
        });
    }

    public /* synthetic */ void e(Context context, int i, int i2, View view) {
        if (qrs.r()) {
            return;
        }
        e(context, i, i2);
    }

    private void e(Context context, int i, int i2) {
        SleepScoreTimesActivity.b(context, "TYPE_WAKE_UP_REGULAR", i, i2);
    }
}
