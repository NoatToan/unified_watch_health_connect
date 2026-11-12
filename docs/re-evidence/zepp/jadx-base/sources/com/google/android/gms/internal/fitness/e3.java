package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class e3 implements k3 {
    private k3[] a;

    public e3(k3... k3VarArr) {
        this.a = k3VarArr;
    }

    @Override // com.google.android.gms.internal.fitness.k3
    public final boolean a(Class<?> cls) {
        for (k3 k3Var : this.a) {
            if (k3Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fitness.k3
    public final l3 b(Class<?> cls) {
        for (k3 k3Var : this.a) {
            if (k3Var.a(cls)) {
                return k3Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
