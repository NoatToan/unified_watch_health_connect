package n70;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g2 implements r53.i<j70.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f124230b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k2 f124232b;

        /* JADX INFO: renamed from: n70.g2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetEventsDataUseCase$invoke$$inlined$map$1$2", f = "GetEventsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2352a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124233a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124234b;

            public C2352a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124233a = obj;
                this.f124234b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, k2 k2Var) {
            this.f124231a = jVar;
            this.f124232b = k2Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2352a c2352a;
            List<fg0.e> listA;
            j70.k.h hVar;
            j70.k.h hVar2;
            j70.k.h hVar3;
            j70.k.h hVar4;
            if (dVar instanceof C2352a) {
                c2352a = (C2352a) dVar;
                int i14 = c2352a.f124234b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2352a.f124234b = i14 - Integer.MIN_VALUE;
                } else {
                    c2352a = new C2352a(dVar);
                }
            } else {
                c2352a = new C2352a(dVar);
            }
            Object obj2 = c2352a.f124233a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2352a.f124234b;
            if (i15 == 0) {
                o13.r.b(obj2);
                o70.k kVar = (o70.k) obj;
                String str = (kVar == null || (hVar4 = kVar.f130024b) == null) ? null : hVar4.f97595c;
                this.f124232b.getClass();
                com.garmin.android.apps.connectmobile.dashboard.data.datasource.n1 n1Var = str == null ? null : (com.garmin.android.apps.connectmobile.dashboard.data.datasource.n1) GsonUtil.f47253b.fromJson(str, (Class) com.garmin.android.apps.connectmobile.dashboard.data.datasource.n1.class);
                yz1.d dVarA = yz1.e.a((kVar == null || (hVar3 = kVar.f130024b) == null) ? null : hVar3.f97593a, new h2(n1Var));
                String str2 = (kVar == null || (hVar2 = kVar.f130024b) == null) ? null : hVar2.f97596d;
                Map map = str2 == null ? null : (Map) GsonUtil.f47253b.fromJson(str2, new j2().getType());
                String str3 = (kVar == null || (hVar = kVar.f130024b) == null) ? null : hVar.f97597e;
                Map map2 = str3 == null ? null : (Map) GsonUtil.f47253b.fromJson(str3, new i2().getType());
                if (n1Var == null || (listA = n1Var.a()) == null) {
                    listA = p13.j0.f134944a;
                }
                ArrayList arrayList = new ArrayList();
                for (fg0.e eVar : listA) {
                    r70.s sVarB = m70.f.b(new j70.d(dVarA, new fg0.l(eVar, map != null ? (String) map.get(eVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) : null, map2 != null ? (h42.a) map2.get(eVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) : null)), "EventType_" + o70.j.RACE.f130022a);
                    if (sVarB != null) {
                        arrayList.add(sVarB);
                    }
                }
                j70.q qVar = new j70.q(dVarA, n1Var != null ? n1Var.getHasMoreEvents() : false, i53.a.j(arrayList), (kVar != null ? kVar.f130023a : 0) > 1);
                c2352a.f124234b = 1;
                if (this.f124231a.emit(qVar, c2352a) == aVar) {
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

    public g2(r53.i iVar, k2 k2Var) {
        this.f124229a = iVar;
        this.f124230b = k2Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.q> jVar, t13.d dVar) {
        Object objCollect = this.f124229a.collect(new a(jVar, this.f124230b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
