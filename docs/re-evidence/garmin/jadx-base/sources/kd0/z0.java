package kd0;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl", f = "DashboardDelegateImpl.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "hasGCPlusSubscription", v = 2)
public final class z0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f104466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(x0 x0Var, t13.d<? super z0> dVar) {
        super(dVar);
        this.f104466b = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104465a = obj;
        this.f104467c |= Integer.MIN_VALUE;
        return this.f104466b.d(this);
    }
}
