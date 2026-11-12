package com.google.android.play.core.splitinstall.internal;

import com.nimbusds.jose.HeaderParameterNames;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
final class zzba implements zzan {
    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzay.zzc(classLoader, set, new zzaw());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z14) {
        return zzay.zzd(classLoader, file, file2, z14, HeaderParameterNames.COMPRESSION_ALGORITHM);
    }
}
