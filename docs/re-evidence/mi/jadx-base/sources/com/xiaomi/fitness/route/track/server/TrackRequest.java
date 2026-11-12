package com.xiaomi.fitness.route.track.server;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.route.export.track.FailRoutes;
import com.xiaomi.fitness.route.export.track.RouteListResponse;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import dagger.hilt.android.EntryPointAccessors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0086@¢\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0086@¢\u0006\u0002\u0010!JN\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\f2\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0&j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0,H\u0086@¢\u0006\u0002\u0010-R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/route/track/server/TrackRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/route/track/server/TrackService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getUserRoutesList", "Lcom/xiaomi/fitness/route/export/track/RouteListResponse;", "startTime", "", "nextKey", "", "limit", "", "reverse", "", "originType", "(JLjava/lang/String;IZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRoutesInfo", MyTrackLibraryActivity.ROUTE_IDS, "", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningRouteUploadUrl", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;", "time", "routeId", "routeType", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadTrackIconToFDS", "filePart", "Lokhttp3/MultipartBody$Part;", "url", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUserRoute", "Lcom/xiaomi/fitness/route/export/track/UploadUserRoute;", "value", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "strategyId", "(JLjava/lang/String;Ljava/util/HashMap;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoutes", "Lcom/xiaomi/fitness/route/export/track/FailRoutes;", "routeIds", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackRequest.kt\ncom/xiaomi/fitness/route/track/server/TrackRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n141#2:95\n141#2:99\n141#2:103\n141#2:107\n141#2:112\n141#2:116\n31#3:96\n28#3,2:97\n31#3:100\n28#3,2:101\n31#3:104\n28#3,2:105\n31#3:108\n28#3,2:109\n31#3:113\n28#3,2:114\n31#3:117\n28#3,2:118\n1#4:111\n*S KotlinDebug\n*F\n+ 1 TrackRequest.kt\ncom/xiaomi/fitness/route/track/server/TrackRequest\n*L\n41#1:95\n51#1:99\n65#1:103\n72#1:107\n86#1:112\n92#1:116\n41#1:96\n41#1:97,2\n51#1:100\n51#1:101,2\n65#1:104\n65#1:105,2\n72#1:108\n72#1:109,2\n86#1:113\n86#1:114,2\n92#1:117\n92#1:118,2\n*E\n"})
public final class TrackRequest extends BaseRequest<TrackService> {

    @NotNull
    public static final String KEY_ROUTE_ID = "route_id";

    @NotNull
    public static final String KEY_TIME = "time";

    @NotNull
    public static final String TAG = "TrackRequest";

