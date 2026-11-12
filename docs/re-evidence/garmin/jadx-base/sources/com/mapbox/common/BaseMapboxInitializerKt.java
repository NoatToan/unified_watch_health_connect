package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\nH\u0002¨\u0006\u000b"}, d2 = {"gatherSystemInfo", "", "initializerData", "Lcom/mapbox/common/InitializerData;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "", "skipFurtherInitialization", "", "Ljava/lang/Class;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BaseMapboxInitializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String gatherSystemInfo(InitializerData initializerData, Context context, Throwable th3) {
        Object bVar;
        Object bVar2;
        ApplicationInfo applicationInfo;
        try {
            int i14 = q.f128596b;
            PackageManager packageManager = context.getPackageManager();
            bVar = packageManager != null ? Boolean.valueOf(packageManager.isInstantApp()) : null;
        } catch (Throwable th4) {
            int i15 = q.f128596b;
            bVar = new q.b(th4);
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 == null || (applicationInfo = packageManager2.getApplicationInfo(context.getPackageName(), 0)) == null) {
                bVar2 = null;
            } else {
                String[] list = new File(applicationInfo.nativeLibraryDir).list();
                bVar2 = list != null ? u.P(list, null, null, null, null, 63) : "";
            }
        } catch (Throwable th5) {
            int i16 = q.f128596b;
            bVar2 = new q.b(th5);
        }
        StringBuilder sb3 = new StringBuilder("Failed to initialize: Attempt=");
        sb3.append(initializerData.getCurrentInitAttempt());
        sb3.append(", exception=[");
        sb3.append(th3.getClass().getSimpleName());
        sb3.append("], initializer called ");
        sb3.append(SystemClock.elapsedRealtime() - initializerData.getFirstInitElapsedTimeMs());
        sb3.append(" ms ago, exception.message=[");
        sb3.append(th3.getMessage());
        sb3.append("], exception.cause=[");
        Throwable cause = th3.getCause();
        sb3.append(cause != null ? cause.getClass().getSimpleName() : null);
        sb3.append("], exception.cause.message=[");
        Throwable cause2 = th3.getCause();
        sb3.append(cause2 != null ? cause2.getMessage() : null);
        sb3.append("], extractedNativeLibs=[");
        if (bVar2 instanceof q.b) {
            bVar2 = null;
        }
        sb3.append((String) bVar2);
        sb3.append("], isInstantApp=[");
        sb3.append(bVar instanceof q.b ? null : bVar);
        sb3.append("], isMainThread=[");
        sb3.append(s.g(Looper.myLooper(), Looper.getMainLooper()));
        sb3.append(']');
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean skipFurtherInitialization(Class<?> cls) {
        InitializerData initializerData = BaseMapboxInitializer.INSTANCE.getInitializersMap().get(cls);
        if (initializerData != null) {
            return initializerData.getState() == InitializerState.SUCCESS || initializerData.getState() == InitializerState.IN_PROGRESS;
        }
        return false;
    }
}
