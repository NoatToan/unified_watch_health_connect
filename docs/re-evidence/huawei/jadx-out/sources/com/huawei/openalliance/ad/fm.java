package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class fm implements gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fm f18805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18806b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f18807c = new byte[0];
    private Context d;

    @Override // com.huawei.openalliance.ad.gi
    public void b(String str) {
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            hw.a("ReportSpHandler", "saveConfigMapSmartImpDelay(), configMap is blank");
            return;
        }
        try {
            String str2 = (String) new JSONObject(str).get("smartImpDelay");
            if (com.huawei.openalliance.ad.utils.dg.b(str2)) {
                return;
            }
            hw.a("ReportSpHandler", "saveConfigMapSmartImpDelay(), hasSmartImpDelay:" + str2);
            String[] strArrSplit = str2.trim().split(",");
            if (strArrSplit.length > 1) {
                a(Integer.valueOf(strArrSplit[0]).intValue());
                b(Integer.valueOf(strArrSplit[1]).intValue());
            }
        } catch (Throwable th) {
            hw.c("ReportSpHandler", "saveConfigMapSmartImpDelay(), exception:" + th.getClass().getSimpleName());
        }
    }

    public void b(int i) {
        synchronized (this.f18807c) {
            c().edit().putInt("maxSmartImpDelay", i).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gi
    public int b() {
        int i;
        synchronized (this.f18807c) {
            i = c().getInt("maxSmartImpDelay", 0);
        }
        return i;
    }

    @Override // com.huawei.openalliance.ad.gi
    public void a(String str, long j) {
        synchronized (this.f18807c) {
            c().edit().putLong("last_rpt_time_" + str, j).commit();
        }
    }

    public void a(int i) {
        synchronized (this.f18807c) {
            c().edit().putInt("minSmartImpDelay", i).commit();
        }
    }

    @Override // com.huawei.openalliance.ad.gi
    public long a(String str) {
        long j;
        synchronized (this.f18807c) {
            j = c().getLong("last_rpt_time_" + str, 0L);
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.gi
    public int a() {
        int i;
        synchronized (this.f18807c) {
            i = c().getInt("minSmartImpDelay", 0);
        }
        return i;
    }

    private SharedPreferences c() {
        return this.d.getSharedPreferences("hiad_report", 4);
    }

    private static fm b(Context context) {
        fm fmVar;
        synchronized (f18806b) {
            if (f18805a == null) {
                f18805a = new fm(context);
            }
            fmVar = f18805a;
        }
        return fmVar;
    }

    public static fm a(Context context) {
        return b(context);
    }

    private fm(Context context) {
        this.d = com.huawei.openalliance.ad.utils.ab.i(context.getApplicationContext());
    }
}
