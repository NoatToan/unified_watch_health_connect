package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class u3 implements l3 {
    private final zzik a;
    private final String b;
    private final Object[] c;
    private final int d;

    public u3(zzik zzikVar, String str, Object[] objArr) {
        this.a = zzikVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.fitness.l3
    public final int a() {
        return (this.d & 1) == 1 ? zziw.zzaaw : zziw.zzaax;
    }

    @Override // com.google.android.gms.internal.fitness.l3
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.fitness.l3
    public final zzik c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final Object[] e() {
        return this.c;
    }
}
