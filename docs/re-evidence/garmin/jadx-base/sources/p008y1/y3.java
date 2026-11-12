package p008y1;

import e23.a;
import o13.h;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 151}, m = "animateToZero", v = 1)
public final class y3 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f193724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f193725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f193726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f193727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3 f193728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f193729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(x3 x3Var, d<? super y3> dVar) {
        super(dVar);
        this.f193728e = x3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193727d = obj;
        this.f193729f |= Integer.MIN_VALUE;
        return this.f193728e.a(null, null, this);
    }
}
