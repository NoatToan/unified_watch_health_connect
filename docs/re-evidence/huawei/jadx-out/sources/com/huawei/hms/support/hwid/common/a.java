package com.huawei.hms.support.hwid.common;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f16607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, List<String>> f16608b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f16609c;

    private a() {
    }

    public static a a() {
        a aVar;
        synchronized (a.class) {
            if (f16607a == null) {
                f16607a = new a();
            }
            aVar = f16607a;
        }
        return aVar;
    }

    public void a(Context context) {
        this.f16609c = context;
    }

    public List<String> b() {
        return this.f16608b.get("packageNamesNotUseApk");
    }

    public void a(List<String> list) {
        this.f16608b.put("packageNamesNotUseApk", list);
    }
}
