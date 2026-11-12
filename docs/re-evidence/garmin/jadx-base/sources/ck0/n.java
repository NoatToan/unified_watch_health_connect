package ck0;

import c80.z;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.offers.ExclusiveOfferDetailsViewModel$generateExclusiveOffer$1", f = "ExclusiveOfferDetailsViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f27874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f27874c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f27874c, dVar);
        nVar.f27873b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f27873b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27872a;
        m mVar = this.f27874c;
        if (i14 == 0) {
            o13.r.b(obj);
            z70.j jVar = mVar.f27869b;
            String str = mVar.f27868a.f27883a;
            this.f27873b = b0Var;
            this.f27872a = 1;
            obj = jVar.f(str, this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            c80.d dVar = ((z) ((v2.b) v2Var).f47386a).f25652a.f25470g;
            String str2 = dVar != null ? dVar.f25320a : null;
            if (str2 != null) {
                mVar.f27870c.k(null, new v.d(str2));
            } else {
                a2 a2Var = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "ExclusiveOfferDetailsViewModel", "Exclusive offer code is null after generation");
                mVar.f27870c.setValue(v.a.f27894a);
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var2 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "ExclusiveOfferDetailsViewModel", "Failed to generate exclusive offer discount code");
            mVar.f27870c.setValue(v.a.f27894a);
        }
        return Unit.INSTANCE;
    }
}
