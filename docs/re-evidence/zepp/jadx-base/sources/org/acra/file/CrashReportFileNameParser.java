package org.acra.file;

import androidx.annotation.NonNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: classes23.dex */
public final class CrashReportFileNameParser {
    @NonNull
    public Calendar getTimestamp(@NonNull String str) {
        String strReplace = str.replace(ACRAConstants.REPORTFILE_EXTENSION, "").replace(ACRAConstants.SILENT_SUFFIX, "");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat(ACRAConstants.DATE_TIME_FORMAT_STRING, Locale.ENGLISH).parse(strReplace));
        } catch (ParseException unused) {
        }
        return calendar;
    }

    @Deprecated
    public boolean isApproved(@NonNull String str) {
        return isSilent(str) || str.contains(ACRAConstants.APPROVED_SUFFIX);
    }

    public boolean isSilent(@NonNull String str) {
        return str.contains(ACRAConstants.SILENT_SUFFIX);
    }
}
