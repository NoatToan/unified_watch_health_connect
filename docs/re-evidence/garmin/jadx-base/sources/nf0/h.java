package nf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.GHSAccountViewModel", f = "GHSAccountViewModel.kt", l = {70, 70}, m = "isMFAConfigurationSupported", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f125799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f125800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t13.d<? super h> dVar2) {
        super(dVar2);
        this.f125800b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125799a = obj;
        this.f125801c |= Integer.MIN_VALUE;
        int i14 = d.f125783b;
        return this.f125800b.A4(this);
    }
}
