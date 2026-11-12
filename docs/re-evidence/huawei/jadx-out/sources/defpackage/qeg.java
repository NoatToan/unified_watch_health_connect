package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class qeg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f46061a = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: qeg.5
        private static final long serialVersionUID = -696935313487950289L;

        {
            put("fallAsleepTime", 44201);
            put("sleepEfficiency", 44207);
            put("sleepLatency", 44204);
            put("sleepScore", 44203);
            put("snoreFreq", 44208);
            put("validData", 44206);
            put("wakeupTime", 44202);
            put("deepPart", 44106);
            put("minHeartrate", 44209);
            put("maxHeartrate", 44210);
            put("minOxygenSaturation", 44211);
            put("maxOxygenSaturation", 44212);
            put("minBreathrate", 44213);
            put("maxBreathrate", 44214);
            put("avgHeartrate", 44219);
            put("minHeartrateBaseline", 44220);
            put("maxHeartrateBaseline", 44221);
            put("heartrateDayToBaseline", 44222);
            put("avgOxygenSaturation", 44223);
            put("minOxygenSaturationBaseline", 44224);
            put("maxOxygenSaturationBaseline", 44225);
            put("oxygenSaturationDayToBaseline", 44226);
            put("avgBreathrate", 44227);
            put("minBreathrateBaseline", 44228);
            put("maxBreathrateBaseline", 44229);
            put("breathrateDayToBaseline", 44230);
            put("avgHrv", 44231);
            put("minHrvBaseline", 44232);
            put("maxHrvBaseline", 44233);
            put("hrvDayToBaseline", 44234);
        }
    });

    public static List<HiHealthData> d(JSONObject jSONObject, qeb qebVar) {
        ArrayList arrayList = new ArrayList(16);
        d(arrayList, qebVar);
        c(arrayList, qebVar);
        b(arrayList, qebVar);
        if (qebVar.e() == 1) {
            return arrayList;
        }
        v(arrayList, qebVar, jSONObject);
        u(arrayList, qebVar, jSONObject);
        ab(arrayList, qebVar, jSONObject);
        aa(arrayList, qebVar, jSONObject);
        j(arrayList, qebVar, jSONObject);
        p(arrayList, qebVar, jSONObject);
        o(arrayList, qebVar, jSONObject);
        x(arrayList, qebVar, jSONObject);
        n(arrayList, qebVar, jSONObject);
        q(arrayList, qebVar, jSONObject);
        g(arrayList, qebVar, jSONObject);
        d(arrayList, qebVar, jSONObject);
        r(arrayList, qebVar, jSONObject);
        m(arrayList, qebVar, jSONObject);
        f(arrayList, qebVar, jSONObject);
        a(arrayList, qebVar, jSONObject);
        w(arrayList, qebVar, jSONObject);
        l(arrayList, qebVar, jSONObject);
        y(arrayList, qebVar, jSONObject);
        c(arrayList, qebVar, jSONObject);
        s(arrayList, qebVar, jSONObject);
        i(arrayList, qebVar, jSONObject);
        b(arrayList, qebVar, jSONObject);
        e(arrayList, qebVar, jSONObject);
        t(arrayList, qebVar, jSONObject);
        k(arrayList, qebVar, jSONObject);
        h(arrayList, qebVar, jSONObject);
        return arrayList;
    }

    private static void d(List<HiHealthData> list, qeb qebVar) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setDeviceUuid(qebVar.d());
        hiHealthData.setStartTime(qebVar.c());
        hiHealthData.setEndTime(qebVar.c());
        hiHealthData.setType(f46061a.get("fallAsleepTime").intValue());
        hiHealthData.setValue(qebVar.b());
        list.add(hiHealthData);
    }

    private static void v(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "sleepEfficiency");
    }

    private static void u(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "sleepLatency");
    }

    private static void ab(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "sleepScore");
    }

    private static void aa(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "snoreFreq");
    }

    private static void p(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "minHeartrate");
    }

    private static void o(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "maxHeartrate");
    }

    private static void x(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        e(list, qebVar, jSONObject, "minOxygenSaturation");
    }

    private static void n(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        e(list, qebVar, jSONObject, "maxOxygenSaturation");
    }

    private static void q(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        e(list, qebVar, jSONObject, "minBreathrate");
    }

    private static void g(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        e(list, qebVar, jSONObject, "maxBreathrate");
    }

    private static void d(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "avgHeartrate");
    }

    private static void r(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "minHeartrateBaseline");
    }

    private static void m(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "maxHeartrateBaseline");
    }

    private static void f(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "heartrateDayToBaseline");
    }

    private static void a(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "avgOxygenSaturation");
    }

    private static void w(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "minOxygenSaturationBaseline");
    }

    private static void l(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "maxOxygenSaturationBaseline");
    }

    private static void y(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "oxygenSaturationDayToBaseline");
    }

    private static void c(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "avgBreathrate");
    }

    private static void s(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "minBreathrateBaseline");
    }

    private static void i(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "maxBreathrateBaseline");
    }

    private static void b(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "breathrateDayToBaseline");
    }

    private static void e(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "avgHrv");
    }

    private static void t(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "minHrvBaseline");
    }

    private static void k(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "maxHrvBaseline");
    }

    private static void h(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "hrvDayToBaseline");
    }

    private static void b(List<HiHealthData> list, qeb qebVar) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setDeviceUuid(qebVar.d());
        hiHealthData.setStartTime(qebVar.c());
        hiHealthData.setEndTime(qebVar.c());
        hiHealthData.setType(f46061a.get("validData").intValue());
        hiHealthData.setValue(qebVar.e());
        list.add(hiHealthData);
    }

    private static void c(List<HiHealthData> list, qeb qebVar) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setDeviceUuid(qebVar.d());
        hiHealthData.setStartTime(qebVar.c());
        hiHealthData.setEndTime(qebVar.c());
        hiHealthData.setType(f46061a.get("wakeupTime").intValue());
        hiHealthData.setValue(qebVar.c());
        list.add(hiHealthData);
    }

    private static void j(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject) {
        d(list, qebVar, jSONObject, "deepPart");
    }

    private static void d(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepStatUtil", str, "setIntegerStatData is null");
            return;
        }
        try {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setDeviceUuid(qebVar.d());
            long jB = b(qebVar);
            hiHealthData.setStartTime(jB);
            hiHealthData.setEndTime(jB);
            hiHealthData.setType(f46061a.get(str).intValue());
            hiHealthData.setValue(jSONObject.getInt(str));
            list.add(hiHealthData);
        } catch (JSONException unused) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepStatUtil", str, "setIntegerStatData jsonException");
        }
    }

    private static void e(List<HiHealthData> list, qeb qebVar, JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepStatUtil", str, "setDoubleStatData is null");
            return;
        }
        try {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setDeviceUuid(qebVar.d());
            long jB = b(qebVar);
            hiHealthData.setStartTime(jB);
            hiHealthData.setEndTime(jB);
            hiHealthData.setType(f46061a.get(str).intValue());
            hiHealthData.setValue(jSONObject.getDouble(str));
            list.add(hiHealthData);
        } catch (JSONException unused) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepStatUtil", str, "setDoubleStatData jsonException");
        }
    }

    public static boolean b() {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepStatUtil", "enter checkDeviceBedDetectionCapability");
        DeviceInfo deviceInfoD = d();
        if (deviceInfoD == null) {
            LogUtil.j("CoreSleepStatUtil", "checkDeviceBedDetectionCapability() deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfoD, 199);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepStatUtil", "isSupportBedDetection: ", Boolean.valueOf(zD));
        return zD;
    }

    public static DeviceInfo d() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "CoreSleepStatUtil");
        if (deviceList == null) {
            LogUtil.j("CoreSleepStatUtil", "getActiveMainNotAw70Device() deviceInfoList is null.");
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (!eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("CoreSleepStatUtil", "getActiveMainNotAw70Device() deviceInfo ", deviceInfo);
        return deviceInfo;
    }

    private static long b(qeb qebVar) {
        long jC = qebVar.c();
        long jA = lsl.a(jC, 20, 0);
        return jC <= jA ? jC : jA + 14400000;
    }
}
