package tq;

import am.x0;
import am.z0;
import cq.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p13.j0;
import p13.w;
import ps.o1;
import ps.r;
import ps.x1;
import qs.x;
import ss.l;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166034a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.D2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.O0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.W1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.X1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.f4267a2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.f4270b2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.f4352y2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[x0.I1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[x0.V2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[x0.G2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[x0.K1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[x0.H2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[x0.J2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[x0.I2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[x0.f4308n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[x0.f4318p2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[x0.W2.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[x0.R0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[x0.S0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[x0.T0.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[x0.E2.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[x0.Y.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[x0.Z.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[x0.f4296k0.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[x0.f4266a1.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[x0.Z1.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[x0.E3.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[x0.J0.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[x0.K0.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            f166034a = iArr;
        }
    }

    public static final List<x> a(x0 x0Var) {
        x0Var.getClass();
        switch (a.f166034a[x0Var.ordinal()]) {
            case 1:
                return w.c(x.RUN_ACTIVE);
            case 2:
            case 17:
            case 18:
            case 19:
            case 24:
            case 25:
            case 26:
            default:
                return j0.f134944a;
            case 3:
                return p13.x.k(x.ASCENT, x.DESCENT, x.TRANSITION);
            case 4:
                return p13.x.k(x.ASCENT, x.DESCENT, x.TRANSITION);
            case 5:
                return p13.x.k(x.ASCENT, x.DESCENT, x.TRANSITION);
            case 6:
            case 7:
            case 28:
                return w.c(x.SKI_RUN);
            case 8:
            case 9:
                return w.c(x.CLIMB_ACTIVE);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return w.c(x.SURF_ACTIVE);
            case 20:
                return w.c(x.DOWNHILL_RUN);
            case 21:
            case 22:
                return p13.x.k(x.ASCENT, x.DESCENT);
            case 23:
                return w.c(x.ROUND_ACTIVE);
            case 27:
                return w.c(x.VIRTUAL_ACTIVITY_SECTION);
            case 29:
                return w.c(x.PACK_WEIGHT);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008c A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e A[ADDED_TO_REGION] */
    public static final boolean b(x0 x0Var, List<x1> list) {
        boolean z14;
        String str = x0Var != null ? x0Var.f4358a : null;
        z0 z0Var = z0.f4390a;
        boolean zB = z0.b(x0.D2, str);
        boolean zD0 = z0.d0(x0Var != null ? x0Var.f4358a : null);
        boolean zP = z0.P(x0Var != null ? x0Var.f4358a : null);
        boolean zB2 = z0.b(x0.R0, x0Var != null ? x0Var.f4358a : null);
        boolean zX = z0.x(x0Var != null ? x0Var.f4358a : null);
        if (x0Var == x0.f4266a1 && list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((x1) it.next()).a2() == x.VIRTUAL_ACTIVITY_SECTION) {
                        if (list.size() > 1) {
                            z14 = true;
                            break;
                        }
                    }
                }
                z14 = false;
                break;
            }
        }
        z14 = false;
        break;
        if (x0Var != null && j(x0Var) && list != null && !list.isEmpty()) {
            int i14 = a.f166034a[x0Var.ordinal()];
            if (i14 != 28) {
                switch (i14) {
                    default:
                        switch (i14) {
                            default:
                                if (z14) {
                                }
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                if (zB) {
                                }
                                break;
                        }
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        if (zB) {
                        }
                        break;
                }
            }
            if (zB) {
            }
        } else if (z14) {
            if (zB && !zD0 && !zP && !zB2 && !zX) {
                return true;
            }
        }
        return false;
    }

    public static final ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            x1 x1Var = (x1) obj;
            x xVarA2 = x1Var.a2();
            x xVar = x.TRANSITION;
            if (xVarA2 != xVar) {
                x1 x1Var2 = (x1) h0.e0(i15, arrayList);
                if (x1Var2 == null || x1Var2.a2() != xVar) {
                    arrayList2.add(x1.b(x1Var, null, -1));
                } else {
                    arrayList2.add(x1.b(x1Var, x1Var2.getEndDateTime(), -5));
                }
            }
            i14 = i15;
        }
        return arrayList2;
    }

    public static final o1 d(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
        return l.c(hVar != null ? hVar.f29464q : null, f(hVar != null ? hVar.C() : null));
    }

    public static final o1 e(r rVar) {
        List<o1> listT;
        if (rVar == null || (listT = rVar.t()) == null) {
            return null;
        }
        return l.c(listT, f(rVar.h()));
    }

    public static final x f(x0 x0Var) {
        int i14 = x0Var == null ? -1 : a.f166034a[x0Var.ordinal()];
        if (i14 == 1) {
            return x.RUN_ACTIVE;
        }
        if (i14 == 23) {
            return x.ROUND_ACTIVE;
        }
        switch (i14) {
            case 6:
            case 7:
                break;
            case 8:
            case 9:
                return x.CLIMB_ACTIVE;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return x.SURF_ACTIVE;
            default:
                switch (i14) {
                    case 18:
                    case 19:
                        return x.WINDSURF_ACTIVE;
                    case 20:
                        return x.DOWNHILL_RUN;
                    default:
                        switch (i14) {
                            case 27:
                                return x.VIRTUAL_ACTIVITY_SECTION;
                            case 28:
                                break;
                            case 29:
                                return x.PACK_WEIGHT;
                            default:
                                return null;
                        }
                        break;
                }
                break;
        }
        return x.SKI_RUN;
    }

    public static final List<x> g(x0 x0Var) {
        int i14 = x0Var == null ? -1 : a.f166034a[x0Var.ordinal()];
        if (i14 == 1 || i14 == 17 || i14 == 30 || i14 == 31) {
            return w.c(x.PACE_PRO_SPLIT);
        }
        if (x0Var != null) {
            String str = x0Var.f4358a;
            z0 z0Var = z0.f4390a;
            if (z0.b(x0.f4312o, str)) {
                return w.c(x.POWER_GUIDE_SPLIT);
            }
        }
        if (x0Var != null) {
            return a(x0Var);
        }
        return null;
    }

    public static final List<x> h(x0 x0Var) {
        int i14 = x0Var == null ? -1 : a.f166034a[x0Var.ordinal()];
        if (i14 == 1) {
            return p13.x.k(x.RUN_ACTIVE, x.RUN_REST, x.PACE_PRO_SPLIT);
        }
        if (i14 == 2) {
            return p13.x.k(x.RUN_ACTIVE, x.OBSTACLE);
        }
        if (i14 == 8 || i14 == 9) {
            return w.c(x.CLIMB_ACTIVE);
        }
        if (i14 == 18 || i14 == 19) {
            return w.c(x.WINDSURF_ACTIVE);
        }
        switch (i14) {
            case 23:
                return p13.x.k(x.ROUND_ACTIVE, x.ROUND_REST);
            case 24:
            case 25:
                return w.c(x.DIVE);
            default:
                if (x0Var != null) {
                    return a(x0Var);
                }
                return null;
        }
    }

    public static final List<x> i(x0 x0Var) {
        int i14 = x0Var == null ? -1 : a.f166034a[x0Var.ordinal()];
        if (i14 == -1) {
            return null;
        }
        if (i14 != 10) {
            switch (i14) {
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    return new ArrayList();
            }
        }
        return w.c(x.SURF_ACTIVE);
    }

    public static final boolean j(x0 x0Var) {
        switch (x0Var == null ? -1 : a.f166034a[x0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return true;
            default:
                return false;
        }
    }

    public static final List<x1> k(List<x1> list, x xVar) {
        list.getClass();
        if (xVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (xVar == ((x1) obj).a2()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean l(x0 x0Var, List<o1> list, boolean z14) {
        x0Var.getClass();
        String str = x0Var.f4358a;
        if (!p13.x.k(x0.D2, x0.f4318p2, x0.W2, x0.O0).contains(x0Var)) {
            y.f55115a.getClass();
            if (!y.a.c(x0Var)) {
                if (z0.b(x0.f4308n, str)) {
                    boolean zD = fr.a.d(list, x.RUN_ACTIVE, x.PACE_PRO_SPLIT);
                    boolean z15 = list != null && g8.i.M(str, list);
                    if (zD || z15 || z14) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
