package androidx.media3.datasource;

import com.google.common.base.Ascii;
import ha.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public static final int TYPE_CLOSE = 3;
    public static final int TYPE_OPEN = 1;
    public static final int TYPE_READ = 2;
    public final g dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(g gVar, int i14, int i15) {
        super(assignErrorCode(i14, i15));
        this.dataSpec = gVar;
        this.type = i15;
    }

    private static int assignErrorCode(int i14, int i15) {
        if (i14 == 2000 && i15 == 1) {
            return 2001;
        }
        return i14;
    }

    public static HttpDataSource$HttpDataSourceException createForIOException(final IOException iOException, final g gVar, int i14) {
        int i15;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i15 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i15 = 1004;
        } else {
            i15 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i15 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, gVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, gVar, i15, i14);
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(g gVar, int i14) {
        this(gVar, 2000, i14);
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, g gVar, int i14) {
        this(str, gVar, 2000, i14);
    }

    public HttpDataSource$HttpDataSourceException(String str, g gVar, int i14, int i15) {
        super(str, assignErrorCode(i14, i15));
        this.dataSpec = gVar;
        this.type = i15;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(IOException iOException, g gVar, int i14) {
        this(iOException, gVar, 2000, i14);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, g gVar, int i14, int i15) {
        super(iOException, assignErrorCode(i14, i15));
        this.dataSpec = gVar;
        this.type = i15;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, g gVar, int i14) {
        this(str, iOException, gVar, 2000, i14);
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, g gVar, int i14, int i15) {
        super(str, iOException, assignErrorCode(i14, i15));
        this.dataSpec = gVar;
        this.type = i15;
    }
}
