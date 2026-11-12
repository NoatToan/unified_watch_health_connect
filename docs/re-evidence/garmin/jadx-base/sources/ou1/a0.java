package ou1;

import am.x0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import o53.j0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Ljava/util/SortedMap;", "", "kotlin.jvm.PlatformType", "Lyw1/i;", "<anonymous>", "(Lo53/b0;)Ljava/util/SortedMap;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getPersonalRecords$2", f = "TrainingPlanFitnessStatsUseCase.kt", l = {392, 393}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super SortedMap<Long, yw1.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f133992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f133994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt1.o f133995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f133996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LocalDate f133997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LocalDate f133998g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133999a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180178i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f133999a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((Number) t7).longValue()), Long.valueOf(((Number) t14).longValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((Number) t14).longValue()), Long.valueOf(((Number) t7).longValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((yw1.i) t14).a(), ((yw1.i) t7).a());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((yw1.i) t14).a(), ((yw1.i) t7).a());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lyw1/i;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getPersonalRecords$2$records$1", f = "TrainingPlanFitnessStatsUseCase.kt", l = {393}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends yw1.i>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f134001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(i iVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f134001b = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f134001b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends yw1.i>>> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134000a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            cx1.o oVar = this.f134001b.f134058a;
            this.f134000a = 1;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.l(oVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lyw1/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase$getPersonalRecords$2$types$1", f = "TrainingPlanFitnessStatsUseCase.kt", l = {392}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends yw1.h>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f134003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(i iVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f134003b = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f134003b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends yw1.h>>> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134002a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            cx1.o oVar = this.f134003b.f134058a;
            this.f134002a = 1;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.k(oVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(vt1.o oVar, i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f133995d = oVar;
        this.f133996e = iVar;
        this.f133997f = localDate;
        this.f133998g = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f133995d, this.f133996e, this.f133997f, this.f133998g, dVar);
        a0Var.f133994c = obj;
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super SortedMap<Long, yw1.i>> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:113:0x02bb  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        v2 v2Var2;
        Set setG1;
        yw1.i iVar;
        String str;
        o53.b0 b0Var = (o53.b0) this.f133994c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133993b;
        i iVar2 = this.f133996e;
        if (i14 == 0) {
            o13.r.b(obj);
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new g(iVar2, null), 3);
            this.f133994c = b0Var;
            this.f133993b = 1;
            obj = j0VarJ.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f133992a;
            o13.r.b(obj);
        }
        v2Var2 = (v2) obj;
        if ((v2Var instanceof v2.b) || !(v2Var2 instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching personal records types ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            }
            if (v2Var2 instanceof v2.a) {
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error occurred while fetching personal records data");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "TrainingPlanFitnessStatsUseCase", strD2);
            }
            return null;
        }
        int[] iArr = a.f133999a;
        vt1.o oVar = this.f133995d;
        if (iArr[oVar.ordinal()] == 1) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                String str2 = ((yw1.h) obj2).f199928d;
                if (d53.u.q(str2, x0.f4324r.f4358a, true) || d53.u.q(str2, x0.f4312o.f4358a, true) || d53.u.q(str2, x0.f4308n.f4358a, true)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((yw1.h) it.next()).f199925a);
            }
            setG1 = h0.g1(arrayList2);
        } else {
            Iterable iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : iterable2) {
                if (d53.u.q(((yw1.h) obj3).f199928d, oVar.f180184a, true)) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((yw1.h) it3.next()).f199925a);
            }
            setG1 = h0.g1(arrayList4);
        }
        Iterable iterable3 = (Iterable) ((v2.b) v2Var2).f47386a;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : iterable3) {
            yw1.i iVar3 = (yw1.i) obj4;
            if (iVar3.a() != null) {
                LocalDate localDateA = iVar3.a();
                localDateA.getClass();
                if (localDateA.compareTo(this.f133997f) >= 0 && localDateA.compareTo(this.f133998g) <= 0 && setG1.contains(iVar3.f199932a)) {
                    arrayList5.add(obj4);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : arrayList5) {
            Long l14 = ((yw1.i) obj5).f199932a;
            Object arrayList6 = linkedHashMap.get(l14);
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                linkedHashMap.put(l14, arrayList6);
            }
            ((List) arrayList6).add(obj5);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Long l15 = (Long) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                iVar = (yw1.i) h0.d0(list);
                if (iVar == null || (str = iVar.f199937f) == null || str.compareTo("ACCEPTED") < 0 || str.compareTo("ARCHIVED") > 0) {
                    iVar = null;
                }
            } else {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : list) {
                    if (p005kotlin.jvm.internal.s.g(((yw1.i) obj6).f199937f, "ACCEPTED")) {
                        arrayList7.add(obj6);
                    }
                }
                yw1.i iVar4 = (yw1.i) h0.n0(h0.N0(arrayList7, new d()));
                if (iVar4 == null) {
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj7 : list) {
                        if (p005kotlin.jvm.internal.s.g(((yw1.i) obj7).f199937f, "ARCHIVED")) {
                            arrayList8.add(obj7);
                        }
                    }
                    iVar = (yw1.i) h0.n0(h0.N0(arrayList8, new e()));
                } else {
                    iVar = iVar4;
                }
            }
            if (iVar != null && l15 != null) {
                linkedHashMap2.put(l15, iVar);
            }
        }
        if (a.f133999a[oVar.ordinal()] != 1) {
            TreeMap treeMap = new TreeMap(new b());
            treeMap.putAll(linkedHashMap2);
            return treeMap;
        }
        List<j23.o> listQ = ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).q();
        TreeMap treeMap2 = new TreeMap(new c());
        treeMap2.putAll(linkedHashMap2);
        TreeMap treeMap3 = new TreeMap(r13.a.a(new aq1.d0(listQ, 21), new ot1.t(9)));
        treeMap3.putAll(treeMap2);
        return treeMap3;
        v2 v2Var3 = (v2) obj;
        j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new f(iVar2, null), 3);
        this.f133994c = b0Var;
        this.f133992a = v2Var3;
        this.f133993b = 2;
        Object objC = j0VarJ2.C(this);
        if (objC != aVar) {
            v2Var = v2Var3;
            obj = objC;
            v2Var2 = (v2) obj;
            if (v2Var instanceof v2.b) {
            }
            if (v2Var instanceof v2.a) {
                String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching personal records types ");
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "TrainingPlanFitnessStatsUseCase", strD3);
            }
            if (v2Var2 instanceof v2.a) {
                String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error occurred while fetching personal records data");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var4, "TrainingPlanFitnessStatsUseCase", strD4);
            }
            return null;
        }
        return aVar;
    }
}
