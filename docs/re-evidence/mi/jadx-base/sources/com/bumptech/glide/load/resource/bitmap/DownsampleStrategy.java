package com.bumptech.glide.load.resource.bitmap;

import defpackage.wbh;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DownsampleStrategy f6978a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DownsampleStrategy f6979b = new b();
    public static final DownsampleStrategy c = new e();
    public static final DownsampleStrategy d = new c();
    public static final DownsampleStrategy e;
    public static final DownsampleStrategy f;
    public static final DownsampleStrategy g;
    public static final wbh<DownsampleStrategy> h;
    public static final boolean i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    public static class a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public static class b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    public static class c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.c.a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.c.b(i, i2, i3, i4));
        }
    }

    public static class d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    public static class f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        d dVar = new d();
        e = dVar;
        f = new f();
        g = dVar;
        h = wbh.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        i = true;
    }

    public abstract SampleSizeRounding a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
