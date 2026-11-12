package ug2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel", f = "MainViewModel.kt", l = {214}, m = "registerEditEventListener", v = 2)
public final class t0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f171028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r0 r0Var, t13.d<? super t0> dVar) {
        super(dVar);
        this.f171028b = r0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171027a = obj;
        this.f171029c |= Integer.MIN_VALUE;
        return r0.x4(this.f171028b, null, this);
    }
}
