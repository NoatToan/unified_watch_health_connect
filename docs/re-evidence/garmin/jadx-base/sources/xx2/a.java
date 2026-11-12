package xx2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.subscriptions.SubscriptionHelper", f = "SubscriptionHelper.kt", l = {170}, m = "getActiveFeatures")
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f192584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f192585b;

    public a(t13.d<? super a> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192584a = obj;
        this.f192585b |= Integer.MIN_VALUE;
        return b.a(this);
    }
}
