package com.xiaomi.fitness.common.utils;

import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eJ.\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/common/utils/LockFileUtil;", "", "<init>", "()V", "TAG", "", "FILE_WRITE_LOCK_ACCESS_MODE", "FILE_READ_LOCK_ACCESS_MODE", "copyFile", "", "src", "Ljava/io/File;", "dest", "timeoutInMilli", "", "writeFile", "data", "", "readFile", "file", "seekPos", "", "length", "waitFileLock", "Ljava/nio/channels/FileLock;", "fileChannel", "Ljava/nio/channels/FileChannel;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLockFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFileUtil.kt\ncom/xiaomi/fitness/common/utils/LockFileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class LockFileUtil {

    @NotNull
    private static final String FILE_READ_LOCK_ACCESS_MODE = "r";

    @NotNull
    private static final String FILE_WRITE_LOCK_ACCESS_MODE = "rw";

    @NotNull
    public static final LockFileUtil INSTANCE = new LockFileUtil();

    @NotNull
    private static final String TAG = "FileLockingUtil";

    private LockFileUtil() {
    }

    @JvmStatic
    @Nullable
    public static final byte[] readFile(@Nullable File file, int seekPos, int length, long timeoutInMilli) {
        byte[] bArr;
        Logger.i(TAG, "readFile() called with: file = " + file + ", seekPos = " + seekPos + ", length = " + length + ", timeoutInMilli = " + timeoutInMilli);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, FILE_READ_LOCK_ACCESS_MODE);
            int iIntValue = (length == 0 ? Long.valueOf(randomAccessFile.length()) : Integer.valueOf(length)).intValue();
            randomAccessFile.seek(seekPos);
            FileChannel channel = randomAccessFile.getChannel();
            LockFileUtil lockFileUtil = INSTANCE;
            Intrinsics.checkNotNull(channel);
            FileLock fileLockWaitFileLock = lockFileUtil.waitFileLock(channel, timeoutInMilli);
            if (fileLockWaitFileLock != null) {
                bArr = new byte[iIntValue];
                randomAccessFile.readFully(bArr, 0, iIntValue);
                fileLockWaitFileLock.release();
            } else {
                bArr = null;
            }
            channel.close();
            randomAccessFile.close();
            return bArr;
        } catch (FileNotFoundException | IOException unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] readFile$default(File file, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return readFile(file, i, i2, j);
    }

    public final void copyFile(@Nullable File src, @Nullable File dest, long timeoutInMilli) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(src);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(dest, FILE_WRITE_LOCK_ACCESS_MODE);
                FileChannel channel = randomAccessFile.getChannel();
                Intrinsics.checkNotNull(channel);
                FileLock fileLockWaitFileLock = waitFileLock(channel, timeoutInMilli);
                if (fileLockWaitFileLock != null) {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            randomAccessFile.write(bArr, 0, i);
                        }
                    }
                    fileLockWaitFileLock.release();
                }
                channel.close();
                randomAccessFile.close();
                IOExtKt.closeSilently(this, fileInputStream2);
            } catch (FileNotFoundException unused) {
                fileInputStream = fileInputStream2;
                IOExtKt.closeSilently(this, fileInputStream);
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                IOExtKt.closeSilently(this, fileInputStream);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                IOExtKt.closeSilently(this, fileInputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public final FileLock waitFileLock(@NotNull FileChannel fileChannel, long timeoutInMilli) {
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        long j = 0;
        FileLock fileLockTryLock = null;
        while (fileLockTryLock == null) {
            if (j >= timeoutInMilli) {
                return null;
            }
            try {
                fileLockTryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, true);
                if (fileLockTryLock == null) {
                    long j2 = timeoutInMilli - j;
                    if (j2 > 100) {
                        j2 = 100;
                    }
                    Thread.sleep(j2);
                    j += j2;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return fileLockTryLock;
    }

    public final void writeFile(@Nullable byte[] data, @Nullable File dest, long timeoutInMilli) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(dest, FILE_WRITE_LOCK_ACCESS_MODE);
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNull(channel);
            FileLock fileLockWaitFileLock = waitFileLock(channel, timeoutInMilli);
            if (fileLockWaitFileLock != null) {
                randomAccessFile.write(data);
                fileLockWaitFileLock.release();
            }
            channel.close();
            randomAccessFile.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }
}
