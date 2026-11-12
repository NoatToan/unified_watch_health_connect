package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.text.TextUtils;
import com.huawei.datatype.DataDeviceIntelligentInfo;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class luk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40841c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40842a;

    private luk() {
        this.f40842a = BaseApplication.getContext();
    }

    public static luk b() {
        return b.f40845c;
    }

    public void d(Intent intent) {
        DeviceInfo deviceInfo;
        if (intent == null) {
            LogUtil.j("ConfigMgrConnectState", "intent is null");
            return;
        }
        try {
            deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
        } catch (BadParcelableException unused) {
            LogUtil.e("ConfigMgrConnectState", "handleConnectionStateChanged() occur BadParcelableException");
            deviceInfo = null;
        }
        if (deviceInfo == null) {
            LogUtil.j("ConfigMgrConnectState", "handleConnectionStateChanged() deviceInfo is null");
            return;
        }
        nvd.c(BaseApplication.getContext(), deviceInfo);
        nvd.b(BaseApplication.getContext(), deviceInfo);
        LogUtil.a("ConfigMgrConnectState", "handleConnectionStateChanged() ConnectState():", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        mgu.a(deviceInfo);
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 2) {
            b(deviceInfo);
        } else if (deviceConnectState != 3) {
            LogUtil.e("ConfigMgrConnectState", "handleConnectionStateChanged() enter default branch. connect state is invalid");
        } else {
            f(deviceInfo);
        }
        mfy.b(1, false);
    }

    private void b(DeviceInfo deviceInfo) {
        lvi.d(this.f40842a);
        d(deviceInfo);
        lug.e();
        d();
        c();
        LogUtil.a("ConfigMgrConnectState", "getHwMusicAccountSendToWear when luetooth connect");
        if (System.currentTimeMillis() - SharedPreferenceManager.d(Integer.toString(10000), "setMusicInfo" + deviceInfo.getSecurityDeviceId(), 0L) >= 86400000) {
            LogUtil.a("ConfigMgrConnectState", "start getHwMusicAccountSendToWear");
            mal.b();
            mal.a(this.f40842a, true);
        }
        String strC = nvd.c(deviceInfo.getSecurityDeviceId(), this.f40842a);
        LogUtil.a("ConfigMgrConnectState", "processDeviceConnected packageName ", strC, " deviceInfo.getDeviceOtaPackageName()", deviceInfo.getDeviceOtaPackageName());
        if (TextUtils.isEmpty(strC) || !strC.equals(deviceInfo.getDeviceOtaPackageName())) {
            nvd.k(deviceInfo.getSecurityDeviceId(), deviceInfo.getDeviceOtaPackageName(), this.f40842a);
        }
        i(deviceInfo);
        a(deviceInfo);
        mew.a().d();
        lwd.c().d(deviceInfo);
    }

    private void d(final DeviceInfo deviceInfo) {
        LogUtil.a("ConfigMgrConnectState", "Enter generateConnectedMessage method");
        if (deviceInfo == null) {
            LogUtil.j("ConfigMgrConnectState", "Enter generateConnectedMessage btDeviceInfo is null");
            return;
        }
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        if (messageCenterApi == null) {
            LogUtil.j("ConfigMgrConnectState", "messageCenterApi is null");
        } else {
            messageCenterApi.getMessages(String.valueOf(19), "device_type_connected", new IBaseResponseCallback() { // from class: luo
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.d(deviceInfo, messageCenterApi, i, obj);
                }
            });
        }
    }

    /* synthetic */ void d(final DeviceInfo deviceInfo, final MessageCenterApi messageCenterApi, int i, Object obj) {
        LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage errorCode :", Integer.valueOf(i));
        if (i != 0 || !(obj instanceof List)) {
            LogUtil.j("ConfigMgrConnectState", "generateConnectedMessage,getMessages failed");
            return;
        }
        final List list = (List) obj;
        LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, delete messageList, messageList.size() :", Integer.valueOf(list.size()));
        lsy.a(new Runnable() { // from class: luq
            @Override // java.lang.Runnable
            public final void run() {
                this.f40856a.a(deviceInfo, list, messageCenterApi);
            }
        });
    }

    /* synthetic */ void a(DeviceInfo deviceInfo, List list, MessageCenterApi messageCenterApi) {
        LogUtil.a("ConfigMgrConnectState", "initHiAiEngine");
        ddr.e().initHiAiEngine();
        if (!c(deviceInfo)) {
            LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, isNeedGenerateMessage false");
            return;
        }
        if (e()) {
            LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, isConnectLastTwoDevice");
            return;
        }
        if (e(deviceInfo) && !e(deviceInfo, (List<MessageObject>) list)) {
            LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, isDeviceIdEquals");
            return;
        }
        g(deviceInfo);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            messageCenterApi.deleteMessage(((MessageObject) it.next()).getMsgId());
        }
        e(messageCenterApi, deviceInfo);
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo.getProductType() == -2 || deviceInfo.getProductType() == 0 || deviceInfo.getProductType() == 2) {
            LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, W1,B1,AF500 don't need generate message");
            return false;
        }
        if (deviceInfo.getProductType() != 4 && deviceInfo.getProductType() != -1 && deviceInfo.getProductType() != 9) {
            return lvi.a(deviceInfo.getProductType()).z();
        }
        LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, N1，W2，don't need generate message");
        return false;
    }

    private boolean e() {
        String strE = SharedPreferenceManager.e(this.f40842a, String.valueOf(1), "double_device_connect");
        if (!TextUtils.isEmpty(strE) && strE.contains("%")) {
            DeviceInfo deviceInfoC = mgi.c("ConfigMgrConnectState");
            DeviceInfo deviceInfoC2 = mgg.c("ConfigMgrConnectState");
            boolean z = deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2 && strE.contains(deviceInfoC.getSecurityDeviceId());
            boolean z2 = deviceInfoC2 != null && deviceInfoC2.getDeviceConnectState() == 2 && strE.contains(deviceInfoC2.getSecurityDeviceId());
            if (z && z2) {
                LogUtil.a("ConfigMgrConnectState", "Connect the same device in last two devices");
                return true;
            }
        }
        return false;
    }

    private boolean e(DeviceInfo deviceInfo) {
        String strE = SharedPreferenceManager.e(this.f40842a, String.valueOf(1), "kStorage_DeviceCfgMgr_Identify");
        if (deviceInfo.getSecurityDeviceId() == null) {
            LogUtil.j("ConfigMgrConnectState", "securityDeviceId is null ");
            return false;
        }
        LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, getDeviceIdentify():", BTDeviceMgrUtil.c().e(deviceInfo.getSecurityDeviceId()), ", getSharedPreference deviceIdentify:", BTDeviceMgrUtil.c().e(strE));
        if (!deviceInfo.getSecurityDeviceId().equalsIgnoreCase(strE)) {
            return false;
        }
        LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage, same device, don't need generate message...");
        return true;
    }

    private boolean e(DeviceInfo deviceInfo, List<MessageObject> list) {
        Map<String, String> mapQ = deviceInfo != null ? lvi.a(deviceInfo.getProductType()).q() : null;
        LogUtil.a("ConfigMgrConnectState", "isHonorAndNeedMessage isHonorDevice:", Boolean.valueOf(eei.d(deviceInfo)), " honorHelpUrlMap:", mapQ, " messageList size:", Integer.valueOf(list.size()));
        return eei.d(deviceInfo) && mapQ != null && list.size() == 0;
    }

    private void g(DeviceInfo deviceInfo) {
        DeviceInfo deviceInfoD = mgi.d("ConfigMgrConnectState");
        DeviceInfo deviceInfoD2 = mgg.d("ConfigMgrConnectState");
        if (deviceInfoD2 == null || deviceInfoD == null) {
            c("kStorage_DeviceCfgMgr_Identify", deviceInfo.getSecurityDeviceId(), null);
            return;
        }
        c("double_device_connect", deviceInfoD2.getSecurityDeviceId() + "%" + deviceInfoD.getSecurityDeviceId(), null);
        c("kStorage_DeviceCfgMgr_Identify", "", null);
    }

    private void e(final MessageCenterApi messageCenterApi, final DeviceInfo deviceInfo) {
        messageCenterApi.getMessageId(String.valueOf(19), "device_type_connected", new IBaseResponseCallback() { // from class: luk.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage requestMessageId errorCode :", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof String)) {
                    LogUtil.j("ConfigMgrConnectState", "generateConnectedMessage requestMessageId failed");
                    return;
                }
                String str = (String) obj;
                LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage messageId:", str);
                String string = luk.this.f40842a.getString(R.string.IDS_messagecenter_device_bind_success_title);
                String deviceName = deviceInfo.getDeviceName();
                DeviceInfo deviceInfoC = mgg.c("ConfigMgrConnectState");
                if (TextUtils.isEmpty(deviceName) && deviceInfoC != null) {
                    deviceName = deviceInfoC.getDeviceName();
                }
                if (TextUtils.isEmpty(deviceName)) {
                    deviceName = "";
                }
                String str2 = String.format(Locale.ENGLISH, string, deviceName);
                MessageObject messageObjectC = luk.this.c(str);
                messageObjectC.setMsgTitle(str2);
                messageObjectC.setMetadata(str2);
                LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage mstTitle:", str2);
                messageObjectC.setMsgContent("");
                LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage mstContent:", "");
                messageObjectC.setCreateTime(System.currentTimeMillis());
                messageObjectC.setExpireTime(0L);
                messageObjectC.setReadFlag(0);
                if (deviceInfo.getProductType() < 0) {
                    LogUtil.a("ConfigMgrConnectState", "useless product type");
                    return;
                }
                if (eel.d(deviceInfo.getProductType())) {
                    messageObjectC.setDetailUri("messagecenter://aw70_device_guide?key=" + deviceInfo.getProductType());
                } else {
                    messageObjectC.setDetailUri("messagecenter://device_guide?key=" + deviceInfo.getProductType() + "&hilink=" + deviceInfo.getHiLinkDeviceId());
                }
                messageObjectC.setImgUri("assets://localMessageIcon/ic_band_connected.webp");
                messageCenterApi.insertMessage(messageObjectC);
                LogUtil.a("ConfigMgrConnectState", "generateConnectedMessage leave");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageObject c(String str) {
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgId(str);
        messageObject.setModule(String.valueOf(19));
        messageObject.setType("device_type_connected");
        messageObject.setMsgType(2);
        messageObject.setPosition(1);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(SharedPreferenceUtil.getInstance(this.f40842a).getUserID());
        return messageObject;
    }

    private int c(String str, String str2, StorageParams storageParams) {
        return SharedPreferenceManager.e(this.f40842a, String.valueOf(1), str, str2, storageParams);
    }

    private void d() {
        LogUtil.a("ConfigMgrConnectState", "sendBroadcast auto_send_command. start");
        new luj().a();
    }

    private void c() {
        lzl.a(BaseApplication.getContext()).c(lzl.a(BaseApplication.getContext()).d(), false);
    }

    private void i(DeviceInfo deviceInfo) {
        if (!eey.d(deviceInfo, 27)) {
            LogUtil.j("ConfigMgrConnectState", "device not support ecg nmpa");
        } else {
            lvu.b().e(lvu.b().e(), new IBaseResponseCallback() { // from class: lum
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.a("ConfigMgrConnectState", "setDefaultEcgDuration errorCode ", Integer.valueOf(i));
                }
            });
        }
    }

    private void a(DeviceInfo deviceInfo) {
        if (!eey.d(deviceInfo, 45)) {
            LogUtil.j("ConfigMgrConnectState", "device not support get ecg iv");
        } else {
            lvr.a().b(deviceInfo);
        }
    }

    private void f(DeviceInfo deviceInfo) {
        mbc.b().d(deviceInfo);
        synchronized (f40841c) {
            if (eel.d(deviceInfo.getProductType())) {
                mfe.d().e();
            } else {
                mfe.d().a();
            }
            mev.d().d((DataDeviceIntelligentInfo) null);
        }
        luh.e();
        mew.a().e();
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static luk f40845c = new luk();
    }
}
