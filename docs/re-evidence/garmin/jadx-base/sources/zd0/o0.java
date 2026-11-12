package zd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PromosInitializer", f = "PromosInitializer.kt", l = {42}, m = "init", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f204095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f204096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f204097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f204098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, t13.d<? super o0> dVar) {
        super(dVar);
        this.f204097c = p0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204096b = obj;
        this.f204098d |= Integer.MIN_VALUE;
        return this.f204097c.a(this);
    }
}
