package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgk extends zzfu {
    private static final Logger b = Logger.getLogger(zzgk.class.getName());
    private static final boolean c = s4.q();
    public l2 a;

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public zzb(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    private zzgk() {
    }

    public static int a(zzik zzikVar, x3 x3Var) {
        zzfo zzfoVar = (zzfo) zzikVar;
        int iA = zzfoVar.a();
        if (iA == -1) {
            iA = x3Var.b(zzfoVar);
            zzfoVar.b(iA);
        }
        return zzt(iA) + iA;
    }

    public static int d(int i, zzik zzikVar, x3 x3Var) {
        return zzt(i << 3) + a(zzikVar, x3Var);
    }

    @Deprecated
    public static int g(int i, zzik zzikVar, x3 x3Var) {
        int iZzt = zzt(i << 3) << 1;
        zzfo zzfoVar = (zzfo) zzikVar;
        int iA = zzfoVar.a();
        if (iA == -1) {
            iA = x3Var.b(zzfoVar);
            zzfoVar.b(iA);
        }
        return iZzt + iA;
    }

    private static long h(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private static int i(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static zzgk zza(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public static int zzc(double d) {
        return 8;
    }

    public static int zzc(float f) {
        return 4;
    }

    public static int zzc(int i, zzfx zzfxVar) {
        int iZzt = zzt(i << 3);
        int size = zzfxVar.size();
        return iZzt + zzt(size) + size;
    }

    public static int zzd(int i, long j) {
        return zzt(i << 3) + zze(j);
    }

    public static int zze(int i, long j) {
        return zzt(i << 3) + zze(j);
    }

    public static int zze(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzf(int i, long j) {
        return zzt(i << 3) + zze(h(j));
    }

    public static int zzg(long j) {
        return 8;
    }

    public static int zzh(int i, long j) {
        return zzt(i << 3) + 8;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzi(int i, int i2) {
        return zzt(i << 3) + zzs(i2);
    }

    public static int zzj(int i, int i2) {
        return zzt(i << 3) + zzt(i2);
    }

    public static int zzk(int i, int i2) {
        return zzt(i << 3) + zzt(i(i2));
    }

    public static int zzl(int i, int i2) {
        return zzt(i << 3) + 4;
    }

    public static int zzm(int i, int i2) {
        return zzt(i << 3) + 4;
    }

    public static int zzn(int i, int i2) {
        return zzt(i << 3) + zzs(i2);
    }

    public static int zzr(int i) {
        return zzt(i << 3);
    }

    public static int zzs(int i) {
        if (i >= 0) {
            return zzt(i);
        }
        return 10;
    }

    public static int zzt(int i) {
        if ((i & com.alipay.sdk.m.n.a.g) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzu(int i) {
        return zzt(i(i));
    }

    public static int zzv(int i) {
        return 4;
    }

    public static int zzw(int i) {
        return 4;
    }

    public static int zzx(int i) {
        return zzs(i);
    }

    @Deprecated
    public static int zzz(int i) {
        return zzt(i);
    }

    public abstract void b(int i, zzik zzikVar, x3 x3Var) throws IOException;

    public final void c(String str, v4 v4Var) throws IOException {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) v4Var);
        byte[] bytes = str.getBytes(zzhc.a);
        try {
            zzo(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    public abstract void e(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzfx zzfxVar) throws IOException;

    public abstract void zza(int i, zzik zzikVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(zzfx zzfxVar) throws IOException;

    public final void zzb(int i, long j) throws IOException {
        zza(i, h(j));
    }

    public abstract void zzb(int i, zzfx zzfxVar) throws IOException;

    public abstract void zzb(zzik zzikVar) throws IOException;

    public abstract int zzbc();

    public abstract void zzc(byte b2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(long j) throws IOException;

    public abstract void zze(int i, int i2) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public final void zzg(int i, int i2) throws IOException {
        zzf(i, i(i2));
    }

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzl(String str) throws IOException;

    public abstract void zzn(int i) throws IOException;

    public abstract void zzo(int i) throws IOException;

    public final void zzp(int i) throws IOException {
        zzo(i(i));
    }

    public abstract void zzq(int i) throws IOException;

    public static class a extends zzgk {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        public a(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            if ((i2 | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.d = bArr;
            this.e = 0;
            this.g = 0;
            this.f = i2;
        }

        private final void j(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void b(int i, zzik zzikVar, x3 x3Var) throws IOException {
            writeTag(i, 2);
            zzfo zzfoVar = (zzfo) zzikVar;
            int iA = zzfoVar.a();
            if (iA == -1) {
                iA = x3Var.b(zzfoVar);
                zzfoVar.b(iA);
            }
            zzo(iA);
            x3Var.e(zzikVar, this.a);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void e(byte[] bArr, int i, int i2) throws IOException {
            zzo(i2);
            j(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void writeTag(int i, int i2) throws IOException {
            zzo((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zza(int i, long j) throws IOException {
            writeTag(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzb(int i, zzfx zzfxVar) throws IOException {
            writeTag(1, 3);
            zzf(2, i);
            zza(3, zzfxVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final int zzbc() {
            return this.f - this.g;
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzc(int i, long j) throws IOException {
            writeTag(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zze(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzf(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzh(int i, int i2) throws IOException {
            writeTag(i, 5);
            zzq(i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzl(String str) throws IOException {
            int i = this.g;
            try {
                int iZzt = zzgk.zzt(str.length() * 3);
                int iZzt2 = zzgk.zzt(str.length());
                if (iZzt2 != iZzt) {
                    zzo(u4.a(str));
                    this.g = u4.d(str, this.d, this.g, zzbc());
                    return;
                }
                int i2 = i + iZzt2;
                this.g = i2;
                int iD = u4.d(str, this.d, i2, zzbc());
                this.g = i;
                zzo((iD - i) - iZzt2);
                this.g = iD;
            } catch (v4 e) {
                this.g = i;
                c(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzn(int i) throws IOException {
            if (i >= 0) {
                zzo(i);
            } else {
                zza(i);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzo(int i) throws IOException {
            if (!zzgk.c || w1.a() || zzbc() < 5) {
                while ((i & com.alipay.sdk.m.n.a.g) != 0) {
                    try {
                        byte[] bArr = this.d;
                        int i2 = this.g;
                        this.g = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                    }
                }
                byte[] bArr2 = this.d;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & com.alipay.sdk.m.n.a.g) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                s4.i(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.d;
            int i5 = this.g;
            this.g = i5 + 1;
            s4.i(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & com.alipay.sdk.m.n.a.g) == 0) {
                byte[] bArr5 = this.d;
                int i7 = this.g;
                this.g = i7 + 1;
                s4.i(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.d;
            int i8 = this.g;
            this.g = i8 + 1;
            s4.i(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & com.alipay.sdk.m.n.a.g) == 0) {
                byte[] bArr7 = this.d;
                int i10 = this.g;
                this.g = i10 + 1;
                s4.i(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.d;
            int i11 = this.g;
            this.g = i11 + 1;
            s4.i(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & com.alipay.sdk.m.n.a.g) == 0) {
                byte[] bArr9 = this.d;
                int i13 = this.g;
                this.g = i13 + 1;
                s4.i(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.d;
            int i14 = this.g;
            this.g = i14 + 1;
            s4.i(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.d;
            int i15 = this.g;
            this.g = i15 + 1;
            s4.i(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzq(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.g = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zza(int i, boolean z) throws IOException {
            writeTag(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzc(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zza(int i, String str) throws IOException {
            writeTag(i, 2);
            zzl(str);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzb(zzik zzikVar) throws IOException {
            zzo(zzikVar.zzbp());
            zzikVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zzc(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                this.g = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                this.g = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                this.g = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                this.g = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                this.g = i8;
                bArr[i7] = (byte) (j >> 48);
                this.g = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zza(int i, zzfx zzfxVar) throws IOException {
            writeTag(i, 2);
            zza(zzfxVar);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zza(zzfx zzfxVar) throws IOException {
            zzo(zzfxVar.size());
            zzfxVar.b(this);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zza(int i, zzik zzikVar) throws IOException {
            writeTag(1, 3);
            zzf(2, i);
            writeTag(3, 2);
            zzb(zzikVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.fitness.zzgk
        public final void zza(long j) throws IOException {
            if (zzgk.c && zzbc() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    s4.i(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                s4.i(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.fitness.zzfu
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            j(bArr, i, i2);
        }
    }

    public static int zzg(int i, long j) {
        return zzt(i << 3) + 8;
    }

    public static int zzm(String str) {
        int length;
        try {
            length = u4.a(str);
        } catch (v4 unused) {
            length = str.getBytes(zzhc.a).length;
        }
        return zzt(length) + length;
    }

    public final void zzb(long j) throws IOException {
        zza(h(j));
    }

    public static int zzd(int i, zzfx zzfxVar) {
        return (zzt(8) << 1) + zzj(2, i) + zzc(3, zzfxVar);
    }

    public static int zzf(long j) {
        return zze(h(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) throws IOException {
        zzq(Float.floatToRawIntBits(f));
    }

    public static int zzc(zzik zzikVar) {
        int iZzbp = zzikVar.zzbp();
        return zzt(iZzbp) + iZzbp;
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) throws IOException {
        zzc(Double.doubleToRawLongBits(d));
    }

    public static int zzb(int i, float f) {
        return zzt(i << 3) + 4;
    }

    public final void zza(boolean z) throws IOException {
        zzc(z ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i, zzhp zzhpVar) {
        int iZzt = zzt(i << 3);
        int iZzbp = zzhpVar.zzbp();
        return iZzt + zzt(iZzbp) + iZzbp;
    }

    public static int zzb(int i, double d) {
        return zzt(i << 3) + 8;
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public static int zzb(int i, boolean z) {
        return zzt(i << 3) + 1;
    }

    @Deprecated
    public static int zzd(zzik zzikVar) {
        return zzikVar.zzbp();
    }

    public static int zzb(int i, String str) {
        return zzt(i << 3) + zzm(str);
    }

    public static int zza(zzhp zzhpVar) {
        int iZzbp = zzhpVar.zzbp();
        return zzt(iZzbp) + iZzbp;
    }

    public static int zzb(int i, zzik zzikVar) {
        return (zzt(8) << 1) + zzj(2, i) + zzt(24) + zzc(zzikVar);
    }

    public static int zzb(int i, zzhp zzhpVar) {
        return (zzt(8) << 1) + zzj(2, i) + zza(3, zzhpVar);
    }

    public static int zzb(zzfx zzfxVar) {
        int size = zzfxVar.size();
        return zzt(size) + size;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzt(length) + length;
    }
}
