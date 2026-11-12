package com.xiaomi.fit.fitness.persist.server.service;

import com.xiaomi.fit.fitness.persist.server.data.FDSResultValue;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.djo;
import defpackage.kdq;
import defpackage.prk;
import defpackage.uua;
import defpackage.xfi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/service/FDSApiService;", "", "", "data", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FDSResultValue;", "getFDSUploadUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFDSDownloadUrl", "getAlgoFileUploadUrl", "url", "Lkotlinx/coroutines/flow/Flow;", "Lprk;", "Lokhttp3/ResponseBody;", "downloadRoute", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface FDSApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/service/FDSApiService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "healthapp/";

        private Companion() {
        }
    }

    @djo
    @NotNull
    @uua
    Flow<prk<ResponseBody>> downloadRoute(@kdq @NotNull String url);

    @Nullable
    @uua("algorithm/gen_file_upload_url")
    Object getAlgoFileUploadUrl(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FDSResultValue>> continuation);

    @Nullable
    @uua("service/gen_download_url")
    Object getFDSDownloadUrl(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<Map<String, FDSResultValue>>> continuation);

    @Nullable
    @uua("service/gen_upload_url")
    Object getFDSUploadUrl(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<Map<String, FDSResultValue>>> continuation);
}
