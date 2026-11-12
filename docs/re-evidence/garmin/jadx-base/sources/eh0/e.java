package eh0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.data.repository.FitnessAgeRepositoryImpl", f = "FitnessAgeRepositoryImpl.kt", l = {17}, m = "getFitnessAgeDetails", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f64030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f64031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f64031b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64030a = obj;
        this.f64032c |= Integer.MIN_VALUE;
        return this.f64031b.b(null, this);
    }
}
