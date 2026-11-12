package qb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {562}, m = "getUserSettings", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f144165b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144164a = obj;
        this.f144166c |= Integer.MIN_VALUE;
        return f.D4(this.f144165b, this);
    }
}
