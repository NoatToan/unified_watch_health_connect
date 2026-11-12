package a61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthTrainingRepo", f = "StrengthTrainingRepo.kt", l = {29}, m = "getAllExercises", v = 2)
public final class l0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i0 i0Var, t13.d<? super l0> dVar) {
        super(dVar);
        this.f1625b = i0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f1624a = obj;
        this.f1626c |= Integer.MIN_VALUE;
        return this.f1625b.d(this);
    }
}
