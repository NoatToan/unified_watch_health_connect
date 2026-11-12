package zn2;

import ch.qos.logback.classic.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$ackSync$1", f = "NewUserDataManager.kt", l = {1209}, m = "invokeSuspend", v = 2)
public final class j1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo2.f f205607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(wo2.f fVar, t13.d<? super j1> dVar) {
        super(2, dVar);
        this.f205607b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j1(this.f205607b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205606a;
        wo2.f fVar = this.f205607b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger logger = g1.f205525n;
                logger.debug("ackSync");
                if (fVar.getF186517c() == null) {
                    logger.error("ackSync: can not ack sync for " + fVar.getF186515a() + ", ack link is null");
                    return Unit.INSTANCE;
                }
                u0 u0Var = u0.f205864a;
                String f186517c = fVar.getF186517c();
                f186517c.getClass();
                this.f205606a = 1;
                u0Var.getClass();
                obj = u0.g().u(f186517c, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c83.a0 a0Var = (c83.a0) obj;
            if (a0Var.f25745a.isSuccessful()) {
                g1.f205525n.debug("ackSync: successfully acknowledge sync " + fVar.getF186515a());
            } else {
                g1.f205525n.debug("ackSync: failed to acknowledge sync " + fVar.getF186515a() + " code: " + a0Var.f25745a.code());
            }
        } catch (Exception unused) {
            g1.f205525n.error("failed to ack sync request for " + fVar.getF186515a() + "...");
        }
        return Unit.INSTANCE;
    }
}
