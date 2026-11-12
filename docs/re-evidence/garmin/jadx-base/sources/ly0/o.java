package ly0;

import android.content.Context;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import gy0.j0;
import gy0.k0;
import gy0.n0;
import gy0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l3.p1;
import org.joda.time.DateTime;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.y;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lly0/o;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "applicationContext", "", "epicUUID", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends u1 implements KoinComponent {
    public List<com.garmin.android.library.mapsdkadapter.q> A;
    public final ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public Object E;
    public List<com.garmin.android.library.mapsdkadapter.p> F;
    public boolean H0;
    public ArrayList I;
    public boolean I0;
    public boolean J0;
    public Object P;
    public le2.a T;
    public le2.a X;
    public qe2.h Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f115342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f115343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f115344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f115345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f115346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qw0.s f115347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f115348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f115349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f115350k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public List<com.garmin.android.library.mapsdkadapter.q> f115351k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f115352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f115353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f115354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f115355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f115356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f115357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f115358r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f115359t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f115360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f115361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p2 f115362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f115363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List<ps.m> f115364z;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f115365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f115366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f115367c;

        public a(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f115365a = scope;
            this.f115366b = qualifier;
            this.f115367c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.k0, java.lang.Object] */
        @Override // e23.a
        public final k0 invoke() {
            return this.f115365a.get(s0.f105811a.b(k0.class), this.f115366b, this.f115367c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<n0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f115368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f115369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f115370c;

        public b(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f115368a = scope;
            this.f115369b = qualifier;
            this.f115370c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.n0, java.lang.Object] */
        @Override // e23.a
        public final n0 invoke() {
            return this.f115368a.get(s0.f105811a.b(n0.class), this.f115369b, this.f115370c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f115371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f115372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f115373c;

        public c(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f115371a = scope;
            this.f115372b = qualifier;
            this.f115373c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.j0, java.lang.Object] */
        @Override // e23.a
        public final j0 invoke() {
            return this.f115371a.get(s0.f105811a.b(j0.class), this.f115372b, this.f115373c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<gy0.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f115374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f115375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f115376c;

        public d(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f115374a = scope;
            this.f115375b = qualifier;
            this.f115376c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.q, java.lang.Object] */
        @Override // e23.a
        public final gy0.q invoke() {
            return this.f115374a.get(s0.f105811a.b(gy0.q.class), this.f115375b, this.f115376c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f115377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f115378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f115379c;

        public e(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f115377a = scope;
            this.f115378b = qualifier;
            this.f115379c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.v, java.lang.Object] */
        @Override // e23.a
        public final v invoke() {
            return this.f115377a.get(s0.f105811a.b(v.class), this.f115378b, this.f115379c);
        }
    }

    public o(Context context, String str) {
        context.getClass();
        str.getClass();
        this.f115340a = context;
        this.f115341b = str;
        Scope scopeV = xy2.b.v();
        o13.n nVar = o13.n.SYNCHRONIZED;
        this.f115342c = o13.m.a(nVar, new a(scopeV, null, null));
        this.f115343d = o13.m.a(nVar, new b(scopeV, null, null));
        this.f115344e = o13.m.a(nVar, new c(scopeV, null, null));
        this.f115345f = o13.m.a(nVar, new d(scopeV, null, null));
        this.f115346g = o13.m.a(nVar, new e(scopeV, null, null));
        qw0.s sVar = (qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null);
        this.f115347h = sVar;
        p2 p2VarA = q2.a(sVar.H());
        this.f115348i = p2VarA;
        this.f115349j = r53.s.d(p2VarA);
        Integer numF = sVar.F();
        p2 p2VarA2 = q2.a(Integer.valueOf(numF != null ? numF.intValue() : 1));
        this.f115350k = p2VarA2;
        this.f115352l = r53.s.d(p2VarA2);
        this.f115353m = sVar.c();
        Boolean bool = Boolean.FALSE;
        p2 p2VarA3 = q2.a(bool);
        this.f115354n = p2VarA3;
        this.f115355o = r53.s.d(p2VarA3);
        p2 p2VarA4 = q2.a(j53.l.b());
        this.f115356p = p2VarA4;
        this.f115357q = r53.s.d(p2VarA4);
        p2 p2VarA5 = q2.a(bool);
        this.f115358r = p2VarA5;
        this.f115359t = r53.s.d(p2VarA5);
        p2 p2VarA6 = q2.a("");
        this.f115360v = p2VarA6;
        this.f115361w = r53.s.d(p2VarA6);
        p2 p2VarA7 = q2.a(bool);
        this.f115362x = p2VarA7;
        this.f115363y = r53.s.d(p2VarA7);
        p13.j0 j0Var = p13.j0.f134944a;
        this.f115364z = j0Var;
        this.A = j0Var;
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = j0Var;
        this.F = j0Var;
        this.I = new ArrayList();
        this.P = j0Var;
        this.T = new le2.a(null, null, 3, null);
        this.f115351k0 = j0Var;
        this.J0 = true;
    }

    public static com.garmin.android.library.mapsdkadapter.e x4(ArrayList arrayList) {
        com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.b((com.garmin.android.library.mapsdkadapter.f) it.next());
        }
        com.garmin.android.library.mapsdkadapter.e eVarA = aVar.a();
        if (eVarA != null) {
            return eVarA;
        }
        com.garmin.android.library.mapsdkadapter.e.f50271c.getClass();
        return com.garmin.android.library.mapsdkadapter.e.f50272d;
    }

    public final void A4(com.garmin.android.library.mapsdkadapter.i.d dVar, boolean z14) {
        p2 p2Var;
        Object value;
        dVar.getClass();
        this.f115347h.m(dVar);
        this.X = this.T;
        this.H0 = true;
        this.J0 = true;
        this.Z = false;
        this.I0 = z14;
        do {
            p2Var = this.f115348i;
            value = p2Var.getValue();
        } while (!p2Var.b(value, dVar));
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0225  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r13 == r0) goto L35;
     */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o13.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B4(List list, v13.c cVar) {
        l lVar;
        ArrayList<ActivityListItemDTO> arrayList;
        p2 p2Var;
        Object value;
        List listB;
        p2 p2Var2;
        Object value2;
        ps.m mVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f115334d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f115334d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object objE = lVar2.f115332b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar2.f115334d;
        if (i15 == 0) {
            o13.r.b(objE);
            j0 j0Var = (j0) this.f115344e.getValue();
            lVar2.f115331a = list;
            lVar2.f115334d = 1;
            objE = j0Var.f80181a.e(this.f115341b, lVar2);
            if (objE != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            list = lVar2.f115331a;
            o13.r.b(objE);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = lVar2.f115331a;
            o13.r.b(objE);
        }
        i53.c cVar2 = (i53.c) objE;
        if (cVar2 != null) {
            arrayList = new ArrayList();
            for (Object obj : cVar2) {
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object obj2 = ((com.garmin.android.library.mapsdkadapter.q) it.next()).f50328a.f93164l;
                        Long l14 = obj2 instanceof Long ? (Long) obj2 : null;
                        long j8 = activityListItemDTO.f29250b;
                        if (l14 != null && l14.longValue() == j8) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = this.D;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            com.garmin.android.library.mapsdkadapter.l lVar3 = (com.garmin.android.library.mapsdkadapter.l) obj3;
            if (list == null || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        com.garmin.android.library.mapsdkadapter.q qVar = (com.garmin.android.library.mapsdkadapter.q) it3.next();
                        if (p005kotlin.jvm.internal.s.g(qVar.f50328a.f93164l, lVar3.getTag()) && qVar.f50328a.f93158f == lVar3.getZIndex()) {
                            break;
                        }
                    }
                }
            }
            arrayList3.add(obj3);
        }
        this.E = arrayList3;
        ArrayList arrayList4 = this.I;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            ie2.j jVar = (ie2.j) obj4;
            if (list == null || !list.isEmpty()) {
                Iterator it4 = list.iterator();
                do {
                    if (it4.hasNext()) {
                    }
                } while (!p005kotlin.jvm.internal.s.g(((com.garmin.android.library.mapsdkadapter.q) it4.next()).f50328a.f93164l, jVar.mo329getTag()));
            }
            arrayList5.add(obj4);
        }
        this.P = arrayList5;
        for (com.garmin.android.library.mapsdkadapter.l lVar4 : this.E) {
            qe2.h hVar = this.Y;
            if (hVar != null) {
                hVar.m(lVar4);
            }
        }
        for (ie2.j jVar2 : this.P) {
            qe2.h hVar2 = this.Y;
            if (hVar2 != null) {
                hVar2.n(jVar2);
            }
        }
        do {
            p2Var = this.f115356p;
            value = p2Var.getValue();
            if (arrayList != null) {
                ArrayList arrayList6 = new ArrayList(y.r(arrayList, 10));
                for (ActivityListItemDTO activityListItemDTO2 : arrayList) {
                    Iterator<T> it5 = this.f115364z.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            n23.j.s("Collection contains no element matching the predicate.");
                            return null;
                        }
                        mVar = (ps.m) it5.next();
                        long j14 = activityListItemDTO2.f29250b;
                        Long activityId = mVar.getActivityId();
                        if (activityId != null && j14 == activityId.longValue()) {
                            break;
                        }
                    }
                    arrayList6.add(new ly0.a(activityListItemDTO2, mVar, null));
                }
                listB = i53.a.j(arrayList6);
                if (listB == null) {
                    listB = j53.l.b();
                }
            } else {
                listB = j53.l.b();
            }
        } while (!p2Var.b(value, listB));
        do {
            p2Var2 = this.f115358r;
            value2 = p2Var2.getValue();
            ((Boolean) value2).getClass();
        } while (!p2Var2.b(value2, Boolean.TRUE));
        return Unit.INSTANCE;
        cy0.k kVar = (cy0.k) objE;
        if (kVar != null) {
            DateTime dateTimeC = ay0.b.c(kVar.getStartDate());
            Long l15 = dateTimeC != null ? new Long(dateTimeC.getMillis()) : null;
            DateTime dateTimeC2 = ay0.b.c(kVar.getEndDate());
            Long l16 = dateTimeC2 != null ? new Long(dateTimeC2.getMillis()) : null;
            if (l15 != null && l16 != null) {
                gy0.q qVar2 = (gy0.q) this.f115345f.getValue();
                long jLongValue = l15.longValue();
                long jLongValue2 = l16.longValue();
                lVar2.f115331a = list;
                lVar2.f115334d = 2;
                objE = qVar2.a(jLongValue, jLongValue2, null, lVar2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
    public final void C4() {
        p2 p2Var;
        Object value;
        qe2.h hVar;
        com.garmin.android.library.mapsdkadapter.p pVar;
        com.garmin.android.library.mapsdkadapter.q qVar;
        do {
            p2Var = this.f115358r;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.FALSE));
        for (com.garmin.android.library.mapsdkadapter.l lVar : this.E) {
            Iterator<T> it = this.A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    n23.j.s("Collection contains no element matching the predicate.");
                    return;
                } else {
                    qVar = (com.garmin.android.library.mapsdkadapter.q) it.next();
                    if (!p005kotlin.jvm.internal.s.g(qVar.f50328a.f93164l, lVar.getTag()) || qVar.f50328a.f93158f != lVar.getZIndex()) {
                    }
                }
            }
            qe2.h hVar2 = this.Y;
            if (hVar2 != null) {
                com.garmin.android.library.mapsdkadapter.l lVarH = hVar2.h(qVar);
                ArrayList arrayList = this.D;
                p1 p1Var = new p1(22, lVarH, lVar);
                arrayList.getClass();
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                for (Object obj : arrayList) {
                    if (((Boolean) p1Var.invoke(obj)).booleanValue()) {
                        obj = lVarH;
                    }
                    arrayList2.add(obj);
                }
                this.D = new ArrayList(arrayList2);
            }
        }
        for (ie2.j jVar : this.P) {
            Iterator<T> it3 = this.F.iterator();
            do {
                if (!it3.hasNext()) {
                    n23.j.s("Collection contains no element matching the predicate.");
                    return;
                }
                pVar = (com.garmin.android.library.mapsdkadapter.p) it3.next();
            } while (!p005kotlin.jvm.internal.s.g(pVar.f50327a.f50322n, jVar.mo329getTag()));
            qe2.h hVar3 = this.Y;
            if (hVar3 != null) {
                ie2.j jVarX = hVar3.x(pVar);
                ArrayList arrayList3 = this.I;
                arrayList3.getClass();
                ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                for (Object obj2 : arrayList3) {
                    ie2.j jVar2 = (ie2.j) obj2;
                    jVar2.getClass();
                    if (p005kotlin.jvm.internal.s.g(jVar2.mo329getTag(), ((qe2.i) jVarX).mo329getTag())) {
                        obj2 = jVarX;
                    }
                    arrayList4.add(obj2);
                }
                this.I = new ArrayList(arrayList4);
            }
        }
        p13.j0 j0Var = p13.j0.f134944a;
        this.P = j0Var;
        this.E = j0Var;
        this.f115351k0 = j0Var;
        qe2.h hVar4 = this.Y;
        if (hVar4 != null) {
            hVar4.q();
        }
        le2.a aVar = this.X;
        if (aVar == null || (hVar = this.Y) == null) {
            return;
        }
        hVar.j(new com.garmin.android.library.mapsdkadapter.e(ke2.c.a(aVar.f112053b), ke2.c.a(aVar.f112052a)), 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void y4(qe2.h hVar) {
        float f50270z = hVar.f144584a.getF50270z();
        if (f50270z < 8.0f || this.Z) {
            if ((f50270z >= 8.0f || !this.Z) && !this.J0) {
                return;
            }
            this.J0 = false;
            this.Z = false;
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                hVar.m((com.garmin.android.library.mapsdkadapter.l) it.next());
            }
            Iterator it3 = this.D.iterator();
            while (it3.hasNext()) {
                hVar.m((com.garmin.android.library.mapsdkadapter.l) it3.next());
            }
            Iterator it4 = this.I.iterator();
            while (it4.hasNext()) {
                hVar.n((ie2.j) it4.next());
            }
            hVar.f(0, this.F);
            return;
        }
        this.Z = true;
        List<qe2.a> listC = hVar.f144584a.C();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            Integer f125697b = ((qe2.a) obj).getF125697b();
            if (f125697b != null && f125697b.intValue() == 0) {
                arrayList.add(obj);
            }
        }
        hVar.Y(new gs.k(arrayList, 0, 1));
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.I = new ArrayList();
        Iterator it5 = this.B.iterator();
        while (it5.hasNext()) {
            this.C.add(com.garmin.android.library.mapsdkadapter.i.a.a(hVar, (com.garmin.android.library.mapsdkadapter.q) it5.next()));
        }
        Iterator<T> it6 = this.A.iterator();
        while (it6.hasNext()) {
            this.D.add(com.garmin.android.library.mapsdkadapter.i.a.a(hVar, (com.garmin.android.library.mapsdkadapter.q) it6.next()));
        }
        Iterator<T> it7 = this.F.iterator();
        while (it7.hasNext()) {
            this.I.add(hVar.x((com.garmin.android.library.mapsdkadapter.p) it7.next()));
        }
    }

    public final void z4(boolean z14) {
        p2 p2Var;
        Object value;
        qe2.h hVar = this.Y;
        if (hVar != null) {
            hVar.b(z14, Boolean.FALSE);
        }
        do {
            p2Var = this.f115354n;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.valueOf(z14)));
    }
}
