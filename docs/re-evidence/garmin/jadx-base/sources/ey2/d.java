package ey2;

import android.net.Uri;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.subscriptions.ui.SubscriptionPurchaseUrlBuilder", f = "SubscriptionPurchaseUrlBuilder.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "handlePurchaseReturnUrl")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f67457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f67459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f67459c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67458b = obj;
        this.f67460d |= Integer.MIN_VALUE;
        return this.f67459c.b(null, this);
    }
}
