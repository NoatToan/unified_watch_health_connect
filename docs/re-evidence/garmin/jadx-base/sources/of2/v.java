package of2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifyValueEstimationCompleted$1", f = "LSVSession.kt", l = {463}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf2.a f131927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b bVar, yf2.a aVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f131926b = bVar;
        this.f131927c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f131926b, this.f131927c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131925a;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) this.f131926b.f131736o.getValue();
            zg2.c cVar = zg2.c.f204692a;
            UUID uuid = b0Var.f131744a;
            StringBuilder sb3 = new StringBuilder("notifyValueEstimationCompleted: sessionUuid:");
            sb3.append(uuid);
            sb3.append(" valueEstimationType:");
            yf2.a aVar2 = this.f131927c;
            sb3.append(aVar2);
            String string = sb3.toString();
            cVar.getClass();
            zg2.c.a("LSVSession", string);
            sf2.e.f fVar = new sf2.e.f(aVar2, b0Var.f131744a);
            this.f131925a = 1;
            if (b0Var.d(fVar, this) == aVar) {
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
