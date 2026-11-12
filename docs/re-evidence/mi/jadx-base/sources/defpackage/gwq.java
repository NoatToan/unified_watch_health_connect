package defpackage;

import android.util.Rational;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class gwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rational f19410b;
    public int c;
    public int d;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rational f19412b;
        public final int c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19411a = 1;
        public int d = 0;

        public a(Rational rational, int i) {
            this.f19412b = rational;
            this.c = i;
        }

        public gwq a() {
            g6i.h(this.f19412b, "The crop aspect ratio must be set.");
            return new gwq(this.f19411a, this.f19412b, this.c, this.d);
        }

        public a b(int i) {
            this.d = i;
            return this;
        }

        public a c(int i) {
            this.f19411a = i;
            return this;
        }
    }

    public gwq(int i, Rational rational, int i2, int i3) {
        this.f19409a = i;
        this.f19410b = rational;
        this.c = i2;
        this.d = i3;
    }

    public Rational a() {
        return this.f19410b;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f19409a;
    }
}
