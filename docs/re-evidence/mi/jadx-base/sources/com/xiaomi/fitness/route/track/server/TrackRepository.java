package com.xiaomi.fitness.route.track.server;

import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fit.fitness.parser.sport.track.parser.WayPointData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.route.export.track.FailRoutes;
import com.xiaomi.fitness.route.export.track.FdsResult;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.RouteListResponse;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import com.xiaomi.fitness.route.track.TrackDataManager;
import com.xiaomi.fitness.route.track.utils.TrackFDSUploader;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivityKt;
import com.xiaomi.fitness.route.track.view.TrackDetailActivityKt;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018H\u0096@¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)JN\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u000f2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0.j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`-2\b\u0010/\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u00100J\u001e\u00101\u001a\u0004\u0018\u0001022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f04H\u0096@¢\u0006\u0002\u00105J\u001b\u00106\u001a\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018H\u0016¢\u0006\u0002\u00109J\b\u0010:\u001a\u000207H\u0016J.\u0010;\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010\u000f2\b\u0010=\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\u0011H\u0016JE\u0010@\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020B\u0018\u00010A2\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0002\u0010IR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/route/track/server/TrackRepository;", "Lcom/xiaomi/fitness/route/export/track/TrackNet;", "<init>", "()V", "trackRequest", "Lcom/xiaomi/fitness/route/track/server/TrackRequest;", "getTrackRequest", "()Lcom/xiaomi/fitness/route/track/server/TrackRequest;", "setTrackRequest", "(Lcom/xiaomi/fitness/route/track/server/TrackRequest;)V", "getUserRoutesList", "Lcom/xiaomi/fitness/route/export/track/RouteListResponse;", "startTime", "", "nextKey", "", "limit", "", "reverse", "", "originType", "(JLjava/lang/String;IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRoutesInfo", MyTrackLibraryActivity.ROUTE_IDS, "", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouteUploadUrl", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;", "time", "routeId", "routeType", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadRouteToFds", "Lcom/xiaomi/fitness/route/export/track/FdsResult;", "url", "file", "Ljava/io/File;", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadIconToFds", "byteArray", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUserRoute", "Lcom/xiaomi/fitness/route/export/track/UploadUserRoute;", "value", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "strategyId", "(JLjava/lang/String;Ljava/util/HashMap;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserRoutes", "Lcom/xiaomi/fitness/route/export/track/FailRoutes;", "routeIds", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goTrackLibraryPage", "", "routerIds", "([Ljava/lang/String;)V", "goTrackLibraryPageDefault", "goTrackDetailPage", "suffix", "fileUrl", "Ljava/io/Serializable;", "fromPage", "getRecorder", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "name", "filepath", "fileExtension", "fileMD5", StepsInfo.KEY_DISTANCE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lkotlin/Pair;", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackRepository implements TrackNet {

    @NotNull
    public static final String TAG = "TrackRepository";
    public TrackRequest trackRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRepository$deleteUserRoutes$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRepository", f = "TrackRepository.kt", i = {}, l = {106}, m = "deleteUserRoutes", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRepository.this.deleteUserRoutes(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRepository$getRunningRouteUploadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRepository", f = "TrackRepository.kt", i = {}, l = {68}, m = "getRunningRouteUploadUrl", n = {}, s = {})
    public static final class C28961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28961(Continuation<? super C28961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRepository.this.getRunningRouteUploadUrl(0L, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRepository$getUserRoutesInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRepository", f = "TrackRepository.kt", i = {}, l = {53}, m = "getUserRoutesInfo", n = {}, s = {})
    public static final class C28971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28971(Continuation<? super C28971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRepository.this.getUserRoutesInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRepository$getUserRoutesList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRepository", f = "TrackRepository.kt", i = {}, l = {40}, m = "getUserRoutesList", n = {}, s = {})
    public static final class C28981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28981(Continuation<? super C28981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRepository.this.getUserRoutesList(0L, null, 0, false, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRepository$uploadUserRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRepository", f = "TrackRepository.kt", i = {}, l = {93}, m = "uploadUserRoute", n = {}, s = {})
    public static final class C28991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28991(Continuation<? super C28991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRepository.this.uploadUserRoute(0L, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Object deleteUserRoutes(@NotNull List<String> list, @NotNull Continuation<? super FailRoutes> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objDeleteRoutes = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        FailRoutes failRoutes = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDeleteRoutes);
                TrackRequest trackRequest = getTrackRequest();
                anonymousClass1.label = 1;
                objDeleteRoutes = trackRequest.deleteRoutes(list, anonymousClass1);
                if (objDeleteRoutes == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDeleteRoutes);
            }
            FailRoutes failRoutes2 = (FailRoutes) objDeleteRoutes;
            try {
                Logger.i(TAG, "deleteUserRoutes result=" + failRoutes2);
                return failRoutes2;
            } catch (Exception e) {
                e = e;
                failRoutes = failRoutes2;
                Logger.i(TAG, "deleteUserRoutes failed. err=" + e);
                return failRoutes;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Pair<byte[], Recorder> getRecorder(@NotNull String name, @NotNull String filepath, @NotNull String fileExtension, @NotNull String fileMD5, @Nullable Double dis) {
        Double d;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(filepath, "filepath");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        Intrinsics.checkNotNullParameter(fileMD5, "fileMD5");
        Triple trackFile$default = ParserHelper.readTrackFile$default(ParserHelper.INSTANCE, filepath, null, fileExtension, 2, null);
        TrackDataManager trackDataManager = TrackDataManager.INSTANCE;
        List<CommonTrackData> list = (List) trackFile$default.getFirst();
        List<WayPointData> list2 = (List) trackFile$default.getSecond();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = fileExtension.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (dis == null) {
            Triple triple = (Triple) trackFile$default.getThird();
            d = triple != null ? (Double) triple.getFirst() : null;
        } else {
            d = dis;
        }
        Triple triple2 = (Triple) trackFile$default.getThird();
        Double d2 = triple2 != null ? (Double) triple2.getSecond() : null;
        Triple triple3 = (Triple) trackFile$default.getThird();
        return trackDataManager.recorder(list, list2, fileMD5, name, filepath, upperCase, d, d2, triple3 != null ? (Double) triple3.getThird() : null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Object getRunningRouteUploadUrl(long j, @NotNull String str, int i, @NotNull Continuation<? super UploadUrl> continuation) {
        C28961 c28961;
        if (continuation instanceof C28961) {
            c28961 = (C28961) continuation;
            int i2 = c28961.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28961.label = i2 - Integer.MIN_VALUE;
            } else {
                c28961 = new C28961(continuation);
            }
        } else {
            c28961 = new C28961(continuation);
        }
        C28961 c28962 = c28961;
        Object runningRouteUploadUrl = c28962.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28962.label;
        UploadUrl uploadUrl = null;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(runningRouteUploadUrl);
                TrackRequest trackRequest = getTrackRequest();
                c28962.label = 1;
                runningRouteUploadUrl = trackRequest.getRunningRouteUploadUrl(j, str, i, c28962);
                if (runningRouteUploadUrl == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(runningRouteUploadUrl);
            }
            UploadUrl uploadUrl2 = (UploadUrl) runningRouteUploadUrl;
            try {
                Logger.i(TAG, "getRunningRouteUploadUrl result=" + uploadUrl2);
                return uploadUrl2;
            } catch (Exception e) {
                e = e;
                uploadUrl = uploadUrl2;
                Logger.i(TAG, "getRunningRouteUploadUrl failed. err=" + e);
                return uploadUrl;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @NotNull
    public final TrackRequest getTrackRequest() {
        TrackRequest trackRequest = this.trackRequest;
        if (trackRequest != null) {
            return trackRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trackRequest");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Object getUserRoutesInfo(@NotNull String[] strArr, @NotNull Continuation<? super RouteListResponse> continuation) {
        C28971 c28971;
        if (continuation instanceof C28971) {
            c28971 = (C28971) continuation;
            int i = c28971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28971.label = i - Integer.MIN_VALUE;
            } else {
                c28971 = new C28971(continuation);
            }
        } else {
            c28971 = new C28971(continuation);
        }
        Object userRoutesInfo = c28971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28971.label;
        RouteListResponse routeListResponse = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(userRoutesInfo);
                TrackRequest trackRequest = getTrackRequest();
                c28971.label = 1;
                userRoutesInfo = trackRequest.getUserRoutesInfo(strArr, c28971);
                if (userRoutesInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(userRoutesInfo);
            }
            RouteListResponse routeListResponse2 = (RouteListResponse) userRoutesInfo;
            try {
                Logger.i(TAG, "getUserRoutesInfo result=" + routeListResponse2);
                return routeListResponse2;
            } catch (Exception e) {
                e = e;
                routeListResponse = routeListResponse2;
                Logger.i(TAG, "getUserRoutesInfo failed. err=" + e);
                return routeListResponse;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Object getUserRoutesList(long j, @NotNull String str, int i, boolean z, int i2, @NotNull Continuation<? super RouteListResponse> continuation) {
        C28981 c28981;
        if (continuation instanceof C28981) {
            c28981 = (C28981) continuation;
            int i3 = c28981.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c28981.label = i3 - Integer.MIN_VALUE;
            } else {
                c28981 = new C28981(continuation);
            }
        } else {
            c28981 = new C28981(continuation);
        }
        C28981 c28982 = c28981;
        Object userRoutesList = c28982.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c28982.label;
        RouteListResponse routeListResponse = null;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(userRoutesList);
                TrackRequest trackRequest = getTrackRequest();
                c28982.label = 1;
                userRoutesList = trackRequest.getUserRoutesList(j, str, i, z, i2, c28982);
                if (userRoutesList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(userRoutesList);
            }
            RouteListResponse routeListResponse2 = (RouteListResponse) userRoutesList;
            try {
                Logger.i(TAG, "getUserRoutesList result=" + routeListResponse2);
                return routeListResponse2;
            } catch (Exception e) {
                e = e;
                routeListResponse = routeListResponse2;
                Logger.i(TAG, "getUserRoutesList failed. err=" + e);
                return routeListResponse;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    public void goTrackDetailPage(@Nullable String suffix, @Nullable String fileUrl, @Nullable Serializable value, int fromPage) {
        TrackDetailActivityKt.startTrackDetailActivity(suffix, fileUrl, value, fromPage);
    }

    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    public void goTrackLibraryPage(@NotNull String[] routerIds) {
        Intrinsics.checkNotNullParameter(routerIds, "routerIds");
        MyTrackLibraryActivityKt.startTrackLibraryActivity(routerIds);
    }

    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    public void goTrackLibraryPageDefault() {
        MyTrackLibraryActivityKt.startTrackLibraryActivity();
    }

    public final void setTrackRequest(@NotNull TrackRequest trackRequest) {
        Intrinsics.checkNotNullParameter(trackRequest, "<set-?>");
        this.trackRequest = trackRequest;
    }

    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Object uploadIconToFds(@NotNull String str, @NotNull byte[] bArr, @NotNull Continuation<? super FdsResult> continuation) {
        return TrackFDSUploader.INSTANCE.getInstance().upload(str, bArr, continuation);
    }

    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Object uploadRouteToFds(@NotNull String str, @NotNull File file, @NotNull Continuation<? super FdsResult> continuation) {
        return TrackFDSUploader.INSTANCE.getInstance().upload(str, file, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fitness.route.export.track.TrackNet
    @Nullable
    public Object uploadUserRoute(long j, @NotNull String str, @NotNull HashMap<String, String> map, @Nullable Integer num, @NotNull Continuation<? super UploadUserRoute> continuation) {
        C28991 c28991;
        if (continuation instanceof C28991) {
            c28991 = (C28991) continuation;
            int i = c28991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28991.label = i - Integer.MIN_VALUE;
            } else {
                c28991 = new C28991(continuation);
            }
        } else {
            c28991 = new C28991(continuation);
        }
        C28991 c28992 = c28991;
        Object objUploadUserRoute = c28992.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28992.label;
        UploadUserRoute uploadUserRoute = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUploadUserRoute);
                TrackRequest trackRequest = getTrackRequest();
                c28992.label = 1;
                objUploadUserRoute = trackRequest.uploadUserRoute(j, str, map, num, c28992);
                if (objUploadUserRoute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUploadUserRoute);
            }
            UploadUserRoute uploadUserRoute2 = (UploadUserRoute) objUploadUserRoute;
            try {
                Logger.i(TAG, "uploadUserRoute result=" + uploadUserRoute2);
                return uploadUserRoute2;
            } catch (Exception e) {
                e = e;
                uploadUserRoute = uploadUserRoute2;
                Logger.i(TAG, "uploadUserRoute failed. err=" + e);
                return uploadUserRoute;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
