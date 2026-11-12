package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class PreFillType {

    @VisibleForTesting
    public static final Bitmap.Config e = Bitmap.Config.RGB_565;
    private final int a;
    private final int b;
    private final Bitmap.Config c;
    private final int d;

    public static class Builder {
        private final int a;
        private final int b;
        private Bitmap.Config c;
        private int d;

        public Builder(int i) {
            this(i, i);
        }

        public PreFillType a() {
            return new PreFillType(this.a, this.b, this.c, this.d);
        }

        public Bitmap.Config b() {
            return this.c;
        }

        public Builder setConfig(@Nullable Bitmap.Config config) {
            this.c = config;
            return this;
        }

        public Builder setWeight(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.d = i;
            return this;
        }

        public Builder(int i, int i2) {
            this.d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i2 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.a = i;
            this.b = i2;
        }
    }

    public PreFillType(int i, int i2, Bitmap.Config config, int i3) {
        this.c = (Bitmap.Config) Preconditions.checkNotNull(config, "Config must not be null");
        this.a = i;
        this.b = i2;
        this.d = i3;
    }

    public Bitmap.Config a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PreFillType)) {
            return false;
        }
        PreFillType preFillType = (PreFillType) obj;
        return this.b == preFillType.b && this.a == preFillType.a && this.d == preFillType.d && this.c == preFillType.c;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.a + ", height=" + this.b + ", config=" + this.c + ", weight=" + this.d + '}';
    }
}
