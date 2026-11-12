package defpackage;

import com.google.gson.JsonSyntaxException;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.utils.StringUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mkq extends VariableHandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41829a = false;
    private boolean e = false;

    mkq() {
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int constructCommandMessage(cmg cmgVar) {
        d(cmgVar);
        return 50;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int processReceivedData(UniteDevice uniteDevice, String str) {
        if (StringUtils.g(str)) {
            LogUtil.e("QueryDeviceWorkModeCommand", "hexString is null.");
            return 51;
        }
        this.mCurrentCommandTag = getCurrentCommandTag();
        if (!mla.c(this.mCurrentCommandTag, str)) {
            LogUtil.j("QueryDeviceWorkModeCommand", "is not current command reply, abandon this reply command");
            return 54;
        }
        if (!mla.b(str)) {
            LogUtil.e("QueryDeviceWorkModeCommand", "processReceivedData checkResponseCode Failed.");
            return 51;
        }
        return e(uniteDevice, str);
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public String getCurrentCommandTag() {
        return "2601";
    }

    private void d(cmg cmgVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put((byte) 38).put((byte) 1).put((byte) 2).put((byte) 0).put((byte) 1).put((byte) 0);
        cmgVar.a(byteBufferAllocate.array());
    }

    private int e(UniteDevice uniteDevice, String str) {
        ees eesVarE = mla.e(str);
        if (eesVarE == null) {
            LogUtil.e("QueryDeviceWorkModeCommand", "tlvFather is null.");
            return 51;
        }
        List<eew> listE = eesVarE.e();
        if (njy.e(listE)) {
            LogUtil.e("QueryDeviceWorkModeCommand", "tlvList is empty.");
            return 51;
        }
        if (uniteDevice.getCapability() == null) {
            LogUtil.e("QueryDeviceWorkModeCommand", "capabilityJsonString is null");
            return 51;
        }
        DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
        if (deviceInfo == null) {
            LogUtil.e("QueryDeviceWorkModeCommand", "deviceInfo is null");
            return 51;
        }
        int iV = 0;
        for (eew eewVar : listE) {
            byte bV = (byte) CommonUtil.v(eewVar.e());
            if (bV == 1) {
                int iV2 = CommonUtil.v(eewVar.b());
                this.e = true;
                deviceInfo.setAutoDetectSwitchStatus(iV2);
            } else if (bV == 2) {
                iV = CommonUtil.v(eewVar.b());
                this.f41829a = true;
                deviceInfo.setFootWearPosition(iV);
            }
        }
        uniteDevice.setDeviceInfo(deviceInfo);
        a(iV);
        return b(uniteDevice);
    }

    private int b(UniteDevice uniteDevice) {
        try {
            ExternalDeviceCapability capability = uniteDevice.getCapability();
            if (capability == null) {
                LogUtil.e("QueryDeviceWorkModeCommand", "externalDeviceCapability is null");
                return 51;
            }
            DeviceCapability compatibleCapacity = capability.getCompatibleCapacity();
            if (compatibleCapacity == null) {
                LogUtil.e("QueryDeviceWorkModeCommand", "deviceCapability is null");
                return 51;
            }
            compatibleCapacity.configureSupportAutoDetectMode(this.f41829a);
            compatibleCapacity.configureSupportFootWear(this.e);
            if (!compatibleCapacity.isSupportAccountSwitch() && !compatibleCapacity.isSupportChangePhonePair()) {
                if (!compatibleCapacity.isSupportSettingRelated()) {
                    return 52;
                }
                this.mNextVariableHandshakeCommand = new mkr();
                return 50;
            }
            this.mNextVariableHandshakeCommand = new mkw(uniteDevice);
            return 50;
        } catch (JsonSyntaxException unused) {
            LogUtil.e("QueryDeviceWorkModeCommand", "get deviceCapability JsonSyntaxException");
            return 52;
        }
    }

    private void a(int i) {
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "QueryDeviceWorkModeCommand");
        if (deviceList == null || deviceList.size() <= 0) {
            LogUtil.a("QueryDeviceWorkModeCommand", "usedDeviceList is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int size = deviceList.size() - 1; size >= 0; size--) {
            com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo = deviceList.get(size);
            if (deviceInfo != null && mxg.b().a(deviceInfo)) {
                LogUtil.a("QueryDeviceWorkModeCommand", "processDeviceMode isSupportMultiConnect:", cpl.e(deviceInfo.getDeviceIdentify()));
            } else if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                int autoDetectSwitchStatus = deviceInfo.getAutoDetectSwitchStatus();
                if ((i == 0 && autoDetectSwitchStatus == 0) || (i == 1 && autoDetectSwitchStatus == 1)) {
                    arrayList.add(deviceInfo.getDeviceIdentify());
                }
            }
        }
        if (arrayList.size() > 0) {
            mkn.e().unPair(arrayList, false);
        }
    }
}
