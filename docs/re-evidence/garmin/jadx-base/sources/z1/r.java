package z1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {349}, m = "animateWithTarget", v = 1)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f200868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f200869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1.m f200870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f200871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f200872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f200873f;

    public r(t13.d<? super r> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f200872e = obj;
        this.f200873f |= Integer.MIN_VALUE;
        return s.b(null, 0.0f, 0.0f, null, null, null, this);
    }
}
