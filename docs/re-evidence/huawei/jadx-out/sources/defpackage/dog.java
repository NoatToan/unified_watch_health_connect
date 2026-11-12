package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.health.device.kit.hwch.ch18.bean.WeightUnitEnum;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f32120a;
    private static byte[] e;

    public static void a(String str) {
        if (str == null || "".equals(str)) {
            LogUtil.j("DataParser", "mac is null");
            return;
        }
        String[] strArrSplit = str.split(":");
        f32120a = new byte[6];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                f32120a[i] = (byte) Integer.parseInt(strArrSplit[i], 16);
            } catch (NumberFormatException e2) {
                LogUtil.e("DataParser", "initialize parseInt NumberFormatException ", e2.getMessage());
            }
        }
    }

    public static dok b(byte[] bArr) {
        byte[] bArrI;
        dok dokVar = new dok();
        if (bArr != null) {
            if (bArr.length >= 1 && (bArrI = i(bArr)) != null && bArrI.length >= 2) {
                LogUtil.a("DataParser", "data is not null");
                byte b2 = bArrI[0];
                if (bArrI.length >= 2 && (b2 & 255) == 189 && bArrI.length == (bArrI[1] & 255) + 3) {
                    int i = bArrI[2] & 255;
                    e(i, bArrI, dokVar);
                    c(i, bArrI, dokVar);
                    switch (i) {
                        case 38:
                            dokVar.c(18);
                            dokVar.c(Boolean.valueOf(bArrI[3] == 1));
                            break;
                        case 39:
                            dokVar.c(19);
                            break;
                        case 40:
                            if (bArrI[3] == 1) {
                                dokVar.c(20);
                            } else {
                                dokVar.c(21);
                            }
                            break;
                    }
                    return dokVar;
                }
                LogUtil.a("DataParser", "scale cmd not parse");
            }
        }
        return dokVar;
    }

    private static void c(int i, byte[] bArr, dok dokVar) {
        if (i == 25) {
            LogUtil.d("DataParser", "scale history uploaded done.");
            dokVar.c(17);
            return;
        }
        if (i == 32) {
            LogUtil.d("DataParser", "scale response update list.");
            dokVar.c(3);
            return;
        }
        switch (i) {
            case 19:
                if ((bArr[3] & 64) > 0) {
                    LogUtil.e("DataParser", "weight over load");
                    dokVar.c(11);
                } else {
                    LogUtil.e("DataParser", "weight not over load");
                }
                break;
            case 20:
                LogUtil.d("DataParser", "receive device low power message.");
                dokVar.c(12);
                break;
            case 21:
                LogUtil.d("DataParser", "receive fat measure error message.");
                dokVar.c(13);
                dokVar.c(Integer.valueOf(bArr[3] & 255));
                break;
            case 22:
                LogUtil.d("DataParser", "receive set clock ack.");
                dokVar.c(14);
                break;
            case 23:
                LogUtil.d("DataParser", "receive OTA upgrade ready.");
                dokVar.c(15);
                break;
        }
    }

    private static void e(int i, byte[] bArr, dok dokVar) {
        if (i == 0) {
            LogUtil.d("DataParser", "receive scale wakeup.");
            dokVar.c(1);
            return;
        }
        if (i == 1) {
            LogUtil.d("DataParser", "receive scale sleeped.");
            dokVar.c(2);
            return;
        }
        if (i == 2) {
            LogUtil.d("DataParser", "receive scale change unit.");
            dokVar.c(16);
            dokVar.c(bArr[3] == 1 ? WeightUnitEnum.WEIGHT_UNIT_KG : WeightUnitEnum.WEIGHT_UNIT_POWND);
            return;
        }
        if (i == 8) {
            c(bArr, dokVar);
            return;
        }
        if (i == 12) {
            f(bArr, dokVar);
            return;
        }
        switch (i) {
            case 14:
                e(bArr, dokVar);
                break;
            case 15:
                b(bArr, dokVar);
                break;
            case 16:
                d(bArr, dokVar);
                break;
            case 17:
                a(bArr, dokVar);
                break;
            case 18:
                g(bArr, dokVar);
                break;
        }
    }

    private static void g(byte[] bArr, dok dokVar) {
        int i = bArr[3] & 255;
        byte b2 = bArr[4];
        LogUtil.d("DataParser", "package upgrade result:", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("type", b2 & 255);
        } catch (JSONException e2) {
            LogUtil.e("DataParser", "dataparse ", e2.getMessage());
        }
        dokVar.c(10);
        dokVar.c(jSONObject);
    }

    private static void a(byte[] bArr, dok dokVar) {
        int i = (bArr[3] & 255) | ((bArr[4] & 255) << 8);
        LogUtil.d("DataParser", "redevice packageupgradeResponse is:", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pkgNo", i);
        } catch (JSONException e2) {
            LogUtil.e("DataParser", "dataparse ", e2.getMessage());
        }
        int i2 = bArr[5] & 255;
        if (i2 <= 1) {
            try {
                jSONObject.put("result", i2 == 0);
            } catch (JSONException e3) {
                LogUtil.e("DataParser", "dataparse ", e3.getMessage());
            }
        } else {
            try {
                jSONObject.put("result", true);
            } catch (JSONException e4) {
                LogUtil.e("DataParser", "dataparse ", e4.getMessage());
            }
        }
        dokVar.c(9);
        dokVar.c(jSONObject);
    }

    private static void d(byte[] bArr, dok dokVar) {
        LogUtil.d("DataParser", "receive weight measureing data.");
        dol dolVar = new dol();
        float f = (bArr[4] & 255) | ((bArr[5] & 255) << 8);
        Float.valueOf(f).getClass();
        dolVar.c(f / 10.0f);
        float f2 = (bArr[6] & 255) | ((bArr[7] & 255) << 8);
        Float.valueOf(f2).getClass();
        dolVar.a(f2 / 10.0f);
        dolVar.i((bArr[8] & 255) | ((bArr[9] & 255) << 8));
        dolVar.b(bArr[10] & 255);
        dolVar.c(bArr[11] & 255);
        dolVar.e(bArr[12] & 255);
        dolVar.d(bArr[13] & 255);
        dolVar.f(bArr[14] & 255);
        dolVar.j(bArr[15] & 255);
        dolVar.a((bArr[16] & 255) | ((bArr[17] & 255) << 8));
        dolVar.b((bArr[18] & 255) == 170);
        LogUtil.d("DataParser", dolVar.toString());
        dokVar.c(8);
        dokVar.c(dolVar);
        dokVar.b(d(new byte[]{-37, 2, 11, 1}));
    }

    private static void b(byte[] bArr, dok dokVar) {
        LogUtil.d("DataParser", "receive weight measureing data.");
        dol dolVar = new dol();
        float f = (bArr[4] & 255) | ((bArr[5] & 255) << 8);
        Float.valueOf(f).getClass();
        dolVar.c(f / 10.0f);
        dolVar.i((bArr[6] & 255) | ((bArr[7] & 255) << 8));
        dolVar.b(bArr[8] & 255);
        dolVar.c(bArr[9] & 255);
        dolVar.e(bArr[10] & 255);
        dolVar.d(bArr[11] & 255);
        dolVar.f(bArr[12] & 255);
        dolVar.j(bArr[13] & 255);
        dolVar.a(0);
        dolVar.a(0.0f);
        LogUtil.d("DataParser", dolVar.toString());
        dokVar.c(7);
        dokVar.c(dolVar);
        dokVar.b(d(new byte[]{-37, 2, 19, 0}));
    }

    private static void e(byte[] bArr, dok dokVar) {
        LogUtil.d("DataParser", "receive fat result.");
        dol dolVar = new dol();
        byte b2 = bArr[4];
        byte b3 = bArr[5];
        LogUtil.d("DataParser", "receive fat result.1");
        float f = (b2 & 255) | ((b3 & 255) << 8);
        Float.valueOf(f).getClass();
        dolVar.c(f / 10.0f);
        float f2 = (bArr[6] & 255) | ((bArr[7] & 255) << 8);
        Float.valueOf(f2).getClass();
        dolVar.a(f2 / 10.0f);
        LogUtil.d("DataParser", "receive fat result.time start");
        dolVar.i((bArr[8] & 255) | ((bArr[9] & 255) << 8));
        dolVar.b(bArr[10] & 255);
        LogUtil.d("DataParser", "receive fat result resistance 1");
        dolVar.c(bArr[11] & 255);
        dolVar.e(bArr[12] & 255);
        dolVar.d(bArr[13] & 255);
        dolVar.f(bArr[14] & 255);
        dolVar.j(bArr[15] & 255);
        LogUtil.d("DataParser", "receive fat result resistance start");
        dolVar.a(((bArr[17] & 255) << 8) | (bArr[16] & 255));
        LogUtil.d("DataParser", "receive fat result bean");
        LogUtil.d("DataParser", dolVar.toString());
        dokVar.c(7);
        dokVar.c(dolVar);
        dokVar.b(d(new byte[]{-37, 2, 19, 0}));
    }

    private static void c(byte[] bArr, dok dokVar) {
        LogUtil.d("DataParser", "receive scale clock.");
        int i = (bArr[3] & 255) | ((bArr[4] & 255) << 8);
        int i2 = bArr[5] & 255;
        int i3 = bArr[6] & 255;
        int i4 = bArr[7] & 255;
        int i5 = bArr[8] & 255;
        int i6 = bArr[9] & 255;
        int i7 = bArr[10] & 255;
        LogUtil.d("DataParser", "got scale curr clock info.", "year:", Integer.valueOf(i), "month:", Integer.valueOf(i2), "date:", Integer.valueOf(i3), "hour:", Integer.valueOf(i4), "minute:", Integer.valueOf(i5), "second:", Integer.valueOf(i6), "weekOfYear:", Integer.valueOf(i7));
        don donVar = new don(new int[]{i, i2, i3}, i4, i5, i6, i7);
        dokVar.c(6);
        dokVar.c(donVar);
    }

    private static void f(byte[] bArr, dok dokVar) {
        LogUtil.d("DataParser", "receive scale version info.");
        dokVar.c(4);
        byte b2 = bArr[3];
        byte b3 = bArr[4];
        byte b4 = bArr[5];
        byte b5 = bArr[6];
        byte b6 = bArr[7];
        dokVar.c(new dom(((b3 & 255) << 8) | (b2 & 255), ((b5 & 255) << 8) | (b4 & 255), ((bArr[8] & 255) << 8) | (b6 & 255), ((bArr[10] & 255) << 8) | (bArr[9] & 255)));
    }

    private static byte[] i(byte[] bArr) {
        int i = 3;
        int i2 = 0;
        if (bArr == null || bArr.length <= 2 || (bArr[0] & 255) != 188) {
            LogUtil.d("DataParser", "decryptData not aes decrypt");
        } else {
            int i3 = bArr[2] & 255;
            if (i3 == 14) {
                LogUtil.a("DataParser", "measure result data 1 :", HexUtils.c(bArr));
                byte[] bArr2 = new byte[16];
                e = bArr2;
                System.arraycopy(bArr, 3, bArr2, 0, Math.min(bArr.length - 3, 16));
            } else if (i3 == 142 && e != null) {
                LogUtil.a("DataParser", "measure result data 2 :", HexUtils.c(bArr));
                bArr = b(bArr, false);
            } else if (i3 == 16) {
                LogUtil.a("DataParser", "history weight data 1:", HexUtils.c(bArr));
                byte[] bArr3 = new byte[16];
                e = bArr3;
                if (bArr.length >= 19) {
                    System.arraycopy(bArr, 3, bArr3, 0, 16);
                } else {
                    ReleaseLogUtil.d("R_DataParser", "error data length");
                }
            } else if (i3 != 144 || e == null) {
                LogUtil.d("DataParser", "decryptData other ble cmd ");
            } else {
                LogUtil.a("DataParser", "history weight data 2:", HexUtils.c(bArr));
                bArr = b(bArr, true);
            }
            bArr = null;
        }
        if (bArr == null || bArr.length <= 0) {
            LogUtil.d("DataParser", "data deEncrypt is not xor");
            return bArr;
        }
        if ((bArr[0] & 255) == 189) {
            byte[] bArr4 = (byte[]) bArr.clone();
            while (i < bArr4.length) {
                bArr[i] = (byte) (bArr[i] ^ f32120a[i2 % 6]);
                i++;
                i2++;
            }
            LogUtil.a("DataParser", "data deEncrypt is : ", HexUtils.c(bArr));
        }
        return bArr;
    }

    private static byte[] b(byte[] bArr, boolean z) {
        if (bArr.length < 19) {
            LogUtil.j("DataParser", "data length less than valid Data");
            return null;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 3, bArr2, 0, 16);
        byte[] bArrE = doh.e(e);
        byte[] bArrE2 = doh.e(bArr2);
        if (bArrE == null || bArrE2 == null) {
            return null;
        }
        LogUtil.a("DataParser", "parse normal data");
        byte[] bArr3 = new byte[bArrE.length + 3 + bArrE2.length];
        bArr3[0] = -67;
        bArr3[1] = bArr[1];
        if (z) {
            bArr3[2] = 16;
        } else {
            bArr3[2] = 14;
        }
        System.arraycopy(bArrE, 0, bArr3, 3, bArrE.length);
        System.arraycopy(bArrE2, 0, bArr3, bArrE.length + 3, bArrE2.length);
        LogUtil.a("DataParser", "measure result decrypt data ：", HexUtils.c(bArr3));
        e = null;
        return bArr3;
    }

    public static byte[] b() {
        LogUtil.d("DataParser", "send sync system time cmd.");
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        int i7 = calendar.get(7);
        return d(new byte[]{-37, 9, 8, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) (i2 + 1), (byte) i3, (byte) i4, (byte) i5, (byte) i6, (byte) (i7 == 1 ? 7 : i7 - 1)});
    }

    public static byte[] a(dop dopVar) {
        LogUtil.d("DataParser", "send user body info cmd.");
        if (dopVar == null) {
            return new byte[0];
        }
        dopVar.c(f(dopVar.a()));
        return d(dopVar.d());
    }

    public static byte[] c(String str) {
        LogUtil.d("DataParser", "send get record cmd, uid is : ", str);
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        byte[] bArrF = f(str);
        return d(new byte[]{-37, 7, 11, bArrF[0], bArrF[1], bArrF[2], bArrF[3], bArrF[4], bArrF[5], bArrF[6], 0});
    }

    public static byte[] e() {
        LogUtil.d("DataParser", "send get version cmd.");
        return d(new byte[]{-37, 1, 12});
    }

    public static byte[] c(int i, int i2, byte b2) {
        LogUtil.d("DataParser", "send ota updarge request cmd. cs:", Byte.valueOf(b2));
        return d(new byte[]{-37, 6, 13, (byte) i, (byte) (i2 & 255), (byte) ((i2 >> 8) & 255), b2, 0});
    }

    public static byte[] a() {
        LogUtil.d("DataParser", "send ota finish cmd.");
        return d(new byte[]{-37, 5, 13, -86, 0, 0, 0});
    }

    public static byte[] e(byte[] bArr, int i) {
        if (bArr == null) {
            return bArr;
        }
        LogUtil.d("DataParser", "send ota package data cmd.");
        int length = bArr.length;
        LogUtil.d("DataParser", "pkg data len:", Integer.valueOf(length), ",data is : ", HexUtils.c(bArr));
        byte[] bArr2 = new byte[20];
        byte b2 = 0;
        bArr2[0] = -35;
        bArr2[1] = 18;
        bArr2[2] = (byte) (i & 255);
        bArr2[3] = (byte) ((i >> 8) & 255);
        int i2 = 4;
        int i3 = 0;
        while (i2 < 20) {
            if (i3 >= length) {
                bArr2[i2] = -1;
            } else {
                bArr2[i2] = bArr[i3];
            }
            i2++;
            i3++;
        }
        for (int i4 = 2; i4 < 20; i4++) {
            b2 = (byte) (bArr2[i4] ^ b2);
        }
        bArr2[1] = b2;
        return d(bArr2);
    }

    public static byte[] c() {
        return d(new byte[]{-37, 1, 32});
    }

    public static byte[] d() {
        return d(new byte[]{-37, 2, 17, 0});
    }

    public static byte[] b(String str) {
        byte[] bArr = new byte[10];
        if (TextUtils.isEmpty(str)) {
            return bArr;
        }
        bArr[0] = -37;
        bArr[1] = 8;
        bArr[2] = 36;
        d(bArr, f(str));
        return d(bArr);
    }

    public static byte[] e(String str) {
        byte[] bArr = new byte[10];
        if (TextUtils.isEmpty(str)) {
            return bArr;
        }
        bArr[0] = -37;
        bArr[1] = 8;
        bArr[2] = 37;
        d(bArr, f(str));
        return d(bArr);
    }

    private static void d(byte[] bArr, byte[] bArr2) {
        bArr[3] = bArr2[0];
        bArr[4] = bArr2[1];
        bArr[5] = bArr2[2];
        bArr[6] = bArr2[3];
        bArr[7] = bArr2[4];
        bArr[8] = bArr2[5];
        bArr[9] = bArr2[6];
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[19];
        if (bArr == null || bArr.length < 16) {
            return bArr2;
        }
        int i = 0;
        bArr2[0] = -37;
        bArr2[1] = 16;
        bArr2[2] = 4;
        int i2 = 3;
        while (i2 < 19) {
            bArr2[i2] = bArr[i];
            i2++;
            i++;
        }
        return d(bArr2);
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[19];
        if (bArr == null || bArr.length < 16) {
            return bArr2;
        }
        int i = 0;
        bArr2[0] = -37;
        bArr2[1] = 16;
        bArr2[2] = 5;
        int i2 = 3;
        while (i2 < 19) {
            bArr2[i2] = bArr[i];
            i2++;
            i++;
        }
        return d(bArr2);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr != null && bArr.length >= 1) {
            if ((bArr[0] & 255) == 219) {
                byte[] bArr2 = (byte[]) bArr.clone();
                if (f32120a != null) {
                    int i = 0;
                    int i2 = 3;
                    while (i2 < bArr2.length) {
                        bArr2[i2] = (byte) (bArr2[i2] ^ f32120a[i % 6]);
                        i2++;
                        i++;
                    }
                }
                LogUtil.a("DataParser", "command data before encrypt ", HexUtils.c(bArr2));
                if ((bArr2[2] & 255) == 36) {
                    byte[] bArr3 = new byte[7];
                    System.arraycopy(bArr2, 3, bArr3, 0, 7);
                    LogUtil.d("DataParser", "set auth keyArr:", HexUtils.c(bArr3));
                    doh.b(bArr3);
                } else {
                    LogUtil.d("DataParser", "data cmd no aes encrypt");
                }
                if (bArr2[2] == 9) {
                    int length = bArr2.length - 3;
                    byte[] bArr4 = new byte[length];
                    System.arraycopy(bArr2, 3, bArr4, 0, length);
                    byte[] bArrC = doh.c(bArr4);
                    if (bArrC != null) {
                        byte[] bArr5 = new byte[bArrC.length + 3];
                        System.arraycopy(bArr2, 0, bArr5, 0, 3);
                        System.arraycopy(bArrC, 0, bArr5, 3, bArrC.length);
                        bArr5[0] = -36;
                        LogUtil.d("DataParser", "after encrypt ：", HexUtils.c(bArr5));
                        return bArr5;
                    }
                    LogUtil.j("DataParser", "encryptData is null");
                    return bArr2;
                }
                LogUtil.j("DataParser", "cmd is no send user info");
                return bArr2;
            }
            LogUtil.d("DataParser", "data cmd not encrypt");
        }
        return bArr;
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(c(str.getBytes("utf-8")), 2) + "abcd";
        } catch (UnsupportedEncodingException e2) {
            LogUtil.e("DataParser", "dataparse ", e2.getMessage());
            return "";
        }
    }

    private static byte[] f(String str) {
        int i;
        byte[] bArr = new byte[7];
        if (!TextUtils.isEmpty(str)) {
            String strD = d(str);
            if (!TextUtils.isEmpty(strD)) {
                LogUtil.d(" bytes is not empty", new Object[0]);
                char[] charArray = strD.toCharArray();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < charArray.length && i3 < 7) {
                    int i5 = i2;
                    int i6 = 0;
                    while (true) {
                        i = i2 + 8;
                        if (i5 < i) {
                            char c2 = charArray[i5];
                            Integer.valueOf(c2).getClass();
                            i6 ^= c2;
                            i5++;
                        }
                    }
                    bArr[i3] = (byte) i6;
                    i4 ^= i6;
                    i3++;
                    i2 = i;
                }
                if (i4 == 0) {
                    bArr[6] = 1;
                    return bArr;
                }
                bArr[6] = (byte) i4;
                return bArr;
            }
        }
        return bArr;
    }

    public static byte[] c(byte[] bArr) {
        try {
            if (bArr == null) {
                return new byte[0];
            }
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.e("DataParser", "NoSuchAlgorithmException", e2.getMessage());
            return new byte[0];
        }
    }
}
