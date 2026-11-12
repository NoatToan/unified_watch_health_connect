package d43;

import java.util.List;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public class b extends g<List<? extends g<?>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<t23.c0, n0> f57478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends g<?>> list, e23.l<? super t23.c0, ? extends n0> lVar) {
        super(list);
        list.getClass();
        lVar.getClass();
        this.f57478b = lVar;
    }

    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        n0 n0VarInvoke = this.f57478b.invoke(c0Var);
        if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.z(n0VarInvoke) && !p005kotlin.reflect.jvm.internal.impl.builtins.d.G(n0VarInvoke) && !p005kotlin.reflect.jvm.internal.impl.builtins.d.C(n0VarInvoke, kotlin.reflect.jvm.internal.impl.builtins.f.a.X.f188596a) && !p005kotlin.reflect.jvm.internal.impl.builtins.d.C(n0VarInvoke, kotlin.reflect.jvm.internal.impl.builtins.f.a.Y.f188596a) && !p005kotlin.reflect.jvm.internal.impl.builtins.d.C(n0VarInvoke, kotlin.reflect.jvm.internal.impl.builtins.f.a.Z.f188596a)) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.C(n0VarInvoke, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105868a0.f188596a);
        }
        return n0VarInvoke;
    }
}
