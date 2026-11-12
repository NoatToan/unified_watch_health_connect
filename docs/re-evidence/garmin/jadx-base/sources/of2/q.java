package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifySessionPause$1", f = "LSVSession.kt", l = {266, 267}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f131901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar, Integer num, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f131900b = bVar;
        this.f131901c = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f131900b, this.f131901c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r7.c(r1, r6) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131899a;
        b bVar = this.f131900b;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) bVar.f131736o.getValue();
            sf2.a.b bVar2 = new sf2.a.b(((b0) bVar.f131736o.getValue()).f131744a);
            this.f131899a = 1;
            if (b0Var.b(bVar2, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        b0 b0Var2 = (b0) bVar.f131736o.getValue();
        sf2.d.e eVar = new sf2.d.e(((b0) bVar.f131736o.getValue()).f131744a, this.f131901c);
        this.f131899a = 2;
    }
}
