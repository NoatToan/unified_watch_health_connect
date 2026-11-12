package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class v0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13508a = q0.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13510c;
    private String d;

    @Override // java.lang.Runnable
    public void run() {
        v.a("hmsSdk", "eventReportTask is running");
        boolean zA = c0.a(this.f13508a);
        if (zA) {
            v.c("hmsSdk", "workKey is refresh,begin report all data");
            this.f13510c = "alltype";
        }
        try {
            try {
                Map<String, List<b1>> mapA = c1.a(this.f13508a, this.f13509b, this.f13510c);
                if (mapA.size() == 0) {
                    v.b("hmsSdk", "no events to report, tag: %s, type: %s", this.f13509b, this.f13510c);
                    if ("alltype".equals(this.f13510c)) {
                        d.a(this.f13508a, "stat_v2_1", new String[0]);
                        d.a(this.f13508a, "cached_v2_1", new String[0]);
                        return;
                    } else {
                        String strA = n1.a(this.f13509b, this.f13510c);
                        d.a(this.f13508a, "stat_v2_1", strA);
                        d.a(this.f13508a, "cached_v2_1", strA);
                        return;
                    }
                }
                for (Map.Entry<String, List<b1>> entry : mapA.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
                if ("alltype".equals(this.f13510c)) {
                    d.a(this.f13508a, "stat_v2_1", new String[0]);
                    d.a(this.f13508a, "cached_v2_1", new String[0]);
                } else {
                    String strA2 = n1.a(this.f13509b, this.f13510c);
                    d.a(this.f13508a, "stat_v2_1", strA2);
                    d.a(this.f13508a, "cached_v2_1", strA2);
                }
                if (zA) {
                    v.c("hmsSdk", "refresh local key");
                    o0.d().b();
                }
            } catch (IllegalArgumentException e) {
                v.e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e.getMessage());
                if ("alltype".equals(this.f13510c)) {
                    d.a(this.f13508a, "stat_v2_1", new String[0]);
                    d.a(this.f13508a, "cached_v2_1", new String[0]);
                } else {
                    String strA3 = n1.a(this.f13509b, this.f13510c);
                    d.a(this.f13508a, "stat_v2_1", strA3);
                    d.a(this.f13508a, "cached_v2_1", strA3);
                }
            } catch (Exception e2) {
                v.e("hmsSdk", "readEventRecords handData Exception:" + e2.getMessage());
                if ("alltype".equals(this.f13510c)) {
                    d.a(this.f13508a, "stat_v2_1", new String[0]);
                    d.a(this.f13508a, "cached_v2_1", new String[0]);
                } else {
                    String strA4 = n1.a(this.f13509b, this.f13510c);
                    d.a(this.f13508a, "stat_v2_1", strA4);
                    d.a(this.f13508a, "cached_v2_1", strA4);
                }
            }
        } catch (Throwable th) {
            if ("alltype".equals(this.f13510c)) {
                d.a(this.f13508a, "stat_v2_1", new String[0]);
                d.a(this.f13508a, "cached_v2_1", new String[0]);
            } else {
                String strA5 = n1.a(this.f13509b, this.f13510c);
                d.a(this.f13508a, "stat_v2_1", strA5);
                d.a(this.f13508a, "cached_v2_1", strA5);
            }
            throw th;
        }
    }

    private void a(String str, List<b1> list) {
        Pair<String, String> pairA = n1.a(str);
        new u(list, (String) pairA.first, (String) pairA.second, this.d).a();
    }

    public v0(String str, String str2, String str3) {
        this.f13509b = str;
        this.f13510c = str2;
        this.d = str3;
    }
}
