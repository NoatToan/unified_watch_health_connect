package lz2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.util.regex.Pattern;
import n23.j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import vb.h;
import w63.g;

/* JADX INFO: loaded from: classes2.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.a f115411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request f115412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OkHttpClient f115413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Call f115414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f115415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f115416f;

    public class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f115418b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Pattern f115417a = Pattern.compile("^[\\d]+$");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f115419c = new StringBuilder();

        public a(g gVar) {
            this.f115418b = gVar;
        }

        public final void a(String str, String str2) {
            if ("data".equals(str)) {
                StringBuilder sb3 = this.f115419c;
                sb3.append(str2);
                sb3.append('\n');
                return;
            }
            boolean zEquals = TtmlNode.ATTR_ID.equals(str);
            c cVar = c.this;
            if (zEquals) {
                cVar.f115416f = str2;
            } else if (!"event".equals(str) && "retry".equals(str) && this.f115417a.matcher(str2).matches()) {
                cVar.f115411a.e(cVar, Long.parseLong(str2));
            }
        }

        public final void b(String str) {
            c cVar = c.this;
            if (str == null || str.isEmpty()) {
                StringBuilder sb3 = this.f115419c;
                if (sb3.length() == 0) {
                    return;
                }
                String string = sb3.toString();
                if (string.endsWith("\n")) {
                    string = fb1.c.m(1, 0, string);
                }
                cVar.f115411a.a(cVar, string);
                sb3.setLength(0);
                return;
            }
            int iIndexOf = str.indexOf(58);
            if (iIndexOf == 0) {
                cVar.f115411a.f(cVar, str.substring(1).trim());
                return;
            }
            String strSubstring = "";
            if (iIndexOf == -1) {
                a(str, "");
                return;
            }
            String strSubstring2 = str.substring(0, iIndexOf);
            int i14 = iIndexOf + 1;
            if (i14 < str.length()) {
                if (str.charAt(i14) == ' ') {
                    i14 = iIndexOf + 2;
                }
                strSubstring = str.substring(i14);
            }
            a(strSubstring2, strSubstring);
        }
    }

    public c(Request request, d.a aVar) {
        if (!FirebasePerformance.HttpMethod.GET.equals(request.method())) {
            j.A(request.method(), "Request must be GET: ");
            throw null;
        }
        this.f115412b = request;
        this.f115411a = aVar;
    }

    public static void a(c cVar, IOException iOException, Response response) {
        d.a aVar = cVar.f115411a;
        if (!Thread.currentThread().isInterrupted() && !cVar.f115414d.isCanceled()) {
            aVar.c(cVar, iOException, response);
        }
        aVar.b(cVar);
        Call call = cVar.f115414d;
        if (call == null || call.isCanceled()) {
            return;
        }
        cVar.f115414d.cancel();
    }

    public final void b(Request request) {
        if (this.f115413c == null) {
            h.q("Client is null");
            return;
        }
        Request.Builder builderHeader = request.newBuilder().header(HttpHeaders.ACCEPT_ENCODING, "").header(HttpHeaders.ACCEPT, "text/event-stream").header(HttpHeaders.CACHE_CONTROL, "no-cache");
        String str = this.f115416f;
        if (str != null) {
            builderHeader.header("Last-Event-Id", str);
        }
        this.f115414d = this.f115413c.newCall(builderHeader.build());
    }
}
