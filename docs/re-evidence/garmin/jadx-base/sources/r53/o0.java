package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
public final class o0 extends v13.i implements e23.q<j<Object>, Object, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j f150776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f150777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<Object, t13.d<Object>, Object> f150778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(e23.p<Object, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super o0> dVar) {
        super(3, dVar);
        this.f150778d = pVar;
    }

    @Override // e23.q
    public final Object invoke(j<Object> jVar, Object obj, t13.d<? super Unit> dVar) {
        o0 o0Var = new o0(this.f150778d, dVar);
        o0Var.f150776b = jVar;
        o0Var.f150777c = obj;
        return o0Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150775a;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f150776b;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        jVar = this.f150776b;
        Object obj2 = this.f150777c;
        this.f150776b = jVar;
        this.f150775a = 1;
        obj = this.f150778d.invoke(obj2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f150776b = null;
        this.f150775a = 2;
    }
}
