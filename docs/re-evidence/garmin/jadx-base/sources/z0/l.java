package z0;

import android.util.Range;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f200663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f200664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Range<Integer> f200665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f200666f;

    private l(x xVar, int i14, Range<Integer> range, int i15) {
        this.f200663c = xVar;
        this.f200664d = i14;
        this.f200665e = range;
        this.f200666f = i15;
    }

    @Override // z0.p0
    public final int b() {
        return this.f200666f;
    }

    @Override // z0.p0
    public final Range<Integer> c() {
        return this.f200665e;
    }

    @Override // z0.p0
    public final int d() {
        return this.f200664d;
    }

    @Override // z0.p0
    public final x e() {
        return this.f200663c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f200663c.equals(p0Var.e()) && this.f200664d == p0Var.d() && this.f200665e.equals(p0Var.c()) && this.f200666f == p0Var.b();
    }

    @Override // z0.p0
    public final b f() {
        return new b(this);
    }

    public final int hashCode() {
        return ((((((this.f200663c.hashCode() ^ 1000003) * 1000003) ^ this.f200664d) * 1000003) ^ this.f200665e.hashCode()) * 1000003) ^ this.f200666f;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoSpec{qualitySelector=");
        sb3.append(this.f200663c);
        sb3.append(", encodeFrameRate=");
        sb3.append(this.f200664d);
        sb3.append(", bitrate=");
        sb3.append(this.f200665e);
        sb3.append(", aspectRatio=");
        return am.j.q(sb3, this.f200666f, StringSubstitutor.DEFAULT_VAR_END);
    }

    public static final class b extends p0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x f200667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f200668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Range<Integer> f200669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f200670d;

        private b(p0 p0Var) {
            this.f200667a = p0Var.e();
            this.f200668b = Integer.valueOf(p0Var.d());
            this.f200669c = p0Var.c();
            this.f200670d = Integer.valueOf(p0Var.b());
        }

        public final l a() {
            String strConcat = this.f200667a == null ? " qualitySelector" : "";
            if (this.f200668b == null) {
                strConcat = strConcat.concat(" encodeFrameRate");
            }
            if (this.f200669c == null) {
                strConcat = strConcat.concat(" bitrate");
            }
            if (this.f200670d == null) {
                strConcat = strConcat.concat(" aspectRatio");
            }
            if (strConcat.isEmpty()) {
                return new l(this.f200667a, this.f200668b.intValue(), this.f200669c, this.f200670d.intValue());
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        public final b b(int i14) {
            this.f200670d = Integer.valueOf(i14);
            return this;
        }

        public final b c(x xVar) {
            if (xVar != null) {
                this.f200667a = xVar;
                return this;
            }
            j20.x.l("Null qualitySelector");
            return null;
        }

        public b() {
        }
    }
}
