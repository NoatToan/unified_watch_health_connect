package k50;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r53.a2;
import r53.b2;
import r53.c2;
import r53.e2;
import r53.g2;
import r53.i;
import r53.j;
import r53.k2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import r53.u;
import r53.v;
import vb.h;
import z20.o;
import z20.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk50/f;", "Landroidx/lifecycle/u1;", "Ll40/b;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courses", "Lz20/p;", "getOnCourseFeaturesUseCase", "<init>", "(Ljava/util/List;Lz20/p;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 implements l40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f102925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f102926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f102927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f102928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f102929e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements i<l40.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f102930a;

        /* JADX INFO: renamed from: k50.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1973a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f102931a;

            /* JADX INFO: renamed from: k50.f$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapViewModel$special$$inlined$map$1$2", f = "CourseMapViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1974a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f102932a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f102933b;

                public C1974a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f102932a = obj;
                    this.f102933b |= Integer.MIN_VALUE;
                    return C1973a.this.emit(null, this);
                }
            }

            public C1973a(j jVar) {
                this.f102931a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1974a c1974a;
                if (dVar instanceof C1974a) {
                    c1974a = (C1974a) dVar;
                    int i14 = c1974a.f102933b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1974a.f102933b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1974a = new C1974a(dVar);
                    }
                } else {
                    c1974a = new C1974a(dVar);
                }
                Object obj2 = c1974a.f102932a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1974a.f102933b;
                if (i15 == 0) {
                    r.b(obj2);
                    l40.d dVar2 = ((m50.c) obj).f116646c;
                    c1974a.f102933b = 1;
                    if (this.f102931a.emit(dVar2, c1974a) == aVar) {
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

        public a(i iVar) {
            this.f102930a = iVar;
        }

        @Override // r53.i
        public final Object collect(j<? super l40.d> jVar, t13.d dVar) {
            Object objCollect = this.f102930a.collect(new C1973a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public f(List<com.garmin.android.apps.connectmobile.courses.model.e> list, p pVar) {
        list.getClass();
        pVar.getClass();
        p2 p2VarA = q2.a(new m50.c(false, null, null, 7, null));
        this.f102925a = p2VarA;
        b2 b2VarD = s.d(p2VarA);
        this.f102926b = b2VarD;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f102927c = e2VarB;
        this.f102928d = s.c(e2VarB);
        a aVar = new a(b2VarD);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f102929e = s.K(aVar, aVarA, k2.a.f150705b, ((m50.c) b2VarD.f150540a.getValue()).f116646c);
        if (list.size() == 1) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) h0.b0(list);
            u uVar = new u(new m1(new v(new c(this, null), new c2(new o(pVar, eVar.courseId, eVar.m().c(), null))), new d(eVar, this, null)), new e(this, null));
            x53.c cVar = s0.f129406a;
            s.C(s.A(uVar, x53.b.f189152a), v1.a(this));
            return;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new w20.a((com.garmin.android.apps.connectmobile.courses.model.e) it.next(), null, null, null, null, false, 32, null));
        }
        p2 p2Var = this.f102925a;
        p2Var.k(null, m50.c.a((m50.c) p2Var.getValue(), false, arrayList, null, 5));
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        p2 p2Var;
        Object value;
        m50.c cVar;
        l40.d dVar;
        do {
            p2Var = this.f102925a;
            value = p2Var.getValue();
            cVar = (m50.c) value;
            l40.c cVar2 = l40.c.f109891a;
            dVar = cVar.f116646c;
            cVar2.getClass();
        } while (!p2Var.b(value, m50.c.a(cVar, false, null, l40.c.a(dVar, aVar), 3)));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2, reason: from getter */
    public final b2 getF150436o() {
        return this.f102929e;
    }
}
