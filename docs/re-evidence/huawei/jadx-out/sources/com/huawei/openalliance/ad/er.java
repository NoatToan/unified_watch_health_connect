package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class er implements fx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static fx f18715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18716c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18717a;
    private final byte[] d = new byte[0];
    private List<String> e;

    @Override // com.huawei.openalliance.ad.fx
    public List<String> b() {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18717a;
            if (sharedPreferences != null) {
                List<String> list = this.e;
                if (list != null) {
                    return list;
                }
                String string = sharedPreferences.getString("aud_id", "");
                if (!com.huawei.openalliance.ad.utils.dg.b(string)) {
                    List<String> list2 = (List) com.huawei.openalliance.ad.utils.bk.b(string, List.class, String.class);
                    this.e = list2;
                    return list2;
                }
            }
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.fx
    public void a(String str) {
        synchronized (this.d) {
            if (this.f18717a != null) {
                this.e = (List) com.huawei.openalliance.ad.utils.bk.b(str, List.class, String.class);
                this.f18717a.edit().putString("aud_id", str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.fx
    public void a(long j) {
        synchronized (this.d) {
            this.f18717a.edit().putLong("last_query_audid_time", j).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.fx
    public long a() {
        long j;
        synchronized (this.d) {
            j = this.f18717a.getLong("last_query_audid_time", 0L);
        }
        return j;
    }

    private static fx b(Context context) {
        fx fxVar;
        synchronized (f18716c) {
            if (f18715b == null) {
                f18715b = new er(context);
            }
            fxVar = f18715b;
        }
        return fxVar;
    }

    public static fx a(Context context) {
        return b(context);
    }

    private er(Context context) {
        try {
            this.f18717a = context.getApplicationContext().getSharedPreferences("hiad_audids", 0);
        } catch (Throwable th) {
            try {
                hw.c("AudIdSpHandler", "get SharedPreference exception: %s", th.getClass().getSimpleName());
            } finally {
                this.f18717a = null;
            }
        }
    }
}
