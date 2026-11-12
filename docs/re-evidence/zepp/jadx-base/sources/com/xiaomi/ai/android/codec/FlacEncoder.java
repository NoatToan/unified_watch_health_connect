package com.xiaomi.ai.android.codec;

import com.xiaomi.ai.log.Logger;

/* JADX INFO: loaded from: classes18.dex */
public class FlacEncoder {
    private long a;

    private native void native_delete(long j);

    private native byte[] native_flac_encode(long j, byte[] bArr, int i, int i2, int i3);

    private native long native_new();

    public boolean a() {
        b();
        long jNative_new = native_new();
        this.a = jNative_new;
        if (jNative_new != 0) {
            return true;
        }
        Logger.d("AudioEncoder", "init: failed to new native instance");
        return false;
    }

    public synchronized byte[] a(byte[] bArr, int i, int i2, int i3) {
        try {
            if (bArr == null) {
                Logger.d("AudioEncoder", "encode：data is null");
                return null;
            }
            long j = this.a;
            if (j == 0) {
                Logger.d("AudioEncoder", "encode：mNativeInstance==0");
                return null;
            }
            return native_flac_encode(j, bArr, i, i2, i3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        long j = this.a;
        if (j != 0) {
            native_delete(j);
            this.a = 0L;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.a;
        if (j != 0) {
            native_delete(j);
            this.a = 0L;
        }
    }
}
