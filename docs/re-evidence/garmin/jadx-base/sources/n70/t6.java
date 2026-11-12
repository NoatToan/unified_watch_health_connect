package n70;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t6 implements r53.i<List<? extends j70.a0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s6 f124601b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s6 f124603b;

        /* JADX INFO: renamed from: n70.t6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetWhatsNewItemsUseCase$invoke$$inlined$map$1$2", f = "GetWhatsNewItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2383a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124605b;

            public C2383a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124604a = obj;
                this.f124605b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, s6 s6Var) {
            this.f124602a = jVar;
            this.f124603b = s6Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2383a c2383a;
            ArrayList arrayListC0;
            if (dVar instanceof C2383a) {
                c2383a = (C2383a) dVar;
                int i14 = c2383a.f124605b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2383a.f124605b = i14 - Integer.MIN_VALUE;
                } else {
                    c2383a = new C2383a(dVar);
                }
            } else {
                c2383a = new C2383a(dVar);
            }
            Object obj2 = c2383a.f124604a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2383a.f124605b;
            if (i15 == 0) {
                o13.r.b(obj2);
                List list = (List) obj;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                String strH = tn.k.h("availableWhatsNewItems[", "]", list);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetWhatsNewItemsUseCase", strH);
                s6 s6Var = this.f124603b;
                zd0.g1 g1Var = s6Var.f124573c;
                f12.l lVar = s6Var.f124572b;
                List<c80.y0> listG = g1Var.g();
                String str = null;
                List<c80.y0> listN0 = listG != null ? p13.h0.N0(listG, new x6()) : null;
                String strK = ((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GC_WEB_URL);
                ArrayList arrayList = new ArrayList();
                if (listN0 != null) {
                    for (c80.y0 y0Var : listN0) {
                        String str2 = y0Var.f25637a;
                        c80.t0 t0Var = y0Var.f25648l;
                        String str3 = t0Var.f25592c;
                        arrayList.add(new j70.a0.d(str2, tn.k.g(strK, t0Var.f25591b), g22.n.d(str3) ? tn.k.g(strK, str3) : str, y0Var.f25640d, y0Var.f25641e, y0Var.f25642f, y0Var.f25649m));
                        lVar = lVar;
                        str = null;
                    }
                }
                f12.l lVar2 = lVar;
                if (lVar2.L() == 0) {
                    arrayListC0 = p13.h0.C0(arrayList, p13.h0.N0(list, new w6()));
                } else if (DateTime.now().minusDays(5).getMillis() >= lVar2.L()) {
                    arrayListC0 = p13.h0.C0(arrayList, p13.h0.N0(list, new u6()));
                } else {
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "GetWhatsNewItemsUseCase", "New User - wait 5 days until showing all local cards");
                    arrayListC0 = p13.h0.C0(arrayList, p13.h0.N0(list, new v6()));
                }
                c2383a.f124605b = 1;
                if (this.f124602a.emit(arrayListC0, c2383a) == aVar) {
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

    public t6(r53.i iVar, s6 s6Var) {
        this.f124600a = iVar;
        this.f124601b = s6Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends j70.a0>> jVar, t13.d dVar) {
        Object objCollect = this.f124600a.collect(new a(jVar, this.f124601b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
