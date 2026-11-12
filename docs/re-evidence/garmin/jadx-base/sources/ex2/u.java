package ex2;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper", f = "StringsHelper.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_UNKNOWN}, m = "readStringFileFromInternalStorage", v = 1)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.realtimesettings.app.initialization.b f67048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f67049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f67050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f67051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f67051e = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67050d = obj;
        this.f67052f |= Integer.MIN_VALUE;
        w wVar = w.f67058a;
        return this.f67051e.j(null, 0L, null, this);
    }
}
