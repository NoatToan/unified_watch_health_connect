package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes23.dex */
public class Tailer implements Runnable {
    private static final int i = 1000;
    private static final String j = "r";
    private static final int k = 4096;
    private static final Charset l = Charset.defaultCharset();
    private final byte[] a;
    private final File b;
    private final Charset c;
    private final long d;
    private final boolean e;
    private final TailerListener f;
    private final boolean g;
    private volatile boolean h;

    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    private long a(RandomAccessFile randomAccessFile) throws IOException {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long filePointer = randomAccessFile.getFilePointer();
            long filePointer2 = filePointer;
            boolean z = false;
            while (getRun() && (i2 = randomAccessFile.read(this.a)) != -1) {
                for (int i3 = 0; i3 < i2; i3++) {
                    byte b = this.a[i3];
                    if (b == 10) {
                        this.f.handle(new String(byteArrayOutputStream.toByteArray(), this.c));
                        byteArrayOutputStream.reset();
                        filePointer = ((long) i3) + filePointer2 + 1;
                        z = false;
                    } else if (b != 13) {
                        if (z) {
                            this.f.handle(new String(byteArrayOutputStream.toByteArray(), this.c));
                            byteArrayOutputStream.reset();
                            filePointer = ((long) i3) + filePointer2 + 1;
                            z = false;
                        }
                        byteArrayOutputStream.write(b);
                    } else {
                        if (z) {
                            byteArrayOutputStream.write(13);
                        }
                        z = true;
                    }
                }
                filePointer2 = randomAccessFile.getFilePointer();
            }
            randomAccessFile.seek(filePointer);
            TailerListener tailerListener = this.f;
            if (tailerListener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) tailerListener).endOfFileReached();
            }
            byteArrayOutputStream.close();
            return filePointer;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static Tailer create(File file, TailerListener tailerListener, long j2, boolean z, int i2) {
        return create(file, tailerListener, j2, z, false, i2);
    }

    public long getDelay() {
        return this.d;
    }

    public File getFile() {
        return this.b;
    }

    public boolean getRun() {
        return this.h;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        RandomAccessFile randomAccessFile;
        long jA;
        long jLastModified;
        RandomAccessFile randomAccessFile2 = null;
        long jLastModified2 = 0;
        long length = 0;
        while (getRun() && randomAccessFile2 == null) {
            try {
                try {
                    try {
                        randomAccessFile2 = new RandomAccessFile(this.b, j);
                    } catch (FileNotFoundException unused) {
                        this.f.fileNotFound();
                    }
                    if (randomAccessFile2 == null) {
                        Thread.sleep(this.d);
                    } else {
                        length = this.e ? this.b.length() : 0L;
                        jLastModified2 = this.b.lastModified();
                        randomAccessFile2.seek(length);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (InterruptedException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
            }
        }
        while (getRun()) {
            boolean zIsFileNewer = FileUtils.isFileNewer(this.b, jLastModified2);
            long length2 = this.b.length();
            if (length2 < length) {
                this.f.fileRotated();
                try {
                    randomAccessFile = new RandomAccessFile(this.b, j);
                    try {
                        try {
                            a(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (Throwable th4) {
                                        try {
                                            th.addSuppressed(th4);
                                        } catch (FileNotFoundException unused2) {
                                            randomAccessFile2 = randomAccessFile;
                                            this.f.fileNotFound();
                                            Thread.sleep(this.d);
                                        }
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (IOException e3) {
                        this.f.handle(e3);
                    }
                    if (randomAccessFile2 != null) {
                        try {
                            try {
                                randomAccessFile2.close();
                            } catch (FileNotFoundException unused3) {
                                length = 0;
                                randomAccessFile2 = randomAccessFile;
                                this.f.fileNotFound();
                                Thread.sleep(this.d);
                            }
                        } catch (InterruptedException e4) {
                            e = e4;
                            randomAccessFile2 = randomAccessFile;
                            Thread.currentThread().interrupt();
                            this.f.handle(e);
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e5) {
                                    e = e5;
                                    this.f.handle(e);
                                }
                            }
                            stop();
                        } catch (Exception e6) {
                            e = e6;
                            randomAccessFile2 = randomAccessFile;
                            this.f.handle(e);
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e7) {
                                    e = e7;
                                    this.f.handle(e);
                                }
                            }
                            stop();
                        } catch (Throwable th5) {
                            th = th5;
                            randomAccessFile2 = randomAccessFile;
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e8) {
                                    this.f.handle(e8);
                                }
                            }
                            stop();
                            throw th;
                        }
                    }
                    length = 0;
                    randomAccessFile2 = randomAccessFile;
                } catch (Throwable th6) {
                    th = th6;
                    randomAccessFile = randomAccessFile2;
                }
            } else {
                if (length2 > length) {
                    jA = a(randomAccessFile2);
                    jLastModified = this.b.lastModified();
                } else if (zIsFileNewer) {
                    randomAccessFile2.seek(0L);
                    jA = a(randomAccessFile2);
                    jLastModified = this.b.lastModified();
                } else {
                    if (this.g && randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    Thread.sleep(this.d);
                    if (!getRun() && this.g) {
                        randomAccessFile = new RandomAccessFile(this.b, j);
                        randomAccessFile.seek(length);
                        randomAccessFile2 = randomAccessFile;
                    }
                }
                long j2 = jA;
                jLastModified2 = jLastModified;
                length = j2;
                if (this.g) {
                    randomAccessFile2.close();
                }
                Thread.sleep(this.d);
                if (!getRun()) {
                }
            }
        }
        if (randomAccessFile2 != null) {
            try {
                randomAccessFile2.close();
            } catch (IOException e9) {
                e = e9;
                this.f.handle(e);
            }
        }
        stop();
    }

    public void stop() {
        this.h = false;
    }

    public Tailer(File file, TailerListener tailerListener, long j2) {
        this(file, tailerListener, j2, false);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j2, boolean z, boolean z2, int i2) {
        return create(file, l, tailerListener, j2, z, z2, i2);
    }

    public Tailer(File file, TailerListener tailerListener, long j2, boolean z) {
        this(file, tailerListener, j2, z, 4096);
    }

    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j2, boolean z, boolean z2, int i2) {
        Tailer tailer = new Tailer(file, charset, tailerListener, j2, z, z2, i2);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    public Tailer(File file, TailerListener tailerListener, long j2, boolean z, boolean z2) {
        this(file, tailerListener, j2, z, z2, 4096);
    }

    public Tailer(File file, TailerListener tailerListener, long j2, boolean z, int i2) {
        this(file, tailerListener, j2, z, false, i2);
    }

    public Tailer(File file, TailerListener tailerListener, long j2, boolean z, boolean z2, int i2) {
        this(file, l, tailerListener, j2, z, z2, i2);
    }

    public Tailer(File file, Charset charset, TailerListener tailerListener, long j2, boolean z, boolean z2, int i2) {
        this.h = true;
        this.b = file;
        this.d = j2;
        this.e = z;
        this.a = new byte[i2];
        this.f = tailerListener;
        tailerListener.init(this);
        this.g = z2;
        this.c = charset;
    }

    public static Tailer create(File file, TailerListener tailerListener, long j2, boolean z) {
        return create(file, tailerListener, j2, z, 4096);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j2, boolean z, boolean z2) {
        return create(file, tailerListener, j2, z, z2, 4096);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j2) {
        return create(file, tailerListener, j2, false);
    }

    public static Tailer create(File file, TailerListener tailerListener) {
        return create(file, tailerListener, 1000L, false);
    }
}
