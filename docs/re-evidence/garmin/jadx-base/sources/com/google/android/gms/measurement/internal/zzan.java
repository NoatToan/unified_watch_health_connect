package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes14.dex */
final class zzan {
    private final EnumMap zza;

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzan zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        if (str.length() >= zzjk.values().length) {
            int i14 = 0;
            if (str.charAt(0) == '1') {
                zzjk[] zzjkVarArrValues = zzjk.values();
                int length = zzjkVarArrValues.length;
                int i15 = 1;
                while (i14 < length) {
                    enumMap.put(zzjkVarArrValues[i14], zzam.zza(str.charAt(i15)));
                    i14++;
                    i15++;
                }
                return new zzan(enumMap);
            }
        }
        return new zzan();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.zza.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb3.append(zzamVar.zzb());
        }
        return sb3.toString();
    }

    public final zzam zza(zzjk zzjkVar) {
        zzam zzamVar = (zzam) this.zza.get(zzjkVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void zzb(zzjk zzjkVar, int i14) {
        zzam zzamVar = zzam.UNSET;
        if (i14 == -30) {
            zzamVar = zzam.TCF;
        } else if (i14 == -20) {
            zzamVar = zzam.API;
        } else if (i14 == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i14 == 0) {
            zzamVar = zzam.API;
        } else if (i14 == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.zza.put(zzjkVar, zzamVar);
    }

    public final void zzc(zzjk zzjkVar, zzam zzamVar) {
        this.zza.put(zzjkVar, zzamVar);
    }

    public zzan() {
        this.zza = new EnumMap(zzjk.class);
    }
}
