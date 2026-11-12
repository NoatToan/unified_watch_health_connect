package po2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.TransitCardOperationFlowBuilder", f = "TransitCardOperationFlowBuilder.kt", l = {277}, m = "getErrorCode", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f139341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f139342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f139344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(k0<Object> k0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f139343c = k0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f139342b = obj;
        this.f139344d |= Integer.MIN_VALUE;
        return this.f139343c.d(null, this);
    }
}
