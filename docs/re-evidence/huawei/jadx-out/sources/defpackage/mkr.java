package defpackage;

import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.device.api.BacklogManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mkr extends VariableHandshakeGeneralCommandBase {
    mkr() {
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int constructCommandMessage(cmg cmgVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(14);
        byteBufferAllocate.put((byte) 1).put((byte) 49).put((byte) 1).put((byte) 0).put((byte) 2).put((byte) 0).put((byte) 3).put((byte) 0).put((byte) 4).put((byte) 0).put((byte) 5).put((byte) 0).put((byte) 6).put((byte) 0);
        if (cmgVar == null) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "commandMessage is null.");
            return 51;
        }
        cmgVar.a(byteBufferAllocate.array());
        return 50;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int processReceivedData(UniteDevice uniteDevice, String str) {
        if (StringUtils.g(str)) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "hexString is null.");
            return 51;
        }
        this.mCurrentCommandTag = getCurrentCommandTag();
        if (!mla.c(this.mCurrentCommandTag, str)) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "is not current command reply, abandon this reply command");
            return 54;
        }
        if (!mla.b(str)) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "processReceivedData checkResponseCode Failed.");
            return 51;
        }
        if (!b(str, uniteDevice)) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "processReceivedData resolveRelateSettingCommand Failed.");
            return 51;
        }
        DeviceInfo deviceInfo = uniteDevice.getDeviceInfo();
        if (deviceInfo == null) {
            return 51;
        }
        if (deviceInfo.getDeviceFactoryReset() != 1) {
            return 52;
        }
        LogUtil.j("QuerySettingRelateCapabilityCommand", "processReceivedData factory reset");
        if (b(deviceInfo)) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "processReceivedData factory reset and assistant device, so disconnect the device: ", cpl.e(deviceInfo.getDeviceMac()));
            return 51;
        }
        if (deviceInfo.getIsDemoWatch() != 1) {
            this.mNextVariableHandshakeCommand = new mkz(deviceInfo);
            deviceInfo.setDeviceConnectState(11);
            ReleaseLogUtil.d("R_QuerySettingRelateCapabilityCommand", "factory reset sync account show");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ON_HOME_ACTIVITY_FLAG".concat(deviceInfo.getDeviceMac()), String.valueOf(true), null);
            e(deviceInfo.getDeviceMac());
            mla.c(uniteDevice, 11);
        } else {
            this.mNextVariableHandshakeCommand = new mkz(deviceInfo);
        }
        ReleaseLogUtil.d("QuerySettingRelateCapabilityCommand", "factory reset deleteBackLogCache");
        ((BacklogManagerApi) Services.b("ToDoCenter", BacklogManagerApi.class)).deleteBackLogCache(deviceInfo.getDeviceMac());
        return 50;
    }

    private void e(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(str), "UNCOMPLETE", null);
    }

    private boolean b(DeviceInfo deviceInfo) {
        List<com.huawei.health.devicemgr.business.entity.DeviceInfo> listE = mkm.d().e();
        if (listE.size() == 0) {
            return false;
        }
        for (com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo2 : listE) {
            if (deviceInfo.getDeviceMac().equals(deviceInfo2.getDeviceIdentify()) && deviceInfo2.getRelationship().equals("assistant_relationship")) {
                mkm.d().c(deviceInfo2.getDeviceIdentify());
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public String getCurrentCommandTag() {
        return "0131";
    }

    private boolean b(String str, UniteDevice uniteDevice) {
        ees eesVarE = mla.e(str);
        if (eesVarE == null) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "resolveRelateSettingCommand, tlvFather is null.");
            return false;
        }
        ExternalDeviceCapability capability = uniteDevice.getCapability();
        if (capability == null) {
            LogUtil.e("QuerySettingRelateCapabilityCommand", "externalDeviceCapability is null.");
            return false;
        }
        DeviceCapability compatibleCapacity = capability.getCompatibleCapacity();
        if (compatibleCapacity == null) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "deviceCapability is null.");
            return false;
        }
        Iterator<eew> it = eesVarE.e().iterator();
        while (it.hasNext()) {
            d(compatibleCapacity, it.next());
        }
        capability.setCompatibleCapacity(compatibleCapacity);
        cox.a(uniteDevice.getIdentify(), compatibleCapacity);
        return true;
    }

    private void d(DeviceCapability deviceCapability, eew eewVar) {
        LogUtil.a("QuerySettingRelateCapabilityCommand", "the case is ", Integer.valueOf(CommonUtil.v(eewVar.e())));
        switch (CommonUtil.v(eewVar.e())) {
            case 1:
                e(deviceCapability, eewVar);
                break;
            case 2:
                g(deviceCapability, eewVar);
                break;
            case 3:
                j(deviceCapability, eewVar);
                break;
            case 4:
                b(deviceCapability, eewVar);
                break;
            case 5:
                c(deviceCapability, eewVar);
                break;
            case 6:
                a(deviceCapability, eewVar);
                break;
            default:
                LogUtil.j("QuerySettingRelateCapabilityCommand", "resolveRelateSettingCommand default");
                break;
        }
    }

    private void a(DeviceCapability deviceCapability, eew eewVar) {
        if (deviceCapability == null || eewVar == null) {
            LogUtil.j("params is null", new Object[0]);
        } else {
            deviceCapability.configureHmsNotifyUpdate(CommonUtil.v(eewVar.b()) == 1);
        }
    }

    private void c(DeviceCapability deviceCapability, eew eewVar) {
        if (deviceCapability == null || eewVar == null) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "capability or tlv is null");
        } else {
            deviceCapability.configureHmsAutoUpdateWifi(CommonUtil.v(eewVar.b()) == 1);
        }
    }

    private void b(DeviceCapability deviceCapability, eew eewVar) {
        if (deviceCapability == null || eewVar == null) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "capability or tlv is null");
        } else {
            deviceCapability.configureHmsAutoUpdate(CommonUtil.v(eewVar.b()) == 1);
        }
    }

    private void j(DeviceCapability deviceCapability, eew eewVar) {
        if (deviceCapability == null || eewVar == null) {
            LogUtil.j("capability tlv is null", new Object[0]);
        } else {
            deviceCapability.setSupportSmartWatchVersionStatus(true);
            deviceCapability.configureSmartWatchVersionTypeValue(CommonUtil.v(eewVar.b()));
        }
    }

    private void e(DeviceCapability deviceCapability, eew eewVar) {
        if (deviceCapability == null || eewVar == null) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "capability tlv is null");
            return;
        }
        byte[] bArrC = eeq.c(eewVar.b());
        LogUtil.a("QuerySettingRelateCapabilityCommand", "string bitmap : ", eewVar.b());
        deviceCapability.configureSupportLegalPrivacy(CommonUtil.a(bArrC, 0));
        deviceCapability.configureSupportLegalUserAgreement(CommonUtil.a(bArrC, 1));
        deviceCapability.configureSupportOpenSourceOpen(CommonUtil.a(bArrC, 2));
        deviceCapability.configureSupportLegalServiceStatement(CommonUtil.a(bArrC, 3));
        deviceCapability.configureSupportLegalSourceStatement(CommonUtil.a(bArrC, 4));
        deviceCapability.configureSupportLegalSystemWebView(CommonUtil.a(bArrC, 5));
        deviceCapability.configureSupportHarmonyAgreement(CommonUtil.a(bArrC, 6));
    }

    private void g(DeviceCapability deviceCapability, eew eewVar) {
        if (deviceCapability == null || eewVar == null) {
            LogUtil.j("QuerySettingRelateCapabilityCommand", "updateSelfUploadDeviceLogCapability capability tlv is null");
            return;
        }
        byte[] bArrC = eeq.c(eewVar.b());
        LogUtil.a("QuerySettingRelateCapabilityCommand", "string bitmap : ", eewVar.b());
        deviceCapability.setSupportSelfUploadDeviceLog(CommonUtil.a(bArrC, 0));
        deviceCapability.configureSupportCoreSleepNewFile(CommonUtil.a(bArrC, 1));
        deviceCapability.configureSupportRriNewFile(CommonUtil.a(bArrC, 2));
        deviceCapability.configureIsSupportUploadGpsAndPdrFile(CommonUtil.a(bArrC, 3));
    }
}
