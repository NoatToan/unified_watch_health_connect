package m4;

import h5.a1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class n extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public n(Object obj) {
        super(0, obj, o.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[LOOP:0: B:7:0x0022->B:17:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0122 A[LOOP:4: B:56:0x00f2->B:66:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0125 A[EDGE_INSN: B:74:0x0125->B:67:0x0125 BREAK  A[LOOP:0: B:7:0x0022->B:17:0x0059], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0125 A[EDGE_INSN: B:92:0x0125->B:67:0x0125 BREAK  A[LOOP:4: B:56:0x00f2->B:66:0x0122], SYNTHETIC] */
    @Override // e23.a
    public final Unit invoke() {
        a1 a1Var;
        o oVar = (o) this.receiver;
        u0<j0> u0Var = oVar.f116508c;
        u0<k> u0Var2 = oVar.f116509d;
        u uVar = oVar.f116506a;
        j0 j0VarF = uVar.f();
        if (j0VarF == null) {
            Object[] objArr = u0Var2.f134733b;
            long[] jArr = u0Var2.f134732a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j8 = jArr[i14];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j8 & 255) < 128) {
                                ((k) objArr[(i14 << 3) + i16]).u(h0.Inactive);
                            }
                            j8 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        }
                        if (i14 != length) {
                            break;
                        }
                        i14++;
                    }
                }
            }
        } else if (j0VarF.getIsAttached()) {
            if (u0Var.a(j0VarF)) {
                j0VarF.a2();
            }
            h0 h0VarA0 = j0VarF.a0();
            if (!j0VarF.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c node = j0VarF.getNode();
            h5.e0 e0VarG = h5.k.g(j0VarF);
            int i17 = 0;
            while (e0VarG != null) {
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 5120) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & 5120) != 0) {
                            if ((node.getKindSet() & 1024) != 0) {
                                i17++;
                            }
                            if ((node instanceof k) && u0Var2.a(node)) {
                                if (i17 <= 1) {
                                    ((k) node).u(h0VarA0);
                                } else {
                                    ((k) node).u(h0.ActiveParent);
                                }
                                u0Var2.l(node);
                            }
                        }
                        node = node.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                node = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
            }
            Object[] objArr2 = u0Var2.f134733b;
            long[] jArr2 = u0Var2.f134732a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j14 = jArr2[i18];
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i18 != length2) {
                            break;
                            break;
                        }
                        i18++;
                    } else {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        for (int i24 = 0; i24 < i19; i24++) {
                            if ((j14 & 255) < 128) {
                                ((k) objArr2[(i18 << 3) + i24]).u(h0.Inactive);
                            }
                            j14 >>= 8;
                        }
                        if (i19 != 8) {
                            break;
                        }
                        if (i18 != length2) {
                            break;
                        }
                        i18++;
                    }
                }
            }
        }
        if (uVar.f() == null || uVar.v() == h0.Inactive) {
            uVar.b();
        }
        u0Var.e();
        u0Var2.e();
        oVar.f116510e = false;
        return Unit.INSTANCE;
    }
}
