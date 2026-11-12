package defpackage;

import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.devicesdk.connect.encrypt.EncryptBase;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cjz extends EncryptBase {
    private static Map<String, String> d = new ConcurrentHashMap(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f1662a = cph.d(cqh.c(1, 1033));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f1663b = cph.d(cqh.c(1, 2033));

    @Override // com.huawei.devicesdk.connect.encrypt.EncryptBase
    public byte[] encrypt(byte[] bArr, String str) {
        byte[] bArrA = a(str);
        byte[] bArrB = new byte[0];
        try {
            bArrB = ckg.b(16);
        } catch (NoSuchAlgorithmException e) {
            LogUtil.d("ScaleEncryptStrategy", "sendData NoSuchAlgorithmException", ExceptionUtils.c(e));
        }
        byte[] bArrD = ckg.d("AES/CTR/NoPadding", bArr, bArrA, bArrB);
        byte[] bArr2 = new byte[bArrB.length + bArrD.length];
        System.arraycopy(bArrB, 0, bArr2, 0, bArrB.length);
        System.arraycopy(bArrD, 0, bArr2, bArrB.length, bArrD.length);
        return bArr2;
    }

    public byte[] e(byte[] bArr, String str) {
        byte[] bArrA = a(str);
        byte[] bArrB = new byte[0];
        try {
            bArrB = ckg.b(16);
        } catch (NoSuchAlgorithmException e) {
            LogUtil.d("ScaleEncryptStrategy", "sendData NoSuchAlgorithmException", ExceptionUtils.c(e));
        }
        byte[] bArrD = ckg.d("AES/CTR/NoPadding", bArrA, bArr, bArrB);
        byte[] bArr2 = new byte[bArrB.length + bArrD.length];
        System.arraycopy(bArrB, 0, bArr2, 0, bArrB.length);
        System.arraycopy(bArrD, 0, bArr2, bArrB.length, bArrD.length);
        return bArr2;
    }

    @Override // com.huawei.devicesdk.connect.encrypt.EncryptBase
    public byte[] decrypt(byte[] bArr, String str) {
        if (bArr == null) {
            LogUtil.e("ScaleEncryptStrategy", "decrypt data is null");
            return new byte[0];
        }
        if (bArr.length < 16) {
            cpl.d("ScaleEncryptStrategy", bArr, "decrypt data");
            return new byte[0];
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        int length = bArr.length - 16;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 16, bArr3, 0, length);
        cpl.d("ScaleEncryptStrategy", bArr3, "decrypt data playLoad");
        return ckg.a("AES/CTR/NoPadding", bArr3, a(str), bArr2);
    }

    private byte[] a(String str) {
        LogUtil.b("ScaleEncryptStrategy", "createKey() begin ");
        byte[] bArrB = null;
        if (str == null) {
            return null;
        }
        Map<String, String> map = d;
        String str2 = (map == null || !map.containsKey(str)) ? null : d.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return cph.d(str2);
        }
        try {
            bArrB = ckg.b(16);
        } catch (NoSuchAlgorithmException e) {
            LogUtil.e("ScaleEncryptStrategy", "getWorkKey NoSuchPaddingException is", ExceptionUtils.c(e));
        }
        String strD = cph.d(bArrB);
        if (strD != null) {
            d.put(str, strD);
            LogUtil.b("ScaleEncryptStrategy", "getWorkKey finish");
        }
        return bArrB;
    }

    public byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ScaleEncryptStrategy", "getRootKey address is null");
            return null;
        }
        return d(f1662a, f1663b, cph.d(cph.b(str.replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT)));
    }

    public static void e(String str) {
        LogUtil.b("ScaleEncryptStrategy", "clearWorkKey ", cpl.a(str));
        d.remove(str);
    }

    private byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return new byte[0];
        }
        byte[] bArr4 = new byte[bArr.length];
        if (bArr.length != bArr2.length) {
            return new byte[0];
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr4[i] = (byte) ((bArr[i] << 4) ^ bArr2[i]);
        }
        byte[] bArrA = a(bArr4);
        String strD = cph.d(bArrA);
        int length = bArrA.length;
        byte[] bArr5 = new byte[length];
        if (length == 0 || bArr3.length == 0) {
            LogUtil.b("ScaleEncryptStrategy", "key data length is 0");
            return new byte[0];
        }
        for (int i2 = 0; i2 < bArrA.length; i2++) {
            int i3 = i2 * 2;
            try {
                bArr5[i2] = (byte) ((Integer.parseInt(strD.substring(i3, i3 + 2), 16) >> 6) ^ bArr3[i2]);
            } catch (NumberFormatException unused) {
                LogUtil.b("ScaleEncryptStrategy", "getRootKey NumberFormatException");
            }
        }
        byte[] bArrA2 = a(bArr5);
        if (bArrA2.length != 0) {
            return bArrA2;
        }
        LogUtil.b("ScaleEncryptStrategy", "createKeyData() result is null");
        return new byte[0];
    }

    private byte[] a(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[16];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            System.arraycopy(messageDigest.digest(), 0, bArr2, 0, 16);
            return bArr2;
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }
}
