package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ckn extends HandshakeGeneralCommandBase {
    ckn() {
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("DeviceServiceCapabilityConsultCommand", "deviceInfo is null");
            return super.getDeviceCommand(deviceInfo);
        }
        return b(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.e("DeviceServiceCapabilityConsultCommand", "Get ServiceCapability parameterCheck Failed.");
            cmhVar.e(13);
            cmhVar.d(50102);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        if (!cku.d(bArrD)) {
            LogUtil.b("DeviceServiceCapabilityConsultCommand", "Get ServiceCapability checkResponseCode Failed.");
            cmhVar.e(13);
            cmhVar.d(50102);
            return cmhVar;
        }
        LogUtil.b("DeviceServiceCapabilityConsultCommand", "Get ServiceCapability checkResponseCode Success.");
        ArrayList arrayList = new ArrayList();
        if (!d(deviceInfo, bArrD, arrayList)) {
            LogUtil.e("DeviceServiceCapabilityConsultCommand", "Get ServiceCapability parseData Failed.");
            cmhVar.e(13);
            cmhVar.d(50102);
            return cmhVar;
        }
        cnk.c().k(deviceInfo.getDeviceMac());
        this.mNextCommand = new cki(arrayList);
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0102";
    }

    private cmg b(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate;
        ArrayList arrayList = new ArrayList();
        if (deviceInfo.isMultiLink()) {
            arrayList.add(1);
            arrayList.add(23);
        } else {
            arrayList.addAll(cor.e());
        }
        int size = arrayList.size();
        cmr cmrVarH = cnk.c().h(deviceInfo.getDeviceMac());
        if (cmrVarH != null && cmrVarH.d() > 0) {
            byteBufferAllocate = ByteBuffer.allocate(size + 6);
        } else {
            byteBufferAllocate = ByteBuffer.allocate(size + 3);
        }
        byteBufferAllocate.put((byte) 1).put((byte) 2);
        byteBufferAllocate.put((byte) 1).put(cku.b(size - 1));
        for (int i = 1; i < size; i++) {
            byteBufferAllocate.put(cku.b(((Integer) arrayList.get(i)).intValue()));
        }
        if (cmrVarH != null && cmrVarH.d() > 0) {
            byteBufferAllocate.put((byte) 3);
            byteBufferAllocate.put(cku.b(String.valueOf(cmrVarH.d()).length()));
            byteBufferAllocate.put(cku.b(cmrVarH.d()));
        }
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        deviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_DeviceServiceCapabilityConsultCommand", cku.d("0102"));
        return deviceCommand;
    }

    private boolean d(DeviceInfo deviceInfo, byte[] bArr, List<Integer> list) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("DeviceServiceCapabilityConsultCommand", "tlvFather is null.");
            return false;
        }
        List<cqa> listB = cqbVarE.b();
        if (coq.d(listB)) {
            LogUtil.e("DeviceServiceCapabilityConsultCommand", "TLV info is incorrect.");
            return false;
        }
        String strC = listB.get(0).c();
        ArrayList arrayList = new ArrayList();
        if (deviceInfo.isMultiLink()) {
            arrayList.add(1);
            arrayList.add(23);
        }
        arrayList.addAll(cor.e());
        if (TextUtils.isEmpty(strC)) {
            LogUtil.e("DeviceServiceCapabilityConsultCommand", "servicesSupportInfo length exception");
            return false;
        }
        e(strC, arrayList, list);
        return true;
    }

    private void e(String str, List<Integer> list, List<Integer> list2) {
        list2.add(1);
        int length = str.length() / 2;
        int size = list.size();
        for (int i = 0; i < length; i++) {
            int iC = c(str, i);
            if (i < size - 1 && iC == 1) {
                list2.add(list.get(i + 1));
            }
        }
    }

    private int c(String str, int i) {
        int i2 = i * 2;
        return cpb.a(str.substring(i2, i2 + 2));
    }
}
