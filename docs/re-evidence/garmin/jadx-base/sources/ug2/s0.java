package ug2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewModel", f = "MainViewModel.kt", l = {347}, m = "changeToSupportedActivity", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public of2.b0 f170999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f171000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f171001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f171002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0 r0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f171001c = r0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171000b = obj;
        this.f171002d |= Integer.MIN_VALUE;
        int i14 = r0.D;
        return this.f171001c.z4(null, this);
    }
}
