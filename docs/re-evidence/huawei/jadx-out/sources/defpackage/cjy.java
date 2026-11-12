package defpackage;

import android.text.TextUtils;
import androidx.media3.muxer.Mp4Utils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.hichain.HiChainAuthManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cjy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static TreeSet<Byte> f1660b;
    private static ConcurrentHashMap<String, Long> g = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f1659a = cph.d(h());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f1661c = cph.d(i());
    private static byte[] e = c(d(), c(), b());
    private static byte[] d = c(a(), g(), f());
    private static Map<String, String> f = new HashMap(4);
    private static Map<String, byte[]> i = new ConcurrentHashMap(4);

    static {
        TreeSet<Byte> treeSet = new TreeSet<>();
        f1660b = treeSet;
        treeSet.add((byte) 124);
        f1660b.add((byte) 125);
        f1660b.add((byte) 126);
    }

    private cjy() {
    }

    public static String e(int i2, byte[] bArr, DeviceInfo deviceInfo) {
        String strE;
        String strD = null;
        if (deviceInfo == null) {
            LogUtil.e("EncryptStrategyGeneral", "create key error, deviceInfo is null");
            return null;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        String strB = cpv.b(deviceMac);
        byte[] bArrE = e(i2, deviceMac);
        if (TextUtils.isEmpty(strB)) {
            byte[] bArrE2 = e();
            strE = cph.d(bArr) + cph.d(ckg.d("AES/CBC/PKCS5Padding", bArrE2, bArrE, bArr));
            if (bArrE2 != null) {
                strD = d(strE, bArrE2);
                cpv.b(deviceMac, cph.d(cqo.b(bArrE2)));
            }
        } else {
            strE = e(strB, bArr, bArrE, deviceInfo, i2);
        }
        LogUtil.b("EncryptStrategyGeneral", "createKey() finish");
        if (strD != null) {
            f.put(deviceMac, strD);
            i.put(deviceMac, new byte[0]);
        }
        return strE;
    }

    public static boolean a(cmg cmgVar, String str, int i2) {
        if (cmgVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] bArr = new byte[2];
        int length = cmgVar.b().length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(cmgVar.b(), 0, bArr, 0, 2);
        System.arraycopy(cmgVar.b(), 2, bArr2, 0, length);
        byte[] bArrE = e();
        if (bArrE == null) {
            return false;
        }
        if (g.containsKey(str)) {
            Long lValueOf = g.get(str);
            if (lValueOf == null) {
                return false;
            }
            if (lValueOf.longValue() != 0) {
                if (lValueOf.longValue() == Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
                    g.put(str, 1L);
                } else {
                    lValueOf = Long.valueOf(lValueOf.longValue() + 1);
                    g.put(str, lValueOf);
                }
                byte[] bArrD = cph.d(cph.b(lValueOf.longValue()));
                if (bArrD != null && bArrD.length == 4 && bArrE.length == 16) {
                    for (int i3 = 0; i3 < 4; i3++) {
                        bArrE[i3 + 12] = bArrD[i3];
                    }
                }
            }
        }
        byte[] bArrA = a(bArr2, bArrE, str, i2);
        if (bArrA == null) {
            c(str, String.valueOf((int) bArr[0]) + "&" + String.valueOf((int) bArr[1]), 1);
            return false;
        }
        if (bArrA.length == 0 || !d(bArrA)) {
            c(str, String.valueOf((int) bArr[0]) + "&" + String.valueOf((int) bArr[1]), 1);
        }
        d(cmgVar, bArr, bArrE, bArrA);
        return true;
    }

    private static boolean d(byte[] bArr) {
        if (bArr.length != 16) {
            return true;
        }
        for (byte b2 : bArr) {
            if (b2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static void c(String str, String str2, int i2) {
        String str3;
        DeviceInfo deviceInfoJ = cnk.c().j(str);
        if (deviceInfoJ != null) {
            String strA = cqc.a((Object) deviceInfoJ.getDeviceName());
            if (i2 == 1) {
                str3 = "1";
            } else {
                str3 = "2";
            }
            cqp.a(100090, strA, str3, str2);
        }
    }

    private static void d(cmg cmgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrJ = j();
        byte[] bArrC = c(bArr2);
        byte[] bArrB = b(bArr3);
        int length = bArr.length;
        int length2 = bArrJ.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + bArrC.length + bArrB.length);
        byteBufferAllocate.put(bArr).put(bArrJ).put(bArrC).put(bArrB);
        cmgVar.a(byteBufferAllocate.array());
        cmgVar.b(false);
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EncryptStrategyGeneral", "updateBaseCount deviceIdentify is null");
            return;
        }
        if (g.containsKey(str)) {
            Long lValueOf = g.get(str);
            if (lValueOf == null) {
                LogUtil.e("EncryptStrategyGeneral", "baseCount is null");
                return;
            }
            LogUtil.b("EncryptStrategyGeneral", "before-baseCount: ", lValueOf);
            if (lValueOf.longValue() != 0) {
                lValueOf = Long.valueOf(lValueOf.longValue() - 1);
            }
            g.put(str, lValueOf);
            LogUtil.b("EncryptStrategyGeneral", "after-baseCount: ", lValueOf);
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, String str, int i2) {
        byte[] bArrE;
        byte[] bArrD = d(str, bArr2, i2);
        if (bArrD == null || bArrD.length == 0) {
            return new byte[0];
        }
        cml cmlVarC = cnk.c().c(str);
        if (cmz.a(str) || (cmlVarC != null && cmlVarC.e() == 1)) {
            LogUtil.b("EncryptStrategyGeneral", "encrypt by gcm use aes_gcm");
            bArrE = ckg.e("AES/GCM/NoPadding", bArr, bArrD, bArr2);
        } else {
            bArrE = ckg.d("AES/CBC/PKCS5Padding", bArr, bArrD, bArr2);
        }
        int length = bArrD.length;
        LogUtil.b("EncryptStrategyGeneral", "encryptDataContent key size: ", Integer.valueOf(length), " deviceIdentify: ", cpl.e(str));
        return bArrE;
    }

    private static byte[] d(String str, byte[] bArr, int i2) {
        if (bArr == null) {
            LogUtil.e("EncryptStrategyGeneral", "randIv is null");
            return null;
        }
        if (cnc.c(str)) {
            return HiChainAuthManager.e().d(str);
        }
        if (cni.b(str)) {
            return cni.a(str);
        }
        if (cmz.a(str)) {
            return cnd.a().e(str);
        }
        byte[] bArrC = c(str, i2);
        if (bArrC != null && bArrC.length != 0) {
            return bArrC;
        }
        cpv.d(str, "");
        return bArrC;
    }

    public static byte[] c(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EncryptStrategyGeneral", "getWorkKey identify null");
            return null;
        }
        byte[] bArr = i.get(str);
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        String strD = d(str);
        if (strD == null) {
            LogUtil.e("EncryptStrategyGeneral", "getWorkKey key null");
            return null;
        }
        String strA = a(strD, str, i2);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        byte[] bArrD = cph.d(strA);
        i.put(str, bArrD);
        return bArrD;
    }

    public static void b(String str) {
        LogUtil.b("EncryptStrategyGeneral", "clearCounterAndKey: ", cpl.a(str));
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EncryptStrategyGeneral", "identify is invalid");
        } else {
            g.remove(str);
            i.remove(str);
        }
    }

    private static byte[] j() {
        return ByteBuffer.allocate(3).put((byte) 124).put((byte) 1).put((byte) 1).array();
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            return bArr2;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + cph.e(bArr.length).length + 1);
        byteBufferAllocate.put(cph.f(125)).put(cph.e(bArr.length)).put(bArr);
        return byteBufferAllocate.array();
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            return bArr2;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + cph.e(bArr.length).length + 1);
        byteBufferAllocate.put(cph.f(126)).put(cph.e(bArr.length)).put(bArr);
        return byteBufferAllocate.array();
    }

    private static byte[] e(int i2, String str) {
        byte[] bArrD = cph.d(cph.b(str.replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT));
        if (i2 == 3) {
            return d(f1659a, f1661c, bArrD);
        }
        return d(e, d, bArrD);
    }

    private static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            LogUtil.e("EncryptStrategyGeneral", "data error");
            return null;
        }
        byte[] bArr4 = new byte[bArr.length];
        if (bArr.length == bArr2.length) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr4[i2] = (byte) ((bArr[i2] << 4) ^ bArr2[i2]);
            }
            byte[] bArrD = ckg.d(bArr4);
            String strD = cph.d(bArrD);
            if (strD != null) {
                int length = bArrD.length;
                byte[] bArr5 = new byte[length];
                if (length == 0 || bArr3.length == 0) {
                    LogUtil.e("EncryptStrategyGeneral", "data or arrayByte is null");
                    return null;
                }
                for (int i3 = 0; i3 < bArrD.length; i3++) {
                    int i4 = i3 * 2;
                    try {
                        bArr5[i3] = (byte) ((Integer.parseInt(strD.substring(i4, i4 + 2), 16) >> 6) ^ bArr3[i3]);
                    } catch (NumberFormatException unused) {
                        LogUtil.d("EncryptStrategyGeneral", "NumberFormatException");
                    }
                }
                byte[] bArrD2 = ckg.d(bArr5);
                LogUtil.b("EncryptStrategyGeneral", "getData success");
                return bArrD2;
            }
        }
        return null;
    }

    private static String d(String str, byte[] bArr) {
        try {
            String strE = cqo.e(bArr);
            ckb ckbVar = new ckb();
            ckbVar.e(strE);
            return new Gson().toJson(ckbVar);
        } catch (JsonSyntaxException unused) {
            LogUtil.d("EncryptStrategyGeneral", "encryptWorkKey JsonSyntaxException");
            return null;
        }
    }

    private static String e(String str, byte[] bArr, byte[] bArr2, DeviceInfo deviceInfo, int i2) {
        byte[] bArrD = cph.d(a(str, deviceInfo.getDeviceMac(), i2));
        if (bArr == null) {
            return str;
        }
        byte[] bArrD2 = ckg.d("AES/CBC/PKCS5Padding", bArrD, bArr2, bArr);
        if (bArrD2 == null) {
            LogUtil.e("EncryptStrategyGeneral", "keySencrypt is null.");
            return str;
        }
        String str2 = cph.d(bArr) + cph.d(bArrD2);
        LogUtil.b("EncryptStrategyGeneral", "processSpecialKeyFromSharePreference key success");
        return str2;
    }

    private static String a(String str, String str2, int i2) {
        try {
            ckb ckbVar = (ckb) new Gson().fromJson(JsonSanitizer.sanitize(str), ckb.class);
            if (ckbVar != null && ckbVar.e() == 1) {
                String strD = cph.d(cqo.b(ckbVar.d()));
                LogUtil.b("EncryptStrategyGeneral", "decryptWorkKey byteToHex key");
                return strD;
            }
            return e(str, i2, str2);
        } catch (JsonSyntaxException unused) {
            LogUtil.d("EncryptStrategyGeneral", "low version key");
            return e(str, i2, str2);
        }
    }

    private static String e(String str, int i2, String str2) {
        if (str.length() > 64) {
            return c(str.substring(32), cph.d(str.substring(0, 32)), i2, str2);
        }
        LogUtil.e("EncryptStrategyGeneral", "key info is incorrect.");
        return null;
    }

    private static String c(String str, byte[] bArr, int i2, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LogUtil.b("EncryptStrategyGeneral", "decrypt desEncrypt");
        byte[] bArrE = e(i2);
        byte[] bArrB = b(i2);
        byte[] bArrD = cph.d(cph.b(str2.replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT));
        if (bArr != null) {
            return cph.d(ckg.a("AES/CBC/PKCS5Padding", cph.d(str), d(bArrE, bArrB, bArrD), bArr));
        }
        LogUtil.e("EncryptStrategyGeneral", "randIV is null");
        return null;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("get key is null", new Object[0]);
            return str;
        }
        if (TextUtils.isEmpty(f.get(str))) {
            return cpv.b(str);
        }
        return f.get(str);
    }

    public static byte[] e() {
        byte[] bArrB;
        try {
            bArrB = ckg.b(16);
            if (bArrB != null) {
                return bArrB;
            }
            try {
                LogUtil.e("EncryptStrategyGeneral", "generateRandomBytes fail");
                return bArrB;
            } catch (NoSuchAlgorithmException e2) {
                e = e2;
                LogUtil.d("EncryptStrategyGeneral", "generateRandomBytes exception with info:", ExceptionUtils.c(e));
                return bArrB;
            }
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            bArrB = null;
        }
    }

    private static byte[] e(int i2) {
        synchronized (cjy.class) {
            try {
                if (3 == i2) {
                    return a(f1659a);
                }
                return a(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] b(int i2) {
        synchronized (cjy.class) {
            try {
                if (3 == i2) {
                    return a(f1661c);
                }
                return a(d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0021: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:12:0x0021 */
    private static byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Closeable closeable;
        if (bArr == null) {
            LogUtil.e("EncryptStrategyGeneral", "query c1 info error, hexByte1 is null");
            return bArr;
        }
        Closeable closeable2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(bArr);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    cpm.d(byteArrayOutputStream);
                    return byteArray;
                } catch (IOException e2) {
                    e = e2;
                    LogUtil.d("EncryptStrategyGeneral", "query c1 info exception is ", ExceptionUtils.c(e));
                    cpm.d(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                cpm.d(closeable2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            cpm.d(closeable2);
            throw th;
        }
    }

    private static String h() {
        return cqh.c(1, 29);
    }

    private static String i() {
        return cqh.c(1, 1029);
    }

    private static byte[] d() {
        return c(cqh.c(1, 27));
    }

    private static byte[] c() {
        return c(cqh.c(1, 1027));
    }

    private static byte[] b() {
        return c(cqh.c(1, 2027));
    }

    private static byte[] a() {
        return c(cqh.c(1, 28));
    }

    private static byte[] g() {
        return c(cqh.c(1, 1028));
    }

    private static byte[] f() {
        return c(cqh.c(1, 2028));
    }

    private static byte[] c(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[charArray.length];
        for (int i2 = 0; i2 < charArray.length; i2++) {
            bArr[i2] = (byte) charArray[i2];
        }
        return bArr;
    }

    private static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                cpm.d(byteArrayOutputStream);
                return byteArray;
            } catch (IOException unused) {
                cpm.d(byteArrayOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                cpm.d(byteArrayOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("EncryptStrategyGeneral", "isHaveBaseCounter: identify is invalid");
            return false;
        }
        return g.containsKey(str);
    }

    public static void c(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            LogUtil.e("EncryptStrategyGeneral", "identify is invalid");
        } else {
            g.put(str, Long.valueOf(j));
        }
    }

    public static byte[] a(byte[] bArr, String str, int i2) {
        if (str == null || bArr == null || bArr.length < 2) {
            LogUtil.e("EncryptStrategyGeneral", "decryptReceiveData check input parameter is failed");
            return null;
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        try {
            List<cqi> listD = new cql().b(bArr2, f1660b).d();
            if (!coq.d(listD)) {
                byte[] bArrD = null;
                byte[] bArrD2 = null;
                int iE = 0;
                for (cqi cqiVar : listD) {
                    switch (cqiVar.c()) {
                        case 124:
                            iE = cph.e(cqiVar.d(), 0);
                            break;
                        case 125:
                            bArrD = cqiVar.d();
                            break;
                        case 126:
                            bArrD2 = cqiVar.d();
                            break;
                    }
                }
                if (iE != 1) {
                    LogUtil.b("EncryptStrategyGeneral", "decryptReceiveData is not need decrypt");
                } else {
                    byte[] bArrE = e(bArr, str, bArrD, bArrD2, i2);
                    if (bArrE != null && bArrE.length != 0) {
                        if (!d(bArrE)) {
                            LogUtil.e("EncryptStrategyGeneral", "decryptReceiveData data is error");
                            c(str, String.valueOf((int) bArr[0]) + "&" + String.valueOf((int) bArr[1]), 2);
                        }
                        return bArrE;
                    }
                    LogUtil.e("EncryptStrategyGeneral", "decryptReceiveData decryptData is null");
                    c(str, String.valueOf((int) bArr[0]) + "&" + String.valueOf((int) bArr[1]), 2);
                    return null;
                }
            }
        } catch (cpy unused) {
        }
        return null;
    }

    private static byte[] e(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i2) {
        byte[] bArrB;
        if (bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            return null;
        }
        byte[] bArrB2 = b(str, i2);
        if (bArrB2 == null || bArrB2.length == 0) {
            LogUtil.e("EncryptStrategyGeneral", "key is not incorrect.");
            return null;
        }
        LogUtil.b("EncryptStrategyGeneral", "decryptReceiveDataByKey key:,length:", Integer.valueOf(bArrB2.length));
        cml cmlVarC = cnk.c().c(str);
        if (cmz.a(str) || (cmlVarC != null && cmlVarC.e() == 1)) {
            LogUtil.b("EncryptStrategyGeneral", "decrypt by gcm");
            bArrB = ckg.b("AES/GCM/NoPadding", bArr3, bArrB2, bArr2);
        } else {
            bArrB = ckg.a("AES/CBC/PKCS5Padding", bArr3, bArrB2, bArr2);
        }
        if (bArrB == null) {
            return null;
        }
        byte[] bArr4 = new byte[bArrB.length + 2];
        bArr4[0] = bArr[0];
        bArr4[1] = bArr[1];
        System.arraycopy(bArrB, 0, bArr4, 2, bArrB.length);
        return bArr4;
    }

    private static byte[] b(String str, int i2) {
        if (cnc.c(str)) {
            return HiChainAuthManager.e().d(str);
        }
        if (cni.b(str)) {
            return cni.a(str);
        }
        if (cmz.a(str)) {
            return cnd.a().e(str);
        }
        return c(str, i2);
    }
}
