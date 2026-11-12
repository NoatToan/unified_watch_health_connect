package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class FileDataSource extends BaseDataSource {

    @Nullable
    private RandomAccessFile e;

    @Nullable
    private Uri f;
    private long g;
    private boolean h;

    public static final class Factory implements DataSource.Factory {

        @Nullable
        private TransferListener a;

        public Factory setListener(@Nullable TransferListener listener) {
            this.a = listener;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.a;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception cause) {
            super(cause, 2000);
        }

        @Deprecated
        public FileDataSourceException(String message, IOException cause) {
            super(message, cause, 2000);
        }

        public FileDataSourceException(Throwable cause, int errorCode) {
            super(cause, errorCode);
        }

        public FileDataSourceException(@Nullable String message, @Nullable Throwable cause, int errorCode) {
            super(message, cause, errorCode);
        }
    }

    @RequiresApi(21)
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public static boolean b(@Nullable Throwable e) {
            return (e instanceof ErrnoException) && ((ErrnoException) e).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile c(Uri uri) throws FileDataSourceException {
        int i = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            return new RandomAccessFile((String) Assertions.checkNotNull(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
            }
            if (Util.SDK_INT < 21 || !a.b(e.getCause())) {
                i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
            }
            throw new FileDataSourceException(e, i);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e3) {
            throw new FileDataSourceException(e3, 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws FileDataSourceException {
        this.f = null;
        try {
            RandomAccessFile randomAccessFile = this.e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.e = null;
            if (this.h) {
                this.h = false;
                transferEnded();
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.uri;
        this.f = uri;
        transferInitializing(dataSpec);
        RandomAccessFile randomAccessFileC = c(uri);
        this.e = randomAccessFileC;
        try {
            randomAccessFileC.seek(dataSpec.position);
            long length = dataSpec.length;
            if (length == -1) {
                length = this.e.length() - dataSpec.position;
            }
            this.g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.h = true;
            transferStarted(dataSpec);
            return this.g;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws FileDataSourceException {
        if (length == 0) {
            return 0;
        }
        if (this.g == 0) {
            return -1;
        }
        try {
            int i = ((RandomAccessFile) Util.castNonNull(this.e)).read(buffer, offset, (int) Math.min(this.g, length));
            if (i > 0) {
                this.g -= (long) i;
                bytesTransferred(i);
            }
            return i;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }
}
