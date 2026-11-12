package h4;

import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
public final class u extends v13.i implements e23.p<b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f81581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<b0, Object> f81582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference<t<Object>> f81583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f81584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(e23.l<? super b0, Object> lVar, AtomicReference<t<Object>> atomicReference, e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f81582c = lVar;
        this.f81583d = atomicReference;
        this.f81584e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f81582c, this.f81583d, this.f81584e, dVar);
        uVar.f81581b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<Object> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        t<Object> tVar;
        l1 l1Var;
        t<Object> tVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f81580a;
        AtomicReference<t<Object>> atomicReference = this.f81583d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                b0 b0Var = (b0) this.f81581b;
                tVar = new t<>(g8.i.G(b0Var.getF195311f()), this.f81582c.invoke(b0Var));
                t<Object> andSet = atomicReference.getAndSet(tVar);
                if (andSet != null && (l1Var = andSet.f81578a) != null) {
                    this.f81581b = tVar;
                    this.f81580a = 1;
                    if (g8.i.r(l1Var, this) != aVar) {
                    }
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tVar2 = (t) this.f81581b;
                try {
                    o13.r.b(obj);
                    while (!atomicReference.compareAndSet(tVar2, null) && atomicReference.get() == tVar2) {
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    while (!atomicReference.compareAndSet(tVar2, null)) {
                    }
                    throw th;
                }
            }
            tVar = (t) this.f81581b;
            o13.r.b(obj);
            e23.p<Object, t13.d<Object>, Object> pVar = this.f81584e;
            Object obj2 = tVar.f81579b;
            this.f81581b = tVar;
            this.f81580a = 2;
            obj = pVar.invoke(obj2, this);
            if (obj != aVar) {
                tVar2 = tVar;
                while (!atomicReference.compareAndSet(tVar2, null)) {
                }
                return obj;
            }
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            tVar2 = tVar;
            while (!atomicReference.compareAndSet(tVar2, null) && atomicReference.get() == tVar2) {
            }
            throw th;
        }
    }
}
