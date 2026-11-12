package defpackage;

import android.os.RemoteException;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.syncmgr.alarmdata.AlarmDataSyncApi;
import health.compact.a.EnvironmentUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = AlarmDataSyncApi.class)
@Singleton
public class mhx implements AlarmDataSyncApi {
    @Override // com.huawei.syncmgr.alarmdata.AlarmDataSyncApi
    public void startSyncLowSpo2Alarm(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmDataSyncApiImpl", "startSyncLowSpo2Alarm() isPhoneServiceProcess:", Boolean.valueOf(EnvironmentUtils.e()));
        if (EnvironmentUtils.e()) {
            myt.e().b(deviceInfo);
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmDataSyncApiImpl", "startSyncLowSpo2Alarm() binder is null");
            lug.e(BaseApplication.getContext());
        } else {
            try {
                iWearPhoneServiceAIDLC.notifyPhoneService("syncSpo2AlarmData", deviceInfo, 0, null);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmDataSyncApiImpl", "startSyncLowSpo2Alarm() RemoteException");
            }
        }
    }

    @Override // com.huawei.syncmgr.alarmdata.AlarmDataSyncApi
    public void startSyncHeartRateAlarm(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmDataSyncApiImpl", "startSyncHeartRateAlarm() isPhoneServiceProcess:", Boolean.valueOf(EnvironmentUtils.e()));
        if (EnvironmentUtils.e()) {
            myv.b().d(deviceInfo);
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmDataSyncApiImpl", "startSyncHeartRateAlarm() binder is null");
            lug.e(BaseApplication.getContext());
        } else {
            try {
                iWearPhoneServiceAIDLC.notifyPhoneService("syncHeartRateAlarmData", deviceInfo, 0, null);
            } catch (RemoteException unused) {
                ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmDataSyncApiImpl", "startSyncHeartRateAlarm() RemoteException");
            }
        }
    }
}
