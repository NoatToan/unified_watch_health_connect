package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzey {

    @VisibleForTesting
    public final String a;
    private final String b;
    private final String c;
    private final long d;
    public final /* synthetic */ w e;

    public /* synthetic */ zzey(w wVar, String str, long j, zzex zzexVar) {
        this.e = wVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    @WorkerThread
    private final long a() {
        return this.e.b().getLong(this.a, 0L);
    }

    @WorkerThread
    private final void b() {
        this.e.zzg();
        long jCurrentTimeMillis = this.e.zzs.zzav().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.e.b().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.c);
        editorEdit.putLong(this.a, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @WorkerThread
    public final Pair<String, Long> zza() {
        long jAbs;
        this.e.zzg();
        this.e.zzg();
        long jA = a();
        if (jA == 0) {
            b();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jA - this.e.zzs.zzav().currentTimeMillis());
        }
        long j = this.d;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > j + j) {
            b();
            return null;
        }
        String string = this.e.b().getString(this.c, null);
        long j2 = this.e.b().getLong(this.b, 0L);
        b();
        return (string == null || j2 <= 0) ? w.w : new Pair<>(string, Long.valueOf(j2));
    }

    @WorkerThread
    public final void zzb(String str, long j) {
        this.e.zzg();
        if (a() == 0) {
            b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.b().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = this.e.b().edit();
            editorEdit.putString(this.c, str);
            editorEdit.putLong(this.b, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.e.zzs.zzv().e().nextLong();
        long j3 = j2 + 1;
        long j4 = Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.e.b().edit();
        if ((jNextLong & Long.MAX_VALUE) < j4) {
            editorEdit2.putString(this.c, str);
        }
        editorEdit2.putLong(this.b, j3);
        editorEdit2.apply();
    }
}
