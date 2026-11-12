package lx1;

import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import d53.w;
import ix1.h;
import ix1.k;
import ix1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n23.j;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.y;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llx1/e;", "Llx1/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ljx1/b;", "stpStructureApi", "Ljx1/a;", "stpApi", "Lru1/a;", "exerciseListApi", "Lcom/garmin/android/apps/connectmobile/e3;", "trainingPlanDelegate", "<init>", "(Ljx1/b;Ljx1/a;Lru1/a;Lcom/garmin/android/apps/connectmobile/e3;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements lx1.a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx1.b f115261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx1.a f115262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ru1.a f115263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3 f115264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f115265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.repcounting.model.d> f115266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.repcounting.model.d> f115267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f115268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f115269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f115270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f115271k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl", f = "STPRepoImpl.kt", l = {253}, m = "saveNewBenchmarks", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f115272a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f115274c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f115272a = obj;
            this.f115274c |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    public e(jx1.b bVar, jx1.a aVar, ru1.a aVar2, e3 e3Var) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        e3Var.getClass();
        this.f115261a = bVar;
        this.f115262b = aVar;
        this.f115263c = aVar2;
        this.f115264d = e3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lx1.a
    public final Object a(List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, t13.d<? super Boolean> dVar) {
        a aVar;
        Object next;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f115274c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f115274c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f115272a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f115274c;
        if (i15 == 0) {
            r.b(objA);
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                aVar.f115274c = 1;
                objA = this.f115264d.a(arrayList, aVar);
                if (objA == aVar2) {
                    return aVar2;
                }
            }
            return Boolean.TRUE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objA);
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            return Boolean.FALSE;
        }
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list2 = this.f115269i;
        ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
            for (com.garmin.android.apps.connectmobile.workouts.data.model.b bVar : list2) {
                Iterator it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    com.garmin.android.apps.connectmobile.workouts.data.model.b bVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.b) next;
                    if (s.g(bVar2.getBenchmarkCategoryKey(), bVar.getBenchmarkCategoryKey()) && s.g(bVar2.getBenchmarkKey(), bVar.getBenchmarkKey())) {
                        break;
                    }
                }
                com.garmin.android.apps.connectmobile.workouts.data.model.b bVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.b) next;
                if (bVar3 != null) {
                    bVar = bVar3;
                }
                arrayList3.add(bVar);
            }
            arrayList2 = arrayList3;
        }
        this.f115269i = arrayList2;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    @Override // lx1.a
    public final kx1.a b(String str) {
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
        Object next;
        str.getClass();
        List<com.garmin.android.apps.connectmobile.repcounting.model.d> list = this.f115267g;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!str.equalsIgnoreCase(((com.garmin.android.apps.connectmobile.repcounting.model.d) next).f41106e));
            dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
            if (dVar == null) {
                dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                dVar.f41106e = str;
                dVar.f41107f = str;
            }
        } else {
            dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
            dVar.f41106e = str;
            dVar.f41107f = str;
        }
        return dy1.s.b(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    @Override // lx1.a
    public final List<kx1.a> c(String str) {
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
        Object next;
        Map<String, List<ix1.a>> mapB;
        str.getClass();
        k kVar = this.f115265e;
        ArrayList arrayList = null;
        List<ix1.a> list = (kVar == null || (mapB = kVar.b()) == null) ? null : mapB.get(str);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            for (ix1.a aVar : list) {
                List<com.garmin.android.apps.connectmobile.repcounting.model.d> list2 = this.f115267g;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!u.q(aVar.getExerciseNameKey(), ((com.garmin.android.apps.connectmobile.repcounting.model.d) next).f41106e, true));
                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                    if (dVar == null) {
                        dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                        dVar.f41106e = aVar.getExerciseNameKey();
                        dVar.f41107f = aVar.getExerciseNameKey();
                    }
                } else {
                    dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                    dVar.f41106e = aVar.getExerciseNameKey();
                    dVar.f41107f = aVar.getExerciseNameKey();
                }
                dVar.f41102a = aVar.getCategoryKey();
                arrayList2.add(dVar);
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return j0.f134944a;
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(dy1.s.b((com.garmin.android.apps.connectmobile.repcounting.model.d) it3.next()));
        }
        return arrayList3;
    }

    @Override // lx1.a
    public final Object d(ArrayList arrayList, nx1.a aVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new d(arrayList, this, null), aVar);
    }

    @Override // lx1.a
    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getF115270j() {
        return this.f115270j;
    }

    @Override // lx1.a
    public final ArrayList g(String str) {
        List listB1;
        Map<String, l> mapF;
        l lVar;
        List<ix1.b> listB;
        k kVar = this.f115265e;
        if (kVar == null || (mapF = kVar.f()) == null || (lVar = mapF.get(str)) == null || (listB = lVar.b()) == null) {
            listB1 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                d0.v(arrayList, ((ix1.b) it.next()).d());
            }
            listB1 = h0.b1(h0.f1(arrayList));
        }
        if (listB1 == null) {
            listB1 = j0.f134944a;
        }
        w13.c cVar = mx1.a.f121350j;
        ArrayList arrayListK = j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            mx1.a aVar = (mx1.a) next;
            if (listB1.contains(aVar.f121355e) || listB1.contains(aVar.f121356f)) {
                arrayListK.add(next);
            }
        }
        return arrayListK;
    }

    @Override // lx1.a
    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c getF115271k() {
        return this.f115271k;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    @Override // lx1.a
    public final ArrayList i(ix1.b bVar) {
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
        Object next;
        bVar.getClass();
        List<String> listD = bVar.d();
        ArrayList arrayList = new ArrayList(y.r(listD, 10));
        for (String str : listD) {
            List<com.garmin.android.apps.connectmobile.repcounting.model.d> list = this.f115267g;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!u.q(str, ((com.garmin.android.apps.connectmobile.repcounting.model.d) next).f41106e, true));
                dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                if (dVar == null) {
                    dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                    dVar.f41106e = str;
                    dVar.f41102a = str;
                    dVar.f41107f = str;
                }
            } else {
                dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                dVar.f41106e = str;
                dVar.f41102a = str;
                dVar.f41107f = str;
            }
            arrayList.add(dVar);
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(dy1.s.b((com.garmin.android.apps.connectmobile.repcounting.model.d) it3.next()));
        }
        return arrayList2;
    }

    @Override // lx1.a
    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.b> j() {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = this.f115269i;
        return list == null ? j0.f134944a : list;
    }

    @Override // lx1.a
    public final Object k(String str, Long l14, i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new c(this, l14, str, null), iVar);
    }

    @Override // lx1.a
    public final com.garmin.android.apps.connectmobile.workouts.data.model.b l(String str, String str2) {
        str.getClass();
        str2.getClass();
        List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list = this.f115269i;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            com.garmin.android.apps.connectmobile.workouts.data.model.b bVar = (com.garmin.android.apps.connectmobile.workouts.data.model.b) obj2;
            if (s.g(bVar.getBenchmarkKey(), str2) && s.g(bVar.getBenchmarkCategoryKey(), str)) {
                obj = obj2;
                break;
            }
        }
        return (com.garmin.android.apps.connectmobile.workouts.data.model.b) obj;
    }

    @Override // lx1.a
    public final Object m(h hVar, ey1.c cVar) {
        return f0.J(this, new b(this, hVar, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    @Override // lx1.a
    public final List<kx1.a> n(String str) {
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
        Object next;
        Map<String, List<ix1.a>> mapD;
        k kVar = this.f115265e;
        ArrayList arrayList = null;
        List<ix1.a> list = (kVar == null || (mapD = kVar.d()) == null) ? null : mapD.get(str);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            for (ix1.a aVar : list) {
                List<com.garmin.android.apps.connectmobile.repcounting.model.d> list2 = this.f115267g;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!u.q(aVar.getExerciseNameKey(), ((com.garmin.android.apps.connectmobile.repcounting.model.d) next).f41106e, true));
                    dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
                    if (dVar == null) {
                        dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                        dVar.f41106e = aVar.getExerciseNameKey();
                        dVar.f41107f = aVar.getExerciseNameKey();
                    }
                } else {
                    dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                    dVar.f41106e = aVar.getExerciseNameKey();
                    dVar.f41107f = aVar.getExerciseNameKey();
                }
                dVar.f41102a = aVar.getCategoryKey();
                arrayList2.add(dVar);
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return j0.f134944a;
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(dy1.s.b((com.garmin.android.apps.connectmobile.repcounting.model.d) it3.next()));
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    @Override // lx1.a
    public final ArrayList o(String str, List list) {
        Map<String, l> mapF;
        l lVar;
        List<ix1.b> listB;
        boolean z14;
        boolean z15;
        Object next;
        Object next2;
        list.getClass();
        k kVar = this.f115265e;
        if (kVar == null || (mapF = kVar.f()) == null || (lVar = mapF.get(str)) == null || (listB = lVar.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(listB, 10));
        for (ix1.b bVar : listB) {
            List<String> listD = bVar.d();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listD) {
                String str2 = (String) obj;
                if (w.z(str2, "barbell", true)) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!s.g(((dy1.a) next2).f61526a.f121355e, str2));
                    dy1.a aVar = (dy1.a) next2;
                    if (aVar == null || !aVar.f61527b) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                } else {
                    z14 = false;
                }
                if (w.z(str2, "dumbbell", true)) {
                    Iterator it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!s.g(((dy1.a) next).f61526a.f121356f, str2));
                    dy1.a aVar2 = (dy1.a) next;
                    z15 = (aVar2 == null || aVar2.f61527b) ? false : true;
                }
                if (z14 || z15) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(ix1.b.b(bVar, arrayList2));
        }
        return arrayList;
    }
}
