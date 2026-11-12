package mn0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.HasViewedHealthStatusFeatureUseCase", f = "HasViewedHealthStatusFeatureUseCase.kt", l = {14}, m = "invoke", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f119750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f119751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f119752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f119751b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119750a = obj;
        this.f119752c |= Integer.MIN_VALUE;
        return this.f119751b.a(this);
    }
}
