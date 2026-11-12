package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.measurement.a;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzcv {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i14, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i14, zzcuVar);
        int i15 = zzcuVar.zza;
        if (i15 < 0) {
            a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i15 > bArr.length - iZzj) {
            a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i15 == 0) {
            zzcuVar.zzc = zzdf.zzb;
            return iZzj;
        }
        zzcuVar.zzc = zzdf.zzr(bArr, iZzj, i15);
        return iZzj + i15;
    }

    public static int zzb(int i14, byte[] bArr, int i15, int i16, zzed zzedVar, zzef zzefVar, zzgs zzgsVar, zzcu zzcuVar) throws zzer {
        zzdx zzdxVar = zzedVar.zzb;
        zzhf zzhfVar = zzefVar.zzb.zzb;
        Object objValueOf = null;
        if (zzhfVar == zzhf.zzn) {
            zzj(bArr, i15, zzcuVar);
            throw null;
        }
        switch (zzhfVar.ordinal()) {
            case 0:
                i15 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(zzq(bArr, i15)));
                break;
            case 1:
                i15 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(zzc(bArr, i15)));
                break;
            case 2:
            case 3:
                i15 = zzm(bArr, i15, zzcuVar);
                objValueOf = Long.valueOf(zzcuVar.zzb);
                break;
            case 4:
            case 12:
                i15 = zzj(bArr, i15, zzcuVar);
                objValueOf = Integer.valueOf(zzcuVar.zza);
                break;
            case 5:
            case 15:
                i15 += 8;
                objValueOf = Long.valueOf(zzq(bArr, i15));
                break;
            case 6:
            case 14:
                i15 += 4;
                objValueOf = Integer.valueOf(zzc(bArr, i15));
                break;
            case 7:
                i15 = zzm(bArr, i15, zzcuVar);
                objValueOf = Boolean.valueOf(zzcuVar.zzb != 0);
                break;
            case 8:
                i15 = zzh(bArr, i15, zzcuVar);
                objValueOf = zzcuVar.zzc;
                break;
            case 9:
                int i17 = ((i14 >>> 3) << 3) | 4;
                zzge zzgeVarZzb = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze = zzdxVar.zze(zzefVar.zzb);
                if (objZze == null) {
                    objZze = zzgeVarZzb.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze);
                }
                return zzn(objZze, zzgeVarZzb, bArr, i15, i16, i17, zzcuVar);
            case 10:
                zzge zzgeVarZzb2 = zzfu.zza().zzb(zzefVar.zza.getClass());
                Object objZze2 = zzdxVar.zze(zzefVar.zzb);
                if (objZze2 == null) {
                    objZze2 = zzgeVarZzb2.zze();
                    zzdxVar.zzi(zzefVar.zzb, objZze2);
                }
                return zzo(objZze2, zzgeVarZzb2, bArr, i15, i16, zzcuVar);
            case 11:
                i15 = zza(bArr, i15, zzcuVar);
                objValueOf = zzcuVar.zzc;
                break;
            case 13:
                h.z("Shouldn't reach here.");
                return 0;
            case 16:
                i15 = zzj(bArr, i15, zzcuVar);
                objValueOf = Integer.valueOf(zzdj.zzb(zzcuVar.zza));
                break;
            case 17:
                i15 = zzm(bArr, i15, zzcuVar);
                objValueOf = Long.valueOf(zzdj.zzc(zzcuVar.zzb));
                break;
        }
        zzdxVar.zzi(zzefVar.zzb, objValueOf);
        return i15;
    }

    public static int zzc(byte[] bArr, int i14) {
        int i15 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        int i16 = bArr[i14 + 1] & UnsignedBytes.MAX_VALUE;
        int i17 = bArr[i14 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i16 << 8) | i15 | (i17 << 16);
    }

    public static int zzd(zzge zzgeVar, byte[] bArr, int i14, int i15, int i16, zzcu zzcuVar) throws zzer {
        Object objZze = zzgeVar.zze();
        int iZzn = zzn(objZze, zzgeVar, bArr, i14, i15, i16, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzge zzgeVar, byte[] bArr, int i14, int i15, zzcu zzcuVar) throws zzer {
        Object objZze = zzgeVar.zze();
        int iZzo = zzo(objZze, zzgeVar, bArr, i14, i15, zzcuVar);
        zzgeVar.zzf(objZze);
        zzcuVar.zzc = objZze;
        return iZzo;
    }

    public static int zzf(zzge zzgeVar, int i14, byte[] bArr, int i15, int i16, zzeo zzeoVar, zzcu zzcuVar) throws zzer {
        int iZze = zze(zzgeVar, bArr, i15, i16, zzcuVar);
        zzeoVar.add(zzcuVar.zzc);
        while (iZze < i16) {
            int iZzj = zzj(bArr, iZze, zzcuVar);
            if (i14 != zzcuVar.zza) {
                break;
            }
            iZze = zze(zzgeVar, bArr, iZzj, i16, zzcuVar);
            zzeoVar.add(zzcuVar.zzc);
        }
        return iZze;
    }

    public static int zzg(byte[] bArr, int i14, zzeo zzeoVar, zzcu zzcuVar) throws zzer {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i14, zzcuVar);
        int i15 = zzcuVar.zza + iZzj;
        while (iZzj < i15) {
            iZzj = zzj(bArr, iZzj, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        if (iZzj == i15) {
            return iZzj;
        }
        a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int zzh(byte[] bArr, int i14, zzcu zzcuVar) throws zzer {
        int iZzj = zzj(bArr, i14, zzcuVar);
        int i15 = zzcuVar.zza;
        if (i15 < 0) {
            a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i15 == 0) {
            zzcuVar.zzc = "";
            return iZzj;
        }
        zzcuVar.zzc = new String(bArr, iZzj, i15, zzep.zza);
        return iZzj + i15;
    }

    public static int zzi(int i14, byte[] bArr, int i15, int i16, zzgt zzgtVar, zzcu zzcuVar) throws zzer {
        if ((i14 >>> 3) == 0) {
            a.r("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i17 = i14 & 7;
        if (i17 == 0) {
            int iZzm = zzm(bArr, i15, zzcuVar);
            zzgtVar.zzj(i14, Long.valueOf(zzcuVar.zzb));
            return iZzm;
        }
        if (i17 == 1) {
            zzgtVar.zzj(i14, Long.valueOf(zzq(bArr, i15)));
            return i15 + 8;
        }
        if (i17 == 2) {
            int iZzj = zzj(bArr, i15, zzcuVar);
            int i18 = zzcuVar.zza;
            if (i18 < 0) {
                a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i18 > bArr.length - iZzj) {
                a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i18 == 0) {
                zzgtVar.zzj(i14, zzdf.zzb);
            } else {
                zzgtVar.zzj(i14, zzdf.zzr(bArr, iZzj, i18));
            }
            return iZzj + i18;
        }
        if (i17 != 3) {
            if (i17 == 5) {
                zzgtVar.zzj(i14, Integer.valueOf(zzc(bArr, i15)));
                return i15 + 4;
            }
            a.r("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i19 = (i14 & (-8)) | 4;
        zzgt zzgtVarZzf = zzgt.zzf();
        int i24 = zzcuVar.zze + 1;
        zzcuVar.zze = i24;
        zzr(i24);
        int i25 = 0;
        while (i15 < i16) {
            int iZzj2 = zzj(bArr, i15, zzcuVar);
            int i26 = zzcuVar.zza;
            if (i26 == i19) {
                i25 = i26;
                i15 = iZzj2;
                break;
            }
            i15 = zzi(i26, bArr, iZzj2, i16, zzgtVarZzf, zzcuVar);
            i25 = i26;
        }
        zzcuVar.zze--;
        if (i15 > i16 || i25 != i19) {
            a.r("Failed to parse the message.");
            return 0;
        }
        zzgtVar.zzj(i14, zzgtVarZzf);
        return i15;
    }

    public static int zzj(byte[] bArr, int i14, zzcu zzcuVar) {
        int i15 = i14 + 1;
        byte b14 = bArr[i14];
        if (b14 < 0) {
            return zzk(b14, bArr, i15, zzcuVar);
        }
        zzcuVar.zza = b14;
        return i15;
    }

    public static int zzk(int i14, byte[] bArr, int i15, zzcu zzcuVar) {
        byte b14 = bArr[i15];
        int i16 = i15 + 1;
        int i17 = i14 & 127;
        if (b14 >= 0) {
            zzcuVar.zza = i17 | (b14 << 7);
            return i16;
        }
        int i18 = i17 | ((b14 & Ascii.DEL) << 7);
        int i19 = i15 + 2;
        byte b15 = bArr[i16];
        if (b15 >= 0) {
            zzcuVar.zza = i18 | (b15 << Ascii.SO);
            return i19;
        }
        int i24 = i18 | ((b15 & Ascii.DEL) << 14);
        int i25 = i15 + 3;
        byte b16 = bArr[i19];
        if (b16 >= 0) {
            zzcuVar.zza = i24 | (b16 << Ascii.NAK);
            return i25;
        }
        int i26 = i24 | ((b16 & Ascii.DEL) << 21);
        int i27 = i15 + 4;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            zzcuVar.zza = i26 | (b17 << Ascii.FS);
            return i27;
        }
        int i28 = i26 | ((b17 & Ascii.DEL) << 28);
        while (true) {
            int i29 = i27 + 1;
            if (bArr[i27] >= 0) {
                zzcuVar.zza = i28;
                return i29;
            }
            i27 = i29;
        }
    }

    public static int zzl(int i14, byte[] bArr, int i15, int i16, zzeo zzeoVar, zzcu zzcuVar) {
        zzei zzeiVar = (zzei) zzeoVar;
        int iZzj = zzj(bArr, i15, zzcuVar);
        zzeiVar.zzg(zzcuVar.zza);
        while (iZzj < i16) {
            int iZzj2 = zzj(bArr, iZzj, zzcuVar);
            if (i14 != zzcuVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzcuVar);
            zzeiVar.zzg(zzcuVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i14, zzcu zzcuVar) {
        long j8 = bArr[i14];
        int i15 = i14 + 1;
        if (j8 >= 0) {
            zzcuVar.zzb = j8;
            return i15;
        }
        int i16 = i14 + 2;
        byte b14 = bArr[i15];
        long j14 = (j8 & 127) | (((long) (b14 & Ascii.DEL)) << 7);
        int i17 = 7;
        while (b14 < 0) {
            int i18 = i16 + 1;
            byte b15 = bArr[i16];
            i17 += 7;
            j14 |= ((long) (b15 & Ascii.DEL)) << i17;
            b14 = b15;
            i16 = i18;
        }
        zzcuVar.zzb = j14;
        return i16;
    }

    public static int zzn(Object obj, zzge zzgeVar, byte[] bArr, int i14, int i15, int i16, zzcu zzcuVar) throws zzer {
        int i17 = zzcuVar.zze + 1;
        zzcuVar.zze = i17;
        zzr(i17);
        int iZzc = ((zzfp) zzgeVar).zzc(obj, bArr, i14, i15, i16, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzge zzgeVar, byte[] bArr, int i14, int i15, zzcu zzcuVar) throws zzer {
        int iZzk = i14 + 1;
        int i16 = bArr[i14];
        if (i16 < 0) {
            iZzk = zzk(i16, bArr, iZzk, zzcuVar);
            i16 = zzcuVar.zza;
        }
        int i17 = iZzk;
        if (i16 < 0 || i16 > i15 - i17) {
            a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i18 = zzcuVar.zze + 1;
        zzcuVar.zze = i18;
        zzr(i18);
        int i19 = i17 + i16;
        zzgeVar.zzh(obj, bArr, i17, i19, zzcuVar);
        zzcuVar.zze--;
        zzcuVar.zzc = obj;
        return i19;
    }

    public static int zzp(int i14, byte[] bArr, int i15, int i16, zzcu zzcuVar) throws zzer {
        if ((i14 >>> 3) == 0) {
            a.r("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i17 = i14 & 7;
        if (i17 == 0) {
            return zzm(bArr, i15, zzcuVar);
        }
        if (i17 == 1) {
            return i15 + 8;
        }
        if (i17 == 2) {
            return zzj(bArr, i15, zzcuVar) + zzcuVar.zza;
        }
        if (i17 != 3) {
            if (i17 == 5) {
                return i15 + 4;
            }
            a.r("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i18 = (i14 & (-8)) | 4;
        int i19 = 0;
        while (i15 < i16) {
            i15 = zzj(bArr, i15, zzcuVar);
            i19 = zzcuVar.zza;
            if (i19 == i18) {
                break;
            }
            i15 = zzp(i19, bArr, i15, i16, zzcuVar);
        }
        if (i15 <= i16 && i19 == i18) {
            return i15;
        }
        a.r("Failed to parse the message.");
        return 0;
    }

    public static long zzq(byte[] bArr, int i14) {
        return (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48) | ((((long) bArr[i14 + 7]) & 255) << 56);
    }

    private static void zzr(int i14) throws zzer {
        if (i14 < zzb) {
            return;
        }
        a.r("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
