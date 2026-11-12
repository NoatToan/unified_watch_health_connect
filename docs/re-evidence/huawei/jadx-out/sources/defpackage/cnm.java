package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.strategy.SendStrategy;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cnm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected MessageReceiveCallback f1853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MessageReceiveCallback f1854c;
    protected MessageReceiveCallback d;
    private static Map<String, SendStrategy> e = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, cls> f1852a = new ConcurrentHashMap(16);

    private cnm() {
        this.f1854c = new MessageReceiveCallback() { // from class: cnm.3
            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
                if (deviceInfo == null || cmmVar == null) {
                    LogUtil.e("SendCommandMange", "invalid input parameter");
                    return;
                }
                String strB = cmmVar.b();
                LogUtil.b("SendCommandMange", "onDataReceived uuid: ", strB, cpl.a(deviceInfo), " errorCode: ", Integer.valueOf(i));
                SendStrategy sendStrategyA = cnm.this.a(strB);
                if (sendStrategyA != null) {
                    MessageReceiveCallback messageReceiveCallbackB = cnm.this.b(deviceInfo.getDeviceMac());
                    if (messageReceiveCallbackB == null) {
                        LogUtil.e("SendCommandMange", "dataReceiveCallback is empty ", cpl.a(deviceInfo));
                        return;
                    } else if (i == 0) {
                        sendStrategyA.parseReceiveFrames(deviceInfo, cmmVar, messageReceiveCallbackB);
                        return;
                    } else {
                        messageReceiveCallbackB.onDataReceived(deviceInfo, null, i);
                        return;
                    }
                }
                LogUtil.e("SendCommandMange", "can not get send strategy of uuid ", strB, cpl.a(deviceInfo));
            }

            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onChannelEnable(DeviceInfo deviceInfo, String str, int i) {
                LogUtil.b("SendCommandMange", "onChannelEnable characterUuid: ", str, cpl.a(deviceInfo));
                if (deviceInfo != null) {
                    MessageReceiveCallback messageReceiveCallbackB = cnm.this.b(deviceInfo.getDeviceMac());
                    if (messageReceiveCallbackB != null) {
                        messageReceiveCallbackB.onChannelEnable(deviceInfo, str, i);
                        return;
                    } else {
                        LogUtil.e("SendCommandMange", "can not get dataReceiveCallback.");
                        return;
                    }
                }
                LogUtil.e("SendCommandMange", "deviceInfo is null");
            }
        };
        cll.c().e(this.f1854c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageReceiveCallback b(String str) {
        if (cnk.c().g(str)) {
            return this.f1853b;
        }
        return this.d;
    }

    public static cnm d() {
        return d.e;
    }

    public SendStrategy a(String str, SendMode sendMode) {
        if (str == null) {
            return null;
        }
        SendStrategy sendStrategyA = a(str);
        if (sendStrategyA != null) {
            return sendStrategyA;
        }
        SendStrategy sendStrategyA2 = a(sendMode);
        LogUtil.b("SendCommandMange", "getSendStrategy sendStrategy is null uuid: ", str, ",type: ", Integer.valueOf(sendMode.value()), ",sendStrategy: ", sendStrategyA2);
        e.put(str, sendStrategyA2);
        return sendStrategyA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SendStrategy a(String str) {
        return e.get(str);
    }

    private SendStrategy a(SendMode sendMode) {
        Object objD = new cof().d(sendMode);
        if (objD instanceof SendStrategy) {
            return (SendStrategy) objD;
        }
        return null;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SendCommandMange", "clearStrategyCache: identify is empty");
            return;
        }
        for (SendStrategy sendStrategy : e.values()) {
            ReleaseLogUtil.d("DEVMGR_SendCommandMange", "clearStrategyCache sendStrategy identify is ", cpl.a(str));
            sendStrategy.destroy(str);
        }
    }

    public void e(DeviceInfo deviceInfo, cmg cmgVar) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("SendCommandMange", "sendCommand device info is invalid.");
            return;
        }
        if (cmgVar == null) {
            LogUtil.e("SendCommandMange", "command message is invalid.", cpl.a(deviceInfo));
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        String strE = cjt.e(cmgVar.c());
        SendStrategy sendStrategyA = a(strE, cmgVar.f());
        if (sendStrategyA == null) {
            LogUtil.e("SendCommandMange", "send strategy is null.", cpl.a(deviceMac), " characterId: ", strE);
            return;
        }
        cls clsVar = f1852a.get(deviceMac);
        if (clsVar == null) {
            LogUtil.e("SendCommandMange", "device command sender is not init ", cpl.a(deviceMac));
            a(deviceInfo, cmgVar);
        } else {
            if (clsVar.d(cmgVar, sendStrategyA)) {
                return;
            }
            LogUtil.e("SendCommandMange", "add command to queue failed.");
            a(deviceInfo, cmgVar);
        }
    }

    private void a(DeviceInfo deviceInfo, cmg cmgVar) {
        CharacterOperationType characterOperationTypeE = cmgVar.e();
        String strC = cmgVar.c();
        String str = "notifySendCommandError " + cpl.a(deviceInfo) + " characterId: " + strC + " optionsType: " + characterOperationTypeE;
        lng.c("CommandMessage", str);
        LogUtil.e("SendCommandMange", str);
        if (characterOperationTypeE == CharacterOperationType.ENABLE || characterOperationTypeE == CharacterOperationType.DISABLE) {
            this.f1854c.onChannelEnable(deviceInfo, strC, 1);
        } else {
            this.f1854c.onDataReceived(deviceInfo, null, 1);
        }
    }

    public void c(MessageReceiveCallback messageReceiveCallback) {
        this.d = messageReceiveCallback;
    }

    public void c() {
        this.d = null;
    }

    public void d(MessageReceiveCallback messageReceiveCallback) {
        this.f1853b = messageReceiveCallback;
    }

    public void d(DeviceInfo deviceInfo) {
        if (a(deviceInfo)) {
            String deviceMac = deviceInfo.getDeviceMac();
            LogUtil.b("SendCommandMange", "initDeviceCommandMessageSender ", cpl.a(deviceInfo));
            cls clsVar = new cls(deviceInfo);
            f1852a.put(deviceMac, clsVar);
            clsVar.start();
        }
    }

    public int c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SendCommandMange", "device info is invalid.");
            return -1;
        }
        cls clsVar = f1852a.get(str);
        if (clsVar == null) {
            return -1;
        }
        int iA = clsVar.a();
        LogUtil.b("SendCommandMange", "command queue size: ", Integer.valueOf(iA));
        return iA;
    }

    public boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("SendCommandMange", "device info is invalid.");
            return false;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        LogUtil.b("SendCommandMange", "closeDeviceCommandMessageSender ", cpl.a(deviceInfo));
        cls clsVarRemove = f1852a.remove(deviceMac);
        if (clsVarRemove == null) {
            return true;
        }
        clsVarRemove.b();
        return true;
    }

    static class d {
        private static cnm e = new cnm();
    }
}
