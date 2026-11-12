package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class z3 implements p3 {
    private final zzlc a;
    private final String b;
    private final Object[] c;
    private final int d;

    public z3(zzlc zzlcVar, String str, Object[] objArr) {
        this.a = zzlcVar;
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

    public final String a() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.p3
    public final zzlc zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.p3
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.p3
    public final int zzc() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}
