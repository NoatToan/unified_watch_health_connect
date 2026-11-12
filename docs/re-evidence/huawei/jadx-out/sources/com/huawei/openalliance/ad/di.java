package com.huawei.openalliance.ad;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gi f18392b;

    public void a() {
        try {
            long jA = this.f18392b.a("143");
            hw.a("DbSizeMonitor", "lastRptTime:%s", Long.valueOf(jA));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jA < 86400000) {
                hw.a("DbSizeMonitor", "rpt once time a day");
                return;
            }
            this.f18392b.a("143", jCurrentTimeMillis);
            File databasePath = com.huawei.openalliance.ad.utils.ab.i(this.f18391a).getDatabasePath("hiad_recd.db");
            if (databasePath.exists()) {
                new com.huawei.openalliance.ad.analysis.c(this.f18391a).a("hiad_recd", databasePath.length());
            }
        } catch (Throwable th) {
            hw.c("DbSizeMonitor", "check db size ex:%s", th.getClass().getSimpleName());
        }
    }

    public di(Context context) {
        this.f18391a = context;
        this.f18392b = fm.a(context);
    }
}
