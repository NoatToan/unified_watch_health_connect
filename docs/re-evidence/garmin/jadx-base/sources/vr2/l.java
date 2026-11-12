package vr2;

import ds.e0;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel$getCardTypes$1", f = "PaymentCardDetailsViewModel.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f179630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f179630b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f179630b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<ep2.b> listB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179629a;
        i iVar = this.f179630b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                i.C.debug("getCardTypes");
                g1 g1Var = iVar.f179607j;
                if (g1Var != null) {
                    this.f179629a = 1;
                    obj = g1Var.w(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    listB = null;
                }
                iVar.f179616t.j(listB);
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ep2.c cVar = (ep2.c) obj;
            if (cVar != null) {
                listB = cVar.b();
            } else {
                listB = null;
            }
            iVar.f179616t.j(listB);
        } catch (Exception e4) {
            e0.v("getCardTypes: exception: ", e4.getMessage(), i.C);
        }
        return Unit.INSTANCE;
    }
}
