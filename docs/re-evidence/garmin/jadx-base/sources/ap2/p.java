package ap2;

import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$getCreditCard$1", f = "FitPayAddCardViewModel.kt", l = {749}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicReference f11765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f11767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h hVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f11767d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f11767d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ap2.h] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        fo2.p creditCardLink;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        h hVar = this.f11766c;
        try {
            if (hVar == 0) {
                o13.r.b(obj);
                h.a.a(h.f11695y).debug("handleCreditCardCreatedEvent");
                h hVar2 = this.f11767d;
                yo2.b bVar = hVar2.f11707k.get();
                String link = (bVar == null || (creditCardLink = bVar.getCreditCardLink()) == null) ? null : creditCardLink.getLink();
                if (link != null) {
                    AtomicReference<yo2.b> atomicReference2 = hVar2.f11707k;
                    g1 g1Var = hVar2.E4().f205979a;
                    fo2.p pVar = new fo2.p(link, false);
                    fo2.s sVar = hVar2.f11703g;
                    this.f11764a = hVar2;
                    this.f11765b = atomicReference2;
                    this.f11766c = 1;
                    obj = g1Var.z(pVar, sVar, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    atomicReference = atomicReference2;
                    hVar = hVar2;
                }
                return Unit.INSTANCE;
            }
            if (hVar != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atomicReference = this.f11765b;
            h hVar3 = this.f11764a;
            o13.r.b(obj);
            hVar = hVar3;
            atomicReference.set(obj);
            yo2.b bVar2 = hVar.f11707k.get();
            bVar2.getClass();
            h.A4(hVar, bVar2);
        } catch (Exception e4) {
            h.a.a(h.f11695y).error("handleCreditCardCreatedEvent: ", (Throwable) e4);
            hVar.f11698b.j(e4.getMessage());
        }
        return Unit.INSTANCE;
    }
}
