package s63;

import com.google.common.net.HttpHeaders;
import java.io.InputStream;
import java.net.HttpURLConnection;
import t63.b;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f157644a;

    public a(HttpURLConnection httpURLConnection) {
        this.f157644a = httpURLConnection;
    }

    @Override // t63.b
    public final void a(String str) {
        this.f157644a.setRequestProperty(HttpHeaders.AUTHORIZATION, str);
    }

    @Override // t63.b
    public final String b() {
        return this.f157644a.getURL().toExternalForm();
    }

    @Override // t63.b
    public final String getContentType() {
        return this.f157644a.getRequestProperty(HttpHeaders.CONTENT_TYPE);
    }

    @Override // t63.b
    public final String getHeader() {
        return this.f157644a.getRequestProperty(HttpHeaders.AUTHORIZATION);
    }

    @Override // t63.b
    public final InputStream getMessagePayload() {
        return null;
    }

    @Override // t63.b
    public final String getMethod() {
        return this.f157644a.getRequestMethod();
    }
}
