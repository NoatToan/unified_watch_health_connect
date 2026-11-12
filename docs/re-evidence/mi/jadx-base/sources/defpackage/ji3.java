package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.UseCaseConfigFactory;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ji3 {
    public static final Object o = new Object();

    @GuardedBy("MIN_LOG_LEVEL_LOCK")
    public static final SparseArray<Integer> p = new SparseArray<>();
    public final ki3 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public ah3 g;
    public vg3 h;
    public UseCaseConfigFactory i;
    public Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lhe<Void> f22825k;
    public final Integer n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th3 f22823a = new th3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22824b = new Object();

    @GuardedBy("mInitializeLock")
    public a l = a.UNINITIALIZED;

    @GuardedBy("mInitializeLock")
    public lhe<Void> m = oua.h(null);

    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ji3(Context context, ki3.b bVar) {
        if (bVar != null) {
            this.c = bVar.getCameraXConfig();
        } else {
            ki3.b bVarF = f(context);
            if (bVarF == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.c = bVarF.getCameraXConfig();
        }
        Executor executorL = this.c.L(null);
        Handler handlerO = this.c.O(null);
        this.d = executorL == null ? new zg3() : executorL;
        if (handlerO == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f = handlerThread;
            handlerThread.start();
            this.e = ikb.a(handlerThread.getLooper());
        } else {
            this.f = null;
            this.e = handlerO;
        }
        Integer num = (Integer) this.c.d(ki3.F, null);
        this.n = num;
        i(num);
        this.f22825k = k(context);
    }

    public static ki3.b f(Context context) {
        ComponentCallbacks2 componentCallbacks2B = vi4.b(context);
        if (componentCallbacks2B instanceof ki3.b) {
            return (ki3.b) componentCallbacks2B;
        }
        try {
            Context contextA = vi4.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (ki3.b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            zpe.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            zpe.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            zpe.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            zpe.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            zpe.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            zpe.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            zpe.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            zpe.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public static void i(Integer num) {
        synchronized (o) {
            try {
                if (num == null) {
                    return;
                }
                g6i.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = p;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("MIN_LOG_LEVEL_LOCK")
    public static void p() {
        SparseArray<Integer> sparseArray = p;
        if (sparseArray.size() == 0) {
            zpe.h();
            return;
        }
        if (sparseArray.get(3) != null) {
            zpe.i(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            zpe.i(4);
        } else if (sparseArray.get(5) != null) {
            zpe.i(5);
        } else if (sparseArray.get(6) != null) {
            zpe.i(6);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public vg3 d() {
        vg3 vg3Var = this.h;
        if (vg3Var != null) {
            return vg3Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public th3 e() {
        return this.f22823a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory g() {
        UseCaseConfigFactory useCaseConfigFactory = this.i;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public lhe<Void> h() {
        return this.f22825k;
    }

    public final void j(final Executor executor, final long j, final Context context, final cb3.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: hi3
            @Override // java.lang.Runnable
            public final void run() {
                this.f20087a.m(context, executor, aVar, j);
            }
        });
    }

    public final lhe<Void> k(final Context context) {
        lhe<Void> lheVarA;
        synchronized (this.f22824b) {
            g6i.j(this.l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.l = a.INITIALIZING;
            lheVarA = cb3.a(new cb3.c() { // from class: gi3
                @Override // cb3.c
                public final Object a(cb3.a aVar) {
                    return this.f19017a.n(context, aVar);
                }
            });
        }
        return lheVarA;
    }

    public final /* synthetic */ void l(Executor executor, long j, cb3.a aVar) {
        j(executor, j, this.j, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00b7, please report this as an issue */
    public final /* synthetic */ void m(Context context, final Executor executor, final cb3.a aVar, final long j) {
        try {
            Application applicationB = vi4.b(context);
            this.j = applicationB;
            if (applicationB == null) {
                this.j = vi4.a(context);
            }
            ah3.a aVarM = this.c.M(null);
            if (aVarM == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            ai3 ai3VarA = ai3.a(this.d, this.e);
            xh3 xh3VarK = this.c.K(null);
            this.g = aVarM.a(this.j, ai3VarA, xh3VarK);
            vg3.a aVarN = this.c.N(null);
            if (aVarN == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            this.h = aVarN.a(this.j, this.g.c(), this.g.b());
            UseCaseConfigFactory.b bVarP = this.c.P(null);
            if (bVarP == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            this.i = bVarP.a(this.j);
            if (executor instanceof zg3) {
                ((zg3) executor).c(this.g);
            }
            this.f22823a.b(this.g);
            CameraValidator.a(this.j, this.f22823a, xh3VarK);
            o();
            aVar.c(null);
        } catch (InitializationException e) {
            e = e;
            if (SystemClock.elapsedRealtime() - j < 2500) {
                zpe.l("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                ikb.b(this.e, new Runnable() { // from class: ii3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21164a.l(executor, j, aVar);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f22824b) {
                this.l = a.INITIALIZING_ERROR;
            }
            if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                zpe.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.c(null);
            } else if (e instanceof InitializationException) {
                aVar.f(e);
            } else {
                aVar.f(new InitializationException(e));
            }
        } catch (CameraValidator.CameraIdListIncorrectException e2) {
            e = e2;
            if (SystemClock.elapsedRealtime() - j < 2500) {
                zpe.l("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                ikb.b(this.e, new Runnable() { // from class: ii3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21164a.l(executor, j, aVar);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f22824b) {
                this.l = a.INITIALIZING_ERROR;
                if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                    zpe.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    aVar.c(null);
                } else if (e instanceof InitializationException) {
                    aVar.f(e);
                } else {
                    aVar.f(new InitializationException(e));
                }
            }
        } catch (RuntimeException e3) {
            e = e3;
            if (SystemClock.elapsedRealtime() - j < 2500) {
                zpe.l("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                ikb.b(this.e, new Runnable() { // from class: ii3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21164a.l(executor, j, aVar);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f22824b) {
                this.l = a.INITIALIZING_ERROR;
                if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                    zpe.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    aVar.c(null);
                } else if (e instanceof InitializationException) {
                    aVar.f(e);
                } else {
                    aVar.f(new InitializationException(e));
                }
            }
        }
    }

    public final /* synthetic */ Object n(Context context, cb3.a aVar) throws Exception {
        j(this.d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    public final void o() {
        synchronized (this.f22824b) {
            this.l = a.INITIALIZED;
        }
    }
}
