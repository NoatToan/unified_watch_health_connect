package ap2;

import androidx.lifecycle.y0;
import ds.e0;
import java.io.Serializable;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$loadEasyUpdatePaymentCard$1", f = "FitPayAddCardViewModel.kt", l = {521}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f11774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f11777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h hVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f11777d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f11777d, dVar);
        rVar.f11776c = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        h hVar = this.f11777d;
        b0 b0Var = (b0) this.f11776c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11775b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                h.a aVar2 = h.f11695y;
                h.a.a(aVar2).debug("loadEasyUpdatePaymentCard");
                List<zo2.a> listD = hVar.f11710n.d();
                if (listD != null) {
                    y0<o13.p<zo2.a, List<ep2.g>>> y0Var2 = hVar.f11711o;
                    g1 g1Var = hVar.E4().f205979a;
                    List<ep2.b> listD2 = hVar.f11714r.d();
                    this.f11776c = b0Var;
                    this.f11774a = y0Var2;
                    this.f11775b = 1;
                    Serializable serializableI = g1Var.I(listD, listD2, this);
                    if (serializableI == aVar) {
                        return aVar;
                    }
                    y0Var = y0Var2;
                    obj = serializableI;
                } else {
                    h.a.a(aVar2).error("loadEasyUpdatePaymentCard: Empty list");
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f11774a;
            o13.r.b(obj);
            y0Var.j(obj);
        } catch (Exception e4) {
            e0.v("loadEasyUpdatePaymentCard: ", e4.getMessage(), h.a.a(h.f11695y));
        }
        return Unit.INSTANCE;
    }
}
