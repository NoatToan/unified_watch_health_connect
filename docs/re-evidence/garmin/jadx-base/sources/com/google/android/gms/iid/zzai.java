package com.google.android.gms.iid;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzai {
    private static zzai zzdd;

    public static synchronized zzai zzy() {
        try {
            if (zzdd == null) {
                zzdd = new zzac();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zzdd;
    }

    public abstract zzaj<Boolean> zzd(String str, boolean z14);
}
