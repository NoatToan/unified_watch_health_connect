package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {739}, m = "snapElevation")
public final class v6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f89991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6 f89992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(w6 w6Var, t13.d<? super v6> dVar) {
        super(dVar);
        this.f89992b = w6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f89991a = obj;
        this.f89993c |= Integer.MIN_VALUE;
        return this.f89992b.b(this);
    }
}
