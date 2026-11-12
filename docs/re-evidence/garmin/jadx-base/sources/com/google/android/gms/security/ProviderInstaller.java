package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();
    private static Method zzc = null;
    private static boolean zzd = false;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i14, Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0039, B:15:0x003e, B:12:0x002b, B:17:0x0040, B:28:0x0084, B:29:0x0089, B:31:0x008b, B:32:0x0092, B:20:0x004b, B:22:0x0050, B:25:0x007a), top: B:37:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: all -> 0x0028, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0039, B:15:0x003e, B:12:0x002b, B:17:0x0040, B:28:0x0084, B:29:0x0089, B:31:0x008b, B:32:0x0092, B:20:0x004b, B:22:0x0050, B:25:0x007a), top: B:37:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x0028, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x001b, B:14:0x0039, B:15:0x003e, B:12:0x002b, B:17:0x0040, B:28:0x0084, B:29:0x0089, B:31:0x008b, B:32:0x0092, B:20:0x004b, B:22:0x0050, B:25:0x007a), top: B:37:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void installIfNeeded(Context context) {
        boolean z14;
        Context remoteContext;
        Context moduleContext;
        Preconditions.checkNotNull(context, "Context must not be null");
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (zzb) {
            Context context2 = null;
            if (zzd) {
                z14 = zzd;
                remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext == null) {
                    zzd = true;
                    if (!z14) {
                        zzj.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), zzi.zzb(Context.class, context), zzh.zza(jUptimeMillis), zzh.zza(SystemClock.uptimeMillis()));
                    }
                    context2 = remoteContext;
                }
                if (context2 != null) {
                    throw new GooglePlayServicesNotAvailableException(8);
                }
                zzb(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            }
            try {
                moduleContext = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            } catch (DynamiteModule.LoadingException e4) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e4.getMessage()));
                moduleContext = null;
            }
            if (moduleContext != null) {
                zzb(moduleContext, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z14 = zzd;
            remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                zzd = true;
                if (!z14) {
                    try {
                        zzj.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", remoteContext.getClassLoader(), zzi.zzb(Context.class, context), zzh.zza(jUptimeMillis), zzh.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e14) {
                        "Failed to report request stats: ".concat(e14.toString());
                    }
                }
                context2 = remoteContext;
            }
            if (context2 != null) {
                throw new GooglePlayServicesNotAvailableException(8);
            }
            zzb(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            return;
            throw th;
        }
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    private static void zzb(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e4) {
            Throwable cause = e4.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(String.valueOf(cause == null ? e4.toString() : cause.toString()));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
