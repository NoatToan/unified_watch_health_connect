package m63;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q13.c f117011a;

    static {
        q13.c cVar = new q13.c();
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        k23.d dVarB = t0Var.b(String.class);
        p005kotlin.jvm.internal.x0.f105818a.getClass();
        cVar.put(dVarB, y1.f117048a);
        k23.d dVarB2 = t0Var.b(Character.TYPE);
        p005kotlin.jvm.internal.f.f105796a.getClass();
        cVar.put(dVarB2, n.f116995a);
        cVar.put(t0Var.b(char[].class), kotlinx.serialization.internal.c.f105969c);
        k23.d dVarB3 = t0Var.b(Double.TYPE);
        p005kotlin.jvm.internal.k.f105801a.getClass();
        cVar.put(dVarB3, x.f117036a);
        cVar.put(t0Var.b(double[].class), kotlinx.serialization.internal.d.f105970c);
        k23.d dVarB4 = t0Var.b(Float.TYPE);
        p005kotlin.jvm.internal.m.f105803a.getClass();
        cVar.put(dVarB4, d0.f116930a);
        cVar.put(t0Var.b(float[].class), kotlinx.serialization.internal.e.f105971c);
        k23.d dVarB5 = t0Var.b(Long.TYPE);
        p005kotlin.jvm.internal.x.f105817a.getClass();
        cVar.put(dVarB5, v0.f117027a);
        cVar.put(t0Var.b(long[].class), kotlinx.serialization.internal.g.f105973c);
        k23.d dVarB6 = t0Var.b(o13.z.class);
        o13.z.f128618b.getClass();
        cVar.put(dVarB6, g2.f116952a);
        k23.d dVarB7 = t0Var.b(Integer.TYPE);
        p005kotlin.jvm.internal.r.f105809a.getClass();
        cVar.put(dVarB7, m0.f116981a);
        cVar.put(t0Var.b(int[].class), kotlinx.serialization.internal.f.f105972c);
        k23.d dVarB8 = t0Var.b(o13.x.class);
        o13.x.f128613b.getClass();
        cVar.put(dVarB8, e2.f116939a);
        k23.d dVarB9 = t0Var.b(Short.TYPE);
        p005kotlin.jvm.internal.v0.f105815a.getClass();
        cVar.put(dVarB9, x1.f117042a);
        cVar.put(t0Var.b(short[].class), kotlinx.serialization.internal.h.f105974c);
        k23.d dVarB10 = t0Var.b(o13.c0.class);
        o13.c0.f128567b.getClass();
        cVar.put(dVarB10, i2.f116962a);
        k23.d dVarB11 = t0Var.b(Byte.TYPE);
        p005kotlin.jvm.internal.d.f105790a.getClass();
        cVar.put(dVarB11, i.f116959a);
        cVar.put(t0Var.b(byte[].class), kotlinx.serialization.internal.b.f105968c);
        k23.d dVarB12 = t0Var.b(o13.v.class);
        o13.v.f128608b.getClass();
        cVar.put(dVarB12, c2.f116928a);
        k23.d dVarB13 = t0Var.b(Boolean.TYPE);
        p005kotlin.jvm.internal.c.f105789a.getClass();
        cVar.put(dVarB13, g.f116948a);
        cVar.put(t0Var.b(boolean[].class), kotlinx.serialization.internal.a.f105967c);
        k23.d dVarB14 = t0Var.b(Unit.class);
        Unit.INSTANCE.getClass();
        cVar.put(dVarB14, j2.f116966b);
        cVar.put(t0Var.b(Void.class), d1.f116932a);
        try {
            k23.d dVarB15 = t0Var.b(e53.c.class);
            e53.c.f63094b.getClass();
            cVar.put(dVarB15, y.f117044a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            cVar.put(p005kotlin.jvm.internal.s0.f105811a.b(o13.a0.class), kotlinx.serialization.internal.k.f105977c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            cVar.put(p005kotlin.jvm.internal.s0.f105811a.b(o13.y.class), kotlinx.serialization.internal.j.f105976c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            cVar.put(p005kotlin.jvm.internal.s0.f105811a.b(o13.d0.class), kotlinx.serialization.internal.l.f105978c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            cVar.put(p005kotlin.jvm.internal.s0.f105811a.b(o13.w.class), kotlinx.serialization.internal.i.f105975c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            k23.d dVarB16 = p005kotlin.jvm.internal.s0.f105811a.b(g53.b.class);
            g53.b.f75983c.getClass();
            cVar.put(dVarB16, k2.f116972a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        f117011a = cVar.b();
    }

    public static final void a(String str) {
        for (i63.c cVar : (q13.f) f117011a.values()) {
            if (str.equals(cVar.getF158591b().getF103221c())) {
                StringBuilder sbL = hb.a.l("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbL.append(p005kotlin.jvm.internal.s0.f105811a.b(cVar.getClass()).D());
                sbL.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                vb.h.s(d53.n.c(sbL.toString()));
                return;
            }
        }
    }
}
