package t70;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.l2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lt70/q;", "Landroidx/lifecycle/u1;", "Ll70/c;", "dashboardRepository", "<init>", "(Ll70/c;)V", "b", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f162953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f162954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f162955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f162956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f162957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f162958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f162959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f162960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f162961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f162962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f162963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f162964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f162965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f162966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<? extends o70.i> f162967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f162968p;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj70/f;", "config", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lj70/b;", "result", "", "<anonymous>", "(Lj70/f;Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsViewModel$1", f = "EditEssentialsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<j70.f, v2<? extends List<? extends j70.b>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ j70.f f162969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f162970b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(j70.f fVar, v2<? extends List<? extends j70.b>> v2Var, t13.d<? super Unit> dVar) {
            a aVar = q.this.new a(dVar);
            aVar.f162969a = fVar;
            aVar.f162970b = v2Var;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            List<j70.b> listC;
            j70.f fVar = this.f162969a;
            v2 v2Var = this.f162970b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            q qVar = q.this;
            p2 p2Var = qVar.f162966n;
            p2 p2Var2 = qVar.f162958f;
            p2 p2Var3 = qVar.f162966n;
            j70.c dailyStatsConfig = fVar.getDailyStatsConfig();
            if (dailyStatsConfig == null || (listC = dailyStatsConfig.c()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (j70.b bVar : listC) {
                    o70.i.a aVar2 = o70.i.f129998f;
                    String cardType = bVar.getCardType();
                    aVar2.getClass();
                    o70.i iVarA = o70.i.a.a(cardType);
                    if (iVarA != null) {
                        arrayList.add(iVarA);
                    }
                }
            }
            p2Var.setValue(arrayList);
            a2 a2Var = a2.DASHBOARD;
            String strF = e5.f(p2Var3.getValue(), "initialEssentialsStats() ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EditEssentialsViewModel", strF);
            if (v2Var instanceof v2.b) {
                i2.a.b(a2Var, "EditEssentialsViewModel", "result() " + qVar.f162967o);
                qVar.y4((List) p2Var3.getValue(), new sg0.w0(v2Var, 13));
                p2Var2.k(null, Boolean.FALSE);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                p2Var2.k(null, Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lt70/b1;", "widgets", "Lo70/i;", "initial", "", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsViewModel$hasChanges$1", f = "EditEssentialsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.q<List<? extends b1>, List<? extends o70.i>, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ List f162972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f162973b;

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(List<? extends b1> list, List<? extends o70.i> list2, t13.d<? super Boolean> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f162972a = list;
            dVar2.f162973b = list2;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object arrayList;
            List list = this.f162972a;
            List list2 = this.f162973b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = false;
            if (list2 != null) {
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof b1.a) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (((b1.a) obj3).f162812c) {
                            arrayList3.add(obj3);
                        }
                    }
                    arrayList = new ArrayList(p13.y.r(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((b1.a) it.next()).f162811b);
                    }
                } else {
                    arrayList = p13.j0.f134944a;
                }
                if (!p005kotlin.jvm.internal.s.g(arrayList, list2)) {
                    z14 = true;
                }
            }
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<List<? extends b1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f162974a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f162975a;

            /* JADX INFO: renamed from: t70.q$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditEssentialsViewModel$special$$inlined$mapNotNull$1$2", f = "EditEssentialsViewModel.kt", l = {60}, m = "emit", v = 2)
            public static final class C3066a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f162976a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f162977b;

                public C3066a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f162976a = obj;
                    this.f162977b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f162975a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3066a c3066a;
                ArrayList arrayList;
                if (dVar instanceof C3066a) {
                    c3066a = (C3066a) dVar;
                    int i14 = c3066a.f162977b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3066a.f162977b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3066a = new C3066a(dVar);
                    }
                } else {
                    c3066a = new C3066a(dVar);
                }
                Object obj2 = c3066a.f162976a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3066a.f162977b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    List list = (List) obj;
                    if (list != null) {
                        HashSet hashSet = new HashSet();
                        arrayList = new ArrayList();
                        for (T t7 : list) {
                            if (hashSet.add(((b1) t7).f162810a)) {
                                arrayList.add(t7);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        c3066a.f162977b = 1;
                        if (this.f162975a.emit(arrayList, c3066a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public e(r53.i iVar) {
            this.f162974a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends b1>> jVar, t13.d dVar) {
            Object objCollect = this.f162974a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public q(l70.c cVar) {
        cVar.getClass();
        this.f162953a = cVar;
        p2 p2VarA = q2.a(p13.j0.f134944a);
        this.f162954b = p2VarA;
        e eVar = new e(p2VarA);
        this.f162955c = eVar;
        e2 e2VarB = g2.b(0, 0, null, 6);
        this.f162956d = e2VarB;
        this.f162957e = e2VarB;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA2 = q2.a(bool);
        this.f162958f = p2VarA2;
        this.f162959g = p2VarA2;
        p2 p2VarA3 = q2.a(bool);
        this.f162960h = p2VarA3;
        this.f162961i = p2VarA3;
        p2 p2VarA4 = q2.a(bool);
        this.f162962j = p2VarA4;
        this.f162963k = p2VarA4;
        p2 p2VarA5 = q2.a(bool);
        this.f162964l = p2VarA5;
        this.f162965m = p2VarA5;
        p2 p2VarA6 = q2.a(null);
        this.f162966n = p2VarA6;
        r53.u1 u1Var = new r53.u1(eVar, p2VarA6, new d(null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        l2 l2Var = k2.a.f150705b;
        this.f162968p = r53.s.K(u1Var, aVarA, l2Var, bool);
        p2VarA2.k(null, Boolean.TRUE);
        r53.s.K(r53.s.A(new r53.u1(cVar.p(), cVar.X2(), new a(null)), o53.s0.f129406a), v1.a(this), l2Var, g3.a.c(g3.f35298f));
    }

    public static /* synthetic */ void z4(q qVar, List list) {
        qVar.y4(list, new g(qVar, 5));
    }

    public final List<o70.i> A4() {
        List list = (List) this.f162954b.getValue();
        if (list == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b1.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((b1.a) obj2).f162812c) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((b1.a) it.next()).f162811b);
        }
        return arrayList3;
    }

    public final void B4(int i14, int i15) {
        ArrayList arrayList;
        List list = (List) this.f162954b.getValue();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list);
            arrayList2.add(i15, arrayList2.remove(i14));
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof b1.a) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((b1.a) obj2).f162812c) {
                    arrayList4.add(obj2);
                }
            }
            arrayList = new ArrayList(p13.y.r(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList.add(((b1.a) it.next()).f162811b);
            }
        } else {
            arrayList = null;
        }
        z4(this, arrayList);
    }

    public final void C4(o70.i iVar) {
        iVar.getClass();
        List list = (List) this.f162954b.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof b1.a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((b1.a) obj2).f162812c) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() == 2) {
                this.f162960h.k(null, Boolean.TRUE);
                return;
            }
        }
        ArrayList arrayListD1 = p13.h0.d1(A4());
        arrayListD1.remove(iVar);
        z4(this, arrayListD1);
    }

    public final void x4(o70.i iVar) {
        iVar.getClass();
        List list = (List) this.f162954b.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof b1.a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((b1.a) obj2).f162812c) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() == 4) {
                this.f162962j.k(null, Boolean.TRUE);
                return;
            }
        }
        ArrayList arrayListD1 = p13.h0.d1(A4());
        arrayListD1.add(iVar);
        z4(this, arrayListD1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    public final void y4(List<? extends o70.i> list, e23.a<? extends List<? extends o70.i>> aVar) {
        List listN0;
        List listZ0;
        this.f162967o = aVar.invoke();
        p2 p2Var = this.f162954b;
        if (list == null) {
            p2Var.setValue(null);
            return;
        }
        List listS0 = p13.h0.S0(list, 4);
        ArrayList arrayList = new ArrayList(p13.y.r(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(new b1.a((o70.i) it.next(), true));
        }
        List<? extends o70.i> list2 = this.f162967o;
        if (list2 == null || (listZ0 = p13.h0.z0(list2, list)) == null) {
            listN0 = p13.j0.f134944a;
        } else {
            ArrayList arrayList2 = new ArrayList(p13.y.r(listZ0, 10));
            Iterator it3 = listZ0.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new b1.a((o70.i) it3.next(), false));
            }
            listN0 = p13.h0.N0(arrayList2, new c());
            if (listN0 == null) {
                listN0 = p13.j0.f134944a;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new b1.b(R.string.lbl_show, "HEADER_STATS_SHOW"));
        arrayList3.addAll(arrayList);
        arrayList3.add(new b1.b(R.string.lbl_hide, "HEADER_STATS_HIDDEN"));
        arrayList3.addAll(listN0);
        p2Var.k(null, arrayList3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lt70/q$b;", "", "<init>", "()V", "", "HEADER_STATS_SHOW", "Ljava/lang/String;", "HEADER_STATS_HIDDEN", "TAG", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
