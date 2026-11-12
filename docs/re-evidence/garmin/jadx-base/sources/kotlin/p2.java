package kotlin;

import b5.l0;
import e23.a;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/p2;", "Li5/h4;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2 implements h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a<v1> f91381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c2 f91382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f91383c = p0.n(Boolean.FALSE);

    public static void c(int i14) {
        i4.f91214c.getClass();
        i4.f91215d.setValue(l0.a(i14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.h4
    public final boolean a() {
        return ((Boolean) this.f91383c.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.h4
    public final long b() {
        v1 v1VarInvoke;
        if (this.f91382b == null) {
            a<v1> aVar = this.f91381a;
            if (aVar == null || (v1VarInvoke = aVar.invoke()) == null) {
                v1.f91599c.getClass();
                v1VarInvoke = v1.f91600d;
            }
            this.f91382b = p0.n(v1VarInvoke);
            this.f91381a = null;
        }
        c2 c2Var = this.f91382b;
        c2Var.getClass();
        return ((v1) c2Var.getF182175a()).f91601a;
    }
}
