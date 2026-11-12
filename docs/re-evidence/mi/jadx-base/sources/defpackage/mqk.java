package defpackage;

import cn.hutool.core.io.IORuntimeException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface mqk {
    String getName();

    default BufferedReader getReader(Charset charset) {
        return cid.e(getStream(), charset);
    }

    InputStream getStream();

    URL getUrl();

    default byte[] readBytes() throws IORuntimeException {
        return cid.k(getStream());
    }

    default String readStr(Charset charset) throws IORuntimeException {
        return cid.i(getReader(charset));
    }

    default String readUtf8Str() throws IORuntimeException {
        return readStr(au3.f3449b);
    }

    default void writeTo(OutputStream outputStream) throws IORuntimeException {
        try {
            InputStream stream = getStream();
            try {
                cid.b(stream, outputStream);
                if (stream != null) {
                    stream.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (stream != null) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }
}
