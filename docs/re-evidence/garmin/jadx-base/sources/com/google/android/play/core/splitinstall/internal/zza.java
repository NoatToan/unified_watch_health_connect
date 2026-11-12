package com.google.android.play.core.splitinstall.internal;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes14.dex */
final class zza implements zzb {
    private final ByteBuffer zza;

    public zza(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final void zzb(MessageDigest[] messageDigestArr, long j8, int i14) {
        ByteBuffer byteBufferSlice;
        synchronized (this.zza) {
            int i15 = (int) j8;
            this.zza.position(i15);
            this.zza.limit(i15 + i14);
            byteBufferSlice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
