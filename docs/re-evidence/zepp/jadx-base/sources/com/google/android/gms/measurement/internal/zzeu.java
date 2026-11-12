package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeu {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    public final /* synthetic */ w e;

    public zzeu(w wVar, String str, boolean z) {
        this.e = wVar;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.b().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }

    @WorkerThread
    public final boolean zzb() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.b().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
