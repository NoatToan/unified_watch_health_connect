package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class xi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap<String, pzd> f39147a = new ConcurrentHashMap();

    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot resolve info for");
            sb.append(context.getPackageName());
            return null;
        }
    }

    public static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static pzd c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, pzd> concurrentMap = f39147a;
        pzd pzdVar = concurrentMap.get(packageName);
        if (pzdVar != null) {
            return pzdVar;
        }
        pzd pzdVarD = d(context);
        pzd pzdVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, pzdVarD);
        return pzdVarPutIfAbsent == null ? pzdVarD : pzdVarPutIfAbsent;
    }

    public static pzd d(Context context) {
        return new b4h(b(a(context)));
    }
}
