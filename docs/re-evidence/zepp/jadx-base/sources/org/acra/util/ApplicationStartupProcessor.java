package org.acra.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;
import org.acra.file.BulkReportDeleter;
import org.acra.prefs.SharedPreferencesFactory;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public final class ApplicationStartupProcessor {
    private final Context a;
    private final CoreConfiguration b;
    private final BulkReportDeleter c;

    public ApplicationStartupProcessor(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        this.a = context;
        this.b = coreConfiguration;
        this.c = new BulkReportDeleter(context);
    }

    private void b() {
        SharedPreferences sharedPreferencesCreate = new SharedPreferencesFactory(this.a, this.b).create();
        long j = sharedPreferencesCreate.getInt(ACRA.PREF_LAST_VERSION_NR, 0);
        int iC = c();
        if (iC > j) {
            this.c.deleteReports(true, 0);
            this.c.deleteReports(false, 0);
            sharedPreferencesCreate.edit().putInt(ACRA.PREF_LAST_VERSION_NR, iC).apply();
        }
    }

    private int c() {
        PackageInfo packageInfo = new PackageManagerWrapper(this.a).getPackageInfo();
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.b.deleteOldUnsentReportsOnApplicationStart()) {
            b();
        }
    }

    public void checkReports() {
        new Thread(new Runnable() { // from class: pi
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        }).start();
    }
}
