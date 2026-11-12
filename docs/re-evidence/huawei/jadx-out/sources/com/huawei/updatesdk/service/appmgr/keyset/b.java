package com.huawei.updatesdk.service.appmgr.keyset;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.huawei.updatesdk.sdk.foundation.utils.h;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, com.huawei.updatesdk.service.appmgr.keyset.a> f29937a;

    public List<String> a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || applicationInfo.sourceDir == null) {
            return null;
        }
        long jLastModified = new File(packageInfo.applicationInfo.sourceDir).lastModified();
        com.huawei.updatesdk.service.appmgr.keyset.a aVar = a().f29937a.get(packageInfo.packageName);
        if (aVar == null || aVar.b() != jLastModified) {
            return b(packageInfo);
        }
        if (aVar.a() == null) {
            return null;
        }
        return aVar.a().a();
    }

    private static ArrayList<String> b(PackageInfo packageInfo) {
        ArraySet<String> arraySet;
        com.huawei.updatesdk.service.appmgr.keyset.a aVar = new com.huawei.updatesdk.service.appmgr.keyset.a();
        aVar.a(packageInfo.packageName);
        File file = new File(packageInfo.applicationInfo.sourceDir);
        if (!file.exists()) {
            return null;
        }
        aVar.a(file.lastModified());
        c.a aVarA = c.a(file);
        ArrayMap<String, ArraySet<PublicKey>> arrayMap = aVarA.f29939a;
        if (arrayMap == null || arrayMap.isEmpty() || (arraySet = aVarA.f29940b) == null || arraySet.isEmpty()) {
            a(aVar);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, ArraySet<PublicKey>> entry : aVarA.f29939a.entrySet()) {
            if (aVarA.f29940b.contains(entry.getKey())) {
                Iterator<PublicKey> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(h.a(it.next().getEncoded()));
                }
            }
        }
        com.huawei.updatesdk.service.appmgr.keyset.a.C0293a c0293a = new com.huawei.updatesdk.service.appmgr.keyset.a.C0293a();
        c0293a.a(arrayList);
        aVar.a(c0293a);
        a(aVar);
        return arrayList;
    }

    private static void a(com.huawei.updatesdk.service.appmgr.keyset.a aVar) {
        a().f29937a.put(aVar.c(), aVar);
    }

    /* JADX INFO: renamed from: com.huawei.updatesdk.service.appmgr.keyset.b$b, reason: collision with other inner class name */
    static class C0294b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f29938a = new b();
    }

    public static b a() {
        return C0294b.f29938a;
    }

    private b() {
        this.f29937a = new HashMap();
    }
}
