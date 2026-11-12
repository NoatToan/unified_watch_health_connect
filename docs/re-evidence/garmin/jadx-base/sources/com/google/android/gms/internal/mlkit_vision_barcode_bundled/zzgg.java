package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.measurement.a;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class zzgg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgs zzb;

    static {
        int i14 = zzfu.zza;
        zzb = new zzgu();
    }

    public static void zzA(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzC(i14, list, z14);
    }

    public static void zzB(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzE(i14, list, z14);
    }

    public static void zzC(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzJ(i14, list, z14);
    }

    public static void zzD(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzL(i14, list, z14);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzB = 0;
            while (i14 < size) {
                iZzB += zzdn.zzB(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return iZzB;
        }
        zzei zzeiVar = (zzei) list;
        int iZzB2 = 0;
        while (i14 < size) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i14));
            i14++;
        }
        return iZzB2;
    }

    public static int zzb(int i14, List list, boolean z14) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdn.zzA(i14 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i14, List list, boolean z14) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdn.zzA(i14 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzB = 0;
            while (i14 < size) {
                iZzB += zzdn.zzB(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return iZzB;
        }
        zzei zzeiVar = (zzei) list;
        int iZzB2 = 0;
        while (i14 < size) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i14));
            i14++;
        }
        return iZzB2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int iZzB = 0;
            while (i14 < size) {
                iZzB += zzdn.zzB(((Long) list.get(i14)).longValue());
                i14++;
            }
            return iZzB;
        }
        zzfb zzfbVar = (zzfb) list;
        int iZzB2 = 0;
        while (i14 < size) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i14));
            i14++;
        }
        return iZzB2;
    }

    public static int zzh(int i14, Object obj, zzge zzgeVar) {
        int i15 = i14 << 3;
        if (!(obj instanceof zzex)) {
            return zzdn.zzy((zzfm) obj, zzgeVar) + zzdn.zzA(i15);
        }
        int iZzA = zzdn.zzA(i15);
        int iZza = ((zzex) obj).zza();
        return a.m(iZza, iZza, iZzA);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzA = 0;
            while (i14 < size) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                iZzA += zzdn.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i14++;
            }
            return iZzA;
        }
        zzei zzeiVar = (zzei) list;
        int iZzA2 = 0;
        while (i14 < size) {
            int iZze = zzeiVar.zze(i14);
            iZzA2 += zzdn.zzA((iZze >> 31) ^ (iZze + iZze));
            i14++;
        }
        return iZzA2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int iZzB = 0;
            while (i14 < size) {
                long jLongValue = ((Long) list.get(i14)).longValue();
                iZzB += zzdn.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i14++;
            }
            return iZzB;
        }
        zzfb zzfbVar = (zzfb) list;
        int iZzB2 = 0;
        while (i14 < size) {
            long jZze = zzfbVar.zze(i14);
            iZzB2 += zzdn.zzB((jZze >> 63) ^ (jZze + jZze));
            i14++;
        }
        return iZzB2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int iZzA = 0;
            while (i14 < size) {
                iZzA += zzdn.zzA(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return iZzA;
        }
        zzei zzeiVar = (zzei) list;
        int iZzA2 = 0;
        while (i14 < size) {
            iZzA2 += zzdn.zzA(zzeiVar.zze(i14));
            i14++;
        }
        return iZzA2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int iZzB = 0;
            while (i14 < size) {
                iZzB += zzdn.zzB(((Long) list.get(i14)).longValue());
                i14++;
            }
            return iZzB;
        }
        zzfb zzfbVar = (zzfb) list;
        int iZzB2 = 0;
        while (i14 < size) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i14));
            i14++;
        }
        return iZzB2;
    }

    public static zzgs zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i14, int i15, Object obj2, zzgs zzgsVar) {
        zzeh zzehVar;
        zzgt zzgtVar;
        Object obj3 = obj2;
        if (obj2 == null && (zzgtVar = (zzehVar = (zzeh) obj).zzc) == zzgt.zzc()) {
            obj3 = zzgtVar;
            zzgt zzgtVarZzf = zzgt.zzf();
            zzehVar.zzc = zzgtVarZzf;
            obj3 = zzgtVarZzf;
        }
        obj3 = zzgtVar;
        ((zzgt) obj3).zzj(i14 << 3, Long.valueOf(i15));
        return obj3;
    }

    public static void zzo(zzdt zzdtVar, Object obj, Object obj2) {
        zzdx zzdxVar = ((zzed) obj2).zzb;
        if (zzdxVar.zza.isEmpty()) {
            return;
        }
        ((zzed) obj).zzc().zzh(zzdxVar);
    }

    public static void zzp(zzgs zzgsVar, Object obj, Object obj2) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVarZze = zzehVar.zzc;
        zzgt zzgtVar = ((zzeh) obj2).zzc;
        if (!zzgt.zzc().equals(zzgtVar)) {
            if (zzgt.zzc().equals(zzgtVarZze)) {
                zzgtVarZze = zzgt.zze(zzgtVarZze, zzgtVar);
            } else {
                zzgtVarZze.zzd(zzgtVar);
            }
        }
        zzehVar.zzc = zzgtVarZze;
    }

    public static void zzq(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzc(i14, list, z14);
    }

    public static void zzr(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzg(i14, list, z14);
    }

    public static void zzs(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzj(i14, list, z14);
    }

    public static void zzt(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzl(i14, list, z14);
    }

    public static void zzu(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzn(i14, list, z14);
    }

    public static void zzv(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzp(i14, list, z14);
    }

    public static void zzw(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzs(i14, list, z14);
    }

    public static void zzx(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzu(i14, list, z14);
    }

    public static void zzy(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzy(i14, list, z14);
    }

    public static void zzz(int i14, List list, zzhh zzhhVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzA(i14, list, z14);
    }
}
