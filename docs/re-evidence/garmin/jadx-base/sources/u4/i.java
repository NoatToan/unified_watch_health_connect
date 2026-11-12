package u4;

import java.util.List;
import lc.u0;
import o4.f1;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final void a(f1 f1Var, double d14, double d15, double d16, double d17, double d18, double d19, double d24, boolean z14, boolean z15) {
        double d25;
        double d26;
        double d27 = d18;
        double d28 = (d24 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d28);
        double dSin = Math.sin(d28);
        double d29 = ((d15 * dSin) + (d14 * dCos)) / d27;
        double d34 = ((d15 * dCos) + ((-d14) * dSin)) / d19;
        double d35 = ((d17 * dSin) + (d16 * dCos)) / d27;
        double d36 = ((d17 * dCos) + ((-d16) * dSin)) / d19;
        double d37 = d29 - d35;
        double d38 = d34 - d36;
        double d39 = 2;
        double d44 = (d29 + d35) / d39;
        double d45 = (d34 + d36) / d39;
        double d46 = (d38 * d38) + (d37 * d37);
        if (d46 == 0.0d) {
            return;
        }
        double d47 = (1.0d / d46) - 0.25d;
        if (d47 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d46) / 1.99999d);
            a(f1Var, d14, d15, d16, d17, d27 * dSqrt, d19 * dSqrt, d24, z14, z15);
            return;
        }
        double dSqrt2 = Math.sqrt(d47);
        double d48 = d37 * dSqrt2;
        double d49 = dSqrt2 * d38;
        if (z14 == z15) {
            d25 = d44 - d49;
            d26 = d45 + d48;
        } else {
            d25 = d44 + d49;
            d26 = d45 - d48;
        }
        double dAtan2 = Math.atan2(d34 - d26, d29 - d25);
        double dAtan3 = Math.atan2(d36 - d26, d35 - d25) - dAtan2;
        if (z15 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d54 = d25 * d27;
        double d55 = d26 * d19;
        double d56 = (d54 * dCos) - (d55 * dSin);
        double d57 = (d55 * dCos) + (d54 * dSin);
        double d58 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d58) / 3.141592653589793d));
        double dCos2 = Math.cos(d28);
        double dSin2 = Math.sin(d28);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d59 = dAtan3;
        double d64 = -d27;
        double d65 = d64 * dCos2;
        double d66 = d19 * dSin2;
        double d67 = (d65 * dSin3) - (d66 * dCos3);
        double d68 = d64 * dSin2;
        double d69 = d19 * dCos2;
        double d74 = (dCos3 * d69) + (dSin3 * d68);
        double d75 = d59 / ((double) iCeil);
        double d76 = dAtan2;
        double d77 = d67;
        int i14 = 0;
        double d78 = d14;
        double d79 = d74;
        double d84 = d15;
        while (i14 < iCeil) {
            double d85 = d76 + d75;
            double dSin4 = Math.sin(d85);
            double dCos4 = Math.cos(d85);
            int i15 = i14;
            double d86 = (((d27 * dCos2) * dCos4) + d56) - (d66 * dSin4);
            int i16 = iCeil;
            double d87 = (d69 * dSin4) + (d27 * dSin2 * dCos4) + d57;
            double d88 = (d65 * dSin4) - (d66 * dCos4);
            double d89 = (dCos4 * d69) + (dSin4 * d68);
            double d93 = d85 - d76;
            double dTan = Math.tan(d93 / d39);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d58) - ((double) 1)) * Math.sin(d93)) / ((double) 3);
            f1Var.b((float) ((d77 * dSqrt3) + d78), (float) ((d79 * dSqrt3) + d84), (float) (d86 - (dSqrt3 * d88)), (float) (d87 - (dSqrt3 * d89)), (float) d86, (float) d87);
            d78 = d86;
            i14 = i15 + 1;
            d56 = d56;
            dSin2 = dSin2;
            d58 = d58;
            d76 = d85;
            d79 = d89;
            d77 = d88;
            d84 = d87;
            d27 = d18;
            iCeil = i16;
        }
    }

    public static final void b(List list, f1 f1Var) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f22;
        float f24;
        List list2 = list;
        f1 f1Var2 = f1Var;
        int iG = f1Var2.g();
        f1Var2.rewind();
        f1Var2.j(iG);
        g gVar = list2.isEmpty() ? g.b.f168438c : (g) list2.get(0);
        int size = list2.size();
        float f25 = 0.0f;
        int i14 = 0;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        float f29 = 0.0f;
        float f34 = 0.0f;
        float f35 = 0.0f;
        while (i14 < size) {
            g gVar2 = (g) list2.get(i14);
            if (gVar2 instanceof g.b) {
                f1Var2.close();
                size = size;
                f25 = f25;
                i14 = i14;
                gVar2 = gVar2;
                f26 = f34;
                f28 = f26;
                f27 = f35;
                f29 = f27;
            } else {
                if (gVar2 instanceof g.n) {
                    g.n nVar = (g.n) gVar2;
                    float f36 = nVar.f168476c;
                    f28 += f36;
                    float f37 = nVar.f168477d;
                    f29 += f37;
                    f1Var2.o(f36, f37);
                    f34 = f28;
                    f35 = f29;
                } else if (gVar2 instanceof g.f) {
                    g.f fVar = (g.f) gVar2;
                    float f38 = fVar.f168448c;
                    float f39 = fVar.f168449d;
                    f1Var2.a(f38, f39);
                    f29 = f39;
                    f35 = f29;
                    f28 = f38;
                    f34 = f28;
                } else if (gVar2 instanceof g.m) {
                    g.m mVar = (g.m) gVar2;
                    float f44 = mVar.f168475d;
                    float f45 = mVar.f168474c;
                    f1Var2.n(f45, f44);
                    f28 += f45;
                    f29 += f44;
                } else if (gVar2 instanceof g.e) {
                    g.e eVar = (g.e) gVar2;
                    float f46 = eVar.f168447d;
                    float f47 = eVar.f168446c;
                    f1Var2.c(f47, f46);
                    f28 = f47;
                    f29 = f46;
                } else if (gVar2 instanceof g.l) {
                    float f48 = ((g.l) gVar2).f168473c;
                    f1Var2.n(f48, f25);
                    f28 += f48;
                } else if (gVar2 instanceof g.d) {
                    float f49 = ((g.d) gVar2).f168445c;
                    f1Var2.c(f49, f29);
                    f28 = f49;
                } else if (gVar2 instanceof g.r) {
                    float f50 = ((g.r) gVar2).f168488c;
                    f1Var2.n(f25, f50);
                    f29 += f50;
                } else if (gVar2 instanceof g.s) {
                    float f54 = ((g.s) gVar2).f168489c;
                    f1Var2.c(f28, f54);
                    f29 = f54;
                } else {
                    if (gVar2 instanceof g.k) {
                        g.k kVar = (g.k) gVar2;
                        f1Var2.p(kVar.f168467c, kVar.f168468d, kVar.f168469e, kVar.f168470f, kVar.f168471g, kVar.f168472h);
                        f19 = kVar.f168469e + f28;
                        f22 = kVar.f168470f + f29;
                        f28 += kVar.f168471g;
                        f24 = kVar.f168472h;
                    } else if (gVar2 instanceof g.c) {
                        g.c cVar = (g.c) gVar2;
                        f1Var.b(cVar.f168439c, cVar.f168440d, cVar.f168441e, cVar.f168442f, cVar.f168443g, cVar.f168444h);
                        float f55 = cVar.f168441e;
                        float f56 = cVar.f168442f;
                        float f57 = cVar.f168443g;
                        float f58 = cVar.f168444h;
                        f28 = f57;
                        f29 = f58;
                        size = size;
                        f25 = f25;
                        i14 = i14;
                        gVar2 = gVar2;
                        f26 = f55;
                        f27 = f56;
                    } else if (gVar2 instanceof g.p) {
                        if (gVar.f168429a) {
                            float f59 = f28 - f26;
                            f18 = f29 - f27;
                            f17 = f59;
                        } else {
                            f17 = f25;
                            f18 = f17;
                        }
                        g.p pVar = (g.p) gVar2;
                        f1Var.p(f17, f18, pVar.f168482c, pVar.f168483d, pVar.f168484e, pVar.f168485f);
                        f19 = pVar.f168482c + f28;
                        f22 = pVar.f168483d + f29;
                        f28 += pVar.f168484e;
                        f24 = pVar.f168485f;
                    } else {
                        if (gVar2 instanceof g.h) {
                            if (gVar.f168429a) {
                                float f64 = 2;
                                f28 = (f28 * f64) - f26;
                                f29 = (f64 * f29) - f27;
                            }
                            g.h hVar = (g.h) gVar2;
                            f1Var.b(f28, f29, hVar.f168454c, hVar.f168455d, hVar.f168456e, hVar.f168457f);
                            f16 = hVar.f168454c;
                            float f65 = hVar.f168455d;
                            float f66 = hVar.f168456e;
                            float f67 = hVar.f168457f;
                            f28 = f66;
                            f29 = f67;
                            f27 = f65;
                        } else if (gVar2 instanceof g.o) {
                            g.o oVar = (g.o) gVar2;
                            float f68 = oVar.f168481f;
                            float f69 = oVar.f168480e;
                            float f74 = oVar.f168479d;
                            float f75 = oVar.f168478c;
                            f1Var.f(f75, f74, f69, f68);
                            float f76 = f75 + f28;
                            float f77 = f74 + f29;
                            f28 += f69;
                            f29 += f68;
                            f26 = f76;
                            f27 = f77;
                        } else if (gVar2 instanceof g.C3160g) {
                            g.C3160g c3160g = (g.C3160g) gVar2;
                            float f78 = c3160g.f168453f;
                            float f79 = c3160g.f168452e;
                            float f84 = c3160g.f168451d;
                            f16 = c3160g.f168450c;
                            f1Var.r(f16, f84, f79, f78);
                            f29 = f78;
                            f28 = f79;
                            f27 = f84;
                        } else if (gVar2 instanceof g.q) {
                            if (gVar.f168430b) {
                                f14 = f28 - f26;
                                f15 = f29 - f27;
                            } else {
                                f14 = f25;
                                f15 = f14;
                            }
                            g.q qVar = (g.q) gVar2;
                            float f85 = qVar.f168487d;
                            float f86 = qVar.f168486c;
                            f1Var.f(f14, f15, f86, f85);
                            f16 = f14 + f28;
                            float f87 = f15 + f29;
                            f28 += f86;
                            f29 += f85;
                            f27 = f87;
                        } else if (gVar2 instanceof g.i) {
                            if (gVar.f168430b) {
                                float f88 = 2;
                                f28 = (f28 * f88) - f26;
                                f29 = (f88 * f29) - f27;
                            }
                            g.i iVar = (g.i) gVar2;
                            float f89 = iVar.f168459d;
                            float f93 = iVar.f168458c;
                            f1Var.r(f28, f29, f93, f89);
                            size = size;
                            f25 = f25;
                            i14 = i14;
                            f27 = f29;
                            gVar2 = gVar2;
                            f29 = f89;
                            f26 = f28;
                            f28 = f93;
                        } else if (gVar2 instanceof g.j) {
                            g.j jVar = (g.j) gVar2;
                            float f94 = jVar.f168465h + f28;
                            float f95 = jVar.f168466i + f29;
                            f25 = f25;
                            size = size;
                            i14 = i14;
                            a(f1Var, f28, f29, f94, f95, jVar.f168460c, jVar.f168461d, jVar.f168462e, jVar.f168463f, jVar.f168464g);
                            f26 = f94;
                            f28 = f26;
                            f27 = f95;
                            f29 = f27;
                            gVar2 = gVar2;
                        } else {
                            size = size;
                            f25 = f25;
                            i14 = i14;
                            if (!(gVar2 instanceof g.a)) {
                                u0.r();
                                return;
                            }
                            g.a aVar = (g.a) gVar2;
                            float f96 = aVar.f168437i;
                            float f97 = aVar.f168436h;
                            gVar2 = gVar2;
                            a(f1Var, f28, f29, f97, f96, aVar.f168431c, aVar.f168432d, aVar.f168433e, aVar.f168434f, aVar.f168435g);
                            f27 = f96;
                            f29 = f27;
                            f26 = f97;
                            f28 = f26;
                        }
                        f26 = f16;
                    }
                    f29 += f24;
                    f26 = f19;
                    f27 = f22;
                }
                gVar2 = gVar2;
            }
            i14++;
            list2 = list;
            f1Var2 = f1Var;
            size = size;
            gVar = gVar2;
            f25 = f25;
        }
    }
}
