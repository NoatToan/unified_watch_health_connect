package z1;

import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {StatusLine.HTTP_PERM_REDIRECT}, m = "animateDecay", v = 1)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f200863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1.m f200864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0 f200865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f200866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f200867e;

    public q(t13.d<? super q> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f200866d = obj;
        this.f200867e |= Integer.MIN_VALUE;
        return s.a(null, 0.0f, null, null, null, this);
    }
}
