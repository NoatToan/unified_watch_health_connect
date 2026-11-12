package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cki extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile List<Integer> f1680b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1679a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedHashMap<String, Boolean> f1681c = new LinkedHashMap<>(16);

    cki(List<Integer> list) {
        this.f1680b = list;
    }

    public static cms e(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "deviceCapability is null");
            return new cms(false);
        }
        if (deviceCapability.isSupportExpandCapability()) {
            LogUtil.b("DeviceCommandCapabilityConsultCommand", "isSupportExpandCapability");
            return new cms(true, new ckk());
        }
        LogUtil.b("DeviceCommandCapabilityConsultCommand", "is not SupportExpandCapability");
        return ckl.b(deviceCapability);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("DeviceCommandCapabilityConsultCommand", "deviceInfo is null");
            return super.getDeviceCommand(deviceInfo);
        }
        cqp.a(100043, deviceInfo.getDeviceName(), "", "");
        return a(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "processReceivedData parameterCheck Failed.");
            cmhVar.e(13);
            cmhVar.d(50103);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        cpl.d("DeviceCommandCapabilityConsultCommand", bArrD, "processReceivedData dataInfos:");
        if (!cku.d(bArrD)) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "Get CommandCapability checkResonpeCode Failed.");
            cmhVar.e(13);
            cmhVar.d(50103);
            return cmhVar;
        }
        LogUtil.b("DeviceCommandCapabilityConsultCommand", "Get CommandCapability checkResonpeCode Success.");
        String deviceMac = deviceInfo.getDeviceMac();
        DeviceCapability deviceCapabilityD = cnk.c().d(deviceMac);
        if (deviceCapabilityD == null) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "processReceivedData deviceCapability is null.");
            cmhVar.e(13);
            cmhVar.d(50103);
            return cmhVar;
        }
        clf.d(deviceCapabilityD, deviceInfo.getDeviceType());
        if (!d(bArrD, deviceCapabilityD)) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "CommandCapability parse Exception.");
            cmhVar.e(13);
            cmhVar.d(50103);
            return cmhVar;
        }
        b(this.f1681c, deviceCapabilityD);
        clf.c(deviceInfo, deviceCapabilityD);
        cnk.c().b(deviceMac, deviceCapabilityD);
        cmh cmhVarA = a(deviceCapabilityD, cmhVar);
        LogUtil.b("DeviceCommandCapabilityConsultCommand", "isSupportAccountSwitch: ", Boolean.valueOf(deviceCapabilityD.isSupportAccountSwitch()), " isSupportExpandCapability: ", Boolean.valueOf(deviceCapabilityD.isSupportExpandCapability()));
        if (!deviceCapabilityD.isSupportAccountSwitch() && !deviceCapabilityD.isSupportExpandCapability()) {
            cnk.c().c(deviceMac, cnk.c().b(deviceMac));
        }
        cqp.a(100044, deviceInfo.getDeviceName(), String.valueOf(cmhVarA.e()), String.valueOf(cmhVarA.b()));
        return cmhVarA;
    }

    private cmh a(DeviceCapability deviceCapability, cmh cmhVar) {
        cms cmsVarE = e(deviceCapability);
        if (!cmsVarE.c()) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "judgeExpandCapability Failed");
            cmhVar.e(13);
            cmhVar.d(50103);
            return cmhVar;
        }
        this.mNextCommand = cmsVarE.e();
        if (this.mNextCommand == null) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "capability success, start oobe");
            cmhVar.e(53);
            cmhVar.d(100000);
            return cmhVar;
        }
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0103";
    }

    private cmg a(DeviceInfo deviceInfo) {
        this.f1679a = coy.e();
        if (this.f1680b == null || this.f1680b.size() <= 0) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "get servicesList exception");
            return super.getDeviceCommand(deviceInfo);
        }
        Map<Integer, List<Integer>> mapD = cor.d(this.f1679a);
        int size = 0;
        for (Integer num : this.f1680b) {
            num.intValue();
            List<Integer> list = mapD.get(num);
            if (list != null && list.size() > 0) {
                size = size + 3 + list.size() + 2;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(cku.b(size).length + 3 + size);
        byteBufferAllocate.put((byte) 1).put((byte) 3).put(cph.f(129)).put(cku.b(size));
        for (Integer num2 : this.f1680b) {
            int iIntValue = num2.intValue();
            List<Integer> list2 = mapD.get(num2);
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                byteBufferAllocate.put((byte) 2).put((byte) 1).put(cku.b(iIntValue));
                byteBufferAllocate.put((byte) 3).put(cku.b(size2));
                try {
                    Iterator<Integer> it = list2.iterator();
                    while (it.hasNext()) {
                        byteBufferAllocate.put(cku.b(it.next().intValue()));
                    }
                } catch (BufferOverflowException unused) {
                    LogUtil.e("DeviceCommandCapabilityConsultCommand", "BufferOverflowException");
                }
            }
        }
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        deviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_DeviceCommandCapabilityConsultCommand", cku.d("0103"));
        return deviceCommand;
    }

    private boolean d(byte[] bArr, DeviceCapability deviceCapability) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "tlvFather is null.");
            return false;
        }
        List<cqb> listE = cqbVarE.e();
        if (coq.d(listE)) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "tlvFathers list is null.");
            return false;
        }
        for (cqb cqbVar : listE) {
            if (cqbVar == null) {
                LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData tlvFatherInfo is null.");
                return false;
            }
            if (!c(cqbVar, deviceCapability)) {
                LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData exception.");
                return false;
            }
        }
        return true;
    }

    private boolean c(cqb cqbVar, DeviceCapability deviceCapability) {
        if (coq.d(cqbVar.b())) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData tlvList is empty");
            return false;
        }
        String strC = "";
        int iA = 0;
        for (cqa cqaVar : cqbVar.b()) {
            int iA2 = cpb.a(cqaVar.b());
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData subNodeType is:", Integer.valueOf(iA2));
            byte b2 = (byte) iA2;
            if (b2 == 2) {
                iA = cpb.a(cqaVar.c());
                if (iA == 0) {
                    LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData serviceId exception.");
                    return false;
                }
            } else if (b2 == 4) {
                strC = cqaVar.c();
                if (TextUtils.isEmpty(strC) || iA == 0) {
                    LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData commandSupportInfo exception.");
                    return false;
                }
                LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData commandSupportInfo is:", strC);
                d(iA, strC, this.f1679a);
            } else {
                LogUtil.b("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData default");
            }
        }
        if (!TextUtils.isEmpty(strC) && iA != 0) {
            return true;
        }
        LogUtil.e("DeviceCommandCapabilityConsultCommand", "parseTlvSubNodeData exception.");
        return false;
    }

    private void d(int i, String str, boolean z) {
        List<Integer> list = cor.d(z).get(Integer.valueOf(i));
        if (list == null) {
            LogUtil.e("DeviceCommandCapabilityConsultCommand", "commandIdList is null");
            return;
        }
        int length = str.length() / 2;
        for (int i2 = 0; i2 < length; i2++) {
            boolean zD = d(str, i2);
            if (list.size() <= i2) {
                LogUtil.b("DeviceCommandCapabilityConsultCommand", "handleDeviceCommandSupportInfo finish");
            }
            if (i2 < list.size()) {
                this.f1681c.put(i + "." + list.get(i2).intValue(), Boolean.valueOf(zD));
            }
        }
    }

    private boolean d(String str, int i) {
        int i2 = i * 2;
        return cpb.a(str.substring(i2, i2 + 2)) == 1;
    }

    private void b(LinkedHashMap<String, Boolean> linkedHashMap, DeviceCapability deviceCapability) {
        cle.a(linkedHashMap, deviceCapability);
    }
}
