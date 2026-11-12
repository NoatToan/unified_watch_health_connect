package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {428, 431}, m = "showSnackbar")
public final class ge extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public te f88244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f88245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f88246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe f88247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(fe feVar, t13.d<? super ge> dVar) {
        super(dVar);
        this.f88247d = feVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f88246c = obj;
        this.f88248e |= Integer.MIN_VALUE;
        return this.f88247d.a(null, this);
    }
}
