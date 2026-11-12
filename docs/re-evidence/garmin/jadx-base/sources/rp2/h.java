package rp2;

import androidx.lifecycle.v1;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.n;
import ps2.w;
import u53.o;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$initViewModel$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f154100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f154101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yo2.b f154102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, long j8, yo2.b bVar2, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f154100a = bVar;
        this.f154101b = j8;
        this.f154102c = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f154100a, this.f154101b, this.f154102c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0050  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ms2.d dVarG;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.debug("initViewModel");
        long j8 = this.f154101b;
        new Long(j8);
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f154100a;
        bVar.getClass();
        yo2.b bVar2 = this.f154102c;
        bVar.f51612b = bVar2.getCreditCardId();
        w9.a aVarA = v1.a(bVar);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, o.f168762a, null, new j(bVar, null), 2);
        try {
            w wVar = w.f140538a;
            is2.b bVar3 = is2.b.FITPAY;
            ms2.g gVarA = wVar.a(bVar3);
            gVarA.getClass();
            bVar.f51620j = (z0) gVarA;
            n nVarI = w.i(j8);
            if (nVarI != null) {
                dVarG = nVarI.g(bVar3);
                if (!(dVarG instanceof t)) {
                    dVarG = null;
                }
            } else {
                dVarG = null;
            }
            dVarG.getClass();
            bVar.f51611a = (t) dVarG;
            ge1.b.T(v1.a(bVar), s0.f129406a, null, new com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.d(bVar, bVar2, null), 2);
        } catch (Exception e4) {
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.error("failed to init TermsCondition viewModel, ", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
