package com.google.android.gms.measurement.internal;

import am.j;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import i3.e5;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i14 = 0; i14 < strArr.length; i14++) {
            if (Objects.equals(str, strArr[i14])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i14];
                        if (str2 == null) {
                            str2 = strArr2[i14] + "(" + strArr[i14] + ")";
                            strArr3[i14] = str2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzc, zzjm.zza, zza);
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            return str.startsWith("_exp_") ? j.m("experiment_id(", str, ")") : zzg(str, zzjo.zzb, zzjo.zza, zzc);
        }
        return str;
    }

    public final String zzd(zzbg zzbgVar) {
        String string;
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb3 = new StringBuilder("origin=");
        sb3.append(zzbgVar.zzc);
        sb3.append(",name=");
        sb3.append(zza(zzbgVar.zza));
        sb3.append(",params=");
        zzbe zzbeVar = zzbgVar.zzb;
        if (zzbeVar == null) {
            string = null;
        } else {
            string = !zzgmVar.zza() ? zzbeVar.toString() : zze(zzbeVar.zzf());
        }
        sb3.append(string);
        return sb3.toString();
    }

    public final String zze(Bundle bundle) {
        String strZzf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbK = e5.k("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbK.length() != 8) {
                sbK.append(", ");
            }
            sbK.append(zzb(str));
            sbK.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strZzf = zzf(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strZzf = zzf((Object[]) obj);
            } else {
                strZzf = obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbK.append(strZzf);
        }
        sbK.append("}]");
        return sbK.toString();
    }

    public final String zzf(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbK = e5.k("[");
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sbK.length() != 1) {
                    sbK.append(", ");
                }
                sbK.append(strZze);
            }
        }
        sbK.append("]");
        return sbK.toString();
    }
}
