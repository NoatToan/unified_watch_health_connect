package kotlin;

import e23.p;
import h5.k;
import h5.o1;
import o13.r;
import p005kotlin.jvm.internal.w;
import p3.y3;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3 f91135a = new y3(a.f91136a);

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li5/l1;", "invoke", "()Li5/l1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements e23.a<l1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91136a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ l1 invoke() {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final u13.a a(c3 c3Var, p pVar, c cVar) {
        e3 e3Var;
        if (cVar instanceof e3) {
            e3Var = (e3) cVar;
            int i14 = e3Var.f91170b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e3Var.f91170b = i14 - Integer.MIN_VALUE;
            } else {
                e3Var = new e3(cVar);
            }
        } else {
            e3Var = new e3(cVar);
        }
        Object obj = e3Var.f91169a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e3Var.f91170b;
        if (i15 == 0) {
            r.b(obj);
            if (!c3Var.getNode().getIsAttached()) {
                h.s("establishTextInputSession called from an unattached node");
                return null;
            }
            o1 o1VarH = k.h(c3Var);
            l1 l1Var = (l1) k.g(c3Var).D.a(f91135a);
            e3Var.f91170b = 1;
            if (b(o1VarH, l1Var, pVar, e3Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r5.s(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r6.a(r5, r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u13.a b(o1 o1Var, l1 l1Var, p pVar, c cVar) {
        f3 f3Var;
        if (cVar instanceof f3) {
            f3Var = (f3) cVar;
            int i14 = f3Var.f91184b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f3Var.f91184b = i14 - Integer.MIN_VALUE;
            } else {
                f3Var = new f3(cVar);
            }
        } else {
            f3Var = new f3(cVar);
        }
        Object obj = f3Var.f91183a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f3Var.f91184b;
        if (i15 == 0) {
            r.b(obj);
            if (l1Var == null) {
                f3Var.f91184b = 1;
            } else {
                f3Var.f91184b = 2;
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(obj);
            o2.c.f();
            return null;
        }
        if (i15 != 2) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        o2.c.f();
        return null;
    }
}
