package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class zzof {
    static final ImmutableList zza = ImmutableList.of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean zzc(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, boolean z15, boolean z16) {
        int i19;
        int i24;
        ImmutableSet immutableSet2;
        String str4;
        zzoe zzoeVar;
        char c14;
        int iZze = zze(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true);
        if (iZze > 0) {
            i24 = i16;
            if (i24 == 1) {
                i19 = i15;
                if (i19 != 1) {
                    i24 = 1;
                } else {
                    i19 = 1;
                    i24 = 1;
                }
            } else {
                i19 = i15;
            }
            cArr[iZze] = '2';
        } else {
            i19 = i15;
            i24 = i16;
        }
        if (zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i18, str, str2, str3, z14, z15, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c14 = '3';
        } else {
            int i25 = i18;
            if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                immutableSet2 = immutableSet;
                str4 = str;
                if (i25 == 1) {
                    if (immutableSet2.contains(str4)) {
                        if (iZze > 0 && cArr[iZze] != '2') {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i25 = 1;
                }
            } else {
                immutableSet2 = immutableSet;
                str4 = str;
            }
            if (immutableMap.containsKey(zzkpVar) && (zzoeVar = (zzoe) immutableMap.get(zzkpVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true) : zzg(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true);
                        }
                        if (iOrdinal == 3) {
                            return zzi(zzkpVar, immutableMap, immutableMap2, immutableSet2, cArr, i14, i19, i24, i17, i25, str4, str2, str3, z14, z15, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true) : zzh(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true);
                        }
                        c14 = '0';
                    } else if (zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true);
                    }
                } else if (zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i19, i24, i17, i25, str, str2, str3, z14, z15, true);
                }
                c14 = '8';
            } else {
                c14 = '0';
            }
        }
        if (iZze <= 0 || cArr[iZze] == '2') {
            return false;
        }
        cArr[iZze] = c14;
        return false;
    }

    public static final Map zzd(ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, boolean z15, boolean z16) {
        if (!z16) {
            return ImmutableMap.of();
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar2);
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkq zzkqVar3 = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar3);
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar4 = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar4);
        ImmutableMap.Builder builderPut = ImmutableMap.builder().put("Version", "2");
        String str4 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        ImmutableMap.Builder builderPutAll = builderPut.put("VendorConsent", true != z14 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).put("VendorLegitimateInterest", true != z15 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).put("gdprApplies", i16 != 1 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).put("EnableAdvertiserConsentMode", i15 != 1 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).put("PolicyVersion", String.valueOf(i17)).put("CmpSdkID", String.valueOf(i14)).put("PurposeOneTreatment", i18 != 1 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).put("PublisherCC", str).put("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).putAll(ImmutableMap.of("Purpose1", zzf(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true), "Purpose3", zzf(zzkpVar2, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true), "Purpose4", zzf(zzkpVar3, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true), "Purpose7", zzf(zzkpVar4, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true)));
        Object obj = true != zzc(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        Object obj2 = true != zzc(zzkpVar2, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        Object obj3 = true != zzc(zzkpVar3, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (true != zzc(zzkpVar4, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true)) {
            str4 = "0";
        }
        return builderPutAll.putAll(ImmutableMap.of("AuthorizePurpose1", (String) obj, "AuthorizePurpose3", (String) obj2, "AuthorizePurpose4", (String) obj3, "AuthorizePurpose7", str4, "PurposeDiagnostics", new String(cArr))).buildOrThrow();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, boolean z15, boolean z16) {
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, boolean z15, boolean z16) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, boolean z15, boolean z16) {
        char c14;
        int iZze = zze(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true);
        if (!z14) {
            c14 = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char cCharAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z17 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z17;
            }
            c14 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c14;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, boolean z15, boolean z16) {
        char c14;
        int iZze = zze(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i14, i15, i16, i17, i18, str, str2, str3, z14, z15, true);
        if (!z15) {
            c14 = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char cCharAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z17 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z17;
            }
            c14 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c14;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i14, int i15, int i16, int i17, int i18, String str, String str2, String str3, boolean z14, boolean z15, boolean z16) {
        return (com.google.android.gms.internal.measurement.zzkq) immutableMap2.getOrDefault(zzkpVar, com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
