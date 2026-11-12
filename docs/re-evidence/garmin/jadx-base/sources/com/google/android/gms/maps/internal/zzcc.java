package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.maps.MapsInitializer;
import java.util.Objects;
import kg.f;

/* JADX INFO: loaded from: classes14.dex */
public final class zzcc {
    private static final String zza = "zzcc";

    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzf zzc;

    public static zzf zza(Context context, MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        Preconditions.checkNotNull(context);
        "preferredRenderer: ".concat(String.valueOf(renderer));
        zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (iIsGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
        zzf zzfVarZzd = zzd(context, renderer);
        zzc = zzfVarZzd;
        try {
            int iZzd = zzfVarZzd.zzd();
            String packageName = context.getPackageName();
            if (iZzd == 2 && !packageName.equals("com.google.android.apps.photos")) {
                try {
                    zzc.zzn(ObjectWrapper.wrap(zzc(context, renderer)));
                } catch (RemoteException e4) {
                    a.i(e4);
                    return null;
                } catch (UnsatisfiedLinkError unused) {
                    zzb = null;
                    zzc = zzd(context, MapsInitializer.Renderer.LEGACY);
                }
            }
            try {
                zzf zzfVar2 = zzc;
                Context contextZzc = zzc(context, renderer);
                Objects.requireNonNull(contextZzc);
                zzfVar2.zzl(ObjectWrapper.wrap(contextZzc.getResources()), 19020000);
                return zzc;
            } catch (RemoteException e14) {
                a.i(e14);
                return null;
            }
        } catch (RemoteException e15) {
            a.i(e15);
            return null;
        }
    }

    private static Context zzb(Exception exc, Context context) {
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    private static Context zzc(Context context, MapsInitializer.Renderer renderer) {
        Context contextZzb;
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        String str = renderer == MapsInitializer.Renderer.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        } catch (Exception e4) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                contextZzb = zzb(e4, context);
            } else {
                try {
                    contextZzb = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
                } catch (Exception e14) {
                    contextZzb = zzb(e14, context);
                }
            }
        }
        zzb = contextZzb;
        if (contextZzb != null) {
            return contextZzb;
        }
        f.n("Unable to load maps module, maps container context is null");
        return null;
    }

    private static zzf zzd(Context context, MapsInitializer.Renderer renderer) {
        try {
            IBinder iBinder = (IBinder) zze(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                return iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zze(iBinder);
            }
            f.n("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            return null;
        } catch (ClassNotFoundException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e4);
            return null;
        }
    }

    private static Object zze(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Unable to call the default constructor of ".concat(cls.getName()), e4);
            return null;
        } catch (InstantiationException e14) {
            com.airbnb.lottie.animation.keyframe.a.x("Unable to instantiate the dynamic class ".concat(cls.getName()), e14);
            return null;
        }
    }
}
