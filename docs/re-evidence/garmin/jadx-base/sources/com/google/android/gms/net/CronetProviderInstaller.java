package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes14.dex */
public class CronetProviderInstaller {
    public static final String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final String zza = "CronetProviderInstaller";
    private static final GoogleApiAvailabilityLight zzb = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzc = new Object();
    private static DynamiteModule zzd = null;
    private static String zze = "0";

    private CronetProviderInstaller() {
    }

    public static Task<Void> installProvider(final Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (isInstalled()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new Runnable() { // from class: com.google.android.gms.net.zza
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    CronetProviderInstaller.zzc(context2);
                    taskCompletionSource2.setResult(null);
                } catch (Exception e4) {
                    taskCompletionSource2.setException(e4);
                }
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    public static boolean isInstalled() {
        return zza() != null;
    }

    public static DynamiteModule zza() {
        DynamiteModule dynamiteModule;
        synchronized (zzc) {
            dynamiteModule = zzd;
        }
        return dynamiteModule;
    }

    public static String zzb() {
        String str;
        synchronized (zzc) {
            str = zze;
        }
        return str;
    }

    @ShowFirstParty
    @Deprecated
    public static void zzc(Context context) {
        synchronized (zzc) {
            try {
                if (isInstalled()) {
                    return;
                }
                Preconditions.checkNotNull(context, "Context must not be null");
                try {
                    ((ClassLoader) Preconditions.checkNotNull(CronetProviderInstaller.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = zzb;
                    googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                    try {
                        DynamiteModule dynamiteModuleLoad = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = dynamiteModuleLoad.getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                                throw new GooglePlayServicesNotAvailableException(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            int iIntValue = ((Integer) Preconditions.checkNotNull((Integer) method.invoke(null, null))).intValue();
                            zze = (String) Preconditions.checkNotNull((String) method2.invoke(null, null));
                            if (apiLevel <= iIntValue) {
                                zzd = dynamiteModuleLoad;
                                return;
                            }
                            Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr");
                            if (errorResolutionIntent == null) {
                                throw new GooglePlayServicesNotAvailableException(2);
                            }
                            String str = zze;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 174);
                            sb3.append("Google Play Services update is required. The API Level of the client is ");
                            sb3.append(apiLevel);
                            sb3.append(". The API Level of the implementation is ");
                            sb3.append(iIntValue);
                            sb3.append(". The Cronet implementation version is ");
                            sb3.append(str);
                            throw new GooglePlayServicesRepairableException(2, sb3.toString(), errorResolutionIntent);
                        } catch (Exception e4) {
                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e4));
                        }
                    } catch (DynamiteModule.LoadingException e14) {
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e14));
                    }
                } catch (ClassNotFoundException e15) {
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e15));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
