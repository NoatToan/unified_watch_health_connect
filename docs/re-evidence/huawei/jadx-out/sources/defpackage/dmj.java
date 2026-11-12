package defpackage;

import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class dmj implements MessageReceiveCallback {
    private final BleTaskQueueUtil e;

    public dmj(BleTaskQueueUtil bleTaskQueueUtil) {
        this.e = bleTaskQueueUtil;
    }

    @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
    public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
        if (cmmVar == null) {
            LogUtil.a("PluginDevice_UdsMessageReceiveCallback", "UdsMessageReceiveCallback#onDataReceived dataContents is null");
            return;
        }
        String strB = cmmVar.b();
        byte[] bArrD = cmmVar.d();
        LogUtil.a("PluginDevice_UdsMessageReceiveCallback", "UdsMessageReceiveCallback#onDataReceived characterUuid is " + strB);
        if (StringUtils.j(strB)) {
            LogUtil.a("PluginDevice_UdsMessageReceiveCallback", "UdsMessageReceiveCallback#onDataReceived do onCharacterChanged");
            doq.e().b(new drh.a().c(strB).e(bArrD).e());
            return;
        }
        LogUtil.a("PluginDevice_UdsMessageReceiveCallback", "UdsMessageReceiveCallback#onDataReceived characterUuid is null");
    }

    @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
    public void onChannelEnable(DeviceInfo deviceInfo, String str, int i) {
        LogUtil.a("PluginDevice_UdsMessageReceiveCallback", "UdsMessageReceiveCallback#onChannelEnable");
        BleTaskQueueUtil bleTaskQueueUtil = this.e;
        if (bleTaskQueueUtil != null) {
            bleTaskQueueUtil.e();
        }
    }
}
