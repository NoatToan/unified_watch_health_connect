package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public class TimeBasedArchiveRemover extends ContextAwareBase implements ArchiveRemover {
    private final DateParser dateParser;
    protected final FileNamePattern fileNamePattern;
    private final FileProvider fileProvider;
    private final FileSorter fileSorter;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private final RollingCalendar f27286rc;
    private int maxHistory = 0;
    private long totalSizeCap = 0;

    public class ArchiveRemoverRunnable implements Runnable {
        Date now;

        public ArchiveRemoverRunnable(Date date) {
            this.now = date;
        }

        @Override // java.lang.Runnable
        public void run() {
            TimeBasedArchiveRemover.this.clean(this.now);
        }
    }

    public TimeBasedArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar, FileProvider fileProvider) {
        this.fileNamePattern = fileNamePattern;
        this.f27286rc = rollingCalendar;
        this.fileProvider = fileProvider;
        DateParser dateParser = new DateParser(fileNamePattern);
        this.dateParser = dateParser;
        this.fileSorter = new FileSorter(dateParser, new IntParser(fileNamePattern));
    }

    private void capTotalSize(List<String> list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        this.fileSorter.sort(strArr);
        long j8 = 0;
        long j14 = 0;
        for (String str : strArr) {
            File file = new File(str);
            long length = this.fileProvider.length(file);
            if (j14 + length > this.totalSizeCap) {
                addInfo("Deleting [" + file + "] of size " + new FileSize(length));
                if (!delete(file)) {
                    length = 0;
                }
                j8 += length;
            }
            j14 += length;
        }
        addInfo("Removed  " + new FileSize(j8) + " of files");
    }

    private FilenameFilter createExpiredFileFilter(final Date date) {
        return new FilenameFilter() { // from class: ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return TimeBasedArchiveRemover.this.f27286rc.normalizeDate(TimeBasedArchiveRemover.this.dateParser.parseFilename(str)).compareTo(TimeBasedArchiveRemover.this.f27286rc.normalizeDate(TimeBasedArchiveRemover.this.f27286rc.getEndOfNextNthPeriod(date, -TimeBasedArchiveRemover.this.maxHistory))) < 0;
            }
        };
    }

    private boolean delete(File file) {
        addInfo("deleting " + file);
        boolean zDeleteFile = this.fileProvider.deleteFile(file);
        if (!zDeleteFile) {
            addWarn("cannot delete " + file);
        }
        return zDeleteFile;
    }

    private List<String> filterFiles(List<String> list, FilenameFilter filenameFilter) {
        ArrayList arrayList = new ArrayList();
        for (String str : (String[]) list.toArray(new String[0])) {
            if (filenameFilter.accept(null, str)) {
                arrayList.add(str);
                list.remove(str);
            }
        }
        return arrayList;
    }

    private List<String> findEmptyDirs() {
        List<String> listFindDirs = new FileFinder(this.fileProvider).findDirs(this.fileNamePattern.toRegex());
        Collections.reverse(listFindDirs);
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : listFindDirs) {
            int length = this.fileProvider.list(new File(str), null).length;
            if (length == 0 || (length == 1 && arrayDeque.size() > 0 && str.equals(arrayDeque.peekLast()))) {
                arrayDeque.add(str);
            }
        }
        return Arrays.asList(arrayDeque.toArray(new String[0]));
    }

    private List<String> findFiles() {
        return new FileFinder(this.fileProvider).findFiles(this.fileNamePattern.toRegex());
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void clean(Date date) {
        List<String> listFindFiles = findFiles();
        Iterator<String> it = filterFiles(listFindFiles, createExpiredFileFilter(date)).iterator();
        while (it.hasNext()) {
            delete(new File(it.next()));
        }
        long j8 = this.totalSizeCap;
        if (j8 != 0 && j8 > 0) {
            capTotalSize(listFindFiles);
        }
        Iterator<String> it3 = findEmptyDirs().iterator();
        while (it3.hasNext()) {
            delete(new File(it3.next()));
        }
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public Future<?> cleanAsynchronously(Date date) {
        return this.context.getScheduledExecutorService().submit(new ArchiveRemoverRunnable(date));
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setMaxHistory(int i14) {
        this.maxHistory = i14;
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setTotalSizeCap(long j8) {
        this.totalSizeCap = j8;
    }

    public String toString() {
        return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
    }
}
