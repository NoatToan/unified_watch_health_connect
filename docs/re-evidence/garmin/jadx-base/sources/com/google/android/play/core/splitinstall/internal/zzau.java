package com.google.android.play.core.splitinstall.internal;

import com.nimbusds.jose.HeaderParameterNames;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
final class zzau implements zzan {
    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzat.zzd(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z14) {
        return zzat.zze(classLoader, file, file2, z14, new zzap(), HeaderParameterNames.COMPRESSION_ALGORITHM, new zzaq());
    }
}
