package g1;

import android.util.Size;
import androidx.camera.core.impl.x2;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2 f74678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f74679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f74680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f74681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f74682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f74683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f74684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f74685j;

    private d(String str, int i14, x2 x2Var, Size size, int i15, e0 e0Var, int i16, int i17, int i18, int i19) {
        this.f74676a = str;
        this.f74677b = i14;
        this.f74678c = x2Var;
        this.f74679d = size;
        this.f74680e = i15;
        this.f74681f = e0Var;
        this.f74682g = i16;
        this.f74683h = i17;
        this.f74684i = i18;
        this.f74685j = i19;
    }

    @Override // g1.k
    public final String a() {
        return this.f74676a;
    }

    @Override // g1.k
    public final x2 b() {
        return this.f74678c;
    }

    @Override // g1.d0
    public final int e() {
        return this.f74685j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        d dVar = (d) d0Var;
        return this.f74676a.equals(dVar.f74676a) && this.f74677b == d0Var.k() && this.f74678c.equals(dVar.f74678c) && this.f74679d.equals(d0Var.l()) && this.f74680e == d0Var.g() && this.f74681f.equals(d0Var.h()) && this.f74682g == d0Var.f() && this.f74683h == d0Var.i() && this.f74684i == d0Var.j() && this.f74685j == d0Var.e();
    }

    @Override // g1.d0
    public final int f() {
        return this.f74682g;
    }

    @Override // g1.d0
    public final int g() {
        return this.f74680e;
    }

    @Override // g1.d0
    public final e0 h() {
        return this.f74681f;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f74676a.hashCode() ^ 1000003) * 1000003) ^ this.f74677b) * 1000003) ^ this.f74678c.hashCode()) * 1000003) ^ this.f74679d.hashCode()) * 1000003) ^ this.f74680e) * 1000003) ^ this.f74681f.hashCode()) * 1000003) ^ this.f74682g) * 1000003) ^ this.f74683h) * 1000003) ^ this.f74684i) * 1000003) ^ this.f74685j;
    }

    @Override // g1.d0
    public final int i() {
        return this.f74683h;
    }

    @Override // g1.d0
    public final int j() {
        return this.f74684i;
    }

    @Override // g1.d0
    public final int k() {
        return this.f74677b;
    }

    @Override // g1.d0
    public final Size l() {
        return this.f74679d;
    }

    @Override // g1.d0
    public final b m() {
        return new b(this);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb3.append(this.f74676a);
        sb3.append(", profile=");
        sb3.append(this.f74677b);
        sb3.append(", inputTimebase=");
        sb3.append(this.f74678c);
        sb3.append(", resolution=");
        sb3.append(this.f74679d);
        sb3.append(", colorFormat=");
        sb3.append(this.f74680e);
        sb3.append(", dataSpace=");
        sb3.append(this.f74681f);
        sb3.append(", captureFrameRate=");
        sb3.append(this.f74682g);
        sb3.append(", encodeFrameRate=");
        sb3.append(this.f74683h);
        sb3.append(", IFrameInterval=");
        sb3.append(this.f74684i);
        sb3.append(", bitrate=");
        return am.j.q(sb3, this.f74685j, StringSubstitutor.DEFAULT_VAR_END);
    }

    public static final class b extends d0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f74686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f74687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x2 f74688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Size f74689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f74690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e0 f74691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f74692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f74693h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Integer f74694i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f74695j;

        private b(d0 d0Var) {
            this.f74686a = ((d) d0Var).f74676a;
            this.f74687b = Integer.valueOf(d0Var.k());
            this.f74688c = ((d) d0Var).f74678c;
            this.f74689d = d0Var.l();
            this.f74690e = Integer.valueOf(d0Var.g());
            this.f74691f = d0Var.h();
            this.f74692g = Integer.valueOf(d0Var.f());
            this.f74693h = Integer.valueOf(d0Var.i());
            this.f74694i = Integer.valueOf(d0Var.j());
            this.f74695j = Integer.valueOf(d0Var.e());
        }

        public final d a() {
            String strConcat = this.f74686a == null ? " mimeType" : "";
            if (this.f74687b == null) {
                strConcat = strConcat.concat(" profile");
            }
            if (this.f74688c == null) {
                strConcat = strConcat.concat(" inputTimebase");
            }
            if (this.f74689d == null) {
                strConcat = strConcat.concat(" resolution");
            }
            if (this.f74690e == null) {
                strConcat = strConcat.concat(" colorFormat");
            }
            if (this.f74691f == null) {
                strConcat = strConcat.concat(" dataSpace");
            }
            if (this.f74692g == null) {
                strConcat = strConcat.concat(" captureFrameRate");
            }
            if (this.f74693h == null) {
                strConcat = strConcat.concat(" encodeFrameRate");
            }
            if (this.f74694i == null) {
                strConcat = strConcat.concat(" IFrameInterval");
            }
            if (this.f74695j == null) {
                strConcat = strConcat.concat(" bitrate");
            }
            if (strConcat.isEmpty()) {
                return new d(this.f74686a, this.f74687b.intValue(), this.f74688c, this.f74689d, this.f74690e.intValue(), this.f74691f, this.f74692g.intValue(), this.f74693h.intValue(), this.f74694i.intValue(), this.f74695j.intValue());
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        public final b b(e0 e0Var) {
            if (e0Var != null) {
                this.f74691f = e0Var;
                return this;
            }
            j20.x.l("Null dataSpace");
            return null;
        }

        public b() {
        }
    }
}
