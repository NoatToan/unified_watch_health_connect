package co;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.domain.DeleteActivityUseCase", f = "DeleteActivityUseCase.kt", l = {24, 29, 39}, m = "invoke-gIAlu-s", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wo0.a f28095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f28099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f28099e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f28098d = obj;
        this.f28100f |= Integer.MIN_VALUE;
        Object objA = this.f28099e.a(null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
