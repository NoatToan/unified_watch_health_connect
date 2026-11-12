package te2;

import android.content.Context;
import com.google.android.gms.wallet.WalletConstants;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR}, m = "attemptGC1ForIT2")
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f164400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f164402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f164403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f164404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ve2.e f164405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f164406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f164407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f164408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164409j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h0 h0Var, t13.d<? super z> dVar) {
        super(dVar);
        this.f164408i = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164407h = obj;
        this.f164409j |= Integer.MIN_VALUE;
        return this.f164408i.k(this);
    }
}
