package f12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl", f = "GCMUserAccountImpl.kt", l = {246}, m = "getUserITAccessToken", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f68067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f68068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f68068b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68067a = obj;
        this.f68069c |= Integer.MIN_VALUE;
        return this.f68068b.j(this);
    }
}
