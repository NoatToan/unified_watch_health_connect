package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MlKitContext {
    private static final Object zza = new Object();
    private static MlKitContext zzb;
    private ComponentRuntime zzc;

    private MlKitContext() {
    }

    @KeepForSdk
    public static MlKitContext getInstance() {
        MlKitContext mlKitContext;
        synchronized (zza) {
            Preconditions.checkState(zzb != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) Preconditions.checkNotNull(zzb);
        }
        return mlKitContext;
    }

    @KeepForSdk
    public static MlKitContext initialize(Context context, List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            try {
                Preconditions.checkState(zzb == null, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                zzb = mlKitContext2;
                Context contextZzc = zzc(context);
                HashMap map = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    map.put(componentRegistrar.getClass(), componentRegistrar);
                }
                ComponentRuntime componentRuntime = new ComponentRuntime(TaskExecutors.MAIN_THREAD, new ArrayList(map.values()), Component.of(contextZzc, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0]), Component.of(mlKitContext2, (Class<MlKitContext>) MlKitContext.class, (Class<? super MlKitContext>[]) new Class[0]));
                mlKitContext2.zzc = componentRuntime;
                componentRuntime.initializeEagerComponents(true);
                mlKitContext = zzb;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return mlKitContext;
    }

    @KeepForSdk
    public static MlKitContext initializeIfNeeded(Context context) {
        MlKitContext mlKitContextZza;
        synchronized (zza) {
            mlKitContextZza = zzb;
            if (mlKitContextZza == null) {
                mlKitContextZza = zza(context);
            }
        }
        return mlKitContextZza;
    }

    public static MlKitContext zza(Context context) {
        MlKitContext mlKitContextZzb;
        synchronized (zza) {
            mlKitContextZzb = zzb(context, TaskExecutors.MAIN_THREAD);
        }
        return mlKitContextZzb;
    }

    public static MlKitContext zzb(Context context, Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            Preconditions.checkState(zzb == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context contextZzc = zzc(context);
            ComponentRuntime componentRuntimeBuild = ComponentRuntime.builder(executor).addLazyComponentRegistrars(ComponentDiscovery.forContext(contextZzc, MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(Component.of(contextZzc, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(mlKitContext2, (Class<MlKitContext>) MlKitContext.class, (Class<? super MlKitContext>[]) new Class[0])).build();
            mlKitContext2.zzc = componentRuntimeBuild;
            componentRuntimeBuild.initializeEagerComponents(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    private static Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        Preconditions.checkState(zzb == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.zzc);
        return (T) this.zzc.get(cls);
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    @KeepForSdk
    public static MlKitContext initializeIfNeeded(Context context, List<ComponentRegistrar> list) {
        MlKitContext mlKitContextInitialize;
        synchronized (zza) {
            mlKitContextInitialize = zzb;
            if (mlKitContextInitialize == null) {
                mlKitContextInitialize = initialize(context, list);
            }
        }
        return mlKitContextInitialize;
    }

    @KeepForSdk
    public static MlKitContext initializeIfNeeded(Context context, Executor executor) {
        MlKitContext mlKitContextZzb;
        synchronized (zza) {
            mlKitContextZzb = zzb;
            if (mlKitContextZzb == null) {
                mlKitContextZzb = zzb(context, executor);
            }
        }
        return mlKitContextZzb;
    }
}
