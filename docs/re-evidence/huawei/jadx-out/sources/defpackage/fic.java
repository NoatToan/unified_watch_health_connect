package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.json.JsonSanitizer;
import com.huawei.exercise.modle.IExerciseAdviceCallback;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.health.algorithm.api.BreathTrainApi;
import com.huawei.health.algorithm.api.BreatheWearAppInterface;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwstressmgr.interfaces.StressWearAppInterface;
import com.huawei.linkage.sportlinkage.DataListener;
import com.huawei.linkage.sportlinkage.LinkagePlatformApi;
import com.huawei.pluginsport.helper.DeviceInterface;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f34094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f34095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<IBaseResponseCallback> f34096c;
    private BreatheWearAppInterface d;
    private DataListener e;
    private IExerciseAdviceCallback f;
    private IBaseResponseCallback g;
    private IBaseResponseCallback h;
    private DeviceInfo i;
    private String j;
    private int k;
    private IBaseResponseCallback l;
    private IBaseResponseCallback m;
    private IBaseResponseCallback n;
    private boolean o;
    private IBaseResponseCallback p;
    private IBaseResponseCallback q;
    private LinkagePlatformApi r;
    private IBaseResponseCallback s;
    private IBaseResponseCallback t;
    private String u;
    private IBaseResponseCallback v;
    private StressWearAppInterface w;
    private DeviceInterface x;
    private IBaseResponseCallback y;

    public int c(int i) {
        if (i == 35) {
            return 5;
        }
        if (i == 36) {
            return 3;
        }
        if (i == 39) {
            return 7;
        }
        if (i == 74) {
            return 16;
        }
        switch (i) {
            case 21:
                return 0;
            case 22:
                return 1;
            case 23:
                return -2;
            default:
                switch (i) {
                    case 41:
                        return 8;
                    case 42:
                        return 13;
                    case 43:
                        return 11;
                    case 44:
                        return 12;
                    case 45:
                        return 14;
                    case 46:
                        return 10;
                    case 47:
                        return 15;
                    default:
                        return -1;
                }
        }
    }

    /* synthetic */ fic(AnonymousClass4 anonymousClass4) {
        this();
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fic f34111b = new fic(null);
    }

    /* JADX INFO: renamed from: fic$4, reason: invalid class name */
    class AnonymousClass4 implements IBaseResponseCallback {
        AnonymousClass4() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("HWhealthLinkage_", "registerRealTimeGuidanceCallback err_code is ", Integer.valueOf(i));
            if (obj == null) {
                LogUtil.e("HWhealthLinkage_", "registerRealTimeGuidanceCallback objData is null");
                return;
            }
            LogUtil.d("HWhealthLinkage_", "registerRealTimeGuidanceCallback objData is ", obj.toString());
            try {
                if (obj instanceof String) {
                    JSONObject jSONObject = new JSONObject((String) obj);
                    final int i2 = jSONObject.getInt("run_phrase_number");
                    JSONArray jSONArray = jSONObject.getJSONArray("run_phrase_variable");
                    final ArrayList arrayList = new ArrayList(10);
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        arrayList.add((Integer) jSONArray.get(i3));
                    }
                    LogUtil.d("HWhealthLinkage_", "mRealTimeGuidanceCallback number=", Integer.valueOf(i2), ", param=", arrayList);
                    Services.b("PluginFitnessAdvice", PluginSuggestion.class, BaseApplication.getContext(), new Consumer() { // from class: fia
                        @Override // com.huawei.framework.servicemgr.Consumer
                        public final void accept(Object obj2) {
                            ((PluginSuggestion) obj2).realTimeGuidance(i2, arrayList);
                        }
                    });
                }
            } catch (JSONException e) {
                LogUtil.j("HWhealthLinkage_", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: fic$16, reason: invalid class name */
    class AnonymousClass16 implements DeviceInterface {
        AnonymousClass16() {
        }

        @Override // com.huawei.pluginsport.helper.DeviceInterface
        public void getOperator(final IBaseResponseCallback iBaseResponseCallback) {
            ReleaseLogUtil.d("HWhealthLinkage_", "DeviceInterface:isSporting");
            fks.d().a(new IBaseResponseCallback() { // from class: fic.16.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("HWhealthLinkage_", "DeviceInterface:onResponse");
                    IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(i, obj);
                    }
                }
            });
        }

        @Override // com.huawei.pluginsport.helper.DeviceInterface
        public void getDeviceStepRateAlgorithmEnterprise(final IBaseResponseCallback iBaseResponseCallback) {
            fks.d().d(new IBaseResponseCallback() { // from class: fig
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    fic.AnonymousClass16.a(iBaseResponseCallback, i, obj);
                }
            });
        }

        static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
            if (iBaseResponseCallback == null) {
                ReleaseLogUtil.d("HWhealthLinkage_", "getDeviceStepRateAlgorithmEnterprise callback is null");
            } else {
                iBaseResponseCallback.a(i, obj);
            }
        }

        @Override // com.huawei.pluginsport.helper.DeviceInterface
        public void setBoltWearStatusListener(String str, IBaseResponseCallback iBaseResponseCallback) {
            fib.d().e(str, iBaseResponseCallback);
        }

        @Override // com.huawei.pluginsport.helper.DeviceInterface
        public void unregBoltWearStatusListener(String str) {
            fib.d().b(str);
        }
    }

    private fic() {
        this.j = "";
        this.k = -2;
        this.s = new AnonymousClass4();
        this.v = new IBaseResponseCallback() { // from class: fic.12
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "notifyDeviceTrackStatusSwitchResult err_code ", Integer.valueOf(i));
                LogUtil.d("HWhealthLinkage_", "notifyDeviceTrackStatusSwitchResult objData ", obj);
            }
        };
        this.h = new IBaseResponseCallback() { // from class: fic.14
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "notifyDeviceStatusChanged err_code is ", Integer.valueOf(i));
                if (obj == null) {
                    LogUtil.e("HWhealthLinkage_", "notifyDeviceStatusChanged objData is null");
                    return;
                }
                ReleaseLogUtil.d("HWhealthLinkage_", "notifyDeviceStatusChanged objData is ", obj, Boolean.valueOf(fhz.d().h()), Boolean.valueOf(fhz.d().g()));
                if (i == 100000 && fhz.d().h() && fhz.d().g()) {
                    fic.this.c(obj);
                }
            }
        };
        this.n = new IBaseResponseCallback() { // from class: fic.15
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 100000 && (obj instanceof JSONObject)) {
                    fhf.b().a((JSONObject) obj, 50001);
                }
            }
        };
        this.l = new IBaseResponseCallback() { // from class: fic.13
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 100000) {
                    LogUtil.a("HWhealthLinkage_", "HealthTrackInteractor succeed to close heartrate");
                }
            }
        };
        this.t = new IBaseResponseCallback() { // from class: fic.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "mNotifyVoicePlayCallback err_code is ", Integer.valueOf(i));
                if (obj != null) {
                    LogUtil.d("HWhealthLinkage_", "mNotifyVoicePlayCallback objData is ", obj.toString());
                }
                if (i == 100000) {
                    int iS = ive.c().s();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("result", iS);
                    } catch (JSONException e) {
                        LogUtil.j("HWhealthLinkage_", e.getMessage());
                    }
                    fks.d().b(jSONObject, (IBaseResponseCallback) null);
                }
            }
        };
        this.f34094a = new IBaseResponseCallback() { // from class: fic.18
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "registerConnectionStatusChangeNotification err_code is ", Integer.valueOf(i));
                if (i != 100000 || obj == null) {
                    ReleaseLogUtil.e("HWhealthLinkage_", "registerConnectionStatusChangeNotification response error or objData is null");
                    return;
                }
                LogUtil.d("HWhealthLinkage_", "registerConnectionStatusChangeNotification objData is ", obj.toString());
                try {
                    if (obj instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) obj);
                        if (eel.d(jSONObject.getInt("product_type"))) {
                            return;
                        }
                        fic.this.a(jSONObject);
                    }
                } catch (JSONException e) {
                    LogUtil.j("HWhealthLinkage_", e.getMessage());
                }
            }
        };
        this.x = new AnonymousClass16();
        this.d = new BreatheWearAppInterface() { // from class: fic.19
            @Override // com.huawei.health.algorithm.api.BreatheWearAppInterface
            public void setHeartRateReportStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
                fks.d().c(jSONObject, iBaseResponseCallback);
            }

            @Override // com.huawei.health.algorithm.api.BreatheWearAppInterface
            public boolean getDeviceSupportBreatheReport() {
                DeviceInfo deviceInfoC = mgg.c("HWhealthLinkage_");
                DeviceCapability deviceCapabilityC = eej.c();
                if (deviceInfoC == null || deviceCapabilityC == null) {
                    return false;
                }
                boolean zIsSupportPressAutoMonitor = deviceCapabilityC.isSupportPressAutoMonitor();
                ReleaseLogUtil.d("HWhealthLinkage_", "Adjust isSupportPressAutoMonitor() = ", Boolean.valueOf(zIsSupportPressAutoMonitor));
                return deviceInfoC.getDeviceConnectState() == 2 && zIsSupportPressAutoMonitor;
            }

            @Override // com.huawei.health.algorithm.api.BreatheWearAppInterface
            public void registerNotificationPress(IBaseResponseCallback iBaseResponseCallback) {
                fks.d().h(iBaseResponseCallback);
            }

            @Override // com.huawei.health.algorithm.api.BreatheWearAppInterface
            public void unRegisterNotificationPress(IBaseResponseCallback iBaseResponseCallback) {
                fks.d().p(iBaseResponseCallback);
            }

            @Override // com.huawei.health.algorithm.api.BreatheWearAppInterface
            public String getDeviceUuid() {
                DeviceInfo deviceInfoC = mgg.c("HWhealthLinkage_");
                if (deviceInfoC != null) {
                    mga.h(deviceInfoC);
                    return mga.e();
                }
                return "";
            }
        };
        this.m = new IBaseResponseCallback() { // from class: fic.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    if (i != 100000) {
                        fhz.d().e(false);
                        ReleaseLogUtil.e("HWhealthLinkage_", "failed to open or close heartrate");
                        return;
                    }
                    return;
                }
                ReleaseLogUtil.d("HWhealthLinkage_", "setHeartRateReportStatus err_code is ", Integer.valueOf(i));
                LogUtil.a("HWhealthLinkage_", "setHeartRateReportStatus heart rate is not null");
                if (i != 100000) {
                    fhz.d().e(false);
                    LogUtil.j("HWhealthLinkage_", "failed to open or close hearrate");
                } else {
                    c(obj);
                }
            }

            private void c(Object obj) {
                if (obj instanceof String) {
                    try {
                        JSONArray jSONArray = new JSONArray((String) obj);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (fhy.e().a() == 1 || fhw.d().b() == 1 || CoachController.c().b() == 1) {
                                fic.this.f34095b.a(100000, jSONObject);
                            } else {
                                fic.this.b();
                            }
                        }
                    } catch (JSONException e) {
                        LogUtil.e("HWhealthLinkage_", LogAnonymous.b(e));
                    }
                }
            }
        };
        this.w = new StressWearAppInterface() { // from class: fic.1
            @Override // com.huawei.hwstressmgr.interfaces.StressWearAppInterface
            public void setStressMeasureStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
                fks.d().n(jSONObject, iBaseResponseCallback);
            }

            @Override // com.huawei.hwstressmgr.interfaces.StressWearAppInterface
            public boolean getDeviceSupportStressReport() {
                return fhz.d().a();
            }
        };
        this.p = new IBaseResponseCallback() { // from class: fic.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "report RunPlan ETE result err_code=", Integer.valueOf(i));
                cre.a().c(obj);
            }
        };
        this.y = new IBaseResponseCallback() { // from class: fic.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "report Workout result err_code=", Integer.valueOf(i));
                cre.a().e(obj);
            }
        };
        this.f = new IExerciseAdviceCallback() { // from class: fic.10
            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public void registerServiceConnectedListener(IBaseResponseCallback iBaseResponseCallback) {
                fks.d().k(iBaseResponseCallback);
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public void getDeviceETEState(IBaseResponseCallback iBaseResponseCallback) {
                fks.d().a(iBaseResponseCallback);
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public void registerConnectionStatusChangeNotification(IBaseResponseCallback iBaseResponseCallback) {
                fks.d().j(iBaseResponseCallback);
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public void getDeviceFitnessPlanParamter(IBaseResponseCallback iBaseResponseCallback) {
                fks.d().f(iBaseResponseCallback);
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public void pushFitnessPlan(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
                fks.d().i(jSONObject, iBaseResponseCallback);
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public JSONObject getDeviceCapability() {
                return fks.d().b();
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public void setRunPlanReminderSwitch(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
                fks.d().h(jSONObject, iBaseResponseCallback);
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public void setMetricUnit(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
                fks.d().f(jSONObject, iBaseResponseCallback);
            }

            @Override // com.huawei.exercise.modle.IExerciseAdviceCallback
            public DeviceInfo getCurrentDeviceInfo() {
                return fks.d().a();
            }
        };
        this.q = new IBaseResponseCallback() { // from class: fic.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HWhealthLinkage_", "mOpenAllSportDataCallback errorCode = ", Integer.valueOf(i));
                if (100000 != i) {
                    ReleaseLogUtil.d("HWhealthLinkage_", "mOpenAllSportDataCallback failed to OPEN report");
                    return;
                }
                LogUtil.a("HWhealthLinkage_", "mOpenAllSportDataCallback succeed to OPEN report");
                fhf.b().b(obj);
                fhf.b().e(obj);
            }
        };
        this.f34096c = new ArrayList(10);
        this.e = new DataListener() { // from class: fic.9
            @Override // com.huawei.linkage.sportlinkage.DataListener
            public void onResponse(oax oaxVar) {
                njw njwVarC = fkq.c(fic.this.u, oaxVar);
                fhf.b().e(njwVarC);
                fhf.b().a(njwVarC);
                fhf.b().g(njwVarC.p(), oaxVar.ae());
                fhf.b().a(njwVarC.p(), oaxVar.m());
                fhf.b().j(njwVarC.p(), oaxVar.y());
                fhf.b().b(njwVarC.p(), oaxVar.h());
                fhf.b().d(njwVarC.p(), oaxVar.f());
                fhf.b().c(njwVarC.p(), oaxVar.n());
                fhf.b().e(njwVarC.p(), oaxVar.j());
                fhf.b().k(njwVarC.p(), oaxVar.as());
                fhf.b().f(njwVarC.p(), oaxVar.ao());
                fhf.b().h(njwVarC.p(), oaxVar.am());
                fhf.b().i(njwVarC.p(), oaxVar.ah());
                LogUtil.a("HWhealthLinkage_", "RealDataListener callback", oaxVar.toString());
            }
        };
        this.g = new IBaseResponseCallback() { // from class: fic.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("HWhealthLinkage_", "mCloseAllSportDataCallback errorCode = ", Integer.valueOf(i));
            }
        };
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback != null) {
            this.f34096c.add(iBaseResponseCallback);
        }
    }

    public static final fic e() {
        return a.f34111b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) throws JSONException {
        if ("deviceDisconnected".equals(jSONObject.get("state"))) {
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle deviceDisconnected");
            if (p() || "health_deviceInstantDisconnected".equals(this.j)) {
                return;
            }
            fhz.d().e(false);
            s();
            return;
        }
        if ("deviceConnected".equals(jSONObject.get("state"))) {
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle deviceConnected");
            q();
            return;
        }
        if ("deviceInstantDisconnected".equals(jSONObject.get("state"))) {
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle deviceInstantDisconnected");
            if (p()) {
                return;
            }
            s();
            return;
        }
        if ("deviceInstantConnected".equals(jSONObject.get("state"))) {
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle deviceInstantConnected");
            Iterator<IBaseResponseCallback> it = this.f34096c.iterator();
            while (it.hasNext()) {
                it.next().a(4, new Object());
            }
            q();
            return;
        }
        if ("health_deviceDisconnected".equals(jSONObject.get("state"))) {
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle health_deviceDisconnected");
            this.j = "health_deviceDisconnected";
            if (r() || p()) {
                return;
            }
            fhz.d().e(false);
            s();
            return;
        }
        if ("health_deviceConnected".equals(jSONObject.get("state"))) {
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle deviceConnected");
            this.j = "health_deviceConnected";
            q();
            return;
        }
        if ("health_deviceInstantDisconnected".equals(jSONObject.get("state"))) {
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle health_deviceInstantDisconnected");
            this.j = "health_deviceInstantDisconnected";
            if (r()) {
                return;
            }
            s();
            return;
        }
        if ("health_deviceInstantConnected".equals(jSONObject.get("state"))) {
            this.j = "health_deviceInstantConnected";
            ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle health_deviceInstantConnected");
            Iterator<IBaseResponseCallback> it2 = this.f34096c.iterator();
            while (it2.hasNext()) {
                it2.next().a(4, new Object());
            }
            q();
            return;
        }
        ReleaseLogUtil.d("HWhealthLinkage_", "WearAppInteractor handle other bt status");
    }

    public boolean l() {
        LogUtil.a("HWhealthLinkage_", "registerRealTimeGuidanceCallback");
        fks.d().m(this.s);
        return false;
    }

    public boolean k() {
        LogUtil.a("HWhealthLinkage_", "registerVoicePlayCallback");
        fks.d().l(this.t);
        return false;
    }

    public boolean g() {
        fks.d().i(this.h);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        try {
            if (obj instanceof String) {
                JSONObject jSONObject = new JSONObject((String) obj);
                int i = jSONObject.getInt("operator_type");
                int i2 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
                ReleaseLogUtil.d("HWhealthLinkage_", "operator type:", Integer.valueOf(i), " workout type:", Integer.valueOf(i2));
                if (i2 != 279 && i2 != 137) {
                    a(i);
                    return;
                }
                b(i);
            }
        } catch (JSONException e) {
            LogUtil.j("HWhealthLinkage_", e.getMessage());
        }
    }

    private void a(int i) {
        ive.c().e(1);
        if (i == 2) {
            y();
        } else if (i == 3) {
            u();
        } else {
            if (i != 4) {
                return;
            }
            w();
        }
    }

    private void b(int i) {
        if (i == 2) {
            t();
        } else if (i == 3) {
            v();
        } else {
            if (i != 4) {
                return;
            }
            x();
        }
    }

    private void w() {
        ive.c().c(1);
        nwa.n().v();
        if (ive.c().b((ISportDataCallback) null) == 0) {
            fhy.e().a(true);
            e(100000);
        } else {
            e(123002);
            fhz.d().e(false);
        }
    }

    private void y() {
        if (ive.c().v() == 0) {
            fhy.e().a(true);
            e(100000);
        } else {
            e(123002);
            fhz.d().e(false);
        }
    }

    private void u() {
        if (ive.c().y() == 0) {
            fhy.e().a(true);
            e(100000);
        } else {
            e(123002);
            fhz.d().e(false);
        }
    }

    private void x() {
        CoachController.c().c(true);
        if (CoachController.c().b(CoachController.StatusSource.NEW_LINK_WEAR)) {
            e(100000);
            b();
            if (fhz.d().j()) {
                c();
                return;
            }
            return;
        }
        e(123002);
        fhz.d().e(false);
    }

    private void t() {
        if (CoachController.c().a(CoachController.StatusSource.NEW_LINK_WEAR)) {
            e(100000);
            b();
            if (fhz.d().j()) {
                c();
                return;
            }
            return;
        }
        e(123002);
        fhz.d().e(false);
    }

    private void v() {
        if (CoachController.c().d(CoachController.StatusSource.NEW_LINK_WEAR)) {
            e(100000);
            h();
            if (fhz.d().j()) {
                a();
                return;
            }
            return;
        }
        e(123002);
        fhz.d().e(false);
    }

    private void e(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notification_status_response", i);
        } catch (JSONException e) {
            LogUtil.j("HWhealthLinkage_", e.getMessage());
        }
        fks.d().g(jSONObject, this.v);
    }

    private boolean r() {
        List<DeviceInfo> listF = fks.d().f();
        boolean z = false;
        if (listF != null && listF.size() > 0) {
            for (DeviceInfo deviceInfo : listF) {
                if (deviceInfo != null && 1 == deviceInfo.getDeviceActiveState() && deviceInfo.getDeviceConnectState() == 2) {
                    z = true;
                }
            }
        }
        LogUtil.a("HWhealthLinkage_", "isHuaweiWearDeviceConnected res:", Boolean.valueOf(z));
        return z;
    }

    private boolean p() {
        List<DeviceInfo> listH = fks.d().h();
        boolean z = false;
        if (listH != null && listH.size() > 0) {
            for (DeviceInfo deviceInfo : listH) {
                if (deviceInfo != null && 1 == deviceInfo.getDeviceActiveState() && deviceInfo.getDeviceConnectState() == 2) {
                    z = true;
                }
            }
        }
        LogUtil.a("HWhealthLinkage_", "isHuaweiHealthDeviceConnected res:", Boolean.valueOf(z));
        return z;
    }

    public boolean f() {
        LogUtil.a("HWhealthLinkage_", "registerBluetoothStateListener enter");
        fks.d().j(this.f34094a);
        return false;
    }

    public void d(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        fks.d().j(jSONObject, iBaseResponseCallback);
    }

    public void e(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (this.o) {
            this.r.sendDataToDevice(jSONObject, this.i);
        } else {
            fks.d().d(jSONObject, iBaseResponseCallback);
        }
    }

    private void q() {
        fkt.e(true);
        fhz.d().e(3);
        d(true);
        ReleaseLogUtil.d("HWhealthLinkage_", "--------------before add----------------", fhz.d().e());
        fhz.d().b();
        ReleaseLogUtil.d("HWhealthLinkage_", "--------------after add----------------", fhz.d().e());
    }

    private void s() {
        fkt.e(false);
        fhz.d().e(0);
        d(false);
        ReleaseLogUtil.d("HWhealthLinkage_", "--------------before delete----------------", fhz.d().e());
        fhi.d().e();
        ReleaseLogUtil.d("HWhealthLinkage_", "--------------after delete----------------", fhz.d().e());
    }

    private void d(boolean z) {
        if (CoachController.c().f()) {
            CoachController.c().e(z);
        }
    }

    public void h() {
        int iD = d(1, this.n);
        this.k = iD;
        ReleaseLogUtil.d("HWhealthLinkage_", "mHeartRateSwitchStatus", Integer.valueOf(iD));
    }

    public void j() {
        int iE = e(1, this.n);
        this.k = iE;
        ReleaseLogUtil.d("HWhealthLinkage_", "openSilentHeartRateReport mHeartRateSwitchStatus", Integer.valueOf(iE));
    }

    public void b() {
        this.k = -2;
        d(2, this.l);
    }

    public int d() {
        return this.k;
    }

    public int d(int i, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_", "switchHeartRateReport, 1 means open while 2 means close, hearRateSwitch = ", Integer.valueOf(i));
        boolean zG = fhz.d().g();
        boolean zH = fhz.d().h();
        if (!fhz.d().f()) {
            ReleaseLogUtil.e("HWhealthLinkage_", "current device not support heart rate report");
            return 0;
        }
        if (!zH || zG || i != 1) {
            ReleaseLogUtil.d("HWhealthLinkage_", "switchHeartRateReport is linking");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i);
            } catch (JSONException e) {
                ReleaseLogUtil.a("HWhealthLinkage_", LogAnonymous.b(e));
                xjt.v("hearRateSwitch is exception" + e.getMessage());
            }
            this.f34095b = iBaseResponseCallback;
            fks.d().c(jSONObject, this.m);
            return 2;
        }
        ReleaseLogUtil.e("HWhealthLinkage_", "current status is not linking");
        xjt.v("current status is not linking");
        return 1;
    }

    public int e(int i, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("HWhealthLinkage_", "switchHeartRateReport, 1 means open while 2 means close, hearRateSwitch = ", Integer.valueOf(i));
        if (!fhz.d().f()) {
            ReleaseLogUtil.e("HWhealthLinkage_", "current device not support heart rate report");
            return 0;
        }
        ReleaseLogUtil.d("HWhealthLinkage_", "switchHeartRateReport is linking");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException e) {
            ReleaseLogUtil.a("HWhealthLinkage_", e.getMessage());
        }
        this.f34095b = iBaseResponseCallback;
        fks.d().c(jSONObject, this.m);
        return 2;
    }

    public void a() {
        ReleaseLogUtil.d("HWhealthLinkage_", "openAllDataReport enter");
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HWhealthLinkage_");
        this.i = deviceInfo;
        boolean zD = eey.d(deviceInfo, FitnessSleepType.HW_FITNESS_WAKE);
        this.o = zD;
        ReleaseLogUtil.d("HWhealthLinkage_", "isSupportReal is ", Boolean.valueOf(zD));
        if (this.o) {
            d(1);
            a(this.i);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operator_type", 1);
            fks.d().e(jSONObject, this.q);
        } catch (JSONException e) {
            ReleaseLogUtil.e("HWhealthLinkage_", "openAllDataReport JSONException = ", e.getMessage());
        }
    }

    private void d(int i) {
        fks.d().b(i, new IBaseResponseCallback() { // from class: fid
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                fic.a(i2, obj);
            }
        });
    }

    static /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("HWhealthLinkage_", "mOpenAllSportDataCallback errorCode = ", Integer.valueOf(i));
        if (100000 != i) {
            ReleaseLogUtil.d("HWhealthLinkage_", "mOpenAllSportDataCallback failed to OPEN report");
        }
    }

    private void a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.a("HWhealthLinkage_", "registerRealDataListener");
        LinkagePlatformApi linkagePlatformApiD = oav.d();
        this.r = linkagePlatformApiD;
        if (linkagePlatformApiD == null) {
            ReleaseLogUtil.a("HWhealthLinkage_", "openOrCloseReport error linkagePlatformApi null");
        } else {
            this.u = deviceInfo.getSecurityUuid();
            this.r.registerRealDataListener(this.e);
        }
    }

    private void ac() {
        LinkagePlatformApi linkagePlatformApiD = oav.d();
        this.r = linkagePlatformApiD;
        if (linkagePlatformApiD == null) {
            ReleaseLogUtil.a("HWhealthLinkage_", "openOrCloseReport error linkagePlatformApi null");
        } else {
            linkagePlatformApiD.unRegisterRealDataListener(this.e);
        }
    }

    public void c() {
        ReleaseLogUtil.d("HWhealthLinkage_", "closeAllDataReport enter");
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HWhealthLinkage_");
        this.i = deviceInfo;
        boolean zD = eey.d(deviceInfo, FitnessSleepType.HW_FITNESS_WAKE);
        this.o = zD;
        ReleaseLogUtil.d("HWhealthLinkage_", "closeAllDataReport isSupportReal is ", Boolean.valueOf(zD));
        if (this.o) {
            d(0);
            ac();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operator_type", 0);
            fks.d().e(jSONObject, this.g);
        } catch (JSONException e) {
            ReleaseLogUtil.e("HWhealthLinkage_", "openAllDataReport JSONException = ", e.getMessage());
            xjt.v("closeAllDataReport e" + e.getMessage());
        }
    }

    public void m() {
        cre.a().d(this.f);
    }

    public void n() {
        fks.d().n(this.p);
        fks.d().o(this.y);
    }

    public void o() {
        nud.c().c(this.w);
        BreathTrainApi breathTrainApi = (BreathTrainApi) Services.d("BreathTrainService", BreathTrainApi.class);
        if (breathTrainApi == null) {
            LogUtil.j("WearAppInteractor", "brath train api is null");
        } else {
            breathTrainApi.registerBreatheCallback(this.d);
        }
    }

    public void i() {
        LogUtil.a("HWhealthLinkage_", "registerDeviceSportStateCallback");
        pqm.a().a(this.x);
    }

    public void b(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HWhealthLinkage_", "getHuaweiWearDeviceListForV2 enter, types:", str);
        List<Integer> listA = a(str);
        ArrayList arrayList = new ArrayList(10);
        if (!CommonUtil.al(BaseApplication.getContext())) {
            List<DeviceInfo> listG = fks.d().g();
            if (listG == null) {
                if (iBaseResponseCallback != null) {
                    iBaseResponseCallback.a(100001, null);
                    return;
                }
                return;
            }
            for (DeviceInfo deviceInfo : listG) {
                if (deviceInfo != null) {
                    deviceInfo.setProductType(c(deviceInfo.getProductType()));
                    LogUtil.a("HWhealthLinkage_", "getHuaweiWearDeviceListForV2 dev type is:", Integer.valueOf(deviceInfo.getProductType()));
                    if (listA.contains(Integer.valueOf(deviceInfo.getProductType()))) {
                        deviceInfo.setDeviceConnectState(3);
                        deviceInfo.setDeviceActiveState(0);
                        arrayList.add(deviceInfo);
                    }
                }
            }
            LogUtil.a("HWhealthLinkage_", "getHuaweiWearDeviceListForV2 dev size is:", Integer.valueOf(arrayList.size()));
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, arrayList);
                return;
            }
            return;
        }
        a(iBaseResponseCallback, listA, arrayList);
    }

    private void a(final IBaseResponseCallback iBaseResponseCallback, final List<Integer> list, final List<DeviceInfo> list2) {
        fks.d().b(new IBaseResponseCallback() { // from class: fic.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HWhealthLinkage_", "getHuaweiWearDeviceListForV2 getDeviceListFromWear onResponse err_code:", Integer.valueOf(i));
                if (i == 0 && obj != null) {
                    for (com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo deviceInfo : (List) new Gson().fromJson(JsonSanitizer.sanitize((String) obj), new TypeToken<List<com.huawei.health.devicemgr.business.entity.legacy.DeviceInfo>>() { // from class: com.huawei.health.hwhealthlinkage.interactors.WearAppInteractor$18$1
                    }.getType())) {
                        if (deviceInfo != null) {
                            deviceInfo.setProductType(fic.this.c(deviceInfo.getProductType()));
                            LogUtil.a("HWhealthLinkage_", "getHuaweiWearDeviceListForV2 dev type is:", Integer.valueOf(deviceInfo.getProductType()));
                            if (list.contains(Integer.valueOf(deviceInfo.getProductType()))) {
                                DeviceInfo deviceInfoConvertToCommonDevice = deviceInfo.convertToCommonDevice();
                                deviceInfoConvertToCommonDevice.setDeviceConnectState(3);
                                deviceInfoConvertToCommonDevice.setDeviceActiveState(0);
                                list2.add(deviceInfoConvertToCommonDevice);
                            }
                        }
                    }
                }
                LogUtil.a("HWhealthLinkage_", "getHuaweiWearDeviceListForV2 new version, devList size is:", Integer.valueOf(list2.size()));
                iBaseResponseCallback.a(0, list2);
            }
        });
    }

    public List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList(10);
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != 0) {
                try {
                    for (String str2 : strArrSplit) {
                        int i = Integer.parseInt(str2);
                        arrayList.add(Integer.valueOf(i));
                        LogUtil.a("HWhealthLinkage_", "unbind devicetype:", Integer.valueOf(i));
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("HWhealthLinkage_", "number exception,", e.getMessage());
                }
            }
        }
        return arrayList;
    }
}
