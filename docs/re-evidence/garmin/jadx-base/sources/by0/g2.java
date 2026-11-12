package by0;

import com.garmin.android.apps.connectmobile.i2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lby0/g2;", "", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53.b f21829a = z53.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z53.b f21830b = z53.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z53.b f21831c = z53.c.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z53.b f21832d = z53.c.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z53.b f21833e = z53.c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z53.b f21834f = z53.c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z53.b f21835g = z53.c.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z53.b f21836h = z53.c.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z53.b f21837i = z53.c.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z53.b f21838j = z53.c.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z53.b f21839k = z53.c.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z53.b f21840l = z53.c.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z53.b f21841m = z53.c.a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z53.b f21842n = z53.c.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z53.b f21843o = z53.c.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z53.b f21844p = z53.c.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z53.b f21845q = z53.c.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f21846r = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f21847s = new LinkedHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f21848t = new LinkedHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f21849u = new LinkedHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f21850v = new LinkedHashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f21851w = new LinkedHashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f21852x = new LinkedHashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f21853y = new LinkedHashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f21854z = new LinkedHashMap();
    public final LinkedHashMap A = new LinkedHashMap();
    public final LinkedHashMap B = new LinkedHashMap();
    public final LinkedHashMap C = new LinkedHashMap();
    public final LinkedHashMap D = new LinkedHashMap();
    public final LinkedHashMap E = new LinkedHashMap();
    public final LinkedHashMap F = new LinkedHashMap();
    public final LinkedHashMap G = new LinkedHashMap();
    public final LinkedHashMap H = new LinkedHashMap();

    public g2() {
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        i2.f36769a.getClass();
        i2.a.a(a2Var, "EpicScope - MultiDayActivityDataStore - init");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(String str, v13.c cVar) {
        b2 b2Var;
        z53.b bVar;
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i14 = b2Var.f21727e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b2Var.f21727e = i14 - Integer.MIN_VALUE;
            } else {
                b2Var = new b2(this, cVar);
            }
        } else {
            b2Var = new b2(this, cVar);
        }
        Object obj = b2Var.f21725c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b2Var.f21727e;
        if (i15 == 0) {
            o13.r.b(obj);
            b2Var.f21723a = str;
            bVar = this.f21841m;
            b2Var.f21724b = bVar;
            b2Var.f21727e = 1;
            if (bVar.c(b2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = b2Var.f21724b;
            String str2 = b2Var.f21723a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(String str, v13.c cVar) {
        c2 c2Var;
        z53.b bVar;
        if (cVar instanceof c2) {
            c2Var = (c2) cVar;
            int i14 = c2Var.f21750e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2Var.f21750e = i14 - Integer.MIN_VALUE;
            } else {
                c2Var = new c2(this, cVar);
            }
        } else {
            c2Var = new c2(this, cVar);
        }
        Object obj = c2Var.f21748c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c2Var.f21750e;
        if (i15 == 0) {
            o13.r.b(obj);
            c2Var.f21746a = str;
            bVar = this.f21832d;
            c2Var.f21747b = bVar;
            c2Var.f21750e = 1;
            if (bVar.c(c2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = c2Var.f21747b;
            String str2 = c2Var.f21746a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(String str, v13.c cVar) {
        d2 d2Var;
        z53.b bVar;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i14 = d2Var.f21769e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d2Var.f21769e = i14 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(this, cVar);
            }
        } else {
            d2Var = new d2(this, cVar);
        }
        Object obj = d2Var.f21767c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d2Var.f21769e;
        if (i15 == 0) {
            o13.r.b(obj);
            d2Var.f21765a = str;
            bVar = this.f21833e;
            d2Var.f21766b = bVar;
            d2Var.f21769e = 1;
            if (bVar.c(d2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = d2Var.f21766b;
            String str2 = d2Var.f21765a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(String str, v13.c cVar) {
        e2 e2Var;
        z53.b bVar;
        if (cVar instanceof e2) {
            e2Var = (e2) cVar;
            int i14 = e2Var.f21788e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e2Var.f21788e = i14 - Integer.MIN_VALUE;
            } else {
                e2Var = new e2(this, cVar);
            }
        } else {
            e2Var = new e2(this, cVar);
        }
        Object obj = e2Var.f21786c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e2Var.f21788e;
        if (i15 == 0) {
            o13.r.b(obj);
            e2Var.f21784a = str;
            bVar = this.f21837i;
            e2Var.f21785b = bVar;
            e2Var.f21788e = 1;
            if (bVar.c(e2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = e2Var.f21785b;
            String str2 = e2Var.f21784a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, v13.c cVar) {
        f2 f2Var;
        z53.b bVar;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
            int i14 = f2Var.f21810e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f2Var.f21810e = i14 - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(this, cVar);
            }
        } else {
            f2Var = new f2(this, cVar);
        }
        Object obj = f2Var.f21808c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f2Var.f21810e;
        if (i15 == 0) {
            o13.r.b(obj);
            f2Var.f21806a = str;
            bVar = this.f21838j;
            f2Var.f21807b = bVar;
            f2Var.f21810e = 1;
            if (bVar.c(f2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = f2Var.f21807b;
            String str2 = f2Var.f21806a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[Catch: all -> 0x0032, LOOP:0: B:42:0x00db->B:44:0x00e1, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:41:0x00d4, B:42:0x00db, B:44:0x00e1, B:45:0x00f4), top: B:50:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(List list, j jVar, v13.c cVar) {
        l0 l0Var;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        ArrayList arrayList;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i15 = l0Var.f21932h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                l0Var.f21932h = i15 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object obj = l0Var.f21930f;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = l0Var.f21932h;
        LinkedHashMap linkedHashMap = this.F;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                l0Var.f21925a = list;
                l0Var.f21926b = jVar;
                aVar = this.f21843o;
                l0Var.f21927c = aVar;
                i14 = 0;
                l0Var.f21929e = 0;
                l0Var.f21932h = 1;
                if (aVar.c(l0Var) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = l0Var.f21928d;
                aVar2 = l0Var.f21927c;
                try {
                    o13.r.b(obj);
                    for (cy0.c cVar2 : (List) obj) {
                        linkedHashMap.put(new Long(cVar2.getActivityId()), cVar2);
                    }
                    ArrayList arrayListC0 = p13.h0.C0(arrayList, (List) obj);
                    aVar2.e(null);
                    return arrayListC0;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.e(null);
                    throw th;
                }
            }
            int i17 = l0Var.f21929e;
            z53.a aVar4 = l0Var.f21927c;
            j jVar2 = l0Var.f21926b;
            List list2 = l0Var.f21925a;
            o13.r.b(obj);
            aVar = aVar4;
            jVar = jVar2;
            i14 = i17;
            list = list2;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cy0.c cVar3 = (cy0.c) linkedHashMap.get(new Long(((Number) it.next()).longValue()));
                if (cVar3 != null) {
                    arrayList2.add(cVar3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!linkedHashMap.containsKey(new Long(((Number) obj2).longValue()))) {
                    arrayList3.add(obj2);
                }
            }
            m0 m0Var = new m0(jVar, arrayList3, null);
            l0Var.f21925a = null;
            l0Var.f21926b = null;
            l0Var.f21927c = aVar;
            l0Var.f21928d = arrayList2;
            l0Var.f21929e = i14;
            l0Var.f21932h = 2;
            Object objE = o53.c0.e(m0Var, l0Var);
            if (objE != aVar3) {
                aVar2 = aVar;
                obj = objE;
                arrayList = arrayList2;
                while (r0.hasNext()) {
                    linkedHashMap.put(new Long(cVar2.getActivityId()), cVar2);
                }
                ArrayList arrayListC1 = p13.h0.C0(arrayList, (List) obj);
                aVar2.e(null);
                return arrayListC1;
            }
            return aVar3;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x0085, B:32:0x008a), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, l lVar, v13.c cVar) {
        n0 n0Var;
        int i14;
        l lVar2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        k61.b bVar;
        String str2;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i15 = n0Var.f21968g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                n0Var.f21968g = i15 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objE = n0Var.f21966e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = n0Var.f21968g;
        LinkedHashMap linkedHashMap = this.f21853y;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                n0Var.f21962a = str;
                n0Var.f21963b = lVar;
                z53.b bVar2 = this.f21836h;
                n0Var.f21964c = bVar2;
                i14 = 0;
                n0Var.f21965d = 0;
                n0Var.f21968g = 1;
                if (bVar2.c(n0Var) != aVar3) {
                    lVar2 = lVar;
                    aVar = bVar2;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = n0Var.f21964c;
                str2 = n0Var.f21962a;
                try {
                    o13.r.b(objE);
                    bVar = (k61.b) objE;
                    if (bVar != null) {
                        linkedHashMap.put(str2, bVar);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        bVar = null;
                    }
                    aVar.e(null);
                    return bVar;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = n0Var.f21965d;
            aVar = n0Var.f21964c;
            l lVar3 = n0Var.f21963b;
            String str3 = n0Var.f21962a;
            o13.r.b(objE);
            lVar2 = lVar3;
            i14 = i17;
            str = str3;
            bVar = (k61.b) linkedHashMap.get(str);
            if (bVar == null) {
                o0 o0Var = new o0(lVar2, null);
                n0Var.f21962a = str;
                n0Var.f21963b = null;
                n0Var.f21964c = aVar;
                n0Var.f21965d = i14;
                n0Var.f21968g = 2;
                objE = o53.c0.e(o0Var, n0Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    bVar = (k61.b) objE;
                    if (bVar != null) {
                        linkedHashMap.put(str2, bVar);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        bVar = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return bVar;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x0085, B:32:0x008a), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, n nVar, v13.c cVar) {
        p0 p0Var;
        int i14;
        n nVar2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i15 = p0Var.f22002g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                p0Var.f22002g = i15 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objE = p0Var.f22000e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = p0Var.f22002g;
        LinkedHashMap linkedHashMap = this.C;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                p0Var.f21996a = str;
                p0Var.f21997b = nVar;
                z53.b bVar = this.f21840l;
                p0Var.f21998c = bVar;
                i14 = 0;
                p0Var.f21999d = 0;
                p0Var.f22002g = 1;
                if (bVar.c(p0Var) != aVar3) {
                    nVar2 = nVar;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = p0Var.f21998c;
                str2 = p0Var.f21996a;
                try {
                    o13.r.b(objE);
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = p0Var.f21999d;
            aVar = p0Var.f21998c;
            n nVar3 = p0Var.f21997b;
            String str3 = p0Var.f21996a;
            o13.r.b(objE);
            nVar2 = nVar3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                q0 q0Var = new q0(nVar2, null);
                p0Var.f21996a = str;
                p0Var.f21997b = null;
                p0Var.f21998c = aVar;
                p0Var.f21999d = i14;
                p0Var.f22002g = 2;
                objE = o53.c0.e(q0Var, p0Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x0085, B:32:0x008a), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, p pVar, v13.c cVar) {
        r0 r0Var;
        int i14;
        p pVar2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i15 = r0Var.f22037g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                r0Var.f22037g = i15 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        Object objE = r0Var.f22035e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = r0Var.f22037g;
        LinkedHashMap linkedHashMap = this.f21851w;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                r0Var.f22031a = str;
                r0Var.f22032b = pVar;
                z53.b bVar = this.f21834f;
                r0Var.f22033c = bVar;
                i14 = 0;
                r0Var.f22034d = 0;
                r0Var.f22037g = 1;
                if (bVar.c(r0Var) != aVar3) {
                    pVar2 = pVar;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = r0Var.f22033c;
                str2 = r0Var.f22031a;
                try {
                    o13.r.b(objE);
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = r0Var.f22034d;
            aVar = r0Var.f22033c;
            p pVar3 = r0Var.f22032b;
            String str3 = r0Var.f22031a;
            o13.r.b(objE);
            pVar2 = pVar3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                s0 s0Var = new s0(pVar2, null);
                r0Var.f22031a = str;
                r0Var.f22032b = null;
                r0Var.f22033c = aVar;
                r0Var.f22034d = i14;
                r0Var.f22037g = 2;
                objE = o53.c0.e(s0Var, r0Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:35:0x009e, B:37:0x00a3, B:39:0x00ab, B:40:0x00af), top: B:47:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:35:0x009e, B:37:0x00a3, B:39:0x00ab, B:40:0x00af), top: B:47:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:35:0x009e, B:37:0x00a3, B:39:0x00ab, B:40:0x00af), top: B:47:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, m61.a aVar, r rVar, v13.c cVar) {
        t0 t0Var;
        int i14;
        m61.a aVar2;
        z53.a aVar3;
        r rVar2;
        Throwable th3;
        z53.a aVar4;
        String str2;
        m61.a aVar5;
        n61.f fVar;
        Map map;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i15 = t0Var.f22069h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                t0Var.f22069h = i15 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object objE = t0Var.f22067f;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i16 = t0Var.f22069h;
        LinkedHashMap linkedHashMap = this.B;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                t0Var.f22062a = str;
                t0Var.f22063b = aVar;
                t0Var.f22064c = rVar;
                z53.b bVar = this.f21839k;
                t0Var.f22065d = bVar;
                i14 = 0;
                t0Var.f22066e = 0;
                t0Var.f22069h = 1;
                if (bVar.c(t0Var) != aVar6) {
                    aVar2 = aVar;
                    aVar3 = bVar;
                    rVar2 = rVar;
                }
                return aVar6;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar4 = t0Var.f22065d;
                aVar5 = t0Var.f22063b;
                str2 = t0Var.f22062a;
                try {
                    o13.r.b(objE);
                    fVar = (n61.f) objE;
                    if (fVar != null) {
                        map = (Map) linkedHashMap.get(str2);
                        if (map != null) {
                            map.put(aVar5, fVar);
                        } else {
                            linkedHashMap.put(str2, p13.u0.f(new o13.p(aVar5, fVar)));
                            Unit unit = Unit.INSTANCE;
                        }
                        aVar3 = aVar4;
                    } else {
                        aVar3 = aVar4;
                        fVar = null;
                    }
                    aVar3.e(null);
                    return fVar;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar4.e(null);
                    throw th3;
                }
            }
            int i17 = t0Var.f22066e;
            aVar3 = t0Var.f22065d;
            r rVar3 = t0Var.f22064c;
            m61.a aVar7 = t0Var.f22063b;
            String str3 = t0Var.f22062a;
            o13.r.b(objE);
            rVar2 = rVar3;
            aVar2 = aVar7;
            i14 = i17;
            str = str3;
            Map map2 = (Map) linkedHashMap.get(str);
            if (map2 != null) {
                fVar = (n61.f) map2.get(aVar2);
                if (fVar == null) {
                }
                aVar3.e(null);
                return fVar;
            }
            u0 u0Var = new u0(rVar2, null);
            t0Var.f22062a = str;
            t0Var.f22063b = aVar2;
            t0Var.f22064c = null;
            t0Var.f22065d = aVar3;
            t0Var.f22066e = i14;
            t0Var.f22069h = 2;
            objE = o53.c0.e(u0Var, t0Var);
            if (objE != aVar6) {
                m61.a aVar8 = aVar2;
                str2 = str;
                aVar4 = aVar3;
                aVar5 = aVar8;
                fVar = (n61.f) objE;
                if (fVar != null) {
                    map = (Map) linkedHashMap.get(str2);
                    if (map != null) {
                        map.put(aVar5, fVar);
                    } else {
                        linkedHashMap.put(str2, p13.u0.f(new o13.p(aVar5, fVar)));
                        Unit unit2 = Unit.INSTANCE;
                    }
                    aVar3 = aVar4;
                } else {
                    aVar3 = aVar4;
                    fVar = null;
                }
                aVar3.e(null);
                return fVar;
            }
            return aVar6;
        } catch (Throwable th5) {
            z53.a aVar9 = aVar3;
            th3 = th5;
            aVar4 = aVar9;
            aVar4.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, d dVar, v13.c cVar) {
        v0 v0Var;
        int i14;
        d dVar2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i15 = v0Var.f22100g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                v0Var.f22100g = i15 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object objE = v0Var.f22098e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = v0Var.f22100g;
        LinkedHashMap linkedHashMap = this.f21848t;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                v0Var.f22094a = str;
                v0Var.f22095b = dVar;
                z53.b bVar = this.f21831c;
                v0Var.f22096c = bVar;
                i14 = 0;
                v0Var.f22097d = 0;
                v0Var.f22100g = 1;
                if (bVar.c(v0Var) != aVar3) {
                    dVar2 = dVar;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = v0Var.f22096c;
                str2 = v0Var.f22094a;
                try {
                    o13.r.b(objE);
                    linkedHashMap.put(str2, (List) objE);
                    list = (List) objE;
                    aVar = aVar2;
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = v0Var.f22097d;
            aVar = v0Var.f22096c;
            d dVar3 = v0Var.f22095b;
            String str3 = v0Var.f22094a;
            o13.r.b(objE);
            dVar2 = dVar3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                w0 w0Var = new w0(dVar2, null);
                v0Var.f22094a = str;
                v0Var.f22095b = null;
                v0Var.f22096c = aVar;
                v0Var.f22097d = i14;
                v0Var.f22100g = 2;
                objE = o53.c0.e(w0Var, v0Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    linkedHashMap.put(str2, (List) objE);
                    list = (List) objE;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, f fVar, v13.c cVar) {
        x0 x0Var;
        int i14;
        f fVar2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        cy0.k kVar;
        String str2;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i15 = x0Var.f22131g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                x0Var.f22131g = i15 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objE = x0Var.f22129e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = x0Var.f22131g;
        LinkedHashMap linkedHashMap = this.f21846r;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                x0Var.f22125a = str;
                x0Var.f22126b = fVar;
                z53.b bVar = this.f21829a;
                x0Var.f22127c = bVar;
                i14 = 0;
                x0Var.f22128d = 0;
                x0Var.f22131g = 1;
                if (bVar.c(x0Var) != aVar3) {
                    fVar2 = fVar;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = x0Var.f22127c;
                str2 = x0Var.f22125a;
                try {
                    o13.r.b(objE);
                    linkedHashMap.put(str2, (cy0.k) objE);
                    kVar = (cy0.k) objE;
                    aVar = aVar2;
                    aVar.e(null);
                    return kVar;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = x0Var.f22128d;
            aVar = x0Var.f22127c;
            f fVar3 = x0Var.f22126b;
            String str3 = x0Var.f22125a;
            o13.r.b(objE);
            fVar2 = fVar3;
            i14 = i17;
            str = str3;
            kVar = (cy0.k) linkedHashMap.get(str);
            if (kVar == null) {
                y0 y0Var = new y0(fVar2, null);
                x0Var.f22125a = str;
                x0Var.f22126b = null;
                x0Var.f22127c = aVar;
                x0Var.f22128d = i14;
                x0Var.f22131g = 2;
                objE = o53.c0.e(y0Var, x0Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    linkedHashMap.put(str2, (cy0.k) objE);
                    kVar = (cy0.k) objE;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.e(null);
            return kVar;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:30:0x00ad, B:32:0x00b2), top: B:41:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00b2, please report this as an issue */
    public final Object h(String str, String str2, String str3, t tVar, v13.c cVar) {
        z0 z0Var;
        int i14;
        String str4;
        z53.a aVar;
        t tVar2;
        String str5;
        Throwable th3;
        z53.a aVar2;
        cy0.i iVar;
        String str6;
        String str7;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i15 = z0Var.f22163i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                z0Var.f22163i = i15 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object objE = z0Var.f22161g;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = z0Var.f22163i;
        LinkedHashMap linkedHashMap = this.E;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                z0Var.f22155a = str;
                z0Var.f22156b = str2;
                z0Var.f22157c = str3;
                z0Var.f22158d = tVar;
                z53.b bVar = this.f21842n;
                z0Var.f22159e = bVar;
                i14 = 0;
                z0Var.f22160f = 0;
                z0Var.f22163i = 1;
                if (bVar.c(z0Var) != aVar3) {
                    str4 = str2;
                    aVar = bVar;
                    tVar2 = tVar;
                    str5 = str3;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = z0Var.f22159e;
                str7 = z0Var.f22157c;
                str4 = z0Var.f22156b;
                str6 = z0Var.f22155a;
                try {
                    o13.r.b(objE);
                    iVar = (cy0.i) objE;
                    if (iVar != null) {
                        linkedHashMap.put(str6 + str4 + str7, iVar);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        iVar = null;
                    }
                    aVar.e(null);
                    return iVar;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = z0Var.f22160f;
            aVar = z0Var.f22159e;
            t tVar3 = z0Var.f22158d;
            String str8 = z0Var.f22157c;
            String str9 = z0Var.f22156b;
            String str10 = z0Var.f22155a;
            o13.r.b(objE);
            tVar2 = tVar3;
            str5 = str8;
            str4 = str9;
            i14 = i17;
            str = str10;
            iVar = (cy0.i) linkedHashMap.get(str + str4 + str5);
            if (iVar == null) {
                a1 a1Var = new a1(tVar2, null);
                z0Var.f22155a = str;
                z0Var.f22156b = str4;
                z0Var.f22157c = str5;
                z0Var.f22158d = null;
                z0Var.f22159e = aVar;
                z0Var.f22160f = i14;
                z0Var.f22163i = 2;
                objE = o53.c0.e(a1Var, z0Var);
                if (objE != aVar3) {
                    String str11 = str5;
                    str6 = str;
                    aVar2 = aVar;
                    str7 = str11;
                    iVar = (cy0.i) objE;
                    if (iVar != null) {
                        linkedHashMap.put(str6 + str4 + str7, iVar);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        iVar = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return iVar;
        } catch (Throwable th5) {
            z53.a aVar4 = aVar;
            th3 = th5;
            aVar2 = aVar4;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x0085, B:32:0x008a), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, v vVar, v13.c cVar) {
        b1 b1Var;
        int i14;
        v vVar2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i15 = b1Var.f21722g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                b1Var.f21722g = i15 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objE = b1Var.f21720e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = b1Var.f21722g;
        LinkedHashMap linkedHashMap = this.f21852x;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                b1Var.f21716a = str;
                b1Var.f21717b = vVar;
                z53.b bVar = this.f21835g;
                b1Var.f21718c = bVar;
                i14 = 0;
                b1Var.f21719d = 0;
                b1Var.f21722g = 1;
                if (bVar.c(b1Var) != aVar3) {
                    vVar2 = vVar;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = b1Var.f21718c;
                str2 = b1Var.f21716a;
                try {
                    o13.r.b(objE);
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = b1Var.f21719d;
            aVar = b1Var.f21718c;
            v vVar3 = b1Var.f21717b;
            String str3 = b1Var.f21716a;
            o13.r.b(objE);
            vVar2 = vVar3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                c1 c1Var = new c1(vVar2, null);
                b1Var.f21716a = str;
                b1Var.f21717b = null;
                b1Var.f21718c = aVar;
                b1Var.f21719d = i14;
                b1Var.f21722g = 2;
                objE = o53.c0.e(c1Var, b1Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, y yVar, v13.c cVar) {
        d1 d1Var;
        int i14;
        y yVar2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i15 = d1Var.f21764g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                d1Var.f21764g = i15 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        Object objE = d1Var.f21762e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = d1Var.f21764g;
        LinkedHashMap linkedHashMap = this.G;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                d1Var.f21758a = str;
                d1Var.f21759b = yVar;
                z53.b bVar = this.f21844p;
                d1Var.f21760c = bVar;
                i14 = 0;
                d1Var.f21761d = 0;
                d1Var.f21764g = 1;
                if (bVar.c(d1Var) != aVar3) {
                    yVar2 = yVar;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = d1Var.f21760c;
                str2 = d1Var.f21758a;
                try {
                    o13.r.b(objE);
                    linkedHashMap.put(str2, (List) objE);
                    list = (List) objE;
                    aVar = aVar2;
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = d1Var.f21761d;
            aVar = d1Var.f21760c;
            y yVar3 = d1Var.f21759b;
            String str3 = d1Var.f21758a;
            o13.r.b(objE);
            yVar2 = yVar3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                e1 e1Var = new e1(yVar2, null);
                d1Var.f21758a = str;
                d1Var.f21759b = null;
                d1Var.f21760c = aVar;
                d1Var.f21761d = i14;
                d1Var.f21764g = 2;
                objE = o53.c0.e(e1Var, d1Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    linkedHashMap.put(str2, (List) objE);
                    list = (List) objE;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, int i14, int i15, a0 a0Var, v13.c cVar) {
        f1 f1Var;
        int i16;
        a0 a0Var2;
        z53.a aVar;
        z53.a aVar2;
        List listC0;
        String str2;
        List list;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i17 = f1Var.f21805j;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                f1Var.f21805j = i17 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object objE = f1Var.f21803h;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i18 = f1Var.f21805j;
        LinkedHashMap linkedHashMap = this.D;
        try {
            if (i18 == 0) {
                o13.r.b(objE);
                f1Var.f21796a = str;
                f1Var.f21797b = a0Var;
                z53.b bVar = this.f21841m;
                f1Var.f21798c = bVar;
                f1Var.f21800e = i14;
                f1Var.f21801f = i15;
                i16 = 0;
                f1Var.f21802g = 0;
                f1Var.f21805j = 1;
                if (bVar.c(f1Var) != aVar3) {
                    a0Var2 = a0Var;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i18 != 1) {
                if (i18 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = f1Var.f21799d;
                aVar2 = f1Var.f21798c;
                str2 = f1Var.f21796a;
                try {
                    o13.r.b(objE);
                    listC0 = p13.h0.C0(list, (List) objE);
                    linkedHashMap.put(str2, listC0);
                    aVar = aVar2;
                    aVar.e(null);
                    return listC0;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.e(null);
                    throw th;
                }
            }
            int i19 = f1Var.f21802g;
            i15 = f1Var.f21801f;
            i14 = f1Var.f21800e;
            aVar = f1Var.f21798c;
            a0 a0Var3 = f1Var.f21797b;
            String str3 = f1Var.f21796a;
            o13.r.b(objE);
            a0Var2 = a0Var3;
            i16 = i19;
            str = str3;
            listC0 = (List) linkedHashMap.get(str);
            if (listC0 == null) {
                listC0 = p13.j0.f134944a;
            }
            int i24 = i14 + i15;
            if (listC0.isEmpty() || i24 > listC0.size()) {
                g1 g1Var = new g1(a0Var2, i14, i15, null);
                f1Var.f21796a = str;
                f1Var.f21797b = null;
                f1Var.f21798c = aVar;
                f1Var.f21799d = listC0;
                f1Var.f21800e = i14;
                f1Var.f21801f = i15;
                f1Var.f21802g = i16;
                f1Var.f21805j = 2;
                objE = o53.c0.e(g1Var, f1Var);
                if (objE != aVar3) {
                    str2 = str;
                    aVar2 = aVar;
                    list = listC0;
                    listC0 = p13.h0.C0(list, (List) objE);
                    linkedHashMap.put(str2, listC0);
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.e(null);
            return listC0;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, j0 j0Var, v13.c cVar) {
        h1 h1Var;
        int i14;
        j0 j0Var2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i15 = h1Var.f21872g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                h1Var.f21872g = i15 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, cVar);
            }
        } else {
            h1Var = new h1(this, cVar);
        }
        Object objE = h1Var.f21870e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = h1Var.f21872g;
        LinkedHashMap linkedHashMap = this.f21849u;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                h1Var.f21866a = str;
                h1Var.f21867b = j0Var;
                z53.b bVar = this.f21832d;
                h1Var.f21868c = bVar;
                i14 = 0;
                h1Var.f21869d = 0;
                h1Var.f21872g = 1;
                if (bVar.c(h1Var) != aVar3) {
                    j0Var2 = j0Var;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = h1Var.f21868c;
                str2 = h1Var.f21866a;
                try {
                    o13.r.b(objE);
                    linkedHashMap.put(str2, (List) objE);
                    list = (List) objE;
                    aVar = aVar2;
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = h1Var.f21869d;
            aVar = h1Var.f21868c;
            j0 j0Var3 = h1Var.f21867b;
            String str3 = h1Var.f21866a;
            o13.r.b(objE);
            j0Var2 = j0Var3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                i1 i1Var = new i1(j0Var2, null);
                h1Var.f21866a = str;
                h1Var.f21867b = null;
                h1Var.f21868c = aVar;
                h1Var.f21869d = i14;
                h1Var.f21872g = 2;
                objE = o53.c0.e(i1Var, h1Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    linkedHashMap.put(str2, (List) objE);
                    list = (List) objE;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, c0 c0Var, v13.c cVar) {
        j1 j1Var;
        int i14;
        c0 c0Var2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        mm1.b bVar;
        String str2;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i15 = j1Var.f21905g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                j1Var.f21905g = i15 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, cVar);
            }
        } else {
            j1Var = new j1(this, cVar);
        }
        Object objE = j1Var.f21903e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = j1Var.f21905g;
        LinkedHashMap linkedHashMap = this.f21850v;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                j1Var.f21899a = str;
                j1Var.f21900b = c0Var;
                z53.b bVar2 = this.f21833e;
                j1Var.f21901c = bVar2;
                i14 = 0;
                j1Var.f21902d = 0;
                j1Var.f21905g = 1;
                if (bVar2.c(j1Var) != aVar3) {
                    c0Var2 = c0Var;
                    aVar = bVar2;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = j1Var.f21901c;
                str2 = j1Var.f21899a;
                try {
                    o13.r.b(objE);
                    linkedHashMap.put(str2, (mm1.b) objE);
                    bVar = (mm1.b) objE;
                    aVar = aVar2;
                    aVar.e(null);
                    return bVar;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = j1Var.f21902d;
            aVar = j1Var.f21901c;
            c0 c0Var3 = j1Var.f21900b;
            String str3 = j1Var.f21899a;
            o13.r.b(objE);
            c0Var2 = c0Var3;
            i14 = i17;
            str = str3;
            bVar = (mm1.b) linkedHashMap.get(str);
            if (bVar == null) {
                k1 k1Var = new k1(c0Var2, null);
                j1Var.f21899a = str;
                j1Var.f21900b = null;
                j1Var.f21901c = aVar;
                j1Var.f21902d = i14;
                j1Var.f21905g = 2;
                objE = o53.c0.e(k1Var, j1Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    linkedHashMap.put(str2, (mm1.b) objE);
                    bVar = (mm1.b) objE;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.e(null);
            return bVar;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x0085, B:32:0x008a), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, e0 e0Var, v13.c cVar) {
        l1 l1Var;
        int i14;
        e0 e0Var2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i15 = l1Var.f21939g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                l1Var.f21939g = i15 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object objE = l1Var.f21937e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = l1Var.f21939g;
        LinkedHashMap linkedHashMap = this.f21854z;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                l1Var.f21933a = str;
                l1Var.f21934b = e0Var;
                z53.b bVar = this.f21837i;
                l1Var.f21935c = bVar;
                i14 = 0;
                l1Var.f21936d = 0;
                l1Var.f21939g = 1;
                if (bVar.c(l1Var) != aVar3) {
                    e0Var2 = e0Var;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = l1Var.f21935c;
                str2 = l1Var.f21933a;
                try {
                    o13.r.b(objE);
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = l1Var.f21936d;
            aVar = l1Var.f21935c;
            e0 e0Var3 = l1Var.f21934b;
            String str3 = l1Var.f21933a;
            o13.r.b(objE);
            e0Var2 = e0Var3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                m1 m1Var = new m1(e0Var2, null);
                l1Var.f21933a = str;
                l1Var.f21934b = null;
                l1Var.f21935c = aVar;
                l1Var.f21936d = i14;
                l1Var.f21939g = 2;
                objE = o53.c0.e(m1Var, l1Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x0085, B:32:0x008a), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, g0 g0Var, v13.c cVar) {
        n1 n1Var;
        int i14;
        g0 g0Var2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        List list;
        String str2;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i15 = n1Var.f21975g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                n1Var.f21975g = i15 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, cVar);
            }
        } else {
            n1Var = new n1(this, cVar);
        }
        Object objE = n1Var.f21973e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = n1Var.f21975g;
        LinkedHashMap linkedHashMap = this.A;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                n1Var.f21969a = str;
                n1Var.f21970b = g0Var;
                z53.b bVar = this.f21838j;
                n1Var.f21971c = bVar;
                i14 = 0;
                n1Var.f21972d = 0;
                n1Var.f21975g = 1;
                if (bVar.c(n1Var) != aVar3) {
                    g0Var2 = g0Var;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = n1Var.f21971c;
                str2 = n1Var.f21969a;
                try {
                    o13.r.b(objE);
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                    aVar.e(null);
                    return list;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = n1Var.f21972d;
            aVar = n1Var.f21971c;
            g0 g0Var3 = n1Var.f21970b;
            String str3 = n1Var.f21969a;
            o13.r.b(objE);
            g0Var2 = g0Var3;
            i14 = i17;
            str = str3;
            list = (List) linkedHashMap.get(str);
            if (list == null) {
                o1 o1Var = new o1(g0Var2, null);
                n1Var.f21969a = str;
                n1Var.f21970b = null;
                n1Var.f21971c = aVar;
                n1Var.f21972d = i14;
                n1Var.f21975g = 2;
                objE = o53.c0.e(o1Var, n1Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    list = (List) objE;
                    if (list != null) {
                        linkedHashMap.put(str2, list);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        list = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return list;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:30:0x0085, B:32:0x008a), top: B:41:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(String str, h0 h0Var, v13.c cVar) throws Throwable {
        p1 p1Var;
        int i14;
        h0 h0Var2;
        z53.a aVar;
        Throwable th3;
        z53.a aVar2;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str2;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i15 = p1Var.f22009g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                p1Var.f22009g = i15 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(this, cVar);
            }
        } else {
            p1Var = new p1(this, cVar);
        }
        Object objE = p1Var.f22007e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = p1Var.f22009g;
        LinkedHashMap linkedHashMap = this.H;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                p1Var.f22003a = str;
                p1Var.f22004b = h0Var;
                z53.b bVar = this.f21845q;
                p1Var.f22005c = bVar;
                i14 = 0;
                p1Var.f22006d = 0;
                p1Var.f22009g = 1;
                if (bVar.c(p1Var) != aVar3) {
                    h0Var2 = h0Var;
                    aVar = bVar;
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = p1Var.f22005c;
                str2 = p1Var.f22003a;
                try {
                    o13.r.b(objE);
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) objE;
                    if (lVar != null) {
                        linkedHashMap.put(str2, lVar);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        lVar = null;
                    }
                    aVar.e(null);
                    return lVar;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = p1Var.f22006d;
            aVar = p1Var.f22005c;
            h0 h0Var3 = p1Var.f22004b;
            String str3 = p1Var.f22003a;
            o13.r.b(objE);
            h0Var2 = h0Var3;
            i14 = i17;
            str = str3;
            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) linkedHashMap.get(str);
            if (lVar == null) {
                q1 q1Var = new q1(h0Var2, null);
                p1Var.f22003a = str;
                p1Var.f22004b = null;
                p1Var.f22005c = aVar;
                p1Var.f22006d = i14;
                p1Var.f22009g = 2;
                objE = o53.c0.e(q1Var, p1Var);
                if (objE != aVar3) {
                    z53.a aVar4 = aVar;
                    str2 = str;
                    aVar2 = aVar4;
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) objE;
                    if (lVar != null) {
                        linkedHashMap.put(str2, lVar);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        lVar = null;
                    }
                }
                return aVar3;
            }
            aVar.e(null);
            return lVar;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, v13.c cVar) {
        r1 r1Var;
        z53.b bVar;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f22042e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f22042e = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object obj = r1Var.f22040c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f22042e;
        if (i15 == 0) {
            o13.r.b(obj);
            r1Var.f22038a = str;
            bVar = this.f21830b;
            r1Var.f22039b = bVar;
            r1Var.f22042e = 1;
            if (bVar.c(r1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = r1Var.f22039b;
            String str2 = r1Var.f22038a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(v13.c cVar) {
        s1 s1Var;
        z53.b bVar;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i14 = s1Var.f22055d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s1Var.f22055d = i14 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object obj = s1Var.f22053b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s1Var.f22055d;
        if (i15 == 0) {
            o13.r.b(obj);
            z53.b bVar2 = this.f21843o;
            s1Var.f22052a = bVar2;
            s1Var.f22055d = 1;
            if (bVar2.c(s1Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = s1Var.f22052a;
            o13.r.b(obj);
        }
        try {
            this.F.clear();
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, v13.c cVar) {
        t1 t1Var;
        z53.b bVar;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i14 = t1Var.f22074e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t1Var.f22074e = i14 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(this, cVar);
            }
        } else {
            t1Var = new t1(this, cVar);
        }
        Object obj = t1Var.f22072c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t1Var.f22074e;
        if (i15 == 0) {
            o13.r.b(obj);
            t1Var.f22070a = str;
            bVar = this.f21836h;
            t1Var.f22071b = bVar;
            t1Var.f22074e = 1;
            if (bVar.c(t1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = t1Var.f22071b;
            String str2 = t1Var.f22070a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(String str, v13.c cVar) {
        u1 u1Var;
        z53.b bVar;
        if (cVar instanceof u1) {
            u1Var = (u1) cVar;
            int i14 = u1Var.f22088e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u1Var.f22088e = i14 - Integer.MIN_VALUE;
            } else {
                u1Var = new u1(this, cVar);
            }
        } else {
            u1Var = new u1(this, cVar);
        }
        Object obj = u1Var.f22086c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u1Var.f22088e;
        if (i15 == 0) {
            o13.r.b(obj);
            u1Var.f22084a = str;
            bVar = this.f21840l;
            u1Var.f22085b = bVar;
            u1Var.f22088e = 1;
            if (bVar.c(u1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = u1Var.f22085b;
            String str2 = u1Var.f22084a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, v13.c cVar) {
        v1 v1Var;
        z53.b bVar;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i14 = v1Var.f22105e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v1Var.f22105e = i14 - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(this, cVar);
            }
        } else {
            v1Var = new v1(this, cVar);
        }
        Object obj = v1Var.f22103c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v1Var.f22105e;
        if (i15 == 0) {
            o13.r.b(obj);
            v1Var.f22101a = str;
            bVar = this.f21834f;
            v1Var.f22102b = bVar;
            v1Var.f22105e = 1;
            if (bVar.c(v1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = v1Var.f22102b;
            String str2 = v1Var.f22101a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(String str, v13.c cVar) {
        w1 w1Var;
        z53.b bVar;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i14 = w1Var.f22121e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w1Var.f22121e = i14 - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(this, cVar);
            }
        } else {
            w1Var = new w1(this, cVar);
        }
        Object obj = w1Var.f22119c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w1Var.f22121e;
        if (i15 == 0) {
            o13.r.b(obj);
            w1Var.f22117a = str;
            bVar = this.f21839k;
            w1Var.f22118b = bVar;
            w1Var.f22121e = 1;
            if (bVar.c(w1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = w1Var.f22118b;
            String str2 = w1Var.f22117a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(String str, v13.c cVar) {
        x1 x1Var;
        z53.b bVar;
        if (cVar instanceof x1) {
            x1Var = (x1) cVar;
            int i14 = x1Var.f22136e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x1Var.f22136e = i14 - Integer.MIN_VALUE;
            } else {
                x1Var = new x1(this, cVar);
            }
        } else {
            x1Var = new x1(this, cVar);
        }
        Object obj = x1Var.f22134c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x1Var.f22136e;
        if (i15 == 0) {
            o13.r.b(obj);
            x1Var.f22132a = str;
            bVar = this.f21831c;
            x1Var.f22133b = bVar;
            x1Var.f22136e = 1;
            if (bVar.c(x1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = x1Var.f22133b;
            String str2 = x1Var.f22132a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(String str, v13.c cVar) {
        y1 y1Var;
        z53.b bVar;
        if (cVar instanceof y1) {
            y1Var = (y1) cVar;
            int i14 = y1Var.f22151e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y1Var.f22151e = i14 - Integer.MIN_VALUE;
            } else {
                y1Var = new y1(this, cVar);
            }
        } else {
            y1Var = new y1(this, cVar);
        }
        Object obj = y1Var.f22149c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y1Var.f22151e;
        if (i15 == 0) {
            o13.r.b(obj);
            y1Var.f22147a = str;
            bVar = this.f21829a;
            y1Var.f22148b = bVar;
            y1Var.f22151e = 1;
            if (bVar.c(y1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = y1Var.f22148b;
            String str2 = y1Var.f22147a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(String str, v13.c cVar) {
        z1 z1Var;
        z53.b bVar;
        if (cVar instanceof z1) {
            z1Var = (z1) cVar;
            int i14 = z1Var.f22168e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z1Var.f22168e = i14 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(this, cVar);
            }
        } else {
            z1Var = new z1(this, cVar);
        }
        Object obj = z1Var.f22166c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z1Var.f22168e;
        if (i15 == 0) {
            o13.r.b(obj);
            z1Var.f22164a = str;
            bVar = this.f21835g;
            z1Var.f22165b = bVar;
            z1Var.f22168e = 1;
            if (bVar.c(z1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = z1Var.f22165b;
            String str2 = z1Var.f22164a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(String str, v13.c cVar) {
        a2 a2Var;
        z53.b bVar;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i14 = a2Var.f21708e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a2Var.f21708e = i14 - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(this, cVar);
            }
        } else {
            a2Var = new a2(this, cVar);
        }
        Object obj = a2Var.f21706c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a2Var.f21708e;
        if (i15 == 0) {
            o13.r.b(obj);
            a2Var.f21704a = str;
            bVar = this.f21844p;
            a2Var.f21705b = bVar;
            a2Var.f21708e = 1;
            if (bVar.c(a2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = a2Var.f21705b;
            String str2 = a2Var.f21704a;
            o13.r.b(obj);
            bVar = bVar2;
            str = str2;
        }
        try {
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
