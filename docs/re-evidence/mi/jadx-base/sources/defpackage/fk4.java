package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fk4 {
    public static fk4 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ik4 f17864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ik4 f17865b;
    public ik4 c;
    public ik4 d;
    public ik4 e;

    public fk4() {
        lgj lgjVar = lgj.f25047a;
        elo eloVar = elo.f16786a;
        q93 q93Var = q93.f31245a;
        rp5 rp5Var = rp5.f32765a;
        wre wreVar = wre.f38283a;
        w1h w1hVar = w1h.f37445a;
        this.f17864a = new ik4(new ck4[]{lgjVar, eloVar, q93Var, rp5Var, wreVar, w1hVar});
        this.f17865b = new ik4(new ck4[]{pgj.f30379a, lgjVar, eloVar, q93Var, rp5Var, wreVar, w1hVar});
        igj igjVar = igj.f21117a;
        ngj ngjVar = ngj.f27910a;
        this.c = new ik4(new ck4[]{igjVar, ngjVar, eloVar, wreVar, w1hVar});
        this.d = new ik4(new ck4[]{igjVar, rgj.f32524a, ngjVar, eloVar, w1hVar});
        this.e = new ik4(new ck4[]{ngjVar, eloVar, w1hVar});
    }

    public static fk4 b() {
        if (f == null) {
            f = new fk4();
        }
        return f;
    }

    public s67 a(Object obj) {
        s67 s67Var = (s67) this.c.b(obj == null ? null : obj.getClass());
        if (s67Var != null) {
            return s67Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No duration converter found for type: ");
        sb.append(obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public acd c(Object obj) {
        acd acdVar = (acd) this.f17864a.b(obj == null ? null : obj.getClass());
        if (acdVar != null) {
            return acdVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No instant converter found for type: ");
        sb.append(obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public sfd d(Object obj) {
        sfd sfdVar = (sfd) this.e.b(obj == null ? null : obj.getClass());
        if (sfdVar != null) {
            return sfdVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No interval converter found for type: ");
        sb.append(obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public flh e(Object obj) {
        flh flhVar = (flh) this.f17865b.b(obj == null ? null : obj.getClass());
        if (flhVar != null) {
            return flhVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No partial converter found for type: ");
        sb.append(obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public vqh f(Object obj) {
        vqh vqhVar = (vqh) this.d.b(obj == null ? null : obj.getClass());
        if (vqhVar != null) {
            return vqhVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No period converter found for type: ");
        sb.append(obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        return "ConverterManager[" + this.f17864a.d() + " instant," + this.f17865b.d() + " partial," + this.c.d() + " duration," + this.d.d() + " period," + this.e.d() + " interval]";
    }
}
