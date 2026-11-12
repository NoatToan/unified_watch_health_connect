package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ApplicationVersionSignature {
    private static final String a = "AppVersionSignature";
    private static final ConcurrentMap<String, Key> b = new ConcurrentHashMap();

    private ApplicationVersionSignature() {
    }

    @Nullable
    private static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(a, "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    @NonNull
    private static String b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    private static Key c(@NonNull Context context) {
        return new ObjectKey(b(a(context)));
    }

    @VisibleForTesting
    public static void d() {
        b.clear();
    }

    @NonNull
    public static Key obtain(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, Key> concurrentMap = b;
        Key key = concurrentMap.get(packageName);
        if (key != null) {
            return key;
        }
        Key keyC = c(context);
        Key keyPutIfAbsent = concurrentMap.putIfAbsent(packageName, keyC);
        return keyPutIfAbsent == null ? keyC : keyPutIfAbsent;
    }
}
