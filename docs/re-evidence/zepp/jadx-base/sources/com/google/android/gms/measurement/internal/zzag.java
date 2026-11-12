package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzag {
    public static final zzag zza = new zzag(null, null);
    private final Boolean a;
    private final Boolean b;

    public zzag(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public static Boolean a(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final int b(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean c(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Boolean d(char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final char e(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static zzag zza(Bundle bundle) {
        return bundle == null ? zza : new zzag(c(bundle.getString("ad_storage")), c(bundle.getString("analytics_storage")));
    }

    public static zzag zzb(String str) {
        Boolean boolD;
        Boolean bool = null;
        if (str != null) {
            Boolean boolD2 = str.length() >= 3 ? d(str.charAt(2)) : null;
            boolD = str.length() >= 4 ? d(str.charAt(3)) : null;
            bool = boolD2;
        } else {
            boolD = null;
        }
        return new zzag(bool, boolD);
    }

    public static String zzh(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && c(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || c(string2) != null) {
            return null;
        }
        return string2;
    }

    public static boolean zzl(int i, int i2) {
        return i <= i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return b(this.a) == b(zzagVar.a) && b(this.b) == b(zzagVar.b);
    }

    public final int hashCode() {
        return ((b(this.a) + 527) * 31) + b(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.a;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }

    public final zzag zzc(zzag zzagVar) {
        return new zzag(a(this.a, zzagVar.a), a(this.b, zzagVar.b));
    }

    public final zzag zzd(zzag zzagVar) {
        Boolean bool = this.a;
        if (bool == null) {
            bool = zzagVar.a;
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            bool2 = zzagVar.b;
        }
        return new zzag(bool, bool2);
    }

    public final Boolean zze() {
        return this.a;
    }

    public final Boolean zzf() {
        return this.b;
    }

    public final String zzi() {
        return "G1" + e(this.a) + e(this.b);
    }

    public final boolean zzj() {
        Boolean bool = this.a;
        return bool == null || bool.booleanValue();
    }

    public final boolean zzk() {
        Boolean bool = this.b;
        return bool == null || bool.booleanValue();
    }

    public final boolean zzm(zzag zzagVar) {
        Boolean bool = this.a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || zzagVar.a == bool2) {
            return this.b == bool2 && zzagVar.b != bool2;
        }
        return true;
    }
}
