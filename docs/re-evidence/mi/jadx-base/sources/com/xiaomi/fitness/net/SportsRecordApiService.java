package com.xiaomi.fitness.net;

import com.xiaomi.fitness.detail.data.SportShareRes;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.uua;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "cgi-op/api/v1/miwear/")
@Secret(pathPrefix = "cgi-op/api/v1/miwear/", sid = "miothealth")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/net/SportsRecordApiService;", "", "getSportShareConfig", "Lcom/xiaomi/fitness/net/SportShareResResult;", "Lcom/xiaomi/fitness/detail/data/SportShareRes;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportsRecordApiService {

    @NotNull
    public static final String BASE_HOST = "watch.iot.mi.com";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEALTH_HOST = "https://watch.iot.mi.com/";

    @NotNull
    public static final String HEALTH_PATH = "cgi-op/api/v1/miwear/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/net/SportsRecordApiService$Companion;", "", "<init>", "()V", "BASE_HOST", "", "HEALTH_PATH", "HEALTH_HOST", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String BASE_HOST = "watch.iot.mi.com";

        @NotNull
        public static final String HEALTH_HOST = "https://watch.iot.mi.com/";

        @NotNull
        public static final String HEALTH_PATH = "cgi-op/api/v1/miwear/";

        private Companion() {
        }
    }

    @Nullable
    @uua("sportShareConfig")
    Object getSportShareConfig(@NotNull Continuation<? super SportShareResResult<SportShareRes>> continuation);
}
