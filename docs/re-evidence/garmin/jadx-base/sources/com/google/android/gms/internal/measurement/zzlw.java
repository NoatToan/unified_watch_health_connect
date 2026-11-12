package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.f;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzlw {
    private static final zzlw zzd = new zzlw(true);
    final zzoe zza = new zzoa();
    private boolean zzb;
    private boolean zzc;

    private zzlw(boolean z14) {
        zzb();
        zzb();
    }

    public static zzlw zza() {
        return zzd;
    }

    public static void zzf(zzlm zzlmVar, zzot zzotVar, int i14, Object obj) {
        if (zzotVar == zzot.zzj) {
            zznm zznmVar = (zznm) obj;
            zzmp.zzd(zznmVar);
            zzlmVar.zza(i14, 3);
            zznmVar.zzcB(zzlmVar);
            zzlmVar.zza(i14, 4);
            return;
        }
        zzlmVar.zza(i14, zzotVar.zzb());
        zzou zzouVar = zzou.INT;
        switch (zzotVar.ordinal()) {
            case 0:
                zzlmVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzlmVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzlmVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zzlmVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zzlmVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zzlmVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zzlmVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zzlmVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzlh)) {
                    zzlmVar.zzx((String) obj);
                } else {
                    zzlmVar.zzj((zzlh) obj);
                }
                break;
            case 9:
                ((zznm) obj).zzcB(zzlmVar);
                break;
            case 10:
                zzlmVar.zzo((zznm) obj);
                break;
            case 11:
                if (!(obj instanceof zzlh)) {
                    byte[] bArr = (byte[]) obj;
                    zzlmVar.zzk(bArr, 0, bArr.length);
                } else {
                    zzlmVar.zzj((zzlh) obj);
                }
                break;
            case 12:
                zzlmVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzmj)) {
                    zzlmVar.zzq(((Integer) obj).intValue());
                } else {
                    zzlmVar.zzq(((zzmj) obj).zza());
                }
                break;
            case 14:
                zzlmVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zzlmVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzlmVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzlmVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int zzh(zzot zzotVar, int i14, Object obj) {
        int iZzz = zzlm.zzz(i14 << 3);
        if (zzotVar == zzot.zzj) {
            zzmp.zzd((zznm) obj);
            iZzz += iZzz;
        }
        return iZzz + zzi(zzotVar, obj);
    }

    public static int zzi(zzot zzotVar, Object obj) {
        int iZzc;
        int iZzz;
        zzot zzotVar2 = zzot.zza;
        zzou zzouVar = zzou.INT;
        switch (zzotVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i14 = zzlm.zzb;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i15 = zzlm.zzb;
                return 4;
            case 2:
                return zzlm.zzA(((Long) obj).longValue());
            case 3:
                return zzlm.zzA(((Long) obj).longValue());
            case 4:
                return zzlm.zzA(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i16 = zzlm.zzb;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i17 = zzlm.zzb;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i18 = zzlm.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzlh)) {
                    return zzlm.zzB((String) obj);
                }
                int i19 = zzlm.zzb;
                iZzc = ((zzlh) obj).zzc();
                iZzz = zzlm.zzz(iZzc);
                break;
                break;
            case 9:
                return ((zznm) obj).zzcn();
            case 10:
                if (!(obj instanceof zzmv)) {
                    return zzlm.zzC((zznm) obj);
                }
                int i24 = zzlm.zzb;
                iZzc = ((zzmv) obj).zzb();
                iZzz = zzlm.zzz(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzlh)) {
                    int i25 = zzlm.zzb;
                    iZzc = ((byte[]) obj).length;
                    iZzz = zzlm.zzz(iZzc);
                } else {
                    int i26 = zzlm.zzb;
                    iZzc = ((zzlh) obj).zzc();
                    iZzz = zzlm.zzz(iZzc);
                }
                break;
            case 12:
                return zzlm.zzz(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzmj ? zzlm.zzA(((zzmj) obj).zza()) : zzlm.zzA(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i27 = zzlm.zzb;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i28 = zzlm.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                f.n("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iZzz + iZzc;
    }

    public static int zzj(zzlv zzlvVar, Object obj) {
        zzot zzotVarZzb = zzlvVar.zzb();
        int iZza = zzlvVar.zza();
        if (!zzlvVar.zzd()) {
            return zzh(zzotVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i14 = 0;
        if (!zzlvVar.zze()) {
            int iZzh = 0;
            while (i14 < size) {
                iZzh += zzh(zzotVarZzb, iZza, list.get(i14));
                i14++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i14 < size) {
            iZzi += zzi(zzotVarZzb, list.get(i14));
            i14++;
        }
        return zzlm.zzz(iZzi) + zzlm.zzz(iZza << 3) + iZzi;
    }

    private static boolean zzk(Map.Entry entry) {
        zzlv zzlvVar = (zzlv) entry.getKey();
        if (zzlvVar.zzc() != zzou.MESSAGE) {
            return true;
        }
        if (!zzlvVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!zzl(list.get(i14))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zznn) {
            return ((zznn) obj).zzcD();
        }
        if (obj instanceof zzmv) {
            return true;
        }
        h.s("Wrong object type used with protocol message reflection.");
        return false;
    }

    private static final int zzm(Map.Entry entry) {
        int i14;
        int iZzz;
        int iZzC;
        zzlv zzlvVar = (zzlv) entry.getKey();
        Object value = entry.getValue();
        if (zzlvVar.zzc() != zzou.MESSAGE || zzlvVar.zzd() || zzlvVar.zze()) {
            return zzj(zzlvVar, value);
        }
        if (value instanceof zzmv) {
            int iZza = ((zzlv) entry.getKey()).zza();
            int iZzz2 = zzlm.zzz(8);
            i14 = iZzz2 + iZzz2;
            iZzz = zzlm.zzz(iZza) + zzlm.zzz(16);
            int iZzz3 = zzlm.zzz(24);
            int iZzb = ((zzmv) value).zzb();
            iZzC = a.a(iZzb, iZzb, iZzz3);
        } else {
            int iZza2 = ((zzlv) entry.getKey()).zza();
            int iZzz4 = zzlm.zzz(8);
            i14 = iZzz4 + iZzz4;
            iZzz = zzlm.zzz(iZza2) + zzlm.zzz(16);
            iZzC = zzlm.zzC((zznm) value) + zzlm.zzz(24);
        }
        return i14 + iZzz + iZzC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void zzn(zzlv zzlvVar, Object obj) {
        boolean z14;
        zzlvVar.zzb();
        byte[] bArr = zzmp.zzb;
        obj.getClass();
        zzot zzotVar = zzot.zza;
        zzou zzouVar = zzou.INT;
        switch (r0.zza()) {
            case INT:
                z14 = obj instanceof Integer;
                if (z14) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case LONG:
                z14 = obj instanceof Long;
                if (z14) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case FLOAT:
                z14 = obj instanceof Float;
                if (z14) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case DOUBLE:
                z14 = obj instanceof Double;
                if (z14) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case BOOLEAN:
                z14 = obj instanceof Boolean;
                if (z14) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case STRING:
                z14 = obj instanceof String;
                if (z14) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case BYTE_STRING:
                if ((obj instanceof zzlh) || (obj instanceof byte[])) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzmj)) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            case MESSAGE:
                if ((obj instanceof zznm) || (obj instanceof zzmv)) {
                }
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
            default:
                e.s("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzlvVar.zza()), zzlvVar.zzb().zza(), obj.getClass().getName()});
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzlw zzlwVar = new zzlw();
        zzoe zzoeVar = this.zza;
        int iZzc = zzoeVar.zzc();
        for (int i14 = 0; i14 < iZzc; i14++) {
            Map.Entry entryZzd = zzoeVar.zzd(i14);
            zzlwVar.zzd((zzlv) ((zzob) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzoeVar.zze()) {
            zzlwVar.zzd((zzlv) entry.getKey(), entry.getValue());
        }
        zzlwVar.zzc = this.zzc;
        return zzlwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlw) {
            return this.zza.equals(((zzlw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzoe zzoeVar = this.zza;
        int iZzc = zzoeVar.zzc();
        for (int i14 = 0; i14 < iZzc; i14++) {
            Object value = zzoeVar.zzd(i14).getValue();
            if (value instanceof zzmf) {
                ((zzmf) value).zzcj();
            }
        }
        Iterator it = zzoeVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzmf) {
                ((zzmf) value2).zzcj();
            }
        }
        zzoeVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzoe zzoeVar = this.zza;
        if (zzoeVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zzmu(zzoeVar.entrySet().iterator()) : zzoeVar.entrySet().iterator();
    }

    public final void zzd(zzlv zzlvVar, Object obj) {
        if (!zzlvVar.zzd()) {
            zzn(zzlvVar, obj);
        } else {
            if (!(obj instanceof List)) {
                h.s("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i14 = 0; i14 < size; i14++) {
                Object obj2 = list.get(i14);
                zzn(zzlvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzmv) {
            this.zzc = true;
        }
        this.zza.put(zzlvVar, obj);
    }

    public final boolean zze() {
        zzoe zzoeVar = this.zza;
        int iZzc = zzoeVar.zzc();
        for (int i14 = 0; i14 < iZzc; i14++) {
            if (!zzk(zzoeVar.zzd(i14))) {
                return false;
            }
        }
        Iterator it = zzoeVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzoe zzoeVar = this.zza;
        int iZzc = zzoeVar.zzc();
        int iZzm = 0;
        for (int i14 = 0; i14 < iZzc; i14++) {
            iZzm += zzm(zzoeVar.zzd(i14));
        }
        Iterator it = zzoeVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzlw() {
    }
}
