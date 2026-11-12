package com.huawei.hms.network.file.upload.api;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.network.file.api.RequestManager;
import com.huawei.hms.network.file.core.util.FLogger;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes10.dex */
public class FileEntity {
    private static final String TAG = "FileEntity";
    File file;
    String fileName;
    String name;
    long startPos;
    long uploadSize;
    Uri uri;

    public String toString() {
        return "FileEntity{name='" + this.name + "', fileName='" + this.fileName + "', startPos=" + this.startPos + ", uploadSize=" + this.uploadSize + '}';
    }

    public Uri getUri() {
        return this.uri;
    }

    public long getUploadSize() {
        return this.uploadSize;
    }

    public long getStartPos() {
        return this.startPos;
    }

    public String getName() {
        return this.name;
    }

    public String getFileName() {
        return this.fileName;
    }

    @Deprecated
    public File getFile() {
        return this.file;
    }

    @Deprecated
    public FileEntity(String str, String str2, File file, long j, long j2) {
        this.name = "file";
        this.fileName = "default";
        if (!TextUtils.isEmpty(str)) {
            this.name = str;
        }
        this.fileName = str2;
        if (file.isDirectory()) {
            throw new IllegalArgumentException("filepath cannot be a file directory");
        }
        if (!file.exists()) {
            throw new IllegalArgumentException("no such file");
        }
        this.file = file;
        this.startPos = j;
        this.uploadSize = j2 <= 0 ? file.length() - j : j2;
        FLogger.i(TAG, "FileEntity fileName:" + str2 + ",startPos:" + this.startPos + ",uploadSize:" + this.uploadSize + ",fileSize:" + file.length(), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    public FileEntity(String str, String str2, Uri uri, long j, long j2) {
        byte b2;
        long length;
        long j3;
        this.name = "file";
        this.fileName = "default";
        if (!TextUtils.isEmpty(str)) {
            this.name = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.fileName = str2;
        }
        if (uri == null) {
            throw new IllegalArgumentException("Uri is null");
        }
        this.uri = uri;
        this.startPos = j;
        String scheme = uri.getScheme();
        int iHashCode = scheme.hashCode();
        if (iHashCode != 3143036) {
            if (iHashCode == 951530617 && scheme.equals("content")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (scheme.equals("file")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                j3 = 0;
                length = 0;
            } else {
                try {
                    if (RequestManager.getAppContext() == null) {
                        throw new IllegalArgumentException("context is null,you must call UploadManager.build(context) before");
                    }
                    length = RequestManager.getAppContext().getContentResolver().openFileDescriptor(uri, "r").getStatSize();
                } catch (FileNotFoundException e) {
                    FLogger.v(TAG, "get size for SCHEME_CONTENT error:" + e.getMessage());
                    throw new IllegalArgumentException("file not found exception");
                }
            }
            if (j2 <= 0) {
                this.uploadSize = j3;
            } else {
                this.uploadSize = j2;
            }
            FLogger.i(TAG, "FileEntity uri fileName:" + str2 + ",startPos:" + this.startPos + ",uploadSize:" + this.uploadSize + ",totalFileLength:" + length, new Object[0]);
        }
        File file = new File(uri.getPath());
        this.file = file;
        if (file.isDirectory()) {
            throw new IllegalArgumentException("filepath cannot be a file directory");
        }
        if (!this.file.exists()) {
            throw new IllegalArgumentException("no such file");
        }
        length = this.file.length();
        j3 = length - j;
        if (j2 <= 0) {
            this.uploadSize = j3;
        } else {
            this.uploadSize = j2;
        }
        FLogger.i(TAG, "FileEntity uri fileName:" + str2 + ",startPos:" + this.startPos + ",uploadSize:" + this.uploadSize + ",totalFileLength:" + length, new Object[0]);
    }

    @Deprecated
    public FileEntity(String str, File file) {
        this(str, file.getName(), file, 0L, -1L);
    }

    public FileEntity(String str, Uri uri) {
        this(str, (String) null, uri, 0L, -1L);
    }

    @Deprecated
    public FileEntity(File file) {
        this((String) null, file);
    }

    public FileEntity(Uri uri) {
        this((String) null, (String) null, uri, 0L, -1L);
    }
}
