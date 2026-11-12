package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.b;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public class g7h extends m62 implements HttpDataSource {
    public final Call.Factory e;
    public final HttpDataSource.c f;
    public final String g;
    public final CacheControl h;
    public final HttpDataSource.c i;
    public h6i<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f18686k;
    public Response l;
    public InputStream m;
    public boolean n;
    public long o;
    public long p;

    static {
        pi8.a("goog.exo.okhttp");
    }

    @Deprecated
    public g7h(Call.Factory factory, String str, CacheControl cacheControl, HttpDataSource.c cVar) {
        this(factory, str, cacheControl, cVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb A[Catch: IOException -> 0x00f1, TRY_ENTER, TryCatch #0 {IOException -> 0x00f1, blocks: (B:48:0x00e2, B:52:0x00eb, B:53:0x00f0), top: B:66:0x00e2 }] */
    @Override // com.google.android.exoplayer2.upstream.a
    public long b(b bVar) throws HttpDataSource.HttpDataSourceException {
        long j;
        long j2;
        long j3;
        byte[] bArrS0;
        this.f18686k = bVar;
        this.p = 0L;
        this.o = 0L;
        t(bVar);
        try {
            Response responseExecute = this.e.newCall(w(bVar)).execute();
            this.l = responseExecute;
            ResponseBody responseBody = (ResponseBody) rk1.e(responseExecute.body());
            this.m = responseBody.byteStream();
            int iCode = responseExecute.code();
            if (!responseExecute.isSuccessful()) {
                if (iCode == 416) {
                    if (bVar.g == ihc.c(responseExecute.headers().get("Content-Range"))) {
                        this.n = true;
                        u(bVar);
                        long j4 = bVar.h;
                        if (j4 != -1) {
                            return j4;
                        }
                        return 0L;
                    }
                }
                try {
                    bArrS0 = wlq.S0((InputStream) rk1.e(this.m));
                } catch (IOException unused) {
                    bArrS0 = wlq.f;
                }
                byte[] bArr = bArrS0;
                Map<String, List<String>> multimap = responseExecute.headers().toMultimap();
                v();
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(iCode, responseExecute.message(), multimap, bVar, bArr);
                if (iCode != 416) {
                    throw invalidResponseCodeException;
                }
                invalidResponseCodeException.initCause(new DataSourceException(0));
                throw invalidResponseCodeException;
            }
            MediaType mediaType = responseBody.get$contentType();
            String mediaType2 = mediaType != null ? mediaType.getMediaType() : "";
            h6i<String> h6iVar = this.j;
            if (h6iVar != null && !h6iVar.apply(mediaType2)) {
                v();
                throw new HttpDataSource.InvalidContentTypeException(mediaType2, bVar);
            }
            try {
                if (iCode == 200) {
                    j2 = bVar.g;
                    j = 0;
                    if (j2 == 0) {
                    }
                    j3 = bVar.h;
                    if (j3 != -1) {
                        this.o = j3;
                    } else {
                        long j5 = responseBody.get$contentLength();
                        this.o = j5 != -1 ? j5 - j2 : -1L;
                    }
                    this.n = true;
                    u(bVar);
                    if (y(j2)) {
                        return this.o;
                    }
                    throw new DataSourceException(0);
                }
                j = 0;
                if (y(j2)) {
                    return this.o;
                }
                throw new DataSourceException(0);
            } catch (IOException e) {
                v();
                throw new HttpDataSource.HttpDataSourceException(e, bVar, 1);
            }
            j2 = j;
            j3 = bVar.h;
            if (j3 != -1) {
                this.o = j3;
            } else {
                long j6 = responseBody.get$contentLength();
                this.o = j6 != -1 ? j6 - j2 : -1L;
            }
            this.n = true;
            u(bVar);
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (message == null || !fk1.e(message).matches("cleartext communication.*not permitted.*")) {
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e2, bVar, 1);
            }
            throw new HttpDataSource.CleartextNotPermittedException(e2, bVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws HttpDataSource.HttpDataSourceException {
        if (this.n) {
            this.n = false;
            s();
            v();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> d() {
        Response response = this.l;
        return response == null ? Collections.emptyMap() : response.headers().toMultimap();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri h() {
        Response response = this.l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().getUrl());
    }

    @Override // defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            return x(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, (b) rk1.e(this.f18686k), 2);
        }
    }

    public final void v() {
        Response response = this.l;
        if (response != null) {
            ((ResponseBody) rk1.e(response.body())).close();
            this.l = null;
        }
        this.m = null;
    }

    public final Request w(b bVar) throws HttpDataSource.HttpDataSourceException {
        long j = bVar.g;
        long j2 = bVar.h;
        HttpUrl httpUrl = HttpUrl.parse(bVar.f8404a.toString());
        if (httpUrl == null) {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", bVar, 1);
        }
        Request.Builder builderUrl = new Request.Builder().url(httpUrl);
        CacheControl cacheControl = this.h;
        if (cacheControl != null) {
            builderUrl.cacheControl(cacheControl);
        }
        HashMap map = new HashMap();
        HttpDataSource.c cVar = this.i;
        if (cVar != null) {
            map.putAll(cVar.a());
        }
        map.putAll(this.f.a());
        map.putAll(bVar.e);
        for (Map.Entry entry : map.entrySet()) {
            builderUrl.header((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = ihc.a(j, j2);
        if (strA != null) {
            builderUrl.addHeader("Range", strA);
        }
        String str = this.g;
        if (str != null) {
            builderUrl.addHeader("User-Agent", str);
        }
        if (!bVar.d(1)) {
            builderUrl.addHeader("Accept-Encoding", HTTP.IDENTITY_CODING);
        }
        byte[] bArr = bVar.d;
        RequestBody requestBodyCreate = null;
        if (bArr != null) {
            requestBodyCreate = RequestBody.create((MediaType) null, bArr);
        } else if (bVar.c == 2) {
            requestBodyCreate = RequestBody.create((MediaType) null, wlq.f);
        }
        builderUrl.method(bVar.b(), requestBodyCreate);
        return builderUrl.build();
    }

    public final int x(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.o;
        if (j != -1) {
            long j2 = j - this.p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) wlq.j(this.m)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.p += (long) i3;
        r(i3);
        return i3;
    }

    public final boolean y(long j) throws IOException {
        if (j == 0) {
            return true;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) wlq.j(this.m)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                return false;
            }
            j -= (long) i;
            r(i);
        }
        return true;
    }

    public g7h(Call.Factory factory, String str, CacheControl cacheControl, HttpDataSource.c cVar, h6i<String> h6iVar) {
        super(true);
        this.e = (Call.Factory) rk1.e(factory);
        this.g = str;
        this.h = cacheControl;
        this.i = cVar;
        this.j = h6iVar;
        this.f = new HttpDataSource.c();
    }
}
