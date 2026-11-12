package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.annotations.SecretField;
import com.huawei.openalliance.ad.hw;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class cn {
    private static final byte[] i = new byte[0];
    private static final byte[] j = new byte[0];
    private static final byte[] k = new byte[0];
    private static final byte[] l = new byte[0];
    private static cn m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f20554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f20555c;
    private SharedPreferences d;
    private SharedPreferences e;
    private SharedPreferences f;
    private final byte[] g = new byte[0];
    private final byte[] h = new byte[0];
    private a n;
    private e o;
    private c p;
    private f q;
    private d r;

    public void z(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.countryCode = str;
                a(this.n);
            }
        }
    }

    public String z() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.baro;
        }
        return str;
    }

    public void y(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.charging = str;
                a(this.n);
            }
        }
    }

    public String y() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.magnet;
        }
        return str;
    }

    public void x(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.battery = str;
                a(this.n);
            }
        }
    }

    public String x() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.acceler;
        }
        return str;
    }

    public void w(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.baro = str;
                a(this.n);
            }
        }
    }

    public String w() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.gyro;
        }
        return str;
    }

    public void v(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.magnet = str;
                a(this.n);
            }
        }
    }

    public String v() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.vendCountry;
        }
        return str;
    }

    public void u(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.acceler = str;
                a(this.n);
            }
        }
    }

    public String u() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.vendor;
        }
        return str;
    }

    public void t(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.gyro = str;
                a(this.n);
            }
        }
    }

    public String t() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.freeSto;
        }
        return str;
    }

    public void s(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.vendCountry = str;
                a(this.n);
            }
        }
    }

    public String s() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.totalSto;
        }
        return str;
    }

    public void r(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.vendor = str;
                a(this.n);
            }
        }
    }

    public String r() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.totalMem;
        }
        return str;
    }

    public void q(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.freeSto = str;
                a(this.n);
            }
        }
    }

    public String q() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.cpuSpeed;
        }
        return str;
    }

    public void p(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.totalSto = str;
                a(this.n);
            }
        }
    }

    public String p() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.cpuCoreCnt;
        }
        return str;
    }

    public void o(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.totalMem = str;
                a(this.n);
            }
        }
    }

    public String o() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.cpuModel;
        }
        return str;
    }

    public void n(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.cpuSpeed = str;
                a(this.n);
            }
        }
    }

    public String n() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.pdtName;
        }
        return str;
    }

    public void m(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.cpuCoreCnt = str;
                a(this.n);
            }
        }
    }

    public String m() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.agCountryCode;
        }
        return str;
    }

    public void l(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.cpuModel = str;
                a(this.n);
            }
        }
    }

    public String l() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.agVersion;
        }
        return str;
    }

    public void k(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.pdtName = str;
                a(this.n);
            }
        }
    }

    public String k() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.uuid;
        }
        return str;
    }

    public void j(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.agCountryCode = str;
                a(this.n);
            }
        }
    }

    public String j() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.deviceMark;
        }
        return str;
    }

    public void i(boolean z) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.isTFua = Boolean.valueOf(z);
                a(this.p);
            }
        }
    }

    public void i(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.agVersion = str;
                a(this.n);
            }
        }
    }

    public Pair<String, Boolean> i() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                if (TextUtils.isEmpty(aVar.oaid)) {
                    if (this.n.isLimitTracking != null) {
                    }
                }
                return new Pair<>(this.n.oaid, this.n.isLimitTracking);
            }
            return null;
        }
    }

    public void h(boolean z) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.isCoppa = Boolean.valueOf(z);
                a(this.p);
            }
        }
    }

    public void h(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.uuid = str;
                a(this.n);
            }
        }
    }

    public String h() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.magicuiVersionName;
        }
        return str;
    }

    public void g(boolean z) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.isChildMode = Boolean.valueOf(z);
                a(this.p);
            }
        }
    }

    public void g(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.deviceMark = str;
                a(this.n);
            }
        }
    }

    public String g() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.hosVersionName;
        }
        return str;
    }

    public void f(boolean z) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.isWelinkUser = Boolean.valueOf(z);
                a(this.p);
            }
        }
    }

    public void f(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.magicuiVersionName = str;
                a(this.n);
            }
        }
    }

    public void f(Boolean bool) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.isEmulator = bool;
                a(this.n);
            }
        }
    }

    public String f() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.emuiVersionName;
        }
        return str;
    }

    public void e(boolean z) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.isHonor6UpPhone = String.valueOf(z);
                a(this.p);
            }
        }
    }

    public void e(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.hosVersionName = str;
                a(this.n);
            }
        }
    }

    public void e(Boolean bool) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.usb = bool;
                a(this.n);
            }
        }
    }

    public String e() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.hmsVersion;
        }
        return str;
    }

    public void d(boolean z) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.isHuaweiPhoneNew = String.valueOf(z);
                a(this.p);
            }
        }
    }

    public void d(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.emuiVersionName = str;
                a(this.n);
            }
        }
    }

    public void d(Boolean bool) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.isDebug = bool;
                a(this.n);
            }
        }
    }

    public String d() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.hsfVersion;
        }
        return str;
    }

    public void c(boolean z) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.isTv = Boolean.valueOf(z);
                a(this.n);
            }
        }
    }

    public void c(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.hmsVersion = str;
                a(this.n);
            }
        }
    }

    public void c(Boolean bool) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.isProxy = bool;
                a(this.n);
            }
        }
    }

    public String c() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.isHuaweiPhone;
        }
        return str;
    }

    public void b(boolean z) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.baseLocationSwitch = Boolean.valueOf(z);
                a(this.n);
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.g) {
            ak();
            if (this.n != null) {
                if (list == null || list.isEmpty()) {
                    this.n.insAppTypes = "";
                } else {
                    this.n.insAppTypes = dg.a(list, ",");
                }
                a(this.n);
            }
        }
    }

    public void b(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.hsfVersion = str;
                a(this.n);
            }
        }
    }

    public void b(Integer num) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.sptImgFormat = num;
                a(this.p);
            }
        }
    }

    public void b(Boolean bool) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.hasAccAndRotate = bool;
                a(this.n);
            }
        }
    }

    public void b(int i2) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.grpIdCode = Integer.valueOf(i2);
                a(this.n);
            }
        }
    }

    public String b() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.useragent;
        }
        return str;
    }

    public String aj() {
        String str;
        synchronized (j) {
            am();
            str = !TextUtils.isEmpty(this.p.cachedDslEngineVer) ? this.p.cachedDslEngineVer : "";
        }
        return str;
    }

    public String ai() {
        String str;
        synchronized (j) {
            am();
            str = !TextUtils.isEmpty(this.p.cachedStylePkgVer) ? this.p.cachedStylePkgVer : "";
        }
        return str;
    }

    public Pair<String, Boolean> ah() {
        synchronized (j) {
            am();
            if (TextUtils.isEmpty(this.p.honorOaid) || this.p.honorLimitTracking == null) {
                return null;
            }
            return new Pair<>(this.p.honorOaid, this.p.honorLimitTracking);
        }
    }

    public Boolean ag() {
        Boolean boolValueOf;
        synchronized (j) {
            am();
            c cVar = this.p;
            boolean zBooleanValue = false;
            if (cVar != null && cVar.isTFua != null) {
                zBooleanValue = this.p.isTFua.booleanValue();
            }
            boolValueOf = Boolean.valueOf(zBooleanValue);
        }
        return boolValueOf;
    }

    public Boolean af() {
        Boolean boolValueOf;
        synchronized (j) {
            am();
            c cVar = this.p;
            boolean zBooleanValue = false;
            if (cVar != null && cVar.isCoppa != null) {
                zBooleanValue = this.p.isCoppa.booleanValue();
            }
            boolValueOf = Boolean.valueOf(zBooleanValue);
        }
        return boolValueOf;
    }

    public Boolean ae() {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar == null) {
                return null;
            }
            return cVar.isChildMode;
        }
    }

    public Boolean ad() {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar == null) {
                return null;
            }
            return cVar.isWelinkUser;
        }
    }

    public Integer ac() {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null && cVar.sptImgFormat != null) {
                return this.p.sptImgFormat;
            }
            return null;
        }
    }

    public String ab() {
        synchronized (l) {
            ao();
            d dVar = this.r;
            if (dVar == null) {
                return null;
            }
            return dVar.trackVersion;
        }
    }

    public Map<String, String> aa() {
        Map<String, String> map;
        synchronized (k) {
            an();
            f fVar = this.q;
            if (fVar != null) {
                map = (Map) bk.b(fVar.tag, Map.class, new Class[0]);
                if (br.a(map)) {
                }
            }
            map = null;
        }
        return map;
    }

    public void a(boolean z) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.isHuaweiPhone = String.valueOf(z);
                a(this.n);
            }
        }
    }

    public void a(Map<String, String> map) {
        synchronized (k) {
            an();
            f fVar = this.q;
            if (fVar != null) {
                fVar.tag = bk.b(map);
                a(this.q);
            }
        }
    }

    public void a(List<String> list) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.aVideoCodec = list;
                a(this.n);
            }
        }
    }

    public void a(String str, Boolean bool, boolean z) {
        synchronized (j) {
            am();
            this.p.honorOaid = str;
            this.p.honorLimitTracking = bool;
            if (z) {
                this.n.oaid = str;
                this.n.isLimitTracking = bool;
            }
            a(this.p);
        }
    }

    public void a(String str, Boolean bool) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.oaid = str;
                this.n.isLimitTracking = bool;
                a(this.n);
            }
        }
    }

    public void a(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.useragent = str;
                a(this.n);
            }
        }
    }

    public void a(Integer num) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.sdkType = num;
                a(this.p);
            }
        }
    }

    public void a(Boolean bool) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.gaidLimit = bool;
                a(this.n);
            }
        }
    }

    public void a(int i2) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.type = Integer.valueOf(i2);
                a(this.n);
            }
        }
    }

    public void a() {
        synchronized (this.g) {
            ak();
        }
        synchronized (this.h) {
            al();
            am();
        }
        synchronized (k) {
            an();
        }
    }

    public Integer Z() {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar == null) {
                return null;
            }
            return cVar.sdkType;
        }
    }

    public String Y() {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null && cVar.freeSdcard != null) {
                return this.p.freeSdcard;
            }
            return null;
        }
    }

    public String X() {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null && cVar.isHonor6UpPhone != null) {
                return this.p.isHonor6UpPhone;
            }
            return null;
        }
    }

    public String W() {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null && cVar.isHuaweiPhoneNew != null) {
                return this.p.isHuaweiPhoneNew;
            }
            return null;
        }
    }

    public String V() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.storageSize;
        }
        return str;
    }

    public String U() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.memorySize;
        }
        return str;
    }

    public String T() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.insAppTypes;
        }
        return str;
    }

    public int S() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null && aVar.grpIdCode != null) {
                return this.n.grpIdCode.intValue();
            }
            return 8;
        }
    }

    public Boolean R() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null && aVar.isEmulator != null) {
                return this.n.isEmulator;
            }
            return null;
        }
    }

    public Boolean Q() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar == null) {
                return null;
            }
            return (aVar.usb != null ? this.n : this.n).usb;
        }
    }

    public Boolean P() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar == null) {
                return null;
            }
            return (aVar.isDebug != null ? this.n : this.n).isDebug;
        }
    }

    public Boolean O() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar == null) {
                return null;
            }
            return (aVar.isProxy != null ? this.n : this.n).isProxy;
        }
    }

    public List<String> N() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar == null) {
                return null;
            }
            return aVar.aVideoCodec;
        }
    }

    public String M() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.agcAaid;
        }
        return str;
    }

    public void L(String str) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.cachedDslEngineVer = str;
                a(this.p);
            }
        }
    }

    public Boolean L() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar == null) {
                return null;
            }
            return aVar.hasAccAndRotate;
        }
    }

    public void K(String str) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.cachedStylePkgVer = str;
                a(this.p);
            }
        }
    }

    public Boolean K() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar == null) {
                return null;
            }
            return aVar.gaidLimit;
        }
    }

    public void J(String str) {
        synchronized (l) {
            ao();
            d dVar = this.r;
            if (dVar != null) {
                dVar.trackVersion = str;
                a(this.r);
            }
        }
    }

    public String J() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.gaid;
        }
        return str;
    }

    public void I(String str) {
        synchronized (j) {
            am();
            c cVar = this.p;
            if (cVar != null) {
                cVar.freeSdcard = str;
                a(this.p);
            }
        }
    }

    public String I() {
        String str;
        synchronized (this.h) {
            al();
            e eVar = this.o;
            str = eVar == null ? "" : eVar.fenceId;
        }
        return str;
    }

    public void H(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.storageSize = str;
                a(this.n);
            }
        }
    }

    public String H() {
        String str;
        synchronized (this.h) {
            al();
            e eVar = this.o;
            str = eVar == null ? "" : eVar.groupId;
        }
        return str;
    }

    public void G(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.memorySize = str;
                a(this.n);
            }
        }
    }

    public String G() {
        String str;
        synchronized (this.h) {
            al();
            e eVar = this.o;
            str = eVar == null ? null : eVar.hiadUTag;
        }
        return str;
    }

    public void F(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.agcAaid = str;
                a(this.n);
            }
        }
    }

    public Integer F() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null && aVar.type != null) {
                return this.n.type;
            }
            return null;
        }
    }

    public void E(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.gaid = str;
                a(this.n);
            }
        }
    }

    public Boolean E() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null && aVar.isTv != null) {
                return this.n.isTv;
            }
            return null;
        }
    }

    public void D(String str) {
        synchronized (this.h) {
            al();
            e eVar = this.o;
            if (eVar != null) {
                eVar.fenceId = str;
                a(this.o);
            }
        }
    }

    public String D() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.brandCust;
        }
        return str;
    }

    public boolean C() {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null && aVar.baseLocationSwitch != null) {
                return this.n.baseLocationSwitch.booleanValue();
            }
            return false;
        }
    }

    public void C(String str) {
        synchronized (this.h) {
            al();
            e eVar = this.o;
            if (eVar != null) {
                eVar.groupId = str;
                a(this.o);
            }
        }
    }

    public void B(String str) {
        synchronized (this.h) {
            al();
            e eVar = this.o;
            if (eVar != null) {
                eVar.hiadUTag = str;
                a(this.o);
            }
        }
    }

    public String B() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.charging;
        }
        return str;
    }

    public void A(String str) {
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            if (aVar != null) {
                aVar.brandCust = str;
                a(this.n);
            }
        }
    }

    public String A() {
        String str;
        synchronized (this.g) {
            ak();
            a aVar = this.n;
            str = aVar == null ? "" : aVar.battery;
        }
        return str;
    }

    private void ao() {
        if (this.r == null) {
            String string = this.f.getString("cache_data", null);
            d dVar = TextUtils.isEmpty(string) ? null : (d) bk.b(this.f20553a, string, d.class, new Class[0]);
            if (dVar == null) {
                dVar = new d();
            }
            this.r = dVar;
        }
    }

    private void an() {
        if (this.q == null) {
            String string = this.e.getString("cache_data", null);
            f fVar = TextUtils.isEmpty(string) ? null : (f) bk.b(this.f20553a, string, f.class, new Class[0]);
            if (fVar == null) {
                fVar = new f();
            }
            this.q = fVar;
        }
    }

    private void am() {
        c cVar;
        if (this.p == null) {
            SharedPreferences sharedPreferences = this.d;
            if (sharedPreferences == null) {
                cVar = new c();
            } else {
                String string = sharedPreferences.getString("cache_data", null);
                cVar = (string == null || string.length() <= 0) ? null : (c) bk.b(this.f20553a, string, c.class, new Class[0]);
                if (cVar == null) {
                    cVar = new c();
                }
            }
            this.p = cVar;
        }
    }

    private void al() {
        SharedPreferences sharedPreferences;
        if (this.o != null || (sharedPreferences = this.f20555c) == null) {
            return;
        }
        String string = sharedPreferences.getString("cache_data", null);
        e eVar = TextUtils.isEmpty(string) ? null : (e) bk.b(this.f20553a, string, e.class, new Class[0]);
        if (eVar == null) {
            eVar = new e();
        }
        this.o = eVar;
    }

    private void ak() {
        SharedPreferences sharedPreferences;
        if (this.n != null || (sharedPreferences = this.f20554b) == null) {
            return;
        }
        a aVar = null;
        String string = sharedPreferences.getString("cache_data", null);
        if (string != null && string.length() > 0) {
            aVar = (a) bk.b(this.f20553a, string, a.class, new Class[0]);
        }
        if (aVar == null) {
            aVar = new a();
        }
        this.n = aVar;
    }

    private void a(f fVar) {
        a(fVar, this.e);
    }

    private void a(e eVar) {
        a(eVar, this.f20555c);
    }

    private void a(d dVar) {
        a(dVar, this.f);
    }

    private void a(c cVar) {
        a(cVar, this.d);
    }

    private void a(b bVar, final SharedPreferences sharedPreferences) {
        if (bVar == null || sharedPreferences == null) {
            return;
        }
        final b bVarClone = bVar.clone();
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cn.1
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("cache_data", bk.b(cn.this.f20553a, bVarClone));
                editorEdit.commit();
            }
        });
    }

    private void a(a aVar) {
        a(aVar, this.f20554b);
    }

    static class b implements Cloneable {
        @Override // 
        /* JADX INFO: renamed from: b */
        public b clone() {
            return new b();
        }

        private b() {
        }
    }

    public static cn a(Context context) {
        cn cnVar;
        synchronized (i) {
            if (m == null) {
                m = new cn(context);
            }
            cnVar = m;
        }
        return cnVar;
    }

    public static final class a extends b {
        List<String> aVideoCodec;
        String acceler;
        String agCountryCode;
        String agVersion;
        String agcAaid;
        String arEngineVersion;
        String baro;
        Boolean baseLocationSwitch;
        String battery;
        String brandCust;
        String charging;
        String colorOSVersionName;
        String countryCode;
        String cpuCoreCnt;
        String cpuModel;
        String cpuSpeed;
        String deviceMark;
        Integer emuiSdkInt;
        String emuiVersionName;
        String freeSto;
        String funtouchOSVersionName;
        String gaid;
        Boolean gaidLimit;
        String gpuModel;
        Integer grpIdCode;
        String gyro;
        Boolean hasAccAndRotate;
        String hmsVersion;
        String hosVersionName;
        String hsfVersion;
        String insAppTypes;
        Boolean isDebug;
        Boolean isEmulator;
        String isHuaweiPhone;
        Boolean isLimitTracking;
        String isMIPhone;
        String isOPPOPhone;
        Boolean isProxy;
        Boolean isTv;
        String isVIVOPhone;
        String magicuiVersionName;
        String magnet;
        String memorySize;
        String miuiVersionName;
        String oaid;
        String pdtName;
        String routerCountry;
        String storageSize;
        String totalMem;
        String totalSto;
        Integer type;
        Boolean usb;
        String useragent;
        String uuid;
        String vendCountry;
        String vendor;
        String wifiName;
        String xrKitAppVersion;

        @Override // com.huawei.openalliance.ad.utils.cn.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.useragent = this.useragent;
            aVar.isHuaweiPhone = this.isHuaweiPhone;
            aVar.isMIPhone = this.isMIPhone;
            aVar.isVIVOPhone = this.isVIVOPhone;
            aVar.isOPPOPhone = this.isOPPOPhone;
            aVar.hsfVersion = this.hsfVersion;
            aVar.emuiVersionName = this.emuiVersionName;
            aVar.hosVersionName = this.hosVersionName;
            aVar.magicuiVersionName = this.magicuiVersionName;
            aVar.miuiVersionName = this.miuiVersionName;
            aVar.funtouchOSVersionName = this.funtouchOSVersionName;
            aVar.colorOSVersionName = this.colorOSVersionName;
            aVar.hmsVersion = this.hmsVersion;
            aVar.oaid = this.oaid;
            aVar.isLimitTracking = this.isLimitTracking;
            aVar.deviceMark = this.deviceMark;
            aVar.uuid = this.uuid;
            aVar.agVersion = this.agVersion;
            aVar.agCountryCode = this.agCountryCode;
            aVar.wifiName = this.wifiName;
            aVar.pdtName = this.pdtName;
            aVar.cpuModel = this.cpuModel;
            aVar.cpuCoreCnt = this.cpuCoreCnt;
            aVar.cpuSpeed = this.cpuSpeed;
            aVar.gpuModel = this.gpuModel;
            aVar.totalMem = this.totalMem;
            aVar.totalSto = this.totalSto;
            aVar.freeSto = this.freeSto;
            aVar.vendor = this.vendor;
            aVar.vendCountry = this.vendCountry;
            aVar.routerCountry = this.routerCountry;
            aVar.gyro = this.gyro;
            aVar.acceler = this.acceler;
            aVar.magnet = this.magnet;
            aVar.baro = this.baro;
            aVar.battery = this.battery;
            aVar.charging = this.charging;
            aVar.baseLocationSwitch = this.baseLocationSwitch;
            aVar.countryCode = this.countryCode;
            aVar.emuiSdkInt = this.emuiSdkInt;
            aVar.arEngineVersion = this.arEngineVersion;
            aVar.xrKitAppVersion = this.xrKitAppVersion;
            aVar.brandCust = this.brandCust;
            aVar.isTv = this.isTv;
            aVar.type = this.type;
            aVar.gaid = this.gaid;
            aVar.gaidLimit = this.gaidLimit;
            aVar.hasAccAndRotate = this.hasAccAndRotate;
            aVar.agcAaid = this.agcAaid;
            aVar.aVideoCodec = this.aVideoCodec;
            aVar.isProxy = this.isProxy;
            aVar.isDebug = this.isDebug;
            aVar.usb = this.usb;
            aVar.isEmulator = this.isEmulator;
            aVar.grpIdCode = this.grpIdCode;
            aVar.insAppTypes = this.insAppTypes;
            aVar.storageSize = this.storageSize;
            aVar.memorySize = this.memorySize;
            return aVar;
        }

        public a() {
            super();
        }
    }

    public static final class c extends b {
        String cachedDslEngineVer;
        String cachedStylePkgVer;
        String freeSdcard;
        Boolean honorLimitTracking;
        String honorOaid;
        Boolean isChildMode;
        Boolean isCoppa;
        String isHonor6UpPhone;
        String isHuaweiPhoneNew;
        Boolean isTFua;
        Boolean isWelinkUser;
        Integer sdkType;
        Integer sptImgFormat;

        @Override // com.huawei.openalliance.ad.utils.cn.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c clone() {
            c cVar = new c();
            cVar.isHuaweiPhoneNew = this.isHuaweiPhoneNew;
            cVar.isHonor6UpPhone = this.isHonor6UpPhone;
            cVar.sdkType = this.sdkType;
            cVar.freeSdcard = this.freeSdcard;
            cVar.sptImgFormat = this.sptImgFormat;
            cVar.isWelinkUser = this.isWelinkUser;
            cVar.isChildMode = this.isChildMode;
            cVar.isCoppa = this.isCoppa;
            cVar.isTFua = this.isTFua;
            cVar.honorOaid = this.honorOaid;
            cVar.honorLimitTracking = this.honorLimitTracking;
            cVar.cachedStylePkgVer = this.cachedStylePkgVer;
            cVar.cachedDslEngineVer = this.cachedDslEngineVer;
            return cVar;
        }

        public c() {
            super();
        }
    }

    public static final class d extends b {
        String trackVersion;

        @Override // com.huawei.openalliance.ad.utils.cn.b
        /* JADX INFO: renamed from: b */
        public b clone() {
            d dVar = new d();
            dVar.trackVersion = this.trackVersion;
            return dVar;
        }

        public d() {
            super();
        }
    }

    public static final class e extends b {

        @SecretField
        String androidID;

        @SecretField
        String fenceId;

        @SecretField
        String groupId;

        @SecretField
        String hiadUTag;

        @Override // com.huawei.openalliance.ad.utils.cn.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e clone() {
            e eVar = new e();
            eVar.androidID = this.androidID;
            eVar.groupId = this.groupId;
            eVar.hiadUTag = this.hiadUTag;
            eVar.fenceId = this.fenceId;
            return eVar;
        }

        public e() {
            super();
        }
    }

    public static final class f extends b {
        String tag;

        @Override // com.huawei.openalliance.ad.utils.cn.b
        /* JADX INFO: renamed from: b */
        public b clone() {
            f fVar = new f();
            fVar.tag = this.tag;
            return fVar;
        }

        public f() {
            super();
        }
    }

    private cn(Context context) {
        this.f20554b = null;
        this.f20555c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        try {
            this.f20554b = context.getSharedPreferences("hiad_sp_properties_cache", 0);
            this.f20555c = context.getSharedPreferences("hiad_sp_sec_properties_cache", 0);
            this.d = context.getSharedPreferences("hiad_sp_nor_properties_cache", 0);
            this.e = context.getSharedPreferences("hiad_sp_tag_cache", 0);
            this.f = context.getSharedPreferences("hiad_sp_other_cache", 0);
            this.f20553a = context.getApplicationContext();
        } catch (Throwable th) {
            hw.c("PropertiesCache", "get SharedPreference error: %s", th.getClass().getSimpleName());
        }
    }
}
