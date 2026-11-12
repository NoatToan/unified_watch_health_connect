package ap2;

import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$createCreditCard$2", f = "FitPayAddCardViewModel.kt", l = {389, 402, 407}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicReference f11730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f11732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.c f11733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, io2.c cVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f11732c = hVar;
        this.f11733d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f11732c, this.f11733d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (ap2.h.y4(r7, r11) == r1) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11731b;
        h hVar = this.f11732c;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    atomicReference = this.f11730a;
                    o13.r.b(obj);
                } else if (i14 == 2) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            h.a.a(h.f11695y).debug("createCreditCard(PushProv)");
            atomicReference = hVar.f11707k;
            g1 g1Var = hVar.E4().f205979a;
            String str = hVar.f11704h;
            str.getClass();
            io2.c cVar = this.f11733d;
            this.f11730a = atomicReference;
            this.f11731b = 1;
            obj = g1Var.h(str, cVar, this);
            if (obj == aVar) {
            }
            return aVar;
            atomicReference.set(obj);
            yo2.b bVar = hVar.f11707k.get();
            bVar.getClass();
            yo2.b bVar2 = bVar;
            h.a aVar2 = h.f11695y;
            h.a.a(aVar2).debug("createCreditCard(PushProv): credit card created , card state: " + bVar2.getCardState());
            if (p005kotlin.jvm.internal.s.g(bVar2.getCardState(), "NEW")) {
                String link = bVar2.getCreditCardLink().getLink();
                if (link == null) {
                    h.a.a(aVar2).error("createCreditCard(PushProv): missing creditCard link from the card");
                    hVar.f11706j.j(gp2.f.CARD_CREATED_BUT_CAN_NOT_PROCEED_FURTHER);
                    return Unit.INSTANCE;
                }
                this.f11730a = null;
                this.f11731b = 2;
                if (hVar.H4(link) == aVar) {
                    return aVar;
                }
            } else {
                h.A4(hVar, bVar2);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e4) {
            this.f11730a = null;
            this.f11731b = 3;
        }
        return Unit.INSTANCE;
    }
}
