package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.NotificationManager;
import com.huawei.hwdevice.outofprocess.datatype.DataOtaParametersV2;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwotamanager.IUpgradeStatusCallBack;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class maq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41270a = new Object();
    private static maq d;
    private int g;
    private String h;
    private Context i;
    private HwVersionManager l;
    private long m;
    private long r;
    private String v;
    private int j = 0;
    private Handler w = null;
    private HandlerThread n = null;
    private boolean o = false;
    private boolean k = false;
    private IOTAResultAIDLCallback.Stub s = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOTAResultAIDLCallback.Stub f41272c = null;
    private Map<String, Integer> p = new HashMap(16);
    private boolean t = false;
    private boolean q = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41271b = false;
    private BroadcastReceiver e = new BroadcastReceiver() { // from class: maq.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("HwUpdateInteractors", "mBackgroundReceiver onReceive action :", action);
            if ("action_app_check_new_version_state".equals(action)) {
                int intExtra = intent.getIntExtra("state", -1);
                int intExtra2 = intent.getIntExtra("result", -1);
                String stringExtra = intent.getStringExtra("extra_band_imei");
                if (TextUtils.isEmpty(stringExtra)) {
                    LogUtil.j("HwUpdateInteractors", "deviceId is null");
                } else {
                    LogUtil.a("HwUpdateInteractors", "mBackgroundReceiver state :", Integer.valueOf(intExtra), " result :", Integer.valueOf(intExtra2));
                    maq.this.d(stringExtra, intExtra, intExtra2);
                }
            }
        }
    };
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: maq.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            LogUtil.a("HwUpdateInteractors", "mConnectStateChangedReceiver(): intent = ", intent.getAction());
            if (context == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("deviceinfo")) == null) {
                return;
            }
            if (!(parcelableExtra instanceof DeviceInfo)) {
                LogUtil.a("HwUpdateInteractors", "! parcelableExtra mInstanceof DeviceInfo ");
                return;
            }
            DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.a("HwUpdateInteractors", "mConnectStateChangedReceiver(): state = ", Integer.valueOf(deviceConnectState), ",deviceInfo = ", deviceInfo.toString());
            if (deviceConnectState == 3) {
                maq.this.l(deviceInfo.getDeviceIdentify());
            } else {
                LogUtil.a("HwUpdateInteractors", "not device disconnected");
            }
        }
    };

    private maq(Context context) {
        this.i = context;
        this.l = HwVersionManager.b(context);
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        Handler handler = this.w;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = str;
            int iC = c(str);
            if (iC == 12) {
                messageObtainMessage.what = 20;
                this.w.sendMessage(messageObtainMessage);
                this.w.removeMessages(10);
            } else if (iC == 3) {
                messageObtainMessage.what = 60;
                this.w.sendMessage(messageObtainMessage);
            } else if (iC == 4 || iC == 6) {
                messageObtainMessage.what = 70;
                this.w.sendMessage(messageObtainMessage);
            } else {
                LogUtil.j("HwUpdateInteractors", "device disconnected default");
                this.v = this.i.getString(R.string.IDS_music_management_disconnection);
                max.c().d(5, str, 7, this.v);
                d(str);
            }
        }
    }

    public static maq b() {
        maq maqVar;
        synchronized (f41270a) {
            if (d == null) {
                d = new maq(BaseApplication.getContext());
            }
            maqVar = d;
        }
        return maqVar;
    }

    public void h(String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        BroadcastManagerUtil.d(this.i, this.e, intentFilter, LocalBroadcast.f36595c, null);
        this.o = true;
        i();
        Handler handler = this.w;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(50, 500L);
        }
        maz.d().b(str);
        LogUtil.a("HwUpdateInteractors", "startBackgroundUpdate enter notifyProgress");
        maz.d().e(2, max.c().b(str));
    }

    public boolean f() {
        Iterator<Map.Entry<String, Integer>> it = this.p.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().intValue() == 6) {
                return true;
            }
        }
        return false;
    }

    public void b(boolean z) {
        this.f41271b = z;
    }

    public void g(final String str) {
        LogUtil.a("HwUpdateInteractors", "startReceiveManualTransfer() enter");
        String strJ = HwVersionManager.b(BaseApplication.getContext()).j(str);
        String strG = HwVersionManager.b(BaseApplication.getContext()).g(str);
        LogUtil.a("HwUpdateInteractors", "startReceiveAutoTransfer() version = ", strJ, " filePath = ", strG);
        DataOtaParametersV2 dataOtaParametersV2 = new DataOtaParametersV2();
        dataOtaParametersV2.setOtaInterval(109000L);
        lvb.e().e(e(str), strG + "@" + strJ, new Gson().toJson(dataOtaParametersV2), 0, new IOTAResultAIDLCallback.Stub() { // from class: maq.1
            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferState(int i) throws RemoteException {
                maq.this.a(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onUpgradeFailed(int i, String str2) throws RemoteException {
                maq.this.b(i, str2, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileRespond(int i) throws RemoteException {
                maq.this.b(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferReport(String str2) {
                maq.this.q(str2);
            }
        });
    }

    public void b(String str) {
        LogUtil.a("HwUpdateInteractors", "initUpdateInteractors");
        o();
        c(false);
        if (c(str) == 3) {
            d(str);
        }
        Context context = this.i;
        if (context != null) {
            HwVersionManager.b(context).k(str);
        }
        e(str, 0);
        maz.d().b();
    }

    public void o() {
        LogUtil.a("HwUpdateInteractors", "enter unregisterBackgroundReceiver");
        try {
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver == null || !this.o) {
                return;
            }
            this.i.unregisterReceiver(broadcastReceiver);
            this.o = false;
        } catch (IllegalArgumentException e) {
            LogUtil.e("HwUpdateInteractors", "unregisterBackgroundReceiver IllegalArgumentException ", ExceptionUtils.c(e));
        }
    }

    public boolean i(String str) {
        if (this.p.size() <= 0) {
            return false;
        }
        for (Map.Entry<String, Integer> entry : this.p.entrySet()) {
            if (!TextUtils.equals(str, entry.getKey()) && c(entry, e(entry.getKey()))) {
                return true;
            }
        }
        return false;
    }

    private boolean c(Map.Entry<String, Integer> entry, DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            return false;
        }
        int iIntValue = entry.getValue().intValue();
        return iIntValue == 6 || iIntValue == 4;
    }

    public int c(String str) {
        Integer num;
        int iIntValue = (!this.p.containsKey(str) || (num = this.p.get(str)) == null) ? 0 : num.intValue();
        LogUtil.a("HwUpdateInteractors", "getOtaStatus deviceId ", CommonUtil.n(str), " OtaStatus ", Integer.valueOf(iIntValue));
        return iIntValue;
    }

    public void e(String str, int i) {
        LogUtil.a("HwUpdateInteractors", "setOtaStatus deviceId ", CommonUtil.n(str), " OtaStatus ", Integer.valueOf(i));
        this.p.put(str, Integer.valueOf(i));
    }

    public void j() {
        if (this.p.size() > 0) {
            for (Map.Entry<String, Integer> entry : this.p.entrySet()) {
                String key = entry.getKey();
                if (entry.getValue().intValue() != 12) {
                    this.p.put(key, 0);
                }
            }
        }
    }

    public Map<String, Integer> a() {
        return this.p;
    }

    public void c(final boolean z) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: maq.2
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwUpdateInteractors", "enter deleteMessage");
                MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
                NotificationManager notificationManager = new NotificationManager(maq.this.i);
                List<MessageObject> messages = messageCenterApi.getMessages(String.valueOf(19), "device_ota");
                LogUtil.a("HwUpdateInteractors", "makeMessage, delete messageList, messageList.size() = ", Integer.valueOf(messages.size()));
                for (int i = 0; i < messages.size(); i++) {
                    try {
                        if (!z) {
                            messageCenterApi.deleteMessage(messages.get(i).getMsgId());
                        }
                        notificationManager.e(20171027);
                        LogUtil.a("HwUpdateInteractors", "cancelNotification device ota");
                    } catch (NumberFormatException e) {
                        LogUtil.e("HwUpdateInteractors", "delete error", ExceptionUtils.c(e));
                        return;
                    }
                }
            }
        });
    }

    public void f(String str) {
        String deviceName;
        String deviceIdentify;
        LogUtil.a("HwUpdateInteractors", "start_makeMessage");
        MessageObject messageObject = new MessageObject();
        messageObject.setModule("device");
        String string = this.i.getString(R.string.IDS_device_software_update);
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceName = "";
            deviceIdentify = "";
        } else {
            deviceName = deviceInfoE.getDeviceName();
            LogUtil.a("HwUpdateInteractors", "getCurrentDeviceInfo() deviceName = ", deviceName);
            deviceIdentify = deviceInfoE.getDeviceIdentify();
        }
        LogUtil.a("HwUpdateInteractors", "messageTitle = ", string);
        messageObject.setMsgTitle(string);
        messageObject.setMsgContent(this.i.getString(R.string.IDS_update_device_notification, nvd.i(this.i, deviceIdentify), deviceName));
        messageObject.setMsgId("D201710261048");
        messageObject.setWeight(1);
        messageObject.setPosition(3);
        messageObject.setType("device_ota");
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setDetailUri("messagecenter://device_ota?key=" + deviceIdentify);
        LogUtil.a("HwUpdateInteractors", "end_to_set_message");
        NotificationManager notificationManager = new NotificationManager(this.i, messageObject);
        LogUtil.a("HwUpdateInteractors", "notificationManager =  ", notificationManager);
        notificationManager.c(20171027L);
        LogUtil.a("HwUpdateInteractors", "end_makeMessage");
    }

    public void a(final String str, final int i) {
        String str2;
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE != null && eel.d(deviceInfoE.getProductType())) {
            str2 = "device_ota1";
        } else {
            str2 = "device_ota";
        }
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.getMessages(String.valueOf(19), str2, new IBaseResponseCallback() { // from class: maq.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                List list;
                if (i2 == 0 && (obj instanceof List)) {
                    try {
                        list = (List) obj;
                    } catch (ClassCastException e) {
                        LogUtil.e("HwUpdateInteractors", "makingMessage ClassCastException ", ExceptionUtils.c(e));
                        list = null;
                    }
                    if (!maq.this.a((List<MessageObject>) list)) {
                        maq.this.d(str, messageCenterApi, i);
                    } else {
                        LogUtil.a("HwUpdateInteractors", "has message donot makeMessage, ");
                    }
                }
            }
        });
    }

    public void a(String str, String str2) {
        if (this.l == null) {
            this.l = HwVersionManager.b(this.i);
        }
        this.l.e(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str, final MessageCenterApi messageCenterApi, final int i) {
        messageCenterApi.getMessageId(String.valueOf(19), "device_ota", new IBaseResponseCallback() { // from class: maq.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                String deviceIdentify;
                String string;
                LogUtil.a("HwUpdateInteractors", "generateMessage() errCode = ", Integer.valueOf(i2));
                if (i2 == 0 && (obj instanceof String)) {
                    String str2 = (String) obj;
                    LogUtil.a("HwUpdateInteractors", "generateConnectedMessage messageID = ", str2);
                    MessageObject messageObject = new MessageObject();
                    messageObject.setMsgId(str2);
                    messageObject.setModule(String.valueOf(19));
                    messageObject.setType("device_ota");
                    messageObject.setMsgType(2);
                    messageObject.setPosition(i);
                    messageObject.setHuid(SharedPreferenceUtil.getInstance(maq.this.i).getUserID());
                    String string2 = maq.this.i.getString(R.string.IDS_device_software_update);
                    messageObject.setMsgTitle(string2);
                    messageObject.setMetadata(string2);
                    messageObject.setReadFlag(0);
                    messageObject.setExpireTime(0L);
                    LogUtil.a("HwUpdateInteractors", "generateConnectedMessage mstTitle = ", string2);
                    DeviceInfo deviceInfoE = maq.this.e(str);
                    if (deviceInfoE == null) {
                        deviceIdentify = "";
                        string = "";
                    } else {
                        LogUtil.d("HwUpdateInteractors", "generateConnectedMessage identify = ", deviceInfoE.getDeviceIdentify());
                        deviceIdentify = deviceInfoE.getDeviceIdentify();
                        string = maq.this.i.getString(R.string.IDS_available_for_your_device, nvd.i(maq.this.i, deviceInfoE.getDeviceIdentify()), deviceInfoE.getDeviceName());
                    }
                    messageObject.setMsgContent(string);
                    LogUtil.a("HwUpdateInteractors", "generateConnectedMessage mstContent = ", string);
                    messageObject.setCreateTime(System.currentTimeMillis());
                    messageObject.setDetailUri("messagecenter://device_ota?key=" + deviceIdentify);
                    messageObject.setImgUri("assets://localMessageIcon/ic_band_update.png");
                    messageCenterApi.insertMessage(messageObject);
                    LogUtil.a("HwUpdateInteractors", "generateConnectedMessage leave");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<MessageObject> list) {
        LogUtil.a("HwUpdateInteractors", "isMessageExists enter");
        if (list == null) {
            LogUtil.j("HwUpdateInteractors", "isMessageExists messageList == null");
            return false;
        }
        Iterator<MessageObject> it = list.iterator();
        while (it.hasNext()) {
            if ("device_ota".equals(Uri.parse(it.next().getDetailUri()).getHost())) {
                LogUtil.a("HwUpdateInteractors", "isMessageExists message exists");
                return true;
            }
        }
        LogUtil.a("HwUpdateInteractors", "isMessageExists message not exists");
        return false;
    }

    public DeviceInfo e(String str) {
        return mgg.c(str, "HwUpdateInteractors");
    }

    private void t(String str) {
        File file;
        if (TextUtils.isEmpty(str) || (file = FileUtils.getFile(str)) == null) {
            return;
        }
        ReleaseLogUtil.d("HwUpdateInteractors", "ota length : ", Long.valueOf(file.length()));
    }

    public void b(String str, int i) {
        mbc.b().e(true);
        if (b().i(str)) {
            LogUtil.j("HwUpdateInteractors", "startOtaFileQueryTransfer() isTransferringOtherOta is true");
            return;
        }
        int iC = c(str);
        if (iC == 4 || iC == 6) {
            LogUtil.j("HwUpdateInteractors", "startOtaFileQueryTransfer() return otaStatus = ", Integer.valueOf(iC));
            return;
        }
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            LogUtil.j("HwUpdateInteractors", "startOtaFileQueryTransfer() currentDeviceInfo == null");
            k();
            return;
        }
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        String strJ = hwVersionManagerB.j(str);
        String strG = hwVersionManagerB.g(str);
        LogUtil.a("R_OTA_HwUpdateInteractors", "startOtaFileQueryTransfer() version = ", strJ, " updateMode = ", Integer.valueOf(i), " filePath = ", strG, " current version ", deviceInfoE.getSoftVersion());
        if (strJ != null && strJ.equals(deviceInfoE.getSoftVersion())) {
            LogUtil.j("HwUpdateInteractors", "startOtaFileQueryTransfer() current version is Latest version");
            e(str, 0);
            hwVersionManagerB.l(str);
            max.c().d(str, 0);
            k();
            return;
        }
        t(strG);
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportDeviceRequestCheck()) {
            c(str, i, strJ, strG, null);
        } else if (i == 0) {
            c(str, strJ, strG, null);
        } else {
            e(str, strJ, strG);
        }
    }

    private void k() {
        miv.c("user-otaDownloadFile");
        miv.c("auto-deviceOta-downloadFile");
        miz.d();
    }

    private void c(final String str, final int i, final String str2, final String str3, final IOTAResultAIDLCallback.Stub stub) {
        LogUtil.a("HwUpdateInteractors", "queryDeviceTransmitMode enter");
        mbc.b().e(str, new IBaseResponseCallback() { // from class: maq.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (!(obj instanceof Integer)) {
                    LogUtil.j("HwUpdateInteractors", "queryDeviceTransmitMode error");
                    return;
                }
                int iIntValue = ((Integer) obj).intValue();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("0x01", iIntValue);
                } catch (JSONException unused) {
                    LogUtil.e("HwUpdateInteractors", "queryDeviceTransmitMode response JSONException");
                }
                mio.c(maq.this.e(str), "050919", "0", "", jSONObject.toString());
                if (iIntValue == 255) {
                    iIntValue = i;
                }
                if (iIntValue != 0) {
                    maq.this.e(str, str2, str3);
                } else {
                    maq.this.c(str, str2, str3, stub);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, String str2, String str3) {
        LogUtil.a("R_OTA_HwUpdateInteractors", "enter backgroundTransfer");
        mbc.b().a(str, str2, 2, str3, new IOTAResultAIDLCallback.Stub() { // from class: maq.7
            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferState(int i) throws RemoteException {
                maq.this.e(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onUpgradeFailed(int i, String str4) throws RemoteException {
                if (maq.this.f41271b) {
                    nvd.d(maq.this.e(str), "1", "m31");
                    maq.this.f41271b = false;
                }
                maq.this.e(i, str4, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileRespond(int i) throws RemoteException {
                if (maq.this.f41271b) {
                    nvd.d(maq.this.e(str), "1", "m32");
                    maq.this.f41271b = false;
                }
                maq.this.d(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferReport(String str4) {
                maq.this.k(str4);
            }
        });
        this.r = System.currentTimeMillis();
        SharedPreferenceManager.d(BaseApplication.getContext(), System.currentTimeMillis(), "EXCE_OTA_APP_UPG_TRANS_START");
        this.t = false;
    }

    public void j(final String str) {
        LogUtil.a("R_OTA_HwUpdateInteractors", "startReceiveAutoTransfer() enter");
        i();
        String strJ = HwVersionManager.b(BaseApplication.getContext()).j(str);
        String strG = HwVersionManager.b(BaseApplication.getContext()).g(str);
        LogUtil.a("HwUpdateInteractors", "startReceiveAutoTransfer() version = ", strJ, " filePath = ", strG);
        DataOtaParametersV2 dataOtaParametersV2 = new DataOtaParametersV2();
        dataOtaParametersV2.setOtaInterval(109000L);
        lvb.e().e(e(str), strG + "@" + strJ, new Gson().toJson(dataOtaParametersV2), 2, new IOTAResultAIDLCallback.Stub() { // from class: maq.9
            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferState(int i) throws RemoteException {
                maq.this.e(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onUpgradeFailed(int i, String str2) throws RemoteException {
                maq.this.e(i, str2, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileRespond(int i) throws RemoteException {
                maq.this.d(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferReport(String str2) {
                maq.this.k(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        LogUtil.a("HwUpdateInteractors", "backgroundTransferReport，transferWay: ", str);
        IOTAResultAIDLCallback.Stub stub = this.f41272c;
        if (stub != null) {
            try {
                stub.onFileTransferReport(str);
            } catch (RemoteException e) {
                LogUtil.e("HwUpdateInteractors", "backgroundTransferReport error ", ExceptionUtils.c(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str) {
        this.t = true;
        LogUtil.a("HwUpdateInteractors", "backgroundTransferState: percentage = ", Integer.valueOf(i));
        if (c(str) != 4) {
            e(str, 4);
        }
        IOTAResultAIDLCallback.Stub stub = this.f41272c;
        if (stub != null) {
            try {
                stub.onFileTransferState(i);
            } catch (RemoteException e) {
                LogUtil.e("HwUpdateInteractors", "backgroundTransferState error ", ExceptionUtils.c(e));
            }
        }
        maz.d().e(1, i);
        max.c().b(i, str, 3);
        max.c().e(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, String str2) {
        LogUtil.a("R_OTA_HwUpdateInteractors", "backgroundTransferFailed: errorCode = ", Integer.valueOf(i), " errorMessage = ", str);
        IOTAResultAIDLCallback.Stub stub = this.f41272c;
        if (stub != null) {
            try {
                stub.onUpgradeFailed(i, str);
            } catch (RemoteException e) {
                LogUtil.e("HwUpdateInteractors", "backgroundTransferFailed error ", ExceptionUtils.c(e));
            }
        }
        if (i == 109019) {
            g(str2);
            return;
        }
        if (i == 109020) {
            j(str2);
            return;
        }
        c(str2, 1001, i);
        e(str2, 0);
        this.v = d(str2, i, str);
        max.c().b(str2, false, true);
        maz.d().d(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_transfer_failed), this.v);
        max.c().d(5, str2, i, this.v);
        max.c().e(str2, 0);
        max.c().e(str2, (IUpgradeStatusCallBack) null);
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        LogUtil.a("R_OTA_HwUpdateInteractors", "backgroundTransferRespond checkResult", Integer.valueOf(i));
        e(str, 0);
        IOTAResultAIDLCallback.Stub stub = this.f41272c;
        if (stub != null) {
            try {
                stub.onFileRespond(i);
            } catch (RemoteException e) {
                LogUtil.e("HwUpdateInteractors", "backgroundTransferRespond error ", ExceptionUtils.c(e));
            }
        }
        d(str, i);
        mio.a(str, false);
        max.c().b(100, str, 4);
        max.c().e(str, 100);
        max.c().e(str, (IUpgradeStatusCallBack) null);
        k();
    }

    private void d(String str, int i) {
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA != null && deviceCapabilityA.getIsSupportUpdateChange()) {
            LogUtil.a("HwUpdateInteractors", "device support update change");
            mbc.b().c(str, 1);
        }
        c(false);
        this.v = "";
        maz.d().b();
        if (i != 0) {
            max.c().b(str, true, true);
            this.m = System.currentTimeMillis();
            SharedPreferenceManager.d(BaseApplication.getContext(), System.currentTimeMillis(), "EXCE_OTA_APP_UPG_TRANS_STOP_TIME");
            HashMap map = new HashMap(20);
            DeviceInfo deviceInfoE = e(str);
            map.put("product_type", Integer.valueOf(deviceInfoE != null ? deviceInfoE.getProductType() : -1));
            if (this.t) {
                map.put("status", 2);
            } else {
                map.put("status", 3);
            }
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090026.value(), map, 0);
            c(str, 1000, i);
        } else {
            c(str, 1001, 1002);
        }
        HwVersionManager.b(BaseApplication.getContext()).b(str);
        max.c().d(str, 0);
    }

    private void c(String str, int i, int i2) {
        LogUtil.a("HwUpdateInteractors", "enter sentAutoUpdateEvent. errorMsg=", Integer.valueOf(i2));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            LogUtil.a("HwUpdateInteractors", "enter sentAutoUpdateEvent device is null.");
            return;
        }
        if (deviceInfoE.getProductType() != -1) {
            linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(deviceInfoE.getProductType()));
            linkedHashMap.put("device_classfication", String.valueOf(eev.d(deviceInfoE.getProductType())));
        }
        if (i == 1001) {
            linkedHashMap.put("operationID", "10");
            linkedHashMap.put("errorID", String.valueOf(i2));
            if (CommonUtil.bt()) {
                linkedHashMap.put(com.huawei.hwidauth.datatype.DeviceInfo.TAG_DEVICE_ID, CommonUtil.n(CommonUtil.q()));
                LogUtil.a("HwUpdateInteractors", "enter sentAutoUpdateEvent. CommonUtil.fuzzyData(CommonUtil.getEmuiDeviceUdid()) ", CommonUtil.n(CommonUtil.q()));
            } else {
                linkedHashMap.put(com.huawei.hwidauth.datatype.DeviceInfo.TAG_DEVICE_ID, CommonUtil.n(CommonUtil.al()));
                LogUtil.a("HwUpdateInteractors", "enter sentAutoUpdateEvent. CommonUtil.fuzzyData(CommonUtil.getUdidBySn()) ", CommonUtil.n(CommonUtil.al()));
            }
        } else {
            linkedHashMap.put("operationID", "9");
            long j = this.r;
            if (j > 0) {
                long j2 = this.m;
                if (j2 > 0) {
                    long j3 = j2 - j;
                    if (j3 > 0) {
                        linkedHashMap.put("OTATime", String.valueOf(j3));
                        d(str, linkedHashMap, j3);
                    }
                }
            }
        }
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        linkedHashMap.put("deviceNewVersion", hwVersionManagerB.j(str));
        linkedHashMap.put("versionID", hwVersionManagerB.h(str));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEVICE_OTA_UPDATE_80020004.value(), linkedHashMap);
    }

    public void d(String str, LinkedHashMap<String, String> linkedHashMap, long j) {
        String strG = HwVersionManager.b(BaseApplication.getContext()).g(str);
        if (TextUtils.isEmpty(strG) || !this.t) {
            return;
        }
        String strValueOf = String.valueOf((FileUtils.getFile(strG).length() / 1.024d) / j);
        linkedHashMap.put("OTASpeed", strValueOf);
        ReleaseLogUtil.d("HwUpdateInteractors", "ota time : ", Long.valueOf(j), ", ota speed : ", strValueOf);
    }

    public void c(final String str, String str2, String str3, IOTAResultAIDLCallback.Stub stub) {
        this.j = 0;
        d(stub);
        mbc.b().a(str, str2, 0, str3, new IOTAResultAIDLCallback.Stub() { // from class: maq.5
            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferState(int i) throws RemoteException {
                maq.this.a(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onUpgradeFailed(int i, String str4) throws RemoteException {
                if (maq.this.f41271b) {
                    nvd.d(maq.this.e(str), "1", "m31");
                    maq.this.f41271b = false;
                }
                maq.this.b(i, str4, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileRespond(int i) throws RemoteException {
                if (maq.this.f41271b) {
                    nvd.d(maq.this.e(str), "1", "m32");
                    maq.this.f41271b = false;
                }
                maq.this.b(i, str);
            }

            @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
            public void onFileTransferReport(String str4) {
                maq.this.q(str4);
            }
        });
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE != null) {
            HwVersionManager.b(BaseApplication.getContext()).a(deviceInfoE.getSecurityDeviceId(), deviceInfoE.getDeviceIdentify());
        }
        this.t = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        LogUtil.a("HwUpdateInteractors", "manualTransferReport，transferWay: ", str);
        IOTAResultAIDLCallback.Stub stub = this.s;
        if (stub != null) {
            try {
                stub.onFileTransferReport(str);
            } catch (RemoteException e) {
                LogUtil.e("HwUpdateInteractors", "manualTransferReport error ", ExceptionUtils.c(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        this.t = true;
        if (c(str) != 6) {
            HwVersionManager.b(BaseApplication.getContext()).a(true);
            e(str, 6);
            Intent intent = new Intent();
            intent.setAction("com.huawei.bone.action.DEVICE_UPGRADING");
            this.i.sendBroadcast(intent, LocalBroadcast.f36595c);
            maz.d().b();
        }
        this.j = i;
        if (this.s != null) {
            LogUtil.a("HwUpdateInteractors", "onFileTransferState,mOtaCallBack != null");
            try {
                this.s.onFileTransferState(i);
            } catch (RemoteException e) {
                LogUtil.e("HwUpdateInteractors", "transferFileTransferState RemoteException ", ExceptionUtils.c(e));
            }
        } else {
            LogUtil.a("HwUpdateInteractors", "onFileTransferState,mOtaCallBack == null");
        }
        max.c().b(i, str, 3);
        max.c().e(str, i);
        e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str, String str2) {
        LogUtil.a("R_OTA_HwUpdateInteractors", "transferUpgradeFailed errorCode ", Integer.valueOf(i), " errorMessage = ", str);
        if (this.s != null) {
            LogUtil.a("HwUpdateInteractors", "onUpgradeFailed,mOtaCallBack != null");
            try {
                this.s.onUpgradeFailed(i, str);
            } catch (RemoteException e) {
                LogUtil.e("HwUpdateInteractors", "transferUpgradeFailed RemoteException ", ExceptionUtils.c(e));
            }
        } else {
            LogUtil.a("HwUpdateInteractors", "onUpgradeFailed,mOtaCallBack == null");
        }
        if (i == 109019) {
            g(str2);
            return;
        }
        if (i == 109020) {
            j(str2);
            return;
        }
        this.j = 0;
        max.c().b(str2, false, false);
        HwVersionManager.b(BaseApplication.getContext()).a(false);
        e(str2, 7);
        this.v = d(str2, i, str);
        max.c().d(5, str2, i, this.v);
        max.c().e(str2, 0);
        max.c().e(max.c().d(str2), (IUpgradeStatusCallBack) null);
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        LogUtil.a("R_OTA_HwUpdateInteractors", "manualTransferRespond checkResult", Integer.valueOf(i));
        this.j = 100;
        e(true);
        HwVersionManager.b(BaseApplication.getContext()).a(false);
        e(str, 12);
        i();
        Handler handler = this.w;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 10;
            messageObtainMessage.obj = str;
            this.w.sendMessageDelayed(messageObtainMessage, 20000L);
        }
        this.g = i;
        if (i != 0) {
            max.c().b(str, true, false);
            HashMap map = new HashMap(20);
            DeviceInfo deviceInfoE = e(str);
            map.put("product_type", Integer.valueOf(deviceInfoE != null ? deviceInfoE.getProductType() : -1));
            map.put("status", 1);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090026.value(), map, 0);
        } else {
            max.c().b(str, false, false);
        }
        mio.a(str, false);
        max.c().b(100, str, 4);
        max.c().e(str, 100);
        max.c().e(max.c().d(str), (IUpgradeStatusCallBack) null);
        k();
    }

    public void e(boolean z) {
        boolean z2 = this.q;
        if (z2 != z) {
            LogUtil.a("HwUpdateInteractors", "recordOtaTransferSuccessFlag isSuccess is ", Boolean.valueOf(z), " mIsTransferSuccess is ", Boolean.valueOf(z2));
            SharedPreferenceManager.a(String.valueOf(1003), "flag_ota_update_success", z);
            this.q = z;
        }
    }

    public String d(String str, int i, String str2) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            LogUtil.j("HwUpdateInteractors", "handleFailed,deviceInfo is null");
            return "";
        }
        switch (i) {
            case 104002:
            case 109002:
                if (!TextUtils.isEmpty(str2)) {
                    String strE = UnitUtil.e(CommonUtil.b(str2, 10), 2, 0);
                    LogUtil.a("HwUpdateInteractors", "battery :", strE);
                    return String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_settings_firmware_upgrade_low_battery), deviceInfoE.getDeviceName(), strE);
                }
                return "";
            case 104003:
                return BaseApplication.getContext().getString(R.string.IDS_settings_firmware_upgrade_file_not_exist);
            case 104007:
                return BaseApplication.getContext().getString(R.string.IDS_music_management_disconnection);
            case 109018:
                return BaseApplication.getContext().getString(R.string.IDS_ota_update_high_temperature_error);
            case 109025:
                if (!TextUtils.isEmpty(str2)) {
                    String strE2 = UnitUtil.e(CommonUtil.b(str2, 10), 2, 0);
                    LogUtil.a("HwUpdateInteractors", "earBattery : ", strE2);
                    return String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_device_ear_low_battery), strE2);
                }
                return "";
            default:
                return BaseApplication.getContext().getString(R.string.IDS_settings_firmware_upgrade_talk_band_failed);
        }
    }

    public void i() {
        LogUtil.a("HwUpdateInteractors", "enter registerConnectStateBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.i, this.f, intentFilter, LocalBroadcast.f36595c, null);
        this.k = true;
    }

    private void l() {
        LogUtil.a("HwUpdateInteractors", "enter unregisterConnectStateChangedBroadcast");
        BroadcastReceiver broadcastReceiver = this.f;
        if (broadcastReceiver == null || !this.k) {
            return;
        }
        this.i.unregisterReceiver(broadcastReceiver);
        this.k = false;
    }

    private void n() {
        HandlerThread handlerThread = new HandlerThread("HwUpdateInteractors");
        this.n = handlerThread;
        handlerThread.start();
        this.w = new c(this.n.getLooper());
    }

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            super.handleMessage(message);
            LogUtil.a("HwUpdateInteractors", "UpdateHandler receive msg:", Integer.valueOf(message.what));
            if (!(message.obj instanceof String)) {
                str = "";
            } else {
                str = (String) message.obj;
            }
            int i = message.what;
            if (i == 10 || i == 20) {
                maq.this.m(str);
                return;
            }
            if (i == 50) {
                qpx.e(maq.this.i, R.string.IDS_device_auto_update_background_download);
                return;
            }
            if (i == 60) {
                maq.this.n(str);
            } else if (i == 70) {
                maq.this.o(str);
            } else {
                LogUtil.j("HwUpdateInteractors", "handleMessage error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        this.v = this.i.getString(R.string.IDS_music_management_disconnection);
        max.c().d(5, str, 7, this.v);
        e(str, 5);
        maz.d().d(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_transfer_failed), this.v);
        LogUtil.j("HwUpdateInteractors", "enter handleTransferDisconnect :", this.v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        e(str, 2);
        this.h = this.i.getString(R.string.IDS_music_management_disconnection);
        max.c().d(5, str, 7, this.h);
        maz.d().d(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_download_failed), this.h);
        d(str);
        LogUtil.j("HwUpdateInteractors", "enter handleDownloadDisconnect :", this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        l();
        if (this.s != null) {
            LogUtil.a("HwUpdateInteractors", "onFileRespond,mOtaCallBack != null");
            try {
                this.s.onFileRespond(this.g);
            } catch (RemoteException e) {
                LogUtil.a("HwUpdateInteractors", "mOtaCallBack.onFileRespond error:", e.getMessage());
            }
        } else {
            LogUtil.a("HwUpdateInteractors", "onFileRespond,mOtaCallBack == null");
        }
        c(false);
        e(str, 0);
        HwVersionManager.b(BaseApplication.getContext()).l(str);
        max.c().d(str, 0);
        this.j = 0;
    }

    public boolean e(long j) {
        StatFs statFs;
        LogUtil.a("HwUpdateInteractors", "checkMemory needSize = ", Long.valueOf(j));
        try {
            statFs = new StatFs(this.i.getFilesDir().getCanonicalPath());
        } catch (IOException e) {
            LogUtil.e("HwUpdateInteractors", "checkMemory IOException ", ExceptionUtils.c(e));
            statFs = null;
        }
        if (statFs != null) {
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > j;
        }
        LogUtil.a("HwUpdateInteractors", "stats is null");
        return false;
    }

    public void d(IOTAResultAIDLCallback.Stub stub) {
        if (stub != null) {
            this.s = stub;
        }
        int i = this.j;
        if (i != 0) {
            try {
                LogUtil.a("HwUpdateInteractors", "onFileTransferState,mCurrentPercent:", Integer.valueOf(i));
                stub.onFileTransferState(this.j);
            } catch (RemoteException e) {
                LogUtil.a("HwUpdateInteractors", "onFileTransferState,error:", e.getMessage());
            }
        }
    }

    public void h() {
        this.s = null;
    }

    public void b(String str, IOTAResultAIDLCallback.Stub stub) {
        this.f41272c = stub;
        int i = max.c().i(str);
        try {
            LogUtil.a("HwUpdateInteractors", "onFileTransferState,mBackgroundTransferPercent:", Integer.valueOf(i));
            stub.onFileTransferState(i);
        } catch (RemoteException e) {
            LogUtil.a("HwUpdateInteractors", "onFileTransferState error ", ExceptionUtils.c(e));
        }
    }

    public void g() {
        this.f41272c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, int i, int i2) {
        switch (i) {
            case 19:
                i();
                break;
            case 20:
            default:
                LogUtil.j("HwUpdateInteractors", "updateDownloadState default");
                break;
            case 21:
                maz.d().e(2, max.c().b(str));
                break;
            case 22:
                DeviceInfo deviceInfoE = e(str);
                if (deviceInfoE != null && deviceInfoE.getDeviceConnectState() != 2) {
                    this.h = this.i.getString(R.string.IDS_music_management_disconnection);
                } else {
                    this.h = c(this.i, i2);
                }
                maz.d().d(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_download_failed), this.h);
                l();
                break;
            case 23:
                LogUtil.a("HwUpdateInteractors", "STATE_DOWNLOAD_APP_SUCCESS");
                this.h = "";
                break;
        }
    }

    public static String c(Context context, int i) {
        if (context == null) {
            LogUtil.j("HwUpdateInteractors", "getErrorMessage context is null");
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.IDS_update_download_check_failed);
        }
        if (i == 3) {
            return context.getString(R.string.IDS_update_network_abnormal);
        }
        if (i != 4) {
            return context.getString(R.string.IDS_update_download_failed);
        }
        return qrs.ah(BaseApplication.getContext()) ? context.getString(R.string.IDS_pad_phone_low_battery, UnitUtil.e(10.0d, 2, 0)) : context.getString(R.string.IDS_settings_firmware_upgrade_phone_low_battery);
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.v;
    }

    public void d(String str) {
        LogUtil.a("R_OTA_HwUpdateInteractors", "handleIntent, cancel download app!");
        DeviceInfo deviceInfoE = b().e(str);
        num numVarL = deviceInfoE != null ? nvd.l(BaseApplication.getContext(), deviceInfoE.getSecurityDeviceId()) : null;
        if (numVarL == null || TextUtils.isEmpty(numVarL.j())) {
            return;
        }
        lsf.c(str, true);
        LogUtil.a("HwUpdateInteractors", "isCancelSuccess ", Boolean.valueOf(oet.d().b(numVarL.j())));
    }

    public void c() {
        LogUtil.a("R_OTA_HwUpdateInteractors", "handleIntent, cancel all download app!");
        ArrayList arrayList = new ArrayList(16);
        for (Map.Entry<String, Integer> entry : b().a().entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().intValue() == 3) {
                lsf.c(key, true);
                DeviceInfo deviceInfoE = b().e(key);
                if (deviceInfoE != null) {
                    arrayList.add(deviceInfoE.getSecurityDeviceId());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            num numVarE = nuw.e((String) it.next());
            if (numVarE != null && !TextUtils.isEmpty(numVarE.j())) {
                oet.d().b(numVarE.j());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwUpdateInteractors", "getAnswerDeviceStatus deviceId isEmpty");
            return false;
        }
        mbc mbcVarB = mbc.b();
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            mbcVarB.a(str, 3, 2);
            LogUtil.j("HwUpdateInteractors", "getAnswerDeviceStatus no network connected");
            return false;
        }
        boolean z = CommonUtil.o(BaseApplication.getContext()) == 1 ? 1 : 0;
        int i = !z;
        LogUtil.a("HwUpdateInteractors", "getAnswerDeviceStatus isWifiType ", Boolean.valueOf(z));
        if (a(str, mbcVarB, i)) {
            return false;
        }
        if (z == 0) {
            mbcVarB.a(str, 3, i);
            return false;
        }
        if (ScreenUtil.d() && !CommonUtil.x(BaseApplication.getContext()) && mio.b()) {
            LogUtil.j("HwUpdateInteractors", "getAnswerDeviceStatus ota activity is showing");
            return false;
        }
        DeviceInfo deviceInfoE = b().e(str);
        if (deviceInfoE != null && HwVersionManager.b(this.i).d(str, deviceInfoE.getSecurityDeviceId())) {
            mbcVarB.a(str, 2, i);
            LogUtil.j("HwUpdateInteractors", "getAnswerDeviceStatus ota startOtaFileQueryTransfer");
            miv.c(1800000L, "user-otaDownloadFile");
            miz.d(BaseApplication.getContext());
            b().b(str, 0);
            return false;
        }
        LogUtil.a("HwUpdateInteractors", "getAnswerDeviceStatus start device request download");
        mbcVarB.a(str, 0, i);
        return true;
    }

    private boolean a(String str, mbc mbcVar, int i) {
        if (TextUtils.isEmpty(nvd.i(this.i, str))) {
            LogUtil.j("HwUpdateInteractors", "getOtaAnswerResult no new version");
            mbcVar.a(str, 255, i);
            return true;
        }
        int iC = b().c(str);
        if (iC == 3) {
            LogUtil.j("HwUpdateInteractors", "getOtaAnswerResult ota is downloading");
            mbcVar.a(str, 1, i);
            return true;
        }
        if (iC == 4 || iC == 6) {
            LogUtil.j("HwUpdateInteractors", "getOtaAnswerResult ota is transferring");
            mbcVar.a(str, 2, i);
            return true;
        }
        if (!max.c().e()) {
            return false;
        }
        LogUtil.j("HwUpdateInteractors", "getOtaAnswerResult low battery");
        mbcVar.a(str, 4, i);
        return true;
    }
}
