package vr2;

import androidx.lifecycle.y0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel$linkAddress$1", f = "PaymentCardDetailsViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f179636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f179638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f179639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, String str, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f179638c = iVar;
        this.f179639d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f179638c, this.f179639d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fo2.p addressLink;
        String link;
        y0<String> y0Var;
        String str;
        y0<String> y0Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179637b;
        if (i14 == 0) {
            o13.r.b(obj);
            i iVar = this.f179638c;
            zo2.a aVar2 = iVar.f179613p;
            if (aVar2 != null && (addressLink = aVar2.getAddressLink()) != null && (link = addressLink.getLink()) != null) {
                y0Var = iVar.f179599b;
                g1 g1Var = iVar.f179607j;
                if (g1Var != null) {
                    this.f179636a = y0Var;
                    this.f179637b = 1;
                    obj = g1Var.a0(link, this.f179639d, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    y0Var2 = y0Var;
                } else {
                    str = null;
                }
                y0Var.j(str);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y0Var2 = this.f179636a;
        o13.r.b(obj);
        str = (String) obj;
        y0Var = y0Var2;
        y0Var.j(str);
        return Unit.INSTANCE;
    }
}
