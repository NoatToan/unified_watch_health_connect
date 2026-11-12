package androidx.media3.datasource;

import am.j;
import ha.g;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i14, String str, IOException iOException, Map<String, List<String>> map, g gVar, byte[] bArr) {
        super(j.h(i14, "Response code: "), iOException, gVar, 2004, 1);
        this.responseCode = i14;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
