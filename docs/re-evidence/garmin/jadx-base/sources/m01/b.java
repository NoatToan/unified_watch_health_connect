package m01;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.MyFitnessPalRepositoryImpl", f = "MyFitnessPalRepositoryImpl.kt", l = {16}, m = "getUserAuth", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f115538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f115538b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115537a = obj;
        this.f115539c |= Integer.MIN_VALUE;
        return this.f115538b.c(this);
    }
}
