package nf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.GHSAccountViewModel", f = "GHSAccountViewModel.kt", l = {79}, m = "isMFATypeSupported", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f125808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f125809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, t13.d<? super k> dVar2) {
        super(dVar2);
        this.f125809b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125808a = obj;
        this.f125810c |= Integer.MIN_VALUE;
        int i14 = d.f125783b;
        return this.f125809b.D4(this);
    }
}
