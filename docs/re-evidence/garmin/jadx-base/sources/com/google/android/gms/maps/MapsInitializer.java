package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes14.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    public static synchronized int initialize(Context context, Renderer renderer, OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        Preconditions.checkNotNull(context, "Context is null");
        "preferredRenderer: ".concat(String.valueOf(renderer));
        if (!zzb) {
            try {
                com.google.android.gms.maps.internal.zzf zzfVarZza = zzcc.zza(context, renderer);
                try {
                    CameraUpdateFactory.zza(zzfVarZza.zze());
                    BitmapDescriptorFactory.zza(zzfVarZza.zzj());
                    int i14 = 1;
                    zzb = true;
                    if (renderer == null) {
                        i14 = 0;
                    } else {
                        int iOrdinal = renderer.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                i14 = 0;
                            } else {
                                i14 = 2;
                            }
                        }
                    }
                    try {
                        if (zzfVarZza.zzd() == 2) {
                            zzc = Renderer.LATEST;
                        }
                        zzfVarZza.zzm(ObjectWrapper.wrap(context), i14);
                    } catch (RemoteException unused) {
                    }
                    "loadedRenderer: ".concat(String.valueOf(zzc));
                    if (onMapsSdkInitializedCallback != null) {
                        onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                    }
                } catch (RemoteException e4) {
                    throw new RuntimeRemoteException(e4);
                }
            } catch (GooglePlayServicesNotAvailableException e14) {
                return e14.errorCode;
            }
        } else if (onMapsSdkInitializedCallback != null) {
            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
        }
        return 0;
    }

    public static synchronized int initialize(Context context) {
        return initialize(context, null, null);
    }
}
