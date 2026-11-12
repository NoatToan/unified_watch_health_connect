package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.command.CommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.strategy.SendStrategy;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class cnz extends SendStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageReceiveCallback f1888a = new MessageReceiveCallback() { // from class: cnz.3
        @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
        public void onChannelEnable(DeviceInfo deviceInfo, String str, int i) {
        }

        @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
        public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
            if (deviceInfo != null && cmmVar != null) {
                for (CommandBase commandBase : cnz.d) {
                    if (commandBase != null && !commandBase.handleReceivedData(deviceInfo.getDeviceMac(), cmmVar)) {
                        return;
                    }
                }
                MessageReceiveCallback messageReceiveCallback = (MessageReceiveCallback) cnz.e.get(deviceInfo.getDeviceMac());
                if (messageReceiveCallback == null) {
                    LogUtil.e("SendStrategyInitial5A", "onDataReceived messageReceiveCallback is null");
                    return;
                } else {
                    messageReceiveCallback.onDataReceived(deviceInfo, cmmVar, i);
                    return;
                }
            }
            LogUtil.e("SendStrategyInitial5A", "localCallback onDataReceived device or dataContents parameter exception.");
        }
    };
    private static List<CommandBase> d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, coa> f1887b = new ConcurrentHashMap(16);
    private static Map<String, MessageReceiveCallback> e = new ConcurrentHashMap(16);

    public cnz() {
        d.add(new cjv());
    }

    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public ArrayList<cmd> getSendFrames(cmg cmgVar, DeviceInfo deviceInfo) {
        ArrayList<cmd> arrayList = new ArrayList<>(16);
        if (cmgVar == null) {
            LogUtil.e("SendStrategyInitial5A", "message is empty when getting send frames .");
            return arrayList;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("SendStrategyInitial5A", "deviceMac is empty when getting send frames .");
            return arrayList;
        }
        byte[] bArrB = cmgVar.b();
        e(bArrB);
        LogUtil.b("SendStrategyInitial5A", "command is ", cpl.d(bArrB));
        coa coaVarC = c(deviceInfo.getDeviceMac() + cmgVar.g());
        cml cmlVarC = cnk.c().c(deviceInfo.getDeviceMac());
        coaVarC.d(cmlVarC);
        if (cmgVar.k() && d(deviceInfo) && cmlVarC != null) {
            if (!cjy.a(cmgVar, deviceInfo.getDeviceMac(), cmlVarC.b())) {
                LogUtil.d("SendStrategyInitial5A", "getSendFrames: encrypt failed");
                lng.c("CommandMessage", "encrypt command failed");
                return arrayList;
            }
            bArrB = cmgVar.b();
        }
        ArrayList<byte[]> arrayListD = coaVarC.d(bArrB);
        if (!coq.d(arrayListD)) {
            for (byte[] bArr : arrayListD) {
                cmd cmdVar = new cmd();
                cmdVar.d(cmgVar.c());
                cmdVar.c(cmgVar.i());
                cmdVar.a(cmgVar.e());
                cmdVar.b(cmgVar.g());
                ArrayList arrayList2 = new ArrayList(16);
                arrayList2.addAll(coaVarC.a(bArr));
                cmdVar.e(arrayList2);
                arrayList.add(cmdVar);
            }
        }
        return arrayList;
    }

    private void e(byte[] bArr) {
        if (cop.h()) {
            byte b2 = bArr[0];
            byte b3 = bArr[1];
            if (b2 != 9 || b3 == 3 || b3 == 4 || b3 == 18) {
                return;
            }
            LogUtil.b("R_SendStrategyInitial5A", "command is ", cpl.b(bArr, true));
        }
    }

    private boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("SendStrategyInitial5A", "deviceInfo is null");
            return false;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        return deviceInfo.getDeviceBtType() == 2 || cnc.c(deviceMac) || cni.b(deviceMac) || cmz.a(deviceMac);
    }

    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public void parseReceiveFrames(DeviceInfo deviceInfo, cmm cmmVar, MessageReceiveCallback messageReceiveCallback) {
        if (!b(deviceInfo, cmmVar)) {
            LogUtil.e("SendStrategyInitial5A", "the parameter input is invalid");
            return;
        }
        if (messageReceiveCallback != null) {
            e.put(deviceInfo.getDeviceMac(), messageReceiveCallback);
        }
        coa coaVarC = c(deviceInfo.getDeviceMac() + cmmVar.c());
        cml cmlVarC = cnk.c().c(deviceInfo.getDeviceMac());
        coaVarC.d(cmlVarC);
        byte[] bArrD = cmmVar.d();
        byte[] bArrB = coaVarC.b(bArrD.length, bArrD);
        if (bArrB == null || bArrB.length == 0) {
            LogUtil.e("SendStrategyInitial5A", "BLE package and length less than MTU threshold.");
            return;
        }
        List<cmi> listD = coaVarC.d(bArrB.length, bArrB);
        if (coq.d(listD)) {
            LogUtil.e("SendStrategyInitial5A", "sliceResponses is empty");
        } else {
            coaVarC.d(deviceInfo, cmmVar.b(), cmlVarC, listD, this.f1888a);
        }
    }

    @Override // com.huawei.devicesdk.strategy.SendStrategy
    public void destroy(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SendStrategyInitial5A", "destroy: identify is empty");
            return;
        }
        Iterator<Map.Entry<String, coa>> it = f1887b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, coa> next = it.next();
            if (next.getKey().contains(str)) {
                if (next.getValue() != null) {
                    next.getValue().b();
                }
                ReleaseLogUtil.d("DEVMGR_SendStrategyInitial5A", "destroy remove DataParserInitial5A identify is ", cpl.a(str));
                it.remove();
            }
        }
    }

    private coa c(String str) {
        coa coaVar = f1887b.containsKey(str) ? f1887b.get(str) : null;
        if (coaVar != null) {
            return coaVar;
        }
        coa coaVar2 = new coa();
        f1887b.put(str, coaVar2);
        return coaVar2;
    }

    private boolean b(DeviceInfo deviceInfo, cmm cmmVar) {
        if (deviceInfo == null) {
            LogUtil.e("SendStrategyInitial5A", "device is empty, and return");
            return false;
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("SendStrategyInitial5A", "device mac is empty, and return");
            return false;
        }
        if (cmmVar != null) {
            return true;
        }
        LogUtil.e("SendStrategyInitial5A", "frame is empty, and return");
        return false;
    }
}
