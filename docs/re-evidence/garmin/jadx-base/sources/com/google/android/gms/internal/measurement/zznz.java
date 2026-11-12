package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i14 = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzc = zzmfVar.zzc;
        zzoj zzojVar = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar)) {
            if (zzoj.zza().equals(zzojVarZzc)) {
                zzojVarZzc = zzoj.zzc(zzojVarZzc, zzojVar);
            } else {
                zzojVarZzc.zzl(zzojVar);
            }
        }
        zzmfVar.zzc = zzojVarZzc;
    }

    public static Object zzE(Object obj, int i14, int i15, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i14 << 3, Long.valueOf(i15));
        return obj2;
    }

    public static void zza(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i14, list, z14);
    }

    public static void zzb(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i14, list, z14);
    }

    public static void zzc(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i14, list, z14);
    }

    public static void zzd(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i14, list, z14);
    }

    public static void zze(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i14, list, z14);
    }

    public static void zzf(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i14, list, z14);
    }

    public static void zzg(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i14, list, z14);
    }

    public static void zzh(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i14, list, z14);
    }

    public static void zzi(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i14, list, z14);
    }

    public static void zzj(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i14, list, z14);
    }

    public static void zzk(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i14, list, z14);
    }

    public static void zzl(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i14, list, z14);
    }

    public static void zzm(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i14, list, z14);
    }

    public static void zzn(int i14, List list, zzov zzovVar, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i14, list, z14);
    }

    public static int zzo(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i14 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i14)).longValue());
                i14++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i14 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i14));
            i14++;
        }
        return iZzA2;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i14 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i14)).longValue());
                i14++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i14 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i14));
            i14++;
        }
        return iZzA2;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i14 < size) {
                long jLongValue = ((Long) list.get(i14)).longValue();
                iZzA += zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i14++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i14 < size) {
            long jZzc = zznaVar.zzc(i14);
            iZzA2 += zzlm.zzA((jZzc >> 63) ^ (jZzc + jZzc));
            i14++;
        }
        return iZzA2;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i14 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i14 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i14));
            i14++;
        }
        return iZzA2;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i14 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i14 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i14));
            i14++;
        }
        return iZzA2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i14 < size) {
                iZzz += zzlm.zzz(((Integer) list.get(i14)).intValue());
                i14++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i14 < size) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i14));
            i14++;
        }
        return iZzz2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i14 < size) {
                int iIntValue = ((Integer) list.get(i14)).intValue();
                iZzz += zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i14++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i14 < size) {
            int iZzf = zzmgVar.zzf(i14);
            iZzz2 += zzlm.zzz((iZzf >> 31) ^ (iZzf + iZzf));
            i14++;
        }
        return iZzz2;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i14, List list, boolean z14) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i14 << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i14, List list, boolean z14) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i14 << 3) + 8) * size;
    }

    public static int zzz(int i14, Object obj, zznx zznxVar) {
        int i15 = i14 << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzD((zznm) obj, zznxVar) + zzlm.zzz(i15);
        }
        int iZzz = zzlm.zzz(i15);
        int iZzb = ((zzmw) obj).zzb();
        return a.a(iZzb, iZzb, iZzz);
    }
}
