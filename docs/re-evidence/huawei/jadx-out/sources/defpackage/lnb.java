package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import health.compact.a.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lnb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f40479c = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935, 4657, 528, 12915, 8786, 21173, 17044, 29431, 25302, 37689, 33560, 45947, 41818, 54205, 50076, 62463, 58334, 9314, 13379, 1056, 5121, 25830, 29895, 17572, 21637, 42346, 46411, 34088, 38153, 58862, 62927, 50604, 54669, 13907, 9842, 5649, 1584, 30423, 26358, 22165, 18100, 46939, 42874, 38681, 34616, 63455, 59390, 55197, 51132, 18628, 22757, 26758, 30887, 2112, 6241, 10242, 14371, 51660, 55789, 59790, 63919, 35144, 39273, 43274, 47403, 23285, 19156, 31415, 27286, 6769, 2640, 14899, 10770, 56317, 52188, 64447, 60318, 39801, 35672, 47931, 43802, 27814, 31879, 19684, 23749, 11298, 15363, 3168, 7233, 60846, 64911, 52716, 56781, 44330, 48395, 36200, 40265, 32407, 28342, 24277, 20212, 15891, 11826, 7761, 3696, 65439, 61374, 57309, 53244, 48923, 44858, 40793, 36728, 37256, 33193, 45514, 41451, 53516, 49453, 61774, 57711, 4224, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY, 12482, 8419, 20484, 16421, 28742, 24679, 33721, 37784, 41979, 46042, 49981, 54044, 58239, 62302, 689, 4752, 8947, 13010, 16949, 21012, 25207, 29270, 46570, 42443, 38312, 34185, 62830, 58703, 54572, 50445, 13538, 9411, 5280, 1153, 29798, 25671, 21540, 17413, 42971, 47098, 34713, 38840, 59231, 63358, 50973, 55100, 9939, 14066, 1681, 5808, 26199, 30326, 17941, 22068, 55628, 51565, 63758, 59695, 39368, 35305, 47498, 43435, 22596, 18533, 30726, 26663, 6336, 2273, 14466, 10403, 52093, 56156, 60223, 64286, 35833, 39896, 43963, 48026, 19061, 23124, 27191, 31254, GLMapStaticValue.AM_PARAMETERNAME_RENDER_COMPLETE, 6864, 10931, 14994, 64814, 60687, 56684, 52557, 48554, 44427, 40424, 36297, 31782, 27655, 23652, 19525, 15522, 11395, 7392, 3265, 61215, 65342, 53085, 57212, 44955, 49082, 36825, 40952, 28183, 32310, 20053, 24180, 11923, 16050, 3793, 7920};
    private static lnb d = null;
    private Map<String, String> i = new HashMap(4);
    private Map<String, String> h = new ConcurrentHashMap(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f40481b = e(a(), e(), b());
    private byte[] e = e(d(), c(), h());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f40480a = cph.d(i());
    private byte[] j = cph.d(g());

    private lnb(Context context) {
    }

    private static byte[] a() {
        return d(cqh.c(1, 27).toCharArray());
    }

    private static byte[] e() {
        return d(cqh.c(1, 1027).toCharArray());
    }

    private static byte[] b() {
        return d(cqh.c(1, 2027).toCharArray());
    }

    private static byte[] d() {
        return d(cqh.c(1, 28).toCharArray());
    }

    private static byte[] c() {
        return d(cqh.c(1, 1028).toCharArray());
    }

    private static byte[] h() {
        return d(cqh.c(1, 2028).toCharArray());
    }

    private static String i() {
        return cqh.c(1, 29);
    }

    private static String g() {
        return cqh.c(1, 1029);
    }

    private static byte[] d(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    private static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null && bArr2 != null && bArr3 != null) {
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
        return null;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(this.i.get(str))) {
            return c(str, BaseApplication.b());
        }
        return this.i.get(str);
    }

    public static lnb e(Context context) {
        lnb lnbVar;
        synchronized (lnb.class) {
            if (d == null) {
                d = new lnb(context);
            }
            lnbVar = d;
        }
        return lnbVar;
    }

    public String c(int i, String str, Context context, byte[] bArr, DeviceInfo deviceInfo) {
        String strC;
        String strC2 = c(str, context);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "CommandPackage", "createKey() begin");
        byte[] bArrE = e(i, str);
        if (TextUtils.isEmpty(strC2)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("btsdk_sharedpreferences_name4", 0);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "createKey() SharedPreferences.size() : ", Integer.valueOf(sharedPreferences.getAll() != null ? sharedPreferences.getAll().size() : 0));
            byte[] bArrF = f();
            if (bArr != null) {
                byte[] bArrA = lnh.a(1, bArrF, bArrE, bArr);
                if (bArrA != null) {
                    strC2 = cph.d(bArr) + cph.d(bArrA);
                } else {
                    LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "keysencrypt is null.");
                }
            } else {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "CommandPackage", "randIV is null");
            }
            strC = c(strC2, bArrF);
        } else {
            strC2 = c(context, strC2, bArr, bArrE, deviceInfo);
            strC = "";
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "createKey() finish");
        this.i.put(str, strC);
        this.h.put(str, "");
        return strC2;
    }

    private byte[] e(int i, String str) {
        byte[] bArrD = cph.d(cph.b(str.replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT));
        if (i == 3) {
            return c(this.f40480a, this.j, bArrD);
        }
        return c(this.f40481b, this.e, bArrD);
    }

    private String c(Context context, String str, byte[] bArr, byte[] bArr2, DeviceInfo deviceInfo) {
        byte[] bArrD = cph.d(c(context, str, deviceInfo));
        if (bArr == null) {
            return str;
        }
        byte[] bArrA = lnh.a(1, bArrD, bArr2, bArr);
        if (bArrA == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "keySencrypt is null.");
            return str;
        }
        String str2 = cph.d(bArr) + cph.d(bArrA);
        LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "processSpecialKeyFromSharePreference key:", str2);
        return str2;
    }

    public String c(String str, Context context) {
        if (str == null || context == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "getKeyFromSharedpreferences with parameter incorrect.");
            return null;
        }
        String string = context.getSharedPreferences("btsdk_sharedpreferences_name4", 0).getString(str, "");
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "getKeyFromSharedpreferences ok");
        return string;
    }

    public String b(String str, Context context, DeviceInfo deviceInfo, byte[] bArr) throws Throwable {
        String strD = null;
        if (str != null && !str.equals("")) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "decrypt before");
            byte[] bArrC = e(context).c(deviceInfo.getAuthVersion());
            byte[] bArrE = e(context).e(deviceInfo.getAuthVersion());
            byte[] bArrD = cph.d(cph.b(deviceInfo.getDeviceIdentify().replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT));
            if (bArr != null) {
                strD = cph.d(lnh.d(1, cph.d(str), c(bArrC, bArrE, bArrD), bArr));
            } else {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "CommandPackage", "randIV is null");
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "decrypt after ");
        }
        return strD;
    }

    public void d(String str, String str2, String str3, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str3, 0).edit();
        editorEdit.putString(str, str2);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "putKeyToSharedpreferences()");
        editorEdit.commit();
    }

    public String a(String str, Context context) {
        if (str == null || context == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "getBindIdFromSharedpreferences with parameter incorrect.");
            return null;
        }
        String string = context.getSharedPreferences("btsdk_sharedpreferences_bindid", 0).getString(str, "");
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "getBindIdFromSharedpreferences ok, boidId = " + cph.a(string));
        return string;
    }

    private byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr3 != null) {
            byte[] bArr4 = new byte[bArr.length];
            if (bArr.length != bArr2.length) {
                return null;
            }
            for (int i = 0; i < bArr.length; i++) {
                bArr4[i] = (byte) ((bArr[i] << 4) ^ bArr2[i]);
            }
            byte[] bArrB = lnh.b(bArr4);
            String strD = cph.d(bArrB);
            int length = bArrB.length;
            byte[] bArr5 = new byte[length];
            if (length == 0 || bArr3.length == 0) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "keydata len or C_3 len = 0.");
            } else {
                for (int i2 = 0; i2 < bArrB.length; i2++) {
                    int i3 = i2 * 2;
                    try {
                        bArr5[i2] = (byte) ((Integer.parseInt(strD.substring(i3, i3 + 2), 16) >> 6) ^ bArr3[i2]);
                    } catch (NumberFormatException unused) {
                        LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "NumberFormatException");
                    }
                }
                return lnh.b(bArr5);
            }
        }
        return null;
    }

    public void d(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("btsdk_sharedpreferences_name4", 0).edit();
        editorEdit.clear();
        SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("btsdk_sharedpreferences_bindid", 0).edit();
        editorEdit2.clear();
        editorEdit.commit();
        editorEdit2.commit();
    }

    private byte[] f() {
        try {
            return lnh.a(16);
        } catch (NoSuchAlgorithmException e) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "getRandomNum exception with info:", ExceptionUtils.c(e));
            return null;
        }
    }

    public byte[] e(byte[] bArr) {
        short s = 0;
        for (byte b2 : bArr) {
            s = (short) ((s << 8) ^ f40479c[(b2 ^ (s >> 8)) & 255]);
        }
        byte[] bArr2 = {0, 0};
        bArr2[1] = (byte) s;
        bArr2[0] = (byte) (s >> 8);
        return bArr2;
    }

    public byte[] c(int i) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        if (3 == i) {
            if (this.f40480a == null) {
                return null;
            }
            try {
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream2.write(this.f40480a);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    cpm.d(byteArrayOutputStream2);
                    return byteArray;
                } catch (IOException unused) {
                    cpm.d(byteArrayOutputStream2);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayOutputStream3 = byteArrayOutputStream2;
                    cpm.d(byteArrayOutputStream3);
                    throw th2;
                }
            } catch (IOException unused2) {
                byteArrayOutputStream2 = null;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } else {
            if (this.f40481b == null) {
                return null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(this.f40481b);
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    cpm.d(byteArrayOutputStream);
                    return byteArray2;
                } catch (IOException unused3) {
                    cpm.d(byteArrayOutputStream);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                    cpm.d(byteArrayOutputStream3);
                    throw th;
                }
            } catch (IOException unused4) {
                byteArrayOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public byte[] e(int i) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        if (3 == i) {
            if (this.j == null) {
                return null;
            }
            try {
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream2.write(this.j);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    cpm.d(byteArrayOutputStream2);
                    return byteArray;
                } catch (IOException unused) {
                    cpm.d(byteArrayOutputStream2);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayOutputStream3 = byteArrayOutputStream2;
                    cpm.d(byteArrayOutputStream3);
                    throw th2;
                }
            } catch (IOException unused2) {
                byteArrayOutputStream2 = null;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } else {
            if (this.e == null) {
                return null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(this.e);
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    cpm.d(byteArrayOutputStream);
                    return byteArray2;
                } catch (IOException unused3) {
                    cpm.d(byteArrayOutputStream);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                    cpm.d(byteArrayOutputStream3);
                    throw th;
                }
            } catch (IOException unused4) {
                byteArrayOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() > 30 ? str.substring(0, 30) : str;
    }

    private String c(String str, byte[] bArr) {
        String strE = cqo.e(bArr);
        ckb ckbVar = new ckb();
        ckbVar.e(strE);
        return new Gson().toJson(ckbVar);
    }

    public String c(Context context, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "getWorkKey deviceInfo is null");
            return null;
        }
        String str = this.h.get(deviceInfo.getDeviceIdentify());
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strA = a(deviceInfo.getDeviceIdentify());
        if (strA == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "encryptTLVs null: key");
            return strA;
        }
        LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "Encrypt Key ： ", strA);
        String strC = c(context, strA, deviceInfo);
        if (!TextUtils.isEmpty(strC)) {
            this.h.put(deviceInfo.getDeviceIdentify(), strC);
        }
        return strC;
    }

    public String c(Context context, String str, DeviceInfo deviceInfo) {
        try {
            ckb ckbVar = (ckb) new Gson().fromJson(str, ckb.class);
            if (ckbVar != null && ckbVar.e() == 1) {
                String strD = cph.d(cqo.b(ckbVar.d()));
                LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "decryptWorkKey byteToHex key:", strD);
                return strD;
            }
            return a(context, str, deviceInfo);
        } catch (JsonSyntaxException unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "low version key");
            return a(context, str, deviceInfo);
        }
    }

    private String a(Context context, String str, DeviceInfo deviceInfo) {
        if (str.length() > 64) {
            return b(str.substring(32, str.length()), context, deviceInfo, cph.d(str.substring(0, 32)));
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "CommandPackage", "key info is incorrect.");
        return null;
    }
}
