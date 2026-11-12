package h2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh2/l;", "Ly1/x;", "Lh2/j0;", "pagerState", "defaultBringIntoViewSpec", "<init>", "(Lh2/j0;Ly1/x;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements p008y1.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f80966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p008y1.x f80967c;

    public l(j0 j0Var, p008y1.x xVar) {
        this.f80966b = j0Var;
        this.f80967c = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008y1.x
    public final float a(float f14, float f15, float f16) {
        float fA = this.f80967c.a(f14, f15, f16);
        boolean z14 = false;
        if (f14 <= 0.0f ? f14 + f15 <= 0.0f : f14 + f15 > f16) {
            z14 = true;
        }
        float fAbs = Math.abs(fA);
        j0 j0Var = this.f80966b;
        if (fAbs == 0.0f || !z14) {
            if (Math.abs(j0Var.f80930f) < 1.0E-6d) {
                return 0.0f;
            }
            float fQ = j0Var.f80930f * (-1.0f);
            if (((Boolean) j0Var.J.getF182175a()).booleanValue()) {
                fQ += j0Var.q();
            }
            return j23.t.d(fQ, -f16, f16);
        }
        float fQ2 = j0Var.f80930f * (-1);
        while (fA > 0.0f && fQ2 < fA) {
            fQ2 += j0Var.q();
        }
        while (fA < 0.0f && fQ2 > fA) {
            fQ2 -= j0Var.q();
        }
        return fQ2;
    }
}
