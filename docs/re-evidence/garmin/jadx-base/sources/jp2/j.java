package jp2;

import androidx.lifecycle.y0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationViewModel", f = "FitPayCardVerificationViewModel.kt", l = {159}, m = "selectVerificationMethod", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f99944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f99945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f99947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f99946c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f99945b = obj;
        this.f99947d |= Integer.MIN_VALUE;
        return this.f99946c.D4(null, this);
    }
}
