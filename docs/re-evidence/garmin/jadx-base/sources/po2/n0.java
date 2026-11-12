package po2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.TransitCardOperationFlowBuilder", f = "TransitCardOperationFlowBuilder.kt", l = {159}, m = "closeWith", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f139301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f139303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(k0<Object> k0Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f139302b = k0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f139301a = obj;
        this.f139303c |= Integer.MIN_VALUE;
        return this.f139302b.c(null, this);
    }
}
