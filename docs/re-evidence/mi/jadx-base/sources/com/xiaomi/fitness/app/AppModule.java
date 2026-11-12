package com.xiaomi.fitness.app;

import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.net.HttpConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH'¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/app/AppModule;", "", "<init>", "()V", "bindCloudInterceptor", "Lokhttp3/Interceptor;", "cloudInterceptor", "Lcom/xiaomi/fitness/app/CloudInterceptor;", "bindUAInterceptor", "uaInterceptor", "Lcom/xiaomi/fitness/app/UAInterceptor;", "Companion", "fit-app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AppModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/app/AppModule$Companion;", "", "<init>", "()V", "provideHttpConfig", "Lcom/xiaomi/fitness/net/HttpConfig;", "provideAppManager", "Lcom/xiaomi/fitness/common/app/AppManager;", "fit-app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppManager provideAppManager() {
            return AppManager.INSTANCE.getInstance();
        }

        @NotNull
        public final HttpConfig provideHttpConfig() {
            HttpConfig httpConfig = new HttpConfig();
            httpConfig.setHost("https://hlth.io.mi.com/");
            httpConfig.setHttpResultHandler(new HttpResultHandlerImpl());
            return httpConfig;
        }
    }

    @NotNull
    public abstract Interceptor bindCloudInterceptor(@NotNull CloudInterceptor cloudInterceptor);

    @NotNull
    public abstract Interceptor bindUAInterceptor(@NotNull UAInterceptor uaInterceptor);
}
