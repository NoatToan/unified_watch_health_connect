package org.acra.file;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.Arrays;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
public final class BulkReportDeleter {

    @NonNull
    private final ReportLocator a;

    public BulkReportDeleter(@NonNull Context context) {
        this.a = new ReportLocator(context);
    }

    public void deleteReports(boolean z, int i) {
        File[] approvedReports = z ? this.a.getApprovedReports() : this.a.getUnapprovedReports();
        Arrays.sort(approvedReports, new LastModifiedComparator());
        for (int i2 = 0; i2 < approvedReports.length - i; i2++) {
            if (!approvedReports[i2].delete()) {
                ACRA.log.w(ACRA.LOG_TAG, "Could not delete report : " + approvedReports[i2]);
            }
        }
    }
}
