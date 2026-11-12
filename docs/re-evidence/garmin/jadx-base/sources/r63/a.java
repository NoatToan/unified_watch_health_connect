package r63;

import com.github.mikephil.chartingv2.BuildConfig;
import com.google.gdata.util.common.base.PercentEscaper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeMap;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f151028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u63.b f151029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u63.a f151030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t63.a f151031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Random f151032g = new Random(System.nanoTime());

    public a(String str, String str2) {
        this.f151026a = str;
        this.f151027b = str2;
        u63.b bVar = new u63.b();
        this.f151029d = bVar;
        bVar.setConsumerSecret(str2);
        this.f151030e = new u63.a();
    }

    public static void a(t63.b bVar, t63.a aVar) throws IOException {
        String contentType = bVar.getContentType();
        if (contentType == null || !contentType.startsWith("application/x-www-form-urlencoded")) {
            return;
        }
        InputStream messagePayload = bVar.getMessagePayload();
        PercentEscaper percentEscaper = b.f151033a;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(messagePayload));
        StringBuilder sb3 = new StringBuilder();
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            sb3.append(line);
        }
        aVar.c(b.b(sb3.toString()), true);
    }

    public static void b(t63.b bVar, t63.a aVar) {
        String header = bVar.getHeader();
        PercentEscaper percentEscaper = b.f151033a;
        t63.a aVar2 = new t63.a();
        if (header != null && header.startsWith("OAuth ")) {
            for (String str : header.substring(6).split(",")) {
                String[] strArrSplit = str.split("=");
                aVar2.b(strArrSplit[0].trim(), strArrSplit[1].replace("\"", "").trim(), false);
            }
        }
        aVar.c(aVar2, false);
    }

    public final void c(t63.a aVar) {
        String str;
        TreeMap<String, SortedSet<String>> treeMap = aVar.f162800a;
        if (!treeMap.containsKey("oauth_consumer_key")) {
            aVar.b("oauth_consumer_key", this.f151026a, true);
        }
        if (!treeMap.containsKey("oauth_signature_method")) {
            this.f151029d.getClass();
            aVar.b("oauth_signature_method", "HMAC-SHA1", true);
        }
        if (!treeMap.containsKey("oauth_timestamp")) {
            aVar.b("oauth_timestamp", Long.toString(System.currentTimeMillis() / 1000), true);
        }
        if (!treeMap.containsKey("oauth_nonce")) {
            aVar.b("oauth_nonce", Long.toString(this.f151032g.nextLong()), true);
        }
        if (!treeMap.containsKey("oauth_version")) {
            aVar.b("oauth_version", BuildConfig.VERSION_NAME, true);
        }
        if (treeMap.containsKey("oauth_token") || (str = this.f151028c) == null || str.equals("")) {
            return;
        }
        aVar.b("oauth_token", this.f151028c, true);
    }

    public final synchronized void d(t63.b bVar) {
        if (this.f151026a == null) {
            throw new OAuthExpectationFailedException("consumer key not set");
        }
        if (this.f151027b == null) {
            throw new OAuthExpectationFailedException("consumer secret not set");
        }
        t63.a aVar = new t63.a();
        this.f151031f = aVar;
        try {
            b(bVar, aVar);
            t63.a aVar2 = this.f151031f;
            String strB = bVar.b();
            int iIndexOf = strB.indexOf(63);
            if (iIndexOf >= 0) {
                aVar2.c(b.b(strB.substring(iIndexOf + 1)), true);
            }
            a(bVar, this.f151031f);
            c(this.f151031f);
            this.f151031f.f162800a.remove("oauth_signature");
            String strSign = this.f151029d.sign(bVar, this.f151031f);
            b.a("signature", strSign);
            u63.a aVar3 = this.f151030e;
            t63.a aVar4 = this.f151031f;
            aVar3.getClass();
            u63.a.a(strSign, bVar, aVar4);
            b.a("Request URL", bVar.b());
        } catch (IOException e4) {
            throw new OAuthCommunicationException(e4);
        }
    }
}
