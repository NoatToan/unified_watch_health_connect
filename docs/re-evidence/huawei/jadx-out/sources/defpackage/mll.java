package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class mll {
    public static void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwGetAccountIdUtil", "sendAccount deviceInfo is null");
            return;
        }
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportAccount()) {
            return;
        }
        ReleaseLogUtil.d("R_HwGetAccountIdUtil", "support sendAccount");
        HiHealthManager.d(BaseApplication.getContext()).fetchAccountInfo(new c());
    }

    static class c implements HiCommonListener {
        c() {
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            String huid = obj instanceof HiAccountInfo ? ((HiAccountInfo) obj).getHuid() : "";
            if (huid == null || "".equals(huid) || "com.huawei.health".equals(huid)) {
                LogUtil.j("HwGetAccountIdUtil", "AccountLoginReceiver userId is empty");
                return;
            }
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(26);
            deviceCommand.setCommandID(1);
            String strA = eeq.a(huid);
            String strD = eeq.d(strA.length() / 2);
            String strD2 = eeq.d(1);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD2.length() / 2) + (strD.length() / 2) + (strA.length() / 2));
            byteBufferAllocate.put(eeq.c(strD2));
            byteBufferAllocate.put(eeq.c(strD));
            byteBufferAllocate.put(eeq.c(strA));
            deviceCommand.setDataLen(byteBufferAllocate.array().length);
            deviceCommand.setDataContent(byteBufferAllocate.array());
            LogUtil.a("HwGetAccountIdUtil", "sendDeviceData(): Command:", eeq.d(deviceCommand.getServiceID()), eeq.d(deviceCommand.getCommandID()), eeq.e(deviceCommand.getDataContent()));
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.j("HwGetAccountIdUtil", "get account: onFailure");
        }
    }
}
