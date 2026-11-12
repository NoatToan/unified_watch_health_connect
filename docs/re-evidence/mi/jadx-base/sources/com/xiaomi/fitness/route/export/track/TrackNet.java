package com.xiaomi.fitness.route.export.track;

import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u0000 B2\u00020\u0001:\u0001BJ<\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tH¦@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H¦@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H¦@¢\u0006\u0002\u0010!JP\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00072\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070&j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0002\u0010(J\u001e\u0010)\u001a\u0004\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070,H¦@¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H&J\u001b\u00100\u001a\u00020/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H&¢\u0006\u0002\u00102J.\u00103\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u00010\u00072\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020\tH&JG\u00108\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020:\u0018\u0001092\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@H&¢\u0006\u0002\u0010A¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/TrackNet;", "", "getUserRoutesList", "Lcom/xiaomi/fitness/route/export/track/RouteListResponse;", "startTime", "", "nextKey", "", "limit", "", "reverse", "", "originType", "(JLjava/lang/String;IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRoutesInfo", MyTrackLibraryActivity.ROUTE_IDS, "", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouteUploadUrl", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;", "time", "routeId", "routeType", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadRouteToFds", "Lcom/xiaomi/fitness/route/export/track/FdsResult;", "url", "file", "Ljava/io/File;", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadIconToFds", "byteArray", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUserRoute", "Lcom/xiaomi/fitness/route/export/track/UploadUserRoute;", "value", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "strategyId", "(JLjava/lang/String;Ljava/util/HashMap;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserRoutes", "Lcom/xiaomi/fitness/route/export/track/FailRoutes;", "routeIds", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goTrackLibraryPageDefault", "", "goTrackLibraryPage", "routerIds", "([Ljava/lang/String;)V", "goTrackDetailPage", "suffix", "fileUrl", "Ljava/io/Serializable;", "fromPage", "getRecorder", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "name", "filepath", "fileExtension", "fileMD5", StepsInfo.KEY_DISTANCE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lkotlin/Pair;", "Companion", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrackNet {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/TrackNet$Companion;", "", "<init>", "()V", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Pair getRecorder$default(TrackNet trackNet, String str, String str2, String str3, String str4, Double d, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecorder");
            }
            if ((i & 16) != 0) {
                d = null;
            }
            return trackNet.getRecorder(str, str2, str3, str4, d);
        }

        public static /* synthetic */ Object getRunningRouteUploadUrl$default(TrackNet trackNet, long j, String str, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRunningRouteUploadUrl");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return trackNet.getRunningRouteUploadUrl(j, str, i, continuation);
        }

        public static /* synthetic */ Object getUserRoutesList$default(TrackNet trackNet, long j, String str, int i, boolean z, int i2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return trackNet.getUserRoutesList(j, str, i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? 0 : i2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserRoutesList");
        }

        public static /* synthetic */ Object uploadUserRoute$default(TrackNet trackNet, long j, String str, HashMap map, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadUserRoute");
            }
            if ((i & 8) != 0) {
                num = null;
            }
            return trackNet.uploadUserRoute(j, str, map, num, continuation);
        }
    }

    @Nullable
    Object deleteUserRoutes(@NotNull List<String> list, @NotNull Continuation<? super FailRoutes> continuation);

    @Nullable
    Pair<byte[], Recorder> getRecorder(@NotNull String name, @NotNull String filepath, @NotNull String fileExtension, @NotNull String fileMD5, @Nullable Double dis);

    @Nullable
    Object getRunningRouteUploadUrl(long j, @NotNull String str, int i, @NotNull Continuation<? super UploadUrl> continuation);

    @Nullable
    Object getUserRoutesInfo(@NotNull String[] strArr, @NotNull Continuation<? super RouteListResponse> continuation);

    @Nullable
    Object getUserRoutesList(long j, @NotNull String str, int i, boolean z, int i2, @NotNull Continuation<? super RouteListResponse> continuation);

    void goTrackDetailPage(@Nullable String suffix, @Nullable String fileUrl, @Nullable Serializable value, int fromPage);

    void goTrackLibraryPage(@NotNull String[] routerIds);

    void goTrackLibraryPageDefault();

    @Nullable
    Object uploadIconToFds(@NotNull String str, @NotNull byte[] bArr, @NotNull Continuation<? super FdsResult> continuation);

    @Nullable
    Object uploadRouteToFds(@NotNull String str, @NotNull java.io.File file, @NotNull Continuation<? super FdsResult> continuation);

    @Nullable
    Object uploadUserRoute(long j, @NotNull String str, @NotNull HashMap<String, String> map, @Nullable Integer num, @NotNull Continuation<? super UploadUserRoute> continuation);
}
