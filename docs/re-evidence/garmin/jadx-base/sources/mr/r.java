package mr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetActivityEpicsUseCase", f = "GetActivityEpicsUseCase.kt", l = {39}, m = "getLifetimeStats", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f120288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f120289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f120290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f120289b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120288a = obj;
        this.f120290c |= Integer.MIN_VALUE;
        return q.a(this.f120289b, null, null, this);
    }
}
