package p008y1;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {527}, m = "reset", v = 1)
public final class d2 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f193164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f193165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(f2 f2Var, d<? super d2> dVar) {
        super(dVar);
        this.f193165b = f2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193164a = obj;
        this.f193166c |= Integer.MIN_VALUE;
        return this.f193165b.o(this);
    }
}
