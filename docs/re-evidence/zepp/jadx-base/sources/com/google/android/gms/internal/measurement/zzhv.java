package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhv implements r1 {

    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map<String, zzhv> c = new ArrayMap();
    private final SharedPreferences a;
    private final SharedPreferences.OnSharedPreferenceChangeListener b;

    public static zzhv a(Context context, String str) {
        zzhv zzhvVar;
        if (zzgw.zza()) {
            throw null;
        }
        synchronized (zzhv.class) {
            zzhvVar = c.get(null);
            if (zzhvVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzhvVar;
    }

    public static synchronized void b() {
        Map<String, zzhv> map = c;
        Iterator<zzhv> it2 = map.values().iterator();
        if (it2.hasNext()) {
            SharedPreferences sharedPreferences = it2.next().a;
            throw null;
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.measurement.r1
    public final Object zzb(String str) {
        throw null;
    }
}
