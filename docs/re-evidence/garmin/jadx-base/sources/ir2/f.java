package ir2;

import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity", f = "WalletMessageConsoleActivity.kt", l = {227, 251}, m = "prepareForDevice", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f94845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f94846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WalletMessageConsoleActivity f94847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WalletMessageConsoleActivity f94848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f94850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WalletMessageConsoleActivity f94851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f94852h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super f> dVar) {
        super(dVar);
        this.f94851g = walletMessageConsoleActivity;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94850f = obj;
        this.f94852h |= Integer.MIN_VALUE;
        return WalletMessageConsoleActivity.ca(this.f94851g, 0L, this);
    }
}
