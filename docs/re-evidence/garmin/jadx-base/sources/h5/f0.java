package h5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class f0 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f81802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<p5.q> f81803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, p005kotlin.jvm.internal.r0<p5.q> r0Var) {
        super(0);
        this.f81802a = e0Var;
        this.f81803b = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, p5.q] */
    @Override // e23.a
    public final Unit invoke() {
        a1 a1Var = this.f81802a.P;
        if ((a1Var.f81685f.getAggregateChildKindSet() & 8) != 0) {
            for (h4.r.c parent = a1Var.f81684e; parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & 8) != 0) {
                    ?? B = parent;
                    ?? cVar = 0;
                    while (B != 0) {
                        if (B instanceof y1) {
                            y1 y1Var = (y1) B;
                            boolean f136010b = y1Var.getF136010b();
                            p005kotlin.jvm.internal.r0<p5.q> r0Var = this.f81803b;
                            if (f136010b) {
                                ?? qVar = new p5.q();
                                r0Var.f105810a = qVar;
                                qVar.f136089e = true;
                            }
                            if (y1Var.getF136009a()) {
                                r0Var.f105810a.f136088d = true;
                            }
                            y1Var.D1(r0Var.f105810a);
                        } else if ((B.getKindSet() & 8) != 0 && (B instanceof m)) {
                            h4.r.c child = ((m) B).f81888b;
                            int i14 = 0;
                            while (child != null) {
                                if ((child.getKindSet() & 8) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        B = B;
                                        cVar = cVar;
                                        cVar = cVar;
                                        B = child;
                                    } else {
                                        if (cVar == 0) {
                                            cVar = new q3.c(new h4.r.c[16], 0);
                                        }
                                        if (B != 0) {
                                            cVar.b(B);
                                            B = 0;
                                        }
                                        cVar.b(child);
                                    }
                                } else {
                                    B = B;
                                    cVar = cVar;
                                }
                                child = child.getChild();
                                B = B;
                                cVar = cVar;
                            }
                            if (i14 == 1) {
                                B = B;
                                cVar = cVar;
                            } else {
                                B = B;
                                cVar = cVar;
                            }
                        }
                        B = k.b(cVar);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
