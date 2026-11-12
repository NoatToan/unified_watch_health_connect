package gn2;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler", f = "WifiDataHandler.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "fetchOAuth1GC")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f78117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f78118b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f78117a = obj;
        this.f78119c |= Integer.MIN_VALUE;
        return c.c(this.f78118b, null, this);
    }
}
