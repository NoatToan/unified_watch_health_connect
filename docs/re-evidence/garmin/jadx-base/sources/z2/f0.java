package z2;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final b0 a(y0 y0Var, e eVar) {
        boolean z14 = y0Var.c() == g.CROSSED;
        return new b0(c(y0Var.i(), z14, true, y0Var.getF201685c(), eVar), c(y0Var.h(), z14, false, y0Var.getF201686d(), eVar), z14);
    }

    public static final b0.a b(final y0 y0Var, final z zVar, b0.a aVar) {
        final int i14 = y0Var.getF201687e() ? zVar.f201850c : zVar.f201851d;
        int f201685c = y0Var.getF201687e() ? y0Var.getF201685c() : y0Var.getF201686d();
        int i15 = zVar.f201849b;
        s5.q0 q0Var = zVar.f201853f;
        int i16 = zVar.f201852e;
        if (f201685c != i15) {
            return zVar.a(i14);
        }
        o13.n nVar = o13.n.NONE;
        final o13.l lVarA = o13.m.a(nVar, new ag0.a(zVar, i14, 15));
        final int i17 = y0Var.getF201687e() ? zVar.f201851d : zVar.f201850c;
        o13.l lVarA2 = o13.m.a(nVar, new e23.a() { // from class: z2.e0
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                int iIntValue = ((Number) lVarA.getValue()).intValue();
                y0 y0Var2 = y0Var;
                boolean f201687e = y0Var2.getF201687e();
                boolean z14 = y0Var2.c() == g.CROSSED;
                z zVar2 = zVar;
                s5.q0 q0Var2 = zVar2.f201853f;
                int i18 = i14;
                long jL = q0Var2.l(i18);
                s5.q0 q0Var3 = zVar2.f201853f;
                s5.w0.a aVar2 = s5.w0.f157315b;
                int i19 = (int) (jL >> 32);
                s5.o oVar = q0Var3.f157281b;
                int iD = oVar.d(i19);
                int i24 = oVar.f157257f;
                if (iD != iIntValue) {
                    i19 = iIntValue >= i24 ? q0Var3.i(i24 - 1) : q0Var3.i(iIntValue);
                }
                int iC = (int) (jL & 4294967295L);
                if (oVar.d(iC) != iIntValue) {
                    s5.o oVar2 = q0Var3.f157281b;
                    iC = iIntValue >= i24 ? oVar2.c(i24 - 1, false) : oVar2.c(iIntValue, false);
                }
                int i25 = i17;
                if (i19 == i25) {
                    return zVar2.a(iC);
                }
                if (iC == i25) {
                    return zVar2.a(i19);
                }
                if (!(f201687e ^ z14) ? i18 >= i19 : i18 > iC) {
                    i19 = iC;
                }
                return zVar2.a(i19);
            }
        });
        if (zVar.f201848a != aVar.f201528c) {
            return (b0.a) lVarA2.getValue();
        }
        if (i14 == i16) {
            return aVar;
        }
        if (((Number) lVarA.getValue()).intValue() != q0Var.f157281b.d(i16)) {
            return (b0.a) lVarA2.getValue();
        }
        int i18 = aVar.f201527b;
        long jL = q0Var.l(i18);
        boolean f201687e = y0Var.getF201687e();
        if (i16 != -1) {
            if (i14 != i16) {
                if (!(f201687e ^ (zVar.b() == g.CROSSED))) {
                }
            }
            return zVar.a(i14);
        }
        s5.w0.a aVar2 = s5.w0.f157315b;
        return (i18 == ((int) (jL >> 32)) || i18 == ((int) (jL & 4294967295L))) ? (b0.a) lVarA2.getValue() : zVar.a(i14);
    }

    public static final b0.a c(z zVar, boolean z14, boolean z15, int i14, e eVar) {
        long j8;
        int i15 = z15 ? zVar.f201850c : zVar.f201851d;
        if (i14 != zVar.f201849b) {
            return zVar.a(i15);
        }
        long jA = eVar.a(zVar, i15);
        if (z14 ^ z15) {
            s5.w0.a aVar = s5.w0.f157315b;
            j8 = jA >> 32;
        } else {
            s5.w0.a aVar2 = s5.w0.f157315b;
            j8 = 4294967295L & jA;
        }
        return zVar.a((int) j8);
    }

    public static final b0.a d(b0.a aVar, z zVar, int i14) {
        return new b0.a(zVar.f201853f.a(i14), i14, aVar.f201528c);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    public static final b0 e(b0 b0Var, y0 y0Var) {
        boolean z14;
        boolean z15 = false;
        if (b0Var == null) {
            z14 = true;
        } else {
            b0.a aVar = b0Var.f201523a;
            long j8 = aVar.f201528c;
            b0.a aVar2 = b0Var.f201524b;
            if (j8 != aVar2.f201528c) {
                boolean z16 = b0Var.f201525c;
                if ((z16 ? aVar : aVar2).f201527b == 0) {
                    if (z16) {
                        aVar = aVar2;
                    }
                    if (y0Var.d().f201853f.f157280a.f157265a.f157138b.length() == aVar.f201527b) {
                        p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
                        m0Var.f105804a = true;
                        y0Var.f(new kn1.c(m0Var, 2));
                        z14 = m0Var.f105804a;
                    }
                }
            } else if (aVar.f201527b == aVar2.f201527b) {
                z14 = true;
            }
            z14 = false;
        }
        if (!z14) {
            return b0Var;
        }
        String str = y0Var.getF201823e().f201853f.f157280a.f157265a.f157138b;
        if (y0Var.getSize() > 1 || y0Var.getF201688f() == null) {
            return b0Var;
        }
        if (str.length() == 0) {
            return b0Var;
        }
        z f201823e = y0Var.getF201823e();
        String str2 = f201823e.f201853f.f157280a.f157265a.f157138b;
        int i14 = f201823e.f201850c;
        int length = str2.length();
        if (i14 == 0) {
            int iU = ge1.b.u(0, str2);
            return y0Var.getF201687e() ? b0.a(b0Var, d(b0Var.f201523a, f201823e, iU), null, true, 2) : b0.a(b0Var, null, d(b0Var.f201524b, f201823e, iU), false, 1);
        }
        if (i14 == length) {
            int iV = ge1.b.v(length, str2);
            return y0Var.getF201687e() ? b0.a(b0Var, d(b0Var.f201523a, f201823e, iV), null, false, 2) : b0.a(b0Var, null, d(b0Var.f201524b, f201823e, iV), true, 1);
        }
        b0 f201688f = y0Var.getF201688f();
        if (f201688f != null && f201688f.f201525c) {
            z15 = true;
        }
        int iV2 = y0Var.getF201687e() ^ z15 ? ge1.b.v(i14, str2) : ge1.b.u(i14, str2);
        return y0Var.getF201687e() ? b0.a(b0Var, d(b0Var.f201523a, f201823e, iV2), null, z15, 2) : b0.a(b0Var, null, d(b0Var.f201524b, f201823e, iV2), z15, 1);
    }
}
