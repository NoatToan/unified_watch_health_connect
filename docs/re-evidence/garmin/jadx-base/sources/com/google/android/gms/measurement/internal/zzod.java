package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class zzod {
    private final Map zza;

    public zzod(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    private final Bundle zzf() {
        int iZzg;
        Map map = this.zza;
        if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("GoogleConsent")) && (iZzg = zzg()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(zzjk.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(zzjk.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iZzg >= 4) {
                    String str3 = zzjk.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    private final int zzg() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzod) {
            return zza().equalsIgnoreCase(((zzod) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zza() {
        StringBuilder sb3 = new StringBuilder();
        ImmutableList immutableList = zzof.zza;
        int size = immutableList.size();
        for (int i14 = 0; i14 < size; i14++) {
            String str = (String) immutableList.get(i14);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb3.length() > 0) {
                    sb3.append(";");
                }
                sb3.append(str);
                sb3.append("=");
                sb3.append((String) map.get(str));
            }
        }
        return sb3.toString();
    }

    public final Bundle zzb() {
        zzfx zzfxVar = zzfy.zzaZ;
        boolean zBooleanValue = ((Boolean) zzfxVar.zzb(null)).booleanValue();
        Map map = this.zza;
        if (!zBooleanValue ? !(!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("GoogleConsent")) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("gdprApplies")) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("EnableAdvertiserConsentMode"))) : !(!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("gdprApplies")) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("EnableAdvertiserConsentMode")))) {
            if (!((Boolean) zzfxVar.zzb(null)).booleanValue()) {
                return zzf();
            }
            Map map2 = this.zza;
            if (map2.get("Version") == null) {
                return zzf();
            }
            if (zzg() >= 0) {
                Bundle bundle = new Bundle();
                bundle.putString(zzjk.AD_STORAGE.zze, true != Objects.equals(map2.get("AuthorizePurpose1"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? "denied" : "granted");
                bundle.putString(zzjk.AD_PERSONALIZATION.zze, (Objects.equals(map2.get("AuthorizePurpose3"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && Objects.equals(map2.get("AuthorizePurpose4"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) ? "granted" : "denied");
                if (zzg() >= 4) {
                    bundle.putString(zzjk.AD_USER_DATA.zze, (Objects.equals(map2.get("AuthorizePurpose1"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && Objects.equals(map2.get("AuthorizePurpose7"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final String zzc() {
        String str = (String) this.zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zzd(zzod zzodVar) {
        Map map = zzodVar.zza;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzodVar.zzb();
        return str.concat((bundleZzb.size() == bundleZzb2.size() && Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage")) && Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization")) && Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public final String zze() {
        StringBuilder sb3 = new StringBuilder(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        int i14 = -1;
        try {
            String str = (String) this.zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i14 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i14 < 0 || i14 > 4095) {
            sb3.append("00");
        } else {
            sb3.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i14 >> 6));
            sb3.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i14 & 63));
        }
        int iZzg = zzg();
        if (iZzg < 0 || iZzg > 63) {
            sb3.append("0");
        } else {
            sb3.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzg));
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        int i15 = true != IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("EnableAdvertiserConsentMode"));
        int i16 = i15 | 4;
        if (zEquals) {
            i16 = i15 | 12;
        }
        sb3.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16));
        return sb3.toString();
    }
}
