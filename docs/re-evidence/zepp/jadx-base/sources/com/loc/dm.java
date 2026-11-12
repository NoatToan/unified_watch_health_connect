package com.loc;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.watch.ota.UpdateUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public final class dm {
    public static int D = -1;
    private static boolean K = false;
    private static volatile boolean P = false;
    private Handler N;
    private String O;
    private dn Q;
    public Context a = null;
    public ConnectivityManager b = null;
    public dw c = null;
    public dv d = null;
    public dy e = null;
    public Cdo f = null;
    public ef g = null;
    public ArrayList<ScanResult> h = new ArrayList<>();
    public a i = null;
    public AMapLocationClientOption j = new AMapLocationClientOption();
    public dr k = null;
    public long l = 0;
    private int I = 0;
    public eg m = null;
    public boolean n = false;
    private String J = null;
    public ed o = null;
    public StringBuilder p = new StringBuilder();
    public boolean q = true;
    public boolean r = true;
    public AMapLocationClientOption.GeoLanguage s = AMapLocationClientOption.GeoLanguage.DEFAULT;
    public boolean t = true;
    public boolean u = false;
    public WifiInfo v = null;
    public boolean w = true;
    private String L = null;
    public StringBuilder x = null;
    public boolean y = false;
    public boolean z = false;
    public int A = 12;
    private boolean M = true;
    public ds B = null;
    public boolean C = false;
    public dq E = null;
    public String F = null;
    public IntentFilter G = null;
    public LocationManager H = null;

    /* JADX INFO: renamed from: com.loc.dm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AMapLocationClientOption.GeoLanguage.values().length];
            a = iArr;
            try {
                iArr[AMapLocationClientOption.GeoLanguage.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AMapLocationClientOption.GeoLanguage.ZH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AMapLocationClientOption.GeoLanguage.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            dw dwVar;
            dw dwVar2;
            if (context == null || intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (!action.equals("android.net.wifi.SCAN_RESULTS")) {
                    if (!action.equals("android.net.wifi.WIFI_STATE_CHANGED") || (dwVar = dm.this.c) == null) {
                        return;
                    }
                    dwVar.j();
                    return;
                }
                dw dwVar3 = dm.this.c;
                if (dwVar3 != null) {
                    dwVar3.i();
                }
                try {
                    if (intent.getExtras() == null || !intent.getExtras().getBoolean("resultsUpdated", true) || (dwVar2 = dm.this.c) == null) {
                        return;
                    }
                    dwVar2.h();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                ei.a(th, "Aps", "onReceive");
            }
        }
    }

    private static dr a(int i, String str) {
        dr drVar = new dr("");
        drVar.setErrorCode(i);
        drVar.setLocationDetail(str);
        if (i == 15) {
            em.a((String) null, 2151);
        }
        return drVar;
    }

    private dr a(dr drVar, av avVar, dl dlVar) {
        if (avVar != null) {
            try {
                byte[] bArr = avVar.a;
                if (bArr != null && bArr.length != 0) {
                    ef efVar = new ef();
                    String str = new String(avVar.a, "UTF-8");
                    if (str.contains("\"status\":\"0\"")) {
                        dr drVarA = efVar.a(str, this.a, avVar, dlVar);
                        drVarA.h(this.x.toString());
                        return drVarA;
                    }
                    if (!str.contains("</body></html>")) {
                        return null;
                    }
                    drVar.setErrorCode(5);
                    dw dwVar = this.c;
                    if (dwVar == null || !dwVar.a(this.b)) {
                        dlVar.f("#0502");
                        this.p.append("请求可能被劫持了#0502");
                        em.a((String) null, 2052);
                    } else {
                        dlVar.f("#0501");
                        this.p.append("您连接的是一个需要登录的网络，请确认已经登入网络#0501");
                        em.a((String) null, 2051);
                    }
                    drVar.setLocationDetail(this.p.toString());
                    return drVar;
                }
            } catch (Throwable th) {
                drVar.setErrorCode(4);
                ei.a(th, "Aps", "checkResponseEntity");
                dlVar.f("#0403");
                this.p.append("check response exception ex is" + th.getMessage() + "#0403");
                drVar.setLocationDetail(this.p.toString());
                return drVar;
            }
        }
        drVar.setErrorCode(4);
        this.p.append("网络异常,请求异常#0403");
        dlVar.f("#0403");
        drVar.h(this.x.toString());
        drVar.setLocationDetail(this.p.toString());
        if (avVar != null) {
            em.a(avVar.d, 2041);
        }
        return drVar;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0257  */
    @SuppressLint({"NewApi"})
    private dr a(boolean z, boolean z2, dl dlVar, boolean z3) {
        dr drVarA;
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        boolean z4;
        av avVarA;
        long jB;
        eb ebVarA;
        int i;
        String str2;
        List<String> list;
        try {
            if (TextUtils.isEmpty(this.O)) {
                this.O = u.b(n.a(this.a) + "," + n.h(this.a));
            }
            StringBuilder sb3 = this.p;
            sb3.append("#id:");
            sb3.append(this.O);
        } catch (Throwable unused) {
        }
        dr drVar = new dr("");
        try {
            if (this.m == null) {
                this.m = new eg();
            }
            if (this.j == null) {
                this.j = new AMapLocationClientOption();
            }
            this.m.a(this.a, this.j.isNeedAddress(), this.j.isOffset(), this.d, this.c, this.b, this.F);
            byte[] bArrA = this.m.a();
            long jB2 = eo.b();
            this.l = jB2;
            dlVar.a(jB2);
            try {
                ei.c(this.a);
                ee eeVarA = this.o.a(this.a, bArrA, ei.a(), ei.b(), z2, z3);
                String strC = eeVarA.c();
                String strD = eeVarA.d();
                l.a(this.a);
                boolean z5 = !TextUtils.isEmpty(strD) && strD.contains("dualstack");
                if (l.a() && l.c() && z5) {
                    dlVar.a("v6");
                    String strA = l.b() ? null : eb.a(this.a).a(eeVarA, eb.b);
                    if (TextUtils.isEmpty(strA)) {
                        z4 = true;
                        avVarA = this.o.a(eeVarA);
                        jB = eo.b();
                        dlVar.d(com.alipay.sdk.m.f0.c.p);
                    } else {
                        try {
                            avVarA = this.o.a(eeVarA, 2);
                            jB = eo.b();
                            dlVar.b(strA);
                            dlVar.c(com.alipay.sdk.m.f0.c.p);
                            z4 = true;
                        } catch (Throwable unused2) {
                            String str3 = strA;
                            z4 = true;
                            a(dlVar, eeVarA, strC, strD, str3, eb.b);
                            avVarA = l.b() ? this.o.a(eeVarA, 4) : this.o.a(eeVarA, 1);
                            jB = eo.b();
                            dlVar.d(com.alipay.sdk.m.f0.c.p);
                            eb.a(this.a).a(eb.b);
                        }
                    }
                    ebVarA = eb.a(this.a);
                    i = eb.b;
                } else {
                    z4 = true;
                    dlVar.a("v4");
                    String strA2 = eb.a(this.a).a(eeVarA, eb.a);
                    if (TextUtils.isEmpty(strA2)) {
                        avVarA = this.o.a(eeVarA, 1);
                        jB = eo.b();
                        dlVar.d(com.alipay.sdk.m.f0.c.p);
                    } else {
                        try {
                            avVarA = this.o.a(eeVarA, 1);
                            jB = eo.b();
                            dlVar.b(strA2);
                            dlVar.c(com.alipay.sdk.m.f0.c.p);
                            eb.a(this.a).a(true, eb.a);
                        } catch (Throwable unused3) {
                            a(dlVar, eeVarA, strC, strD, strA2, eb.a);
                            avVarA = this.o.a(eeVarA, 1);
                            jB = eo.b();
                            dlVar.d(com.alipay.sdk.m.f0.c.p);
                            eb.a(this.a).a(eb.a);
                        }
                    }
                    ebVarA = eb.a(this.a);
                    i = eb.a;
                }
                ebVarA.a(z4, i);
                if (z3) {
                    try {
                        eh.b = new URL(eeVarA.c()).getHost();
                        eh.c = new URL(eeVarA.d()).getHost();
                        eh.d = eeVarA.h();
                    } catch (Throwable th) {
                        ei.a(th, "Aps", "changehost");
                    }
                }
                dn dnVar = this.Q;
                if (dnVar != null) {
                    dnVar.d();
                }
                dlVar.b(jB);
                if (avVarA != null) {
                    if (!TextUtils.isEmpty(avVarA.c)) {
                        this.p.append("#csid:" + avVarA.c);
                    }
                    if (z3) {
                        Map<String, List<String>> map = avVarA.b;
                        if (map != null && (list = map.get("sc")) != null && list.size() > 0) {
                            String str4 = list.get(0);
                            if (!TextUtils.isEmpty(str4)) {
                                if (!str4.contains(UpdateUtils.CMD_FILTER) || str4.contains("#1")) {
                                    drVar.b(z4);
                                } else {
                                    drVar.b(false);
                                }
                            }
                        }
                    } else {
                        drVar.b(false);
                    }
                    str2 = avVarA.d;
                    drVar.h(this.x.toString());
                } else {
                    str2 = "";
                }
                if (!z) {
                    dr drVarA2 = a(drVar, avVarA, dlVar);
                    if (drVarA2 != null) {
                        return drVarA2;
                    }
                    byte[] bArrB = dx.b(avVarA.a);
                    if (bArrB == null) {
                        drVar.setErrorCode(5);
                        dlVar.f("#0503");
                        this.p.append("解密数据失败#0503");
                        drVar.setLocationDetail(this.p.toString());
                        em.a(str2, 2053);
                        return drVar;
                    }
                    drVar = this.g.a(drVar, bArrB, dlVar);
                    if (!eo.a(drVar)) {
                        String strB = drVar.b();
                        this.J = strB;
                        em.a(str2, !TextUtils.isEmpty(strB) ? 2062 : 2061);
                        drVar.setErrorCode(6);
                        dlVar.f("#0601");
                        StringBuilder sb4 = this.p;
                        StringBuilder sb5 = new StringBuilder("location faile retype:");
                        sb5.append(drVar.d());
                        sb5.append(" rdesc:");
                        sb5.append(TextUtils.isEmpty(this.J) ? "" : this.J);
                        sb5.append("#0601");
                        sb4.append(sb5.toString());
                        drVar.h(this.x.toString());
                        drVar.setLocationDetail(this.p.toString());
                        return drVar;
                    }
                    if (drVar.getErrorCode() == 0 && drVar.getLocationType() == 0) {
                        if ("-5".equals(drVar.d()) || "1".equals(drVar.d()) || "2".equals(drVar.d()) || "14".equals(drVar.d()) || Constants.VIA_REPORT_TYPE_CHAT_AIO.equals(drVar.d()) || EcgData.DEFAULT_DIGIT_VALUE.equals(drVar.d())) {
                            drVar.setLocationType(5);
                        } else {
                            drVar.setLocationType(6);
                        }
                    }
                    drVar.setOffset(this.r);
                    drVar.a(this.q);
                    drVar.f(String.valueOf(this.s));
                }
                drVar.e("new");
                drVar.setLocationDetail(this.p.toString());
                this.F = drVar.a();
                return drVar;
            } catch (Throwable th2) {
                eo.b();
                dlVar.d("FAIL");
                eb.a(this.a).a(false, eb.a);
                ei.a(th2, "Aps", "getApsLoc req");
                em.a("/mobile/binary", th2);
                if (eo.d(this.a)) {
                    if (th2 instanceof j) {
                        j jVar = th2;
                        if (jVar.a().contains("网络异常状态码")) {
                            dlVar.f("#0404");
                            StringBuilder sb6 = this.p;
                            sb6.append("网络异常，状态码错误#0404");
                            sb6.append(jVar.f());
                        } else if (jVar.f() == 23 || Math.abs((eo.b() - this.l) - this.j.getHttpTimeOut()) < 500) {
                            dlVar.f("#0402");
                            sb2 = this.p;
                            str = "网络异常，连接超时#0402";
                        } else {
                            sb = new StringBuilder("#0403,");
                        }
                        drVarA = a(4, this.p.toString());
                        drVarA.h(this.x.toString());
                        return drVarA;
                    }
                    sb = new StringBuilder("#0403,");
                    sb.append(th2.getMessage());
                    dlVar.f(sb.toString());
                    this.p.append("网络异常,请求异常#0403");
                    drVarA = a(4, this.p.toString());
                    drVarA.h(this.x.toString());
                    return drVarA;
                }
                dlVar.f("#0401");
                sb2 = this.p;
                str = "网络异常，未连接到网络，请连接网络#0401";
                sb2.append(str);
                drVarA = a(4, this.p.toString());
                drVarA.h(this.x.toString());
                return drVarA;
            }
        } catch (Throwable th3) {
            dlVar.f("#0301");
            this.p.append("get parames error:" + th3.getMessage() + "#0301");
            em.a((String) null, 2031);
            drVarA = a(3, this.p.toString());
        }
    }

    private StringBuilder a(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        sb.append(this.d.m());
        sb.append(this.c.m());
        return sb;
    }

    private void a(dl dlVar, ee eeVar, String str, String str2, String str3, int i) {
        dlVar.b(str3);
        dlVar.c("FAIL");
        eb.a(this.a).a(false, i);
        eeVar.a(str);
        eeVar.b(str2);
        if (this.o.a() > eh.x()) {
            eeVar.a(eh.x() * 1000);
            eeVar.b(eh.x() * 1000);
        }
    }

    private dr b(boolean z, dl dlVar) {
        return a(z, true, dlVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0249 A[PHI: r15
      0x0249: PHI (r15v14 java.lang.StringBuilder) = 
      (r15v13 java.lang.StringBuilder)
      (r15v13 java.lang.StringBuilder)
      (r15v16 java.lang.StringBuilder)
      (r15v16 java.lang.StringBuilder)
     binds: [B:84:0x0243, B:86:0x0247, B:78:0x0209, B:80:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    private String c(dl dlVar) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        StringBuilder sb3;
        String str2;
        StringBuilder sb4;
        String str3;
        int iF = this.d.f();
        du duVarD = this.d.d();
        ArrayList<ScanResult> arrayList = this.h;
        boolean z = arrayList == null || arrayList.isEmpty();
        String string = "";
        if (duVarD == null && z) {
            if (this.b == null) {
                this.b = (ConnectivityManager) eo.a(this.a, "connectivity");
            }
            if (eo.a(this.a) && !this.c.q) {
                this.A = 18;
                this.p.append("飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1801");
                em.a((String) null, 2132);
                dlVar.f("#1801");
                return "";
            }
            if (eo.c() >= 28) {
                if (this.H == null) {
                    this.H = (LocationManager) this.a.getApplicationContext().getSystemService("location");
                }
                if (!((Boolean) el.a(this.H, "isLocationEnabled", new Object[0])).booleanValue()) {
                    this.A = 12;
                    this.p.append("定位服务没有开启，请在设置中打开定位服务开关#1206");
                    dlVar.f("#1206");
                    em.a((String) null, 2121);
                    return "";
                }
            }
            if (!eo.f(this.a)) {
                this.A = 12;
                this.p.append("定位权限被禁用,请授予应用定位权限#1201");
                dlVar.f("#1201");
                em.a((String) null, 2121);
                return "";
            }
            if (eo.c() >= 24 && eo.c() < 28 && Settings.Secure.getInt(this.a.getContentResolver(), "location_mode", 0) == 0) {
                this.A = 12;
                dlVar.f("#1206");
                this.p.append("定位服务没有开启，请在设置中打开定位服务开关#1206");
                em.a((String) null, 2121);
                return "";
            }
            String strK = this.d.k();
            String strD = this.c.d();
            if (this.c.a(this.b) && strD != null) {
                this.A = 12;
                dlVar.f("#1202");
                this.p.append("获取基站与获取WIFI的权限都被禁用，请在安全软件中打开应用的定位权限#1202");
                em.a((String) null, 2121);
                return "";
            }
            if (strK != null) {
                this.A = 12;
                if (this.c.q) {
                    dlVar.f("#1205");
                    sb4 = this.p;
                    str3 = "获取的WIFI列表为空，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限#1205";
                } else {
                    dlVar.f("#1204");
                    sb4 = this.p;
                    str3 = "WIFI开关关闭，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限或者打开WIFI开关#1204";
                }
                sb4.append(str3);
                em.a((String) null, 2121);
                return "";
            }
            if (!this.c.q && !this.d.n()) {
                this.A = 19;
                dlVar.f("#1901");
                this.p.append("没有检查到SIM卡，并且WIFI开关关闭，请打开WIFI开关或者插入SIM卡#1901");
                em.a((String) null, 2133);
                return "";
            }
            if (!eo.g(this.a)) {
                this.A = 12;
                dlVar.f("#1207");
                this.p.append("后台定位服务没有开启，请在设置中打开后台定位服务开关#1207");
                em.a((String) null, 2121);
                return "";
            }
            if (this.c.q) {
                dlVar.f("#1302");
                sb3 = this.p;
                str2 = "获取到的基站和WIFI信息均为空，请移动到有WIFI的区域，若确定当前区域有WIFI，请检查是否授予APP定位权限#1302";
            } else {
                dlVar.f("#1301");
                sb3 = this.p;
                str2 = "获取到的基站为空，并且关闭了WIFI开关，请您打开WIFI开关再发起定位#1301";
            }
            sb3.append(str2);
            this.A = 13;
            em.a((String) null, 2131);
            return "";
        }
        WifiInfo wifiInfoK = this.c.k();
        this.v = wifiInfoK;
        this.w = dw.a(wifiInfoK);
        if (iF != 0) {
            String str4 = "cgi";
            if (iF != 1) {
                if (iF != 2) {
                    this.A = 11;
                    em.a((String) null, 2111);
                    dlVar.f("#1101");
                    this.p.append("get cgi failure#1101");
                } else if (duVarD != null) {
                    sb2 = new StringBuilder();
                    sb2.append(duVarD.a);
                    sb2.append(UpdateUtils.CMD_FILTER);
                    sb2.append(duVarD.b);
                    sb2.append(UpdateUtils.CMD_FILTER);
                    sb2.append(duVarD.g);
                    sb2.append(UpdateUtils.CMD_FILTER);
                    sb2.append(duVarD.h);
                    sb2.append(UpdateUtils.CMD_FILTER);
                    sb2.append(duVarD.i);
                    sb2.append(UpdateUtils.CMD_FILTER);
                    sb2.append("network");
                    sb2.append(UpdateUtils.CMD_FILTER);
                    if (!this.h.isEmpty() || this.w) {
                        str4 = "cgiwifi";
                    }
                    sb2.append(str4);
                    string = sb2.toString();
                }
            } else if (duVarD != null) {
                sb2 = new StringBuilder();
                sb2.append(duVarD.a);
                sb2.append(UpdateUtils.CMD_FILTER);
                sb2.append(duVarD.b);
                sb2.append(UpdateUtils.CMD_FILTER);
                sb2.append(duVarD.c);
                sb2.append(UpdateUtils.CMD_FILTER);
                sb2.append(duVarD.d);
                sb2.append(UpdateUtils.CMD_FILTER);
                sb2.append("network");
                sb2.append(UpdateUtils.CMD_FILTER);
                if (!this.h.isEmpty() || this.w) {
                    str4 = "cgiwifi";
                }
                sb2.append(str4);
                string = sb2.toString();
            }
        } else {
            boolean z2 = !this.h.isEmpty() || this.w;
            if (this.w && this.h.isEmpty()) {
                this.A = 2;
                dlVar.f("#0201");
                this.p.append("当前基站为伪基站，并且WIFI权限被禁用，请在安全软件中打开应用的定位权限#0201");
                em.a((String) null, 2021);
                return "";
            }
            if (this.h.size() == 1) {
                this.A = 2;
                if (!this.w) {
                    dlVar.f("#0202");
                    this.p.append("当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202");
                    em.a((String) null, GLMapStaticValue.MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_LAST);
                    return "";
                }
                if (this.c.k().getBSSID().equals(this.h.get(0).BSSID)) {
                    dlVar.f("#0202");
                    this.p.append("当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202");
                    em.a((String) null, 2021);
                    return "";
                }
            }
            String str5 = String.format(Locale.US, "#%s#", "network");
            if (z2) {
                sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append("wifi");
                string = sb2.toString();
            } else {
                this.A = 2;
                if (this.c.q) {
                    dlVar.f("#0204");
                    sb = this.p;
                    str = "当前基站为伪基站,并且没有搜索到WIFI，请移动到WIFI比较丰富的区域#0204";
                } else {
                    dlVar.f("#0203");
                    sb = this.p;
                    str = "当前基站为伪基站,并且关闭了WIFI开关，请在设置中打开WIFI开关#0203";
                }
                sb.append(str);
                em.a((String) null, GLMapStaticValue.MAP_PARAMETERNAME_CLEAR_INDOORBUILDING_LAST);
            }
        }
        if (TextUtils.isEmpty(string)) {
            return string;
        }
        if (!string.startsWith(UpdateUtils.CMD_FILTER)) {
            string = UpdateUtils.CMD_FILTER + string;
        }
        return eo.e() + string;
    }

    private void c(dr drVar) {
        if (drVar != null) {
            this.k = drVar;
        }
    }

    private void i() {
        int i;
        if (this.o != null) {
            try {
                if (this.j == null) {
                    this.j = new AMapLocationClientOption();
                }
                int i2 = 2;
                boolean z = true;
                if (this.j.getGeoLanguage() == null || (i = AnonymousClass1.a[this.j.getGeoLanguage().ordinal()]) == 1) {
                    i2 = 0;
                } else if (i == 2) {
                    i2 = 1;
                } else if (i != 3) {
                    i2 = 0;
                }
                ed edVar = this.o;
                long httpTimeOut = this.j.getHttpTimeOut();
                if (!this.j.getLocationProtocol().equals(AMapLocationClientOption.AMapLocationProtocol.HTTPS)) {
                    z = false;
                }
                edVar.a(httpTimeOut, z, i2);
            } catch (Throwable unused) {
            }
        }
    }

    private void j() {
        try {
            if (this.i == null) {
                this.i = new a();
            }
            if (this.G == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.G = intentFilter;
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                this.G.addAction("android.net.wifi.SCAN_RESULTS");
            }
            this.a.registerReceiver(this.i, this.G);
        } catch (Throwable th) {
            ei.a(th, "Aps", "initBroadcastListener");
        }
    }

    private boolean k() {
        ArrayList<ScanResult> arrayListE = this.c.e();
        this.h = arrayListE;
        return arrayListE == null || arrayListE.size() <= 0;
    }

    public final dr a(double d, double d2) {
        try {
            String strA = this.o.a(this.a, d, d2);
            if (!strA.contains("\"status\":\"1\"")) {
                return null;
            }
            dr drVarA = this.g.a(strA);
            drVarA.setLatitude(d);
            drVarA.setLongitude(d2);
            return drVarA;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x020a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b3 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01a3, B:84:0x01a9, B:86:0x01b3, B:89:0x01bd, B:92:0x01c7, B:93:0x01cc), top: B:107:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01a3, B:84:0x01a9, B:86:0x01b3, B:89:0x01bd, B:92:0x01c7, B:93:0x01cc), top: B:107:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c7 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01a3, B:84:0x01a9, B:86:0x01b3, B:89:0x01bd, B:92:0x01c7, B:93:0x01cc), top: B:107:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01cc A[Catch: all -> 0x01d0, TRY_LEAVE, TryCatch #0 {all -> 0x01d0, blocks: (B:81:0x01a3, B:84:0x01a9, B:86:0x01b3, B:89:0x01bd, B:92:0x01c7, B:93:0x01cc), top: B:107:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    public final dr a(dl dlVar) throws Throwable {
        boolean z;
        ds dsVar;
        String strC;
        boolean z2;
        dr drVarA;
        dr drVarA2;
        float fD;
        ds dsVar2;
        long jB;
        boolean z3;
        dw dwVar;
        c();
        dlVar.e("conitue");
        if (this.a == null) {
            dlVar.f("#0101");
            this.p.append("context is null#0101");
            return a(1, this.p.toString());
        }
        int i = this.I + 1;
        this.I = i;
        if (i == 1 && (dwVar = this.c) != null) {
            dwVar.a(this.n);
        }
        long j = this.l;
        try {
            try {
                if (this.M) {
                    if (eo.b() - j < 800) {
                        z = (eo.a(this.k) ? eo.a() - this.k.getTime() : 0L) <= 10000;
                    }
                    if (!z && eo.a(this.k)) {
                        if (this.t && eh.b(this.k.getTime())) {
                            this.k.setLocationType(2);
                        }
                        return this.k;
                    }
                    dsVar = this.B;
                    if (dsVar != null) {
                        if (this.C) {
                            dsVar.a();
                        } else {
                            dsVar.b();
                        }
                    }
                    if (this.j.isOnceLocationLatest() && this.j.isOnceLocation()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    this.c.b(z3);
                    this.h = this.c.e();
                    this.d.a(false, k());
                    strC = c(dlVar);
                    this.L = strC;
                    if (TextUtils.isEmpty(strC)) {
                        return a(this.A, this.p.toString());
                    }
                    this.x = a(this.x);
                    if (this.c.l()) {
                        dr drVarA3 = a(15, "networkLocation has been mocked!#1502");
                        dlVar.f("#1502");
                        drVarA3.setMock(true);
                        drVarA3.setTrustedLevel(4);
                        return drVarA3;
                    }
                    if (this.l == 0 && eo.b() - this.l <= 20000) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    drVarA = this.e.a(this.d, z2, this.k, this.c, this.x, this.L, this.a, false);
                    try {
                        if (eo.a(drVarA)) {
                            drVarA = b(false, dlVar);
                            if (eo.a(drVarA)) {
                                drVarA.e("new");
                                this.e.a(this.x.toString());
                                this.e.a(this.d.d());
                            } else {
                                drVarA2 = this.e.a(this.d, false, this.k, this.c, this.x, this.L, this.a, true);
                                if (eo.a(drVarA2)) {
                                    dlVar.f("#0001");
                                    drVarA2.setTrustedLevel(2);
                                    c(drVarA2);
                                    drVarA = drVarA2;
                                }
                            }
                            if (this.c != null && drVarA != null) {
                                jB = dw.b();
                                if (jB <= 15) {
                                    drVarA.setTrustedLevel(1);
                                } else if (jB <= 120) {
                                    drVarA.setTrustedLevel(2);
                                } else if (jB <= 600) {
                                    drVarA.setTrustedLevel(3);
                                } else {
                                    drVarA.setTrustedLevel(4);
                                }
                            }
                            this.e.a(this.L, this.x, drVarA, this.a, true);
                            eo.a(drVarA);
                            StringBuilder sb = this.x;
                            sb.delete(0, sb.length());
                            if (drVarA != null) {
                                if (this.C || (dsVar2 = this.B) == null) {
                                    drVarA.setAltitude(0.0d);
                                    fD = 0.0f;
                                    drVarA.setBearing(0.0f);
                                } else {
                                    drVarA.setAltitude(dsVar2.f);
                                    drVarA.setBearing(this.B.c());
                                    fD = (float) this.B.d();
                                }
                                drVarA.setSpeed(fD);
                            }
                            c(drVarA);
                            return this.k;
                        }
                        drVarA.setTrustedLevel(2);
                        if (this.c != null) {
                            jB = dw.b();
                            if (jB <= 15) {
                                drVarA.setTrustedLevel(1);
                            } else if (jB <= 120) {
                                drVarA.setTrustedLevel(2);
                            } else if (jB <= 600) {
                                drVarA.setTrustedLevel(3);
                            } else {
                                drVarA.setTrustedLevel(4);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    c(drVarA);
                    this.e.a(this.L, this.x, drVarA, this.a, true);
                    eo.a(drVarA);
                    StringBuilder sb2 = this.x;
                    sb2.delete(0, sb2.length());
                    if (drVarA != null) {
                        if (this.C) {
                            drVarA.setAltitude(0.0d);
                            fD = 0.0f;
                            drVarA.setBearing(0.0f);
                        } else {
                            drVarA.setAltitude(0.0d);
                            fD = 0.0f;
                            drVarA.setBearing(0.0f);
                        }
                        drVarA.setSpeed(fD);
                    }
                    c(drVarA);
                    return this.k;
                }
                this.M = true;
                if (this.j.isOnceLocationLatest()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                this.c.b(z3);
                this.h = this.c.e();
            } catch (Throwable th) {
                ei.a(th, "Aps", "getLocation getScanResultsParam");
            }
            this.d.a(false, k());
        } catch (Throwable th2) {
            ei.a(th2, "Aps", "getLocation getCgiListParam");
        }
        if (!z) {
        }
        dsVar = this.B;
        if (dsVar != null) {
            if (this.C) {
                dsVar.a();
            } else {
                dsVar.b();
            }
        }
        strC = c(dlVar);
        this.L = strC;
        if (TextUtils.isEmpty(strC)) {
            return a(this.A, this.p.toString());
        }
        this.x = a(this.x);
        if (this.c.l()) {
            dr drVarA4 = a(15, "networkLocation has been mocked!#1502");
            dlVar.f("#1502");
            drVarA4.setMock(true);
            drVarA4.setTrustedLevel(4);
            return drVarA4;
        }
        if (this.l == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        drVarA = this.e.a(this.d, z2, this.k, this.c, this.x, this.L, this.a, false);
        if (eo.a(drVarA)) {
            drVarA = b(false, dlVar);
            if (eo.a(drVarA)) {
                drVarA.e("new");
                this.e.a(this.x.toString());
                this.e.a(this.d.d());
            } else {
                drVarA2 = this.e.a(this.d, false, this.k, this.c, this.x, this.L, this.a, true);
                if (eo.a(drVarA2)) {
                    dlVar.f("#0001");
                    drVarA2.setTrustedLevel(2);
                    c(drVarA2);
                    drVarA = drVarA2;
                }
            }
            if (this.c != null) {
                jB = dw.b();
                if (jB <= 15) {
                    drVarA.setTrustedLevel(1);
                } else if (jB <= 120) {
                    drVarA.setTrustedLevel(2);
                } else if (jB <= 600) {
                    drVarA.setTrustedLevel(3);
                } else {
                    drVarA.setTrustedLevel(4);
                }
            }
            this.e.a(this.L, this.x, drVarA, this.a, true);
            eo.a(drVarA);
            StringBuilder sb3 = this.x;
            sb3.delete(0, sb3.length());
            if (drVarA != null) {
                if (this.C) {
                    drVarA.setAltitude(0.0d);
                    fD = 0.0f;
                    drVarA.setBearing(0.0f);
                } else {
                    drVarA.setAltitude(0.0d);
                    fD = 0.0f;
                    drVarA.setBearing(0.0f);
                }
                drVarA.setSpeed(fD);
            }
            c(drVarA);
            return this.k;
        }
        drVarA.setTrustedLevel(2);
        c(drVarA);
        if (this.c != null) {
            jB = dw.b();
            if (jB <= 15) {
                drVarA.setTrustedLevel(1);
            } else if (jB <= 120) {
                drVarA.setTrustedLevel(2);
            } else if (jB <= 600) {
                drVarA.setTrustedLevel(3);
            } else {
                drVarA.setTrustedLevel(4);
            }
        }
        this.e.a(this.L, this.x, drVarA, this.a, true);
        eo.a(drVarA);
        StringBuilder sb4 = this.x;
        sb4.delete(0, sb4.length());
        if (drVarA != null) {
            if (this.C) {
                drVarA.setAltitude(0.0d);
                fD = 0.0f;
                drVarA.setBearing(0.0f);
            } else {
                drVarA.setAltitude(0.0d);
                fD = 0.0f;
                drVarA.setBearing(0.0f);
            }
            drVarA.setSpeed(fD);
        }
        c(drVarA);
        return this.k;
    }

    public final dr a(dr drVar) {
        this.E.a(this.t);
        return this.E.a(drVar);
    }

    public final dr a(boolean z, dl dlVar) {
        dlVar.e(z ? "statics" : StatEvent.TP_FIRST);
        if (this.a == null) {
            dlVar.f("#0101");
            this.p.append("context is null#0101");
            em.a((String) null, GLMapStaticValue.MAP_PARAMETERNAME_SATELLITE);
            return a(1, this.p.toString());
        }
        if (this.c.l()) {
            dlVar.f("#1502");
            return a(15, "networkLocation has been mocked!#1502");
        }
        a();
        if (TextUtils.isEmpty(this.L)) {
            return a(this.A, this.p.toString());
        }
        dr drVarA = a(false, z, dlVar, !P);
        P = true;
        if (eo.a(drVarA)) {
            this.e.a(this.x.toString());
            this.e.a(this.d.d());
            c(drVarA);
        }
        return drVarA;
    }

    public final void a() {
        this.o = ed.a(this.a);
        i();
        if (this.b == null) {
            this.b = (ConnectivityManager) eo.a(this.a, "connectivity");
        }
        if (this.m == null) {
            this.m = new eg();
        }
    }

    public final void a(Context context) {
        try {
            if (this.a != null) {
                return;
            }
            this.E = new dq();
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            eo.b(applicationContext);
            if (this.c == null) {
                this.c = new dw(this.a, (WifiManager) eo.a(this.a, "wifi"));
            }
            if (this.d == null) {
                this.d = new dv(this.a);
            }
            if (this.e == null) {
                this.e = new dy();
            }
            if (this.g == null) {
                this.g = new ef();
            }
        } catch (Throwable th) {
            ei.a(th, "Aps", "initBase");
        }
    }

    public final void a(Context context, boolean z) {
        try {
            if (eh.a(context, z)) {
                eh.a(context);
                dn dnVar = this.Q;
                if (dnVar != null) {
                    dnVar.d();
                }
            }
        } catch (Throwable th) {
            ei.a(th, "Aps", "initAuth");
        }
    }

    public final void a(Handler handler) {
        this.N = handler;
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        boolean zIsNeedAddress;
        boolean z;
        boolean zIsOffset;
        boolean zIsLocationCacheEnable;
        this.j = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.j = new AMapLocationClientOption();
        }
        dw dwVar = this.c;
        if (dwVar != null) {
            this.j.isWifiActiveScan();
            dwVar.a(this.j.isWifiScan(), this.j.isMockEnable(), AMapLocationClientOption.isOpenAlwaysScanWifi(), aMapLocationClientOption.getScanWifiInterval());
        }
        i();
        dy dyVar = this.e;
        if (dyVar != null) {
            dyVar.a(this.j);
        }
        ef efVar = this.g;
        if (efVar != null) {
            efVar.a(this.j);
        }
        AMapLocationClientOption.GeoLanguage geoLanguage = AMapLocationClientOption.GeoLanguage.DEFAULT;
        boolean z2 = true;
        try {
            geoLanguage = this.j.getGeoLanguage();
            zIsNeedAddress = this.j.isNeedAddress();
            try {
                zIsOffset = this.j.isOffset();
                try {
                    zIsLocationCacheEnable = this.j.isLocationCacheEnable();
                    try {
                        this.u = this.j.isOnceLocationLatest();
                        this.C = this.j.isSensorEnable();
                        if (zIsOffset != this.r || zIsNeedAddress != this.q || zIsLocationCacheEnable != this.t || geoLanguage != this.s) {
                            try {
                                dy dyVar2 = this.e;
                                if (dyVar2 != null) {
                                    dyVar2.a();
                                }
                                c((dr) null);
                                this.M = false;
                                dq dqVar = this.E;
                                if (dqVar != null) {
                                    dqVar.a();
                                }
                            } catch (Throwable th) {
                                ei.a(th, "Aps", "cleanCache");
                            }
                        }
                    } catch (Throwable unused) {
                        z = zIsLocationCacheEnable;
                        z2 = zIsOffset;
                        boolean z3 = z;
                        zIsOffset = z2;
                        zIsLocationCacheEnable = z3;
                    }
                } catch (Throwable unused2) {
                    z2 = zIsOffset;
                    z = true;
                    boolean z4 = z;
                    zIsOffset = z2;
                    zIsLocationCacheEnable = z4;
                    this.r = zIsOffset;
                    this.q = zIsNeedAddress;
                    this.t = zIsLocationCacheEnable;
                    this.s = geoLanguage;
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            zIsNeedAddress = true;
        }
        this.r = zIsOffset;
        this.q = zIsNeedAddress;
        this.t = zIsLocationCacheEnable;
        this.s = geoLanguage;
    }

    public final void b() {
        if (this.B == null) {
            this.B = new ds(this.a);
        }
        j();
        this.c.b(false);
        this.h = this.c.e();
        this.d.a(false, k());
        this.e.a(this.a);
        try {
            if (this.a.checkCallingOrSelfPermission(u.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw==")) == 0) {
                this.n = true;
            }
        } catch (Throwable unused) {
        }
        this.z = true;
    }

    public final void b(dl dlVar) {
        try {
            if (this.y) {
                return;
            }
            if (this.L != null) {
                this.L = null;
            }
            StringBuilder sb = this.x;
            if (sb != null) {
                sb.delete(0, sb.length());
            }
            if (this.u) {
                j();
            }
            this.c.b(this.u);
            this.h = this.c.e();
            this.d.a(true, k());
            String strC = c(dlVar);
            this.L = strC;
            if (!TextUtils.isEmpty(strC)) {
                this.x = a(this.x);
            }
        } catch (Throwable th) {
            ei.a(th, "Aps", "initFirstLocateParam");
        }
        this.y = true;
    }

    public final void b(dr drVar) {
        if (eo.a(drVar)) {
            this.e.a(this.L, this.x, drVar, this.a, true);
        }
    }

    public final void c() {
        if (this.p.length() > 0) {
            StringBuilder sb = this.p;
            sb.delete(0, sb.length());
        }
    }

    public final void d() {
        try {
            a(this.a);
            a(this.j);
            dl dlVar = new dl();
            b(dlVar);
            b(b(true, dlVar));
        } catch (Throwable th) {
            ei.a(th, "Aps", "doFusionLocation");
        }
    }

    @SuppressLint({"NewApi"})
    public final void e() {
        a aVar;
        this.F = null;
        this.y = false;
        this.z = false;
        dy dyVar = this.e;
        if (dyVar != null) {
            dyVar.b(this.a);
        }
        dq dqVar = this.E;
        if (dqVar != null) {
            dqVar.a();
        }
        if (this.g != null) {
            this.g = null;
        }
        try {
            Context context = this.a;
            if (context != null && (aVar = this.i) != null) {
                context.unregisterReceiver(aVar);
            }
        } catch (Throwable th) {
            try {
                ei.a(th, "Aps", "destroy");
            } catch (Throwable th2) {
                this.i = null;
                throw th2;
            }
        }
        this.i = null;
        dv dvVar = this.d;
        if (dvVar != null) {
            dvVar.h();
        }
        dw dwVar = this.c;
        if (dwVar != null) {
            dwVar.n();
        }
        ArrayList<ScanResult> arrayList = this.h;
        if (arrayList != null) {
            arrayList.clear();
        }
        ds dsVar = this.B;
        if (dsVar != null) {
            dsVar.e();
        }
        this.k = null;
        this.a = null;
        this.x = null;
        this.H = null;
    }

    public final dr f() {
        int i;
        String string;
        if (this.c.l()) {
            i = 15;
            string = "networkLocation has been mocked!#1502";
        } else {
            if (!TextUtils.isEmpty(this.L)) {
                dr drVarA = this.e.a(this.a, this.L, this.x, true);
                if (eo.a(drVarA)) {
                    c(drVarA);
                }
                return drVarA;
            }
            i = this.A;
            string = this.p.toString();
        }
        return a(i, string);
    }

    public final void g() {
        try {
            if (eh.i && this.a != null) {
                if (this.Q == null) {
                    this.Q = new dn(this.a);
                }
                this.Q.a(this.d, this.c, this.N);
            }
        } catch (Throwable th) {
            ab.b(th, Constant.PAI_KEY_ACTIVITY_SCORES, "stc");
        }
    }

    public final void h() {
        dn dnVar = this.Q;
        if (dnVar != null) {
            dnVar.a();
        }
    }
}
