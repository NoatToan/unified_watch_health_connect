package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.zzqp;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class zzhd {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzhd(zzhh zzhhVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fc A[Catch: NumberFormatException | JSONException -> 0x010c, NumberFormatException | JSONException -> 0x010c, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x010c, blocks: (B:10:0x0027, B:24:0x005b, B:24:0x005b, B:26:0x006c, B:26:0x006c, B:28:0x007e, B:28:0x007e, B:29:0x0087, B:29:0x0087, B:51:0x00fc, B:51:0x00fc, B:33:0x0094, B:33:0x0094, B:35:0x00a5, B:35:0x00a5, B:37:0x00b7, B:37:0x00b7, B:38:0x00c0, B:38:0x00c0, B:42:0x00cc, B:42:0x00cc, B:46:0x00dc, B:46:0x00dc, B:50:0x00f0, B:50:0x00f0), top: B:65:0x0027, outer: #0 }] */
    public final Bundle zza() {
        if (this.zzd == null) {
            zzhh zzhhVar = this.zza;
            String string = zzhhVar.zzd().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i14);
                            String string2 = jSONObject.getString(JWKParameterNames.RSA_MODULUS);
                            String string3 = jSONObject.getString(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT);
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                zzqp.zza();
                                                if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaQ)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i15 = 0; i15 < length; i15++) {
                                                        jArr[i15] = jSONArray2.optLong(i15);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                zzhhVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                                            }
                                        } else if (string3.equals("ia")) {
                                            zzqp.zza();
                                            if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaQ)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i16 = 0; i16 < length2; i16++) {
                                                    iArr[i16] = jSONArray3.optInt(i16);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            zzhhVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        zzhhVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    zzhhVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                zzhhVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaV().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    a.j(this.zza.zzu, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }

    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhh zzhhVar = this.zza;
        SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
        int size = bundle2.size();
        String str = this.zzb;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(JWKParameterNames.RSA_MODULUS, str2);
                        zzqp.zza();
                        zzic zzicVar = zzhhVar.zzu;
                        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "d");
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "d");
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e4) {
                        this.zza.zzu.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e4);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }
}
