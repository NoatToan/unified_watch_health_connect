package com.amap.api.mapcore.util;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.autonavi.amap.mapcore.Inner_3dMap_location;
import com.autonavi.amap.mapcore.Inner_3dMap_locationOption;
import com.huami.ecg.core.db.entity.EcgData;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class kr {
    public Context a;
    public boolean b;
    private jy e;
    private lh f;
    private a g;
    private ka h;
    private ConnectivityManager i;
    private kc j;
    private Inner_3dMap_locationOption l;
    private StringBuilder k = new StringBuilder();
    public String c = null;
    private kp m = null;
    public long d = 0;
    private final String n = "\"status\":\"0\"";
    private final String o = "</body></html>";

    public class a extends BroadcastReceiver {
        private a() {
        }

        public /* synthetic */ a(kr krVar, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                    if (kr.this.e == null || kr.this.e.a == null || ki.b() - jy.g <= 4900) {
                        return;
                    }
                    jy.g = ki.b();
                    return;
                }
                if (!action.equals("android.net.wifi.WIFI_STATE_CHANGED") || kr.this.e == null) {
                    return;
                }
                jy jyVar = kr.this.e;
                if (jyVar.a != null) {
                    jyVar.x = true;
                }
            } catch (Throwable th) {
                ke.a(th, "MapNetLocation", "onReceive");
            }
        }
    }

    public kr(Context context) {
        this.a = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        byte b = 0;
        this.b = false;
        this.l = null;
        try {
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            ki.b(applicationContext);
            try {
                if (this.a.checkCallingOrSelfPermission(gu.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw==")) == 0) {
                    this.b = true;
                }
            } catch (Throwable unused) {
            }
            this.l = new Inner_3dMap_locationOption();
            if (this.e == null) {
                jy jyVar = new jy(this.a, (WifiManager) ki.a(this.a, "wifi"));
                this.e = jyVar;
                boolean z = this.b;
                Context context2 = jyVar.i;
                if (kd.a() && jyVar.n && jyVar.a != null && context2 != null && z && ki.c() > 17) {
                    ContentResolver contentResolver = context2.getContentResolver();
                    try {
                        if (((Integer) kg.a("android.provider.Settings$Global", "getInt", new Object[]{contentResolver, "wifi_scan_always_enabled"}, (Class<?>[]) new Class[]{ContentResolver.class, String.class})).intValue() == 0) {
                            kg.a("android.provider.Settings$Global", "putInt", new Object[]{contentResolver, "wifi_scan_always_enabled", 1}, (Class<?>[]) new Class[]{ContentResolver.class, String.class, Integer.TYPE});
                        }
                    } catch (Throwable th) {
                        ke.a(th, "WifiManagerWrapper", "enableWifiAlwaysScan");
                    }
                }
            }
            if (this.f == null) {
                this.f = new lh(this.a);
            }
            if (this.h == null) {
                gk.a(this.a);
                this.h = ka.a(this.a);
            }
            if (this.i == null) {
                this.i = (ConnectivityManager) ki.a(this.a, "connectivity");
            }
            this.j = new kc();
            try {
                if (this.g == null) {
                    this.g = new a(this, b);
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                this.a.registerReceiver(this.g, intentFilter);
                this.e.a(false);
                this.f.a();
            } catch (Throwable th2) {
                ke.a(th2, "MapNetLocation", "initBroadcastListener");
            }
        } catch (Throwable th3) {
            ke.a(th3, "MapNetLocation", "<init>");
        }
    }

    private kp c() throws Exception {
        StringBuilder sb;
        String str;
        String str2 = "";
        kp kpVar = new kp("");
        jy jyVar = this.e;
        if (jyVar != null && jyVar.j) {
            kpVar.setErrorCode(15);
            return kpVar;
        }
        try {
            if (this.j == null) {
                this.j = new kc();
            }
            this.j.a(this.a, this.l.isNeedAddress(), this.l.isOffset(), this.f, this.e, this.i, this.c);
            ks ksVar = new ks();
            byte[] bArr = null;
            try {
                try {
                    is isVarA = this.h.a(this.h.a(this.a, this.j.a(), ke.a(), ke.b()));
                    if (isVarA != null) {
                        bArr = isVarA.a;
                        str2 = isVarA.c;
                    }
                    if (bArr == null || bArr.length == 0) {
                        kpVar.setErrorCode(4);
                        this.k.append("please check the network");
                        if (!TextUtils.isEmpty(str2)) {
                            this.k.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        kpVar.setLocationDetail(this.k.toString());
                        return kpVar;
                    }
                    String str3 = new String(bArr, "UTF-8");
                    if (str3.contains("\"status\":\"0\"")) {
                        return ksVar.a(str3, this.a, isVarA);
                    }
                    if (str3.contains("</body></html>")) {
                        kpVar.setErrorCode(5);
                        jy jyVar2 = this.e;
                        if (jyVar2 == null || !jyVar2.a(this.i)) {
                            sb = this.k;
                            str = "request may be intercepted";
                        } else {
                            sb = this.k;
                            str = "make sure you are logged in to the network";
                        }
                        sb.append(str);
                        if (!TextUtils.isEmpty(str2)) {
                            this.k.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        kpVar.setLocationDetail(this.k.toString());
                        return kpVar;
                    }
                    byte[] bArrA = jz.a(bArr);
                    if (bArrA == null) {
                        kpVar.setErrorCode(5);
                        this.k.append("decrypt response data error");
                        if (!TextUtils.isEmpty(str2)) {
                            this.k.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        kpVar.setLocationDetail(this.k.toString());
                        return kpVar;
                    }
                    kp kpVarA = ksVar.a(bArrA);
                    this.c = kpVarA.a();
                    if (kpVarA.getErrorCode() != 0) {
                        if (!TextUtils.isEmpty(str2)) {
                            kpVarA.setLocationDetail(kpVarA.getLocationDetail() + " #csid:" + str2);
                        }
                        return kpVarA;
                    }
                    if (!kt.a(kpVarA)) {
                        String strB = kpVarA.b();
                        kpVarA.setErrorCode(6);
                        StringBuilder sb2 = this.k;
                        StringBuilder sb3 = new StringBuilder("location faile retype:");
                        sb3.append(kpVarA.d());
                        sb3.append(" rdesc:");
                        if (strB == null) {
                            strB = "null";
                        }
                        sb3.append(strB);
                        sb2.append(sb3.toString());
                        if (!TextUtils.isEmpty(str2)) {
                            this.k.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        kpVarA.setLocationDetail(this.k.toString());
                        return kpVarA;
                    }
                    kpVarA.e();
                    if (kpVarA.getErrorCode() == 0 && kpVarA.getLocationType() == 0) {
                        if ("-5".equals(kpVarA.d()) || "1".equals(kpVarA.d()) || "2".equals(kpVarA.d()) || "14".equals(kpVarA.d()) || Constants.VIA_REPORT_TYPE_CHAT_AIO.equals(kpVarA.d()) || EcgData.DEFAULT_DIGIT_VALUE.equals(kpVarA.d())) {
                            kpVarA.setLocationType(5);
                        } else {
                            kpVarA.setLocationType(6);
                        }
                        this.k.append(kpVarA.d());
                        if (!TextUtils.isEmpty(str2)) {
                            this.k.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        kpVarA.setLocationDetail(this.k.toString());
                    }
                    return kpVarA;
                } catch (Throwable th) {
                    ke.a(th, "MapNetLocation", "getApsLoc req");
                    kpVar.setErrorCode(4);
                    this.k.append("please check the network");
                    kpVar.setLocationDetail(this.k.toString());
                    return kpVar;
                }
            } catch (Throwable th2) {
                ke.a(th2, "MapNetLocation", "getApsLoc buildV4Dot2");
                kpVar.setErrorCode(3);
                this.k.append("buildV4Dot2 error " + th2.getMessage());
                kpVar.setLocationDetail(this.k.toString());
                return kpVar;
            }
        } catch (Throwable th3) {
            ke.a(th3, "MapNetLocation", "getApsLoc");
            this.k.append("get parames error:" + th3.getMessage());
            kpVar.setErrorCode(3);
            kpVar.setLocationDetail(this.k.toString());
            return kpVar;
        }
    }

    public final Inner_3dMap_location a() {
        boolean z = false;
        if (this.k.length() > 0) {
            StringBuilder sb = this.k;
            sb.delete(0, sb.length());
        }
        if (ki.b() - this.d < 800) {
            if ((kt.a(this.m) ? ki.a() - this.m.getTime() : 0L) <= 10000) {
                z = true;
            }
        }
        if (z && kt.a(this.m)) {
            return this.m;
        }
        this.d = ki.b();
        if (this.a == null) {
            this.k.append("context is null");
            Inner_3dMap_location inner_3dMap_location = new Inner_3dMap_location("");
            inner_3dMap_location.setErrorCode(1);
            inner_3dMap_location.setLocationDetail(this.k.toString());
            return inner_3dMap_location;
        }
        try {
            this.f.a();
        } catch (Throwable th) {
            ke.a(th, "MapNetLocation", "getLocation getCgiListParam");
        }
        try {
            this.e.a(true);
        } catch (Throwable th2) {
            ke.a(th2, "MapNetLocation", "getLocation getScanResultsParam");
        }
        try {
            kp kpVarC = c();
            this.m = kpVarC;
            this.m = kl.a().a(kpVarC);
        } catch (Throwable th3) {
            ke.a(th3, "MapNetLocation", "getLocation getScanResultsParam");
        }
        return this.m;
    }

    public final void a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        this.l = inner_3dMap_locationOption;
        if (inner_3dMap_locationOption == null) {
            this.l = new Inner_3dMap_locationOption();
        }
        try {
            jy jyVar = this.e;
            this.l.isWifiActiveScan();
            jyVar.b(this.l.isWifiScan());
        } catch (Throwable unused) {
        }
        try {
            this.h.a(this.l.getHttpTimeOut(), this.l.getLocationProtocol().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationProtocol.HTTPS));
        } catch (Throwable unused2) {
        }
    }

    public final void b() {
        a aVar;
        this.b = false;
        this.c = null;
        try {
            Context context = this.a;
            if (context != null && (aVar = this.g) != null) {
                context.unregisterReceiver(aVar);
            }
            lh lhVar = this.f;
            if (lhVar != null) {
                lhVar.d();
            }
            jy jyVar = this.e;
            if (jyVar != null) {
                jyVar.c();
            }
            this.g = null;
        } catch (Throwable unused) {
            this.g = null;
        }
    }
}
