package vr2;

import androidx.lifecycle.y0;
import java.util.List;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.w;
import w3.x;
import zn2.g1;
import zn2.q3;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel$initViewModel$1", f = "PaymentCardDetailsViewModel.kt", l = {153}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f179631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f179634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f179635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, q qVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f179634d = iVar;
        this.f179635e = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f179634d, this.f179635e, dVar);
        mVar.f179633c = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        b0 b0Var = (b0) this.f179633c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179632b;
        i iVar2 = this.f179634d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger logger = i.C;
                logger.debug("initViewModel");
                y0<q3.a> y0Var = new y0<>();
                iVar2.getClass();
                y0<Boolean> y0Var2 = iVar2.f179598a;
                iVar2.f179612o = y0Var;
                q qVar = this.f179635e;
                iVar2.f179605h = qVar;
                iVar2.f179608k = x.m(qVar.f179658e);
                q qVar2 = iVar2.f179605h;
                zo2.a aVar2 = null;
                qs2.a aVar3 = qVar2 != null ? qVar2.f179658e.f73428c : null;
                iVar2.f179602e = aVar3;
                if (aVar3 != null) {
                    ms2.g gVarA = w.f140538a.a(aVar3.f147396a);
                    z0 z0Var = gVarA instanceof z0 ? (z0) gVarA : null;
                    iVar2.f179606i = z0Var;
                    iVar2.f179607j = z0Var != null ? z0Var.f205979a : null;
                } else {
                    logger.error("initViewModel: businessOperator is null");
                    y0Var2.j(Boolean.FALSE);
                }
                y0<Boolean> y0Var3 = iVar2.f179621z;
                aq2.b.f12463a.getClass();
                y0Var3.j(Boolean.valueOf(aq2.b.f12464b));
                g1 g1Var = iVar2.f179607j;
                if (g1Var != null) {
                    String str = iVar2.f179608k;
                    if (str != null) {
                        try {
                            aVar2 = (zo2.a) fs2.a.f(qVar.f179658e, zo2.a.class);
                        } catch (Exception unused) {
                        }
                        iVar2.f179613p = aVar2;
                        this.f179633c = b0Var;
                        this.f179631a = iVar2;
                        this.f179632b = 1;
                        obj = g1Var.y(str, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        iVar = iVar2;
                    } else {
                        logger.error("initViewModel: paymentCardId is null");
                        y0Var2.j(Boolean.FALSE);
                    }
                } else {
                    logger.error("initViewModel: userDataManager is null");
                    y0Var2.j(Boolean.FALSE);
                }
                iVar2.f179598a.j(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar = this.f179631a;
            o13.r.b(obj);
            iVar.f179614q = (List) obj;
            iVar2.f179598a.j(Boolean.TRUE);
        } catch (Exception e4) {
            i.C.error("initViewModel: ", (Throwable) e4);
            iVar2.f179598a.j(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
