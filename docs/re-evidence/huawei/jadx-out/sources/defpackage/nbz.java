package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import java.io.File;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nbz extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static nbz f42863a;
    private static final Object e = new Object();

    private nbz(Context context) {
        super(context);
    }

    public static nbz d() {
        nbz nbzVar;
        synchronized (e) {
            if (f42863a == null) {
                f42863a = new nbz(BaseApplication.getContext());
            }
            nbzVar = f42863a;
        }
        return nbzVar;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("HwNotificationEngineManager", "onReceiveDeviceCommand errorCode:", Integer.valueOf(i));
        if (xiuVar == null) {
            LogUtil.j("HwNotificationEngineManager", "onReceiveDeviceCommand message is null");
            return;
        }
        byte[] bArrB = xiuVar.b();
        if (bArrB == null || bArrB.length == 0) {
            LogUtil.j("HwNotificationEngineManager", "onReceiveDeviceCommand messageData is invalid");
        } else {
            c(bArrB);
        }
    }

    private void c(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("HwNotificationEngineManager", "handleReceiveJsonMessage UnsupportedEncodingException");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwNotificationEngineManager", "handleReceiveJsonMessage requestInfo is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("msgType");
            LogUtil.a("HwNotificationEngineManager", "handleReceiveJsonMessage msgType:", Integer.valueOf(i), " jsonObject:", jSONObject.toString());
            JSONObject jSONObject2 = jSONObject.getJSONObject("msgBody");
            if (jSONObject2 == null) {
                LogUtil.j("HwNotificationEngineManager", "handleReceiveJsonMessage msgBody is null");
            } else if (i == 6001) {
                nby.a().a(jSONObject2);
            } else if (i != 6002) {
                LogUtil.j("HwNotificationEngineManager", "handleReceiveJsonMessage msgType is default");
            } else {
                nby.a().c(jSONObject2);
            }
        } catch (JSONException unused2) {
            LogUtil.e("HwNotificationEngineManager", "handleReceiveJsonMessage JSONException");
        }
    }

    public void c(xiu xiuVar, SendCallback sendCallback) {
        sendComand(xiuVar, sendCallback);
    }

    public void d(String str) throws UnsupportedEncodingException {
        sendComand(new xiu.c().a(str.getBytes("UTF-8")).c(), new SendCallback() { // from class: nbz.2
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("HwNotificationEngineManager", "sendJsonCommand onSendResult: ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a("HwNotificationEngineManager", "sendJsonCommand onFileTransferReport transferWay: ", str2);
            }
        });
    }

    public void c(File file, SendCallback sendCallback) {
        xiu.c cVar = new xiu.c();
        cVar.a(file);
        c(cVar.c(), sendCallback);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.NOTIFICATION_PUSH_APP_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "in.huawei.NotificationAppIcon";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("HwNotificationEngineManager", "onDeviceConnectionChange", connectState);
    }
}
