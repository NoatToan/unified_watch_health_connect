package defpackage;

import androidx.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class zv5 implements kte {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f41710a;

    public zv5(HttpURLConnection httpURLConnection) {
        this.f41710a = httpURLConnection;
    }

    @Override // defpackage.kte
    public String F() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f41710a.getURL() + ". Failed with " + this.f41710a.getResponseCode() + "\n" + a(this.f41710a);
        } catch (IOException e) {
            rpe.d("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // defpackage.kte
    public String X() {
        return this.f41710a.getContentType();
    }

    @Override // defpackage.kte
    public InputStream Y() throws IOException {
        return this.f41710a.getInputStream();
    }

    public final String a(HttpURLConnection httpURLConnection) throws IOException {
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f41710a.disconnect();
    }

    @Override // defpackage.kte
    public boolean isSuccessful() {
        try {
            return this.f41710a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
