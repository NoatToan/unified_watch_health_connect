package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaz {
    public static final zzaz zza = new zzaz((Boolean) null, 100, (Boolean) null, (String) null);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    public zzaz(Boolean bool, int i14, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.zzf = enumMap;
        enumMap.put(zzjk.AD_USER_DATA, zzjl.zzh(bool));
        this.zzb = i14;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzaz zza(zzji zzjiVar, int i14) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        enumMap.put(zzjk.AD_USER_DATA, zzjiVar);
        return new zzaz(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzaz zzg(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(":");
        int i14 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.DMA.zza();
        int length = zzjkVarArrZza.length;
        int i15 = 1;
        int i16 = 0;
        while (i16 < length) {
            enumMap.put(zzjkVarArrZza[i16], zzjl.zzj(strArrSplit[i15].charAt(0)));
            i16++;
            i15++;
        }
        return new zzaz(enumMap, i14, (Boolean) null, (String) null);
    }

    public static zzaz zzh(Bundle bundle, int i14) {
        if (bundle == null) {
            return new zzaz((Boolean) null, i14, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            enumMap.put(zzjkVar, zzjl.zzg(bundle.getString(zzjkVar.zze)));
        }
        return new zzaz(enumMap, i14, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean zzi(Bundle bundle) {
        zzji zzjiVarZzg;
        if (bundle == null || (zzjiVarZzg = zzjl.zzg(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjiVarZzg.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String zzl() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.zzb);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb3.append(":");
            sb3.append(zzjl.zzm((zzji) this.zzf.get(zzjkVar)));
        }
        return sb3.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaz)) {
            return false;
        }
        zzaz zzazVar = (zzaz) obj;
        if (this.zzc.equalsIgnoreCase(zzazVar.zzc) && Objects.equals(this.zzd, zzazVar.zzd)) {
            return Objects.equals(this.zze, zzazVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        int i14;
        Boolean bool = this.zzd;
        if (bool == null) {
            i14 = 3;
        } else {
            i14 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.zze;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.zzc.hashCode() + (i14 * 29);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("source=");
        sb3.append(zzjl.zzd(this.zzb));
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb3.append(",");
            sb3.append(zzjkVar.zze);
            sb3.append("=");
            zzji zzjiVar = (zzji) this.zzf.get(zzjkVar);
            if (zzjiVar == null) {
                sb3.append("uninitialized");
            } else {
                int iOrdinal = zzjiVar.ordinal();
                if (iOrdinal == 0) {
                    sb3.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb3.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb3.append("denied");
                } else if (iOrdinal == 3) {
                    sb3.append("granted");
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            sb3.append(",isDmaRegion=");
            sb3.append(bool);
        }
        String str = this.zze;
        if (str != null) {
            sb3.append(",cpsDisplayStr=");
            sb3.append(str);
        }
        return sb3.toString();
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzji zzc() {
        zzji zzjiVar = (zzji) this.zzf.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final boolean zzd() {
        Iterator it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String zze() {
        return this.zzc;
    }

    public final Bundle zzf() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzf.entrySet()) {
            String strZzi = zzjl.zzi((zzji) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjk) entry.getKey()).zze, strZzi);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final Boolean zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }

    private zzaz(EnumMap enumMap, int i14, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i14;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
