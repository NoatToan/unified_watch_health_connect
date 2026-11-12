package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class m3 implements b4 {
    private static final q3 b = new k3();
    private final q3 a;

    public m3() {
        q3 q3Var;
        q3[] q3VarArr = new q3[2];
        q3VarArr[0] = d3.c();
        try {
            q3Var = (q3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            q3Var = b;
        }
        q3VarArr[1] = q3Var;
        l3 l3Var = new l3(q3VarArr);
        zzkf.c(l3Var, "messageInfoFactory");
        this.a = l3Var;
    }

    private static boolean b(p3 p3Var) {
        return p3Var.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final <T> a4<T> a(Class<T> cls) {
        c4.g(cls);
        p3 p3VarA = this.a.a(cls);
        if (p3VarA.zzb()) {
            return zzjx.class.isAssignableFrom(cls) ? t3.i(c4.b(), z2.b(), p3VarA.zza()) : t3.i(c4.b0(), z2.a(), p3VarA.zza());
        }
        if (zzjx.class.isAssignableFrom(cls)) {
            return b(p3VarA) ? s3.E(cls, p3VarA, v3.b(), i3.d(), c4.b(), z2.b(), o3.b()) : s3.E(cls, p3VarA, v3.b(), i3.d(), c4.b(), null, o3.b());
        }
        return b(p3VarA) ? s3.E(cls, p3VarA, v3.a(), i3.c(), c4.b0(), z2.a(), o3.a()) : s3.E(cls, p3VarA, v3.a(), i3.c(), c4.a(), null, o3.a());
    }
}
