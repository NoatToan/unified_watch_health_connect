package vs1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvs1/y;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f179922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f179923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f179924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f179925d;

    public y() {
        p2 p2VarA = q2.a(z.f179927b);
        this.f179922a = p2VarA;
        p2 p2VarA2 = q2.a(z.f179926a);
        this.f179923b = p2VarA2;
        this.f179924c = r53.s.d(p2VarA);
        this.f179925d = r53.s.d(p2VarA2);
        a(z.f179926a);
        b(z.f179927b);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x016e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126 A[PHI: r20 r21
      0x0126: PHI (r20v3 boolean) = (r20v0 boolean), (r20v0 boolean), (r20v4 boolean), (r20v7 boolean) binds: [B:74:0x012e, B:73:0x012c, B:69:0x0124, B:113:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r21v3 i53.c<us1.h>) = (r21v0 i53.c<us1.h>), (r21v0 i53.c<us1.h>), (r21v4 i53.c<us1.h>), (r21v5 i53.c<us1.h>) binds: [B:74:0x012e, B:73:0x012c, B:69:0x0124, B:113:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0128 A[PHI: r20 r21
      0x0128: PHI (r20v1 boolean) = (r20v0 boolean), (r20v4 boolean), (r20v4 boolean) binds: [B:74:0x012e, B:68:0x0122, B:69:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r21v1 i53.c<us1.h>) = (r21v0 i53.c<us1.h>), (r21v4 i53.c<us1.h>), (r21v4 i53.c<us1.h>) binds: [B:74:0x012e, B:68:0x0122, B:69:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x0149  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:93:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x015f A[ADDED_TO_REGION] */
    public static ArrayList c(List list, us1.n nVar, String str) {
        boolean z14;
        i53.c<us1.j> cVar;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        i53.c<us1.h> cVar2;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean zR;
        list.getClass();
        nVar.getClass();
        i53.c<us1.m> cVar3 = nVar.f172444b;
        i53.c<us1.i> cVar4 = nVar.f172443a;
        boolean z26 = nVar.f172445c;
        i53.c<us1.j> cVar5 = nVar.f172446d;
        qs1.n nVar2 = nVar.f172449g;
        qs1.n nVar3 = nVar.f172448f;
        i53.c<us1.h> cVar6 = nVar.f172447e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pt1.t tVar = (pt1.t) obj;
            boolean z27 = str == 0 || str.length() < 3 || d53.w.z(tVar.f140969c.f140953a, str, true) || d53.w.z(tVar.f140969c.f140956d, str, true);
            if (nVar3 != null) {
                int iB = nVar3.b(nVar3.f147317a);
                int iB2 = nVar3.b(nVar3.f147318b);
                z15 = z27;
                long j8 = tVar.f140975i;
                z14 = z26;
                cVar = cVar5;
                z16 = ((long) iB) <= j8 && j8 <= ((long) iB2);
                if (nVar2 != null) {
                    int iB3 = nVar2.b(nVar2.f147317a);
                    int iB4 = nVar2.b(nVar2.f147318b);
                    long j14 = tVar.f140977k;
                    z17 = z16;
                    z18 = ((long) iB3) > j14 && j14 <= ((long) iB4);
                    pt1.q qVar = tVar.f140969c;
                    i53.c<us1.i> cVar7 = tVar.f140970d;
                    int i14 = tVar.f140982p;
                    boolean z28 = (qVar.f140954b != null && (cVar6 == null || cVar6.isEmpty())) || (qVar.f140954b != null && (cVar6 == null || cVar6.isEmpty() || cVar6.contains(qVar.f140954b)));
                    if (cVar != null || cVar.isEmpty()) {
                        cVar2 = cVar6;
                        z19 = z18;
                        if ((z14 || i14 != 0) && i14 <= 0) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                    } else if (i14 <= 0 || cVar.isEmpty()) {
                        cVar2 = cVar6;
                        z19 = z18;
                        if (z14 || i14 != 0) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                    } else {
                        Iterator<us1.j> it = cVar.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                cVar2 = cVar6;
                                us1.j next = it.next();
                                us1.j jVar = us1.j.FOUR_STARS_AND_MORE;
                                z19 = z18;
                                float f14 = next.f172423a;
                                if (!(next == jVar ? new j23.q(f14, Float.MAX_VALUE) : new j23.q(f14, 1 + f14)).contains(Float.valueOf(tVar.f140981o))) {
                                    z18 = z19;
                                    cVar6 = cVar2;
                                }
                            } else {
                                cVar2 = cVar6;
                                z19 = z18;
                                if (z14) {
                                }
                                z24 = false;
                            }
                            z24 = true;
                        }
                    }
                    if (cVar4 == null && !cVar4.isEmpty() && (cVar7 == null || cVar7.isEmpty() || !cVar7.containsAll(cVar4))) {
                        z25 = false;
                    } else {
                        z25 = true;
                    }
                    if (cVar3 != null || cVar3.isEmpty()) {
                        zR = true;
                    } else {
                        zR = p13.h0.R(cVar3, qVar.f140955c);
                    }
                    if (!z15 && z17 && z19 && z28 && z24 && z25 && zR) {
                        arrayList.add(obj);
                    }
                    z26 = z14;
                    cVar5 = cVar;
                    cVar6 = cVar2;
                } else {
                    z17 = z16;
                }
                pt1.q qVar2 = tVar.f140969c;
                i53.c<us1.i> cVar8 = tVar.f140970d;
                int i15 = tVar.f140982p;
                if (qVar2.f140954b != null) {
                }
                if (cVar != null) {
                    cVar2 = cVar6;
                    z19 = z18;
                    if (z14) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    z24 = true;
                } else {
                    cVar2 = cVar6;
                    z19 = z18;
                    if (z14) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    z24 = true;
                }
                if (cVar4 == null) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (cVar3 != null) {
                    zR = true;
                } else {
                    zR = true;
                }
                if (!z15) {
                }
                z26 = z14;
                cVar5 = cVar;
                cVar6 = cVar2;
            } else {
                z14 = z26;
                cVar = cVar5;
                z15 = z27;
            }
            if (nVar2 != null) {
                int iB5 = nVar2.b(nVar2.f147317a);
                int iB6 = nVar2.b(nVar2.f147318b);
                long j15 = tVar.f140977k;
                z17 = z16;
                if (((long) iB5) > j15) {
                }
                pt1.q qVar3 = tVar.f140969c;
                i53.c<us1.i> cVar9 = tVar.f140970d;
                int i16 = tVar.f140982p;
                if (qVar3.f140954b != null) {
                }
                if (cVar != null) {
                    cVar2 = cVar6;
                    z19 = z18;
                    if (z14) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    z24 = true;
                } else {
                    cVar2 = cVar6;
                    z19 = z18;
                    if (z14) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    z24 = true;
                }
                if (cVar4 == null) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                if (cVar3 != null) {
                    zR = true;
                } else {
                    zR = true;
                }
                if (!z15) {
                }
                z26 = z14;
                cVar5 = cVar;
                cVar6 = cVar2;
            } else {
                z17 = z16;
            }
            pt1.q qVar4 = tVar.f140969c;
            i53.c<us1.i> cVar10 = tVar.f140970d;
            int i17 = tVar.f140982p;
            if (qVar4.f140954b != null) {
            }
            if (cVar != null) {
                cVar2 = cVar6;
                z19 = z18;
                if (z14) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                z24 = true;
            } else {
                cVar2 = cVar6;
                z19 = z18;
                if (z14) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                z24 = true;
            }
            if (cVar4 == null) {
                z25 = true;
            } else {
                z25 = true;
            }
            if (cVar3 != null) {
                zR = true;
            } else {
                zR = true;
            }
            if (!z15) {
            }
            z26 = z14;
            cVar5 = cVar;
            cVar6 = cVar2;
        }
        return arrayList;
    }

    public final void a(us1.n nVar) {
        p2 p2Var;
        Object value;
        nVar.getClass();
        z.f179926a = nVar;
        do {
            p2Var = this.f179922a;
            value = p2Var.getValue();
        } while (!p2Var.b(value, nVar));
        if (nVar.equals(new us1.n(null, null, false, null, null, null, null, 127, null))) {
            return;
        }
        ns1.a.f127814a.getClass();
        ns1.a.a(nVar);
    }

    public final void b(us1.n nVar) {
        p2 p2Var;
        Object value;
        nVar.getClass();
        z.f179927b = nVar;
        do {
            p2Var = this.f179923b;
            value = p2Var.getValue();
        } while (!p2Var.b(value, nVar));
        if (nVar.equals(new us1.n(null, null, false, null, null, null, null, 127, null))) {
            return;
        }
        ns1.a.f127814a.getClass();
        ns1.a.a(nVar);
    }
}
