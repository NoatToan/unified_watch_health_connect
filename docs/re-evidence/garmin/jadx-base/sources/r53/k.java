package r53;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/k;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterable f150682a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", l = {111}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f150683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150684b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j f150686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator f150687e;

        public a(t13.d dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150683a = obj;
            this.f150684b |= Integer.MIN_VALUE;
            return k.this.collect(null, this);
        }
    }

    public k(Iterable iterable) {
        this.f150682a = iterable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) {
        a aVar;
        j jVar2;
        Iterator it;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150684b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150684b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f150683a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150684b;
        if (i15 == 0) {
            o13.r.b(obj);
            jVar2 = jVar;
            it = this.f150682a.iterator();
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = aVar.f150687e;
            j jVar3 = aVar.f150686d;
            o13.r.b(obj);
            jVar2 = jVar3;
        }
        while (it.hasNext()) {
            Object next = it.next();
            aVar.f150686d = jVar2;
            aVar.f150687e = it;
            aVar.f150684b = 1;
            if (jVar2.emit(next, aVar) == aVar2) {
                return aVar2;
            }
        }
        return Unit.INSTANCE;
    }
}
