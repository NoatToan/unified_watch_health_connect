package ok2;

import java.util.concurrent.TimeoutException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$monitorBatch$1", f = "CoreTransferManager.kt", l = {784}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f132751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f132751b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f132751b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132750a;
        g gVar = this.f132751b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                c cVar = gVar.f132692k;
                this.f132750a = 1;
                Object objA = cVar.f132602d.get().a(this);
                if (objA != obj2) {
                    objA = Unit.INSTANCE;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (TimeoutException unused) {
            pk2.x xVarC = pk2.x.a.c(pk2.x.f138495e, e.f132640h, "monitorBatch timeout", null, 4);
            g.b bVar = g.f132677s;
            gVar.w("monitorBatch timeout", xVarC);
        } catch (Throwable th3) {
            ds.e0.u("Unexpected error ", th3.getMessage(), " when monitoring batch", gVar.f132688g);
        }
        return Unit.INSTANCE;
    }
}
