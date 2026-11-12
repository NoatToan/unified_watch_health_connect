package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements e23.l<x33.c, Boolean> {
    @Override // e23.l
    public final Boolean invoke(x33.c cVar) {
        x33.c cVar2 = cVar;
        if (cVar2 != null) {
            return Boolean.valueOf(!cVar2.equals(kotlin.reflect.jvm.internal.impl.builtins.f.a.f105900z));
        }
        vb.h.s("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        return null;
    }
}
