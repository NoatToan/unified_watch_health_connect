package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepDayExpandListProvider;
import defpackage.eej;
import defpackage.fso;
import defpackage.fsr;
import defpackage.gxq;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.uck;
import defpackage.ucv;
import defpackage.uyr;
import defpackage.wud;
import defpackage.wum;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class SleepDayExpandListProvider extends SleepBaseExpandListProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f26779a = new ArrayList<String>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepDayExpandListProvider.1
        {
            add("heart_rate_button");
            add("custom.blood.oxygen.switch");
            add("continue_heart_rate");
        }
    };

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected String getTag() {
        return "R_Sleep_DayExpandListProvider";
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void setSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            ucv.c(new Date(gxqVar.f()), new c(this, sectionBean, gxqVar));
        } else {
            setProviderActive(gxqVar);
            sectionBean.d(this, gxqVar);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected boolean isEffectiveDate() {
        return (this.mSleepViewData == null || this.mSleepViewData.f() == 0) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void updateDataUi() {
        if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            j();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            LogUtil.a("R_Sleep_DayExpandListProvider", "day core sleep");
            c();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            LogUtil.a("R_Sleep_DayExpandListProvider", "day phone sleep");
            h();
        } else if (this.mSleepViewData.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            LogUtil.a("R_Sleep_DayExpandListProvider", "common sleep");
            f();
        }
        sortBeanList();
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepBaseExpandListProvider
    protected void handleTruSleepData(CharSequence[] charSequenceArr, SleepBaseExpandListProvider.c cVar) {
        if (cVar == null || njy.e(charSequenceArr, 3)) {
            return;
        }
        charSequenceArr[1] = c(cVar.f26766c, cVar.d);
        charSequenceArr[2] = d(cVar.f26766c, cVar.f26764a);
        charSequenceArr[3] = getDataPartIndexThree(cVar.e, cVar.f26765b);
    }

    private CharSequence c(String str, int[] iArr) {
        String strF;
        int iIntValue = uyr.g.get(str).intValue();
        if (this.mSleepViewData.k().b(str)) {
            if (iIntValue != R.string.IDS_base_line_percent) {
                strF = qre.e(uyr.g.get(str).intValue(), iArr[1], UnitUtil.e(iArr[0], 1, 0), UnitUtil.e(iArr[1], 1, 0));
            } else {
                strF = uck.e(uyr.g.get(str).intValue(), iArr[0], iArr[1]);
            }
        } else {
            strF = qre.f(R.string.IDS_base_line_frequency_empty);
        }
        return qre.a(R.string.IDS_bese_line_description, strF);
    }

    private CharSequence d(String str, int i) {
        String strF;
        String strF2;
        int iIntValue = uyr.h.get(str).intValue();
        if (iIntValue != -1) {
            if (this.mSleepViewData.k().e(str)) {
                strF = qre.e(iIntValue, i, UnitUtil.e(i, 1, 0));
            } else {
                strF = qre.e(iIntValue, 0, qre.f(R.string.IDS_physiological_index_invalid));
            }
        } else if (this.mSleepViewData.k().e(str)) {
            strF = UnitUtil.e(i, 2, 0);
        } else {
            strF = qre.f(R.string.IDS_physiological_index_invalid);
        }
        SpannableString spannableString = new SpannableString(strF);
        if (this.mSleepViewData.k().e(str)) {
            strF2 = UnitUtil.e(i, 1, 0);
        } else {
            strF2 = qre.f(R.string.IDS_physiological_index_invalid);
        }
        qri.c(spannableString, strF2, qre.b(R.dimen.health_common_24sp));
        return spannableString;
    }

    private void f() {
        LogUtil.a("R_Sleep_DayExpandListProvider", "updateCommonTotalDataUi");
        int iP = this.mSleepViewData.b().p();
        this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_details_sleep_sleep_latency_time), qre.e(R.plurals.IDS_details_awake_times, iP, Integer.valueOf(iP)), -1, null).a(uyr.f50749c.get("AWAKE_NUMS").intValue()));
        b(this.mSleepViewData.b().i());
    }

    private void b(int i) {
        LogUtil.a("R_Sleep_DayExpandListProvider", "setSleepDataToCommonSleep");
        if (i / 60 >= 15) {
            wum.a(BaseApplication.getContext(), this.mRequestDay, "EXCE_NORMALSLEEP__TIME_ERROR");
        }
    }

    private void h() {
        LogUtil.a("R_Sleep_DayExpandListProvider", "processDayCoreSleepData");
        if (this.mWeakRef == null || this.mWeakRef.get() == null) {
            LogUtil.a("R_Sleep_DayExpandListProvider", "updateMannerSleepDataUi, mWeakRef is invalid");
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        if (this.mSleepViewData.g().i() > 0) {
            if (this.mSleepViewData.g().o() > 0) {
                this.mExpandReportListBean.e(getBedTimeBean(getBedTime(), R.string.IDS_manual_sleep_bed_time).d(uyr.f50749c.get("BED_TIME").intValue()));
                this.mExpandReportListBean.e(getSleepEfficientBean(knitSleepDetailActivity, getSleepEfficientValue(), R.string.IDS_manual_sleep_sleep_efficiency).d(uyr.f50749c.get("SLEEP_EFFICIENCY").intValue()));
                this.mExpandReportListBean.e(getSleepLatencyBean(getSleepLatency(), R.string.IDS_sleep_latency_title).d(uyr.f50749c.get("SLEEP_LATENCY").intValue()));
            }
            this.mExpandReportListBean.e(getWakeTimesBean(knitSleepDetailActivity, R.string.IDS_details_sleep_sleep_latency_time).d(uyr.f50749c.get("AWAKE_NUMS").intValue()));
            this.mExpandReportListBean.e(getPhoneNightSleepBean(this.mSleepViewData.g().i(), R.string.IDS_fitness_core_sleep_night_sleep).d(uyr.f50749c.get("SLEEP_DURATION").intValue()));
        }
        d(this.mSleepViewData.g().u());
        if (this.mSleepViewData.g().u() != 0) {
            if (this.mSleepViewData.g().ab()) {
                this.mExpandReportListBean.e(qre.a(R.string.IDS_sleep_day_sleep_phone_remainders, qre.e(R.plurals.IDS_hour_unit, 3, UnitUtil.e(3.0d, 1, 0))));
            } else {
                this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_fitness_total_sleep_data_title), wud.c(knitSleepDetailActivity, this.mSleepViewData.g().i() + this.mSleepViewData.g().u()), -1, null).a(uyr.f50749c.get("TOTAL_SLEEP").intValue()));
            }
        }
        g();
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gxq f26783a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SectionBean f26784c;
        private final WeakReference e;

        public c(SleepDayExpandListProvider sleepDayExpandListProvider, SectionBean sectionBean, gxq gxqVar) {
            this.e = new WeakReference(sleepDayExpandListProvider);
            this.f26784c = sectionBean;
            this.f26783a = gxqVar;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WeakReference weakReference = this.e;
            if (weakReference == null || !(weakReference.get() instanceof SleepDayExpandListProvider)) {
                LogUtil.e("R_Sleep_DayExpandListProvider", "mWeakRef is null");
                return;
            }
            SleepBaseExpandListProvider sleepBaseExpandListProvider = (SleepBaseExpandListProvider) this.e.get();
            if (i == 0 && ((Map) obj).containsKey("detect_abnormal")) {
                LogUtil.a("R_Sleep_DayExpandListProvider", "DETECT_ABNORMAL_KEY");
                sleepBaseExpandListProvider.mIsActive = false;
                this.f26784c.d(sleepBaseExpandListProvider, this.f26783a);
            } else {
                sleepBaseExpandListProvider.setProviderActive(this.f26783a);
                this.f26784c.d(sleepBaseExpandListProvider, this.f26783a);
            }
        }
    }

    private void j() {
        LogUtil.a("R_Sleep_DayExpandListProvider", "updateMannerSleepDataUi");
        if (this.mWeakRef == null) {
            LogUtil.j("R_Sleep_DayExpandListProvider", "updateMannerSleepDataUi, mWeakRef is invalid");
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        if (knitSleepDetailActivity == null) {
            LogUtil.j("R_Sleep_DayExpandListProvider", "updateMannerSleepDataUi context == null");
        } else {
            b(knitSleepDetailActivity);
        }
    }

    private void b(Context context) {
        String itemTitle;
        int i;
        this.mExpandReportListBean.e(getSleepEfficientBean(context, getSleepEfficientValue(), R.string.IDS_manual_sleep_sleep_efficiency).d(uyr.f50749c.get("SLEEP_EFFICIENCY").intValue()));
        this.mExpandReportListBean.e(getBedTimeBean(getBedTime(), R.string.IDS_manual_sleep_bed_time).d(uyr.f50749c.get("BED_TIME").intValue()));
        if (this.mSleepViewData.n() != SleepViewConstants.SleepTypeEnum.MANUAL) {
            itemTitle = "";
            i = 0;
        } else {
            i = this.mSleepViewData.h().i();
            itemTitle = getItemTitle(R.string.IDS_fitness_core_sleep_sleep_duration, getFormatTime(i / 60, i % 60));
        }
        this.mExpandReportListBean.e(getSleepTimeBean(itemTitle, i).d(uyr.f50749c.get("SLEEP_DURATION").intValue()));
        this.mExpandReportListBean.e(getSleepLatencyBean(getSleepLatency(), R.string.IDS_sleep_latency_title).d(uyr.f50749c.get("SLEEP_LATENCY").intValue()));
    }

    private void c() {
        String strA;
        LogUtil.a("R_Sleep_DayExpandListProvider", "processDayCoreSleepData");
        Context context = BaseApplication.getContext();
        if (this.mSleepViewData.k().i() > 0) {
            i();
        }
        d(this.mSleepViewData.k().ar());
        if (this.mSleepViewData.k().ar() > 0) {
            if (this.mSleepViewData.k().ay()) {
                if (VersionControlUtil.isSupportSleepManagement() && this.mIsOpen) {
                    LogUtil.a("R_Sleep_DayExpandListProvider", "secientific noon sleep only, after turn on sleep management");
                    this.mSectionBean.d(this, (Object) null);
                    return;
                } else {
                    if (this.mSleepViewData.k().ar() > 180) {
                        strA = qre.f(R.string.IDS_core_sleep_suggesttion_nullstatus_content3);
                    } else {
                        strA = qre.a(R.string.IDS_core_sleep_suggesttion_nullstatus_content, qre.e(R.plurals.IDS_hour_unit, 3, 3));
                    }
                    this.mExpandReportListBean.e(strA);
                }
            } else {
                this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_fitness_total_sleep_data_title), wud.c(context, this.mSleepViewData.k().i() + this.mSleepViewData.k().ar()), -1, null).a(uyr.f50749c.get("TOTAL_SLEEP").intValue()));
            }
        }
        a(this.mSleepViewData.k().i() + this.mSleepViewData.k().ar());
        g();
    }

    private void a(int i) {
        if (i / 60 >= 15) {
            wum.a(BaseApplication.getContext(), this.mRequestDay, "EXCE_TRUSLEEP__TIME_ERROR");
        }
    }

    private void i() {
        if (this.mWeakRef == null || this.mWeakRef.get() == null) {
            LogUtil.a("R_Sleep_DayExpandListProvider", "updateCoreSleepDetailList, mWeakRef is invalid");
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        this.mExpandReportListBean.e(getCoreNightSleepBean(knitSleepDetailActivity, R.string.IDS_fitness_core_sleep_night_sleep).d(uyr.f50749c.get("SLEEP_DURATION").intValue()));
        c(knitSleepDetailActivity);
        int i = isAASMVersion() ? R.string.IDS_hw_aasm_label_sleep_deepsleep_rate : R.string.IDS_fitness_core_sleep_deep_sleep_percent;
        int i2 = isAASMVersion() ? R.string.IDS_hw_aasm_label_sleep_shallowsleep_rate : R.string.IDS_fitness_core_sleep_light_sleep_percent;
        int i3 = isAASMVersion() ? R.string.IDS_hw_aasm_label_sleep_rem_rate : R.string.IDS_fitness_core_sleep_rem_sleep_percent;
        this.mExpandReportListBean.e(getDeepSleepBean(knitSleepDetailActivity, i).d(uyr.f50749c.get("DEEP_RATIO").intValue()));
        e(knitSleepDetailActivity);
        this.mExpandReportListBean.e(getLightSleepBean(knitSleepDetailActivity, i2).d(uyr.f50749c.get("SHALLOW_RATIO").intValue()));
        a(knitSleepDetailActivity);
        this.mExpandReportListBean.e(getRemSleepBean(knitSleepDetailActivity, i3).d(uyr.f50749c.get("REM_RATIO").intValue()));
        this.mExpandReportListBean.e(getDeepSleepContinuityBean(knitSleepDetailActivity, R.string.IDS_fitness_core_sleep_deep_sleep_continuity).d(uyr.f50749c.get("DEEP_CONT").intValue()));
        this.mExpandReportListBean.e(getWakeTimesBean(knitSleepDetailActivity, R.string.IDS_details_sleep_sleep_latency_time).d(uyr.f50749c.get("AWAKE_NUMS").intValue()));
        d(knitSleepDetailActivity);
        this.mExpandReportListBean.e(getBreathQualityBean(knitSleepDetailActivity, R.string.IDS_fitness_core_sleep_rdi_score).d(uyr.f50749c.get("BREATH_QUALITY").intValue()));
        if (this.mSleepViewData.k().bh() || getSleepStatData().bh()) {
            this.mExpandReportListBean.e(a().d(uyr.f50749c.get("TRUSLEEP_FIVE_BREATH_RATE").intValue()));
            this.mExpandReportListBean.e(e().d(uyr.f50749c.get("TRUSLEEP_FIVE_HEART_RATE").intValue()));
            this.mExpandReportListBean.e(d().d(uyr.f50749c.get("TRUSLEEP_FIVE_HRV").intValue()));
            this.mExpandReportListBean.e(b().d(uyr.f50749c.get("TRUSLEEP_FIVE_SpO2").intValue()));
        } else {
            this.mExpandReportListBean.b(getSleepPhysiologicalItem(knitSleepDetailActivity, "SLEEP_HEART_RATE").a(uyr.f50749c.get("SLEEP_HEART_RATE").intValue()));
            this.mExpandReportListBean.b(getSleepPhysiologicalItem(knitSleepDetailActivity, "SLEEP_BLOOD_OX").a(uyr.f50749c.get("SLEEP_BLOOD_OX").intValue()));
            this.mExpandReportListBean.b(getSleepPhysiologicalItem(knitSleepDetailActivity, "SLEEP_BREATH_RATIO").a(uyr.f50749c.get("SLEEP_BREATH_RATIO").intValue()));
        }
        if (isAASMVersion()) {
            this.mExpandReportListBean.e(getSleepStableRateBean(knitSleepDetailActivity, R.string.IDS_hw_aasm_label_sleep_stable_rate).d(uyr.f50749c.get("STABLE_SLEEP_RATIO_ALERT").intValue()));
        }
    }

    private fsr e() {
        return a(this.mSleepViewData.k().q(), new int[]{this.mSleepViewData.k().am(), this.mSleepViewData.k().ah()}, this.mSleepViewData.k().ad(), "TRUSLEEP_FIVE_HEART_RATE");
    }

    private fsr d() {
        return a(this.mSleepViewData.k().r(), new int[]{this.mSleepViewData.k().al(), this.mSleepViewData.k().z()}, this.mSleepViewData.k().aa(), "TRUSLEEP_FIVE_HRV");
    }

    private fsr b() {
        return a(this.mSleepViewData.k().s(), new int[]{this.mSleepViewData.k().as(), this.mSleepViewData.k().ai()}, this.mSleepViewData.k().bc(), "TRUSLEEP_FIVE_SpO2");
    }

    private void d(Context context) {
        int iX = this.mSleepViewData.k().x();
        boolean z = this.mSleepViewData.k().i() > 0;
        if (iX >= 70 || !z) {
            return;
        }
        wum.a(context, this.mRequestDay, "EXCE_BREATH__SCORE_ERROR");
    }

    private void c(Context context) {
        int iW = this.mSleepViewData.k().w();
        boolean z = this.mSleepViewData.k().i() > 0;
        if (iW > 90 && z) {
            wum.a(context, this.mRequestDay, "EXCE_DEEPSLEEP__MIX _ERROR");
        } else if (iW < 5 && z) {
            wum.a(context, this.mRequestDay, "EXCE_DEEPSLEEP__MIN_ERROR");
        } else {
            LogUtil.a(getTag(), "deepSleepRateNum is ok");
        }
    }

    private void e(Context context) {
        int iAv = this.mSleepViewData.k().av();
        boolean z = this.mSleepViewData.k().i() > 0;
        if (iAv > 90 && z) {
            wum.a(context, this.mRequestDay, "EXCE_LIGHTSLEEP__MIX _ERROR");
        } else if (iAv < 5 && z) {
            wum.a(context, this.mRequestDay, "EXCE_LIGHTSLEEP__MIN_ERROR");
        } else {
            LogUtil.a("R_Sleep_DayExpandListProvider", "lightSleepRateNum is ok");
        }
    }

    private void a(Context context) {
        int iAv = this.mSleepViewData.k().av();
        boolean z = this.mSleepViewData.k().i() > 0;
        if (iAv > 90 && z) {
            wum.a(context, this.mRequestDay, "EXCE_LIGHTSLEEP__MIX _ERROR");
        } else if (iAv < 5 && z) {
            wum.a(context, this.mRequestDay, "EXCE_LIGHTSLEEP__MIN_ERROR");
        } else {
            LogUtil.a("R_Sleep_DayExpandListProvider", "lightSleepRateNum is ok");
        }
    }

    private fsr a() {
        return a(this.mSleepViewData.k().p(), new int[]{this.mSleepViewData.k().an(), this.mSleepViewData.k().ac()}, this.mSleepViewData.k().y(), "TRUSLEEP_FIVE_BREATH_RATE");
    }

    private fsr a(int i, int[] iArr, int i2, String str) {
        String strD = d(i, str);
        int iB = b(i, iArr, str);
        String strA = a(i, iArr, str);
        SpannableString spannableStringE = e(iArr, i2, str, i);
        fsr fsrVar = new fsr(strD, spannableStringE, strA, iB, this.mArrowRes, new SleepBaseExpandListProvider.d(this, getTag()).b(str, iArr, i, strA, iB));
        if (TextUtils.isEmpty(spannableStringE)) {
            fsrVar.e(false);
        }
        return fsrVar;
    }

    private String a(int i, int[] iArr, String str) {
        int iA;
        return (this.mSleepViewData.k().e(str) && this.mSleepViewData.k().b(str) && (iA = wud.a(i, iArr)) != -1) ? uck.e(iA, str) : "";
    }

    private int b(int i, int[] iArr, String str) {
        int iA;
        if (this.mSleepViewData.k().e(str) && this.mSleepViewData.k().b(str) && (iA = wud.a(i, iArr)) != -1) {
            return uck.a(iA);
        }
        return qre.e(R.color.health_secondary_color);
    }

    private String d(int i, String str) {
        String strF;
        int iIntValue = uyr.h.get(str).intValue();
        if (iIntValue != -1) {
            if (this.mSleepViewData.k().e(str)) {
                strF = qre.e(iIntValue, i, UnitUtil.e(i, 1, 0));
            } else {
                strF = qre.e(iIntValue, 0, qre.f(R.string.IDS_physiological_index_invalid));
            }
        } else if (this.mSleepViewData.k().e(str)) {
            strF = UnitUtil.e(i, 2, 0);
        } else {
            strF = qre.f(R.string.IDS_physiological_index_invalid);
        }
        return getItemTitle(uyr.i.get(str).intValue(), strF);
    }

    private void d(final int i) {
        LogUtil.a("R_Sleep_DayExpandListProvider", "setDaySleepViewList");
        BaseApplication.getContext();
        final ArrayList arrayList = new ArrayList();
        if (this.mSleepViewData.j() instanceof CopyOnWriteArrayList) {
            arrayList.addAll(this.mSleepViewData.j());
        }
        if (njy.e(arrayList)) {
            LogUtil.a("R_Sleep_DayExpandListProvider", "daySleepDataList is null");
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.mExpandReportListBean.b(new fso(qre.f(R.string.IDS_fitness_core_sleep_noontime_sleep), (String) arrayList.get(i2), this.mArrowRes, new View.OnClickListener() { // from class: tys
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(i, arrayList, view);
                }
            }).a(uyr.f50749c.get("NOON_SLEEP").intValue()));
        }
    }

    public /* synthetic */ void a(int i, ArrayList arrayList, View view) {
        d(i, (ArrayList<String>) arrayList);
    }

    public void d(int i, ArrayList<String> arrayList) {
        int i2 = i % 60;
        String strE = UnitUtil.e(((double) (i - i2)) / 60.0d, 1, 0);
        String strE2 = UnitUtil.e(i2, 1, 0);
        if (this.mWeakRef == null) {
            LogUtil.a(getTag(), "gotoDayNoonSleepActivity, mWeakRef is invalid");
            return;
        }
        KnitSleepDetailActivity knitSleepDetailActivity = this.mWeakRef.get();
        if (knitSleepDetailActivity == null) {
            LogUtil.a(getTag(), "gotoDayNoonSleepActivity, context == null");
        }
        DaySleepActivity.d(knitSleepDetailActivity, strE, strE2, getDaySleepStatus(i), arrayList);
    }

    private void g() {
        LogUtil.a("R_Sleep_DayExpandListProvider", "setWakeupFeeling");
        int iAd = this.mSleepViewData.g().ad();
        LogUtil.a("R_Sleep_DayExpandListProvider", "wake up feeling index: " + iAd);
        if (iAd != 0) {
            this.mExpandReportListBean.b(new fso(BaseApplication.getContext().getString(R.string.IDS_wakeup_feel_title), e(iAd), -1, null).a(uyr.f50749c.get("WAKE_UP_FEELING").intValue()));
        }
    }

    private String e(int i) {
        LogUtil.a("R_Sleep_DayExpandListProvider", "getWakeUpFeeling");
        if (i == 1) {
            return qre.f(R.string.IDS_wakeup_feel_energized);
        }
        if (i == 2) {
            return qre.f(R.string.IDS_wakeup_feel_sleepy);
        }
        if (i == 3) {
            return qre.f(R.string.IDS_wakeup_feel_drowsy);
        }
        return "";
    }

    private SpannableString e(int[] iArr, int i, String str, int i2) {
        String strF;
        String strD = d(i2, str);
        int iB = b(i2, iArr, str);
        String strA = a(i2, iArr, str);
        String strA2 = qre.a(R.string.IDS_base_switch_description, qre.f(uyr.j.get(str).intValue()));
        int iIntValue = uyr.g.get(str).intValue();
        if (this.mSleepViewData.k().b(str)) {
            if (iIntValue != R.string.IDS_base_line_percent) {
                strF = qre.e(uyr.g.get(str).intValue(), iArr[1], UnitUtil.e(iArr[0], 1, 0), UnitUtil.e(iArr[1], 1, 0));
            } else {
                strF = uck.e(uyr.g.get(str).intValue(), iArr[0], iArr[1]);
            }
        } else if (!lsl.aa(this.mSleepViewData.f())) {
            strF = qre.f(R.string.IDS_base_line_frequency_empty);
        } else {
            DeviceCapability deviceCapabilityC = eej.c();
            if ((!"TRUSLEEP_FIVE_SpO2".equals(str) && !"TRUSLEEP_FIVE_HEART_RATE".equals(str)) || deviceCapabilityC == null) {
                String strE = qre.e(R.plurals.IDS_base_line_night_unit, i, UnitUtil.e(i, 1, 0));
                if (i > 0) {
                    strF = qre.a(R.string.IDS_show_base_line_remainder_day, strE);
                } else {
                    strF = qre.f(R.string.IDS_base_line_frequency_empty);
                }
            } else {
                b(new a(this, str, strD, strA2).e(iArr, i, i2, strA, iB));
                return new SpannableString("");
            }
        }
        return makeSubTitleSpannable(strF, strA2, str, iArr);
    }

    private void b(final a aVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tyu
            @Override // java.lang.Runnable
            public final void run() {
                SleepDayExpandListProvider.d(aVar);
            }
        });
    }

    public static /* synthetic */ void d(a aVar) {
        HiUserPreference userPreference;
        String strA = aVar.a();
        strA.hashCode();
        if (strA.equals("TRUSLEEP_FIVE_HEART_RATE")) {
            userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(eej.c().isSupportContinueHeartRate() ? f26779a.get(2) : f26779a.get(0));
        } else if (strA.equals("TRUSLEEP_FIVE_SpO2")) {
            userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(f26779a.get(1));
        } else {
            ReleaseLogUtil.e("R_Sleep_DayExpandListProvider", "unKonw itemType: ", strA);
            return;
        }
        if (userPreference == null) {
            ReleaseLogUtil.a("R_Sleep_DayExpandListProvider", "switch status is empty");
        } else {
            LogUtil.a("R_Sleep_DayExpandListProvider", "switch result: ", userPreference);
            aVar.onResponse(0, userPreference);
        }
    }

    public static class a implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26780a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26782c;
        private String d;
        private int[] e;
        private String f;
        private WeakReference<SleepBaseExpandListProvider> g;
        private String h;
        private int i;
        private int j;

        a(SleepBaseExpandListProvider sleepBaseExpandListProvider, String str, String str2, String str3) {
            this.g = new WeakReference<>(sleepBaseExpandListProvider);
            this.d = str;
            this.h = str2;
            this.f = str3;
        }

        public a e(int[] iArr, int i, int i2, String str, int i3) {
            this.e = iArr;
            this.f26782c = i;
            this.j = i2;
            this.f26781b = str;
            this.i = i3;
            this.f26780a = true;
            return this;
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            String strF;
            SleepBaseExpandListProvider sleepBaseExpandListProvider = this.g.get();
            if (sleepBaseExpandListProvider == null || !(obj instanceof HiUserPreference)) {
                ReleaseLogUtil.e("R_Sleep_DayExpandListProvider", "provider: ", sleepBaseExpandListProvider, " objectData: ", obj);
                return;
            }
            if (!this.f26780a) {
                ReleaseLogUtil.d("R_Sleep_DayExpandListProvider", "init status is false");
                return;
            }
            if (!"1".equals(((HiUserPreference) obj).getValue())) {
                strF = "";
            } else {
                int i2 = R.plurals.IDS_base_line_night_unit;
                int i3 = this.f26782c;
                String strE = qre.e(i2, i3, UnitUtil.e(i3, 1, 0));
                if (this.f26782c > 0) {
                    strF = qre.a(R.string.IDS_show_base_line_remainder_day, strE);
                } else {
                    strF = qre.f(R.string.IDS_base_line_frequency_empty);
                }
            }
            SpannableString spannableStringMakeSubTitleSpannable = sleepBaseExpandListProvider.makeSubTitleSpannable(strF, this.f, this.d, this.e);
            if (TextUtils.isEmpty(strF)) {
                String strF2 = qre.f(uyr.j.get(this.d).intValue());
                int iB = qri.b(spannableStringMakeSubTitleSpannable, strF2);
                spannableStringMakeSubTitleSpannable.setSpan(new e(sleepBaseExpandListProvider, this.d, this.h, this.f).e(this.f26782c, this.e, this.j, this.f26781b, this.i), iB, strF2.length() + iB, 17);
            }
            ObserverManagerUtil.e(ObserveLabels.REFRESH_REPORT_BEAN, spannableStringMakeSubTitleSpannable, this.h);
        }

        public String a() {
            return this.d;
        }
    }

    static class e extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26788a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26790c;
        private int[] d;
        private int e;
        private WeakReference<SleepBaseExpandListProvider> f;
        private int g;
        private String h;
        private String i;
        private int j;

        public e(SleepBaseExpandListProvider sleepBaseExpandListProvider, String str, String str2, String str3) {
            this.f = new WeakReference<>(sleepBaseExpandListProvider);
            this.f26790c = str;
            this.h = str2;
            this.i = str3;
        }

        public e e(int i, int[] iArr, int i2, String str, int i3) {
            this.e = i;
            this.d = iArr;
            this.g = i2;
            this.f26789b = str;
            this.j = i3;
            this.f26788a = true;
            return this;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (qrs.r()) {
                return;
            }
            if (!this.f26788a) {
                ReleaseLogUtil.d("R_Sleep_DayExpandListProvider", "init status is false");
                return;
            }
            SleepBaseExpandListProvider sleepBaseExpandListProvider = this.f.get();
            if (sleepBaseExpandListProvider == null) {
                ReleaseLogUtil.e("R_Sleep_DayExpandListProvider", "provider is null");
                return;
            }
            String str = this.f26790c;
            str.hashCode();
            if (str.equals("TRUSLEEP_FIVE_HEART_RATE")) {
                AppRouter.e(Uri.parse("huaweischeme://healthapp/router/heartRateSwitch")).i();
                ObserverManagerUtil.d(new d(sleepBaseExpandListProvider, this.f26790c, this.h, this.i).c(this.e, this.d, this.g, this.f26789b, this.j), ObserveLabels.HEART_RATE_SWITCH_STATUS);
            } else if (str.equals("TRUSLEEP_FIVE_SpO2")) {
                AppRouter.e(Uri.parse("huaweischeme://healthapp/router/bloodOxygenSwitch")).i();
                ObserverManagerUtil.d(new d(sleepBaseExpandListProvider, this.f26790c, this.h, this.i).c(this.e, this.d, this.g, this.f26789b, this.j), ObserveLabels.SPO2_MONITOR_SWITCH_STATUS);
            } else {
                ReleaseLogUtil.e("R_Sleep_DayExpandListProvider", "unKnow type: ", this.f26790c);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(qre.e(qqs.e(BaseApplication.getContext()) ? R.color.sleep_subtab_item_text : R.color.vip_tab_sleep_card_title_color));
            textPaint.setUnderlineText(false);
        }
    }

    static class d implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SleepBaseExpandListProvider f26786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f26787c;
        private boolean d = false;
        private String e;
        private String f;
        private int g;
        private String h;
        private int i;
        private String j;

        d(SleepBaseExpandListProvider sleepBaseExpandListProvider, String str, String str2, String str3) {
            this.f26786b = sleepBaseExpandListProvider;
            this.e = str;
            this.h = str2;
            this.f = str3;
        }

        public d c(int i, int[] iArr, int i2, String str, int i3) {
            this.f26785a = i;
            this.f26787c = iArr;
            this.i = i2;
            this.j = str;
            this.g = i3;
            this.d = true;
            return this;
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (!this.d) {
                ReleaseLogUtil.d("R_Sleep_DayExpandListProvider", "init status is false");
                return;
            }
            if (this.f26786b != null) {
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    if (((Integer) obj).intValue() != 1) {
                        ReleaseLogUtil.e("switch status is ", (Integer) objArr[0]);
                        return;
                    }
                    String str2 = this.e;
                    str2.hashCode();
                    if (str2.equals("TRUSLEEP_FIVE_HEART_RATE")) {
                        int i = R.plurals.IDS_base_line_night_unit;
                        int i2 = this.f26785a;
                        ObserverManagerUtil.e(ObserveLabels.REFRESH_REPORT_BEAN, this.f26786b.makeSubTitleSpannable(qre.a(R.string.IDS_show_base_line_remainder_day, qre.e(i, i2, UnitUtil.e(i2, 1, 0))), this.f, this.e, this.f26787c), this.h);
                        return;
                    }
                    if (str2.equals("TRUSLEEP_FIVE_SpO2")) {
                        int i3 = R.plurals.IDS_base_line_night_unit;
                        int i4 = this.f26785a;
                        ObserverManagerUtil.e(ObserveLabels.REFRESH_REPORT_BEAN, this.f26786b.makeSubTitleSpannable(qre.a(R.string.IDS_show_base_line_remainder_day, qre.e(i3, i4, UnitUtil.e(i4, 1, 0))), this.f, this.e, this.f26787c), this.h);
                        return;
                    }
                    ReleaseLogUtil.e("R_Sleep_DayExpandListProvider", "unKnow type: ", this.e);
                    return;
                }
            }
            ReleaseLogUtil.e("R_Sleep_DayExpandListProvider", "provider is null");
        }
    }
}
