package com.huawei.openalliance.ad.beans.metadata;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.annotations.g;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.openalliance.ad.cr;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.aq;
import com.huawei.openalliance.ad.utils.cn;
import com.huawei.openalliance.ad.utils.d;
import com.huawei.openalliance.ad.utils.dd;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dp;
import com.huawei.wear.oversea.util.SystemPropertyValues;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class Device {
    private static final String TAG = "Device";

    @g
    private String adid;
    private Integer adsLoc;
    private String agCountryCode;

    @g
    private String agcAaid;

    @a
    private String androidid;
    private List<App> appList;
    private String belongCountry;
    private String brand;
    private String brandCust;
    private String buildVersion;
    private String clientTime;
    private int dpi;
    private Integer emuiSdkInt;
    private String emuiVer;
    private Integer encodingMode;
    private Long freeDiskSize;
    private Long freeSdcardSize;

    @g
    private String gaid;
    private String gaidTrackingEnabled;
    private Integer gpsOn;

    @a
    private String groupId;
    private int height;
    private Integer hmSdkInt;
    private String hmVer;
    private Integer hmftype;

    @a
    private List<String> insApps;
    private boolean isChinaROM;
    private String isTrackingEnabled;
    private String language;
    private String localeCountry;
    private String mVer;
    private String magicUIVer;
    private String maker;
    private String model;
    private String oVer;

    @g
    private String oaid;
    private String partnerChannel;
    private float pxratio;
    private String roLocale;
    private String roLocaleCountry;
    private String routerCountry;
    private String script;
    private Integer sdkType;
    private String simCountryIso;
    private Long totalDiskSize;
    private Long totalSdcardSize;
    private String tvModel;

    @g
    private String udid;
    private List<App> uninstalledPreAppList;
    private String useragent;

    @g
    private String uuid;
    private String vVer;
    private String vendor;
    private String vendorCountry;
    private String verCodeOfAG;
    private String verCodeOfHms;
    private String verCodeOfHsf;
    private String version;
    private int width;
    private int type = 4;
    private String os = OsType.ANDROID;
    private DeviceExt ext = new DeviceExt();

    public String z() {
        return this.gaid;
    }

    public String y() {
        return this.clientTime;
    }

    public String x() {
        return this.belongCountry;
    }

    public String w() {
        return this.simCountryIso;
    }

    public String v() {
        return this.localeCountry;
    }

    public String u() {
        return this.verCodeOfHms;
    }

    public String t() {
        return this.magicUIVer;
    }

    public String s() {
        return this.emuiVer;
    }

    public String r() {
        return this.verCodeOfHsf;
    }

    public String q() {
        return this.isTrackingEnabled;
    }

    public String p() {
        return this.oaid;
    }

    public String o() {
        return this.udid;
    }

    public String n() {
        return this.useragent;
    }

    public float m() {
        return this.pxratio;
    }

    public int l() {
        return this.dpi;
    }

    public void k(String str) {
        this.adid = str;
    }

    public String k() {
        return this.tvModel;
    }

    public void j(String str) {
        this.groupId = str;
    }

    public String j() {
        return this.buildVersion;
    }

    public void i(String str) {
        this.agcAaid = str;
    }

    public String i() {
        return this.androidid;
    }

    public void h(String str) {
        this.agCountryCode = str;
    }

    public String h() {
        return this.language;
    }

    public void g(String str) {
        this.uuid = str;
    }

    public int g() {
        return this.height;
    }

    public void f(String str) {
        this.gaidTrackingEnabled = str;
    }

    public int f() {
        return this.width;
    }

    public void e(String str) {
        this.gaid = str;
    }

    public String e() {
        return this.model;
    }

    public void d(String str) {
        this.isTrackingEnabled = str;
    }

    public String d() {
        return this.maker;
    }

    public void c(String str) {
        this.oaid = str;
    }

    public void c(Integer num) {
        this.encodingMode = num;
    }

    public String c() {
        return this.version;
    }

    public void b(List<App> list) {
        this.uninstalledPreAppList = list;
    }

    public void b(String str) {
        this.udid = str;
    }

    public void b(Integer num) {
        this.adsLoc = num;
    }

    public String b() {
        return this.os;
    }

    public String aj() {
        return this.adid;
    }

    public Integer ai() {
        return this.sdkType;
    }

    public List<App> ah() {
        return this.appList;
    }

    public boolean ag() {
        return this.isChinaROM;
    }

    public List<App> af() {
        return this.uninstalledPreAppList;
    }

    public String ae() {
        return this.groupId;
    }

    public DeviceExt ad() {
        return this.ext;
    }

    public String ac() {
        return this.agcAaid;
    }

    public Integer ab() {
        return this.hmSdkInt;
    }

    public Integer aa() {
        return this.hmftype;
    }

    public void a(List<String> list) {
        this.insApps = list;
    }

    public void a(String str) {
        this.androidid = str;
    }

    public void a(Integer num) {
        this.gpsOn = num;
    }

    public final void a(Context context, int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.language = d.a();
        this.script = d.b();
        this.type = i3;
        this.localeCountry = dk.d();
        this.simCountryIso = dk.e(context);
        this.belongCountry = fp.b(context).bQ();
        this.clientTime = dp.a();
        this.routerCountry = cc.a(context).o();
        this.appList = fp.b(context).cb();
        this.ext.a(cn.a(context).N());
        if (this.isChinaROM) {
            String strF = ab.f();
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            this.ext.b(strF);
        }
    }

    public void a(Context context) {
        cr crVarA = cc.a(context);
        this.version = Build.VERSION.RELEASE;
        this.maker = crVarA.j();
        this.brand = crVarA.k();
        String strB = crVarA.b();
        this.model = strB;
        if (strB != null) {
            this.model = strB.toUpperCase(Locale.ENGLISH);
        }
        this.language = d.a();
        this.script = d.b();
        this.emuiVer = crVarA.e();
        this.emuiSdkInt = crVarA.h();
        this.magicUIVer = crVarA.i();
        this.verCodeOfHsf = d.k(context);
        this.verCodeOfHms = d.l(context);
        this.verCodeOfAG = d.m(context);
        this.agCountryCode = d.n(context);
        this.localeCountry = dk.d();
        this.simCountryIso = dk.e(context);
        this.roLocaleCountry = dg.n(dk.a("ro.product.locale.region"));
        this.roLocale = dg.n(dk.a(SystemPropertyValues.PROP_LOCALE_KEY));
        this.vendorCountry = dg.n(dk.a(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP));
        this.vendor = dg.n(dk.a(CountryCodeBean.VENDOR_SYSTEMPROP));
        this.type = ab.k(context);
        this.sdkType = d.z(context);
        b(context);
    }

    public int a() {
        return this.type;
    }

    public String Z() {
        return this.hmVer;
    }

    public Integer Y() {
        return this.encodingMode;
    }

    public List<String> X() {
        return this.insApps;
    }

    public String W() {
        return this.partnerChannel;
    }

    public String V() {
        return this.brandCust;
    }

    public Integer U() {
        return this.emuiSdkInt;
    }

    public String T() {
        return this.script;
    }

    public String S() {
        return this.brand;
    }

    public String R() {
        return this.oVer;
    }

    public String Q() {
        return this.vVer;
    }

    public String P() {
        return this.mVer;
    }

    public Integer O() {
        return this.adsLoc;
    }

    public Integer N() {
        return this.gpsOn;
    }

    public String M() {
        return this.vendor;
    }

    public String L() {
        return this.agCountryCode;
    }

    public String K() {
        return this.verCodeOfAG;
    }

    public Long J() {
        return this.freeSdcardSize;
    }

    public Long I() {
        return this.totalSdcardSize;
    }

    public Long H() {
        return this.freeDiskSize;
    }

    public Long G() {
        return this.totalDiskSize;
    }

    public String F() {
        return this.roLocale;
    }

    public String E() {
        return this.routerCountry;
    }

    public String D() {
        return this.roLocaleCountry;
    }

    public String C() {
        return this.vendorCountry;
    }

    public String B() {
        return this.uuid;
    }

    public String A() {
        return this.gaidTrackingEnabled;
    }

    private void c(Context context) {
        String strF = dd.f(context);
        if (!TextUtils.isEmpty(strF)) {
            this.totalDiskSize = ai.d(strF);
            this.freeDiskSize = ai.c(strF);
        }
        String strG = dd.g(context);
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        this.totalSdcardSize = ai.d(strG);
        this.freeSdcardSize = ai.c(strG);
    }

    private void b(Context context) {
        this.hmVer = ab.m(context);
        if (aq.a(context)) {
            this.hmftype = 1;
            this.os = aq.a();
        }
        this.hmSdkInt = aq.b(context);
    }

    private void a(Context context, boolean z) {
        cr crVarA = cc.a(context);
        this.dpi = d.h(context);
        this.pxratio = d.i(context);
        this.roLocale = dg.n(dk.a(SystemPropertyValues.PROP_LOCALE_KEY));
        this.version = Build.VERSION.RELEASE;
        this.maker = crVarA.j();
        this.brand = crVarA.k();
        String strB = crVarA.b();
        this.model = strB;
        if (strB != null) {
            this.model = strB.toUpperCase(Locale.ENGLISH);
        }
        this.buildVersion = crVarA.c();
        this.useragent = d.j(context);
        this.verCodeOfHsf = d.k(context);
        this.emuiVer = crVarA.e();
        this.magicUIVer = crVarA.i();
        this.verCodeOfHms = d.l(context);
        this.verCodeOfAG = d.m(context);
        this.brandCust = d.u(context);
        this.partnerChannel = dk.a("ro.build.2b2c.partner.ext_channel");
        if (this.isChinaROM) {
            String strE = ab.e();
            if (!TextUtils.isEmpty(strE)) {
                this.ext.a(strE);
            }
        }
        if (z) {
            this.udid = d.g(context);
            this.uuid = d.a(context, true);
        }
        dg.n(crVarA.q());
        this.vendor = dg.n(crVarA.p());
        this.roLocaleCountry = dg.n(dk.a("ro.product.locale.region"));
        if (this.isChinaROM) {
            this.agcAaid = com.huawei.openalliance.ad.utils.a.a(context);
        }
        this.sdkType = d.z(context);
        b(context);
        c(context);
    }

    public Device(Context context, boolean z) {
        this.isChinaROM = cc.a(context).d();
        a(context, z);
    }

    public Device(Context context, int i, int i2, int i3, boolean z) {
        this.isChinaROM = cc.a(context).d();
        a(context, z);
        a(context, i, i2, i3);
    }

    public Device() {
    }
}
