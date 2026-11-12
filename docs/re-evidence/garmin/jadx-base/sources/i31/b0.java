package i31;

import j31.z0;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li31/b0;", "", "Lb31/a;", "onboardingRepository", "<init>", "(Lb31/a;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b31.a f90647a;

    public b0(b31.a aVar) {
        aVar.getClass();
        this.f90647a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r10 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j8, v13.c cVar) {
        a0 a0Var;
        long j14;
        Iterator it;
        int i14;
        z0 z0VarA;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i15 = a0Var.f90644f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                a0Var.f90644f = i15 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objB = a0Var.f90642d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = a0Var.f90644f;
        if (i16 != 0) {
            if (i16 == 1) {
                j8 = a0Var.f90639a;
                o13.r.b(objB);
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = a0Var.f90641c;
                j14 = a0Var.f90639a;
                it = a0Var.f90640b;
                o13.r.b(objB);
            }
            while (it.hasNext()) {
                z0VarA = h31.d.a(((d31.a) it.next()).f57326f);
                if (z0VarA == null && z0VarA.a()) {
                    a0Var.getClass();
                    a0Var.f90640b = it;
                    a0Var.f90639a = j14;
                    a0Var.f90641c = i14;
                    a0Var.f90644f = 2;
                    if (z0VarA.c(j14, a0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objB);
        d31.c cVar2 = d31.c.NOT_STARTED;
        a0Var.f90639a = j8;
        a0Var.f90644f = 1;
        objB = this.f90647a.b(j8, cVar2, a0Var);
        j14 = j8;
        it = ((Iterable) objB).iterator();
        i14 = 0;
        while (it.hasNext()) {
            z0VarA = h31.d.a(((d31.a) it.next()).f57326f);
            if (z0VarA == null) {
            }
        }
        return Unit.INSTANCE;
    }
}
