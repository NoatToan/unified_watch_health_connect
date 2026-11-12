package com.huami.http.interceptor;

import android.util.Log;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.loopj.android.http.AsyncHttpClient;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/http/interceptor/CurlInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lcom/huami/http/interceptor/CurlInterceptor$Logger;", "a", "Lcom/huami/http/interceptor/CurlInterceptor$Logger;", "logger", "", "b", "J", "getMaxContentLength", "()J", "setMaxContentLength", "(J)V", "getMaxContentLength$annotations", "()V", "maxContentLength", "", "c", "Ljava/lang/String;", "curlOptions", "<init>", "(Lcom/huami/http/interceptor/CurlInterceptor$Logger;)V", "Companion", "Logger", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class CurlInterceptor implements Interceptor {
    private static final Charset d = Charset.forName("UTF-8");
    private static final long e = 4096;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long maxContentLength;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String curlOptions;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/http/interceptor/CurlInterceptor$Logger;", "", "", "message", "", "log", "Companion", "httpkit_release"}, k = 1, mv = {1, 5, 1})
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/http/interceptor/CurlInterceptor$Logger$Companion;", "", "Lcom/huami/http/interceptor/CurlInterceptor$Logger;", "b", "Lcom/huami/http/interceptor/CurlInterceptor$Logger;", "getDEFAULT", "()Lcom/huami/http/interceptor/CurlInterceptor$Logger;", MessengerShareContentUtility.PREVIEW_DEFAULT, "<init>", "()V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private static final Logger DEFAULT = new Logger() { // from class: com.huami.http.interceptor.CurlInterceptor$Logger$Companion$DEFAULT$1
                @Override // com.huami.http.interceptor.CurlInterceptor.Logger
                public void log(@NotNull String message) {
                    Log.i("LogcatInterceptor", message, null);
                }
            };

            private Companion() {
            }

            @NotNull
            public final Logger getDEFAULT() {
                return DEFAULT;
            }
        }

        void log(@NotNull String message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CurlInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CurlInterceptor(@NotNull Logger logger) {
        this.logger = logger;
        this.maxContentLength = 4096L;
    }

    public static /* synthetic */ void getMaxContentLength$annotations() {
    }

    public final long getMaxContentLength() {
        return this.maxContentLength;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        long j;
        boolean z;
        Object objM3845constructorimpl;
        Request request = chain.request();
        String str = this.curlOptions;
        String str2 = "curl";
        if (str != null) {
            if (str == null) {
                Intrinsics.throwNpe();
            }
            str2 = ((Object) "curl") + " " + str;
        }
        String str3 = ((Object) str2) + " -X " + request.method();
        Headers headers = request.headers();
        int size = headers.size();
        int i = 0;
        if (size > 0) {
            int i2 = 0;
            boolean z2 = false;
            long jLongValue = 0;
            while (true) {
                int i3 = i2 + 1;
                String strName = headers.name(i2);
                String strValue = headers.value(i2);
                int length = strValue.length() - 1;
                if (strValue.charAt(i) == '\"' && strValue.charAt(length) == '\"') {
                    strValue = "\\\"" + strValue.substring(1, length) + "\\\"";
                }
                if (m.equals("Accept-Encoding", strName, true) && m.equals(AsyncHttpClient.ENCODING_GZIP, strValue, true)) {
                    z2 = true;
                }
                String str4 = ((Object) str3) + " -H \"" + strName + ": " + ((Object) strValue) + "\"";
                if (m.equals("Content-Length", strName, true)) {
                    try {
                        Result.Companion companion = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(Long.valueOf(Long.parseLong(strValue)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = 0L;
                    }
                    jLongValue = ((Number) objM3845constructorimpl).longValue();
                }
                str3 = str4;
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
                i = 0;
            }
            z = z2;
            j = jLongValue;
        } else {
            j = 0;
            z = false;
        }
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            if (j > getMaxContentLength()) {
                str3 = ((Object) str3) + " --data $'RequestBody 过大省略打印" + j + "'";
            } else {
                Buffer buffer = new Buffer();
                requestBodyBody.writeTo(buffer);
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                Charset charset = mediaTypeContentType == null ? null : mediaTypeContentType.charset(d);
                if (charset == null) {
                    charset = d;
                }
                str3 = ((Object) str3) + " --data $'" + m.replace$default(buffer.readString(charset), "\n", "\\n", false, 4, (Object) null) + "'";
            }
        }
        String str5 = z ? " --compressed " : " ";
        String str6 = ((Object) str3) + str5 + "\"" + request.url() + "\"";
        this.logger.log("╭--- cURL (" + request.url() + ")");
        this.logger.log(str6);
        this.logger.log("╰--- (copy and paste the above line to a terminal)");
        return chain.proceed(request);
    }

    public final void setMaxContentLength(long j) {
        this.maxContentLength = j;
    }

    public /* synthetic */ CurlInterceptor(Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.INSTANCE.getDEFAULT() : logger);
    }
}
