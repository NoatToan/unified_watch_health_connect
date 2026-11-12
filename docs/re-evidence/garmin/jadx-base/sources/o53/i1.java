package o53;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
public final class i1 extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f129350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Object> f129351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(e23.a<Object> aVar, t13.d<? super i1> dVar) {
        super(2, dVar);
        this.f129351b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i1 i1Var = new i1(this.f129351b, dVar);
        i1Var.f129350a = obj;
        return i1Var;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((i1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t13.g f183565a = ((b0) this.f129350a).getF195311f();
        e23.a<Object> aVar2 = this.f129351b;
        try {
            h2 h2Var = new h2();
            h2Var.f129348f = g8.i.O(g8.i.G(f183565a), h2Var);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h2.f129346g;
            do {
                i14 = atomicIntegerFieldUpdater.get(h2Var);
                if (i14 != 0) {
                    if (i14 == 2 || i14 == 3) {
                        break;
                        break;
                    }
                    h2.l(i14);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(h2Var, i14, 0));
            try {
                return aVar2.invoke();
            } finally {
                h2Var.k();
            }
        } catch (InterruptedException e4) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e4);
        }
    }
}
