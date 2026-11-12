package org.acra.file;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import org.acra.data.CrashReportData;
import org.acra.util.IOUtils;
import org.acra.util.StreamReader;
import org.json.JSONException;

/* JADX INFO: loaded from: classes23.dex */
public final class CrashReportPersister {
    @NonNull
    public CrashReportData load(@NonNull File file) throws JSONException, IOException {
        return new CrashReportData(new StreamReader(file).read());
    }

    public void store(@NonNull CrashReportData crashReportData, @NonNull File file) throws JSONException, IOException {
        IOUtils.writeStringToFile(file, crashReportData.toJSON());
    }
}
