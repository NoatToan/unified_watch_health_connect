package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p6.b;
import sn.a;
import sun.misc.Unsafe;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i14, int i15, zzfm zzfmVar, boolean z14, int[] iArr2, int i16, int i17, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i14;
        this.zzf = i15;
        boolean z15 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z15 = true;
        }
        this.zzh = z15;
        this.zzi = iArr2;
        this.zzj = i16;
        this.zzk = i17;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (zzL(obj)) {
            return;
        }
        h.s("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzB(Object obj, Object obj2, int i14) {
        if (zzI(obj2, i14)) {
            int iZzs = zzs(i14) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzs;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                h.z(a.e(this.zzc[i14], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            zzge zzgeVarZzv = zzv(i14);
            if (!zzI(obj, i14)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j8, objZze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzD(obj, i14);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j8, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i14) {
        int i15 = this.zzc[i14];
        if (zzM(obj2, i15, i14)) {
            int iZzs = zzs(i14) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = iZzs;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                h.z(a.e(this.zzc[i14], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            zzge zzgeVarZzv = zzv(i14);
            if (!zzM(obj, i15, i14)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j8, objZze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzE(obj, i15, i14);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j8, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i14) {
        int iZzp = zzp(i14);
        long j8 = 1048575 & iZzp;
        if (j8 == 1048575) {
            return;
        }
        zzgz.zzq(obj, j8, (1 << (iZzp >>> 20)) | zzgz.zzc(obj, j8));
    }

    private final void zzE(Object obj, int i14, int i15) {
        zzgz.zzq(obj, zzp(i15) & 1048575, i14);
    }

    private final void zzF(Object obj, int i14, Object obj2) {
        zzb.putObject(obj, zzs(i14) & 1048575, obj2);
        zzD(obj, i14);
    }

    private final void zzG(Object obj, int i14, int i15, Object obj2) {
        zzb.putObject(obj, zzs(i15) & 1048575, obj2);
        zzE(obj, i14, i15);
    }

    private final boolean zzH(Object obj, Object obj2, int i14) {
        return zzI(obj, i14) == zzI(obj2, i14);
    }

    private final boolean zzI(Object obj, int i14) {
        int iZzp = zzp(i14);
        long j8 = iZzp & 1048575;
        if (j8 != 1048575) {
            return (zzgz.zzc(obj, j8) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i14);
        long j14 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j14)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j14)) != 0;
            case 2:
                return zzgz.zzd(obj, j14) != 0;
            case 3:
                return zzgz.zzd(obj, j14) != 0;
            case 4:
                return zzgz.zzc(obj, j14) != 0;
            case 5:
                return zzgz.zzd(obj, j14) != 0;
            case 6:
                return zzgz.zzc(obj, j14) != 0;
            case 7:
                return zzgz.zzw(obj, j14);
            case 8:
                Object objZzf = zzgz.zzf(obj, j14);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzdf) {
                    return !zzdf.zzb.equals(objZzf);
                }
                h.w();
                return false;
            case 9:
                return zzgz.zzf(obj, j14) != null;
            case 10:
                return !zzdf.zzb.equals(zzgz.zzf(obj, j14));
            case 11:
                return zzgz.zzc(obj, j14) != 0;
            case 12:
                return zzgz.zzc(obj, j14) != 0;
            case 13:
                return zzgz.zzc(obj, j14) != 0;
            case 14:
                return zzgz.zzd(obj, j14) != 0;
            case 15:
                return zzgz.zzc(obj, j14) != 0;
            case 16:
                return zzgz.zzd(obj, j14) != 0;
            case 17:
                return zzgz.zzf(obj, j14) != null;
            default:
                h.w();
                return false;
        }
    }

    private final boolean zzJ(Object obj, int i14, int i15, int i16, int i17) {
        if (i15 == 1048575) {
            return zzI(obj, i14);
        }
        return (i16 & i17) != 0;
    }

    private static boolean zzK(Object obj, int i14, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, i14 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i14, int i15) {
        return zzgz.zzc(obj, (long) (zzp(i15) & 1048575)) == i14;
    }

    private static boolean zzN(Object obj, long j8) {
        return ((Boolean) zzgz.zzf(obj, j8)).booleanValue();
    }

    private static final void zzO(int i14, Object obj, zzhh zzhhVar) {
        if (obj instanceof String) {
            zzhhVar.zzG(i14, (String) obj);
        } else {
            zzhhVar.zzd(i14, (zzdf) obj);
        }
    }

    public static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zzc()) {
            return zzgtVar;
        }
        zzgt zzgtVarZzf = zzgt.zzf();
        zzehVar.zzc = zzgtVarZzf;
        return zzgtVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ad  */
    public static zzfp zzl(Class cls, zzfj zzfjVar, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
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
        Field fieldZzz;
        char cCharAt9;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        Object obj;
        Field fieldZzz2;
        int i55;
        Object obj2;
        Field fieldZzz3;
        int i56;
        char cCharAt10;
        int i57;
        char cCharAt11;
        int i58;
        char cCharAt12;
        int i59;
        char cCharAt13;
        if (!(zzfjVar instanceof zzfw)) {
            throw null;
        }
        zzfw zzfwVar = (zzfw) zzfjVar;
        String strZzd = zzfwVar.zzd();
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
        Object[] objArrZze = zzfwVar.zze();
        Class<?> cls2 = zzfwVar.zza().getClass();
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
            zzfw zzfwVar2 = zzfwVar;
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
                    } else if (zzfwVar2.zzc() == 1 || i120 != 0) {
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
                        fieldZzz2 = (Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i54] = fieldZzz2;
                    }
                    int i130 = i24;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i55 = i54 + 1;
                    obj2 = objArrZze[i55];
                    i38 = i130;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = (Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i55] = fieldZzz3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
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
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i54] = fieldZzz2;
                }
                int i131 = i24;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                i55 = i54 + 1;
                obj2 = objArrZze[i55];
                i38 = i131;
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i55] = fieldZzz3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                strZzd = strZzd;
                i44 = i1210;
                i37 = i125;
                i39 = 0;
                c14 = 55296;
            } else {
                i38 = i24;
                int i132 = i19 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i19]);
                if (i119 == 9 || i119 == 17) {
                    int i133 = i110 / 3;
                    objArr[i133 + i133 + 1] = fieldZzz4.getType();
                } else {
                    if (i119 != 27) {
                        if (i119 == 49) {
                            i19 += 2;
                            i46 = 1;
                        } else if (i119 == 12 || i119 == 30 || i119 == 44) {
                            if (zzfwVar2.zzc() == 1 || i120 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i142] = fieldZzz;
                            }
                            i39 = iCharAt13 % 32;
                            i37 = i45;
                            c14 = 55296;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
            zzfwVar = zzfwVar2;
            length = length;
            i24 = i38;
        }
        return new zzfp(iArr3, objArr, i15, i17, zzfwVar.zza(), false, iArr, i18, i105, zzfsVar, zzezVar, zzgsVar, zzdtVar, zzfhVar);
    }

    private static double zzm(Object obj, long j8) {
        return ((Double) zzgz.zzf(obj, j8)).doubleValue();
    }

    private static float zzn(Object obj, long j8) {
        return ((Float) zzgz.zzf(obj, j8)).floatValue();
    }

    private static int zzo(Object obj, long j8) {
        return ((Integer) zzgz.zzf(obj, j8)).intValue();
    }

    private final int zzp(int i14) {
        return this.zzc[i14 + 2];
    }

    private final int zzq(int i14, int i15) {
        int length = (this.zzc.length / 3) - 1;
        while (i15 <= length) {
            int i16 = (length + i15) >>> 1;
            int i17 = i16 * 3;
            int i18 = this.zzc[i17];
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

    private static int zzr(int i14) {
        return (i14 >>> 20) & 255;
    }

    private final int zzs(int i14) {
        return this.zzc[i14 + 1];
    }

    private static long zzt(Object obj, long j8) {
        return ((Long) zzgz.zzf(obj, j8)).longValue();
    }

    private final zzel zzu(int i14) {
        int i15 = i14 / 3;
        return (zzel) this.zzd[i15 + i15 + 1];
    }

    private final zzge zzv(int i14) {
        Object[] objArr = this.zzd;
        int i15 = i14 / 3;
        int i16 = i15 + i15;
        zzge zzgeVar = (zzge) objArr[i16];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzgeVarZzb = zzfu.zza().zzb((Class) objArr[i16 + 1]);
        this.zzd[i16] = zzgeVarZzb;
        return zzgeVarZzb;
    }

    private final Object zzw(int i14) {
        int i15 = i14 / 3;
        return this.zzd[i15 + i15];
    }

    private final Object zzx(Object obj, int i14) {
        zzge zzgeVarZzv = zzv(i14);
        int iZzs = zzs(i14) & 1048575;
        if (!zzI(obj, i14)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i14, int i15) {
        zzge zzgeVarZzv = zzv(i15);
        if (!zzM(obj, i14, i15)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i15) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbI = b.i("Field ", str, " for ", name, " not found. Known fields are ");
            sbI.append(string);
            throw new RuntimeException(sbI.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x03df  */
    /* JADX WARN: Code duplicated, block: B:206:0x0522  */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int i14;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzd;
        int iZzA3;
        int iZzh;
        int iZzA4;
        int size;
        int iZzl;
        int iZzA5;
        int iZzd2;
        boolean z14;
        int iZzb;
        int iZzz;
        int iZzA6;
        int iZzA7;
        int size2;
        int iZzk;
        int iZzA8;
        int size3;
        int iZzi;
        int iZzA9;
        int i15;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        zzfp<T> zzfpVar = this;
        Unsafe unsafe = zzb;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        int iM = 0;
        while (i18 < zzfpVar.zzc.length) {
            int iZzs = zzfpVar.zzs(i18);
            int iZzr = zzr(iZzs);
            int[] iArr = zzfpVar.zzc;
            int i24 = iArr[i18];
            int i25 = iArr[i18 + 2];
            int i26 = i25 & i16;
            if (iZzr <= 17) {
                if (i26 != i17) {
                    i19 = i26 == i16 ? 0 : unsafe.getInt(obj, i26);
                    i17 = i26;
                }
                i14 = 1 << (i25 >>> 20);
            } else {
                i14 = 0;
            }
            int i27 = iZzs & i16;
            if (iZzr >= zzdy.zzJ.zza()) {
                zzdy.zzW.zza();
            }
            long j8 = i27;
            switch (iZzr) {
                case 0:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 8, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 1:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 4, iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 2:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        long j14 = unsafe.getLong(obj, j8);
                        iZzA = zzdn.zzA(i24 << 3);
                        iZzB = zzdn.zzB(j14);
                        iM += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 3:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        long j15 = unsafe.getLong(obj, j8);
                        iZzA = zzdn.zzA(i24 << 3);
                        iZzB = zzdn.zzB(j15);
                        iM += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 4:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        long j16 = unsafe.getInt(obj, j8);
                        iZzA = zzdn.zzA(i24 << 3);
                        iZzB = zzdn.zzB(j16);
                        iM += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 5:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 8, iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 6:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 4, iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 7:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 1, iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 8:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        int i28 = i24 << 3;
                        Object object = unsafe.getObject(obj, j8);
                        if (object instanceof zzdf) {
                            iZzA2 = zzdn.zzA(i28);
                            iZzd = ((zzdf) object).zzd();
                            iZzA3 = zzdn.zzA(iZzd);
                            iM += iZzA3 + iZzd + iZzA2;
                        } else {
                            iZzA = zzdn.zzA(i28);
                            iZzB = zzdn.zzz((String) object);
                            iM += iZzB + iZzA;
                        }
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 9:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iZzh = zzgg.zzh(i24, unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                        iM += iZzh;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 10:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        zzdf zzdfVar = (zzdf) unsafe.getObject(obj, j8);
                        iZzA2 = zzdn.zzA(i24 << 3);
                        iZzd = zzdfVar.zzd();
                        iZzA3 = zzdn.zzA(iZzd);
                        iM += iZzA3 + iZzd + iZzA2;
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 11:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(unsafe.getInt(obj, j8), zzdn.zzA(i24 << 3), iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 12:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        long j17 = unsafe.getInt(obj, j8);
                        iZzA = zzdn.zzA(i24 << 3);
                        iZzB = zzdn.zzB(j17);
                        iM += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 13:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 4, iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 14:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 8, iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 15:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        int i29 = unsafe.getInt(obj, j8);
                        iM = com.google.android.gms.internal.measurement.a.m((i29 >> 31) ^ (i29 + i29), zzdn.zzA(i24 << 3), iM);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 16:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        long j18 = unsafe.getLong(obj, j8);
                        iZzA = zzdn.zzA(i24 << 3);
                        iZzB = zzdn.zzB((j18 >> 63) ^ (j18 + j18));
                        iM += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 17:
                    if (zzfpVar.zzJ(obj, i18, i17, i19, i14)) {
                        iM += zzdn.zzw(i24, (zzfm) unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 18:
                    iZzh = zzgg.zzd(i24, (List) unsafe.getObject(obj, j8), false);
                    iM += iZzh;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 19:
                    iZzh = zzgg.zzb(i24, (List) unsafe.getObject(obj, j8), false);
                    iM += iZzh;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j8);
                    int i30 = zzgg.zza;
                    if (list.size() == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = (zzdn.zzA(i24 << 3) * list.size()) + zzgg.zzg(list);
                    }
                    iM += iZzA4;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j8);
                    int i34 = zzgg.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzl = zzgg.zzl(list2);
                        iZzA5 = zzdn.zzA(i24 << 3);
                        iZzA4 = (iZzA5 * size) + iZzl;
                    }
                    iM += iZzA4;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j8);
                    int i35 = zzgg.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzl = zzgg.zzf(list3);
                        iZzA5 = zzdn.zzA(i24 << 3);
                        iZzA4 = (iZzA5 * size) + iZzl;
                    }
                    iM += iZzA4;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 23:
                    iZzd2 = zzgg.zzd(i24, (List) unsafe.getObject(obj, j8), false);
                    iM += iZzd2;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 24:
                    z14 = false;
                    iZzb = zzgg.zzb(i24, (List) unsafe.getObject(obj, j8), false);
                    iM += iZzb;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j8);
                    int i36 = zzgg.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzd2 = size4 * (zzdn.zzA(i24 << 3) + 1);
                    }
                    iM += iZzd2;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j8);
                    int i37 = zzgg.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzz = 0;
                    } else {
                        int iZzA13 = zzdn.zzA(i24 << 3) * size5;
                        if (list5 instanceof zzey) {
                            zzey zzeyVar = (zzey) list5;
                            iZzz = iZzA13;
                            for (int i38 = 0; i38 < size5; i38++) {
                                Object objZza = zzeyVar.zza();
                                if (objZza instanceof zzdf) {
                                    int iZzd3 = ((zzdf) objZza).zzd();
                                    iZzz = com.google.android.gms.internal.measurement.a.m(iZzd3, iZzd3, iZzz);
                                } else {
                                    iZzz = zzdn.zzz((String) objZza) + iZzz;
                                }
                            }
                        } else {
                            iZzz = iZzA13;
                            for (int i39 = 0; i39 < size5; i39++) {
                                Object obj2 = list5.get(i39);
                                if (obj2 instanceof zzdf) {
                                    int iZzd4 = ((zzdf) obj2).zzd();
                                    iZzz = com.google.android.gms.internal.measurement.a.m(iZzd4, iZzd4, iZzz);
                                } else {
                                    iZzz = zzdn.zzz((String) obj2) + iZzz;
                                }
                            }
                        }
                    }
                    iM += iZzz;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j8);
                    zzge zzgeVarZzv = zzfpVar.zzv(i18);
                    int i44 = zzgg.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzdn.zzA(i24 << 3) * size6;
                        for (int i45 = 0; i45 < size6; i45++) {
                            Object obj3 = list6.get(i45);
                            if (obj3 instanceof zzex) {
                                int iZza = ((zzex) obj3).zza();
                                iZzA6 = com.google.android.gms.internal.measurement.a.m(iZza, iZza, iZzA6);
                            } else {
                                iZzA6 = zzdn.zzy((zzfm) obj3, zzgeVarZzv) + iZzA6;
                            }
                        }
                    }
                    iM += iZzA6;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j8);
                    int i46 = zzgg.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzdn.zzA(i24 << 3) * size7;
                        for (int i47 = 0; i47 < list7.size(); i47++) {
                            int iZzd5 = ((zzdf) list7.get(i47)).zzd();
                            iZzA7 = com.google.android.gms.internal.measurement.a.m(iZzd5, iZzd5, iZzA7);
                        }
                    }
                    iM += iZzA7;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j8);
                    int i48 = zzgg.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzgg.zzk(list8);
                        iZzA8 = zzdn.zzA(i24 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                    }
                    iM += iZzd2;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j8);
                    int i49 = zzgg.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzgg.zza(list9);
                        iZzA8 = zzdn.zzA(i24 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                    }
                    iM += iZzd2;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 31:
                    iZzd2 = zzgg.zzb(i24, (List) unsafe.getObject(obj, j8), false);
                    iM += iZzd2;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 32:
                    z14 = false;
                    iZzb = zzgg.zzd(i24, (List) unsafe.getObject(obj, j8), false);
                    iM += iZzb;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j8);
                    int i54 = zzgg.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        i15 = 0;
                    } else {
                        iZzi = zzgg.zzi(list10);
                        iZzA9 = zzdn.zzA(i24 << 3);
                        i15 = (iZzA9 * size3) + iZzi;
                    }
                    iM += i15;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j8);
                    int i55 = zzgg.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        i15 = 0;
                    } else {
                        iZzi = zzgg.zzj(list11);
                        iZzA9 = zzdn.zzA(i24 << 3);
                        i15 = (iZzA9 * size3) + iZzi;
                    }
                    iM += i15;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 35:
                    iZze = zzgg.zze((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 36:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 37:
                    iZze = zzgg.zzg((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 38:
                    iZze = zzgg.zzl((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 39:
                    iZze = zzgg.zzf((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 40:
                    iZze = zzgg.zze((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 41:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j8);
                    int i56 = zzgg.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 43:
                    iZze = zzgg.zzk((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 44:
                    iZze = zzgg.zza((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 45:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 46:
                    iZze = zzgg.zze((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 47:
                    iZze = zzgg.zzi((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 48:
                    iZze = zzgg.zzj((List) unsafe.getObject(obj, j8));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i24 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j8);
                    zzge zzgeVarZzv2 = zzfpVar.zzv(i18);
                    int i57 = zzgg.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i15 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i58 = 0; i58 < size8; i58++) {
                            iZzw += zzdn.zzw(i24, (zzfm) list13.get(i58), zzgeVarZzv2);
                        }
                        i15 = iZzw;
                    }
                    iM += i15;
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 50:
                    zzfg zzfgVar = (zzfg) unsafe.getObject(obj, j8);
                    if (!zzfgVar.isEmpty()) {
                        Iterator it = zzfgVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 51:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 8, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 52:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 4, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 53:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        long jZzt = zzt(obj, j8);
                        iZzA12 = zzdn.zzA(i24 << 3);
                        iZzB2 = zzdn.zzB(jZzt);
                        iM += iZzB2 + iZzA12;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 54:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        long jZzt2 = zzt(obj, j8);
                        iZzA12 = zzdn.zzA(i24 << 3);
                        iZzB2 = zzdn.zzB(jZzt2);
                        iM += iZzB2 + iZzA12;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 55:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        long jZzo = zzo(obj, j8);
                        iZzA12 = zzdn.zzA(i24 << 3);
                        iZzB2 = zzdn.zzB(jZzo);
                        iM += iZzB2 + iZzA12;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 56:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 8, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 57:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 4, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 58:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 1, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 59:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        int i59 = i24 << 3;
                        Object object2 = unsafe.getObject(obj, j8);
                        if (object2 instanceof zzdf) {
                            iZze = zzdn.zzA(i59);
                            iZzA10 = ((zzdf) object2).zzd();
                            iZzA11 = zzdn.zzA(iZzA10);
                            iM += iZzA11 + iZzA10 + iZze;
                        } else {
                            iZzA12 = zzdn.zzA(i59);
                            iZzB2 = zzdn.zzz((String) object2);
                            iM += iZzB2 + iZzA12;
                        }
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 60:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iZzd2 = zzgg.zzh(i24, unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                        iM += iZzd2;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 61:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        zzdf zzdfVar2 = (zzdf) unsafe.getObject(obj, j8);
                        iZze = zzdn.zzA(i24 << 3);
                        iZzA10 = zzdfVar2.zzd();
                        iZzA11 = zzdn.zzA(iZzA10);
                        iM += iZzA11 + iZzA10 + iZze;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 62:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(zzo(obj, j8), zzdn.zzA(i24 << 3), iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 63:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        long jZzo2 = zzo(obj, j8);
                        iZzA12 = zzdn.zzA(i24 << 3);
                        iZzB2 = zzdn.zzB(jZzo2);
                        iM += iZzB2 + iZzA12;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 64:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 4, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 65:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM = com.google.android.gms.internal.measurement.a.m(i24 << 3, 8, iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 66:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        int iZzo = zzo(obj, j8);
                        iM = com.google.android.gms.internal.measurement.a.m((iZzo >> 31) ^ (iZzo + iZzo), zzdn.zzA(i24 << 3), iM);
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 67:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        long jZzt3 = zzt(obj, j8);
                        iZzA12 = zzdn.zzA(i24 << 3);
                        iZzB2 = zzdn.zzB((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iM += iZzB2 + iZzA12;
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                case 68:
                    if (zzfpVar.zzM(obj, i24, i18)) {
                        iM += zzdn.zzw(i24, (zzfm) unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                    }
                    i18 += 3;
                    i16 = 1048575;
                    break;
                default:
                    i18 += 3;
                    i16 = 1048575;
                    break;
            }
        }
        int iZza2 = 0;
        int iZza3 = ((zzeh) obj).zzc.zza() + iM;
        if (!zzfpVar.zzh) {
            return iZza3;
        }
        zzdx zzdxVar = ((zzed) obj).zzb;
        int iZzc = zzdxVar.zza.zzc();
        int i64 = 0;
        while (true) {
            zzgo zzgoVar = zzdxVar.zza;
            if (i64 >= iZzc) {
                for (Map.Entry entry2 : zzgoVar.zzd()) {
                    iZza2 += zzdx.zza((zzdw) entry2.getKey(), entry2.getValue());
                }
                return iZza3 + iZza2;
            }
            Map.Entry entryZzg = zzgoVar.zzg(i64);
            iZza2 += zzdx.zza((zzdw) ((zzgi) entryZzg).zza(), entryZzg.getValue());
            i64++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int i14;
        long jDoubleToLongBits;
        int i15;
        int iFloatToIntBits;
        int iZzc;
        int i16;
        int i17 = 0;
        for (int i18 = 0; i18 < this.zzc.length; i18 += 3) {
            int iZzs = zzs(i18);
            int[] iArr = this.zzc;
            int i19 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i24 = iArr[i18];
            long j8 = i19;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i14 = i17 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzgz.zza(obj, j8));
                    byte[] bArr = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i14 + iZzc;
                    break;
                case 1:
                    i15 = i17 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzgz.zzb(obj, j8));
                    i17 = iFloatToIntBits + i15;
                    break;
                case 2:
                    i14 = i17 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j8);
                    byte[] bArr2 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i14 + iZzc;
                    break;
                case 3:
                    i14 = i17 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j8);
                    byte[] bArr3 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i14 + iZzc;
                    break;
                case 4:
                    i14 = i17 * 53;
                    iZzc = zzgz.zzc(obj, j8);
                    i17 = i14 + iZzc;
                    break;
                case 5:
                    i14 = i17 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j8);
                    byte[] bArr4 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i14 + iZzc;
                    break;
                case 6:
                    i14 = i17 * 53;
                    iZzc = zzgz.zzc(obj, j8);
                    i17 = i14 + iZzc;
                    break;
                case 7:
                    i15 = i17 * 53;
                    iFloatToIntBits = zzep.zza(zzgz.zzw(obj, j8));
                    i17 = iFloatToIntBits + i15;
                    break;
                case 8:
                    i15 = i17 * 53;
                    iFloatToIntBits = ((String) zzgz.zzf(obj, j8)).hashCode();
                    i17 = iFloatToIntBits + i15;
                    break;
                case 9:
                    i16 = i17 * 53;
                    Object objZzf = zzgz.zzf(obj, j8);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i17 = i16 + iHashCode;
                    break;
                case 10:
                    i15 = i17 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j8).hashCode();
                    i17 = iFloatToIntBits + i15;
                    break;
                case 11:
                    i14 = i17 * 53;
                    iZzc = zzgz.zzc(obj, j8);
                    i17 = i14 + iZzc;
                    break;
                case 12:
                    i14 = i17 * 53;
                    iZzc = zzgz.zzc(obj, j8);
                    i17 = i14 + iZzc;
                    break;
                case 13:
                    i14 = i17 * 53;
                    iZzc = zzgz.zzc(obj, j8);
                    i17 = i14 + iZzc;
                    break;
                case 14:
                    i14 = i17 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j8);
                    byte[] bArr5 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i14 + iZzc;
                    break;
                case 15:
                    i14 = i17 * 53;
                    iZzc = zzgz.zzc(obj, j8);
                    i17 = i14 + iZzc;
                    break;
                case 16:
                    i14 = i17 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j8);
                    byte[] bArr6 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i17 = i14 + iZzc;
                    break;
                case 17:
                    i16 = i17 * 53;
                    Object objZzf2 = zzgz.zzf(obj, j8);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i17 = i16 + iHashCode;
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
                    i15 = i17 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j8).hashCode();
                    i17 = iFloatToIntBits + i15;
                    break;
                case 50:
                    i15 = i17 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j8).hashCode();
                    i17 = iFloatToIntBits + i15;
                    break;
                case 51:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j8));
                        byte[] bArr7 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i14 + iZzc;
                    }
                    break;
                case 52:
                    if (zzM(obj, i24, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j8));
                        i17 = iFloatToIntBits + i15;
                    }
                    break;
                case 53:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        jDoubleToLongBits = zzt(obj, j8);
                        byte[] bArr8 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i14 + iZzc;
                    }
                    break;
                case 54:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        jDoubleToLongBits = zzt(obj, j8);
                        byte[] bArr9 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i14 + iZzc;
                    }
                    break;
                case 55:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        iZzc = zzo(obj, j8);
                        i17 = i14 + iZzc;
                    }
                    break;
                case 56:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        jDoubleToLongBits = zzt(obj, j8);
                        byte[] bArr10 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i14 + iZzc;
                    }
                    break;
                case 57:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        iZzc = zzo(obj, j8);
                        i17 = i14 + iZzc;
                    }
                    break;
                case 58:
                    if (zzM(obj, i24, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = zzep.zza(zzN(obj, j8));
                        i17 = iFloatToIntBits + i15;
                    }
                    break;
                case 59:
                    if (zzM(obj, i24, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = ((String) zzgz.zzf(obj, j8)).hashCode();
                        i17 = iFloatToIntBits + i15;
                    }
                    break;
                case 60:
                    if (zzM(obj, i24, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j8).hashCode();
                        i17 = iFloatToIntBits + i15;
                    }
                    break;
                case 61:
                    if (zzM(obj, i24, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j8).hashCode();
                        i17 = iFloatToIntBits + i15;
                    }
                    break;
                case 62:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        iZzc = zzo(obj, j8);
                        i17 = i14 + iZzc;
                    }
                    break;
                case 63:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        iZzc = zzo(obj, j8);
                        i17 = i14 + iZzc;
                    }
                    break;
                case 64:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        iZzc = zzo(obj, j8);
                        i17 = i14 + iZzc;
                    }
                    break;
                case 65:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        jDoubleToLongBits = zzt(obj, j8);
                        byte[] bArr11 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i14 + iZzc;
                    }
                    break;
                case 66:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        iZzc = zzo(obj, j8);
                        i17 = i14 + iZzc;
                    }
                    break;
                case 67:
                    if (zzM(obj, i24, i18)) {
                        i14 = i17 * 53;
                        jDoubleToLongBits = zzt(obj, j8);
                        byte[] bArr12 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i17 = i14 + iZzc;
                    }
                    break;
                case 68:
                    if (zzM(obj, i24, i18)) {
                        i15 = i17 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j8).hashCode();
                        i17 = iFloatToIntBits + i15;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzeh) obj).zzc.hashCode() + (i17 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzed) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02da  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:127:0x0350  */
    /* JADX WARN: Code duplicated, block: B:140:0x0395  */
    /* JADX WARN: Code duplicated, block: B:141:0x0398  */
    /* JADX WARN: Code duplicated, block: B:171:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:174:0x04de  */
    /* JADX WARN: Code duplicated, block: B:179:0x051c  */
    /* JADX WARN: Code duplicated, block: B:183:0x053a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0543  */
    /* JADX WARN: Code duplicated, block: B:190:0x0553  */
    /* JADX WARN: Code duplicated, block: B:192:0x0556  */
    /* JADX WARN: Code duplicated, block: B:194:0x0573  */
    /* JADX WARN: Code duplicated, block: B:196:0x057d A[LOOP:1: B:193:0x0571->B:196:0x057d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:202:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:204:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:206:0x05ca A[LOOP:3: B:205:0x05c8->B:206:0x05ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:215:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:217:0x0604  */
    /* JADX WARN: Code duplicated, block: B:219:0x060c A[LOOP:4: B:216:0x0602->B:219:0x060c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x0627  */
    /* JADX WARN: Code duplicated, block: B:225:0x0635  */
    /* JADX WARN: Code duplicated, block: B:227:0x0640 A[LOOP:5: B:226:0x063e->B:227:0x0640, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x0657 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0659  */
    /* JADX WARN: Code duplicated, block: B:235:0x066a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0672 A[LOOP:6: B:234:0x0668->B:237:0x0672, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:238:0x0680  */
    /* JADX WARN: Code duplicated, block: B:240:0x068e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0696 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x0698  */
    /* JADX WARN: Code duplicated, block: B:245:0x06ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:248:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:250:0x06ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:253:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:257:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:258:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:261:0x0703  */
    /* JADX WARN: Code duplicated, block: B:264:0x071b  */
    /* JADX WARN: Code duplicated, block: B:267:0x072b  */
    /* JADX WARN: Code duplicated, block: B:268:0x0735  */
    /* JADX WARN: Code duplicated, block: B:270:0x0745  */
    /* JADX WARN: Code duplicated, block: B:272:0x074d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0751 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x0753  */
    /* JADX WARN: Code duplicated, block: B:276:0x0759  */
    /* JADX WARN: Code duplicated, block: B:279:0x0763  */
    /* JADX WARN: Code duplicated, block: B:281:0x076b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0773  */
    /* JADX WARN: Code duplicated, block: B:285:0x0777 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:297:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:299:0x07af  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:301:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:304:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:305:0x07df  */
    /* JADX WARN: Code duplicated, block: B:307:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:309:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:311:0x0800 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:312:0x0802  */
    /* JADX WARN: Code duplicated, block: B:313:0x0806  */
    /* JADX WARN: Code duplicated, block: B:316:0x0813  */
    /* JADX WARN: Code duplicated, block: B:318:0x081b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0823 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:329:0x0844  */
    /* JADX WARN: Code duplicated, block: B:331:0x084c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x084e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0852  */
    /* JADX WARN: Code duplicated, block: B:335:0x085a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0867  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:340:0x086f  */
    /* JADX WARN: Code duplicated, block: B:342:0x0877 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:346:0x0885  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:356:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:358:0x08be  */
    /* JADX WARN: Code duplicated, block: B:360:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:362:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:363:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:369:0x08e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:370:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:372:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:373:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:376:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:378:0x0904  */
    /* JADX WARN: Code duplicated, block: B:380:0x090e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0910  */
    /* JADX WARN: Code duplicated, block: B:383:0x0915  */
    /* JADX WARN: Code duplicated, block: B:385:0x0925  */
    /* JADX WARN: Code duplicated, block: B:387:0x0931 A[LOOP:14: B:386:0x092f->B:387:0x0931, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:392:0x0945  */
    /* JADX WARN: Code duplicated, block: B:394:0x0948  */
    /* JADX WARN: Code duplicated, block: B:396:0x0956  */
    /* JADX WARN: Code duplicated, block: B:398:0x095e A[LOOP:15: B:395:0x0954->B:398:0x095e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:399:0x0968  */
    /* JADX WARN: Code duplicated, block: B:401:0x0978  */
    /* JADX WARN: Code duplicated, block: B:403:0x0984 A[LOOP:16: B:402:0x0982->B:403:0x0984, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:408:0x0998  */
    /* JADX WARN: Code duplicated, block: B:410:0x099b  */
    /* JADX WARN: Code duplicated, block: B:412:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:414:0x09b1 A[LOOP:17: B:411:0x09a7->B:414:0x09b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:415:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:417:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:418:0x09d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:419:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:420:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:422:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:424:0x09fe A[LOOP:18: B:423:0x09fc->B:424:0x09fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:430:0x0a1a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:431:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:433:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:435:0x0a32 A[LOOP:19: B:432:0x0a28->B:435:0x0a32, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:436:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:438:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a5c A[LOOP:20: B:439:0x0a5a->B:440:0x0a5c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:445:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:451:0x0a90 A[LOOP:21: B:448:0x0a86->B:451:0x0a90, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:453:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:455:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:457:0x0ac1 A[LOOP:22: B:456:0x0abf->B:457:0x0ac1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:462:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:464:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:466:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:468:0x0af6 A[LOOP:23: B:465:0x0aec->B:468:0x0af6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:469:0x0b04 A[PHI: r2 r3 r4 r7 r9 r10 r14 r19 r30
      0x0b04: PHI (r2v141 byte[]) = (r2v114 byte[]), (r2v116 byte[]), (r2v117 byte[]), (r2v122 byte[]), (r2v130 byte[]), (r2v135 byte[]), (r2v146 byte[]) binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r3v145 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu) = 
      (r3v110 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r3v112 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r3v113 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r3v115 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r3v119 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r3v136 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r3v150 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
     binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r4v109 int) = (r4v74 int), (r4v76 int), (r4v77 int), (r4v91 int), (r4v97 int), (r4v103 int), (r4v114 int) binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r7v123 int) = (r7v96 int), (r7v98 int), (r7v99 int), (r7v101 int), (r7v110 int), (r7v122 int), (r7v128 int) binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r9v101 int) = (r9v67 int), (r9v69 int), (r9v70 int), (r9v76 int), (r9v82 int), (r7v58 int), (r9v105 int) binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r10v37 int) = (r10v7 int), (r10v9 int), (r10v10 int), (r10v15 int), (r10v21 int), (r10v34 int), (r10v40 int) binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r14v75 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>) = 
      (r14v47 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r14v49 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r14v50 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r14v55 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r35v0 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T> A[IMMUTABLE_TYPE, THIS])
      (r14v72 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
      (r14v79 'this' com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
     binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r19v68 sun.misc.Unsafe) = 
      (r19v43 sun.misc.Unsafe)
      (r19v45 sun.misc.Unsafe)
      (r19v46 sun.misc.Unsafe)
      (r19v51 sun.misc.Unsafe)
      (r19v57 sun.misc.Unsafe)
      (r19v62 sun.misc.Unsafe)
      (r19v71 sun.misc.Unsafe)
     binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x0b04: PHI (r30v40 int) = (r30v15 int), (r30v17 int), (r30v18 int), (r30v23 int), (r30v29 int), (r14v1 int), (r30v43 int) binds: [B:463:0x0ada, B:446:0x0a74, B:430:0x0a1a, B:355:0x08a8, B:298:0x07ab, B:222:0x0623, B:201:0x05a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:479:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:483:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:485:0x0b75 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:486:0x0b83  */
    /* JADX WARN: Code duplicated, block: B:488:0x0b86  */
    /* JADX WARN: Code duplicated, block: B:490:0x0baf  */
    /* JADX WARN: Code duplicated, block: B:492:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:494:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:496:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:498:0x0bea  */
    /* JADX WARN: Code duplicated, block: B:500:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:502:0x0c11  */
    /* JADX WARN: Code duplicated, block: B:506:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:510:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:512:0x0c4e  */
    /* JADX WARN: Code duplicated, block: B:513:0x0c5b  */
    /* JADX WARN: Code duplicated, block: B:514:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:516:0x0c69  */
    /* JADX WARN: Code duplicated, block: B:517:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:518:0x0c92  */
    /* JADX WARN: Code duplicated, block: B:520:0x0ca2  */
    /* JADX WARN: Code duplicated, block: B:522:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:523:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:532:0x0cdb  */
    /* JADX WARN: Code duplicated, block: B:533:0x0cdf  */
    /* JADX WARN: Code duplicated, block: B:535:0x0ced  */
    /* JADX WARN: Code duplicated, block: B:537:0x0cf7  */
    /* JADX WARN: Code duplicated, block: B:538:0x0cfa  */
    /* JADX WARN: Code duplicated, block: B:541:0x0d09  */
    /* JADX WARN: Code duplicated, block: B:543:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:544:0x0d29  */
    /* JADX WARN: Code duplicated, block: B:546:0x0d38  */
    /* JADX WARN: Code duplicated, block: B:547:0x0d49  */
    /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
    /* JADX WARN: Code duplicated, block: B:550:0x0d68  */
    /* JADX WARN: Code duplicated, block: B:552:0x0d76  */
    /* JADX WARN: Code duplicated, block: B:553:0x0d88  */
    /* JADX WARN: Code duplicated, block: B:555:0x0d97  */
    /* JADX WARN: Code duplicated, block: B:556:0x0dad  */
    /* JADX WARN: Code duplicated, block: B:558:0x0dbc  */
    /* JADX WARN: Code duplicated, block: B:559:0x0dd2 A[PHI: r7 r11 r12 r13 r19 r22
      0x0dd2: PHI (r7v93 byte[]) = 
      (r7v61 byte[])
      (r7v63 byte[])
      (r7v65 byte[])
      (r7v67 byte[])
      (r7v69 byte[])
      (r7v71 byte[])
      (r7v74 byte[])
      (r7v75 byte[])
      (r7v77 byte[])
      (r7v85 byte[])
      (r7v95 byte[])
     binds: [B:557:0x0dba, B:554:0x0d95, B:551:0x0d74, B:548:0x0d55, B:545:0x0d36, B:542:0x0d16, B:534:0x0ceb, B:532:0x0cdb, B:517:0x0c88, B:495:0x0bd9, B:485:0x0b75] A[DONT_GENERATE, DONT_INLINE]
      0x0dd2: PHI (r11v59 int) = 
      (r11v36 int)
      (r11v37 int)
      (r11v38 int)
      (r11v39 int)
      (r11v40 int)
      (r11v41 int)
      (r11v43 int)
      (r11v44 int)
      (r11v45 int)
      (r11v53 int)
      (r11v60 int)
     binds: [B:557:0x0dba, B:554:0x0d95, B:551:0x0d74, B:548:0x0d55, B:545:0x0d36, B:542:0x0d16, B:534:0x0ceb, B:532:0x0cdb, B:517:0x0c88, B:495:0x0bd9, B:485:0x0b75] A[DONT_GENERATE, DONT_INLINE]
      0x0dd2: PHI (r12v59 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu) = 
      (r12v33 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v34 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v35 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v36 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v37 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v38 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v40 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v41 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v43 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v51 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
      (r12v60 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
     binds: [B:557:0x0dba, B:554:0x0d95, B:551:0x0d74, B:548:0x0d55, B:545:0x0d36, B:542:0x0d16, B:534:0x0ceb, B:532:0x0cdb, B:517:0x0c88, B:495:0x0bd9, B:485:0x0b75] A[DONT_GENERATE, DONT_INLINE]
      0x0dd2: PHI (r13v21 int) = 
      (r13v6 int)
      (r13v7 int)
      (r13v8 int)
      (r13v9 int)
      (r13v10 int)
      (r13v11 int)
      (r13v13 int)
      (r13v14 int)
      (r13v15 int)
      (r13v17 int)
      (r13v22 int)
     binds: [B:557:0x0dba, B:554:0x0d95, B:551:0x0d74, B:548:0x0d55, B:545:0x0d36, B:542:0x0d16, B:534:0x0ceb, B:532:0x0cdb, B:517:0x0c88, B:495:0x0bd9, B:485:0x0b75] A[DONT_GENERATE, DONT_INLINE]
      0x0dd2: PHI (r19v40 sun.misc.Unsafe) = 
      (r19v14 sun.misc.Unsafe)
      (r19v15 sun.misc.Unsafe)
      (r19v16 sun.misc.Unsafe)
      (r19v17 sun.misc.Unsafe)
      (r19v18 sun.misc.Unsafe)
      (r19v19 sun.misc.Unsafe)
      (r19v21 sun.misc.Unsafe)
      (r19v22 sun.misc.Unsafe)
      (r19v27 sun.misc.Unsafe)
      (r0v15 sun.misc.Unsafe)
      (r19v41 sun.misc.Unsafe)
     binds: [B:557:0x0dba, B:554:0x0d95, B:551:0x0d74, B:548:0x0d55, B:545:0x0d36, B:542:0x0d16, B:534:0x0ceb, B:532:0x0cdb, B:517:0x0c88, B:495:0x0bd9, B:485:0x0b75] A[DONT_GENERATE, DONT_INLINE]
      0x0dd2: PHI (r22v46 int) = 
      (r22v27 int)
      (r22v28 int)
      (r22v29 int)
      (r22v30 int)
      (r22v31 int)
      (r22v32 int)
      (r22v34 int)
      (r22v35 int)
      (r22v36 int)
      (r22v41 int)
      (r22v47 int)
     binds: [B:557:0x0dba, B:554:0x0d95, B:551:0x0d74, B:548:0x0d55, B:545:0x0d36, B:542:0x0d16, B:534:0x0ceb, B:532:0x0cdb, B:517:0x0c88, B:495:0x0bd9, B:485:0x0b75] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:564:0x0df0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:569:0x0e02  */
    /* JADX WARN: Code duplicated, block: B:571:0x0e0c  */
    /* JADX WARN: Code duplicated, block: B:573:0x0e16  */
    /* JADX WARN: Code duplicated, block: B:575:0x0e26  */
    /* JADX WARN: Code duplicated, block: B:576:0x0e38  */
    /* JADX WARN: Code duplicated, block: B:608:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0439 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x048e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x07a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x079b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x078d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x083e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x08a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0896 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0890 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x08df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x093f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0992 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0a14 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0a6d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0ad3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0b07 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x0b33 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0dd5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0de7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x04c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0b30 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x050b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0b20 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x0b16 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0590 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x0713 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x06fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x0793 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x077f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x0779 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x0829 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x083a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0825 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x083a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x087d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x0879 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:750:0x083c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x083c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x083c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x07d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x0a9e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x0a9e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0246  */
    /* JADX WARN: Code duplicated, block: B:79:0x024e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0252  */
    /* JADX WARN: Code duplicated, block: B:82:0x025c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0269  */
    /* JADX WARN: Code duplicated, block: B:87:0x0273  */
    /* JADX WARN: Code duplicated, block: B:89:0x027b A[LOOP:24: B:85:0x026f->B:89:0x027b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x028b  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x02aa A[LOOP:26: B:95:0x029e->B:99:0x02aa, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int zzc(Object obj, byte[] bArr, int i14, int i15, int i16, zzcu zzcuVar) {
        Unsafe unsafe;
        int i17;
        int iZzq;
        int i18;
        int i19;
        Object obj2;
        int i24;
        int i25;
        int iZzi;
        zzds zzdsVar;
        zzgs zzgsVar;
        zzef zzefVarZzb;
        boolean z14;
        int[] iArr;
        int i26;
        int i27;
        int iZzr;
        long j8;
        int i28;
        int i29;
        int i30;
        int i34;
        byte[] bArr2;
        zzcu zzcuVar2;
        Unsafe unsafe2;
        Object obj3;
        int i35;
        int i36;
        int i37;
        int i38;
        Unsafe unsafe3;
        int iZzm;
        Object obj4;
        Object obj5;
        byte[] bArr3;
        int iZzm2;
        boolean z15;
        int i39;
        int i44;
        int length;
        int i45;
        char[] cArr;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        byte b14;
        int i55;
        byte b15;
        int i56;
        byte b16;
        Object obj6;
        Unsafe unsafe4;
        int i57;
        Unsafe unsafe5;
        zzcu zzcuVar3;
        int i58;
        int i59;
        int iZza;
        int iZzj;
        int i64;
        int i65;
        Unsafe unsafe6;
        Object obj7;
        int i66;
        int i67;
        int i68;
        int i69;
        zzeo zzeoVarZzd;
        int i74;
        int i75;
        Unsafe unsafe7;
        Object object;
        Unsafe unsafe8;
        long j14;
        int i76;
        int i77;
        byte[] bArr4;
        int iZzm3;
        boolean z16;
        int iZzj2;
        int i78;
        int i79;
        byte[] bArr5;
        zzcu zzcuVar4;
        int i84;
        int iZza2;
        int i85;
        int i86;
        zzel zzelVarZzu;
        long j15;
        Unsafe unsafe9;
        zzeo zzeoVarZzd2;
        zzeo zzeoVar;
        String str;
        byte[] bArr6;
        int i87;
        zzcu zzcuVar5;
        int i88;
        int i89;
        zzdp zzdpVar;
        int iZzj3;
        zzdp zzdpVar2;
        int iZzj4;
        int i93;
        zzdz zzdzVar;
        int iZzj5;
        zzdz zzdzVar2;
        int i94;
        zzfb zzfbVar;
        int iZzj6;
        zzfb zzfbVar2;
        int i95;
        String str2;
        int i96;
        zzcu zzcuVar6;
        zzfb zzfbVar3;
        int iZzj7;
        zzfb zzfbVar4;
        int i97;
        zzei zzeiVar;
        int iZzj8;
        zzei zzeiVar2;
        int i98;
        zzcw zzcwVar;
        boolean z17;
        int iZzj9;
        boolean z18;
        zzcw zzcwVar2;
        int i99;
        boolean z19;
        int i100;
        int i101;
        int iZzj10;
        int i102;
        int i103;
        int i104;
        int iZzj11;
        int i105;
        zzcu zzcuVar7;
        int iZzj12;
        int i106;
        int iZzj13;
        int i107;
        int i108;
        int i109;
        int i110;
        zzeo zzeoVar2;
        int i111;
        int iZzg;
        zzel zzelVarZzu2;
        zzgs zzgsVar2;
        int i112;
        Iterator it;
        Object objZzn;
        int iIntValue;
        int size;
        Object objZzn2;
        int i113;
        int i114;
        Integer num;
        int iIntValue2;
        int i115;
        zzcu zzcuVar8;
        int i116;
        zzei zzeiVar3;
        int iZzj14;
        int iZzj15;
        zzei zzeiVar4;
        int iZzj16;
        int i117;
        zzfb zzfbVar5;
        int iZzj17;
        zzfb zzfbVar6;
        int i118;
        int i119;
        zzge zzgeVarZzv;
        int iZzd;
        int i120;
        int iZzj18;
        this = this;
        Object obj8 = obj;
        byte[] bArr7 = bArr;
        i15 = i15;
        zzcu zzcuVar9 = zzcuVar;
        zzA(obj8);
        Unsafe unsafe10 = zzb;
        int i121 = 0;
        int iZzj19 = i14;
        int i122 = 0;
        int i123 = 0;
        int i124 = 0;
        int i125 = -1;
        int i126 = 1048575;
        while (true) {
            if (iZzj19 < i15) {
                int iZzk = iZzj19 + 1;
                int i127 = bArr7[iZzj19];
                if (i127 < 0) {
                    iZzk = zzcv.zzk(i127, bArr7, iZzk, zzcuVar9);
                    i127 = zzcuVar9.zza;
                }
                int i128 = iZzk;
                i124 = i127;
                int i129 = (i124 == true ? 1 : 0) >>> 3;
                int i130 = this.zze;
                if (i129 > i125) {
                    iZzq = (i129 < i130 || i129 > this.zzf) ? -1 : this.zzq(i129, i122 / 3);
                } else {
                    if (i129 < i130 || i129 > this.zzf) {
                        i17 = -1;
                        i122 = -1;
                    } else {
                        iZzq = this.zzq(i129, i121);
                    }
                    if (i122 == i17) {
                        unsafe = unsafe10;
                        i18 = i129;
                        i122 = i121;
                        i123 = i123;
                        i19 = i124 == true ? 1 : 0;
                        this = this;
                        obj2 = obj8;
                        i24 = i128;
                    } else {
                        z14 = (i124 == true ? 1 : 0) & 7;
                        iArr = this.zzc;
                        i26 = i121;
                        i27 = iArr[i122 + 1];
                        iZzr = zzr(i27);
                        j8 = i27 & 1048575;
                        i125 = i129;
                        if (iZzr <= 17) {
                            int i131 = iArr[i122 + 2];
                            i28 = 1 << (i131 >>> 20);
                            i29 = i131 & 1048575;
                            if (i29 != i126) {
                                i65 = 1048575;
                                if (i126 != 1048575) {
                                    unsafe10.putInt(obj8, i126, i123);
                                    i65 = 1048575;
                                }
                                if (i29 == i65) {
                                    i30 = i26;
                                } else {
                                    i30 = unsafe10.getInt(obj8, i29);
                                }
                                i34 = i29;
                            } else {
                                i30 = i123;
                                i34 = i126;
                            }
                            switch (iZzr) {
                                case 0:
                                    bArr2 = bArr;
                                    unsafe2 = unsafe10;
                                    obj3 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    i36 = i34;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 1) {
                                        i38 = i37 + 8;
                                        i123 = i35 | i28;
                                        zzgz.zzo(obj3, j8, Double.longBitsToDouble(zzcv.zzq(bArr2, i37)));
                                        obj8 = obj3;
                                        unsafe10 = unsafe2;
                                        iZzj19 = i38;
                                        zzcuVar9 = zzcuVar2;
                                        bArr7 = bArr2;
                                        i126 = i36;
                                        i121 = 0;
                                        i15 = i15;
                                    } else {
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16 || i16 == 0) {
                                            if (this.zzh) {
                                                zzdsVar = zzcuVar.zzd;
                                                int i132 = zzds.zzb;
                                                int i133 = zzfu.zza;
                                                if (zzdsVar != zzds.zza) {
                                                    zzfm zzfmVar = this.zzg;
                                                    zzgsVar = this.zzl;
                                                    zzefVarZzb = zzdsVar.zzb(zzfmVar, i18);
                                                    if (zzefVarZzb == null) {
                                                        i15 = i15;
                                                        i25 = i19;
                                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                    } else {
                                                        i25 = i19;
                                                        zzed zzedVar = (zzed) obj2;
                                                        zzedVar.zzc();
                                                        i15 = i15;
                                                        iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar, zzefVarZzb, zzgsVar, zzcuVar);
                                                    }
                                                } else {
                                                    i25 = i19;
                                                    i15 = i15;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                            iZzj19 = iZzi;
                                            bArr7 = bArr;
                                            zzcuVar9 = zzcuVar;
                                            i125 = i18;
                                            i122 = i122;
                                            this = this;
                                            obj8 = obj2;
                                            i123 = i123;
                                            i121 = 0;
                                            i124 = i25;
                                            unsafe10 = unsafe;
                                        } else {
                                            i15 = i15;
                                            iZzj19 = i24;
                                            obj8 = obj2;
                                            i124 = i19;
                                        }
                                    }
                                    break;
                                case 1:
                                    bArr2 = bArr;
                                    unsafe2 = unsafe10;
                                    obj3 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    i36 = i34;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 5) {
                                        i38 = i37 + 4;
                                        i123 = i35 | i28;
                                        zzgz.zzp(obj3, j8, Float.intBitsToFloat(zzcv.zzc(bArr2, i37)));
                                        obj8 = obj3;
                                        unsafe10 = unsafe2;
                                        iZzj19 = i38;
                                        zzcuVar9 = zzcuVar2;
                                        bArr7 = bArr2;
                                        i126 = i36;
                                        i121 = 0;
                                        i15 = i15;
                                    } else {
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i134 = zzds.zzb;
                                            int i135 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar2 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar2, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar2 = (zzed) obj2;
                                                    zzedVar2.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar2, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    bArr2 = bArr;
                                    unsafe3 = unsafe10;
                                    obj3 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    i36 = i34;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 0) {
                                        i123 = i35 | i28;
                                        iZzm = zzcv.zzm(bArr2, i37, zzcuVar2);
                                        obj8 = obj3;
                                        unsafe10 = unsafe3;
                                        unsafe10.putLong(obj8, j8, zzcuVar2.zzb);
                                        i15 = i15;
                                        zzcuVar9 = zzcuVar2;
                                        iZzj19 = iZzm;
                                        bArr7 = bArr2;
                                        i122 = i122;
                                        i126 = i36;
                                        i125 = i125;
                                        i121 = 0;
                                    } else {
                                        unsafe2 = unsafe3;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i136 = zzds.zzb;
                                            int i137 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar3 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar3, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar3 = (zzed) obj2;
                                                    zzedVar3.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar3, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 4:
                                case 11:
                                    bArr2 = bArr;
                                    unsafe3 = unsafe10;
                                    obj3 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    i36 = i34;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 0) {
                                        i123 = i35 | i28;
                                        iZzj19 = zzcv.zzj(bArr2, i37, zzcuVar2);
                                        unsafe3.putInt(obj3, j8, zzcuVar2.zza);
                                        obj8 = obj3;
                                        zzcuVar9 = zzcuVar2;
                                        bArr7 = bArr2;
                                        unsafe10 = unsafe3;
                                        i122 = i122;
                                        i126 = i36;
                                        i125 = i125;
                                        i121 = 0;
                                    } else {
                                        unsafe2 = unsafe3;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i138 = zzds.zzb;
                                            int i139 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar4 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar4, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar4 = (zzed) obj2;
                                                    zzedVar4.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar4, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    unsafe3 = unsafe10;
                                    obj4 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    i36 = i34;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 1) {
                                        iZzm = i37 + 8;
                                        i123 = i35 | i28;
                                        long jZzq = zzcv.zzq(bArr, i37);
                                        obj8 = obj4;
                                        bArr2 = bArr;
                                        unsafe10 = unsafe3;
                                        unsafe10.putLong(obj8, j8, jZzq);
                                        i15 = i15;
                                        zzcuVar9 = zzcuVar2;
                                        iZzj19 = iZzm;
                                        bArr7 = bArr2;
                                        i122 = i122;
                                        i126 = i36;
                                        i125 = i125;
                                        i121 = 0;
                                    } else {
                                        bArr2 = bArr;
                                        obj3 = obj4;
                                        unsafe2 = unsafe3;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i1310 = zzds.zzb;
                                            int i1311 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar5 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar5, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar5 = (zzed) obj2;
                                                    zzedVar5.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar5, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    unsafe3 = unsafe10;
                                    obj5 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    bArr3 = bArr;
                                    i36 = i34;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 5) {
                                        i123 = i35 | i28;
                                        unsafe3.putInt(obj5, j8, zzcv.zzc(bArr3, i37));
                                        i15 = i15;
                                        iZzj19 = i37 + 4;
                                        zzcuVar9 = zzcuVar2;
                                        obj8 = obj5;
                                        i122 = i122;
                                        i126 = i36;
                                        i125 = i125;
                                        i121 = 0;
                                        bArr7 = bArr3;
                                        unsafe10 = unsafe3;
                                    } else {
                                        Object obj9 = obj5;
                                        bArr2 = bArr3;
                                        obj3 = obj9;
                                        unsafe2 = unsafe3;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i1312 = zzds.zzb;
                                            int i1313 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar6 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar6, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar6 = (zzed) obj2;
                                                    zzedVar6.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar6, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 7:
                                    unsafe3 = unsafe10;
                                    obj5 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    bArr3 = bArr;
                                    i36 = i34;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 0) {
                                        i123 = i35 | i28;
                                        iZzm2 = zzcv.zzm(bArr3, i37, zzcuVar2);
                                        if (zzcuVar2.zzb != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        zzgz.zzm(obj5, j8, z15);
                                        bArr7 = bArr3;
                                        iZzj19 = iZzm2;
                                        zzcuVar9 = zzcuVar2;
                                        obj8 = obj5;
                                        unsafe10 = unsafe3;
                                        i122 = i122;
                                        i126 = i36;
                                        i125 = i125;
                                        i121 = 0;
                                    } else {
                                        Object obj10 = obj5;
                                        bArr2 = bArr3;
                                        obj3 = obj10;
                                        unsafe2 = unsafe3;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i1314 = zzds.zzb;
                                            int i1315 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar7 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar7, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar7 = (zzed) obj2;
                                                    zzedVar7.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar7, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 8:
                                    unsafe3 = unsafe10;
                                    obj5 = obj8;
                                    i35 = i30;
                                    i37 = i128;
                                    bArr3 = bArr;
                                    zzcuVar2 = zzcuVar;
                                    if (z14 == 2) {
                                        if ((i27 & 536870912) != 0) {
                                            iZzm2 = zzcv.zzj(bArr3, i37, zzcuVar2);
                                            i39 = zzcuVar2.zza;
                                            if (i39 >= 0) {
                                                com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return i26;
                                            }
                                            i44 = i35 | i28;
                                            if (i39 == 0) {
                                                zzcuVar2.zzc = "";
                                                i49 = i44;
                                                i36 = i34;
                                            } else {
                                                length = bArr3.length;
                                                int i140 = zzhe.zza;
                                                if ((iZzm2 | i39 | ((length - iZzm2) - i39)) >= 0) {
                                                    com.google.protobuf.a.l("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iZzm2), Integer.valueOf(i39)});
                                                    return i26;
                                                }
                                                i45 = iZzm2 + i39;
                                                cArr = new char[i39];
                                                i46 = i26;
                                                while (true) {
                                                    i47 = iZzm2;
                                                    if (iZzm2 < i45) {
                                                        b16 = bArr3[i47];
                                                        if (zzha.zzd(b16)) {
                                                            cArr[i46] = (char) b16;
                                                            iZzm2 = i47 + 1;
                                                            i46++;
                                                        }
                                                    }
                                                }
                                                i48 = i47;
                                                while (i48 < i45) {
                                                    i54 = i48;
                                                    i48 = i54 + 1;
                                                    i44 = i44;
                                                    b14 = bArr3[i54];
                                                    if (zzha.zzd(b14)) {
                                                        i55 = i46 + 1;
                                                        cArr[i46] = (char) b14;
                                                        while (true) {
                                                            i46 = i55;
                                                            if (i48 < i45) {
                                                                b15 = bArr3[i48];
                                                                if (zzha.zzd(b15)) {
                                                                    i48++;
                                                                    i55 = i46 + 1;
                                                                    cArr[i46] = (char) b15;
                                                                }
                                                            }
                                                        }
                                                        i44 = i44;
                                                    } else {
                                                        int i141 = i34;
                                                        if (b14 < -32) {
                                                            if (b14 < -16) {
                                                                i56 = i45;
                                                                if (i48 < i56 - 2) {
                                                                    com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                                    return i26;
                                                                }
                                                                char[] cArr2 = cArr;
                                                                zzha.zza(b14, bArr3[i48], bArr3[i54 + 2], bArr3[i54 + 3], cArr2, i46);
                                                                i46 += 2;
                                                                cArr = cArr2;
                                                                i48 = i54 + 4;
                                                            } else {
                                                                if (i48 < i45 - 1) {
                                                                    com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                                    return i26;
                                                                }
                                                                i56 = i45;
                                                                zzha.zzb(b14, bArr3[i48], bArr3[i54 + 2], cArr, i46);
                                                                i46++;
                                                                i48 = i54 + 3;
                                                            }
                                                            i45 = i56;
                                                        } else {
                                                            if (i48 < i45) {
                                                                com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                                return i26;
                                                            }
                                                            zzha.zzc(b14, bArr3[i48], cArr, i46);
                                                            i44 = i44;
                                                            i46++;
                                                            i48 = i54 + 2;
                                                        }
                                                        i34 = i141;
                                                    }
                                                }
                                                i49 = i44;
                                                i36 = i34;
                                                zzcuVar2.zzc = new String(cArr, i26, i46);
                                                iZzm2 = i45;
                                            }
                                            i123 = i49;
                                        } else {
                                            i36 = i34;
                                            iZzm2 = zzcv.zzh(bArr3, i37, zzcuVar2);
                                            i123 = i35 | i28;
                                        }
                                        unsafe3.putObject(obj5, j8, zzcuVar2.zzc);
                                        bArr7 = bArr3;
                                        iZzj19 = iZzm2;
                                        zzcuVar9 = zzcuVar2;
                                        obj8 = obj5;
                                        unsafe10 = unsafe3;
                                        i122 = i122;
                                        i126 = i36;
                                        i125 = i125;
                                        i121 = 0;
                                    } else {
                                        i36 = i34;
                                        Object obj11 = obj5;
                                        bArr2 = bArr3;
                                        obj3 = obj11;
                                        unsafe2 = unsafe3;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i1316 = zzds.zzb;
                                            int i1317 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar8 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar8, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar8 = (zzed) obj2;
                                                    zzedVar8.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar8, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 9:
                                    obj6 = obj8;
                                    unsafe4 = unsafe10;
                                    i35 = i30;
                                    if (z14 == 2) {
                                        i57 = i35 | i28;
                                        Object objZzx = this.zzx(obj6, i122);
                                        int iZzo = zzcv.zzo(objZzx, this.zzv(i122), bArr, i128, i15, zzcuVar);
                                        this.zzF(obj6, i122, objZzx);
                                        i15 = i15;
                                        zzcuVar9 = zzcuVar;
                                        bArr7 = bArr;
                                        iZzj19 = iZzo;
                                        obj8 = obj6;
                                        unsafe10 = unsafe4;
                                        i122 = i122;
                                        i126 = i34;
                                        i121 = i26;
                                        i123 = i57;
                                        i125 = i125;
                                    } else {
                                        i37 = i128;
                                        bArr2 = bArr;
                                        obj3 = obj6;
                                        zzcuVar2 = zzcuVar;
                                        unsafe2 = unsafe4;
                                        i36 = i34;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i1318 = zzds.zzb;
                                            int i1319 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar9 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar9, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar9 = (zzed) obj2;
                                                    zzedVar9.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar9, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 10:
                                    Object obj12 = obj8;
                                    unsafe5 = unsafe10;
                                    obj3 = obj12;
                                    bArr2 = bArr;
                                    zzcuVar3 = zzcuVar;
                                    i35 = i30;
                                    i58 = i128;
                                    if (z14 == 2) {
                                        i59 = i35 | i28;
                                        iZza = zzcv.zza(bArr2, i58, zzcuVar3);
                                        unsafe5.putObject(obj3, j8, zzcuVar3.zzc);
                                        Unsafe unsafe11 = unsafe5;
                                        obj8 = obj3;
                                        unsafe10 = unsafe11;
                                        int i142 = i34;
                                        i123 = i59;
                                        bArr7 = bArr2;
                                        i126 = i142;
                                        iZzj19 = iZza;
                                        zzcuVar9 = zzcuVar3;
                                        i121 = i26;
                                        i15 = i15;
                                    } else {
                                        unsafe2 = unsafe5;
                                        i37 = i58;
                                        zzcuVar2 = zzcuVar3;
                                        i36 = i34;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i13110 = zzds.zzb;
                                            int i13111 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar10 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar10, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar10 = (zzed) obj2;
                                                    zzedVar10.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar10, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 12:
                                    Object obj13 = obj8;
                                    unsafe5 = unsafe10;
                                    obj3 = obj13;
                                    bArr2 = bArr;
                                    zzcuVar3 = zzcuVar;
                                    i35 = i30;
                                    i58 = i128;
                                    if (z14 == 0) {
                                        iZzj = zzcv.zzj(bArr2, i58, zzcuVar3);
                                        i64 = zzcuVar3.zza;
                                        zzel zzelVarZzu3 = this.zzu(i122);
                                        if ((i27 & Integer.MIN_VALUE) != 0 || zzelVarZzu3 == null || zzelVarZzu3.zza(i64)) {
                                            i57 = i35 | i28;
                                            unsafe5.putInt(obj3, j8, i64);
                                            obj8 = obj3;
                                            unsafe10 = unsafe5;
                                            iZzj19 = iZzj;
                                            bArr7 = bArr2;
                                            zzcuVar9 = zzcuVar3;
                                            i122 = i122;
                                            i126 = i34;
                                            i121 = i26;
                                            i123 = i57;
                                            i125 = i125;
                                        } else {
                                            zzd(obj3).zzj(i124 == true ? 1 : 0, Long.valueOf(i64));
                                            obj8 = obj3;
                                            unsafe10 = unsafe5;
                                            i15 = i15;
                                            iZzj19 = iZzj;
                                            bArr7 = bArr2;
                                            zzcuVar9 = zzcuVar3;
                                            i122 = i122;
                                            i126 = i34;
                                            i121 = i26;
                                            i125 = i125;
                                            i123 = i35;
                                        }
                                    } else {
                                        unsafe2 = unsafe5;
                                        i37 = i58;
                                        zzcuVar2 = zzcuVar3;
                                        i36 = i34;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i13112 = zzds.zzb;
                                            int i13113 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar11 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar11, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar11 = (zzed) obj2;
                                                    zzedVar11.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar11, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 15:
                                    Object obj14 = obj8;
                                    unsafe5 = unsafe10;
                                    obj3 = obj14;
                                    bArr2 = bArr;
                                    zzcuVar3 = zzcuVar;
                                    i35 = i30;
                                    i58 = i128;
                                    if (z14 == 0) {
                                        i59 = i35 | i28;
                                        iZza = zzcv.zzj(bArr2, i58, zzcuVar3);
                                        unsafe5.putInt(obj3, j8, zzdj.zzb(zzcuVar3.zza));
                                        Unsafe unsafe12 = unsafe5;
                                        obj8 = obj3;
                                        unsafe10 = unsafe12;
                                        int i143 = i34;
                                        i123 = i59;
                                        bArr7 = bArr2;
                                        i126 = i143;
                                        iZzj19 = iZza;
                                        zzcuVar9 = zzcuVar3;
                                        i121 = i26;
                                        i15 = i15;
                                    } else {
                                        unsafe2 = unsafe5;
                                        i37 = i58;
                                        zzcuVar2 = zzcuVar3;
                                        i36 = i34;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i13114 = zzds.zzb;
                                            int i13115 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar12 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar12, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar12 = (zzed) obj2;
                                                    zzedVar12.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar12, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                case 16:
                                    bArr2 = bArr;
                                    zzcuVar3 = zzcuVar;
                                    if (z14 == 0) {
                                        i57 = i28 | i30;
                                        int iZzm4 = zzcv.zzm(bArr2, i128, zzcuVar3);
                                        unsafe10.putLong(obj8, j8, zzdj.zzc(zzcuVar3.zzb));
                                        obj8 = obj8;
                                        unsafe10 = unsafe10;
                                        iZzj19 = iZzm4;
                                        bArr7 = bArr2;
                                        zzcuVar9 = zzcuVar3;
                                        i122 = i122;
                                        i126 = i34;
                                        i121 = i26;
                                        i123 = i57;
                                        i125 = i125;
                                    } else {
                                        Object obj15 = obj8;
                                        Unsafe unsafe13 = unsafe10;
                                        obj3 = obj15;
                                        unsafe2 = unsafe13;
                                        i37 = i128;
                                        i35 = i30;
                                        zzcuVar2 = zzcuVar3;
                                        i36 = i34;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i13116 = zzds.zzb;
                                            int i13117 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar13 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar13, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar13 = (zzed) obj2;
                                                    zzedVar13.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar13, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                                default:
                                    if (z14 == 3) {
                                        int i144 = i30 | i28;
                                        Object objZzx2 = this.zzx(obj8, i122);
                                        int iZzn = zzcv.zzn(objZzx2, this.zzv(i122), bArr, i128, i15, (i125 << 3) | 4, zzcuVar);
                                        this.zzF(obj8, i122, objZzx2);
                                        iZzj19 = iZzn;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i122 = i122;
                                        i126 = i34;
                                        i125 = i125;
                                        i15 = i15;
                                        i123 = i144;
                                        i121 = i26;
                                    } else {
                                        bArr2 = bArr;
                                        zzcuVar2 = zzcuVar;
                                        unsafe2 = unsafe10;
                                        obj3 = obj8;
                                        i35 = i30;
                                        i36 = i34;
                                        i37 = i128;
                                        i123 = i35;
                                        this = this;
                                        unsafe = unsafe2;
                                        zzcuVar = zzcuVar2;
                                        i19 = i124 == true ? 1 : 0;
                                        i126 = i36;
                                        i18 = i125;
                                        obj2 = obj3;
                                        i24 = i37;
                                        if (i19 == i16) {
                                        }
                                        if (this.zzh) {
                                            zzdsVar = zzcuVar.zzd;
                                            int i13118 = zzds.zzb;
                                            int i13119 = zzfu.zza;
                                            if (zzdsVar != zzds.zza) {
                                                zzfm zzfmVar14 = this.zzg;
                                                zzgsVar = this.zzl;
                                                zzefVarZzb = zzdsVar.zzb(zzfmVar14, i18);
                                                if (zzefVarZzb == null) {
                                                    i15 = i15;
                                                    i25 = i19;
                                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                                } else {
                                                    i25 = i19;
                                                    zzed zzedVar14 = (zzed) obj2;
                                                    zzedVar14.zzc();
                                                    i15 = i15;
                                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar14, zzefVarZzb, zzgsVar, zzcuVar);
                                                }
                                            } else {
                                                i25 = i19;
                                                i15 = i15;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                        iZzj19 = iZzi;
                                        bArr7 = bArr;
                                        zzcuVar9 = zzcuVar;
                                        i125 = i18;
                                        i122 = i122;
                                        this = this;
                                        obj8 = obj2;
                                        i123 = i123;
                                        i121 = 0;
                                        i124 = i25;
                                        unsafe10 = unsafe;
                                    }
                                    break;
                            }
                        } else {
                            unsafe6 = unsafe10;
                            obj7 = obj8;
                            i66 = i126;
                            i67 = i125;
                            if (iZzr == 27) {
                                i74 = i124 == true ? 1 : 0;
                                obj2 = obj7;
                                i75 = i128;
                                if (iZzr <= 49) {
                                    j15 = i27;
                                    unsafe9 = zzb;
                                    zzeoVarZzd2 = (zzeo) unsafe9.getObject(obj2, j8);
                                    if (!zzeoVarZzd2.zzc()) {
                                        int size2 = zzeoVarZzd2.size();
                                        zzeoVarZzd2 = zzeoVarZzd2.zzd(size2 != 0 ? size2 + size2 : 10);
                                        unsafe9.putObject(obj2, j8, zzeoVarZzd2);
                                    }
                                    zzeoVar = zzeoVarZzd2;
                                    str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                    switch (iZzr) {
                                        case 18:
                                        case 35:
                                            bArr6 = bArr;
                                            i87 = i75;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            zzcuVar5 = zzcuVar;
                                            i74 = i74 == true ? 1 : 0;
                                            i123 = i123;
                                            i88 = i15;
                                            this = this;
                                            if (z14 == 2) {
                                                zzdpVar2 = (zzdp) zzeoVar;
                                                iZzj4 = zzcv.zzj(bArr6, i87, zzcuVar5);
                                                i93 = zzcuVar5.zza + iZzj4;
                                                while (iZzj4 < i93) {
                                                    zzdpVar2.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, iZzj4)));
                                                    iZzj4 += 8;
                                                }
                                                if (iZzj4 != i93) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                iZzj19 = iZzj4;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                if (z14 == 1) {
                                                    i89 = i87 + 8;
                                                    zzdpVar = (zzdp) zzeoVar;
                                                    zzdpVar.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, i87)));
                                                    while (i89 < i88) {
                                                        iZzj3 = zzcv.zzj(bArr6, i89, zzcuVar5);
                                                        if (i74 == zzcuVar5.zza) {
                                                            zzdpVar.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, iZzj3)));
                                                            i89 = iZzj3 + 8;
                                                        } else {
                                                            iZzj19 = i89;
                                                        }
                                                    }
                                                    iZzj19 = i89;
                                                } else {
                                                    iZzj19 = i87;
                                                }
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            bArr6 = bArr;
                                            i87 = i75;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            zzcuVar5 = zzcuVar;
                                            i74 = i74 == true ? 1 : 0;
                                            i123 = i123;
                                            i88 = i15;
                                            this = this;
                                            if (z14 == 2) {
                                                zzdzVar2 = (zzdz) zzeoVar;
                                                iZzj4 = zzcv.zzj(bArr6, i87, zzcuVar5);
                                                i94 = zzcuVar5.zza + iZzj4;
                                                while (iZzj4 < i94) {
                                                    zzdzVar2.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, iZzj4)));
                                                    iZzj4 += 4;
                                                }
                                                if (iZzj4 != i94) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                iZzj19 = iZzj4;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                if (z14 == 5) {
                                                    i89 = i87 + 4;
                                                    zzdzVar = (zzdz) zzeoVar;
                                                    zzdzVar.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, i87)));
                                                    while (i89 < i88) {
                                                        iZzj5 = zzcv.zzj(bArr6, i89, zzcuVar5);
                                                        if (i74 == zzcuVar5.zza) {
                                                            zzdzVar.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, iZzj5)));
                                                            i89 = iZzj5 + 4;
                                                        } else {
                                                            iZzj19 = i89;
                                                        }
                                                    }
                                                    iZzj19 = i89;
                                                } else {
                                                    iZzj19 = i87;
                                                }
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            bArr6 = bArr;
                                            i87 = i75;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            zzcuVar5 = zzcuVar;
                                            i74 = i74 == true ? 1 : 0;
                                            i123 = i123;
                                            i88 = i15;
                                            this = this;
                                            if (z14 == 2) {
                                                if (z14 == 0) {
                                                    zzfbVar = (zzfb) zzeoVar;
                                                    iZzj4 = zzcv.zzm(bArr6, i87, zzcuVar5);
                                                    zzfbVar.zzf(zzcuVar5.zzb);
                                                    while (iZzj4 < i88) {
                                                        iZzj6 = zzcv.zzj(bArr6, iZzj4, zzcuVar5);
                                                        if (i74 == zzcuVar5.zza) {
                                                            iZzj4 = zzcv.zzm(bArr6, iZzj6, zzcuVar5);
                                                            zzfbVar.zzf(zzcuVar5.zzb);
                                                        }
                                                    }
                                                } else {
                                                    iZzj19 = i87;
                                                }
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                zzfbVar2 = (zzfb) zzeoVar;
                                                iZzj4 = zzcv.zzj(bArr6, i87, zzcuVar5);
                                                i95 = zzcuVar5.zza + iZzj4;
                                                while (iZzj4 < i95) {
                                                    int iZzm5 = zzcv.zzm(bArr6, iZzj4, zzcuVar5);
                                                    zzfbVar2.zzf(zzcuVar5.zzb);
                                                    str = str;
                                                    iZzj4 = iZzm5;
                                                }
                                                str2 = str;
                                                if (iZzj4 != i95) {
                                                    com.google.android.gms.internal.measurement.a.r(str2);
                                                    return 0;
                                                }
                                            }
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            bArr6 = bArr;
                                            i96 = i15;
                                            zzcuVar6 = zzcuVar;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            i123 = i123;
                                            this = this;
                                            if (z14 == 2) {
                                                if (z14 == 0) {
                                                    iZzj4 = zzcv.zzl(i74 == true ? 1 : 0, bArr6, i75, i96, zzeoVar, zzcuVar6);
                                                    i74 = i74 == true ? 1 : 0;
                                                    i88 = i96;
                                                    i87 = i75;
                                                    zzcuVar5 = zzcuVar6;
                                                }
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar6;
                                                i74 = i74 == true ? 1 : 0;
                                                i88 = i96;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                iZzj4 = zzcv.zzg(bArr6, i75, zzeoVar, zzcuVar6);
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar6;
                                                i74 = i74;
                                                i88 = i96;
                                            }
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            bArr6 = bArr;
                                            i96 = i15;
                                            zzcuVar6 = zzcuVar;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            i123 = i123;
                                            this = this;
                                            if (z14 == 2) {
                                                if (z14 == 1) {
                                                    iZzj4 = i75 + 8;
                                                    zzfbVar3 = (zzfb) zzeoVar;
                                                    zzfbVar3.zzf(zzcv.zzq(bArr6, i75));
                                                    while (iZzj4 < i96) {
                                                        iZzj7 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                        if (i74 == zzcuVar6.zza) {
                                                            zzfbVar3.zzf(zzcv.zzq(bArr6, iZzj7));
                                                            iZzj4 = iZzj7 + 8;
                                                        }
                                                    }
                                                }
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar6;
                                                i74 = i74 == true ? 1 : 0;
                                                i88 = i96;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                zzfbVar4 = (zzfb) zzeoVar;
                                                iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                                i97 = zzcuVar6.zza + iZzj4;
                                                while (iZzj4 < i97) {
                                                    zzfbVar4.zzf(zzcv.zzq(bArr6, iZzj4));
                                                    iZzj4 += 8;
                                                }
                                                if (iZzj4 != i97) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74;
                                            i88 = i96;
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            bArr6 = bArr;
                                            i96 = i15;
                                            zzcuVar6 = zzcuVar;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            i123 = i123;
                                            this = this;
                                            if (z14 == 2) {
                                                if (z14 == 5) {
                                                    iZzj4 = i75 + 4;
                                                    zzeiVar = (zzei) zzeoVar;
                                                    zzeiVar.zzg(zzcv.zzc(bArr6, i75));
                                                    while (iZzj4 < i96) {
                                                        iZzj8 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                        if (i74 == zzcuVar6.zza) {
                                                            zzeiVar.zzg(zzcv.zzc(bArr6, iZzj8));
                                                            iZzj4 = iZzj8 + 4;
                                                        }
                                                    }
                                                }
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar6;
                                                i74 = i74 == true ? 1 : 0;
                                                i88 = i96;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                zzeiVar2 = (zzei) zzeoVar;
                                                iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                                i98 = zzcuVar6.zza + iZzj4;
                                                while (iZzj4 < i98) {
                                                    zzeiVar2.zzg(zzcv.zzc(bArr6, iZzj4));
                                                    iZzj4 += 4;
                                                }
                                                if (iZzj4 != i98) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74;
                                            i88 = i96;
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            bArr6 = bArr;
                                            i96 = i15;
                                            zzcuVar6 = zzcuVar;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            i123 = i123;
                                            this = this;
                                            if (z14 == 2) {
                                                if (z14 == 0) {
                                                    zzcwVar = (zzcw) zzeoVar;
                                                    iZzj4 = zzcv.zzm(bArr6, i75, zzcuVar6);
                                                    if (zzcuVar6.zzb != 0) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    zzcwVar.zze(z17);
                                                    while (iZzj4 < i96) {
                                                        iZzj9 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                        if (i74 == zzcuVar6.zza) {
                                                            iZzj4 = zzcv.zzm(bArr6, iZzj9, zzcuVar6);
                                                            if (zzcuVar6.zzb != 0) {
                                                                z18 = true;
                                                            } else {
                                                                z18 = false;
                                                            }
                                                            zzcwVar.zze(z18);
                                                        }
                                                    }
                                                }
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar6;
                                                i74 = i74 == true ? 1 : 0;
                                                i88 = i96;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                zzcwVar2 = (zzcw) zzeoVar;
                                                iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                                i99 = zzcuVar6.zza + iZzj4;
                                                while (iZzj4 < i99) {
                                                    iZzj4 = zzcv.zzm(bArr6, iZzj4, zzcuVar6);
                                                    if (zzcuVar6.zzb != 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    zzcwVar2.zze(z19);
                                                }
                                                if (iZzj4 != i99) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74;
                                            i88 = i96;
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        case 26:
                                            bArr6 = bArr;
                                            i96 = i15;
                                            zzcuVar6 = zzcuVar;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            i123 = i123;
                                            this = this;
                                            if (z14 == 2) {
                                                if ((j15 & 536870912) == 0) {
                                                    iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                                    i104 = zzcuVar6.zza;
                                                    if (i104 >= 0) {
                                                        com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i104 == 0) {
                                                        zzeoVar.add("");
                                                    } else {
                                                        zzeoVar.add(new String(bArr6, iZzj4, i104, zzep.zza));
                                                        iZzj4 += i104;
                                                    }
                                                    while (iZzj4 < i96) {
                                                        iZzj11 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                        if (i74 == zzcuVar6.zza) {
                                                            iZzj4 = zzcv.zzj(bArr6, iZzj11, zzcuVar6);
                                                            i105 = zzcuVar6.zza;
                                                            if (i105 >= 0) {
                                                                com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i105 == 0) {
                                                                zzeoVar.add("");
                                                            } else {
                                                                zzeoVar.add(new String(bArr6, iZzj4, i105, zzep.zza));
                                                                iZzj4 += i105;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                                    i100 = zzcuVar6.zza;
                                                    if (i100 >= 0) {
                                                        com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i100 == 0) {
                                                        zzeoVar.add("");
                                                    } else {
                                                        i101 = iZzj4 + i100;
                                                        if (zzhe.zzg(bArr6, iZzj4, i101)) {
                                                            com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        zzeoVar.add(new String(bArr6, iZzj4, i100, zzep.zza));
                                                        iZzj4 = i101;
                                                    }
                                                    while (iZzj4 < i96) {
                                                        iZzj10 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                        if (i74 == zzcuVar6.zza) {
                                                            iZzj4 = zzcv.zzj(bArr6, iZzj10, zzcuVar6);
                                                            i102 = zzcuVar6.zza;
                                                            if (i102 >= 0) {
                                                                com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                                return 0;
                                                            }
                                                            if (i102 == 0) {
                                                                zzeoVar.add("");
                                                            } else {
                                                                i103 = iZzj4 + i102;
                                                                if (zzhe.zzg(bArr6, iZzj4, i103)) {
                                                                    com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                zzeoVar.add(new String(bArr6, iZzj4, i102, zzep.zza));
                                                                iZzj4 = i103;
                                                            }
                                                        }
                                                    }
                                                }
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar6;
                                                i74 = i74;
                                                i88 = i96;
                                                iZzj19 = iZzj4;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74 == true ? 1 : 0;
                                            i88 = i96;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        case 27:
                                            bArr6 = bArr;
                                            zzcuVar7 = zzcuVar;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            i123 = i123;
                                            if (z14 == 2) {
                                                this = this;
                                                i96 = i15;
                                                i87 = i75;
                                                iZzj4 = zzcv.zzf(this.zzv(i122), i74 == true ? 1 : 0, bArr6, i87, i96, zzeoVar, zzcuVar7);
                                                zzcuVar6 = zzcuVar7;
                                                i74 = i74 == true ? 1 : 0;
                                                bArr6 = bArr6;
                                                zzcuVar5 = zzcuVar6;
                                                i74 = i74;
                                                i88 = i96;
                                                iZzj19 = iZzj4;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                i74 = i74 == true ? 1 : 0;
                                                i88 = i15;
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar7;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            break;
                                        case 28:
                                            bArr6 = bArr;
                                            zzcuVar7 = zzcuVar;
                                            i18 = i67;
                                            unsafe = unsafe6;
                                            i123 = i123;
                                            if (z14 == 2) {
                                                iZzj12 = zzcv.zzj(bArr6, i75, zzcuVar7);
                                                i106 = zzcuVar7.zza;
                                                if (i106 >= 0) {
                                                    com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i106 <= bArr6.length - iZzj12) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                if (i106 == 0) {
                                                    zzeoVar.add(zzdf.zzb);
                                                } else {
                                                    zzeoVar.add(zzdf.zzr(bArr6, iZzj12, i106));
                                                    iZzj12 += i106;
                                                }
                                                while (iZzj12 < i15) {
                                                    iZzj13 = zzcv.zzj(bArr6, iZzj12, zzcuVar7);
                                                    if (i74 == zzcuVar7.zza) {
                                                        i88 = i15;
                                                        i74 = i74 == true ? 1 : 0;
                                                        iZzj19 = iZzj12;
                                                        i87 = i75;
                                                        zzcuVar5 = zzcuVar7;
                                                        if (iZzj19 != i87) {
                                                            zzcuVar9 = zzcuVar5;
                                                            i15 = i88;
                                                            i125 = i18;
                                                            this = this;
                                                            unsafe10 = unsafe;
                                                            i123 = i123;
                                                            i121 = 0;
                                                            bArr7 = bArr6;
                                                            obj8 = obj2;
                                                            i124 = i74;
                                                            i126 = i66;
                                                        } else {
                                                            zzcuVar = zzcuVar5;
                                                            i24 = iZzj19;
                                                            i19 = i74;
                                                            i126 = i66;
                                                        }
                                                        break;
                                                    } else {
                                                        iZzj12 = zzcv.zzj(bArr6, iZzj13, zzcuVar7);
                                                        i107 = zzcuVar7.zza;
                                                        if (i107 >= 0) {
                                                            com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i107 <= bArr6.length - iZzj12) {
                                                            com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            return 0;
                                                        }
                                                        if (i107 == 0) {
                                                            zzeoVar.add(zzdf.zzb);
                                                        } else {
                                                            zzeoVar.add(zzdf.zzr(bArr6, iZzj12, i107));
                                                            iZzj12 += i107;
                                                        }
                                                    }
                                                }
                                                i88 = i15;
                                                i74 = i74 == true ? 1 : 0;
                                                iZzj19 = iZzj12;
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar7;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                i88 = i15;
                                                i74 = i74 == true ? 1 : 0;
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar7;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            bArr6 = bArr;
                                            i108 = i15;
                                            zzcuVar7 = zzcuVar;
                                            i109 = i75;
                                            i110 = i67;
                                            unsafe = unsafe6;
                                            if (z14 == 2) {
                                                iZzg = zzcv.zzg(bArr6, i109, zzeoVar, zzcuVar7);
                                                i111 = i74 == true ? 1 : 0;
                                                zzeoVar2 = zzeoVar;
                                                i75 = i109;
                                            } else if (z14 == 0) {
                                                i18 = i110;
                                                this = this;
                                                zzcuVar5 = zzcuVar7;
                                                i88 = i108;
                                                i87 = i109;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                i75 = i109;
                                                int iZzl = zzcv.zzl(i74 == true ? 1 : 0, bArr6, i75, i108, zzeoVar, zzcuVar7);
                                                zzeoVar2 = zzeoVar;
                                                i111 = i74 == true ? 1 : 0;
                                                iZzg = iZzl;
                                            }
                                            zzelVarZzu2 = this.zzu(i122);
                                            zzgsVar2 = this.zzl;
                                            int i145 = zzgg.zza;
                                            if (zzelVarZzu2 != null) {
                                                i112 = iZzg;
                                                i123 = i123;
                                                i18 = i110;
                                            } else if (zzeoVar2 != null) {
                                                size = zzeoVar2.size();
                                                i112 = iZzg;
                                                i123 = i123;
                                                objZzn2 = null;
                                                i113 = 0;
                                                i114 = 0;
                                                while (i114 < size) {
                                                    num = (Integer) zzeoVar2.get(i114);
                                                    iIntValue2 = num.intValue();
                                                    if (zzelVarZzu2.zza(iIntValue2)) {
                                                        if (i114 != i113) {
                                                            zzeoVar2.set(i113, num);
                                                        }
                                                        i113++;
                                                        i115 = i110;
                                                    } else {
                                                        i115 = i110;
                                                        objZzn2 = zzgg.zzn(obj2, i115, iIntValue2, objZzn2, zzgsVar2);
                                                    }
                                                    i114++;
                                                    i110 = i115;
                                                }
                                                i18 = i110;
                                                if (i113 != size) {
                                                    zzeoVar2.subList(i113, size).clear();
                                                }
                                            } else {
                                                i112 = iZzg;
                                                i123 = i123;
                                                i18 = i110;
                                                it = zzeoVar2.iterator();
                                                objZzn = null;
                                                while (it.hasNext()) {
                                                    iIntValue = ((Integer) it.next()).intValue();
                                                    if (!zzelVarZzu2.zza(iIntValue)) {
                                                        objZzn = zzgg.zzn(obj2, i18, iIntValue, objZzn, zzgsVar2);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i88 = i108;
                                            i74 = i111;
                                            iZzj19 = i112;
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar7;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr6 = bArr;
                                            i108 = i15;
                                            zzcuVar8 = zzcuVar;
                                            i109 = i75;
                                            i116 = i67;
                                            unsafe = unsafe6;
                                            if (z14 == 2) {
                                                if (z14 == 0) {
                                                    zzeiVar3 = (zzei) zzeoVar;
                                                    iZzj14 = zzcv.zzj(bArr6, i109, zzcuVar8);
                                                    zzeiVar3.zzg(zzdj.zzb(zzcuVar8.zza));
                                                    while (iZzj14 < i108) {
                                                        iZzj15 = zzcv.zzj(bArr6, iZzj14, zzcuVar8);
                                                        if (i74 == zzcuVar8.zza) {
                                                            iZzj19 = iZzj14;
                                                            zzcuVar5 = zzcuVar8;
                                                            i18 = i116;
                                                            i88 = i108;
                                                            i87 = i109;
                                                            if (iZzj19 != i87) {
                                                                zzcuVar9 = zzcuVar5;
                                                                i15 = i88;
                                                                i125 = i18;
                                                                this = this;
                                                                unsafe10 = unsafe;
                                                                i123 = i123;
                                                                i121 = 0;
                                                                bArr7 = bArr6;
                                                                obj8 = obj2;
                                                                i124 = i74;
                                                                i126 = i66;
                                                            } else {
                                                                zzcuVar = zzcuVar5;
                                                                i24 = iZzj19;
                                                                i19 = i74;
                                                                i126 = i66;
                                                            }
                                                        } else {
                                                            iZzj14 = zzcv.zzj(bArr6, iZzj15, zzcuVar8);
                                                            zzeiVar3.zzg(zzdj.zzb(zzcuVar8.zza));
                                                        }
                                                        break;
                                                    }
                                                    iZzj19 = iZzj14;
                                                    zzcuVar5 = zzcuVar8;
                                                    i18 = i116;
                                                    i88 = i108;
                                                    i87 = i109;
                                                    if (iZzj19 != i87) {
                                                        zzcuVar9 = zzcuVar5;
                                                        i15 = i88;
                                                        i125 = i18;
                                                        this = this;
                                                        unsafe10 = unsafe;
                                                        i123 = i123;
                                                        i121 = 0;
                                                        bArr7 = bArr6;
                                                        obj8 = obj2;
                                                        i124 = i74;
                                                        i126 = i66;
                                                    } else {
                                                        zzcuVar = zzcuVar5;
                                                        i24 = iZzj19;
                                                        i19 = i74;
                                                        i126 = i66;
                                                    }
                                                }
                                                zzcuVar5 = zzcuVar8;
                                                i18 = i116;
                                                this = this;
                                                i88 = i108;
                                                i87 = i109;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                                break;
                                            } else {
                                                zzeiVar4 = (zzei) zzeoVar;
                                                iZzj16 = zzcv.zzj(bArr6, i109, zzcuVar8);
                                                i117 = zzcuVar8.zza + iZzj16;
                                                while (iZzj16 < i117) {
                                                    iZzj16 = zzcv.zzj(bArr6, iZzj16, zzcuVar8);
                                                    zzeiVar4.zzg(zzdj.zzb(zzcuVar8.zza));
                                                }
                                                if (iZzj16 != i117) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                iZzj19 = iZzj16;
                                                zzcuVar5 = zzcuVar8;
                                                i18 = i116;
                                                i88 = i108;
                                                i87 = i109;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr6 = bArr;
                                            i108 = i15;
                                            zzcuVar8 = zzcuVar;
                                            i109 = i75;
                                            unsafe = unsafe6;
                                            if (z14 == 2) {
                                                i116 = i67;
                                                if (z14 == 0) {
                                                    zzfbVar5 = (zzfb) zzeoVar;
                                                    iZzj14 = zzcv.zzm(bArr6, i109, zzcuVar8);
                                                    zzfbVar5.zzf(zzdj.zzc(zzcuVar8.zzb));
                                                    while (iZzj14 < i108) {
                                                        iZzj17 = zzcv.zzj(bArr6, iZzj14, zzcuVar8);
                                                        if (i74 == zzcuVar8.zza) {
                                                            iZzj19 = iZzj14;
                                                            zzcuVar5 = zzcuVar8;
                                                            i18 = i116;
                                                            i88 = i108;
                                                            i87 = i109;
                                                            if (iZzj19 != i87) {
                                                                zzcuVar9 = zzcuVar5;
                                                                i15 = i88;
                                                                i125 = i18;
                                                                this = this;
                                                                unsafe10 = unsafe;
                                                                i123 = i123;
                                                                i121 = 0;
                                                                bArr7 = bArr6;
                                                                obj8 = obj2;
                                                                i124 = i74;
                                                                i126 = i66;
                                                            } else {
                                                                zzcuVar = zzcuVar5;
                                                                i24 = iZzj19;
                                                                i19 = i74;
                                                                i126 = i66;
                                                            }
                                                        } else {
                                                            iZzj14 = zzcv.zzm(bArr6, iZzj17, zzcuVar8);
                                                            zzfbVar5.zzf(zzdj.zzc(zzcuVar8.zzb));
                                                        }
                                                        break;
                                                    }
                                                    iZzj19 = iZzj14;
                                                    zzcuVar5 = zzcuVar8;
                                                    i18 = i116;
                                                    i88 = i108;
                                                    i87 = i109;
                                                    if (iZzj19 != i87) {
                                                        zzcuVar9 = zzcuVar5;
                                                        i15 = i88;
                                                        i125 = i18;
                                                        this = this;
                                                        unsafe10 = unsafe;
                                                        i123 = i123;
                                                        i121 = 0;
                                                        bArr7 = bArr6;
                                                        obj8 = obj2;
                                                        i124 = i74;
                                                        i126 = i66;
                                                    } else {
                                                        zzcuVar = zzcuVar5;
                                                        i24 = iZzj19;
                                                        i19 = i74;
                                                        i126 = i66;
                                                    }
                                                }
                                                zzcuVar5 = zzcuVar8;
                                                i18 = i116;
                                                this = this;
                                                i88 = i108;
                                                i87 = i109;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                                break;
                                            } else {
                                                zzfbVar6 = (zzfb) zzeoVar;
                                                iZzj16 = zzcv.zzj(bArr6, i109, zzcuVar8);
                                                i118 = zzcuVar8.zza + iZzj16;
                                                while (iZzj16 < i118) {
                                                    iZzj16 = zzcv.zzm(bArr6, iZzj16, zzcuVar8);
                                                    zzfbVar6.zzf(zzdj.zzc(zzcuVar8.zzb));
                                                    i67 = i67;
                                                }
                                                i116 = i67;
                                                if (iZzj16 != i118) {
                                                    com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    return 0;
                                                }
                                                iZzj19 = iZzj16;
                                                zzcuVar5 = zzcuVar8;
                                                i18 = i116;
                                                i88 = i108;
                                                i87 = i109;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            break;
                                        default:
                                            if (z14 == 3) {
                                                i119 = ((i74 == true ? 1 : 0) & (-8)) | 4;
                                                zzgeVarZzv = this.zzv(i122);
                                                bArr6 = bArr;
                                                i108 = i15;
                                                unsafe = unsafe6;
                                                iZzd = zzcv.zzd(zzgeVarZzv, bArr6, i75, i108, i119, zzcuVar);
                                                zzeoVar.add(zzcuVar.zzc);
                                                while (true) {
                                                    if (iZzd < i108) {
                                                        i120 = i75;
                                                        iZzj18 = zzcv.zzj(bArr6, iZzd, zzcuVar);
                                                        if (i74 == zzcuVar.zza) {
                                                            iZzd = zzcv.zzd(zzgeVarZzv, bArr6, iZzj18, i108, i119, zzcuVar);
                                                            zzeoVar.add(zzcuVar.zzc);
                                                            i75 = i120;
                                                            unsafe = unsafe;
                                                        } else {
                                                            i109 = i120;
                                                        }
                                                    } else {
                                                        i109 = i75;
                                                    }
                                                }
                                                zzcuVar5 = zzcuVar;
                                                iZzj19 = iZzd;
                                                i18 = i67;
                                                i88 = i108;
                                                i87 = i109;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            } else {
                                                unsafe = unsafe6;
                                                bArr6 = bArr;
                                                i87 = i75;
                                                i18 = i67;
                                                i123 = i123;
                                                zzcuVar5 = zzcuVar;
                                                this = this;
                                                i74 = i74 == true ? 1 : 0;
                                                i88 = i15;
                                                iZzj19 = i87;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    i18 = i67;
                                    i123 = i123;
                                    this = this;
                                    unsafe = unsafe6;
                                    i69 = i74 == true ? 1 : 0;
                                    i68 = i75;
                                    if (iZzr == 50) {
                                        unsafe8 = zzb;
                                        j14 = iArr[i122 + 2] & 1048575;
                                        switch (iZzr) {
                                            case 51:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 1) {
                                                    iZzm3 = i77 + 8;
                                                    unsafe8.putObject(obj2, j8, Double.valueOf(Double.longBitsToDouble(zzcv.zzq(bArr4, i77))));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm3;
                                                } else {
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 52:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 5) {
                                                    iZzm3 = i77 + 4;
                                                    unsafe8.putObject(obj2, j8, Float.valueOf(Float.intBitsToFloat(zzcv.zzc(bArr4, i77))));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm3;
                                                } else {
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 0) {
                                                    iZzm3 = zzcv.zzm(bArr4, i77, zzcuVar);
                                                    unsafe8.putObject(obj2, j8, Long.valueOf(zzcuVar.zzb));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm3;
                                                } else {
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 0) {
                                                    iZzm3 = zzcv.zzj(bArr4, i77, zzcuVar);
                                                    unsafe8.putObject(obj2, j8, Integer.valueOf(zzcuVar.zza));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm3;
                                                } else {
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 1) {
                                                    iZzm3 = i77 + 8;
                                                    unsafe8.putObject(obj2, j8, Long.valueOf(zzcv.zzq(bArr4, i77)));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm3;
                                                } else {
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 5) {
                                                    iZzm3 = i77 + 4;
                                                    unsafe8.putObject(obj2, j8, Integer.valueOf(zzcv.zzc(bArr4, i77)));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm3;
                                                } else {
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 58:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 0) {
                                                    iZzm3 = zzcv.zzm(bArr4, i77, zzcuVar);
                                                    if (zzcuVar.zzb != 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    unsafe8.putObject(obj2, j8, Boolean.valueOf(z16));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm3;
                                                } else {
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 59:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 2) {
                                                    iZzj2 = zzcv.zzj(bArr4, i77, zzcuVar);
                                                    i78 = zzcuVar.zza;
                                                    if (i78 == 0) {
                                                        unsafe8.putObject(obj2, j8, "");
                                                    } else {
                                                        i79 = iZzj2 + i78;
                                                        if ((i27 & 536870912) == 0 && !zzhe.zzg(bArr4, iZzj2, i79)) {
                                                            com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        unsafe8.putObject(obj2, j8, new String(bArr4, iZzj2, i78, zzep.zza));
                                                        iZzj2 = i79;
                                                    }
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzj2;
                                                } else {
                                                    unsafe = unsafe;
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 60:
                                                i19 = i69 == true ? 1 : 0;
                                                if (z14 == 2) {
                                                    Object objZzy = this.zzy(obj2, i18, i122);
                                                    int iZzo2 = zzcv.zzo(objZzy, this.zzv(i122), bArr, i68, i15, zzcuVar);
                                                    bArr4 = bArr;
                                                    zzcuVar = zzcuVar;
                                                    this.zzG(obj2, i18, i122, objZzy);
                                                    unsafe = unsafe;
                                                    iZzj19 = iZzo2;
                                                    i76 = i122;
                                                    i77 = i68;
                                                } else {
                                                    zzcuVar = zzcuVar;
                                                    bArr4 = bArr;
                                                    unsafe = unsafe;
                                                    i76 = i122;
                                                    i77 = i68;
                                                    iZzj19 = i77;
                                                }
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 61:
                                                bArr5 = bArr;
                                                zzcuVar4 = zzcuVar;
                                                i19 = i69 == true ? 1 : 0;
                                                i84 = i68;
                                                if (z14 == 2) {
                                                    iZza2 = zzcv.zza(bArr5, i84, zzcuVar4);
                                                    unsafe8.putObject(obj2, j8, zzcuVar4.zzc);
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    unsafe = unsafe;
                                                    iZzj19 = iZza2;
                                                    i76 = i122;
                                                    i77 = i84;
                                                    zzcuVar = zzcuVar4;
                                                    bArr4 = bArr5;
                                                    if (iZzj19 != i77) {
                                                        i15 = i15;
                                                        bArr7 = bArr4;
                                                        i125 = i18;
                                                        zzcuVar9 = zzcuVar;
                                                        this = this;
                                                        obj8 = obj2;
                                                        unsafe10 = unsafe;
                                                        i126 = i66;
                                                        i122 = i76;
                                                        i123 = i123;
                                                        i124 = i19 == true ? 1 : 0;
                                                        i121 = 0;
                                                    } else {
                                                        i24 = iZzj19;
                                                        i126 = i66;
                                                        i122 = i76;
                                                    }
                                                } else {
                                                    i76 = i122;
                                                    i77 = i84;
                                                    zzcuVar = zzcuVar4;
                                                    bArr4 = bArr5;
                                                    iZzj19 = i77;
                                                    if (iZzj19 != i77) {
                                                        i15 = i15;
                                                        bArr7 = bArr4;
                                                        i125 = i18;
                                                        zzcuVar9 = zzcuVar;
                                                        this = this;
                                                        obj8 = obj2;
                                                        unsafe10 = unsafe;
                                                        i126 = i66;
                                                        i122 = i76;
                                                        i123 = i123;
                                                        i124 = i19 == true ? 1 : 0;
                                                        i121 = 0;
                                                    } else {
                                                        i24 = iZzj19;
                                                        i126 = i66;
                                                        i122 = i76;
                                                    }
                                                }
                                                break;
                                            case 63:
                                                bArr5 = bArr;
                                                zzcuVar4 = zzcuVar;
                                                i84 = i68;
                                                i85 = i69 == true ? 1 : 0;
                                                if (z14 == 0) {
                                                    iZza2 = zzcv.zzj(bArr5, i84, zzcuVar4);
                                                    i86 = zzcuVar4.zza;
                                                    zzelVarZzu = this.zzu(i122);
                                                    if (zzelVarZzu != null || zzelVarZzu.zza(i86)) {
                                                        i19 = i85 == true ? 1 : 0;
                                                        unsafe8.putObject(obj2, j8, Integer.valueOf(i86));
                                                        unsafe8.putInt(obj2, j14, i18);
                                                    } else {
                                                        zzgt zzgtVarZzd = zzd(obj2);
                                                        Long lValueOf = Long.valueOf(i86);
                                                        i19 = i85 == true ? 1 : 0;
                                                        zzgtVarZzd.zzj(i19 == true ? 1 : 0, lValueOf);
                                                    }
                                                    unsafe = unsafe;
                                                    iZzj19 = iZza2;
                                                    i76 = i122;
                                                    i77 = i84;
                                                    zzcuVar = zzcuVar4;
                                                    bArr4 = bArr5;
                                                    if (iZzj19 != i77) {
                                                        i15 = i15;
                                                        bArr7 = bArr4;
                                                        i125 = i18;
                                                        zzcuVar9 = zzcuVar;
                                                        this = this;
                                                        obj8 = obj2;
                                                        unsafe10 = unsafe;
                                                        i126 = i66;
                                                        i122 = i76;
                                                        i123 = i123;
                                                        i124 = i19 == true ? 1 : 0;
                                                        i121 = 0;
                                                    } else {
                                                        i24 = iZzj19;
                                                        i126 = i66;
                                                        i122 = i76;
                                                    }
                                                }
                                                i19 = i85;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                iZzj19 = i77;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 66:
                                                bArr5 = bArr;
                                                zzcuVar4 = zzcuVar;
                                                i84 = i68;
                                                i85 = i69 == true ? 1 : 0;
                                                if (z14 == 0) {
                                                    int iZzj20 = zzcv.zzj(bArr5, i84, zzcuVar4);
                                                    unsafe8.putObject(obj2, j8, Integer.valueOf(zzdj.zzb(zzcuVar4.zza)));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzj20;
                                                    i19 = i85;
                                                    i76 = i122;
                                                    i77 = i84;
                                                    zzcuVar = zzcuVar4;
                                                    bArr4 = bArr5;
                                                    if (iZzj19 != i77) {
                                                        i15 = i15;
                                                        bArr7 = bArr4;
                                                        i125 = i18;
                                                        zzcuVar9 = zzcuVar;
                                                        this = this;
                                                        obj8 = obj2;
                                                        unsafe10 = unsafe;
                                                        i126 = i66;
                                                        i122 = i76;
                                                        i123 = i123;
                                                        i124 = i19 == true ? 1 : 0;
                                                        i121 = 0;
                                                    } else {
                                                        i24 = iZzj19;
                                                        i126 = i66;
                                                        i122 = i76;
                                                    }
                                                }
                                                i19 = i85;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                iZzj19 = i77;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            case 67:
                                                bArr5 = bArr;
                                                zzcuVar4 = zzcuVar;
                                                i84 = i68;
                                                if (z14 == 0) {
                                                    int iZzm6 = zzcv.zzm(bArr5, i84, zzcuVar4);
                                                    i85 = i69 == true ? 1 : 0;
                                                    unsafe8.putObject(obj2, j8, Long.valueOf(zzdj.zzc(zzcuVar4.zzb)));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                    iZzj19 = iZzm6;
                                                    i19 = i85;
                                                    i76 = i122;
                                                    i77 = i84;
                                                    zzcuVar = zzcuVar4;
                                                    bArr4 = bArr5;
                                                    if (iZzj19 != i77) {
                                                        i15 = i15;
                                                        bArr7 = bArr4;
                                                        i125 = i18;
                                                        zzcuVar9 = zzcuVar;
                                                        this = this;
                                                        obj8 = obj2;
                                                        unsafe10 = unsafe;
                                                        i126 = i66;
                                                        i122 = i76;
                                                        i123 = i123;
                                                        i124 = i19 == true ? 1 : 0;
                                                        i121 = 0;
                                                    } else {
                                                        i24 = iZzj19;
                                                        i126 = i66;
                                                        i122 = i76;
                                                    }
                                                } else {
                                                    i19 = i69 == true ? 1 : 0;
                                                    i76 = i122;
                                                    i77 = i84;
                                                    zzcuVar = zzcuVar4;
                                                    bArr4 = bArr5;
                                                    iZzj19 = i77;
                                                    if (iZzj19 != i77) {
                                                        i15 = i15;
                                                        bArr7 = bArr4;
                                                        i125 = i18;
                                                        zzcuVar9 = zzcuVar;
                                                        this = this;
                                                        obj8 = obj2;
                                                        unsafe10 = unsafe;
                                                        i126 = i66;
                                                        i122 = i76;
                                                        i123 = i123;
                                                        i124 = i19 == true ? 1 : 0;
                                                        i121 = 0;
                                                    } else {
                                                        i24 = iZzj19;
                                                        i126 = i66;
                                                        i122 = i76;
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (z14 == 3) {
                                                    int i146 = ((i69 == true ? 1 : 0) & (-8)) | 4;
                                                    Object objZzy2 = this.zzy(obj2, i18, i122);
                                                    zzcuVar4 = zzcuVar;
                                                    int iZzn2 = zzcv.zzn(objZzy2, this.zzv(i122), bArr, i68, i15, i146, zzcuVar4);
                                                    bArr5 = bArr;
                                                    i84 = i68;
                                                    this.zzG(obj2, i18, i122, objZzy2);
                                                    unsafe = unsafe;
                                                    iZzj19 = iZzn2;
                                                    i19 = i69 == true ? 1 : 0;
                                                    i76 = i122;
                                                    i77 = i84;
                                                    zzcuVar = zzcuVar4;
                                                    bArr4 = bArr5;
                                                    if (iZzj19 != i77) {
                                                        i15 = i15;
                                                        bArr7 = bArr4;
                                                        i125 = i18;
                                                        zzcuVar9 = zzcuVar;
                                                        this = this;
                                                        obj8 = obj2;
                                                        unsafe10 = unsafe;
                                                        i126 = i66;
                                                        i122 = i76;
                                                        i123 = i123;
                                                        i124 = i19 == true ? 1 : 0;
                                                        i121 = 0;
                                                    } else {
                                                        i24 = iZzj19;
                                                        i126 = i66;
                                                        i122 = i76;
                                                    }
                                                    break;
                                                }
                                            default:
                                                i76 = i122;
                                                i77 = i68;
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                unsafe = unsafe;
                                                i19 = i69 == true ? 1 : 0;
                                                iZzj19 = i77;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                        }
                                    } else {
                                        if (z14 == 2) {
                                            unsafe7 = zzb;
                                            Object objZzw = this.zzw(i122);
                                            object = unsafe7.getObject(obj2, j8);
                                            if (!((zzfg) object).zze()) {
                                                zzfg zzfgVarZzb = zzfg.zza().zzb();
                                                zzfh.zza(zzfgVarZzb, object);
                                                unsafe7.putObject(obj2, j8, zzfgVarZzb);
                                            }
                                            throw null;
                                        }
                                        unsafe = unsafe;
                                        i24 = i68;
                                        i19 = i69;
                                        i126 = i66;
                                    }
                                }
                            } else if (z14 == 2) {
                                zzeoVarZzd = (zzeo) unsafe6.getObject(obj7, j8);
                                if (!zzeoVarZzd.zzc()) {
                                    int size3 = zzeoVarZzd.size();
                                    zzeoVarZzd = zzeoVarZzd.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe6.putObject(obj7, j8, zzeoVarZzd);
                                }
                                bArr7 = bArr;
                                int iZzf = zzcv.zzf(this.zzv(i122), i124 == true ? 1 : 0, bArr7, i128, i15, zzeoVarZzd, zzcuVar);
                                i15 = i15;
                                zzcuVar9 = zzcuVar;
                                iZzj19 = iZzf;
                                unsafe10 = unsafe6;
                                obj8 = obj;
                                i121 = 0;
                                i124 = i124 == true ? 1 : 0;
                                i125 = i67;
                                i126 = i66;
                            } else {
                                obj2 = obj7;
                                i18 = i67;
                                i68 = i128;
                                i69 = i124 == true ? 1 : 0;
                                i123 = i123;
                                this = this;
                                unsafe = unsafe6;
                                unsafe = unsafe;
                                i24 = i68;
                                i19 = i69;
                                i126 = i66;
                            }
                            if (i19 == i16) {
                            }
                            if (this.zzh) {
                                zzdsVar = zzcuVar.zzd;
                                int i131110 = zzds.zzb;
                                int i131111 = zzfu.zza;
                                if (zzdsVar != zzds.zza) {
                                    zzfm zzfmVar15 = this.zzg;
                                    zzgsVar = this.zzl;
                                    zzefVarZzb = zzdsVar.zzb(zzfmVar15, i18);
                                    if (zzefVarZzb == null) {
                                        i15 = i15;
                                        i25 = i19;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    } else {
                                        i25 = i19;
                                        zzed zzedVar15 = (zzed) obj2;
                                        zzedVar15.zzc();
                                        i15 = i15;
                                        iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar15, zzefVarZzb, zzgsVar, zzcuVar);
                                    }
                                } else {
                                    i25 = i19;
                                    i15 = i15;
                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                }
                            } else {
                                i25 = i19;
                                i15 = i15;
                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                            }
                            iZzj19 = iZzi;
                            bArr7 = bArr;
                            zzcuVar9 = zzcuVar;
                            i125 = i18;
                            i122 = i122;
                            this = this;
                            obj8 = obj2;
                            i123 = i123;
                            i121 = 0;
                            i124 = i25;
                            unsafe10 = unsafe;
                        }
                    }
                    if (i19 == i16) {
                    }
                    if (this.zzh) {
                        zzdsVar = zzcuVar.zzd;
                        int i131112 = zzds.zzb;
                        int i131113 = zzfu.zza;
                        if (zzdsVar != zzds.zza) {
                            zzfm zzfmVar16 = this.zzg;
                            zzgsVar = this.zzl;
                            zzefVarZzb = zzdsVar.zzb(zzfmVar16, i18);
                            if (zzefVarZzb == null) {
                                i15 = i15;
                                i25 = i19;
                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                            } else {
                                i25 = i19;
                                zzed zzedVar16 = (zzed) obj2;
                                zzedVar16.zzc();
                                i15 = i15;
                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar16, zzefVarZzb, zzgsVar, zzcuVar);
                            }
                        } else {
                            i25 = i19;
                            i15 = i15;
                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                        }
                    } else {
                        i25 = i19;
                        i15 = i15;
                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                    }
                    iZzj19 = iZzi;
                    bArr7 = bArr;
                    zzcuVar9 = zzcuVar;
                    i125 = i18;
                    i122 = i122;
                    this = this;
                    obj8 = obj2;
                    i123 = i123;
                    i121 = 0;
                    i124 = i25;
                    unsafe10 = unsafe;
                }
                i122 = iZzq;
                i17 = -1;
                if (i122 == i17) {
                    unsafe = unsafe10;
                    i18 = i129;
                    i122 = i121;
                    i123 = i123;
                    i19 = i124 == true ? 1 : 0;
                    this = this;
                    obj2 = obj8;
                    i24 = i128;
                } else {
                    z14 = (i124 == true ? 1 : 0) & 7;
                    iArr = this.zzc;
                    i26 = i121;
                    i27 = iArr[i122 + 1];
                    iZzr = zzr(i27);
                    j8 = i27 & 1048575;
                    i125 = i129;
                    if (iZzr <= 17) {
                        int i1320 = iArr[i122 + 2];
                        i28 = 1 << (i1320 >>> 20);
                        i29 = i1320 & 1048575;
                        if (i29 != i126) {
                            i65 = 1048575;
                            if (i126 != 1048575) {
                                unsafe10.putInt(obj8, i126, i123);
                                i65 = 1048575;
                            }
                            if (i29 == i65) {
                                i30 = i26;
                            } else {
                                i30 = unsafe10.getInt(obj8, i29);
                            }
                            i34 = i29;
                        } else {
                            i30 = i123;
                            i34 = i126;
                        }
                        switch (iZzr) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe10;
                                obj3 = obj8;
                                i35 = i30;
                                i37 = i128;
                                i36 = i34;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 1) {
                                    i38 = i37 + 8;
                                    i123 = i35 | i28;
                                    zzgz.zzo(obj3, j8, Double.longBitsToDouble(zzcv.zzq(bArr2, i37)));
                                    obj8 = obj3;
                                    unsafe10 = unsafe2;
                                    iZzj19 = i38;
                                    zzcuVar9 = zzcuVar2;
                                    bArr7 = bArr2;
                                    i126 = i36;
                                    i121 = 0;
                                    i15 = i15;
                                } else {
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i131114 = zzds.zzb;
                                        int i131115 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar17 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar17, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar17 = (zzed) obj2;
                                                zzedVar17.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar17, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe10;
                                obj3 = obj8;
                                i35 = i30;
                                i37 = i128;
                                i36 = i34;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 5) {
                                    i38 = i37 + 4;
                                    i123 = i35 | i28;
                                    zzgz.zzp(obj3, j8, Float.intBitsToFloat(zzcv.zzc(bArr2, i37)));
                                    obj8 = obj3;
                                    unsafe10 = unsafe2;
                                    iZzj19 = i38;
                                    zzcuVar9 = zzcuVar2;
                                    bArr7 = bArr2;
                                    i126 = i36;
                                    i121 = 0;
                                    i15 = i15;
                                } else {
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i131116 = zzds.zzb;
                                        int i131117 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar18 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar18, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar18 = (zzed) obj2;
                                                zzedVar18.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar18, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                unsafe3 = unsafe10;
                                obj3 = obj8;
                                i35 = i30;
                                i37 = i128;
                                i36 = i34;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 0) {
                                    i123 = i35 | i28;
                                    iZzm = zzcv.zzm(bArr2, i37, zzcuVar2);
                                    obj8 = obj3;
                                    unsafe10 = unsafe3;
                                    unsafe10.putLong(obj8, j8, zzcuVar2.zzb);
                                    i15 = i15;
                                    zzcuVar9 = zzcuVar2;
                                    iZzj19 = iZzm;
                                    bArr7 = bArr2;
                                    i122 = i122;
                                    i126 = i36;
                                    i125 = i125;
                                    i121 = 0;
                                } else {
                                    unsafe2 = unsafe3;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i131118 = zzds.zzb;
                                        int i131119 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar19 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar19, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar19 = (zzed) obj2;
                                                zzedVar19.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar19, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                unsafe3 = unsafe10;
                                obj3 = obj8;
                                i35 = i30;
                                i37 = i128;
                                i36 = i34;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 0) {
                                    i123 = i35 | i28;
                                    iZzj19 = zzcv.zzj(bArr2, i37, zzcuVar2);
                                    unsafe3.putInt(obj3, j8, zzcuVar2.zza);
                                    obj8 = obj3;
                                    zzcuVar9 = zzcuVar2;
                                    bArr7 = bArr2;
                                    unsafe10 = unsafe3;
                                    i122 = i122;
                                    i126 = i36;
                                    i125 = i125;
                                    i121 = 0;
                                } else {
                                    unsafe2 = unsafe3;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i1311110 = zzds.zzb;
                                        int i1311111 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar110 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar110, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar110 = (zzed) obj2;
                                                zzedVar110.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar110, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe3 = unsafe10;
                                obj4 = obj8;
                                i35 = i30;
                                i37 = i128;
                                i36 = i34;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 1) {
                                    iZzm = i37 + 8;
                                    i123 = i35 | i28;
                                    long jZzq2 = zzcv.zzq(bArr, i37);
                                    obj8 = obj4;
                                    bArr2 = bArr;
                                    unsafe10 = unsafe3;
                                    unsafe10.putLong(obj8, j8, jZzq2);
                                    i15 = i15;
                                    zzcuVar9 = zzcuVar2;
                                    iZzj19 = iZzm;
                                    bArr7 = bArr2;
                                    i122 = i122;
                                    i126 = i36;
                                    i125 = i125;
                                    i121 = 0;
                                } else {
                                    bArr2 = bArr;
                                    obj3 = obj4;
                                    unsafe2 = unsafe3;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i1311112 = zzds.zzb;
                                        int i1311113 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar111 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar111, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar111 = (zzed) obj2;
                                                zzedVar111.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar111, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 6:
                            case 13:
                                unsafe3 = unsafe10;
                                obj5 = obj8;
                                i35 = i30;
                                i37 = i128;
                                bArr3 = bArr;
                                i36 = i34;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 5) {
                                    i123 = i35 | i28;
                                    unsafe3.putInt(obj5, j8, zzcv.zzc(bArr3, i37));
                                    i15 = i15;
                                    iZzj19 = i37 + 4;
                                    zzcuVar9 = zzcuVar2;
                                    obj8 = obj5;
                                    i122 = i122;
                                    i126 = i36;
                                    i125 = i125;
                                    i121 = 0;
                                    bArr7 = bArr3;
                                    unsafe10 = unsafe3;
                                } else {
                                    Object obj16 = obj5;
                                    bArr2 = bArr3;
                                    obj3 = obj16;
                                    unsafe2 = unsafe3;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i1311114 = zzds.zzb;
                                        int i1311115 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar112 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar112, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar112 = (zzed) obj2;
                                                zzedVar112.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar112, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 7:
                                unsafe3 = unsafe10;
                                obj5 = obj8;
                                i35 = i30;
                                i37 = i128;
                                bArr3 = bArr;
                                i36 = i34;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 0) {
                                    i123 = i35 | i28;
                                    iZzm2 = zzcv.zzm(bArr3, i37, zzcuVar2);
                                    if (zzcuVar2.zzb != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    zzgz.zzm(obj5, j8, z15);
                                    bArr7 = bArr3;
                                    iZzj19 = iZzm2;
                                    zzcuVar9 = zzcuVar2;
                                    obj8 = obj5;
                                    unsafe10 = unsafe3;
                                    i122 = i122;
                                    i126 = i36;
                                    i125 = i125;
                                    i121 = 0;
                                } else {
                                    Object obj17 = obj5;
                                    bArr2 = bArr3;
                                    obj3 = obj17;
                                    unsafe2 = unsafe3;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i1311116 = zzds.zzb;
                                        int i1311117 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar113 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar113, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar113 = (zzed) obj2;
                                                zzedVar113.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar113, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 8:
                                unsafe3 = unsafe10;
                                obj5 = obj8;
                                i35 = i30;
                                i37 = i128;
                                bArr3 = bArr;
                                zzcuVar2 = zzcuVar;
                                if (z14 == 2) {
                                    if ((i27 & 536870912) != 0) {
                                        iZzm2 = zzcv.zzj(bArr3, i37, zzcuVar2);
                                        i39 = zzcuVar2.zza;
                                        if (i39 >= 0) {
                                            com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return i26;
                                        }
                                        i44 = i35 | i28;
                                        if (i39 == 0) {
                                            zzcuVar2.zzc = "";
                                            i49 = i44;
                                            i36 = i34;
                                        } else {
                                            length = bArr3.length;
                                            int i147 = zzhe.zza;
                                            if ((iZzm2 | i39 | ((length - iZzm2) - i39)) >= 0) {
                                                com.google.protobuf.a.l("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iZzm2), Integer.valueOf(i39)});
                                                return i26;
                                            }
                                            i45 = iZzm2 + i39;
                                            cArr = new char[i39];
                                            i46 = i26;
                                            while (true) {
                                                i47 = iZzm2;
                                                if (iZzm2 < i45) {
                                                    b16 = bArr3[i47];
                                                    if (zzha.zzd(b16)) {
                                                        cArr[i46] = (char) b16;
                                                        iZzm2 = i47 + 1;
                                                        i46++;
                                                    }
                                                }
                                            }
                                            i48 = i47;
                                            while (i48 < i45) {
                                                i54 = i48;
                                                i48 = i54 + 1;
                                                i44 = i44;
                                                b14 = bArr3[i54];
                                                if (zzha.zzd(b14)) {
                                                    i55 = i46 + 1;
                                                    cArr[i46] = (char) b14;
                                                    while (true) {
                                                        i46 = i55;
                                                        if (i48 < i45) {
                                                            b15 = bArr3[i48];
                                                            if (zzha.zzd(b15)) {
                                                                i48++;
                                                                i55 = i46 + 1;
                                                                cArr[i46] = (char) b15;
                                                            }
                                                        }
                                                    }
                                                    i44 = i44;
                                                } else {
                                                    int i148 = i34;
                                                    if (b14 < -32) {
                                                        if (b14 < -16) {
                                                            i56 = i45;
                                                            if (i48 < i56 - 2) {
                                                                com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                                return i26;
                                                            }
                                                            char[] cArr3 = cArr;
                                                            zzha.zza(b14, bArr3[i48], bArr3[i54 + 2], bArr3[i54 + 3], cArr3, i46);
                                                            i46 += 2;
                                                            cArr = cArr3;
                                                            i48 = i54 + 4;
                                                        } else {
                                                            if (i48 < i45 - 1) {
                                                                com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                                return i26;
                                                            }
                                                            i56 = i45;
                                                            zzha.zzb(b14, bArr3[i48], bArr3[i54 + 2], cArr, i46);
                                                            i46++;
                                                            i48 = i54 + 3;
                                                        }
                                                        i45 = i56;
                                                    } else {
                                                        if (i48 < i45) {
                                                            com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                            return i26;
                                                        }
                                                        zzha.zzc(b14, bArr3[i48], cArr, i46);
                                                        i44 = i44;
                                                        i46++;
                                                        i48 = i54 + 2;
                                                    }
                                                    i34 = i148;
                                                }
                                            }
                                            i49 = i44;
                                            i36 = i34;
                                            zzcuVar2.zzc = new String(cArr, i26, i46);
                                            iZzm2 = i45;
                                        }
                                        i123 = i49;
                                    } else {
                                        i36 = i34;
                                        iZzm2 = zzcv.zzh(bArr3, i37, zzcuVar2);
                                        i123 = i35 | i28;
                                    }
                                    unsafe3.putObject(obj5, j8, zzcuVar2.zzc);
                                    bArr7 = bArr3;
                                    iZzj19 = iZzm2;
                                    zzcuVar9 = zzcuVar2;
                                    obj8 = obj5;
                                    unsafe10 = unsafe3;
                                    i122 = i122;
                                    i126 = i36;
                                    i125 = i125;
                                    i121 = 0;
                                } else {
                                    i36 = i34;
                                    Object obj18 = obj5;
                                    bArr2 = bArr3;
                                    obj3 = obj18;
                                    unsafe2 = unsafe3;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i1311118 = zzds.zzb;
                                        int i1311119 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar114 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar114, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar114 = (zzed) obj2;
                                                zzedVar114.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar114, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 9:
                                obj6 = obj8;
                                unsafe4 = unsafe10;
                                i35 = i30;
                                if (z14 == 2) {
                                    i57 = i35 | i28;
                                    Object objZzx3 = this.zzx(obj6, i122);
                                    int iZzo3 = zzcv.zzo(objZzx3, this.zzv(i122), bArr, i128, i15, zzcuVar);
                                    this.zzF(obj6, i122, objZzx3);
                                    i15 = i15;
                                    zzcuVar9 = zzcuVar;
                                    bArr7 = bArr;
                                    iZzj19 = iZzo3;
                                    obj8 = obj6;
                                    unsafe10 = unsafe4;
                                    i122 = i122;
                                    i126 = i34;
                                    i121 = i26;
                                    i123 = i57;
                                    i125 = i125;
                                } else {
                                    i37 = i128;
                                    bArr2 = bArr;
                                    obj3 = obj6;
                                    zzcuVar2 = zzcuVar;
                                    unsafe2 = unsafe4;
                                    i36 = i34;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i13111110 = zzds.zzb;
                                        int i13111111 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar115 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar115, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar115 = (zzed) obj2;
                                                zzedVar115.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar115, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 10:
                                Object obj19 = obj8;
                                unsafe5 = unsafe10;
                                obj3 = obj19;
                                bArr2 = bArr;
                                zzcuVar3 = zzcuVar;
                                i35 = i30;
                                i58 = i128;
                                if (z14 == 2) {
                                    i59 = i35 | i28;
                                    iZza = zzcv.zza(bArr2, i58, zzcuVar3);
                                    unsafe5.putObject(obj3, j8, zzcuVar3.zzc);
                                    Unsafe unsafe14 = unsafe5;
                                    obj8 = obj3;
                                    unsafe10 = unsafe14;
                                    int i149 = i34;
                                    i123 = i59;
                                    bArr7 = bArr2;
                                    i126 = i149;
                                    iZzj19 = iZza;
                                    zzcuVar9 = zzcuVar3;
                                    i121 = i26;
                                    i15 = i15;
                                } else {
                                    unsafe2 = unsafe5;
                                    i37 = i58;
                                    zzcuVar2 = zzcuVar3;
                                    i36 = i34;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i13111112 = zzds.zzb;
                                        int i13111113 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar116 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar116, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar116 = (zzed) obj2;
                                                zzedVar116.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar116, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 12:
                                Object obj110 = obj8;
                                unsafe5 = unsafe10;
                                obj3 = obj110;
                                bArr2 = bArr;
                                zzcuVar3 = zzcuVar;
                                i35 = i30;
                                i58 = i128;
                                if (z14 == 0) {
                                    iZzj = zzcv.zzj(bArr2, i58, zzcuVar3);
                                    i64 = zzcuVar3.zza;
                                    zzel zzelVarZzu4 = this.zzu(i122);
                                    if ((i27 & Integer.MIN_VALUE) != 0) {
                                    }
                                    i57 = i35 | i28;
                                    unsafe5.putInt(obj3, j8, i64);
                                    obj8 = obj3;
                                    unsafe10 = unsafe5;
                                    iZzj19 = iZzj;
                                    bArr7 = bArr2;
                                    zzcuVar9 = zzcuVar3;
                                    i122 = i122;
                                    i126 = i34;
                                    i121 = i26;
                                    i123 = i57;
                                    i125 = i125;
                                } else {
                                    unsafe2 = unsafe5;
                                    i37 = i58;
                                    zzcuVar2 = zzcuVar3;
                                    i36 = i34;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i13111114 = zzds.zzb;
                                        int i13111115 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar117 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar117, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar117 = (zzed) obj2;
                                                zzedVar117.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar117, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 15:
                                Object obj111 = obj8;
                                unsafe5 = unsafe10;
                                obj3 = obj111;
                                bArr2 = bArr;
                                zzcuVar3 = zzcuVar;
                                i35 = i30;
                                i58 = i128;
                                if (z14 == 0) {
                                    i59 = i35 | i28;
                                    iZza = zzcv.zzj(bArr2, i58, zzcuVar3);
                                    unsafe5.putInt(obj3, j8, zzdj.zzb(zzcuVar3.zza));
                                    Unsafe unsafe15 = unsafe5;
                                    obj8 = obj3;
                                    unsafe10 = unsafe15;
                                    int i1410 = i34;
                                    i123 = i59;
                                    bArr7 = bArr2;
                                    i126 = i1410;
                                    iZzj19 = iZza;
                                    zzcuVar9 = zzcuVar3;
                                    i121 = i26;
                                    i15 = i15;
                                } else {
                                    unsafe2 = unsafe5;
                                    i37 = i58;
                                    zzcuVar2 = zzcuVar3;
                                    i36 = i34;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i13111116 = zzds.zzb;
                                        int i13111117 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar118 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar118, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar118 = (zzed) obj2;
                                                zzedVar118.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar118, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            case 16:
                                bArr2 = bArr;
                                zzcuVar3 = zzcuVar;
                                if (z14 == 0) {
                                    i57 = i28 | i30;
                                    int iZzm7 = zzcv.zzm(bArr2, i128, zzcuVar3);
                                    unsafe10.putLong(obj8, j8, zzdj.zzc(zzcuVar3.zzb));
                                    obj8 = obj8;
                                    unsafe10 = unsafe10;
                                    iZzj19 = iZzm7;
                                    bArr7 = bArr2;
                                    zzcuVar9 = zzcuVar3;
                                    i122 = i122;
                                    i126 = i34;
                                    i121 = i26;
                                    i123 = i57;
                                    i125 = i125;
                                } else {
                                    Object obj112 = obj8;
                                    Unsafe unsafe16 = unsafe10;
                                    obj3 = obj112;
                                    unsafe2 = unsafe16;
                                    i37 = i128;
                                    i35 = i30;
                                    zzcuVar2 = zzcuVar3;
                                    i36 = i34;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i13111118 = zzds.zzb;
                                        int i13111119 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar119 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar119, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar119 = (zzed) obj2;
                                                zzedVar119.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar119, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                            default:
                                if (z14 == 3) {
                                    int i1411 = i30 | i28;
                                    Object objZzx4 = this.zzx(obj8, i122);
                                    int iZzn3 = zzcv.zzn(objZzx4, this.zzv(i122), bArr, i128, i15, (i125 << 3) | 4, zzcuVar);
                                    this.zzF(obj8, i122, objZzx4);
                                    iZzj19 = iZzn3;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i122 = i122;
                                    i126 = i34;
                                    i125 = i125;
                                    i15 = i15;
                                    i123 = i1411;
                                    i121 = i26;
                                } else {
                                    bArr2 = bArr;
                                    zzcuVar2 = zzcuVar;
                                    unsafe2 = unsafe10;
                                    obj3 = obj8;
                                    i35 = i30;
                                    i36 = i34;
                                    i37 = i128;
                                    i123 = i35;
                                    this = this;
                                    unsafe = unsafe2;
                                    zzcuVar = zzcuVar2;
                                    i19 = i124 == true ? 1 : 0;
                                    i126 = i36;
                                    i18 = i125;
                                    obj2 = obj3;
                                    i24 = i37;
                                    if (i19 == i16) {
                                    }
                                    if (this.zzh) {
                                        zzdsVar = zzcuVar.zzd;
                                        int i131111110 = zzds.zzb;
                                        int i131111111 = zzfu.zza;
                                        if (zzdsVar != zzds.zza) {
                                            zzfm zzfmVar1110 = this.zzg;
                                            zzgsVar = this.zzl;
                                            zzefVarZzb = zzdsVar.zzb(zzfmVar1110, i18);
                                            if (zzefVarZzb == null) {
                                                i15 = i15;
                                                i25 = i19;
                                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                            } else {
                                                i25 = i19;
                                                zzed zzedVar1110 = (zzed) obj2;
                                                zzedVar1110.zzc();
                                                i15 = i15;
                                                iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar1110, zzefVarZzb, zzgsVar, zzcuVar);
                                            }
                                        } else {
                                            i25 = i19;
                                            i15 = i15;
                                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                        }
                                    } else {
                                        i25 = i19;
                                        i15 = i15;
                                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                    }
                                    iZzj19 = iZzi;
                                    bArr7 = bArr;
                                    zzcuVar9 = zzcuVar;
                                    i125 = i18;
                                    i122 = i122;
                                    this = this;
                                    obj8 = obj2;
                                    i123 = i123;
                                    i121 = 0;
                                    i124 = i25;
                                    unsafe10 = unsafe;
                                }
                                break;
                        }
                    } else {
                        unsafe6 = unsafe10;
                        obj7 = obj8;
                        i66 = i126;
                        i67 = i125;
                        if (iZzr == 27) {
                            i74 = i124 == true ? 1 : 0;
                            obj2 = obj7;
                            i75 = i128;
                            if (iZzr <= 49) {
                                j15 = i27;
                                unsafe9 = zzb;
                                zzeoVarZzd2 = (zzeo) unsafe9.getObject(obj2, j8);
                                if (!zzeoVarZzd2.zzc()) {
                                    int size4 = zzeoVarZzd2.size();
                                    zzeoVarZzd2 = zzeoVarZzd2.zzd(size4 != 0 ? size4 + size4 : 10);
                                    unsafe9.putObject(obj2, j8, zzeoVarZzd2);
                                }
                                zzeoVar = zzeoVarZzd2;
                                str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                switch (iZzr) {
                                    case 18:
                                    case 35:
                                        bArr6 = bArr;
                                        i87 = i75;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        zzcuVar5 = zzcuVar;
                                        i74 = i74 == true ? 1 : 0;
                                        i123 = i123;
                                        i88 = i15;
                                        this = this;
                                        if (z14 == 2) {
                                            zzdpVar2 = (zzdp) zzeoVar;
                                            iZzj4 = zzcv.zzj(bArr6, i87, zzcuVar5);
                                            i93 = zzcuVar5.zza + iZzj4;
                                            while (iZzj4 < i93) {
                                                zzdpVar2.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, iZzj4)));
                                                iZzj4 += 8;
                                            }
                                            if (iZzj4 != i93) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            if (z14 == 1) {
                                                i89 = i87 + 8;
                                                zzdpVar = (zzdp) zzeoVar;
                                                zzdpVar.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, i87)));
                                                while (i89 < i88) {
                                                    iZzj3 = zzcv.zzj(bArr6, i89, zzcuVar5);
                                                    if (i74 == zzcuVar5.zza) {
                                                        zzdpVar.zzf(Double.longBitsToDouble(zzcv.zzq(bArr6, iZzj3)));
                                                        i89 = iZzj3 + 8;
                                                    } else {
                                                        iZzj19 = i89;
                                                    }
                                                }
                                                iZzj19 = i89;
                                            } else {
                                                iZzj19 = i87;
                                            }
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        bArr6 = bArr;
                                        i87 = i75;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        zzcuVar5 = zzcuVar;
                                        i74 = i74 == true ? 1 : 0;
                                        i123 = i123;
                                        i88 = i15;
                                        this = this;
                                        if (z14 == 2) {
                                            zzdzVar2 = (zzdz) zzeoVar;
                                            iZzj4 = zzcv.zzj(bArr6, i87, zzcuVar5);
                                            i94 = zzcuVar5.zza + iZzj4;
                                            while (iZzj4 < i94) {
                                                zzdzVar2.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, iZzj4)));
                                                iZzj4 += 4;
                                            }
                                            if (iZzj4 != i94) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            if (z14 == 5) {
                                                i89 = i87 + 4;
                                                zzdzVar = (zzdz) zzeoVar;
                                                zzdzVar.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, i87)));
                                                while (i89 < i88) {
                                                    iZzj5 = zzcv.zzj(bArr6, i89, zzcuVar5);
                                                    if (i74 == zzcuVar5.zza) {
                                                        zzdzVar.zzh(Float.intBitsToFloat(zzcv.zzc(bArr6, iZzj5)));
                                                        i89 = iZzj5 + 4;
                                                    } else {
                                                        iZzj19 = i89;
                                                    }
                                                }
                                                iZzj19 = i89;
                                            } else {
                                                iZzj19 = i87;
                                            }
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        bArr6 = bArr;
                                        i87 = i75;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        zzcuVar5 = zzcuVar;
                                        i74 = i74 == true ? 1 : 0;
                                        i123 = i123;
                                        i88 = i15;
                                        this = this;
                                        if (z14 == 2) {
                                            if (z14 == 0) {
                                                zzfbVar = (zzfb) zzeoVar;
                                                iZzj4 = zzcv.zzm(bArr6, i87, zzcuVar5);
                                                zzfbVar.zzf(zzcuVar5.zzb);
                                                while (iZzj4 < i88) {
                                                    iZzj6 = zzcv.zzj(bArr6, iZzj4, zzcuVar5);
                                                    if (i74 == zzcuVar5.zza) {
                                                        iZzj4 = zzcv.zzm(bArr6, iZzj6, zzcuVar5);
                                                        zzfbVar.zzf(zzcuVar5.zzb);
                                                    }
                                                }
                                            } else {
                                                iZzj19 = i87;
                                            }
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            zzfbVar2 = (zzfb) zzeoVar;
                                            iZzj4 = zzcv.zzj(bArr6, i87, zzcuVar5);
                                            i95 = zzcuVar5.zza + iZzj4;
                                            while (iZzj4 < i95) {
                                                int iZzm8 = zzcv.zzm(bArr6, iZzj4, zzcuVar5);
                                                zzfbVar2.zzf(zzcuVar5.zzb);
                                                str = str;
                                                iZzj4 = iZzm8;
                                            }
                                            str2 = str;
                                            if (iZzj4 != i95) {
                                                com.google.android.gms.internal.measurement.a.r(str2);
                                                return 0;
                                            }
                                        }
                                        iZzj19 = iZzj4;
                                        if (iZzj19 != i87) {
                                            zzcuVar9 = zzcuVar5;
                                            i15 = i88;
                                            i125 = i18;
                                            this = this;
                                            unsafe10 = unsafe;
                                            i123 = i123;
                                            i121 = 0;
                                            bArr7 = bArr6;
                                            obj8 = obj2;
                                            i124 = i74;
                                            i126 = i66;
                                        } else {
                                            zzcuVar = zzcuVar5;
                                            i24 = iZzj19;
                                            i19 = i74;
                                            i126 = i66;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        bArr6 = bArr;
                                        i96 = i15;
                                        zzcuVar6 = zzcuVar;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        i123 = i123;
                                        this = this;
                                        if (z14 == 2) {
                                            if (z14 == 0) {
                                                iZzj4 = zzcv.zzl(i74 == true ? 1 : 0, bArr6, i75, i96, zzeoVar, zzcuVar6);
                                                i74 = i74 == true ? 1 : 0;
                                                i88 = i96;
                                                i87 = i75;
                                                zzcuVar5 = zzcuVar6;
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74 == true ? 1 : 0;
                                            i88 = i96;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            iZzj4 = zzcv.zzg(bArr6, i75, zzeoVar, zzcuVar6);
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74;
                                            i88 = i96;
                                        }
                                        iZzj19 = iZzj4;
                                        if (iZzj19 != i87) {
                                            zzcuVar9 = zzcuVar5;
                                            i15 = i88;
                                            i125 = i18;
                                            this = this;
                                            unsafe10 = unsafe;
                                            i123 = i123;
                                            i121 = 0;
                                            bArr7 = bArr6;
                                            obj8 = obj2;
                                            i124 = i74;
                                            i126 = i66;
                                        } else {
                                            zzcuVar = zzcuVar5;
                                            i24 = iZzj19;
                                            i19 = i74;
                                            i126 = i66;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        bArr6 = bArr;
                                        i96 = i15;
                                        zzcuVar6 = zzcuVar;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        i123 = i123;
                                        this = this;
                                        if (z14 == 2) {
                                            if (z14 == 1) {
                                                iZzj4 = i75 + 8;
                                                zzfbVar3 = (zzfb) zzeoVar;
                                                zzfbVar3.zzf(zzcv.zzq(bArr6, i75));
                                                while (iZzj4 < i96) {
                                                    iZzj7 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                    if (i74 == zzcuVar6.zza) {
                                                        zzfbVar3.zzf(zzcv.zzq(bArr6, iZzj7));
                                                        iZzj4 = iZzj7 + 8;
                                                    }
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74 == true ? 1 : 0;
                                            i88 = i96;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            zzfbVar4 = (zzfb) zzeoVar;
                                            iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                            i97 = zzcuVar6.zza + iZzj4;
                                            while (iZzj4 < i97) {
                                                zzfbVar4.zzf(zzcv.zzq(bArr6, iZzj4));
                                                iZzj4 += 8;
                                            }
                                            if (iZzj4 != i97) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        }
                                        i87 = i75;
                                        zzcuVar5 = zzcuVar6;
                                        i74 = i74;
                                        i88 = i96;
                                        iZzj19 = iZzj4;
                                        if (iZzj19 != i87) {
                                            zzcuVar9 = zzcuVar5;
                                            i15 = i88;
                                            i125 = i18;
                                            this = this;
                                            unsafe10 = unsafe;
                                            i123 = i123;
                                            i121 = 0;
                                            bArr7 = bArr6;
                                            obj8 = obj2;
                                            i124 = i74;
                                            i126 = i66;
                                        } else {
                                            zzcuVar = zzcuVar5;
                                            i24 = iZzj19;
                                            i19 = i74;
                                            i126 = i66;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        bArr6 = bArr;
                                        i96 = i15;
                                        zzcuVar6 = zzcuVar;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        i123 = i123;
                                        this = this;
                                        if (z14 == 2) {
                                            if (z14 == 5) {
                                                iZzj4 = i75 + 4;
                                                zzeiVar = (zzei) zzeoVar;
                                                zzeiVar.zzg(zzcv.zzc(bArr6, i75));
                                                while (iZzj4 < i96) {
                                                    iZzj8 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                    if (i74 == zzcuVar6.zza) {
                                                        zzeiVar.zzg(zzcv.zzc(bArr6, iZzj8));
                                                        iZzj4 = iZzj8 + 4;
                                                    }
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74 == true ? 1 : 0;
                                            i88 = i96;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            zzeiVar2 = (zzei) zzeoVar;
                                            iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                            i98 = zzcuVar6.zza + iZzj4;
                                            while (iZzj4 < i98) {
                                                zzeiVar2.zzg(zzcv.zzc(bArr6, iZzj4));
                                                iZzj4 += 4;
                                            }
                                            if (iZzj4 != i98) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        }
                                        i87 = i75;
                                        zzcuVar5 = zzcuVar6;
                                        i74 = i74;
                                        i88 = i96;
                                        iZzj19 = iZzj4;
                                        if (iZzj19 != i87) {
                                            zzcuVar9 = zzcuVar5;
                                            i15 = i88;
                                            i125 = i18;
                                            this = this;
                                            unsafe10 = unsafe;
                                            i123 = i123;
                                            i121 = 0;
                                            bArr7 = bArr6;
                                            obj8 = obj2;
                                            i124 = i74;
                                            i126 = i66;
                                        } else {
                                            zzcuVar = zzcuVar5;
                                            i24 = iZzj19;
                                            i19 = i74;
                                            i126 = i66;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        bArr6 = bArr;
                                        i96 = i15;
                                        zzcuVar6 = zzcuVar;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        i123 = i123;
                                        this = this;
                                        if (z14 == 2) {
                                            if (z14 == 0) {
                                                zzcwVar = (zzcw) zzeoVar;
                                                iZzj4 = zzcv.zzm(bArr6, i75, zzcuVar6);
                                                if (zzcuVar6.zzb != 0) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                zzcwVar.zze(z17);
                                                while (iZzj4 < i96) {
                                                    iZzj9 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                    if (i74 == zzcuVar6.zza) {
                                                        iZzj4 = zzcv.zzm(bArr6, iZzj9, zzcuVar6);
                                                        if (zzcuVar6.zzb != 0) {
                                                            z18 = true;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        zzcwVar.zze(z18);
                                                    }
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74 == true ? 1 : 0;
                                            i88 = i96;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            zzcwVar2 = (zzcw) zzeoVar;
                                            iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                            i99 = zzcuVar6.zza + iZzj4;
                                            while (iZzj4 < i99) {
                                                iZzj4 = zzcv.zzm(bArr6, iZzj4, zzcuVar6);
                                                if (zzcuVar6.zzb != 0) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                zzcwVar2.zze(z19);
                                            }
                                            if (iZzj4 != i99) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        }
                                        i87 = i75;
                                        zzcuVar5 = zzcuVar6;
                                        i74 = i74;
                                        i88 = i96;
                                        iZzj19 = iZzj4;
                                        if (iZzj19 != i87) {
                                            zzcuVar9 = zzcuVar5;
                                            i15 = i88;
                                            i125 = i18;
                                            this = this;
                                            unsafe10 = unsafe;
                                            i123 = i123;
                                            i121 = 0;
                                            bArr7 = bArr6;
                                            obj8 = obj2;
                                            i124 = i74;
                                            i126 = i66;
                                        } else {
                                            zzcuVar = zzcuVar5;
                                            i24 = iZzj19;
                                            i19 = i74;
                                            i126 = i66;
                                        }
                                        break;
                                    case 26:
                                        bArr6 = bArr;
                                        i96 = i15;
                                        zzcuVar6 = zzcuVar;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        i123 = i123;
                                        this = this;
                                        if (z14 == 2) {
                                            if ((j15 & 536870912) == 0) {
                                                iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                                i104 = zzcuVar6.zza;
                                                if (i104 >= 0) {
                                                    com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i104 == 0) {
                                                    zzeoVar.add("");
                                                } else {
                                                    zzeoVar.add(new String(bArr6, iZzj4, i104, zzep.zza));
                                                    iZzj4 += i104;
                                                }
                                                while (iZzj4 < i96) {
                                                    iZzj11 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                    if (i74 == zzcuVar6.zza) {
                                                        iZzj4 = zzcv.zzj(bArr6, iZzj11, zzcuVar6);
                                                        i105 = zzcuVar6.zza;
                                                        if (i105 >= 0) {
                                                            com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i105 == 0) {
                                                            zzeoVar.add("");
                                                        } else {
                                                            zzeoVar.add(new String(bArr6, iZzj4, i105, zzep.zza));
                                                            iZzj4 += i105;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzj4 = zzcv.zzj(bArr6, i75, zzcuVar6);
                                                i100 = zzcuVar6.zza;
                                                if (i100 >= 0) {
                                                    com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i100 == 0) {
                                                    zzeoVar.add("");
                                                } else {
                                                    i101 = iZzj4 + i100;
                                                    if (zzhe.zzg(bArr6, iZzj4, i101)) {
                                                        com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    zzeoVar.add(new String(bArr6, iZzj4, i100, zzep.zza));
                                                    iZzj4 = i101;
                                                }
                                                while (iZzj4 < i96) {
                                                    iZzj10 = zzcv.zzj(bArr6, iZzj4, zzcuVar6);
                                                    if (i74 == zzcuVar6.zza) {
                                                        iZzj4 = zzcv.zzj(bArr6, iZzj10, zzcuVar6);
                                                        i102 = zzcuVar6.zza;
                                                        if (i102 >= 0) {
                                                            com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i102 == 0) {
                                                            zzeoVar.add("");
                                                        } else {
                                                            i103 = iZzj4 + i102;
                                                            if (zzhe.zzg(bArr6, iZzj4, i103)) {
                                                                com.google.android.gms.internal.measurement.a.r("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            zzeoVar.add(new String(bArr6, iZzj4, i102, zzep.zza));
                                                            iZzj4 = i103;
                                                        }
                                                    }
                                                }
                                            }
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74;
                                            i88 = i96;
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        i87 = i75;
                                        zzcuVar5 = zzcuVar6;
                                        i74 = i74 == true ? 1 : 0;
                                        i88 = i96;
                                        iZzj19 = i87;
                                        if (iZzj19 != i87) {
                                            zzcuVar9 = zzcuVar5;
                                            i15 = i88;
                                            i125 = i18;
                                            this = this;
                                            unsafe10 = unsafe;
                                            i123 = i123;
                                            i121 = 0;
                                            bArr7 = bArr6;
                                            obj8 = obj2;
                                            i124 = i74;
                                            i126 = i66;
                                        } else {
                                            zzcuVar = zzcuVar5;
                                            i24 = iZzj19;
                                            i19 = i74;
                                            i126 = i66;
                                        }
                                        break;
                                    case 27:
                                        bArr6 = bArr;
                                        zzcuVar7 = zzcuVar;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        i123 = i123;
                                        if (z14 == 2) {
                                            this = this;
                                            i96 = i15;
                                            i87 = i75;
                                            iZzj4 = zzcv.zzf(this.zzv(i122), i74 == true ? 1 : 0, bArr6, i87, i96, zzeoVar, zzcuVar7);
                                            zzcuVar6 = zzcuVar7;
                                            i74 = i74 == true ? 1 : 0;
                                            bArr6 = bArr6;
                                            zzcuVar5 = zzcuVar6;
                                            i74 = i74;
                                            i88 = i96;
                                            iZzj19 = iZzj4;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            i74 = i74 == true ? 1 : 0;
                                            i88 = i15;
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar7;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        break;
                                    case 28:
                                        bArr6 = bArr;
                                        zzcuVar7 = zzcuVar;
                                        i18 = i67;
                                        unsafe = unsafe6;
                                        i123 = i123;
                                        if (z14 == 2) {
                                            iZzj12 = zzcv.zzj(bArr6, i75, zzcuVar7);
                                            i106 = zzcuVar7.zza;
                                            if (i106 >= 0) {
                                                com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i106 <= bArr6.length - iZzj12) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i106 == 0) {
                                                zzeoVar.add(zzdf.zzb);
                                            } else {
                                                zzeoVar.add(zzdf.zzr(bArr6, iZzj12, i106));
                                                iZzj12 += i106;
                                            }
                                            while (iZzj12 < i15) {
                                                iZzj13 = zzcv.zzj(bArr6, iZzj12, zzcuVar7);
                                                if (i74 == zzcuVar7.zza) {
                                                    i88 = i15;
                                                    i74 = i74 == true ? 1 : 0;
                                                    iZzj19 = iZzj12;
                                                    i87 = i75;
                                                    zzcuVar5 = zzcuVar7;
                                                    if (iZzj19 != i87) {
                                                        zzcuVar9 = zzcuVar5;
                                                        i15 = i88;
                                                        i125 = i18;
                                                        this = this;
                                                        unsafe10 = unsafe;
                                                        i123 = i123;
                                                        i121 = 0;
                                                        bArr7 = bArr6;
                                                        obj8 = obj2;
                                                        i124 = i74;
                                                        i126 = i66;
                                                    } else {
                                                        zzcuVar = zzcuVar5;
                                                        i24 = iZzj19;
                                                        i19 = i74;
                                                        i126 = i66;
                                                    }
                                                    break;
                                                } else {
                                                    iZzj12 = zzcv.zzj(bArr6, iZzj13, zzcuVar7);
                                                    i107 = zzcuVar7.zza;
                                                    if (i107 >= 0) {
                                                        com.google.android.gms.internal.measurement.a.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i107 <= bArr6.length - iZzj12) {
                                                        com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i107 == 0) {
                                                        zzeoVar.add(zzdf.zzb);
                                                    } else {
                                                        zzeoVar.add(zzdf.zzr(bArr6, iZzj12, i107));
                                                        iZzj12 += i107;
                                                    }
                                                }
                                            }
                                            i88 = i15;
                                            i74 = i74 == true ? 1 : 0;
                                            iZzj19 = iZzj12;
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar7;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            i88 = i15;
                                            i74 = i74 == true ? 1 : 0;
                                            i87 = i75;
                                            zzcuVar5 = zzcuVar7;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        bArr6 = bArr;
                                        i108 = i15;
                                        zzcuVar7 = zzcuVar;
                                        i109 = i75;
                                        i110 = i67;
                                        unsafe = unsafe6;
                                        if (z14 == 2) {
                                            iZzg = zzcv.zzg(bArr6, i109, zzeoVar, zzcuVar7);
                                            i111 = i74 == true ? 1 : 0;
                                            zzeoVar2 = zzeoVar;
                                            i75 = i109;
                                        } else if (z14 == 0) {
                                            i18 = i110;
                                            this = this;
                                            zzcuVar5 = zzcuVar7;
                                            i88 = i108;
                                            i87 = i109;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            i75 = i109;
                                            int iZzl2 = zzcv.zzl(i74 == true ? 1 : 0, bArr6, i75, i108, zzeoVar, zzcuVar7);
                                            zzeoVar2 = zzeoVar;
                                            i111 = i74 == true ? 1 : 0;
                                            iZzg = iZzl2;
                                        }
                                        zzelVarZzu2 = this.zzu(i122);
                                        zzgsVar2 = this.zzl;
                                        int i1412 = zzgg.zza;
                                        if (zzelVarZzu2 != null) {
                                            i112 = iZzg;
                                            i123 = i123;
                                            i18 = i110;
                                        } else if (zzeoVar2 != null) {
                                            size = zzeoVar2.size();
                                            i112 = iZzg;
                                            i123 = i123;
                                            objZzn2 = null;
                                            i113 = 0;
                                            i114 = 0;
                                            while (i114 < size) {
                                                num = (Integer) zzeoVar2.get(i114);
                                                iIntValue2 = num.intValue();
                                                if (zzelVarZzu2.zza(iIntValue2)) {
                                                    if (i114 != i113) {
                                                        zzeoVar2.set(i113, num);
                                                    }
                                                    i113++;
                                                    i115 = i110;
                                                } else {
                                                    i115 = i110;
                                                    objZzn2 = zzgg.zzn(obj2, i115, iIntValue2, objZzn2, zzgsVar2);
                                                }
                                                i114++;
                                                i110 = i115;
                                            }
                                            i18 = i110;
                                            if (i113 != size) {
                                                zzeoVar2.subList(i113, size).clear();
                                            }
                                        } else {
                                            i112 = iZzg;
                                            i123 = i123;
                                            i18 = i110;
                                            it = zzeoVar2.iterator();
                                            objZzn = null;
                                            while (it.hasNext()) {
                                                iIntValue = ((Integer) it.next()).intValue();
                                                if (!zzelVarZzu2.zza(iIntValue)) {
                                                    objZzn = zzgg.zzn(obj2, i18, iIntValue, objZzn, zzgsVar2);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        i88 = i108;
                                        i74 = i111;
                                        iZzj19 = i112;
                                        i87 = i75;
                                        zzcuVar5 = zzcuVar7;
                                        if (iZzj19 != i87) {
                                            zzcuVar9 = zzcuVar5;
                                            i15 = i88;
                                            i125 = i18;
                                            this = this;
                                            unsafe10 = unsafe;
                                            i123 = i123;
                                            i121 = 0;
                                            bArr7 = bArr6;
                                            obj8 = obj2;
                                            i124 = i74;
                                            i126 = i66;
                                        } else {
                                            zzcuVar = zzcuVar5;
                                            i24 = iZzj19;
                                            i19 = i74;
                                            i126 = i66;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        bArr6 = bArr;
                                        i108 = i15;
                                        zzcuVar8 = zzcuVar;
                                        i109 = i75;
                                        i116 = i67;
                                        unsafe = unsafe6;
                                        if (z14 == 2) {
                                            if (z14 == 0) {
                                                zzeiVar3 = (zzei) zzeoVar;
                                                iZzj14 = zzcv.zzj(bArr6, i109, zzcuVar8);
                                                zzeiVar3.zzg(zzdj.zzb(zzcuVar8.zza));
                                                while (iZzj14 < i108) {
                                                    iZzj15 = zzcv.zzj(bArr6, iZzj14, zzcuVar8);
                                                    if (i74 == zzcuVar8.zza) {
                                                        iZzj19 = iZzj14;
                                                        zzcuVar5 = zzcuVar8;
                                                        i18 = i116;
                                                        i88 = i108;
                                                        i87 = i109;
                                                        if (iZzj19 != i87) {
                                                            zzcuVar9 = zzcuVar5;
                                                            i15 = i88;
                                                            i125 = i18;
                                                            this = this;
                                                            unsafe10 = unsafe;
                                                            i123 = i123;
                                                            i121 = 0;
                                                            bArr7 = bArr6;
                                                            obj8 = obj2;
                                                            i124 = i74;
                                                            i126 = i66;
                                                        } else {
                                                            zzcuVar = zzcuVar5;
                                                            i24 = iZzj19;
                                                            i19 = i74;
                                                            i126 = i66;
                                                        }
                                                    } else {
                                                        iZzj14 = zzcv.zzj(bArr6, iZzj15, zzcuVar8);
                                                        zzeiVar3.zzg(zzdj.zzb(zzcuVar8.zza));
                                                    }
                                                    break;
                                                }
                                                iZzj19 = iZzj14;
                                                zzcuVar5 = zzcuVar8;
                                                i18 = i116;
                                                i88 = i108;
                                                i87 = i109;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            zzcuVar5 = zzcuVar8;
                                            i18 = i116;
                                            this = this;
                                            i88 = i108;
                                            i87 = i109;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        } else {
                                            zzeiVar4 = (zzei) zzeoVar;
                                            iZzj16 = zzcv.zzj(bArr6, i109, zzcuVar8);
                                            i117 = zzcuVar8.zza + iZzj16;
                                            while (iZzj16 < i117) {
                                                iZzj16 = zzcv.zzj(bArr6, iZzj16, zzcuVar8);
                                                zzeiVar4.zzg(zzdj.zzb(zzcuVar8.zza));
                                            }
                                            if (iZzj16 != i117) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            iZzj19 = iZzj16;
                                            zzcuVar5 = zzcuVar8;
                                            i18 = i116;
                                            i88 = i108;
                                            i87 = i109;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        bArr6 = bArr;
                                        i108 = i15;
                                        zzcuVar8 = zzcuVar;
                                        i109 = i75;
                                        unsafe = unsafe6;
                                        if (z14 == 2) {
                                            i116 = i67;
                                            if (z14 == 0) {
                                                zzfbVar5 = (zzfb) zzeoVar;
                                                iZzj14 = zzcv.zzm(bArr6, i109, zzcuVar8);
                                                zzfbVar5.zzf(zzdj.zzc(zzcuVar8.zzb));
                                                while (iZzj14 < i108) {
                                                    iZzj17 = zzcv.zzj(bArr6, iZzj14, zzcuVar8);
                                                    if (i74 == zzcuVar8.zza) {
                                                        iZzj19 = iZzj14;
                                                        zzcuVar5 = zzcuVar8;
                                                        i18 = i116;
                                                        i88 = i108;
                                                        i87 = i109;
                                                        if (iZzj19 != i87) {
                                                            zzcuVar9 = zzcuVar5;
                                                            i15 = i88;
                                                            i125 = i18;
                                                            this = this;
                                                            unsafe10 = unsafe;
                                                            i123 = i123;
                                                            i121 = 0;
                                                            bArr7 = bArr6;
                                                            obj8 = obj2;
                                                            i124 = i74;
                                                            i126 = i66;
                                                        } else {
                                                            zzcuVar = zzcuVar5;
                                                            i24 = iZzj19;
                                                            i19 = i74;
                                                            i126 = i66;
                                                        }
                                                    } else {
                                                        iZzj14 = zzcv.zzm(bArr6, iZzj17, zzcuVar8);
                                                        zzfbVar5.zzf(zzdj.zzc(zzcuVar8.zzb));
                                                    }
                                                    break;
                                                }
                                                iZzj19 = iZzj14;
                                                zzcuVar5 = zzcuVar8;
                                                i18 = i116;
                                                i88 = i108;
                                                i87 = i109;
                                                if (iZzj19 != i87) {
                                                    zzcuVar9 = zzcuVar5;
                                                    i15 = i88;
                                                    i125 = i18;
                                                    this = this;
                                                    unsafe10 = unsafe;
                                                    i123 = i123;
                                                    i121 = 0;
                                                    bArr7 = bArr6;
                                                    obj8 = obj2;
                                                    i124 = i74;
                                                    i126 = i66;
                                                } else {
                                                    zzcuVar = zzcuVar5;
                                                    i24 = iZzj19;
                                                    i19 = i74;
                                                    i126 = i66;
                                                }
                                            }
                                            zzcuVar5 = zzcuVar8;
                                            i18 = i116;
                                            this = this;
                                            i88 = i108;
                                            i87 = i109;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                            break;
                                        } else {
                                            zzfbVar6 = (zzfb) zzeoVar;
                                            iZzj16 = zzcv.zzj(bArr6, i109, zzcuVar8);
                                            i118 = zzcuVar8.zza + iZzj16;
                                            while (iZzj16 < i118) {
                                                iZzj16 = zzcv.zzm(bArr6, iZzj16, zzcuVar8);
                                                zzfbVar6.zzf(zzdj.zzc(zzcuVar8.zzb));
                                                i67 = i67;
                                            }
                                            i116 = i67;
                                            if (iZzj16 != i118) {
                                                com.google.android.gms.internal.measurement.a.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            iZzj19 = iZzj16;
                                            zzcuVar5 = zzcuVar8;
                                            i18 = i116;
                                            i88 = i108;
                                            i87 = i109;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        break;
                                    default:
                                        if (z14 == 3) {
                                            i119 = ((i74 == true ? 1 : 0) & (-8)) | 4;
                                            zzgeVarZzv = this.zzv(i122);
                                            bArr6 = bArr;
                                            i108 = i15;
                                            unsafe = unsafe6;
                                            iZzd = zzcv.zzd(zzgeVarZzv, bArr6, i75, i108, i119, zzcuVar);
                                            zzeoVar.add(zzcuVar.zzc);
                                            while (true) {
                                                if (iZzd < i108) {
                                                    i120 = i75;
                                                    iZzj18 = zzcv.zzj(bArr6, iZzd, zzcuVar);
                                                    if (i74 == zzcuVar.zza) {
                                                        iZzd = zzcv.zzd(zzgeVarZzv, bArr6, iZzj18, i108, i119, zzcuVar);
                                                        zzeoVar.add(zzcuVar.zzc);
                                                        i75 = i120;
                                                        unsafe = unsafe;
                                                    } else {
                                                        i109 = i120;
                                                    }
                                                } else {
                                                    i109 = i75;
                                                }
                                            }
                                            zzcuVar5 = zzcuVar;
                                            iZzj19 = iZzd;
                                            i18 = i67;
                                            i88 = i108;
                                            i87 = i109;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        } else {
                                            unsafe = unsafe6;
                                            bArr6 = bArr;
                                            i87 = i75;
                                            i18 = i67;
                                            i123 = i123;
                                            zzcuVar5 = zzcuVar;
                                            this = this;
                                            i74 = i74 == true ? 1 : 0;
                                            i88 = i15;
                                            iZzj19 = i87;
                                            if (iZzj19 != i87) {
                                                zzcuVar9 = zzcuVar5;
                                                i15 = i88;
                                                i125 = i18;
                                                this = this;
                                                unsafe10 = unsafe;
                                                i123 = i123;
                                                i121 = 0;
                                                bArr7 = bArr6;
                                                obj8 = obj2;
                                                i124 = i74;
                                                i126 = i66;
                                            } else {
                                                zzcuVar = zzcuVar5;
                                                i24 = iZzj19;
                                                i19 = i74;
                                                i126 = i66;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                i18 = i67;
                                i123 = i123;
                                this = this;
                                unsafe = unsafe6;
                                i69 = i74 == true ? 1 : 0;
                                i68 = i75;
                                if (iZzr == 50) {
                                    unsafe8 = zzb;
                                    j14 = iArr[i122 + 2] & 1048575;
                                    switch (iZzr) {
                                        case 51:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 1) {
                                                iZzm3 = i77 + 8;
                                                unsafe8.putObject(obj2, j8, Double.valueOf(Double.longBitsToDouble(zzcv.zzq(bArr4, i77))));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm3;
                                            } else {
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 52:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 5) {
                                                iZzm3 = i77 + 4;
                                                unsafe8.putObject(obj2, j8, Float.valueOf(Float.intBitsToFloat(zzcv.zzc(bArr4, i77))));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm3;
                                            } else {
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 0) {
                                                iZzm3 = zzcv.zzm(bArr4, i77, zzcuVar);
                                                unsafe8.putObject(obj2, j8, Long.valueOf(zzcuVar.zzb));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm3;
                                            } else {
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 0) {
                                                iZzm3 = zzcv.zzj(bArr4, i77, zzcuVar);
                                                unsafe8.putObject(obj2, j8, Integer.valueOf(zzcuVar.zza));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm3;
                                            } else {
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 1) {
                                                iZzm3 = i77 + 8;
                                                unsafe8.putObject(obj2, j8, Long.valueOf(zzcv.zzq(bArr4, i77)));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm3;
                                            } else {
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 5) {
                                                iZzm3 = i77 + 4;
                                                unsafe8.putObject(obj2, j8, Integer.valueOf(zzcv.zzc(bArr4, i77)));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm3;
                                            } else {
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 58:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 0) {
                                                iZzm3 = zzcv.zzm(bArr4, i77, zzcuVar);
                                                if (zzcuVar.zzb != 0) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                unsafe8.putObject(obj2, j8, Boolean.valueOf(z16));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm3;
                                            } else {
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 59:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 2) {
                                                iZzj2 = zzcv.zzj(bArr4, i77, zzcuVar);
                                                i78 = zzcuVar.zza;
                                                if (i78 == 0) {
                                                    unsafe8.putObject(obj2, j8, "");
                                                } else {
                                                    i79 = iZzj2 + i78;
                                                    if ((i27 & 536870912) == 0) {
                                                    }
                                                    unsafe8.putObject(obj2, j8, new String(bArr4, iZzj2, i78, zzep.zza));
                                                    iZzj2 = i79;
                                                }
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzj2;
                                            } else {
                                                unsafe = unsafe;
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 60:
                                            i19 = i69 == true ? 1 : 0;
                                            if (z14 == 2) {
                                                Object objZzy3 = this.zzy(obj2, i18, i122);
                                                int iZzo4 = zzcv.zzo(objZzy3, this.zzv(i122), bArr, i68, i15, zzcuVar);
                                                bArr4 = bArr;
                                                zzcuVar = zzcuVar;
                                                this.zzG(obj2, i18, i122, objZzy3);
                                                unsafe = unsafe;
                                                iZzj19 = iZzo4;
                                                i76 = i122;
                                                i77 = i68;
                                            } else {
                                                zzcuVar = zzcuVar;
                                                bArr4 = bArr;
                                                unsafe = unsafe;
                                                i76 = i122;
                                                i77 = i68;
                                                iZzj19 = i77;
                                            }
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 61:
                                            bArr5 = bArr;
                                            zzcuVar4 = zzcuVar;
                                            i19 = i69 == true ? 1 : 0;
                                            i84 = i68;
                                            if (z14 == 2) {
                                                iZza2 = zzcv.zza(bArr5, i84, zzcuVar4);
                                                unsafe8.putObject(obj2, j8, zzcuVar4.zzc);
                                                unsafe8.putInt(obj2, j14, i18);
                                                unsafe = unsafe;
                                                iZzj19 = iZza2;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                            } else {
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                iZzj19 = i77;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                            }
                                            break;
                                        case 63:
                                            bArr5 = bArr;
                                            zzcuVar4 = zzcuVar;
                                            i84 = i68;
                                            i85 = i69 == true ? 1 : 0;
                                            if (z14 == 0) {
                                                iZza2 = zzcv.zzj(bArr5, i84, zzcuVar4);
                                                i86 = zzcuVar4.zza;
                                                zzelVarZzu = this.zzu(i122);
                                                if (zzelVarZzu != null) {
                                                    i19 = i85 == true ? 1 : 0;
                                                    unsafe8.putObject(obj2, j8, Integer.valueOf(i86));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                } else {
                                                    i19 = i85 == true ? 1 : 0;
                                                    unsafe8.putObject(obj2, j8, Integer.valueOf(i86));
                                                    unsafe8.putInt(obj2, j14, i18);
                                                }
                                                unsafe = unsafe;
                                                iZzj19 = iZza2;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                            }
                                            i19 = i85;
                                            i76 = i122;
                                            i77 = i84;
                                            zzcuVar = zzcuVar4;
                                            bArr4 = bArr5;
                                            iZzj19 = i77;
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 66:
                                            bArr5 = bArr;
                                            zzcuVar4 = zzcuVar;
                                            i84 = i68;
                                            i85 = i69 == true ? 1 : 0;
                                            if (z14 == 0) {
                                                int iZzj21 = zzcv.zzj(bArr5, i84, zzcuVar4);
                                                unsafe8.putObject(obj2, j8, Integer.valueOf(zzdj.zzb(zzcuVar4.zza)));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzj21;
                                                i19 = i85;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                            }
                                            i19 = i85;
                                            i76 = i122;
                                            i77 = i84;
                                            zzcuVar = zzcuVar4;
                                            bArr4 = bArr5;
                                            iZzj19 = i77;
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                        case 67:
                                            bArr5 = bArr;
                                            zzcuVar4 = zzcuVar;
                                            i84 = i68;
                                            if (z14 == 0) {
                                                int iZzm9 = zzcv.zzm(bArr5, i84, zzcuVar4);
                                                i85 = i69 == true ? 1 : 0;
                                                unsafe8.putObject(obj2, j8, Long.valueOf(zzdj.zzc(zzcuVar4.zzb)));
                                                unsafe8.putInt(obj2, j14, i18);
                                                iZzj19 = iZzm9;
                                                i19 = i85;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                            } else {
                                                i19 = i69 == true ? 1 : 0;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                iZzj19 = i77;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (z14 == 3) {
                                                int i1413 = ((i69 == true ? 1 : 0) & (-8)) | 4;
                                                Object objZzy4 = this.zzy(obj2, i18, i122);
                                                zzcuVar4 = zzcuVar;
                                                int iZzn4 = zzcv.zzn(objZzy4, this.zzv(i122), bArr, i68, i15, i1413, zzcuVar4);
                                                bArr5 = bArr;
                                                i84 = i68;
                                                this.zzG(obj2, i18, i122, objZzy4);
                                                unsafe = unsafe;
                                                iZzj19 = iZzn4;
                                                i19 = i69 == true ? 1 : 0;
                                                i76 = i122;
                                                i77 = i84;
                                                zzcuVar = zzcuVar4;
                                                bArr4 = bArr5;
                                                if (iZzj19 != i77) {
                                                    i15 = i15;
                                                    bArr7 = bArr4;
                                                    i125 = i18;
                                                    zzcuVar9 = zzcuVar;
                                                    this = this;
                                                    obj8 = obj2;
                                                    unsafe10 = unsafe;
                                                    i126 = i66;
                                                    i122 = i76;
                                                    i123 = i123;
                                                    i124 = i19 == true ? 1 : 0;
                                                    i121 = 0;
                                                } else {
                                                    i24 = iZzj19;
                                                    i126 = i66;
                                                    i122 = i76;
                                                }
                                                break;
                                            }
                                        default:
                                            i76 = i122;
                                            i77 = i68;
                                            bArr4 = bArr;
                                            zzcuVar = zzcuVar;
                                            unsafe = unsafe;
                                            i19 = i69 == true ? 1 : 0;
                                            iZzj19 = i77;
                                            if (iZzj19 != i77) {
                                                i15 = i15;
                                                bArr7 = bArr4;
                                                i125 = i18;
                                                zzcuVar9 = zzcuVar;
                                                this = this;
                                                obj8 = obj2;
                                                unsafe10 = unsafe;
                                                i126 = i66;
                                                i122 = i76;
                                                i123 = i123;
                                                i124 = i19 == true ? 1 : 0;
                                                i121 = 0;
                                            } else {
                                                i24 = iZzj19;
                                                i126 = i66;
                                                i122 = i76;
                                            }
                                            break;
                                    }
                                } else {
                                    if (z14 == 2) {
                                        unsafe7 = zzb;
                                        Object objZzw2 = this.zzw(i122);
                                        object = unsafe7.getObject(obj2, j8);
                                        if (!((zzfg) object).zze()) {
                                            zzfg zzfgVarZzb2 = zzfg.zza().zzb();
                                            zzfh.zza(zzfgVarZzb2, object);
                                            unsafe7.putObject(obj2, j8, zzfgVarZzb2);
                                        }
                                        throw null;
                                    }
                                    unsafe = unsafe;
                                    i24 = i68;
                                    i19 = i69;
                                    i126 = i66;
                                }
                            }
                        } else if (z14 == 2) {
                            zzeoVarZzd = (zzeo) unsafe6.getObject(obj7, j8);
                            if (!zzeoVarZzd.zzc()) {
                                int size5 = zzeoVarZzd.size();
                                zzeoVarZzd = zzeoVarZzd.zzd(size5 != 0 ? size5 + size5 : 10);
                                unsafe6.putObject(obj7, j8, zzeoVarZzd);
                            }
                            bArr7 = bArr;
                            int iZzf2 = zzcv.zzf(this.zzv(i122), i124 == true ? 1 : 0, bArr7, i128, i15, zzeoVarZzd, zzcuVar);
                            i15 = i15;
                            zzcuVar9 = zzcuVar;
                            iZzj19 = iZzf2;
                            unsafe10 = unsafe6;
                            obj8 = obj;
                            i121 = 0;
                            i124 = i124 == true ? 1 : 0;
                            i125 = i67;
                            i126 = i66;
                        } else {
                            obj2 = obj7;
                            i18 = i67;
                            i68 = i128;
                            i69 = i124 == true ? 1 : 0;
                            i123 = i123;
                            this = this;
                            unsafe = unsafe6;
                            unsafe = unsafe;
                            i24 = i68;
                            i19 = i69;
                            i126 = i66;
                        }
                        if (i19 == i16) {
                        }
                        if (this.zzh) {
                            zzdsVar = zzcuVar.zzd;
                            int i131111112 = zzds.zzb;
                            int i131111113 = zzfu.zza;
                            if (zzdsVar != zzds.zza) {
                                zzfm zzfmVar1111 = this.zzg;
                                zzgsVar = this.zzl;
                                zzefVarZzb = zzdsVar.zzb(zzfmVar1111, i18);
                                if (zzefVarZzb == null) {
                                    i15 = i15;
                                    i25 = i19;
                                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                                } else {
                                    i25 = i19;
                                    zzed zzedVar1111 = (zzed) obj2;
                                    zzedVar1111.zzc();
                                    i15 = i15;
                                    iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar1111, zzefVarZzb, zzgsVar, zzcuVar);
                                }
                            } else {
                                i25 = i19;
                                i15 = i15;
                                iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                            }
                        } else {
                            i25 = i19;
                            i15 = i15;
                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                        }
                        iZzj19 = iZzi;
                        bArr7 = bArr;
                        zzcuVar9 = zzcuVar;
                        i125 = i18;
                        i122 = i122;
                        this = this;
                        obj8 = obj2;
                        i123 = i123;
                        i121 = 0;
                        i124 = i25;
                        unsafe10 = unsafe;
                    }
                }
                if (i19 == i16) {
                }
                if (this.zzh) {
                    zzdsVar = zzcuVar.zzd;
                    int i131111114 = zzds.zzb;
                    int i131111115 = zzfu.zza;
                    if (zzdsVar != zzds.zza) {
                        zzfm zzfmVar1112 = this.zzg;
                        zzgsVar = this.zzl;
                        zzefVarZzb = zzdsVar.zzb(zzfmVar1112, i18);
                        if (zzefVarZzb == null) {
                            i15 = i15;
                            i25 = i19;
                            iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                        } else {
                            i25 = i19;
                            zzed zzedVar1112 = (zzed) obj2;
                            zzedVar1112.zzc();
                            i15 = i15;
                            iZzi = zzcv.zzb(i25 == true ? 1 : 0, bArr, i24, i15, zzedVar1112, zzefVarZzb, zzgsVar, zzcuVar);
                        }
                    } else {
                        i25 = i19;
                        i15 = i15;
                        iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                    }
                } else {
                    i25 = i19;
                    i15 = i15;
                    iZzi = zzcv.zzi(i25 == true ? 1 : 0, bArr, i24, i15, zzd(obj2), zzcuVar);
                }
                iZzj19 = iZzi;
                bArr7 = bArr;
                zzcuVar9 = zzcuVar;
                i125 = i18;
                i122 = i122;
                this = this;
                obj8 = obj2;
                i123 = i123;
                i121 = 0;
                i124 = i25;
                unsafe10 = unsafe;
            } else {
                unsafe = unsafe10;
                i123 = i123;
                this = this;
                i16 = i16;
            }
        }
        int i150 = i123;
        if (i126 != 1048575) {
            unsafe.putInt(obj8, i126, i150);
        }
        for (int i151 = this.zzj; i151 < this.zzk; i151++) {
            int[] iArr2 = this.zzi;
            int[] iArr3 = this.zzc;
            int i152 = iArr2[i151];
            int i153 = iArr3[i152];
            Object objZzf = zzgz.zzf(obj8, this.zzs(i152) & 1048575);
            if (objZzf != null && this.zzu(i152) != null) {
                throw null;
            }
        }
        if (i16 == 0) {
            if (iZzj19 != i15) {
                com.google.android.gms.internal.measurement.a.r("Failed to parse the message.");
                return 0;
            }
        } else if (iZzj19 > i15 || i124 != i16) {
            com.google.android.gms.internal.measurement.a.r("Failed to parse the message.");
            return 0;
        }
        return iZzj19;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzeh) {
                zzeh zzehVar = (zzeh) obj;
                zzehVar.zzW(Integer.MAX_VALUE);
                zzehVar.zza = 0;
                zzehVar.zzU();
            }
            int[] iArr = this.zzc;
            for (int i14 = 0; i14 < iArr.length; i14 += 3) {
                int iZzs = zzs(i14);
                int i15 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j8 = i15;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i14)) {
                                    zzv(i14).zzf(zzb.getObject(obj, j8));
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
                                ((zzeo) zzgz.zzf(obj, j8)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j8);
                                if (object != null) {
                                    ((zzfg) object).zzc();
                                    unsafe.putObject(obj, j8, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, this.zzc[i14], i14)) {
                        zzv(i14).zzf(zzb.getObject(obj, j8));
                    }
                } else if (zzI(obj, i14)) {
                    zzv(i14).zzf(zzb.getObject(obj, j8));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzs = zzs(i14);
            int i15 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i16 = iArr[i14];
            long j8 = i15;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i14)) {
                        zzgz.zzo(obj, j8, zzgz.zza(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i14)) {
                        zzgz.zzp(obj, j8, zzgz.zzb(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i14)) {
                        zzgz.zzr(obj, j8, zzgz.zzd(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i14)) {
                        zzgz.zzr(obj, j8, zzgz.zzd(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i14)) {
                        zzgz.zzq(obj, j8, zzgz.zzc(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i14)) {
                        zzgz.zzr(obj, j8, zzgz.zzd(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i14)) {
                        zzgz.zzq(obj, j8, zzgz.zzc(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i14)) {
                        zzgz.zzm(obj, j8, zzgz.zzw(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i14)) {
                        zzgz.zzs(obj, j8, zzgz.zzf(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i14);
                    break;
                case 10:
                    if (zzI(obj2, i14)) {
                        zzgz.zzs(obj, j8, zzgz.zzf(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i14)) {
                        zzgz.zzq(obj, j8, zzgz.zzc(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i14)) {
                        zzgz.zzq(obj, j8, zzgz.zzc(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i14)) {
                        zzgz.zzq(obj, j8, zzgz.zzc(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i14)) {
                        zzgz.zzr(obj, j8, zzgz.zzd(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i14)) {
                        zzgz.zzq(obj, j8, zzgz.zzc(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i14)) {
                        zzgz.zzr(obj, j8, zzgz.zzd(obj2, j8));
                        zzD(obj, i14);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i14);
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
                    zzeo zzeoVarZzd = (zzeo) zzgz.zzf(obj, j8);
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj2, j8);
                    int size = zzeoVarZzd.size();
                    int size2 = zzeoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVarZzd.zzc()) {
                            zzeoVarZzd = zzeoVarZzd.zzd(size2 + size);
                        }
                        zzeoVarZzd.addAll(zzeoVar);
                    }
                    if (size > 0) {
                        zzeoVar = zzeoVarZzd;
                    }
                    zzgz.zzs(obj, j8, zzeoVar);
                    break;
                case 50:
                    int i17 = zzgg.zza;
                    zzgz.zzs(obj, j8, zzfh.zza(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8)));
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
                    if (zzM(obj2, i16, i14)) {
                        zzgz.zzs(obj, j8, zzgz.zzf(obj2, j8));
                        zzE(obj, i16, i14);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i14);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i16, i14)) {
                        zzgz.zzs(obj, j8, zzgz.zzf(obj2, j8));
                        zzE(obj, i16, i14);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i14);
                    break;
            }
        }
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i14, int i15, zzcu zzcuVar) {
        zzc(obj, bArr, i14, i15, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzi(Object obj, zzhh zzhhVar) {
        Map.Entry entry;
        Iterator it;
        int i14;
        int i15;
        int i16;
        int i17;
        zzfp<T> zzfpVar = this;
        if (zzfpVar.zzh) {
            zzdx zzdxVar = ((zzed) obj).zzb;
            if (zzdxVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzdxVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzfpVar.zzc;
        Unsafe unsafe = zzb;
        int i18 = 0;
        int i19 = 1048575;
        int i24 = 0;
        while (i18 < iArr.length) {
            int iZzs = zzfpVar.zzs(i18);
            int[] iArr2 = zzfpVar.zzc;
            int iZzr = zzr(iZzs);
            int i25 = iArr2[i18];
            if (iZzr <= 17) {
                int i26 = iArr2[i18 + 2];
                int i27 = i26 & 1048575;
                if (i27 != i19) {
                    i14 = 1;
                    i24 = i27 == 1048575 ? 0 : unsafe.getInt(obj, i27);
                    i19 = i27;
                } else {
                    i14 = 1;
                }
                i15 = i19;
                i16 = i24;
                i17 = i14 << (i26 >>> 20);
            } else {
                i14 = 1;
                i15 = i19;
                i16 = i24;
                i17 = 0;
            }
            while (entry != null && ((zzee) entry.getKey()).zza <= i25) {
                zzfpVar.zzm.zzb(zzhhVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j8 = iZzs & 1048575;
            switch (iZzr) {
                case 0:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzf(i25, zzgz.zza(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 1:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzo(i25, zzgz.zzb(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 2:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzt(i25, unsafe.getLong(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 3:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzK(i25, unsafe.getLong(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 4:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzr(i25, unsafe.getInt(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 5:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzm(i25, unsafe.getLong(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 6:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzk(i25, unsafe.getInt(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 7:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzb(i25, zzgz.zzw(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 8:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzO(i25, unsafe.getObject(obj, j8), zzhhVar);
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 9:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzv(i25, unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 10:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzd(i25, (zzdf) unsafe.getObject(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 11:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzI(i25, unsafe.getInt(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 12:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzi(i25, unsafe.getInt(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 13:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzx(i25, unsafe.getInt(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 14:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzz(i25, unsafe.getLong(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 15:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzB(i25, unsafe.getInt(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 16:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzD(i25, unsafe.getLong(obj, j8));
                    }
                    zzfpVar = this;
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 17:
                    if (zzfpVar.zzJ(obj, i18, i15, i16, i17)) {
                        zzhhVar.zzq(i25, unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 18:
                    zzgg.zzr(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 19:
                    zzgg.zzv(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 20:
                    zzgg.zzx(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 21:
                    zzgg.zzD(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 22:
                    zzgg.zzw(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 23:
                    zzgg.zzu(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 24:
                    zzgg.zzt(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 25:
                    zzgg.zzq(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 26:
                    int i28 = zzfpVar.zzc[i18];
                    List list = (List) unsafe.getObject(obj, j8);
                    int i29 = zzgg.zza;
                    if (list != null && !list.isEmpty()) {
                        zzhhVar.zzH(i28, list);
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 27:
                    int i30 = zzfpVar.zzc[i18];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    zzge zzgeVarZzv = zzfpVar.zzv(i18);
                    int i34 = zzgg.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i35 = 0; i35 < list2.size(); i35++) {
                            ((zzdo) zzhhVar).zzv(i30, list2.get(i35), zzgeVarZzv);
                        }
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 28:
                    int i36 = zzfpVar.zzc[i18];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    int i37 = zzgg.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhhVar.zze(i36, list3);
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 29:
                    zzgg.zzC(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 30:
                    zzgg.zzs(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 31:
                    zzgg.zzy(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 32:
                    zzgg.zzz(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 33:
                    zzgg.zzA(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 34:
                    zzgg.zzB(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, false);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 35:
                    zzgg.zzr(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 36:
                    zzgg.zzv(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 37:
                    zzgg.zzx(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 38:
                    zzgg.zzD(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 39:
                    zzgg.zzw(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 40:
                    zzgg.zzu(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 41:
                    zzgg.zzt(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 42:
                    zzgg.zzq(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 43:
                    zzgg.zzC(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 44:
                    zzgg.zzs(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 45:
                    zzgg.zzy(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 46:
                    zzgg.zzz(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 47:
                    zzgg.zzA(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 48:
                    zzgg.zzB(zzfpVar.zzc[i18], (List) unsafe.getObject(obj, j8), zzhhVar, i14);
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 49:
                    int i38 = zzfpVar.zzc[i18];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    zzge zzgeVarZzv2 = zzfpVar.zzv(i18);
                    int i39 = zzgg.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i44 = 0; i44 < list4.size(); i44++) {
                            ((zzdo) zzhhVar).zzq(i38, list4.get(i44), zzgeVarZzv2);
                        }
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j8) != null) {
                        throw null;
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 51:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzf(i25, zzm(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 52:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzo(i25, zzn(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 53:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzt(i25, zzt(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 54:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzK(i25, zzt(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 55:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzr(i25, zzo(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 56:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzm(i25, zzt(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 57:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzk(i25, zzo(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 58:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzb(i25, zzN(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 59:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzO(i25, unsafe.getObject(obj, j8), zzhhVar);
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 60:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzv(i25, unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 61:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzd(i25, (zzdf) unsafe.getObject(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 62:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzI(i25, zzo(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 63:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzi(i25, zzo(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 64:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzx(i25, zzo(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 65:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzz(i25, zzt(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 66:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzB(i25, zzo(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 67:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzD(i25, zzt(obj, j8));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                case 68:
                    if (zzfpVar.zzM(obj, i25, i18)) {
                        zzhhVar.zzq(i25, unsafe.getObject(obj, j8), zzfpVar.zzv(i18));
                    }
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
                default:
                    i18 += 3;
                    i24 = i16;
                    i19 = i15;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzfpVar.zzm.zzb(zzhhVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zzeh) obj).zzc.zzl(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzs = zzs(i14);
            long j8 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i14) || Double.doubleToLongBits(zzgz.zza(obj, j8)) != Double.doubleToLongBits(zzgz.zza(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i14) || Float.floatToIntBits(zzgz.zzb(obj, j8)) != Float.floatToIntBits(zzgz.zzb(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i14) || zzgz.zzd(obj, j8) != zzgz.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i14) || zzgz.zzd(obj, j8) != zzgz.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i14) || zzgz.zzc(obj, j8) != zzgz.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i14) || zzgz.zzd(obj, j8) != zzgz.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i14) || zzgz.zzc(obj, j8) != zzgz.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i14) || zzgz.zzw(obj, j8) != zzgz.zzw(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i14) || !zzgg.zzE(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i14) || !zzgg.zzE(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i14) || !zzgg.zzE(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i14) || zzgz.zzc(obj, j8) != zzgz.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i14) || zzgz.zzc(obj, j8) != zzgz.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i14) || zzgz.zzc(obj, j8) != zzgz.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i14) || zzgz.zzd(obj, j8) != zzgz.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i14) || zzgz.zzc(obj, j8) != zzgz.zzc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i14) || zzgz.zzd(obj, j8) != zzgz.zzd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i14) || !zzgg.zzE(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8))) {
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
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8));
                    break;
                case 50:
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8));
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
                    long jZzp = zzp(i14) & 1048575;
                    if (zzgz.zzc(obj, jZzp) != zzgz.zzc(obj2, jZzp) || !zzgg.zzE(zzgz.zzf(obj, j8), zzgz.zzf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        int i14;
        int i15;
        List list;
        zzge zzgeVarZzv;
        int i16;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i17 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i24 = iArr[i17];
            int i25 = iArr2[i24];
            int iZzs = zzs(i24);
            int i26 = this.zzc[i24 + 2];
            int i27 = i26 & 1048575;
            int i28 = 1 << (i26 >>> 20);
            if (i27 != i19) {
                if (i27 != 1048575) {
                    i18 = zzb.getInt(obj, i27);
                }
                i15 = i18;
                i14 = i27;
            } else {
                i14 = i19;
                i15 = i18;
            }
            Object obj2 = obj;
            if ((268435456 & iZzs) != 0 && !zzJ(obj2, i24, i14, i15, i28)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj2, i24, i14, i15, i28) && !zzK(obj2, iZzs, zzv(i24))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzgz.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgeVarZzv = zzv(i24);
                    for (i16 = 0; i16 < list.size(); i16++) {
                        if (!zzgeVarZzv.zzk(list.get(i16))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj2, i25, i24) && !zzK(obj2, iZzs, zzv(i24))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzgz.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    zzgeVarZzv = zzv(i24);
                    while (i16 < list.size()) {
                        if (!zzgeVarZzv.zzk(list.get(i16))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zzfg) zzgz.zzf(obj2, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i17++;
            obj = obj2;
            i19 = i14;
            i18 = i15;
        }
        return !this.zzh || ((zzed) obj).zzb.zzk();
    }
}
