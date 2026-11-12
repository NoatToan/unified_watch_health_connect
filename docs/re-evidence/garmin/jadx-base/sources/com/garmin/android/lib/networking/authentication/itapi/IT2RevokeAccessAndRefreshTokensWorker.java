package com.garmin.android.lib.networking.authentication.itapi;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import d53.u;
import d53.w;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import jg.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/lib/networking/authentication/itapi/IT2RevokeAccessAndRefreshTokensWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IT2RevokeAccessAndRefreshTokensWorker extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50076e = new a(null);

    private IT2RevokeAccessAndRefreshTokensWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final d.a c() throws Throwable {
        d.a bVar;
        WorkerParameters workerParameters = this.f11470b;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                c cVar = workerParameters.f11427b;
                c cVar2 = workerParameters.f11427b;
                String strE = cVar.e("URL");
                strE.getClass();
                w.z(strE, "revokerefreshtoken", false);
                URLConnection uRLConnectionOpenConnection = new URL(strE).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setConnectTimeout(30000);
                    httpURLConnection2.setReadTimeout(30000);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setAllowUserInteraction(false);
                    httpURLConnection2.setRequestMethod(FirebasePerformance.HttpMethod.POST);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CACHE_CONTROL, "no-cache");
                    httpURLConnection2.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + cVar2.e("ACCESS_TOKEN"));
                    httpURLConnection2.setRequestProperty(HttpHeaders.USER_AGENT, cVar2.e("USER_AGENT"));
                    httpURLConnection2.setRequestProperty("x-garmin-client-id", cVar2.e("IT_CLIENT_ID_LOGGING_ONLY"));
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                    String strE2 = cVar2.e("POST_BODY");
                    strE2.getClass();
                    byte[] bArrO = u.o(strE2);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArrO.length));
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    try {
                        outputStream.write(bArrO);
                        Unit unit = Unit.INSTANCE;
                        outputStream.close();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (200 <= responseCode && responseCode < 300) {
                            httpURLConnection2.getResponseCode();
                            bVar = new d.a.c();
                        } else if (400 > responseCode || responseCode >= 500) {
                            httpURLConnection2.getResponseCode();
                            bVar = new d.a.b();
                        } else {
                            httpURLConnection2.getResponseCode();
                            bVar = new d.a.C0165a();
                        }
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused) {
                        }
                        return bVar;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            b.l(outputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    httpURLConnection = httpURLConnection2;
                    e.getLocalizedMessage();
                    d.a.C0165a c0165a = new d.a.C0165a();
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    return c0165a;
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/lib/networking/authentication/itapi/IT2RevokeAccessAndRefreshTokensWorker$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
