package androidx.media3.datasource;

import ha.g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpEngineDataSource$OpenException extends HttpDataSource$HttpDataSourceException {
    public final int httpEngineConnectionStatus;

    public HttpEngineDataSource$OpenException(IOException iOException, g gVar, int i14, int i15) {
        super(iOException, gVar, i14, 1);
        this.httpEngineConnectionStatus = i15;
    }

    public HttpEngineDataSource$OpenException(String str, g gVar, int i14, int i15) {
        super(str, gVar, i14, 1);
        this.httpEngineConnectionStatus = i15;
    }

    public HttpEngineDataSource$OpenException(g gVar, int i14, int i15) {
        super(gVar, i14, 1);
        this.httpEngineConnectionStatus = i15;
    }
}