    @NotNull
    private final Gson gson = new Gson();

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRequest$deleteRoutes$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRequest", f = "TrackRequest.kt", i = {}, l = {92}, m = "deleteRoutes", n = {}, s = {})
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
            return TrackRequest.this.deleteRoutes(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRequest$getRunningRouteUploadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRequest", f = "TrackRequest.kt", i = {}, l = {65}, m = "getRunningRouteUploadUrl", n = {}, s = {})
    public static final class C29001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29001(Continuation<? super C29001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRequest.this.getRunningRouteUploadUrl(0L, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRequest$getUserRoutesInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRequest", f = "TrackRequest.kt", i = {}, l = {51}, m = "getUserRoutesInfo", n = {}, s = {})
    public static final class C29011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29011(Continuation<? super C29011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRequest.this.getUserRoutesInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRequest$getUserRoutesList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRequest", f = "TrackRequest.kt", i = {}, l = {41}, m = "getUserRoutesList", n = {}, s = {})
    public static final class C29021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29021(Continuation<? super C29021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRequest.this.getUserRoutesList(0L, null, 0, false, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRequest$uploadTrackIconToFDS$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRequest", f = "TrackRequest.kt", i = {}, l = {72}, m = "uploadTrackIconToFDS", n = {}, s = {})
    public static final class C29031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29031(Continuation<? super C29031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRequest.this.uploadTrackIconToFDS(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.server.TrackRequest$uploadUserRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.server.TrackRequest", f = "TrackRequest.kt", i = {}, l = {86}, m = "uploadUserRoute", n = {}, s = {})
    public static final class C29041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29041(Continuation<? super C29041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackRequest.this.uploadUserRoute(0L, null, null, null, this);
        }
    }

    public static /* synthetic */ Object getRunningRouteUploadUrl$default(TrackRequest trackRequest, long j, String str, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return trackRequest.getRunningRouteUploadUrl(j, str, i, continuation);
    }

    public static /* synthetic */ Object uploadUserRoute$default(TrackRequest trackRequest, long j, String str, HashMap map, Integer num, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        return trackRequest.uploadUserRoute(j, str, map, num, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteRoutes(@NotNull List<String> list, @NotNull Continuation<? super FailRoutes> continuation) {
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
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteRoutes);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(MyTrackLibraryActivity.ROUTE_IDS, list);
            TrackService mService = getMService();
            String json = this.gson.toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass1.label = 1;
            objDeleteRoutes = mService.deleteRoutes(json, anonymousClass1);
            if (objDeleteRoutes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteRoutes);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDeleteRoutes);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRunningRouteUploadUrl(long j, @NotNull String str, int i, @NotNull Continuation<? super UploadUrl> continuation) {
        C29001 c29001;
        if (continuation instanceof C29001) {
            c29001 = (C29001) continuation;
            int i2 = c29001.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29001.label = i2 - Integer.MIN_VALUE;
            } else {
                c29001 = new C29001(continuation);
            }
        } else {
            c29001 = new C29001(continuation);
        }
        Object trackRunningRouteUploadUrl = c29001.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29001.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(trackRunningRouteUploadUrl);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("time", Boxing.boxLong(j));
            linkedHashMap.put("route_id", str);
            linkedHashMap.put(RouteRequest.KEY_ROUTE_TYPE, Boxing.boxInt(i));
            String json = this.gson.toJson(linkedHashMap);
            FitnessLogUtils.d(TAG, "getRunningRouteUploadUrl , data:" + json);
            TrackService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29001.label = 1;
            trackRunningRouteUploadUrl = mService.getTrackRunningRouteUploadUrl(json, c29001);
            if (trackRunningRouteUploadUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(trackRunningRouteUploadUrl);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(trackRunningRouteUploadUrl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUserRoutesInfo(@NotNull String[] strArr, @NotNull Continuation<? super RouteListResponse> continuation) {
        C29011 c29011;
        if (continuation instanceof C29011) {
            c29011 = (C29011) continuation;
            int i = c29011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29011.label = i - Integer.MIN_VALUE;
            } else {
                c29011 = new C29011(continuation);
            }
        } else {
            c29011 = new C29011(continuation);
        }
        Object userRoutesInfo = c29011.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(userRoutesInfo);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(MyTrackLibraryActivity.ROUTE_IDS, strArr);
            String json = this.gson.toJson(linkedHashMap);
            FitnessLogUtils.d(TAG, "getUserRoutesInfo , data:" + json);
            TrackService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29011.label = 1;
            userRoutesInfo = mService.getUserRoutesInfo(json, c29011);
            if (userRoutesInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(userRoutesInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(userRoutesInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUserRoutesList(long j, @NotNull String str, int i, boolean z, int i2, @NotNull Continuation<? super RouteListResponse> continuation) {
        C29021 c29021;
        if (continuation instanceof C29021) {
            c29021 = (C29021) continuation;
            int i3 = c29021.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29021.label = i3 - Integer.MIN_VALUE;
            } else {
                c29021 = new C29021(continuation);
            }
        } else {
            c29021 = new C29021(continuation);
        }
        Object userRoutesList = c29021.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29021.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(userRoutesList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, Boxing.boxLong(j));
            linkedHashMap.put(RouteRequest.KEY_NEXT_KEY, str);
            linkedHashMap.put("limit", Boxing.boxInt(i));
            linkedHashMap.put("reverse", Boxing.boxBoolean(z));
            linkedHashMap.put("origin_type", Boxing.boxInt(i2));
            String json = this.gson.toJson(linkedHashMap);
            FitnessLogUtils.d(TAG, "getUserRoutesList , data:" + json);
            TrackService mService = getMService();
            Intrinsics.checkNotNull(json);
            c29021.label = 1;
            userRoutesList = mService.getUserRoutesList(json, c29021);
            if (userRoutesList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(userRoutesList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(userRoutesList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadTrackIconToFDS(@NotNull MultipartBody.Part part, @NotNull String str, @NotNull Continuation<? super UploadUrl> continuation) {
        C29031 c29031;
        if (continuation instanceof C29031) {
            c29031 = (C29031) continuation;
            int i = c29031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29031.label = i - Integer.MIN_VALUE;
            } else {
                c29031 = new C29031(continuation);
            }
        } else {
            c29031 = new C29031(continuation);
        }
        Object obj = c29031.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            TrackService mService = getMService();
            c29031.label = 1;
            if (mService.uploadTrackIconToFDS(part, str, c29031) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadUserRoute(long j, @NotNull String str, @NotNull HashMap<String, String> map, @Nullable Integer num, @NotNull Continuation<? super UploadUserRoute> continuation) {
        C29041 c29041;
        if (continuation instanceof C29041) {
            c29041 = (C29041) continuation;
            int i = c29041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29041.label = i - Integer.MIN_VALUE;
            } else {
                c29041 = new C29041(continuation);
            }
        } else {
            c29041 = new C29041(continuation);
        }
        Object objUploadUserRoute = c29041.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadUserRoute);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("time", Boxing.boxLong(j));
            linkedHashMap.put("route_id", str);
            linkedHashMap.put("value", this.gson.toJson(map));
            if (num != null) {
                linkedHashMap.put("strategy_id", Boxing.boxInt(num.intValue()));
            }
            TrackService mService = getMService();
            String json = this.gson.toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c29041.label = 1;
            objUploadUserRoute = mService.uploadUserRoute(json, c29041);
            if (objUploadUserRoute == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadUserRoute);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUploadUserRoute);
    }
}
