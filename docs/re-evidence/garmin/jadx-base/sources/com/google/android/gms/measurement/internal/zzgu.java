package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import j20.x;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgu extends zzjf {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzgs zzd;
    private final zzgs zze;
    private final zzgs zzf;
    private final zzgs zzg;
    private final zzgs zzh;
    private final zzgs zzi;
    private final zzgs zzj;
    private final zzgs zzk;
    private final zzgs zzl;

    public zzgu(zzic zzicVar) {
        super(zzicVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgs(this, 6, false, false);
        this.zze = new zzgs(this, 6, true, false);
        this.zzf = new zzgs(this, 6, false, true);
        this.zzg = new zzgs(this, 5, false, false);
        this.zzh = new zzgs(this, 5, true, false);
        this.zzi = new zzgs(this, 5, false, true);
        this.zzj = new zzgs(this, 4, false, false);
        this.zzk = new zzgs(this, 3, false, false);
        this.zzl = new zzgs(this, 2, false, false);
    }

    public static Object zzl(String str) {
        if (str == null) {
            return null;
        }
        return new zzgt(str);
    }

    public static String zzo(boolean z14, String str, Object obj, Object obj2, Object obj3) {
        String strZzp = zzp(z14, obj);
        String strZzp2 = zzp(z14, obj2);
        String strZzp3 = zzp(z14, obj3);
        StringBuilder sb3 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb3.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZzp)) {
            sb3.append(str2);
            sb3.append(strZzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZzp2)) {
            str3 = str2;
        } else {
            sb3.append(str2);
            sb3.append(strZzp2);
        }
        if (!TextUtils.isEmpty(strZzp3)) {
            sb3.append(str3);
            sb3.append(strZzp3);
        }
        return sb3.toString();
    }

    public static String zzp(boolean z14, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z14) {
                return obj.toString();
            }
            Long l14 = (Long) obj;
            if (Math.abs(l14.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l14.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb3 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            x.j(jRound, str, "...", sb3);
            sb3.append(str);
            sb3.append(jRound2);
            return sb3.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof zzgt) {
                return ((zzgt) obj).zza();
            }
            return z14 ? "-" : obj.toString();
        }
        Throwable th3 = (Throwable) obj;
        StringBuilder sb4 = new StringBuilder(z14 ? th3.getClass().getName() : th3.toString());
        String strZzq = zzq(zzic.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(strZzq)) {
                sb4.append(": ");
                sb4.append(stackTraceElement);
                break;
            }
        }
        return sb4.toString();
    }

    public static String zzq(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return false;
    }

    public final zzgs zzb() {
        return this.zzd;
    }

    public final zzgs zzc() {
        return this.zze;
    }

    public final zzgs zzd() {
        return this.zzf;
    }

    public final zzgs zze() {
        return this.zzg;
    }

    public final zzgs zzf() {
        return this.zzh;
    }

    public final zzgs zzh() {
        return this.zzi;
    }

    public final zzgs zzi() {
        return this.zzj;
    }

    public final zzgs zzj() {
        return this.zzk;
    }

    public final zzgs zzk() {
        return this.zzl;
    }

    public final void zzm(int i14, boolean z14, boolean z15, String str, Object obj, Object obj2, Object obj3) {
        if (!z14 && Log.isLoggable(zzn(), i14)) {
            Log.println(i14, zzn(), zzo(false, str, obj, obj2, obj3));
        }
        if (z15 || i14 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhz zzhzVarZzi = this.zzu.zzi();
        if (zzhzVarZzi == null) {
            Log.println(6, zzn(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzhzVarZzi.zzv()) {
                Log.println(6, zzn(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i14 >= 9) {
                i14 = 8;
            }
            zzhzVarZzi.zzj(new zzgr(this, i14, str, obj, obj2, obj3));
        }
    }

    public final String zzn() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzu.zzc().zzb();
                }
                Preconditions.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }

    public final /* synthetic */ char zzr() {
        return this.zza;
    }

    public final /* synthetic */ void zzs(char c14) {
        this.zza = c14;
    }

    public final /* synthetic */ long zzt() {
        return this.zzb;
    }

    public final /* synthetic */ void zzu(long j8) {
        this.zzb = 133005L;
    }
}
