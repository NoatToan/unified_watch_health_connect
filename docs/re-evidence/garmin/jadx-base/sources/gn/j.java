package gn;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements r53.i<List<in.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f78036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f78037b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f78038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f78039b;

        /* JADX INFO: renamed from: gn.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.domain.dashboard.GetActivityTrendsQuickActionsUseCase$invoke$$inlined$map$1$2", f = "GetActivityTrendsQuickActionsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1573a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f78040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f78041b;

            public C1573a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f78040a = obj;
                this.f78041b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, List list) {
            this.f78038a = jVar;
            this.f78039b = list;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1573a c1573a;
            if (dVar instanceof C1573a) {
                c1573a = (C1573a) dVar;
                int i14 = c1573a.f78041b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1573a.f78041b = i14 - Integer.MIN_VALUE;
                } else {
                    c1573a = new C1573a(dVar);
                }
            } else {
                c1573a = new C1573a(dVar);
            }
            Object obj2 = c1573a.f78040a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1573a.f78041b;
            if (i15 == 0) {
                o13.r.b(obj2);
                ArrayList arrayList = new ArrayList();
                if (((bu0.k) obj) instanceof bu0.k.a) {
                    arrayList.add(in.e.ACTIVITY_IN_PROGRESS);
                } else if (!this.f78039b.isEmpty()) {
                    arrayList.add(in.e.RECORD_ACTIVITY);
                }
                arrayList.add(in.e.CREATE_MANUAL_ACTIVITY);
                c1573a.f78041b = 1;
                if (this.f78038a.emit(arrayList, c1573a) == aVar) {
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

    public j(r53.i iVar, List list) {
        this.f78036a = iVar;
        this.f78037b = list;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<in.e>> jVar, t13.d dVar) {
        Object objCollect = this.f78036a.collect(new a(jVar, this.f78037b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
