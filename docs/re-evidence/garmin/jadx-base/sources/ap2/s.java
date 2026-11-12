package ap2;

import androidx.lifecycle.y0;
import ch.qos.logback.classic.Logger;
import ds.e0;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$loadPaymentCards$1", f = "FitPayAddCardViewModel.kt", l = {507}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f11778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f11780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h hVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f11780c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f11780c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11779b;
        h hVar = this.f11780c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                h.a.a(h.f11695y).debug("loadPaymentCards");
                y0<List<zo2.a>> y0Var2 = hVar.f11710n;
                g1 g1Var = hVar.E4().f205979a;
                this.f11778a = y0Var2;
                this.f11779b = 1;
                Logger logger = g1.f205525n;
                Object objL = g1Var.L("0", this);
                if (objL == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objL;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f11778a;
                o13.r.b(obj);
            }
            y0Var.j(obj);
        } catch (Exception e4) {
            e0.v("loadPaymentCards: ", e4.getMessage(), h.a.a(h.f11695y));
            hVar.f11698b.j(e4.getMessage());
        }
        return Unit.INSTANCE;
    }
}
