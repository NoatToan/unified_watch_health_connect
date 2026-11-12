package com.huami.watch.companion.xiaomiai.alexa;

import com.amazon.alexa.avs.log.LogHelper;
import com.huami.watch.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public class FileCache {
    public static final String TAG = LogHelper.makeLogTag(FileCache.class);
    private int cacheSize;
    private int channel;
    private boolean deleteCacheFile;
    private String fileKey;
    private File mCacheFile;
    private AtomicBoolean mEndTag;
    private long mExpectSize;
    private FileInputStream mFileInputStream;
    private FileOutputStream mFileOutput;
    private AtomicBoolean mHasData;
    private Object mLock;
    private long mWriteSize;
    private long readPosition;
    private int sampling;

    public enum FileCacheCode {
        EFO(-1),
        N0_DATA_WRITE_TAG(-1);

        public int code;

        FileCacheCode(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    public FileCache(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, 0);
    }

    private void closeOutputStream() {
        synchronized (this.mLock) {
            Log.d(TAG, "close file cache output stream", new Object[0]);
            FileOutputStream fileOutputStream = this.mFileOutput;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025 A[Catch: all -> 0x003b, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0011, B:10:0x0019, B:12:0x001d, B:16:0x0025, B:18:0x002e, B:20:0x0034, B:21:0x0039, B:15:0x0022, B:9:0x0016), top: B:30:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002e A[Catch: all -> 0x003b, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0011, B:10:0x0019, B:12:0x001d, B:16:0x0025, B:18:0x002e, B:20:0x0034, B:21:0x0039, B:15:0x0022, B:9:0x0016), top: B:30:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void destroy() {
        FileOutputStream fileOutputStream;
        File file;
        synchronized (this.mLock) {
            Log.d(TAG, "close all stream", new Object[0]);
            FileInputStream fileInputStream = this.mFileInputStream;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                fileOutputStream = this.mFileOutput;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    this.mFileInputStream = null;
                    this.mFileOutput = null;
                    file = this.mCacheFile;
                    if (file != null && file.exists()) {
                        this.mCacheFile.delete();
                    }
                } else {
                    this.mFileInputStream = null;
                    this.mFileOutput = null;
                    file = this.mCacheFile;
                    if (file != null) {
                        this.mCacheFile.delete();
                    }
                }
            } else {
                fileOutputStream = this.mFileOutput;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    this.mFileInputStream = null;
                    this.mFileOutput = null;
                    file = this.mCacheFile;
                    if (file != null) {
                        this.mCacheFile.delete();
                    }
                } else {
                    this.mFileInputStream = null;
                    this.mFileOutput = null;
                    file = this.mCacheFile;
                    if (file != null) {
                        this.mCacheFile.delete();
                    }
                }
            }
            throw th;
        }
    }

    public int getChannelCount() {
        return this.channel;
    }

    public long getContentLength() {
        long j;
        synchronized (this.mLock) {
            j = this.mExpectSize;
        }
        return j;
    }

    public String getContentType() {
        return "audio/mp3";
    }

    public long getCurrentReadPosition() {
        long j;
        synchronized (this.mLock) {
            j = this.readPosition;
        }
        return j;
    }

    public boolean getEndTag() {
        return this.mEndTag.get();
    }

    public String getFileKey() {
        return this.fileKey;
    }

    public int getSampling() {
        return this.sampling;
    }

    public void initInputStream() {
        this.readPosition = 0L;
        FileInputStream fileInputStream = this.mFileInputStream;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.mFileInputStream = new FileInputStream(this.mCacheFile);
        } catch (FileNotFoundException e2) {
            Log.d(TAG, "", e2);
        }
    }

    public void initOutputStream() {
        this.mWriteSize = 0L;
        this.mHasData.set(false);
        FileOutputStream fileOutputStream = this.mFileOutput;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            this.mFileOutput = new FileOutputStream(this.mCacheFile);
        } catch (FileNotFoundException e2) {
            Log.d(TAG, "", e2);
        }
    }

    public int readCacheData(byte[] bArr, long j) {
        return readCacheData(bArr, j, 0, bArr.length);
    }

    public void setContentLength(long j) {
        synchronized (this.mLock) {
            this.mExpectSize = j;
        }
    }

    public void setEndTag() {
        this.mEndTag.set(true);
        closeOutputStream();
        synchronized (this.mLock) {
            try {
                this.mLock.notifyAll();
            } catch (Exception e) {
                Log.d(TAG, e.toString(), new Object[0]);
            }
        }
    }

    public long skip(long j) throws IOException {
        synchronized (this.mLock) {
            FileInputStream fileInputStream = this.mFileInputStream;
            if (fileInputStream == null) {
                return -1L;
            }
            long jSkip = fileInputStream.skip(j);
            Log.d(TAG, "skip expect size " + j + "  real: " + jSkip, new Object[0]);
            return jSkip;
        }
    }

    public boolean writeCacheData(byte[] bArr) {
        return writeCacheData(bArr, 0, bArr.length);
    }

    public FileCache(String str, String str2) {
        this(str, str2, 1, 16000, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[Catch: InterruptedException -> 0x011e, IOException -> 0x0130, all -> 0x0153, TryCatch #2 {InterruptedException -> 0x011e, blocks: (B:14:0x003a, B:16:0x0042, B:18:0x0048, B:22:0x0073, B:26:0x007c, B:27:0x00a8, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:35:0x00d7, B:37:0x00dd, B:38:0x010d, B:40:0x0116), top: B:60:0x003a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[Catch: InterruptedException -> 0x011e, IOException -> 0x0130, all -> 0x0153, TRY_LEAVE, TryCatch #2 {InterruptedException -> 0x011e, blocks: (B:14:0x003a, B:16:0x0042, B:18:0x0048, B:22:0x0073, B:26:0x007c, B:27:0x00a8, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:35:0x00d7, B:37:0x00dd, B:38:0x010d, B:40:0x0116), top: B:60:0x003a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[Catch: InterruptedException -> 0x011e, IOException -> 0x0130, all -> 0x0153, TRY_ENTER, TryCatch #2 {InterruptedException -> 0x011e, blocks: (B:14:0x003a, B:16:0x0042, B:18:0x0048, B:22:0x0073, B:26:0x007c, B:27:0x00a8, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:35:0x00d7, B:37:0x00dd, B:38:0x010d, B:40:0x0116), top: B:60:0x003a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd A[Catch: InterruptedException -> 0x011e, IOException -> 0x0130, all -> 0x0153, TryCatch #2 {InterruptedException -> 0x011e, blocks: (B:14:0x003a, B:16:0x0042, B:18:0x0048, B:22:0x0073, B:26:0x007c, B:27:0x00a8, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:35:0x00d7, B:37:0x00dd, B:38:0x010d, B:40:0x0116), top: B:60:0x003a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0116 A[Catch: InterruptedException -> 0x011e, IOException -> 0x0130, all -> 0x0153, TRY_LEAVE, TryCatch #2 {InterruptedException -> 0x011e, blocks: (B:14:0x003a, B:16:0x0042, B:18:0x0048, B:22:0x0073, B:26:0x007c, B:27:0x00a8, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:35:0x00d7, B:37:0x00dd, B:38:0x010d, B:40:0x0116), top: B:60:0x003a, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0142 A[Catch: all -> 0x0153, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000c, B:8:0x0014, B:11:0x0026, B:12:0x0032, B:14:0x003a, B:16:0x0042, B:18:0x0048, B:19:0x0070, B:22:0x0073, B:26:0x007c, B:27:0x00a8, B:29:0x00b0, B:30:0x00c0, B:32:0x00c6, B:33:0x00d5, B:35:0x00d7, B:37:0x00dd, B:38:0x010d, B:40:0x0116, B:41:0x011c, B:51:0x0142, B:52:0x0151, B:44:0x011f, B:45:0x012e, B:48:0x0131, B:49:0x0140), top: B:59:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00dd, please report this as an issue */
    public int readCacheData(byte[] bArr, long j, int i, int i2) {
        int i3;
        long j2;
        int i4;
        synchronized (this.mLock) {
            if (!this.mHasData.get() && !this.mEndTag.get()) {
                try {
                    Log.d(TAG, "file has created,but not write data,wait timeout 30s", new Object[0]);
                    this.mLock.wait(30000L);
                } catch (InterruptedException e) {
                    Log.d(TAG, "data write", e);
                }
                if (this.mHasData.get()) {
                    Log.d(TAG, " has no data", new Object[0]);
                    return FileCacheCode.N0_DATA_WRITE_TAG.getCode();
                }
                if (!this.mEndTag.get()) {
                }
                i3 = 0;
                while (true) {
                    j2 = this.mWriteSize;
                    if (j < j2) {
                        break;
                    }
                    break;
                    break;
                    Log.d(TAG, "request data position larger: " + j + "  mWriteSize : " + this.mWriteSize, new Object[0]);
                    this.mLock.wait(500L);
                    i3++;
                }
                if (((long) this.cacheSize) + j > j2) {
                    Log.d(TAG, "wait enough cache", new Object[0]);
                    this.mLock.wait(200L);
                }
                if (j >= this.mWriteSize) {
                    Log.d(TAG, "not wait data", new Object[0]);
                    return FileCacheCode.N0_DATA_WRITE_TAG.getCode();
                }
                if (j != this.readPosition) {
                    Log.d(TAG, "skip " + j + " current position: " + this.readPosition, new Object[0]);
                    this.readPosition = this.readPosition + this.mFileInputStream.skip(j - this.readPosition);
                }
                i4 = this.mFileInputStream.read(bArr, i, i2);
                if (i4 != -1) {
                    this.readPosition += (long) i4;
                }
                return i4;
            }
            if (this.mHasData.get()) {
                Log.d(TAG, " has no data", new Object[0]);
                return FileCacheCode.N0_DATA_WRITE_TAG.getCode();
            }
            try {
                try {
                    if (!this.mEndTag.get() && j >= this.mWriteSize) {
                        Log.d(TAG, "read end file  startPosition : " + j + "   mWriteSize : " + this.mWriteSize, new Object[0]);
                        return FileCacheCode.EFO.getCode();
                    }
                    i3 = 0;
                    while (true) {
                        j2 = this.mWriteSize;
                        if (j < j2 || i3 >= 4) {
                            break;
                        }
                        Log.d(TAG, "request data position larger: " + j + "  mWriteSize : " + this.mWriteSize, new Object[0]);
                        this.mLock.wait(500L);
                        i3++;
                    }
                    if (((long) this.cacheSize) + j > j2) {
                        Log.d(TAG, "wait enough cache", new Object[0]);
                        this.mLock.wait(200L);
                    }
                    if (j >= this.mWriteSize) {
                        Log.d(TAG, "not wait data", new Object[0]);
                        return FileCacheCode.N0_DATA_WRITE_TAG.getCode();
                    }
                    if (j != this.readPosition) {
                        Log.d(TAG, "skip " + j + " current position: " + this.readPosition, new Object[0]);
                        this.readPosition = this.readPosition + this.mFileInputStream.skip(j - this.readPosition);
                    }
                    i4 = this.mFileInputStream.read(bArr, i, i2);
                    if (i4 != -1) {
                        this.readPosition += (long) i4;
                    }
                    return i4;
                } catch (InterruptedException e2) {
                    Log.e(TAG, "", e2, new Object[0]);
                    return FileCacheCode.EFO.getCode();
                }
            } catch (IOException e3) {
                Log.e(TAG, "", e3, new Object[0]);
                return FileCacheCode.EFO.getCode();
            }
            throw th;
        }
    }

    public boolean writeCacheData(byte[] bArr, int i, int i2) {
        synchronized (this.mLock) {
            FileOutputStream fileOutputStream = this.mFileOutput;
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.write(bArr, i, i2);
                this.mWriteSize += (long) i2;
                this.mHasData.set(true);
                this.mLock.notifyAll();
                return true;
            } catch (IOException e) {
                Log.e(TAG, "", e, new Object[0]);
                return false;
            }
        }
    }

    public FileCache(String str, String str2, int i) {
        this(str, str2, 1, 16000, i);
    }

    public FileCache(String str, String str2, int i, int i2, int i3) {
        this.mHasData = new AtomicBoolean(false);
        this.mEndTag = new AtomicBoolean(false);
        this.readPosition = 0L;
        this.mExpectSize = -1L;
        this.mWriteSize = 0L;
        this.cacheSize = 0;
        this.mLock = new Object();
        try {
            this.channel = i;
            this.sampling = i2;
            this.cacheSize = i3;
            this.fileKey = str;
            File file = new File(str2);
            this.mCacheFile = file;
            if (file.exists()) {
                this.mCacheFile.delete();
            }
            this.mCacheFile.createNewFile();
            this.deleteCacheFile = true;
        } catch (IOException e) {
            Log.e(TAG, "", e, new Object[0]);
        }
    }

    private FileCache(String str, String str2, int i, int i2, boolean z) {
        this.mHasData = new AtomicBoolean(false);
        this.mEndTag = new AtomicBoolean(false);
        this.readPosition = 0L;
        this.mExpectSize = -1L;
        this.mWriteSize = 0L;
        this.cacheSize = 0;
        this.mLock = new Object();
        this.channel = i;
        this.sampling = i2;
        this.fileKey = str;
        File file = new File(str2);
        this.mCacheFile = file;
        this.deleteCacheFile = false;
        this.mWriteSize = file.length();
        setContentLength(this.mCacheFile.length());
        setEndTag();
        this.mHasData.set(true);
        this.deleteCacheFile = false;
    }
}
