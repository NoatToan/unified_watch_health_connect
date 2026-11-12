package p008y1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q0;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {857}, m = "doFlingAnimation-QWom1Mo", v = 1)
public final class f3 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f193202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f193204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, d<? super f3> dVar) {
        super(dVar);
        this.f193204c = h3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193203b = obj;
        this.f193205d |= Integer.MIN_VALUE;
        return this.f193204c.a(0L, this);
    }
}
