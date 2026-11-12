package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes3.dex */
public class Tailer implements Runnable {
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final Charset charset;
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file, Charset charset, TailerListener tailerListener, long j8, boolean z14, boolean z15, int i14) {
        this.run = true;
        this.file = file;
        this.delayMillis = j8;
        this.end = z14;
        this.inbuf = new byte[i14];
        this.listener = tailerListener;
        tailerListener.init(this);
        this.reOpen = z15;
        this.charset = charset;
    }

    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j8, boolean z14, boolean z15, int i14) {
        Tailer tailer = new Tailer(file, charset, tailerListener, j8, z14, z15, i14);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    private long readLines(RandomAccessFile randomAccessFile) throws IOException {
        int i14;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long filePointer = randomAccessFile.getFilePointer();
            long filePointer2 = filePointer;
            boolean z14 = false;
            while (getRun() && (i14 = randomAccessFile.read(this.inbuf)) != -1) {
                for (int i15 = 0; i15 < i14; i15++) {
                    byte b14 = this.inbuf[i15];
                    if (b14 == 10) {
                        this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                        byteArrayOutputStream.reset();
                        filePointer = ((long) i15) + filePointer2 + 1;
                        z14 = false;
                    } else if (b14 != 13) {
                        if (z14) {
                            this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                            byteArrayOutputStream.reset();
                            filePointer = ((long) i15) + filePointer2 + 1;
                            z14 = false;
                        }
                        byteArrayOutputStream.write(b14);
                    } else {
                        if (z14) {
                            byteArrayOutputStream.write(13);
                        }
                        z14 = true;
                    }
                }
                filePointer2 = randomAccessFile.getFilePointer();
            }
            randomAccessFile.seek(filePointer);
            TailerListener tailerListener = this.listener;
            if (tailerListener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) tailerListener).endOfFileReached();
            }
            byteArrayOutputStream.close();
            return filePointer;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public long getDelay() {
        return this.delayMillis;
    }

    public File getFile() {
        return this.file;
    }

    public boolean getRun() {
        return this.run;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00ea A[EXC_TOP_SPLITTER, PHI: r0
      0x00ea: PHI (r0v7 java.io.RandomAccessFile) = (r0v6 java.io.RandomAccessFile), (r0v9 java.io.RandomAccessFile), (r0v10 java.io.RandomAccessFile) binds: [B:83:0x00ff, B:85:0x010c, B:75:0x00e8] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        RandomAccessFile randomAccessFile;
        long lines;
        long jLastModified;
        RandomAccessFile randomAccessFile2 = null;
        long jLastModified2 = 0;
        long length = 0;
        while (getRun() && randomAccessFile2 == null) {
            try {
                try {
                    try {
                        randomAccessFile2 = new RandomAccessFile(this.file, "r");
                    } catch (FileNotFoundException unused) {
                        this.listener.fileNotFound();
                    }
                    if (randomAccessFile2 == null) {
                        Thread.sleep(this.delayMillis);
                    } else {
                        length = this.end ? this.file.length() : 0L;
                        jLastModified2 = this.file.lastModified();
                        randomAccessFile2.seek(length);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (InterruptedException e4) {
                e = e4;
            } catch (Exception e14) {
                e = e14;
            }
        }
        while (getRun()) {
            boolean zIsFileNewer = FileUtils.isFileNewer(this.file, jLastModified2);
            long length2 = this.file.length();
            if (length2 < length) {
                this.listener.fileRotated();
                try {
                    randomAccessFile = new RandomAccessFile(this.file, "r");
                    try {
                        try {
                            readLines(randomAccessFile2);
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (Throwable th6) {
                                        try {
                                            th.addSuppressed(th6);
                                        } catch (FileNotFoundException unused2) {
                                            randomAccessFile2 = randomAccessFile;
                                            this.listener.fileNotFound();
                                            Thread.sleep(this.delayMillis);
                                        }
                                    }
                                }
                                throw th5;
                            }
                        }
                    } catch (IOException e15) {
                        this.listener.handle(e15);
                    }
                    if (randomAccessFile2 != null) {
                        try {
                            try {
                                randomAccessFile2.close();
                            } catch (FileNotFoundException unused3) {
                                length = 0;
                                randomAccessFile2 = randomAccessFile;
                                this.listener.fileNotFound();
                                Thread.sleep(this.delayMillis);
                            }
                        } catch (InterruptedException e16) {
                            e = e16;
                            randomAccessFile2 = randomAccessFile;
                            Thread.currentThread().interrupt();
                            this.listener.handle(e);
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e17) {
                                    this.listener.handle(e17);
                                }
                            }
                            stop();
                        } catch (Exception e18) {
                            e = e18;
                            randomAccessFile2 = randomAccessFile;
                            this.listener.handle(e);
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            stop();
                        } catch (Throwable th7) {
                            th = th7;
                            randomAccessFile2 = randomAccessFile;
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e19) {
                                    this.listener.handle(e19);
                                }
                            }
                            stop();
                            throw th;
                        }
                    }
                    length = 0;
                    randomAccessFile2 = randomAccessFile;
                } catch (Throwable th8) {
                    th = th8;
                    randomAccessFile = randomAccessFile2;
                }
            } else {
                if (length2 > length) {
                    lines = readLines(randomAccessFile2);
                    jLastModified = this.file.lastModified();
                } else if (zIsFileNewer) {
                    randomAccessFile2.seek(0L);
                    lines = readLines(randomAccessFile2);
                    jLastModified = this.file.lastModified();
                } else {
                    if (this.reOpen && randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    Thread.sleep(this.delayMillis);
                    if (!getRun() && this.reOpen) {
                        randomAccessFile = new RandomAccessFile(this.file, "r");
                        randomAccessFile.seek(length);
                        randomAccessFile2 = randomAccessFile;
                    }
                }
                long j8 = jLastModified;
                length = lines;
                jLastModified2 = j8;
                if (this.reOpen) {
                    randomAccessFile2.close();
                }
                Thread.sleep(this.delayMillis);
                if (!getRun()) {
                }
            }
        }
        if (randomAccessFile2 != null) {
            randomAccessFile2.close();
        }
        stop();
    }

    public void stop() {
        this.run = false;
    }

    public Tailer(File file, TailerListener tailerListener, long j8) {
        this(file, tailerListener, j8, false);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j8, boolean z14, boolean z15, int i14) {
        return create(file, DEFAULT_CHARSET, tailerListener, j8, z14, z15, i14);
    }

    public Tailer(File file, TailerListener tailerListener, long j8, boolean z14) {
        this(file, tailerListener, j8, z14, 8192);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j8, boolean z14, int i14) {
        return create(file, tailerListener, j8, z14, false, i14);
    }

    public Tailer(File file, TailerListener tailerListener, long j8, boolean z14, boolean z15) {
        this(file, tailerListener, j8, z14, z15, 8192);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j8, boolean z14) {
        return create(file, tailerListener, j8, z14, 8192);
    }

    public Tailer(File file, TailerListener tailerListener, long j8, boolean z14, int i14) {
        this(file, tailerListener, j8, z14, false, i14);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j8, boolean z14, boolean z15) {
        return create(file, tailerListener, j8, z14, z15, 8192);
    }

    public Tailer(File file, TailerListener tailerListener, long j8, boolean z14, boolean z15, int i14) {
        this(file, DEFAULT_CHARSET, tailerListener, j8, z14, z15, i14);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j8) {
        return create(file, tailerListener, j8, false);
    }

    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    public static Tailer create(File file, TailerListener tailerListener) {
        return create(file, tailerListener, 1000L, false);
    }
}
