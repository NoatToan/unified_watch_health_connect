package t70;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;
import r53.m1;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lt70/x0;", "Landroidx/lifecycle/u1;", "Ll70/c;", "dashboardRepository", "Lcom/garmin/android/apps/connectmobile/b1;", "featureItemAvailability", "<init>", "(Ll70/c;Lcom/garmin/android/apps/connectmobile/b1;)V", "b", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 extends u1 {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.c f163047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f163048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f163049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f163050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f163051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f163052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f163053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f163054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2 f163055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e2 f163056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f163057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f163058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f163059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f163060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f163061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f163062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f163063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f163064r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f163065t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f163066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<String> f163067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<String> f163068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f163069y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f163070z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj70/f;", "config", "", "<anonymous>", "(Lj70/f;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditSecondaryStatsViewModel$1", f = "EditSecondaryStatsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<j70.f, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f163071a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = x0.this.new a(dVar);
            aVar.f163071a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(j70.f fVar, t13.d<? super Unit> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j70.f fVar = (j70.f) this.f163071a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x0 x0Var = x0.this;
            x0Var.f163051e.setValue(null);
            j70.c dailyStatsConfig = fVar.getDailyStatsConfig();
            List<j70.b> listG = dailyStatsConfig != null ? dailyStatsConfig.g() : null;
            if (listG == null) {
                listG = p13.j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(p13.y.r(listG, 10));
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(((j70.b) it.next()).getCardType());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!p005kotlin.jvm.internal.s.g((String) obj2, o70.t.f130068k0.f130082a)) {
                    arrayList2.add(obj2);
                }
            }
            x0Var.f163067w = arrayList2;
            j70.c dailyStatsConfig2 = fVar.getDailyStatsConfig();
            List<j70.b> listE = dailyStatsConfig2 != null ? dailyStatsConfig2.e() : null;
            if (listE == null) {
                listE = p13.j0.f134944a;
            }
            ArrayList arrayList3 = new ArrayList(p13.y.r(listE, 10));
            Iterator<T> it3 = listE.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((j70.b) it3.next()).getCardType());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (!p005kotlin.jvm.internal.s.g((String) obj3, o70.t.f130068k0.f130082a)) {
                    arrayList4.add(obj3);
                }
            }
            x0Var.f163068x = arrayList4;
            x0Var.y4();
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public x0(l70.c cVar, com.garmin.android.apps.connectmobile.b1 b1Var) {
        cVar.getClass();
        b1Var.getClass();
        this.f163047a = cVar;
        this.f163048b = b1Var;
        p13.j0 j0Var = p13.j0.f134944a;
        p2 p2VarA = q2.a(j0Var);
        this.f163049c = p2VarA;
        this.f163050d = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f163051e = p2VarA2;
        this.f163052f = p2VarA2;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA3 = q2.a(bool);
        this.f163053g = p2VarA3;
        this.f163054h = p2VarA3;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f163055i = e2VarB;
        this.f163056j = e2VarB;
        p2 p2VarA4 = q2.a(bool);
        this.f163057k = p2VarA4;
        this.f163058l = p2VarA4;
        p2 p2VarA5 = q2.a(bool);
        this.f163059m = p2VarA5;
        this.f163060n = p2VarA5;
        p2 p2VarA6 = q2.a(bool);
        this.f163061o = p2VarA6;
        this.f163062p = p2VarA6;
        p2 p2VarA7 = q2.a(bool);
        this.f163063q = p2VarA7;
        this.f163064r = p2VarA7;
        p2 p2VarA8 = q2.a(bool);
        this.f163065t = p2VarA8;
        this.f163066v = p2VarA8;
        this.f163067w = j0Var;
        this.f163068x = j0Var;
        this.f163069y = new ArrayList();
        this.f163070z = new ArrayList();
        r53.s.C(new m1(cVar.p(), new a(null)), v1.a(this));
    }

    public static ArrayList x4(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            o70.t.f130062f.getClass();
            o70.t tVarA = o70.t.a.a(str);
            p0.d dVar = tVarA != null ? new p0.d(tVarA) : null;
            if (dVar != null) {
                arrayList3.add(dVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            o70.t.f130062f.getClass();
            o70.t tVarA2 = o70.t.a.a(str2);
            p0.d dVar2 = tVarA2 != null ? new p0.d(tVarA2) : null;
            if (dVar2 != null) {
                arrayList4.add(dVar2);
            }
        }
        q13.b bVarB = p13.w.b();
        bVarB.add(new p0.c("HEADER_STATS_VISIBLE", R.string.lbl_header_home_items_secondary_stats, 8));
        bVarB.addAll(arrayList3);
        if (arrayList.size() % 2 != 0) {
            bVarB.add(new p0.b("HEADER_EMPTY_CARD", true));
        }
        bVarB.add(new p0.c("HEADER_STATS_ADDITIONAL", R.string.lbl_header_other_items_secondary_stats, null, 4, null));
        bVarB.addAll(arrayList4);
        bVarB.add(new p0.a(arrayList2.size() + arrayList.size() < 20, "ADD_STAT_CARD_KEY"));
        q13.b bVarA = p13.w.a(bVarB);
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        ListIterator listIterator = bVarA.listIterator(0);
        while (true) {
            q13.b.c cVar = (q13.b.c) listIterator;
            if (!cVar.hasNext()) {
                return arrayList5;
            }
            Object next = cVar.next();
            if (hashSet.add(((p0) next).f162944a)) {
                arrayList5.add(next);
            }
        }
    }

    public static String z4(String str, List list) {
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        String str2 = String.format("%15s", Arrays.copyOf(new Object[]{str}, 1));
        ArrayList arrayList = null;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        if (list != null) {
            arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((j70.b) it.next()).getCardType());
            }
        }
        return str2 + "[" + numValueOf + "] = " + arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bf A[LOOP:7: B:97:0x01aa->B:102:0x01bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b0  */
    public final int A4(i02.f fVar, i02.f fVar2) {
        int i14;
        Iterator it;
        fVar.getClass();
        Object obj = fVar.f86852b;
        fVar2.getClass();
        Object obj2 = fVar2.f86852b;
        p2 p2Var = this.f163049c;
        Iterator it3 = ((List) p2Var.getValue()).iterator();
        int i15 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i15 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g(((p0) it3.next()).f162944a, "HEADER_STATS_ADDITIONAL")) {
                break;
            }
            i15++;
        }
        Iterator it4 = ((List) p2Var.getValue()).iterator();
        int i16 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i16 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g(((p0) it4.next()).f162944a, obj)) {
                break;
            }
            i16++;
        }
        Iterator it5 = ((List) p2Var.getValue()).iterator();
        int i17 = 0;
        while (true) {
            if (!it5.hasNext()) {
                i17 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g(((p0) it5.next()).f162944a, obj2)) {
                break;
            }
            i17++;
        }
        ArrayList arrayList = this.f163069y;
        if (arrayList.size() == 1 && p13.h0.R(arrayList, obj)) {
            this.f163059m.k(null, Boolean.TRUE);
            return -1;
        }
        if (arrayList.size() == 8 && i17 <= i15 && i15 <= i16) {
            this.f163061o.k(null, Boolean.TRUE);
            return -1;
        }
        boolean zG = p005kotlin.jvm.internal.s.g(obj2, "HEADER_EMPTY_CARD");
        boolean zG2 = p005kotlin.jvm.internal.s.g(obj2, "HEADER_STATS_ADDITIONAL");
        boolean zG3 = p005kotlin.jvm.internal.s.g(obj2, "ADD_STAT_CARD_KEY");
        Iterator it6 = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i18 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g((String) it6.next(), obj)) {
                break;
            }
            i18++;
        }
        Iterator it7 = arrayList.iterator();
        int i19 = 0;
        while (true) {
            if (!it7.hasNext()) {
                i19 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g((String) it7.next(), obj2)) {
                break;
            }
            i19++;
        }
        ArrayList arrayList2 = this.f163070z;
        Iterator it8 = arrayList2.iterator();
        int i24 = 0;
        while (true) {
            if (!it8.hasNext()) {
                i24 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g((String) it8.next(), obj)) {
                break;
            }
            i24++;
        }
        Iterator it9 = arrayList2.iterator();
        int i25 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i25 = -1;
                break;
            }
            if (p005kotlin.jvm.internal.s.g((String) it9.next(), obj2)) {
                break;
            }
            i25++;
        }
        if (i24 == -1 || !(zG || zG2)) {
            if (i24 != -1 && i19 != -1) {
                String str = (String) arrayList2.remove(i24);
                if (arrayList.size() % 2 == 0) {
                    arrayList.add(str);
                } else {
                    arrayList.add(i19, str);
                }
            } else if (i18 == -1 || !(zG3 || zG2)) {
                i14 = 0;
                if (i18 != -1 && i25 != -1) {
                    arrayList2.add(i25, (String) arrayList.remove(i18));
                } else if (i24 != -1 && i25 != -1) {
                    arrayList2.add(i25, arrayList2.remove(i24));
                } else if (i18 != -1 && i19 != -1) {
                    arrayList.add(i19, arrayList.remove(i18));
                }
            } else {
                i14 = 0;
                arrayList2.add(0, (String) arrayList.remove(i18));
            }
            p2Var.k(null, x4(arrayList, arrayList2));
            it = ((List) p2Var.getValue()).iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((p0) it.next()).f162944a, obj)) {
                    return i14;
                }
                i14++;
            }
            return -1;
        }
        arrayList.add((String) arrayList2.remove(i24));
        i14 = 0;
        p2Var.k(null, x4(arrayList, arrayList2));
        it = ((List) p2Var.getValue()).iterator();
        while (it.hasNext()) {
            if (p005kotlin.jvm.internal.s.g(((p0) it.next()).f162944a, obj)) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public final void B4(i02.f fVar) {
        ArrayList arrayList;
        fVar.getClass();
        ArrayList arrayList2 = this.f163069y;
        int size = arrayList2.size();
        p2 p2Var = this.f163049c;
        if (size == 1) {
            int i14 = fVar.f86851a;
            Iterator it = ((List) p2Var.getValue()).iterator();
            int i15 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                } else if (((p0) it.next()) instanceof p0.d) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i14 == i15) {
                this.f163059m.k(null, Boolean.TRUE);
                return;
            }
        }
        p2 p2Var2 = this.f163051e;
        List list = (List) p2Var2.getValue();
        if (list != null) {
            arrayList = new ArrayList(list);
            arrayList.add(new j70.b(String.valueOf(fVar.f86852b)));
        } else {
            arrayList = null;
        }
        p2Var2.setValue(arrayList);
        s52.e eVar = new s52.e(new w0(fVar, 0), 3);
        ArrayList arrayList3 = this.f163070z;
        arrayList3.removeIf(eVar);
        arrayList2.removeIf(new s52.e(new w0(fVar, 1), 4));
        p2Var.k(null, x4(arrayList2, arrayList3));
    }

    public final void y4() {
        ArrayList arrayList = this.f163069y;
        arrayList.clear();
        if (this.f163067w.isEmpty()) {
            arrayList.addAll(p13.h0.S0(this.f163068x, 4));
        } else {
            arrayList.addAll(this.f163067w);
        }
        ArrayList arrayList2 = this.f163070z;
        arrayList2.clear();
        boolean zIsEmpty = this.f163067w.isEmpty();
        List<String> list = this.f163068x;
        if (zIsEmpty) {
            arrayList2.addAll(p13.h0.U(list, 4));
        } else {
            arrayList2.addAll(list);
        }
        this.f163049c.k(null, x4(arrayList, arrayList2));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lt70/x0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ADD_STAT_CARD_KEY", "HEADER_STATS_VISIBLE", "HEADER_STATS_ADDITIONAL", "HEADER_EMPTY_CARD", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
