package qb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {524}, m = "getHydrationSetting", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f144116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f144118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f144118c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144117b = obj;
        this.f144119d |= Integer.MIN_VALUE;
        return f.A4(this.f144118c, this);
    }
}
