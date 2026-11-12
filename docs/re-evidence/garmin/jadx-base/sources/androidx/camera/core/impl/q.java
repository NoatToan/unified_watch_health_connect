package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class q extends q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f5698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f5699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.b0 f5700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f5702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0 f5703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5704h;

    private q(Size size, Size size2, b0.b0 b0Var, int i14, Range<Integer> range, x0 x0Var, boolean z14) {
        this.f5698b = size;
        this.f5699c = size2;
        this.f5700d = b0Var;
        this.f5701e = i14;
        this.f5702f = range;
        this.f5703g = x0Var;
        this.f5704h = z14;
    }

    @Override // androidx.camera.core.impl.q2
    public final b0.b0 b() {
        return this.f5700d;
    }

    @Override // androidx.camera.core.impl.q2
    public final Range<Integer> c() {
        return this.f5702f;
    }

    @Override // androidx.camera.core.impl.q2
    public final x0 d() {
        return this.f5703g;
    }

    @Override // androidx.camera.core.impl.q2
    public final Size e() {
        return this.f5699c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        if (!this.f5698b.equals(q2Var.f()) || !this.f5699c.equals(q2Var.e()) || !this.f5700d.equals(q2Var.b()) || this.f5701e != q2Var.g() || !this.f5702f.equals(q2Var.c())) {
            return false;
        }
        x0 x0Var = this.f5703g;
        if (x0Var == null) {
            if (q2Var.d() != null) {
                return false;
            }
        } else if (!x0Var.equals(q2Var.d())) {
            return false;
        }
        return this.f5704h == q2Var.h();
    }

    @Override // androidx.camera.core.impl.q2
    public final Size f() {
        return this.f5698b;
    }

    @Override // androidx.camera.core.impl.q2
    public final int g() {
        return this.f5701e;
    }

    @Override // androidx.camera.core.impl.q2
    public final boolean h() {
        return this.f5704h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f5698b.hashCode() ^ 1000003) * 1000003) ^ this.f5699c.hashCode()) * 1000003) ^ this.f5700d.hashCode()) * 1000003) ^ this.f5701e) * 1000003) ^ this.f5702f.hashCode()) * 1000003;
        x0 x0Var = this.f5703g;
        return ((iHashCode ^ (x0Var == null ? 0 : x0Var.hashCode())) * 1000003) ^ (this.f5704h ? 1231 : 1237);
    }

    @Override // androidx.camera.core.impl.q2
    public final b i() {
        return new b(this);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StreamSpec{resolution=");
        sb3.append(this.f5698b);
        sb3.append(", originalConfiguredResolution=");
        sb3.append(this.f5699c);
        sb3.append(", dynamicRange=");
        sb3.append(this.f5700d);
        sb3.append(", sessionType=");
        sb3.append(this.f5701e);
        sb3.append(", expectedFrameRateRange=");
        sb3.append(this.f5702f);
        sb3.append(", implementationOptions=");
        sb3.append(this.f5703g);
        sb3.append(", zslDisabled=");
        return hb.a.k(sb3, this.f5704h, StringSubstitutor.DEFAULT_VAR_END);
    }

    public static final class b extends q2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f5705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Size f5706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0.b0 f5707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f5708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Range<Integer> f5709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public x0 f5710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f5711g;

        private b(q2 q2Var) {
            this.f5705a = q2Var.f();
            this.f5706b = q2Var.e();
            this.f5707c = q2Var.b();
            this.f5708d = Integer.valueOf(q2Var.g());
            this.f5709e = q2Var.c();
            this.f5710f = q2Var.d();
            this.f5711g = Boolean.valueOf(q2Var.h());
        }

        public final q a() {
            String strConcat = this.f5705a == null ? " resolution" : "";
            if (this.f5706b == null) {
                strConcat = strConcat.concat(" originalConfiguredResolution");
            }
            if (this.f5707c == null) {
                strConcat = strConcat.concat(" dynamicRange");
            }
            if (this.f5708d == null) {
                strConcat = strConcat.concat(" sessionType");
            }
            if (this.f5709e == null) {
                strConcat = strConcat.concat(" expectedFrameRateRange");
            }
            if (this.f5711g == null) {
                strConcat = strConcat.concat(" zslDisabled");
            }
            if (strConcat.isEmpty()) {
                return new q(this.f5705a, this.f5706b, this.f5707c, this.f5708d.intValue(), this.f5709e, this.f5710f, this.f5711g.booleanValue());
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        public final b b(Range range) {
            if (range != null) {
                this.f5709e = range;
                return this;
            }
            j20.x.l("Null expectedFrameRateRange");
            return null;
        }

        public final b c(Size size) {
            if (size != null) {
                this.f5705a = size;
                return this;
            }
            j20.x.l("Null resolution");
            return null;
        }

        public b() {
        }
    }
}
