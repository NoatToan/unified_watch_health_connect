package q53;

import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f143010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e23.a f143011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f143012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f143013d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f143012c = obj;
            this.f143013d |= Integer.MIN_VALUE;
            return r.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.j<Unit> f143014a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(o53.j<? super Unit> jVar) {
            this.f143014a = jVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            int i14 = o13.q.f128596b;
            Unit unit = Unit.INSTANCE;
            this.f143014a.resumeWith(unit);
            return unit;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t<?> tVar, e23.a<Unit> aVar, t13.d<? super Unit> dVar) {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i14 = aVar2.f143013d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f143013d = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object obj = aVar2.f143012c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f143013d;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (aVar2.getF157466b().get(l1.f129368i0) != tVar) {
                    vb.h.z("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                aVar2.f143010a = tVar;
                aVar2.f143011b = aVar;
                aVar2.f143013d = 1;
                o53.k kVar = new o53.k(u13.f.b(aVar2), 1);
                kVar.q();
                tVar.m(new b(kVar));
                if (kVar.p() == aVar3) {
                    return aVar3;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = aVar2.f143011b;
                o13.r.b(obj);
            }
            aVar.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            aVar.invoke();
            throw th3;
        }
    }
}
