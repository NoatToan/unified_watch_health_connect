package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {753}, m = "animateElevation")
public final class u6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.h f89882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w6 f89884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(w6 w6Var, t13.d<? super u6> dVar) {
        super(dVar);
        this.f89884c = w6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f89883b = obj;
        this.f89885d |= Integer.MIN_VALUE;
        return this.f89884c.a(null, this);
    }
}
