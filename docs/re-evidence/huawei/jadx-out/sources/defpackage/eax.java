package defpackage;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class eax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile eax f32629a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32630c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f32631b;
    private String[] d = {"G", "H", RequestOptions.AD_CONTENT_CLASSIFICATION_J, "I"};
    private List<ebv> e;
    private List<ScanResult> j;

    private eax(Context context) {
        if (context != null) {
            this.f32631b = context.getApplicationContext();
        } else {
            dyg.e(false, "DeviceWifiAp", "DeviceWifiAp context is null ");
        }
    }

    public static eax a(Context context) {
        if (f32629a == null) {
            synchronized (f32630c) {
                if (f32629a == null) {
                    f32629a = new eax(context);
                }
            }
        }
        return f32629a;
    }

    public String d(ebv ebvVar) {
        String strA = "";
        if (ebvVar != null) {
            dyg.e(false, "DeviceWifiAp", "scanSelectWifiAp info ", ebvVar.toString());
            Context context = this.f32631b;
            if (context != null) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                wifiManager.startScan();
                this.j = ecb.d(wifiManager.getScanResults());
            } else {
                dyg.e(false, "DeviceWifiAp", "scanSelectWifiAp mContext is null ");
            }
            List<ebv> listA = a(this.j);
            this.e = listA;
            dyg.a(false, "DeviceWifiAp", "scanSelectWifiAp device size:", Integer.valueOf(listA.size()));
            for (ebv ebvVar2 : this.e) {
                if (ebvVar.a() != null && ebvVar.a().equals(ebvVar2.a())) {
                    strA = a(ebvVar2.i());
                }
            }
        }
        return strA;
    }

    public String a(String str) {
        String strGroup = "";
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "DeviceWifiAp", "fetchDeviceWorkStatusMsg ssid is empty.");
            return "";
        }
        int length = str.length();
        if (d(str) && length > 19) {
            Matcher matcher = Pattern.compile("^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})").matcher(str);
            while (matcher.find()) {
                strGroup = matcher.group(1);
            }
        }
        dyg.a(false, "DeviceWifiAp", "fetchDeviceWorkStatusMsg: ", strGroup);
        return strGroup;
    }

    public List<ebv> d(elh elhVar) {
        dyg.a(false, "DeviceWifiAp", "------scanWifiAp----");
        List<ScanResult> listD = ecb.d(((WifiManager) this.f32631b.getSystemService("wifi")).getScanResults());
        this.j = listD;
        List<ebv> listA = a(elhVar, listD);
        this.e = listA;
        dyg.a(false, "DeviceWifiAp", "scanWifiAp mAddDeviceInfos size:", Integer.valueOf(listA.size()));
        return this.e;
    }

    private List<ebv> a(List<ScanResult> list) {
        ArrayList arrayList = new ArrayList(16);
        if (list != null) {
            dyg.a(false, "DeviceWifiAp", "getAddDeviceInfosByResult enter");
            for (ScanResult scanResult : list) {
                String str = scanResult.SSID;
                if (TextUtils.isEmpty(str)) {
                    dyg.e(true, "DeviceWifiAp", "ssid is null.");
                } else if (str.length() == 32) {
                    if (str.startsWith("Hi- ")) {
                        dyg.a(false, "DeviceWifiAp", "Hi- , SoftAp branch");
                        String[] strArrSplit = str.split(Constants.LINK);
                        if (!d(strArrSplit)) {
                            String strSubstring = strArrSplit[3].substring(1, 5);
                            String strSubstring2 = strArrSplit[3].substring(5, 6);
                            if ("0".equals(strArrSplit[3].substring(0, 1))) {
                                int iC = new eca("B").c();
                                dyg.e(true, "DeviceWifiAp", "mode: ", Integer.valueOf(iC));
                                ebv ebvVar = new ebv(str, strSubstring2, iC);
                                ebvVar.i("softap");
                                ebvVar.e(scanResult.BSSID);
                                ebvVar.b(strSubstring);
                                arrayList.add(ebvVar);
                                dyg.e(true, "DeviceWifiAp", ebvVar.toString());
                            } else {
                                dyg.e(true, "DeviceWifiAp", "mode is not 0");
                            }
                        }
                    } else {
                        dyg.e(true, "DeviceWifiAp", dyg.b(str), "  len:", Integer.valueOf(str.length()));
                        if (d(str) && c(str)) {
                            arrayList.add(d(str, scanResult));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean d(String[] strArr) {
        if (strArr.length < 4) {
            dyg.e(true, "DeviceWifiAp", "buffers.length < 4 ssid split faild:", Integer.valueOf(strArr.length));
            return true;
        }
        if (strArr.length != 4 || strArr[3].length() < 6) {
            dyg.e(true, "DeviceWifiAp", "ssid split faild:", Integer.valueOf(strArr.length));
            return true;
        }
        if (Pattern.matches("[0-9A-Za-z]+", strArr[3].substring(0, 6))) {
            return false;
        }
        dyg.e(true, "DeviceWifiAp", "ssid[3] is not avalid：", strArr[3]);
        return true;
    }

    private ebv d(String str, ScanResult scanResult) {
        dyg.a(false, "DeviceWifiAp", "broadcast branch", dyg.b(str));
        Matcher matcher = Pattern.compile("^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})").matcher(str);
        String strGroup = "";
        int iC = -1;
        String strGroup2 = "";
        while (matcher.find()) {
            strGroup2 = matcher.group(3);
            strGroup = matcher.group(4);
            iC = new eca(matcher.group(5)).c();
            dyg.e(true, "DeviceWifiAp", "deviceSn :", strGroup);
        }
        ebv ebvVar = new ebv(str, strGroup, iC);
        ebvVar.i("wifiap");
        ebvVar.e(scanResult.BSSID);
        ebvVar.b(strGroup2);
        return ebvVar;
    }

    public boolean c(String str) {
        if (d(str) && str.length() > 19) {
            dyg.e(true, "DeviceWifiAp", "CheckSpecialStatusSsid ", str);
            Matcher matcher = Pattern.compile("^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})").matcher(str);
            String strGroup = "";
            while (matcher.find()) {
                strGroup = matcher.group(3);
            }
            for (String str2 : this.d) {
                if (str2.equals(strGroup)) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<ebv> a(elh elhVar, List<ScanResult> list) {
        List<ebv> listA = a(list);
        if (listA.size() == 0 || elhVar == null) {
            return listA;
        }
        ArrayList arrayList = new ArrayList(16);
        for (ebv ebvVar : listA) {
            if (elhVar.x().b(ebvVar.j())) {
                ebvVar.j(elhVar.t());
                arrayList.add(ebvVar);
            }
        }
        return arrayList;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str) || str.endsWith("_5G")) {
            return false;
        }
        return Pattern.compile("^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})").matcher(str).matches();
    }

    public ebv c(ebu ebuVar) {
        ebv ebvVar = new ebv();
        if (ebuVar == null || ebuVar.e() == null) {
            dyg.d(false, "DeviceWifiAp", "COAP Scan devInfo is null");
            return ebvVar;
        }
        dyg.e(true, "DeviceWifiAp", "model is :", ebuVar);
        String strE = ebuVar.e().e();
        boolean z = strE == null || ebuVar.e().a() == null;
        String strD = ebuVar.e().d();
        if (!z && strD != null) {
            if (strE.length() > 1) {
                strE = strE.substring(strE.length() - 1);
            }
            ebvVar.d(strE);
            String strB = ebuVar.e().b();
            StringBuilder sb = new StringBuilder(16);
            sb.append("Hi00");
            sb.append(strB);
            StringBuilder sb2 = new StringBuilder(16);
            sb2.append("000000000000000000000000");
            sb.append(sb2.toString());
            String string = sb.toString();
            dyg.e(true, "DeviceWifiAp", "parseCoapEntityToDeviceInfo: ssid is ", dyg.b(string));
            ebvVar.b(strB);
            ebvVar.h(string);
            ebvVar.c(ebuVar.d());
            ebvVar.e(ebuVar.e().c());
            ebvVar.a(ebuVar.c());
            ebvVar.i("coap");
        }
        return ebvVar;
    }

    public int b(String str) {
        int iC = -1;
        if (d(str) && c(str)) {
            Matcher matcher = Pattern.compile("^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})").matcher(str);
            while (matcher.find()) {
                iC = new eca(matcher.group(5)).c();
                dyg.a(false, "DeviceWifiAp", "EncryptMode :", Integer.valueOf(iC));
            }
        }
        return iC;
    }
}
