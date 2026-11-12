package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.InstallConfig;
import com.huawei.openalliance.ad.beans.metadata.Permission;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.pp;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class AppInfo implements Serializable {
    private static final String TAG = "AppInfo";
    private static final long serialVersionUID = 30414300;
    private String actName;
    private String afDlBtnText;
    private long allAreaPopDelay;
    private boolean allowedNonWifiNetwork;
    private String appCountry;
    private String appDesc;
    private String appDetailDesc;
    private String appDetailsUrl;
    private String appLanguage;
    private String appName;
    private int appType;
    private int autoOpenAfterInstall;
    private int autoOpenSwitchLandingOrDetail;
    private String channelInfo;
    private int channelInfoSaveLimit;
    private boolean checkSha256;
    private String contentInstallBtnAction;
    private String contiBtn;
    private String curInstallWay;
    private String developerName;
    private String dlBtnText;
    private String dlOpenBtnText;
    private String downCountDesc;
    private Long downloadNum;
    private String downloadUrl;
    private long fileSize;
    private int fullScrnNotify;
    private String fullScrnNotifyText;
    private Integer hasPermissions;
    private String hot;
    private String iconUrl;
    private String insActvNotifyBtnText;
    private int insActvNotifyCfg;
    private InstallConfig installConfig;
    private String installPermiText;
    private String installPureModeText;
    private String intent;
    private String intentPackage;
    private String intentUri;
    private String nextInstallWays;
    private int noAlertTime;
    private String packageName;
    private boolean permPromptForCard;
    private boolean permPromptForLanding;
    private String permissionUrl;
    private List<PermissionEntity> permissions;
    private int popNotify;
    private int popUpAfterInstallNew;
    private String popUpAfterInstallText;
    private int popUpStyle;
    private String priorInstallWay;
    private String privacyUrl;
    private String pureModeText;
    private Long rateNum;
    private transient String remoteAfDlBtnText;
    private transient String remoteDlBtnText;
    private String reservedPkgName;
    private String safeDownloadUrl;
    private String sha256;
    private int trafficReminder;
    private String uniqueId;
    private String versionCode;
    private String versionName;

    /* JADX INFO: loaded from: classes41.dex */
    public interface PermissionCallBack {
        void onPermissionCallBack(List<PermissionEntity> list);
    }

    public void z(String str) {
        this.remoteAfDlBtnText = str;
    }

    public String z() {
        return this.curInstallWay;
    }

    public void y(String str) {
        this.remoteDlBtnText = str;
    }

    public String y() {
        return this.appCountry;
    }

    public void x(String str) {
        this.afDlBtnText = str;
    }

    public String x() {
        return this.appLanguage;
    }

    public boolean w() {
        Integer num = this.hasPermissions;
        if (num != null) {
            return num.intValue() == 1;
        }
        return !bm.a(this.permissions);
    }

    public void w(String str) {
        this.dlBtnText = str;
    }

    public void v(String str) {
        this.uniqueId = str;
    }

    public String v() {
        return this.nextInstallWays;
    }

    public void u(String str) {
        this.channelInfo = str;
    }

    public String u() {
        return this.intentPackage;
    }

    public void t(String str) {
        this.popUpAfterInstallText = str;
    }

    public String t() {
        return this.intent;
    }

    public void showPrivacyPolicyInWeb(Context context) {
        b(this.privacyUrl, context);
    }

    public void showPrivacyPolicy(Context context) {
        a(context, this.privacyUrl);
    }

    public void showPermissionPageInWeb(Context context) {
        b(this.permissionUrl, context);
    }

    public void showPermissionPage(Context context) {
        a(context, this.permissionUrl);
    }

    public void setAllowedNonWifiNetwork(boolean z) {
        this.allowedNonWifiNetwork = z;
    }

    public void s(String str) {
        this.dlOpenBtnText = str;
    }

    public int s() {
        return this.insActvNotifyCfg;
    }

    public void requestPermissions(Context context, PermissionCallBack permissionCallBack) {
        if (getPermissions() == null) {
            new pp(context, new a(permissionCallBack)).a(this);
        } else if (permissionCallBack != null) {
            permissionCallBack.onPermissionCallBack(getPermissions());
        }
    }

    public void r(String str) {
        this.contentInstallBtnAction = str;
    }

    public String r() {
        return this.insActvNotifyBtnText;
    }

    public void q(String str) {
        this.priorInstallWay = str;
    }

    public String q() {
        return this.fullScrnNotifyText;
    }

    public void p(String str) {
        this.developerName = str;
    }

    public int p() {
        return this.fullScrnNotify;
    }

    public void o(String str) {
        this.appDesc = str;
    }

    public int o() {
        return this.popNotify;
    }

    public void n(String str) {
        this.appName = str;
    }

    public String n() {
        return this.remoteAfDlBtnText;
    }

    public void m(String str) {
        this.intentUri = str;
    }

    public String m() {
        return this.remoteDlBtnText;
    }

    public void l(String str) {
        this.safeDownloadUrl = str;
    }

    public String l() {
        return this.afDlBtnText;
    }

    public void k(String str) {
        this.sha256 = str;
    }

    public void k(int i) {
        this.popUpStyle = i;
    }

    public String k() {
        return this.dlBtnText;
    }

    public void j(String str) {
        this.downCountDesc = str;
    }

    public void j(int i) {
        this.autoOpenAfterInstall = i;
    }

    public int j() {
        return this.trafficReminder;
    }

    public boolean isPermPromptForLanding() {
        return this.permPromptForLanding;
    }

    public boolean isPermPromptForCard() {
        return this.permPromptForCard;
    }

    public boolean isCheckSha256() {
        return this.checkSha256;
    }

    public boolean isAllowedNonWifiNetwork() {
        return this.allowedNonWifiNetwork;
    }

    public void i(String str) {
        this.hot = str;
    }

    public void i(int i) {
        this.appType = i;
    }

    public int i() {
        return this.noAlertTime;
    }

    public void h(String str) {
        this.privacyUrl = str;
    }

    public void h(int i) {
        this.insActvNotifyCfg = i;
    }

    public int h() {
        return this.channelInfoSaveLimit;
    }

    public String getVersionName() {
        String str = this.versionName;
        return str == null ? "" : str;
    }

    public String getVersionCode() {
        return this.versionCode;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public String getSha256() {
        return this.sha256;
    }

    public String getSafeDownloadUrl() {
        return this.safeDownloadUrl;
    }

    public Long getRateNum() {
        return this.rateNum;
    }

    public String getPrivacyLink() {
        return this.privacyUrl;
    }

    public String getPriorInstallWay() {
        return this.priorInstallWay;
    }

    public List<PermissionEntity> getPermissions() {
        return this.permissions;
    }

    public String getPermissionUrl() {
        return this.permissionUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getIntentUri() {
        return this.intentUri;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getHot() {
        return this.hot;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public Long getDownloadNum() {
        return this.downloadNum;
    }

    public String getDownCountDesc() {
        return this.downCountDesc;
    }

    public String getDeveloperName() {
        String str = this.developerName;
        return str == null ? "" : str;
    }

    public String getCta(AppStatus appStatus) {
        int i = AnonymousClass3.f19169a[appStatus.ordinal()];
        if (i == 1) {
            return this.afDlBtnText;
        }
        if (i != 2) {
            return null;
        }
        return this.dlBtnText;
    }

    public String getAppName() {
        String str = this.appName;
        return str == null ? "" : str;
    }

    public String getAppDetailUrl() {
        return this.appDetailsUrl;
    }

    public String getAppDetailDesc() {
        String str = this.appDetailDesc;
        return str == null ? "" : str;
    }

    public String getAppDesc() {
        String str = this.appDesc;
        return str == null ? "" : str;
    }

    public void g(String str) {
        this.appDetailsUrl = str;
    }

    public void g(int i) {
        this.fullScrnNotify = i;
    }

    public String g() {
        return this.channelInfo;
    }

    public void f(String str) {
        this.permissionUrl = str;
    }

    public void f(int i) {
        this.popNotify = i;
    }

    public String f() {
        return this.popUpAfterInstallText;
    }

    public void e(String str) {
        this.downloadUrl = str;
    }

    public void e(int i) {
        this.trafficReminder = i;
    }

    public int e() {
        return this.popUpAfterInstallNew;
    }

    public void d(String str) {
        this.iconUrl = str;
    }

    public void d(int i) {
        this.noAlertTime = i;
    }

    public String d() {
        return this.dlOpenBtnText;
    }

    public void c(boolean z) {
        this.checkSha256 = z;
    }

    public void c(String str) {
        this.versionName = str;
    }

    public void c(Integer num) {
        this.hasPermissions = num;
    }

    public void c(int i) {
        this.channelInfoSaveLimit = i;
    }

    public int c() {
        return this.autoOpenSwitchLandingOrDetail;
    }

    public void b(boolean z) {
        this.permPromptForLanding = z;
    }

    public void b(List<PermissionEntity> list) {
        this.permissions = list;
    }

    public void b(String str) {
        this.versionCode = str;
    }

    public void b(Long l) {
        this.downloadNum = l;
    }

    public void b(long j) {
        this.allAreaPopDelay = j;
    }

    public void b(int i) {
        this.popUpAfterInstallNew = i;
    }

    public String b(Integer num) {
        if (num == null) {
            num = 5;
        }
        if (1 == num.intValue() || 14 == num.intValue() || 10005 == num.intValue()) {
            return a();
        }
        String strZ = z();
        return TextUtils.isEmpty(strZ) ? getPriorInstallWay() : strZ;
    }

    public InstallConfig b() {
        return this.installConfig;
    }

    public boolean a(Integer num) {
        if (TextUtils.isEmpty(this.packageName)) {
            return false;
        }
        String strB = b(num);
        if (TextUtils.isEmpty(strB)) {
            return false;
        }
        return strB.equals("8") || strB.equals("6") || strB.equals("5");
    }

    public void a(boolean z) {
        this.permPromptForCard = z;
    }

    public void a(List<Permission> list) {
        StringBuilder sb;
        String string;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            ArrayMap arrayMap = new ArrayMap();
            for (Permission permission : list) {
                List arrayList = (List) arrayMap.get(permission.b());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    arrayMap.put(permission.b(), arrayList);
                }
                arrayList.add(new PermissionEntity(dg.e(permission.a()), 1));
            }
            this.permissions = new ArrayList();
            for (Map.Entry entry : arrayMap.entrySet()) {
                this.permissions.add(new PermissionEntity(dg.e((String) entry.getKey()), 0));
                this.permissions.addAll((Collection) entry.getValue());
            }
        } catch (RuntimeException e) {
            string = "parsePermission RuntimeException:" + e.getClass().getSimpleName();
            hw.d(TAG, string);
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder("parsePermission Exception:");
            sb.append(e.getClass().getSimpleName());
            string = sb.toString();
            hw.d(TAG, string);
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("parsePermission Exception:");
            sb.append(e.getClass().getSimpleName());
            string = sb.toString();
            hw.d(TAG, string);
        }
    }

    public void a(String str) {
        this.packageName = str;
    }

    public void a(Long l) {
        this.rateNum = l;
    }

    public void a(InstallConfig installConfig) {
        this.installConfig = installConfig;
    }

    public void a(long j) {
        this.fileSize = j;
    }

    public void a(int i) {
        this.autoOpenSwitchLandingOrDetail = i;
    }

    public String a() {
        return this.contentInstallBtnAction;
    }

    public void O(String str) {
        this.appDetailDesc = str;
    }

    public void N(String str) {
        this.reservedPkgName = str;
    }

    public void M(String str) {
        this.contiBtn = str;
    }

    public void L(String str) {
        this.installPureModeText = str;
    }

    public String L() {
        return this.privacyUrl;
    }

    public void K(String str) {
        this.pureModeText = str;
    }

    public Integer K() {
        return this.hasPermissions;
    }

    public void J(String str) {
        this.installPermiText = str;
    }

    public String J() {
        return this.reservedPkgName;
    }

    public void I(String str) {
        this.actName = str;
    }

    public String I() {
        return this.contiBtn;
    }

    public void H(String str) {
        this.curInstallWay = str;
    }

    public String H() {
        return this.installPureModeText;
    }

    public void G(String str) {
        this.appCountry = str;
    }

    public String G() {
        return this.pureModeText;
    }

    public void F(String str) {
        this.appLanguage = str;
    }

    public String F() {
        return this.installPermiText;
    }

    public void E(String str) {
        this.nextInstallWays = str;
    }

    public int E() {
        return this.popUpStyle;
    }

    public void D(String str) {
        this.intentPackage = str;
    }

    public long D() {
        return this.allAreaPopDelay;
    }

    public void C(String str) {
        this.intent = str;
    }

    public int C() {
        return this.autoOpenAfterInstall;
    }

    public void B(String str) {
        this.insActvNotifyBtnText = str;
    }

    public int B() {
        return this.appType;
    }

    public void A(String str) {
        this.fullScrnNotifyText = str;
    }

    public String A() {
        return this.actName;
    }

    private void b(final String str, final Context context) {
        if (TextUtils.isEmpty(str)) {
            hw.b(TAG, "url is empty.");
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.data.AppInfo.2
                @Override // java.lang.Runnable
                public void run() {
                    ca.a(context, str);
                }
            });
        }
    }

    private void a(final String str, final Context context) {
        if (TextUtils.isEmpty(str)) {
            hw.b(TAG, "url is empty.");
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.data.AppInfo.1
                @Override // java.lang.Runnable
                public void run() {
                    as.a(context, str);
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a implements pp.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        PermissionCallBack f19170a;

        @Override // com.huawei.openalliance.ad.pp.a
        public void a(List<PermissionEntity> list) {
            PermissionCallBack permissionCallBack = this.f19170a;
            if (permissionCallBack != null) {
                permissionCallBack.onPermissionCallBack(list);
            }
        }

        a(PermissionCallBack permissionCallBack) {
            this.f19170a = permissionCallBack;
        }
    }

    private void a(Context context, String str) {
        Boolean boolO = HiAd.a(context).o();
        if (boolO == null || boolO.booleanValue()) {
            a(str, context);
        } else {
            b(str, context);
        }
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.inter.data.AppInfo$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19169a;

        static {
            int[] iArr = new int[AppStatus.values().length];
            f19169a = iArr;
            try {
                iArr[AppStatus.INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19169a[AppStatus.DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AppInfo(ApkInfo apkInfo) {
        this.priorInstallWay = "3";
        this.contentInstallBtnAction = "3";
        this.permPromptForCard = true;
        this.permPromptForLanding = false;
        this.popUpAfterInstallNew = 0;
        this.channelInfoSaveLimit = -2;
        this.insActvNotifyCfg = 1;
        this.appType = 1;
        if (apkInfo != null) {
            this.appName = dg.e(apkInfo.j());
            this.iconUrl = apkInfo.x();
            this.packageName = apkInfo.a();
            this.versionCode = apkInfo.b();
            this.versionName = apkInfo.c();
            this.downloadUrl = apkInfo.d();
            this.permissionUrl = apkInfo.h();
            this.appDetailsUrl = apkInfo.i();
            this.fileSize = apkInfo.e();
            this.sha256 = apkInfo.f();
            this.hot = apkInfo.m();
            this.rateNum = apkInfo.n();
            this.downloadNum = apkInfo.o();
            this.downCountDesc = apkInfo.p();
            this.checkSha256 = apkInfo.P() == 0;
            this.safeDownloadUrl = apkInfo.g();
            this.channelInfo = apkInfo.w();
            this.channelInfoSaveLimit = apkInfo.y();
            String strL = apkInfo.l();
            if (!TextUtils.isEmpty(strL)) {
                this.priorInstallWay = strL;
            }
            String strQ = apkInfo.q();
            if (!TextUtils.isEmpty(strQ)) {
                this.contentInstallBtnAction = strQ;
            }
            this.installConfig = apkInfo.r();
            this.curInstallWay = this.priorInstallWay;
            this.permPromptForCard = "1".equals(apkInfo.s());
            this.permPromptForLanding = "1".equals(apkInfo.t());
            this.popUpAfterInstallNew = apkInfo.u();
            this.popUpAfterInstallText = apkInfo.v();
            this.dlBtnText = dg.e(apkInfo.C());
            this.afDlBtnText = dg.e(apkInfo.D());
            this.popNotify = apkInfo.E();
            this.fullScrnNotify = apkInfo.F();
            this.fullScrnNotifyText = dg.e(apkInfo.G());
            this.insActvNotifyBtnText = dg.e(apkInfo.H());
            this.insActvNotifyCfg = apkInfo.I();
            a(apkInfo.k());
            this.iconUrl = apkInfo.x();
            this.appDesc = dg.e(apkInfo.z());
            this.developerName = dg.e(apkInfo.M());
            this.noAlertTime = apkInfo.A() > 0 ? apkInfo.A() : 7;
            this.trafficReminder = apkInfo.B();
            this.intent = apkInfo.J();
            this.intentPackage = apkInfo.K();
            this.hasPermissions = apkInfo.L();
            this.nextInstallWays = apkInfo.O();
            this.actName = apkInfo.Q();
            this.appType = apkInfo.R();
            this.autoOpenAfterInstall = apkInfo.S();
            this.allAreaPopDelay = apkInfo.T();
            this.popUpStyle = apkInfo.U();
            this.installPermiText = dg.e(apkInfo.V());
            this.pureModeText = dg.e(apkInfo.W());
            this.installPureModeText = dg.e(apkInfo.X());
            this.contiBtn = dg.e(apkInfo.Y());
            this.reservedPkgName = apkInfo.Z();
            this.autoOpenSwitchLandingOrDetail = apkInfo.aa();
            this.dlOpenBtnText = dg.e(apkInfo.ab());
            this.appDetailDesc = dg.e(apkInfo.ac());
        }
    }

    public AppInfo() {
        this.priorInstallWay = "3";
        this.contentInstallBtnAction = "3";
        this.permPromptForCard = true;
        this.permPromptForLanding = false;
        this.popUpAfterInstallNew = 0;
        this.channelInfoSaveLimit = -2;
        this.insActvNotifyCfg = 1;
        this.appType = 1;
    }
}
