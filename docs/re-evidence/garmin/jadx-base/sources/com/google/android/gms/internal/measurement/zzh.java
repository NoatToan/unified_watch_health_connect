package com.google.android.gms.internal.measurement;

import com.google.firebase.messaging.l;
import fb1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzh {
    public static void zza(String str, int i14, List list) {
        if (list.size() == i14) {
            return;
        }
        l.g(i14, str, " operation requires ", " parameters found ", list.size());
    }

    public static void zzb(String str, int i14, List list) {
        if (list.size() >= i14) {
            return;
        }
        l.g(i14, str, " operation requires at least ", " parameters found ", list.size());
    }

    public static void zzc(String str, int i14, List list) {
        if (list.size() <= i14) {
            return;
        }
        l.g(i14, str, " operation requires at most ", " parameters found ", list.size());
    }

    public static boolean zzd(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double dZzd = zzaoVar.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static zzbk zze(String str) {
        zzbk zzbkVarZza = null;
        if (str != null && !str.isEmpty()) {
            zzbkVarZza = zzbk.zza(Integer.parseInt(str));
        }
        if (zzbkVarZza != null) {
            return zzbkVarZza;
        }
        h.s(c.n("Unsupported commandId ", str));
        return null;
    }

    public static boolean zzf(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (zzaoVar instanceof zzah) {
            if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
                return false;
            }
            return zzaoVar.zzd().equals(zzaoVar2.zzd());
        }
        if (zzaoVar instanceof zzas) {
            return zzaoVar.zzc().equals(zzaoVar2.zzc());
        }
        if (zzaoVar instanceof zzaf) {
            return zzaoVar.zze().equals(zzaoVar2.zze());
        }
        return zzaoVar == zzaoVar2;
    }

    public static int zzg(double d14) {
        if (Double.isNaN(d14) || Double.isInfinite(d14) || d14 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d14 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d14))) % 4.294967296E9d);
    }

    public static long zzh(double d14) {
        return ((long) zzg(d14)) & 4294967295L;
    }

    public static double zzi(double d14) {
        if (Double.isNaN(d14)) {
            return 0.0d;
        }
        if (Double.isInfinite(d14) || d14 == 0.0d || d14 == 0.0d) {
            return d14;
        }
        return ((double) (d14 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d14));
    }

    public static Object zzj(zzao zzaoVar) {
        if (zzao.zzg.equals(zzaoVar)) {
            return null;
        }
        if (zzao.zzf.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return zzk((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzae) zzaoVar).iterator();
        while (it.hasNext()) {
            Object objZzj = zzj((zzao) it.next());
            if (objZzj != null) {
                arrayList.add(objZzj);
            }
        }
        return arrayList;
    }

    public static Map zzk(zzal zzalVar) {
        HashMap map = new HashMap();
        for (String str : zzalVar.zzb()) {
            Object objZzj = zzj(zzalVar.zzk(str));
            if (objZzj != null) {
                map.put(str, objZzj);
            }
        }
        return map;
    }

    public static int zzl(zzg zzgVar) {
        int iZzg = zzg(zzgVar.zzh("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iZzg <= 1000000) {
            zzgVar.zze("runtime.counter", new zzah(Double.valueOf(iZzg)));
            return iZzg;
        }
        h.z("Instructions allowed exceeded");
        return 0;
    }
}
