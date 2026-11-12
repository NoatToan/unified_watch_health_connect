package wd2;

import com.garmin.android.library.livetrack.LivetrackService;
import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService", f = "LivetrackService.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "getLivetrackSessionDetails", v = 2)
public final class m0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe2.p1 f184526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f184527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f184528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(LivetrackService livetrackService, t13.d<? super m0> dVar) {
        super(dVar);
        this.f184528c = livetrackService;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184527b = obj;
        this.f184529d |= Integer.MIN_VALUE;
        return this.f184528c.c(0L, this);
    }
}
