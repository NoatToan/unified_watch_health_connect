package hq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lhq/r0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseUtil$filterIfExerciseNameFuzzyMatchesQuery$2", f = "SelectExerciseUtil.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class x0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends r0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f85175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.repcounting.model.d> f85176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f85177d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseUtil$filterIfExerciseNameFuzzyMatchesQuery$2$1", f = "SelectExerciseUtil.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.repcounting.model.d, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f85178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o53.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f85178a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f85178a, dVar);
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.repcounting.model.d dVar, t13.d<? super Unit> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            o53.c0.f(this.f85178a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f85179a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f85180a;

            /* JADX INFO: renamed from: hq.x0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseUtil$filterIfExerciseNameFuzzyMatchesQuery$2$invokeSuspend$$inlined$filter$1$2", f = "SelectExerciseUtil.kt", l = {50}, m = "emit", v = 2)
            public static final class C1686a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f85181a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f85182b;

                public C1686a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f85181a = obj;
                    this.f85182b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f85180a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1686a c1686a;
                if (dVar instanceof C1686a) {
                    c1686a = (C1686a) dVar;
                    int i14 = c1686a.f85182b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1686a.f85182b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1686a = new C1686a(dVar);
                    }
                } else {
                    c1686a = new C1686a(dVar);
                }
                Object obj2 = c1686a.f85181a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1686a.f85182b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Integer num = ((r0) obj).f85141b;
                    if (num != null && num.intValue() <= 2) {
                        c1686a.f85182b = 1;
                        if (this.f85180a.emit(obj, c1686a) == aVar) {
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

        public b(r53.i iVar) {
            this.f85179a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super r0> jVar, t13.d dVar) {
            Object objCollect = this.f85179a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f85184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f85185b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f85186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f85187b;

            /* JADX INFO: renamed from: hq.x0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseUtil$filterIfExerciseNameFuzzyMatchesQuery$2$invokeSuspend$$inlined$map$1$2", f = "SelectExerciseUtil.kt", l = {50}, m = "emit", v = 2)
            public static final class C1687a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f85188a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f85189b;

                public C1687a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f85188a = obj;
                    this.f85189b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, String str) {
                this.f85186a = jVar;
                this.f85187b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1687a c1687a;
                Object next;
                if (dVar instanceof C1687a) {
                    c1687a = (C1687a) dVar;
                    int i14 = c1687a.f85189b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1687a.f85189b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1687a = new C1687a(dVar);
                    }
                } else {
                    c1687a = new C1687a(dVar);
                }
                Object obj2 = c1687a.f85188a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1687a.f85189b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    com.garmin.android.apps.connectmobile.repcounting.model.d dVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) obj;
                    String str = dVar2.f41107f;
                    if (str == null) {
                        str = "";
                    }
                    d53.k kVar = c22.w0.f23305a;
                    String str2 = this.f85187b;
                    str2.getClass();
                    d53.k kVar2 = c22.w0.f23305a;
                    int iA = 0;
                    List listG = kVar2.g(0, str2);
                    ArrayList<String> arrayList = new ArrayList();
                    for (T t7 : listG) {
                        if (!d53.w.J((String) t7)) {
                            arrayList.add(t7);
                        }
                    }
                    List listG2 = kVar2.g(0, str);
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (T t14 : listG2) {
                        if (!d53.w.J((String) t14)) {
                            arrayList2.add(t14);
                        }
                    }
                    if (arrayList.isEmpty() || arrayList2.isEmpty()) {
                        iA = c22.w0.a(str2, str);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : arrayList) {
                            String str4 = (String) p13.h0.b0(arrayList2);
                            int i16 = Integer.MAX_VALUE;
                            for (String str5 : arrayList2) {
                                int iA2 = c22.w0.a(str3, str5);
                                if (iA2 < i16) {
                                    if (iA2 == 0) {
                                        str4 = str5;
                                        break;
                                    }
                                    i16 = iA2;
                                    str4 = str5;
                                }
                            }
                            arrayList3.add(str4);
                            iA += c22.w0.a(str3, str4);
                        }
                        if (iA > 2) {
                            Iterator it = arrayList2.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!d53.w.z((String) next, str2, true));
                        }
                    }
                    r0 r0Var = new r0(dVar2, new Integer(iA));
                    c1687a.f85189b = 1;
                    if (this.f85186a.emit(r0Var, c1687a) == aVar) {
                        return aVar;
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

        public c(r53.i iVar, String str) {
            this.f85184a = iVar;
            this.f85185b = str;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super r0> jVar, t13.d dVar) {
            Object objCollect = this.f85184a.collect(new a(jVar, this.f85185b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(List<com.garmin.android.apps.connectmobile.repcounting.model.d> list, String str, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f85176c = list;
        this.f85177d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x0 x0Var = new x0(this.f85176c, this.f85177d, dVar);
        x0Var.f85175b = obj;
        return x0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends r0>> dVar) {
        return ((x0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f85175b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85174a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b bVar = new b(new c(new m1(r53.s.s(new r53.k(this.f85176c)), new a(b0Var, null)), this.f85177d));
        this.f85175b = null;
        this.f85174a = 1;
        Object objM = r53.s.M(bVar, new ArrayList(), this);
        return objM == aVar ? aVar : objM;
    }
}
