package ip;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.privacy.BaseActivityPrivacyRepo", f = "BaseActivityPrivacyRepo.kt", l = {16}, m = "updateAllPastActivities-gIAlu-s", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f94653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f94654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f94654b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94653a = obj;
        this.f94655c |= Integer.MIN_VALUE;
        Object objB = this.f94654b.b(null, this);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : q.a(objB);
    }
}
