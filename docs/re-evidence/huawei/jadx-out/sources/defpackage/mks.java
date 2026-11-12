package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.utils.StringUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class mks extends VariableHandshakeGeneralCommandBase {
    mks() {
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int constructCommandMessage(cmg cmgVar) {
        LogUtil.j("DeviceReportUserSelectCommand", "constructCommandMessage not set commandMessage.");
        return 50;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int processReceivedData(UniteDevice uniteDevice, String str) {
        if (StringUtils.g(str)) {
            LogUtil.j("DeviceReportUserSelectCommand", "hexString is null.");
            return 51;
        }
        if (uniteDevice == null) {
            LogUtil.j("DeviceReportUserSelectCommand", "device is null.");
            return 51;
        }
        this.mCurrentCommandTag = getCurrentCommandTag();
        if (!mla.c(this.mCurrentCommandTag, str)) {
            LogUtil.j("DeviceReportUserSelectCommand", "is not current command reply, abandon this reply command");
            return 54;
        }
        if (!mla.b(str)) {
            LogUtil.j("DeviceReportUserSelectCommand", "processReceivedData checkResponseCode Failed.");
            return 51;
        }
        if (e(str)) {
            LogUtil.j("DeviceReportUserSelectCommand", "resolveUserSelectRestoreFactory user select reset factory");
            boolean zD = eey.d(cox.c(uniteDevice), TsExtractor.TS_STREAM_TYPE_AC4);
            if (zD) {
                LogUtil.a("DeviceReportUserSelectCommand", "support diff account pairing optimization and send corresponding broadcast");
                mla.c(uniteDevice, 14);
                mkn.e().sendDeviceData(a(uniteDevice));
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException unused) {
                    LogUtil.e("DeviceReportUserSelectCommand", "Occur exception when thread sleeping");
                }
            } else {
                mla.c(uniteDevice, 10);
            }
            if (!uniteDevice.getDeviceInfo().isReconnect()) {
                LogUtil.j("DeviceReportUserSelectCommand", "first pair, device reset factory");
                cnf.d().c(uniteDevice.getDeviceInfo(), !zD);
                if (zD) {
                    coi.b().e(uniteDevice.getDeviceInfo());
                }
            }
        } else if (!uniteDevice.getDeviceInfo().isReconnect()) {
            cnf.d().c(uniteDevice.getDeviceInfo(), true);
        }
        return 51;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public String getCurrentCommandTag() {
        return "1A06";
    }

    public static boolean e(String str) {
        ees eesVarE = mla.e(str);
        if (eesVarE == null) {
            LogUtil.j("DeviceReportUserSelectCommand", "tlvFather is null.");
            return false;
        }
        for (eew eewVar : eesVarE.e()) {
            if (CommonUtil.v(eewVar.e()) == 1) {
                if (CommonUtil.v(eewVar.b()) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private DeviceCommand a(UniteDevice uniteDevice) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(26);
        deviceCommand.setCommandID(6);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put(Ascii.DEL).put((byte) 4).put(eeq.h(100000));
        byte[] bArrArray = byteBufferAllocate.array();
        deviceCommand.setDataContent(bArrArray);
        deviceCommand.setDataLen(bArrArray.length);
        deviceCommand.setmIdentify(uniteDevice.getIdentify());
        LogUtil.a("DeviceReportUserSelectCommand", "constructConfirmCommand deviceCommand:", deviceCommand.toString());
        return deviceCommand;
    }
}
