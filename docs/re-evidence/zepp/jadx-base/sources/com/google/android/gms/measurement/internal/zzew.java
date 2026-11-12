package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzew {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    public final /* synthetic */ w e;

    public zzew(w wVar, String str, long j) {
        this.e = wVar;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = j;
    }

    @WorkerThread
    public final long zza() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.b().getLong(this.a, this.b);
        }
        return this.d;
    }

    @WorkerThread
    public final void zzb(long j) {
        SharedPreferences.Editor editorEdit = this.e.b().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
