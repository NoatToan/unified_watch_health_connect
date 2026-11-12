package co;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.domain.SearchActivitiesUseCase", f = "SearchActivitiesUseCase.kt", l = {35, 45}, m = "invoke-BWLJW6A", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f28115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f28115b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f28114a = obj;
        this.f28116c |= Integer.MIN_VALUE;
        Object objA = this.f28115b.a(null, null, null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
