package yc;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/j1;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<e23.l<s, Unit>> f196089a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.p2 f196090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.b2 f196091c;

    public j1() {
        r53.p2 p2VarA = r53.q2.a(null);
        this.f196090b = p2VarA;
        this.f196091c = r53.s.d(p2VarA);
    }

    public static final s a(j1 j1Var, s sVar, b1 b1Var, b1 b1Var2) {
        z0 z0Var;
        z0 z0Var2;
        z0 z0Var3;
        j1Var.getClass();
        if (sVar == null || (z0Var = sVar.f196385a) == null) {
            z0.c.f196665b.getClass();
            z0Var = z0.c.f196667d;
        }
        z0 z0Var4 = b1Var.f195769a;
        z0 z0VarB = b(z0Var, z0Var4, z0Var4, b1Var2 != null ? b1Var2.f195769a : null);
        if (sVar == null || (z0Var2 = sVar.f196386b) == null) {
            z0.c.f196665b.getClass();
            z0Var2 = z0.c.f196667d;
        }
        z0 z0VarB2 = b(z0Var2, z0Var4, b1Var.f195770b, b1Var2 != null ? b1Var2.f195770b : null);
        if (sVar == null || (z0Var3 = sVar.f196387c) == null) {
            z0.c.f196665b.getClass();
            z0Var3 = z0.c.f196667d;
        }
        return new s(z0VarB, z0VarB2, b(z0Var3, z0Var4, b1Var.f195771c, b1Var2 != null ? b1Var2.f195771c : null), b1Var, b1Var2);
    }

    public static z0 b(z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4) {
        if (z0Var4 == null) {
            return z0Var3;
        }
        if (z0Var instanceof z0.b) {
            return (((z0Var2 instanceof z0.c) && (z0Var4 instanceof z0.c)) || (z0Var4 instanceof z0.a)) ? z0Var4 : z0Var;
        }
        return z0Var4;
    }

    public final void c(e23.l<? super s, s> lVar) {
        r53.p2 p2Var;
        Object value;
        s sVarInvoke;
        do {
            p2Var = this.f196090b;
            value = p2Var.getValue();
            s sVar = (s) value;
            sVarInvoke = lVar.invoke(sVar);
            if (p005kotlin.jvm.internal.s.g(sVar, sVarInvoke)) {
                return;
            }
        } while (!p2Var.b(value, sVarInvoke));
        if (sVarInvoke != null) {
            Iterator<e23.l<s, Unit>> it = this.f196089a.iterator();
            while (it.hasNext()) {
                it.next().invoke(sVarInvoke);
            }
        }
    }
}
