package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.connection.DefaultConnectionCountAdapter;
import com.liulishuo.filedownloader.connection.FileDownloadUrlConnection;
import com.liulishuo.filedownloader.database.FileDownloadDatabase;
import com.liulishuo.filedownloader.database.RemitDatabase;
import com.liulishuo.filedownloader.stream.FileDownloadRandomAccessFile;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadProperties;
import com.liulishuo.filedownloader.util.FileDownloadUtils;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadMgrInitialParams {
    private final InitCustomMaker a;

    public static class InitCustomMaker {
        public FileDownloadHelper.DatabaseCustomMaker a;
        public Integer b;
        public FileDownloadHelper.OutputStreamCreator c;
        public FileDownloadHelper.ConnectionCreator d;
        public FileDownloadHelper.ConnectionCountAdapter e;
        public FileDownloadHelper.IdGenerator f;
        public ForegroundServiceConfig g;

        public void commit() {
        }

        public InitCustomMaker connectionCountAdapter(FileDownloadHelper.ConnectionCountAdapter connectionCountAdapter) {
            this.e = connectionCountAdapter;
            return this;
        }

        public InitCustomMaker connectionCreator(FileDownloadHelper.ConnectionCreator connectionCreator) {
            this.d = connectionCreator;
            return this;
        }

        public InitCustomMaker database(FileDownloadHelper.DatabaseCustomMaker databaseCustomMaker) {
            this.a = databaseCustomMaker;
            return this;
        }

        public InitCustomMaker foregroundServiceConfig(ForegroundServiceConfig foregroundServiceConfig) {
            this.g = foregroundServiceConfig;
            return this;
        }

        public InitCustomMaker idGenerator(FileDownloadHelper.IdGenerator idGenerator) {
            this.f = idGenerator;
            return this;
        }

        public InitCustomMaker maxNetworkThreadCount(int i) {
            if (i > 0) {
                this.b = Integer.valueOf(i);
            }
            return this;
        }

        public InitCustomMaker outputStreamCreator(FileDownloadHelper.OutputStreamCreator outputStreamCreator) {
            this.c = outputStreamCreator;
            if (outputStreamCreator == null || outputStreamCreator.supportSeek() || FileDownloadProperties.getImpl().fileNonPreAllocation) {
                return this;
            }
            throw new IllegalArgumentException("Since the provided FileDownloadOutputStream does not support the seek function, if FileDownloader pre-allocates file size at the beginning of the download, it will can not be resumed from the breakpoint. If you need to ensure that the resumption is available, please add and set the value of 'file.non-pre-allocation' field to 'true' in the 'filedownloader.properties' file which is in your application assets folder manually for resolving this problem.");
        }

        public String toString() {
            return FileDownloadUtils.formatString("component: database[%s], maxNetworkCount[%s], outputStream[%s], connection[%s], connectionCountAdapter[%s]", this.a, this.b, this.c, this.d, this.e);
        }
    }

    public DownloadMgrInitialParams() {
        this.a = null;
    }

    private FileDownloadHelper.ConnectionCountAdapter a() {
        return new DefaultConnectionCountAdapter();
    }

    private FileDownloadHelper.ConnectionCreator b() {
        return new FileDownloadUrlConnection.Creator();
    }

    private FileDownloadDatabase c() {
        return new RemitDatabase();
    }

    private ForegroundServiceConfig d() {
        return new ForegroundServiceConfig.Builder().needRecreateChannelId(true).build();
    }

    private FileDownloadHelper.IdGenerator e() {
        return new DefaultIdGenerator();
    }

    private FileDownloadHelper.OutputStreamCreator f() {
        return new FileDownloadRandomAccessFile.Creator();
    }

    private int g() {
        return FileDownloadProperties.getImpl().downloadMaxNetworkThreadCount;
    }

    public FileDownloadHelper.ConnectionCountAdapter createConnectionCountAdapter() {
        InitCustomMaker initCustomMaker = this.a;
        if (initCustomMaker == null) {
            return a();
        }
        FileDownloadHelper.ConnectionCountAdapter connectionCountAdapter = initCustomMaker.e;
        if (connectionCountAdapter == null) {
            return a();
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "initial FileDownloader manager with the customize connection count adapter: %s", connectionCountAdapter);
        }
        return connectionCountAdapter;
    }

    public FileDownloadHelper.ConnectionCreator createConnectionCreator() {
        InitCustomMaker initCustomMaker = this.a;
        if (initCustomMaker == null) {
            return b();
        }
        FileDownloadHelper.ConnectionCreator connectionCreator = initCustomMaker.d;
        if (connectionCreator == null) {
            return b();
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "initial FileDownloader manager with the customize connection creator: %s", connectionCreator);
        }
        return connectionCreator;
    }

    public FileDownloadDatabase createDatabase() {
        FileDownloadHelper.DatabaseCustomMaker databaseCustomMaker;
        InitCustomMaker initCustomMaker = this.a;
        if (initCustomMaker == null || (databaseCustomMaker = initCustomMaker.a) == null) {
            return c();
        }
        FileDownloadDatabase fileDownloadDatabaseCustomMake = databaseCustomMaker.customMake();
        if (fileDownloadDatabaseCustomMake == null) {
            return c();
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "initial FileDownloader manager with the customize database: %s", fileDownloadDatabaseCustomMake);
        }
        return fileDownloadDatabaseCustomMake;
    }

    public ForegroundServiceConfig createForegroundServiceConfig() {
        InitCustomMaker initCustomMaker = this.a;
        if (initCustomMaker == null) {
            return d();
        }
        ForegroundServiceConfig foregroundServiceConfig = initCustomMaker.g;
        if (foregroundServiceConfig == null) {
            return d();
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "initial FileDownloader manager with the customize foreground service config: %s", foregroundServiceConfig);
        }
        return foregroundServiceConfig;
    }

    public FileDownloadHelper.IdGenerator createIdGenerator() {
        InitCustomMaker initCustomMaker = this.a;
        if (initCustomMaker == null) {
            return e();
        }
        FileDownloadHelper.IdGenerator idGenerator = initCustomMaker.f;
        if (idGenerator == null) {
            return e();
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "initial FileDownloader manager with the customize id generator: %s", idGenerator);
        }
        return idGenerator;
    }

    public FileDownloadHelper.OutputStreamCreator createOutputStreamCreator() {
        InitCustomMaker initCustomMaker = this.a;
        if (initCustomMaker == null) {
            return f();
        }
        FileDownloadHelper.OutputStreamCreator outputStreamCreator = initCustomMaker.c;
        if (outputStreamCreator == null) {
            return f();
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "initial FileDownloader manager with the customize output stream: %s", outputStreamCreator);
        }
        return outputStreamCreator;
    }

    public int getMaxNetworkThreadCount() {
        InitCustomMaker initCustomMaker = this.a;
        if (initCustomMaker == null) {
            return g();
        }
        Integer num = initCustomMaker.b;
        if (num == null) {
            return g();
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
        }
        return FileDownloadProperties.getValidNetworkThreadCount(num.intValue());
    }

    public DownloadMgrInitialParams(InitCustomMaker initCustomMaker) {
        this.a = initCustomMaker;
    }
}
