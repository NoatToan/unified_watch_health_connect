package com.huawei.hms.kit.awareness.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
class HHA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13859a = "AGConnectConfigReader";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile HHA f13860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f13861c;

    JSONObject b() {
        if (c()) {
            return this.f13861c;
        }
        throw new HHG(10008, "a pattern error happened in agc file!");
    }

    void a(Context context) {
        AGConnectOptions options = AGConnectInstance.getInstance().getOptions();
        String string = options.getString(AgConnectInfo.AgConnectKey.ANALYTICS_COLLECTOR_URL);
        String string2 = options.getString(AgConnectInfo.AgConnectKey.APPLICATION_ID);
        String string3 = options.getString(AgConnectInfo.AgConnectKey.PACKAGE_NAME);
        String string4 = options.getString(AgConnectInfo.AgConnectKey.API_KEY);
        String string5 = options.getString("region");
        if (string == null && string2 == null && string3 == null && string4 == null && string5 == null) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13859a, "urls/appId/packageName is null in agconnect-services.json file", new Object[0]);
            try {
                String nameForUid = context.getPackageManager().getNameForUid(Process.myUid());
                if (com.huawei.hms.kit.awareness.barrier.internal.f.c.a(nameForUid)) {
                    com.huawei.hms.kit.awareness.b.a.c.d(f13859a, "cannot get uid for fast app", new Object[0]);
                    return;
                }
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(nameForUid, 128);
                Object obj = applicationInfo.metaData.get("com.huawei.hms.client.appid");
                if (obj == null) {
                    com.huawei.hms.kit.awareness.b.a.c.d(f13859a, "appid is null", new Object[0]);
                    return;
                }
                string2 = String.valueOf(obj);
                string = applicationInfo.metaData.getString("collector_url");
                string3 = applicationInfo.metaData.getString("packageName");
                string5 = applicationInfo.metaData.getString("region");
                string4 = "";
            } catch (PackageManager.NameNotFoundException unused) {
                com.huawei.hms.kit.awareness.b.a.c.d(f13859a, "cannot get pkgName for fast app", new Object[0]);
                return;
            }
        }
        if (!com.huawei.hms.kit.awareness.b.a.a.a(string5) || string3 == null || string2 == null) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13859a, "region/appId/packageName is null or invalid, region: {0}, appId: {1}, packageName: {2}", string5, string2, string3);
            return;
        }
        String str = string != null ? string : "";
        try {
            JSONObject jSONObject = new JSONObject("{}");
            this.f13861c = jSONObject;
            jSONObject.put(com.huawei.hms.kit.awareness.b.a.a.f13879b, str);
            this.f13861c.put("appId", string2);
            this.f13861c.put("packageName", string3);
            this.f13861c.put("sdkVersion", com.huawei.hms.kit.awareness.sdk.HHA.d);
            this.f13861c.put(com.huawei.hms.kit.awareness.b.a.a.g, string4);
            this.f13861c.put("region", string5);
        } catch (JSONException unused2) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13859a, "build mCfgStatusJson failed", new Object[0]);
            this.f13861c = null;
        }
    }

    private boolean c() {
        return this.f13861c != null;
    }

    static HHA a() {
        if (f13860b == null) {
            synchronized (HHA.class) {
                if (f13860b == null) {
                    f13860b = new HHA();
                }
            }
        }
        return f13860b;
    }

    HHA() {
    }
}
