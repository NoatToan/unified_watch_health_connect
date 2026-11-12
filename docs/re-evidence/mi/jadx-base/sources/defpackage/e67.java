package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class e67 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16306b;
    public BlurMaskFilter.Blur c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e67 f16307a;

        public a(float f) {
            this.f16307a = new e67(f);
        }

        public e67 a() {
            return this.f16307a;
        }

        public a b(int i, int i2) {
            e67 e67Var = this.f16307a;
            e67Var.f16305a = i;
            e67Var.f16306b = i2;
            return this;
        }

        public a c(float f) {
            this.f16307a.g = f;
            return this;
        }

        public a d(int i) {
            this.f16307a.e = i;
            return this;
        }

        public a e(int i) {
            this.f16307a.f = i;
            return this;
        }
    }

    public e67(float f) {
        this(f, BlurMaskFilter.Blur.NORMAL);
    }

    public e67(float f, BlurMaskFilter.Blur blur) {
        this(Color.parseColor("#0D000000"), Color.parseColor("#0DFFFFFF"), 0.0f, 0.0f, f, blur);
    }

    public e67(int i, int i2, float f, float f2, float f3, BlurMaskFilter.Blur blur) {
        this.g = 1.0f;
        this.h = true;
        this.f16305a = i;
        this.f16306b = i2;
        this.e = f;
        this.f = f2;
        this.d = f3;
        this.c = blur;
    }
}
