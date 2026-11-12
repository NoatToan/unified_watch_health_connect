package zn2;

import ch.qos.logback.classic.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$activateDevice$1", f = "NewUserDataManager.kt", l = {1634}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f205620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f205621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(g1 g1Var, long j8, b bVar, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f205619b = g1Var;
        this.f205620c = j8;
        this.f205621d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k1(this.f205619b, this.f205620c, this.f205621d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205618a;
        long j8 = this.f205620c;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = this.f205619b.f205528c;
            this.f205618a = 1;
            fVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new d(fVar, j8, null), this);
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
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        boolean z14 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
        b bVar = this.f205621d;
        if (z14) {
            g1.f205525n.debug(new a.e(j8).a());
            bVar.a(new a.e(j8));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            Logger logger = g1.f205525n;
            Exception exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
            logger.debug(new a.b(j8, exc.toString()).a());
            bVar.a(new a.b(j8, exc.toString()));
        }
        return Unit.INSTANCE;
    }
}
