package p006l2;

import e23.a;
import p005kotlin.jvm.internal.s;
import s5.c;
import s5.p0;
import s5.q0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f108802b;

    public /* synthetic */ u(j3 j3Var, int i14) {
        this.f108801a = i14;
        this.f108802b = j3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        p0 p0Var;
        switch (this.f108801a) {
            case 0:
                j3 j3Var = this.f108802b;
                return Boolean.valueOf(j3Var != null ? ((Boolean) new u(j3Var, 2).invoke()).booleanValue() : false);
            case 1:
                j3 j3Var2 = this.f108802b;
                return Boolean.valueOf(j3Var2 != null ? ((Boolean) new u(j3Var2, 2).invoke()).booleanValue() : false);
            default:
                j3 j3Var3 = this.f108802b;
                c cVar = j3Var3.f108588b;
                q0 q0Var = (q0) j3Var3.f108587a.getF182175a();
                return Boolean.valueOf(s.g(cVar, (q0Var == null || (p0Var = q0Var.f157280a) == null) ? null : p0Var.f157265a));
        }
    }
}
