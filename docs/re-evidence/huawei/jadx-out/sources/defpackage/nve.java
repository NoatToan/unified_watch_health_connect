package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nve {
    public static void e(final Context context, final boolean z, final CheckUpdateCallBack checkUpdateCallBack) {
        RemoteConfigUtils.a("grayVersionInfo", new RemoteConfigUtils.ConfigCallback() { // from class: nve.2
            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onSuccess(String str) {
                LogUtil.a("ThirdPartyGrayscaleUtil", "RemoteConfig, getValue is: ", str);
                if (TextUtils.isEmpty(str)) {
                    nve.c(context, checkUpdateCallBack, z);
                    return;
                }
                a aVar = (a) new Gson().fromJson(str, a.class);
                if (aVar == null || aVar.f() <= CommonUtil.e(context)) {
                    nve.c(context, checkUpdateCallBack, z);
                } else {
                    checkUpdateCallBack.onUpdateInfo(nve.b(7, aVar));
                }
            }

            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onFailure(Exception exc, String str) {
                LogUtil.a("ThirdPartyGrayscaleUtil", "RemoteConfig, fetch onFailure");
                nve.c(context, checkUpdateCallBack, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(int i, a aVar) {
        LogUtil.a("ThirdPartyGrayscaleUtil", "getApkIntent() in");
        Intent intent = new Intent();
        intent.putExtras(a(i, aVar));
        return intent;
    }

    private static Bundle a(int i, a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("status", i);
        ApkUpgradeInfo apkUpgradeInfo = new ApkUpgradeInfo();
        apkUpgradeInfo.setVersion_(aVar.a());
        apkUpgradeInfo.setSize_(aVar.b());
        apkUpgradeInfo.setNewFeatures_(aVar.c());
        apkUpgradeInfo.setVersionCode_(aVar.f());
        apkUpgradeInfo.setDownurl_(aVar.d());
        apkUpgradeInfo.setSha256_(aVar.e());
        bundle.putParcelable(UpdateKey.INFO, apkUpgradeInfo);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z) {
        LogUtil.a("ThirdPartyGrayscaleUtil", "checkNewVersionFromSdk() in");
        if (z) {
            nvb.a(context, checkUpdateCallBack, false, nvb.d(), false);
        } else {
            nvb.a(context, BaseApplication.getAppPackage(), checkUpdateCallBack);
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("versionCode")
        private int f43794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("updateUri")
        private String f43795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("message")
        private String f43796c;

        @SerializedName("sha256")
        private String d;

        @SerializedName("size")
        private int e;

        @SerializedName("version")
        private String j;

        private a() {
        }

        public String a() {
            return this.j;
        }

        public String d() {
            return this.f43795b;
        }

        public int b() {
            return this.e;
        }

        public String c() {
            return this.f43796c;
        }

        public int f() {
            return this.f43794a;
        }

        public String e() {
            return this.d;
        }

        public String toString() {
            return "GrayVersionInfo{versionName='" + this.j + "', updateUri='" + this.f43795b + "', size=" + this.e + ", message='" + this.f43796c + "', versionCode='" + this.f43794a + ", sha256='" + this.d + '}';
        }
    }
}
