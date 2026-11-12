package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {
    private String a;
    private final long b;
    private final Map<String, Object> c;

    public zzaa(String str, long j, Map<String, Object> map) {
        this.a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.b == zzaaVar.b && this.a.equals(zzaaVar.a)) {
            return this.c.equals(zzaaVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        long j = this.b;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        String string = this.c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + string.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }

    public final long zza() {
        return this.b;
    }

    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.a, this.b, new HashMap(this.c));
    }

    public final Object zzc(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.a;
    }

    public final Map<String, Object> zze() {
        return this.c;
    }

    public final void zzf(String str) {
        this.a = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, obj);
        }
    }
}
