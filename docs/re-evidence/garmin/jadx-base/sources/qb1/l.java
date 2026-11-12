package qb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {588}, m = "getLastConfirmedCycle", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f144121b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144120a = obj;
        this.f144122c |= Integer.MIN_VALUE;
        return f.B4(this.f144121b, this);
    }
}
