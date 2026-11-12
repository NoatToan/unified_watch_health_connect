package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.health.bloodpressure.constant.DynamicBpStatus;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.coq;
import defpackage.ddv;
import defpackage.dfn;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.lwx;
import defpackage.qli;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.utg;
import defpackage.uub;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureDynamicProvider extends BaseKnitDataProvider<utg> {
    private static final boolean e = BloodPressureUtil.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27824c;
    private boolean d;
    private DynamicBpStatus i;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        this.f27823b = BaseApplication.getContext();
        if (e) {
            sectionBean.c(e());
            d(sectionBean);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("BloodPressureDynamicProvider", "onDestroy");
        lwx.e();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, final SectionBean sectionBean) {
        if (e) {
            boolean zA = uub.a();
            ReleaseLogUtil.d("R_BloodPressure_BloodPressureDynamicProvider", "loadData isSupport: ", Boolean.valueOf(zA));
            if (zA) {
                lwx.d().d(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureDynamicProvider.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("BloodPressureDynamicProvider", "loadData errorCode: ", Integer.valueOf(i), " objData: ", obj);
                        if (i != 100000 || !(obj instanceof dfn)) {
                            LogUtil.j("BloodPressureDynamicProvider", "loadData error");
                            BloodPressureDynamicProvider.this.a(sectionBean);
                        } else {
                            BloodPressureDynamicProvider.this.a(sectionBean, (dfn) obj);
                        }
                    }
                });
            } else {
                a(sectionBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SectionBean sectionBean, dfn dfnVar) {
        long jI = dfnVar.i();
        long jB = dfnVar.b();
        ReleaseLogUtil.d("BloodPressureDynamicProvider", "planStartTime: ", Long.valueOf(jI), " planEndTime: ", Long.valueOf(jB));
        if (jI == 0 && jB == 0) {
            a(sectionBean);
        } else {
            d(new b(this, sectionBean, dfnVar));
        }
    }

    static class b implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private dfn f27830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<BloodPressureDynamicProvider> f27831b;
        private SectionBean d;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public b(BloodPressureDynamicProvider bloodPressureDynamicProvider, SectionBean sectionBean, dfn dfnVar) {
            this.f27831b = new WeakReference<>(bloodPressureDynamicProvider);
            this.d = sectionBean;
            this.f27830a = dfnVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("BloodPressureDynamicProvider", "InnerReadListener data: ", obj, " errorCode: ", Integer.valueOf(i));
            BloodPressureDynamicProvider bloodPressureDynamicProvider = this.f27831b.get();
            if (bloodPressureDynamicProvider == null) {
                LogUtil.j("BloodPressureDynamicProvider", "InnerReadListener provider is null");
                return;
            }
            if (i != 0 || !(obj instanceof SparseArray)) {
                LogUtil.j("BloodPressureDynamicProvider", "InnerReadListener error");
                bloodPressureDynamicProvider.b(this.d, this.f27830a);
                return;
            }
            Object obj2 = ((SparseArray) obj).get(700019);
            List list = obj2 instanceof List ? (List) obj2 : null;
            if (!coq.d(list)) {
                bloodPressureDynamicProvider.e(this.d, (HiHealthData) list.get(0), this.f27830a);
            } else {
                LogUtil.j("BloodPressureDynamicProvider", "DynamicBpResultListener dataList is empty");
                bloodPressureDynamicProvider.b(this.d, this.f27830a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SectionBean sectionBean, dfn dfnVar) {
        if (sectionBean == null || dfnVar == null) {
            LogUtil.j("BloodPressureDynamicProvider", "getPlanData error");
            return;
        }
        long jI = dfnVar.i();
        long jB = dfnVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("BloodPressureDynamicProvider", "getPlanData planStartTime: ", Long.valueOf(jI), " planEndTime: ", Long.valueOf(jB), " now: ", Long.valueOf(jCurrentTimeMillis));
        e(jCurrentTimeMillis, sectionBean, dfnVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SectionBean sectionBean, HiHealthData hiHealthData, dfn dfnVar) {
        String metaData = hiHealthData.getMetaData();
        if (TextUtils.isEmpty(metaData)) {
            LogUtil.j("BloodPressureDynamicProvider", "getLatestPlan metaData is empty");
            b(sectionBean, dfnVar);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(metaData);
            String strOptString = jSONObject.optString("planID");
            String strC = dfnVar.c();
            long jI = dfnVar.i();
            long jB = dfnVar.b();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ReleaseLogUtil.d("BloodPressureDynamicProvider", "getLatestPlan recordPlanID: ", strOptString, " statusPlanId: ", strC, " planStartTime: ", Long.valueOf(jI), " planEndTime: ", Long.valueOf(jB), " now: ", Long.valueOf(jCurrentTimeMillis));
            if (TextUtils.equals(strOptString, strC)) {
                c(sectionBean, jSONObject);
            } else {
                e(jCurrentTimeMillis, sectionBean, dfnVar, jSONObject);
            }
        } catch (JSONException unused) {
            LogUtil.e("BloodPressureDynamicProvider", "getLatestPlan JSONException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SectionBean sectionBean) {
        d(new a(this, sectionBean));
    }

    private void d(HiDataReadResultListener hiDataReadResultListener) {
        HiHealthManager.d(this.f27823b).readHiHealthDataPro(HiDataReadProOption.builder().e(b()).a(1).b(), hiDataReadResultListener);
    }

    private HiDataReadOption b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{700019});
        return hiDataReadOption;
    }

    private void c(SectionBean sectionBean, dfn dfnVar) {
        utg utgVar = new utg();
        float fH = dfnVar.h();
        if (Float.compare(fH, 0.0f) <= 0) {
            this.i = DynamicBpStatus.PLAN_IN_PROGRESS_NO_DATA;
            utgVar.d(d(dfnVar.i(), dfnVar.b()));
        } else {
            this.i = DynamicBpStatus.PLAN_IN_PROGRESS;
            utgVar.d(dfnVar.a());
            utgVar.c(dfnVar.d());
            utgVar.c(dfnVar.e());
            utgVar.c(fH);
            utgVar.d(d(dfnVar.i(), dfnVar.b()));
        }
        sectionBean.c(utgVar);
    }

    private void e(long j, SectionBean sectionBean, dfn dfnVar, JSONObject jSONObject) {
        if (System.currentTimeMillis() - dfnVar.b() < 5000) {
            if (j < dfnVar.i()) {
                d(sectionBean, dfnVar);
                return;
            } else {
                c(sectionBean, dfnVar);
                return;
            }
        }
        if (jSONObject != null) {
            c(sectionBean, jSONObject);
        } else {
            d(sectionBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SectionBean sectionBean) {
        this.i = DynamicBpStatus.NO_PLAN_DATA;
        sectionBean.c(new utg());
    }

    private void d(SectionBean sectionBean, dfn dfnVar) {
        if (dfnVar == null) {
            LogUtil.j("BloodPressureDynamicProvider", "showFutureDynamicData dynamicBp is null");
            return;
        }
        this.i = DynamicBpStatus.FUTURE_PLAN;
        long jI = dfnVar.i();
        long jB = dfnVar.b();
        if (jB < jI) {
            jB = lsl.d(jI, 1);
        }
        String str = String.format(Locale.ROOT, this.f27823b.getString(R.string.IDS_dynamic_bp_plan_future_time), DateFormatUtil.a(jI, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_HH_MM).replace(",", " "));
        String strD = d(jI, jB);
        utg utgVar = new utg();
        utgVar.e(str);
        utgVar.d(strD);
        sectionBean.c(utgVar);
    }

    private String d(long j, long j2) {
        String strA;
        String strA2;
        if (lsl.i(j, j2)) {
            strA = DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_HH_MM);
            strA2 = DateFormatUtil.a(j2, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_HH_MM);
        } else {
            strA = DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YMD_HM2);
            strA2 = DateFormatUtil.a(j2, DateFormatUtil.DateFormatType.DATE_FORMAT_YMD_HM2);
        }
        return String.format(Locale.ROOT, this.f27823b.getString(R.string.IDS_blood_pressure_time), strA.replace(",", " "), strA2.replace(",", " "));
    }

    static class a implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BloodPressureDynamicProvider> f27829a;
        private SectionBean e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public a(BloodPressureDynamicProvider bloodPressureDynamicProvider, SectionBean sectionBean) {
            this.f27829a = new WeakReference<>(bloodPressureDynamicProvider);
            this.e = sectionBean;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("BloodPressureDynamicProvider", "DynamicBpResultListener data: ", obj, " errorCode: ", Integer.valueOf(i));
            BloodPressureDynamicProvider bloodPressureDynamicProvider = this.f27829a.get();
            if (bloodPressureDynamicProvider == null) {
                LogUtil.j("BloodPressureDynamicProvider", "DynamicBpResultListener provider == null");
                return;
            }
            if (i != 0 || !(obj instanceof SparseArray)) {
                bloodPressureDynamicProvider.d(this.e);
                return;
            }
            Object obj2 = ((SparseArray) obj).get(700019);
            List list = obj2 instanceof List ? (List) obj2 : null;
            if (!coq.d(list)) {
                bloodPressureDynamicProvider.e((HiHealthData) list.get(0), this.e);
            } else {
                LogUtil.j("BloodPressureDynamicProvider", "DynamicBpResultListener dataList is empty");
                bloodPressureDynamicProvider.d(this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HiHealthData hiHealthData, SectionBean sectionBean) {
        String metaData = hiHealthData.getMetaData();
        if (TextUtils.isEmpty(metaData)) {
            d(sectionBean);
            return;
        }
        try {
            c(sectionBean, new JSONObject(metaData));
        } catch (JSONException unused) {
            LogUtil.e("BloodPressureDynamicProvider", "getDynamicBpData JSONException");
        }
    }

    private void c(SectionBean sectionBean, JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("BloodPressureDynamicProvider", "handlePlanIsFinish error");
            return;
        }
        this.i = DynamicBpStatus.COMPLETE_PLAN;
        utg utgVar = new utg();
        long jOptLong = jSONObject.optLong("planStartTime");
        long jOptLong2 = jSONObject.optLong("planActualTime");
        if (jOptLong2 < jOptLong) {
            jOptLong2 = lsl.d(jOptLong, 1);
        }
        int iOptInt = jSONObject.optInt("validCntAll");
        int iOptInt2 = jSONObject.optInt("avgSystolicBpAll");
        int iOptInt3 = jSONObject.optInt("avgDiastolicBpAll");
        int iOptInt4 = jSONObject.optInt("planStatus");
        boolean zContains = jSONObject.optString("extendData").contains("isRead");
        this.d = !zContains;
        utgVar.e(zContains);
        LogUtil.a("BloodPressureDynamicProvider", "handlePlanIsFinish validCntAll: ", Integer.valueOf(iOptInt), " avgSystolicBpAll: ", Integer.valueOf(iOptInt2), " avgDiastolicBpAll: ", Integer.valueOf(iOptInt3), " planStatus: ", Integer.valueOf(iOptInt4), " planStartTime: ", Long.valueOf(jOptLong), " planActualTime: ", Long.valueOf(jOptLong2), " isRead: ", Boolean.valueOf(zContains));
        utgVar.d(d(jOptLong, jOptLong2));
        utgVar.c(iOptInt2);
        utgVar.d(iOptInt3);
        if (iOptInt != 0) {
            ReleaseLogUtil.d("BloodPressureDynamicProvider", "planStatus: ", Integer.valueOf(iOptInt4));
            if (iOptInt4 == 3) {
                this.i = DynamicBpStatus.NOT_ENOUGH_DATA;
                utgVar.c(this.f27823b.getString(R.string.IDS_dynamic_bp_measure_times_desc_day));
            } else if (iOptInt4 == 4) {
                this.i = DynamicBpStatus.NOT_ENOUGH_DATA;
                utgVar.c(this.f27823b.getString(R.string.IDS_dynamic_bp_measure_times_desc_night));
            } else if (iOptInt4 == 5) {
                this.i = DynamicBpStatus.NOT_ENOUGH_DATA;
                utgVar.c(this.f27823b.getString(R.string.IDS_dynamic_bp_measure_times_desc));
            } else if (iOptInt4 == 1) {
                this.i = DynamicBpStatus.PLAN_TERMINATE;
                utgVar.c(this.f27823b.getString(R.string.IDS_dynamic_bp_plan_terminate));
            }
            sectionBean.c(utgVar);
            return;
        }
        this.i = DynamicBpStatus.FINISH_NO_DATA;
        sectionBean.c(utgVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, utg utgVar) {
        if (utgVar == null) {
            LogUtil.j("BloodPressureDynamicProvider", "parseParams data is null");
            return;
        }
        map.put("PLAN_STATUS", this.i);
        map.put("READ_STATUS", Boolean.valueOf(utgVar.j()));
        ReleaseLogUtil.d("BloodPressureDynamicProvider", "parseParam mPlanType: ", this.i);
        switch (AnonymousClass1.f27825b[this.i.ordinal()]) {
            case 1:
                this.f27824c = Constants.NULL;
                map.put("PLAN_DESC", this.f27823b.getString(R.string.IDS_dynamic_bp_no_data));
                break;
            case 2:
                this.f27824c = "future_data";
                map.put("PLAN_DESC", this.f27823b.getString(R.string.IDS_dynamic_bp_be_activated));
                map.put("FUTURE_PLAN_DESC", utgVar.a());
                map.put("PLAN_TIME", utgVar.c());
                break;
            case 3:
                this.f27824c = "no_current_data";
                map.put("PLAN_TIME", utgVar.c());
                map.put("PLAN_DESC_ONE", this.f27823b.getString(R.string.IDS_dynamic_bp_no_valid_data));
                map.put("VALUE", "--");
                map.put("UNIT", this.f27823b.getString(R.string.IDS_device_measure_pressure_value_unit));
                break;
            case 4:
            case 5:
                this.f27824c = "no_current_data";
                map.put("PLAN_DESC_TWO", utgVar.d());
            case 6:
                this.f27824c = "no_current_data";
                d(utgVar, map);
                break;
            case 7:
                this.f27824c = "current_data";
                e(utgVar, map);
                break;
            case 8:
                this.f27824c = "current_data";
                map.put("PLAN_TIME", utgVar.c());
                map.put("PROGRESS", 0);
                map.put("PROGRESS_DESC", e(this.f27823b.getString(R.string.IDS_dynamic_bp_plan_process, UnitUtil.e(0, 2, 0)), String.valueOf(0)));
                map.put("VALUE", "--");
                map.put("UNIT", this.f27823b.getString(R.string.IDS_device_measure_pressure_value_unit));
                break;
        }
        map.put("READ_BIMAP", d());
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureDynamicProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f27825b;

        static {
            int[] iArr = new int[DynamicBpStatus.values().length];
            f27825b = iArr;
            try {
                iArr[DynamicBpStatus.NO_PLAN_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27825b[DynamicBpStatus.FUTURE_PLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27825b[DynamicBpStatus.FINISH_NO_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27825b[DynamicBpStatus.NOT_ENOUGH_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27825b[DynamicBpStatus.PLAN_TERMINATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27825b[DynamicBpStatus.COMPLETE_PLAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27825b[DynamicBpStatus.PLAN_IN_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27825b[DynamicBpStatus.PLAN_IN_PROGRESS_NO_DATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private void e(utg utgVar, HashMap<String, Object> map) {
        int iH = utgVar.h();
        int iE = utgVar.e();
        map.put("PLAN_TIME", utgVar.c());
        int iIntValue = BigDecimal.valueOf(utgVar.g() * 100.0f).setScale(0, 4).intValue();
        map.put("PROGRESS", Integer.valueOf(iIntValue));
        map.put("PROGRESS_DESC", e(this.f27823b.getString(R.string.IDS_dynamic_bp_plan_process, UnitUtil.e(iIntValue, 2, 0)), String.valueOf(iIntValue)));
        map.put("PLAN_DESC_ONE", this.f27823b.getString(R.string.IDS_dynamic_bp_latest_time, DateFormatUtil.a(utgVar.b(), DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_HH_MM).replace(",", " ")));
        map.put("VALUE", a(iH, iE));
        map.put("UNIT", "");
    }

    private void d(utg utgVar, HashMap<String, Object> map) {
        map.put("PLAN_TIME", utgVar.c());
        int iH = utgVar.h();
        int iE = utgVar.e();
        map.put("PROGRESS", Float.valueOf(uub.e(iH, iE)));
        map.put("PLAN_DESC_ONE", this.f27823b.getString(R.string.IDS_dynamic_bp_avg_desc, UnitUtil.e(24.0d, 1, 0)));
        boolean zA = uub.a(iH, iE);
        this.f27822a = zA;
        if (zA) {
            map.put("LEVEL", this.f27823b.getString(R.string.IDS_dynamic_bp_high));
            map.put("LEVEL_COLOR", Integer.valueOf(R.color.dynamic_blood_pressure_high));
        } else {
            map.put("LEVEL", this.f27823b.getString(R.string.IDS_hw_normal));
            map.put("LEVEL_COLOR", Integer.valueOf(R.color.dynamic_blood_pressure_normal));
        }
        map.put("VALUE", a(iH, iE));
        map.put("UNIT", "");
    }

    private SpannableString e(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, str2, R.color.textColorPrimary);
        qri.e(spannableString, str2, R.string.textFontFamilyMedium);
        return spannableString;
    }

    private HashMap<String, Object> e() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("TITLE", this.f27823b.getString(R.string.IDS_hw_device_more_data));
        map.put("SUBTITLE", this.f27823b.getString(R.string.IDS_dynamic_bp_subtitle));
        map.put("RIGHT_ICON", Integer.valueOf(R.drawable.common_ui_arrow_right));
        map.put("HEAD_PIC", ContextCompat.getDrawable(this.f27823b, R.drawable.health_dynamic_bp));
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass3());
        return map;
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureDynamicProvider$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {
        AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qrs.r()) {
                LogUtil.a("BloodPressureDynamicProvider", "click too fast");
            } else {
                LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: utr
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f50561a.b(i, obj);
                    }
                }, "");
            }
        }

        public /* synthetic */ void b(int i, Object obj) {
            if (i == 0) {
                BloodPressureDynamicProvider.this.c();
            } else {
                LogUtil.j("BloodPressureDynamicProvider", "onClick errorCode = ", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b(1);
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/AllData");
        builder.setImmerse();
        builder.setForceDarkMode(1);
        builder.showStatusBar();
        ddv.b().loadH5ProApp(this.f27823b, "com.huawei.health.h5.abpm", builder);
    }

    private Map<String, Object> d() {
        HashMap map = new HashMap();
        map.put("pageId", "BloodPressure_0001");
        map.put(FunctionSetBeanReader.BI_ELEMENT, "r1");
        map.put("value", "ABPM");
        map.put("moduleName", "medical_related");
        HashMap map2 = new HashMap();
        map2.put("moduleName", "ABPM");
        map2.put(FunctionSetBeanReader.BI_HAS_DATA, this.f27824c);
        if (!Utils.o()) {
            map2.put("abnormalReminder", Boolean.valueOf(this.f27822a));
        }
        map2.put("dataUpdate", Boolean.valueOf(this.d));
        map.put("pageProperties", map2);
        return map;
    }

    private void b(int i) {
        Map<String, Object> mapD = d();
        mapD.put("event", Integer.valueOf(i));
        LogUtil.a("BloodPressureDynamicProvider", "uploadBiEvent card , HEALTH_HOME_BLOOD_PRESSURE_DETAIL_2010025: ", mapD.toString());
        lmf.d().c(this.f27823b, AnalyticsValue.HEALTH_HOME_BLOOD_PRESSURE_DETAIL_2010025.value(), mapD, 0);
    }

    private CharSequence a(int i, int i2) {
        double d = i2;
        SpannableString spannableString = new SpannableString(qre.e(R.plurals.IDS_blood_pressure_result_unit, UnitUtil.b(d, Locale.getDefault()), UnitUtil.e(i, 1, 0), UnitUtil.e(d, 1, 0)));
        Matcher matcher = Pattern.compile("[\\d\\/]", 2).matcher(spannableString);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            qri.d(spannableString, iStart, iEnd, new AbsoluteSizeSpan(18, true));
            qri.d(spannableString, iStart, iEnd, new qli(qrr.e()));
            qri.d(spannableString, iStart, iEnd, new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.getContext(), R.color.textColorPrimary)));
        }
        return spannableString;
    }
}
