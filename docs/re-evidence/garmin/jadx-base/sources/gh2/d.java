package gh2;

import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import e23.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.runtimeconfig.GCRemoteConfiguration$fetchRemoteConfig$2", f = "GCRemoteConfiguration.kt", l = {}, m = "invokeSuspend")
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f77448a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f77448a = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f77448a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x014f  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpURLConnection httpURLConnection;
        HashMap mapA;
        List<String> list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        h hVar = new h();
        hVar.f77456a = System.currentTimeMillis();
        c cVar = this.f77448a;
        k kVar = cVar.f77430b;
        j jVar = cVar.f77434f;
        Logger logger = k.f77467c;
        String str = kVar.f77468a;
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(str);
            logger.debug("execute: " + url);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
                l lVarB = g.f77454c.b(str);
                if (lVarB != null && (list = lVarB.f77473d.get(HttpHeaders.ETAG)) != null && list.size() > 0) {
                    String str2 = list.get(0);
                    httpURLConnection.setRequestProperty(HttpHeaders.IF_NONE_MATCH, str2);
                    logger.debug("Set request etag = " + str2);
                }
                dd2.c cVar2 = kVar.f77469b;
                cVar2.getClass();
                xy2.b.J(httpURLConnection, cVar2.f59212a, cVar2.f59213b, cVar2.f59214c, cVar2.f59215d, null);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                logger.debug("execute: " + responseCode + " [GET] " + str);
                l lVar = new l();
                lVar.f77470a = str;
                lVar.f77471b = responseCode;
                lVar.f77472c = httpURLConnection.getResponseMessage();
                lVar.f77473d = httpURLConnection.getHeaderFields();
                logger.debug("Got response etag = " + lVar.f77473d.get(HttpHeaders.ETAG));
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader((responseCode < 200 || responseCode >= 400) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream()));
                try {
                    StringBuilder sb3 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb3.append(line);
                    }
                    bufferedReader2.close();
                    lVar.f77474e = sb3.toString();
                    logger.debug("Got response body size = " + lVar.f77474e.length());
                    if (responseCode == 200) {
                        g.f77454c.d(lVar);
                    }
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                    httpURLConnection.disconnect();
                    int i14 = lVar.f77471b;
                    hVar.f77457b = i14;
                    cVar.f77433e = hVar;
                    if (i14 == 200) {
                        mapA = jVar.a(lVar.f77474e);
                    } else if (i14 != 304) {
                        mapA = null;
                    } else {
                        cVar.j().debug("fetchRemoteConfig: remote config is up-to-date");
                        l lVarB2 = g.f77454c.b(lVar.f77470a);
                        if (lVarB2 != null) {
                            mapA = jVar.a(lVarB2.f77474e);
                        } else {
                            mapA = null;
                        }
                    }
                    if (mapA == null) {
                        vb.h.z(sn.a.e(lVar.f77471b, "unexpected response: ", StringUtils.SPACE, lVar.f77474e));
                        return null;
                    }
                    cVar.f77438j = mapA;
                    cVar.f77435g.edit().putLong("REMOTE_CONFIG_LAST_UPDATE", hVar.f77456a).apply();
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnection == null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
    }
}
