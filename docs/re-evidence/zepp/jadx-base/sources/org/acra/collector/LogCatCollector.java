package org.acra.collector;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.collections.ImmutableList;
import org.acra.collector.LogCatCollector;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.acra.log.ACRALog;
import org.acra.prefs.SharedPreferencesFactory;
import org.acra.util.PackageManagerWrapper;
import org.acra.util.Predicate;
import org.acra.util.StreamReader;

/* JADX INFO: loaded from: classes23.dex */
public final class LogCatCollector extends BaseReportFieldCollector {
    private static final int READ_TIMEOUT = 3000;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            a = iArr;
            try {
                iArr[ReportField.LOGCAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReportField.EVENTSLOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReportField.RADIOLOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LogCatCollector() {
        super(ReportField.LOGCAT, ReportField.EVENTSLOG, ReportField.RADIOLOG);
    }

    private String collectLogCat(@NonNull CoreConfiguration coreConfiguration, @Nullable String str) throws IOException {
        final String str2;
        int iMyPid = Process.myPid();
        Predicate<String> predicate = null;
        if (Build.VERSION.SDK_INT >= 16 || !coreConfiguration.logcatFilterByPid() || iMyPid <= 0) {
            str2 = null;
        } else {
            str2 = Integer.toString(iMyPid) + "):";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("logcat");
        if (str != null) {
            arrayList.add("-b");
            arrayList.add(str);
        }
        ImmutableList<String> immutableListLogcatArguments = coreConfiguration.logcatArguments();
        int iIndexOf = immutableListLogcatArguments.indexOf("-t");
        int i = -1;
        if (iIndexOf > -1 && iIndexOf < immutableListLogcatArguments.size()) {
            i = Integer.parseInt(immutableListLogcatArguments.get(iIndexOf + 1));
        }
        arrayList.addAll(immutableListLogcatArguments);
        Process processStart = new ProcessBuilder(new String[0]).command(arrayList).redirectErrorStream(true).start();
        if (ACRA.DEV_LOGGING) {
            ACRALog aCRALog = ACRA.log;
            String str3 = ACRA.LOG_TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Retrieving logcat output (buffer:");
            if (str == null) {
                str = "default";
            }
            sb.append(str);
            sb.append(")...");
            aCRALog.d(str3, sb.toString());
        }
        try {
            InputStream inputStream = processStart.getInputStream();
            if (str2 != null) {
                predicate = new Predicate() { // from class: rr4
                    @Override // org.acra.util.Predicate
                    public final boolean apply(Object obj) {
                        return LogCatCollector.lambda$collectLogCat$0(str2, (String) obj);
                    }
                };
            }
            return streamToString(coreConfiguration, inputStream, predicate, i);
        } finally {
            processStart.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$collectLogCat$0(String str, String str2) {
        return str2.contains(str);
    }

    @NonNull
    private String streamToString(@NonNull CoreConfiguration coreConfiguration, @NonNull InputStream inputStream, @Nullable Predicate<String> predicate, int i) throws IOException {
        StreamReader limit = new StreamReader(inputStream).setFilter(predicate).setLimit(i);
        if (coreConfiguration.logcatReadNonBlocking()) {
            limit.setTimeout(3000);
        }
        return limit.read();
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws IOException {
        int i = a.a[reportField.ordinal()];
        String str = null;
        if (i != 1) {
            if (i == 2) {
                str = "events";
            } else if (i == 3) {
                str = "radio";
            }
        }
        crashReportData.put(reportField, collectLogCat(coreConfiguration, str));
    }

    @Override // org.acra.collector.BaseReportFieldCollector, org.acra.collector.Collector
    @NonNull
    public Collector.Order getOrder() {
        return Collector.Order.FIRST;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportField reportField, @NonNull ReportBuilder reportBuilder) {
        return super.shouldCollect(context, coreConfiguration, reportField, reportBuilder) && (Build.VERSION.SDK_INT >= 16 || new PackageManagerWrapper(context).hasPermission("android.permission.READ_LOGS")) && new SharedPreferencesFactory(context, coreConfiguration).create().getBoolean(ACRA.PREF_ENABLE_SYSTEM_LOGS, true);
    }
}
