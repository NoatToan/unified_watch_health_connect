package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes14.dex */
final class zzq implements Runnable {
    final /* synthetic */ SplitCompat zza;

    public zzq(SplitCompat splitCompat) {
        this.zza = splitCompat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zzc.zzk();
        } catch (Exception unused) {
        }
    }
}
