package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.sessions.ApplicationInfo;
import e23.p;
import ge1.b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import o13.r;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import t13.d;
import t13.g;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJl\u0010\u0015\u001a\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lt13/g;", "blockingDispatcher", "<init>", "(Lcom/google/firebase/sessions/ApplicationInfo;Lt13/g;)V", "Ljava/net/URL;", "settingsUrl", "()Ljava/net/URL;", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lt13/d;", "", "", "onSuccess", "onFailure", "doConfigFetch", "(Ljava/util/Map;Le23/p;Le23/p;Lt13/d;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lt13/g;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    private static final String FIREBASE_PLATFORM = "android";
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";
    private final ApplicationInfo appInfo;
    private final g blockingDispatcher;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {73, 75, 78}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ Map<String, String> $headerOptions;
        final /* synthetic */ p<String, d<? super Unit>, Object> $onFailure;
        final /* synthetic */ p<JSONObject, d<? super Unit>, Object> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Map<String, String> map, p<? super JSONObject, ? super d<? super Unit>, ? extends Object> pVar, p<? super String, ? super d<? super Unit>, ? extends Object> pVar2, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$headerOptions = map;
            this.$onSuccess = pVar;
            this.$onFailure = pVar2;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return RemoteSettingsFetcher.this.new AnonymousClass2(this.$headerOptions, this.$onSuccess, this.$onFailure, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        
            if (r1.invoke(r3, r7) == r0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    URLConnection uRLConnectionOpenConnection = RemoteSettingsFetcher.this.settingsUrl().openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
                    httpsURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
                    for (Map.Entry<String, String> entry : this.$headerOptions.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb3 = new StringBuilder();
                        r0 r0Var = new r0();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            r0Var.f105810a = line;
                            if (line == 0) {
                                break;
                            }
                            sb3.append((String) line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb3.toString());
                        p<JSONObject, d<? super Unit>, Object> pVar = this.$onSuccess;
                        this.label = 1;
                        if (pVar.invoke(jSONObject, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        p<String, d<? super Unit>, Object> pVar2 = this.$onFailure;
                        String str = "Bad response code: " + responseCode;
                        this.label = 2;
                    }
                } else {
                    if (i14 != 1 && i14 != 2 && i14 != 3) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                p<String, d<? super Unit>, Object> pVar3 = this.$onFailure;
                String message = e4.getMessage();
                if (message == null) {
                    message = e4.toString();
                }
                this.label = 3;
            }
            return Unit.INSTANCE;
        }
    }

    public RemoteSettingsFetcher(ApplicationInfo applicationInfo, @Blocking g gVar) {
        applicationInfo.getClass();
        gVar.getClass();
        this.appInfo = applicationInfo;
        this.blockingDispatcher = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme("https").authority(FIREBASE_SESSIONS_BASE_URL_STRING).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(FIREBASE_PLATFORM).appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public Object doConfigFetch(Map<String, String> map, p<? super JSONObject, ? super d<? super Unit>, ? extends Object> pVar, p<? super String, ? super d<? super Unit>, ? extends Object> pVar2, d<? super Unit> dVar) throws Throwable {
        Object objE0 = b.e0(this.blockingDispatcher, new AnonymousClass2(map, pVar, pVar2, null), dVar);
        return objE0 == a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }
}
