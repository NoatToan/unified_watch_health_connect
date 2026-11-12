package t63;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    void a(String str);

    String b();

    String getContentType();

    String getHeader();

    InputStream getMessagePayload();

    String getMethod();
}
