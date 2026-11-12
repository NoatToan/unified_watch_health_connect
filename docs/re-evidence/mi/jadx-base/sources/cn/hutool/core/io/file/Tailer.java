package cn.hutool.core.io.file;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import defpackage.au3;
import defpackage.dge;
import defpackage.gge;
import defpackage.hf4;
import defpackage.jm9;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class Tailer implements Serializable {
    public static final dge CONSOLE_HANDLER = new a();
    private static final long serialVersionUID = 1;
    private final Charset charset;
    private final ScheduledExecutorService executorService;
    private final int initReadLine;
    private final dge lineHandler;
    private final long period;
    private final RandomAccessFile randomAccessFile;

    public static class a implements dge {
        @Override // defpackage.dge
        public void a(String str) {
            hf4.b(str);
        }
    }

    public Tailer(File file, dge dgeVar) {
        this(file, dgeVar, 0);
    }

    private static void checkFile(File file) {
        if (!file.exists()) {
            throw new UtilException("File [{}] not exist !", file.getAbsolutePath());
        }
        if (!file.isFile()) {
            throw new UtilException("Path [{}] is not a file !", file.getAbsolutePath());
        }
    }

    private void readTail() throws IOException {
        long length = this.randomAccessFile.length();
        if (this.initReadLine > 0) {
            Stack stack = new Stack();
            long filePointer = this.randomAccessFile.getFilePointer();
            long j = length - 1;
            this.randomAccessFile.seek(j);
            int i = 0;
            while (j > filePointer && i <= this.initReadLine) {
                int i2 = this.randomAccessFile.read();
                if (i2 == 10 || i2 == 13) {
                    String strG = jm9.G(this.randomAccessFile, this.charset);
                    if (strG != null) {
                        stack.push(strG);
                    }
                    i++;
                    j--;
                }
                j--;
                this.randomAccessFile.seek(j);
                if (j == 0) {
                    String strG2 = jm9.G(this.randomAccessFile, this.charset);
                    if (strG2 == null) {
                        break;
                    }
                    stack.push(strG2);
                    break;
                }
            }
            while (!stack.isEmpty()) {
                this.lineHandler.a((String) stack.pop());
            }
        }
        try {
            this.randomAccessFile.seek(length);
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public void start() {
        start(false);
    }

    public void stop() {
        this.executorService.shutdown();
    }

    public void start(boolean z) {
        try {
            readTail();
            ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.executorService.scheduleAtFixedRate(new gge(this.randomAccessFile, this.charset, this.lineHandler), 0L, this.period, TimeUnit.MILLISECONDS);
            if (z) {
                return;
            }
            try {
                scheduledFutureScheduleAtFixedRate.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new UtilException(e);
            }
        } catch (IOException e2) {
            throw new IORuntimeException(e2);
        }
    }

    public Tailer(File file, dge dgeVar, int i) {
        this(file, au3.f3449b, dgeVar, i, DateUnit.SECOND.getMillis());
    }

    public Tailer(File file, Charset charset, dge dgeVar) {
        this(file, charset, dgeVar, 0, DateUnit.SECOND.getMillis());
    }

    public Tailer(File file, Charset charset, dge dgeVar, int i, long j) {
        checkFile(file);
        this.charset = charset;
        this.lineHandler = dgeVar;
        this.period = j;
        this.initReadLine = i;
        this.randomAccessFile = jm9.k(file, FileMode.r);
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }
}
