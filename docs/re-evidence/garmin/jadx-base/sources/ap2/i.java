package ap2;

import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$createCredential$1", f = "FitPayAddCardViewModel.kt", l = {537}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicReference f11722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f11724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp2.b f11725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, dp2.b bVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f11724c = hVar;
        this.f11725d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f11724c, this.f11725d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11723b;
        h hVar = this.f11724c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                h.a.a(h.f11695y).debug("createCredential");
                AtomicReference<ep2.d> atomicReference2 = hVar.f11715t;
                g1 g1Var = hVar.E4().f205979a;
                dp2.b bVar = this.f11725d;
                this.f11722a = atomicReference2;
                this.f11723b = 1;
                Object objF = g1Var.f(bVar, this);
                if (objF == aVar) {
                    return aVar;
                }
                atomicReference = atomicReference2;
                obj = objF;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                atomicReference = this.f11722a;
                o13.r.b(obj);
            }
            atomicReference.set(obj);
            ep2.d dVar = hVar.f11715t.get();
            h.a.a(h.f11695y).debug("createCredential: credential created , card state: " + dVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String());
            h.z4(hVar, dVar);
        } catch (Exception e4) {
            eo2.d.f64794a.getClass();
            if (g22.n.d(eo2.d.f64799f.get())) {
                wr2.j jVar = wr2.j.f186862a;
                String str = "Token Creation Failed: (" + e4 + ", " + e4.getMessage() + ")";
                jVar.getClass();
                wr2.j.a("FitPayAddCardViewModel.createCredential()", str);
            }
            h.x4(hVar, e4);
        }
        return Unit.INSTANCE;
    }
}
