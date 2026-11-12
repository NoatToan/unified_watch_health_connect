package qb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {284}, m = "postCycleType", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f fVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f144168b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144167a = obj;
        this.f144169c |= Integer.MIN_VALUE;
        int i14 = f.D;
        return this.f144168b.L4(null, null, this);
    }
}
