package bl2;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer", f = "AbstractActiveTransfer.kt", l = {WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, 422}, m = "write")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lk2.b f18672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wk2.i f18673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.p f18674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wk2.e f18675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f18677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f18678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f18678h = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18677g = obj;
        this.f18679i |= Integer.MIN_VALUE;
        b.a aVar = b.f18599l;
        return this.f18678h.o(null, null, null, false, false, this);
    }
}
