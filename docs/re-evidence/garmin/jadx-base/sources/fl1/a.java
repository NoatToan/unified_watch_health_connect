package fl1;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.domain.CheckRecordActivityOnboardingCompletedUseCase", f = "CheckRecordActivityOnboardingCompletedUseCase.kt", l = {15}, m = "invoke-gIAlu-s", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f71988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f71988b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71987a = obj;
        this.f71989c |= Integer.MIN_VALUE;
        Object objA = this.f71988b.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
