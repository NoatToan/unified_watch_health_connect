package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.secure.android.common.util.SafeBase64;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static final List q = Arrays.asList("com.tencent.mm.plugin.appbrand.ui.AppBrandUI%5Cd*", "com.alipay.mobile.nebulax.integration.mpaas.activity.NebulaActivity%5C%24Lite%5Cd*", "com.alipay.mobile.nebulax.xriver.activity.XRiverActivity%5C%24XRiverLite%5Cd*", "com.huawei.fastapp.app.processManager.RpkLoaderActivityEntry%5Cd*", "com.huawei.fastapp.app.processManager.PageLoaderActivityEntryPort%5Cd*", "com.tt.miniapphost.placeholder.MiniAppChildProcessMultiInsActivity%5Cd*", "com.minigame.miniapphost.placeholder.MiniGameActivity%5Cd*", "com.baidu.swan.apps.SwanAppActivity%5Cd*");
    public static volatile l r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11570a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11571b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11572c = true;
    public boolean d = true;
    public boolean e = true;
    public String f = "all";
    public long g = 10800000;
    public long h = 43200000;
    public long i = 10800000;
    public int j = 50;
    public long k = 600000;
    public int l = 15;
    public int m = 1000;
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();

    public l() {
        b();
    }

    public final void a(ArrayList arrayList) {
        this.n.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                this.n.add(Pattern.compile((String) arrayList.get(i)));
            } catch (Throwable th) {
                HiLog.i("DC", "initLiteAppPagePattern fail: " + th.getMessage());
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                String strA = c2.a("global_v2", "DcCfg");
                if (TextUtils.isEmpty(strA)) {
                    c();
                    return;
                }
                JSONObject jSONObject = new JSONObject(strA);
                this.f11570a = jSONObject.optBoolean("collectEnable", false);
                this.f11571b = jSONObject.optBoolean("appOpen", false);
                this.f11572c = jSONObject.optBoolean("liteApp", false);
                this.d = jSONObject.optBoolean("appUsage", false);
                jSONObject.optBoolean("locate", false);
                this.e = jSONObject.optBoolean("pageOpenV2", false);
                this.g = jSONObject.optLong("reportInterval", 10800000L);
                this.h = jSONObject.optLong("reloadInterval", 43200000L);
                this.i = jSONObject.optLong("hmsReportInterval", 10800000L);
                this.j = jSONObject.optInt("flushSize", 50);
                this.k = jSONObject.optLong("flushInterval", 600000L);
                this.l = jSONObject.optInt("randomBound", 15);
                this.f = jSONObject.optString("collectTag", "all");
                this.m = jSONObject.optInt("labelWaitTime", 1000);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("liteAppPages");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList.add(URLDecoder.decode(strOptString, "UTF-8"));
                        }
                    }
                    a(arrayList);
                }
                String strOptString2 = jSONObject.optString("pageSwitchListV2", "");
                if (!TextUtils.isEmpty(strOptString2)) {
                    this.o.clear();
                    this.o.addAll(a(strOptString2));
                }
                String strOptString3 = jSONObject.optString("pageSwitchBlack", "");
                if (!TextUtils.isEmpty(strOptString3)) {
                    this.p.clear();
                    this.p.addAll(a(strOptString3));
                }
            } catch (Throwable th) {
                HiLog.d("DC", "init fail " + th.getMessage());
                c();
            }
        }
    }

    public final void c() {
        this.f11570a = true;
        this.f11571b = true;
        this.f11572c = true;
        this.d = true;
        this.e = true;
        this.g = 10800000L;
        this.h = 43200000L;
        this.i = 10800000L;
        this.j = 50;
        this.k = 600000L;
        this.l = 15;
        this.f = "all";
        this.m = 1000;
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                List list = q;
                if (i >= list.size()) {
                    a(arrayList);
                    this.o.clear();
                    this.o.addAll(a("eJyVUltuGzEMvBHvkGwa1EANL5oa6V/Blbhr1nqBkuws0MOHWifpK47hH0EacYbkkCZ6qIFjSDhDTe3scb4xhQ9c5l9GvwsFQ6GA95BcnThANhgCCVSGW8z0oM/t6kxsHEfHgVrsIzpHZXMCusihr5Lpf+Yo6OkYZQ+YEmxXPU50Lzh5/b9Q2XFJ8YODpaeWciOW5DMG60jOlvgv6VTnrSjtLGfQviGXOsDjdzXsUyhyyTVtZmiaLcVNSov+EvrTguMBDOYdq6sKJc1PcGA6QndCuxfwrxzouA1MdSSyBZ9T0260DOucuhgKqtXyEalZ3N5rDvwFq9m9H+7jwI6WyQNm8KoLaz06TKXKu2W9UGLIXGgBSCaCzev7mla2gb+Szuej2g4kPM5s1XUNUNRWRRPmrLtklyZVUofVH+0do4vT1WIjh4kkCetg73/fux2Z/YXp/7kwXc0l+gf12tNVm8PJvK3ON8z7XuLTvF09Az04dh4="));
                    this.p.clear();
                    this.p.addAll(a("eJxLzs/VS8zJLEis1MvNT8rMSdXLS00qzUlMLCgoKMqvqNTLLEjW8zANKMpPTi0uDilKzCt2TC7JLMssqQQAqosXBQ=="));
                    return;
                }
                String str = (String) list.get(i);
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(URLDecoder.decode(str, "UTF-8"));
                }
                i++;
            }
        } catch (Throwable th) {
            HiLog.i("DC", "reset fail " + th.getMessage());
        }
    }

    public static l a() {
        if (r == null) {
            synchronized (l.class) {
                if (r == null) {
                    r = new l();
                }
            }
        }
        return r;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String strA = m.a(SafeBase64.decode(str, 0));
            if (!TextUtils.isEmpty(strA)) {
                for (String str2 : strA.split("\\|")) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return arrayList;
    }
}
