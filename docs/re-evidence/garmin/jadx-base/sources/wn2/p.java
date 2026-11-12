package wn2;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pn2.t;
import tn2.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleViewModel$provision$1", f = "FelicaConsoleViewModel.kt", l = {459}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a f186390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f186390b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f186390b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186389a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar2 = this.f186390b;
            r0 r0Var = aVar2.f51030d;
            if (r0Var == null) {
                p005kotlin.jvm.internal.s.m("felicaService");
                throw null;
            }
            e13.j jVarL = r0Var.l(new t(aVar2.f51033g, aVar2.f51032f, "19870101", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (String) aVar2.f51040n.invoke()), "1000", "token", new h(aVar2, 4), new h(aVar2, 5));
            h hVar = new h(aVar2, 6);
            this.f186389a = 1;
            if (aVar2.y4(jVarL, "IssueCard", hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
