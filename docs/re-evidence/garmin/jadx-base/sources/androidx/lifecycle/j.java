package androidx.lifecycle;

import ch.qos.logback.core.CoreConstants;
import o53.e2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00122\u0010\r\u001a.\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/j;", "T", "Landroidx/lifecycle/w0;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/t0;", "Lt13/d;", "", "", "Landroidx/lifecycle/Block;", "block", "<init>", "(Lt13/g;JLe23/p;)V", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j<T> extends w0<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e<T> f7940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f7941n;

    public j(t13.g gVar, long j8, e23.p<? super t0<T>, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        gVar.getClass();
        pVar.getClass();
        e2 e2Var = new e2((o53.l1) gVar.get(o53.l1.f129368i0));
        x53.c cVar = o53.s0.f129406a;
        this.f7940m = new e<>(this, pVar, j8, o53.c0.a(u53.o.f168762a.H().plus(gVar).plus(e2Var)), new a03.e(this, 14));
    }

    @Override // androidx.lifecycle.w0, androidx.lifecycle.s0
    public final void h() {
        super.h();
        e<T> eVar = this.f7940m;
        if (eVar != null) {
            o53.c2 c2Var = eVar.f7870g;
            if (c2Var != null) {
                c2Var.c(null);
            }
            eVar.f7870g = null;
            if (eVar.f7869f != null) {
                return;
            }
            eVar.f7869f = ge1.b.T(eVar.f7867d, null, null, new d(eVar, null), 3);
        }
    }

    @Override // androidx.lifecycle.w0, androidx.lifecycle.s0
    public final void i() {
        super.i();
        e<T> eVar = this.f7940m;
        if (eVar != null) {
            if (eVar.f7870g != null) {
                vb.h.z("Cancel call cannot happen without a maybeRun");
                return;
            }
            o53.b0 b0Var = eVar.f7867d;
            x53.c cVar = o53.s0.f129406a;
            eVar.f7870g = ge1.b.T(b0Var, u53.o.f168762a.H(), null, new c(eVar, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(v13.c cVar) throws Throwable {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f7900c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f7900c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f7898a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f7900c;
        if (i15 == 0) {
            o13.r.b(obj);
            q qVar = this.f7941n;
            if (qVar != null) {
                hVar.f7900c = 1;
                x53.c cVar2 = o53.s0.f129406a;
                Object objE0 = ge1.b.e0(u53.o.f168762a.H(), new r(qVar, null), hVar);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f7941n = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r8 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(s0 s0Var, v13.c cVar) throws Throwable {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f7935d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f7935d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objE0 = iVar.f7933b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f7935d;
        if (i15 == 0) {
            o13.r.b(objE0);
            iVar.f7932a = s0Var;
            iVar.f7935d = 1;
            if (p(iVar) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            s0Var = iVar.f7932a;
            o13.r.b(objE0);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        q qVar = (q) objE0;
        this.f7941n = qVar;
        return qVar;
        iVar.f7932a = null;
        iVar.f7935d = 2;
        x53.c cVar2 = o53.s0.f129406a;
        objE0 = ge1.b.e0(u53.o.f168762a.H(), new l(this, s0Var, null), iVar);
    }

    public /* synthetic */ j(t13.g gVar, long j8, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? t13.h.f161748a : gVar, (i14 & 2) != 0 ? 5000L : j8, pVar);
    }
}
