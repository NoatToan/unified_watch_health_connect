package com.huami.applet.utils;

import android.util.Log;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.loopj.android.http.AsyncHttpClient;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/applet/utils/CurlInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lcom/huami/applet/utils/CurlInterceptor$Logger;", "a", "Lcom/huami/applet/utils/CurlInterceptor$Logger;", "logger", "", "b", "Ljava/lang/String;", "curlOptions", "<init>", "(Lcom/huami/applet/utils/CurlInterceptor$Logger;)V", "Companion", "Logger", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class CurlInterceptor implements Interceptor {
    private static final Charset c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String curlOptions;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/applet/utils/CurlInterceptor$Logger;", "", "", "message", "", "log", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/applet/utils/CurlInterceptor$Logger$Companion;", "", "Lcom/huami/applet/utils/CurlInterceptor$Logger;", "b", "Lcom/huami/applet/utils/CurlInterceptor$Logger;", "getDEFAULT", "()Lcom/huami/applet/utils/CurlInterceptor$Logger;", MessengerShareContentUtility.PREVIEW_DEFAULT, "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private static final Logger DEFAULT = new Logger() { // from class: com.huami.applet.utils.CurlInterceptor$Logger$Companion$DEFAULT$1
                @Override // com.huami.applet.utils.CurlInterceptor.Logger
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
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String str = "curl";
        if (this.curlOptions != null) {
            str = "curl" + StringUtil.SPACE + this.curlOptions;
        }
        String str2 = str + " -X " + ((Object) request.method());
        Headers headers = request.headers();
        int size = headers.size();
        boolean z = false;
        if (size > 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                int i2 = i + 1;
                String strName = headers.name(i);
                String strValue = headers.value(i);
                int length = strValue.length() - 1;
                if (strValue.charAt(0) == '\"' && strValue.charAt(length) == '\"') {
                    strValue = "\\\"" + strValue.substring(1, length) + "\\\"";
                }
                if (m.equals("Accept-Encoding", strName, true) && m.equals(AsyncHttpClient.ENCODING_GZIP, strValue, true)) {
                    z2 = true;
                }
                str2 = str2 + " -H \"" + ((Object) strName) + ": " + ((Object) strValue) + '\"';
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
            z = z2;
        }
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            Buffer buffer = new Buffer();
            requestBodyBody.writeTo(buffer);
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            Charset charset = mediaTypeContentType == null ? null : mediaTypeContentType.charset(c);
            if (charset == null) {
                charset = c;
            }
            str2 = str2 + " --data $'" + m.replace$default(buffer.readString(charset), "\n", "\\n", false, 4, (Object) null) + '\'';
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(z ? " --compressed " : " ");
        sb.append('\"');
        sb.append(request.url());
        sb.append('\"');
        String string = sb.toString();
        this.logger.log("╭--- cURL (" + request.url() + ')');
        this.logger.log(string);
        this.logger.log("╰--- (copy and paste the above line to a terminal)");
        return chain.proceed(request);
    }

    public /* synthetic */ CurlInterceptor(Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.INSTANCE.getDEFAULT() : logger);
    }
}
