package hx0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.PregnancyDetailsViewModel", f = "PregnancyDetailsViewModel.kt", l = {143}, m = "postCycleType", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f86126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f86127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(o0 o0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f86127b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f86126a = obj;
        this.f86128c |= Integer.MIN_VALUE;
        return o0.x4(this.f86127b, null, null, this);
    }
}
