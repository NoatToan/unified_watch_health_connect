package c2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc2/a2;", "Lh5/c0;", "Lh4/r$c;", "Lg6/f;", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "", "rtlAware", "<init>", "(FFZLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a2 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22591c;

    private a2(float f14, float f15, boolean z14) {
        this.f22589a = f14;
        this.f22590b = f15;
        this.f22591c = z14;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ = y0Var.Q(j8);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new bp.h(4, this, v1VarQ));
    }

    public /* synthetic */ a2(float f14, float f15, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, z14);
    }
}
