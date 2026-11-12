package com.xiaomi.ai.android.codec;

import defpackage.wpe;

/* JADX INFO: loaded from: classes6.dex */
public class FlacEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10874a;

    private native void native_delete(long j);

    private native byte[] native_flac_encode(long j, byte[] bArr, int i, int i2, int i3);

    private native byte[] native_flac_encode_32bits(long j, byte[] bArr, int i, int i2, int i3);

    private native long native_new();

    public boolean a() {
        b();
        long jNative_new = native_new();
        this.f10874a = jNative_new;
        if (jNative_new != 0) {
            return true;
        }
        wpe.e("AudioEncoder", "init: failed to new native instance");
        return false;
    }

    public void b() {
        long j = this.f10874a;
        if (j != 0) {
            native_delete(j);
            this.f10874a = 0L;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.f10874a;
        if (j != 0) {
            native_delete(j);
            this.f10874a = 0L;
        }
    }

    public synchronized byte[] a(byte[] bArr, int i, int i2, int i3) {
        try {
            if (bArr == null) {
                wpe.e("AudioEncoder", "encode：data is null");
                return null;
            }
            long j = this.f10874a;
            if (j == 0) {
                wpe.e("AudioEncoder", "encode：mNativeInstance==0");
                return null;
            }
            if (i2 == 32) {
                return native_flac_encode_32bits(j, bArr, i, i2, i3);
            }
            return native_flac_encode(j, bArr, i, i2, i3);
        } catch (Throwable th) {
            throw th;
        }
    }
}
