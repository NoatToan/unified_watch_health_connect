package com.google.android.gms.internal.mlkit_common;

import java.io.OutputStream;
import o2.c;

/* JADX INFO: loaded from: classes14.dex */
final class zzaz extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) {
        int length;
        int i16;
        if (i14 < 0 || i14 > (length = bArr.length) || i15 < 0 || (i16 = i14 + i15) > length || i16 < 0) {
            c.q();
        } else {
            this.zza += (long) i15;
        }
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i14) {
        this.zza++;
    }
}
