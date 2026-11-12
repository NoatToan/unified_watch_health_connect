package com.xiaomi.fitness.health.todayhealth.service;

import com.google.gson.Gson;
import com.mi.fitness.persist.server.data.GetProjectByTimeParams;
import com.mi.fitness.persist.server.data.GetProjectByTimeResponse;
import com.mi.fitness.persist.server.data.GetProjectByWMParams;
import com.mi.fitness.persist.server.data.GetProjectByWMResponse;
import com.mi.fitness.persist.server.data.GetProjectMaxWMResponse;
import com.mi.fitness.persist.server.data.ProjectDataModel;
import com.mi.fitness.persist.server.data.UpProjectParams;
import com.mi.fitness.persist.server.data.UpProjectResponse;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0086@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001eR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckService;", "<init>", "()V", "mFitnessGson", "Lcom/google/gson/Gson;", "getMFitnessGson", "()Lcom/google/gson/Gson;", "mFitnessGson$delegate", "Lkotlin/Lazy;", "phoneId", "", "getProjectDataByWM", "Lcom/mi/fitness/persist/server/data/GetProjectByWMResponse;", "watermark", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectDataByTime", "Lcom/mi/fitness/persist/server/data/GetProjectByTimeResponse;", "params", "Lcom/mi/fitness/persist/server/data/GetProjectByTimeParams;", "(Lcom/mi/fitness/persist/server/data/GetProjectByTimeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upProjectData", "", "list", "", "Lcom/mi/fitness/persist/server/data/ProjectDataModel;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectMaxWaterMark", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthCheckRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckRequest.kt\ncom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,56:1\n141#2:57\n141#2:61\n141#2:65\n141#2:69\n31#3:58\n28#3,2:59\n31#3:62\n28#3,2:63\n31#3:66\n28#3,2:67\n31#3:70\n28#3,2:71\n*S KotlinDebug\n*F\n+ 1 HealthCheckRequest.kt\ncom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest\n*L\n32#1:57\n39#1:61\n50#1:65\n54#1:69\n32#1:58\n32#1:59,2\n39#1:62\n39#1:63,2\n50#1:66\n50#1:67,2\n54#1:70\n54#1:71,2\n*E\n"})
public final class HealthCheckRequest extends BaseRequest<HealthCheckService> {

    @NotNull
    public static final String TAG = "HealthCheckRequest";

