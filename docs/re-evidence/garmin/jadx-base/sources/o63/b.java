package o63;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import m63.b1;
import m63.j0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lo63/b;", "Lm63/b1;", "Ln63/h;", "Ln63/b;", "json", "Ln63/i;", "value", "", "polymorphicDiscriminator", "<init>", "(Ln63/b;Ln63/i;Ljava/lang/String;)V", "Lo63/q;", "Lo63/t;", "Lo63/u;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b extends b1 implements n63.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n63.b f129829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n63.i f129830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f129831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n63.g f129832g;

    private b(n63.b bVar, n63.i iVar, String str) {
        this.f129829d = bVar;
        this.f129830e = iVar;
        this.f129831f = str;
        this.f129832g = bVar.f123893a;
    }

    @Override // m63.z1, l63.e
    public boolean D() {
        return !(X() instanceof n63.u);
    }

    @Override // m63.z1
    public final boolean E(String str) {
        Boolean bool;
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (!(iVarW instanceof n63.z)) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            t0 t0Var = s0.f105811a;
            sb3.append(t0Var.b(n63.z.class).D());
            sb3.append(", but had ");
            sb3.append(t0Var.b(iVarW.getClass()).D());
            sb3.append(" as the serialized body of boolean at element: ");
            sb3.append(Z(str2));
            throw gg.b.h(iVarW.toString(), -1, sb3.toString());
        }
        n63.z zVar = (n63.z) iVarW;
        try {
            j0 j0Var = n63.j.f123935a;
            String f123941c = zVar.getF123941c();
            String[] strArr = f0.f129852a;
            f123941c.getClass();
            if (f123941c.equalsIgnoreCase(BooleanUtils.TRUE)) {
                bool = Boolean.TRUE;
            } else {
                bool = f123941c.equalsIgnoreCase(BooleanUtils.FALSE) ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            a0(zVar, "boolean", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(zVar, "boolean", str2);
            throw null;
        }
    }

    @Override // m63.z1
    public final byte F(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (!(iVarW instanceof n63.z)) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            t0 t0Var = s0.f105811a;
            sb3.append(t0Var.b(n63.z.class).D());
            sb3.append(", but had ");
            sb3.append(t0Var.b(iVarW.getClass()).D());
            sb3.append(" as the serialized body of byte at element: ");
            sb3.append(Z(str2));
            throw gg.b.h(iVarW.toString(), -1, sb3.toString());
        }
        n63.z zVar = (n63.z) iVarW;
        try {
            long jB = n63.j.b(zVar);
            Byte bValueOf = (-128 > jB || jB > 127) ? null : Byte.valueOf((byte) jB);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            a0(zVar, "byte", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(zVar, "byte", str2);
            throw null;
        }
    }

    @Override // m63.z1
    public final char G(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (!(iVarW instanceof n63.z)) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            t0 t0Var = s0.f105811a;
            sb3.append(t0Var.b(n63.z.class).D());
            sb3.append(", but had ");
            sb3.append(t0Var.b(iVarW.getClass()).D());
            sb3.append(" as the serialized body of char at element: ");
            sb3.append(Z(str2));
            throw gg.b.h(iVarW.toString(), -1, sb3.toString());
        }
        n63.z zVar = (n63.z) iVarW;
        try {
            String f123941c = zVar.getF123941c();
            f123941c.getClass();
            int length = f123941c.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return f123941c.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            a0(zVar, "char", str2);
            throw null;
        }
    }

    @Override // m63.z1
    public final double H(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (iVarW instanceof n63.z) {
            n63.z zVar = (n63.z) iVarW;
            try {
                j0 j0Var = n63.j.f123935a;
                double d14 = Double.parseDouble(zVar.getF123941c());
                if (this.f129829d.f123893a.f123929k || Math.abs(d14) <= Double.MAX_VALUE) {
                    return d14;
                }
                throw gg.b.d(Double.valueOf(d14), str2, X().toString());
            } catch (IllegalArgumentException unused) {
                a0(zVar, "double", str2);
                throw null;
            }
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        t0 t0Var = s0.f105811a;
        sb3.append(t0Var.b(n63.z.class).D());
        sb3.append(", but had ");
        sb3.append(t0Var.b(iVarW.getClass()).D());
        sb3.append(" as the serialized body of double at element: ");
        sb3.append(Z(str2));
        throw gg.b.h(iVarW.toString(), -1, sb3.toString());
    }

    @Override // m63.z1
    public final int I(String str, k63.e eVar) {
        String str2 = str;
        str2.getClass();
        eVar.getClass();
        n63.i iVarW = W(str2);
        String f103257a = eVar.getF103257a();
        if (iVarW instanceof n63.z) {
            return o.c(eVar, this.f129829d, ((n63.z) iVarW).getF123941c(), "");
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        t0 t0Var = s0.f105811a;
        sb3.append(t0Var.b(n63.z.class).D());
        sb3.append(", but had ");
        sb3.append(t0Var.b(iVarW.getClass()).D());
        am.j.y(sb3, " as the serialized body of ", f103257a, " at element: ");
        sb3.append(Z(str2));
        throw gg.b.h(iVarW.toString(), -1, sb3.toString());
    }

    @Override // m63.z1
    public final float J(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (iVarW instanceof n63.z) {
            n63.z zVar = (n63.z) iVarW;
            try {
                j0 j0Var = n63.j.f123935a;
                float f14 = Float.parseFloat(zVar.getF123941c());
                if (this.f129829d.f123893a.f123929k || Math.abs(f14) <= Float.MAX_VALUE) {
                    return f14;
                }
                throw gg.b.d(Float.valueOf(f14), str2, X().toString());
            } catch (IllegalArgumentException unused) {
                a0(zVar, "float", str2);
                throw null;
            }
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        t0 t0Var = s0.f105811a;
        sb3.append(t0Var.b(n63.z.class).D());
        sb3.append(", but had ");
        sb3.append(t0Var.b(iVarW.getClass()).D());
        sb3.append(" as the serialized body of float at element: ");
        sb3.append(Z(str2));
        throw gg.b.h(iVarW.toString(), -1, sb3.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // m63.z1
    public final l63.e K(String str, k63.e eVar) {
        String str2 = str;
        str2.getClass();
        eVar.getClass();
        if (!c0.a(eVar)) {
            this.f117055b.add((Tag) str2);
            return this;
        }
        n63.i iVarW = W(str2);
        String f103257a = eVar.getF103257a();
        if (iVarW instanceof n63.z) {
            String f123941c = ((n63.z) iVarW).getF123941c();
            n63.b bVar = this.f129829d;
            bVar.getClass();
            f123941c.getClass();
            return new m(!bVar.f123893a.f123933o ? new d0(f123941c) : new e0(f123941c), bVar);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        t0 t0Var = s0.f105811a;
        sb3.append(t0Var.b(n63.z.class).D());
        sb3.append(", but had ");
        sb3.append(t0Var.b(iVarW.getClass()).D());
        am.j.y(sb3, " as the serialized body of ", f103257a, " at element: ");
        sb3.append(Z(str2));
        throw gg.b.h(iVarW.toString(), -1, sb3.toString());
    }

    @Override // m63.z1
    public final int L(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (!(iVarW instanceof n63.z)) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            t0 t0Var = s0.f105811a;
            sb3.append(t0Var.b(n63.z.class).D());
            sb3.append(", but had ");
            sb3.append(t0Var.b(iVarW.getClass()).D());
            sb3.append(" as the serialized body of int at element: ");
            sb3.append(Z(str2));
            throw gg.b.h(iVarW.toString(), -1, sb3.toString());
        }
        n63.z zVar = (n63.z) iVarW;
        try {
            long jB = n63.j.b(zVar);
            Integer numValueOf = (-2147483648L > jB || jB > 2147483647L) ? null : Integer.valueOf((int) jB);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            a0(zVar, "int", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(zVar, "int", str2);
            throw null;
        }
    }

    @Override // m63.z1
    public final long M(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (iVarW instanceof n63.z) {
            n63.z zVar = (n63.z) iVarW;
            try {
                return n63.j.b(zVar);
            } catch (IllegalArgumentException unused) {
                a0(zVar, "long", str2);
                throw null;
            }
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        t0 t0Var = s0.f105811a;
        sb3.append(t0Var.b(n63.z.class).D());
        sb3.append(", but had ");
        sb3.append(t0Var.b(iVarW.getClass()).D());
        sb3.append(" as the serialized body of long at element: ");
        sb3.append(Z(str2));
        throw gg.b.h(iVarW.toString(), -1, sb3.toString());
    }

    @Override // m63.z1
    public final boolean N(String str) {
        return W(str) != n63.u.INSTANCE;
    }

    @Override // m63.z1
    public final short O(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (!(iVarW instanceof n63.z)) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            t0 t0Var = s0.f105811a;
            sb3.append(t0Var.b(n63.z.class).D());
            sb3.append(", but had ");
            sb3.append(t0Var.b(iVarW.getClass()).D());
            sb3.append(" as the serialized body of short at element: ");
            sb3.append(Z(str2));
            throw gg.b.h(iVarW.toString(), -1, sb3.toString());
        }
        n63.z zVar = (n63.z) iVarW;
        try {
            long jB = n63.j.b(zVar);
            Short shValueOf = (-32768 > jB || jB > 32767) ? null : Short.valueOf((short) jB);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            a0(zVar, "short", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(zVar, "short", str2);
            throw null;
        }
    }

    @Override // m63.z1
    public final String P(String str) {
        String str2 = str;
        str2.getClass();
        n63.i iVarW = W(str2);
        if (!(iVarW instanceof n63.z)) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            t0 t0Var = s0.f105811a;
            sb3.append(t0Var.b(n63.z.class).D());
            sb3.append(", but had ");
            sb3.append(t0Var.b(iVarW.getClass()).D());
            sb3.append(" as the serialized body of string at element: ");
            sb3.append(Z(str2));
            throw gg.b.h(iVarW.toString(), -1, sb3.toString());
        }
        n63.z zVar = (n63.z) iVarW;
        if (!(zVar instanceof n63.q)) {
            StringBuilder sbL = hb.a.l("Expected string value for a non-null key '", str2, "', got null literal instead at element: ");
            sbL.append(Z(str2));
            throw gg.b.h(X().toString(), -1, sbL.toString());
        }
        n63.q qVar = (n63.q) zVar;
        if (qVar.f123939a || this.f129829d.f123893a.f123921c) {
            return qVar.f123941c;
        }
        StringBuilder sbL2 = hb.a.l("String literal for key '", str2, "' should be quoted at element: ");
        sbL2.append(Z(str2));
        sbL2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw gg.b.h(X().toString(), -1, sbL2.toString());
    }

    @Override // m63.b1
    public final String T(String str, String str2) {
        return str2;
    }

    public abstract n63.i W(String str);

    public final n63.i X() {
        n63.i iVarW;
        String str = (String) p13.h0.n0(this.f117055b);
        return (str == null || (iVarW = W(str)) == null) ? getF129830e() : iVarW;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public n63.i getF129830e() {
        return this.f129830e;
    }

    public final String Z(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    @Override // m63.z1, l63.e, l63.c
    /* JADX INFO: renamed from: a */
    public final p63.e getF129870c() {
        return this.f129829d.f123894b;
    }

    public final void a0(n63.z zVar, String str, String str2) {
        throw gg.b.h(X().toString(), -1, "Failed to parse literal '" + zVar + "' as " + (d53.u.y(str, IntegerTokenConverter.CONVERTER_KEY, false) ? "an " : "a ").concat(str) + " value at element: " + Z(str2));
    }

    @Override // m63.z1, l63.c
    public void b(k63.e eVar) {
        eVar.getClass();
    }

    @Override // m63.z1, l63.e
    public l63.c c(k63.e eVar) {
        eVar.getClass();
        n63.i iVarX = X();
        k63.l f103234b = eVar.getF103234b();
        boolean zG = p005kotlin.jvm.internal.s.g(f103234b, k63.m.b.f103254a);
        n63.b bVar = this.f129829d;
        if (zG || (f103234b instanceof k63.c)) {
            String f103257a = eVar.getF103257a();
            if (iVarX instanceof n63.c) {
                return new u(bVar, (n63.c) iVarX);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            t0 t0Var = s0.f105811a;
            sb3.append(t0Var.b(n63.c.class).D());
            sb3.append(", but had ");
            sb3.append(t0Var.b(iVarX.getClass()).D());
            sb3.append(" as the serialized body of ");
            sb3.append(f103257a);
            sb3.append(" at element: ");
            sb3.append(V());
            throw gg.b.h(iVarX.toString(), -1, sb3.toString());
        }
        boolean zG2 = p005kotlin.jvm.internal.s.g(f103234b, k63.m.c.f103255a);
        n63.b bVar2 = this.f129829d;
        if (!zG2) {
            String f103257a2 = eVar.getF103257a();
            if (iVarX instanceof n63.x) {
                return new t(bVar2, (n63.x) iVarX, this.f129831f, null, 8, null);
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            t0 t0Var2 = s0.f105811a;
            sb4.append(t0Var2.b(n63.x.class).D());
            sb4.append(", but had ");
            sb4.append(t0Var2.b(iVarX.getClass()).D());
            sb4.append(" as the serialized body of ");
            sb4.append(f103257a2);
            sb4.append(" at element: ");
            sb4.append(V());
            throw gg.b.h(iVarX.toString(), -1, sb4.toString());
        }
        k63.e eVarA = h0.a(eVar.h(0), bVar2.f123894b);
        k63.l f103234b2 = eVarA.getF103234b();
        if ((f103234b2 instanceof k63.d) || p005kotlin.jvm.internal.s.g(f103234b2, k63.l.b.f103252a)) {
            String f103257a3 = eVar.getF103257a();
            if (iVarX instanceof n63.x) {
                return new v(bVar, (n63.x) iVarX);
            }
            StringBuilder sb5 = new StringBuilder("Expected ");
            t0 t0Var3 = s0.f105811a;
            sb5.append(t0Var3.b(n63.x.class).D());
            sb5.append(", but had ");
            sb5.append(t0Var3.b(iVarX.getClass()).D());
            sb5.append(" as the serialized body of ");
            sb5.append(f103257a3);
            sb5.append(" at element: ");
            sb5.append(V());
            throw gg.b.h(iVarX.toString(), -1, sb5.toString());
        }
        if (!bVar2.f123893a.f123922d) {
            throw gg.b.f(eVarA);
        }
        String f103257a4 = eVar.getF103257a();
        if (iVarX instanceof n63.c) {
            return new u(bVar, (n63.c) iVarX);
        }
        StringBuilder sb6 = new StringBuilder("Expected ");
        t0 t0Var4 = s0.f105811a;
        sb6.append(t0Var4.b(n63.c.class).D());
        sb6.append(", but had ");
        sb6.append(t0Var4.b(iVarX.getClass()).D());
        sb6.append(" as the serialized body of ");
        sb6.append(f103257a4);
        sb6.append(" at element: ");
        sb6.append(V());
        throw gg.b.h(iVarX.toString(), -1, sb6.toString());
    }

    @Override // l63.e
    public final <T> T h(i63.b<? extends T> bVar) {
        bVar.getClass();
        if (bVar instanceof m63.b) {
            n63.b bVar2 = this.f129829d;
            if (!bVar2.f123893a.f123927i) {
                m63.b bVar3 = (m63.b) bVar;
                String strA = z.a(bVar3.getF158591b(), bVar2);
                n63.i iVarX = X();
                String f103257a = bVar3.getF158591b().getF103257a();
                if (!(iVarX instanceof n63.x)) {
                    StringBuilder sb3 = new StringBuilder("Expected ");
                    t0 t0Var = s0.f105811a;
                    sb3.append(t0Var.b(n63.x.class).D());
                    sb3.append(", but had ");
                    sb3.append(t0Var.b(iVarX.getClass()).D());
                    sb3.append(" as the serialized body of ");
                    sb3.append(f103257a);
                    sb3.append(" at element: ");
                    sb3.append(V());
                    throw gg.b.h(iVarX.toString(), -1, sb3.toString());
                }
                n63.x xVar = (n63.x) iVarX;
                n63.i iVar = (n63.i) xVar.get(strA);
                String f123941c = null;
                if (iVar != null) {
                    n63.z zVarA = n63.j.a(iVar);
                    if (!(zVarA instanceof n63.u)) {
                        f123941c = zVarA.getF123941c();
                    }
                }
                try {
                    return (T) gl.b.L(bVar2, strA, xVar, gl1.d.v((m63.b) bVar, this, f123941c));
                } catch (SerializationException e4) {
                    String message = e4.getMessage();
                    message.getClass();
                    throw gg.b.h(xVar.toString(), -1, message);
                }
            }
        }
        return bVar.deserialize(this);
    }

    @Override // n63.h
    public final n63.i i() {
        return X();
    }

    @Override // m63.z1, l63.e
    public final l63.e k(k63.e eVar) {
        eVar.getClass();
        if (p13.h0.n0(this.f117055b) != null) {
            return K(S(), eVar);
        }
        return new q(this.f129829d, getF129830e(), this.f129831f).k(eVar);
    }

    public /* synthetic */ b(n63.b bVar, n63.i iVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, iVar, (i14 & 4) != 0 ? null : str, null);
    }

    public /* synthetic */ b(n63.b bVar, n63.i iVar, String str, p005kotlin.jvm.internal.j jVar) {
        this(bVar, iVar, str);
    }
}
