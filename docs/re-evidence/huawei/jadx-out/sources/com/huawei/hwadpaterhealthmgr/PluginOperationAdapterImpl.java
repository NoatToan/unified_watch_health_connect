package com.huawei.hwadpaterhealthmgr;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.algorithm.api.BreathTrainApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.agreement.AgrHttp;
import com.huawei.hwcloudmodel.https.HttpResCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.ILoginCallback;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.adapter.SportData;
import com.huawei.operation.adapter.SportSummary;
import com.huawei.operation.adapter.SportsStatisticsCallback;
import com.huawei.operation.beans.WebViewConfig;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.Utils;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.openservice.db.control.OpenServiceControl;
import com.huawei.ui.openservice.db.model.OpenService;
import com.huawei.ui.openservice.db.model.UserServiceAuth;
import defpackage.dcv;
import defpackage.dmp;
import defpackage.dmv;
import defpackage.drw;
import defpackage.dxc;
import defpackage.ecu;
import defpackage.elh;
import defpackage.elo;
import defpackage.elx;
import defpackage.etn;
import defpackage.gxt;
import defpackage.ioi;
import defpackage.lky;
import defpackage.lro;
import defpackage.lyy;
import defpackage.mxf;
import defpackage.njy;
import defpackage.nud;
import defpackage.oru;
import defpackage.xjo;
import defpackage.xju;
import defpackage.xjw;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class PluginOperationAdapterImpl implements PluginOperationAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PluginOperationAdapterImpl f16984c;
    private static ioi d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f16985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f16986b;
    private IBaseResponseCallback e;
    private Map<Integer, Integer> f;
    private HealthOpenSDK h;
    private PluginOperation i;
    private List<SportSummary> k;
    private Map<String, Integer> m;
    private JSONArray o;
    private int s = 0;
    private int p = 0;
    private int q = 0;
    private int r = 0;
    private int n = 0;
    private long t = 0;
    private long l = 0;
    private long g = 0;
    private JSONObject j = null;
    private String w = null;
    private String x = null;

    private PluginOperationAdapterImpl(Context context) {
        this.i = null;
        if (context != null) {
            this.f16986b = context.getApplicationContext();
        } else {
            this.f16986b = BaseApplication.getContext();
        }
        this.i = PluginOperation.getInstance(this.f16986b);
        this.f = new HashMap();
        this.m = new HashMap();
        d();
    }

    public static PluginOperationAdapterImpl getInstance(Context context) {
        if (f16984c == null) {
            synchronized (PluginOperationAdapterImpl.class) {
                if (f16984c == null) {
                    f16984c = new PluginOperationAdapterImpl(context);
                    d = ioi.d();
                }
            }
        }
        return f16984c;
    }

    private void d() {
        this.f.put(1, 258);
        this.f.put(2, 257);
        this.f.put(3, 259);
        this.m.put("km", 1);
        this.m.put("s", 0);
        this.m.put("cal", 2);
    }

    public static void destroy() {
        f16984c = null;
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public Map<String, String> getInfo(String[] strArr) {
        return xjo.a(strArr);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getHealthData(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        xjw.a(j, j2, i, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getAnnualReport(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_PluginOperationAdapterImpl", "getAnnualReport year = ", Integer.valueOf(i));
        oru.a(this.f16986b).c(this.f16986b, i, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getHealthStat(String str, String str2, int i, IBaseResponseCallback iBaseResponseCallback) {
        xjw.e(str, str2, i, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public SportData getSportData() {
        a();
        SportData.Data data = new SportData.Data();
        data.configType(1);
        data.configValue(String.valueOf(this.s));
        ArrayList arrayList = new ArrayList();
        arrayList.add(data);
        SportData.Data data2 = new SportData.Data();
        data2.configType(2);
        data2.configValue(String.valueOf(this.q));
        arrayList.add(data2);
        SportData.Data data3 = new SportData.Data();
        data3.configType(3);
        data3.configValue(String.valueOf(this.p));
        arrayList.add(data3);
        e();
        LogUtil.a("Opera_PluginOperationAdapterImpl", "run = ", Integer.valueOf(this.r), "; ride = ", Integer.valueOf(this.n), "; run duration = ", Long.valueOf(this.t));
        SportData.Data data4 = new SportData.Data();
        data4.configType(4);
        data4.configValue(String.valueOf(this.r));
        arrayList.add(data4);
        SportData.Data data5 = new SportData.Data();
        data5.configType(5);
        data5.configValue(String.valueOf(this.n));
        arrayList.add(data5);
        SportData.Data data6 = new SportData.Data();
        data6.configType(6);
        data6.configValue(String.valueOf(this.t));
        arrayList.add(data6);
        SportData sportData = new SportData();
        sportData.configData(arrayList);
        return sportData;
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getSportData(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_PluginOperationAdapterImpl", "startDay = ", str, ",endDay = ", str2);
        this.j = new JSONObject();
        this.k = new ArrayList();
        this.o = new JSONArray();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = simpleDateFormat.parse(str);
            Date date2 = simpleDateFormat.parse(str2);
            this.l = xju.b(date);
            this.g = xju.e(date2);
            try {
                int iD = HiDateUtil.d(str, str2, "yyyyMMdd");
                LogUtil.a("Opera_PluginOperationAdapterImpl", "dayCounts = ", Integer.valueOf(iD));
                if (iD < 1 || iD > 10) {
                    LogUtil.e("Opera_PluginOperationAdapterImpl", "dayCounts is illegal !!");
                    iBaseResponseCallback.a(1001, null);
                    return;
                }
                for (int i = 0; i <= iD - 1; i++) {
                    int iE = HiDateUtil.e(this.l, -i);
                    SportSummary sportSummary = new SportSummary();
                    sportSummary.configDate(iE);
                    sportSummary.configSportType(0);
                    SportSummary.SportUnit sportUnit = new SportSummary.SportUnit();
                    sportUnit.configSteps(0);
                    sportUnit.configDistance(0);
                    sportUnit.configCalorie(0);
                    sportSummary.configSportUnit(sportUnit);
                    this.k.add(sportSummary);
                }
                c(iBaseResponseCallback);
            } catch (ParseException e) {
                LogUtil.e("Opera_PluginOperationAdapterImpl", "parse date exception:", e.getMessage());
                iBaseResponseCallback.a(1001, null);
            }
        } catch (ParseException e2) {
            LogUtil.e("Opera_PluginOperationAdapterImpl", "getSportData dateFormat exception: ", e2.getMessage());
            iBaseResponseCallback.a(1001, null);
        }
    }

    private void a() {
        this.s = 0;
        this.p = 0;
        this.q = 0;
        if (this.h == null) {
            this.h = lky.b();
        }
        this.h.c(new IExecuteResult() { // from class: com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl.4
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                LogUtil.a("Opera_PluginOperationAdapterImpl", "get today steps success");
                if (obj == null) {
                    LogUtil.j("Opera_PluginOperationAdapterImpl", "get today steps success but boj==null");
                    return;
                }
                if (obj instanceof Bundle) {
                    Bundle bundle = (Bundle) obj;
                    PluginOperationAdapterImpl.this.s = bundle.getInt("step");
                    PluginOperationAdapterImpl.this.p = bundle.getInt("carior");
                    PluginOperationAdapterImpl.this.q = bundle.getInt("distance");
                }
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                LogUtil.e("Opera_PluginOperationAdapterImpl", "OpenSDK IExecuteResult onFailed!");
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                LogUtil.e("Opera_PluginOperationAdapterImpl", "OpenSDK IExecuteResult onServiceException!");
            }
        });
    }

    private void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = xju.b(new Date(jCurrentTimeMillis));
        this.r = 0;
        this.n = 0;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jB, jCurrentTimeMillis);
        hiDataReadOption.setType(new int[]{30002});
        HiHealthManager.d(this.f16986b).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                PluginOperationAdapterImpl.this.d(obj);
            }
        });
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
            LogUtil.a("Opera_PluginOperationAdapterImpl", "thread waiting fail!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj) {
        List list;
        int totalDistance;
        long totalTime;
        if (obj == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() > 0 && (list = (List) sparseArray.get(30002)) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), HiTrackMetaData.class);
                    int sportType = hiTrackMetaData.getSportType();
                    if (hiTrackMetaData.getAbnormalTrack() != 0 || hiTrackMetaData.getSportDataSource() == 2) {
                        totalDistance = 0;
                        totalTime = 0;
                    } else {
                        totalTime = hiTrackMetaData.getTotalTime();
                        totalDistance = hiTrackMetaData.getTotalDistance();
                    }
                    if (sportType == 258) {
                        arrayList.add(Integer.valueOf(totalDistance));
                        arrayList3.add(Long.valueOf(totalTime));
                    } else if (sportType == 264) {
                        arrayList.add(Integer.valueOf(totalDistance));
                        arrayList3.add(Long.valueOf(totalTime));
                    } else if (sportType != 259) {
                        LogUtil.j("Opera_PluginOperationAdapterImpl", "no branch!");
                    } else {
                        arrayList2.add(Integer.valueOf(totalDistance));
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.j("Opera_PluginOperationAdapterImpl", "trackMetaData is error");
                }
            }
            a(arrayList3, arrayList, arrayList2);
        }
    }

    private void a(List<Long> list, List<Integer> list2, List<Integer> list3) {
        if (list.size() > 0) {
            this.t = ((Long) Collections.max(list)).longValue();
        }
        if (list2.size() > 0) {
            this.r = ((Integer) Collections.max(list2)).intValue();
        }
        if (list3.size() > 0) {
            this.n = ((Integer) Collections.max(list3)).intValue();
        }
    }

    private void c(final IBaseResponseCallback iBaseResponseCallback) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(this.l);
        hiAggregateOption.setEndTime(this.g);
        hiAggregateOption.setType(new int[]{40002, 40003, 40004, 42003, Constants.REBACK_MARKET_RESULT_CODE});
        hiAggregateOption.setConstantsKey(new String[]{ParsedFieldTag.STEP_SUM, "calorie_sum", "distance_sum", "track_distance_sum", "track_calories_sum"});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        HiHealthNativeApi.a(this.f16986b).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                PluginOperationAdapterImpl.this.e(list, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback) {
        int iMax;
        int i;
        int i2;
        if (list == null || list.isEmpty()) {
            LogUtil.a("Opera_PluginOperationAdapterImpl", "get step distances calories HiAggregateListener onResult data is null");
            b(iBaseResponseCallback);
            return;
        }
        int iD = HiDateUtil.d(System.currentTimeMillis());
        for (SportSummary sportSummary : this.k) {
            SportSummary.SportUnit sportUnit = sportSummary.getSportUnit();
            for (HiHealthData hiHealthData : list) {
                int iD2 = HiDateUtil.d(hiHealthData.getStartTime());
                if (iD2 == sportSummary.getDate()) {
                    LogUtil.d("Opera_PluginOperationAdapterImpl", "getStepSportData date = ", Integer.valueOf(iD2));
                    if (iD2 == iD) {
                        a();
                        i = this.s;
                        i2 = this.p;
                        iMax = this.q;
                    } else {
                        int i3 = hiHealthData.getInt(ParsedFieldTag.STEP_SUM);
                        int i4 = hiHealthData.getInt("calorie_sum");
                        int i5 = hiHealthData.getInt("distance_sum");
                        int i6 = hiHealthData.getInt("track_calories_sum");
                        int i7 = hiHealthData.getInt("track_distance_sum");
                        int iMax2 = Math.max(i4, i6);
                        iMax = Math.max(i5, i7);
                        i = i3;
                        i2 = iMax2;
                    }
                    sportUnit.configSteps(i);
                    sportUnit.configCalorie(i2);
                    sportUnit.configDistance(iMax);
                    sportSummary.configSportUnit(sportUnit);
                }
            }
        }
        b(iBaseResponseCallback);
    }

    private void b(IBaseResponseCallback iBaseResponseCallback) {
        Iterator<SportSummary> it = this.k.iterator();
        while (it.hasNext()) {
            try {
                this.o.put(new JSONObject(it.next().toString()));
            } catch (JSONException e) {
                LogUtil.e("Opera_PluginOperationAdapterImpl", "responseSportData sportSummary exception ", e.getMessage());
                iBaseResponseCallback.a(Constants.CODE_UNKNOWN_ERROR, this.j);
                return;
            }
        }
        try {
            this.j.put(JsUtil.SUMMARIES_KEY, this.o);
            iBaseResponseCallback.a(0, this.j);
        } catch (JSONException e2) {
            LogUtil.e("Opera_PluginOperationAdapterImpl", "responseSportData sportDataJson exception ", e2.getMessage());
            iBaseResponseCallback.a(Constants.CODE_UNKNOWN_ERROR, this.j);
        }
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getMotionPathData(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_PluginOperationAdapterImpl", "mStartTime = ", Long.valueOf(j), ", mEndTime = ", Long.valueOf(j2));
        long j3 = j2 - j;
        double d2 = (j3 * 1.0d) / 8.64E7d;
        LogUtil.d("Opera_PluginOperationAdapterImpl", "dayCounts = ", Double.valueOf(d2));
        if (j3 < 0 || d2 > 3.0d) {
            iBaseResponseCallback.a(1001, null);
        } else {
            xju.e(j, j2, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public int bindDevice(String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str5)) {
            LogUtil.j("Opera_PluginOperationAdapterImpl", "bindDevice uniqueId is null ");
            return 2;
        }
        if (dmp.d().g(str5)) {
            return -1;
        }
        return !drw.e().a(str, str2, new dmv(str4, str, str5, str3), (IDeviceEventHandler) null) ? 1 : 0;
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public boolean unbindDevice(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j("Opera_PluginOperationAdapterImpl", "unbindDevice context  is null");
            return false;
        }
        elh elhVarD = ResourceManager.c().d(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        if (elhVarD == null) {
            return false;
        }
        if (elhVarD.l() != null) {
            contentValues.put("name", elo.a(str, elhVarD.l().d()));
        }
        if (elhVarD.m() != null) {
            contentValues.put("deviceType", elhVarD.m().name());
        }
        if (elhVarD.v() != null) {
            contentValues.put(Constants.KEY_BLE_SCAN_MODE, Integer.valueOf(elhVarD.v().c()));
        }
        if (elhVarD.q() != null) {
            contentValues.put("kitUuid", elhVarD.q());
        }
        return drw.e().d(context, contentValues, str);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getCourseRecommend(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        xjw.e(str, str2, str3, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getUserInfo(IBaseResponseCallback iBaseResponseCallback) {
        xjw.c(iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void startAchieveAwardShare(Context context, String str, String str2) {
        oru oruVarA = oru.a(context);
        oruVarA.setAdapter(new PluginAchieveAdapterImpl());
        oruVarA.a(context, str, str2);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void jumpAchieveMedalById(Context context, String str) {
        oru oruVarA = oru.a(context);
        oruVarA.setAdapter(new PluginAchieveAdapterImpl());
        oruVarA.e(context, str, "3");
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void jumpAchieveKakaPage(Context context) {
        oru oruVarA = oru.a(context);
        oruVarA.setAdapter(new PluginAchieveAdapterImpl());
        oruVarA.c(context);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void jumpMyAwardPage(Context context) {
        oru oruVarA = oru.a(context);
        oruVarA.setAdapter(new PluginAchieveAdapterImpl());
        oruVarA.o(context);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void share(Context context, gxt gxtVar, IBaseResponseCallback iBaseResponseCallback) {
        xjo.c(context, gxtVar, iBaseResponseCallback, false);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void startGpsTrackPage(Context context, int i, String str, float f) {
        xjo.c(context, this.f.get(Integer.valueOf(i)).intValue(), this.m.get(str).intValue(), f);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void startFitnessPage(Context context, String str, String str2) {
        xjo.c(context, str, str2);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void startFitnessList() {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(this.f16986b);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public boolean checkCurrentUrlAuth(String str, String str2) {
        return OpenServiceControl.getInstance(this.f16986b).checkUrlAuth(str, str2);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public List<String> queryUrlList(String str) {
        OpenServiceControl.getInstance(this.f16986b);
        return OpenServiceControl.queryUrlList(str);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public WebViewConfig queryWebViewConfig() {
        return xjw.d();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void stressControl(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        nud.c().e(i, i2, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void relaxControl(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        nud.c().b(i, i2, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void gameControl(int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        nud.c().e(i, i2, i3, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void calibrationControl(int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        nud.c().d(i, i2, i3, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void checkConnected(IBaseResponseCallback iBaseResponseCallback) {
        nud.c().d(iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void resetCalibration(IBaseResponseCallback iBaseResponseCallback) {
        nud.c().c(iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void checkCalibration(IBaseResponseCallback iBaseResponseCallback) {
        nud.c().a(iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void stressAbort(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        nud.c().a(iBaseResponseCallback, z);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public boolean checkWhiteUrl(String str) {
        return OpenServiceControl.getInstance(this.f16986b).checkWhiteUrl(str);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void setAchieveEvent(String str, Map<String, Object> map) {
        LogUtil.d("Opera_PluginOperationAdapterImpl", "setAchieveEvent key", str, " map = ", map);
        oru.a(this.f16986b).c(this.f16986b.getApplicationContext(), str, map);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getPersonalPrivacySettingValue(int i) {
        if (i == 6) {
            return d.c(7);
        }
        return d.c(i);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void go2PersonalPrivacySettingsActivity() {
        Intent intent = new Intent();
        intent.setClassName("com.huawei.health", "com.huawei.ui.main.stories.me.activity.PrivacyCenterActivity");
        intent.setFlags(268435456);
        this.f16986b.startActivity(intent);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void breatheControl(int i, int i2, int i3, int i4, IBaseResponseCallback iBaseResponseCallback) {
        dcv dcvVar = new dcv();
        dcvVar.d(i);
        dcvVar.b(i2);
        dcvVar.c(i3);
        BreathTrainApi breathTrainApi = (BreathTrainApi) Services.d("BreathTrainService", BreathTrainApi.class);
        if (breathTrainApi == null) {
            LogUtil.j("Opera_PluginOperationAdapterImpl", "breathTrainApi is null");
        } else {
            breathTrainApi.breathControl(dcvVar, i4, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public int getJanusDeviceConnect() {
        BreathTrainApi breathTrainApi = (BreathTrainApi) Services.d("BreathTrainService", BreathTrainApi.class);
        if (breathTrainApi == null) {
            LogUtil.j("Opera_PluginOperationAdapterImpl", "brath train api is null");
            return 0;
        }
        return breathTrainApi.getJanusDeviceConnect();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public int canFinish(Activity activity) {
        BreathTrainApi breathTrainApi = (BreathTrainApi) Services.d("BreathTrainService", BreathTrainApi.class);
        if (breathTrainApi == null) {
            LogUtil.j("Opera_PluginOperationAdapterImpl", "brath train api is null");
            return 3;
        }
        return breathTrainApi.canFinish(activity);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getServiceIdByUrl(String str) {
        LogUtil.d("Opera_PluginOperationAdapterImpl", "getServiceIdByUrl url = " + str);
        return OpenServiceControl.getInstance(this.f16986b).getServiceIdByUrl(str);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String queryServiceNameById(String str) {
        OpenService openServiceQueryServiceByID = OpenServiceControl.getInstance(this.f16986b).queryServiceByID(str);
        if (openServiceQueryServiceByID != null) {
            return openServiceQueryServiceByID.getProductName();
        }
        return "";
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public int getAuthType(String str, String str2) {
        UserServiceAuth userServiceAuthQueryServiceAuth = OpenServiceControl.getInstance(this.f16986b).queryServiceAuth(str, str2);
        if (userServiceAuthQueryServiceAuth == null || userServiceAuthQueryServiceAuth.fetchAuthType() == 0) {
            return 0;
        }
        return userServiceAuthQueryServiceAuth.fetchAuthType() == 1 ? 1 : 2;
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void showServiceTips(Context context, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        if (map == null || iBaseResponseCallback == null) {
            return;
        }
        LogUtil.d("Opera_PluginOperationAdapterImpl", "showServiceTips dialogType = ", map.get("dialogType"), ", serviceName = ", map.get(JsUtil.SERVICE_NAME));
        UserServiceAuth userServiceAuth = new UserServiceAuth();
        userServiceAuth.configHuid(map.get("huid"));
        userServiceAuth.configServiceID(map.get("serviceId"));
        userServiceAuth.configAuthType(1);
        OpenServiceControl.getInstance(context).insertOrUpdateUserAuth(userServiceAuth);
        iBaseResponseCallback.a(1, "0");
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public List<Map<String, Object>> getRecordsByDateRange(String str, String str2) {
        Date dateStringToDate = Utils.stringToDate(str);
        Date dateStringToDate2 = Utils.stringToDate(str2);
        if (dateStringToDate == null || dateStringToDate2 == null) {
            LogUtil.j("Opera_PluginOperationAdapterImpl", "startDate == null || endDate == null");
            return null;
        }
        LogUtil.a("Opera_PluginOperationAdapterImpl", "getRecordsByDateRange startDate = ", dateStringToDate, ",endDate = ", dateStringToDate2);
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion != null) {
            return pluginSuggestion.getRecordsByDateRange(dateStringToDate, dateStringToDate2);
        }
        return null;
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getFitnessSumData(long j, long j2, String str, SportsStatisticsCallback sportsStatisticsCallback) {
        xjw.b(j, j2, str, sportsStatisticsCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getWorkoutRecordByTimeAndId(long j, long j2, String str, final String str2, final SportsStatisticsCallback sportsStatisticsCallback) {
        String str3;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(":");
            String str4 = strArrSplit[0];
            if (strArrSplit.length <= 0) {
                str3 = "";
            } else {
                str3 = strArrSplit[1];
            }
            String str5 = str3;
            RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
            if (recordApi == null) {
                LogUtil.j("Opera_PluginOperationAdapterImpl", "getWorkoutRecordByTimeAndId recordApi is null.");
                return;
            } else {
                recordApi.acquireExerciseRecordByTimeAndId(j, j2, str4, str5, new ResultCallback() { // from class: llf
                    @Override // com.huawei.health.suggestion.ResultCallback
                    public final void onResult(int i, Object obj) {
                        PluginOperationAdapterImpl.c(str2, sportsStatisticsCallback, i, obj);
                    }
                });
                return;
            }
        }
        LogUtil.j("Opera_PluginOperationAdapterImpl", "workOutStr is empty");
    }

    public static /* synthetic */ void c(String str, SportsStatisticsCallback sportsStatisticsCallback, int i, Object obj) {
        LogUtil.a("Opera_PluginOperationAdapterImpl", "onResponse returnCode", Integer.valueOf(i));
        if (str == null) {
            return;
        }
        if (obj != null) {
            sportsStatisticsCallback.callSportSumDataJsFunction(i, obj, str);
        } else {
            sportsStatisticsCallback.callSportSumDataJsFunction(i, "", str);
        }
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void uploadSleepQuestionnaireResults(long j, String str, IBaseResponseCallback iBaseResponseCallback) {
        xjw.b(j, str, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void querySleepQuestionnaireResults(long j, IBaseResponseCallback iBaseResponseCallback) {
        xjw.d(j, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void deleteSleepQuestionnaireResult(long j, IBaseResponseCallback iBaseResponseCallback) {
        xjw.c(j, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void vmallAgrSign(IBaseResponseCallback iBaseResponseCallback) {
        this.f16985a = iBaseResponseCallback;
        if (this.w != null) {
            c();
        } else {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String url = GRSManager.c(this.f16986b).getUrl("agreementservice");
        String accountInfo = LoginInit.getInstance(this.f16986b).getAccountInfo(1015);
        String strE = SharedPreferenceManager.e(this.f16986b, Integer.toString(10000), "agr_first_sign_language");
        ArrayList arrayList = new ArrayList();
        arrayList.add(134);
        arrayList.add(10023);
        AgrHttp agrHttp = new AgrHttp();
        LogUtil.a("Opera_PluginOperationAdapterImpl", "First sign country ", "CN", " language ", strE);
        agrHttp.signHttpReq(accountInfo, url, true, arrayList, "CN", strE + "_CN", new HttpResCallBack() { // from class: com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl.2
            @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
            public void onFinished(int i, String str) {
                if (PluginOperationAdapterImpl.this.f16985a != null) {
                    SharedPreferenceManager.e(PluginOperationAdapterImpl.this.f16986b, "socialsharedpreference", Constants.IS_SIGN_VMALL_ARG, Boolean.toString(true), null);
                    PluginOperationAdapterImpl.this.f16985a.a(i, str);
                    LogUtil.a("Opera_PluginOperationAdapterImpl", "First sign resCode ", Integer.valueOf(i), " result ", str);
                    PluginOperationAdapterImpl.this.f16985a = null;
                }
            }
        });
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void vmallAgrQuery(IBaseResponseCallback iBaseResponseCallback) {
        String strE = SharedPreferenceManager.e(this.f16986b, "socialsharedpreference", Constants.IS_SIGN_VMALL_ARG);
        LogUtil.a("Opera_PluginOperationAdapterImpl", "isSignVmallArg = ", strE);
        if ("false".equals(strE)) {
            iBaseResponseCallback.a(200, "false");
        } else {
            j();
            this.e = iBaseResponseCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.w = LoginInit.getInstance(this.f16986b).getAccountInfo(1015);
        this.x = GRSManager.c(BaseApplication.getContext()).getUrl("agreementservice");
        new AgrHttp().queryHttpReq(this.w, this.x, true, new HttpResCallBack() { // from class: com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl.5
            @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
            public void onFinished(int i, String str) {
                if (PluginOperationAdapterImpl.this.e != null) {
                    PluginOperationAdapterImpl.this.e.a(i, str);
                    LogUtil.a("Opera_PluginOperationAdapterImpl", "First sign resCode ", Integer.valueOf(i), " result ", str);
                    PluginOperationAdapterImpl.this.e = null;
                }
            }
        });
    }

    private void j() {
        LoginInit.getInstance(this.f16986b).refreshAccessToken(new ILoginCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl.8
            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginSuccess(Object obj) {
                if (PluginOperationAdapterImpl.this.e != null) {
                    PluginOperationAdapterImpl.this.b();
                }
                if (PluginOperationAdapterImpl.this.f16985a != null) {
                    PluginOperationAdapterImpl.this.c();
                }
            }

            @Override // com.huawei.login.ui.login.util.ILoginCallback
            public void onLoginFailed(Object obj) {
                LogUtil.j("Opera_PluginOperationAdapterImpl", "obtainToken failed = ", obj);
            }
        });
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getLocale() {
        return HwWatchFaceUtil.d().e();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void setSendOpenId(String str) {
        mxf.e(BaseApplication.getContext()).b(str, new IBaseResponseCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HWRRiServiceMgr", "setEcgMeasureAuthAccountCommand onResponse errCode:", Integer.valueOf(i), ",objData:", obj == null ? "objData is null" : obj.toString());
            }
        });
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public boolean isSupportStepCounter(Context context) {
        if (lro.d(context)) {
            return true;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "Opera_PluginOperationAdapterImpl");
        return deviceList != null && deviceList.size() > 0;
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getUserLabels() {
        List<String> allLabels = ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).getAllLabels(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        if (!njy.e(allLabels)) {
            return allLabels.toString();
        }
        return "";
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void setAppMarketParameter(int i, Object obj) {
        lyy.b().d(i, obj);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getAppMarketLocal() {
        return LanguageUtil.a();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public int getNetworkStatus() {
        return lyy.b().c(BaseApplication.getContext());
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getBondedDeviceAddress(String str) {
        HealthDevice healthDeviceB;
        if (str != null && (healthDeviceB = drw.e().b(str)) != null) {
            return healthDeviceB.getAddress();
        }
        return "";
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public ArrayList<ContentValues> getBondedDeviceByProductId(String str) {
        if (str != null) {
            return drw.e().d(str);
        }
        return new ArrayList<>();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void saveMeasureData(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        xjw.b(str, str2, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getContentCenterTest() {
        return lyy.b().c();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public boolean isBindDevice() {
        return xjw.b();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void getHealthDataStatistics(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        xju.b(j, j2, i, iBaseResponseCallback);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public boolean unbindHaveBindingDevice(Context context, ContentValues contentValues, String str) {
        return drw.e().d(context, contentValues, str);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public boolean isRopeDevice(String str) {
        return etn.g(str);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void checkUserWeightAndShowDialog(Context context, Object obj) {
        etn.b(context, obj);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getCurrentUserUuid() {
        return xjw.c();
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public void createHpkInstalled(String str, String str2) {
        elx.a().b(str, str2);
    }

    @Override // com.huawei.operation.adapter.PluginOperationAdapter
    public String getProductDir() {
        return dxc.d;
    }
}
