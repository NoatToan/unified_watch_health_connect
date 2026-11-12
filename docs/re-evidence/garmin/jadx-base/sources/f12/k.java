package f12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl", f = "GCMUserAccountImpl.kt", l = {349}, m = "refreshUserProfile", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f68081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f68082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f68082b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68081a = obj;
        this.f68083c |= Integer.MIN_VALUE;
        return this.f68082b.r(this);
    }
}
