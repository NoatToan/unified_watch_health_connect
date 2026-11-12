package yo;

import android.os.Bundle;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import o53.i0;
import o53.m0;
import o53.s0;
import okhttp3.Headers;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import ps.d1;
import r53.c2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyo/e;", "", "Lo53/b0;", "coroutineScope", "<init>", "(Lo53/b0;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f198230s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f198231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f198232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f198233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f198234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<o13.p<yo.a, List<Object>>> f198235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<o13.p<Object, Integer>> f198236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f198237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wo.b f198238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<List<d1>> f198239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f198240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<vo.e> f198241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<Boolean> f198242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f198243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f198244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f198245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f198246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f198247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w0<o13.p<yo.a, List<Object>>> f198248r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo$pollLegEditUploadStatus$1", f = "MultisportEditLegsRepo.kt", l = {328}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198249a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f198251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f198252d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, Long l14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f198251c = list;
            this.f198252d = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(this.f198251c, this.f198252d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198249a;
            if (i14 == 0) {
                o13.r.b(obj);
                List<String> list = this.f198251c;
                String str = list.get(0);
                str.getClass();
                String str2 = str;
                String str3 = list.get(1);
                str3.getClass();
                String str4 = str3;
                Long l14 = this.f198252d;
                l14.getClass();
                long jLongValue = l14.longValue();
                this.f198249a = 1;
                int i15 = e.f198230s;
                if (e.this.b(jLongValue, str2, str4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f198253a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f198253a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f198253a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f198253a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public e(b0 b0Var) {
        b0Var.getClass();
        this.f198231a = b0Var;
        this.f198232b = o13.m.b(new ya0.j(14));
        this.f198233c = o13.m.b(new ya0.j(15));
        this.f198234d = new r();
        y0<o13.p<yo.a, List<Object>>> y0Var = new y0<>();
        this.f198235e = y0Var;
        y0<o13.p<Object, Integer>> y0Var2 = new y0<>();
        this.f198236f = y0Var2;
        w wVar = new w();
        this.f198237g = wVar;
        this.f198239i = wVar.f198318h;
        this.f198241k = new y0<>();
        this.f198242l = new y0<>(Boolean.FALSE);
        w0<o13.p<yo.a, List<Object>>> w0Var = new w0<>();
        w0Var.n(y0Var, new c(new androidx.lifecycle.k(w0Var, 11)));
        w0Var.n(y0Var2, new c(new x9.b(24, w0Var, this)));
        this.f198248r = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object a(e eVar, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, v13.c cVar) {
        i iVar;
        c83.a0 a0Var;
        y0<List<d1>> y0Var = eVar.f198239i;
        w wVar = eVar.f198237g;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f198267d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f198267d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(eVar, cVar);
            }
        } else {
            iVar = new i(eVar, cVar);
        }
        Object objAwait = iVar.f198265b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f198267d;
        Object next = null;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                eVar.f198246p = hVar.f29448a;
                eVar.f198247q = hVar;
                i0<c83.a0<d>> i0VarC = ((q) eVar.f198233c.getValue()).c(eVar.f198246p);
                iVar.f198264a = hVar;
                iVar.f198267d = 1;
                objAwait = i0VarC.await(iVar);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hVar = iVar.f198264a;
                o13.r.b(objAwait);
            }
            a0Var = (c83.a0) objAwait;
        } catch (Exception unused) {
            a0Var = null;
        }
        if (a0Var == null || !a0Var.f25745a.isSuccessful()) {
            y0Var.j(new ArrayList());
        } else {
            d dVar = (d) a0Var.f25746b;
            if (dVar != null) {
                eVar.f198240j = dVar.getReconstruct();
                wVar.getClass();
                wVar.f198312b = dVar;
                ActivityDetailChartDTO activityDetailChartDTO = new ActivityDetailChartDTO();
                activityDetailChartDTO.c0(dVar.b());
                activityDetailChartDTO.f0(dVar.a());
                activityDetailChartDTO.e0(dVar.getPolyline());
                eVar.f198242l.j(Boolean.valueOf(dVar.getPolyline() != null));
                eVar.f198238h = new wo.b(activityDetailChartDTO, hVar);
                wVar.j(activityDetailChartDTO);
                Iterator<T> it = dVar.getReconstruct().a().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long startTime = ((yo.c) next).getStartTime();
                        do {
                            Object next2 = it.next();
                            long startTime2 = ((yo.c) next2).getStartTime();
                            if (startTime > startTime2) {
                                next = next2;
                                startTime = startTime2;
                            }
                        } while (it.hasNext());
                    }
                }
                yo.c cVar2 = (yo.c) next;
                if (cVar2 != null) {
                    cVar2.getClass();
                } else {
                    long j8 = hVar.f29460m.f29492c;
                }
                ArrayList arrayListG = oi0.c.G(dVar);
                Iterator it3 = arrayListG.iterator();
                double d14 = 0.0d;
                double d15 = 0.0d;
                while (it3.hasNext()) {
                    d15 += ((d1) it3.next()).f139786b;
                }
                eVar.f198244n = d15;
                Iterator it4 = arrayListG.iterator();
                while (it4.hasNext()) {
                    d14 += ((d1) it4.next()).f139787c;
                }
                eVar.f198245o = d14;
                wVar.f198313c = arrayListG;
                wVar.f198314d = new ArrayList(arrayListG);
                y0Var.j(arrayListG);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r9.collect(r10, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j8, String str, String str2, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f198259f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f198259f = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f198257d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f198259f;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = fVar.f198256c;
                str2 = fVar.f198255b;
                str = fVar.f198254a;
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
        int i16 = this.f198243m;
        if (i16 >= 5) {
            return Unit.INSTANCE;
        }
        this.f198243m = i16 + 1;
        fVar.f198254a = str;
        fVar.f198255b = str2;
        fVar.f198256c = j8;
        fVar.f198259f = 1;
        if (m0.b(j8, fVar) != aVar) {
        }
        return aVar;
        c2 c2Var = new c2(new k(this, str, str2, null));
        x53.c cVar2 = s0.f129406a;
        r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
        g gVar = new g(this);
        fVar.f198254a = null;
        fVar.f198255b = null;
        fVar.f198256c = j8;
        fVar.f198259f = 2;
    }

    public final void c(vo.e eVar) {
        eVar.getClass();
        this.f198241k.j(null);
        this.f198237g.a(eVar.f178997c, eVar.f178998d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i14, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i15 = hVar.f198263c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar.f198263c = i15 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objB = hVar.f198261a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = hVar.f198263c;
        if (i16 == 0) {
            o13.r.b(objB);
            hVar.f198263c = 1;
            objB = this.f198237g.b(i14, hVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        vo.e eVar = (vo.e) objB;
        if (eVar.f178995a == z.NORMAL) {
            c(eVar);
        }
        return Unit.INSTANCE;
    }

    public final y0 e(w9.a aVar, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
        List<yo.c> listA;
        hVar.getClass();
        a0 a0Var = this.f198240j;
        y0<List<d1>> y0Var = this.f198239i;
        if (a0Var != null && (listA = a0Var.a()) != null && (!listA.isEmpty())) {
            return y0Var;
        }
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVar, x53.b.f189152a, null, new j(this, hVar, null), 2);
        return y0Var;
    }

    public final o13.p<zm.p, Integer> f(int i14, int i15, fz.c cVar) {
        double d14;
        List<d1> listSubList;
        double d15;
        double d16;
        cVar.getClass();
        y0<List<d1>> y0Var = this.f198239i;
        List<d1> listD = y0Var.d();
        d1 d1Var = listD != null ? (d1) h0.e0(i15, listD) : null;
        List<d1> listD2 = y0Var.d();
        d1 d1Var2 = listD2 != null ? (d1) h0.e0(i15 + 1, listD2) : null;
        List<d1> listD3 = y0Var.d();
        boolean z14 = i15 == (listD3 != null ? p13.x.i(listD3).f96797b : -1);
        if (d1Var == null) {
            return null;
        }
        double d17 = 0.0d;
        if (cVar == fz.c.TIME) {
            d14 = d1Var.f139789e - d1Var.f139786b;
        } else {
            List<d1> listD4 = y0Var.d();
            if (listD4 == null || (listSubList = listD4.subList(0, i15)) == null) {
                d14 = 0.0d;
            } else {
                Iterator<T> it = listSubList.iterator();
                double d18 = 0.0d;
                while (it.hasNext()) {
                    d18 += ((d1) it.next()).f139787c;
                }
                d14 = d18;
            }
        }
        fz.c cVar2 = fz.c.TIME;
        if (cVar == cVar2) {
            if (z14) {
                d16 = this.f198244n;
            } else {
                d15 = d1Var.f139786b + d14;
                if (d1Var2 != null) {
                    d17 = d1Var2.f139786b;
                }
                d16 = d15 + d17;
            }
        } else if (z14) {
            d16 = this.f198245o;
        } else {
            d15 = d1Var.f139787c + d14;
            if (d1Var2 != null) {
                d17 = d1Var2.f139787c;
            }
            d16 = d15 + d17;
        }
        double d19 = d16;
        double d24 = d14;
        wo.b bVar = this.f198238h;
        if (bVar != null) {
            return new o13.p<>(bVar.a(d24, d19, i14, cVar), Integer.valueOf((int) (cVar == cVar2 ? d1Var.f139786b : d1Var.f139787c)));
        }
        p005kotlin.jvm.internal.s.m("chartDataHandler");
        throw null;
    }

    public final void g(List<? extends Object> list) {
        list.getClass();
        o13.p<String, Long> pVarE = bm.m.e(list);
        if ((pVarE != null ? pVarE.f128594a : null) != null) {
            String str = pVarE.f128594a;
            Long l14 = pVarE.f128595b;
            List<String> listF = bm.m.f(str);
            if (listF == null || listF.size() <= 1) {
                return;
            }
            x53.c cVar = s0.f129406a;
            ge1.b.T(this.f198231a, x53.b.f189152a, null, new b(listF, l14, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(Headers headers, v13.c cVar) {
        l lVar;
        List<String> listF;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f198280d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f198280d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object obj = lVar2.f198278b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar2.f198280d;
        if (i15 == 0) {
            o13.r.b(obj);
            String str = headers.get(HttpHeaders.LOCATION);
            String str2 = headers.get("location-in-milliseconds");
            long j8 = (str2 != null ? Long.parseLong(str2) : 0L) / 1000;
            listF = bm.m.f(str);
            if (listF != null && listF.size() > 1) {
                String str3 = listF.get(0);
                str3.getClass();
                String str4 = listF.get(1);
                str4.getClass();
                lVar2.f198277a = listF;
                lVar2.f198280d = 1;
                if (b(j8, str3, str4, lVar2) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listF = lVar2.f198277a;
            o13.r.b(obj);
        }
        return listF == null ? j0.f134944a : listF;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03e4, code lost:
    
        if (r1 == r3) goto L183;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(zo.k kVar, v13.c cVar) {
        m mVar;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        long startTime;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var;
        double d14;
        double d15;
        long j8;
        long endTime;
        w wVar;
        y0<o13.p<yo.a, List<Object>>> y0Var;
        zo.k kVar2;
        long j14;
        List<yo.c> listA;
        Object next;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2;
        List<yo.c> listA2;
        Object next2;
        c83.a0 a0Var;
        int i14;
        int i15;
        Response response;
        int i16;
        Iterator it;
        int i17;
        int i18;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i19 = mVar.f198287g;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                mVar.f198287g = i19 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objAwait = mVar.f198285e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i24 = mVar.f198287g;
        y0<o13.p<yo.a, List<Object>>> y0Var2 = this.f198235e;
        w wVar2 = this.f198237g;
        if (i24 != 0) {
            if (i24 == 1) {
                long j15 = mVar.f198284d;
                j8 = mVar.f198283c;
                startTime = mVar.f198282b;
                kVar2 = mVar.f198281a;
                try {
                    o13.r.b(objAwait);
                    y0Var = y0Var2;
                    wVar = wVar2;
                    j14 = j15;
                    a0Var = (c83.a0) objAwait;
                } catch (Exception unused) {
                    y0Var = y0Var2;
                    wVar = wVar2;
                    j14 = j15;
                    a0Var = null;
                }
            } else {
                if (i24 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objAwait);
                y0Var = y0Var2;
            }
            y0Var.j(new o13.p<>(yo.a.SUCCESS, (List) objAwait));
            return Unit.INSTANCE;
        }
        o13.r.b(objAwait);
        this.f198243m = 0;
        y0Var2.j(new o13.p<>(yo.a.LOADING, j0.f134944a));
        a0 a0Var2 = this.f198240j;
        if (a0Var2 == null || (listA2 = a0Var2.a()) == null) {
            hVar = this.f198247q;
            if (hVar != null || (i0Var = hVar.f29460m) == null) {
                startTime = 0;
            } else {
                startTime = i0Var.f29492c;
            }
        } else {
            Iterator<T> it3 = listA2.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    long startTime2 = ((yo.c) next2).getStartTime();
                    do {
                        Object next3 = it3.next();
                        long startTime3 = ((yo.c) next3).getStartTime();
                        if (startTime2 > startTime3) {
                            next2 = next3;
                            startTime2 = startTime3;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next2 = null;
            }
            yo.c cVar2 = (yo.c) next2;
            if (cVar2 != null) {
                startTime = cVar2.getStartTime();
            } else {
                hVar = this.f198247q;
                if (hVar != null) {
                    startTime = 0;
                } else {
                    startTime = 0;
                }
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f198247q;
        if (hVar2 == null || (i0Var2 = hVar2.f29460m) == null) {
            d14 = 1.0d;
            d15 = 1.0d;
        } else {
            d14 = 1.0d;
            d15 = i0Var2.f29516i;
        }
        j8 = (long) (d15 - d14);
        a0 a0Var3 = this.f198240j;
        if (a0Var3 == null || (listA = a0Var3.a()) == null) {
            endTime = startTime + j8;
        } else {
            Iterator<T> it4 = listA.iterator();
            if (it4.hasNext()) {
                next = it4.next();
                if (it4.hasNext()) {
                    long endTime2 = ((yo.c) next).getEndTime();
                    do {
                        Object next4 = it4.next();
                        long endTime3 = ((yo.c) next4).getEndTime();
                        if (endTime2 < endTime3) {
                            next = next4;
                            endTime2 = endTime3;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next = null;
            }
            yo.c cVar3 = (yo.c) next;
            if (cVar3 != null) {
                endTime = cVar3.getEndTime();
            } else {
                endTime = startTime + j8;
            }
        }
        long j16 = endTime;
        ArrayList arrayListG = oi0.c.G(wVar2.f());
        List<d1> listE = wVar2.e();
        ?? r14 = wVar2.f198315e;
        ?? r15 = wVar2.f198317g;
        r rVar = this.f198234d;
        rVar.getClass();
        r14.getClass();
        r15.getClass();
        wVar = wVar2;
        ArrayList arrayList = new ArrayList();
        ArrayList<d1> arrayList2 = (ArrayList) listE;
        for (d1 d1Var : arrayList2) {
            ArrayList arrayList3 = arrayListG;
            y0<o13.p<yo.a, List<Object>>> y0Var3 = y0Var2;
            r rVar2 = rVar;
            to.o oVarB = rVar.f198297a.b(d1Var.f139790f);
            long j17 = j16;
            double d16 = d1Var.f139789e;
            long jF = (long) oi0.c.F(d16 - d1Var.f139786b, r14, r15);
            long jF2 = (long) oi0.c.F(d16, r14, r15);
            Long l14 = d1Var.f139785a;
            if (l14 != null) {
                if (oVarB != null) {
                    arrayList.add(new yo.c(l14, "EDIT", oVarB, jF, jF2));
                }
            } else if (oVarB != null) {
                arrayList.add(new yo.c(null, "ADD", oVarB, jF, jF2));
            }
            y0Var2 = y0Var3;
            arrayListG = arrayList3;
            rVar = rVar2;
            j16 = j17;
        }
        long j18 = j16;
        y0Var = y0Var2;
        ArrayList<d1> arrayList4 = new ArrayList();
        for (Object obj2 : arrayListG) {
            d1 d1Var2 = (d1) obj2;
            ArrayList arrayList5 = new ArrayList(p13.y.r(listE, 10));
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((d1) it5.next()).f139785a);
            }
            if (!arrayList5.contains(d1Var2.f139785a)) {
                arrayList4.add(obj2);
            }
        }
        for (d1 d1Var3 : arrayList4) {
            double d17 = d1Var3.f139789e;
            arrayList.add(new yo.c(d1Var3.f139785a, FirebasePerformance.HttpMethod.DELETE, null, (long) ((startTime + d17) - d1Var3.f139786b), startTime + ((long) d17)));
        }
        try {
            i0<c83.a0<Object>> i0VarB = ((q) this.f198233c.getValue()).b(this.f198246p, new a0(arrayList));
            kVar2 = kVar;
            try {
                mVar.f198281a = kVar2;
                mVar.f198282b = startTime;
                mVar.f198283c = j8;
                j14 = j18;
                try {
                    mVar.f198284d = j14;
                    mVar.f198287g = 1;
                    objAwait = i0VarB.await(mVar);
                    if (objAwait != obj) {
                        a0Var = (c83.a0) objAwait;
                    }
                } catch (Exception unused2) {
                    a0Var = null;
                }
            } catch (Exception unused3) {
                j14 = j18;
                a0Var = null;
            }
        } catch (Exception unused4) {
            kVar2 = kVar;
        }
        return obj;
        if (a0Var != null) {
            Response response2 = a0Var.f25745a;
            if (response2.isSuccessful()) {
                if (kVar2 == zo.k.CONVERT_TO_MULTISPORT) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "ConvertedToMultisport");
                    response = response2;
                } else {
                    ArrayList arrayList6 = (ArrayList) wVar.e();
                    if (arrayList6.isEmpty()) {
                        i14 = 0;
                    } else {
                        Iterator it6 = arrayList6.iterator();
                        i14 = 0;
                        while (it6.hasNext()) {
                            if (((d1) it6.next()).f139785a == null && (i14 = i14 + 1) < 0) {
                                p13.x.p();
                                throw null;
                            }
                        }
                    }
                    ArrayList arrayListG2 = oi0.c.G(wVar.f());
                    if (arrayListG2.isEmpty()) {
                        i15 = 0;
                    } else {
                        Iterator it7 = arrayListG2.iterator();
                        i15 = 0;
                        while (it7.hasNext()) {
                            d1 d1Var4 = (d1) it7.next();
                            List<d1> listE2 = wVar.e();
                            Response response3 = response2;
                            Iterator it8 = it7;
                            ArrayList arrayList7 = new ArrayList(p13.y.r(listE2, 10));
                            Iterator it9 = ((ArrayList) listE2).iterator();
                            while (it9.hasNext()) {
                                arrayList7.add(((d1) it9.next()).f139785a);
                            }
                            if (!arrayList7.contains(d1Var4.f139785a) && (i15 = i15 + 1) < 0) {
                                p13.x.p();
                                throw null;
                            }
                            it7 = it8;
                            response2 = response3;
                        }
                    }
                    response = response2;
                    ArrayList arrayListG3 = oi0.c.G(wVar.f());
                    if (arrayListG3.isEmpty()) {
                        i16 = 0;
                    } else {
                        Iterator it10 = arrayListG3.iterator();
                        i16 = 0;
                        while (it10.hasNext()) {
                            d1 d1Var5 = (d1) it10.next();
                            ArrayList arrayList8 = (ArrayList) wVar.e();
                            if (arrayList8.isEmpty()) {
                                it = it10;
                                i17 = i14;
                                i18 = i15;
                            } else {
                                Iterator it11 = arrayList8.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        d1 d1Var6 = (d1) it11.next();
                                        it = it10;
                                        if (p005kotlin.jvm.internal.s.g(d1Var6.f139785a, d1Var5.f139785a)) {
                                            i17 = i14;
                                            i18 = i15;
                                            double d18 = d1Var5.f139789e;
                                            double d19 = d18 - d1Var5.f139786b;
                                            double d24 = d1Var6.f139789e;
                                            if (d19 != d24 - d1Var6.f139786b || d18 != d24) {
                                                i16++;
                                                if (i16 < 0) {
                                                    p13.x.p();
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            i17 = i14;
                                            i18 = i15;
                                        }
                                        i14 = i17;
                                        i15 = i18;
                                        it10 = it;
                                    } else {
                                        it = it10;
                                        i17 = i14;
                                        i18 = i15;
                                    }
                                }
                            }
                            i14 = i17;
                            i15 = i18;
                            it10 = it;
                        }
                    }
                    int i25 = i14;
                    int i26 = i15;
                    Bundle bundle = new Bundle();
                    bundle.putString("activityId", String.valueOf(this.f198246p));
                    if (i25 > 0) {
                        bundle.putString("addedLegsCount", String.valueOf(i25));
                    }
                    if (i26 > 0) {
                        bundle.putString("removedLegsCount", String.valueOf(i26));
                    }
                    if (i16 > 0) {
                        bundle.putString("durationChangedLegsCount", String.valueOf(i16));
                    }
                    ht.a.f85464a.getClass();
                    ht.a.a(bundle, "LegUpdateSave");
                }
                Headers headers = response.headers();
                headers.getClass();
                mVar.f198281a = null;
                mVar.f198282b = startTime;
                mVar.f198283c = j8;
                mVar.f198284d = j14;
                mVar.f198287g = 2;
                objAwait = h(headers, mVar);
            }
            return Unit.INSTANCE;
        }
        y0Var.j(new o13.p<>(yo.a.FAILED, j0.f134944a));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(int i14, double d14, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i15 = nVar.f198290c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                nVar.f198290c = i15 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objK = nVar.f198288a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = nVar.f198290c;
        if (i16 == 0) {
            o13.r.b(objK);
            nVar.f198290c = 1;
            objK = this.f198237g.k(i14, d14, nVar);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        vo.e eVar = (vo.e) objK;
        if (eVar.f178995a == z.NORMAL) {
            c(eVar);
        } else {
            this.f198241k.j(eVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(int i14, double d14, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i15 = oVar.f198293c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                oVar.f198293c = i15 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objL = oVar.f198291a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = oVar.f198293c;
        if (i16 == 0) {
            o13.r.b(objL);
            oVar.f198293c = 1;
            objL = this.f198237g.l(i14, d14, oVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        vo.e eVar = (vo.e) objL;
        if (eVar.f178995a == z.NORMAL) {
            c(eVar);
        } else {
            this.f198241k.j(eVar);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lyo/e$a;", "", "<init>", "()V", "", "POLLING_ENDPOINT_KEY", "Ljava/lang/String;", "PING_TIME_KEY", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
