package ui2;

import d53.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import p005kotlin.Metadata;
import zy2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lui2/c;", "", "", "childGuid", "Lve2/e;", "environment", "di2AccessToken", "", "isAppDebugBuild", "<init>", "(Ljava/lang/String;Lve2/e;Ljava/lang/String;Z)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.e f171432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f171434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HttpURLConnection f171435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f171436f;

    public c(String str, ve2.e eVar, String str2, boolean z14) {
        str.getClass();
        eVar.getClass();
        str2.getClass();
        this.f171431a = str;
        this.f171432b = eVar;
        this.f171433c = str2;
        this.f171434d = z14;
        xi2.a.f191145a.getClass();
        this.f171436f = xi2.a.a("GCChildRegistrationRequest");
    }

    public static final f a(c cVar, URL url, int i14) throws IOException {
        InputStream inputStream;
        k kVar = cVar.f171436f;
        String strE = "";
        if (200 != i14) {
            Exception exc = new Exception(i14 + StringUtils.SPACE + url);
            kVar.error("", exc);
            return new f.a(exc);
        }
        HttpURLConnection httpURLConnection = cVar.f171435e;
        if (httpURLConnection != null && (inputStream = httpURLConnection.getInputStream()) != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, d53.c.f57666b), 8192);
            try {
                strE = lg.d.E(bufferedReader);
                bufferedReader.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(bufferedReader, th3);
                    throw th4;
                }
            }
        }
        String str = i14 + StringUtils.SPACE + url;
        if (cVar.f171434d && !w.J(strE)) {
            try {
                str = str + "\n" + new JSONObject(strE).toString(4);
            } catch (Exception unused) {
            }
        }
        kVar.debug(str);
        String string = url.toString();
        string.getClass();
        return new f.b(new ri2.a(string, strE));
    }
}
