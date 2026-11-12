package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/sos/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionApiService;", "", "getMapUrl", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionGetMapUrlResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportPosition", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionReportPositionResult;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FallDetectionApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String FALL_DETECTION_REQUEST_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String FALL_DETECTION_REQUEST_PATH = "app/v1/sos/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionApiService$Companion;", "", "<init>", "()V", "FALL_DETECTION_REQUEST_HOST", "", "FALL_DETECTION_REQUEST_PATH", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String FALL_DETECTION_REQUEST_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String FALL_DETECTION_REQUEST_PATH = "app/v1/sos/";

        private Companion() {
        }
    }

    @Nullable
    @uua("get_message_url")
    Object getMapUrl(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FallDetectionGetMapUrlResult>> continuation);

    @u0a
    @ngh("location_report")
    @Nullable
    Object reportPosition(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<FallDetectionReportPositionResult>> continuation);
}
