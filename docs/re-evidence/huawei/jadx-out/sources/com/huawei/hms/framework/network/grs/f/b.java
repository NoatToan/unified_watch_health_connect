package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, b> f13295b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f13296c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f13297a;

    public Set<String> b() {
        return this.f13297a.c();
    }

    public boolean a(Context context, String str) {
        boolean zD = this.f13297a.d(str);
        f13295b.put(context.getPackageName(), this);
        return zD;
    }

    public void a(String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        String str2;
        try {
            cVar.b(str + "#localConfig", this.f13297a.a().toString());
        } catch (JSONException unused) {
            str2 = "save local config encounter JSONException.";
            Logger.w("LocalManagerProxy", str2);
        } catch (Throwable th) {
            str2 = "save local config encounter Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.w("LocalManagerProxy", str2);
        }
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        Map<String, String> mapA;
        synchronized (f13296c) {
            mapA = this.f13297a.a(context, aVar, grsBaseInfo, str, z);
        }
        return mapA;
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        String strA;
        synchronized (f13296c) {
            strA = this.f13297a.a(context, aVar, grsBaseInfo, str, str2, z);
        }
        return strA;
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f13297a.b();
    }

    private void a(Context context, boolean z) {
        String[] strArrSplit;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = com.huawei.hms.framework.network.grs.h.c.a("grs_route_config_files_list.txt", context);
        Logger.i("LocalManagerProxy", "initLocalManager configFileListContent TimeCost:%d  Content:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), strA);
        if (TextUtils.isEmpty(strA)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            strArrSplit = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            Logger.i("LocalManagerProxy", "list by AssetsManager, timeCost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
        } else {
            strArrSplit = strA.split("#");
        }
        List<String> arrayList = strArrSplit == null ? new ArrayList<>() : Arrays.asList(strArrSplit);
        Logger.i("LocalManagerProxy", "initLocalManager localConfigs:" + arrayList.size());
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        this.f13297a = new d(false, z);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f13297a = new d(context, appConfigName, z);
        }
        if (!this.f13297a.d() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f13297a = new c(context, z);
        }
        this.f13297a.a(context, arrayList);
        StringBuilder sb = new StringBuilder("on initLocalManager finish, check appGrs: ");
        sb.append(this.f13297a.f13292a == null);
        Logger.i("LocalManagerProxy", sb.toString());
    }

    public static b a(String str) {
        return f13295b.get(str);
    }

    public b(Context context, boolean z) {
        a(context, z);
        f13295b.put(context.getPackageName(), this);
    }

    public b() {
        this.f13297a = new d(true, true);
    }
}
