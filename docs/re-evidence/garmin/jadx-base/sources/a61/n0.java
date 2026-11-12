package a61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthTrainingRepo", f = "StrengthTrainingRepo.kt", l = {42}, m = "getExerciseTranslations", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(i0 i0Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f1639b = i0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f1638a = obj;
        this.f1640c |= Integer.MIN_VALUE;
        return this.f1639b.f(this);
    }
}
