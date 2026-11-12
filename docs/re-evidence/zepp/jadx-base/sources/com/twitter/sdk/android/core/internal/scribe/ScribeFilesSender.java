package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.text.TextUtils;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.IdManager;
import com.twitter.sdk.android.core.internal.network.GuestAuthInterceptor;
import com.twitter.sdk.android.core.internal.network.OAuth1aInterceptor;
import com.twitter.sdk.android.core.internal.network.OkHttpClientHelper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes18.dex */
class ScribeFilesSender implements FilesSender {
    private static final String j = "Failed sending files";
    private static final byte[] k = {RaceType.RESPONSE};
    private static final byte[] l = {44};
    private static final byte[] m = {RaceType.INDICATION};
    private final Context a;
    private final ScribeConfig b;
    private final long c;
    private final TwitterAuthConfig d;
    private final SessionManager<? extends Session<TwitterAuthToken>> e;
    private final GuestSessionProvider f;
    private final AtomicReference<ScribeService> g = new AtomicReference<>();
    private final ExecutorService h;
    private final IdManager i;

    public interface ScribeService {
        @FormUrlEncoded
        @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @POST("/{version}/jot/{type}")
        Call<ResponseBody> upload(@Path("version") String str, @Path("type") String str2, @Field("log[]") String str3);

        @FormUrlEncoded
        @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @POST("/scribe/{sequence}")
        Call<ResponseBody> uploadSequence(@Path("sequence") String str, @Field("log[]") String str2);
    }

    public class a implements QueueFile.ElementReader {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ ByteArrayOutputStream b;

        public a(boolean[] zArr, ByteArrayOutputStream byteArrayOutputStream) {
            this.a = zArr;
            this.b = byteArrayOutputStream;
        }

        @Override // com.twitter.sdk.android.core.internal.scribe.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) throws IOException {
            byte[] bArr = new byte[i];
            inputStream.read(bArr);
            boolean[] zArr = this.a;
            if (zArr[0]) {
                this.b.write(ScribeFilesSender.l);
            } else {
                zArr[0] = true;
            }
            this.b.write(bArr);
        }
    }

    public static class b implements Interceptor {
        private static final String c = "User-Agent";
        private static final String d = "X-Client-UUID";
        private static final String e = "X-Twitter-Polling";
        private static final String f = "true";
        private final ScribeConfig a;
        private final IdManager b;

        public b(ScribeConfig scribeConfig, IdManager idManager) {
            this.a = scribeConfig;
            this.b = idManager;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request.Builder builderNewBuilder = chain.request().newBuilder();
            if (!TextUtils.isEmpty(this.a.userAgent)) {
                builderNewBuilder.header("User-Agent", this.a.userAgent);
            }
            if (!TextUtils.isEmpty(this.b.getDeviceUUID())) {
                builderNewBuilder.header(d, this.b.getDeviceUUID());
            }
            builderNewBuilder.header(e, "true");
            return chain.proceed(builderNewBuilder.build());
        }
    }

    public ScribeFilesSender(Context context, ScribeConfig scribeConfig, long j2, TwitterAuthConfig twitterAuthConfig, SessionManager<? extends Session<TwitterAuthToken>> sessionManager, GuestSessionProvider guestSessionProvider, ExecutorService executorService, IdManager idManager) {
        this.a = context;
        this.b = scribeConfig;
        this.c = j2;
        this.d = twitterAuthConfig;
        this.e = sessionManager;
        this.f = guestSessionProvider;
        this.h = executorService;
        this.i = idManager;
    }

    private Session d(long j2) {
        return this.e.getSession(j2);
    }

    private boolean e() {
        return c() != null;
    }

    private boolean f(Session session) {
        return (session == null || session.getAuthToken() == null) ? false : true;
    }

    public String b(List<File> list) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        boolean[] zArr = new boolean[1];
        byteArrayOutputStream.write(k);
        Iterator<File> it2 = list.iterator();
        while (it2.hasNext()) {
            QueueFile queueFile = null;
            try {
                QueueFile queueFile2 = new QueueFile(it2.next());
                try {
                    queueFile2.forEach(new a(zArr, byteArrayOutputStream));
                    CommonUtils.closeQuietly(queueFile2);
                } catch (Throwable th) {
                    th = th;
                    queueFile = queueFile2;
                    CommonUtils.closeQuietly(queueFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        byteArrayOutputStream.write(m);
        return byteArrayOutputStream.toString("UTF-8");
    }

    public synchronized ScribeService c() {
        if (this.g.get() == null) {
            Session sessionD = d(this.c);
            this.g.compareAndSet(null, (ScribeService) new Retrofit.Builder().baseUrl(this.b.baseUrl).client(f(sessionD) ? new OkHttpClient.Builder().certificatePinner(OkHttpClientHelper.getCertificatePinner()).addInterceptor(new b(this.b, this.i)).addInterceptor(new OAuth1aInterceptor(sessionD, this.d)).build() : new OkHttpClient.Builder().certificatePinner(OkHttpClientHelper.getCertificatePinner()).addInterceptor(new b(this.b, this.i)).addInterceptor(new GuestAuthInterceptor(this.f)).build()).build().create(ScribeService.class));
        }
        return this.g.get();
    }

    public void g(ScribeService scribeService) {
        this.g.set(scribeService);
    }

    public retrofit2.Response<ResponseBody> h(String str) throws IOException {
        ScribeService scribeServiceC = c();
        if (!TextUtils.isEmpty(this.b.sequence)) {
            return scribeServiceC.uploadSequence(this.b.sequence, str).execute();
        }
        ScribeConfig scribeConfig = this.b;
        return scribeServiceC.upload(scribeConfig.pathVersion, scribeConfig.pathType, str).execute();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.FilesSender
    public boolean send(List<File> list) throws Throwable {
        if (!e()) {
            CommonUtils.logControlled(this.a, "Cannot attempt upload at this time");
            return false;
        }
        try {
            String strB = b(list);
            CommonUtils.logControlled(this.a, strB);
            retrofit2.Response<ResponseBody> responseH = h(strB);
            if (responseH.code() == 200) {
                return true;
            }
            CommonUtils.logControlledError(this.a, j, null);
            return responseH.code() == 500 || responseH.code() == 400;
        } catch (Exception e) {
            CommonUtils.logControlledError(this.a, j, e);
            return false;
        }
    }
}
