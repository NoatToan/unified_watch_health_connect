package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class l3 implements q3 {
    private final q3[] a;

    public l3(q3... q3VarArr) {
        this.a = q3VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.q3
    public final p3 a(Class<?> cls) {
        q3[] q3VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            q3 q3Var = q3VarArr[i];
            if (q3Var.b(cls)) {
                return q3Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.q3
    public final boolean b(Class<?> cls) {
        q3[] q3VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (q3VarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
