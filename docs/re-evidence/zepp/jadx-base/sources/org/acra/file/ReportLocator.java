package org.acra.file;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public final class ReportLocator {
    private static final String b = "ACRA-unapproved";
    private static final String c = "ACRA-approved";
    private final Context a;

    public ReportLocator(@NonNull Context context) {
        this.a = context;
    }

    @NonNull
    public File getApprovedFolder() {
        return this.a.getDir(c, 0);
    }

    @NonNull
    public File[] getApprovedReports() {
        File[] fileArrListFiles = getApprovedFolder().listFiles();
        if (fileArrListFiles == null) {
            return new File[0];
        }
        Arrays.sort(fileArrListFiles, new LastModifiedComparator());
        return fileArrListFiles;
    }

    @NonNull
    public File getUnapprovedFolder() {
        return this.a.getDir(b, 0);
    }

    @NonNull
    public File[] getUnapprovedReports() {
        File[] fileArrListFiles = getUnapprovedFolder().listFiles();
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }
}
