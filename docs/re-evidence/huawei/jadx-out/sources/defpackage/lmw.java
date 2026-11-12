package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.media3.muxer.Mp4Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.operation.utils.CloudParamKeys;
import health.compact.a.LogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lmw {
    private static boolean i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40469c = new Object();
    private static ConcurrentHashMap<String, Long> d = new ConcurrentHashMap<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f40468b = 0;
    private static int e = 0;
    private static boolean j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<Integer> f40467a = new ArrayList(16);

    private static lno e(lno lnoVar, boolean z) {
        if (z) {
            return null;
        }
        return lnoVar;
    }

    public static List<Integer> e() {
        List<Integer> list;
        synchronized (f40469c) {
            list = f40467a;
        }
        return list;
    }

    public static lnr e(int i2, DeviceInfo deviceInfo) {
        String str;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Start to get phone bond status.");
        String str2 = cph.b(7) + cph.b(13) + cph.b("phoneIdentify");
        if (2 != i2) {
            str = "";
        } else {
            str = cph.b(9) + cph.b(0);
        }
        return lmu.a(cph.d(cph.b(1) + cph.b(15) + (cph.b(1) + cph.b(0)) + (cph.b(3) + cph.b(6) + cph.b(c(deviceInfo, cqf.b()))) + (cph.b(4) + cph.b(1) + cph.b(2)) + (cph.b(5) + cph.b(0)) + str2 + str));
    }

    private static String c(DeviceInfo deviceInfo, String str) {
        if (deviceInfo != null) {
            String strA = lnb.e(BaseApplication.b()).a(deviceInfo.getDeviceIdentify(), BaseApplication.b());
            if (!"".equals(strA)) {
                return cph.a(strA);
            }
            lnb.e(BaseApplication.b()).d(deviceInfo.getDeviceIdentify(), cph.b(str), "btsdk_sharedpreferences_bindid", BaseApplication.b());
        }
        return str;
    }

    public static lno e(String str, Context context, byte[] bArr) {
        lno lnoVarB;
        if (TextUtils.isEmpty(str) || context == null || bArr == null || (lnoVarB = b(str, context, bArr)) == null) {
            return null;
        }
        String strD = cph.d(bArr);
        try {
            boolean z = false;
            for (cqa cqaVar : new cqe().a(strD.substring(4, strD.length())).b()) {
                int iA = cpb.a(cqaVar.b());
                if (iA == 1) {
                    lnoVarB.d(cpb.a(cqaVar.c()));
                } else if (iA == 2) {
                    lnoVarB.e(cpb.a(cqaVar.c()));
                } else if (iA == 4) {
                    lnoVarB.c(cpb.a(cqaVar.c()));
                } else if (iA == 5) {
                    lnoVarB.b(cpb.a(cqaVar.c()));
                } else if (iA == 9) {
                    try {
                        d.put(str, Long.valueOf(Long.parseLong(cqaVar.c(), 16)));
                    } catch (NumberFormatException unused) {
                        LogUtil.d("BTHandshakeManager", "resolveBTDeviceBondStatus NumberFormatException");
                    }
                } else if (iA == 127) {
                    z = true;
                }
            }
            return e(lnoVarB, z);
        } catch (cpy unused2) {
            return new lno();
        }
    }

    private static lno b(String str, Context context, byte[] bArr) {
        if (bArr == null || context == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBindStatusResponse with parameter is not correct.");
            return null;
        }
        lno lnoVar = new lno();
        if (d.get(str) != null) {
            d.put(str, 0L);
        }
        return lnoVar;
    }

    public static lnr d(Context context, BluetoothDevice bluetoothDevice, DeviceInfo deviceInfo, boolean z) {
        String strB;
        String str;
        if (context == null) {
            return null;
        }
        String strC = c(deviceInfo, z, context);
        String strC2 = c(bluetoothDevice, deviceInfo, z);
        lnb.e(BaseApplication.b()).d(strC2, cph.b(strC), "btsdk_sharedpreferences_bindid", BaseApplication.b());
        String strC3 = "";
        if (deviceInfo != null) {
            if (2 == deviceInfo.getDeviceProtocol()) {
                byte[] bArrL = lmu.l();
                if (bArrL != null) {
                    String strC4 = lnb.e(context).c(e, strC2, context, bArrL, deviceInfo);
                    if (strC4 != null && strC4.length() > 64) {
                        strC3 = lmu.c(strC4);
                        String strSubstring = strC4.substring(0, 32);
                        str = cph.b(7) + cph.b(strSubstring.length() / 2) + strSubstring;
                    } else {
                        LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "key:null.");
                        str = "";
                    }
                } else {
                    String strC5 = lnb.e(context).c(e, strC2, context, (byte[]) null, deviceInfo);
                    strB = cph.b(6) + cph.b(strC5.length() / 2) + strC5;
                }
                return a(deviceInfo, strC, strC3, str);
            }
            strB = c(context, deviceInfo, strC2);
        } else {
            strB = b(context, strC2);
        }
        strC3 = strB;
        str = "";
        return a(deviceInfo, strC, strC3, str);
    }

    private static String c(BluetoothDevice bluetoothDevice, DeviceInfo deviceInfo, boolean z) {
        String address = bluetoothDevice == null ? "" : bluetoothDevice.getAddress();
        return (!z || deviceInfo == null) ? address : deviceInfo.getDeviceIdentify();
    }

    private static lnr a(DeviceInfo deviceInfo, String str, String str2, String str3) {
        String strD = d(deviceInfo, o());
        String str4 = cph.b(1) + cph.b(14) + p() + l() + (cph.b(5) + cph.b(6) + cph.b(str)) + str2 + str3 + strD;
        LogUtil.b("BTHandshakeManager", "commandHex: ", str4);
        return lmu.c(cph.d(str4));
    }

    private static String o() {
        try {
            lmu.e();
            String strB = cph.b(BluetoothAdapter.getDefaultAdapter().getName());
            String strC = cph.c(strB.length() / 2);
            return cph.b(9) + strC + strB;
        } catch (SecurityException e2) {
            LogUtil.d("BTHandshakeManager", "dealPhoneMode SecurityException:", ExceptionUtils.c(e2));
            return "";
        }
    }

    private static String c(Context context, DeviceInfo deviceInfo, String str) {
        String strC = lnb.e(context).c(e, str, context, (byte[]) null, deviceInfo);
        return cph.b(6) + cph.b(strC.length() / 2) + strC;
    }

    private static String b(Context context, String str) {
        LogUtil.e("BTHandshakeManager", "requestBindBTDevice deviceInfo is null");
        return d(context, str, (DeviceInfo) null);
    }

    private static String d(DeviceInfo deviceInfo, String str) {
        if (deviceInfo != null) {
            int iD = lmu.d(deviceInfo.getDeviceName());
            LogUtil.b("BTHandshakeManager", "onlyAw70ProductType : ", Integer.valueOf(iD));
            if (cod.a(iD)) {
                return "";
            }
        }
        return str;
    }

    private static String c(DeviceInfo deviceInfo, boolean z, Context context) {
        String strB = cqf.b();
        if (deviceInfo != null) {
            String strA = lnb.e(BaseApplication.b()).a(deviceInfo.getDeviceIdentify(), BaseApplication.b());
            if (!"".equals(strA)) {
                strB = cph.a(strA);
            }
        }
        if (!z) {
            return strB;
        }
        String strE = cot.e();
        return (strE == null || strE.length() < 6) ? strE : strE.substring(strE.length() - 6);
    }

    private static String l() {
        return cph.b(3) + cph.b(1) + cph.b(0);
    }

    private static String p() {
        return cph.b(1) + cph.b(0);
    }

    private static String d(Context context, String str, DeviceInfo deviceInfo) {
        String strC = lnb.e(context).c(e, str, context, (byte[]) null, deviceInfo);
        if (TextUtils.isEmpty(strC)) {
            return "";
        }
        return cph.b(6) + cph.b(strC.length() / 2) + strC;
    }

    public static int h(Context context, byte[] bArr) {
        if (context == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "context is null.");
        }
        if (bArr == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveRequestPairResponse with parameter is not correct.");
            return 0;
        }
        String strD = cph.d(bArr);
        try {
            List<cqa> listB = new cqe().a(strD.substring(4, strD.length())).b();
            if (listB.size() > 0) {
                return cpb.a(listB.get(0).c());
            }
            return 0;
        } catch (cpy unused) {
            LogUtil.d("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveBTDeviceLinkParameter tlv resolve exception");
            return 0;
        }
    }

    public static lnr b(int i2) {
        LogUtil.b("BTHandshakeManager", "Enter getBTDeviceLinkParameter with mBtType:" + i2);
        return lmu.e(i2);
    }

    public static lnp e(Context context, byte[] bArr) {
        if (bArr == null || context == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter with parameter is not correct.");
            return null;
        }
        lnp lnpVar = new lnp();
        String strD = cph.d(bArr);
        try {
            boolean z = false;
            for (cqa cqaVar : new cqe().a(strD.substring(4, strD.length())).b()) {
                int iA = cpb.a(cqaVar.b());
                if (iA == 1) {
                    lnpVar.c(cpb.a(cqaVar.c()));
                } else if (iA == 2) {
                    lnpVar.d(cpb.a(cqaVar.c()));
                } else if (iA == 3) {
                    lnpVar.f(cpb.a(cqaVar.c()));
                } else if (iA == 127) {
                    z = true;
                }
                lnpVar = a(cqaVar, lnpVar);
            }
            if (z) {
                return null;
            }
            return lnpVar;
        } catch (cpy unused) {
            LogUtil.d("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter tlv resolve exception");
            return null;
        }
    }

    private static lnp a(cqa cqaVar, lnp lnpVar) {
        switch (cpb.a(cqaVar.b())) {
            case 4:
                lnpVar.b(cpb.a(cqaVar.c()));
                break;
            case 5:
                String strC = cqaVar.c();
                if (36 != strC.length()) {
                    LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter error with handshake parameter is incorrect.");
                } else {
                    String strSubstring = strC.substring(0, 4);
                    int iA = cpb.a(strSubstring);
                    e = iA;
                    lnpVar.e(iA);
                    String strSubstring2 = strC.substring(4, 36);
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter Authentic version : ", strSubstring, " resolveBTDeviceLinkParameter Authentic randA info : ", strSubstring2);
                    lnpVar.c(strSubstring2);
                }
                break;
            case 6:
                lnpVar.j(cpb.a(cqaVar.c()));
                break;
            case 7:
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter COMMAND_ID_SUPPORT_AUTH_TYPE:", cqaVar.c());
                lnpVar.g(cpb.a(cqaVar.c()));
                break;
            case 8:
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter COMMAND_ID_AUTH_ALGORITHM:", cqaVar.c());
                lnpVar.a(cpb.a(cqaVar.c()));
                break;
            default:
                LogUtil.e("BTHandshakeManager", "resolveBTDeviceLinkParameterElse default:");
                break;
        }
        return lnpVar;
    }

    public static lnr b(int i2, int i3) {
        f40468b = i2;
        return lmu.a(i2, i3);
    }

    public static lnr a(boolean z) {
        lnr lnrVarD = lmu.d(a());
        LogUtil.b("BTHandshakeManager", "setBTDeviceGATTTime isRetry:", Boolean.valueOf(z));
        if (z) {
            i = true;
        }
        return lnrVarD;
    }

    public static byte[] a() {
        int offset = cku.e().getOffset(System.currentTimeMillis()) / 3600;
        int iAbs = offset / 1000;
        int iAbs2 = (Math.abs(offset % 1000) * 60) / 1000;
        if (iAbs < 0) {
            iAbs = Math.abs(iAbs) + 128;
        }
        int i2 = (iAbs << 8) + iAbs2;
        String str = cph.b(2) + cph.b(2) + cph.b(i2 >> 8) + cph.b(i2 & 255);
        String strB = cph.b(1);
        String strB2 = cph.b(5);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (((int) (System.currentTimeMillis() % 1000)) >= 500) {
            iCurrentTimeMillis++;
        }
        return cph.d(strB + strB2 + (cph.b(1) + cph.b(4) + cph.b(iCurrentTimeMillis >> 24) + cph.b((iCurrentTimeMillis >> 16) & 255) + cph.b((iCurrentTimeMillis >> 8) & 255) + cph.b(iCurrentTimeMillis & 255)) + str);
    }

    public static boolean[] b(Context context, byte[] bArr) {
        boolean[] zArr = {false, false};
        if (context == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "context is null.");
        }
        if (bArr == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceGATTTime with parameter is not correct.");
            return zArr;
        }
        String strD = cph.d(bArr);
        try {
            d(new cqe().a(strD.substring(4, strD.length())), zArr);
            if (i) {
                i = false;
            }
            return zArr;
        } catch (cpy unused) {
            LogUtil.d("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter tlv resolve exception");
            return zArr;
        }
    }

    private static void d(cqb cqbVar, boolean[] zArr) {
        List<cqa> listB = cqbVar.b();
        LogUtil.b("BTHandshakeManager", "parseGattTimeData");
        for (cqa cqaVar : listB) {
            int iA = cpb.a(cqaVar.b());
            if (iA == 1) {
                int iA2 = cpb.a(cqaVar.c());
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                int iAbs = Math.abs(iCurrentTimeMillis - iA2);
                LogUtil.b("BTHandshakeManager", "parseGattTimeData currentTime:", Integer.valueOf(iCurrentTimeMillis), ",replyTime:", Integer.valueOf(iA2), " parseGattTimeData offset:", Integer.valueOf(iAbs));
                if (iAbs >= 1 && !i) {
                    zArr[1] = true;
                }
            } else if (iA == 2) {
                LogUtil.b("BTHandshakeManager", "parseGattTimeData ZONE");
            } else if (iA == 127) {
                if (cpb.a(cqaVar.c()) == 100000) {
                    zArr[0] = true;
                }
            } else {
                LogUtil.e("BTHandshakeManager", "parseGattTimeData default");
            }
        }
    }

    public static lnr c(Context context, int i2, String str, String str2, DeviceInfo deviceInfo) {
        if (context == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "context is null.");
        }
        if (str == null || str2 == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "requestAuthenticBTDevice with parameter is not correct.");
            return null;
        }
        return lmu.b(i2, str, str2, deviceInfo);
    }

    public static String e(byte[] bArr) {
        String strC = "";
        if (bArr == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveAuthenticBTDevice with parameter is not correct.");
            return "";
        }
        String strD = cph.d(bArr);
        try {
            for (cqa cqaVar : new cqe().a(strD.substring(4, strD.length())).b()) {
                if (cpb.a(cqaVar.b()) == 1) {
                    strC = cqaVar.c();
                }
            }
            return strC;
        } catch (cpy unused) {
            LogUtil.d("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveAuthenticBTDevice tlv resolve exception");
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    public static lnr a(Context context) {
        if (context == null) {
            return null;
        }
        byte[] bArr = new byte[13];
        int i2 = 1;
        bArr[0] = 1;
        bArr[1] = 5;
        Date date = new Date(System.currentTimeMillis());
        String[] strArrSplit = new SimpleDateFormat("yy MM dd HH mm ss", Locale.US).format(date).split(" ");
        bArr[2] = 10;
        bArr[3] = 9;
        int i3 = 0;
        while (true) {
            if (i3 >= 6) {
                break;
            }
            bArr[i3 + 4] = (byte) Integer.valueOf(strArrSplit[i3], 16).intValue();
            i3++;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i4 = calendar.get(7);
        bArr[10] = (byte) (i4 != 1 ? i4 - 2 : 6);
        if (!DateFormat.is24HourFormat(context)) {
            bArr[11] = 2;
        } else {
            bArr[11] = 1;
        }
        char[] dateFormatOrder = DateFormat.getDateFormatOrder(context);
        if (dateFormatOrder == null || dateFormatOrder.length != 3) {
            i2 = 3;
        } else {
            char c2 = dateFormatOrder[0];
            if (c2 == 'd' && dateFormatOrder[1] == 'M' && dateFormatOrder[2] == 'y') {
                i2 = 2;
            } else if (c2 != 'M' || dateFormatOrder[1] != 'd' || dateFormatOrder[2] != 'y') {
                i2 = 3;
            }
        }
        bArr[12] = (byte) i2;
        return lmu.e(bArr);
    }

    public static byte[] d(Context context, byte[] bArr, String str, DeviceInfo deviceInfo) {
        if (context == null || bArr == null || str == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "encryptTLVsV1 with parameter is not correct.");
            return (byte[]) new byte[0].clone();
        }
        byte[] bArr2 = new byte[3];
        byte[] bArr3 = new byte[bArr.length - 3];
        cpl.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, bArr, 0, "BTHandshakeManager", "encryptTLVsV1 before encrypt commands:");
        System.arraycopy(bArr, 0, bArr2, 0, 3);
        System.arraycopy(bArr, 3, bArr3, 0, bArr.length - 3);
        String str2 = cph.d(bArr2) + cph.d(lmu.d(context, bArr3, deviceInfo, null));
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "encryptTLVsV1 After encrypt result =", str2);
        return cph.d(str2);
    }

    public static byte[] b(Context context, byte[] bArr, String str, boolean z, DeviceInfo deviceInfo) {
        if (context == null || bArr == null || str == null) {
            return (byte[]) new byte[0].clone();
        }
        byte[] bArr2 = new byte[2];
        byte[] bArr3 = new byte[bArr.length - 2];
        byte[] bArrD = d(bArr, bArr2, bArr3);
        if (bArrD == null) {
            return (byte[]) new byte[0].clone();
        }
        if (d.get(str) != null) {
            long jLongValue = d.get(str).longValue();
            if (jLongValue != 0) {
                if (jLongValue == Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
                    d.put(str, 1L);
                } else if (z) {
                    jLongValue++;
                    d.put(str, Long.valueOf(jLongValue));
                } else {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "encryptTLVsV2 send isNeedEncrypt: ", Boolean.valueOf(z));
                }
                byte[] bArrD2 = cph.d(cph.b(jLongValue));
                if (bArrD2 != null && bArrD2.length == 4 && 16 == bArrD.length) {
                    bArrD[12] = bArrD2[0];
                    bArrD[13] = bArrD2[1];
                    bArrD[14] = bArrD2[2];
                    bArrD[15] = bArrD2[3];
                }
            }
        }
        byte[] bArrD3 = lmu.d(context, bArr3, deviceInfo, bArrD);
        if (bArrD3 == null) {
            return (byte[]) new byte[0].clone();
        }
        return cph.d(cph.d(bArr2) + s() + e(cph.d(bArrD)) + a(cph.d(bArrD3)));
    }

    private static String a(String str) {
        return cph.b(126) + cph.c(str.length() / 2) + str;
    }

    private static String e(String str) {
        return cph.b(125) + cph.b(str.length() / 2) + str;
    }

    private static String s() {
        return cph.b(124) + cph.b(1) + cph.b(1);
    }

    private static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(bArr, 2, bArr3, 0, bArr.length - 2);
        byte[] bArrL = lmu.l();
        if (bArrL != null) {
            return bArrL;
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "randIv is null");
        return null;
    }

    public static String d(int i2, int i3, int i4, int i5, int i6) {
        String str = cph.b(127) + cph.b(4) + cph.b(100009L);
        if (2 != i4 && 1 != i4 && i4 != 0) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "The link layer version is not match.");
            return "";
        }
        if (2 == i4) {
            return cph.b(i2) + cph.b(i3) + str;
        }
        if (1 != i4) {
            return str;
        }
        return cph.b(i5) + cph.b(i6) + cph.b(5) + str;
    }

    public static boolean e(Context context, int i2, byte[] bArr) {
        int iA;
        if (bArr != null && context != null) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 0) {
                    LogUtil.e("BTHandshakeManager", "linkVersion is other");
                    return false;
                }
                if (8 == bArr.length && 127 == bArr[2]) {
                    String strD = cph.d(bArr);
                    if (100009 == cpb.a(strD.substring(strD.length() - 8, strD.length()))) {
                        return true;
                    }
                }
                return false;
            }
            String strD2 = cph.d(bArr);
            try {
                List<cqa> listB = new cqe().a(strD2.substring(4, strD2.length())).b();
                if (listB.size() > 0) {
                    try {
                        iA = cpb.a(listB.get(0).b());
                    } catch (NumberFormatException unused) {
                        LogUtil.d("BTHandshakeManager", "checkTimeoutInfo occur NumberFormatException");
                        iA = 0;
                    }
                    if (d(listB, iA)) {
                        return true;
                    }
                }
                return false;
            } catch (cpy unused2) {
                LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "checkTimeOutInfo tlv resolve exception");
            }
        }
        return true;
    }

    private static boolean d(List<cqa> list, int i2) {
        int iA;
        if (127 == i2) {
            try {
                iA = cpb.a(list.get(0).c());
            } catch (NumberFormatException unused) {
                LogUtil.d("BTHandshakeManager", "NumberFormatException");
                iA = 0;
            }
            if (100000 != iA) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "error code = " + iA);
                return true;
            }
        }
        return false;
    }

    public static JSONObject a(Context context, byte[] bArr) {
        if (context == null || bArr == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (d(context, bArr, f40468b == 0 ? 15 : 5)) {
                return jSONObject.put("type", -1);
            }
            String strD = cph.d(bArr);
            try {
                for (cqa cqaVar : new cqe().a(strD.substring(4, strD.length())).b()) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "the case is ", Integer.valueOf(cpb.a(cqaVar.b())));
                    int iA = cpb.a(cqaVar.b());
                    if (iA == 1) {
                        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "has HandshakeConstant.BT_VERSION");
                        jSONObject.put(PluginPayAdapter.KEY_DEVICE_INFO_BT_VERSION, cph.a(cqaVar.c()));
                    } else if (iA == 2) {
                        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "has HandshakeConstant.DEVICE_PRODUCT_TYPE_VALUE");
                        jSONObject.put("type", cpb.a(cqaVar.c()));
                    }
                    jSONObject = b(cqaVar, jSONObject);
                }
                return jSONObject;
            } catch (cpy unused) {
                return jSONObject.put("type", -1);
            }
        } catch (JSONException unused2) {
            m();
            return jSONObject;
        }
    }

    private static void m() {
        LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "put params error");
    }

    private static boolean d(Context context, byte[] bArr, int i2) throws JSONException {
        if (bArr == null || context == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "parameter is incorrect.");
            return true;
        }
        if (i2 == bArr.length) {
            return false;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "command length is incorrect.", Integer.valueOf(bArr.length));
        return false;
    }

    private static JSONObject b(cqa cqaVar, JSONObject jSONObject) {
        try {
            int iA = cpb.a(cqaVar.b());
            if (iA == 3) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "has DEVICE_VERSION: ", cqaVar.c());
                jSONObject.put("device_version", cph.a(cqaVar.c()));
                return jSONObject;
            }
            if (iA == 7) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "has DEVICE_SOFT_VERSION: ", cqaVar.c());
                jSONObject.put(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION, cph.a(cqaVar.c()));
                return jSONObject;
            }
            if (iA == 12) {
                jSONObject.put("device_name", cph.a(cqaVar.c()));
                return jSONObject;
            }
            if (iA == 9) {
                jSONObject.put("UUID", cqaVar.c());
                return jSONObject;
            }
            if (iA == 10) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "has DEVICE_MODEL:", cqaVar.c());
                jSONObject.put("device_model", cph.a(cqaVar.c()));
                return jSONObject;
            }
            if (iA == 14) {
                jSONObject.put("force_sn", cpb.a(cqaVar.c()));
                return jSONObject;
            }
            if (iA == 15) {
                LogUtil.b("BTHandshakeManager", "ota_package_name:", cph.a(cqaVar.c()));
                jSONObject.put("device_ota_package_name", cph.a(cqaVar.c()));
                return jSONObject;
            }
            if (iA == 17) {
                LogUtil.b("BTHandshakeManager", "COMMAND_ID_CERT_MODEL not null: ", cph.a(cqaVar.c()));
                jSONObject.put("cert_model", cph.a(cqaVar.c()));
                return jSONObject;
            }
            if (iA == 18) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "COMMAND_ID_POWER_SAVE not null: ", Integer.valueOf(cpb.a(cqaVar.c())));
                jSONObject.put("power_save", cpb.a(cqaVar.c()));
                return jSONObject;
            }
            a(cqaVar, jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "createJsonObject fail");
            return jSONObject;
        }
    }

    private static void a(cqa cqaVar, JSONObject jSONObject) throws JSONException {
        int iA = cpb.a(cqaVar.b());
        if (iA == 21) {
            LogUtil.b("BTHandshakeManager", "COMMAND_ID_PRODUCT_ID not null: ", cph.a(cqaVar.c()));
            jSONObject.put("hilink_device_id", cph.a(cqaVar.c()));
            return;
        }
        if (iA == 22) {
            LogUtil.b("BTHandshakeManager", "COMMAND_ID_CERT_MODEL not null: ", cph.a(cqaVar.c()));
            jSONObject.put("device_manufacture", cph.a(cqaVar.c()));
            return;
        }
        if (iA == 26) {
            LogUtil.b("BTHandshakeManager", "COMMAND_ID_VERSION_TYPE not null: ", Integer.valueOf(cpb.a(cqaVar.c())));
            jSONObject.put("device_version_type", cpb.a(cqaVar.c()));
            return;
        }
        switch (iA) {
            case 29:
                jSONObject.put("udid_from_device", cph.a(cqaVar.c()));
                break;
            case 30:
                jSONObject.put("unconverted_udid", cph.a(cqaVar.c()));
                break;
            case 31:
                jSONObject.put("device_factory_reset", cpb.a(cqaVar.c()));
                break;
            case 32:
                jSONObject.put("device_country_code", cph.a(cqaVar.c()));
                break;
            case 33:
                jSONObject.put("device_emui_version", cph.a(cqaVar.c()));
                break;
            case 34:
                jSONObject.put("device_multi_link_ble_mac", cph.a(cqaVar.c()));
                break;
        }
    }

    public static lnr c(Context context) {
        if (context == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "context is null.");
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Enter requestBTDeviceServiceCapability().");
        String strB = cph.b(1);
        String strB2 = cph.b(2);
        StringBuffer stringBuffer = new StringBuffer(16);
        synchronized (f40469c) {
            List<Integer> listE = cor.e();
            for (int i2 = 1; i2 < listE.size(); i2++) {
                stringBuffer.append(cph.b(listE.get(i2).intValue()));
            }
        }
        String string = stringBuffer.toString();
        return lmu.b(cph.d(strB + strB2 + (cph.b(1) + cph.b(string.length() / 2) + string)));
    }

    public static List<Integer> c(Context context, byte[] bArr) {
        cqb cqbVarA;
        if (context == null || bArr == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceServiceCapability with parameter is not correct.");
            return new ArrayList(16);
        }
        String strI = i(context, bArr);
        if (strI == null) {
            return new ArrayList(16);
        }
        try {
            cqbVarA = new cqe().a(strI.substring(4, strI.length()));
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceLinkParameter tlv resolve exception");
            cqbVarA = null;
        }
        if (cqbVarA != null) {
            String strC = "";
            List<cqa> listB = cqbVarA.b();
            if (listB.size() > 0) {
                strC = listB.get(0).c();
            } else {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "TLV info is incorrect.");
            }
            synchronized (f40469c) {
                List<Integer> listE = cor.e();
                if (strC.length() > 0) {
                    return a(strC, listE);
                }
                return new ArrayList(16);
            }
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceServiceCapability tlvFather is null.");
        return new ArrayList(16);
    }

    private static List<Integer> a(String str, List<Integer> list) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(1);
        f40467a.clear();
        for (int i2 = 0; i2 < str.length() / 2; i2++) {
            int iC = c(str, i2);
            if (i2 < list.size() - 1) {
                if (1 == iC) {
                    arrayList.add(list.get(i2 + 1));
                } else {
                    f40467a.add(list.get(i2 + 1));
                }
            }
        }
        return arrayList;
    }

    private static int c(String str, int i2) {
        int i3 = i2 * 2;
        return cpb.a(str.substring(i3, i3 + 2));
    }

    private static String i(Context context, byte[] bArr) {
        if (bArr == null || context == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceServiceCapability with parameter is not correct.");
        }
        String strI = i(bArr);
        if (strI == null) {
            return null;
        }
        return strI;
    }

    private static String i(byte[] bArr) {
        String strD = cph.d(bArr);
        if (strD != null && strD.length() != 0) {
            return strD;
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "dataStrInfo is incorrect.");
        return null;
    }

    public static lnr d(Context context, List<Integer> list) {
        if (context == null) {
            LogUtil.e("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "context is null.");
        }
        if (d(list)) {
            return null;
        }
        boolean zE = coy.e();
        j = zE;
        Map<Integer, List<Integer>> mapD = cor.d(zE);
        StringBuffer stringBuffer = new StringBuffer(16);
        for (Integer num : list) {
            int iIntValue = num.intValue();
            List<Integer> list2 = mapD.get(num);
            if (list2 != null && list2.size() > 0) {
                String str = cph.b(2) + cph.b(1) + cph.b(iIntValue);
                String str2 = cph.b(3) + cph.b(list2.size());
                StringBuffer stringBuffer2 = new StringBuffer(16);
                Iterator<Integer> it = list2.iterator();
                while (it.hasNext()) {
                    stringBuffer2.append(cph.b(it.next().intValue()));
                }
                String str3 = str2 + stringBuffer2.toString();
                stringBuffer.append(str);
                stringBuffer.append(str3);
            }
        }
        String string = stringBuffer.toString();
        return lmu.b(cph.b(1) + cph.b(3) + (cph.b(129) + cph.c(string.length() / 2) + string));
    }

    private static boolean d(List<Integer> list) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Enter requestBTDeviceCommandCapability().");
        if (list != null) {
            return false;
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "serviceIdList is null.");
        return true;
    }

    public static lnr j() {
        return lmu.f();
    }

    public static lnr n() {
        return lmu.o();
    }

    public static lnr c() {
        return lmu.c();
    }

    public static lnr b(byte[] bArr) {
        return lmu.j(bArr);
    }

    public static lnr i() {
        return lmu.i();
    }

    public static lnr f() {
        return lmu.g();
    }

    public static lnr h() {
        return lmu.h();
    }

    public static boolean a(Context context, byte[] bArr, DeviceCapability deviceCapability) {
        cqb cqbVarA;
        int iA;
        b(context, bArr, deviceCapability);
        String strD = cph.d(bArr);
        if (strD == null || strD.length() == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "dataStrInfo is incorrect for resolveBTDeviceCommandCapability.");
            return false;
        }
        try {
            cqbVarA = new cqe().a(strD.substring(4, strD.length()));
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceCommandCapability tlv resolve exception");
            cqbVarA = null;
        }
        if (cqbVarA == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "tlvFather is null.");
            return false;
        }
        List<cqb> listE = cqbVarA.e();
        j = coy.e();
        Iterator<cqb> it = listE.iterator();
        int iA2 = 0;
        while (it.hasNext()) {
            for (cqa cqaVar : it.next().b()) {
                try {
                    iA = cpb.a(cqaVar.b());
                } catch (NumberFormatException unused2) {
                    LogUtil.d("BTHandshakeManager", "tlv.getTag() NumberFormatException");
                    iA = 0;
                }
                if (iA == 2) {
                    iA2 = cpb.a(cqaVar.c());
                } else if (iA == 4) {
                    lmu.d(context, iA2, cqaVar.c(), deviceCapability, j);
                } else {
                    LogUtil.e("BTHandshakeManager", "other command type");
                }
            }
        }
        return true;
    }

    private static void b(Context context, byte[] bArr, DeviceCapability deviceCapability) {
        if (bArr == null || context == null || deviceCapability == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "resolveBTDeviceCommandCapability with parameter is not correct.");
        }
    }

    public static boolean c(byte[] bArr, DeviceCapability deviceCapability) {
        cqb cqbVarA;
        if (bArr == null || deviceCapability == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceSupportedActivityType with parameter is not correct.");
            return false;
        }
        String strD = cph.d(bArr);
        if (strD == null || strD.length() == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "dataStrInfo is incorrect.");
            return false;
        }
        try {
            cqbVarA = new cqe().a(strD.substring(4, strD.length()));
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceSupportedActivityType tlv resolve exception");
            cqbVarA = null;
        }
        if (cqbVarA == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "tlvFather is null.");
            return false;
        }
        Iterator<cqb> it = cqbVarA.e().iterator();
        while (it.hasNext()) {
            for (cqa cqaVar : it.next().b()) {
                int iA = cpb.a(cqaVar.b());
                if (iA == 2) {
                    lni.c(cpb.a(cqaVar.c()), deviceCapability);
                } else if (iA == 3) {
                    lni.b(cpb.a(cqaVar.c()), deviceCapability);
                } else {
                    LogUtil.e("BTHandshakeManager", "other tlv command type");
                }
            }
        }
        return true;
    }

    public static boolean e(byte[] bArr, DeviceCapability deviceCapability) {
        cqb cqbVarA;
        if (bArr == null || deviceCapability == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceSupportedNotificationType() with parameter is not correct.");
            return false;
        }
        String strD = cph.d(bArr);
        if (strD == null || strD.length() == 0) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceSupportedNotificationType() dataStrInfo is incorrect.");
            return false;
        }
        try {
            cqbVarA = new cqe().a(strD.substring(4, strD.length()));
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceSupportedNotificationType tlv resolve exception");
            cqbVarA = null;
        }
        if (cqbVarA != null) {
            for (cqa cqaVar : cqbVarA.b()) {
                if (cpb.a(cqaVar.b()) == 1) {
                    lni.a(cpb.a(cqaVar.c()), deviceCapability);
                }
            }
            return true;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveBTDeviceSupportedNotificationType() tlvFather is null.");
        return false;
    }

    public static boolean b(int i2, int i3, byte[] bArr) {
        cqb cqbVarA;
        String strD = cph.d(bArr);
        if (strD == null || strD.length() == 0) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "isSupportedCommand() dataStrInfo is incorrect.");
            return false;
        }
        String strSubstring = strD.substring(4, strD.length());
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "isSupportedCommand() tlvStrInfo:", strSubstring);
        try {
            cqbVarA = new cqe().a(strSubstring);
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "isSupportedCommand() tlv resolve exception");
            cqbVarA = null;
        }
        if (cqbVarA == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "isSupportedCommand() tlvFather is null.");
            return false;
        }
        return c(i2, i3, false, 0, cqbVarA.e());
    }

    private static boolean c(int i2, int i3, boolean z, int i4, List<cqb> list) {
        j = coy.e();
        Iterator<cqb> it = list.iterator();
        while (it.hasNext()) {
            for (cqa cqaVar : it.next().b()) {
                int iA = cpb.a(cqaVar.b());
                if (iA != 2) {
                    if (iA == 4 && i4 != 0) {
                        String strC = cqaVar.c();
                        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "isSupportedCommand() strCommandIDValueInfo : ", strC);
                        List<Integer> list2 = cor.d(j).get(Integer.valueOf(i4));
                        if (list2 != null && list2.size() > 0) {
                            for (int i5 = 0; i5 < strC.length(); i5 += 2) {
                                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "isSupportedCommand() index : ", Integer.valueOf(i5));
                                boolean zA = a(strC, i5);
                                if (i3 == list2.get(i5 / 2).intValue()) {
                                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "isSupportedCommand() mFlag : ", Boolean.valueOf(zA));
                                    i4 = 0;
                                    z = zA;
                                }
                            }
                        }
                    }
                } else if (i2 == cpb.a(cqaVar.c())) {
                    i4 = i2;
                }
            }
        }
        return z;
    }

    private static boolean a(String str, int i2) {
        return cpb.a(str.substring(i2, i2 + 2)) == 1;
    }

    public static byte[] e(Context context, byte[] bArr, DeviceInfo deviceInfo) {
        String strO;
        if (context == null || deviceInfo == null || g(bArr) || (strO = o(bArr)) == null) {
            return null;
        }
        try {
            String strC = "";
            String strC2 = "";
            int iA = 0;
            for (cqa cqaVar : new cqe().a(strO).b()) {
                switch (cpb.a(cqaVar.b())) {
                    case 124:
                        iA = cpb.a(cqaVar.c());
                        break;
                    case 125:
                        strC = cqaVar.c();
                        break;
                    case 126:
                        strC2 = cqaVar.c();
                        break;
                }
            }
            if (1 == iA) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Need desEncrypt.");
                return e(context, bArr, deviceInfo, strC, strC2);
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Do not need desEncrypt.");
            return bArr;
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "checkDesEncryptCommand tlv resolve exception");
            return null;
        } catch (NumberFormatException unused2) {
            return k();
        }
    }

    private static byte[] k() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "checkDesEncryptCommand tlv resolve NumberFormatException.");
        return null;
    }

    private static String o(byte[] bArr) {
        String strD = cph.d(bArr);
        if (strD.length() < 4) {
            return null;
        }
        return strD.substring(4, strD.length());
    }

    private static boolean g(byte[] bArr) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Enter checkEncryptCommand().");
        if (bArr != null) {
            return false;
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "dataContent is null.");
        return true;
    }

    private static byte[] e(Context context, byte[] bArr, DeviceInfo deviceInfo, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strC = c(context, deviceInfo);
            if (!TextUtils.isEmpty(strC)) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Start to desEncrypt data.encryptData ", str2, "encryptIv ", str);
                byte[] bArrD = lnh.d(1, cph.d(str2), cph.d(strC), cph.d(str));
                if (bArrD == null) {
                    return null;
                }
                byte[] bArr2 = new byte[bArrD.length + 2];
                bArr2[0] = bArr[0];
                bArr2[1] = bArr[1];
                System.arraycopy(bArrD, 0, bArr2, 2, bArrD.length);
                return bArr2;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "key is not incorrect.");
            return null;
        }
        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Encrypt data is incorrect.");
        return null;
    }

    private static String c(Context context, DeviceInfo deviceInfo) {
        return lnb.e(context).c(context, deviceInfo);
    }

    public static lnr d() {
        return lmu.d();
    }

    public static lnr e(int i2) {
        return lmu.d(i2);
    }

    public static int d(Context context, byte[] bArr) {
        if (bArr == null || context == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "getBTDeviceAvailableStatusParameter with parameter is not correct.");
            return -1;
        }
        String strD = cph.d(bArr);
        try {
            return c(-1, new cqe().a(strD.substring(4, strD.length())));
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "getBTDeviceAvailableStatusParameter tlv resolve exception");
            return -1;
        }
    }

    private static int c(int i2, cqb cqbVar) {
        for (cqa cqaVar : cqbVar.b()) {
            try {
                i2 = Integer.parseInt(cqaVar.c(), 16);
            } catch (NumberFormatException unused) {
                LogUtil.d("BTHandshakeManager", "tlv.getValue() NumberFormatException");
            }
            int iA = cpb.a(cqaVar.b());
            if (iA == 0) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", " Not support dual phone connection.");
            } else if (iA == 1) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "current connected.");
            } else if (iA == 2) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Has been connected.");
            } else if (iA == 3) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "Double phone situation.");
            } else if (iA == 127) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "notify device operation.");
            }
        }
        return i2;
    }

    public static lnr g() {
        return lmu.j();
    }

    public static lnr b(String str) {
        return lmu.e(str);
    }

    public static lnr b() {
        return lmu.a();
    }

    public static boolean j(byte[] bArr) {
        if (bArr == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveGoldCard with parameter is not correct.");
            return false;
        }
        String strD = cph.d(bArr);
        try {
            List<cqa> listB = new cqe().a(strD.substring(4, strD.length())).b();
            if (listB.size() <= 0) {
                return false;
            }
            int iA = cpb.a(listB.get(0).c());
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveGoldCard result :", Integer.valueOf(iA));
            String binaryString = Integer.toBinaryString(iA);
            int length = binaryString.length();
            if (8 > length) {
                for (int i2 = 0; i2 < 8 - length; i2++) {
                    binaryString = "0" + binaryString;
                }
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveGoldCard result :", Integer.valueOf(iA), CloudParamKeys.INFO, binaryString);
            return binaryString.substring(4, 5).equals("1");
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveGoldCard tlv resolve exception");
            return false;
        }
    }

    public static boolean[] b(DeviceInfo deviceInfo, byte[] bArr) {
        boolean[] zArr = {false, false};
        if (bArr == null || deviceInfo == null) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "AutoDetectSwitchStatusAndWorkMode with parameter is not correct.");
            return zArr;
        }
        String strD = cph.d(bArr);
        try {
            for (cqa cqaVar : new cqe().a(strD.substring(4, strD.length())).b()) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "the case is ", Integer.valueOf(cpb.a(cqaVar.b())));
                int iA = cpb.a(cqaVar.b());
                if (iA == 1) {
                    int iA2 = cpb.a(cqaVar.c());
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "AutoDetectSwitchStatusAndWorkMode AutoDetectSwitchStatus mode:", Integer.valueOf(iA2));
                    zArr[0] = true;
                    deviceInfo.setAutoDetectSwitchStatus(iA2);
                } else if (iA == 2) {
                    int iA3 = cpb.a(cqaVar.c());
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "AutoDetectSwitchStatusAndWorkMode AutoDetectSwitchStatus status: ", Integer.valueOf(iA3));
                    zArr[1] = true;
                    deviceInfo.setFootWearPosition(iA3);
                }
            }
            return zArr;
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "AutoDetectSwitchStatusAndWorkMode tlv resolve exception");
            return zArr;
        }
    }

    public static boolean b(byte[] bArr, DeviceCapability deviceCapability) {
        if (bArr == null || deviceCapability == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveSettingRelated with parameter is not correct.");
            return false;
        }
        try {
            for (cqa cqaVar : new cqe().a(cph.d(bArr).substring(4)).b()) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "the case is ", Integer.valueOf(cpb.a(cqaVar.b())));
                switch (cpb.a(cqaVar.b())) {
                    case 1:
                        a(deviceCapability, cqaVar);
                        break;
                    case 2:
                        b(deviceCapability, cqaVar);
                        break;
                    case 3:
                        f(deviceCapability, cqaVar);
                        break;
                    case 4:
                        e(deviceCapability, cqaVar);
                        break;
                    case 5:
                        d(deviceCapability, cqaVar);
                        break;
                    case 6:
                        c(deviceCapability, cqaVar);
                        break;
                    default:
                        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveSettingRelated default");
                        break;
                }
            }
            return true;
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveSettingRelated tlv resolve exception");
            return false;
        }
    }

    private static void c(DeviceCapability deviceCapability, cqa cqaVar) {
        if (deviceCapability == null || cqaVar == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "params is null");
        } else {
            deviceCapability.configureHmsNotifyUpdate(cpb.a(cqaVar.c()) == 1);
        }
    }

    private static void d(DeviceCapability deviceCapability, cqa cqaVar) {
        if (deviceCapability == null || cqaVar == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "capability or tlv is null");
        } else {
            deviceCapability.configureHmsAutoUpdateWifi(cpb.a(cqaVar.c()) == 1);
        }
    }

    private static void e(DeviceCapability deviceCapability, cqa cqaVar) {
        if (deviceCapability == null || cqaVar == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "capability or tlv is null");
        } else {
            deviceCapability.configureHmsAutoUpdate(cpb.a(cqaVar.c()) == 1);
        }
    }

    private static void f(DeviceCapability deviceCapability, cqa cqaVar) {
        if (deviceCapability == null || cqaVar == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "capability tlv is null");
        } else {
            deviceCapability.setSupportSmartWatchVersionStatus(true);
            deviceCapability.configureSmartWatchVersionTypeValue(cpb.a(cqaVar.c()));
        }
    }

    private static void a(DeviceCapability deviceCapability, cqa cqaVar) {
        if (deviceCapability == null || cqaVar == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "capability tlv is null");
            return;
        }
        int iA = cpb.a(cqaVar.c());
        if ((iA & 1) == 1) {
            deviceCapability.configureSupportLegalPrivacy(true);
        }
        if (((iA >> 1) & 1) == 1) {
            deviceCapability.configureSupportLegalUserAgreement(true);
        }
        if (((iA >> 2) & 1) == 1) {
            deviceCapability.configureSupportOpenSourceOpen(true);
        }
        if (((iA >> 3) & 1) == 1) {
            deviceCapability.configureSupportLegalServiceStatement(true);
        }
        if (((iA >> 4) & 1) == 1) {
            deviceCapability.configureSupportLegalSourceStatement(true);
        }
        if (((iA >> 5) & 1) == 1) {
            deviceCapability.configureSupportLegalSystemWebView(true);
        }
    }

    private static int c(byte[] bArr, int i2) {
        if (bArr == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveTlvUniqueValue with parameter is not correct.");
            return -1;
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "start resolveTlvUniqueValue");
        String strD = cph.d(bArr);
        try {
            for (cqa cqaVar : new cqe().a(strD.substring(4, strD.length())).b()) {
                if (cpb.a(cqaVar.b()) == i2) {
                    return cpb.a(cqaVar.c());
                }
            }
            return -1;
        } catch (cpy unused) {
            LogUtil.d("0xA0200008", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveTlvUniqueValue tlv resolve exception");
            return -1;
        }
    }

    public static boolean d(byte[] bArr) {
        int iC = c(bArr, 2);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "start resolveAccountJudgmentResults", Integer.valueOf(iC));
        return iC != 1;
    }

    public static boolean h(byte[] bArr) {
        int iC = c(bArr, 1);
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "start resolveUserSelectRestoreFactory", Integer.valueOf(iC));
        return iC == 0;
    }

    private static void b(DeviceCapability deviceCapability, cqa cqaVar) {
        if (deviceCapability == null || cqaVar == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "parseSelfUploadDeviceLogCapability capability tlv is null");
            return;
        }
        byte[] bArrD = cph.d(cqaVar.c());
        LogUtil.b("BTHandshakeManager", "string bitmap : ", cqaVar.c());
        if (cpb.d(bArrD, 0)) {
            LogUtil.b("BTHandshakeManager", "isSupportSelfUploadDeviceLog : ", true);
            deviceCapability.setSupportSelfUploadDeviceLog(true);
        }
        if (cpb.d(bArrD, 1)) {
            LogUtil.b("BTHandshakeManager", "isSupportCoreSleepNewFile : ", true);
            deviceCapability.configureSupportCoreSleepNewFile(true);
        }
        if (cpb.d(bArrD, 2)) {
            LogUtil.b("BTHandshakeManager", "isSupportRriNewFile : ", true);
            deviceCapability.configureSupportRriNewFile(true);
        }
        if (cpb.d(bArrD, 3)) {
            LogUtil.b("BTHandshakeManager", "isSupportUploadGpsAndPdrFile : ", true);
            deviceCapability.configureIsSupportUploadGpsAndPdrFile(true);
        }
    }

    public static void f(byte[] bArr) {
        if (bArr == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "capability tlv is null");
            return;
        }
        try {
            for (cqa cqaVar : new cqe().a(cph.d(bArr).substring(4)).b()) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "the case is ", Integer.valueOf(cpb.a(cqaVar.b())));
                if (cpb.a(cqaVar.b()) == 127) {
                    if (cpb.a(cqaVar.c()) == 100000) {
                        LogUtil.b("BTHandshakeManager", "zoneId success");
                    }
                } else {
                    LogUtil.e("BTHandshakeManager", "zoneId default");
                }
            }
        } catch (cpy unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveSetTimeZoneId tlv resolve exception");
        }
    }

    public static String c(byte[] bArr) {
        String strC = "";
        if (bArr == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "capability tlv is null");
            return "";
        }
        List<cqa> listA = a(bArr);
        if (listA == null) {
            return "";
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveExpandCapability info:", listA.toString());
        for (cqa cqaVar : listA) {
            if (cpb.a(cqaVar.b()) != 1) {
                LogUtil.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTHandshakeManager", "resolveExpandCapability default");
            } else {
                strC = cqaVar.c();
            }
        }
        return strC;
    }

    public static List<cqa> a(byte[] bArr) {
        cqb cqbVarA;
        if (bArr == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveDataGetTlvFather parameter is not correct.");
            return null;
        }
        String strD = cph.d(bArr);
        if (strD.length() < 4) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTHandshakeManager", "resolveDataGetTlvFather dataStrInfo error");
            return null;
        }
        try {
            cqbVarA = new cqe().a(strD.substring(4));
        } catch (cpy unused) {
            LogUtil.d("0xA0200008", a.t, 0, "BTHandshakeManager", "resolve tlv exception:");
            cqbVarA = null;
        }
        if (cqbVarA == null) {
            return null;
        }
        return cqbVarA.b();
    }
}
