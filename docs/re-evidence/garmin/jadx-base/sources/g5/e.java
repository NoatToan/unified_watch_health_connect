package g5;

import h4.r;
import h5.e0;
import h5.k;
import h5.m;
import h5.o1;
import java.util.HashSet;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg5/e;", "", "Lh5/o1;", "owner", "<init>", "(Lh5/o1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f75875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.c<h5.c> f75876b = new q3.c<>(new h5.c[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.c<c<?>> f75877c = new q3.c<>(new c[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q3.c<e0> f75878d = new q3.c<>(new e0[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q3.c<c<?>> f75879e = new q3.c<>(new c[16], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75880f;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements e23.a<Unit> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            e eVar = e.this;
            q3.c<c<?>> cVar = eVar.f75877c;
            q3.c<h5.c> cVar2 = eVar.f75876b;
            q3.c<c<?>> cVar3 = eVar.f75879e;
            eVar.f75880f = false;
            HashSet hashSet = new HashSet();
            q3.c<e0> cVar4 = eVar.f75878d;
            e0[] e0VarArr = cVar4.f142356a;
            int i14 = cVar4.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                e0 e0Var = e0VarArr[i15];
                c<?> cVar5 = cVar3.f142356a[i15];
                if (e0Var.P.f81685f.getIsAttached()) {
                    e.b(e0Var.P.f81685f, cVar5, hashSet);
                }
            }
            cVar4.g();
            cVar3.g();
            h5.c[] cVarArr = cVar2.f142356a;
            int i16 = cVar2.f142358c;
            for (int i17 = 0; i17 < i16; i17++) {
                h5.c cVar6 = cVarArr[i17];
                c<?> cVar7 = cVar.f142356a[i17];
                if (cVar6.getIsAttached()) {
                    e.b(cVar6, cVar7, hashSet);
                }
            }
            cVar2.g();
            cVar.g();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((h5.c) it.next()).W1();
            }
            return Unit.INSTANCE;
        }
    }

    public e(o1 o1Var) {
        this.f75875a = o1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static void b(r.c cVar, c cVar2, HashSet hashSet) {
        if (!cVar.getNode().getIsAttached()) {
            e5.a.b("visitSubtreeIf called on an unattached node");
        }
        q3.c cVar3 = new q3.c(new r.c[16], 0);
        r.c child = cVar.getNode().getChild();
        if (child == null) {
            k.a(cVar3, cVar.getNode());
        } else {
            cVar3.b(child);
        }
        while (true) {
            int i14 = cVar3.f142358c;
            if (i14 == 0) {
                return;
            }
            r.c cVar4 = (r.c) cVar3.k(i14 - 1);
            if ((cVar4.getAggregateChildKindSet() & 32) != 0) {
                r.c child2 = cVar4;
                while (true) {
                    if (child2 != null && child2.getIsAttached()) {
                        if ((child2.getKindSet() & 32) != 0) {
                            ?? B = child2;
                            ?? cVar5 = 0;
                            while (B != 0) {
                                if (B instanceof g) {
                                    g gVar = (g) B;
                                    if (gVar instanceof h5.c) {
                                        h5.c cVar6 = (h5.c) gVar;
                                        if ((cVar6.f81698a instanceof d) && cVar6.f81701d.contains(cVar2)) {
                                            hashSet.add(gVar);
                                        }
                                    }
                                    if (gVar.P0().a(cVar2)) {
                                        break;
                                    }
                                } else if ((B.getKindSet() & 32) != 0 && (B instanceof m)) {
                                    r.c child3 = ((m) B).f81888b;
                                    int i15 = 0;
                                    B = B;
                                    cVar5 = cVar5;
                                    while (child3 != null) {
                                        if ((child3.getKindSet() & 32) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                cVar5 = cVar5;
                                                B = child3;
                                            } else {
                                                if (cVar5 == 0) {
                                                    cVar5 = new q3.c(new r.c[16], 0);
                                                }
                                                if (B != 0) {
                                                    cVar5.b(B);
                                                    B = 0;
                                                }
                                                cVar5.b(child3);
                                            }
                                        }
                                        child3 = child3.getChild();
                                        B = B;
                                        cVar5 = cVar5;
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                B = k.b(cVar5);
                            }
                        }
                        child2 = child2.getChild();
                    }
                }
            }
            k.a(cVar3, cVar4);
        }
    }

    public final void a() {
        if (this.f75880f) {
            return;
        }
        this.f75880f = true;
        this.f75875a.C(new a());
    }
}
