package qb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {263}, m = "postMoveAlerts", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f fVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f144177b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144176a = obj;
        this.f144178c |= Integer.MIN_VALUE;
        return f.F4(this.f144177b, this);
    }
}
