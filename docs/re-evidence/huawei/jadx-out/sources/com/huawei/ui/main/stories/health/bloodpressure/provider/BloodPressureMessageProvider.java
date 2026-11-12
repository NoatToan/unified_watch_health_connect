package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.view.SectionMessageWindow;
import com.huawei.health.vip.api.VipApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureMessageProvider;
import defpackage.ddv;
import defpackage.ffc;
import defpackage.ffd;
import defpackage.ffq;
import defpackage.ffv;
import defpackage.ift;
import defpackage.iov;
import defpackage.irx;
import defpackage.irz;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qrs;
import defpackage.ugs;
import defpackage.vcu;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureMessageProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f27846b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f27847c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27848a;
    private DeviceInboxInfo d;
    private int e;
    private String f;
    private JSONObject i;
    private String j;
    private String k;
    private boolean l;
    private String n;
    private boolean o;
    private boolean p;
    private long q;
    private boolean s;
    private boolean t;
    private String u;
    private PayApi v;
    private SectionMessageWindow.b w;
    private SectionBean x;
    private int h = 0;
    private int y = 2;
    private volatile ffd m = new ffd();
    private boolean g = false;
    private boolean r = false;

    public static /* synthetic */ void a(View view) {
    }

    public static /* synthetic */ void e(View view) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return f27846b;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("BloodPressureMessageProvider", "loadData");
        this.x = sectionBean;
        if (isActive(context)) {
            c();
        }
        this.x = sectionBean;
        f();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("BloodPressureMessageProvider", "loadDefaultData");
        super.loadDefaultData(sectionBean);
        sectionBean.c(d(BaseApplication.getContext()));
        sectionBean.c(new Object());
    }

    private void f() {
        f27847c = -1;
        this.v = (PayApi) Services.d("TradeService", PayApi.class);
        List<DeviceBenefitQueryParam> listD = qhu.d("BloodPressureMessageProvider", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_INBOX);
        PayApi payApi = this.v;
        if (payApi != null) {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: utu
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f50564b.e(i, obj);
                }
            });
            if (!njy.e(listD)) {
                this.v.getAllDeviceBenefits(listD, new c(this));
                return;
            } else {
                LogUtil.j("BloodPressureMessageProvider", "getData() queryParamList isEmpty");
                return;
            }
        }
        LogUtil.j("BloodPressureMessageProvider", "payApi is null");
        f27846b = false;
    }

    public /* synthetic */ void e(int i, Object obj) {
        LogUtil.e("BloodPressureMessageProvider", "errorCode " + i);
        if (i == 0 && (obj instanceof RepeatResourceBenefitInfo)) {
            LogUtil.e("BloodPressureMessageProvider", "objData instanceof RepeatResourceBenefitInfo");
            RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
            f27846b = a(repeatResourceBenefitInfo);
            c(repeatResourceBenefitInfo);
            return;
        }
        LogUtil.e("BloodPressureMessageProvider", "objData ! instanceof RepeatResourceBenefitInfo");
        f27846b = false;
    }

    private void c(RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        if (TextUtils.isEmpty(repeatResourceBenefitInfo.getExtendInfo())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(repeatResourceBenefitInfo.getExtendInfo());
            if (jSONObject.has("benefitType")) {
                int i = jSONObject.getInt("benefitType");
                if (i == 1) {
                    f27847c = 1;
                } else if (i == 0) {
                    f27847c = 2;
                } else {
                    f27847c = -1;
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("BloodPressureMessageProvider", "JSONException");
        }
    }

    private boolean a(RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        return repeatResourceBenefitInfo.getExpireTime().longValue() >= d(repeatResourceBenefitInfo);
    }

    private long d(RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        return repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis();
    }

    private HashMap<String, Object> d(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("RIGHT_ICON_IMAGE", ContextCompat.getDrawable(context, R.drawable.ic_doctor_icon));
        map.put("MIDDLE_ICON_IMAGE", ContextCompat.getDrawable(context, R.drawable.ic_doctor_message_green));
        map.put("ITEM_BUTTON_TEXT", context.getResources().getString(R.string.IDS_hw_doctor_button));
        map.put("GUIDE_BUBBLE_TEXT", context.getResources().getString(R.string.IDS_hw_doctor_dialogue));
        map.put("DOCTOR_ITEM_DESCRIPTION", context.getResources().getString(R.string.IDS_hw_doctor_message));
        map.put("LEFT_BUTTON_VISIBILITY", Boolean.valueOf(Utils.h() && CommonUtil.ab(context) && Utils.l()));
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("BloodPressureMessageProvider", "parseParams");
        a(context, map, obj);
        e(context, map);
        a(map);
    }

    private void a(Context context, HashMap map, Object obj) {
        StringBuilder sb = new StringBuilder("setData, setBindingResource, data is instance of HealthLifeChallengeBean: ");
        boolean z = obj instanceof ffd;
        sb.append(z);
        LogUtil.a("BloodPressureMessageProvider", sb.toString());
        map.put("TITLE", context.getResources().getString(R.string.IDS_bloodpressure_manager));
        Resources resources = context.getResources();
        int i = R.plurals.IDS_hw_doctor_icon;
        int i2 = this.h;
        map.put("RIGHT_ICON_TEXT", resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        map.put("LEFT_ICON_IMAGE", ContextCompat.getDrawable(context, R.drawable.blood_pressure_challenge_plan));
        map.put("RIGHT_BUTTON_TOP_DES", context.getResources().getString(R.string.IDS_blood_pressure_remind_plan));
        map.put("RIGHT_BUTTON_BOTTOM_DES", context.getResources().getString(R.string.IDS_hw_challenge_timed_reminder_blood_measurement));
        map.put("RIGHT_BUTTON_IMAGE", ContextCompat.getDrawable(context, R.drawable.blood_pressure_measure_plan));
        c(map);
        if (z) {
            map.put("IS_LOAD_DEFAULT_VIEW", false);
            map.put("ITEM_DESCRIPTION", context.getResources().getString(R.string.IDS_guardian_health_management));
            a(context, map, (ffd) obj);
        } else {
            map.put("IS_LOAD_DEFAULT_VIEW", true);
            map.put("ITEM_DESCRIPTION", context.getResources().getString(R.string.IDS_guardian_health_management));
            map.put("ITEM_DESCRIPTION_BOTTOM", context.getResources().getString(R.string.IDS_blood_pressure_protection));
        }
        if (TextUtils.isEmpty(this.k)) {
            return;
        }
        map.put("ITEM_DESCRIPTION_BOTTOM", this.k);
    }

    private void e(Context context, HashMap map) {
        if (map == null || context == null) {
            return;
        }
        map.put("IS_REMIND_SHOW", Boolean.valueOf(this.r));
        map.put("BANNER_CARD_CONTENT", this.u);
        map.put("BANNER_CARD_SUBMIT", BaseApplication.getContext().getString(R.string.IDS_h5_vip_active_now));
    }

    private void c(final HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.q) <= 5000) {
            if (this.p) {
                d(map, this.i);
            }
        } else {
            this.q = jCurrentTimeMillis;
            ugs.e().getDoctorBasicInfo(new DataCallback() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureMessageProvider.1
                @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("BloodPressureMessageProvider", "fail to get doctor message");
                    BloodPressureMessageProvider.this.p = true;
                    BloodPressureMessageProvider.this.i = null;
                    BloodPressureMessageProvider bloodPressureMessageProvider = BloodPressureMessageProvider.this;
                    bloodPressureMessageProvider.d(map, bloodPressureMessageProvider.i);
                }

                @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    BloodPressureMessageProvider.this.p = true;
                    BloodPressureMessageProvider.this.i = jSONObject;
                    BloodPressureMessageProvider.this.d(map, jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HashMap map, JSONObject jSONObject) {
        SectionMessageWindow.b bVar = new SectionMessageWindow.b();
        if (jSONObject == null || jSONObject.optInt("resultCode") == 1 || TextUtils.isEmpty(jSONObject.optString("doctorId")) || "0".equals(jSONObject.optString("doctorId"))) {
            LogUtil.a("BloodPressureMessageProvider", "don‘t has doctor info , privilege is： ", Boolean.valueOf(f27846b));
            bVar.a(f27846b);
            bVar.c(false);
            bVar.a("");
            bVar.d("");
            bVar.c("");
            map.put("TOP_CARD_BEAN", bVar);
            if (bVar.c(this.w)) {
                LogUtil.a("BloodPressureMessageProvider", "same topCardBean");
                return;
            } else {
                this.w = bVar;
                this.x.c(new Object());
                return;
            }
        }
        LogUtil.a("BloodPressureMessageProvider", "doctor info is " + jSONObject);
        this.n = String.format(Locale.ROOT, BaseApplication.getContext().getResources().getString(R.string.IDS_hw_doctor_name), jSONObject.optString("doctorName"));
        this.f = String.format(Locale.ROOT, "%s %s", jSONObject.optString("doctorDepartment"), jSONObject.optString("doctorLevel"));
        this.j = jSONObject.optString("doctorHeadIcon");
        bVar.a(this.n);
        bVar.d(this.f);
        bVar.c(this.j);
        LogUtil.a("BloodPressureMessageProvider", "if not join privilege " + f27846b);
        if (f27846b) {
            LogUtil.a("BloodPressureMessageProvider", "has join privilege");
            bVar.a(true);
            bVar.c(true);
            this.t = true;
        } else {
            LogUtil.a("BloodPressureMessageProvider", "has not join privilege");
            bVar.a(false);
            bVar.c(true);
            this.t = false;
        }
        map.put("TOP_CARD_BEAN", bVar);
        LogUtil.a("BloodPressureMessageProvider", "doctor name:" + this.n + "doctor describe:" + this.f + "doctor img url:" + this.j + "is show:" + this.t);
        if (bVar.c(this.w)) {
            LogUtil.a("BloodPressureMessageProvider", "same topCardBean");
        } else {
            this.w = bVar;
            this.x.c(new Object());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CopyOnWriteArrayList<DeviceBenefits> copyOnWriteArrayList) {
        LogUtil.a("BloodPressureMessageProvider", "processingData enter");
        if (!njy.e(copyOnWriteArrayList)) {
            for (DeviceBenefits deviceBenefits : copyOnWriteArrayList) {
                List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
                LogUtil.a("BloodPressureMessageProvider", "inboxInfos  = ", inboxInfos);
                if (!njy.e(inboxInfos)) {
                    for (DeviceInboxInfo deviceInboxInfo : inboxInfos) {
                        boolean zC = vcu.c(deviceInboxInfo);
                        this.r = zC;
                        LogUtil.a("BloodPressureMessageProvider", "mIsShowTips  = ", Boolean.valueOf(zC));
                        if (this.r) {
                            this.d = deviceInboxInfo;
                            deviceInboxInfo.setDeviceBenefitInfos(deviceBenefits.getBenefitInfos());
                            String strE = irx.e(this.d);
                            if (TextUtils.isEmpty(strE)) {
                                strE = Product.YEAR_DURATION_FLAG;
                            }
                            String strB = irz.b(strE);
                            LogUtil.a("BloodPressureMessageProvider", "timeStr  = ", strB);
                            String strE2 = vcu.e(R.string.IDS_user_service_has_pick_tip, strB);
                            this.u = strE2;
                            LogUtil.a("BloodPressureMessageProvider", "mTipText  = ", strE2);
                            break;
                        }
                    }
                } else {
                    LogUtil.j("BloodPressureMessageProvider", "processingData() deviceBenefits.getInboxInfos() isEmpty");
                }
            }
        } else {
            LogUtil.j("BloodPressureMessageProvider", "processingData() deviceBenefitsList isEmpty");
        }
        this.x.c(new Object());
    }

    private void g() {
        Context context = BaseApplication.getContext();
        int i = this.y;
        if (i == 1) {
            LogUtil.a("BloodPressureMessageProvider", "Ask the doctor by h5");
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath("#/ServiceRedirection?scene=3&from=4&pageType=1&packageType=" + f27847c);
            ddv.b().loadH5ProApp(context, "com.huawei.health.h5.vip", builder);
            return;
        }
        if (i == 2) {
            LogUtil.a("BloodPressureMessageProvider", "Ask the doctor by deeplink");
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?h5pro=true&isNeedLogin=true&path=ServiceRedirection&scene=3&from=4&pageType=1&packageType=" + f27847c));
            intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
            iov.d(context, intent);
            return;
        }
        LogUtil.j("BloodPressureMessageProvider", "clickDeviceInboxInfo error linkType");
    }

    private void a(Context context, HashMap map, ffd ffdVar) {
        int iB = ffdVar.b();
        if (iB == 0) {
            LogUtil.j("BloodPressureMessageProvider", "setChallengeBean failed startDay is invalid");
            return;
        }
        try {
            int iD = HiDateUtil.d(iB, HiDateUtil.d(System.currentTimeMillis()), "yyyyMMdd");
            SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.IDS_bloodpressure_challenge_joind, iD, Integer.valueOf(iD)));
            String strValueOf = String.valueOf(iD);
            int iIndexOf = spannableString.toString().indexOf(strValueOf);
            if (iIndexOf != -1) {
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.colorAccent)), iIndexOf, strValueOf.length() + iIndexOf, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.hiad_text_18_sp)), iIndexOf, strValueOf.length() + iIndexOf, 33);
            }
            this.k = spannableString.toString();
            if (this.g) {
                map.put("BUTTON_TEXT", context.getResources().getString(R.string.IDS_hw_challenge_weekly_report));
            } else {
                map.put("BUTTON_TEXT", "");
            }
        } catch (ParseException e) {
            LogUtil.e("BloodPressureMessageProvider", "parseParams parseException ", LogAnonymous.b(e));
        }
    }

    private void a(Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureMessageProvider.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(final String str) {
                if (qrs.c(500)) {
                    LogUtil.a("BloodPressureMessageProvider", "onClick isFastClick");
                } else {
                    LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureMessageProvider.3.3
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (i != -1) {
                                BloodPressureMessageProvider.this.a(str);
                            } else {
                                LogUtil.a("BloodPressureMessageProvider", "has not login");
                            }
                        }
                    }, "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LogUtil.a("BloodPressureMessageProvider", "setOnClickListener, subView: " + str);
        if ("ALL_CLICK_EVENT".equals(str)) {
            l();
            return;
        }
        if ("BUTTON_CLICK_EVENT".equals(str)) {
            i();
            return;
        }
        if ("DOCTOR_BUTTON_CLICK_EVENT".equals(str)) {
            LogUtil.a("BloodPressureMessageProvider", "Ask the doctor");
            g();
            return;
        }
        if ("BANNER_CARD_SUBMIT_CLICK_EVENT".equals(str)) {
            k();
            return;
        }
        if ("MEASURE_PLAN_BUTTON_CLICK_EVENT".equals(str)) {
            LogUtil.a("BloodPressureMessageProvider", "Not the first time in the Blood Pressure measure plan.");
            t();
        } else if ("RIGHT_BOTTOM_TEXT".equals(str)) {
            LogUtil.a("BloodPressureMessageProvider", "startBloodPressureToast");
            o();
        } else {
            LogUtil.a("BloodPressureMessageProvider", "useless click");
        }
    }

    private void o() {
        LogUtil.j("BloodPressureMessageProvider", "startBloodPressureToast.");
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi != null) {
            vipApi.startEquityDialogActivity();
        } else {
            LogUtil.j("BloodPressureMessageProvider", "vipApi is null.");
        }
    }

    private void l() {
        LogUtil.a("BloodPressureMessageProvider", "showToastOrJumpToHealthLife mIsJoinPlan ", Boolean.valueOf(this.s), " mIsJoinDoctorPlan ", Boolean.valueOf(this.l), " mIsJoinHealthLife ", Boolean.valueOf(this.o));
        if (this.s || this.l || a()) {
            LogUtil.a("BloodPressureMessageProvider", "has joined plan");
            b(1);
            ffv.a(com.huawei.haf.application.BaseApplication.j(), Uri.parse("").buildUpon().appendQueryParameter("from", "/Main/KnitBloodPressureActivity").build());
        } else if (this.o) {
            LogUtil.a("BloodPressureMessageProvider", "has other plan");
            m();
        } else {
            LogUtil.a("BloodPressureMessageProvider", "no plan");
            n();
        }
    }

    public boolean a() {
        try {
            JSONArray jSONArray = new JSONArray(ffv.a(HiDateUtil.d(System.currentTimeMillis())));
            if (jSONArray.length() != 0) {
                return ((JSONObject) jSONArray.get(0)).getInt("dataSource") == 1;
            }
            LogUtil.a("BloodPressureMessageProvider", "jsonObject length is 0");
            return false;
        } catch (JSONException unused) {
            LogUtil.a("BloodPressureMessageProvider", "get doctor plan fail");
            return false;
        }
    }

    private void i() {
        LogUtil.a("BloodPressureMessageProvider", "jumpToWeeklyReport mIsJoinPlan ", Boolean.valueOf(this.s), " mIsJoinDoctorPlan ", Boolean.valueOf(this.l));
        if (this.s || this.l) {
            b(2);
            d(this.f27848a);
        }
    }

    private void k() {
        LogUtil.a("BloodPressureMessageProvider", "GuardianBanner is clicked");
        if (this.d == null) {
            LogUtil.j("BloodPressureMessageProvider", "exclusiveGuardianInboxInfo is null");
        } else {
            if (com.huawei.haf.application.BaseApplication.j() == null) {
                LogUtil.j("BloodPressureMessageProvider", "setBannerClickEvent activity is null");
                return;
            }
            Context context = BaseApplication.getContext();
            DeviceInboxInfo deviceInboxInfo = this.d;
            irz.e(context, deviceInboxInfo, -1, deviceInboxInfo.getDeviceBenefitInfos());
        }
    }

    public void d(int i) {
        h();
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/ReportDetail?from=0&startTime=" + i);
        builder.setImmerse();
        builder.setForceDarkMode(1);
        builder.showStatusBar();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("BloodPressureMessageProvider", "jumpWeekReport activity is null");
        } else {
            ddv.b().loadH5ProApp(activityJ, "com.huawei.health.h5.blood-pressure", builder);
        }
    }

    private void n() {
        HandlerExecutor.b(new Runnable() { // from class: uuc
            @Override // java.lang.Runnable
            public final void run() {
                BloodPressureMessageProvider.d();
            }
        });
    }

    public static /* synthetic */ void d() {
        final Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("BloodPressureMessageProvider", "showJoinHealthLifeDialog activity is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activityJ);
        builder.b(R.string.IDS_hw_challenge_select_join);
        builder.c(R.string.IDS_hw_challenge_goto_join, new View.OnClickListener() { // from class: uty
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureMessageProvider.c(activityJ, view);
            }
        });
        builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: utw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureMessageProvider.a(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public static /* synthetic */ void c(Activity activity, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("from", "BloodPressure");
        AppRouter.c("/PluginHealthModel/HealthModelGuideActivity").d(bundle).b(activity);
    }

    private void m() {
        HandlerExecutor.b(new Runnable() { // from class: utx
            @Override // java.lang.Runnable
            public final void run() {
                this.f50566b.b();
            }
        });
    }

    public /* synthetic */ void b() {
        final Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("BloodPressureMessageProvider", "showJoinedChallenge activity is null");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activityJ);
        builder.a(com.huawei.ui.commonui.R.string.IDS_health_clover_title);
        builder.a(j());
        builder.a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: uue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(activityJ, view);
            }
        });
        builder.e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: uua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodPressureMessageProvider.e(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void d(Activity activity, View view) {
        h();
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/BasicSurvey?from=0");
        builder.setImmerse();
        builder.setForceDarkMode(1);
        builder.showStatusBar();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        ddv.b().loadH5ProApp(activity, "com.huawei.health.h5.blood-pressure", builder);
    }

    private void h() {
        ffv.r();
    }

    private void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: utt
            @Override // java.lang.Runnable
            public final void run() {
                this.f50563c.e();
            }
        });
    }

    public /* synthetic */ void e() {
        boolean zN = ffv.n();
        this.o = zN;
        if (!zN) {
            LogUtil.a("BloodPressureMessageProvider", "not blood pressure plan");
            this.x.c(new Object());
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ffd ffdVar = new ffd();
        d(countDownLatch, ffdVar);
        ffd ffdVar2 = new ffd();
        b(countDownLatch, ffdVar2);
        c(countDownLatch);
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            if (ffdVar2.b() != 0) {
                this.m.b(ffdVar2.b());
            }
            if (ffdVar.b() != 0) {
                this.m.b(ffdVar.b());
            }
            if (this.m.b() == 0) {
                this.x.c(new Object());
            } else {
                this.x.c(this.m);
            }
        } catch (InterruptedException unused) {
            LogUtil.a("BloodPressureMessageProvider", "getBloodPressureChallengeInfo failed");
        }
    }

    private void b(final CountDownLatch countDownLatch, final ffd ffdVar) {
        ffv.c("/Main/KnitBloodPressureActivity", (ResponseCallback<ffd>) new ResponseCallback() { // from class: uts
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.e(countDownLatch, ffdVar, i, (ffd) obj);
            }
        });
    }

    public /* synthetic */ void e(CountDownLatch countDownLatch, ffd ffdVar, int i, ffd ffdVar2) {
        LogUtil.a("BloodPressureMessageProvider", "getBloodPressureChallengeInfo data ", ffdVar2);
        if (this.m != null && ffdVar2 != null && TextUtils.equals(this.m.toString(), ffdVar2.toString())) {
            LogUtil.a("BloodPressureMessageProvider", "same HealthLifeChallengeBean");
            countDownLatch.countDown();
            return;
        }
        if (ffdVar2 != null) {
            this.s = ffv.d().contains(Integer.valueOf(ffdVar2.c()));
            ffdVar.b(ffdVar2.b());
        } else if (i == 0) {
            this.s = false;
        }
        countDownLatch.countDown();
    }

    private void c(final CountDownLatch countDownLatch) {
        this.f27848a = HiDateUtil.d(ift.c(System.currentTimeMillis(), -1));
        LogUtil.a("BloodPressureMessageProvider", "getBloodPressureChallengeInfo mIsJoinHealthLife ", Boolean.valueOf(this.o));
        ffv.d(this.f27848a, (ResponseCallback<ffc>) new ResponseCallback() { // from class: utz
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f50568a.d(countDownLatch, i, (ffc) obj);
            }
        });
    }

    public /* synthetic */ void d(CountDownLatch countDownLatch, int i, ffc ffcVar) {
        if (ffcVar != null) {
            this.e = CommonUtils.j(ffcVar.c());
            this.g = ffv.d().contains(Integer.valueOf(this.e));
        }
        countDownLatch.countDown();
    }

    private void d(final CountDownLatch countDownLatch, final ffd ffdVar) {
        ffv.e("/Main/KnitBloodPressureActivity", (ResponseCallback<ffq>) new ResponseCallback() { // from class: utv
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f50565c.d(ffdVar, countDownLatch, i, (ffq) obj);
            }
        });
    }

    public /* synthetic */ void d(ffd ffdVar, CountDownLatch countDownLatch, int i, ffq ffqVar) {
        if (ffdVar != null && ffqVar != null) {
            int iD = (int) ffqVar.d();
            this.l = iD > 0;
            ffdVar.b(iD);
        }
        countDownLatch.countDown();
    }

    private String j() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hw_challenge_free);
    }

    private void t() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", 2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_MORE_2030088.value(), map, 0);
        AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-data-subpage?h5pro=true&path=bloodPressureSettingNew")).i();
    }

    private void b(int i) {
        if (i == 1) {
            HashMap map = new HashMap(16);
            map.put("click", "1");
            map.put("from", "1");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BLOOD_PRESSURE_JUMP_TO_HEALTH_LIFE_2040207.value(), map, 0);
            return;
        }
        if (i == 2) {
            HashMap map2 = new HashMap(16);
            map2.put("click", "1");
            map2.put("type", 1);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_MANAGE_PLAN_WEEKLY_2030089.value(), map2, 0);
            return;
        }
        LogUtil.a("BloodPressureMessageProvider", "default biEvent");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "BloodPressureMessageProvider";
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BloodPressureMessageProvider> f27851a;

        c(BloodPressureMessageProvider bloodPressureMessageProvider) {
            this.f27851a = new WeakReference<>(bloodPressureMessageProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("BloodPressureMessageProvider", "GetAllDeviceBenefitsCallback errorCode = ", Integer.valueOf(i));
            BloodPressureMessageProvider bloodPressureMessageProvider = this.f27851a.get();
            if (bloodPressureMessageProvider == null) {
                LogUtil.j("BloodPressureMessageProvider", "guardianBannerProvider is null");
            } else if (i == 0 && (obj instanceof CopyOnWriteArrayList)) {
                bloodPressureMessageProvider.d((CopyOnWriteArrayList<DeviceBenefits>) obj);
            } else {
                LogUtil.j("BloodPressureMessageProvider", "errorCode not success");
            }
        }
    }
}
