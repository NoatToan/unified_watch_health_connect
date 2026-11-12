package md1;

import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p92.y;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements i<kd1.c<? extends rd1.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f117928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f117929b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f117930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f117931b;

        /* JADX INFO: renamed from: md1.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.reminders.domain.dayphase.GetDayPhaseRemindersUseCase$invoke$$inlined$map$1$2", f = "GetDayPhaseRemindersUseCase.kt", l = {57, 50}, m = "emit", v = 2)
        public static final class C2242a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f117932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f117933b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public j f117935d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public rd1.a f117936e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f117937f;

            public C2242a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f117932a = obj;
                this.f117933b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, b bVar) {
            this.f117930a = jVar;
            this.f117931b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0137, code lost:
        
            if (r6.emit(r14, r0) == r1) goto L67;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) throws Throwable {
            C2242a c2242a;
            int i14;
            j jVar;
            Object c1998c;
            rd1.a aVar;
            Object objE0;
            int i15;
            j jVar2;
            rd1.a aVar2;
            j jVar3;
            if (dVar instanceof C2242a) {
                c2242a = (C2242a) dVar;
                int i16 = c2242a.f117933b;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    c2242a.f117933b = i16 - Integer.MIN_VALUE;
                } else {
                    c2242a = new C2242a(dVar);
                }
            } else {
                c2242a = new C2242a(dVar);
            }
            Object obj2 = c2242a.f117932a;
            Object obj3 = u13.a.COROUTINE_SUSPENDED;
            int i17 = c2242a.f117933b;
            if (i17 != 0) {
                if (i17 == 1) {
                    i15 = c2242a.f117937f;
                    aVar2 = c2242a.f117936e;
                    j jVar4 = c2242a.f117935d;
                    r.b(obj2);
                    jVar2 = jVar4;
                } else {
                    if (i17 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
            r.b(obj2);
            kd1.c cVar = (kd1.c) obj;
            boolean z14 = cVar instanceof kd1.c.C1998c;
            i14 = 0;
            jVar = this.f117930a;
            if (z14) {
                qd1.b bVar = (qd1.b) ((kd1.c.C1998c) cVar).f104499a;
                b bVar2 = this.f117931b;
                if (bVar != null) {
                    List<qd1.a> list = bVar.f144479a;
                    md1.a aVar3 = bVar2.f117921b;
                    aVar = new rd1.a(list.size() > 0 ? list.get(0) : aVar3.b(), 1 < list.size() ? list.get(1) : aVar3.a(), bVar.f144480b, bVar.f144481c);
                } else {
                    aVar = null;
                }
                Iterable iterable = bVar != null ? bVar.f144479a : j0.f134944a;
                c2242a.f117935d = jVar;
                c2242a.f117936e = aVar;
                c2242a.f117937f = 0;
                c2242a.f117933b = 1;
                int i18 = b.f117919c;
                bVar2.getClass();
                ArrayList arrayList = new ArrayList();
                for (T t7 : iterable) {
                    qd1.a aVar4 = (qd1.a) t7;
                    if (!s.g(aVar4.f144478d, aVar != null ? aVar.f152032a.f144478d : null)) {
                        if (!s.g(aVar4.f144478d, aVar != null ? aVar.f152033b.f144478d : null)) {
                            arrayList.add(t7);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    objE0 = Unit.INSTANCE;
                } else {
                    String strH = am.j.h(arrayList.size(), "Expected at most 2 reminders for DayPhaseReminders, but got ");
                    y.f136664a.getClass();
                    y.a.c("GetDayPhaseRemindersUseCase", strH);
                    sd1.e eVar = (sd1.e) KoinJavaComponent.get$default(sd1.e.class, null, null, 6, null);
                    x53.c cVar2 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new c(arrayList, eVar, null), c2242a);
                    if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                        objE0 = Unit.INSTANCE;
                    }
                }
                if (objE0 != obj3) {
                    i15 = 0;
                    jVar2 = jVar;
                    aVar2 = aVar;
                }
            } else {
                c1998c = kd1.c.a.f104497a;
                if (!s.g(cVar, c1998c)) {
                    c1998c = kd1.c.b.f104498a;
                    if (!s.g(cVar, c1998c)) {
                        jVar3 = jVar;
                        jVar3 = jVar;
                        u0.r();
                        return null;
                    }
                }
                jVar3 = jVar;
                jVar3 = jVar;
                jVar3 = jVar;
                c2242a.f117935d = null;
                c2242a.f117936e = null;
                c2242a.f117937f = i14;
                c2242a.f117933b = 2;
            }
            return obj3;
            c1998c = new kd1.c.C1998c(aVar2);
            i14 = i15;
            jVar3 = jVar2;
            jVar3 = jVar;
            jVar3 = jVar;
            jVar3 = jVar;
            c2242a.f117935d = null;
            c2242a.f117936e = null;
            c2242a.f117937f = i14;
            c2242a.f117933b = 2;
        }
    }

    public d(i iVar, b bVar) {
        this.f117928a = iVar;
        this.f117929b = bVar;
    }

    @Override // r53.i
    public final Object collect(j<? super kd1.c<? extends rd1.a>> jVar, t13.d dVar) {
        Object objCollect = this.f117928a.collect(new a(jVar, this.f117929b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
