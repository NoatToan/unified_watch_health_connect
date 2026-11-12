package defpackage;

import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.secure.android.common.util.HexUtil;
import health.compact.a.WhiteBoxManager;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class dnz {
    private static final byte[] e = {57, 56, 53, 54};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f32099c = {49, 49, 50, 51};
    private static final byte[] d = eeq.c(WhiteBoxManager.b().a(1, 33));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f32097a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f32098b = "";

    private static byte[] b(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        LogUtil.a("BtHaiGeSendUtil", "hmacSha256 is start");
        byte[] bArr3 = (byte[]) bArr2.clone();
        byte[] bArr4 = (byte[]) bArr.clone();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "HMACSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(bArr4);
    }

    public static byte[] a(int i) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(i * 8, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    public static byte[] c(byte[] bArr) {
        LogUtil.a("BtHaiGeSendUtil", "Enter startAuthenticBTDevice().");
        f32097a = eeq.e(bArr);
        try {
            byte[] bArrA = a(16);
            if (bArrA == null) {
                LogUtil.e("BtHaiGeSendUtil", "generateRandomBytes fail.");
                return new byte[0];
            }
            f32098b = eeq.e(bArrA);
            LogUtil.a("BtHaiGeSendUtil", "startAuthenticBtDevice randB = ", eeq.e(bArrA));
            String strA = a(f32099c);
            if (strA != null) {
                byte[] bArr2 = new byte[48];
                System.arraycopy(bArrA, 0, bArr2, 0, 16);
                System.arraycopy(eeq.c(strA), 0, bArr2, 16, 32);
                LogUtil.d("BtHaiGeSendUtil", "get device TokenB ", eeq.e(bArr2));
                return bArr2;
            }
            return new byte[0];
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.e("BtHaiGeSendUtil", "generateRandomBytes exception with info is ", e2.getMessage());
            return new byte[0];
        }
    }

    private static String a(byte[] bArr) {
        LogUtil.a("BtHaiGeSendUtil", "Enter getAuthenticTokenValue().rand = ", eeq.e(bArr));
        byte[] bArrC = eeq.c(f32097a);
        byte[] bArrC2 = eeq.c(f32098b);
        LogUtil.a("BtHaiGeSendUtil", "Enter getAuthenticTokenValue().randA = ", eeq.e(bArrC), "  randB = ", eeq.e(bArrC2));
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArrC, 0, bArr2, 0, 16);
        System.arraycopy(bArrC2, 0, bArr2, 16, 16);
        byte[] bArr3 = d;
        LogUtil.a("BtHaiGeSendUtil", "after convert old strCak to Hex is ", eeq.e(bArr3));
        byte[] bArr4 = new byte[bArr3.length + bArr.length];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArr, 0, bArr4, bArr3.length, bArr.length);
        try {
            LogUtil.a("BtHaiGeSendUtil", "Start to create encode info.");
            return eeq.e(b(bArr2, b(bArr2, bArr4)));
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e("BtHaiGeSendUtil", "HMac256 occur UnsupportedEncodingException with info is ", e2.getMessage());
            return null;
        } catch (InvalidKeyException e3) {
            LogUtil.e("BtHaiGeSendUtil", "HMac256 occur InvalidKeyException with info is ", e3.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e4) {
            LogUtil.e("BtHaiGeSendUtil", "HMac256 occur NoSuchAlgorithmException with info is ", e4.getMessage());
            return null;
        }
    }

    public static boolean c(String str) {
        LogUtil.a("BtHaiGeSendUtil", "Enter checkAuthenticBTDevice().");
        if (f32097a.length() == 32 && f32098b.length() == 32) {
            String strA = a(e);
            if (strA != null && str != null) {
                return strA.equalsIgnoreCase(str);
            }
            LogUtil.e("BtHaiGeSendUtil", "Authentic codeInfoHex is incorrect.");
            return false;
        }
        LogUtil.e("BtHaiGeSendUtil", "Authentic Random parameter is incorrect.");
        return false;
    }

    public static ArrayList<byte[]> a(byte[] bArr, boolean z, String str, boolean z2) {
        LogUtil.d("BtHaiGeSendUtil", "sendData playload", HexUtil.byteArray2HexStr(bArr), " isEncrypted,", Boolean.valueOf(z));
        if (z) {
            byte[] bArrA = new byte[0];
            try {
                bArrA = a(16);
            } catch (NoSuchAlgorithmException e2) {
                LogUtil.e("BtHaiGeSendUtil", "sendData NoSuchAlgorithmException", e2.getMessage());
            }
            byte[] bArrA2 = doi.a(bArr, e(z2, str), bArrA);
            byte[] bArr2 = new byte[bArrA.length + bArrA2.length];
            System.arraycopy(bArrA, 0, bArr2, 0, bArrA.length);
            System.arraycopy(bArrA2, 0, bArr2, bArrA.length, bArrA2.length);
            LogUtil.a("BtHaiGeSendUtil", "sendData encryptData size = ", Integer.valueOf(bArrA2.length), " playload size = ", Integer.valueOf(bArr.length));
            return doa.c(bArr2, z);
        }
        return doa.c(bArr, z);
    }

    public static ArrayList<byte[]> c(byte[] bArr, boolean z, String str, boolean z2) {
        LogUtil.a("BtHaiGeSendUtil", "sendData playload", HexUtil.byteArray2HexStr(bArr), " isEncrypted,", Boolean.valueOf(z));
        if (bArr == null) {
            return new ArrayList<>();
        }
        ArrayList<byte[]> arrayListC = c(bArr, z);
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (!njy.e(arrayListC)) {
            int size = arrayListC.size() - 1;
            LogUtil.a("BtHaiGeSendUtil", "sendData total frames ", Integer.valueOf(size));
            int i = 0;
            for (byte[] bArrE : arrayListC) {
                if (bArrE != null) {
                    LogUtil.a("BtHaiGeSendUtil", "frame length ", Integer.valueOf(bArrE.length), " data ", HexUtil.byteArray2HexStr(bArrE));
                    if (z && bArrE.length > 0) {
                        bArrE = e(bArrE, z2, str);
                    }
                    int length = bArrE.length + 2;
                    byte[] bArr2 = new byte[length];
                    bArr2[0] = (byte) size;
                    bArr2[1] = (byte) i;
                    i++;
                    System.arraycopy(bArrE, 0, bArr2, 2, bArrE.length);
                    LogUtil.a("BtHaiGeSendUtil", "encryptFrame length ", Integer.valueOf(length), " data ", HexUtil.byteArray2HexStr(bArr2));
                    arrayList.addAll(doa.b(bArr2, z));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<byte[]> c(byte[] bArr, boolean z) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (bArr == null || bArr.length == 0) {
            arrayList.add(new byte[0]);
            return arrayList;
        }
        int i = z ? 222 : 238;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = i2 + i;
            int iMin = Math.min(bArr.length, i3) - i2;
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i2, bArr2, 0, iMin);
            arrayList.add(bArr2);
            i2 = i3;
        }
        return arrayList;
    }

    private static byte[] e(byte[] bArr, boolean z, String str) {
        byte[] bArrA = new byte[0];
        try {
            bArrA = a(16);
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.e("BtHaiGeSendUtil", "sendData NoSuchAlgorithmException", e2.getMessage());
        }
        byte[] bArrA2 = doi.a(bArr, e(z, str), bArrA);
        byte[] bArr2 = new byte[bArrA.length + bArrA2.length];
        System.arraycopy(bArrA, 0, bArr2, 0, bArrA.length);
        System.arraycopy(bArrA2, 0, bArr2, bArrA.length, bArrA2.length);
        return bArr2;
    }

    private static byte[] e(boolean z, String str) {
        if (z) {
            byte[] bArrB = doi.b();
            byte[] bArrD = doi.d();
            byte[] bArrC = eeq.c(eeq.a(str.replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT));
            LogUtil.d("BtHaiGeSendUtil", "encryptFrame c3", HexUtil.byteArray2HexStr(bArrC));
            return doi.c(bArrB, bArrD, bArrC);
        }
        return doi.d(str);
    }
}
