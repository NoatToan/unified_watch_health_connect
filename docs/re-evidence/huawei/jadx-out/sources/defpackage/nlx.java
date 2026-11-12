package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nlx {
    private static volatile BroadcastReceiver e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f43256b = new byte[0];
    private static final float[][] d = {new float[]{0.0051f, 0.01f}, new float[]{0.0101f, 0.015f}, new float[]{0.0151f, 0.02f}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f43255a = {new int[]{24, 1}, new int[]{12, 1}, new int[]{6, 1}};

    /* JADX INFO: loaded from: classes11.dex */
    static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f43264b;
        private ResponseCallback<Pair<Long, Object>> e;

        b(String str, ResponseCallback<Pair<Long, Object>> responseCallback) {
            this.f43264b = str;
            this.e = responseCallback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("WeightManagerUtil", "intent is null");
                return;
            }
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("sync_data_result_type");
            long longExtra = intent.getLongExtra("sync_data_result_id", 0L);
            boolean booleanExtra = intent.getBooleanExtra("sync_data_result_success", true);
            ReleaseLogUtil.d("WeightManagerUtil", "action=", action, " type=", stringExtra, " syncId=", Long.valueOf(longExtra), " result=", Boolean.valueOf(booleanExtra));
            if (String.valueOf(900000000).equals(stringExtra) || String.valueOf(20000).equals(stringExtra)) {
                nlx.d();
                nlx.a(longExtra, booleanExtra, this.f43264b, this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, ResponseCallback<Pair<Long, Object>> responseCallback) {
        LogUtil.a("WeightManagerUtil", "registerSyncBroadcast configId ", str);
        synchronized (f43256b) {
            if (e != null) {
                responseCallback.onResponse(-1, null);
                return;
            }
            IntentFilter intentFilter = new IntentFilter("com.huawei.hihealth.action_sync_data_result");
            e = new b(str, responseCallback);
            BroadcastManagerUtil.d(BaseApplication.b(), e, intentFilter, "com.huawei.hihealth.DEFAULT_PERMISSION", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        synchronized (f43256b) {
            if (e != null) {
                ReleaseLogUtil.d("R_WeightManagerUtil", "unregisterSyncBroadcast");
                try {
                    BaseApplication.b().unregisterReceiver(e);
                } catch (RuntimeException e2) {
                    ReleaseLogUtil.e("R_WeightManagerUtil", "unregisterSyncBroadcast exception ", ExceptionUtils.c(e2));
                }
                e = null;
            }
        }
    }

    public static void e(final String str, final boolean z, final ResponseCallback<Pair<Long, Object>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.e("R_WeightManagerUtil", "getWeightSampleConfig callback is null");
        } else {
            LogUtil.a("WeightManagerUtil", "getWeightSampleConfig configId ", str, " isFirstRequest ", Boolean.valueOf(z));
            xkb.d(str, new HiDataReadResultListener() { // from class: nlx.1
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    boolean zH = Utils.h();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LogUtil.a("WeightManagerUtil", "getWeightSampleConfig onResult configId ", str, " isFirstRequest ", Boolean.valueOf(z), " ifAllowLogin ", Boolean.valueOf(zH), " errorCode ", Integer.valueOf(i), " data ", obj);
                    if (!njy.b(obj, HiSampleConfig.class)) {
                        if (!zH) {
                            responseCallback.onResponse(i, null);
                            return;
                        }
                        boolean zM = iuo.m();
                        ReleaseLogUtil.e("WeightManagerUtil", "getWeightSampleConfig onResult data is not HiSampleConfigList isSync ", Boolean.valueOf(zM), " isFirstRequest ", Boolean.valueOf(z));
                        if (!z || zM) {
                            nlx.e(str, responseCallback);
                            return;
                        } else {
                            nlx.b(str, (ResponseCallback<Pair<Long, Object>>) responseCallback);
                            xkb.a(jCurrentTimeMillis);
                            return;
                        }
                    }
                    List list = (List) obj;
                    if (njy.e(list)) {
                        if (!zH) {
                            responseCallback.onResponse(i, null);
                            return;
                        }
                        boolean zM2 = iuo.m();
                        ReleaseLogUtil.e("WeightManagerUtil", "getWeightSampleConfig onResult list isEmpty isSync ", Boolean.valueOf(zM2), " isFirstRequest ", Boolean.valueOf(z));
                        if (!z || zM2) {
                            nlx.e(str, responseCallback);
                            return;
                        } else {
                            nlx.b(str, (ResponseCallback<Pair<Long, Object>>) responseCallback);
                            xkb.a(jCurrentTimeMillis);
                            return;
                        }
                    }
                    nlx.d();
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    String configData = hiSampleConfig.getConfigData();
                    if ("900300023".equals(str)) {
                        responseCallback.onResponse(0, new Pair(Long.valueOf(hiSampleConfig.getModifiedTime()), (ivd) HiJsonUtil.d(configData, ivd.class)));
                    } else if ("900300022".equals(str)) {
                        try {
                            responseCallback.onResponse(i, new Pair(Long.valueOf(hiSampleConfig.getModifiedTime()), Float.valueOf((float) new JSONObject(configData).getDouble("weightGoal"))));
                        } catch (JSONException e2) {
                            ReleaseLogUtil.a("R_WeightManagerUtil", "getWeightSampleConfig onResult exception ", ExceptionUtils.c(e2));
                            responseCallback.onResponse(i, null);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final String str, final ResponseCallback<Pair<Long, Object>> responseCallback) {
        if (NetworkUtil.i()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: nly
                @Override // java.lang.Runnable
                public final void run() {
                    iun.e((ResponseCallback<Pair<Long, Object>>) responseCallback, str);
                }
            });
        }
        d();
    }

    public static void a(long j, boolean z, String str, ResponseCallback<Pair<Long, Object>> responseCallback) {
        LogUtil.a("WeightManagerUtil", "processSyncResultBroadcast syncId ", Long.valueOf(j), " result ", Boolean.valueOf(z));
        if (z) {
            iuo.a(System.currentTimeMillis());
            e(str, false, responseCallback);
        } else {
            responseCallback.onResponse(-1, null);
        }
    }

    public static ivd a(iuu iuuVar, float f, int i, int i2) {
        iuw iuwVarD;
        ivd ivdVar = new ivd();
        ivdVar.d(f);
        ivdVar.c(i);
        iux iuxVar = new iux();
        iuy iuyVar = new iuy();
        if (i == 1) {
            if (iuuVar != null && (iuwVarD = iuuVar.d()) != null) {
                ivdVar.e(iuwVarD.b());
                ivdVar.a(iuwVarD.d());
            }
            iuxVar.e(i2);
            float[][] fArr = d;
            int i3 = i2 - 1;
            iuxVar.e(fArr[i3][0]);
            iuxVar.a(fArr[i3][1]);
            iuxVar.a(f43255a[i3][0]);
            iuyVar.a(30);
            iuyVar.d(40);
            iuyVar.b(25);
            iuyVar.c(5);
        } else {
            ivdVar.e(0);
            ivdVar.a(0);
            iuxVar.e(1);
            iuxVar.e(0.0f);
            iuxVar.a(0.0f);
            iuxVar.a(0);
            iuyVar.a(0);
            iuyVar.d(0);
            iuyVar.b(0);
            iuyVar.c(0);
        }
        ivdVar.e(iuxVar);
        ivdVar.a(iuyVar);
        return ivdVar;
    }

    public static void e(double d2, long j, ResponseCallback<Double> responseCallback) {
        b(d2, j, responseCallback, false);
    }

    public static void b(final double d2, final long j, final ResponseCallback<Double> responseCallback, final boolean z) {
        if (!Utils.h()) {
            ReleaseLogUtil.d("WeightManagerUtil", "saveWeightGoal ifAllowLogin false");
            c(d2, responseCallback);
            return;
        }
        if (d2 > 1000.0d) {
            LogUtil.a("WeightManagerUtil", "targetWeight is too big, targetWeight is: ", Double.valueOf(d2));
            if (responseCallback != null) {
                responseCallback.onResponse(-1, Double.valueOf(d2));
                return;
            }
            return;
        }
        boolean zE = lua.e();
        ReleaseLogUtil.d("WeightManagerUtil", "saveWeightGoal isPullAllStatus ", Boolean.valueOf(zE));
        if (zE) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("weightGoal", Double.valueOf(d2));
            xkb.b("900300022", jsonObject.toString(), j, new HiDataOperateListener() { // from class: nma
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    nlx.d(responseCallback, d2, j, z, i, obj);
                }
            });
        } else if (responseCallback != null) {
            responseCallback.onResponse(-1, Double.valueOf(d2));
        }
    }

    static /* synthetic */ void d(final ResponseCallback responseCallback, final double d2, final long j, final boolean z, int i, Object obj) {
        LogUtil.a("WeightManagerUtil", "saveWeightGoal errorCode ", Integer.valueOf(i), " object ", obj);
        ThreadPoolManager.c().execute(new Runnable() { // from class: nmc
            @Override // java.lang.Runnable
            public final void run() {
                xkb.d("900300022", new nlx.AnonymousClass4(responseCallback, d2, j, z));
            }
        });
    }

    /* JADX INFO: renamed from: nlx$4, reason: invalid class name */
    class AnonymousClass4 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResponseCallback f43262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43263b;
        final /* synthetic */ double d;
        final /* synthetic */ long e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass4(ResponseCallback responseCallback, double d, long j, boolean z) {
            this.f43262a = responseCallback;
            this.d = d;
            this.e = j;
            this.f43263b = z;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (this.f43262a == null) {
                return;
            }
            if (i != 0 || !njy.b(obj, HiSampleConfig.class)) {
                this.f43262a.onResponse(-1, Double.valueOf(this.d));
                return;
            }
            List list = (List) obj;
            if (njy.e(list) || list.get(0) == null) {
                this.f43262a.onResponse(-1, Double.valueOf(this.d));
                LogUtil.j("WeightManagerUtil", "saveWeightGoal empty list");
            } else {
                if (((HiSampleConfig) list.get(0)).getModifiedTime() != this.e) {
                    if (this.f43263b) {
                        this.f43262a.onResponse(-1, Double.valueOf(this.d));
                    } else {
                        this.f43262a.onResponse(0, Double.valueOf(this.d));
                    }
                    LogUtil.j("WeightManagerUtil", "saveWeightGoal update failed");
                    return;
                }
                this.f43262a.onResponse(i, Double.valueOf(this.d));
                HandlerCenter.a().d(new Runnable() { // from class: nme
                    @Override // java.lang.Runnable
                    public final void run() {
                        xkb.a(System.currentTimeMillis());
                    }
                }, nlx.c());
                nlx.c(this.d, (ResponseCallback<Double>) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final double d2, final ResponseCallback<Double> responseCallback) {
        LogUtil.a("WeightManagerUtil", "setWeightGoalInfo targetWeight ", Double.valueOf(d2));
        if (d2 <= 0.0d) {
            if (responseCallback != null) {
                responseCallback.onResponse(-1, Double.valueOf(d2));
            }
        } else {
            HiGoalInfo hiGoalInfo = new HiGoalInfo();
            hiGoalInfo.setGoalType(5);
            hiGoalInfo.setGoalValue(d2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(hiGoalInfo);
            HiHealthManager.d(BaseApplication.b()).setGoalInfo(0, arrayList, new HiCommonListener() { // from class: nlx.2
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    LogUtil.a("WeightManagerUtil", "setWeightGoalInfo onSuccess resultCode ", Integer.valueOf(i), " message ", obj);
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 != null) {
                        responseCallback2.onResponse(i, Double.valueOf(d2));
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    ReleaseLogUtil.e("WeightManagerUtil", "setWeightGoalInfo onFailure resultCode ", Integer.valueOf(i), " message ", obj);
                    ResponseCallback responseCallback2 = responseCallback;
                    if (responseCallback2 != null) {
                        responseCallback2.onResponse(i, Double.valueOf(d2));
                    }
                }
            });
        }
    }

    public static void a(ivd ivdVar, long j, boolean z, ResponseCallback<ivd> responseCallback) {
        d(ivdVar, j, z, responseCallback, false, (iuv) null);
    }

    public static void d(final ivd ivdVar, final long j, final boolean z, final ResponseCallback<ivd> responseCallback, final boolean z2, iuv iuvVar) {
        if (!Utils.h()) {
            ReleaseLogUtil.d("WeightManagerUtil", "saveWeightManager ifAllowLogin false");
            if (ivdVar != null) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nmd
                    @Override // java.lang.Runnable
                    public final void run() {
                        nlx.d(ivdVar, responseCallback);
                    }
                });
                return;
            } else {
                if (responseCallback != null) {
                    responseCallback.onResponse(-1, null);
                    return;
                }
                return;
            }
        }
        boolean zE = lua.e();
        ReleaseLogUtil.d("WeightManagerUtil", "saveWeightManager isPullAllStatus ", Boolean.valueOf(zE));
        if (!zE) {
            if (responseCallback != null) {
                responseCallback.onResponse(-1, ivdVar);
            }
        } else {
            if (iuvVar == null) {
                iuvVar = ((WeightApi) Services.b("Main", WeightApi.class)).getOnePointFull(ivdVar.i());
            }
            if (iuvVar != null) {
                ivdVar.c(iuvVar);
            }
            xkb.b("900300023", HiJsonUtil.d(ivdVar), j, new HiDataOperateListener() { // from class: nmf
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    nlx.e(ivdVar, j, responseCallback, z2, z, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void d(ivd ivdVar, ResponseCallback responseCallback) {
        boolean zC = c(ivdVar.c());
        ReleaseLogUtil.d("WeightManagerUtil", "saveWeightManager isSuccess ", Boolean.valueOf(zC));
        if (responseCallback == null) {
            return;
        }
        responseCallback.onResponse(zC ? 0 : -1, ivdVar);
    }

    static /* synthetic */ void e(ivd ivdVar, long j, ResponseCallback responseCallback, boolean z, boolean z2, int i, Object obj) {
        LogUtil.a("WeightManagerUtil", "saveWeightManager errorCode ", Integer.valueOf(i), " object ", obj);
        e(ivdVar, j, responseCallback, z, z2);
    }

    private static void e(final ivd ivdVar, final long j, final ResponseCallback<ivd> responseCallback, final boolean z, final boolean z2) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nlz
            @Override // java.lang.Runnable
            public final void run() {
                xkb.d("900300023", new nlx.AnonymousClass3(responseCallback, ivdVar, j, z, z2));
            }
        });
    }

    /* JADX INFO: renamed from: nlx$3, reason: invalid class name */
    class AnonymousClass3 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f43259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ivd f43261c;
        final /* synthetic */ ResponseCallback d;
        final /* synthetic */ boolean e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass3(ResponseCallback responseCallback, ivd ivdVar, long j, boolean z, boolean z2) {
            this.d = responseCallback;
            this.f43261c = ivdVar;
            this.f43259a = j;
            this.e = z;
            this.f43260b = z2;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (i != 0 || !njy.b(obj, HiSampleConfig.class)) {
                ResponseCallback responseCallback = this.d;
                if (responseCallback != null) {
                    responseCallback.onResponse(-1, this.f43261c);
                    return;
                }
                return;
            }
            List list = (List) obj;
            if (njy.e(list) || list.get(0) == null) {
                ResponseCallback responseCallback2 = this.d;
                if (responseCallback2 != null) {
                    responseCallback2.onResponse(-1, this.f43261c);
                }
                LogUtil.j("WeightManagerUtil", "handleSampleConfigResult empty list");
                return;
            }
            if (((HiSampleConfig) list.get(0)).getModifiedTime() != this.f43259a) {
                ResponseCallback responseCallback3 = this.d;
                if (responseCallback3 != null) {
                    responseCallback3.onResponse(this.e ? -1 : 0, this.f43261c);
                }
                LogUtil.j("WeightManagerUtil", "handleSampleConfigResult update failed");
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final ivd ivdVar = this.f43261c;
                threadPoolManagerC.execute(new Runnable() { // from class: nmh
                    @Override // java.lang.Runnable
                    public final void run() {
                        nlx.AnonymousClass3.e(ivdVar);
                    }
                });
                return;
            }
            iuo.d(this.f43261c);
            ResponseCallback responseCallback4 = this.d;
            if (responseCallback4 != null) {
                responseCallback4.onResponse(i, this.f43261c);
            }
            HandlerCenter.a().d(new Runnable() { // from class: nmg
                @Override // java.lang.Runnable
                public final void run() {
                    xkb.a(System.currentTimeMillis());
                }
            }, nlx.c());
            ThreadPoolManager threadPoolManagerC2 = ThreadPoolManager.c();
            final boolean z = this.f43260b;
            final ivd ivdVar2 = this.f43261c;
            threadPoolManagerC2.execute(new Runnable() { // from class: nmi
                @Override // java.lang.Runnable
                public final void run() {
                    nlx.AnonymousClass3.c(z, ivdVar2);
                }
            });
        }

        static /* synthetic */ void e(ivd ivdVar) {
            if (ivdVar != null) {
                nlx.c(ivdVar.c());
            }
        }

        static /* synthetic */ void c(boolean z, ivd ivdVar) {
            if (z && ivdVar != null) {
                nlx.c(ivdVar.c());
            } else {
                LogUtil.j("WeightManagerUtil", "handleSampleConfigResult isRefreshInitWeight ", Boolean.valueOf(z), " weightManager ", ivdVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c() {
        int iE = lsw.e(60000, 600000);
        if (iE <= 0) {
            iE = lsw.e(lsl.a(System.currentTimeMillis(), 16, 0), 60000, 600000);
        }
        if (iE < 1000) {
            iE = 1000;
        }
        ReleaseLogUtil.d("R_WeightManagerUtil", "getDelayTimeMillis delayTimeMillis ", Integer.valueOf(iE));
        return iE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(float f) {
        LogUtil.a("WeightManagerUtil", "setStartWeight startWeight ", Float.valueOf(f));
        if (f <= 0.0f) {
            return false;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.start_weight_base");
        hiUserPreference.setValue(String.valueOf(f));
        boolean userPreference = HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        HandlerCenter.a().d(new Runnable() { // from class: nmb
            @Override // java.lang.Runnable
            public final void run() {
                nlx.c((ResponseCallback<Object>) null);
            }
        }, c());
        return userPreference;
    }

    public static void c(final ResponseCallback<Object> responseCallback) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, new HiCommonListener() { // from class: nlx.5
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                ReleaseLogUtil.d("WeightManagerUtil", "syncUserPreference onSuccess errorCode ", Integer.valueOf(i), " object ", obj);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 != null) {
                    responseCallback2.onResponse(i, obj);
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                ReleaseLogUtil.e("WeightManagerUtil", "syncUserPreference onFailure errorCode ", Integer.valueOf(i), " errorMessage ", obj);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 != null) {
                    responseCallback2.onResponse(i, obj);
                }
            }
        });
    }
}
