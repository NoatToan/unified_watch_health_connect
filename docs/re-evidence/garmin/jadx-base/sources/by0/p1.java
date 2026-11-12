package by0;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "getUserSocialProfile", v = 2)
public final class p1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f22004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f22005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2 f22008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(g2 g2Var, t13.d<? super p1> dVar) {
        super(dVar);
        this.f22008f = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22007e = obj;
        this.f22009g |= Integer.MIN_VALUE;
        return this.f22008f.p(null, null, this);
    }
}
