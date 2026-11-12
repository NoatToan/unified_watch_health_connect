package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.device.api.EventBusApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.api.UserRecoverableException;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hwid.HuaweiIdAdvancedManager;
import com.huawei.hms.support.hwid.bean.SignInByQrReq;
import com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.info.PsiUploadResponseInfo;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.hwversionmgr.utils.callback.PsiUploadResultCallback;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lvj extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f40897c;
    private static lvb f;
    private static lvj h;
    private int g;
    private HandlerThread i;
    private b j;
    private int k;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final OnFailureListener f40896b = new OnFailureListener() { // from class: lvj.3
        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            if (exc == null) {
                LogUtil.j("HwWearableManager", "onFailure: exception is null");
            } else {
                c(exc);
            }
        }

        private void c(Exception exc) {
            if (exc instanceof ResolvableApiException) {
                ReleaseLogUtil.e("R_HwWearableManager", "ResolvableApiException");
                lvj.d("1");
                lvj.a(CommonCode.ErrorCode.HMS_VERSION_CONFIGER_INVALID);
            } else if (exc instanceof UserRecoverableException) {
                a(exc);
            } else {
                d(exc);
            }
        }

        private void a(Exception exc) {
            if (exc instanceof UserRecoverableException) {
                Activity activity = BaseApplication.getActivity();
                Intent intent = ((UserRecoverableException) exc).getIntent();
                lvj.d("-1");
                if (activity == null || intent == null) {
                    lvj.a(300001);
                    lvj.d("1");
                    ReleaseLogUtil.e("R_HwWearableManager", "signInByQrCode: currentActivity or intent is null");
                    return;
                }
                activity.startActivityForResult(intent, 3001);
            }
        }

        private void d(Exception exc) {
            if (exc instanceof ApiException) {
                int statusCode = ((ApiException) exc).getStatusCode();
                ReleaseLogUtil.e("R_HwWearableManager", "onFailure statusCode:", Integer.valueOf(statusCode));
                if (statusCode != 2017 || !lvj.e()) {
                    lvj.e("1");
                    lvj.d("1");
                } else {
                    lvj.c().b(1);
                }
            }
        }
    };
    private static Map<Integer, List<IBaseResponseCallback>> d = new HashMap(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<Integer> f40895a = new ArrayList(Arrays.asList(1));

    static /* synthetic */ int c(lvj lvjVar) {
        int i = lvjVar.k;
        lvjVar.k = i + 1;
        return i;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("HwWearableManager", "onDataReceived, data is null");
            return;
        }
        LogUtil.a("HwWearableManager", "Wearable manager receive data :", eeq.e(bArr));
        if (bArr.length < 2) {
            LogUtil.j("HwWearableManager", "onDataReceived responseData length less than 1");
        } else {
            e(bArr, deviceInfo);
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                Object obj = message.obj;
                DeviceInfo deviceInfo = obj instanceof DeviceInfo ? (DeviceInfo) obj : null;
                lvj lvjVar = lvj.this;
                lvjVar.a(lvjVar.g, deviceInfo);
            }
        }
    }

    private lvj(Context context) {
        super(context);
        this.k = 0;
        this.g = 0;
        lvb lvbVarE = lvb.e();
        f = lvbVarE;
        if (lvbVarE == null) {
            LogUtil.j("HwWearableManager", "HwWearableManager() sHwDeviceConfigManager is null");
        } else {
            lvbVarE.d(26, this);
        }
        HandlerThread handlerThread = new HandlerThread("HwWearableManager");
        this.i = handlerThread;
        handlerThread.start();
        this.j = new b(this.i.getLooper());
    }

    public static lvj c() {
        lvj lvjVar;
        synchronized (e) {
            if (d.isEmpty()) {
                Iterator<Integer> it = f40895a.iterator();
                while (it.hasNext()) {
                    d.put(it.next(), new ArrayList(1));
                }
            }
            if (h == null) {
                h = new lvj(BaseApplication.getContext());
            }
            lvjVar = h;
        }
        return lvjVar;
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwWearableManager", "ENTER sendAccount");
        DeviceCapability deviceCapabilityC = eej.c();
        LogUtil.a("HwWearableManager", "sendAccount ability :", deviceCapabilityC);
        if (deviceCapabilityC == null) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-2, -2);
            }
            LogUtil.j("HwWearableManager", "ability is null, Do not sendAccount");
            return;
        }
        LogUtil.a("HwWearableManager", "sendAccount ability :", deviceCapabilityC);
        if (!deviceCapabilityC.isSupportAccount()) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-2, -2);
            }
            LogUtil.j("HwWearableManager", "bot SupportAccount, Do not sendAccount");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(26);
        deviceCommand.setCommandID(1);
        String strA = eeq.a(str);
        String strD = eeq.d(strA.length() / 2);
        String strD2 = eeq.d(1);
        int length = strD2.length() / 2;
        int length2 = strD.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Math.addExact(Math.addExact(length, length2), strA.length() / 2));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strA));
        d(deviceCommand, byteBufferAllocate, 1, iBaseResponseCallback);
    }

    public void c(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwWearableManager", "enter processDataFromBroadcast");
        e(bArr, deviceInfo);
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        int i = 0;
        int i2 = d(bArr) == 100000 ? 0 : -1;
        LogUtil.a("HwWearableManager", "getResult errorCode :", Integer.valueOf(i2));
        byte b2 = bArr[1];
        Object objValueOf = null;
        if (b2 == 1) {
            String strE = eeq.e(bArr);
            try {
                for (eew eewVar : new eet().b(strE.substring(4, strE.length())).e()) {
                    int i3 = Integer.parseInt(eewVar.e(), 16);
                    if (i3 == 1) {
                        try {
                            objValueOf = eewVar.b();
                            i2 = 0;
                        } catch (eeu unused) {
                            LogUtil.e("HwWearableManager", "COMMAND_ID_GET_DATE error");
                            i2 = i;
                            a(bArr, i2, objValueOf);
                        } catch (NumberFormatException unused2) {
                            LogUtil.e("HwWearableManager", "getHandsetInfo() error NumberFormatException");
                            i2 = i;
                            a(bArr, i2, objValueOf);
                        }
                    } else if (i3 == 127) {
                        objValueOf = Integer.valueOf(Integer.parseInt(eewVar.b(), 16));
                    } else {
                        LogUtil.j("HwWearableManager", "getResult not switch");
                    }
                }
            } catch (eeu unused3) {
                i = i2;
            } catch (NumberFormatException unused4) {
                i = i2;
            }
        } else if (b2 == 3) {
            LogUtil.a("HwWearableManager", "electronic card request");
            d(deviceInfo);
        } else if (b2 == 4) {
            a(bArr, deviceInfo);
        } else if (bArr.length > 2 && b2 == 7) {
            c(bArr);
        } else if (bArr.length > 2 && b2 == 9) {
            d(bArr, deviceInfo);
        } else {
            LogUtil.j("HwWearableManager", "not support commandId");
        }
        a(bArr, i2, objValueOf);
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_HwWearableManager", "handleLoginState received 5.26.9");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwWearableManager", "handleLoginState messageHex is error");
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    if (CommonUtil.v(eewVar.e()) == 1) {
                        String strD = eeq.d(eewVar.b());
                        if (strD == null) {
                            LogUtil.j("HwWearableManager", "hmsLoginSuccess is null");
                            return;
                        }
                        if (strD.equals("0")) {
                            ReleaseLogUtil.d("R_HwWearableManager", "SIGN_ACCOUNT_HMS_LOGIN_STATE_SUCCESS : ");
                            d("0");
                            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ON_HOME_ACTIVITY_FLAG".concat(deviceInfo.getDeviceIdentify()), String.valueOf(false), null);
                            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(deviceInfo.getDeviceIdentify()), "COMPLETE", null);
                            LogUtil.a("HwWearableManager", "setShowSyncAccountSharePreference: false");
                        } else {
                            ReleaseLogUtil.d("R_HwWearableManager", "SIGN_ACCOUNT_HMS_LOGIN_STATE_fail : ");
                            d("1");
                            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(deviceInfo.getDeviceIdentify()), "UNCOMPLETE", null);
                        }
                    }
                }
                return;
            }
            LogUtil.j("HwWearableManager", "handleLoginState tlv is error");
        } catch (eeu unused) {
            LogUtil.e("HwWearableManager", "COMMAND_ID_GET_DATE TlvException");
        }
    }

    private void c(byte[] bArr) {
        ReleaseLogUtil.d("R_HwWearableManager", "handleSignAccount received 5.26.7");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwWearableManager", "handleSignAccount messageHex is error");
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
            if (listE != null && !listE.isEmpty()) {
                String strD = null;
                String strD2 = null;
                for (eew eewVar : listE) {
                    int iV = CommonUtil.v(eewVar.e());
                    if (iV == 2) {
                        strD = eeq.d(eewVar.b());
                        LogUtil.a("HwWearableManager", "accept from health qrCode:", strD);
                    } else if (iV == 3) {
                        strD2 = eeq.d(eewVar.b());
                        LogUtil.a("HwWearableManager", "accept from health qrSiteId:", strD2);
                    } else if (iV == 4) {
                        d("-1");
                        e(strD, strD2, eewVar);
                    } else {
                        LogUtil.j("HwWearableManager", "handleSyncAccount unknown tlv type");
                    }
                }
                return;
            }
            LogUtil.j("HwWearableManager", "handleSyncAccount tlv is error");
        } catch (eeu unused) {
            LogUtil.e("HwWearableManager", "COMMAND_ID_GET_DATE TlvException");
        }
    }

    private void e(String str, String str2, eew eewVar) {
        LogUtil.a("HwWearableManager", "qrSources:", Integer.valueOf(CommonUtil.v(eewVar.b())));
        Activity activity = BaseApplication.getActivity();
        Context context = BaseApplication.getContext();
        int iN = str2 != null ? CommonUtil.n(context, str2) : 0;
        if (!CommonUtil.z(context)) {
            e(str, str2, context, activity);
        } else {
            if (activity == null) {
                LogUtil.j("HwWearableManager", "litesdk: currentActivity is null");
                a(300001);
                d("1");
                return;
            }
            e(str, activity, iN);
        }
    }

    private void e(String str, Activity activity, int i) {
        ReleaseLogUtil.d("R_HwWearableManager", "getLiteSdk");
        ThirdPartyLoginManager.getInstance().qrCodeAuthLogin(activity, str, i, "0", new IBaseResponseCallback() { // from class: lvj.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0) {
                    ReleaseLogUtil.d("R_HwWearableManager", "QrAuthLoginResult isSuccess()");
                    lvj.e("0");
                } else {
                    ReleaseLogUtil.e("R_HwWearableManager", "QrAuthLoginResult fail:", Integer.valueOf(i2));
                    lvj.e("1");
                    lvj.d("1");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        ((EventBusApi) Services.b("PluginDevice", EventBusApi.class)).publishHmsLoginState(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwWearableManager", "sendLoginStateHms deviceCapability is null");
        } else if (!deviceCapabilityC.isSupportAccountSwitch()) {
            LogUtil.j("HwWearableManager", "sendLoginStateHms is not support");
        } else {
            c(str);
        }
    }

    private void e(String str, String str2, Context context, Activity activity) {
        HuaweiIdAdvancedService service;
        ReleaseLogUtil.d("R_HwWearableManager", "getHmsSdk");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("HwWearableManager", "qrCode or qrSiteId is error");
            return;
        }
        if (activity == null) {
            LogUtil.j("HwWearableManager", "handleSignAccount: currentActivity is null");
            service = HuaweiIdAdvancedManager.getService(context);
        } else {
            service = HuaweiIdAdvancedManager.getService(activity);
        }
        SignInByQrReq signInByQrReq = new SignInByQrReq();
        signInByQrReq.setQrCode(str);
        signInByQrReq.setQrSiteId(str2);
        service.signInByQrCode(signInByQrReq).addOnSuccessListener(new OnSuccessListener<Void>() { // from class: lvj.5
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r2) {
                ReleaseLogUtil.d("R_HwWearableManager", "getHmsSdk addOnSuccessListener onSuccess");
                lvj.e("0");
            }
        }).addOnFailureListener(f40896b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e() {
        if (f40897c < 3) {
            SharedPreferenceManager.c(String.valueOf(26), "accountSyncPrefix2017", System.currentTimeMillis());
            f40897c++;
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            long jD = SharedPreferenceManager.d(String.valueOf(26), "accountSyncPrefix2017", 0L);
            LogUtil.a("HwWearableManager", "checkIsValidStatusCode curTime = ", Long.valueOf(jCurrentTimeMillis), ", lastTime = ");
            if (jCurrentTimeMillis - jD < 60000) {
                return false;
            }
            f40897c = 0;
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("R_HwWearableManager", "checkIsValidStatusCode NumberFormatException");
        }
        return true;
    }

    private void a(byte[] bArr, final DeviceInfo deviceInfo) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwWearableManager", "confirmElectronicCard messageHex is valid data");
            return;
        }
        try {
            for (eew eewVar : new eet().b(strE.substring(4, strE.length())).e()) {
                if (Integer.parseInt(eewVar.e(), 16) != 127) {
                    LogUtil.j("HwWearableManager", "confirmElectronicCard getResult not switch");
                } else {
                    int i = Integer.parseInt(eewVar.b(), 16);
                    if (i == 100000) {
                        LogUtil.a("HwWearableManager", "electronic card response");
                        b(deviceInfo);
                        this.k = 0;
                        return;
                    } else if (this.k < 3 && i == 100009) {
                        this.j.postDelayed(new Runnable() { // from class: lvj.4
                            @Override // java.lang.Runnable
                            public void run() {
                                Message messageObtainMessage = lvj.this.j.obtainMessage();
                                messageObtainMessage.what = 1;
                                messageObtainMessage.obj = deviceInfo;
                                lvj.this.j.handleMessage(messageObtainMessage);
                                lvj.c(lvj.this);
                            }
                        }, 10000L);
                    }
                }
            }
        } catch (eeu unused) {
            LogUtil.e("HwWearableManager", "COMMAND_ID_GET_DATE error TlvException");
        } catch (NumberFormatException unused2) {
            LogUtil.e("HwWearableManager", "confirmElectronicCard NumberFormatException exception");
        }
    }

    private void b(DeviceInfo deviceInfo) {
        if (this.g == 1) {
            if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getUuid())) {
                LogUtil.j("HwWearableManager", "deleteUuid DeviceInfo is null or uuid is empty");
                return;
            }
            LogUtil.a("HwWearableManager", "delete electronic card:", Integer.valueOf(SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(26), "electronicPrefix" + nio.c(deviceInfo.getUuid()))));
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwWearableManager", "DeviceInfo is null");
            return;
        }
        nvd.a(deviceInfo.getDeviceIdentify(), "recElectronic", "true");
        String uuid = deviceInfo.getUuid();
        if (TextUtils.isEmpty(uuid)) {
            LogUtil.j("HwWearableManager", "save result uuid is empty");
            return;
        }
        int iE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(26), "electronicPrefix" + nio.c(uuid), uuid, new StorageParams(1));
        LogUtil.a("HwWearableManager", "save result :", Integer.valueOf(iE));
        nvd.a(deviceInfo.getDeviceIdentify(), "saveElectronic", iE != 0 ? "false" : "true");
        if (iE == 0) {
            a(deviceInfo);
        }
        if (nvd.f(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("HwWearableManager", "saveElectronicCardStatus is same day to upload electronic card");
            return;
        }
        DeviceInfo deviceInfoB = mgg.b(deviceInfo.getDeviceIdentify(), "HwWearableManager");
        if (deviceInfoB == null) {
            LogUtil.j("HwWearableManager", "saveElectronicCardStatus deviceInfo is null");
            return;
        }
        nvd.c(System.currentTimeMillis(), deviceInfo.getDeviceIdentify(), BaseApplication.getContext());
        e(deviceInfoB);
        if (HwVersionManager.b(BaseApplication.getContext()).c(deviceInfoB)) {
            return;
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HwUpdateService.class);
        intent.setAction("action_band_check_new_version_to_activate");
        intent.putExtra("extra_band_type", deviceInfoB.getProductType());
        intent.putExtra("extra_band_version", deviceInfoB.getSoftVersion());
        intent.putExtra("extra_band_imei", deviceInfoB.getDeviceIdentify());
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException unused) {
            LogUtil.e("saveElectronicCardStatus IllegalStateException", new Object[0]);
        }
    }

    public void e(final DeviceInfo deviceInfo) {
        max.c().e(deviceInfo);
        if (HwVersionManager.b(BaseApplication.getContext()).c(deviceInfo)) {
            if (!HwVersionManager.b(BaseApplication.getContext()).h()) {
                LogUtil.j("HwWearableManager", "requestPsiUpload isElectronicCard is false");
                nvd.c(deviceInfo.getDeviceIdentify(), "2", (Boolean) false);
            } else {
                nvh.e().b(deviceInfo, true, new PsiUploadResultCallback() { // from class: lvj.2
                    @Override // com.huawei.hwversionmgr.utils.callback.PsiUploadResultCallback
                    public void onSuccess(PsiUploadResponseInfo psiUploadResponseInfo) {
                        if (lsk.a(psiUploadResponseInfo.getResultCode(), 10) == 0) {
                            max.c().d(deviceInfo.getDeviceIdentify(), true, false);
                            lvj.this.c(deviceInfo, true);
                        } else {
                            max.c().d(deviceInfo.getDeviceIdentify(), false, false);
                            lvj.this.c(deviceInfo, false);
                        }
                    }

                    @Override // com.huawei.hwversionmgr.utils.callback.PsiUploadResultCallback
                    public void onFailure(Throwable th) {
                        max.c().d(deviceInfo.getDeviceIdentify(), false, false);
                        lvj.this.c(deviceInfo, false);
                    }
                });
            }
        }
    }

    private void a(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(26);
        deviceCommand.setCommandID(3);
        byte[] bArrE = e(100000);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        f.c(deviceCommand);
    }

    private byte[] e(int i) {
        return new cqj().j(127, i).e();
    }

    public void c(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            LogUtil.j("HwWearableManager", "electronic card deviceInfo is null");
            HwVersionManager.b(BaseApplication.getContext()).e(false);
            return;
        }
        nvd.a(deviceInfo.getDeviceIdentify(), "upLoadServer", String.valueOf(z));
        if (HwVersionManager.b(BaseApplication.getContext()).c(deviceInfo)) {
            nvd.c(deviceInfo.getDeviceIdentify(), "3", Boolean.valueOf(z));
        } else {
            nvd.c(deviceInfo.getDeviceIdentify(), "1", Boolean.valueOf(z));
        }
        if (!HwVersionManager.b(BaseApplication.getContext()).h()) {
            LogUtil.j("HwWearableManager", "electronic card is false not electronic card");
            HwVersionManager.b(BaseApplication.getContext()).e(false);
            return;
        }
        if (TextUtils.isEmpty(deviceInfo.getUuid())) {
            LogUtil.j("HwWearableManager", "electronic card DeviceInfo is null or uuid is empty");
            HwVersionManager.b(BaseApplication.getContext()).e(false);
            return;
        }
        if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(26), "electronicPrefix" + nio.c(deviceInfo.getUuid())))) {
            LogUtil.j("HwWearableManager", "electronic card isEmpty is not electronic card");
            HwVersionManager.b(BaseApplication.getContext()).e(false);
        } else {
            LogUtil.j("HwWearableManager", "setElectronicCardResult: ", Boolean.valueOf(z));
            d(z, deviceInfo);
        }
    }

    private void d(boolean z, DeviceInfo deviceInfo) {
        HwVersionManager.b(BaseApplication.getContext()).e(false);
        if (z) {
            a(1, deviceInfo);
        } else {
            a(0, deviceInfo);
        }
    }

    public void a(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwWearableManager", "enter notifyDevice value :", Integer.valueOf(i));
        this.g = i;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(26);
        deviceCommand.setCommandID(4);
        StringBuilder sb = new StringBuilder(16);
        String strD = eeq.d(i);
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB);
        sb.append(strD);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        LogUtil.a("HwWearableManager", "electronic card notifyDevice");
        LogUtil.a("HwWearableManager", "sendCommand() electronic card retryTimes:", Integer.valueOf(this.k));
        f.c(deviceCommand);
    }

    public void b(int i) {
        ReleaseLogUtil.d("R_HwWearableManager", "sendSyncAccountData value 5.26.7 = ", Integer.valueOf(i));
        String strConcat = eeq.d(1).concat(eeq.d(1)).concat(eeq.d(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(26);
        deviceCommand.setCommandID(7);
        deviceCommand.setDataContent(eeq.c(strConcat));
        deviceCommand.setDataLen(eeq.c(strConcat).length);
        LogUtil.a("HwWearableManager", "sendSyncAccountData() : valueString", strConcat);
        f.c(deviceCommand);
    }

    private void a(byte[] bArr, int i, Object obj) {
        synchronized (h()) {
            List<IBaseResponseCallback> list = d.get(Integer.valueOf(bArr[1]));
            if (list != null) {
                if (obj != null && list.size() != 0) {
                    list.get(0).a(i, obj);
                    list.remove(0);
                } else if (list.size() != 0) {
                    list.get(0).a(100001, "UNKNOWN_ERROR");
                    list.remove(0);
                } else {
                    LogUtil.j("HwWearableManager", "getResult, removeList, callbackList.size() is 0");
                }
            } else {
                LogUtil.j("HwWearableManager", "getResult, removeList, callbackList is null");
            }
        }
    }

    private int d(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 8) {
            LogUtil.j("HwWearableManager", "getInt messageHex is valid data");
            return 0;
        }
        try {
            return Integer.parseInt(strE.substring(8, strE.length()), 16);
        } catch (NumberFormatException unused) {
            LogUtil.e("HwWearableManager", "getInt NumberFormatException");
            return 0;
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 26;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        f.c(26);
        synchronized (h()) {
            for (Integer num : f40895a) {
                num.intValue();
                if (d.get(num) != null) {
                    d.get(num).clear();
                }
            }
        }
        d();
        a();
        LogUtil.a("HwWearableManager", "onDestroy() complete");
    }

    private static void a() {
        synchronized (e) {
            h = null;
        }
    }

    private void d() {
        synchronized (e) {
            HandlerThread handlerThread = this.i;
            if (handlerThread != null) {
                handlerThread.quit();
                this.i = null;
            }
        }
    }

    private static Map<Integer, List<IBaseResponseCallback>> h() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (lvj.class) {
            map = d;
        }
        return map;
    }

    private void d(DeviceCommand deviceCommand, ByteBuffer byteBuffer, int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (h()) {
            try {
                if (iBaseResponseCallback != null) {
                    List<IBaseResponseCallback> list = d.get(Integer.valueOf(i));
                    if (list != null) {
                        list.add(iBaseResponseCallback);
                    } else {
                        LogUtil.j("HwWearableManager", "addToList, callbacks is null");
                    }
                } else {
                    LogUtil.j("HwWearableManager", "addToList, callback is null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        f.c(deviceCommand);
    }

    private static void d(int i) {
        ReleaseLogUtil.d("R_HwWearableManager", "Enter sendSyncAccountHmsError value 5.26.8 = ", Integer.valueOf(i));
        String strD = eeq.d(i);
        String strConcat = eeq.d(1).concat(eeq.d(strD.length() / 2)).concat(strD);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(26);
        deviceCommand.setCommandID(8);
        deviceCommand.setDataContent(eeq.c(strConcat));
        deviceCommand.setDataLen(eeq.c(strConcat).length);
        LogUtil.a("HwWearableManager", "sendSyncAccountHmsError() : 26.8", strConcat);
        f.c(deviceCommand);
    }

    public static void c(String str) {
        ReleaseLogUtil.d("R_HwWearableManager", "Enter sendSyncAccountHmsLogin value 5.26.9 = ", str);
        String strA = eeq.a(str);
        String strConcat = eeq.d(1).concat(eeq.d(strA.length() / 2)).concat(strA);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(26);
        deviceCommand.setCommandID(9);
        deviceCommand.setDataContent(eeq.c(strConcat));
        deviceCommand.setDataLen(eeq.c(strConcat).length);
        LogUtil.a("HwWearableManager", "sendSyncAccountHmsLogin() : 26.9", strConcat);
        f.c(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(int i) {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwWearableManager", "sendHmsLow deviceCapability is null");
        } else if (!deviceCapabilityC.isSupportAccountSwitch()) {
            LogUtil.j("HwWearableManager", "sendHmsLow is not support");
        } else {
            d(i);
        }
    }
}