    /* JADX INFO: renamed from: mFitnessGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: epb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthCheckRequest.mFitnessGson_delegate$lambda$0();
        }
    });

    @NotNull
    private final String phoneId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HealthCheckRequest instance = new HealthCheckRequest();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest;", "getInstance", "()Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest;", "TAG", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HealthCheckRequest getInstance() {
            return HealthCheckRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest$getProjectDataByTime$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest", f = "HealthCheckRequest.kt", i = {}, l = {39}, m = "getProjectDataByTime", n = {}, s = {})
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
            return HealthCheckRequest.this.getProjectDataByTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest$getProjectDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest", f = "HealthCheckRequest.kt", i = {}, l = {32}, m = "getProjectDataByWM", n = {}, s = {})
    public static final class C25681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C25681(Continuation<? super C25681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthCheckRequest.this.getProjectDataByWM(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest$getProjectMaxWaterMark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest", f = "HealthCheckRequest.kt", i = {}, l = {54}, m = "getProjectMaxWaterMark", n = {}, s = {})
    public static final class C25691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C25691(Continuation<? super C25691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthCheckRequest.this.getProjectMaxWaterMark(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest$upProjectData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest", f = "HealthCheckRequest.kt", i = {}, l = {50}, m = "upProjectData", n = {}, s = {})
    public static final class C25701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C25701(Continuation<? super C25701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthCheckRequest.this.upProjectData(null, this);
        }
    }

    public HealthCheckRequest() {
        String deviceID = DeviceUtil.INSTANCE.getDeviceID(AppUtil.getApp());
        this.phoneId = deviceID == null ? "" : deviceID;
    }

    private final Gson getMFitnessGson() {
        return (Gson) this.mFitnessGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mFitnessGson_delegate$lambda$0() {
        return new Gson();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProjectDataByTime(@NotNull GetProjectByTimeParams getProjectByTimeParams, @NotNull Continuation<? super GetProjectByTimeResponse> continuation) {
        AnonymousClass1 anonymousClass1;
        GetProjectByTimeResponse getProjectByTimeResponse;
        GetProjectByTimeResponse getProjectByTimeResponse2;
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
        Object projectDataByTime = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(projectDataByTime);
                String json = getMFitnessGson().toJson(getProjectByTimeParams);
                HealthCheckService mService = getMService();
                Intrinsics.checkNotNull(json);
                anonymousClass1.label = 1;
                projectDataByTime = mService.getProjectDataByTime(json, anonymousClass1);
                if (projectDataByTime == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(projectDataByTime);
            }
            getProjectByTimeResponse2 = (GetProjectByTimeResponse) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(projectDataByTime);
            try {
                Logger.i(TAG, "getProjectDataByTime result=" + getProjectByTimeResponse2);
            } catch (Exception e) {
                getProjectByTimeResponse = getProjectByTimeResponse2;
                e = e;
                Logger.i(TAG, "getProjectDataByTime error=" + e.getMessage());
                getProjectByTimeResponse2 = getProjectByTimeResponse;
            }
        } catch (Exception e2) {
            e = e2;
            getProjectByTimeResponse = null;
        }
        return getProjectByTimeResponse2 == null ? new GetProjectByTimeResponse(null, null, false) : getProjectByTimeResponse2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProjectDataByWM(long j, @NotNull Continuation<? super GetProjectByWMResponse> continuation) {
        C25681 c25681;
        if (continuation instanceof C25681) {
            c25681 = (C25681) continuation;
            int i = c25681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25681.label = i - Integer.MIN_VALUE;
            } else {
                c25681 = new C25681(continuation);
            }
        } else {
            c25681 = new C25681(continuation);
        }
        Object projectDataByWM = c25681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c25681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(projectDataByWM);
            String json = getMFitnessGson().toJson(new GetProjectByWMParams(this.phoneId, Boxing.boxLong(j), 0, 4, null));
            HealthCheckService mService = getMService();
            Intrinsics.checkNotNull(json);
            c25681.label = 1;
            projectDataByWM = mService.getProjectDataByWM(json, c25681);
            if (projectDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(projectDataByWM);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(projectDataByWM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProjectMaxWaterMark(@NotNull Continuation<? super Long> continuation) throws IOException {
        C25691 c25691;
        if (continuation instanceof C25691) {
            c25691 = (C25691) continuation;
            int i = c25691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25691.label = i - Integer.MIN_VALUE;
            } else {
                c25691 = new C25691(continuation);
            }
        } else {
            c25691 = new C25691(continuation);
        }
        Object projectMaxWaterMark = c25691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c25691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(projectMaxWaterMark);
            HealthCheckService mService = getMService();
            c25691.label = 1;
            projectMaxWaterMark = mService.getProjectMaxWaterMark(c25691);
            if (projectMaxWaterMark == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(projectMaxWaterMark);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(projectMaxWaterMark);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.mi.fitness.persist.server.data.GetProjectMaxWMResponse");
        return Boxing.boxLong(((GetProjectMaxWMResponse) objHandleResponse).getWatermark());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object upProjectData(@NotNull List<ProjectDataModel> list, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        C25701 c25701;
        if (continuation instanceof C25701) {
            c25701 = (C25701) continuation;
            int i = c25701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c25701.label = i - Integer.MIN_VALUE;
            } else {
                c25701 = new C25701(continuation);
            }
        } else {
            c25701 = new C25701(continuation);
        }
        Object objUpProjectData = c25701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c25701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpProjectData);
            String json = getMFitnessGson().toJson(new UpProjectParams(this.phoneId, list));
            HealthCheckService mService = getMService();
            Intrinsics.checkNotNull(json);
            c25701.label = 1;
            objUpProjectData = mService.upProjectData(json, c25701);
            if (objUpProjectData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpProjectData);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpProjectData);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.mi.fitness.persist.server.data.UpProjectResponse");
        return Boxing.boxBoolean(((UpProjectResponse) objHandleResponse).getSuccess());
    }
}
