package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzao {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzar f;

    public zzao(zzfv zzfvVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzar zzarVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            zzfvVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzel.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzarVar = new zzar(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next == null) {
                    zzfvVar.zzay().zzd().zza("Param name can't be null");
                    it2.remove();
                } else {
                    Object objB = zzfvVar.zzv().b(next, bundle2.get(next));
                    if (objB == null) {
                        zzfvVar.zzay().zzk().zzb("Param value can't be null", zzfvVar.zzj().zze(next));
                        it2.remove();
                    } else {
                        zzfvVar.zzv().k(bundle2, next, objB);
                    }
                }
            }
            zzarVar = new zzar(bundle2);
        }
        this.f = zzarVar;
    }

    public final zzao a(zzfv zzfvVar, long j) {
        return new zzao(zzfvVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String string = this.f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + string.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }

    private zzao(zzfv zzfvVar, String str, String str2, String str3, long j, long j2, zzar zzarVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzarVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            zzfvVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzel.zzn(str2), zzel.zzn(str3));
        }
        this.f = zzarVar;
    }
}
