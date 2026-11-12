package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcrowdtestapi.HealthFeedbackCallback;
import com.huawei.hwcrowdtestapi.HealthFeedbackParams;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.ui.device.interactors.UploadMaintLogInteractor;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes43.dex */
public class tez {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static tez f49038c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExtendHandler f49040b = null;
    private final UploadMaintLogInteractor d = new UploadMaintLogInteractor(BaseApplication.getContext());

    private tez() {
        b();
        a();
    }

    public static tez e() {
        tez tezVar;
        synchronized (e) {
            if (f49038c == null) {
                f49038c = new tez();
            }
            tezVar = f49038c;
        }
        return tezVar;
    }

    class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("FeedBackLogUtil", "handleMessage msg = ", Integer.valueOf(message.what));
            if (message.what == 1023) {
                tez.this.c(message);
                return true;
            }
            LogUtil.a("FeedBackLogUtil", "handleMessage else = ", Integer.valueOf(message.what));
            return false;
        }
    }

    public void b(DeviceInfo deviceInfo) {
        this.f49039a = deviceInfo.getDeviceIdentify();
    }

    private void b() {
        ltr.b().init(BaseApplication.getContext());
    }

    private void a() {
        this.f49040b = HandlerCenter.b(new e(), "FeedBackLogUtil");
    }

    public void c() {
        LogUtil.a("FeedBackLogUtil", "enter handlerDeviceGotoFeedBack");
        if (Utils.o()) {
            LogUtil.a("FeedBackLogUtil", "handlerDeviceGotoFeedBack isOversea");
            ltr.b().setProductType(20);
        } else {
            ltr.b().setProductType(1);
        }
        d();
    }

    private void d() {
        HealthFeedbackParams healthFeedbackParams = new HealthFeedbackParams();
        DeviceInfo deviceInfoE = tfn.a().e(this.f49039a);
        if (deviceInfoE != null) {
            LogUtil.a("FeedBackLogUtil", "goBetaFeedBack");
            String securityDeviceId = deviceInfoE.getSecurityDeviceId();
            String deviceIdentify = deviceInfoE.getDeviceIdentify();
            String udidFromDevice = deviceInfoE.getUdidFromDevice();
            int productType = deviceInfoE.getProductType();
            if (TextUtils.isEmpty(udidFromDevice)) {
                udidFromDevice = e(securityDeviceId, deviceIdentify, productType);
            }
            healthFeedbackParams.setDeviceId(udidFromDevice);
            healthFeedbackParams.setProductVersion(deviceInfoE.getSoftVersion());
            c(healthFeedbackParams, deviceInfoE);
            d(healthFeedbackParams);
            return;
        }
        LogUtil.j("FeedBackLogUtil", "no device");
    }

    private String e(String str, String str2, int i) {
        String strE;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            LogUtil.j("FeedBackLogUtil", "getMacAddress deviceMac or deviceSn empty");
            return "";
        }
        boolean z = !str2.contains(":") && str2.length() > 12;
        if (Utils.o() || z) {
            strE = nio.e(str);
            if (strE.length() >= 24) {
                strE = a(strE);
            }
        } else {
            strE = str2.replace(":", "");
        }
        if (Utils.o() || i < 34) {
            return strE;
        }
        if (!str.equals(str2)) {
            LogUtil.a("FeedBackLogUtil", "getMacAddress deviceMac != deviceSn");
            return nio.c(str + str2);
        }
        return nio.c(str);
    }

    private String a(String str) {
        if (str == null) {
            return "";
        }
        return str.length() >= 24 ? str.replace(Marker.ANY_NON_NULL_MARKER, "A").replace("/", "A").replace("=", "A").substring(0, 24) : str;
    }

    private void c(HealthFeedbackParams healthFeedbackParams, DeviceInfo deviceInfo) {
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        if (!TextUtils.isEmpty(securityDeviceId) && securityDeviceId.contains(":")) {
            securityDeviceId = securityDeviceId.replace(":", "");
        }
        int productType = deviceInfo.getProductType();
        String deviceModel = deviceInfo.getDeviceModel();
        String strC = mjj.c().c(productType, mjj.c().a(productType, deviceModel), deviceModel);
        if (eei.b(deviceModel)) {
            LogUtil.a("FeedBackLogUtil", "addGoBetaFeedBackParams currentDevice is honor device");
            healthFeedbackParams.setIsHonorDevice(true);
        }
        healthFeedbackParams.setProductName(strC);
        healthFeedbackParams.setDeviceModel(mjh.d(strC));
        healthFeedbackParams.setDeviceSn(securityDeviceId);
        if (Utils.o()) {
            healthFeedbackParams.setProductType(20);
        } else {
            healthFeedbackParams.setProductType(1);
        }
    }

    private void d(HealthFeedbackParams healthFeedbackParams) {
        LogUtil.a("FeedBackLogUtil", "sendFeedback");
        lwp.a().b(BaseApplication.getContext(), healthFeedbackParams, new b(BaseApplication.getActivity(), this.f49040b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            int i = data.getInt("bugTypeId");
            String string = data.getString("fileLogId");
            String string2 = data.getString("dtsNumber");
            if (BaseApplication.getActivity() == null || TextUtils.isEmpty(string2)) {
                return;
            }
            b(i, string2, string);
        }
    }

    private void b(int i, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = nio.e(this.f49039a) + "BETA_QUESTION";
        try {
            long j = Long.parseLong(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str3));
            LogUtil.a("FeedBackLogUtil", "WearHomeActivity currentTime is: ", Long.valueOf(jCurrentTimeMillis), ", lastTime is: ", Long.valueOf(j));
            if (jCurrentTimeMillis - j < 300000) {
                LogUtil.j("FeedBackLogUtil", "WearHomeActivity Less than five minutes");
                return;
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("FeedBackLogUtil", "WearHomeActivity NumberFormatException");
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), str3, String.valueOf(jCurrentTimeMillis), new StorageParams(0));
        lws lwsVarC = lws.c(BaseApplication.getContext());
        lwsVarC.b(i, str, str2);
        lwsVarC.b(0, this.f49039a, new DeviceDfxBaseResponseCallback() { // from class: tez.1
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onSuccess(int i2, String str4) {
                ReleaseLogUtil.d("Dfx_FeedBackLogUtil", "handlerGetDeviceLog onSuccess successCode = ", Integer.valueOf(i2));
                mfz.d(8, true);
                tez.this.d.d(false, tez.this.f49039a);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onFailure(int i2, String str4) {
                ReleaseLogUtil.a("Dfx_FeedBackLogUtil", "handlerGetDeviceLog onFailure errorCode = ", Integer.valueOf(i2), ", errorMessage = ", str4);
                mfz.d(8, true);
                tez.this.d.d(false, tez.this.f49039a);
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
            public void onProgress(int i2, String str4) {
                LogUtil.j("FeedBackLogUtil", "onProgress");
            }
        });
    }

    static class b implements HealthFeedbackCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ExtendHandler f49042c;
        private WeakReference<Activity> d;

        private b(Activity activity, ExtendHandler extendHandler) {
            this.d = new WeakReference<>(activity);
            this.f49042c = extendHandler;
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public void onFailed(String str) {
            Activity activity = this.d.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("FeedBackLogUtil", "onFailed activity is null, finish or destroyed");
            } else {
                LogUtil.d("FeedBackLogUtil", "gotoFeedBack failed");
            }
        }

        @Override // com.huawei.hwcrowdtestapi.HealthFeedbackCallback
        public ltn collectLogs(int i, String str, String str2, boolean z) {
            LogUtil.a("FeedBackLogUtil", "bugTypeId: ", Integer.valueOf(i), "tbdtsNo: ", str2, ";fileLogId: ", str);
            Activity activity = this.d.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("FeedBackLogUtil", "onFailed activity is null, finish or destroyed");
                return null;
            }
            mjh.a(z);
            Object objA = qrc.a(913000005);
            qrc.c(objA, qrc.e("E913000005_ERRCODE_TINYINT"), 0);
            qrc.c(objA, qrc.e("E913000005_SUBERRCODE_TINYINT"), 1);
            LogUtil.a("FeedBackLogUtil", "ReflectionIMonitor isSendEvent is", Boolean.valueOf(qrc.a(objA)));
            qrc.b(objA);
            ArrayList arrayList = new ArrayList(0);
            String strO = LogConfig.o();
            if (!Utils.o() && !TextUtils.isEmpty(strO)) {
                LogUtil.a("FeedBackLogUtil", "add tracktest path");
                arrayList.add(strO + "tracktest");
            }
            arrayList.add(mjh.f41741a + "MaintenanceLog");
            arrayList.add(mjh.f41741a + tge.e);
            arrayList.add(mjh.f41741a + tge.f49093a);
            arrayList.add(mjh.f41741a + "com.huawei.version.json");
            arrayList.add(mjh.f41741a + "huawei_crashLog_0.txt");
            arrayList.add(mjh.f41741a + "app_config_value.txt");
            arrayList.add(mjh.f41741a + tge.d);
            arrayList.add(tge.f49095c);
            DfxBaseHandler.getAllDfxLogFileToPathList(new File(mjh.f41741a), arrayList);
            if (CommonUtil.ap() && CommonUtil.bg()) {
                arrayList.add(LogConfig.e);
            }
            ltn ltnVar = new ltn();
            ltnVar.e(arrayList);
            ltnVar.c(200);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1023;
            Bundle bundle = new Bundle();
            bundle.putInt("bugTypeId", i);
            bundle.putString("fileLogId", str);
            bundle.putString("dtsNumber", str2);
            messageObtain.setData(bundle);
            this.f49042c.sendMessage(messageObtain, 5000L);
            return ltnVar;
        }
    }
}
