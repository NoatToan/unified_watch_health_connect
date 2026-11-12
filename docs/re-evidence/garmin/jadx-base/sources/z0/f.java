package z0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f200618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0.a f200619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f200620c;

    private f(p0 p0Var, z0.a aVar, int i14) {
        this.f200618a = p0Var;
        this.f200619b = aVar;
        this.f200620c = i14;
    }

    @Override // z0.q
    public final z0.a b() {
        return this.f200619b;
    }

    @Override // z0.q
    public final int c() {
        return this.f200620c;
    }

    @Override // z0.q
    public final p0 d() {
        return this.f200618a;
    }

    @Override // z0.q
    public final b e() {
        return new b(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f200618a.equals(qVar.d()) && this.f200619b.equals(qVar.b()) && this.f200620c == qVar.c();
    }

    public final int hashCode() {
        return ((((this.f200618a.hashCode() ^ 1000003) * 1000003) ^ this.f200619b.hashCode()) * 1000003) ^ this.f200620c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MediaSpec{videoSpec=");
        sb3.append(this.f200618a);
        sb3.append(", audioSpec=");
        sb3.append(this.f200619b);
        sb3.append(", outputFormat=");
        return am.j.q(sb3, this.f200620c, StringSubstitutor.DEFAULT_VAR_END);
    }

    public static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p0 f200621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z0.a f200622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f200623c;

        private b(q qVar) {
            this.f200621a = qVar.d();
            this.f200622b = qVar.b();
            this.f200623c = Integer.valueOf(qVar.c());
        }

        public final f a() {
            String strConcat = this.f200621a == null ? " videoSpec" : "";
            if (this.f200622b == null) {
                strConcat = strConcat.concat(" audioSpec");
            }
            if (this.f200623c == null) {
                strConcat = strConcat.concat(" outputFormat");
            }
            if (strConcat.isEmpty()) {
                return new f(this.f200621a, this.f200622b, this.f200623c.intValue());
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        public final p0 b() {
            p0 p0Var = this.f200621a;
            if (p0Var != null) {
                return p0Var;
            }
            vb.h.z("Property \"videoSpec\" has not been set");
            return null;
        }

        public b() {
        }
    }
}
