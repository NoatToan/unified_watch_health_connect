package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.callback.OtaResultCallbackInterface;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.store.SharedStoreManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwdevice.outofprocess.callback.HwLocationCallback;
import com.huawei.hwdevice.outofprocess.datatype.DataOtaParametersV2;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.info.PsiUploadResponseInfo;
import com.huawei.hwversionmgr.utils.callback.PsiUploadResultCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ndb {
    private nde e;
    private nde g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42910b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OtaResultCallbackInterface f42911c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f42909a = null;
    private OtaResultCallbackInterface d = new OtaResultCallbackInterface() { // from class: ndb.2
        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onFileTransferState(String str, int i) {
            if (i > 100) {
                i = 100;
            }
            ndb.this.f42911c.onFileTransferState(str, i);
            if (i == 100) {
                lre.c(str, false);
            }
        }

        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onUpgradeFailed(String str, int i, String str2) {
            ndb.this.f42911c.onUpgradeFailed(str, i, str2);
            LogUtil.j("OtaManager", "iOtaResultCallback onUpgradeFailed errorCode", Integer.valueOf(i), " errorMessage", str2);
            lre.c(str, false);
        }

        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onFileRespond(String str, int i) {
            ndb.this.f42911c.onFileRespond(str, i);
            LogUtil.a("OtaManager", "iOtaResultCallback onFileRespond checkResult", Integer.valueOf(i));
            lre.c(str, false);
        }

        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onFileTransferReport(String str) {
            ndb.this.f42911c.onFileTransferReport(str);
        }
    };
    private OtaResultCallbackInterface j = new OtaResultCallbackInterface() { // from class: ndb.4
        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onFileTransferState(String str, int i) {
            if (i > 100) {
                i = 100;
            }
            if (ndb.this.f42911c != null) {
                ndb.this.f42911c.onFileTransferState(str, i);
            }
            if (i == 100) {
                mkb.b(str, false);
            }
        }

        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onUpgradeFailed(String str, int i, String str2) {
            if (ndb.this.f42911c != null) {
                ndb.this.f42911c.onUpgradeFailed(str, i, str2);
            }
            LogUtil.j("OtaManager", "iOtaResultCallback onUpgradeFailed errorCode:", Integer.valueOf(i), " errorMessage:", str2);
            mkb.b(str, false);
        }

        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onFileRespond(String str, int i) {
            if (ndb.this.f42911c != null) {
                ndb.this.f42911c.onFileRespond(str, i);
            }
            LogUtil.a("OtaManager", "iOtaResultCallback onFileRespond checkResult:", Integer.valueOf(i));
            mkb.b(str, false);
        }

        @Override // com.huawei.callback.OtaResultCallbackInterface
        public void onFileTransferReport(String str) {
            ndb.this.f42911c.onFileTransferReport(str);
        }
    };

    public static ndb b() {
        return c.d;
    }

    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("OtaManager", "sendAgreementSign deviceInfo == null");
            return;
        }
        LogUtil.a("OtaManager", "sendAgreementSign enter");
        String strG = nvd.g(BaseApplication.getContext(), deviceInfo.getDeviceIdentify());
        if (TextUtils.isEmpty(strG)) {
            ncx.e().b(deviceInfo, "0");
        } else {
            ncx.e().b(deviceInfo, strG);
        }
    }

    public void c() {
        if (!mio.b(mio.c("charging_key_band_auto_check_time"))) {
            LogUtil.j("OtaManager", "startChargingJob isChargingUpdated is true");
            e(1);
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "OtaManager");
        if (deviceList == null || deviceList.size() <= 0) {
            LogUtil.j("OtaManager", "startChargingJob (deviceList == null) || (deviceList.size() <= 0)");
            e(2);
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        if (deviceInfo == null) {
            LogUtil.j("OtaManager", "startChargingJob deviceInfo == null");
            e(2);
            return;
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
        intent.putExtra("extra_band_imei", deviceInfo.getDeviceIdentify());
        intent.setAction("action_band_auto_check_new_version");
        try {
            LogUtil.a("OtaManager", "startChargingJob HwUpdateService start");
            e(0);
            mio.d("charging_key_band_auto_check_time");
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            LogUtil.e("ChargingJobService Exception ", ExceptionUtils.c(e));
        }
    }

    private void e(int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("chargingStatus", String.valueOf(i));
        LogUtil.a("OtaManager", "chargingOpAnalytics result = ", Integer.valueOf(i));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.CHARGING_UPGRADE_PROCESS_80070009.value(), linkedHashMap);
    }

    public void c(DeviceParameter deviceParameter, String str, int i, OtaResultCallbackInterface otaResultCallbackInterface) {
        if (!mjx.d(deviceParameter.getProductType())) {
            a(deviceParameter, str, i, otaResultCallbackInterface);
        } else {
            e(deviceParameter, str, i, otaResultCallbackInterface);
        }
    }

    private void e(DeviceParameter deviceParameter, String str, int i, OtaResultCallbackInterface otaResultCallbackInterface) {
        DataOtaParametersV2 dataOtaParametersV2;
        if (!TextUtils.isEmpty(str)) {
            dataOtaParametersV2 = (DataOtaParametersV2) d(str, DataOtaParametersV2.class);
        } else {
            LogUtil.j("OtaManager", "sendOTAFileData parameter is null.");
            dataOtaParametersV2 = null;
        }
        if (dataOtaParametersV2 != null && dataOtaParametersV2.getOtaInterval() != 109000) {
            LogUtil.j("OtaManager", "sendOtaFileData otaParameter.getOtaInterval() != Constant.OTA_TAINTERVAL");
            nde ndeVar = this.e;
            if (ndeVar != null) {
                ndeVar.c();
                this.e = null;
            }
        }
        if (deviceParameter != null) {
            if (this.e == null) {
                this.e = new nde(null, deviceParameter.getMac());
            }
            this.f42911c = otaResultCallbackInterface;
            if (i == 0) {
                lre.c(deviceParameter.getMac(), true);
            }
            this.e.a(deviceParameter.getFilePath(), deviceParameter.getVersion(), dataOtaParametersV2, i, this.d);
        }
    }

    public void a(DeviceInfo deviceInfo, byte[] bArr) {
        if (mjx.d(deviceInfo.getProductType())) {
            nde ndeVar = this.e;
            if (ndeVar != null) {
                ndeVar.c(bArr);
                return;
            }
            return;
        }
        nde ndeVar2 = this.g;
        if (ndeVar2 != null) {
            ndeVar2.c(bArr);
        }
    }

    private void a(DeviceParameter deviceParameter, String str, int i, OtaResultCallbackInterface otaResultCallbackInterface) {
        DataOtaParametersV2 dataOtaParametersV2;
        LogUtil.a("OtaManager", "Enter sendOTAFileData enter.");
        if (!TextUtils.isEmpty(str)) {
            dataOtaParametersV2 = (DataOtaParametersV2) d(str, DataOtaParametersV2.class);
        } else {
            LogUtil.j("OtaManager", "sendOTAFileData parameter is null.");
            dataOtaParametersV2 = null;
        }
        if (dataOtaParametersV2 != null && dataOtaParametersV2.getOtaInterval() != 109000) {
            LogUtil.j("OtaManager", "sendOtaFileData otaParameter.getOtaInterval() != Constant.OTA_TAINTERVAL");
            nde ndeVar = this.g;
            if (ndeVar != null) {
                ndeVar.c();
                this.g = null;
            }
        }
        if (deviceParameter != null) {
            if (this.g == null) {
                this.g = new nde(lof.d(BaseApplication.getContext()), deviceParameter.getMac());
            }
            this.f42911c = otaResultCallbackInterface;
            if (i == 0) {
                mkb.b(deviceParameter.getMac(), true);
            }
            this.g.a(deviceParameter.getFilePath(), deviceParameter.getVersion(), dataOtaParametersV2, i, this.j);
        }
    }

    public void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.a("OtaManager", "registerReminder deviceInfo == null");
            return;
        }
        boolean z = Boolean.parseBoolean(SharedStoreManager.a("keyvaldb_unencrypt").getString("device_is_reconnect", "true"));
        LogUtil.a("OtaManager", "registerReminder isReconnect ", Boolean.valueOf(z));
        if (!z) {
            nvd.c(0, deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
            nvd.b(0, deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
            d(deviceInfo, true);
            c(deviceInfo, true);
            return;
        }
        int iB = nvd.b(deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
        LogUtil.a("OtaManager", "registerReminder psiUploadCount ", Integer.valueOf(iB));
        if (iB == 14) {
            return;
        }
        d(deviceInfo, false);
    }

    private void d(DeviceInfo deviceInfo, boolean z) {
        long j;
        this.f42910b = deviceInfo.getDeviceIdentify();
        if (this.f42909a == null) {
            this.f42909a = new d();
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.f42909a, new IntentFilter("action_broadcast_alarm_clock"), LocalBroadcast.f36595c, null);
        }
        long jC = qrk.c(System.currentTimeMillis(), 0) + 72000000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jC);
        LogUtil.a("OtaManager", "registerReminder hour ", Integer.valueOf(calendar.get(11)));
        long timeInMillis = calendar.getTimeInMillis();
        if (System.currentTimeMillis() <= timeInMillis || z) {
            j = timeInMillis;
        } else {
            calendar.add(5, 1);
            long timeInMillis2 = calendar.getTimeInMillis();
            d(deviceInfo, true, false, 60000 + System.currentTimeMillis());
            j = timeInMillis2;
        }
        LogUtil.a("OtaManager", "registerReminder requestCode ", 20230830, ", startTime ", Long.valueOf(jC), " selectTime ", Long.valueOf(j));
        Intent intent = new Intent("action_broadcast_alarm_clock");
        intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
        intent.putExtra("timed_task", true);
        intent.putExtra("reconnect_request_first", false);
        xjk.a(20230830, intent, 201326592, 0, j, 86400000L);
    }

    private void d(DeviceInfo deviceInfo, boolean z, boolean z2, long j) {
        Intent intent = new Intent("action_broadcast_alarm_clock");
        intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
        intent.putExtra("timed_task", z);
        intent.putExtra("reconnect_request_first", z2);
        xjk.d(20230901, intent, 201326592, 0, j);
    }

    /* JADX INFO: renamed from: ndb$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes11.dex */
    class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f42913a;
        final /* synthetic */ boolean e;

        AnonymousClass3(DeviceInfo deviceInfo, boolean z) {
            this.f42913a = deviceInfo;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            min.b().c(this.f42913a.getDeviceIdentify(), new HwLocationCallback() { // from class: ndb.3.1
                @Override // com.huawei.hwdevice.outofprocess.callback.HwLocationCallback
                public void onResult(String str) {
                    LogUtil.a("OtaManager", "requestPsiUpload initLocation message:", str);
                    nvh.e().b(AnonymousClass3.this.f42913a, false, new PsiUploadResultCallback() { // from class: ndb.3.1.3
                        @Override // com.huawei.hwversionmgr.utils.callback.PsiUploadResultCallback
                        public void onSuccess(PsiUploadResponseInfo psiUploadResponseInfo) {
                            LogUtil.a("OtaManager", "requestPsiUpload onSuccess:", psiUploadResponseInfo.toString());
                            nvd.b(System.currentTimeMillis(), AnonymousClass3.this.f42913a.getDeviceIdentify(), BaseApplication.getContext());
                            if (lsk.a(psiUploadResponseInfo.getResultCode(), 10) != 0) {
                                ndb.this.e(AnonymousClass3.this.f42913a, AnonymousClass3.this.e);
                                return;
                            }
                            int iB = nvd.b(AnonymousClass3.this.f42913a.getDeviceIdentify(), BaseApplication.getContext());
                            if (iB == 13) {
                                ndb.this.e(AnonymousClass3.this.f42913a.getDeviceIdentify(), 20230830);
                            }
                            if (iB == -1) {
                                iB = 0;
                            }
                            LogUtil.a("OtaManager", "requestPsiUpload onSuccess psiUploadCount:", Integer.valueOf(iB), " +1");
                            nvd.c(iB + 1, AnonymousClass3.this.f42913a.getDeviceIdentify(), BaseApplication.getContext());
                            ndb.this.e(AnonymousClass3.this.f42913a);
                        }

                        @Override // com.huawei.hwversionmgr.utils.callback.PsiUploadResultCallback
                        public void onFailure(Throwable th) {
                            LogUtil.a("OtaManager", "requestPsiUpload onFailure:", th.getMessage());
                            nvd.b(System.currentTimeMillis(), AnonymousClass3.this.f42913a.getDeviceIdentify(), BaseApplication.getContext());
                            ndb.this.e(AnonymousClass3.this.f42913a, AnonymousClass3.this.e);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, boolean z) {
        ThreadPoolManager.c().execute(new AnonymousClass3(deviceInfo, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, boolean z) {
        int iE = nvd.e(deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
        if (iE == -1) {
            iE = 0;
        }
        LogUtil.a("OtaManager", "retryRequestPsiUpload onFailure psiUploadFailCount :", Integer.valueOf(iE), " isReconnectFirst ", Boolean.valueOf(z));
        if (z) {
            if (iE < 6) {
                c(deviceInfo, iE, true);
                return;
            } else {
                e(deviceInfo);
                return;
            }
        }
        if (iE < 1) {
            c(deviceInfo, iE, false);
        } else {
            e(deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo) {
        LogUtil.a("OtaManager", "resetPsiUploadResult psiUploadFailCount 0");
        e(deviceInfo.getDeviceIdentify(), 20230901);
        nvd.b(0, deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
    }

    private void c(DeviceInfo deviceInfo, int i, boolean z) {
        LogUtil.a("OtaManager", "setPsiUploadRetryAlarm  psiUploadFailCount :", Integer.valueOf(i), " +1");
        nvd.b(i + 1, deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
        d(deviceInfo, false, z, System.currentTimeMillis() + 1200000);
    }

    public void e(String str, int i) {
        if (!this.f42910b.equals(str)) {
            LogUtil.j("OtaManager", "cancelReminder !mDeviceIdentify.equals(deviceIdentify)");
        } else {
            LogUtil.a("OtaManager", "cancelReminder requestCode ", Integer.valueOf(i));
            xjk.d(i, new Intent("action_broadcast_alarm_clock"), 201326592);
        }
    }

    private <T> T d(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        return (T) new Gson().fromJson(CommonUtil.ac(str), (Class) cls);
    }

    /* JADX INFO: loaded from: classes11.dex */
    class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("OtaManager", "AlarmClockReceiver receiver");
            if (xjk.d(intent)) {
                LogUtil.j("OtaManager", "AlarmClockReceiver isDifferentTimeZone.");
                return;
            }
            String stringExtra = intent.getStringExtra("device_id");
            boolean booleanExtra = intent.getBooleanExtra("timed_task", false);
            boolean booleanExtra2 = intent.getBooleanExtra("reconnect_request_first", false);
            LogUtil.a("OtaManager", "AlarmClockReceiver isReconnectFirst ", Boolean.valueOf(booleanExtra2), " isTimedTask ", Boolean.valueOf(booleanExtra));
            DeviceInfo deviceInfo = null;
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "OtaManager");
            if (!TextUtils.isEmpty(stringExtra) && deviceList != null && deviceList.size() > 0) {
                for (DeviceInfo deviceInfo2 : deviceList) {
                    if (stringExtra.equals(deviceInfo2.getDeviceIdentify())) {
                        deviceInfo = deviceInfo2;
                    }
                }
            }
            LogUtil.d("OtaManager", "onReceive currentDeviceInfo ", deviceInfo == null ? Constants.NULL : deviceInfo.toString());
            if (deviceInfo == null) {
                return;
            }
            int iB = nvd.b(deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
            LogUtil.a("OtaManager", "registerReminder psiUploadCount ", Integer.valueOf(iB));
            if (iB == 14) {
                return;
            }
            if (booleanExtra) {
                long jD = nvd.d(deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean zB = mio.b(jD, jCurrentTimeMillis);
                LogUtil.a("OtaManager", "onReceive psiUploadTime ", Long.valueOf(jD), " currentTimeMillis ", Long.valueOf(jCurrentTimeMillis), " isSameDay ", Boolean.valueOf(zB));
                if (zB) {
                    return;
                }
            }
            ndb.this.c(deviceInfo, booleanExtra2);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    static class c {
        private static ndb d = new ndb();
    }
}
