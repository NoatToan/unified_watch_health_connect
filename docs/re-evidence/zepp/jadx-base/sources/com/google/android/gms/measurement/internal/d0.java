package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
final class d0<V> extends FutureTask<V> implements Comparable<d0<V>> {
    private final long a;
    public final boolean b;
    private final String c;
    public final /* synthetic */ zzfs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(zzfs zzfsVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = zzfsVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfs.k.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfsVar.zzs.zzay().zzd().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        d0 d0Var = (d0) obj;
        boolean z = this.b;
        if (z != d0Var.b) {
            return !z ? 1 : -1;
        }
        long j = this.a;
        long j2 = d0Var.a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.d.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.d.zzs.zzay().zzd().zzb(this.c, th);
        if ((th instanceof b0) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(zzfs zzfsVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.d = zzfsVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzfs.k.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfsVar.zzs.zzay().zzd().zza("Tasks index overflow");
        }
    }
}
