package wt2;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.net.ephemeris.gdi.EphemerisDataHandler", f = "EphemerisDataHandler.kt", l = {378, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_UNKNOWN}, m = "requestGpsEphemeris")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f187176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f187177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f187178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f187179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f187180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f187181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f187182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f187183h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f187182g = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187181f = obj;
        this.f187183h |= Integer.MIN_VALUE;
        a.C3482a c3482a = a.f187141k;
        return this.f187182g.i(null, null, null, this, false);
    }
}
