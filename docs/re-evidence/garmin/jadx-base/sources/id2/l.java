package id2;

import com.google.common.net.HttpHeaders;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import w63.e.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid2/l;", "Lt63/b;", "Lokhttp3/Request;", "request", "<init>", "(Lokhttp3/Request;)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements t63.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Request f93058a;

    public l(Request request) {
        request.getClass();
        this.f93058a = request;
    }

    @Override // t63.b
    public final void a(String str) {
        this.f93058a = this.f93058a.newBuilder().header(HttpHeaders.AUTHORIZATION, str).build();
    }

    @Override // t63.b
    public final String b() {
        return this.f93058a.url().getUrl();
    }

    @Override // t63.b
    public final String getContentType() {
        MediaType contentType;
        RequestBody requestBodyBody = this.f93058a.body();
        if (requestBodyBody == null || (contentType = requestBodyBody.getContentType()) == null) {
            return null;
        }
        return contentType.getMediaType();
    }

    @Override // t63.b
    public final String getHeader() {
        return this.f93058a.header(HttpHeaders.AUTHORIZATION);
    }

    @Override // t63.b
    public final InputStream getMessagePayload() {
        RequestBody requestBodyBody = this.f93058a.body();
        if (requestBodyBody == null) {
            return null;
        }
        w63.e eVar = new w63.e();
        requestBodyBody.writeTo(eVar);
        return eVar.new b();
    }

    @Override // t63.b
    public final String getMethod() {
        return this.f93058a.method();
    }
}
