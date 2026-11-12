package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes46.dex */
public class zzq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BufferedReader f54834c;
    private String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final Logger f54832a = aaex.a((Class<?>) zzq.class);
    private static final Pattern e = Pattern.compile("^\\-+BEGIN\\s+([\\w\\s]+)\\-+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f54833b = Pattern.compile("^\\-+END\\s+([\\w\\s]+)\\-+$");

    public zzq(InputStream inputStream) {
        this.f54834c = new BufferedReader(new InputStreamReader(inputStream));
    }

    public void c() {
        try {
            this.f54834c.close();
        } catch (IOException unused) {
        }
    }

    public String b() throws IOException {
        Matcher matcher;
        this.d = null;
        do {
            String line = this.f54834c.readLine();
            if (line != null) {
                matcher = e.matcher(line);
            }
            return this.d;
        } while (!matcher.matches());
        String strGroup = matcher.group(1);
        this.d = strGroup;
        f54832a.debug("Found Begin of {}", strGroup);
        return this.d;
    }

    public byte[] d() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = this.f54834c.readLine();
            if (line == null) {
                break;
            }
            Matcher matcher = f54833b.matcher(line);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                if (strGroup.equals(this.d)) {
                    byte[] bArrB = zzb.b(sb.toString());
                    f54832a.debug("Found End of {}", this.d);
                    return bArrB;
                }
                f54832a.warn("Found End of {}, but expected {}!", strGroup, this.d);
                break;
            }
            sb.append(line);
        }
        this.d = null;
        return null;
    }
}
