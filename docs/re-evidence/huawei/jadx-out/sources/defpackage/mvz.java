package defpackage;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mvz implements DataReceiveCallback {

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mvz f42544a = new mvz();
    }

    private mvz() {
    }

    public static mvz d() {
        return c.f42544a;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("DEVMGR_HealthAlarmManager", "errorCode is ", Integer.valueOf(i));
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.a("DEVMGR_HealthAlarmManager", "onDataReceived, deviceInfo or message is null");
            return;
        }
        if (!(eecVar instanceof eee)) {
            ReleaseLogUtil.a("DEVMGR_HealthAlarmManager", "onDataReceived, message is error");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (eecVar.getCommandId() != 2) {
            ReleaseLogUtil.a("DEVMGR_HealthAlarmManager", "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
            return;
        }
        if (eeeVar.d() != 80030005) {
            ReleaseLogUtil.a("DEVMGR_HealthAlarmManager", "onDataReceived, sampleEvent EventId is error");
            return;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC == null) {
            ReleaseLogUtil.a("DEVMGR_HealthAlarmManager", "onDataReceived, eventData is null");
            return;
        }
        String strD = eeq.d(eeq.e(bArrC));
        LogUtil.a("HealthAlarmManager", "onDataReceived data:", strD);
        try {
            int i2 = new JSONObject(strD).getInt("alarmType");
            ReleaseLogUtil.d("DEVMGR_HealthAlarmManager", "alarmType:", Integer.valueOf(i2));
            if (i2 == 0) {
                ReleaseLogUtil.d("DEVMGR_HealthAlarmManager", "heart rate is too high.");
                qec.d().startSyncHeartRateAlarm(deviceInfo);
            } else if (i2 == 1) {
                ReleaseLogUtil.d("DEVMGR_HealthAlarmManager", "heart rate is too low.");
                qec.d().startSyncHeartRateAlarm(deviceInfo);
            } else {
                if (i2 != 2) {
                    return;
                }
                ReleaseLogUtil.d("DEVMGR_HealthAlarmManager", "oxygen saturation is too low.");
                qec.d().startSyncLowSpo2Alarm(deviceInfo);
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a("DEVMGR_HealthAlarmManager", "parse json exception");
        }
    }

    public void e() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.healthalarm", this);
        ReleaseLogUtil.d("DEVMGR_HealthAlarmManager", "register success");
    }

    public void b() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.healthalarm");
        ReleaseLogUtil.d("DEVMGR_HealthAlarmManager", "unregister success");
    }
}
