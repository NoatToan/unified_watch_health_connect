package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes18.dex */
public abstract class EventsFilesManager<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    private final int a;
    public final Context context;
    public final CurrentTimeProvider currentTimeProvider;
    public final EventsStorage eventStorage;
    public volatile long lastRollOverTime;
    public final List<EventsStorageListener> rollOverListeners = new CopyOnWriteArrayList();
    public final EventTransform<T> transform;

    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return (int) (bVar.b - bVar2.b);
        }
    }

    public static class b {
        public final File a;
        public final long b;

        public b(File file, long j) {
            this.a = file;
            this.b = j;
        }
    }

    public EventsFilesManager(Context context, EventTransform<T> eventTransform, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage, int i) throws IOException {
        this.context = context.getApplicationContext();
        this.transform = eventTransform;
        this.eventStorage = eventsStorage;
        this.currentTimeProvider = currentTimeProvider;
        this.lastRollOverTime = currentTimeProvider.getCurrentTimeMillis();
        this.a = i;
    }

    private void a(int i) throws IOException {
        if (this.eventStorage.canWorkingFileStore(i, getMaxByteSizePerFile())) {
            return;
        }
        CommonUtils.logControlled(this.context, 4, "Twitter", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", Integer.valueOf(this.eventStorage.getWorkingFileUsedSizeInBytes()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())));
        rollFileOver();
    }

    private void b(String str) {
        Iterator<EventsStorageListener> it2 = this.rollOverListeners.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onRollOver(str);
            } catch (Exception e) {
                CommonUtils.logControlledError(this.context, "One of the roll over listeners threw an exception", e);
            }
        }
    }

    public void deleteAllEventsFiles() {
        EventsStorage eventsStorage = this.eventStorage;
        eventsStorage.deleteFilesInRollOverDirectory(eventsStorage.getAllFilesInRollOverDirectory());
        this.eventStorage.deleteWorkingFile();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> allFilesInRollOverDirectory = this.eventStorage.getAllFilesInRollOverDirectory();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (allFilesInRollOverDirectory.size() <= maxFilesToKeep) {
            return;
        }
        int size = allFilesInRollOverDirectory.size() - maxFilesToKeep;
        CommonUtils.logControlled(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", Integer.valueOf(allFilesInRollOverDirectory.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)));
        TreeSet treeSet = new TreeSet(new a());
        for (File file : allFilesInRollOverDirectory) {
            treeSet.add(new b(file, parseCreationTimestampFromFileName(file.getName())));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((b) it2.next()).a);
            if (arrayList.size() == size) {
                break;
            }
        }
        this.eventStorage.deleteFilesInRollOverDirectory(arrayList);
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.deleteFilesInRollOverDirectory(list);
    }

    public abstract String generateUniqueRollOverFileName();

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.getBatchOfFilesToSend(1);
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    public int getMaxByteSizePerFile() {
        return 8000;
    }

    public int getMaxFilesToKeep() {
        return this.a;
    }

    public long parseCreationTimestampFromFileName(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 3) {
            return 0L;
        }
        try {
            return Long.valueOf(strArrSplit[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public void registerRollOverListener(EventsStorageListener eventsStorageListener) {
        if (eventsStorageListener != null) {
            this.rollOverListeners.add(eventsStorageListener);
        }
    }

    public boolean rollFileOver() throws IOException {
        String strGenerateUniqueRollOverFileName;
        boolean z = true;
        if (this.eventStorage.isWorkingFileEmpty()) {
            strGenerateUniqueRollOverFileName = null;
            z = false;
        } else {
            strGenerateUniqueRollOverFileName = generateUniqueRollOverFileName();
            this.eventStorage.rollOver(strGenerateUniqueRollOverFileName);
            CommonUtils.logControlled(this.context, 4, "Twitter", String.format(Locale.US, "generated new file %s", strGenerateUniqueRollOverFileName));
            this.lastRollOverTime = this.currentTimeProvider.getCurrentTimeMillis();
        }
        b(strGenerateUniqueRollOverFileName);
        return z;
    }

    public void writeEvent(T t) throws IOException {
        byte[] bytes = this.transform.toBytes(t);
        a(bytes.length);
        this.eventStorage.add(bytes);
    }
}
