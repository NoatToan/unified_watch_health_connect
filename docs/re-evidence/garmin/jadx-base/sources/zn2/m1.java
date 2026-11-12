package zn2;

import ch.qos.logback.classic.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$checkDeviceRegistrationStatus$2$1", f = "NewUserDataManager.kt", l = {1583}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f205664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.j<zn2.a> f205665d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zn2/m1$a", "Lzn2/b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.j<zn2.a> f205666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f205667b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(o53.j<? super zn2.a> jVar, long j8) {
            this.f205666a = jVar;
            this.f205667b = j8;
        }

        @Override // zn2.b
        public final void a(zn2.a aVar) {
            boolean z14 = aVar instanceof zn2.a.e;
            long j8 = this.f205667b;
            o53.j<zn2.a> jVar = this.f205666a;
            if (z14) {
                int i14 = o13.q.f128596b;
                jVar.resumeWith(new zn2.a.e(j8));
            } else {
                if (aVar instanceof zn2.a.b) {
                    int i15 = o13.q.f128596b;
                    jVar.resumeWith(new o13.q.b(new Exception(new zn2.a.b(j8, ((zn2.a.b) aVar).f205406b).a())));
                    return;
                }
                g1.f205525n.debug("onDeviceActivationStatus: " + aVar + " not handled");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(g1 g1Var, long j8, o53.j<? super zn2.a> jVar, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f205663b = g1Var;
        this.f205664c = j8;
        this.f205665d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f205663b, this.f205664c, this.f205665d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205662a;
        g1 g1Var = this.f205663b;
        long j8 = this.f205664c;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = g1Var.f205528c;
            this.f205662a = 1;
            fVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new e(fVar, j8, null), this);
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
        o53.j<zn2.a> jVar = this.f205665d;
        if (z14) {
            if (((fo2.f) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).getThisDeviceActiveWithCurrentUser()) {
                g1.f205525n.debug(new zn2.a.f(j8).a());
                int i15 = o13.q.f128596b;
                jVar.resumeWith(new zn2.a.f(j8));
            } else {
                Logger logger = g1.f205525n;
                logger.debug(new zn2.a.g(j8).a());
                long j14 = this.f205664c;
                a aVar2 = new a(jVar, j14);
                g1Var.getClass();
                logger.debug(new zn2.a.C3841a(j14).a());
                ge1.b.T(g1Var.f205537l, null, null, new k1(g1Var, j14, aVar2, null), 3);
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            Logger logger2 = g1.f205525n;
            Exception exc = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a;
            logger2.debug(new zn2.a.c(j8, exc.toString()).a());
            int i16 = o13.q.f128596b;
            jVar.resumeWith(new o13.q.b(new Exception(new zn2.a.c(j8, exc.toString()).a())));
        }
        return Unit.INSTANCE;
    }
}
