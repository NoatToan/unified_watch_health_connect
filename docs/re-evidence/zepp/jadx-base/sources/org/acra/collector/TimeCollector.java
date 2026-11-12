package org.acra.collector;

import android.content.Context;
import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.acra.ACRAConstants;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;

/* JADX INFO: loaded from: classes23.dex */
public final class TimeCollector extends BaseReportFieldCollector implements ApplicationStartupCollector {
    private Calendar appStartDate;
    private final SimpleDateFormat dateFormat;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            a = iArr;
            try {
                iArr[ReportField.USER_APP_START_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReportField.USER_CRASH_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TimeCollector() {
        super(ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE);
        this.dateFormat = new SimpleDateFormat(ACRAConstants.DATE_TIME_FORMAT_STRING, Locale.ENGLISH);
    }

    @NonNull
    private String getTimeString(@NonNull Calendar calendar) {
        return this.dateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) {
        Calendar gregorianCalendar;
        int i = a.a[reportField.ordinal()];
        if (i == 1) {
            gregorianCalendar = this.appStartDate;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            gregorianCalendar = new GregorianCalendar();
        }
        crashReportData.put(reportField, getTimeString(gregorianCalendar));
    }

    @Override // org.acra.collector.ApplicationStartupCollector
    public void collectApplicationStartUp(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        if (coreConfiguration.reportContent().contains(ReportField.USER_APP_START_DATE)) {
            this.appStartDate = new GregorianCalendar();
        }
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportField reportField, @NonNull ReportBuilder reportBuilder) {
        return reportField == ReportField.USER_CRASH_DATE || super.shouldCollect(context, coreConfiguration, reportField, reportBuilder);
    }
}
