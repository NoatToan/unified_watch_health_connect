package zd0;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl", f = "SubscriptionProvider.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS, 407, 408}, m = "setupIfNeeded", v = 2)
public final class t1<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l f204137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f204139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f204140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(k1 k1Var, t13.d<? super t1> dVar) {
        super(dVar);
        this.f204139c = k1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204138b = obj;
        this.f204140d |= Integer.MIN_VALUE;
        int i14 = k1.f204046d;
        return this.f204139c.p(null, this);
    }
}
