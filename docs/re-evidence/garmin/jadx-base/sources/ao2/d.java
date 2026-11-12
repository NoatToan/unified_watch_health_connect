package ao2;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.feature.garminpay.providers.gpay.FitPayApi.FitPayApiExtensionsKt", f = "FitPayApiExtensions.kt", l = {59}, m = FirebaseAnalytics.Event.PURCHASE, v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11577b;

    public d(t13.d<? super d> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11576a = obj;
        this.f11577b |= Integer.MIN_VALUE;
        return b.a(null, null, null, this);
    }
}
