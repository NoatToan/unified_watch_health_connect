package com.liulishuo.filedownloader.download;

import com.liulishuo.filedownloader.connection.FileDownloadConnection;
import com.liulishuo.filedownloader.database.FileDownloadDatabase;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.services.DownloadMgrInitialParams;
import com.liulishuo.filedownloader.services.ForegroundServiceConfig;
import com.liulishuo.filedownloader.stream.FileDownloadOutputStream;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class CustomComponentHolder {
    private DownloadMgrInitialParams a;
    private FileDownloadHelper.ConnectionCountAdapter b;
    private FileDownloadHelper.ConnectionCreator c;
    private FileDownloadHelper.OutputStreamCreator d;
    private FileDownloadDatabase e;
    private FileDownloadHelper.IdGenerator f;
    private ForegroundServiceConfig g;

    public static final class a {
        private static final CustomComponentHolder a = new CustomComponentHolder();

        private a() {
        }
    }

    private FileDownloadHelper.ConnectionCountAdapter a() {
        FileDownloadHelper.ConnectionCountAdapter connectionCountAdapter = this.b;
        if (connectionCountAdapter != null) {
            return connectionCountAdapter;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = c().createConnectionCountAdapter();
            }
        }
        return this.b;
    }

    private FileDownloadHelper.ConnectionCreator b() {
        FileDownloadHelper.ConnectionCreator connectionCreator = this.c;
        if (connectionCreator != null) {
            return connectionCreator;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = c().createConnectionCreator();
            }
        }
        return this.c;
    }

    private DownloadMgrInitialParams c() {
        DownloadMgrInitialParams downloadMgrInitialParams = this.a;
        if (downloadMgrInitialParams != null) {
            return downloadMgrInitialParams;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new DownloadMgrInitialParams();
            }
        }
        return this.a;
    }

    private FileDownloadHelper.OutputStreamCreator d() {
        FileDownloadHelper.OutputStreamCreator outputStreamCreator = this.d;
        if (outputStreamCreator != null) {
            return outputStreamCreator;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = c().createOutputStreamCreator();
            }
        }
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:9:0x0034, B:11:0x003b, B:13:0x0042, B:15:0x0049, B:18:0x0056, B:21:0x0065, B:23:0x0070, B:17:0x0053), top: B:83:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019c  */
    private static void e(FileDownloadDatabase.Maintainer maintainer) throws Throwable {
        long j;
        boolean z;
        String str = "refreshed data count: %d , delete data count: %d, reset id count: %d. consume %d";
        Iterator<FileDownloadModel> it2 = maintainer.iterator();
        FileDownloadHelper.IdGenerator idGeneratorInstance = getImpl().getIdGeneratorInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (it2.hasNext()) {
            try {
                FileDownloadModel next = it2.next();
                String str2 = str;
                if (next.getStatus() != 3) {
                    try {
                        if (next.getStatus() == 2 || next.getStatus() == -1 || (next.getStatus() == 1 && next.getSoFar() > 0)) {
                            next.setStatus((byte) -2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        j = jCurrentTimeMillis;
                        j2 = j2;
                        str = str2;
                        FileDownloadUtils.markConverted(FileDownloadHelper.getAppContext());
                        maintainer.onFinishMaintain();
                        if (FileDownloadLog.NEED_LOG) {
                            FileDownloadLog.d(FileDownloadDatabase.class, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(System.currentTimeMillis() - j));
                        }
                        throw th;
                    }
                } else {
                    next.setStatus((byte) -2);
                }
                String targetFilePath = next.getTargetFilePath();
                if (targetFilePath == null) {
                    j = jCurrentTimeMillis;
                    j2 = j2;
                    z = true;
                } else {
                    File file = new File(targetFilePath);
                    if (next.getStatus() == -2) {
                        j = jCurrentTimeMillis;
                        try {
                            if (FileDownloadUtils.isBreakpointAvailable(next.getId(), next, next.getPath(), null)) {
                                File file2 = new File(next.getTempFilePath());
                                if (!file2.exists() && file.exists()) {
                                    boolean zRenameTo = file.renameTo(file2);
                                    if (FileDownloadLog.NEED_LOG) {
                                        FileDownloadLog.d(FileDownloadDatabase.class, "resume from the old no-temp-file architecture [%B], [%s]->[%s]", Boolean.valueOf(zRenameTo), file.getPath(), file2.getPath());
                                    }
                                }
                            }
                            if (next.getStatus() == 1 || next.getSoFar() > 0) {
                                z = FileDownloadUtils.isBreakpointAvailable(next.getId(), next) || file.exists();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j2 = j2;
                            str = str2;
                            FileDownloadUtils.markConverted(FileDownloadHelper.getAppContext());
                            maintainer.onFinishMaintain();
                            if (FileDownloadLog.NEED_LOG) {
                                FileDownloadLog.d(FileDownloadDatabase.class, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(System.currentTimeMillis() - j));
                            }
                            throw th;
                        }
                    } else {
                        j = jCurrentTimeMillis;
                    }
                    if (next.getStatus() == 1) {
                    }
                    if (FileDownloadUtils.isBreakpointAvailable(next.getId(), next)) {
                    }
                }
                if (z) {
                    try {
                        it2.remove();
                        maintainer.onRemovedInvalidData(next);
                        j3++;
                        j2 = j2;
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                        FileDownloadUtils.markConverted(FileDownloadHelper.getAppContext());
                        maintainer.onFinishMaintain();
                        if (FileDownloadLog.NEED_LOG) {
                            FileDownloadLog.d(FileDownloadDatabase.class, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(System.currentTimeMillis() - j));
                        }
                        throw th;
                    }
                } else {
                    int id = next.getId();
                    int iTransOldId = idGeneratorInstance.transOldId(id, next.getUrl(), next.getPath(), next.isPathAsDirectory());
                    if (iTransOldId != id) {
                        if (FileDownloadLog.NEED_LOG) {
                            FileDownloadLog.d(FileDownloadDatabase.class, "the id is changed on restoring from db: old[%d] -> new[%d]", Integer.valueOf(id), Integer.valueOf(iTransOldId));
                        }
                        next.setId(iTransOldId);
                        maintainer.changeFileDownloadModelId(id, next);
                        j4++;
                    }
                    maintainer.onRefreshedValidData(next);
                    j2++;
                }
                str = str2;
                jCurrentTimeMillis = j;
            } catch (Throwable th4) {
                th = th4;
                j = jCurrentTimeMillis;
                j2 = j2;
            }
        }
        String str3 = str;
        long j5 = jCurrentTimeMillis;
        long j6 = j2;
        FileDownloadUtils.markConverted(FileDownloadHelper.getAppContext());
        maintainer.onFinishMaintain();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(FileDownloadDatabase.class, str3, Long.valueOf(j6), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(System.currentTimeMillis() - j5));
        }
    }

    public static CustomComponentHolder getImpl() {
        return a.a;
    }

    public FileDownloadConnection createConnection(String str) throws IOException {
        return b().create(str);
    }

    public FileDownloadOutputStream createOutputStream(File file) throws IOException {
        return d().create(file);
    }

    public int determineConnectionCount(int i, String str, String str2, long j) {
        return a().determineConnectionCount(i, str, str2, j);
    }

    public FileDownloadDatabase getDatabaseInstance() {
        FileDownloadDatabase fileDownloadDatabase = this.e;
        if (fileDownloadDatabase != null) {
            return fileDownloadDatabase;
        }
        synchronized (this) {
            if (this.e == null) {
                FileDownloadDatabase fileDownloadDatabaseCreateDatabase = c().createDatabase();
                this.e = fileDownloadDatabaseCreateDatabase;
                e(fileDownloadDatabaseCreateDatabase.maintainer());
            }
        }
        return this.e;
    }

    public ForegroundServiceConfig getForegroundConfigInstance() {
        ForegroundServiceConfig foregroundServiceConfig = this.g;
        if (foregroundServiceConfig != null) {
            return foregroundServiceConfig;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = c().createForegroundServiceConfig();
            }
        }
        return this.g;
    }

    public FileDownloadHelper.IdGenerator getIdGeneratorInstance() {
        FileDownloadHelper.IdGenerator idGenerator = this.f;
        if (idGenerator != null) {
            return idGenerator;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = c().createIdGenerator();
            }
        }
        return this.f;
    }

    public int getMaxNetworkThreadCount() {
        return c().getMaxNetworkThreadCount();
    }

    public boolean isSupportSeek() {
        return d().supportSeek();
    }

    public void setInitCustomMaker(DownloadMgrInitialParams.InitCustomMaker initCustomMaker) {
        synchronized (this) {
            this.a = new DownloadMgrInitialParams(initCustomMaker);
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }
}
