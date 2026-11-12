package com.huawei.hms.mlsdk.asr.energy.vo;

/* JADX INFO: loaded from: classes34.dex */
public class SampleBuffer {
    private byte[] buffer;
    private int capacity;
    private int size;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f14338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14339b;

        public final b a(byte[] bArr) {
            this.f14338a = (byte[]) bArr.clone();
            return this;
        }

        public final b a(int i) {
            this.f14339b = i;
            return this;
        }

        public final SampleBuffer a() {
            return new SampleBuffer(this.f14338a, this.f14339b, 0);
        }
    }

    public byte[] getBuffer() {
        byte[] bArr = this.buffer;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSize() {
        return this.size;
    }

    private SampleBuffer(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.capacity = i;
        this.size = i2;
    }
}
