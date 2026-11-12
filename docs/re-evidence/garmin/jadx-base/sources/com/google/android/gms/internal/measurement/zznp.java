package com.google.android.gms.internal.measurement;

import am.j;
import com.google.android.exoplayer2.v;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kg.f;
import r1.q2;
import sun.misc.Unsafe;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i14, int i15, zznm zznmVar, boolean z14, int[] iArr2, int i16, int i17, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i14;
        this.zzf = i15;
        boolean z15 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z15 = true;
        }
        this.zzh = z15;
        this.zzi = iArr2;
        this.zzj = i16;
        this.zzk = i17;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (zzA(obj)) {
            return;
        }
        h.s("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private static double zzC(Object obj, long j8) {
        return ((Double) zzop.zzn(obj, j8)).doubleValue();
    }

    private static float zzD(Object obj, long j8) {
        return ((Float) zzop.zzn(obj, j8)).floatValue();
    }

    private static int zzE(Object obj, long j8) {
        return ((Integer) zzop.zzn(obj, j8)).intValue();
    }

    private static long zzF(Object obj, long j8) {
        return ((Long) zzop.zzn(obj, j8)).longValue();
    }

    private static boolean zzG(Object obj, long j8) {
        return ((Boolean) zzop.zzn(obj, j8)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i14) {
        return zzJ(obj, i14) == zzJ(obj2, i14);
    }

    private final boolean zzI(Object obj, int i14, int i15, int i16, int i17) {
        if (i15 == 1048575) {
            return zzJ(obj, i14);
        }
        return (i16 & i17) != 0;
    }

    private final boolean zzJ(Object obj, int i14) {
        int iZzy = zzy(i14);
        long j8 = iZzy & 1048575;
        if (j8 != 1048575) {
            return (zzop.zzd(obj, j8) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i14);
        long j14 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j14)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j14)) != 0;
            case 2:
                return zzop.zzf(obj, j14) != 0;
            case 3:
                return zzop.zzf(obj, j14) != 0;
            case 4:
                return zzop.zzd(obj, j14) != 0;
            case 5:
                return zzop.zzf(obj, j14) != 0;
            case 6:
                return zzop.zzd(obj, j14) != 0;
            case 7:
                return zzop.zzh(obj, j14);
            case 8:
                Object objZzn = zzop.zzn(obj, j14);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzlh) {
                    return !zzlh.zzb.equals(objZzn);
                }
                h.w();
                return false;
            case 9:
                return zzop.zzn(obj, j14) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j14));
            case 11:
                return zzop.zzd(obj, j14) != 0;
            case 12:
                return zzop.zzd(obj, j14) != 0;
            case 13:
                return zzop.zzd(obj, j14) != 0;
            case 14:
                return zzop.zzf(obj, j14) != 0;
            case 15:
                return zzop.zzd(obj, j14) != 0;
            case 16:
                return zzop.zzf(obj, j14) != 0;
            case 17:
                return zzop.zzn(obj, j14) != null;
            default:
                h.w();
                return false;
        }
    }

    private final void zzK(Object obj, int i14) {
        int iZzy = zzy(i14);
        long j8 = 1048575 & iZzy;
        if (j8 == 1048575) {
            return;
        }
        zzop.zze(obj, j8, (1 << (iZzy >>> 20)) | zzop.zzd(obj, j8));
    }

    private final boolean zzL(Object obj, int i14, int i15) {
        return zzop.zzd(obj, (long) (zzy(i15) & 1048575)) == i14;
    }

    private final void zzM(Object obj, int i14, int i15) {
        zzop.zze(obj, zzy(i15) & 1048575, i14);
    }

    private final int zzN(int i14, int i15) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i15 <= length) {
            int i16 = (length + i15) >>> 1;
            int i17 = i16 * 3;
            int i18 = iArr[i17];
            if (i14 == i18) {
                return i17;
            }
            if (i14 < i18) {
                length = i16 - 1;
            } else {
                i15 = i16 + 1;
            }
        }
        return -1;
    }

    private static final int zzO(byte[] bArr, int i14, int i15, zzot zzotVar, Class cls, zzkw zzkwVar) {
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i16 = i14 + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i14)));
                return i16;
            case 1:
                int i17 = i14 + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i14)));
                return i17;
            case 2:
            case 3:
                int iZzc = zzkx.zzc(bArr, i14, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzkx.zza(bArr, i14, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return iZza;
            case 5:
            case 15:
                int i18 = i14 + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i14));
                return i18;
            case 6:
            case 14:
                int i19 = i14 + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i14));
                return i19;
            case 7:
                int iZzc2 = zzkx.zzc(bArr, i14, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzkx.zzf(bArr, i14, zzkwVar);
            case 9:
            default:
                f.n("unsupported field type.");
                return 0;
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i14, i15, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i14, zzkwVar);
            case 16:
                int iZza2 = zzkx.zza(bArr, i14, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzkx.zzc(bArr, i14, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzP(int i14, Object obj, zzov zzovVar) {
        if (obj instanceof String) {
            zzovVar.zzm(i14, (String) obj);
        } else {
            zzovVar.zzn(i14, (zzlh) obj);
        }
    }

    public static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzojVarZzb = zzoj.zzb();
        zzmfVar.zzc = zzojVarZzb;
        return zzojVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ad  */
    public static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        int i14;
        int iCharAt;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        int i24;
        int i25;
        char cCharAt;
        int i26;
        char cCharAt2;
        int i27;
        char cCharAt3;
        int i28;
        char cCharAt4;
        int i29;
        char cCharAt5;
        int i30;
        char cCharAt6;
        int i34;
        char cCharAt7;
        int i35;
        char cCharAt8;
        int i36;
        int i37;
        int i38;
        int iObjectFieldOffset;
        char c14;
        int iObjectFieldOffset2;
        int i39;
        int i44;
        int i45;
        Field fieldZzm;
        char cCharAt9;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        Object obj;
        Field fieldZzm2;
        int i55;
        Object obj2;
        Field fieldZzm3;
        int i56;
        char cCharAt10;
        int i57;
        char cCharAt11;
        int i58;
        char cCharAt12;
        int i59;
        char cCharAt13;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar = (zznw) zznjVar;
        String strZzd = zznwVar.zzd();
        int length = strZzd.length();
        char c15 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i64 = 1;
            while (true) {
                i14 = i64 + 1;
                if (strZzd.charAt(i64) < 55296) {
                    break;
                }
                i64 = i14;
            }
        } else {
            i14 = 1;
        }
        int i65 = i14 + 1;
        int iCharAt2 = strZzd.charAt(i14);
        if (iCharAt2 >= 55296) {
            int i66 = iCharAt2 & 8191;
            int i67 = 13;
            while (true) {
                i59 = i65 + 1;
                cCharAt13 = strZzd.charAt(i65);
                if (cCharAt13 < 55296) {
                    break;
                }
                i66 |= (cCharAt13 & 8191) << i67;
                i67 += 13;
                i65 = i59;
            }
            iCharAt2 = i66 | (cCharAt13 << i67);
            i65 = i59;
        }
        if (iCharAt2 == 0) {
            i16 = 0;
            i19 = 0;
            iCharAt = 0;
            i15 = 0;
            i17 = 0;
            i18 = 0;
            iArr = zza;
            i24 = 0;
        } else {
            int i68 = i65 + 1;
            int iCharAt3 = strZzd.charAt(i65);
            if (iCharAt3 >= 55296) {
                int i69 = iCharAt3 & 8191;
                int i74 = 13;
                while (true) {
                    i35 = i68 + 1;
                    cCharAt8 = strZzd.charAt(i68);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt8 & 8191) << i74;
                    i74 += 13;
                    i68 = i35;
                }
                iCharAt3 = i69 | (cCharAt8 << i74);
                i68 = i35;
            }
            int i75 = i68 + 1;
            int iCharAt4 = strZzd.charAt(i68);
            if (iCharAt4 >= 55296) {
                int i76 = iCharAt4 & 8191;
                int i77 = 13;
                while (true) {
                    i34 = i75 + 1;
                    cCharAt7 = strZzd.charAt(i75);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt7 & 8191) << i77;
                    i77 += 13;
                    i75 = i34;
                }
                iCharAt4 = i76 | (cCharAt7 << i77);
                i75 = i34;
            }
            int i78 = i75 + 1;
            int iCharAt5 = strZzd.charAt(i75);
            if (iCharAt5 >= 55296) {
                int i79 = iCharAt5 & 8191;
                int i84 = 13;
                while (true) {
                    i30 = i78 + 1;
                    cCharAt6 = strZzd.charAt(i78);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt6 & 8191) << i84;
                    i84 += 13;
                    i78 = i30;
                }
                iCharAt5 = i79 | (cCharAt6 << i84);
                i78 = i30;
            }
            int i85 = i78 + 1;
            int iCharAt6 = strZzd.charAt(i78);
            if (iCharAt6 >= 55296) {
                int i86 = iCharAt6 & 8191;
                int i87 = 13;
                while (true) {
                    i29 = i85 + 1;
                    cCharAt5 = strZzd.charAt(i85);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i86 |= (cCharAt5 & 8191) << i87;
                    i87 += 13;
                    i85 = i29;
                }
                iCharAt6 = i86 | (cCharAt5 << i87);
                i85 = i29;
            }
            int i88 = i85 + 1;
            iCharAt = strZzd.charAt(i85);
            if (iCharAt >= 55296) {
                int i89 = iCharAt & 8191;
                int i93 = 13;
                while (true) {
                    i28 = i88 + 1;
                    cCharAt4 = strZzd.charAt(i88);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i89 |= (cCharAt4 & 8191) << i93;
                    i93 += 13;
                    i88 = i28;
                }
                iCharAt = i89 | (cCharAt4 << i93);
                i88 = i28;
            }
            int i94 = i88 + 1;
            int iCharAt7 = strZzd.charAt(i88);
            if (iCharAt7 >= 55296) {
                int i95 = iCharAt7 & 8191;
                int i96 = 13;
                while (true) {
                    i27 = i94 + 1;
                    cCharAt3 = strZzd.charAt(i94);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i95 |= (cCharAt3 & 8191) << i96;
                    i96 += 13;
                    i94 = i27;
                }
                iCharAt7 = i95 | (cCharAt3 << i96);
                i94 = i27;
            }
            int i97 = i94 + 1;
            int iCharAt8 = strZzd.charAt(i94);
            if (iCharAt8 >= 55296) {
                int i98 = iCharAt8 & 8191;
                int i99 = 13;
                while (true) {
                    i26 = i97 + 1;
                    cCharAt2 = strZzd.charAt(i97);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i98 |= (cCharAt2 & 8191) << i99;
                    i99 += 13;
                    i97 = i26;
                }
                iCharAt8 = i98 | (cCharAt2 << i99);
                i97 = i26;
            }
            int i100 = i97 + 1;
            int iCharAt9 = strZzd.charAt(i97);
            if (iCharAt9 >= 55296) {
                int i101 = iCharAt9 & 8191;
                int i102 = 13;
                while (true) {
                    i25 = i100 + 1;
                    cCharAt = strZzd.charAt(i100);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i101 |= (cCharAt & 8191) << i102;
                    i102 += 13;
                    i100 = i25;
                }
                iCharAt9 = i101 | (cCharAt << i102);
                i100 = i25;
            }
            int i103 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i104 = iCharAt7;
            i15 = iCharAt5;
            i16 = i104;
            i17 = iCharAt6;
            i18 = iCharAt9;
            i19 = i103;
            iArr = iArr2;
            i24 = iCharAt3;
            i65 = i100;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zznwVar.zze();
        Class<?> cls2 = zznwVar.zzb().getClass();
        int i105 = i18 + i16;
        int i106 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i106];
        int i107 = i18;
        int i108 = i105;
        int i109 = 0;
        int i110 = 0;
        while (i65 < length) {
            int i111 = i65 + 1;
            int iCharAt10 = strZzd.charAt(i65);
            if (iCharAt10 >= c15) {
                int i112 = iCharAt10 & 8191;
                int i113 = i111;
                int i114 = 13;
                while (true) {
                    i58 = i113 + 1;
                    cCharAt12 = strZzd.charAt(i113);
                    if (cCharAt12 < c15) {
                        break;
                    }
                    i112 |= (cCharAt12 & 8191) << i114;
                    i114 += 13;
                    i113 = i58;
                }
                iCharAt10 = i112 | (cCharAt12 << i114);
                i36 = i58;
            } else {
                i36 = i111;
            }
            int i115 = i36 + 1;
            int iCharAt11 = strZzd.charAt(i36);
            if (iCharAt11 >= c15) {
                int i116 = iCharAt11 & 8191;
                int i117 = i115;
                int i118 = 13;
                while (true) {
                    i57 = i117 + 1;
                    cCharAt11 = strZzd.charAt(i117);
                    if (cCharAt11 < c15) {
                        break;
                    }
                    i116 |= (cCharAt11 & 8191) << i118;
                    i118 += 13;
                    i117 = i57;
                }
                iCharAt11 = i116 | (cCharAt11 << i118);
                i37 = i57;
            } else {
                i37 = i115;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i109] = i110;
                i109++;
            }
            int i119 = iCharAt11 & 255;
            zznw zznwVar2 = zznwVar;
            int i120 = iCharAt11 & 2048;
            if (i119 >= 51) {
                int i121 = i37 + 1;
                int iCharAt12 = strZzd.charAt(i37);
                char c16 = 55296;
                if (iCharAt12 >= 55296) {
                    int i122 = iCharAt12 & 8191;
                    int i123 = i121;
                    int i124 = 13;
                    while (true) {
                        i56 = i123 + 1;
                        cCharAt10 = strZzd.charAt(i123);
                        if (cCharAt10 < c16) {
                            break;
                        }
                        i122 |= (cCharAt10 & 8191) << i124;
                        i124 += 13;
                        i123 = i56;
                        c16 = 55296;
                    }
                    iCharAt12 = i122 | (cCharAt10 << i124);
                    i47 = i56;
                } else {
                    i47 = i121;
                }
                int i125 = i47;
                int i126 = i119 - 51;
                if (i126 == 9 || i126 == 17) {
                    i48 = i19 + 1;
                    int i127 = i110 / 3;
                    objArr[i127 + i127 + 1] = objArrZze[i19];
                } else {
                    if (i126 != 12) {
                        i49 = i120;
                    } else if (zznwVar2.zzc() == 1 || i120 != 0) {
                        i48 = i19 + 1;
                        int i128 = i110 / 3;
                        objArr[i128 + i128 + 1] = objArrZze[i19];
                    } else {
                        i49 = 0;
                    }
                    i54 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i54];
                    int i129 = i49;
                    if (obj instanceof Field) {
                        fieldZzm2 = (Field) obj;
                    } else {
                        fieldZzm2 = zzm(cls2, (String) obj);
                        objArrZze[i54] = fieldZzm2;
                    }
                    int i130 = i24;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                    i55 = i54 + 1;
                    obj2 = objArrZze[i55];
                    i38 = i130;
                    if (obj2 instanceof Field) {
                        fieldZzm3 = (Field) obj2;
                    } else {
                        fieldZzm3 = zzm(cls2, (String) obj2);
                        objArrZze[i55] = fieldZzm3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
                    strZzd = strZzd;
                    i44 = i129;
                    i37 = i125;
                    i39 = 0;
                    c14 = 55296;
                }
                i19 = i48;
                i49 = i120;
                i54 = iCharAt12 + iCharAt12;
                obj = objArrZze[i54];
                int i1210 = i49;
                if (obj instanceof Field) {
                    fieldZzm2 = (Field) obj;
                } else {
                    fieldZzm2 = zzm(cls2, (String) obj);
                    objArrZze[i54] = fieldZzm2;
                }
                int i131 = i24;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                i55 = i54 + 1;
                obj2 = objArrZze[i55];
                i38 = i131;
                if (obj2 instanceof Field) {
                    fieldZzm3 = (Field) obj2;
                } else {
                    fieldZzm3 = zzm(cls2, (String) obj2);
                    objArrZze[i55] = fieldZzm3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
                strZzd = strZzd;
                i44 = i1210;
                i37 = i125;
                i39 = 0;
                c14 = 55296;
            } else {
                i38 = i24;
                int i132 = i19 + 1;
                Field fieldZzm4 = zzm(cls2, (String) objArrZze[i19]);
                if (i119 == 9 || i119 == 17) {
                    int i133 = i110 / 3;
                    objArr[i133 + i133 + 1] = fieldZzm4.getType();
                } else {
                    if (i119 != 27) {
                        if (i119 == 49) {
                            i19 += 2;
                            i46 = 1;
                        } else if (i119 == 12 || i119 == 30 || i119 == 44) {
                            if (zznwVar2.zzc() == 1 || i120 != 0) {
                                i19 += 2;
                                int i134 = i110 / 3;
                                objArr[i134 + i134 + 1] = objArrZze[i132];
                            } else {
                                i19 = i132;
                                i120 = 0;
                            }
                        } else if (i119 == 50) {
                            int i135 = i19 + 2;
                            int i136 = i107 + 1;
                            iArr[i107] = i110;
                            int i137 = i110 / 3;
                            int i138 = i137 + i137;
                            objArr[i138] = objArrZze[i132];
                            if (i120 != 0) {
                                objArr[i138 + 1] = objArrZze[i135];
                                i19 += 3;
                                i107 = i136;
                            } else {
                                i19 = i135;
                                i107 = i136;
                                i120 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                        if ((iCharAt11 & 4096) != 0 || i119 > 17) {
                            c14 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i39 = 0;
                        } else {
                            int i139 = i37 + 1;
                            int iCharAt13 = strZzd.charAt(i37);
                            if (iCharAt13 >= 55296) {
                                int i140 = iCharAt13 & 8191;
                                int i141 = 13;
                                while (true) {
                                    i45 = i139 + 1;
                                    cCharAt9 = strZzd.charAt(i139);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i140 |= (cCharAt9 & 8191) << i141;
                                    i141 += 13;
                                    i139 = i45;
                                }
                                iCharAt13 = i140 | (cCharAt9 << i141);
                            } else {
                                i45 = i139;
                            }
                            int i142 = (iCharAt13 / 32) + i38 + i38;
                            Object obj3 = objArrZze[i142];
                            if (obj3 instanceof Field) {
                                fieldZzm = (Field) obj3;
                            } else {
                                fieldZzm = zzm(cls2, (String) obj3);
                                objArrZze[i142] = fieldZzm;
                            }
                            i39 = iCharAt13 % 32;
                            i37 = i45;
                            c14 = 55296;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm);
                        }
                        if (i119 >= 18 && i119 <= 49) {
                            iArr[i108] = iObjectFieldOffset;
                            i108++;
                        }
                        i44 = i120;
                    } else {
                        i46 = 1;
                        i19 += 2;
                    }
                    int i143 = i110 / 3;
                    objArr[i143 + i143 + i46] = objArrZze[i132];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                    if ((iCharAt11 & 4096) != 0) {
                        c14 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i39 = 0;
                    } else {
                        c14 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i39 = 0;
                    }
                    if (i119 >= 18) {
                        iArr[i108] = iObjectFieldOffset;
                        i108++;
                    }
                    i44 = i120;
                }
                i19 = i132;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                if ((iCharAt11 & 4096) != 0) {
                    c14 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i39 = 0;
                } else {
                    c14 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i39 = 0;
                }
                if (i119 >= 18) {
                    iArr[i108] = iObjectFieldOffset;
                    i108++;
                }
                i44 = i120;
            }
            int i144 = i110 + 1;
            iArr3[i110] = iCharAt10;
            int i145 = i110 + 2;
            iArr3[i144] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i44 != 0 ? Integer.MIN_VALUE : 0) | (i119 << 20) | iObjectFieldOffset;
            i110 += 3;
            iArr3[i145] = (i39 << 20) | iObjectFieldOffset2;
            i65 = i37;
            strZzd = strZzd;
            c15 = c14;
            zznwVar = zznwVar2;
            length = length;
            i24 = i38;
        }
        return new zznp(iArr3, objArr, i15, i17, zznwVar.zzb(), false, iArr, i18, i105, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb3 = new StringBuilder(v.a(11, str) + name.length() + 29 + String.valueOf(string).length());
            sn.a.t(sb3, "Field ", str, " for ", name);
            q2.v(j.o(" not found. Known fields are ", string, sb3), e4);
            return null;
        }
    }

    private final void zzn(Object obj, Object obj2, int i14) {
        if (zzJ(obj2, i14)) {
            int iZzx = zzx(i14) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzx;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                int i15 = this.zzc[i14];
                String string = obj2.toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 38 + string.length());
                sb3.append("Source subfield ");
                sb3.append(i15);
                sb3.append(" is present but null: ");
                sb3.append(string);
                throw new IllegalStateException(sb3.toString());
            }
            zznx zznxVarZzp = zzp(i14);
            if (!zzJ(obj, i14)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j8, objZza);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzK(obj, i14);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j8, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i14) {
        int[] iArr = this.zzc;
        int i15 = iArr[i14];
        if (zzL(obj2, i15, i14)) {
            int iZzx = zzx(i14) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzx;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                int i16 = iArr[i14];
                String string = obj2.toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(i16).length() + 38 + string.length());
                sb3.append("Source subfield ");
                sb3.append(i16);
                sb3.append(" is present but null: ");
                sb3.append(string);
                throw new IllegalStateException(sb3.toString());
            }
            zznx zznxVarZzp = zzp(i14);
            if (!zzL(obj, i15, i14)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j8, objZza);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzM(obj, i15, i14);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j8, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i14) {
        Object[] objArr = this.zzd;
        int i15 = i14 / 3;
        int i16 = i15 + i15;
        zznx zznxVar = (zznx) objArr[i16];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zznxVarZzb = zznu.zza().zzb((Class) objArr[i16 + 1]);
        objArr[i16] = zznxVarZzb;
        return zznxVarZzb;
    }

    private final Object zzq(int i14) {
        int i15 = i14 / 3;
        return this.zzd[i15 + i15];
    }

    private final zzmk zzr(int i14) {
        int i15 = i14 / 3;
        return (zzmk) this.zzd[i15 + i15 + 1];
    }

    private final Object zzs(Object obj, int i14) {
        zznx zznxVarZzp = zzp(i14);
        int iZzx = zzx(i14) & 1048575;
        if (!zzJ(obj, i14)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, iZzx);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzt(Object obj, int i14, Object obj2) {
        zzb.putObject(obj, zzx(i14) & 1048575, obj2);
        zzK(obj, i14);
    }

    private final Object zzu(Object obj, int i14, int i15) {
        zznx zznxVarZzp = zzp(i15);
        if (!zzL(obj, i14, i15)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i15) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzv(Object obj, int i14, int i15, Object obj2) {
        zzb.putObject(obj, zzx(i15) & 1048575, obj2);
        zzM(obj, i14, i15);
    }

    private static boolean zzw(Object obj, int i14, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i14 & 1048575));
    }

    private final int zzx(int i14) {
        return this.zzc[i14 + 1];
    }

    private final int zzy(int i14) {
        return this.zzc[i14 + 2];
    }

    private static int zzz(int i14) {
        return (i14 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzB;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzx = zzx(i14);
            long j8 = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzH(obj, obj2, i14) || Double.doubleToLongBits(zzop.zzl(obj, j8)) != Double.doubleToLongBits(zzop.zzl(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i14) || Float.floatToIntBits(zzop.zzj(obj, j8)) != Float.floatToIntBits(zzop.zzj(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i14) || zzop.zzf(obj, j8) != zzop.zzf(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i14) || zzop.zzf(obj, j8) != zzop.zzf(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i14) || zzop.zzd(obj, j8) != zzop.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i14) || zzop.zzf(obj, j8) != zzop.zzf(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i14) || zzop.zzd(obj, j8) != zzop.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i14) || zzop.zzh(obj, j8) != zzop.zzh(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i14) || !zznz.zzB(zzop.zzn(obj, j8), zzop.zzn(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i14) || !zznz.zzB(zzop.zzn(obj, j8), zzop.zzn(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i14) || !zznz.zzB(zzop.zzn(obj, j8), zzop.zzn(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i14) || zzop.zzd(obj, j8) != zzop.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i14) || zzop.zzd(obj, j8) != zzop.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i14) || zzop.zzd(obj, j8) != zzop.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i14) || zzop.zzf(obj, j8) != zzop.zzf(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i14) || zzop.zzd(obj, j8) != zzop.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i14) || zzop.zzf(obj, j8) != zzop.zzf(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i14) || !zznz.zzB(zzop.zzn(obj, j8), zzop.zzn(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzB = zznz.zzB(zzop.zzn(obj, j8), zzop.zzn(obj2, j8));
                    break;
                case 50:
                    zZzB = zznz.zzB(zzop.zzn(obj, j8), zzop.zzn(obj2, j8));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i14) & 1048575;
                    if (zzop.zzd(obj, jZzy) != zzop.zzd(obj2, jZzy) || !zznz.zzB(zzop.zzn(obj, j8), zzop.zzn(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i14;
        long jDoubleToLongBits;
        int i15;
        int iFloatToIntBits;
        int iZzd;
        int i16;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i17 >= iArr.length) {
                int iHashCode = ((zzmf) obj).zzc.hashCode() + (i18 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzx = zzx(i17);
            int i19 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i24 = iArr[i17];
            long j8 = i19;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i14 = i18 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j8));
                    byte[] bArr = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i18 = i14 + iZzd;
                    break;
                case 1:
                    i15 = i18 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j8));
                    i18 = iFloatToIntBits + i15;
                    break;
                case 2:
                    i14 = i18 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j8);
                    byte[] bArr2 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i18 = i14 + iZzd;
                    break;
                case 3:
                    i14 = i18 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j8);
                    byte[] bArr3 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i18 = i14 + iZzd;
                    break;
                case 4:
                    i14 = i18 * 53;
                    iZzd = zzop.zzd(obj, j8);
                    i18 = i14 + iZzd;
                    break;
                case 5:
                    i14 = i18 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j8);
                    byte[] bArr4 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i18 = i14 + iZzd;
                    break;
                case 6:
                    i14 = i18 * 53;
                    iZzd = zzop.zzd(obj, j8);
                    i18 = i14 + iZzd;
                    break;
                case 7:
                    i15 = i18 * 53;
                    iFloatToIntBits = zzmp.zzb(zzop.zzh(obj, j8));
                    i18 = iFloatToIntBits + i15;
                    break;
                case 8:
                    i15 = i18 * 53;
                    iFloatToIntBits = ((String) zzop.zzn(obj, j8)).hashCode();
                    i18 = iFloatToIntBits + i15;
                    break;
                case 9:
                    i16 = i18 * 53;
                    Object objZzn = zzop.zzn(obj, j8);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i18 = i16 + iHashCode2;
                    break;
                case 10:
                    i15 = i18 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j8).hashCode();
                    i18 = iFloatToIntBits + i15;
                    break;
                case 11:
                    i14 = i18 * 53;
                    iZzd = zzop.zzd(obj, j8);
                    i18 = i14 + iZzd;
                    break;
                case 12:
                    i14 = i18 * 53;
                    iZzd = zzop.zzd(obj, j8);
                    i18 = i14 + iZzd;
                    break;
                case 13:
                    i14 = i18 * 53;
                    iZzd = zzop.zzd(obj, j8);
                    i18 = i14 + iZzd;
                    break;
                case 14:
                    i14 = i18 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j8);
                    byte[] bArr5 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i18 = i14 + iZzd;
                    break;
                case 15:
                    i14 = i18 * 53;
                    iZzd = zzop.zzd(obj, j8);
                    i18 = i14 + iZzd;
                    break;
                case 16:
                    i14 = i18 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j8);
                    byte[] bArr6 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i18 = i14 + iZzd;
                    break;
                case 17:
                    i16 = i18 * 53;
                    Object objZzn2 = zzop.zzn(obj, j8);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i18 = i16 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i15 = i18 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j8).hashCode();
                    i18 = iFloatToIntBits + i15;
                    break;
                case 50:
                    i15 = i18 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j8).hashCode();
                    i18 = iFloatToIntBits + i15;
                    break;
                case 51:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzC(obj, j8));
                        byte[] bArr7 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i18 = i14 + iZzd;
                    }
                    break;
                case 52:
                    if (zzL(obj, i24, i17)) {
                        i15 = i18 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzD(obj, j8));
                        i18 = iFloatToIntBits + i15;
                    }
                    break;
                case 53:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        jDoubleToLongBits = zzF(obj, j8);
                        byte[] bArr8 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i18 = i14 + iZzd;
                    }
                    break;
                case 54:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        jDoubleToLongBits = zzF(obj, j8);
                        byte[] bArr9 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i18 = i14 + iZzd;
                    }
                    break;
                case 55:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        iZzd = zzE(obj, j8);
                        i18 = i14 + iZzd;
                    }
                    break;
                case 56:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        jDoubleToLongBits = zzF(obj, j8);
                        byte[] bArr10 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i18 = i14 + iZzd;
                    }
                    break;
                case 57:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        iZzd = zzE(obj, j8);
                        i18 = i14 + iZzd;
                    }
                    break;
                case 58:
                    if (zzL(obj, i24, i17)) {
                        i15 = i18 * 53;
                        iFloatToIntBits = zzmp.zzb(zzG(obj, j8));
                        i18 = iFloatToIntBits + i15;
                    }
                    break;
                case 59:
                    if (zzL(obj, i24, i17)) {
                        i15 = i18 * 53;
                        iFloatToIntBits = ((String) zzop.zzn(obj, j8)).hashCode();
                        i18 = iFloatToIntBits + i15;
                    }
                    break;
                case 60:
                    if (zzL(obj, i24, i17)) {
                        i15 = i18 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j8).hashCode();
                        i18 = iFloatToIntBits + i15;
                    }
                    break;
                case 61:
                    if (zzL(obj, i24, i17)) {
                        i15 = i18 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j8).hashCode();
                        i18 = iFloatToIntBits + i15;
                    }
                    break;
                case 62:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        iZzd = zzE(obj, j8);
                        i18 = i14 + iZzd;
                    }
                    break;
                case 63:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        iZzd = zzE(obj, j8);
                        i18 = i14 + iZzd;
                    }
                    break;
                case 64:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        iZzd = zzE(obj, j8);
                        i18 = i14 + iZzd;
                    }
                    break;
                case 65:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        jDoubleToLongBits = zzF(obj, j8);
                        byte[] bArr11 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i18 = i14 + iZzd;
                    }
                    break;
                case 66:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        iZzd = zzE(obj, j8);
                        i18 = i14 + iZzd;
                    }
                    break;
                case 67:
                    if (zzL(obj, i24, i17)) {
                        i14 = i18 * 53;
                        jDoubleToLongBits = zzF(obj, j8);
                        byte[] bArr12 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i18 = i14 + iZzd;
                    }
                    break;
                case 68:
                    if (zzL(obj, i24, i17)) {
                        i15 = i18 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j8).hashCode();
                        i18 = iFloatToIntBits + i15;
                    }
                    break;
            }
            i17 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i14 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i14 >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzx = zzx(i14);
            int i15 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i16 = iArr[i14];
            long j8 = i15;
            switch (iZzz) {
                case 0:
                    if (zzJ(obj2, i14)) {
                        zzop.zzm(obj, j8, zzop.zzl(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 1:
                    if (zzJ(obj2, i14)) {
                        zzop.zzk(obj, j8, zzop.zzj(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 2:
                    if (zzJ(obj2, i14)) {
                        zzop.zzg(obj, j8, zzop.zzf(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 3:
                    if (zzJ(obj2, i14)) {
                        zzop.zzg(obj, j8, zzop.zzf(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 4:
                    if (zzJ(obj2, i14)) {
                        zzop.zze(obj, j8, zzop.zzd(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 5:
                    if (zzJ(obj2, i14)) {
                        zzop.zzg(obj, j8, zzop.zzf(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 6:
                    if (zzJ(obj2, i14)) {
                        zzop.zze(obj, j8, zzop.zzd(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 7:
                    if (zzJ(obj2, i14)) {
                        zzop.zzi(obj, j8, zzop.zzh(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 8:
                    if (zzJ(obj2, i14)) {
                        zzop.zzo(obj, j8, zzop.zzn(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 9:
                    zzn(obj, obj2, i14);
                    break;
                case 10:
                    if (zzJ(obj2, i14)) {
                        zzop.zzo(obj, j8, zzop.zzn(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 11:
                    if (zzJ(obj2, i14)) {
                        zzop.zze(obj, j8, zzop.zzd(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 12:
                    if (zzJ(obj2, i14)) {
                        zzop.zze(obj, j8, zzop.zzd(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 13:
                    if (zzJ(obj2, i14)) {
                        zzop.zze(obj, j8, zzop.zzd(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 14:
                    if (zzJ(obj2, i14)) {
                        zzop.zzg(obj, j8, zzop.zzf(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 15:
                    if (zzJ(obj2, i14)) {
                        zzop.zze(obj, j8, zzop.zzd(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 16:
                    if (zzJ(obj2, i14)) {
                        zzop.zzg(obj, j8, zzop.zzf(obj2, j8));
                        zzK(obj, i14);
                    }
                    break;
                case 17:
                    zzn(obj, obj2, i14);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzmo zzmoVarZzg = (zzmo) zzop.zzn(obj, j8);
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj2, j8);
                    int size = zzmoVarZzg.size();
                    int size2 = zzmoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVarZzg.zza()) {
                            zzmoVarZzg = zzmoVarZzg.zzg(size2 + size);
                        }
                        zzmoVarZzg.addAll(zzmoVar);
                    }
                    if (size > 0) {
                        zzmoVar = zzmoVarZzg;
                    }
                    zzop.zzo(obj, j8, zzmoVar);
                    break;
                case 50:
                    int i17 = zznz.zza;
                    zzop.zzo(obj, j8, zznh.zza(zzop.zzn(obj, j8), zzop.zzn(obj2, j8)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzL(obj2, i16, i14)) {
                        zzop.zzo(obj, j8, zzop.zzn(obj2, j8));
                        zzM(obj, i16, i14);
                    }
                    break;
                case 60:
                    zzo(obj, obj2, i14);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzL(obj2, i16, i14)) {
                        zzop.zzo(obj, j8, zzop.zzn(obj2, j8));
                        zzM(obj, i16, i14);
                    }
                    break;
                case 68:
                    zzo(obj, obj2, i14);
                    break;
            }
            i14 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i14;
        int iZzz;
        int iZzA;
        int iZzz2;
        int iZzc;
        int iZzz3;
        int iZzz4;
        int iZzG;
        int iZzz5;
        int size;
        int iZzp;
        int iZzz6;
        int iZzz7;
        int iZzz8;
        int iZzx;
        int iZzz9;
        int iZzz10;
        int iZzG2;
        int iZzz11;
        int iZzA2;
        zznp<T> zznpVar = this;
        Unsafe unsafe = zzb;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int iA = 0;
        int i18 = 1048575;
        while (true) {
            int[] iArr = zznpVar.zzc;
            if (i16 >= iArr.length) {
                int iZzi = ((zzmf) obj).zzc.zzi() + iA;
                if (!zznpVar.zzh) {
                    return iZzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int iZzc2 = zzoeVar.zzc();
                int iZzj = 0;
                for (int i19 = 0; i19 < iZzc2; i19++) {
                    Map.Entry entryZzd = zzoeVar.zzd(i19);
                    iZzj += zzlw.zzj((zzlv) ((zzob) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    iZzj += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzx2 = zznpVar.zzx(i16);
            int iZzz12 = zzz(iZzx2);
            int i24 = iArr[i16];
            int i25 = iArr[i16 + 2];
            int i26 = i25 & i15;
            if (iZzz12 <= 17) {
                if (i26 != i18) {
                    i17 = i26 == i15 ? 0 : unsafe.getInt(obj, i26);
                    i18 = i26;
                }
                i14 = 1 << (i25 >>> 20);
            } else {
                i14 = 0;
            }
            int i27 = iZzx2 & i15;
            if (iZzz12 >= zzlx.zzJ.zza()) {
                zzlx.zzW.zza();
            }
            long j8 = i27;
            switch (iZzz12) {
                case 0:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(i24 << 3, 8, iA);
                    }
                    break;
                case 1:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(i24 << 3, 4, iA);
                    }
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        long j14 = unsafe.getLong(obj, j8);
                        iZzz = zzlm.zzz(i24 << 3);
                        iZzA = zzlm.zzA(j14);
                        iA += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        long j15 = unsafe.getLong(obj, j8);
                        iZzz = zzlm.zzz(i24 << 3);
                        iZzA = zzlm.zzA(j15);
                        iA += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        long j16 = unsafe.getInt(obj, j8);
                        iZzz = zzlm.zzz(i24 << 3);
                        iZzA = zzlm.zzA(j16);
                        iA += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(i24 << 3, 8, iA);
                    }
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(i24 << 3, 4, iA);
                    }
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(i24 << 3, 1, iA);
                    }
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        int i28 = i24 << 3;
                        Object object = unsafe.getObject(obj, j8);
                        if (object instanceof zzlh) {
                            iZzz2 = zzlm.zzz(i28);
                            iZzc = ((zzlh) object).zzc();
                            iZzz3 = zzlm.zzz(iZzc);
                            iA += iZzz3 + iZzc + iZzz2;
                        } else {
                            iZzz = zzlm.zzz(i28);
                            iZzA = zzlm.zzB((String) object);
                            iA += iZzA + iZzz;
                        }
                    }
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iZzz4 = zznz.zzz(i24, unsafe.getObject(obj, j8), zznpVar.zzp(i16));
                        iA += iZzz4;
                    }
                    break;
                case 10:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj, j8);
                        iZzz2 = zzlm.zzz(i24 << 3);
                        iZzc = zzlhVar.zzc();
                        iZzz3 = zzlm.zzz(iZzc);
                        iA += iZzz3 + iZzc + iZzz2;
                    }
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(unsafe.getInt(obj, j8), zzlm.zzz(i24 << 3), iA);
                    }
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        long j17 = unsafe.getInt(obj, j8);
                        iZzz = zzlm.zzz(i24 << 3);
                        iZzA = zzlm.zzA(j17);
                        iA += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(i24 << 3, 4, iA);
                    }
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iA = a.a(i24 << 3, 8, iA);
                    }
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        int i29 = unsafe.getInt(obj, j8);
                        iA = a.a((i29 >> 31) ^ (i29 + i29), zzlm.zzz(i24 << 3), iA);
                    }
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        long j18 = unsafe.getLong(obj, j8);
                        iZzz = zzlm.zzz(i24 << 3);
                        iZzA = zzlm.zzA((j18 >> 63) ^ (j18 + j18));
                        iA += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj, i16, i18, i17, i14)) {
                        iZzG = zzlm.zzG(i24, (zznm) unsafe.getObject(obj, j8), zznpVar.zzp(i16));
                        iA += iZzG;
                    }
                    break;
                case 18:
                    iZzz4 = zznz.zzy(i24, (List) unsafe.getObject(obj, j8), false);
                    iA += iZzz4;
                    break;
                case 19:
                    iZzz4 = zznz.zzw(i24, (List) unsafe.getObject(obj, j8), false);
                    iA += iZzz4;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j8);
                    int i30 = zznz.zza;
                    if (list.size() == 0) {
                        iZzz5 = 0;
                    } else {
                        iZzz5 = (zzlm.zzz(i24 << 3) * list.size()) + zznz.zzo(list);
                    }
                    iA += iZzz5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j8);
                    int i34 = zznz.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzp(list2);
                        iZzz6 = zzlm.zzz(i24 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iA += iZzz7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j8);
                    int i35 = zznz.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzs(list3);
                        iZzz6 = zzlm.zzz(i24 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iA += iZzz7;
                    break;
                case 23:
                    iZzz4 = zznz.zzy(i24, (List) unsafe.getObject(obj, j8), false);
                    iA += iZzz4;
                    break;
                case 24:
                    iZzz4 = zznz.zzw(i24, (List) unsafe.getObject(obj, j8), false);
                    iA += iZzz4;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j8);
                    int i36 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzz5 = 0;
                    } else {
                        iZzz5 = (zzlm.zzz(i24 << 3) + 1) * size2;
                    }
                    iA += iZzz5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j8);
                    int i37 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = zzlm.zzz(i24 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i38 = 0; i38 < size3; i38++) {
                                Object objZzc = zzmxVar.zzc();
                                if (objZzc instanceof zzlh) {
                                    int iZzc3 = ((zzlh) objZzc).zzc();
                                    iZzz7 = a.a(iZzc3, iZzc3, iZzz7);
                                } else {
                                    iZzz7 = zzlm.zzB((String) objZzc) + iZzz7;
                                }
                            }
                        } else {
                            for (int i39 = 0; i39 < size3; i39++) {
                                Object obj2 = list5.get(i39);
                                if (obj2 instanceof zzlh) {
                                    int iZzc4 = ((zzlh) obj2).zzc();
                                    iZzz7 = a.a(iZzc4, iZzc4, iZzz7);
                                } else {
                                    iZzz7 = zzlm.zzB((String) obj2) + iZzz7;
                                }
                            }
                        }
                    }
                    iA += iZzz7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j8);
                    zznx zznxVarZzp = zznpVar.zzp(i16);
                    int i44 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz8 = 0;
                    } else {
                        iZzz8 = zzlm.zzz(i24 << 3) * size4;
                        for (int i45 = 0; i45 < size4; i45++) {
                            Object obj3 = list6.get(i45);
                            if (obj3 instanceof zzmw) {
                                int iZzb = ((zzmw) obj3).zzb();
                                iZzz8 = a.a(iZzb, iZzb, iZzz8);
                            } else {
                                iZzz8 = zzlm.zzD((zznm) obj3, zznxVarZzp) + iZzz8;
                            }
                        }
                    }
                    iA += iZzz8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j8);
                    int i46 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = zzlm.zzz(i24 << 3) * size5;
                        for (int i47 = 0; i47 < list7.size(); i47++) {
                            int iZzc5 = ((zzlh) list7.get(i47)).zzc();
                            iZzz7 = a.a(iZzc5, iZzc5, iZzz7);
                        }
                    }
                    iA += iZzz7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j8);
                    int i48 = zznz.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzt(list8);
                        iZzz6 = zzlm.zzz(i24 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iA += iZzz7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j8);
                    int i49 = zznz.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzr(list9);
                        iZzz6 = zzlm.zzz(i24 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iA += iZzz7;
                    break;
                case 31:
                    iZzz4 = zznz.zzw(i24, (List) unsafe.getObject(obj, j8), false);
                    iA += iZzz4;
                    break;
                case 32:
                    iZzz4 = zznz.zzy(i24, (List) unsafe.getObject(obj, j8), false);
                    iA += iZzz4;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j8);
                    int i54 = zznz.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzu(list10);
                        iZzz6 = zzlm.zzz(i24 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iA += iZzz7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j8);
                    int i55 = zznz.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzq(list11);
                        iZzz6 = zzlm.zzz(i24 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iA += iZzz7;
                    break;
                case 35:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 36:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 37:
                    iZzx = zznz.zzo((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 38:
                    iZzx = zznz.zzp((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 39:
                    iZzx = zznz.zzs((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 40:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 41:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j8);
                    int i56 = zznz.zza;
                    iZzx = list12.size();
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 43:
                    iZzx = zznz.zzt((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 44:
                    iZzx = zznz.zzr((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 45:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 46:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 47:
                    iZzx = zznz.zzu((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 48:
                    iZzx = zznz.zzq((List) unsafe.getObject(obj, j8));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i24 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j8);
                    zznx zznxVarZzp2 = zznpVar.zzp(i16);
                    int i57 = zznz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzG2 = 0;
                    } else {
                        iZzG2 = 0;
                        for (int i58 = 0; i58 < size6; i58++) {
                            iZzG2 += zzlm.zzG(i24, (zznm) list13.get(i58), zznxVarZzp2);
                        }
                    }
                    iA += iZzG2;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj, j8);
                    zznf zznfVar = (zznf) zznpVar.zzq(i16);
                    if (zzngVar.isEmpty()) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            iZzz7 += zznfVar.zzd(i24, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iA += iZzz7;
                    break;
                case 51:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(i24 << 3, 8, iA);
                    }
                    break;
                case 52:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(i24 << 3, 4, iA);
                    }
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        long jZzF = zzF(obj, j8);
                        iZzz11 = zzlm.zzz(i24 << 3);
                        iZzA2 = zzlm.zzA(jZzF);
                        iA += iZzA2 + iZzz11;
                    }
                    break;
                case 54:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        long jZzF2 = zzF(obj, j8);
                        iZzz11 = zzlm.zzz(i24 << 3);
                        iZzA2 = zzlm.zzA(jZzF2);
                        iA += iZzA2 + iZzz11;
                    }
                    break;
                case 55:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        long jZzE = zzE(obj, j8);
                        iZzz11 = zzlm.zzz(i24 << 3);
                        iZzA2 = zzlm.zzA(jZzE);
                        iA += iZzA2 + iZzz11;
                    }
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(i24 << 3, 8, iA);
                    }
                    break;
                case 57:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(i24 << 3, 4, iA);
                    }
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(i24 << 3, 1, iA);
                    }
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        int i59 = i24 << 3;
                        Object object2 = unsafe.getObject(obj, j8);
                        if (object2 instanceof zzlh) {
                            iZzx = zzlm.zzz(i59);
                            iZzz9 = ((zzlh) object2).zzc();
                            iZzz10 = zzlm.zzz(iZzz9);
                            iA += iZzz10 + iZzz9 + iZzx;
                        } else {
                            iZzz11 = zzlm.zzz(i59);
                            iZzA2 = zzlm.zzB((String) object2);
                            iA += iZzA2 + iZzz11;
                        }
                    }
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iZzz4 = zznz.zzz(i24, unsafe.getObject(obj, j8), zznpVar.zzp(i16));
                        iA += iZzz4;
                    }
                    break;
                case 61:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj, j8);
                        iZzx = zzlm.zzz(i24 << 3);
                        iZzz9 = zzlhVar2.zzc();
                        iZzz10 = zzlm.zzz(iZzz9);
                        iA += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(zzE(obj, j8), zzlm.zzz(i24 << 3), iA);
                    }
                    break;
                case 63:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        long jZzE2 = zzE(obj, j8);
                        iZzz11 = zzlm.zzz(i24 << 3);
                        iZzA2 = zzlm.zzA(jZzE2);
                        iA += iZzA2 + iZzz11;
                    }
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(i24 << 3, 4, iA);
                    }
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iA = a.a(i24 << 3, 8, iA);
                    }
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        int iZzE = zzE(obj, j8);
                        iA = a.a((iZzE >> 31) ^ (iZzE + iZzE), zzlm.zzz(i24 << 3), iA);
                    }
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        long jZzF3 = zzF(obj, j8);
                        iZzz11 = zzlm.zzz(i24 << 3);
                        iZzA2 = zzlm.zzA((jZzF3 >> 63) ^ (jZzF3 + jZzF3));
                        iA += iZzA2 + iZzz11;
                    }
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i24, i16)) {
                        iZzG = zzlm.zzG(i24, (zznm) unsafe.getObject(obj, j8), zznpVar.zzp(i16));
                        iA += iZzG;
                    }
                    break;
            }
            i16 += 3;
            i15 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzf(Object obj, zzov zzovVar) {
        Map.Entry entry;
        int i14;
        zznp<T> zznpVar = this;
        if (zznpVar.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (zzlwVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzlwVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zznpVar.zzc;
        Unsafe unsafe = zzb;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (i17 < iArr.length) {
            int iZzx = zznpVar.zzx(i17);
            int iZzz = zzz(iZzx);
            int i19 = iArr[i17];
            if (iZzz <= 17) {
                int i24 = iArr[i17 + 2];
                int i25 = i24 & i15;
                if (i25 != i16) {
                    i18 = i25 == i15 ? 0 : unsafe.getInt(obj, i25);
                    i16 = i25;
                }
                i14 = 1 << (i24 >>> 20);
            } else {
                i14 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j8 = iZzx & i15;
            switch (iZzz) {
                case 0:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzf(i19, zzop.zzl(obj, j8));
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 1:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zze(i19, zzop.zzj(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzc(i19, unsafe.getLong(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzh(i19, unsafe.getLong(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzi(i19, unsafe.getInt(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzj(i19, unsafe.getLong(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzk(i19, unsafe.getInt(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzl(i19, zzop.zzh(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzP(i19, unsafe.getObject(obj, j8), zzovVar);
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzr(i19, unsafe.getObject(obj, j8), zznpVar.zzp(i17));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 10:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzn(i19, (zzlh) unsafe.getObject(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzo(i19, unsafe.getInt(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzg(i19, unsafe.getInt(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzb(i19, unsafe.getInt(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzd(i19, unsafe.getLong(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzp(i19, unsafe.getInt(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzq(i19, unsafe.getLong(obj, j8));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj, i17, i16, i18, i14)) {
                        zzovVar.zzs(i19, unsafe.getObject(obj, j8), zznpVar.zzp(i17));
                    } else {
                        continue;
                    }
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 18:
                    zznz.zza(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 19:
                    zznz.zzb(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 20:
                    zznz.zzc(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 21:
                    zznz.zzd(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 22:
                    zznz.zzh(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 23:
                    zznz.zzf(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 24:
                    zznz.zzk(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 25:
                    zznz.zzn(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 26:
                    int i26 = iArr[i17];
                    List list = (List) unsafe.getObject(obj, j8);
                    int i27 = zznz.zza;
                    if (list != null && !list.isEmpty()) {
                        zzovVar.zzF(i26, list);
                    }
                    break;
                case 27:
                    int i28 = iArr[i17];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    zznx zznxVarZzp = zznpVar.zzp(i17);
                    int i29 = zznz.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i30 = 0; i30 < list2.size(); i30++) {
                            ((zzln) zzovVar).zzr(i28, list2.get(i30), zznxVarZzp);
                        }
                    }
                    break;
                case 28:
                    int i34 = iArr[i17];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    int i35 = zznz.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzovVar.zzG(i34, list3);
                    }
                    break;
                case 29:
                    zznz.zzi(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 30:
                    zznz.zzm(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 31:
                    zznz.zzl(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 32:
                    zznz.zzg(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 33:
                    zznz.zzj(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 34:
                    zznz.zze(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, false);
                    continue;
                    i17 += 3;
                    i15 = 1048575;
                    zznpVar = this;
                    break;
                case 35:
                    zznz.zza(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 36:
                    zznz.zzb(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 37:
                    zznz.zzc(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 38:
                    zznz.zzd(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 39:
                    zznz.zzh(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 40:
                    zznz.zzf(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 41:
                    zznz.zzk(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 42:
                    zznz.zzn(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 43:
                    zznz.zzi(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 44:
                    zznz.zzm(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 45:
                    zznz.zzl(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 46:
                    zznz.zzg(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 47:
                    zznz.zzj(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 48:
                    zznz.zze(iArr[i17], (List) unsafe.getObject(obj, j8), zzovVar, true);
                    break;
                case 49:
                    int i36 = iArr[i17];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    zznx zznxVarZzp2 = zznpVar.zzp(i17);
                    int i37 = zznz.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i38 = 0; i38 < list4.size(); i38++) {
                            ((zzln) zzovVar).zzs(i36, list4.get(i38), zznxVarZzp2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j8);
                    if (object != null) {
                        zzovVar.zzM(i19, ((zznf) zznpVar.zzq(i17)).zze(), (zzng) object);
                    }
                    break;
                case 51:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzf(i19, zzC(obj, j8));
                    }
                    break;
                case 52:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zze(i19, zzD(obj, j8));
                    }
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzc(i19, zzF(obj, j8));
                    }
                    break;
                case 54:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzh(i19, zzF(obj, j8));
                    }
                    break;
                case 55:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzi(i19, zzE(obj, j8));
                    }
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzj(i19, zzF(obj, j8));
                    }
                    break;
                case 57:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzk(i19, zzE(obj, j8));
                    }
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzl(i19, zzG(obj, j8));
                    }
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzP(i19, unsafe.getObject(obj, j8), zzovVar);
                    }
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzr(i19, unsafe.getObject(obj, j8), zznpVar.zzp(i17));
                    }
                    break;
                case 61:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzn(i19, (zzlh) unsafe.getObject(obj, j8));
                    }
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzo(i19, zzE(obj, j8));
                    }
                    break;
                case 63:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzg(i19, zzE(obj, j8));
                    }
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzb(i19, zzE(obj, j8));
                    }
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzd(i19, zzF(obj, j8));
                    }
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzp(i19, zzE(obj, j8));
                    }
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzq(i19, zzF(obj, j8));
                    }
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i19, i17)) {
                        zzovVar.zzs(i19, unsafe.getObject(obj, j8), zznpVar.zzp(i17));
                    }
                    break;
            }
            i17 += 3;
            i15 = 1048575;
            zznpVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzmf) obj).zzc.zzg(zzovVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzh(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.zzkw r45) {
        /*
            Method dump skipped, instruction units count: 4006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i14, int i15, zzkw zzkwVar) {
        zzh(obj, bArr, i14, i15, 0, zzkwVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(Integer.MAX_VALUE);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i14 = 0; i14 < iArr.length; i14 += 3) {
                int iZzx = zzx(i14);
                int i15 = 1048575 & iZzx;
                int iZzz = zzz(iZzx);
                long j8 = i15;
                if (iZzz != 9) {
                    if (iZzz != 60 && iZzz != 68) {
                        switch (iZzz) {
                            case 17:
                                if (zzJ(obj, i14)) {
                                    zzp(i14).zzj(zzb.getObject(obj, j8));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzmo) zzop.zzn(obj, j8)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j8);
                                if (object != null) {
                                    ((zzng) object).zzd();
                                    unsafe.putObject(obj, j8, object);
                                }
                                break;
                        }
                    } else if (zzL(obj, iArr[i14], i14)) {
                        zzp(i14).zzj(zzb.getObject(obj, j8));
                    }
                } else if (zzJ(obj, i14)) {
                    zzp(i14).zzj(zzb.getObject(obj, j8));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i14;
        int i15;
        List list;
        zznx zznxVarZzp;
        int i16;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i18 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i24 = iArr[i18];
            int i25 = iArr2[i24];
            int iZzx = zzx(i24);
            int i26 = iArr2[i24 + 2];
            int i27 = i26 & 1048575;
            int i28 = 1 << (i26 >>> 20);
            if (i27 != i19) {
                if (i27 != 1048575) {
                    i17 = zzb.getInt(obj, i27);
                }
                i15 = i17;
                i14 = i27;
            } else {
                int i29 = i17;
                i14 = i19;
                i15 = i29;
            }
            if ((268435456 & iZzx) != 0 && !zzI(obj, i24, i14, i15, i28)) {
                return false;
            }
            int iZzz = zzz(iZzx);
            if (iZzz == 9 || iZzz == 17) {
                if (zzI(obj, i24, i14, i15, i28) && !zzw(obj, iZzx, zzp(i24))) {
                    return false;
                }
            } else if (iZzz == 27) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznxVarZzp = zzp(i24);
                    for (i16 = 0; i16 < list.size(); i16++) {
                        if (!zznxVarZzp.zzk(list.get(i16))) {
                            return false;
                        }
                    }
                }
            } else if (iZzz == 60 || iZzz == 68) {
                if (zzL(obj, i25, i24) && !zzw(obj, iZzx, zzp(i24))) {
                    return false;
                }
            } else if (iZzz == 49) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    zznxVarZzp = zzp(i24);
                    while (i16 < list.size()) {
                        if (!zznxVarZzp.zzk(list.get(i16))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzz != 50) {
                continue;
            } else {
                zzng zzngVar = (zzng) zzop.zzn(obj, iZzx & 1048575);
                if (!zzngVar.isEmpty() && ((zznf) zzq(i24)).zze().zzc.zza() == zzou.MESSAGE) {
                    zznx zznxVarZzb = null;
                    for (Object obj2 : zzngVar.values()) {
                        if (zznxVarZzb == null) {
                            zznxVarZzb = zznu.zza().zzb(obj2.getClass());
                        }
                        if (!zznxVarZzb.zzk(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i18++;
            i19 = i14;
            i17 = i15;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
