package t70;

import am.r1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lt70/l0;", "Landroidx/lifecycle/u1;", "Ll70/c;", "dashboardRepository", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;", "activityTrendsPreferenceDataSource", "Lcom/garmin/android/apps/connectmobile/b1;", "featureItemAvailability", "<init>", "(Ll70/c;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;Lcom/garmin/android/apps/connectmobile/b1;)V", "b", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f162904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.o f162905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f162906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f162907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f162908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f162909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f162910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f162911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f162912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f162913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f162914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f162915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f162916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f162917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f162918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<? extends o70.r> f162919p;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj70/f;", "config", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lj70/b;", "result", "", "<anonymous>", "(Lj70/f;Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditInFocusViewModel$1", f = "EditInFocusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<j70.f, v2<? extends List<? extends j70.b>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ j70.f f162920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f162921b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.b1 f162923d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.b1 b1Var, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f162923d = b1Var;
        }

        @Override // e23.q
        public final Object invoke(j70.f fVar, v2<? extends List<? extends j70.b>> v2Var, t13.d<? super Unit> dVar) {
            a aVar = l0.this.new a(this.f162923d, dVar);
            aVar.f162920a = fVar;
            aVar.f162921b = v2Var;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            List<j70.b> listD;
            j70.f fVar = this.f162920a;
            v2 v2Var = this.f162921b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            j70.c dailyStatsConfig = fVar.getDailyStatsConfig();
            if (dailyStatsConfig == null || (listD = dailyStatsConfig.d()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (j70.b bVar : listD) {
                    o70.c.a aVar2 = o70.c.f129930b;
                    String cardType = bVar.getCardType();
                    aVar2.getClass();
                    Enum enumA = o70.c.a.a(cardType);
                    if (enumA == null) {
                        o70.o.a aVar3 = o70.o.f130039b;
                        String cardType2 = bVar.getCardType();
                        aVar3.getClass();
                        enumA = o70.o.a.a(cardType2);
                    }
                    if (enumA != null) {
                        arrayList.add(enumA);
                    }
                }
            }
            l0 l0Var = l0.this;
            l0Var.f162918o = arrayList;
            p2 p2Var = l0Var.f162910g;
            a2 a2Var = a2.DASHBOARD;
            String strK = androidx.room.a0.k("initialPrimaryStats() ", arrayList);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EditInFocusViewModel", strK);
            if (v2Var instanceof v2.b) {
                i2.a.b(a2Var, "EditInFocusViewModel", "result() " + l0Var.f162919p);
                l0Var.y4(l0Var.f162918o, new b50.o(v2Var, this.f162923d.w0(), 12));
                p2Var.k(null, Boolean.FALSE);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                p2Var.k(null, Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<List<? extends c1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f162924a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f162925a;

            /* JADX INFO: renamed from: t70.l0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditInFocusViewModel$special$$inlined$mapNotNull$1$2", f = "EditInFocusViewModel.kt", l = {60}, m = "emit", v = 2)
            public static final class C3065a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f162926a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f162927b;

                public C3065a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f162926a = obj;
                    this.f162927b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f162925a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3065a c3065a;
                ArrayList arrayList;
                if (dVar instanceof C3065a) {
                    c3065a = (C3065a) dVar;
                    int i14 = c3065a.f162927b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3065a.f162927b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3065a = new C3065a(dVar);
                    }
                } else {
                    c3065a = new C3065a(dVar);
                }
                Object obj2 = c3065a.f162926a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3065a.f162927b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    List list = (List) obj;
                    if (list != null) {
                        HashSet hashSet = new HashSet();
                        arrayList = new ArrayList();
                        for (T t7 : list) {
                            if (hashSet.add(((c1) t7).f162819a)) {
                                arrayList.add(t7);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        c3065a.f162927b = 1;
                        if (this.f162925a.emit(arrayList, c3065a) == aVar) {
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

        public c(r53.i iVar) {
            this.f162924a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends c1>> jVar, t13.d dVar) {
            Object objCollect = this.f162924a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public l0(l70.c cVar, com.garmin.android.apps.connectmobile.dashboard.data.datasource.o oVar, com.garmin.android.apps.connectmobile.b1 b1Var) {
        cVar.getClass();
        oVar.getClass();
        b1Var.getClass();
        this.f162904a = cVar;
        this.f162905b = oVar;
        p2 p2VarA = q2.a(p13.j0.f134944a);
        this.f162906c = p2VarA;
        this.f162907d = new c(p2VarA);
        e2 e2VarB = g2.b(0, 0, null, 6);
        this.f162908e = e2VarB;
        this.f162909f = e2VarB;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA2 = q2.a(bool);
        this.f162910g = p2VarA2;
        this.f162911h = p2VarA2;
        p2 p2VarA3 = q2.a(bool);
        this.f162912i = p2VarA3;
        this.f162913j = p2VarA3;
        p2 p2VarA4 = q2.a(bool);
        this.f162914k = p2VarA4;
        this.f162915l = p2VarA4;
        p2 p2VarA5 = q2.a(bool);
        this.f162916m = p2VarA5;
        this.f162917n = p2VarA5;
        p2VarA2.k(null, Boolean.TRUE);
        r53.i iVarA = r53.s.A(new r53.u1(cVar.p(), cVar.V2(), new a(b1Var, null)), o53.s0.f129406a);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        r53.s.K(iVarA, aVarA, k2.a.f150705b, g3.a.c(g3.f35298f));
    }

    public static /* synthetic */ void z4(l0 l0Var, ArrayList arrayList) {
        l0Var.y4(arrayList, new s(l0Var, 5));
    }

    public final List<o70.r> A4() {
        List list = (List) this.f162906c.getValue();
        if (list == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof c1.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((c1.b) obj2).f162823c) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((c1.b) it.next()).f162822b);
        }
        return arrayList3;
    }

    public final void B4(int i14, int i15) {
        ArrayList arrayList;
        List list = (List) this.f162906c.getValue();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list);
            arrayList2.add(i15, arrayList2.remove(i14));
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof c1.b) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((c1.b) obj2).f162823c) {
                    arrayList4.add(obj2);
                }
            }
            arrayList = new ArrayList(p13.y.r(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList.add(((c1.b) it.next()).f162822b);
            }
        } else {
            arrayList = null;
        }
        z4(this, arrayList);
    }

    public final void C4(o70.r rVar) {
        rVar.getClass();
        List list = (List) this.f162906c.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof c1.b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((c1.b) obj2).f162823c) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() == 1) {
                this.f162912i.k(null, Boolean.TRUE);
                return;
            }
        }
        ArrayList arrayListD1 = p13.h0.d1(A4());
        arrayListD1.remove(rVar);
        z4(this, arrayListD1);
    }

    public final void x4(o70.r rVar) {
        rVar.getClass();
        List list = (List) this.f162906c.getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof c1.b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((c1.b) obj2).f162823c) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() == 6) {
                this.f162914k.k(null, Boolean.TRUE);
                return;
            }
        }
        ArrayList arrayListD1 = p13.h0.d1(A4());
        arrayListD1.add(rVar);
        z4(this, arrayListD1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    public final void y4(List<? extends o70.r> list, e23.a<? extends List<? extends o70.r>> aVar) {
        List listN0;
        List listZ0;
        this.f162919p = aVar.invoke();
        p2 p2Var = this.f162906c;
        if (list == null) {
            p2Var.setValue(null);
            return;
        }
        List listS0 = p13.h0.S0(list, 6);
        ArrayList arrayList = new ArrayList(p13.y.r(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(new c1.b((o70.r) it.next(), true));
        }
        HashMap mapO = r1.o();
        List<? extends o70.r> list2 = this.f162919p;
        if (list2 == null || (listZ0 = p13.h0.z0(list2, list)) == null) {
            listN0 = p13.j0.f134944a;
        } else {
            ArrayList arrayList2 = new ArrayList(p13.y.r(listZ0, 10));
            Iterator it3 = listZ0.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new c1.b((o70.r) it3.next(), false));
            }
            listN0 = p13.h0.N0(arrayList2, new m0(mapO));
            if (listN0 == null) {
                listN0 = p13.j0.f134944a;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new c1.a(R.string.lbl_show, "HEADER_STATS_SHOW"));
        arrayList3.addAll(arrayList);
        arrayList3.add(new c1.a(R.string.lbl_hide, "HEADER_STATS_HIDDEN"));
        arrayList3.addAll(listN0);
        p2Var.k(null, arrayList3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lt70/l0$b;", "", "<init>", "()V", "", "HEADER_STATS_SHOW", "Ljava/lang/String;", "HEADER_STATS_HIDDEN", "TAG", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
