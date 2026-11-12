package ch.qos.logback.core.rolling.helper;

import am.j;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.FileUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class Compressor extends ContextAwareBase {
    static final int BUFFER_SIZE = 8192;
    final CompressionMode compressionMode;

    /* JADX INFO: renamed from: ch.qos.logback.core.rolling.helper.Compressor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode = iArr;
            try {
                iArr[CompressionMode.GZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class CompressionRunnable implements Runnable {
        final String innerEntryName;
        final String nameOfCompressedFile;
        final String nameOfFile2Compress;

        public CompressionRunnable(String str, String str2, String str3) {
            this.nameOfFile2Compress = str;
            this.nameOfCompressedFile = str2;
            this.innerEntryName = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Compressor.this.compress(this.nameOfFile2Compress, this.nameOfCompressedFile, this.innerEntryName);
        }
    }

    public Compressor(CompressionMode compressionMode) {
        this.compressionMode = compressionMode;
    }

    public static String computeFileNameStrWithoutCompSuffix(String str, CompressionMode compressionMode) {
        int length = str.length();
        int i14 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[compressionMode.ordinal()];
        if (i14 == 1) {
            return str.endsWith(".gz") ? str.substring(0, length - 3) : str;
        }
        if (i14 == 2) {
            return str.endsWith(".zip") ? str.substring(0, length - 4) : str;
        }
        if (i14 == 3) {
            return str;
        }
        h.z("Execution should not reach this point");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[SYNTHETIC] */
    private void gzCompress(String str, String str2) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        File file = new File(str);
        if (!file.exists()) {
            addStatus(new WarnStatus(j.m("The file to compress named [", str, "] does not exist."), this));
            return;
        }
        if (!str2.endsWith(".gz")) {
            str2 = str2.concat(".gz");
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            addWarn("The target compressed file named [" + str2 + "] exist already. Aborting file compression.");
            return;
        }
        addInfo("GZ compressing [" + file + "] as [" + file2 + "]");
        createMissingTargetDirsIfNecessary(file2);
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(str2));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i14 = bufferedInputStream2.read(bArr);
                        if (i14 == -1) {
                            break;
                        } else {
                            gZIPOutputStream.write(bArr, 0, i14);
                        }
                    }
                    addInfo("Done ZIP compressing [" + file + "] as [" + file2 + "]");
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        addStatus(new ErrorStatus("Error occurred while compressing [" + str + "] into [" + str2 + "].", this, e));
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (gZIPOutputStream != null) {
                        }
                        if (file.delete()) {
                        }
                        addStatus(new WarnStatus(j.m("Could not delete [", str, "]."), this));
                    } catch (Throwable th3) {
                        th = th3;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (gZIPOutputStream != null) {
                            throw th;
                        }
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (gZIPOutputStream != null) {
                        throw th;
                    }
                    gZIPOutputStream.close();
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
                gZIPOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                gZIPOutputStream = null;
            }
        } catch (Exception e15) {
            e = e15;
            gZIPOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream.close();
        } catch (IOException unused5) {
        }
        if (file.delete()) {
            addStatus(new WarnStatus(j.m("Could not delete [", str, "]."), this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[SYNTHETIC] */
    private void zipCompress(String str, String str2, String str3) throws Throwable {
        ZipOutputStream zipOutputStream;
        File file = new File(str);
        if (!file.exists()) {
            addStatus(new WarnStatus(j.m("The file to compress named [", str, "] does not exist."), this));
            return;
        }
        if (str3 == null) {
            addStatus(new WarnStatus("The innerEntryName parameter cannot be null", this));
            return;
        }
        if (!str2.endsWith(".zip")) {
            str2 = str2.concat(".zip");
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            addStatus(new WarnStatus(j.m("The target compressed file named [", str2, "] exist already."), this));
            return;
        }
        addInfo("ZIP compressing [" + file + "] as [" + file2 + "]");
        createMissingTargetDirsIfNecessary(file2);
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
                try {
                    zipOutputStream.putNextEntry(computeZipEntry(str3));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i14 = bufferedInputStream2.read(bArr);
                        if (i14 == -1) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i14);
                        }
                    }
                    addInfo("Done ZIP compressing [" + file + "] as [" + file2 + "]");
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        addStatus(new ErrorStatus("Error occurred while compressing [" + str + "] into [" + str2 + "].", this, e));
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (zipOutputStream != null) {
                        }
                        if (file.delete()) {
                        }
                        addStatus(new WarnStatus(j.m("Could not delete [", str, "]."), this));
                    } catch (Throwable th3) {
                        th = th3;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (zipOutputStream != null) {
                            throw th;
                        }
                        try {
                            zipOutputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (zipOutputStream != null) {
                        throw th;
                    }
                    zipOutputStream.close();
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
                zipOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                zipOutputStream = null;
            }
        } catch (Exception e15) {
            e = e15;
            zipOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            zipOutputStream = null;
        }
        try {
            zipOutputStream.close();
        } catch (IOException unused5) {
        }
        if (file.delete()) {
            addStatus(new WarnStatus(j.m("Could not delete [", str, "]."), this));
        }
    }

    public Future<?> asyncCompress(String str, String str2, String str3) {
        return this.context.getScheduledExecutorService().submit(new CompressionRunnable(str, str2, str3));
    }

    public void compress(String str, String str2, String str3) throws Throwable {
        int i14 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[this.compressionMode.ordinal()];
        if (i14 == 1) {
            gzCompress(str, str2);
        } else if (i14 == 2) {
            zipCompress(str, str2, str3);
        } else {
            if (i14 != 3) {
                return;
            }
            e.w("compress method called in NONE compression mode");
        }
    }

    public ZipEntry computeZipEntry(String str) {
        return new ZipEntry(computeFileNameStrWithoutCompSuffix(str, this.compressionMode));
    }

    public void createMissingTargetDirsIfNecessary(File file) {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
    }

    public String toString() {
        return getClass().getName();
    }

    public ZipEntry computeZipEntry(File file) {
        return computeZipEntry(file.getName());
    }
}
