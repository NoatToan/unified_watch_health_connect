package com.xiaomi.ai.android.vad;

import defpackage.wpe;

/* JADX INFO: loaded from: classes6.dex */
public class Vad implements IVad {
    public static final int MAX_VAD_CHECK_SIZE = 16000;
    public static final int MIN_VAD_CHECK_SIZE = 8000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10989b;
    private boolean c;
    private boolean d;
    private byte[] e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10990k;

    public Vad() {
        this.h = 600;
        this.i = 200;
        this.j = 4.0f;
        this.e = new byte[16000];
    }

    private native void native_delete(long j);

    private native long native_new();

    private native int native_vadCheckBegin(long j, byte[] bArr, int i, int i2);

    private native int native_vadCheckEnd(long j, byte[] bArr, int i, int i2);

    private native int native_vadInit(long j, int i, int i2, float f);

    private native int native_vadUnInit(long j);

    @Override // com.xiaomi.ai.android.vad.IVad
    public synchronized boolean checkVad(byte[] bArr) {
        if (!this.f10990k) {
            wpe.e("Vad", "checkVad: mAvailable=" + this.f10990k);
            return false;
        }
        if (bArr == null) {
            return false;
        }
        if (bArr.length > 16000) {
            this.g = 0;
            return false;
        }
        int i = this.g;
        int length = bArr.length + i;
        if (length > 16000) {
            System.arraycopy(bArr, 0, this.e, 0, bArr.length);
            this.g = bArr.length;
            return false;
        }
        System.arraycopy(bArr, 0, this.e, i, bArr.length);
        this.g = length;
        if (length <= 8000) {
            return false;
        }
        boolean zIsSpeak = isSpeak(this.e, length);
        this.g = 0;
        if (zIsSpeak || !this.f) {
            this.f = zIsSpeak;
            return false;
        }
        this.f = false;
        return true;
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j = this.f10988a;
        if (j != 0) {
            native_vadUnInit(j);
            native_delete(this.f10988a);
            this.f10988a = 0L;
        }
    }

    @Override // com.xiaomi.ai.android.vad.IVad
    public boolean init() {
        return init(this.h, this.i, this.j);
    }

    public boolean isSpeak(byte[] bArr, int i) {
        if (i < 8000 || i > 16000) {
            throw new IllegalArgumentException("buffer length must more than 8k bytes and less than 16k bytes");
        }
        if (!this.f10990k) {
            wpe.e("Vad", "isSpeak: mAvailable=" + this.f10990k);
            return false;
        }
        if (!this.d) {
            int i2 = this.f10989b + 1;
            this.f10989b = i2;
            if (!this.c) {
                if (native_vadCheckBegin(this.f10988a, bArr, i, i2 == 1 ? 0 : 1) >= 0) {
                    this.c = true;
                }
            } else if (native_vadCheckEnd(this.f10988a, bArr, i, 1) >= 0) {
                this.c = false;
                this.d = true;
            }
        }
        return this.c;
    }

    @Override // com.xiaomi.ai.android.vad.IVad
    public void release() {
        this.d = false;
        this.c = false;
        this.f10989b = 0;
        this.g = 0;
        this.f = false;
        long j = this.f10988a;
        if (j != 0) {
            native_vadUnInit(j);
            native_delete(this.f10988a);
            this.f10988a = 0L;
        }
        this.f10990k = false;
    }

    public Vad(int i, int i2, float f) {
        this.e = new byte[16000];
        this.h = i;
        this.i = i2;
        this.j = f;
    }

    public boolean init(int i, int i2, float f) {
        release();
        long jNative_new = native_new();
        this.f10988a = jNative_new;
        if (jNative_new == 0) {
            wpe.e("Vad", "init: failed to new native instance");
            return false;
        }
        if (native_vadInit(jNative_new, i, i2, f) == 0) {
            this.f10990k = true;
            return true;
        }
        wpe.e("Vad", "init: failed to init native vad");
        release();
        return false;
    }
}
