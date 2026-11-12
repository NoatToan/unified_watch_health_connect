package fg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w0;
import p13.j0;
import r53.b2;
import r53.e2;
import r53.p2;
import r53.q2;
import uf2.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lfg2/f;", "", "Lfg2/b;", "definitionSource", "Lof2/c0;", "manager", "Lvf2/q;", "workoutDataSource", "Lnf2/a;", "bluetoothManager", "Lfg2/c;", "deviceProvider", "<init>", "(Lfg2/b;Lof2/c0;Lvf2/q;Lnf2/a;Lfg2/c;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    public static final /* synthetic */ int L = 0;
    public final b2 A;
    public final p2 B;
    public final b2 C;
    public zf2.f D;
    public List<Integer> E;
    public final fe2.z F;
    public final e G;
    public final e H;
    public final e I;
    public final e J;
    public final e K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of2.c0 f71478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf2.q f71479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nf2.a f71480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f71481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f71482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f71483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f71484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f71485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f71486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f71487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f71488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f71489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f71490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f71491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f71492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f71493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f71494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p2 f71495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f71496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p2 f71497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f71498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zf2.d f71499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ag2.d f71500x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public jg2.a f71501y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p2 f71502z;

    static {
        new a(null);
    }

    public f(b bVar, of2.c0 c0Var, vf2.q qVar, nf2.a aVar, c cVar) {
        bVar.getClass();
        c0Var.getClass();
        qVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f71477a = bVar;
        this.f71478b = c0Var;
        this.f71479c = qVar;
        this.f71480d = aVar;
        this.f71481e = cVar;
        this.f71482f = q2.a(null);
        p2 p2VarA = q2.a(null);
        this.f71483g = p2VarA;
        this.f71484h = p2VarA;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA2 = q2.a(bool);
        this.f71485i = p2VarA2;
        this.f71486j = p2VarA2;
        p2 p2VarA3 = q2.a(j0.f134944a);
        this.f71487k = p2VarA3;
        this.f71488l = p2VarA3;
        p2 p2VarA4 = q2.a(bool);
        this.f71489m = p2VarA4;
        this.f71490n = p2VarA4;
        p2 p2VarA5 = q2.a(bool);
        this.f71491o = p2VarA5;
        this.f71492p = p2VarA5;
        p2 p2VarA6 = q2.a(fg2.a.d.f71402a);
        this.f71493q = p2VarA6;
        this.f71494r = p2VarA6;
        p2 p2VarA7 = q2.a(null);
        this.f71495s = p2VarA7;
        this.f71496t = p2VarA7;
        p2 p2VarA8 = q2.a(bool);
        this.f71497u = p2VarA8;
        this.f71498v = p2VarA8;
        p2 p2VarA9 = q2.a(null);
        this.f71502z = p2VarA9;
        this.A = r53.s.d(p2VarA9);
        p2 p2VarA10 = q2.a(null);
        this.B = p2VarA10;
        this.C = r53.s.d(p2VarA10);
        int i14 = 2;
        this.F = new fe2.z(this, i14);
        this.G = new e(this, 0);
        this.H = new e(this, 1);
        this.I = new e(this, i14);
        this.J = new e(this, 3);
        this.K = new e(this, 4);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new o(this, null), 3);
        ge1.b.T(o53.c0.a(s0.f129406a), null, null, new k(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(f fVar, v13.c cVar) {
        j jVar;
        String str;
        p2 p2Var;
        fVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f71522d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f71522d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(fVar, cVar);
            }
        } else {
            jVar = new j(fVar, cVar);
        }
        Object objB = jVar.f71520b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f71522d;
        if (i15 == 0) {
            o13.r.b(objB);
            of2.b0 b0Var = (of2.b0) fVar.f71482f.getValue();
            if (b0Var != null && (str = b0Var.f131748e) != null) {
                p2 p2Var2 = fVar.f71487k;
                vf2.q qVar = fVar.f71479c;
                jVar.f71519a = p2Var2;
                jVar.f71522d = 1;
                objB = qVar.b(str, jVar);
                if (objB == aVar) {
                    return aVar;
                }
                p2Var = p2Var2;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p2Var = jVar.f71519a;
        o13.r.b(objB);
        p2Var.setValue(objB);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a b(f fVar, tf2.e eVar, v13.c cVar) {
        l lVar;
        fVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f71528c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f71528c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(fVar, cVar);
            }
        } else {
            lVar = new l(fVar, cVar);
        }
        Object obj = lVar.f71526a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f71528c;
        if (i15 == 0) {
            o13.r.b(obj);
            e2 e2Var = eVar.f164468a;
            m mVar = new m(fVar);
            lVar.f71528c = 1;
            e2Var.getClass();
            if (e2.m(e2Var, mVar, lVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a c(f fVar, tf2.f fVar2, v13.c cVar) {
        p pVar;
        fVar.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f71549c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f71549c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(fVar, cVar);
            }
        } else {
            pVar = new p(fVar, cVar);
        }
        Object obj = pVar.f71547a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f71549c;
        if (i15 == 0) {
            o13.r.b(obj);
            e2 e2Var = fVar2.f164468a;
            q qVar = new q(fVar);
            pVar.f71549c = 1;
            e2Var.getClass();
            if (e2.m(e2Var, qVar, pVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r9 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(v13.c cVar) {
        g gVar;
        Object objC;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f71508c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f71508c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f71506a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f71508c;
        of2.c0 c0Var = this.f71478b;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (!((Boolean) c0Var.f131784m.getValue()).booleanValue()) {
            gVar.f71508c = 1;
            uf2.s sVarF = c0Var.f131773b.f();
            uf2.u uVarC = sVarF.c();
            dt2.g gVar2 = sVarF.f170501b;
            uVarC.getClass();
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityInteractorAppToDevice", "sendStopPreviewMetricRequest - messenger:" + gVar2);
            if (gVar2 == null || (objC = ge1.b.j(uVarC.f170507b, null, null, new k0(gVar2, null), 3).C(gVar)) != aVar) {
                objC = Unit.INSTANCE;
            }
            if (objC != aVar) {
                objC = Unit.INSTANCE;
            }
            if (objC != aVar) {
                objC = Unit.INSTANCE;
            }
            if (objC != aVar) {
            }
        }
        return aVar;
        gVar.f71508c = 2;
        of2.b bVarG = c0Var.g();
        if (bVarG == null || (objF = c0Var.f(bVarG, gVar)) != aVar) {
            Object objF = Unit.INSTANCE;
        }
    }

    public final mf2.h e() {
        of2.b bVar = (of2.b) this.f71478b.f131778g.getValue();
        if (bVar != null) {
            return bVar.f131725d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(Long l14, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f71514d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f71514d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objE = hVar.f71512b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f71514d;
        try {
            if (i15 == 0) {
                o13.r.b(objE);
                if (l14 == null) {
                    return new zf2.e(null, null, 3, null);
                }
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivityRepository", "Successfully fetching info metadata for device " + l14);
                c cVar2 = this.f71481e;
                long jLongValue = l14.longValue();
                hVar.f71511a = l14;
                hVar.f71514d = 1;
                objE = cVar2.e(jLongValue, hVar);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l14 = hVar.f71511a;
                o13.r.b(objE);
            }
            return (zf2.e) objE;
        } catch (Exception e4) {
            zg2.c cVar3 = zg2.c.f204692a;
            String str = "Error fetching info metadata for device " + l14 + ": " + e4.getMessage();
            cVar3.getClass();
            zg2.c.b("LiveActivityRepository", str);
            return new zf2.e(null, null, 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(zf2.d dVar, boolean z14, jg2.a aVar, long j8, v13.c cVar) {
        i iVar;
        ag2.d dVarA;
        ag2.a[] aVarArr;
        ArrayList arrayList;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f71518d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f71518d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objF = iVar.f71516b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f71518d;
        ArrayList arrayList2 = null;
        if (i15 == 0) {
            o13.r.b(objF);
            if (this.f71500x == null || dVar != this.f71499w || !p005kotlin.jvm.internal.s.g(aVar, this.f71501y)) {
                this.f71499w = dVar;
                this.f71501y = aVar;
                if (dVar != null) {
                    ((bh2.c) KoinJavaComponent.get$default(bh2.c.class, null, null, 6, null)).getClass();
                    boolean zA = bh2.c.a(aVar);
                    b bVar = this.f71477a;
                    if (zA) {
                        ag2.d dVarA2 = bVar.a(dVar.f204631c);
                        w0 w0Var = new w0(2);
                        List<ag2.a> listB = dVarA2.b();
                        if (listB != null) {
                            ArrayList arrayList3 = new ArrayList(p13.y.r(listB, 10));
                            for (ag2.a aVar3 : listB) {
                                if (aVar3.c() == ag2.a.EnumC0052a.STATS) {
                                    aVar3 = new ag2.a(ag2.a.EnumC0052a.ACTIVITY_DETAILS.f3166a, aVar3.b());
                                }
                                arrayList3.add(aVar3);
                            }
                            aVarArr = (ag2.a[]) arrayList3.toArray(new ag2.a[0]);
                            if (aVarArr == null) {
                                aVarArr = new ag2.a[0];
                            }
                        } else {
                            aVarArr = new ag2.a[0];
                        }
                        w0Var.b(aVarArr);
                        w0Var.a(new ag2.a(ag2.a.EnumC0052a.DEVICE_INFO.f3166a, null));
                        ArrayList<Object> arrayList4 = w0Var.f105816a;
                        dVarA = ag2.d.a(dVarA2, p13.x.k(arrayList4.toArray(new ag2.a[arrayList4.size()])));
                    } else {
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityRepository", "shouldLoadStructuredConfigFile: " + z14);
                        dVarA = bVar.a(z14 ? dVar.f204632d : dVar.f204630b);
                    }
                    iVar.f71515a = dVarA;
                    iVar.f71518d = 1;
                    objF = this.f71481e.f(j8, iVar);
                    if (objF == aVar2) {
                        return aVar2;
                    }
                }
            }
            return this.f71500x;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dVarA = iVar.f71515a;
        o13.r.b(objF);
        Iterable iterable = (Iterable) objF;
        ArrayList arrayList5 = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList5.add(new ag2.c(((ag2.c.a) it.next()).f3218a));
        }
        Set setG1 = p13.h0.g1(arrayList5);
        List<ag2.a> listB2 = dVarA.b();
        if (listB2 != null) {
            ArrayList arrayList6 = new ArrayList(p13.y.r(listB2, 10));
            for (ag2.a aVarA : listB2) {
                if (aVarA.c() == ag2.a.EnumC0052a.STATS || aVarA.c() == ag2.a.EnumC0052a.ACTIVITY_DETAILS) {
                    List<ag2.c> listB3 = aVarA.b();
                    if (listB3 != null) {
                        arrayList = new ArrayList();
                        for (Object obj : listB3) {
                            if (!setG1.contains((ag2.c) obj)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    aVarA = ag2.a.a(aVarA, arrayList);
                }
                arrayList6.add(aVarA);
            }
            arrayList2 = arrayList6;
        }
        this.f71500x = ag2.d.a(dVarA, arrayList2);
        return this.f71500x;
    }

    public final ah2.g h() {
        return (ah2.g) this.f71478b.f131777f.getValue();
    }

    public final i53.c i() {
        of2.b bVar = (of2.b) this.f71478b.f131778g.getValue();
        if (bVar == null) {
            return null;
        }
        List<rf2.b> list = bVar.f131727f.f137574a.get();
        list.getClass();
        return i53.a.e(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f71553c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f71553c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f71551a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f71553c;
        if (i15 == 0) {
            o13.r.b(obj);
            rVar.f71553c = 1;
            Object objL = this.f71478b.l(rVar);
            return objL == aVar ? aVar : objL;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(boolean z14, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f71556c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f71556c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f71554a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f71556c;
        if (i15 == 0) {
            o13.r.b(obj);
            sVar.f71556c = 1;
            Object objI = this.f71478b.i(z14, sVar);
            return objI == aVar ? aVar : objI;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f71559c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f71559c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f71557a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f71559c;
        if (i15 == 0) {
            o13.r.b(obj);
            tVar.f71559c = 1;
            Object objJ = this.f71478b.j(tVar);
            return objJ == aVar ? aVar : objJ;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f71562c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f71562c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.f71560a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f71562c;
        if (i15 == 0) {
            o13.r.b(obj);
            uVar.f71562c = 1;
            Object objM = this.f71478b.m(uVar);
            return objM == aVar ? aVar : objM;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(v13.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f71565c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f71565c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.f71563a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f71565c;
        if (i15 == 0) {
            o13.r.b(obj);
            vVar.f71565c = 1;
            Object objN = this.f71478b.n(vVar);
            return objN == aVar ? aVar : objN;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(Integer num, v13.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f71568c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f71568c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj = wVar.f71566a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f71568c;
        if (i15 == 0) {
            o13.r.b(obj);
            wVar.f71568c = 1;
            Object objO = this.f71478b.o(num, wVar);
            return objO == aVar ? aVar : objO;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(v13.c cVar) {
        x xVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f71571c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f71571c = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj = xVar.f71569a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f71571c;
        if (i15 == 0) {
            o13.r.b(obj);
            xVar.f71571c = 1;
            Object objP = this.f71478b.p(xVar);
            return objP == aVar ? aVar : objP;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            return ((o13.q) obj).f128597a;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final void q(boolean z14) {
        this.f71489m.k(null, Boolean.valueOf(z14 && !((Boolean) this.f71492p.getValue()).booleanValue()));
    }

    public final void r(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f71491o;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.valueOf(z14)));
    }

    public final void s(boolean z14) {
        this.f71497u.k(null, Boolean.valueOf(z14));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfg2/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
