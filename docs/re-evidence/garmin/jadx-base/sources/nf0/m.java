package nf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.GHSAccountViewModel", f = "GHSAccountViewModel.kt", l = {68, 68}, m = "isMFAValid", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f125814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f125815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d dVar, t13.d<? super m> dVar2) {
        super(dVar2);
        this.f125815b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125814a = obj;
        this.f125816c |= Integer.MIN_VALUE;
        int i14 = d.f125783b;
        return this.f125815b.E4(null, this);
    }
}
