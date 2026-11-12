package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/w1;", "Lh5/s1;", "Lh4/r$c;", "", "weight", "", "fill", "<init>", "(FZ)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1 extends h4.r.c implements h5.s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22918b;

    public w1(float f14, boolean z14) {
        this.f22917a = f14;
        this.f22918b = z14;
    }

    @Override // h5.s1
    public final Object r(g6.c cVar, Object obj) {
        p2 p2Var = obj instanceof p2 ? (p2) obj : null;
        if (p2Var == null) {
            p2Var = new p2(0.0f, false, null, null, 15, null);
        }
        p2Var.f22811a = this.f22917a;
        p2Var.f22812b = this.f22918b;
        return p2Var;
    }
}
