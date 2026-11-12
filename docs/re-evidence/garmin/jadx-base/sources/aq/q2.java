package aq;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.RestoreActivityViewModel", f = "RestoreActivityViewModel.kt", l = {116}, m = "displayTooLongDialog", v = 2)
public final class q2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2 f12167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(u2 u2Var, t13.d<? super q2> dVar) {
        super(dVar);
        this.f12167b = u2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12166a = obj;
        this.f12168c |= Integer.MIN_VALUE;
        return u2.x4(this.f12167b, this);
    }
}
