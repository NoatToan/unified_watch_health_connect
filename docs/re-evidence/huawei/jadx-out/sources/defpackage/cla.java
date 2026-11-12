package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cla extends HandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cma f1697b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cml f1698c;

    public cla(cml cmlVar) {
        this.f1698c = cmlVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("QueryBtBindStatusCommand", "deviceInfo is null");
            return getUnencryptedDeviceCommand(deviceInfo);
        }
        byte[] bArrE = e(deviceInfo.getDeviceMac());
        byte[] bArrB = b(deviceInfo);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrB.length + 11 + bArrE.length);
        byteBufferAllocate.put((byte) 1).put((byte) 15);
        byteBufferAllocate.put((byte) 1).put((byte) 0);
        byteBufferAllocate.put(bArrB).put((byte) 4);
        byteBufferAllocate.put((byte) 1).put((byte) 2);
        byteBufferAllocate.put((byte) 5).put((byte) 0);
        byteBufferAllocate.put(bArrE);
        byteBufferAllocate.put((byte) 9).put((byte) 0);
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(byteBufferAllocate.array());
        ReleaseLogUtil.c("DEVMGR_QueryBtBindStatusCommand", cku.d("010F"));
        return unencryptedDeviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "010F";
    }

    private byte[] b(DeviceInfo deviceInfo) {
        String strB = cqf.b();
        if (deviceInfo != null) {
            String strD = cpv.d(deviceInfo.getDeviceMac());
            if (!"".equals(strD)) {
                strB = cph.a(strD);
            } else {
                String strE = cos.e(deviceInfo.getDeviceMac(), BaseApplication.b());
                if (!"".equals(strE)) {
                    strB = cph.a(strE);
                    cpv.a(deviceInfo.getDeviceMac(), strE);
                    cos.c(deviceInfo.getDeviceMac(), "", "btsdk_sharedpreferences_bindid", BaseApplication.b());
                    a(deviceInfo);
                } else {
                    cpv.a(deviceInfo.getDeviceMac(), cph.b(strB));
                }
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put((byte) 3).put((byte) 6);
        byteBufferAllocate.put(cph.d(cph.b(strB)));
        return byteBufferAllocate.array();
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.b("QueryBtBindStatusCommand", "Enter updateBindKey().");
        if ("".equals(cpv.b(deviceInfo.getDeviceMac()))) {
            LogUtil.b("QueryBtBindStatusCommand", "updateBindKey() bindKey equals null.");
            cpv.d(deviceInfo.getDeviceMac(), cos.d(deviceInfo.getDeviceMac(), BaseApplication.b()));
            cos.c(deviceInfo.getDeviceMac(), "", "btsdk_sharedpreferences_name4", BaseApplication.b());
        }
    }

    private byte[] e(String str) {
        String strB;
        cmr cmrVarH = cnk.c().h(str);
        if (cmrVarH != null && cmrVarH.b() != null) {
            strB = cmrVarH.b();
        } else {
            strB = "FF:FF:FF:FF:FF:CC";
        }
        return cph.d(cph.b(7) + cph.b(strB.length()) + cph.b(strB));
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            cmhVar.e(13);
            cmhVar.d(50115);
            return cmhVar;
        }
        if (this.f1698c == null) {
            LogUtil.d("QueryBtBindStatusCommand", "mDeviceLinkParameter is null");
            cmhVar.e(13);
            cmhVar.d(50115);
            return cmhVar;
        }
        cqb cqbVarE = cku.e(cmmVar.d());
        if (cqbVarE == null) {
            LogUtil.e("QueryBtBindStatusCommand", "tlvFather is null");
            cmhVar.e(13);
            cmhVar.d(50115);
            return cmhVar;
        }
        cma cmaVarE = e(deviceInfo.getDeviceMac(), cqbVarE.b());
        this.f1697b = cmaVarE;
        if (cmaVarE == null) {
            LogUtil.d("QueryBtBindStatusCommand", "bondState parameter is incorrect.");
            cmhVar.e(13);
            cmhVar.d(50115);
            return cmhVar;
        }
        if (cni.b(deviceInfo.getDeviceMac())) {
            return c(cmhVar, deviceInfo.getDeviceMac(), deviceInfo.getDeviceBtType());
        }
        if (deviceInfo.getDeviceBtType() == 2) {
            return d(cmhVar, deviceInfo.getDeviceMac());
        }
        cmhVar.e(13);
        cmhVar.d(50115);
        return cmhVar;
    }

    private cma e(String str, List<cqa> list) {
        if (str == null || list == null || list.size() <= 0) {
            return null;
        }
        if (cjy.a(str)) {
            cjy.c(str, 0L);
        }
        cma cmaVar = new cma();
        for (cqa cqaVar : list) {
            int iA = cpb.a(cqaVar.b());
            String strC = cqaVar.c();
            byte b2 = (byte) iA;
            if (b2 == 1) {
                cmaVar.d(cpb.a(strC));
            } else if (b2 == 2) {
                cmaVar.c(cpb.a(strC));
            } else if (b2 == 4) {
                cmaVar.e(cpb.a(strC));
            } else if (b2 == 5) {
                cmaVar.b(cpb.a(strC));
            } else if (b2 == 9) {
                try {
                    cjy.c(str, Long.parseLong(strC, 16));
                } catch (NumberFormatException unused) {
                    LogUtil.d("QueryBtBindStatusCommand", "saveReceiveData NumberFormatException");
                }
            } else if (b2 == 127) {
                return null;
            }
        }
        return cmaVar;
    }

    private cmh c(cmh cmhVar, String str, int i) {
        if (i == 1 && this.f1697b.a() != 1) {
            LogUtil.b("QueryBtBindStatusCommand", "receive bond status incorrect response.hichainlite");
            cmhVar.e(13);
            cmhVar.d(50115);
            return cmhVar;
        }
        if (cnh.d().g(str)) {
            String strD = cni.d(str, 2);
            if (TextUtils.isEmpty(strD)) {
                cmhVar.e(14);
                cmhVar.d(50115);
                return cmhVar;
            }
            byte[] bArrE = cni.e();
            cnh.d().c(str, cph.d(bArrE));
            byte[] bArrE2 = cni.e();
            String strA = a(bArrE, cph.d(strD), bArrE2);
            LogUtil.b("QueryBtBindStatusCommand", "HiChainLite Retry15:bondKeyValue");
            this.mNextCommand = new clb(strA, cph.d(bArrE2));
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        if (i == 2 && this.f1697b.a() == 1) {
            String strD2 = cph.d(cni.e());
            this.mNextCommand = new clb(c(strD2, str), strD2);
            cmhVar.e(12);
            cmhVar.d(100000);
            return cmhVar;
        }
        this.mNextCommand = new ckc(this.f1698c.b(), false);
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    private String a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        cml cmlVar = this.f1698c;
        if (cmlVar != null && cmlVar.e() == 1) {
            LogUtil.b("QueryBtBindStatusCommand", "encrypt by gcm use aes_gcm");
            str = "AES/GCM/NoPadding";
        } else {
            str = "AES/CBC/PKCS5Padding";
        }
        return cph.d(ckg.d(str, bArr, bArr2, bArr3));
    }

    private String c(String str, String str2) {
        LogUtil.b("QueryBtBindStatusCommand", "Enter getBleBondKeyForHichainLite.");
        String strD = cph.d(cni.e());
        cnh.d().b(str2, strD);
        cpv.e(str2, 1, cqo.a(strD));
        cpv.e(str2, 2, cqo.a(strD));
        String strB = cnh.d().b(str2);
        byte[] bArrD = cph.d(str);
        return a(cph.d(strD), cph.d(strB), bArrD);
    }

    private cmh d(cmh cmhVar, String str) {
        int iB = this.f1697b.b();
        if (iB != 0) {
            this.f1698c.h(iB);
        } else {
            this.f1698c.h(128);
        }
        String strB = cpv.b(str);
        d(str, strB);
        if (this.f1697b.a() == 0 || TextUtils.isEmpty(strB)) {
            this.mNextCommand = new ckc(this.f1698c.b(), false);
        } else {
            cpv.b(str, cph.d(cqo.b(cjy.c(str, this.f1698c.b()))));
            this.mNextCommand = new ckq(this.f1698c.b(), true);
        }
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    private void d(String str, String str2) {
        if (str == null || str2 == null || str2.length() != 64) {
            return;
        }
        LogUtil.b("QueryBtBindStatusCommand", "Need to reset v2 key info empty.");
        cpv.d(str, "");
    }
}
