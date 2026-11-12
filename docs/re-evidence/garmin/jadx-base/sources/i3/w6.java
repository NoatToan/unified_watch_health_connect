package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/w6;", "", "Lg6/f;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f90093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f90094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f90095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f90096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1.b<g6.f, s1.n> f90097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2.h f90098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a2.h f90099g;

    private w6(float f14, float f15, float f16, float f17) {
        this.f90093a = f14;
        this.f90094b = f15;
        this.f90095c = f16;
        this.f90096d = f17;
        this.f90097e = new s1.b<>(g6.f.a(f14), s1.e2.f155570c, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a2.h] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a2.h] */
    /* JADX WARN: Type inference failed for: r6v2, types: [a2.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object a(a2.h hVar, v13.c cVar) {
        u6 u6Var;
        float f14;
        ?? r14;
        s1.b<g6.f, s1.n> bVar = this.f90097e;
        if (cVar instanceof u6) {
            u6Var = (u6) cVar;
            int i14 = u6Var.f89885d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u6Var.f89885d = i14 - Integer.MIN_VALUE;
            } else {
                u6Var = new u6(this, cVar);
            }
        } else {
            u6Var = new u6(this, cVar);
        }
        Object obj = u6Var.f89883b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u6Var.f89885d;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (hVar instanceof a2.l.b) {
                    f14 = this.f90094b;
                } else if (hVar instanceof a2.e) {
                    f14 = this.f90095c;
                } else {
                    f14 = hVar instanceof a2.b ? this.f90096d : this.f90093a;
                }
                this.f90099g = hVar;
                r14 = hVar;
                if (!g6.f.c(((g6.f) bVar.f155491e.getF182175a()).f75997a, f14)) {
                    a2.h hVar2 = this.f90098f;
                    u6Var.f89882a = hVar;
                    u6Var.f89885d = 1;
                    if (l3.w0.a(bVar, f14, hVar2, hVar, u6Var) == aVar) {
                        r14 = hVar;
                        return aVar;
                    }
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a2.h hVar3 = u6Var.f89882a;
                o13.r.b(obj);
                r14 = hVar3;
            }
            r14 = hVar;
            this.f90098f = r14;
            hVar = Unit.INSTANCE;
            return hVar;
        } catch (Throwable th3) {
            this.f90098f = hVar;
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(v13.c cVar) {
        v6 v6Var;
        float f14;
        if (cVar instanceof v6) {
            v6Var = (v6) cVar;
            int i14 = v6Var.f89993c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v6Var.f89993c = i14 - Integer.MIN_VALUE;
            } else {
                v6Var = new v6(this, cVar);
            }
        } else {
            v6Var = new v6(this, cVar);
        }
        Object obj = v6Var.f89991a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v6Var.f89993c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                a2.h hVar = this.f90099g;
                if (hVar instanceof a2.l.b) {
                    f14 = this.f90094b;
                } else if (hVar instanceof a2.e) {
                    f14 = this.f90095c;
                } else {
                    f14 = hVar instanceof a2.b ? this.f90096d : this.f90093a;
                }
                s1.b<g6.f, s1.n> bVar = this.f90097e;
                if (!g6.f.c(((g6.f) bVar.f155491e.getF182175a()).f75997a, f14)) {
                    g6.f fVarA = g6.f.a(f14);
                    v6Var.f89993c = 1;
                    if (bVar.g(fVarA, v6Var) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f90098f = this.f90099g;
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            this.f90098f = this.f90099g;
            throw th3;
        }
    }

    public /* synthetic */ w6(float f14, float f15, float f16, float f17, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17);
    }
}
