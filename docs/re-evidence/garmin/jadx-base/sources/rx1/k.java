package rx1;

import c2.k3;
import i3.e9;
import i3.f9;
import i3.mc;
import o4.d0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154993a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f154994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f154995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f154996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k3 f154997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f9 f154998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z3.e f154999g;

    public /* synthetic */ k(e23.a aVar, h4.r rVar, mc mcVar, f9 f9Var, k3 k3Var, z3.e eVar) {
        this.f154995c = aVar;
        this.f154996d = rVar;
        this.f154994b = mcVar;
        this.f154998f = f9Var;
        this.f154997e = k3Var;
        this.f154999g = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f154993a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d0.f128823b.getClass();
                    e9.a(this.f154995c, this.f154996d, this.f154994b, 0.0f, false, null, d0.f128831j, com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar), 0.0f, 0L, null, new r12.a(this.f154997e, 26), this.f154998f, z3.f.c(557861938, new aa2.k(this.f154999g, 9), mVar), mVar, 1572864, 3078, 824);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                l.b(this.f154994b, this.f154995c, this.f154996d, this.f154997e, this.f154998f, this.f154999g, (p3.m) obj, p0.t(196609));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(mc mcVar, e23.a aVar, h4.r rVar, k3 k3Var, f9 f9Var, z3.e eVar, int i14) {
        this.f154994b = mcVar;
        this.f154995c = aVar;
        this.f154996d = rVar;
        this.f154997e = k3Var;
        this.f154998f = f9Var;
        this.f154999g = eVar;
    }
}
