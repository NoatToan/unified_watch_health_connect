package com.twitter.sdk.android.core.internal.persistence;

import android.content.Context;
import android.os.Environment;
import com.twitter.sdk.android.core.Twitter;
import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
public class FileStoreImpl implements FileStore {
    private final Context a;

    public FileStoreImpl(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.a = context;
    }

    public boolean a() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return true;
        }
        Twitter.getLogger().w("Twitter", "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
        return false;
    }

    public File b(File file) {
        if (file == null) {
            Twitter.getLogger().d("Twitter", "Null File");
            return null;
        }
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Twitter.getLogger().w("Twitter", "Couldn't create file");
        return null;
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.FileStore
    public File getCacheDir() {
        return b(this.a.getCacheDir());
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.FileStore
    public File getExternalCacheDir() {
        return a() ? b(this.a.getExternalCacheDir()) : b(null);
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.FileStore
    public File getExternalFilesDir() {
        return a() ? b(this.a.getExternalFilesDir(null)) : b(null);
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.FileStore
    public File getFilesDir() {
        return b(this.a.getFilesDir());
    }
}
