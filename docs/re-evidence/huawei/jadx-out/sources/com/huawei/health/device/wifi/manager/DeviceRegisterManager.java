package com.huawei.health.device.wifi.manager;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.health.device.wifi.entity.model.Entity;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.WifiDataCloudFactory;
import com.huawei.hwcloudmodel.model.unite.RegisterInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceRegisterVerifyCodeInfoRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import defpackage.dyg;
import defpackage.ebg;
import defpackage.ebl;
import defpackage.ebq;
import defpackage.ebr;
import defpackage.ebs;
import defpackage.ebv;
import defpackage.eby;
import defpackage.ebz;
import defpackage.ecg;
import defpackage.ecj;
import defpackage.lqo;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceRegisterManager {
    private static final Object d = new Object();
    private static DeviceRegisterManager e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6461a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseCallbackInterface f6463c;
    private ebv h;
    private int i;
    private String j;
    private Handler m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6462b = 0;
    private RegisterMode o = RegisterMode.REGISTER_NORFORM;
    private CountDownTimer n = new CountDownTimer(90000, 2000) { // from class: com.huawei.health.device.wifi.manager.DeviceRegisterManager.2
        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            dyg.e(false, "DeviceRegisterManager", "mRegisterWaitTimer: register timeout");
            DeviceRegisterManager.this.f.sendEmptyMessage(9);
        }
    };
    private b f = new b(this);
    private RegisterDeviceCallback g = new e();

    public interface RegisterDeviceCallback {
        void onCreateSessionSuccess(ebz ebzVar);

        void onFailure(int i, String... strArr);

        void onGetVerifyCodeSuccess(RegisterInfo registerInfo);

        void onRegisterDeviceSuccess(Object obj);

        void onWriteVerifyCodeSuccess(ebl eblVar, String str, String str2);
    }

    public enum RegisterMode {
        REGISTER_SOFTAP,
        REGISTER_NORFORM,
        REGISTER_BLE
    }

    static /* synthetic */ int f(DeviceRegisterManager deviceRegisterManager) {
        int i = deviceRegisterManager.f6462b;
        deviceRegisterManager.f6462b = i + 1;
        return i;
    }

    private DeviceRegisterManager(Context context) {
        this.m = null;
        this.f6461a = context;
        HandlerThread handlerThread = new HandlerThread("DeviceRegisterManager");
        handlerThread.start();
        this.m = new c(handlerThread.getLooper());
    }

    static class c extends Handler {
        c(Looper looper) {
            super(looper);
        }
    }

    public static DeviceRegisterManager e(Context context) {
        DeviceRegisterManager deviceRegisterManager;
        synchronized (d) {
            if (e == null) {
                e = new DeviceRegisterManager(context);
            }
            deviceRegisterManager = e;
        }
        return deviceRegisterManager;
    }

    static class b extends StaticHandler<DeviceRegisterManager> {
        b(DeviceRegisterManager deviceRegisterManager) {
            super(deviceRegisterManager);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessage(DeviceRegisterManager deviceRegisterManager, Message message) {
            if (deviceRegisterManager == null || message == null) {
                dyg.d(false, "DeviceRegisterManager", "RegisterHandler object or msg is null");
                return;
            }
            dyg.a(false, "DeviceRegisterManager", "RegisterHandler msg is ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                deviceRegisterManager.f.removeCallbacksAndMessages(null);
                if (deviceRegisterManager.n != null) {
                    deviceRegisterManager.n.cancel();
                }
                if (deviceRegisterManager.g != null) {
                    deviceRegisterManager.g.onRegisterDeviceSuccess(message.obj);
                    return;
                }
                return;
            }
            if (i == 9) {
                deviceRegisterManager.f.removeCallbacksAndMessages(null);
                if (deviceRegisterManager.n != null) {
                    deviceRegisterManager.n.cancel();
                }
                if (deviceRegisterManager.g != null) {
                    deviceRegisterManager.g.onFailure(3101, new String[0]);
                    return;
                }
                return;
            }
            if (i != 1002) {
                if (i == 1003) {
                    deviceRegisterManager.a(message.arg1);
                    return;
                } else {
                    dyg.e(false, "DeviceRegisterManager", "RegisterHandler unKnow msg");
                    return;
                }
            }
            if (deviceRegisterManager.f6462b > 4) {
                deviceRegisterManager.e();
                deviceRegisterManager.f6462b = 0;
            }
            DeviceRegisterManager.f(deviceRegisterManager);
            if (deviceRegisterManager.f != null) {
                deviceRegisterManager.f.sendEmptyMessageDelayed(1002, 1000L);
            }
        }
    }

    public void b() {
        dyg.a(false, "DeviceRegisterManager", "onDestroy");
        c();
        b bVar = this.f;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
        }
        synchronized (d) {
            if (this.f6463c != null) {
                this.f6463c = null;
            }
        }
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    class e implements RegisterDeviceCallback {
        private e() {
        }

        @Override // com.huawei.health.device.wifi.manager.DeviceRegisterManager.RegisterDeviceCallback
        public void onGetVerifyCodeSuccess(RegisterInfo registerInfo) {
            if (registerInfo == null) {
                return;
            }
            if (DeviceRegisterManager.this.o != RegisterMode.REGISTER_SOFTAP) {
                if (DeviceRegisterManager.this.o == RegisterMode.REGISTER_BLE) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("device_register_verifycode", registerInfo);
                    if (TextUtils.isEmpty(DeviceRegisterManager.this.h.e())) {
                        DeviceRegisterManager.this.h.c(registerInfo.getDevId());
                    }
                    synchronized (DeviceRegisterManager.d) {
                        if (DeviceRegisterManager.this.f6463c != null) {
                            DeviceRegisterManager.this.f6463c.onSuccess(bundle);
                        }
                    }
                    LogUtil.a("DeviceRegisterManager", "begin to query device info: ", registerInfo.getDevId());
                    DeviceRegisterManager.this.f.sendEmptyMessageDelayed(1002, 1000L);
                    DeviceRegisterManager.this.f6462b = 4;
                    return;
                }
                String devId = registerInfo.getDevId();
                dyg.a(true, "DeviceRegisterManager", "register DeviceID = ", dyg.d(devId));
                if (TextUtils.isEmpty(DeviceRegisterManager.this.h.e())) {
                    DeviceRegisterManager.this.h.c(devId);
                }
                dyg.e(false, "DeviceRegisterManager", "deviceType ", DeviceRegisterManager.this.h.h());
                String psk = registerInfo.getPsk();
                String verifyCode = registerInfo.getVerifyCode();
                ebz ebzVar = new ebz();
                ebzVar.d(devId);
                ebzVar.e(psk);
                ebzVar.i(verifyCode);
                DeviceRegisterManager.this.d(ebzVar, 3, false);
                dyg.e(false, "DeviceRegisterManager", "begin Shake hands");
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("device_register_verifycode", registerInfo);
            synchronized (DeviceRegisterManager.d) {
                if (DeviceRegisterManager.this.f6463c != null) {
                    DeviceRegisterManager.this.f6463c.onSuccess(bundle2);
                }
            }
            dyg.a(false, "DeviceRegisterManager", "get verifyCode success softAP");
        }

        @Override // com.huawei.health.device.wifi.manager.DeviceRegisterManager.RegisterDeviceCallback
        public void onCreateSessionSuccess(ebz ebzVar) {
            dyg.a(false, "DeviceRegisterManager", "Shake hands success and start send verifyCode");
            if (ebzVar == null) {
                dyg.d(false, "DeviceRegisterManager", "VerifyCode is null");
                return;
            }
            String strE = ebzVar.e();
            if (TextUtils.isEmpty(DeviceRegisterManager.this.h.e())) {
                DeviceRegisterManager.this.h.c(strE);
            }
            dyg.e(true, "DeviceRegisterManager", "VerifyCode2CoapSessionInfo: ", ebzVar.toString());
            DeviceRegisterManager.this.d(ebzVar, 3);
        }

        @Override // com.huawei.health.device.wifi.manager.DeviceRegisterManager.RegisterDeviceCallback
        public void onWriteVerifyCodeSuccess(ebl eblVar, String str, String str2) {
            dyg.a(false, "DeviceRegisterManager", "onWriteVerifyCodeSuccess send verifyCode success and wait register for device");
            DeviceRegisterManager.this.f.sendEmptyMessageDelayed(1002, 1000L);
            DeviceRegisterManager.this.f6462b = 4;
        }

        @Override // com.huawei.health.device.wifi.manager.DeviceRegisterManager.RegisterDeviceCallback
        public void onRegisterDeviceSuccess(Object obj) {
            dyg.a(false, "DeviceRegisterManager", "onRegisterDeviceSuccess device register success");
            DeviceRegisterManager.this.c(obj);
        }

        @Override // com.huawei.health.device.wifi.manager.DeviceRegisterManager.RegisterDeviceCallback
        public void onFailure(int i, String... strArr) {
            dyg.a(false, "DeviceRegisterManager", "onFailure device register fail errCode: ", Integer.valueOf(i), " msg: ", strArr);
            DeviceRegisterManager.this.e(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        synchronized (d) {
            BaseCallbackInterface baseCallbackInterface = this.f6463c;
            if (baseCallbackInterface != null) {
                baseCallbackInterface.onSuccess(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        synchronized (d) {
            BaseCallbackInterface baseCallbackInterface = this.f6463c;
            if (baseCallbackInterface != null) {
                baseCallbackInterface.onFailure(i);
            }
        }
    }

    public void c() {
        this.f6462b = 0;
    }

    public void e(ebv ebvVar, RegisterMode registerMode, BaseCallbackInterface baseCallbackInterface) {
        if (ebvVar == null || registerMode == null || baseCallbackInterface == null) {
            return;
        }
        this.o = registerMode;
        synchronized (d) {
            this.f6463c = baseCallbackInterface;
        }
        this.h = ebvVar;
        if (registerMode == RegisterMode.REGISTER_NORFORM || registerMode == RegisterMode.REGISTER_BLE) {
            CountDownTimer countDownTimer = this.n;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.n.start();
            }
            c();
        }
        if (!TextUtils.isEmpty(this.h.e())) {
            dyg.a(false, "DeviceRegisterManager", "registerDevice: deviceId: ", CommonUtil.n(this.h.e()));
            this.f.sendEmptyMessageDelayed(1002, 1000L);
            this.f6462b = 4;
            return;
        }
        a(3);
    }

    class a implements ICloudOperationResult<WifiDeviceRegisterVerifyCodeInfoRsp> {
        private int d;

        a(int i) {
            this.d = i;
        }

        @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void operationResult(WifiDeviceRegisterVerifyCodeInfoRsp wifiDeviceRegisterVerifyCodeInfoRsp, String str, boolean z) {
            int iIntValue;
            String resultDesc;
            if (z) {
                dyg.e(false, "DeviceRegisterManager", "registerDeviceGetVerifyCode: getVerifyCode succeed");
                if (wifiDeviceRegisterVerifyCodeInfoRsp != null) {
                    if (DeviceRegisterManager.this.g != null) {
                        DeviceRegisterManager.this.g.onGetVerifyCodeSuccess(wifiDeviceRegisterVerifyCodeInfoRsp.getRegisterInfo());
                        return;
                    }
                    return;
                }
                dyg.d(false, "DeviceRegisterManager", "registerDeviceGetVerifyCode: getVerifyCode succeed, but rsp is null");
                return;
            }
            dyg.d(false, "DeviceRegisterManager", "registerDeviceGetVerifyCode: getVerifyCode failed");
            if (wifiDeviceRegisterVerifyCodeInfoRsp == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = wifiDeviceRegisterVerifyCodeInfoRsp.getResultCode().intValue();
                resultDesc = wifiDeviceRegisterVerifyCodeInfoRsp.getResultDesc();
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_SCALE_NETWORK_85070012.value(), iIntValue);
            }
            dyg.e(false, "DeviceRegisterManager", "registerDeviceGetVerifyCode: getVerifyCode failed errCode: ", Integer.valueOf(iIntValue), " resultDesc: ", resultDesc);
            int i = this.d - 1;
            if (i <= 0 || DeviceRegisterManager.this.g == null) {
                if (DeviceRegisterManager.this.g != null) {
                    dyg.c(false, "DeviceRegisterManager", "get verifyCode fail");
                    DeviceRegisterManager.this.g.onFailure(IEventListener.EVENT_ID_HISIGHT_STATE_SERVER_READY, new String[0]);
                    return;
                }
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1003;
            messageObtain.arg1 = i;
            DeviceRegisterManager.this.f.sendMessageDelayed(messageObtain, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        dyg.a(false, "DeviceRegisterManager", "registerDeviceGetVerifyCode max is ", Integer.valueOf(i));
        a(new a(i));
    }

    private void a(final ICloudOperationResult<WifiDeviceRegisterVerifyCodeInfoRsp> iCloudOperationResult) {
        LogUtil.a("DeviceRegisterManager", "Enter getVerifyCode");
        final WifiDataCloudFactory wifiDataCloudFactory = new WifiDataCloudFactory(BaseApplication.getContext());
        Map<String, Object> body = wifiDataCloudFactory.getBody(null);
        body.put("unique", true);
        final String strC = ofe.c(body);
        this.m.post(new Runnable() { // from class: com.huawei.health.device.wifi.manager.DeviceRegisterManager.1
            @Override // java.lang.Runnable
            public void run() {
                WifiDeviceRegisterVerifyCodeInfoRsp wifiDeviceRegisterVerifyCodeInfoRsp = (WifiDeviceRegisterVerifyCodeInfoRsp) oet.d().e(wifiDataCloudFactory.getRequestUrl("/deviceAgent/deviceRegister"), wifiDataCloudFactory.getHeaders(), strC, WifiDeviceRegisterVerifyCodeInfoRsp.class);
                if (wifiDeviceRegisterVerifyCodeInfoRsp == null) {
                    LogUtil.j("DeviceRegisterManager", "getVerifyCode response is null");
                    iCloudOperationResult.operationResult(null, null, false);
                    return;
                }
                LogUtil.a("DeviceRegisterManager", "getVerifyCode ResultCode is ", wifiDeviceRegisterVerifyCodeInfoRsp.getResultCode());
                if (wifiDeviceRegisterVerifyCodeInfoRsp.getResultCode().intValue() == 0) {
                    iCloudOperationResult.operationResult(wifiDeviceRegisterVerifyCodeInfoRsp, null, true);
                } else {
                    iCloudOperationResult.operationResult(wifiDeviceRegisterVerifyCodeInfoRsp, null, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ebz ebzVar, int i) {
        dyg.a(false, "DeviceRegisterManager", "Write a verification code to the device to complete the registration ,registerDeviceWriteVerifyCode: retry " + i);
        String host = "";
        if ("coap".equals(this.h.h()) || "wifiap".equals(this.h.h())) {
            String strC = this.h.c();
            if (strC != null) {
                dyg.a(true, "DeviceRegisterManager", "registerDeviceWriteVerifyCode: uri is ", dyg.b(strC));
                if (!strC.startsWith("coap://") && !strC.startsWith("coaps://")) {
                    strC = "coap://" + strC;
                }
                try {
                    host = new URI(strC).getHost();
                    dyg.a(true, "DeviceRegisterManager", "registerDeviceWriteVerifyCode: ip is ", dyg.b(host));
                } catch (URISyntaxException e2) {
                    dyg.a(false, "DeviceRegisterManager", "registerDeviceWriteVerifyCode: ", e2.getMessage());
                }
            }
        } else {
            dyg.c(false, "DeviceRegisterManager", "registerDeviceWriteVerifyCode Unknown device source type:" + this.h.h());
        }
        a(ebzVar, i, host);
    }

    private void a(ebz ebzVar, int i, String str) {
        ebg ebgVar = new ebg();
        ebr ebrVar = new ebr();
        dyg.e(false, "DeviceRegisterManager", "registerDeviceWriteVerifyCode coapApi: ", ebgVar);
        ebrVar.b(ebzVar.g());
        ebrVar.a(ebzVar.e());
        ebrVar.d(ebzVar.b());
        ebrVar.c(GRSManager.c(this.f6461a).getUrl("healthAPPToDeviceUrl"));
        dyg.e(false, "DeviceRegisterManager", "registerDeviceWriteVerifyCode to device url ", ebrVar.b());
        Integer numC = ebzVar.c();
        int iIntValue = numC.intValue();
        String strI = ebzVar.i();
        String strH = ebzVar.h();
        String strF = ebzVar.f();
        Long lJ = ebzVar.j();
        Integer numD = ebzVar.d();
        int iA = ebzVar.a();
        dyg.e(false, "DeviceRegisterManager", "registerDeviceWriteVerifyCode modeResp: ", numC);
        j jVar = new j(i, ebzVar);
        if (iIntValue == 2 || iIntValue == 3) {
            dyg.a(false, "DeviceRegisterManager", "rich device send verifyCode");
            ebgVar.b(str, ebrVar, strI, strH);
            ebgVar.a(numD, jVar);
        } else {
            if (iIntValue == 1) {
                dyg.a(false, "DeviceRegisterManager", "thin device send verifyCode");
                ebgVar.b(ebrVar, strF, lJ, iA);
                ebgVar.c(str, strI, strH, jVar);
                return;
            }
            dyg.d(false, "DeviceRegisterManager", "registerDeviceWriteVerifyCode error modeResp");
        }
    }

    class j implements Entity.EntityResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ebz f6471b;
        private int d;

        j(int i, ebz ebzVar) {
            this.d = i;
            this.f6471b = ebzVar;
        }

        @Override // com.huawei.health.device.wifi.entity.model.Entity.EntityResponseCallback
        public void onResponse(ebl eblVar) {
            dyg.a(false, "DeviceRegisterManager", "WriteVerifyCodeCallBack: onResponse");
            if (eblVar != null) {
                if (eblVar.a() == 0) {
                    dyg.a(false, "DeviceRegisterManager", "WriteVerifyCodeCallBack: success write");
                    if (DeviceRegisterManager.this.g != null) {
                        DeviceRegisterManager.this.g.onWriteVerifyCodeSuccess(eblVar, this.f6471b.i(), this.f6471b.h());
                        return;
                    }
                    return;
                }
                dyg.d(false, "DeviceRegisterManager", "WriteVerifyCodeCallBack errorCode: ", Integer.valueOf(eblVar.a()));
            } else {
                dyg.d(false, "DeviceRegisterManager", "WriteVerifyCodeCallBack: response is null");
            }
            int i = this.d - 1;
            if (i <= 0 || DeviceRegisterManager.this.g == null) {
                if (DeviceRegisterManager.this.g != null) {
                    dyg.d(false, "DeviceRegisterManager", "WriteVerifyCodeCallBack Write verify code fail");
                    DeviceRegisterManager.this.g.onWriteVerifyCodeSuccess(eblVar, this.f6471b.i(), this.f6471b.h());
                    return;
                }
                return;
            }
            DeviceRegisterManager.this.d(this.f6471b, i);
        }
    }

    class d implements Entity.EntityResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ebz f6469c;
        private int e;

        d(ebz ebzVar, int i) {
            this.f6469c = ebzVar;
            this.e = i;
        }

        @Override // com.huawei.health.device.wifi.entity.model.Entity.EntityResponseCallback
        public void onResponse(ebl eblVar) {
            if (eblVar != null && (eblVar instanceof ebs)) {
                ebs ebsVar = (ebs) eblVar;
                dyg.e(true, "DeviceRegisterManager", "createSessionInterface: response not null, errCode is ", ebsVar.e());
                Integer numE = ebsVar.e();
                if (numE == null || numE.intValue() != 0) {
                    if (numE != null) {
                        dyg.d(false, "DeviceRegisterManager", "createSessionInterface: fail errcode: ", numE);
                        return;
                    }
                    return;
                }
                dyg.e(false, "DeviceRegisterManager", "createSessionInterface: success");
                String strI = ebsVar.i();
                String strH = ebsVar.h();
                Long lB = ebsVar.b();
                Integer numC = ebsVar.c();
                numC.intValue();
                dyg.e(true, "DeviceRegisterManager", "registerDeviceCreateSession: snDeviceRandom is ", strI, "; getSessId: ", strH, "; ", "seq: ", lB, ",modeRseq: ", numC);
                this.f6469c.b(strI);
                this.f6469c.a(strH);
                this.f6469c.c(lB);
                this.f6469c.b(numC);
                this.f6469c.c(ebsVar.d());
                if (DeviceRegisterManager.this.g != null) {
                    DeviceRegisterManager.this.g.onCreateSessionSuccess(this.f6469c);
                    return;
                }
                return;
            }
            int i = this.e - 1;
            if (i > 0) {
                DeviceRegisterManager.this.d(this.f6469c, i, true);
            } else if (DeviceRegisterManager.this.g != null) {
                dyg.d(false, "DeviceRegisterManager", "Failed to create session");
                DeviceRegisterManager.this.g.onFailure(IEventListener.EVENT_ID_HISIGHT_STATE_PAUSED, new String[0]);
            }
            dyg.d(false, "DeviceRegisterManager", "registerDeviceCreateSession: create session fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ebz ebzVar, int i, boolean z) {
        dyg.a(false, "DeviceRegisterManager", "registerDeviceCreateSession: max ", Integer.valueOf(i), " isRetry ", Boolean.valueOf(z));
        if (!z) {
            String strB = ecj.b(ecg.e());
            int iNextInt = new SecureRandom().nextInt(32767);
            this.j = strB;
            this.i = iNextInt;
            ebzVar.c(strB);
            ebzVar.b(iNextInt);
        } else {
            ebzVar.c(this.j);
            ebzVar.b(this.i);
        }
        dyg.a(true, "DeviceRegisterManager", "registerDeviceCreateSession: mReSnAppRandom is ", dyg.b(this.j));
        String strB2 = b(this.h);
        if (strB2 == null) {
            this.g.onFailure(IEventListener.EVENT_ID_HISIGHT_STATE_PLAYING, new String[0]);
            return;
        }
        dyg.a(true, "DeviceRegisterManager", "registerDeviceCreateSession: ip is ", dyg.b(strB2));
        ebq ebqVar = new ebq();
        ebqVar.e(1);
        ebqVar.b(3);
        ebqVar.a(this.j);
        ebqVar.a(Integer.valueOf(this.i));
        new ebg().e(strB2, ebqVar, new d(ebzVar, i));
    }

    private static String b(ebv ebvVar) {
        String strC;
        String str = "";
        if (("coap".equals(ebvVar.h()) || "wifiap".equals(ebvVar.h())) && (strC = ebvVar.c()) != null) {
            dyg.a(false, "DeviceRegisterManager", "getDeviceIp: uri is ", dyg.b(strC));
            if (!strC.startsWith("coap://") && !strC.startsWith("coaps://")) {
                strC = "coap://" + strC;
            }
            try {
                String host = new URI(strC).getHost();
                try {
                    dyg.a(true, "DeviceRegisterManager", "getDeviceIp: ip is ", dyg.b(host));
                    return host;
                } catch (URISyntaxException e2) {
                    e = e2;
                    str = host;
                    dyg.c(false, "DeviceRegisterManager", "getDeviceIp: ", e.getMessage());
                    return str;
                }
            } catch (URISyntaxException e3) {
                e = e3;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        dyg.a(false, "DeviceRegisterManager", " getAuthDeviceFromCloud() DevId errCode: ", dyg.d(this.h.e()));
        if (TextUtils.isEmpty(this.h.e())) {
            dyg.d(false, "DeviceRegisterManager", "getAuthDeviceFromCloud mAddDeviceInfo device id is null");
            return;
        }
        WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq = new WifiDeviceGetWifiDeviceInfoReq();
        wifiDeviceGetWifiDeviceInfoReq.setDevId(this.h.e());
        lqo.b(this.f6461a).b(wifiDeviceGetWifiDeviceInfoReq, new ICloudOperationResult<WifiDeviceGetWifiDeviceInfoRsp>() { // from class: com.huawei.health.device.wifi.manager.DeviceRegisterManager.5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, String str, boolean z) {
                DeviceRegisterManager.this.b(wifiDeviceGetWifiDeviceInfoRsp, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, boolean z) {
        int iIntValue;
        String resultDesc;
        if (!z) {
            if (wifiDeviceGetWifiDeviceInfoRsp == null) {
                iIntValue = Constants.CODE_UNKNOWN_ERROR;
                resultDesc = "unknown error";
            } else {
                iIntValue = wifiDeviceGetWifiDeviceInfoRsp.getResultCode().intValue();
                resultDesc = wifiDeviceGetWifiDeviceInfoRsp.getResultDesc();
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_SCALE_NETWORK_85070012.value(), iIntValue);
            }
            dyg.e(false, "DeviceRegisterManager", "getAuthDeviceFromCloud() getSingleDevice errCode: ", Integer.valueOf(iIntValue), " resultDesc: ", resultDesc);
            return;
        }
        if (wifiDeviceGetWifiDeviceInfoRsp == null) {
            dyg.a(false, "DeviceRegisterManager", "getAuthDeviceFromCloud reg device success but rsp is null");
            return;
        }
        if (wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo() == null) {
            dyg.d(false, "DeviceRegisterManager", "getAuthDeviceFromCloud reg device success but rsp.getDeviceDetailInfo is null");
            return;
        }
        if (this.f != null) {
            eby ebyVar = new eby();
            Message messageObtain = Message.obtain();
            ebyVar.c(wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo());
            messageObtain.obj = ebyVar;
            messageObtain.what = 1;
            this.f.sendMessage(messageObtain);
        }
    }
}
