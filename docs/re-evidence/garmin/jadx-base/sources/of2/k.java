package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyFinalizeSetRequest$1", f = "LSVSession.kt", l = {195}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2.c.h f131844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, sf2.c.h hVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f131843b = bVar;
        this.f131844c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f131843b, this.f131844c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131842a;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) this.f131843b.f131736o.getValue();
            sf2.c.h hVar = this.f131844c;
            sf2.e.i iVar = new sf2.e.i(hVar.f158909a, hVar.f158910b, hVar.f158911c, hVar.f158912d, hVar.f158913e, hVar.f158914f);
            this.f131842a = 1;
            if (b0Var.d(iVar, this) == aVar) {
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
