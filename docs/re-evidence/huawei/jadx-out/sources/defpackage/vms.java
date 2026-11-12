package defpackage;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vms {
    public static void c(final ResponseCallback<iuu> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("HealthWeight_WeightRateHelper", "getGoalDetail callback is null");
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vmw
                @Override // java.lang.Runnable
                public final void run() {
                    vms.c(responseCallback);
                }
            });
            return;
        }
        UserInfomation userInfomationA = ioy.a();
        if (userInfomationA == null) {
            ReleaseLogUtil.d("HealthWeight_WeightRateHelper", "getGoalDetail userInfomation is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        vib vibVar = new vib();
        vibVar.c(userInfomationA.getAge());
        vibVar.a(userInfomationA.getGender());
        vibVar.e(userInfomationA.getHeight() < 50 ? 170 : userInfomationA.getHeight());
        vibVar.a(userInfomationA.getWeight() < 10.0f ? 65.0d : userInfomationA.getWeight());
        nlq.b(new vhz(0, 2, vibVar), new UiCallback<iuu>() { // from class: vms.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                responseCallback.onResponse(i, null);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(iuu iuuVar) {
                responseCallback.onResponse(0, iuuVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v2, types: [vhy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [vhr] */
    public static void c(Map<String, Object> map, final UiCallback<iuu> uiCallback) {
        vib vibVar = (vib) map.get("userInfo");
        IntPlan intPlan = (IntPlan) map.get("intPlan");
        double dDoubleValue = ((map.get("goalWeight") instanceof Double) || (map.get("goalWeight") instanceof Float)) ? Double.valueOf(String.valueOf(map.get("goalWeight"))).doubleValue() : 0.0d;
        int iIntValue = map.get("choice") instanceof Number ? ((Number) map.get("choice")).intValue() : 0;
        ?? BooleanValue = map.get("targetSettingChanged") instanceof Boolean ? ((Boolean) map.get("targetSettingChanged")).booleanValue() : 0;
        boolean zBooleanValue = map.get("getIntPlan") instanceof Boolean ? ((Boolean) map.get("getIntPlan")).booleanValue() : false;
        final ?? vhrVar = new vhr();
        vhrVar.d(0);
        vhrVar.c(2);
        vhrVar.b(1);
        vhrVar.a(0);
        vhrVar.e(DateFormatUtil.a(System.currentTimeMillis()));
        ?? vhyVar = new vhy();
        vhyVar.e(dDoubleValue);
        vhyVar.a(BooleanValue);
        vhyVar.e(iIntValue);
        vhrVar.d(vhyVar);
        vhrVar.a(vibVar);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi != null) {
            if (intPlan == null && !zBooleanValue) {
                planApi.e(new UiCallback<IntPlan>() { // from class: vms.2
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        vms.d(vhrVar, 0, false, uiCallback);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(IntPlan intPlan2) {
                        vms.a(vhrVar, intPlan2, uiCallback);
                    }
                });
            } else {
                a(vhrVar, intPlan, uiCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(vhr vhrVar, IntPlan intPlan, UiCallback<iuu> uiCallback) {
        if (intPlan == null || intPlan.getPlanType() != IntPlan.PlanType.AI_FITNESS_PLAN) {
            LogUtil.j("HealthWeight_WeightRateHelper", "getCurrentIntPlan onSuccess intPlan is not exist");
            d(vhrVar, 0, false, uiCallback);
            return;
        }
        int iF = btw.f(intPlan);
        int iB = btw.b(intPlan);
        int iB2 = lsl.b(iF, iB);
        LogUtil.a("HealthWeight_WeightRateHelper", "calculateGoal onSuccess startDate ", Integer.valueOf(iF), " endDate ", Integer.valueOf(iB), " planDays ", Integer.valueOf(iB2));
        d(vhrVar, iB2, true, uiCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(vhr vhrVar, int i, boolean z, UiCallback<iuu> uiCallback) {
        LogUtil.a("HealthWeight_WeightRateHelper", "calculateGoal createGoalReq ", vhrVar);
        vib vibVarF = vhrVar.f();
        if (vibVarF.a() < 10.0d) {
            vibVarF.a(65.0d);
        }
        if (vibVarF.b() < 50) {
            vibVarF.e(170);
        }
        if (!z) {
            nlq.b(vhrVar, uiCallback);
            return;
        }
        vic vicVar = new vic();
        vicVar.f(i);
        b(vhrVar, vicVar);
        nlq.b(vicVar, uiCallback);
    }

    private static void b(vhr vhrVar, vic vicVar) {
        if (vhrVar == null || vicVar == null) {
            return;
        }
        vicVar.d(vhrVar.c());
        vicVar.a(vhrVar.f());
        vicVar.d(vhrVar.b());
        vicVar.c(vhrVar.a());
        vicVar.a(vhrVar.d());
        vicVar.e(vhrVar.e());
        vicVar.b(vhrVar.h());
    }

    public static void c(final Bundle bundle, final ResponseCallback<ivd> responseCallback) {
        if (bundle == null) {
            ReleaseLogUtil.d("HealthWeight_WeightRateHelper", "calculateGoal bundle is null callback ", responseCallback);
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vmy
                @Override // java.lang.Runnable
                public final void run() {
                    vms.c(bundle, (ResponseCallback<ivd>) responseCallback);
                }
            });
            return;
        }
        final int i = bundle.getInt("weightManagerType");
        double d = bundle.getDouble("weight");
        final double d2 = bundle.getDouble("targetWeight");
        double d3 = bundle.getDouble("startWeight");
        if (d3 <= 0.0d) {
            ReleaseLogUtil.d("HealthWeight_WeightRateHelper", "calculateGoal sourceStartWeight ", Double.valueOf(d3));
            d3 = d;
        }
        final int i2 = bundle.getInt("fatBurnChoice");
        final long j = bundle.getLong("modifiedTime");
        final boolean z = bundle.getBoolean("isRefreshInitWeight");
        if (!Utils.h()) {
            ReleaseLogUtil.c("HealthWeight_WeightRateHelper", "calculateGoal ifAllowLogin false");
            final double d4 = d3;
            ThreadPoolManager.c().execute(new Runnable() { // from class: vmx
                @Override // java.lang.Runnable
                public final void run() {
                    double d5 = d4;
                    int i3 = i;
                    int i4 = i2;
                    long j2 = j;
                    nlx.a(nlx.a((iuu) null, (float) d5, i3, i4), j2, z, (ResponseCallback<ivd>) new ResponseCallback() { // from class: vmt
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i5, Object obj) {
                            vms.e(responseCallback, d, j2, bundle, i5, (ivd) obj);
                        }
                    });
                }
            });
            return;
        }
        if (i != 1) {
            b(bundle);
            nlx.e(d2, j, (ResponseCallback<Double>) null);
            nlx.a(nlx.a((iuu) null, (float) d3, i, i2), j, z, responseCallback);
            return;
        }
        int i3 = bundle.getInt("age");
        int i4 = bundle.getInt(CommonConstant.KEY_GENDER);
        int i5 = bundle.getInt("height");
        IntPlan intPlan = (IntPlan) bundle.getSerializable("intPlan");
        boolean z2 = bundle.getBoolean("getIntPlan");
        double d5 = d3;
        boolean z3 = bundle.getBoolean("waitSaveWeight", false);
        vib vibVar = new vib();
        vibVar.c(i3);
        vibVar.a(i4);
        vibVar.e(i5);
        vibVar.a(d);
        boolean z4 = bundle.getBoolean("targetSettingChanged", true);
        HashMap map = new HashMap();
        map.put("userInfo", vibVar);
        map.put("goalWeight", Double.valueOf(d2));
        map.put("choice", Integer.valueOf(i2));
        map.put("targetSettingChanged", Boolean.valueOf(z4));
        map.put("intPlan", intPlan);
        map.put("getIntPlan", Boolean.valueOf(z2));
        c(map, new AnonymousClass1(responseCallback, bundle, d5, i, i2, Boolean.valueOf(z3), j, d2, z));
    }

    static /* synthetic */ void e(final ResponseCallback responseCallback, double d, long j, final Bundle bundle, int i, final ivd ivdVar) {
        LogUtil.a("HealthWeight_WeightRateHelper", "calculateGoal errorCode ", Integer.valueOf(i), " weightManager ", ivdVar);
        if (i != 0) {
            responseCallback.onResponse(i, ivdVar);
        } else {
            nlx.e(d, j, (ResponseCallback<Double>) new ResponseCallback() { // from class: vmz
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: vnd
                        @Override // java.lang.Runnable
                        public final void run() {
                            vms.e(bundle, i2, d, responseCallback, ivdVar);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void e(Bundle bundle, int i, Double d, ResponseCallback responseCallback, ivd ivdVar) {
        WeightTargetDifferences weightTargetDifferencesB = b(bundle);
        LogUtil.a("HealthWeight_WeightRateHelper", "calculateGoal resultCode ", Integer.valueOf(i), " doubleData ", d, " weightTargetDifferences ", weightTargetDifferencesB);
        if (weightTargetDifferencesB == null) {
            responseCallback.onResponse(-1, ivdVar);
        } else {
            responseCallback.onResponse(i, ivdVar);
        }
    }

    /* JADX INFO: renamed from: vms$1, reason: invalid class name */
    class AnonymousClass1 extends UiCallback<iuu> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f51333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f51334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f51335c;
        final /* synthetic */ ResponseCallback d;
        final /* synthetic */ int e;
        final /* synthetic */ Boolean f;
        final /* synthetic */ int g;
        final /* synthetic */ double h;
        final /* synthetic */ double j;

        AnonymousClass1(ResponseCallback responseCallback, Bundle bundle, double d, int i, int i2, Boolean bool, long j, double d2, boolean z) {
            this.d = responseCallback;
            this.f51334b = bundle;
            this.h = d;
            this.g = i;
            this.e = i2;
            this.f = bool;
            this.f51333a = j;
            this.j = d2;
            this.f51335c = z;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.d("HealthWeight_WeightRateHelper", "calculateGoal onFailure errorCode ", Integer.valueOf(i), " errorInfo ", str);
            this.d.onResponse(i, null);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(iuu iuuVar) {
            iuw iuwVarD;
            LogUtil.a("HealthWeight_WeightRateHelper", "calculateGoal onSuccess goalDetail ", iuuVar);
            if (iuuVar != null && (iuwVarD = iuuVar.d()) != null) {
                this.f51334b.putInt(TypedValues.CycleType.S_WAVE_PERIOD, iuwVarD.a());
            }
            final ivd ivdVarA = nlx.a(iuuVar, (float) this.h, this.g, this.e);
            if (this.f.booleanValue()) {
                this.d.onResponse(0, ivdVarA);
            }
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final Bundle bundle = this.f51334b;
            final long j = this.f51333a;
            final double d = this.j;
            final Boolean bool = this.f;
            final boolean z = this.f51335c;
            final ResponseCallback responseCallback = this.d;
            threadPoolManagerC.execute(new Runnable() { // from class: vni
                @Override // java.lang.Runnable
                public final void run() {
                    vms.AnonymousClass1.e(bundle, j, d, bool, ivdVarA, z, responseCallback);
                }
            });
        }

        static /* synthetic */ void e(Bundle bundle, long j, double d, Boolean bool, ivd ivdVar, boolean z, ResponseCallback responseCallback) {
            bundle.putLong("targetBeginDate", j);
            vms.b(bundle);
            nlx.e(d, j, (ResponseCallback<Double>) null);
            if (bool.booleanValue()) {
                nlx.a(ivdVar, j, z, (ResponseCallback<ivd>) null);
            } else {
                nlx.a(ivdVar, j, z, (ResponseCallback<ivd>) responseCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WeightTargetDifferences b(Bundle bundle) {
        long time;
        double dE;
        int i;
        if (bundle == null) {
            ReleaseLogUtil.d("HealthWeight_WeightRateHelper", "saveWeightTargetDifferences bundle is null");
            return null;
        }
        double d = bundle.getDouble("weight");
        double d2 = bundle.getDouble("targetWeight");
        int i2 = bundle.getInt("weightManagerType");
        long j = bundle.getLong("modifiedTime", System.currentTimeMillis());
        double d3 = d - d2;
        if (i2 == 1) {
            int iD = bundle.getInt(TypedValues.CycleType.S_WAVE_PERIOD);
            if (iD <= 0) {
                iD = vei.d(bundle.getInt("fatBurnChoice"), d, d2);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, iD - 1);
            time = calendar.getTime().getTime();
            dE = vng.e(j, time, d3);
        } else if (i2 != 2) {
            dE = 0.0d;
            time = 0;
        } else {
            long j2 = bundle.getLong("targetFinishDate");
            dE = vng.e(j, j2, d3);
            time = j2;
        }
        if (dE == 0.0d) {
            i = bundle.getInt("maintainTargetWeightRange");
            time = 0;
        } else {
            i = 0;
        }
        long j3 = bundle.getLong("targetBeginDate");
        WeightTargetDifferences weightTargetDifferences = new WeightTargetDifferences(dE, j3, time, i);
        boolean zA = vng.a(weightTargetDifferences);
        LogUtil.a("HealthWeight_WeightRateHelper", "saveWeightTargetDifferences weight ", Double.valueOf(d), " targetWeight ", Double.valueOf(d2), " weightManagerType ", Integer.valueOf(i2), " targetDifferences ", Double.valueOf(dE), " targetBeginDate ", Long.valueOf(j3), " targetFinishDate ", Long.valueOf(time), " maintainTargetWeightRange ", Integer.valueOf(i), " isSuccess ", Boolean.valueOf(zA));
        if (zA) {
            return weightTargetDifferences;
        }
        return null;
    }

    public static void d(ivd ivdVar, long j) {
        LogUtil.a("HealthWeight_WeightRateHelper", "saveWeightTargetDifferences weightManager ", ivdVar, " modifyTime ", Long.valueOf(j));
        if (ivdVar == null) {
            return;
        }
        int i = ivdVar.i();
        if (i == 0) {
            e(ivdVar, j);
        } else {
            if (i != 1) {
                return;
            }
            c(ivdVar, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final ivd ivdVar, final long j) {
        LogUtil.a("HealthWeight_WeightRateHelper", "saveDifferencesWhenHold weightManager ", ivdVar, " modifyTime ", Long.valueOf(j));
        if (ivdVar == null) {
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vne
                @Override // java.lang.Runnable
                public final void run() {
                    vms.e(ivdVar, j);
                }
            });
            return;
        }
        UserInfomation userInfomationA = ioy.a();
        if (userInfomationA == null) {
            ReleaseLogUtil.d("HealthWeight_WeightRateHelper", "saveDifferencesWhenHold userInfomation is null");
            return;
        }
        float fC = ivdVar.c();
        double dPow = Math.pow(((double) userInfomationA.getHeight()) / 100.0d, 2.0d) * 24.0d;
        double d = fC;
        double dMin = Math.min(dPow, d);
        double dMax = Math.max(dPow, d);
        int i = (int) (((dMax * 1000.0d) - (1000.0d * dMin)) / 2.0d);
        Bundle bundle = new Bundle();
        bundle.putLong("targetBeginDate", System.currentTimeMillis());
        bundle.putInt("maintainTargetWeightRange", i);
        bundle.putInt("weightManagerType", ivdVar.i());
        WeightTargetDifferences weightTargetDifferencesB = b(bundle);
        LogUtil.a("HealthWeight_WeightRateHelper", "saveDifferencesWhenHold initWeight ", Float.valueOf(fC), " bmi24ToWeight ", Double.valueOf(dPow), " lowValue ", Double.valueOf(dMin), " highValue ", Double.valueOf(dMax), " maintainTargetWeightRange ", Integer.valueOf(i), " weightTargetDifferences ", weightTargetDifferencesB);
        if (weightTargetDifferencesB == null) {
            return;
        }
        nlx.e((dMin + dMax) / 2.0d, j, (ResponseCallback<Double>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final ivd ivdVar, final long j) {
        final iux iuxVarD;
        LogUtil.a("HealthWeight_WeightRateHelper", "saveDifferencesWhenLose weightManager ", ivdVar, " modifyTime ", Long.valueOf(j));
        if (ivdVar == null || (iuxVarD = ivdVar.d()) == null) {
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vnc
                @Override // java.lang.Runnable
                public final void run() {
                    vms.c(ivdVar, j);
                }
            });
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vnb
                @Override // java.lang.Runnable
                public final void run() {
                    nkf.a().a(new ResponseCallback() { // from class: vnf
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i, Object obj) {
                            vms.d(ivdVar, iuxVar, j, i, (Float) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void d(final ivd ivdVar, final iux iuxVar, final long j, int i, final Float f) {
        LogUtil.a("HealthWeight_WeightRateHelper", "saveDifferencesWhenLose resultCode ", Integer.valueOf(i), " weightGoal ", f);
        if (f == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: vna
            @Override // java.lang.Runnable
            public final void run() {
                vms.b(ivdVar, iuxVar, f, j);
            }
        });
    }

    static /* synthetic */ void b(ivd ivdVar, iux iuxVar, Float f, long j) {
        float fC = ivdVar.c();
        int iD = iuxVar.d();
        Bundle bundle = new Bundle();
        bundle.putDouble("weight", fC);
        bundle.putInt("fatBurnChoice", iD);
        bundle.putDouble("targetWeight", f.floatValue());
        bundle.putLong("modifiedTime", j);
        bundle.putLong("targetBeginDate", j);
        bundle.putInt("weightManagerType", ivdVar.i());
        LogUtil.a("HealthWeight_WeightRateHelper", "saveDifferencesWhenLose initWeight ", Float.valueOf(fC), " gear ", Integer.valueOf(iD), " weightTargetDifferences ", b(bundle));
    }
}
