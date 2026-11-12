package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class SessionReportingCoordinator implements i {
    private static final String f = "crash";
    private static final String g = "error";
    private static final int h = 4;
    private static final int i = 8;
    private static final int j = 8192;
    private final CrashlyticsReportDataCapture a;
    private final CrashlyticsReportPersistence b;
    private final DataTransportCrashlyticsReportSender c;
    private final LogFileManager d;
    private final UserMetadata e;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata) {
        this.a = crashlyticsReportDataCapture;
        this.b = crashlyticsReportPersistence;
        this.c = dataTransportCrashlyticsReportSender;
        this.d = logFileManager;
        this.e = userMetadata;
    }

    private CrashlyticsReport.Session.Event c(CrashlyticsReport.Session.Event event) {
        return d(event, this.d, this.e);
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsDataProvider settingsDataProvider) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy), new CrashlyticsReportPersistence(fileStore, settingsDataProvider), DataTransportCrashlyticsReportSender.create(context), logFileManager, userMetadata);
    }

    private CrashlyticsReport.Session.Event d(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> listG = g(userMetadata.getCustomKeys());
        List<CrashlyticsReport.CustomAttribute> listG2 = g(userMetadata.getInternalKeys());
        if (!listG.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(ImmutableList.from(listG)).setInternalKeys(ImmutableList.from(listG2)).build());
        }
        return builder.build();
    }

    @RequiresApi(api = 30)
    private static CrashlyticsReport.ApplicationExitInfo e(ApplicationExitInfo applicationExitInfo) {
        String strConvertInputStreamToString = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strConvertInputStreamToString = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e) {
            Logger.getLogger().w("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(strConvertInputStreamToString).build();
    }

    @Nullable
    @RequiresApi(api = 30)
    private ApplicationExitInfo f(String str, List<ApplicationExitInfo> list) {
        long startTimestampMillis = this.b.getStartTimestampMillis(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < startTimestampMillis) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    @NonNull
    private static List<CrashlyticsReport.CustomAttribute> g(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        Collections.sort(arrayList, new Comparator() { // from class: no6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SessionReportingCoordinator.h((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(CrashlyticsReport.CustomAttribute customAttribute, CrashlyticsReport.CustomAttribute customAttribute2) {
        return customAttribute.getKey().compareTo(customAttribute2.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(@NonNull Task<CrashlyticsReportWithSessionId> task) {
        if (!task.isSuccessful()) {
            Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        CrashlyticsReportWithSessionId result = task.getResult();
        Logger.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + result.getSessionId());
        File reportFile = result.getReportFile();
        if (reportFile.delete()) {
            Logger.getLogger().d("Deleted report file: " + reportFile.getPath());
            return true;
        }
        Logger.getLogger().w("Crashlytics could not delete report file: " + reportFile.getPath());
        return true;
    }

    private void j(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j2, boolean z) {
        this.b.persistEvent(c(this.a.captureEventData(th, thread, str2, j2, 4, 8, z)), str, str2.equals("crash"));
    }

    public void finalizeSessionWithNativeEvent(@NonNull String str, @NonNull List<n> list) {
        Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<n> it2 = list.iterator();
        while (it2.hasNext()) {
            CrashlyticsReport.FilesPayload.File fileB = it2.next().b();
            if (fileB != null) {
                arrayList.add(fileB);
            }
        }
        this.b.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(ImmutableList.from(arrayList)).build());
    }

    public void finalizeSessions(long j2, @Nullable String str) {
        this.b.finalizeReports(str, j2);
    }

    public boolean hasReportsToSend() {
        return this.b.hasFinalizedReports();
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.b.getOpenSessionIds();
    }

    @Override // com.google.firebase.crashlytics.internal.common.i
    public void onBeginSession(@NonNull String str, long j2) {
        this.b.persistReport(this.a.captureReportData(str, j2));
    }

    @Override // com.google.firebase.crashlytics.internal.common.i
    public void onCustomKey(String str, String str2) {
        this.e.setCustomKey(str, str2);
    }

    @Override // com.google.firebase.crashlytics.internal.common.i
    public void onLog(long j2, String str) {
        this.d.writeToLog(j2, str);
    }

    @Override // com.google.firebase.crashlytics.internal.common.i
    public void onUserId(String str) {
        this.e.setUserId(str);
    }

    public void persistFatalEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j2) {
        Logger.getLogger().v("Persisting fatal event for session " + str);
        j(th, thread, str, "crash", j2, true);
    }

    public void persistNonFatalEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j2) {
        Logger.getLogger().v("Persisting non-fatal event for session " + str);
        j(th, thread, str, "error", j2, false);
    }

    @RequiresApi(api = 30)
    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo applicationExitInfoF = f(str, list);
        if (applicationExitInfoF == null) {
            Logger.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event eventCaptureAnrEventData = this.a.captureAnrEventData(e(applicationExitInfoF));
        Logger.getLogger().d("Persisting anr for session " + str);
        this.b.persistEvent(d(eventCaptureAnrEventData, logFileManager, userMetadata), str, true);
    }

    public void persistUserId(@NonNull String str) {
        String userId = this.e.getUserId();
        if (userId == null) {
            Logger.getLogger().v("Could not persist user ID; no user ID available");
        } else {
            this.b.persistUserIdForSession(userId, str);
        }
    }

    public void removeAllReports() {
        this.b.deleteAllReports();
    }

    public Task<Void> sendReports(@NonNull Executor executor) {
        List<CrashlyticsReportWithSessionId> listLoadFinalizedReports = this.b.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        Iterator<CrashlyticsReportWithSessionId> it2 = listLoadFinalizedReports.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.c.sendReport(it2.next()).continueWith(executor, new Continuation() { // from class: mo6
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(this.a.i(task));
                }
            }));
        }
        return Tasks.whenAll(arrayList);
    }
}
