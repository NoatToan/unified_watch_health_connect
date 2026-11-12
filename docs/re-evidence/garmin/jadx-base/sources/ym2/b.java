package ym2;

import xm2.d;
import xm2.e;
import xm2.f;
import xm2.h;
import xm2.i;
import xm2.l;
import xm2.n;
import xm2.o;
import xm2.p;
import xm2.r;
import xm2.t;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b implements ym2.a {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198129a;

        static {
            int[] iArr = new int[h.values().length];
            f198129a = iArr;
            try {
                iArr[h.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f198129a[h.PUSHES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f198129a[h.HEART_RATE_VARIABILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f198129a[h.CALORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f198129a[h.ASCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f198129a[h.INTENSITY_MINUTES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f198129a[h.HEART_RATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f198129a[h.STRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f198129a[h.ACCELEROMETER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f198129a[h.SPO2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f198129a[h.RESPIRATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f198129a[h.BODY_BATTERY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f198129a[h.ACTIVE_TIME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f198129a[h.TRAINING_READINESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    @Override // ym2.a
    public final void a(String str, h hVar, p pVar) {
        int i14 = a.f198129a[hVar.ordinal()];
        if (i14 == 1) {
            r rVar = pVar.f191570a;
            if (rVar != null) {
                i(rVar);
                return;
            }
            return;
        }
        if (i14 == 2) {
            n nVar = pVar.f191571b;
            if (nVar != null) {
                g(nVar);
                return;
            }
            return;
        }
        if (i14 == 4) {
            f fVar = pVar.f191572c;
            if (fVar != null) {
                d(fVar);
                return;
            }
            return;
        }
        if (i14 == 5) {
            d dVar = pVar.f191573d;
            if (dVar != null) {
                b(dVar);
                return;
            }
            return;
        }
        if (i14 == 6) {
            l lVar = pVar.f191574e;
            if (lVar != null) {
                f(lVar);
                return;
            }
            return;
        }
        if (i14 == 7) {
            i iVar = pVar.f191575f;
            if (iVar != null) {
                e(str, iVar);
                return;
            }
            return;
        }
        switch (i14) {
            case 11:
                o oVar = pVar.f191576g;
                if (oVar != null) {
                    h(str, oVar);
                    return;
                }
                return;
            case 12:
                e eVar = pVar.f191577h;
                if (eVar != null) {
                    c(str, eVar);
                }
                break;
            case 13:
            case 14:
                break;
            default:
                return;
        }
        t tVar = pVar.f191578i;
        if (tVar != null) {
            j(str, tVar);
        }
    }

    public void b(d dVar) {
    }

    public void c(String str, e eVar) {
    }

    public void d(f fVar) {
    }

    public void e(String str, i iVar) {
    }

    public void f(l lVar) {
    }

    public void g(n nVar) {
    }

    public void h(String str, o oVar) {
    }

    public void i(r rVar) {
    }

    public void j(String str, t tVar) {
    }
}
