package ne0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.OptInDogActivitiesUseCase", f = "OptInDogActivitiesUseCase.kt", l = {15}, m = "invoke", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f125434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f125435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f125435b = d0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125434a = obj;
        this.f125436c |= Integer.MIN_VALUE;
        return this.f125435b.a(this);
    }
}
