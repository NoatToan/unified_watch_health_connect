package n70;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.joda.time.LocalDate;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements r53.i<n70.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f124419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f124420c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f124422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f124423c;

        /* JADX INFO: renamed from: n70.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetActivitiesAndWorkoutsDataUseCase$invoke$$inlined$map$1$2", f = "GetActivitiesAndWorkoutsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2371a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124425b;

            public C2371a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124424a = obj;
                this.f124425b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, m mVar, LocalDate localDate) {
            this.f124421a = jVar;
            this.f124422b = mVar;
            this.f124423c = localDate;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:128:0x01f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x0045 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2371a c2371a;
            int iNextIndex;
            j70.d dVar2;
            yz1.d dVar3;
            j70.d dVar4;
            yz1.d dVar5;
            yz1.d dVar6;
            yz1.d dVar7;
            yz1.d dVar8;
            yz1.d dVar9;
            yz1.d dVar10;
            List<String> list;
            String strA;
            a0 a0Var;
            List list2;
            yz1.d dVar11;
            List<pb2.a.d> list3;
            if (dVar instanceof C2371a) {
                c2371a = (C2371a) dVar;
                int i14 = c2371a.f124425b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2371a.f124425b = i14 - Integer.MIN_VALUE;
                } else {
                    c2371a = new C2371a(dVar);
                }
            } else {
                c2371a = new C2371a(dVar);
            }
            Object obj2 = c2371a.f124424a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2371a.f124425b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.a aVar2 = (j70.a) obj;
                ArrayList arrayList = new ArrayList();
                w13.c cVar = o70.b.f129924k;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (true) {
                    boolean zHasNext = bVarN.hasNext();
                    m mVar = this.f124422b;
                    if (zHasNext) {
                        o70.b bVar = (o70.b) bVarN.next();
                        int i16 = m.a.f124402a[bVar.ordinal()];
                        LocalDate localDate = this.f124423c;
                        switch (i16) {
                            case 1:
                                if (aVar2 == null || (dVar3 = aVar2.f97463a) == null) {
                                    dVar3 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar2 = new j70.d(dVar3, aVar2 != null ? Boolean.valueOf(aVar2.f97471i) : null);
                                strA = bVar.a();
                                mVar.getClass();
                                try {
                                    a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                } catch (Exception unused) {
                                    com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                    aVar3.getClass();
                                    com.garmin.android.apps.connectmobile.i2.a.o(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "Failed to get activity workout type state holders with qualifier: " + strA + " and params");
                                    a0Var = null;
                                }
                                list2 = a0Var != null ? (List) a0Var.invoke() : null;
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            case 2:
                                if (aVar2 == null || (dVar5 = aVar2.f97463a) == null) {
                                    dVar5 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar4 = new j70.d(dVar5, new o70.a(p13.w.c(aVar2 != null ? aVar2.f97464b : null), localDate));
                                dVar2 = dVar4;
                                strA = bVar.a();
                                mVar.getClass();
                                a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                if (a0Var != null) {
                                }
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            case 3:
                                if (aVar2 == null || (dVar6 = aVar2.f97463a) == null) {
                                    dVar6 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar4 = new j70.d(dVar6, new o70.a(p13.w.c(aVar2 != null ? aVar2.f97465c : null), localDate));
                                dVar2 = dVar4;
                                strA = bVar.a();
                                mVar.getClass();
                                a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                if (a0Var != null) {
                                }
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            case 4:
                                if (aVar2 == null || (dVar7 = aVar2.f97463a) == null) {
                                    dVar7 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar4 = new j70.d(dVar7, new o70.a(p13.w.c(aVar2 != null ? aVar2.f97466d : null), localDate));
                                dVar2 = dVar4;
                                strA = bVar.a();
                                mVar.getClass();
                                a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                if (a0Var != null) {
                                }
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            case 5:
                                if (aVar2 == null || (dVar8 = aVar2.f97463a) == null) {
                                    dVar8 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar4 = new j70.d(dVar8, new o70.a(p13.w.c(aVar2 != null ? aVar2.f97467e : null), localDate));
                                dVar2 = dVar4;
                                strA = bVar.a();
                                mVar.getClass();
                                a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                if (a0Var != null) {
                                }
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            case 6:
                                if (aVar2 == null || (dVar9 = aVar2.f97463a) == null) {
                                    dVar9 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar4 = new j70.d(dVar9, new o70.a(p13.w.c(aVar2 != null ? aVar2.f97468f : null), localDate));
                                dVar2 = dVar4;
                                strA = bVar.a();
                                mVar.getClass();
                                a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                if (a0Var != null) {
                                }
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            case 7:
                                if (aVar2 == null || (dVar10 = aVar2.f97463a) == null) {
                                    dVar10 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar2 = new j70.d(dVar10, (aVar2 == null || (list = aVar2.f97469g) == null) ? null : new o70.a(list, localDate));
                                strA = bVar.a();
                                mVar.getClass();
                                a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                if (a0Var != null) {
                                }
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            case 8:
                                if (aVar2 == null || (dVar11 = aVar2.f97463a) == null) {
                                    dVar11 = new yz1.d(yz1.u.LOADING, null, false, 6, null);
                                }
                                dVar2 = new j70.d(dVar11, (aVar2 == null || (list3 = aVar2.f97470h) == null) ? null : new o70.q(list3, localDate));
                                strA = bVar.a();
                                mVar.getClass();
                                a0Var = (a0) KoinJavaComponent.get(a0.class, QualifierKt.named(strA), new mh1.i(dVar2, 27));
                                if (a0Var != null) {
                                }
                                if (list2 != null) {
                                    arrayList.addAll(list2);
                                }
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                    } else {
                        p13.c0.u(arrayList, new r70.b(mVar.f124401b));
                        i53.f fVarJ = i53.a.j(arrayList);
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                o70.b f84924b = ((r70.a) listIterator.previous()).getF84924b();
                                f84924b.getClass();
                                switch (o70.b.C2477b.f129926a[f84924b.ordinal()]) {
                                    case 1:
                                        iNextIndex = listIterator.nextIndex();
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                            } else {
                                iNextIndex = -1;
                            }
                        }
                        if (iNextIndex < 0) {
                            iNextIndex = 0;
                        }
                        n70.a aVar4 = new n70.a(fVarJ, iNextIndex);
                        c2371a.f124425b = 1;
                        if (this.f124421a.emit(aVar4, c2371a) == aVar) {
                            return aVar;
                        }
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

    public n(r53.i iVar, m mVar, LocalDate localDate) {
        this.f124418a = iVar;
        this.f124419b = mVar;
        this.f124420c = localDate;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super n70.a> jVar, t13.d dVar) {
        Object objCollect = this.f124418a.collect(new a(jVar, this.f124419b, this.f124420c), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
