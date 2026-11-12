package cu0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventViewModel", f = "LiveEventViewModel.kt", l = {443, 445, 447}, m = "sendSubscriptionToDevice", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f55604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f55605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f55606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f55606c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f55605b = obj;
        this.f55607d |= Integer.MIN_VALUE;
        return i.x4(this.f55606c, this);
    }
}
