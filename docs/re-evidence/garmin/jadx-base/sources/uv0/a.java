package uv0;

import b63.o;
import c02.n;
import i53.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import pv0.l;
import pv0.m;
import pv0.q;
import r53.i;
import r53.j;
import t13.d;
import v13.c;
import v13.e;
import vb.h;
import yz1.a0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<a0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f172904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f172905b;

    /* JADX INFO: renamed from: uv0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3230a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f172906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f172907b;

        /* JADX INFO: renamed from: uv0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.logging.domain.dashboard.GetLifestyleLoggingDataUseCase$invoke$$inlined$map$1$2", f = "GetLifestyleLoggingDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C3231a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f172908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f172909b;

            public C3231a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f172908a = obj;
                this.f172909b |= Integer.MIN_VALUE;
                return C3230a.this.emit(null, this);
            }
        }

        public C3230a(j jVar, b bVar) {
            this.f172906a = jVar;
            this.f172907b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, kotlin.jvm.internal.j] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r5v14 */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Double] */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C3231a c3231a;
            ArrayList arrayList;
            q qVar;
            DateTime dateTime;
            LocalDate localDate;
            l lVar;
            f fVarJ;
            Integer num;
            Integer num2;
            T next;
            String str;
            if (dVar instanceof C3231a) {
                c3231a = (C3231a) dVar;
                int i14 = c3231a.f172909b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3231a.f172909b = i14 - Integer.MIN_VALUE;
                } else {
                    c3231a = new C3231a(dVar);
                }
            } else {
                c3231a = new C3231a(dVar);
            }
            Object obj2 = c3231a.f172908a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3231a.f172909b;
            int i16 = 1;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                pb2.e.o oVar = (pb2.e.o) dVar2.f97521b;
                this.f172907b.getClass();
                ?? d14 = 0;
                d14 = 0;
                if (oVar == null) {
                    qVar = null;
                } else {
                    List<pb2.e.f> list = oVar.f137078a;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (pb2.e.f fVar : list) {
                            arrayList.add(new l(String.valueOf((fVar == null || (dateTime = fVar.f136991a) == null || (localDate = dateTime.toLocalDate()) == null) ? null : fz0.d.c(localDate)), fVar != null ? fVar.f136992b : null, fVar != null ? fVar.f136993c : null));
                        }
                    } else {
                        arrayList = null;
                    }
                    qVar = new q((List) d14, arrayList, i16, (p005kotlin.jvm.internal.j) d14);
                }
                List<l> list2 = qVar != null ? qVar.f141406b : null;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        l lVar2 = (l) next;
                        lVar2.getClass();
                        str = lVar2.f141388a;
                    } while (!s.g(str != null ? o.Companion.b(o.INSTANCE, str) : null, g22.l.d(o.INSTANCE)));
                    lVar = next;
                } else {
                    lVar = null;
                }
                if (list2 != null) {
                    ArrayList arrayListA = m.a(list2);
                    ArrayList arrayList2 = new ArrayList(y.r(arrayListA, 10));
                    Iterator it3 = arrayListA.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(n.c(g22.l.h((o) it3.next())));
                    }
                    fVarJ = i53.a.j(arrayList2);
                } else {
                    fVarJ = null;
                }
                yz1.d dVar3 = dVar2.f97520a;
                Double d15 = (lVar == null || (num2 = lVar.f141390c) == null) ? null : new Double(num2.intValue());
                if (lVar != null && (num = lVar.f141389b) != null) {
                    d14 = new Double(num.intValue());
                }
                a0.a aVar2 = new a0.a(dVar3, d15, d14, fVarJ, n.c(g22.l.h(g22.l.d(o.INSTANCE))));
                c3231a.f172909b = 1;
                if (this.f172906a.emit(aVar2, c3231a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public a(i iVar, b bVar) {
        this.f172904a = iVar;
        this.f172905b = bVar;
    }

    @Override // r53.i
    public final Object collect(j<? super a0.a> jVar, d dVar) {
        Object objCollect = this.f172904a.collect(new C3230a(jVar, this.f172905b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
