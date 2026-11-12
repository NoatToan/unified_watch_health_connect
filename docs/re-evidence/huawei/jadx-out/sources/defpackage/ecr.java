package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceServiceInfoRsp;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class ecr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ecr f32753b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseCallbackInterface f32755c;
    private Context h;
    private eby j;
    private long d = 180000;
    private long i = 180000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Timer f32754a = null;
    private String g = "1";
    private e f = new e(this);

    private ecr(Context context) {
        this.h = context;
    }

    public static ecr a(Context context) {
        if (f32753b == null) {
            synchronized (e) {
                if (f32753b == null) {
                    f32753b = new ecr(context);
                }
            }
        }
        return f32753b;
    }

    static class e extends StaticHandler<ecr> {
        e(ecr ecrVar) {
            super(ecrVar);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessage(ecr ecrVar, Message message) {
            if (ecrVar == null || message == null) {
                dyg.c(false, "OtaStatusManager", "handleMessage object or msg is null");
                return;
            }
            dyg.a(false, "OtaStatusManager", "handleMessage", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 12) {
                if ("2".equals(ecrVar.g)) {
                    return;
                }
                dyg.d(false, "OtaStatusManager", "handleMessage upgrade fail, No upgrade detected");
                ecrVar.f.sendEmptyMessage(17);
                return;
            }
            if (i != 17) {
                dyg.a(false, "OtaStatusManager", "handleMessage unKnow msg");
                return;
            }
            dyg.a(false, "OtaStatusManager", "handleMessage Upgrade timeout");
            ecrVar.a();
            if (ecrVar.j != null) {
                Map<String, String> mapC = eas.b().c(ecrVar.j.e());
                mapC.put("status", "1");
                eas.b().a(ecrVar.j.e(), mapC);
            } else {
                dyg.d(false, "OtaStatusManager", "handleMessage device is null");
            }
            ecrVar.f32755c.onFailure(-2);
        }
    }

    private void j() {
        synchronized (this) {
            if (this.f32754a == null) {
                this.f32754a = new Timer("OtaStatusManager");
                dyg.a(false, "OtaStatusManager", "Start the timer connected devices");
                this.f32754a.schedule(new b(this), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                this.f.sendEmptyMessageDelayed(12, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
            }
        }
    }

    public void b() {
        synchronized (this) {
            Timer timer = this.f32754a;
            if (timer != null) {
                timer.cancel();
                this.f32754a.purge();
                this.f32754a = null;
                dyg.a(false, "OtaStatusManager", "Cancel the timer connected devices");
            } else {
                dyg.a(false, "OtaStatusManager", "Connection timer has been canceled");
            }
        }
    }

    private boolean c() {
        boolean z;
        synchronized (this) {
            z = this.f32754a != null;
        }
        return z;
    }

    public void a() {
        e eVar = this.f;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
        }
        this.g = "1";
        b();
    }

    static class b extends TimerTask {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ecr> f32757c;

        b(ecr ecrVar) {
            this.f32757c = new WeakReference<>(ecrVar);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            WeakReference<ecr> weakReference = this.f32757c;
            if (weakReference == null) {
                dyg.a(false, "OtaStatusManager", "MyTimerTask run mWeakRef is null");
                return;
            }
            ecr ecrVar = weakReference.get();
            if (ecrVar == null) {
                dyg.a(false, "OtaStatusManager", "MyTimerTask run manager is null");
            } else {
                dyg.a(false, "OtaStatusManager", "check ota update result...");
                ecrVar.d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    public void a(String str, BaseCallbackInterface baseCallbackInterface) {
        if ("1".equals(this.g) || !c()) {
            dyg.a(false, "OtaStatusManager", "setStatusCallback Restart detection");
            this.f32755c = baseCallbackInterface;
            b(str);
            eby ebyVar = this.j;
            if (ebyVar != null) {
                long jA = eas.a(ebyVar.e());
                this.i = jA;
                if (jA > 0) {
                    long j = this.d;
                    if (jA > j) {
                        this.i = this.d;
                    } else {
                        this.i = j - jA;
                    }
                } else {
                    this.i = this.d;
                }
                dyg.a(false, "OtaStatusManager", "setStatusCallback timeOut:", Long.valueOf(this.i));
                e();
                return;
            }
            dyg.d(false, "OtaStatusManager", "setStatusCallback mWiFiDevice is null");
            this.f.obtainMessage(17).sendToTarget();
            return;
        }
        this.f32755c = baseCallbackInterface;
    }

    private void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            MeasurableDevice measurableDeviceB = dmp.d().b(str, false);
            if (!(measurableDeviceB instanceof eby)) {
                LogUtil.j("OtaStatusManager", "device is not instanceof WiFiDevice");
                return;
            }
            eby ebyVar = (eby) measurableDeviceB;
            this.j = ebyVar;
            if (ean.i(ebyVar.e())) {
                this.d = 480000L;
                return;
            }
            return;
        }
        dyg.d(false, "OtaStatusManager", "productId is empty, can't get WiFiDevice");
    }

    private void e() {
        a();
        this.f.sendEmptyMessageDelayed(17, this.i);
        this.g = "1";
        j();
    }

    public void c(String str, BaseCallbackInterface baseCallbackInterface) {
        dyg.a(false, "OtaStatusManager", "startCheckStatus in");
        this.f32755c = baseCallbackInterface;
        b(str);
        if (this.j != null) {
            this.i = this.d;
            e();
            eas.c(this.j.e(), System.currentTimeMillis());
        } else {
            dyg.d(false, "OtaStatusManager", "startCheckStatus mWiFiDevice is null");
            this.f.obtainMessage(17).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        WifiDeviceServiceInfoReq wifiDeviceServiceInfoReq = new WifiDeviceServiceInfoReq();
        eby ebyVar = this.j;
        if (ebyVar != null && ebyVar.a() != null) {
            if (!TextUtils.isEmpty(this.j.a().c())) {
                wifiDeviceServiceInfoReq.setDevId(this.j.a().c());
                wifiDeviceServiceInfoReq.setSid("devOtaInfo");
                lqo.b(this.h).d(wifiDeviceServiceInfoReq, new ICloudOperationResult<WifiDeviceServiceInfoRsp>() { // from class: ecr.5
                    @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void operationResult(WifiDeviceServiceInfoRsp wifiDeviceServiceInfoRsp, String str, boolean z) {
                        if (!z) {
                            dyg.d(false, "OtaStatusManager", "checkOtaStatus get device ota status fail. text:", str, "|res:", wifiDeviceServiceInfoRsp);
                            return;
                        }
                        if (wifiDeviceServiceInfoRsp == null) {
                            ReleaseLogUtil.d("OtaStatusManager", "res is null");
                            return;
                        }
                        if (wifiDeviceServiceInfoRsp.getDeviceServiceInfo() == null || wifiDeviceServiceInfoRsp.getDeviceServiceInfo().isEmpty()) {
                            dyg.d(false, "OtaStatusManager", "checkOtaStatus device service is empty.");
                        } else {
                            for (DeviceServiceInfo deviceServiceInfo : wifiDeviceServiceInfoRsp.getDeviceServiceInfo()) {
                                dyg.e(false, "OtaStatusManager", "device service info size: ", Integer.valueOf(wifiDeviceServiceInfoRsp.getDeviceServiceInfo().size()));
                                if (ecr.this.d(deviceServiceInfo.getData(), deviceServiceInfo)) {
                                    return;
                                }
                            }
                        }
                        dyg.a(false, "OtaStatusManager", "checkOtaStatus res:", wifiDeviceServiceInfoRsp, "|text:", str);
                    }
                });
                return;
            }
            dyg.a(false, "OtaStatusManager", "checkOtaStatus dev id is null");
            return;
        }
        dyg.d(false, "OtaStatusManager", "checkOtaStatus device id is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Map<String, String> map, DeviceServiceInfo deviceServiceInfo) {
        if (map == null) {
            LogUtil.j("OtaStatusManager", "getOtaStatus map is null");
            return false;
        }
        String str = map.get("status");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("OtaStatusManager", "getOtaStatus status is empty");
            return false;
        }
        String str2 = map.get("fwNewVer");
        String str3 = map.get("fwCurVer");
        dyg.a(false, "OtaStatusManager", "sid: ", deviceServiceInfo.getSid(), ", note: ", map.get("releaseNote"));
        ReleaseLogUtil.d("R_Weight_OtaStatusManager", "newVer: ", str2, ", curVer: ", str3, ", status: ", str);
        if (this.j == null) {
            LogUtil.j("OtaStatusManager", "getOtaStatus mWiFiDevice is null");
        } else {
            Map<String, String> mapC = eas.b().c(this.j.e());
            if ("3".equals(str) || mapC == null) {
                LogUtil.a("OtaStatusManager", "getOtaStatus update new map");
                eas.b().a(this.j.e(), map);
            } else {
                mapC.put("status", str);
                eas.b().a(this.j.e(), mapC);
            }
        }
        if ("3".equals(str)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fwCurVer", str3);
            contentValues.put("status", str);
            this.f32755c.onSuccess(contentValues);
            eas.b().a();
            b();
            a();
            this.g = str;
            return true;
        }
        if (e(str)) {
            this.f32755c.onFailure(-3);
            b();
            a();
            dyg.d(false, "OtaStatusManager", "getOtaStatus Upgrade fail status:", str, ", mUpgradeStatus:", this.g);
            this.g = str;
            return true;
        }
        this.g = str;
        return false;
    }

    private boolean e(String str) {
        return "1".equals(str) && "2".equals(this.g);
    }
}
