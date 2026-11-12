package defpackage;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
public final class nm1 {
    public static final nm1 f = new b().a();
    public static final j63<nm1> g = new ph8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28057b;
    public final int c;
    public final int d;
    public AudioAttributes e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28058a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28059b = 0;
        public int c = 1;
        public int d = 1;

        public nm1 a() {
            return new nm1(this.f28058a, this.f28059b, this.c, this.d);
        }
    }

    @RequiresApi(21)
    public AudioAttributes a() {
        if (this.e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f28056a).setFlags(this.f28057b).setUsage(this.c);
            if (wlq.f38110a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.e = usage.build();
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nm1.class != obj.getClass()) {
            return false;
        }
        nm1 nm1Var = (nm1) obj;
        return this.f28056a == nm1Var.f28056a && this.f28057b == nm1Var.f28057b && this.c == nm1Var.c && this.d == nm1Var.d;
    }

    public int hashCode() {
        return ((((((527 + this.f28056a) * 31) + this.f28057b) * 31) + this.c) * 31) + this.d;
    }

    public nm1(int i, int i2, int i3, int i4) {
        this.f28056a = i;
        this.f28057b = i2;
        this.c = i3;
        this.d = i4;
    }
}
