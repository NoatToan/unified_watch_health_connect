package org.acra.legacy;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FilenameFilter;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.file.CrashReportFileNameParser;
import org.acra.file.ReportLocator;

/* JADX INFO: loaded from: classes23.dex */
final class c {
    private final Context a;
    private final CrashReportFileNameParser b = new CrashReportFileNameParser();
    private final ReportLocator c;

    public c(@NonNull Context context) {
        this.a = context;
        this.c = new ReportLocator(context);
    }

    @NonNull
    private File[] b() {
        File filesDir = this.a.getFilesDir();
        if (filesDir == null) {
            ACRA.log.w(ACRA.LOG_TAG, "Application files directory does not exist! The application may not be installed correctly. Please try reinstalling.");
            return new File[0];
        }
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Looking for error files in " + filesDir.getAbsolutePath());
        }
        File[] fileArrListFiles = filesDir.listFiles(new FilenameFilter() { // from class: org.acra.legacy.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return c.c(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(File file, String str) {
        return str.endsWith(ACRAConstants.REPORTFILE_EXTENSION);
    }

    public void d() {
        ACRA.log.i(ACRA.LOG_TAG, "Migrating unsent ACRA reports to new file locations");
        File[] fileArrB = b();
        for (File file : fileArrB) {
            String name = file.getName();
            if (this.b.isApproved(name)) {
                if (file.renameTo(new File(this.c.getApprovedFolder(), name)) && ACRA.DEV_LOGGING) {
                    ACRA.log.d(ACRA.LOG_TAG, "Cold not migrate unsent ACRA crash report : " + name);
                }
            } else if (file.renameTo(new File(this.c.getUnapprovedFolder(), name)) && ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Cold not migrate unsent ACRA crash report : " + name);
            }
        }
        ACRA.log.i(ACRA.LOG_TAG, "Migrated " + fileArrB.length + " unsent reports");
    }
}
