package fl1;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.domain.GetFavoriteRecordableActivitiesUseCase", f = "GetFavoriteRecordableActivitiesUseCase.kt", l = {21}, m = "invoke-gIAlu-s", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f72007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f72008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f72008b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72007a = obj;
        this.f72009c |= Integer.MIN_VALUE;
        Object objB = this.f72008b.b(0L, this);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : q.a(objB);
    }
}
