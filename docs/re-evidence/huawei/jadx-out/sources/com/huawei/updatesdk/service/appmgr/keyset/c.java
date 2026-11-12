package com.huawei.updatesdk.service.appmgr.keyset;

import android.util.ArrayMap;
import android.util.ArraySet;
import java.io.File;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes20.dex */
class c {
    private static Object b(File file) {
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            return cls.getDeclaredMethod("parsePackage", File.class, Integer.TYPE).invoke(cls.newInstance(), file, 0);
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("KeySetsUtils", "can not get PackageParser: " + th.getMessage());
            return null;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayMap<String, ArraySet<PublicKey>> f29939a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArraySet<String> f29940b = null;

        a() {
        }
    }

    private static Object a(Object obj, String str) {
        try {
            return Class.forName("android.content.pm.PackageParser$Package").getDeclaredField(str).get(obj);
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("KeySetsUtils", "can not find class: " + th.getMessage());
            return null;
        }
    }

    static a a(File file) {
        a aVar = new a();
        Object objB = b(file);
        if (objB != null) {
            Object objA = a(objB, "mKeySetMapping");
            if (objA instanceof ArrayMap) {
                aVar.f29939a = (ArrayMap) objA;
            }
            Object objA2 = a(objB, "mUpgradeKeySets");
            if (objA2 instanceof ArraySet) {
                aVar.f29940b = (ArraySet) objA2;
            }
        }
        return aVar;
    }
}
