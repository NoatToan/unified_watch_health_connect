package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes14.dex */
public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;
    private RandomAccessFile file;
    private boolean opened;
    private Uri uri;

    public static final class Api21 {
        private Api21() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isPermissionError(Throwable th3) {
            return (th3 instanceof ErrnoException) && ((ErrnoException) th3).errno == OsConstants.EACCES;
        }
    }

    public static final class Factory implements DataSource.Factory {
        private TransferListener listener;

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }

        public Factory setListener(TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) Assertions.checkNotNull(uri.getPath()), JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        } catch (FileNotFoundException e4) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e4, (Util.SDK_INT < 21 || !Api21.isPermissionError(e4.getCause())) ? 2005 : 2006);
            }
            String path = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbI = p6.b.i("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path, ",query=", query, ",fragment=");
            sbI.append(fragment);
            throw new FileDataSourceException(sbI.toString(), e4, 1004);
        } catch (SecurityException e14) {
            throw new FileDataSourceException(e14, 2006);
        } catch (RuntimeException e15) {
            throw new FileDataSourceException(e15, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.uri = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.file = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (IOException e4) {
                throw new FileDataSourceException(e4, 2000);
            }
        } catch (Throwable th3) {
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri);
        this.file = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(dataSpec.position);
            long length = dataSpec.length;
            if (length == -1) {
                length = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (IOException e4) {
            throw new FileDataSourceException(e4, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i14, int i15) throws FileDataSourceException {
        if (i15 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int i16 = ((RandomAccessFile) Util.castNonNull(this.file)).read(bArr, i14, (int) Math.min(this.bytesRemaining, i15));
            if (i16 > 0) {
                this.bytesRemaining -= (long) i16;
                bytesTransferred(i16);
            }
            return i16;
        } catch (IOException e4) {
            throw new FileDataSourceException(e4, 2000);
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th3, int i14) {
            super(th3, i14);
        }

        public FileDataSourceException(String str, Throwable th3, int i14) {
            super(str, th3, i14);
        }
    }
}
