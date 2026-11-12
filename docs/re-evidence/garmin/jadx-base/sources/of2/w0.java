package of2;

import java.util.Iterator;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "sessionUuid", "Ljava/util/UUID;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager$startNewSession$newSession$1", f = "LSVSessionManager.kt", l = {648}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.p<UUID, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f131948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f131949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c0 c0Var, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f131949c = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w0 w0Var = new w0(this.f131949c, dVar);
        w0Var.f131948b = obj;
        return w0Var;
    }

    @Override // e23.p
    public final Object invoke(UUID uuid, t13.d<? super Unit> dVar) {
        return ((w0) create(uuid, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        UUID uuid = (UUID) this.f131948b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131947a;
        if (i14 == 0) {
            o13.r.b(obj);
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionManager", "End session: " + uuid);
            c0 c0Var = this.f131949c;
            Iterator it = c0Var.f131786o.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((b0) ((b) next).f131736o.getValue()).f131744a, uuid));
            b bVar = (b) next;
            if (bVar == null) {
                zg2.c.f204692a.getClass();
                zg2.c.a("LSVSessionManager", "No running session found with id " + uuid);
                return Unit.INSTANCE;
            }
            this.f131948b = null;
            this.f131947a = 1;
            if (c0Var.f(bVar, this) == aVar) {
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
