package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzez {
    private final String a;
    private boolean b;
    private String c;
    public final /* synthetic */ w d;

    public zzez(w wVar, String str, String str2) {
        this.d = wVar;
        Preconditions.checkNotEmpty(str);
        this.a = str;
    }

    @WorkerThread
    public final String zza() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.b().getString(this.a, null);
        }
        return this.c;
    }

    @WorkerThread
    public final void zzb(String str) {
        SharedPreferences.Editor editorEdit = this.d.b().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.c = str;
    }
}
