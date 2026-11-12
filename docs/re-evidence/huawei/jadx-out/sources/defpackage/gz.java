package defpackage;

import com.airbnb.lottie.network.LottieFetchResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes21.dex */
public class gz implements LottieFetchResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f36252b;

    public gz(HttpURLConnection httpURLConnection) {
        this.f36252b = httpURLConnection;
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public boolean isSuccessful() {
        try {
            return this.f36252b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
        }
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public InputStream bodyByteStream() throws IOException {
        return this.f36252b.getInputStream();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public String contentType() {
        return this.f36252b.getContentType();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f36252b.getURL() + ". Failed with " + this.f36252b.getResponseCode() + "\n" + a(this.f36252b);
        } catch (IOException e) {
            iy.b("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36252b.disconnect();
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }
}
