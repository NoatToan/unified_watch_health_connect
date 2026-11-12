package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lq53/t;", "it", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
public final class e extends v13.i implements e23.p<q53.t<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f157479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f<Object> f157480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f<Object> fVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f157480c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f157480c, dVar);
        eVar.f157479b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<Object> tVar, t13.d<? super Unit> dVar) {
        return ((e) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f157478a;
        if (i14 == 0) {
            o13.r.b(obj);
            q53.t<? super Object> tVar = (q53.t) this.f157479b;
            this.f157478a = 1;
            if (this.f157480c.h(tVar, this) == aVar) {
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
