package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzl {
    private final ByteBuffer zzhb;

    private zzl(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int zzm(int i) {
        if ((i & (-128)) == 0) {
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

    public static int zzn(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private zzl(ByteBuffer byteBuffer) {
        this.zzhb = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static zzl zzb(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    public static zzl zzb(byte[] bArr, int i, int i2) {
        return new zzl(bArr, 0, i2);
    }

    public final void zza(int i, float f) throws IOException {
        zzf(i, 5);
        int iFloatToIntBits = Float.floatToIntBits(f);
        if (this.zzhb.remaining() < 4) {
            throw new zzm(this.zzhb.position(), this.zzhb.limit());
        }
        this.zzhb.putInt(iFloatToIntBits);
    }

    public final void zza(int i, long j) throws IOException {
        zzf(i, 0);
        zza(j);
    }

    public final void zzd(int i, int i2) throws IOException {
        zzf(i, 0);
        if (i2 >= 0) {
            zzl(i2);
        } else {
            zza(i2);
        }
    }

    public final void zza(int i, String str) throws IOException {
        zzf(i, 2);
        try {
            int iZzm = zzm(str.length());
            if (iZzm == zzm(str.length() * 3)) {
                int iPosition = this.zzhb.position();
                if (this.zzhb.remaining() < iZzm) {
                    throw new zzm(iPosition + iZzm, this.zzhb.limit());
                }
                this.zzhb.position(iPosition + iZzm);
                zza(str, this.zzhb);
                int iPosition2 = this.zzhb.position();
                this.zzhb.position(iPosition);
                zzl((iPosition2 - iPosition) - iZzm);
                this.zzhb.position(iPosition2);
                return;
            }
            zzl(zza(str));
            zza(str, this.zzhb);
        } catch (BufferOverflowException e) {
            zzm zzmVar = new zzm(this.zzhb.position(), this.zzhb.limit());
            zzmVar.initCause(e);
            throw zzmVar;
        }
    }

    public final void zza(int i, zzt zztVar) throws IOException {
        zzf(i, 2);
        if (zztVar.zzhl < 0) {
            zztVar.zzx();
        }
        zzl(zztVar.zzhl);
        zztVar.zza(this);
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char cCharAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i3 = 0;
        if (byteBuffer.hasArray()) {
            try {
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int iRemaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i4 = iRemaining + iArrayOffset;
                while (i3 < length) {
                    int i5 = i3 + iArrayOffset;
                    if (i5 >= i4 || (cCharAt = charSequence.charAt(i3)) >= 128) {
                        break;
                    }
                    bArrArray[i5] = (byte) cCharAt;
                    i3++;
                }
                if (i3 == length) {
                    i = iArrayOffset + length;
                } else {
                    i = iArrayOffset + i3;
                    while (i3 < length) {
                        char cCharAt2 = charSequence.charAt(i3);
                        if (cCharAt2 >= 128 || i >= i4) {
                            if (cCharAt2 < 2048 && i <= i4 - 2) {
                                bArrArray[i] = (byte) ((cCharAt2 >>> 6) | 960);
                                i2 = i + 2;
                                bArrArray[i + 1] = (byte) ((cCharAt2 & '?') | 128);
                            } else {
                                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i > i4 - 3) {
                                    if (i <= i4 - 4) {
                                        int i6 = i3 + 1;
                                        if (i6 != charSequence.length()) {
                                            char cCharAt3 = charSequence.charAt(i6);
                                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                                bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                                bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                                bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                                bArrArray[i + 3] = (byte) ((codePoint & 63) | 128);
                                                i += 4;
                                                i3 = i6;
                                            } else {
                                                i3 = i6;
                                            }
                                        }
                                        StringBuilder sb = new StringBuilder(39);
                                        sb.append("Unpaired surrogate at index ");
                                        sb.append(i3 - 1);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    StringBuilder sb2 = new StringBuilder(37);
                                    sb2.append("Failed writing ");
                                    sb2.append(cCharAt2);
                                    sb2.append(" at index ");
                                    sb2.append(i);
                                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                                }
                                bArrArray[i] = (byte) ((cCharAt2 >>> '\f') | 480);
                                bArrArray[i + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                                i2 = i + 3;
                                bArrArray[i + 2] = (byte) ((cCharAt2 & '?') | 128);
                            }
                            i = i2;
                        } else {
                            bArrArray[i] = (byte) cCharAt2;
                            i++;
                        }
                        i3++;
                    }
                }
                byteBuffer.position(i - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length2 = charSequence.length();
        while (i3 < length2) {
            char cCharAt4 = charSequence.charAt(i3);
            if (cCharAt4 < 128) {
                byteBuffer.put((byte) cCharAt4);
            } else if (cCharAt4 < 2048) {
                byteBuffer.put((byte) ((cCharAt4 >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt4 & '?') | 128));
            } else if (cCharAt4 < 55296 || 57343 < cCharAt4) {
                byteBuffer.put((byte) ((cCharAt4 >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt4 >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt4 & '?') | 128));
            } else {
                int i7 = i3 + 1;
                if (i7 != charSequence.length()) {
                    char cCharAt5 = charSequence.charAt(i7);
                    if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                        int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                        byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                        i3 = i7;
                    } else {
                        i3 = i7;
                    }
                }
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Unpaired surrogate at index ");
                sb3.append(i3 - 1);
                throw new IllegalArgumentException(sb3.toString());
            }
            i3++;
        }
    }

    public static int zzb(int i, long j) {
        int i2;
        int iZzk = zzk(i);
        if (((-128) & j) == 0) {
            i2 = 1;
        } else if (((-16384) & j) == 0) {
            i2 = 2;
        } else if (((-2097152) & j) == 0) {
            i2 = 3;
        } else if (((-268435456) & j) == 0) {
            i2 = 4;
        } else if (((-34359738368L) & j) == 0) {
            i2 = 5;
        } else if (((-4398046511104L) & j) == 0) {
            i2 = 6;
        } else if (((-562949953421312L) & j) == 0) {
            i2 = 7;
        } else if (((-72057594037927936L) & j) == 0) {
            i2 = 8;
        } else {
            i2 = (j & Long.MIN_VALUE) == 0 ? 9 : 10;
        }
        return iZzk + i2;
    }

    public static int zze(int i, int i2) {
        return zzk(i) + zzi(i2);
    }

    public static int zzb(int i, String str) {
        return zzk(i) + zzg(str);
    }

    public static int zzb(int i, zzt zztVar) {
        int iZzk = zzk(i);
        int iZzx = zztVar.zzx();
        return iZzk + zzm(iZzx) + iZzx;
    }

    public static int zzi(int i) {
        if (i >= 0) {
            return zzm(i);
        }
        return 10;
    }

    public static int zzg(String str) {
        int iZza = zza(str);
        return zzm(iZza) + iZza;
    }

    public final void zzr() {
        if (this.zzhb.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzhb.remaining())));
        }
    }

    public final void zza(byte b2) throws IOException {
        if (!this.zzhb.hasRemaining()) {
            throw new zzm(this.zzhb.position(), this.zzhb.limit());
        }
        this.zzhb.put(b2);
    }

    private final void zzj(int i) throws IOException {
        byte b2 = (byte) i;
        if (!this.zzhb.hasRemaining()) {
            throw new zzm(this.zzhb.position(), this.zzhb.limit());
        }
        this.zzhb.put(b2);
    }

    public final void zzc(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.zzhb.remaining() >= length) {
            this.zzhb.put(bArr, 0, length);
            return;
        }
        throw new zzm(this.zzhb.position(), this.zzhb.limit());
    }

    public final void zzf(int i, int i2) throws IOException {
        zzl((i << 3) | i2);
    }

    public static int zzk(int i) {
        return zzm(i << 3);
    }

    public final void zzl(int i) throws IOException {
        while ((i & (-128)) != 0) {
            zzj((i & 127) | 128);
            i >>>= 7;
        }
        zzj(i);
    }

    private final void zza(long j) throws IOException {
        while (((-128) & j) != 0) {
            zzj((((int) j) & 127) | 128);
            j >>>= 7;
        }
        zzj((int) j);
    }

    public final void zzb(long j) throws IOException {
        if (this.zzhb.remaining() < 8) {
            throw new zzm(this.zzhb.position(), this.zzhb.limit());
        }
        this.zzhb.putLong(j);
    }
}
