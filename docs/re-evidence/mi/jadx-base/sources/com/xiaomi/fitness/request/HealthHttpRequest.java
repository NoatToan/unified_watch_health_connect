package com.xiaomi.fitness.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.data.bean.GoalMonthlyStatisticsData;
import com.xiaomi.fitness.data.bean.ThreeTargetMedalInfo;
import com.xiaomi.fitness.health.sleep.rhythm.data.ProjectKey;
import com.xiaomi.fitness.health.sleep.rhythm.data.ResearchPresignedUrlItem;
import com.xiaomi.fitness.health.sleep.rhythm.data.ResearchPresignedUrlRequest;
import com.xiaomi.fitness.health.sleep.rhythm.data.ResearchPresignedUrlResponse;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmProjectUserInfo;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmProjectUserInfoSetResult;
import com.xiaomi.fitness.health.sleep.rhythm.data.valueItem;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.request.HealthHttpRequest;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.c0j;
import defpackage.ecf;
import defpackage.h4b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b#\u0010$J=\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000b\u0010\fJS\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2(\u0010\u0012\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f`\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0016\u001a\u00020\u00072\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0015`\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0016\u0010\u0017Jg\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u001d`\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/request/HealthHttpRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/request/HealthHttpService;", "", "startTime", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/data/bean/GoalMonthlyStatisticsData;", "", "success", "", "fail", "shareMonthStatisticsData", "(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", CloudContract.COL_ZONE_OFFSET, "", "Lecf$a;", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "requestThreeTargetMedalList", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfo;", "getProjectUserInfo", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "sid", "timestamp", "url", "name", "phone_num", "", "setProjectUserInfo", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/ResearchPresignedUrlResponse;", "getSleepRhythmReportUploadUrl", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthHttpRequest.kt\ncom/xiaomi/fitness/request/HealthHttpRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,116:1\n89#2,5:117\n89#2,5:122\n89#2,5:127\n89#2,5:132\n141#2:137\n31#3:138\n28#3,2:139\n*S KotlinDebug\n*F\n+ 1 HealthHttpRequest.kt\ncom/xiaomi/fitness/request/HealthHttpRequest\n*L\n31#1:117,5\n59#1:122,5\n73#1:127,5\n96#1:132,5\n114#1:137\n114#1:138\n114#1:139,2\n*E\n"})
public final class HealthHttpRequest extends BaseRequest<HealthHttpService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.request.HealthHttpRequest$getProjectUserInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfo;", "it", "Lcom/xiaomi/fitness/request/HealthHttpService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.request.HealthHttpRequest$getProjectUserInfo$1", f = "HealthHttpRequest.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<HealthHttpService, Continuation<? super SleepRhythmProjectUserInfo>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HealthHttpService healthHttpService, Continuation<? super SleepRhythmProjectUserInfo> continuation) {
            return ((AnonymousClass1) create(healthHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthHttpService healthHttpService = (HealthHttpService) this.L$0;
                this.label = 1;
                obj = healthHttpService.getProjectUserInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.request.HealthHttpRequest$getSleepRhythmReportUploadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.request.HealthHttpRequest", f = "HealthHttpRequest.kt", i = {}, l = {114}, m = "getSleepRhythmReportUploadUrl", n = {}, s = {})
    public static final class C28681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C28681(Continuation<? super C28681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthHttpRequest.this.getSleepRhythmReportUploadUrl(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.request.HealthHttpRequest$requestThreeTargetMedalList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0006\u001a(\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/xiaomi/fitness/request/HealthHttpService;", "it", "", "Lecf$a;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lcom/xiaomi/fitness/request/HealthHttpService;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.request.HealthHttpRequest$requestThreeTargetMedalList$1", f = "HealthHttpRequest.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28691 extends SuspendLambda implements Function2<HealthHttpService, Continuation<? super List<ecf.a>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28691(String str, Continuation<? super C28691> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28691 c28691 = new C28691(this.$data, continuation);
            c28691.L$0 = obj;
            return c28691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HealthHttpService healthHttpService, Continuation<? super List<ecf.a>> continuation) {
            return ((C28691) create(healthHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ecf medalData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthHttpService healthHttpService = (HealthHttpService) this.L$0;
                String str = this.$data;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = healthHttpService.getThreeTargetMedalData(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ThreeTargetMedalInfo threeTargetMedalInfo = (ThreeTargetMedalInfo) ((BaseResult) obj).getResult();
            if (threeTargetMedalInfo == null || (medalData = threeTargetMedalInfo.getMedalData()) == null) {
                return null;
            }
            return medalData.f16485a;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.request.HealthHttpRequest$setProjectUserInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfoSetResult;", "it", "Lcom/xiaomi/fitness/request/HealthHttpService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.request.HealthHttpRequest$setProjectUserInfo$1", f = "HealthHttpRequest.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28701 extends SuspendLambda implements Function2<HealthHttpService, Continuation<? super SleepRhythmProjectUserInfoSetResult>, Object> {
        final /* synthetic */ SleepRhythmProjectUserInfo $userInfo;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28701(SleepRhythmProjectUserInfo sleepRhythmProjectUserInfo, Continuation<? super C28701> continuation) {
            super(2, continuation);
            this.$userInfo = sleepRhythmProjectUserInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28701 c28701 = new C28701(this.$userInfo, continuation);
            c28701.L$0 = obj;
            return c28701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HealthHttpService healthHttpService, Continuation<? super SleepRhythmProjectUserInfoSetResult> continuation) {
            return ((C28701) create(healthHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthHttpService healthHttpService = (HealthHttpService) this.L$0;
                String json = new Gson().toJson(this.$userInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = healthHttpService.setProjectUserInfo(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.request.HealthHttpRequest$shareMonthStatisticsData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/data/bean/GoalMonthlyStatisticsData;", "it", "Lcom/xiaomi/fitness/request/HealthHttpService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.request.HealthHttpRequest$shareMonthStatisticsData$1", f = "HealthHttpRequest.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28711 extends SuspendLambda implements Function2<HealthHttpService, Continuation<? super GoalMonthlyStatisticsData>, Object> {
        final /* synthetic */ long $startTime;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28711(long j, Continuation<? super C28711> continuation) {
            super(2, continuation);
            this.$startTime = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28711 c28711 = new C28711(this.$startTime, continuation);
            c28711.L$0 = obj;
            return c28711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HealthHttpService healthHttpService, Continuation<? super GoalMonthlyStatisticsData> continuation) {
            return ((C28711) create(healthHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthHttpService healthHttpService = (HealthHttpService) this.L$0;
                HashMap map = new HashMap();
                map.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, Boxing.boxLong(this.$startTime));
                int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                map.put("zone_offset", Boxing.boxInt(currentTZOffsetInSec));
                String strB = h4b.b(map);
                Logger.i("HealthHttpRequest shareMonthStatisticsData", "startTime:" + this.$startTime + " zoneOffset:" + currentTZOffsetInSec);
                Intrinsics.checkNotNull(strB);
                this.label = 1;
                obj = healthHttpService.shareMonthStatisticsData(strB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getProjectUserInfo$lambda$4(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        String string = AppUtil.getApp().getString(c0j.common_hint_unkonwn_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getProjectUserInfo$lambda$5(Function1 onSuccess, SleepRhythmProjectUserInfo it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(it, "it");
        onSuccess.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestThreeTargetMedalList$lambda$2(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("HealthHttpRequest requestThreeTargetMedalList", "it:" + it);
        String string = AppUtil.getApp().getString(c0j.common_hint_unkonwn_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestThreeTargetMedalList$lambda$3(Function1 onSuccess, List it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(it, "it");
        onSuccess.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setProjectUserInfo$lambda$6(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        String string = AppUtil.getApp().getString(c0j.common_hint_unkonwn_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setProjectUserInfo$lambda$7(Function1 onSuccess, SleepRhythmProjectUserInfoSetResult it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(it, "it");
        onSuccess.invoke2(Boolean.valueOf(it.getSuccess()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareMonthStatisticsData$lambda$0(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("HealthHttpRequest shareMonthStatisticsData", "it:" + it);
        String string = AppUtil.getApp().getString(c0j.common_hint_unkonwn_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fail.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareMonthStatisticsData$lambda$1(Function1 success, GoalMonthlyStatisticsData result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        success.invoke2(result);
        return Unit.INSTANCE;
    }

    public final void getProjectUserInfo(@NotNull final Function1<? super SleepRhythmProjectUserInfo, Unit> onSuccess, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(null)).error(new Function1() { // from class: wwb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.getProjectUserInfo$lambda$4(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: xwb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.getProjectUserInfo$lambda$5(onSuccess, (SleepRhythmProjectUserInfo) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSleepRhythmReportUploadUrl(@NotNull String str, long j, @NotNull Continuation<? super List<ResearchPresignedUrlResponse>> continuation) {
        C28681 c28681;
        if (continuation instanceof C28681) {
            c28681 = (C28681) continuation;
            int i = c28681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28681.label = i - Integer.MIN_VALUE;
            } else {
                c28681 = new C28681(continuation);
            }
        } else {
            c28681 = new C28681(continuation);
        }
        Object sleepRhythmReportUploadUrl = c28681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sleepRhythmReportUploadUrl);
            ResearchPresignedUrlItem researchPresignedUrlItem = new ResearchPresignedUrlItem(j);
            ArrayList arrayList = new ArrayList();
            arrayList.add(researchPresignedUrlItem);
            ResearchPresignedUrlRequest researchPresignedUrlRequest = new ResearchPresignedUrlRequest(str, 1000, "sleep_wake", "pdf", arrayList);
            HealthHttpService mService = getMService();
            String json = new Gson().toJson(researchPresignedUrlRequest);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c28681.label = 1;
            sleepRhythmReportUploadUrl = mService.getSleepRhythmReportUploadUrl(json, c28681);
            if (sleepRhythmReportUploadUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sleepRhythmReportUploadUrl);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sleepRhythmReportUploadUrl);
    }

    public final void requestThreeTargetMedalList(int zoneOffset, @NotNull final Function1<? super List<? extends ecf.a>, Unit> onSuccess, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(fail, "fail");
        HashMap map = new HashMap();
        map.put("zone_offset", Integer.valueOf(zoneOffset));
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C28691(h4b.b(map), null)).error(new Function1() { // from class: swb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.requestThreeTargetMedalList$lambda$2(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: twb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.requestThreeTargetMedalList$lambda$3(onSuccess, (List) obj);
            }
        });
    }

    public final void setProjectUserInfo(@NotNull String sid, long timestamp, @NotNull String url, @NotNull String name, @NotNull String phone_num, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone_num, "phone_num");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(fail, "fail");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(url);
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging();
        arrayList2.add(new ProjectKey(sid, 1000L, timestamp, new valueItem(arrayList)));
        LifecycleOwner lifecycleOwner = null;
        Lifecycle.Event event = null;
        CoroutineDispatcher coroutineDispatcher = null;
        new HttpFlow(new NetCoroutineScope(lifecycleOwner, event, coroutineDispatcher, 7, null), getMService(), new C28701(new SleepRhythmProjectUserInfo(name, phone_num, null, arrayList2), null)).error(new Function1() { // from class: uwb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.setProjectUserInfo$lambda$6(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: vwb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.setProjectUserInfo$lambda$7(onSuccess, (SleepRhythmProjectUserInfoSetResult) obj);
            }
        });
    }

    public final void shareMonthStatisticsData(long startTime, @NotNull final Function1<? super GoalMonthlyStatisticsData, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C28711(startTime, null)).error(new Function1() { // from class: ywb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.shareMonthStatisticsData$lambda$0(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: zwb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthHttpRequest.shareMonthStatisticsData$lambda$1(success, (GoalMonthlyStatisticsData) obj);
            }
        });
    }
}
