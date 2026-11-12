package hf1;

import d53.u;
import d53.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;
import p13.y;
import r53.i;
import r53.j;
import t13.d;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f83628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf1.a f83629b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f83630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ hf1.a f83631b;

        /* JADX INFO: renamed from: hf1.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.running_tolerance.domain.dashboard.GetRunningToleranceDataUseCase$invoke$$inlined$map$1$2", f = "GetRunningToleranceDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1649a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f83632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f83633b;

            public C1649a(d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f83632a = obj;
                this.f83633b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, hf1.a aVar) {
            this.f83630a = jVar;
            this.f83631b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, d dVar) {
            C1649a c1649a;
            p pVar;
            if (dVar instanceof C1649a) {
                c1649a = (C1649a) dVar;
                int i14 = c1649a.f83633b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1649a.f83633b = i14 - Integer.MIN_VALUE;
                } else {
                    c1649a = new C1649a(dVar);
                }
            } else {
                c1649a = new C1649a(dVar);
            }
            Object obj2 = c1649a.f83632a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1649a.f83633b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                String strValueOf = String.valueOf(dVar2 != null ? (List) dVar2.f97521b : null);
                int i16 = hf1.a.f83626b;
                this.f83631b.getClass();
                List listW = w.W(u.v(u.v(u.v(u.v(strValueOf, "[[", "", false), "]]", "", false), "RunningToleranceStat(", "", false), ")", "", false), new String[]{","});
                int iA = t0.a(y.r(listW, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator<T> it = listW.iterator();
                while (it.hasNext()) {
                    try {
                        List listW2 = w.W((String) it.next(), new String[]{"="});
                        pVar = new p(w.i0((String) listW2.get(0)).toString(), w.i0((String) listW2.get(1)).toString());
                    } catch (IndexOutOfBoundsException unused) {
                        pVar = new p("", "");
                    }
                    linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                }
                String str = (String) linkedHashMap.get("userProfilePK");
                Integer num = str != null ? new Integer(Integer.parseInt(str)) : null;
                String str2 = (String) linkedHashMap.get("calendarDate");
                String str3 = (String) linkedHashMap.get("acuteTolerance");
                Integer num2 = str3 != null ? new Integer(Integer.parseInt(str3)) : null;
                String str4 = (String) linkedHashMap.get("acuteDistance");
                Integer num3 = str4 != null ? new Integer(Integer.parseInt(str4)) : null;
                String str5 = (String) linkedHashMap.get("acuteImpactLoad");
                c cVar = new c(num, str2, str5 != null ? new Integer(Integer.parseInt(str5)) : null, num3, num2);
                c1649a.f83633b = 1;
                if (this.f83630a.emit(cVar, c1649a) == aVar) {
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

    public b(i iVar, hf1.a aVar) {
        this.f83628a = iVar;
        this.f83629b = aVar;
    }

    @Override // r53.i
    public final Object collect(j<? super c> jVar, d dVar) {
        Object objCollect = this.f83628a.collect(new a(jVar, this.f83629b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
