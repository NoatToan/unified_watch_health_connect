package q53;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq53/m;", "", "<anonymous>", "(Lo53/b0;)Lq53/m;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<b0, t13.d<? super m<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w<Object> f143006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f143007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w<Object> wVar, Object obj, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f143006c = wVar;
        this.f143007d = obj;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f143006c, this.f143007d, dVar);
        oVar.f143005b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super m<? extends Unit>> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object objA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143004a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                w<Object> wVar = this.f143006c;
                Object obj2 = this.f143007d;
                int i15 = o13.q.f128596b;
                this.f143004a = 1;
                if (wVar.h(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            bVar = Unit.INSTANCE;
            int i16 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i17 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (bVar instanceof o13.q.b) {
            m.b bVar2 = m.f142998b;
            Throwable thB = o13.q.b(bVar);
            bVar2.getClass();
            objA = m.b.a(thB);
        } else {
            m.b bVar3 = m.f142998b;
            objA = Unit.INSTANCE;
            bVar3.getClass();
        }
        return m.a(objA);
    }
}
