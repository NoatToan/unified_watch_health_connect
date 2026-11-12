package ne0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetDogActivitiesOptionalFeatureUseCase", f = "GetDogActivitiesOptionalFeatureUseCase.kt", l = {12}, m = "invoke", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f125519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f125520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f125520b = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125519a = obj;
        this.f125521c |= Integer.MIN_VALUE;
        return this.f125520b.a(this);
    }
}
