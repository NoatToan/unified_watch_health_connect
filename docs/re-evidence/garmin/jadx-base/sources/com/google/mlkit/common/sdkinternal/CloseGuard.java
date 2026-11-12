package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzmm;
import com.google.android.gms.internal.mlkit_common.zzmn;
import com.google.android.gms.internal.mlkit_common.zzmv;
import com.google.android.gms.internal.mlkit_common.zzmw;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class CloseGuard implements Closeable {

    @KeepForSdk
    public static final int API_TRANSLATE = 1;
    private final AtomicBoolean zza = new AtomicBoolean();
    private final String zzb;
    private final Cleaner.Cleanable zzc;

    @KeepForSdk
    public static class Factory {
        private final Cleaner zza;

        public Factory(Cleaner cleaner) {
            this.zza = cleaner;
        }

        @KeepForSdk
        public CloseGuard create(Object obj, int i14, Runnable runnable) {
            return new CloseGuard(obj, i14, this.zza, runnable, zzss.zzb("common"));
        }
    }

    public CloseGuard(Object obj, final int i14, Cleaner cleaner, final Runnable runnable, final zzsh zzshVar) {
        this.zzb = obj.toString();
        this.zzc = cleaner.register(obj, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zze
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i14, zzshVar, runnable);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.set(true);
        this.zzc.clean();
    }

    public final /* synthetic */ void zza(int i14, zzsh zzshVar, Runnable runnable) {
        if (!this.zza.get()) {
            String str = this.zzb;
            Locale locale = Locale.ENGLISH;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" has not been closed");
            zzmw zzmwVar = new zzmw();
            zzmn zzmnVar = new zzmn();
            zzmnVar.zzb(zzmm.zzb(i14));
            zzmwVar.zzh(zzmnVar.zzc());
            zzshVar.zzd(zzsk.zzf(zzmwVar), zzmv.HANDLE_LEAKED);
        }
        runnable.run();
    }
}
