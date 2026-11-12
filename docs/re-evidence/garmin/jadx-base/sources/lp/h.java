package lp;

import am.x0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements r53.i<i53.f<? extends mp.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f114102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f114103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f114104c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f114105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f114106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f114107c;

        /* JADX INFO: renamed from: lp.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.domain.GetSelectionFilterActivitiesUseCase$invoke$$inlined$map$1$2", f = "GetSelectionFilterActivitiesUseCase.kt", l = {53, 50}, m = "emit", v = 2)
        public static final class C2174a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f114108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f114109b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f114111d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public ArrayList f114112e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public ArrayList f114113f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f114114g;

            public C2174a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f114108a = obj;
                this.f114109b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, x0 x0Var, i iVar) {
            this.f114105a = jVar;
            this.f114106b = x0Var;
            this.f114107c = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
        
            if (r7.emit(r13, r0) == r1) goto L26;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C2174a c2174a;
            ArrayList arrayListM;
            int i14;
            r53.j jVar;
            ArrayList arrayList;
            if (dVar instanceof C2174a) {
                c2174a = (C2174a) dVar;
                int i15 = c2174a.f114109b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c2174a.f114109b = i15 - Integer.MIN_VALUE;
                } else {
                    c2174a = new C2174a(dVar);
                }
            } else {
                c2174a = new C2174a(dVar);
            }
            Object obj2 = c2174a.f114108a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = c2174a.f114109b;
            x0 x0Var = this.f114106b;
            if (i16 != 0) {
                if (i16 == 1) {
                    i14 = c2174a.f114114g;
                    arrayListM = c2174a.f114113f;
                    arrayList = c2174a.f114112e;
                    jVar = c2174a.f114111d;
                    r.b(obj2);
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
            r.b(obj2);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            arrayListM = x.m(new mp.f(x0Var));
            r53.j jVar2 = this.f114105a;
            c2174a.f114111d = jVar2;
            c2174a.f114112e = arrayListM;
            c2174a.f114113f = arrayListM;
            c2174a.f114114g = 0;
            c2174a.f114109b = 1;
            Serializable serializableA = i.a(this.f114107c, x0Var, zBooleanValue, c2174a);
            if (serializableA != aVar) {
                obj2 = serializableA;
                i14 = 0;
                jVar = jVar2;
                arrayList = arrayListM;
            }
            return aVar;
            Iterable iterable = (Iterable) obj2;
            ArrayList arrayList2 = new ArrayList(y.r(iterable, 10));
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new mp.g(x0Var, (x0) it.next()));
            }
            arrayListM.addAll(arrayList2);
            i53.f fVarJ = i53.a.j(arrayList);
            c2174a.f114111d = null;
            c2174a.f114112e = null;
            c2174a.f114113f = null;
            c2174a.f114114g = i14;
            c2174a.f114109b = 2;
        }
    }

    public h(r53.i iVar, x0 x0Var, i iVar2) {
        this.f114102a = iVar;
        this.f114103b = x0Var;
        this.f114104c = iVar2;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super i53.f<? extends mp.b>> jVar, t13.d dVar) {
        Object objCollect = this.f114102a.collect(new a(jVar, this.f114103b, this.f114104c), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
