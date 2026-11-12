package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import com.huawei.updatesdk.sdk.foundation.utils.h;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class Param extends com.huawei.updatesdk.sdk.service.storekit.bean.b {

    @SDKNetTransmission
    private String distRule;
    private String fSha2_;
    private int isPre_;
    private List<String> keySets_;
    private int maple_;
    private String oldVersion_;
    private String package_;

    @SDKNetTransmission
    private int pkgMode;
    private String sSha2_;

    @SDKNetTransmission
    private long shellApkVer;
    private int targetSdkVersion_;
    private int versionCode_;

    public void setVersionName(String str) {
        this.oldVersion_ = str;
    }

    public void setVersionCode(int i) {
        this.versionCode_ = i;
    }

    public void setTargetSdkVersion(int i) {
        this.targetSdkVersion_ = i;
    }

    public void setPackageName(Context context, String str) {
        com.huawei.updatesdk.sdk.service.app.a.a(context);
        this.package_ = str;
        prepare(com.huawei.updatesdk.service.util.b.e(com.huawei.updatesdk.sdk.service.app.a.c().a(), this.package_));
    }

    public void setMapleState(int i) {
        this.maple_ = i;
    }

    public void setApkSignature(String str) {
        String strB = h.b(com.huawei.updatesdk.sdk.foundation.utils.a.a(h.c(str)));
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        this.sSha2_ = strB.toLowerCase(Locale.getDefault());
    }

    public void setApkFileSha256(String str) {
        this.fSha2_ = str;
    }

    public String getPackageName() {
        return this.package_;
    }

    private void prepare(PackageInfo packageInfo) {
        this.package_ = packageInfo.packageName;
        this.versionCode_ = packageInfo.versionCode;
        String str = packageInfo.versionName;
        if (str == null) {
            str = Constants.NULL;
        }
        this.oldVersion_ = str;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        this.targetSdkVersion_ = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        this.isPre_ = com.huawei.updatesdk.service.util.b.a(packageInfo);
        this.maple_ = com.huawei.updatesdk.service.util.b.b(this.package_);
        this.keySets_ = com.huawei.updatesdk.service.appmgr.keyset.b.a().a(packageInfo);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            setApkSignature(signatureArr[0].toCharsString());
        }
        this.fSha2_ = com.huawei.updatesdk.service.appmgr.fileinfo.b.a().a(packageInfo);
        this.shellApkVer = getShellApkVer(packageInfo);
        this.pkgMode = com.huawei.updatesdk.sdk.foundation.utils.e.d(this.package_) ? 2 : 0;
        this.distRule = com.huawei.updatesdk.service.util.b.b(com.huawei.updatesdk.sdk.service.app.a.c().a(), this.package_);
    }

    private long getShellApkVer(PackageInfo packageInfo) {
        return packageInfo.baseRevisionCode;
    }

    public Param(PackageInfo packageInfo) {
        prepare(packageInfo);
    }

    public Param() {
    }
}
