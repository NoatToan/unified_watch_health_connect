package h5;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh5/l1;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.c<e0> f81884a = new q3.c<>(new e0[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0[] f81885b;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void b(e0 e0Var) {
        if (e0Var.L0 > 0) {
            if (e0Var.T.f81841d == e0.e.Idle && !e0Var.F() && !e0Var.G() && !e0Var.M0 && e0Var.g()) {
                a1 a1Var = e0Var.P;
                if ((a1Var.f81685f.getAggregateChildKindSet() & 256) != 0) {
                    for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
                        if ((child.getKindSet() & 256) != 0) {
                            ?? B = child;
                            ?? cVar = 0;
                            while (B != 0) {
                                if (B instanceof u) {
                                    u uVar = (u) B;
                                    uVar.o(k.e(uVar, 256));
                                } else if ((B.getKindSet() & 256) != 0 && (B instanceof m)) {
                                    h4.r.c child2 = ((m) B).f81888b;
                                    int i14 = 0;
                                    B = B;
                                    cVar = cVar;
                                    while (child2 != null) {
                                        if ((child2.getKindSet() & 256) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                cVar = cVar;
                                                B = child2;
                                            } else {
                                                if (cVar == 0) {
                                                    cVar = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar.b(B);
                                                    B = 0;
                                                }
                                                cVar.b(child2);
                                            }
                                        }
                                        child2 = child2.getChild();
                                        B = B;
                                        cVar = cVar;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                B = k.b(cVar);
                            }
                        }
                        if ((child.getAggregateChildKindSet() & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            e0Var.K0 = false;
            q3.c<e0> cVarN = e0Var.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i15 = cVarN.f142358c;
            for (int i16 = 0; i16 < i15; i16++) {
                b(e0VarArr[i16]);
            }
        }
    }

    public final void a() {
        a.C1624a c1624a = a.C1624a.f81886a;
        q3.c<e0> cVar = this.f81884a;
        cVar.n(c1624a);
        int i14 = cVar.f142358c;
        e0[] e0VarArr = this.f81885b;
        if (e0VarArr == null || e0VarArr.length < i14) {
            e0VarArr = new e0[Math.max(16, i14)];
        }
        this.f81885b = null;
        for (int i15 = 0; i15 < i14; i15++) {
            e0VarArr[i15] = cVar.f142356a[i15];
        }
        cVar.g();
        while (true) {
            i14--;
            if (-1 >= i14) {
                this.f81885b = e0VarArr;
                return;
            }
            e0 e0Var = e0VarArr[i14];
            e0Var.getClass();
            if (e0Var.K0) {
                b(e0Var);
            }
            e0VarArr[i14] = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lh5/l1$a;", "", "<init>", "()V", "", "MinArraySize", "I", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: h5.l1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/l1$a$a;", "Ljava/util/Comparator;", "Lh5/e0;", "Lkotlin/Comparator;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1624a implements Comparator<e0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1624a f81886a = new C1624a();

            private C1624a() {
            }

            @Override // java.util.Comparator
            public final int compare(e0 e0Var, e0 e0Var2) {
                e0 e0Var3 = e0Var;
                e0 e0Var4 = e0Var2;
                int iH = p005kotlin.jvm.internal.s.h(e0Var4.f81776p, e0Var3.f81776p);
                return iH != 0 ? iH : p005kotlin.jvm.internal.s.h(e0Var3.hashCode(), e0Var4.hashCode());
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
