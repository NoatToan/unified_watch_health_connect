package g1;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e extends e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f74696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f74697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f74698h;

    public e(int i14, int i15, int i16) {
        this.f74696f = i14;
        this.f74697g = i15;
        this.f74698h = i16;
    }

    @Override // g1.e0
    public final int a() {
        return this.f74698h;
    }

    @Override // g1.e0
    public final int b() {
        return this.f74696f;
    }

    @Override // g1.e0
    public final int c() {
        return this.f74697g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f74696f == e0Var.b() && this.f74697g == e0Var.c() && this.f74698h == e0Var.a();
    }

    public final int hashCode() {
        return ((((this.f74696f ^ 1000003) * 1000003) ^ this.f74697g) * 1000003) ^ this.f74698h;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb3.append(this.f74696f);
        sb3.append(", transfer=");
        sb3.append(this.f74697g);
        sb3.append(", range=");
        return am.j.q(sb3, this.f74698h, StringSubstitutor.DEFAULT_VAR_END);
    }
}
