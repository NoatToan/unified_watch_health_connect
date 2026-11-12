package u6;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t6.e f168840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f168841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t6.e.b f168842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f168843e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f168844f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f168845g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f168846h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f168847i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f168848j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168849a;

        static {
            int[] iArr = new int[t6.d.a.values().length];
            f168849a = iArr;
            try {
                iArr[t6.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f168849a[t6.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f168849a[t6.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f168849a[t6.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f168849a[t6.d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(t6.e eVar) {
        this.f168840b = eVar;
    }

    public static void b(f fVar, f fVar2, int i14) {
        fVar.f168814l.add(fVar2);
        fVar.f168808f = i14;
        fVar2.f168813k.add(fVar);
    }

    public static f h(t6.d dVar) {
        t6.d dVar2 = dVar.f162588f;
        if (dVar2 == null) {
            return null;
        }
        t6.e eVar = dVar2.f162586d;
        int i14 = a.f168849a[dVar2.f162587e.ordinal()];
        if (i14 == 1) {
            return eVar.f162608d.f168846h;
        }
        if (i14 == 2) {
            return eVar.f162608d.f168847i;
        }
        if (i14 == 3) {
            return eVar.f162610e.f168846h;
        }
        if (i14 == 4) {
            return eVar.f162610e.f168830k;
        }
        if (i14 != 5) {
            return null;
        }
        return eVar.f162610e.f168847i;
    }

    public static f i(t6.d dVar, int i14) {
        t6.d dVar2 = dVar.f162588f;
        if (dVar2 == null) {
            return null;
        }
        t6.e eVar = dVar2.f162586d;
        p pVar = i14 == 0 ? eVar.f162608d : eVar.f162610e;
        int i15 = a.f168849a[dVar2.f162587e.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f168847i;
        }
        return pVar.f168846h;
    }

    @Override // u6.d
    public void a(d dVar) {
    }

    public final void c(f fVar, f fVar2, int i14, g gVar) {
        fVar.f168814l.add(fVar2);
        fVar.f168814l.add(this.f168843e);
        fVar.f168810h = i14;
        fVar.f168811i = gVar;
        fVar2.f168813k.add(fVar);
        gVar.f168813k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i14, int i15) {
        t6.e eVar = this.f168840b;
        if (i15 == 0) {
            int i16 = eVar.f162647x;
            int iMax = Math.max(eVar.f162646w, i14);
            if (i16 > 0) {
                iMax = Math.min(i16, i14);
            }
            if (iMax != i14) {
                return iMax;
            }
        } else {
            int i17 = eVar.A;
            int iMax2 = Math.max(eVar.f162649z, i14);
            if (i17 > 0) {
                iMax2 = Math.min(i17, i14);
            }
            if (iMax2 != i14) {
                return iMax2;
            }
        }
        return i14;
    }

    public long j() {
        g gVar = this.f168843e;
        if (gVar.f168812j) {
            return gVar.f168809g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(t6.d dVar, t6.d dVar2, int i14) {
        g gVar;
        float f14;
        int i15;
        int i16;
        f fVarH = h(dVar);
        f fVarH2 = h(dVar2);
        if (fVarH.f168812j && fVarH2.f168812j) {
            int iE = dVar.e() + fVarH.f168809g;
            int iE2 = fVarH2.f168809g - dVar2.e();
            int i17 = iE2 - iE;
            g gVar2 = this.f168843e;
            if (!gVar2.f168812j) {
                t6.e.b bVar = this.f168842d;
                t6.e.b bVar2 = t6.e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2) {
                    int i18 = this.f168839a;
                    if (i18 == 0) {
                        gVar2.d(g(i17, i14));
                    } else if (i18 == 1) {
                        gVar2.d(Math.min(g(gVar2.f168824m, i14), i17));
                    } else if (i18 == 2) {
                        t6.e eVar = this.f168840b;
                        t6.e eVar2 = eVar.X;
                        if (eVar2 != null) {
                            g gVar3 = (i14 == 0 ? eVar2.f162608d : eVar2.f162610e).f168843e;
                            if (gVar3.f168812j) {
                                gVar2.d(g((int) ((gVar3.f168809g * (i14 == 0 ? eVar.f162648y : eVar.B)) + 0.5f), i14));
                            }
                        }
                    } else if (i18 == 3) {
                        t6.e eVar3 = this.f168840b;
                        p pVar = eVar3.f162608d;
                        if (pVar.f168842d == bVar2 && pVar.f168839a == 3) {
                            n nVar = eVar3.f162610e;
                            if (nVar.f168842d != bVar2 || nVar.f168839a != 3) {
                                if (i14 == 0) {
                                    pVar = eVar3.f162610e;
                                }
                                gVar = pVar.f168843e;
                                if (gVar.f168812j) {
                                    f14 = eVar3.f162603a0;
                                    i15 = gVar.f168809g;
                                    if (i14 == 1) {
                                        i16 = (int) ((i15 / f14) + 0.5f);
                                    } else {
                                        i16 = (int) ((f14 * i15) + 0.5f);
                                    }
                                    gVar2.d(i16);
                                }
                            }
                        } else {
                            if (i14 == 0) {
                                pVar = eVar3.f162610e;
                            }
                            gVar = pVar.f168843e;
                            if (gVar.f168812j) {
                                f14 = eVar3.f162603a0;
                                i15 = gVar.f168809g;
                                if (i14 == 1) {
                                    i16 = (int) ((i15 / f14) + 0.5f);
                                } else {
                                    i16 = (int) ((f14 * i15) + 0.5f);
                                }
                                gVar2.d(i16);
                            }
                        }
                    }
                }
            }
            if (gVar2.f168812j) {
                int i19 = gVar2.f168809g;
                f fVar = this.f168847i;
                f fVar2 = this.f168846h;
                if (i19 == i17) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                t6.e eVar4 = this.f168840b;
                float f15 = i14 == 0 ? eVar4.f162617h0 : eVar4.f162619i0;
                if (fVarH == fVarH2) {
                    iE = fVarH.f168809g;
                    iE2 = fVarH2.f168809g;
                    f15 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i19) * f15) + iE + 0.5f));
                fVar.d(fVar2.f168809g + gVar2.f168809g);
            }
        }
    }
}
