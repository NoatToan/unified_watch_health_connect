package by0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lby0/a;", "", "<init>", "()V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21686d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f21687a = o13.m.b(new bv0.b(10));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f21688b = o13.m.b(new bv0.b(11));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f21689c = o13.m.b(new bv0.b(12));

    static {
        new C0335a(null);
    }

    public a() {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        i2.f36769a.getClass();
        i2.a.a(a2Var, "EpicScope - MultiDayActivityDataSource - init");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        g gVar;
        j61.j jVar;
        j61.j jVar2;
        aVar.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f21813c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f21813c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(aVar, cVar);
            }
        } else {
            gVar = new g(aVar, cVar);
        }
        Object objE = gVar.f21811a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f21813c;
        DateTime dateTime = null;
        if (i15 == 0) {
            o13.r.b(objE);
            if (b63.p.a(oVar, oVar2) <= 30) {
                ey0.g0 g0VarP = aVar.p();
                gVar.f21813c = 1;
                g0VarP.getClass();
                objE = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.i(g0VarP, oVar, oVar2, null), gVar);
            } else {
                ArrayList arrayList = new ArrayList();
                while (oVar.compareTo(oVar2) < 0) {
                    b63.o oVar3 = (b63.o) r13.b.e(b63.p.c(oVar, new b63.d(0, 0, 30, 3, null)), oVar2);
                    arrayList.add(new o13.p(oVar, oVar3));
                    oVar = oVar3;
                }
                h hVar = new h(arrayList, aVar, null);
                gVar.f21813c = 2;
                objE = o53.c0.e(hVar, gVar);
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
            List<v2> list = (List) objE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (v2 v2Var : list) {
                if (v2Var instanceof v2.b) {
                    Map<String, j61.i> map = ((j61.j) ((v2.b) v2Var).f47386a).f97359c;
                    if (map != null) {
                        linkedHashMap.putAll(map);
                    }
                } else if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    jVar = null;
                    break;
                }
                v2 v2Var2 = (v2) it.next();
                v2.b bVar = v2Var2 instanceof v2.b ? (v2.b) v2Var2 : null;
                jVar = bVar != null ? (j61.j) bVar.f47386a : null;
            } while (jVar == null);
            DateTime dateTime2 = jVar != null ? jVar.f97357a : null;
            Object objM0 = p13.h0.m0(list);
            v2.b bVar2 = objM0 instanceof v2.b ? (v2.b) objM0 : null;
            if (bVar2 != null && (jVar2 = (j61.j) bVar2.f47386a) != null) {
                dateTime = jVar2.f97358b;
            }
            return new j61.j(dateTime2, dateTime, linkedHashMap);
        }
        o13.r.b(objE);
        v2 v2Var3 = (v2) objE;
        if (v2Var3 instanceof v2.b) {
            return (j61.j) ((v2.b) v2Var3).f47386a;
        }
        if (!(v2Var3 instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        w wVar;
        a aVar2;
        mm1.b bVar;
        b63.o oVar3 = oVar;
        b63.o oVar4 = oVar2;
        aVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f22110e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f22110e = i14 - Integer.MIN_VALUE;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                wVar = new w(aVar2, cVar);
            }
        } else {
            aVar2 = aVar;
            wVar = new w(aVar2, cVar);
        }
        Object objJ = wVar.f22108c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f22110e;
        int i16 = 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i15 == 0) {
            o13.r.b(objJ);
            ey0.g0 g0VarP = aVar2.p();
            wVar.f22106a = oVar3;
            wVar.f22107b = oVar4;
            wVar.f22110e = 1;
            g0VarP.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.y(g0VarP, oVar3, oVar4, null), wVar);
            if (objJ == aVar3) {
                return aVar3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b63.o oVar5 = wVar.f22107b;
            b63.o oVar6 = wVar.f22106a;
            o13.r.b(objJ);
            oVar4 = oVar5;
            oVar3 = oVar6;
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF = b71.i.f("GetSleepDailySummary - Result Error:", v2Var);
            i2.f36769a.getClass();
            i2.a.e(a2Var, strF);
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        v2.b bVar2 = (v2.b) v2Var;
        T t7 = bVar2.f47386a;
        String strF2 = e5.f(t7, "GetSleepDailySummary - Result Success - summary:");
        i2.f36769a.getClass();
        i2.a.a(a2Var2, strF2);
        DateTime dateTimeAtStartOfDay = g22.l.h(oVar3).toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        DateTime dateTimeK = vb.h.k(oVar4);
        TreeMap treeMap = new TreeMap();
        p13.u0.k(treeMap, new o13.p[0]);
        int i17 = bVar2.f47387b;
        if (i17 == 200) {
            bVar = (mm1.b) t7;
        } else {
            bVar = new mm1.b(p13.j0.f134944a, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
        }
        new e32.d(str, i16, objArr3 == true ? 1 : 0).a(dateTimeAtStartOfDay, dateTimeK, treeMap, 1, new aq1.d0(bVar.b(), 9));
        Collection collectionValues = treeMap.values();
        collectionValues.getClass();
        return (mm1.b) new v2.b(mm1.b.a(bVar, p13.h0.b1(collectionValues)), i17, null, null, 12, null).f47386a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af A[PHI: r5
      0x00af: PHI (r5v3 java.lang.String) = (r5v1 java.lang.String), (r5v4 java.lang.String) binds: [B:31:0x00ab, B:25:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0 A[PHI: r5
      0x00c0: PHI (r5v5 java.lang.String) = (r5v3 java.lang.String), (r5v6 java.lang.String) binds: [B:34:0x00bc, B:24:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[PHI: r5
      0x00d1: PHI (r5v7 java.lang.String) = (r5v5 java.lang.String), (r5v8 java.lang.String) binds: [B:37:0x00cd, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[PHI: r5
      0x00e2: PHI (r5v9 java.lang.String) = (r5v7 java.lang.String), (r5v10 java.lang.String) binds: [B:40:0x00de, B:22:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[PHI: r5
      0x00f3: PHI (r5v11 java.lang.String) = (r5v9 java.lang.String), (r5v12 java.lang.String) binds: [B:43:0x00ef, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[PHI: r5
      0x0104: PHI (r5v13 java.lang.String) = (r5v11 java.lang.String), (r5v14 java.lang.String) binds: [B:46:0x0100, B:20:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0116 A[PHI: r5
      0x0116: PHI (r5v15 java.lang.String) = (r5v13 java.lang.String), (r5v16 java.lang.String) binds: [B:49:0x0112, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0127 A[PHI: r5
      0x0127: PHI (r5v17 java.lang.String) = (r5v15 java.lang.String), (r5v18 java.lang.String) binds: [B:52:0x0124, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0138 A[PHI: r5
      0x0138: PHI (r5v19 java.lang.String) = (r5v17 java.lang.String), (r5v20 java.lang.String) binds: [B:55:0x0135, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0149 A[PHI: r5
      0x0149: PHI (r5v21 java.lang.String) = (r5v19 java.lang.String), (r5v22 java.lang.String) binds: [B:58:0x0146, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x015a A[PHI: r5
      0x015a: PHI (r5v23 java.lang.String) = (r5v21 java.lang.String), (r5v24 java.lang.String) binds: [B:61:0x0157, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x016b A[PHI: r5
      0x016b: PHI (r5v25 java.lang.String) = (r5v23 java.lang.String), (r5v27 java.lang.String) binds: [B:64:0x0168, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        if (r5.r(r0) == r1) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, v13.c cVar) {
        b bVar;
        g2 g2VarJ;
        g2 g2VarJ2;
        g2 g2VarJ3;
        g2 g2VarJ4;
        g2 g2VarJ5;
        g2 g2VarJ6;
        g2 g2VarJ7;
        g2 g2VarJ8;
        g2 g2VarJ9;
        g2 g2VarJ10;
        g2 g2VarJ11;
        g2 g2VarJ12;
        g2 g2VarJ13;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f21712d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f21712d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f21710b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (bVar.f21712d) {
            case 0:
                o13.r.b(obj);
                g2 g2VarJ14 = j();
                bVar.f21709a = str;
                bVar.f21712d = 1;
                if (g2VarJ14.x(str, bVar) != aVar) {
                    g2VarJ = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 2;
                    if (g2VarJ.q(str, bVar) != aVar) {
                        g2VarJ2 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 3;
                        if (g2VarJ2.w(str, bVar) != aVar) {
                            g2VarJ3 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 4;
                            if (g2VarJ3.B(str, bVar) != aVar) {
                                g2VarJ4 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 5;
                                if (g2VarJ4.C(str, bVar) != aVar) {
                                    g2VarJ5 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 6;
                                    if (g2VarJ5.u(str, bVar) != aVar) {
                                        g2VarJ6 = j();
                                        bVar.f21709a = str;
                                        bVar.f21712d = 7;
                                        if (g2VarJ6.y(str, bVar) != aVar) {
                                            g2VarJ7 = j();
                                            bVar.f21709a = str;
                                            bVar.f21712d = 8;
                                            if (g2VarJ7.s(str, bVar) != aVar) {
                                                g2VarJ8 = j();
                                                bVar.f21709a = str;
                                                bVar.f21712d = 9;
                                                if (g2VarJ8.D(str, bVar) != aVar) {
                                                    g2VarJ9 = j();
                                                    bVar.f21709a = str;
                                                    bVar.f21712d = 10;
                                                    if (g2VarJ9.E(str, bVar) != aVar) {
                                                        g2VarJ10 = j();
                                                        bVar.f21709a = str;
                                                        bVar.f21712d = 11;
                                                        if (g2VarJ10.v(str, bVar) != aVar) {
                                                            g2VarJ11 = j();
                                                            bVar.f21709a = str;
                                                            bVar.f21712d = 12;
                                                            if (g2VarJ11.t(str, bVar) != aVar) {
                                                                g2VarJ12 = j();
                                                                bVar.f21709a = str;
                                                                bVar.f21712d = 13;
                                                                if (g2VarJ12.A(str, bVar) != aVar) {
                                                                    g2VarJ13 = j();
                                                                    bVar.f21709a = null;
                                                                    bVar.f21712d = 14;
                                                                    if (g2VarJ13.z(str, bVar) != aVar) {
                                                                        g2 g2VarJ15 = j();
                                                                        bVar.f21709a = null;
                                                                        bVar.f21712d = 15;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ = j();
                bVar.f21709a = str;
                bVar.f21712d = 2;
                if (g2VarJ.q(str, bVar) != aVar) {
                    g2VarJ2 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 3;
                    if (g2VarJ2.w(str, bVar) != aVar) {
                        g2VarJ3 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 4;
                        if (g2VarJ3.B(str, bVar) != aVar) {
                            g2VarJ4 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 5;
                            if (g2VarJ4.C(str, bVar) != aVar) {
                                g2VarJ5 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 6;
                                if (g2VarJ5.u(str, bVar) != aVar) {
                                    g2VarJ6 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 7;
                                    if (g2VarJ6.y(str, bVar) != aVar) {
                                        g2VarJ7 = j();
                                        bVar.f21709a = str;
                                        bVar.f21712d = 8;
                                        if (g2VarJ7.s(str, bVar) != aVar) {
                                            g2VarJ8 = j();
                                            bVar.f21709a = str;
                                            bVar.f21712d = 9;
                                            if (g2VarJ8.D(str, bVar) != aVar) {
                                                g2VarJ9 = j();
                                                bVar.f21709a = str;
                                                bVar.f21712d = 10;
                                                if (g2VarJ9.E(str, bVar) != aVar) {
                                                    g2VarJ10 = j();
                                                    bVar.f21709a = str;
                                                    bVar.f21712d = 11;
                                                    if (g2VarJ10.v(str, bVar) != aVar) {
                                                        g2VarJ11 = j();
                                                        bVar.f21709a = str;
                                                        bVar.f21712d = 12;
                                                        if (g2VarJ11.t(str, bVar) != aVar) {
                                                            g2VarJ12 = j();
                                                            bVar.f21709a = str;
                                                            bVar.f21712d = 13;
                                                            if (g2VarJ12.A(str, bVar) != aVar) {
                                                                g2VarJ13 = j();
                                                                bVar.f21709a = null;
                                                                bVar.f21712d = 14;
                                                                if (g2VarJ13.z(str, bVar) != aVar) {
                                                                    g2 g2VarJ16 = j();
                                                                    bVar.f21709a = null;
                                                                    bVar.f21712d = 15;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ2 = j();
                bVar.f21709a = str;
                bVar.f21712d = 3;
                if (g2VarJ2.w(str, bVar) != aVar) {
                    g2VarJ3 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 4;
                    if (g2VarJ3.B(str, bVar) != aVar) {
                        g2VarJ4 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 5;
                        if (g2VarJ4.C(str, bVar) != aVar) {
                            g2VarJ5 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 6;
                            if (g2VarJ5.u(str, bVar) != aVar) {
                                g2VarJ6 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 7;
                                if (g2VarJ6.y(str, bVar) != aVar) {
                                    g2VarJ7 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 8;
                                    if (g2VarJ7.s(str, bVar) != aVar) {
                                        g2VarJ8 = j();
                                        bVar.f21709a = str;
                                        bVar.f21712d = 9;
                                        if (g2VarJ8.D(str, bVar) != aVar) {
                                            g2VarJ9 = j();
                                            bVar.f21709a = str;
                                            bVar.f21712d = 10;
                                            if (g2VarJ9.E(str, bVar) != aVar) {
                                                g2VarJ10 = j();
                                                bVar.f21709a = str;
                                                bVar.f21712d = 11;
                                                if (g2VarJ10.v(str, bVar) != aVar) {
                                                    g2VarJ11 = j();
                                                    bVar.f21709a = str;
                                                    bVar.f21712d = 12;
                                                    if (g2VarJ11.t(str, bVar) != aVar) {
                                                        g2VarJ12 = j();
                                                        bVar.f21709a = str;
                                                        bVar.f21712d = 13;
                                                        if (g2VarJ12.A(str, bVar) != aVar) {
                                                            g2VarJ13 = j();
                                                            bVar.f21709a = null;
                                                            bVar.f21712d = 14;
                                                            if (g2VarJ13.z(str, bVar) != aVar) {
                                                                g2 g2VarJ17 = j();
                                                                bVar.f21709a = null;
                                                                bVar.f21712d = 15;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ3 = j();
                bVar.f21709a = str;
                bVar.f21712d = 4;
                if (g2VarJ3.B(str, bVar) != aVar) {
                    g2VarJ4 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 5;
                    if (g2VarJ4.C(str, bVar) != aVar) {
                        g2VarJ5 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 6;
                        if (g2VarJ5.u(str, bVar) != aVar) {
                            g2VarJ6 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 7;
                            if (g2VarJ6.y(str, bVar) != aVar) {
                                g2VarJ7 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 8;
                                if (g2VarJ7.s(str, bVar) != aVar) {
                                    g2VarJ8 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 9;
                                    if (g2VarJ8.D(str, bVar) != aVar) {
                                        g2VarJ9 = j();
                                        bVar.f21709a = str;
                                        bVar.f21712d = 10;
                                        if (g2VarJ9.E(str, bVar) != aVar) {
                                            g2VarJ10 = j();
                                            bVar.f21709a = str;
                                            bVar.f21712d = 11;
                                            if (g2VarJ10.v(str, bVar) != aVar) {
                                                g2VarJ11 = j();
                                                bVar.f21709a = str;
                                                bVar.f21712d = 12;
                                                if (g2VarJ11.t(str, bVar) != aVar) {
                                                    g2VarJ12 = j();
                                                    bVar.f21709a = str;
                                                    bVar.f21712d = 13;
                                                    if (g2VarJ12.A(str, bVar) != aVar) {
                                                        g2VarJ13 = j();
                                                        bVar.f21709a = null;
                                                        bVar.f21712d = 14;
                                                        if (g2VarJ13.z(str, bVar) != aVar) {
                                                            g2 g2VarJ18 = j();
                                                            bVar.f21709a = null;
                                                            bVar.f21712d = 15;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 4:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ4 = j();
                bVar.f21709a = str;
                bVar.f21712d = 5;
                if (g2VarJ4.C(str, bVar) != aVar) {
                    g2VarJ5 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 6;
                    if (g2VarJ5.u(str, bVar) != aVar) {
                        g2VarJ6 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 7;
                        if (g2VarJ6.y(str, bVar) != aVar) {
                            g2VarJ7 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 8;
                            if (g2VarJ7.s(str, bVar) != aVar) {
                                g2VarJ8 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 9;
                                if (g2VarJ8.D(str, bVar) != aVar) {
                                    g2VarJ9 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 10;
                                    if (g2VarJ9.E(str, bVar) != aVar) {
                                        g2VarJ10 = j();
                                        bVar.f21709a = str;
                                        bVar.f21712d = 11;
                                        if (g2VarJ10.v(str, bVar) != aVar) {
                                            g2VarJ11 = j();
                                            bVar.f21709a = str;
                                            bVar.f21712d = 12;
                                            if (g2VarJ11.t(str, bVar) != aVar) {
                                                g2VarJ12 = j();
                                                bVar.f21709a = str;
                                                bVar.f21712d = 13;
                                                if (g2VarJ12.A(str, bVar) != aVar) {
                                                    g2VarJ13 = j();
                                                    bVar.f21709a = null;
                                                    bVar.f21712d = 14;
                                                    if (g2VarJ13.z(str, bVar) != aVar) {
                                                        g2 g2VarJ19 = j();
                                                        bVar.f21709a = null;
                                                        bVar.f21712d = 15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 5:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ5 = j();
                bVar.f21709a = str;
                bVar.f21712d = 6;
                if (g2VarJ5.u(str, bVar) != aVar) {
                    g2VarJ6 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 7;
                    if (g2VarJ6.y(str, bVar) != aVar) {
                        g2VarJ7 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 8;
                        if (g2VarJ7.s(str, bVar) != aVar) {
                            g2VarJ8 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 9;
                            if (g2VarJ8.D(str, bVar) != aVar) {
                                g2VarJ9 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 10;
                                if (g2VarJ9.E(str, bVar) != aVar) {
                                    g2VarJ10 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 11;
                                    if (g2VarJ10.v(str, bVar) != aVar) {
                                        g2VarJ11 = j();
                                        bVar.f21709a = str;
                                        bVar.f21712d = 12;
                                        if (g2VarJ11.t(str, bVar) != aVar) {
                                            g2VarJ12 = j();
                                            bVar.f21709a = str;
                                            bVar.f21712d = 13;
                                            if (g2VarJ12.A(str, bVar) != aVar) {
                                                g2VarJ13 = j();
                                                bVar.f21709a = null;
                                                bVar.f21712d = 14;
                                                if (g2VarJ13.z(str, bVar) != aVar) {
                                                    g2 g2VarJ110 = j();
                                                    bVar.f21709a = null;
                                                    bVar.f21712d = 15;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 6:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ6 = j();
                bVar.f21709a = str;
                bVar.f21712d = 7;
                if (g2VarJ6.y(str, bVar) != aVar) {
                    g2VarJ7 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 8;
                    if (g2VarJ7.s(str, bVar) != aVar) {
                        g2VarJ8 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 9;
                        if (g2VarJ8.D(str, bVar) != aVar) {
                            g2VarJ9 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 10;
                            if (g2VarJ9.E(str, bVar) != aVar) {
                                g2VarJ10 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 11;
                                if (g2VarJ10.v(str, bVar) != aVar) {
                                    g2VarJ11 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 12;
                                    if (g2VarJ11.t(str, bVar) != aVar) {
                                        g2VarJ12 = j();
                                        bVar.f21709a = str;
                                        bVar.f21712d = 13;
                                        if (g2VarJ12.A(str, bVar) != aVar) {
                                            g2VarJ13 = j();
                                            bVar.f21709a = null;
                                            bVar.f21712d = 14;
                                            if (g2VarJ13.z(str, bVar) != aVar) {
                                                g2 g2VarJ111 = j();
                                                bVar.f21709a = null;
                                                bVar.f21712d = 15;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 7:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ7 = j();
                bVar.f21709a = str;
                bVar.f21712d = 8;
                if (g2VarJ7.s(str, bVar) != aVar) {
                    g2VarJ8 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 9;
                    if (g2VarJ8.D(str, bVar) != aVar) {
                        g2VarJ9 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 10;
                        if (g2VarJ9.E(str, bVar) != aVar) {
                            g2VarJ10 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 11;
                            if (g2VarJ10.v(str, bVar) != aVar) {
                                g2VarJ11 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 12;
                                if (g2VarJ11.t(str, bVar) != aVar) {
                                    g2VarJ12 = j();
                                    bVar.f21709a = str;
                                    bVar.f21712d = 13;
                                    if (g2VarJ12.A(str, bVar) != aVar) {
                                        g2VarJ13 = j();
                                        bVar.f21709a = null;
                                        bVar.f21712d = 14;
                                        if (g2VarJ13.z(str, bVar) != aVar) {
                                            g2 g2VarJ112 = j();
                                            bVar.f21709a = null;
                                            bVar.f21712d = 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 8:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ8 = j();
                bVar.f21709a = str;
                bVar.f21712d = 9;
                if (g2VarJ8.D(str, bVar) != aVar) {
                    g2VarJ9 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 10;
                    if (g2VarJ9.E(str, bVar) != aVar) {
                        g2VarJ10 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 11;
                        if (g2VarJ10.v(str, bVar) != aVar) {
                            g2VarJ11 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 12;
                            if (g2VarJ11.t(str, bVar) != aVar) {
                                g2VarJ12 = j();
                                bVar.f21709a = str;
                                bVar.f21712d = 13;
                                if (g2VarJ12.A(str, bVar) != aVar) {
                                    g2VarJ13 = j();
                                    bVar.f21709a = null;
                                    bVar.f21712d = 14;
                                    if (g2VarJ13.z(str, bVar) != aVar) {
                                        g2 g2VarJ113 = j();
                                        bVar.f21709a = null;
                                        bVar.f21712d = 15;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 9:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ9 = j();
                bVar.f21709a = str;
                bVar.f21712d = 10;
                if (g2VarJ9.E(str, bVar) != aVar) {
                    g2VarJ10 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 11;
                    if (g2VarJ10.v(str, bVar) != aVar) {
                        g2VarJ11 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 12;
                        if (g2VarJ11.t(str, bVar) != aVar) {
                            g2VarJ12 = j();
                            bVar.f21709a = str;
                            bVar.f21712d = 13;
                            if (g2VarJ12.A(str, bVar) != aVar) {
                                g2VarJ13 = j();
                                bVar.f21709a = null;
                                bVar.f21712d = 14;
                                if (g2VarJ13.z(str, bVar) != aVar) {
                                    g2 g2VarJ114 = j();
                                    bVar.f21709a = null;
                                    bVar.f21712d = 15;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 10:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ10 = j();
                bVar.f21709a = str;
                bVar.f21712d = 11;
                if (g2VarJ10.v(str, bVar) != aVar) {
                    g2VarJ11 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 12;
                    if (g2VarJ11.t(str, bVar) != aVar) {
                        g2VarJ12 = j();
                        bVar.f21709a = str;
                        bVar.f21712d = 13;
                        if (g2VarJ12.A(str, bVar) != aVar) {
                            g2VarJ13 = j();
                            bVar.f21709a = null;
                            bVar.f21712d = 14;
                            if (g2VarJ13.z(str, bVar) != aVar) {
                                g2 g2VarJ115 = j();
                                bVar.f21709a = null;
                                bVar.f21712d = 15;
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 11:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ11 = j();
                bVar.f21709a = str;
                bVar.f21712d = 12;
                if (g2VarJ11.t(str, bVar) != aVar) {
                    g2VarJ12 = j();
                    bVar.f21709a = str;
                    bVar.f21712d = 13;
                    if (g2VarJ12.A(str, bVar) != aVar) {
                        g2VarJ13 = j();
                        bVar.f21709a = null;
                        bVar.f21712d = 14;
                        if (g2VarJ13.z(str, bVar) != aVar) {
                            g2 g2VarJ116 = j();
                            bVar.f21709a = null;
                            bVar.f21712d = 15;
                        }
                    }
                    break;
                }
                return aVar;
            case 12:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ12 = j();
                bVar.f21709a = str;
                bVar.f21712d = 13;
                if (g2VarJ12.A(str, bVar) != aVar) {
                    g2VarJ13 = j();
                    bVar.f21709a = null;
                    bVar.f21712d = 14;
                    if (g2VarJ13.z(str, bVar) != aVar) {
                        g2 g2VarJ117 = j();
                        bVar.f21709a = null;
                        bVar.f21712d = 15;
                    }
                    break;
                }
                return aVar;
            case 13:
                str = bVar.f21709a;
                o13.r.b(obj);
                g2VarJ13 = j();
                bVar.f21709a = null;
                bVar.f21712d = 14;
                if (g2VarJ13.z(str, bVar) != aVar) {
                    g2 g2VarJ118 = j();
                    bVar.f21709a = null;
                    bVar.f21712d = 15;
                    break;
                }
                return aVar;
            case 14:
                o13.r.b(obj);
                g2 g2VarJ119 = j();
                bVar.f21709a = null;
                bVar.f21712d = 15;
                break;
            case 15:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f21730c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f21730c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objF = cVar2.f21728a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f21730c;
        if (i15 == 0) {
            o13.r.b(objF);
            g2 g2VarJ = j();
            d dVar = new d(this, str, null);
            cVar2.f21730c = 1;
            objF = g2VarJ.f(str, dVar, cVar2);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        return (List) objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f21772c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f21772c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objG = eVar.f21770a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f21772c;
        if (i15 == 0) {
            o13.r.b(objG);
            g2 g2VarJ = j();
            f fVar = new f(this, str, null);
            eVar.f21772c = 1;
            objG = g2VarJ.g(str, fVar, eVar);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        return (cy0.k) objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(List list, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f21875c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f21875c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objA = iVar.f21873a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f21875c;
        if (i15 == 0) {
            o13.r.b(objA);
            g2 g2VarJ = j();
            j jVar = new j(this, null);
            iVar.f21875c = 1;
            objA = g2VarJ.a(list, jVar, iVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return (List) objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f21908c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f21908c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objB = kVar.f21906a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f21908c;
        if (i15 == 0) {
            o13.r.b(objB);
            g2 g2VarJ = j();
            l lVar = new l(oVar, oVar2, this, null);
            kVar.f21908c = 1;
            objB = g2VarJ.b(str, lVar, kVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        return (k61.b) objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f21942c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f21942c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objC = mVar.f21940a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f21942c;
        if (i15 == 0) {
            o13.r.b(objC);
            g2 g2VarJ = j();
            n nVar = new n(oVar, oVar2, this, null);
            mVar.f21942c = 1;
            objC = g2VarJ.c(str, nVar, mVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return (List) objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        o oVar3;
        if (cVar instanceof o) {
            oVar3 = (o) cVar;
            int i14 = oVar3.f21978c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar3.f21978c = i14 - Integer.MIN_VALUE;
            } else {
                oVar3 = new o(this, cVar);
            }
        } else {
            oVar3 = new o(this, cVar);
        }
        Object objD = oVar3.f21976a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar3.f21978c;
        if (i15 == 0) {
            o13.r.b(objD);
            g2 g2VarJ = j();
            p pVar = new p(this, oVar, oVar2, null);
            oVar3.f21978c = 1;
            objD = g2VarJ.d(str, pVar, oVar3);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        return (List) objD;
    }

    public final g2 j() {
        return (g2) this.f21688b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, b63.o oVar, b63.o oVar2, m61.a aVar, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f22012c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f22012c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objE = qVar.f22010a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f22012c;
        if (i15 == 0) {
            o13.r.b(objE);
            g2 g2VarJ = j();
            r rVar = new r(oVar, oVar2, this, aVar, null);
            qVar.f22012c = 1;
            objE = g2VarJ.e(str, aVar, rVar, qVar);
            if (objE == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        return (n61.f) objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object l(b63.o oVar, b63.o oVar2, b63.o oVar3, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f22045c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f22045c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objH = sVar.f22043a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f22045c;
        if (i15 == 0) {
            o13.r.b(objH);
            g2 g2VarJ = j();
            String string = oVar.toString();
            String string2 = oVar2.toString();
            String string3 = oVar3.toString();
            t tVar = new t(this, oVar, oVar2, oVar3, null);
            sVar.f22045c = 1;
            objH = g2VarJ.h(string, string2, string3, tVar, sVar);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        return (cy0.i) objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f22077c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f22077c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objI = uVar.f22075a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f22077c;
        if (i15 == 0) {
            o13.r.b(objI);
            g2 g2VarJ = j();
            v vVar = new v(oVar, oVar2, this, null);
            uVar.f22077c = 1;
            objI = g2VarJ.i(str, vVar, uVar);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        return (List) objI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, v13.c cVar) {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f22124c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f22124c = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objJ = xVar.f22122a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f22124c;
        if (i15 == 0) {
            o13.r.b(objJ);
            g2 g2VarJ = j();
            y yVar = new y(this, str, null);
            xVar.f22124c = 1;
            objJ = g2VarJ.j(str, yVar, xVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        return (List) objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object o(String str, String str2, int i14, int i15, oy0.i iVar, v13.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i16 = zVar.f22154c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                zVar.f22154c = i16 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objK = zVar.f22152a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = zVar.f22154c;
        if (i17 == 0) {
            o13.r.b(objK);
            g2 g2VarJ = j();
            a0 a0Var = new a0(this, str, str2, iVar, null);
            zVar.f22154c = 1;
            objK = g2VarJ.k(str, i14, i15, a0Var, zVar);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        return (List) objK;
    }

    public final ey0.g0 p() {
        return (ey0.g0) this.f21687a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        b0 b0Var;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f21715c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f21715c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object objM = b0Var.f21713a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f21715c;
        if (i15 == 0) {
            o13.r.b(objM);
            g2 g2VarJ = j();
            c0 c0Var = new c0(oVar, oVar2, this, null);
            b0Var.f21715c = 1;
            objM = g2VarJ.m(str, c0Var, b0Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        return (mm1.b) objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        d0 d0Var;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i14 = d0Var.f21757c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f21757c = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object objN = d0Var.f21755a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d0Var.f21757c;
        if (i15 == 0) {
            o13.r.b(objN);
            g2 g2VarJ = j();
            e0 e0Var = new e0(oVar, oVar2, this, null);
            d0Var.f21757c = 1;
            objN = g2VarJ.n(str, e0Var, d0Var);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objN);
        }
        return (List) objN;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f21795c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f21795c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objO = f0Var.f21793a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f21795c;
        if (i15 == 0) {
            o13.r.b(objO);
            g2 g2VarJ = j();
            g0 g0Var = new g0(oVar, oVar2, this, null);
            f0Var.f21795c = 1;
            objO = g2VarJ.o(str, g0Var, f0Var);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objO);
        }
        return (List) objO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(String str, v13.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f21878c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f21878c = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objL = i0Var.f21876a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f21878c;
        if (i15 == 0) {
            o13.r.b(objL);
            g2 g2VarJ = j();
            j0 j0Var = new j0(this, str, null);
            i0Var.f21878c = 1;
            objL = g2VarJ.l(str, j0Var, i0Var);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        return (List) objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, cy0.k kVar, v13.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f21913e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f21913e = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object objJ = k0Var.f21911c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f21913e;
        if (i15 == 0) {
            o13.r.b(objJ);
            ey0.g0 g0VarP = p();
            k0Var.f21909a = str;
            k0Var.f21910b = kVar;
            k0Var.f21913e = 1;
            g0VarP.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.d0(g0VarP, str, kVar, null), k0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = k0Var.f21910b;
            str = k0Var.f21909a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF = b71.i.f("UpdateMultiDayActivityUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            g2 g2VarJ = j();
            g2VarJ.getClass();
            str.getClass();
            kVar.getClass();
            g2VarJ.f21846r.put(str, kVar);
            return gy0.u1.c.f80244a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        Integer num = aVar2.f47384b;
        if (num == null || num.intValue() != 409) {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF2 = b71.i.f("UpdateMultiDayActivityUseCase - Result Error:", v2Var);
            i2.f36769a.getClass();
            i2.a.e(a2Var2, strF2);
            return new gy0.u1.b(aVar2.f47383a, num);
        }
        try {
            cy0.e eVarB = ((cy0.h) GsonUtil.f47253b.fromJson(((v2.a) v2Var).f47385c, cy0.h.class)).b();
            if (eVarB != null) {
                i2.f36769a.getClass();
                i2.a.o(com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY, "UpdateMultiDayActivityUseCase - Result Error-Conflict:" + v2Var);
                return new gy0.u1.a(eVarB);
            }
            i2.f36769a.getClass();
            i2.a.e(com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY, "UpdateMultiDayActivityUseCase - Result Error-Conflict:" + v2Var);
            return new gy0.u1.b(((v2.a) v2Var).f47383a, ((v2.a) v2Var).f47384b);
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strN = fb1.c.n("UpdateMultiDayActivityUseCase - Result Error-Conflict: Error Body is wrong. ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.e(a2Var3, strN);
            return new gy0.u1.b(e4, num);
        }
    }

    /* JADX INFO: renamed from: by0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lby0/a$a;", "", "<init>", "()V", "", "POLYLINE_BATCH_COUNT", "I", "CYCLING_ABILITY_MAX_DAYS", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0335a {
        public /* synthetic */ C0335a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0335a() {
        }
    }
}
