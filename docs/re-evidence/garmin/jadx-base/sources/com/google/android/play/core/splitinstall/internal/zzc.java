package com.google.android.play.core.splitinstall.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes14.dex */
final class zzc implements zzb {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzc(FileChannel fileChannel, long j8, long j14) {
        this.zza = fileChannel;
        this.zzb = j8;
        this.zzc = j14;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final void zzb(MessageDigest[] messageDigestArr, long j8, int i14) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j8, i14);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
