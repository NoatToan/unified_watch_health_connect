package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes14.dex */
final class zzkx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i14, zzkw zzkwVar) {
        int i15 = i14 + 1;
        byte b14 = bArr[i14];
        if (b14 < 0) {
            return zzb(b14, bArr, i15, zzkwVar);
        }
        zzkwVar.zza = b14;
        return i15;
    }

    public static int zzb(int i14, byte[] bArr, int i15, zzkw zzkwVar) {
        byte b14 = bArr[i15];
        int i16 = i15 + 1;
        int i17 = i14 & 127;
        if (b14 >= 0) {
            zzkwVar.zza = i17 | (b14 << 7);
            return i16;
        }
        int i18 = i17 | ((b14 & Ascii.DEL) << 7);
        int i19 = i15 + 2;
        byte b15 = bArr[i16];
        if (b15 >= 0) {
            zzkwVar.zza = i18 | (b15 << Ascii.SO);
            return i19;
        }
        int i24 = i18 | ((b15 & Ascii.DEL) << 14);
        int i25 = i15 + 3;
        byte b16 = bArr[i19];
        if (b16 >= 0) {
            zzkwVar.zza = i24 | (b16 << Ascii.NAK);
            return i25;
        }
        int i26 = i24 | ((b16 & Ascii.DEL) << 21);
        int i27 = i15 + 4;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            zzkwVar.zza = i26 | (b17 << Ascii.FS);
            return i27;
        }
        int i28 = i26 | ((b17 & Ascii.DEL) << 28);
        while (true) {
            int i29 = i27 + 1;
            if (bArr[i27] >= 0) {
                zzkwVar.zza = i28;
                return i29;
            }
            i27 = i29;
        }
    }

    public static int zzc(byte[] bArr, int i14, zzkw zzkwVar) {
        long j8 = bArr[i14];
        int i15 = i14 + 1;
        if (j8 >= 0) {
            zzkwVar.zzb = j8;
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
        zzkwVar.zzb = j14;
        return i16;
    }

    public static int zzd(byte[] bArr, int i14) {
        int i15 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        int i16 = bArr[i14 + 1] & UnsignedBytes.MAX_VALUE;
        int i17 = bArr[i14 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i16 << 8) | i15 | (i17 << 16);
    }

    public static long zze(byte[] bArr, int i14) {
        return (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48) | ((((long) bArr[i14 + 7]) & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i14, zzkw zzkwVar) throws zzmr {
        int i15;
        int iZza = zza(bArr, i14, zzkwVar);
        int i16 = zzkwVar.zza;
        if (i16 < 0) {
            a.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i16 == 0) {
            zzkwVar.zzc = "";
            return iZza;
        }
        int i17 = zzos.zza;
        int length = bArr.length;
        if ((((length - iZza) - i16) | iZza | i16) < 0) {
            com.google.protobuf.a.l("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i16)});
            return 0;
        }
        int i18 = iZza + i16;
        char[] cArr = new char[i16];
        int i19 = 0;
        while (iZza < i18) {
            byte b14 = bArr[iZza];
            if (!zzoq.zza(b14)) {
                break;
            }
            iZza++;
            cArr[i19] = (char) b14;
            i19++;
        }
        int i24 = i19;
        while (iZza < i18) {
            int i25 = iZza + 1;
            byte b15 = bArr[iZza];
            if (zzoq.zza(b15)) {
                cArr[i24] = (char) b15;
                i24++;
                iZza = i25;
                while (iZza < i18) {
                    byte b16 = bArr[iZza];
                    if (!zzoq.zza(b16)) {
                        break;
                    }
                    iZza++;
                    cArr[i24] = (char) b16;
                    i24++;
                }
            } else {
                if (b15 < -32) {
                    if (i25 >= i18) {
                        a.l("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    i15 = i24 + 1;
                    iZza += 2;
                    zzoq.zzb(b15, bArr[i25], cArr, i24);
                } else if (b15 < -16) {
                    if (i25 >= i18 - 1) {
                        a.l("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    i15 = i24 + 1;
                    int i26 = iZza + 2;
                    iZza += 3;
                    zzoq.zzc(b15, bArr[i25], bArr[i26], cArr, i24);
                } else {
                    if (i25 >= i18 - 2) {
                        a.l("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    byte b17 = bArr[i25];
                    int i27 = iZza + 3;
                    byte b18 = bArr[iZza + 2];
                    iZza += 4;
                    zzoq.zzd(b15, b17, b18, bArr[i27], cArr, i24);
                    i24 += 2;
                }
                i24 = i15;
            }
        }
        zzkwVar.zzc = new String(cArr, 0, i24);
        return i18;
    }

    public static int zzg(byte[] bArr, int i14, zzkw zzkwVar) throws zzmr {
        int iZza = zza(bArr, i14, zzkwVar);
        int i15 = zzkwVar.zza;
        if (i15 < 0) {
            a.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i15 > bArr.length - iZza) {
            a.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i15 == 0) {
            zzkwVar.zzc = zzlh.zzb;
            return iZza;
        }
        zzkwVar.zzc = zzlh.zzh(bArr, iZza, i15);
        return iZza + i15;
    }

    public static int zzh(zznx zznxVar, byte[] bArr, int i14, int i15, zzkw zzkwVar) throws zzmr {
        Object objZza = zznxVar.zza();
        int iZzj = zzj(objZza, zznxVar, bArr, i14, i15, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zznx zznxVar, byte[] bArr, int i14, int i15, int i16, zzkw zzkwVar) throws zzmr {
        Object objZza = zznxVar.zza();
        int iZzk = zzk(objZza, zznxVar, bArr, i14, i15, i16, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zznx zznxVar, byte[] bArr, int i14, int i15, zzkw zzkwVar) throws zzmr {
        int iZzb = i14 + 1;
        int i16 = bArr[i14];
        if (i16 < 0) {
            iZzb = zzb(i16, bArr, iZzb, zzkwVar);
            i16 = zzkwVar.zza;
        }
        int i17 = iZzb;
        if (i16 < 0 || i16 > i15 - i17) {
            a.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i18 = zzkwVar.zze + 1;
        zzkwVar.zze = i18;
        zzq(i18);
        int i19 = i17 + i16;
        zznxVar.zzi(obj, bArr, i17, i19, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return i19;
    }

    public static int zzk(Object obj, zznx zznxVar, byte[] bArr, int i14, int i15, int i16, zzkw zzkwVar) throws zzmr {
        int i17 = zzkwVar.zze + 1;
        zzkwVar.zze = i17;
        zzq(i17);
        int iZzh = ((zznp) zznxVar).zzh(obj, bArr, i14, i15, i16, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return iZzh;
    }

    public static int zzl(int i14, byte[] bArr, int i15, int i16, zzmo zzmoVar, zzkw zzkwVar) {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i15, zzkwVar);
        zzmgVar.zzh(zzkwVar.zza);
        while (iZza < i16) {
            int iZza2 = zza(bArr, iZza, zzkwVar);
            if (i14 != zzkwVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i14, zzmo zzmoVar, zzkw zzkwVar) throws zzmr {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i14, zzkwVar);
        int i15 = zzkwVar.zza + iZza;
        while (iZza < i15) {
            iZza = zza(bArr, iZza, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        if (iZza == i15) {
            return iZza;
        }
        a.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int zzn(zznx zznxVar, int i14, byte[] bArr, int i15, int i16, zzmo zzmoVar, zzkw zzkwVar) throws zzmr {
        int iZzh = zzh(zznxVar, bArr, i15, i16, zzkwVar);
        zzmoVar.add(zzkwVar.zzc);
        while (iZzh < i16) {
            int iZza = zza(bArr, iZzh, zzkwVar);
            if (i14 != zzkwVar.zza) {
                break;
            }
            iZzh = zzh(zznxVar, bArr, iZza, i16, zzkwVar);
            zzmoVar.add(zzkwVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i14, byte[] bArr, int i15, int i16, zzoj zzojVar, zzkw zzkwVar) throws zzmr {
        if ((i14 >>> 3) == 0) {
            a.l("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i17 = i14 & 7;
        if (i17 == 0) {
            int iZzc = zzc(bArr, i15, zzkwVar);
            zzojVar.zzk(i14, Long.valueOf(zzkwVar.zzb));
            return iZzc;
        }
        if (i17 == 1) {
            zzojVar.zzk(i14, Long.valueOf(zze(bArr, i15)));
            return i15 + 8;
        }
        if (i17 == 2) {
            int iZza = zza(bArr, i15, zzkwVar);
            int i18 = zzkwVar.zza;
            if (i18 < 0) {
                a.l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i18 > bArr.length - iZza) {
                a.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i18 == 0) {
                zzojVar.zzk(i14, zzlh.zzb);
            } else {
                zzojVar.zzk(i14, zzlh.zzh(bArr, iZza, i18));
            }
            return iZza + i18;
        }
        if (i17 != 3) {
            if (i17 == 5) {
                zzojVar.zzk(i14, Integer.valueOf(zzd(bArr, i15)));
                return i15 + 4;
            }
            a.l("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i19 = (i14 & (-8)) | 4;
        zzoj zzojVarZzb = zzoj.zzb();
        int i24 = zzkwVar.zze + 1;
        zzkwVar.zze = i24;
        zzq(i24);
        int i25 = 0;
        while (i15 < i16) {
            int iZza2 = zza(bArr, i15, zzkwVar);
            int i26 = zzkwVar.zza;
            if (i26 == i19) {
                i25 = i26;
                i15 = iZza2;
                break;
            }
            i15 = zzo(i26, bArr, iZza2, i16, zzojVarZzb, zzkwVar);
            i25 = i26;
        }
        zzkwVar.zze--;
        if (i15 > i16 || i25 != i19) {
            a.l("Failed to parse the message.");
            return 0;
        }
        zzojVar.zzk(i14, zzojVarZzb);
        return i15;
    }

    public static int zzp(int i14, byte[] bArr, int i15, int i16, zzkw zzkwVar) throws zzmr {
        if ((i14 >>> 3) == 0) {
            a.l("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i17 = i14 & 7;
        if (i17 == 0) {
            return zzc(bArr, i15, zzkwVar);
        }
        if (i17 == 1) {
            return i15 + 8;
        }
        if (i17 == 2) {
            return zza(bArr, i15, zzkwVar) + zzkwVar.zza;
        }
        if (i17 != 3) {
            if (i17 == 5) {
                return i15 + 4;
            }
            a.l("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i18 = (i14 & (-8)) | 4;
        int i19 = 0;
        while (i15 < i16) {
            i15 = zza(bArr, i15, zzkwVar);
            i19 = zzkwVar.zza;
            if (i19 == i18) {
                break;
            }
            i15 = zzp(i19, bArr, i15, i16, zzkwVar);
        }
        if (i15 <= i16 && i19 == i18) {
            return i15;
        }
        a.l("Failed to parse the message.");
        return 0;
    }

    private static void zzq(int i14) throws zzmr {
        if (i14 < zzb) {
            return;
        }
        a.l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
