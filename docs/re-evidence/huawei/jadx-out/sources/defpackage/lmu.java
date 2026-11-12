package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import okio.Utf8;

/* JADX INFO: loaded from: classes10.dex */
public class lmu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f40465c = true;
    private static int d;

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return null;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManagerHelp", "Start to construct key info.");
        String strSubstring = str.substring(32, str.length());
        String str2 = cph.b(6) + cph.b(strSubstring.length() / 2) + strSubstring;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManagerHelp", "Start to construct iv info.");
        return str2;
    }

    public static byte[] d(Context context, byte[] bArr, DeviceInfo deviceInfo, byte[] bArr2) {
        String strE = e(context, deviceInfo, bArr2);
        if (strE == null) {
            LogUtil.e("BTHandshakeManagerHelp", "key is null.");
            return null;
        }
        if (!TextUtils.isEmpty(strE)) {
            bArr = lnh.a(1, bArr, cph.d(strE), bArr2);
        }
        cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, bArr, 0, "BTHandshakeManagerHelp", " mDevice: ", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()), "encryptTLVs After encrypt result:");
        return bArr;
    }

    private static String e(Context context, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManagerHelp", "randIv is null");
            return null;
        }
        String strC = lnb.e(context).c(context, deviceInfo);
        if (strC == null) {
            lnb.e(BaseApplication.b()).d(deviceInfo.getDeviceIdentify(), "", "btsdk_sharedpreferences_name4", BaseApplication.b());
        }
        return strC;
    }

    public static void d(Context context, int i, String str, DeviceCapability deviceCapability, boolean z) {
        if (context == null || i == 0 || deviceCapability == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManagerHelp", "parseCommandIDInfo with parameter is not correct.");
            return;
        }
        List<Integer> list = cor.d(z).get(Integer.valueOf(i));
        if (list == null || list.size() <= 0 || str == null) {
            return;
        }
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + 2;
            try {
                boolean z2 = Integer.parseInt(str.substring(i2, i3), 16) == 1;
                int i4 = i2 / 2;
                if (list.size() <= i4) {
                    return;
                } else {
                    lni.c(i, list.get(i4).intValue(), z2, deviceCapability);
                }
            } catch (NumberFormatException unused) {
                LogUtil.d("BTHandshakeManagerHelp", "parseCommandIDInfo exception");
            }
            i2 = i3;
        }
    }

    public static lnr a(byte[] bArr) {
        if (bArr == null) {
            return new lnr();
        }
        lnr lnrVar = new lnr();
        lnrVar.c(bArr.length);
        lnrVar.c(bArr);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(15);
        return lnrVar;
    }

    public static lnr c(byte[] bArr) {
        if (bArr == null) {
            return new lnr();
        }
        lnr lnrVar = new lnr();
        lnrVar.c(bArr.length);
        lnrVar.c(bArr);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(14);
        return lnrVar;
    }

    public static lnr a(int i, int i2) {
        lnr lnrVar = new lnr();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManagerHelp", " btType: ", Integer.valueOf(i));
        if (i == 0 || i == 5) {
            d(lnrVar);
        } else {
            c(i2, lnrVar);
        }
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(7);
        return lnrVar;
    }

    private static void c(int i, lnr lnrVar) {
        byte[] bArr = {1, 7, 1, 0, 2, 0, 7, 0, 9, 0, 10, 0, 17, 0, 18, 0, Ascii.SYN, 0, Ascii.SUB, 0, Ascii.GS, 0, Ascii.RS, 0, Ascii.US, 0, 32, 0, PublicSuffixDatabase.i, 0, 34, 0};
        if (cod.e(i)) {
            bArr = new byte[]{1, 7, 1, 0, 2, 0, 7, 0, 9, 0};
        }
        lnrVar.c(bArr.length);
        lnrVar.c(bArr);
        cpl.d("BTHandshakeManagerHelp", bArr, "dataContent: ");
    }

    private static void d(lnr lnrVar) {
        lnrVar.c(18);
        lnrVar.c(new byte[]{1, 7, 1, 0, 2, 0, 3, 0, 7, 0, 9, 0, 10, 0, 12, 0, 17, 0});
    }

    public static lnr e(int i) {
        lnr lnrVar = new lnr();
        b();
        d(true);
        if (i == 0) {
            lnrVar.c(12);
            lnrVar.c(new byte[]{1, 1, 1, 0, 2, 0, 3, 0, 4, 0, 6, 0});
        } else {
            lnrVar.c(10);
            lnrVar.c(new byte[]{1, 1, 1, 0, 2, 0, 3, 0, 4, 0});
        }
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(1);
        return lnrVar;
    }

    public static lnr d(byte[] bArr) {
        lnr lnrVar = new lnr();
        lnrVar.c(bArr.length);
        lnrVar.c(bArr);
        lnrVar.d(2);
        lnrVar.g(1);
        lnrVar.e(5);
        return lnrVar;
    }

    public static lnr e(byte[] bArr) {
        if (bArr == null) {
            return new lnr();
        }
        lnr lnrVar = new lnr();
        lnrVar.c(bArr.length);
        lnrVar.c(bArr);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(5);
        return lnrVar;
    }

    public static lnr b(int i, String str, String str2, DeviceInfo deviceInfo) {
        if (str2 == null) {
            return new lnr();
        }
        lnr lnrVar = new lnr();
        byte[] bArrD = cph.d(cph.b(1) + cph.b(19) + (cph.b(1) + cph.b(str.length() / 2) + str) + (cph.b(2) + cph.b((str2.length() / 2) + 2) + cph.d(i) + str2));
        lnrVar.c(bArrD.length);
        lnrVar.c(bArrD);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(19);
        return lnrVar;
    }

    public static lnr b(byte[] bArr) {
        if (bArr == null) {
            return new lnr();
        }
        lnr lnrVar = new lnr();
        lnrVar.c(bArr.length);
        lnrVar.c(bArr);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(2);
        return lnrVar;
    }

    public static lnr b(String str) {
        byte[] bArrD = cph.d(str);
        lnr lnrVar = new lnr();
        lnrVar.c(bArrD.length);
        lnrVar.c(bArrD);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(3);
        return lnrVar;
    }

    public static lnr g() {
        lnr lnrVar = new lnr();
        lnrVar.g(1);
        lnrVar.e(18);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 18);
        byteBufferAllocate.put((byte) -127);
        byteBufferAllocate.put((byte) 0);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        lnrVar.d(1);
        lnrVar.c(true);
        return lnrVar;
    }

    public static lnr h() {
        lnr lnrVar = new lnr();
        lnrVar.g(2);
        lnrVar.e(5);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        lnrVar.d(1);
        lnrVar.c(true);
        return lnrVar;
    }

    public static lnr d() {
        lnr lnrVar = new lnr();
        byte[] bArr = {1, Ascii.SYN, 1, 0};
        lnrVar.c(4);
        lnrVar.c(bArr);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(22);
        return lnrVar;
    }

    public static lnr d(int i) {
        lnr lnrVar = new lnr();
        byte[] bArr = {1, Ascii.SYN, 2, 1, (1 != i && i == 0) ? (byte) 0 : (byte) 1};
        lnrVar.c(5);
        lnrVar.c(bArr);
        lnrVar.d(1);
        lnrVar.c(true);
        lnrVar.g(1);
        lnrVar.e(22);
        return lnrVar;
    }

    public static lnr j() {
        lnr lnrVar = new lnr();
        lnrVar.g(1);
        lnrVar.e(20);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(Ascii.DC4);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        lnrVar.d(1);
        lnrVar.c(true);
        return lnrVar;
    }

    public static lnr e(String str) {
        lnr lnrVar = new lnr();
        String strB = cph.b(26);
        String strB2 = cph.b(5);
        String strB3 = cph.b(str);
        byte[] bArrD = cph.d(strB + strB2 + (cph.b(1) + cph.c(cph.d(strB3).length) + strB3));
        lnrVar.c(bArrD.length);
        lnrVar.c(bArrD);
        lnrVar.g(26);
        lnrVar.e(5);
        return lnrVar;
    }

    public static lnr a() {
        lnr lnrVar = new lnr();
        lnrVar.g(38);
        lnrVar.e(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put((byte) 38);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 0);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        lnrVar.d(1);
        lnrVar.c(true);
        return lnrVar;
    }

    public static lnr f() {
        lnr lnrVar = new lnr();
        lnrVar.g(1);
        lnrVar.e(49);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(14);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 49);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 0);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        return lnrVar;
    }

    public static lnr c() {
        lnr lnrVar = new lnr();
        lnrVar.g(1);
        lnrVar.e(53);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 53);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 1);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        return lnrVar;
    }

    public static lnr j(byte[] bArr) {
        lnr lnrVar = new lnr();
        lnrVar.g(1);
        lnrVar.e(63);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 4);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(Utf8.REPLACEMENT_BYTE);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(cph.f(bArr.length));
        byteBufferAllocate.put(bArr);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        return lnrVar;
    }

    public static lnr i() {
        lnr lnrVar = new lnr();
        lnrVar.g(1);
        lnrVar.e(55);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 55);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(byteBufferAllocate.array());
        return lnrVar;
    }

    public static lnr o() {
        TimeZone timeZoneE = cku.e();
        int offset = timeZoneE.getOffset(System.currentTimeMillis()) / 3600;
        int iAbs = offset / 1000;
        int iAbs2 = (Math.abs(offset % 1000) * 60) / 1000;
        if (iAbs < 0) {
            iAbs = Math.abs(iAbs) + 128;
        }
        int i = (iAbs << 8) + iAbs2;
        String str = cph.b(2) + cph.b(2) + cph.b(i >> 8) + cph.b(i & 255);
        String strB = cph.b(1);
        String strB2 = cph.b(50);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (((int) (System.currentTimeMillis() % 1000)) >= 500) {
            iCurrentTimeMillis++;
        }
        String str2 = cph.b(1) + cph.b(4) + cph.b(iCurrentTimeMillis >> 24) + cph.b((iCurrentTimeMillis >> 16) & 255) + cph.b((iCurrentTimeMillis >> 8) & 255) + cph.b(iCurrentTimeMillis & 255);
        String id = timeZoneE.getID();
        byte[] bArrD = cph.d(strB + strB2 + str2 + str + (cph.b(3) + cph.b(cph.b(id).length() / 2) + cph.b(id)));
        cpl.d("BTHandshakeManagerHelp", bArrD, "dataContent: ");
        return g(bArrD);
    }

    private static lnr g(byte[] bArr) {
        if (bArr == null) {
            return new lnr();
        }
        lnr lnrVar = new lnr();
        lnrVar.c(bArr.length);
        lnrVar.c(bArr);
        lnrVar.d(1);
        lnrVar.g(1);
        lnrVar.e(50);
        return lnrVar;
    }

    public static byte[] l() {
        try {
            byte[] bArrA = lnh.a(16);
            if (bArrA != null) {
                return bArrA;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManagerHelp", "generateRandomBytes fail.");
            return null;
        } catch (NoSuchAlgorithmException e) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManagerHelp", "generateRandomBytes exception with info: ", ExceptionUtils.c(e));
            return null;
        }
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BTHandshakeManagerHelp", "deviceName is empty.");
            return -1;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (upperCase.contains("AW70".toUpperCase(Locale.ENGLISH)) || upperCase.contains("HUAWEI Band 3e-".toUpperCase(Locale.ENGLISH))) {
            return 23;
        }
        if (upperCase.contains("HONOR AW70".toUpperCase(Locale.ENGLISH)) || upperCase.contains("honor Band 4R-".toUpperCase(Locale.ENGLISH))) {
            return 24;
        }
        LogUtil.b("BTHandshakeManagerHelp", "getProductTypeOnlyAw70 default action.");
        return -1;
    }

    public static boolean n() {
        return f40465c;
    }

    public static void d(boolean z) {
        f40465c = z;
    }

    public static int m() {
        return d;
    }

    public static void e() {
        d++;
    }

    public static void b() {
        d = 0;
    }
}
