package com.xiaomi.fitness.route.track.server;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.route.export.track.FailRoutes;
import com.xiaomi.fitness.route.export.track.RouteListResponse;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import defpackage.dlh;
import defpackage.kdq;
import defpackage.ngh;
import defpackage.pag;
import defpackage.u0a;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\"\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/route/track/server/TrackService;", "", "getUserRoutesList", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/route/export/track/RouteListResponse;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRoutesInfo", "getTrackRunningRouteUploadUrl", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;", "uploadTrackIconToFDS", "", "filePart", "Lokhttp3/MultipartBody$Part;", "url", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUserRoute", "Lcom/xiaomi/fitness/route/export/track/UploadUserRoute;", "deleteRoutes", "Lcom/xiaomi/fitness/route/export/track/FailRoutes;", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrackService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/route/track/server/TrackService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "app/v1/";

        private Companion() {
        }
    }

    @u0a
    @ngh("running_route/delete_user_routes")
    @Nullable
    Object deleteRoutes(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<FailRoutes>> continuation);

    @u0a
    @ngh("running_route/gen_upload_url")
    @Nullable
    Object getTrackRunningRouteUploadUrl(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UploadUrl>> continuation);

    @u0a
    @ngh("running_route/get_user_routes_info")
    @Nullable
    Object getUserRoutesInfo(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<RouteListResponse>> continuation);

    @u0a
    @ngh("running_route/get_user_routes_list")
    @Nullable
    Object getUserRoutesList(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<RouteListResponse>> continuation);

    @pag
    @Nullable
    Object uploadTrackIconToFDS(@dlh @NotNull MultipartBody.Part part, @kdq @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @u0a
    @ngh("running_route/upload_user_route")
    @Nullable
    Object uploadUserRoute(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UploadUserRoute>> continuation);
}
