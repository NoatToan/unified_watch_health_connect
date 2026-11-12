package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes14.dex */
public final class zzka {
    static volatile Optional zza = Optional.absent();
    private static final Object zzb = new Object();

    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:12:0x002f, B:14:0x0037, B:15:0x0043, B:19:0x0047, B:21:0x0053, B:25:0x0063, B:27:0x0069, B:34:0x0084, B:35:0x008e, B:29:0x0073, B:30:0x0077, B:31:0x007d), top: B:41:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z14 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.isPresent()) {
            return ((Boolean) zza.get()).booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.isPresent()) {
                    return ((Boolean) zza.get()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                        try {
                            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                z14 = true;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                } else if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z14 = true;
                }
                zza = Optional.of(Boolean.valueOf(z14));
                return ((Boolean) zza.get()).booleanValue();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
