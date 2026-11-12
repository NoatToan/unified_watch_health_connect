package of2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifySessionSaving$1", f = "LSVSession.kt", l = {216}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f131905b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f131905b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131904a;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = this.f131905b;
            b0 b0Var = (b0) bVar.f131736o.getValue();
            sf2.d.h hVar = new sf2.d.h(((b0) bVar.f131736o.getValue()).f131744a);
            this.f131904a = 1;
            if (b0Var.c(hVar, this) == aVar) {
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
