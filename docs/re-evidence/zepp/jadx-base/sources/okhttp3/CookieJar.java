package okhttp3;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface CookieJar {
    public static final CookieJar NO_COOKIES = new a();

    public class a implements CookieJar {
        @Override // okhttp3.CookieJar
        public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            return Collections.emptyList();
        }

        @Override // okhttp3.CookieJar
        public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
