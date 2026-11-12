package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lr53/j;", "it", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<r53.j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f157500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i<Object, Object> f157501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i<Object, Object> iVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f157501c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f157501c, dVar);
        hVar.f157500b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157499a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j<? super Object> jVar = (r53.j) this.f157500b;
            this.f157499a = 1;
            if (this.f157501c.l(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
