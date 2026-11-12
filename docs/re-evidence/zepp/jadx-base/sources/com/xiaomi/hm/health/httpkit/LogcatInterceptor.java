package com.xiaomi.hm.health.httpkit;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.nfc.web.PayHeaderKt;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger;", "a", "Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger;", "logger", "<init>", "(Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger;)V", "Logger", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class LogcatInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger;", "", "", "message", "", "log", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger$Companion;", "", "Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger;", "b", "Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger;", "getDEFAULT", "()Lcom/xiaomi/hm/health/httpkit/LogcatInterceptor$Logger;", MessengerShareContentUtility.PREVIEW_DEFAULT, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private static final Logger DEFAULT = new Logger() { // from class: com.xiaomi.hm.health.httpkit.LogcatInterceptor$Logger$Companion$DEFAULT$1
                @Override // com.xiaomi.hm.health.httpkit.LogcatInterceptor.Logger
                public void log(@NotNull String message) {
                    Timber.INSTANCE.i(message, new Object[0]);
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
    public LogcatInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LogcatInterceptor(@NotNull Logger logger) {
        this.logger = logger;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String str = request.headers().get("X-Request-Id");
        if (str == null) {
            str = "null";
        }
        HttpUrl httpUrlUrl = request.url();
        this.logger.log("Start Request URL = " + httpUrlUrl);
        this.logger.log("X-Request-Id = " + str);
        this.logger.log("x-snbps-cplc = " + request.headers().get(PayHeaderKt.HEADER_CPLC));
        long jNanoTime = System.nanoTime();
        Response responseProceed = chain.proceed(request);
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        this.logger.log("response-code = " + responseProceed.code());
        this.logger.log("response-message = " + responseProceed.message());
        this.logger.log("End Request URL = " + httpUrlUrl + " (" + millis + " ms)");
        return responseProceed;
    }

    public /* synthetic */ LogcatInterceptor(Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.INSTANCE.getDEFAULT() : logger);
    }
}
