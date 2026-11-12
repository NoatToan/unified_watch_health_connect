package i3;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BG\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li3/y9;", "", "Lh4/r;", "modifier", "Lo4/d0;", "containerColor", "contentColor", "Lg6/f;", "tonalElevation", "Lc2/k3;", "windowInsets", "Lkotlin/Function1;", "Lc2/t2;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Lh4/r;JJFLc2/k3;Le23/q;Lkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.r f90430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f90433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2.k3 f90434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.q<c2.t2, p3.m, Integer, Unit> f90435f;

    public /* synthetic */ y9(h4.r rVar, long j8, long j14, float f14, c2.k3 k3Var, e23.q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? h4.r.S : rVar, j8, j14, f14, k3Var, qVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y9(h4.r rVar, long j8, long j14, float f14, c2.k3 k3Var, e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f90430a = rVar;
        this.f90431b = j8;
        this.f90432c = j14;
        this.f90433d = f14;
        this.f90434e = k3Var;
        this.f90435f = qVar;
    }

    public /* synthetic */ y9(h4.r rVar, long j8, long j14, float f14, c2.k3 k3Var, e23.q qVar, p005kotlin.jvm.internal.j jVar) {
        this(rVar, j8, j14, f14, k3Var, qVar);
    }
}
