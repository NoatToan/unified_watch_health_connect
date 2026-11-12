package com.google.android.gms.internal.mlkit_vision_barcode;

import am.j;
import androidx.room.a0;
import com.google.maps.android.BuildConfig;
import i3.e5;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o2.c;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import r1.q2;
import sun.misc.Unsafe;
import v.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzdz<V> extends zzex implements zzet<V> {
    static final boolean zza;
    static final zzes zzb;
    private static final zza zzc;
    private static final Object zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzj waiters;

    abstract class zza {
        public /* synthetic */ zza(zzdy zzdyVar) {
        }

        public abstract zzd zza(zzdz zzdzVar, zzd zzdVar);

        public abstract zzj zzb(zzdz zzdzVar, zzj zzjVar);

        public abstract void zzc(zzj zzjVar, zzj zzjVar2);

        public abstract void zzd(zzj zzjVar, Thread thread);

        public abstract boolean zze(zzdz zzdzVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzdz zzdzVar, Object obj, Object obj2);

        public abstract boolean zzg(zzdz zzdzVar, zzj zzjVar, zzj zzjVar2);
    }

    final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzdz.zza) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z14, Throwable th3) {
            this.zzc = z14;
            this.zzd = th3;
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th3) {
            th3.getClass();
            this.zzb = th3;
        }
    }

    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzj, Thread> zza;
        final AtomicReferenceFieldUpdater<zzj, zzj> zzb;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, zzj> zzc;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzdz<?>, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzdzVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            return this.zzc.getAndSet(zzdzVar, zzjVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            this.zzb.lazySet(zzjVar, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            this.zza.lazySet(zzjVar, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zze(zzdz zzdzVar, zzd zzdVar, zzd zzdVar2) {
            return zzea.zza(this.zzd, zzdzVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzf(zzdz zzdzVar, Object obj, Object obj2) {
            return zzea.zza(this.zze, zzdzVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzg(zzdz zzdzVar, zzj zzjVar, zzj zzjVar2) {
            return zzea.zza(this.zzc, zzdzVar, zzjVar, zzjVar2);
        }
    }

    final class zzf<V> implements Runnable {
        final zzdz<V> zza;
        final zzet<? extends V> zzb;

        public zzf(zzdz zzdzVar, zzet zzetVar) {
            this.zza = zzdzVar;
            this.zzb = zzetVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzdz) this.zza).value != this) {
                return;
            }
            zzet<? extends V> zzetVar = this.zzb;
            if (zzdz.zzc.zzf(this.zza, this, zzdz.zzq(zzetVar))) {
                zzdz.zzv(this.zza, false);
            }
        }
    }

    interface zzh<V> extends zzet<V> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z14;
        Throwable th3;
        zza zzgVar;
        Throwable th4;
        try {
            z14 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", BooleanUtils.FALSE));
        } catch (SecurityException unused) {
            z14 = false;
        }
        zza = z14;
        zzb = new zzes(zzdz.class);
        Object[] objArr = 0;
        try {
            zzgVar = new zzi(null);
            th3 = null;
            th4 = null;
        } catch (Error | Exception e4) {
            try {
                th3 = null;
                th4 = e4;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzj.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzj.class, zzj.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzj.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdz.class, Object.class, "value"));
            } catch (Error | Exception e14) {
                th3 = e14;
                zzgVar = new zzg(objArr == true ? 1 : 0);
                th4 = e4;
            }
        }
        zzc = zzgVar;
        if (th3 != null) {
            zzes zzesVar = zzb;
            Logger loggerZza = zzesVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th4);
            zzesVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        zzd = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzq(zzet zzetVar) {
        Throwable thZzg;
        if (zzetVar instanceof zzh) {
            Object zzbVar = ((zzdz) zzetVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th3 = zzbVar2.zzd;
                    zzbVar = th3 != null ? new zzb(false, th3) : zzb.zzb;
                }
            }
            Objects.requireNonNull(zzbVar);
            return zzbVar;
        }
        if ((zzetVar instanceof zzex) && (thZzg = ((zzex) zzetVar).zzg()) != null) {
            return new zzc(thZzg);
        }
        boolean zIsCancelled = zzetVar.isCancelled();
        if ((!zza) && zIsCancelled) {
            zzb zzbVar3 = zzb.zzb;
            Objects.requireNonNull(zzbVar3);
            return zzbVar3;
        }
        try {
            Object objZzr = zzr(zzetVar);
            if (zIsCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzetVar))));
            }
            return objZzr == null ? zzd : objZzr;
        } catch (Error | Exception e4) {
            return new zzc(e4);
        } catch (CancellationException e14) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzetVar)), e14)) : new zzb(false, e14);
        } catch (ExecutionException e15) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzetVar)), e15)) : new zzc(e15.getCause());
        }
    }

    private static Object zzr(Future future) {
        Object obj;
        boolean z14 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzs(StringBuilder sb3) {
        try {
            Object objZzr = zzr(this);
            sb3.append("SUCCESS, result=[");
            if (objZzr == null) {
                sb3.append(BuildConfig.TRAVIS);
            } else if (objZzr == this) {
                sb3.append("this future");
            } else {
                sb3.append(objZzr.getClass().getName());
                sb3.append("@");
                sb3.append(Integer.toHexString(System.identityHashCode(objZzr)));
            }
            sb3.append("]");
        } catch (CancellationException unused) {
            sb3.append("CANCELLED");
        } catch (ExecutionException e4) {
            sb3.append("FAILURE, cause=[");
            sb3.append(e4.getCause());
            sb3.append("]");
        } catch (Exception e14) {
            sb3.append("UNKNOWN, cause=[");
            sb3.append(e14.getClass());
            sb3.append(" thrown from get()]");
        }
    }

    private final void zzt(StringBuilder sb3) {
        String strConcat;
        int length = sb3.length();
        sb3.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb3.append(", setFuture=[");
            zzu(sb3, ((zzf) obj).zzb);
            sb3.append("]");
        } else {
            try {
                strConcat = zzba.zza(zzf());
            } catch (Exception | StackOverflowError e4) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e4.getClass()));
            }
            if (strConcat != null) {
                j.y(sb3, ", info=[", strConcat, "]");
            }
        }
        if (isDone()) {
            sb3.delete(length, sb3.length());
            zzs(sb3);
        }
    }

    private final void zzu(StringBuilder sb3, Object obj) {
        try {
            if (obj == this) {
                sb3.append("this future");
            } else {
                sb3.append(obj);
            }
        } catch (Exception e4) {
            e = e4;
            sb3.append("Exception thrown from implementation: ");
            sb3.append(e.getClass());
        } catch (StackOverflowError e14) {
            e = e14;
            sb3.append("Exception thrown from implementation: ");
            sb3.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzv(zzdz zzdzVar, boolean z14) {
        zzd zzdVar = null;
        while (true) {
            for (zzj zzjVarZzb = zzc.zzb(zzdzVar, zzj.zza); zzjVarZzb != null; zzjVarZzb = zzjVarZzb.next) {
                Thread thread = zzjVarZzb.thread;
                if (thread != null) {
                    zzjVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzdzVar.zzm();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZza = zzc.zza(zzdzVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZza != null) {
                zzd zzdVar4 = zzdVarZza.next;
                zzdVarZza.next = zzdVar3;
                zzdVar3 = zzdVarZza;
                zzdVarZza = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzd zzdVar5 = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzdzVar = zzfVar.zza;
                    if (zzdzVar.value == zzfVar) {
                        if (zzc.zzf(zzdzVar, zzfVar, zzq(zzfVar.zzb))) {
                            zzdVar = zzdVar5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzw(runnable2, executor);
                }
                zzdVar3 = zzdVar5;
            }
            return;
        }
    }

    private static void zzw(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a0.j("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e4);
        }
    }

    private final void zzx(zzj zzjVar) {
        zzjVar.thread = null;
        while (true) {
            zzj zzjVar2 = this.waiters;
            if (zzjVar2 != zzj.zza) {
                zzj zzjVar3 = null;
                while (zzjVar2 != null) {
                    zzj zzjVar4 = zzjVar2.next;
                    if (zzjVar2.thread != null) {
                        zzjVar3 = zzjVar2;
                    } else if (zzjVar3 != null) {
                        zzjVar3.next = zzjVar4;
                        if (zzjVar3.thread == null) {
                        }
                    } else if (!zzc.zzg(this, zzjVar2, zzjVar4)) {
                    }
                    zzjVar2 = zzjVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzy(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th3 = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th3);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zza) {
            zzbVar = new zzb(z14, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z14 ? zzb.zza : zzb.zzb;
            Objects.requireNonNull(zzbVar);
        }
        zzdz<V> zzdzVar = this;
        boolean z15 = false;
        while (true) {
            if (zzc.zzf(zzdzVar, obj, zzbVar)) {
                zzv(zzdzVar, z14);
                if (obj instanceof zzf) {
                    zzet<? extends V> zzetVar = ((zzf) obj).zzb;
                    if (zzetVar instanceof zzh) {
                        zzdzVar = (zzdz) zzetVar;
                        obj = zzdzVar.value;
                        if (!(obj == null) && !(obj instanceof zzf)) {
                            return true;
                        }
                        z15 = true;
                    } else {
                        zzetVar.cancel(z14);
                    }
                }
                return true;
            }
            obj = zzdzVar.value;
            if (!(obj instanceof zzf)) {
                return z15;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z14 = true;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzy(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzj zzjVar = this.waiters;
            if (zzjVar != zzj.zza) {
                zzj zzjVar2 = new zzj();
                while (true) {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzjVar2, zzjVar);
                    if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzx(zzjVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzy(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzx(zzjVar2);
                        break;
                    }
                    zzjVar = this.waiters;
                    if (zzjVar == zzj.zza) {
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzy(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzy(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strU = h.u(j8, "Waited ", StringUtils.SPACE, timeUnit.toString().toLowerCase(locale));
        if (nanos + 1000 < 0) {
            String strConcat = strU.concat(" (plus ");
            long j14 = -nanos;
            long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z14 = false;
            }
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + StringUtils.SPACE + lowerCase;
                if (z14) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(StringUtils.SPACE);
            }
            if (z14) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            strU = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strU.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(e5.g(strU, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb3.append(getClass().getSimpleName());
        } else {
            sb3.append(getClass().getName());
        }
        sb3.append('@');
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("[status=");
        if (this.value instanceof zzb) {
            sb3.append("CANCELLED");
        } else if (isDone()) {
            zzs(sb3);
        } else {
            zzt(sb3);
        }
        sb3.append("]");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzf() {
        if (this instanceof ScheduledFuture) {
            return a0.f(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzex
    public final Throwable zzg() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzet
    public final void zzl(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzaz.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzw(runnable, executor);
    }

    public void zzm() {
    }

    public final boolean zzn(Throwable th3) {
        if (!zzc.zzf(this, null, new zzc(th3))) {
            return false;
        }
        zzv(this, false);
        return true;
    }

    public final boolean zzo(zzet zzetVar) {
        zzc zzcVar;
        zzetVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (zzetVar.isDone()) {
                if (!zzc.zzf(this, null, zzq(zzetVar))) {
                    return false;
                }
                zzv(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, zzetVar);
            if (zzc.zzf(this, null, zzfVar)) {
                try {
                    zzetVar.zzl(zzfVar, zzee.INSTANCE);
                } catch (Throwable th3) {
                    try {
                        zzcVar = new zzc(th3);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzc.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzetVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzp() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    final class zzg extends zza {
        public /* synthetic */ zzg(zzeb zzebVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzdzVar) {
                try {
                    zzdVar2 = zzdzVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzdzVar.listeners = zzdVar;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            zzj zzjVar2;
            synchronized (zzdzVar) {
                try {
                    zzjVar2 = zzdzVar.waiters;
                    if (zzjVar2 != zzjVar) {
                        zzdzVar.waiters = zzjVar;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            zzjVar.next = zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            zzjVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zze(zzdz zzdzVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.listeners != zzdVar) {
                        return false;
                    }
                    zzdzVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzf(zzdz zzdzVar, Object obj, Object obj2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.value != obj) {
                        return false;
                    }
                    zzdzVar.value = obj2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzg(zzdz zzdzVar, zzj zzjVar, zzj zzjVar2) {
            synchronized (zzdzVar) {
                try {
                    if (zzdzVar.waiters != zzjVar) {
                        return false;
                    }
                    zzdzVar.waiters = zzjVar2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        private zzg() {
            throw null;
        }
    }

    final class zzi extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzi.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws IllegalAccessException {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzdz.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzj.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzj.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e4) {
                    c.p(e4);
                }
            } catch (PrivilegedActionException e14) {
                q2.v("Could not initialize intrinsics", e14.getCause());
            }
        }

        public /* synthetic */ zzi(zzed zzedVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzd zza(zzdz zzdzVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzdzVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzdzVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final zzj zzb(zzdz zzdzVar, zzj zzjVar) {
            zzj zzjVar2;
            do {
                zzjVar2 = zzdzVar.waiters;
                if (zzjVar == zzjVar2) {
                    break;
                }
            } while (!zzg(zzdzVar, zzjVar2, zzjVar));
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzc(zzj zzjVar, zzj zzjVar2) {
            zza.putObject(zzjVar, zzf, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final void zzd(zzj zzjVar, Thread thread) {
            zza.putObject(zzjVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zze(zzdz zzdzVar, zzd zzdVar, zzd zzdVar2) {
            return zzec.zza(zza, zzdzVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzf(zzdz zzdzVar, Object obj, Object obj2) {
            return zzec.zza(zza, zzdzVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        public final boolean zzg(zzdz zzdzVar, zzj zzjVar, zzj zzjVar2) {
            return zzec.zza(zza, zzdzVar, zzc, zzjVar, zzjVar2);
        }

        private zzi() {
            throw null;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zzj {
        static final zzj zza = new zzj(false);
        volatile zzj next;
        volatile Thread thread;

        public zzj() {
            zzdz.zzc.zzd(this, Thread.currentThread());
        }

        public zzj(boolean z14) {
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                return zzy(obj2);
            }
            zzj zzjVar = this.waiters;
            if (zzjVar != zzj.zza) {
                zzj zzjVar2 = new zzj();
                do {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzjVar2, zzjVar);
                    if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzx(zzjVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzy(obj);
                    }
                    zzjVar = this.waiters;
                } while (zzjVar != zzj.zza);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzy(obj3);
        }
        throw new InterruptedException();
    }
}
