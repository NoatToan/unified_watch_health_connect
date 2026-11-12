package tu1;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.FBTPlanUtil$Companion", f = "FBTPlanUtil.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "shouldShowAddToHomeDialog", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f166492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.a f166493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i.a aVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f166493b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166492a = obj;
        this.f166494c |= Integer.MIN_VALUE;
        return this.f166493b.n(this);
    }
}
