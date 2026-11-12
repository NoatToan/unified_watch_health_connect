package defpackage;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.p2p.IdentityInfo;
import com.huawei.unitedevice.p2p.MessageParcel;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xiw {
    public static cmg c(UniteDevice uniteDevice, int i, int i2, String str, String str2, int i3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("P2pCommandUtil", "DeviceCommand srcPkgName or destPkgName is null");
            return null;
        }
        HashMap map = new HashMap(2);
        map.put("identitySrcInfoKey", new IdentityInfo(str, ""));
        map.put("identityDestInfoKey", new IdentityInfo(str2, ""));
        byte[] bArrA = a(uniteDevice, i, i2, map, null);
        cmg cmgVar = new cmg();
        cmgVar.a(bArrA);
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.b(i3);
        return cmgVar;
    }

    public static cmg c(UniteDevice uniteDevice, int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, MessageParcel messageParcel) {
        byte[] data = messageParcel.getData();
        if (identityInfo == null || identityInfo2 == null) {
            LogUtil.e("P2pCommandUtil", "getSendCommand pkgInfo is null");
            return null;
        }
        if (TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo2.getPackageName())) {
            LogUtil.e("P2pCommandUtil", "getSendCommand srcPkgName or destPkgName is null");
            return null;
        }
        if (data == null || data.length == 0) {
            LogUtil.e("P2pCommandUtil", "getSendCommand data is valid");
            return null;
        }
        HashMap map = new HashMap(2);
        map.put("identitySrcInfoKey", identityInfo);
        map.put("identityDestInfoKey", identityInfo2);
        cmg cmgVarC = c(messageParcel, a(uniteDevice, i, 2, map, data));
        cmgVarC.b(messageParcel.getPrior());
        return cmgVarC;
    }

    public static cmg b(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, int i2, int i3) {
        if (identityInfo == null || identityInfo2 == null) {
            LogUtil.e("P2pCommandUtil", "getResponseCommand pkgInfo is null");
            return null;
        }
        if (TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo2.getPackageName())) {
            LogUtil.e("P2pCommandUtil", "getResponseCommand srcPkgName or destPkgName is null");
            return null;
        }
        byte[] bArrC = c(i, identityInfo, identityInfo2, i2, i3);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrC.length + 2);
        byteBufferAllocate.put((byte) 52).put((byte) 1).put(bArrC);
        cmg cmgVar = new cmg();
        cmgVar.a(byteBufferAllocate.array());
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        return cmgVar;
    }

    private static byte[] c(int i, IdentityInfo identityInfo, IdentityInfo identityInfo2, int i2, int i3) {
        byte[] bArrD = d(false, i, 3, identityInfo, identityInfo2);
        byte[] bArrF = cph.f(8);
        byte[] bArrG = cph.g(i3);
        byte[] bArrE = cph.e(bArrG.length);
        byte[] bArr = new byte[bArrD.length + bArrF.length + bArrG.length + bArrE.length];
        System.arraycopy(bArrD, 0, bArr, 0, bArrD.length);
        System.arraycopy(bArrF, 0, bArr, bArrD.length, bArrF.length);
        System.arraycopy(bArrE, 0, bArr, bArrD.length + bArrF.length, bArrE.length);
        System.arraycopy(bArrG, 0, bArr, bArrD.length + bArrF.length + bArrE.length, bArrG.length);
        return bArr;
    }

    private static byte[] a(UniteDevice uniteDevice, int i, int i2, Map<String, IdentityInfo> map, byte[] bArr) {
        byte b2;
        boolean z;
        IdentityInfo identityInfo = map.get("identitySrcInfoKey");
        IdentityInfo identityInfo2 = map.get("identityDestInfoKey");
        if (identityInfo == null || identityInfo2 == null) {
            return null;
        }
        boolean zB = col.b(uniteDevice, MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA);
        LogUtil.b("P2pCommandUtil", "isSupportBtProxy:", Boolean.valueOf(zB), "srcInfo.getPackageName():", identityInfo.getPackageName(), "destInfo.getPackageName():", identityInfo2.getPackageName());
        if (zB && "hw.unitedevice.btproxy".equals(identityInfo.getPackageName()) && "com.huawei.health.btproxy".equals(identityInfo2.getPackageName())) {
            b2 = 57;
            z = true;
        } else {
            b2 = 52;
            z = false;
        }
        byte[] bArrD = d(z, i, i2, identityInfo, identityInfo2);
        if (bArr != null && bArr.length > 0) {
            byte[] bArrF = cph.f(7);
            byte[] bArrE = cph.e(bArr.length);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrD.length + 2 + bArrF.length + bArrE.length + bArr.length);
            byteBufferAllocate.put(b2).put((byte) 1).put(bArrD).put(bArrF).put(bArrE).put(bArr);
            return byteBufferAllocate.array();
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrD.length + 2);
        byteBufferAllocate2.put(b2).put((byte) 1).put(bArrD);
        return byteBufferAllocate2.array();
    }

    private static byte[] d(int i) {
        byte[] bArrF = cph.f(1);
        byte[] bArrF2 = cph.f(i);
        byte[] bArrE = cph.e(bArrF2.length);
        byte[] bArr = new byte[bArrF.length + bArrF2.length + bArrE.length];
        System.arraycopy(bArrF, 0, bArr, 0, bArrF.length);
        System.arraycopy(bArrE, 0, bArr, bArrF.length, bArrE.length);
        System.arraycopy(bArrF2, 0, bArr, bArrF.length + bArrE.length, bArrF2.length);
        return bArr;
    }

    private static byte[] a(int i) {
        byte[] bArrF = cph.f(2);
        byte[] bArrD = cph.d(cph.d(i));
        byte[] bArrE = cph.e(bArrD.length);
        byte[] bArr = new byte[bArrF.length + bArrD.length + bArrE.length];
        System.arraycopy(bArrF, 0, bArr, 0, bArrF.length);
        System.arraycopy(bArrE, 0, bArr, bArrF.length, bArrE.length);
        System.arraycopy(bArrD, 0, bArr, bArrF.length + bArrE.length, bArrD.length);
        return bArr;
    }

    private static byte[] e(int i, String str) {
        byte[] bArrF = cph.f(i);
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        byte[] bArr = new byte[bArrF.length + bArrE.length + bArrE2.length];
        System.arraycopy(bArrF, 0, bArr, 0, bArrF.length);
        System.arraycopy(bArrE2, 0, bArr, bArrF.length, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrF.length + bArrE2.length, bArrE.length);
        return bArr;
    }

    private static byte[] d(boolean z, int i, int i2, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        byte[] bArrD = d(i2);
        byte[] bArrA = a(i);
        if (z) {
            byte[] bArr = new byte[bArrD.length + bArrA.length];
            System.arraycopy(bArrD, 0, bArr, 0, bArrD.length);
            System.arraycopy(bArrA, 0, bArr, bArrD.length, bArrA.length);
            return bArr;
        }
        byte[] bArrE = e(3, identityInfo.getPackageName());
        byte[] bArrE2 = e(4, identityInfo2.getPackageName());
        if (i2 == 2) {
            byte[] bArrE3 = e(5, identityInfo.getFingerPrint());
            byte[] bArrE4 = e(6, identityInfo2.getFingerPrint());
            byte[] bArr2 = new byte[bArrD.length + bArrA.length + bArrE.length + bArrE2.length + bArrE3.length + bArrE4.length];
            System.arraycopy(bArrD, 0, bArr2, 0, bArrD.length);
            System.arraycopy(bArrA, 0, bArr2, bArrD.length, bArrA.length);
            System.arraycopy(bArrE, 0, bArr2, bArrD.length + bArrA.length, bArrE.length);
            System.arraycopy(bArrE2, 0, bArr2, bArrD.length + bArrA.length + bArrE.length, bArrE2.length);
            System.arraycopy(bArrE3, 0, bArr2, bArrD.length + bArrA.length + bArrE.length + bArrE2.length, bArrE3.length);
            System.arraycopy(bArrE4, 0, bArr2, bArrD.length + bArrA.length + bArrE.length + bArrE2.length + bArrE3.length, bArrE4.length);
            return bArr2;
        }
        byte[] bArr3 = new byte[bArrD.length + bArrA.length + bArrE.length + bArrE2.length];
        System.arraycopy(bArrD, 0, bArr3, 0, bArrD.length);
        System.arraycopy(bArrA, 0, bArr3, bArrD.length, bArrA.length);
        System.arraycopy(bArrE, 0, bArr3, bArrD.length + bArrA.length, bArrE.length);
        System.arraycopy(bArrE2, 0, bArr3, bArrD.length + bArrA.length + bArrE.length, bArrE2.length);
        return bArr3;
    }

    private static cmg c(MessageParcel messageParcel, byte[] bArr) {
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(bArr);
        cmg.b bVar = new cmg.b();
        bVar.b(messageParcel.isEnableEncrypt());
        return bVar.a(cmgVar);
    }

    public static int e(byte[] bArr, xhr xhrVar) throws cpy {
        if (xhrVar == null) {
            return 0;
        }
        cql.c cVarA = new cql().a(bArr, 2);
        xhrVar.c(cVarA.e((byte) 1, ""));
        xhrVar.g(cVarA.d((byte) 3, -1));
        xhrVar.a(cVarA.d((byte) 4, -1));
        xhrVar.g(cVarA.e((byte) 8, null));
        xhrVar.a(cVarA.e((byte) 9, null));
        xhrVar.j(cVarA.e((byte) 11, null));
        xhrVar.e(cVarA.e((byte) 12, null));
        return cVarA.d(Ascii.DEL, 0);
    }

    public static cmg a(xhr xhrVar) {
        if (xhrVar == null) {
            return new cmg();
        }
        byte[] bArrD = d(xhrVar.n(), xhrVar.u(), xhrVar.y());
        byte[] bArrE = cph.e(xhrVar.ag());
        byte[] bArrF = cph.f(8);
        byte[] bArrE2 = cph.e(bArrE.length);
        int length = bArrE.length;
        int length2 = bArrE2.length;
        int length3 = bArrF.length;
        byte[] bArrE3 = cph.e(xhrVar.i());
        byte[] bArrF2 = cph.f(9);
        byte[] bArrE4 = cph.e(bArrE3.length);
        int length4 = bArrE3.length;
        int length5 = bArrF2.length;
        int length6 = bArrE4.length;
        byte[] bArrE5 = cph.e(xhrVar.j());
        byte[] bArrF3 = cph.f(10);
        byte[] bArrE6 = cph.e(bArrE5.length);
        int length7 = bArrE5.length;
        int length8 = bArrF3.length;
        int length9 = bArrE6.length;
        byte[] bArrE7 = cph.e(xhrVar.ai());
        byte[] bArrF4 = cph.f(11);
        byte[] bArrE8 = cph.e(bArrE7.length);
        int length10 = bArrE7.length;
        int length11 = bArrF4.length;
        int length12 = bArrE8.length;
        byte[] bArrE9 = cph.e(xhrVar.g());
        byte[] bArrF5 = cph.f(12);
        byte[] bArrE10 = cph.e(bArrE9.length);
        int length13 = bArrE9.length;
        int length14 = bArrF5.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrD.length + length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + bArrE10.length);
        byteBufferAllocate.put(bArrD);
        byteBufferAllocate.put(bArrF).put(bArrE2).put(bArrE);
        byteBufferAllocate.put(bArrF2).put(bArrE4).put(bArrE3);
        byteBufferAllocate.put(bArrF3).put(bArrE6).put(bArrE5);
        byteBufferAllocate.put(bArrF4).put(bArrE8).put(bArrE7);
        byteBufferAllocate.put(bArrF5).put(bArrE10).put(bArrE9);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(byteBufferAllocate.capacity() + 2);
        byteBufferAllocate2.put((byte) 40).put((byte) 2).put(byteBufferAllocate.array());
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate2.array());
        cmg.b bVar = new cmg.b();
        bVar.b(true);
        cpl.d("P2pCommandUtil", byteBufferAllocate.array(), "getStartSendCommand deviceCommand:");
        return bVar.a(cmgVar);
    }

    public static byte[] d(String str, long j, int i) {
        byte[] bArrE = cph.e(str);
        byte[] bArrE2 = cph.e(bArrE.length);
        int length = bArrE.length + bArrE2.length + 1;
        byte[] bArr = new byte[length];
        bArr[0] = 1;
        System.arraycopy(bArrE2, 0, bArr, 1, bArrE2.length);
        System.arraycopy(bArrE, 0, bArr, bArrE2.length + 1, bArrE.length);
        byte[] bArrD = cph.d(cph.b(j));
        int length2 = bArrD.length + 2;
        byte[] bArr2 = new byte[length2];
        bArr2[0] = 2;
        bArr2[1] = 4;
        System.arraycopy(bArrD, 0, bArr2, 2, bArrD.length);
        byte[] bArrF = cph.f(i);
        int length3 = bArrF.length + 2;
        byte[] bArr3 = new byte[length3];
        bArr3[0] = 3;
        bArr3[1] = 1;
        System.arraycopy(bArrF, 0, bArr3, 2, bArrF.length);
        int i2 = length + length2;
        byte[] bArr4 = new byte[i2 + length3];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        System.arraycopy(bArr2, 0, bArr4, length, length2);
        System.arraycopy(bArr3, 0, bArr4, i2, length3);
        return bArr4;
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 255;
    }
}
