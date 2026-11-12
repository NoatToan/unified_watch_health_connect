package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsReportPersistence {
    private static final int e = 8;
    private static final String f = "report";
    private static final String g = "user-id";
    private static final String h = "start-time";
    private static final String i = "event";
    private static final int j = 10;
    private static final String k = "%010d";
    private static final String m = "_";
    private static final String n = "";
    private final AtomicInteger a = new AtomicInteger(0);
    private final FileStore b;

    @NonNull
    private final SettingsDataProvider c;
    private static final Charset d = Charset.forName("UTF-8");
    private static final int l = 15;
    private static final CrashlyticsReportJsonTransform o = new CrashlyticsReportJsonTransform();
    private static final Comparator<? super File> p = new Comparator() { // from class: r11
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return CrashlyticsReportPersistence.o((File) obj, (File) obj2);
        }
    };
    private static final FilenameFilter q = new FilenameFilter() { // from class: q11
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return CrashlyticsReportPersistence.p(file, str);
        }
    };

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsDataProvider settingsDataProvider) {
        this.b = fileStore;
        this.c = settingsDataProvider;
    }

    private SortedSet<String> e(@Nullable String str) {
        this.b.cleanupLegacyFiles();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() <= 8) {
            return openSessionIds;
        }
        while (openSessionIds.size() > 8) {
            String strLast = openSessionIds.last();
            Logger.getLogger().d("Removing session over cap: " + strLast);
            this.b.deleteSessionFiles(strLast);
            openSessionIds.remove(strLast);
        }
        return openSessionIds;
    }

    private static int f(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            FileStore.d(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i2 = this.c.getSettings().getSessionData().maxCompleteSessionsCount;
        List<File> listK = k();
        int size = listK.size();
        if (size <= i2) {
            return;
        }
        Iterator<File> it2 = listK.subList(i2, size).iterator();
        while (it2.hasNext()) {
            it2.next().delete();
        }
    }

    private static long h(long j2) {
        return j2 * 1000;
    }

    private void i(List<File> list) {
        Iterator<File> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().delete();
        }
    }

    @NonNull
    private static String j(int i2, boolean z) {
        return "event" + String.format(Locale.US, k, Integer.valueOf(i2)) + (z ? "_" : "");
    }

    private List<File> k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.getPriorityReports());
        arrayList.addAll(this.b.getNativeReports());
        Comparator<? super File> comparator = p;
        Collections.sort(arrayList, comparator);
        List<File> reports = this.b.getReports();
        Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    @NonNull
    private static String l(@NonNull String str) {
        return str.substring(0, l);
    }

    private static boolean m(@NonNull String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(@NonNull File file, @NonNull String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int o(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(@NonNull File file, @NonNull File file2) {
        return l(file.getName()).compareTo(l(file2.getName()));
    }

    @NonNull
    private static String r(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void s(@NonNull File file, @NonNull CrashlyticsReport.FilesPayload filesPayload, @NonNull String str) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = o;
            w(this.b.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(r(file)).withNdkPayload(filesPayload)));
        } catch (IOException e2) {
            Logger.getLogger().w("Could not synthesize final native report file for " + file, e2);
        }
    }

    private void t(String str, long j2) {
        boolean z;
        List<File> sessionFiles = this.b.getSessionFiles(str, q);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().v("Session " + str + " has no events.");
            return;
        }
        Collections.sort(sessionFiles);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it2 = sessionFiles.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                }
                File next = it2.next();
                try {
                    arrayList.add(o.eventFromJson(r(next)));
                    if (z || m(next.getName())) {
                        z = true;
                    }
                } catch (IOException e2) {
                    Logger.getLogger().w("Could not add event to report for " + next, e2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Logger.getLogger().w("Could not parse event files for session " + str);
            return;
        }
        String strR = null;
        File sessionFile = this.b.getSessionFile(str, g);
        if (sessionFile.isFile()) {
            try {
                strR = r(sessionFile);
            } catch (IOException e3) {
                Logger.getLogger().w("Could not read user ID file in " + str, e3);
            }
        }
        u(this.b.getSessionFile(str, "report"), arrayList, j2, z, strR);
    }

    private void u(@NonNull File file, @NonNull List<CrashlyticsReport.Session.Event> list, long j2, boolean z, @Nullable String str) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = o;
            CrashlyticsReport crashlyticsReportWithEvents = crashlyticsReportJsonTransform.reportFromJson(r(file)).withSessionEndFields(j2, z, str).withEvents(ImmutableList.from(list));
            CrashlyticsReport.Session session = crashlyticsReportWithEvents.getSession();
            if (session == null) {
                return;
            }
            w(z ? this.b.getPriorityReport(session.getIdentifier()) : this.b.getReport(session.getIdentifier()), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportWithEvents));
        } catch (IOException e2) {
            Logger.getLogger().w("Could not synthesize final report file for " + file, e2);
        }
    }

    private int v(String str, int i2) {
        List<File> sessionFiles = this.b.getSessionFiles(str, new FilenameFilter() { // from class: p11
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return CrashlyticsReportPersistence.n(file, str2);
            }
        });
        Collections.sort(sessionFiles, new Comparator() { // from class: s11
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CrashlyticsReportPersistence.q((File) obj, (File) obj2);
            }
        });
        return f(sessionFiles, i2);
    }

    private static void w(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void x(File file, String str, long j2) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j2));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void deleteAllReports() {
        i(this.b.getReports());
        i(this.b.getPriorityReports());
        i(this.b.getNativeReports());
    }

    public void finalizeReports(@Nullable String str, long j2) {
        for (String str2 : e(str)) {
            Logger.getLogger().v("Finalizing report for session " + str2);
            t(str2, j2);
            this.b.deleteSessionFiles(str2);
        }
        g();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload) {
        File sessionFile = this.b.getSessionFile(str, "report");
        Logger.getLogger().d("Writing native session report for " + str + " to file: " + sessionFile);
        s(sessionFile, filesPayload, str);
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.b.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.b.getSessionFile(str, h).lastModified();
    }

    public boolean hasFinalizedReports() {
        return (this.b.getReports().isEmpty() && this.b.getPriorityReports().isEmpty() && this.b.getNativeReports().isEmpty()) ? false : true;
    }

    @NonNull
    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> listK = k();
        ArrayList arrayList = new ArrayList();
        for (File file : listK) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(o.reportFromJson(r(file)), file.getName(), file));
            } catch (IOException e2) {
                Logger.getLogger().w("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str) {
        persistEvent(event, str, false);
    }

    public void persistReport(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            w(this.b.getSessionFile(identifier, "report"), o.reportToJson(crashlyticsReport));
            x(this.b.getSessionFile(identifier, h), "", session.getStartedAt());
        } catch (IOException e2) {
            Logger.getLogger().d("Could not persist report for session " + identifier, e2);
        }
    }

    public void persistUserIdForSession(@NonNull String str, @NonNull String str2) {
        try {
            w(this.b.getSessionFile(str2, g), str);
        } catch (IOException e2) {
            Logger.getLogger().w("Could not persist user ID for session " + str2, e2);
        }
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str, boolean z) {
        int i2 = this.c.getSettings().getSessionData().maxCustomExceptionEvents;
        try {
            w(this.b.getSessionFile(str, j(this.a.getAndIncrement(), z)), o.eventToJson(event));
        } catch (IOException e2) {
            Logger.getLogger().w("Could not persist event for session " + str, e2);
        }
        v(str, i2);
    }
}
