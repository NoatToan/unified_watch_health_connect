package com.xiaomi.fitness.health.sleep.interfere.net;

import android.text.TextUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import dagger.hilt.android.EntryPointAccessors;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J@\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J:\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0014J.\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u0019J:\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u001d0\u0016H\u0086@¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016H\u0086@¢\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010&¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereApiService;", "<init>", "()V", "createInterferePlan", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "startDate", "", "endDate", "targetBedTime", "", "targetWakeupTime", CloudContract.COL_ZONE_OFFSET, "zoneName", "", "(JJIIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInterferePlan", "id", "status", "(JLjava/lang/Integer;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDayTasks", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "planId", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTask", DialWidgetType.DATE, "tasks", "Lkotlin/Pair;", "(JJLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepInterferePlanById", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentSleepInterferePlan", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoryInterferePlans", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlanListResult;", "next", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepInterfereRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereRequest.kt\ncom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n141#2:148\n141#2:152\n141#2:156\n141#2:162\n141#2:166\n141#2:170\n141#2:174\n31#3:149\n28#3,2:150\n31#3:153\n28#3,2:154\n31#3:157\n28#3,2:158\n31#3:163\n28#3,2:164\n31#3:167\n28#3,2:168\n31#3:171\n28#3,2:172\n31#3:175\n28#3,2:176\n1863#4,2:160\n*S KotlinDebug\n*F\n+ 1 SleepInterfereRequest.kt\ncom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest\n*L\n35#1:148\n62#1:152\n79#1:156\n104#1:162\n115#1:166\n127#1:170\n141#1:174\n35#1:149\n35#1:150,2\n62#1:153\n62#1:154,2\n79#1:157\n79#1:158,2\n104#1:163\n104#1:164,2\n115#1:167\n115#1:168,2\n127#1:171\n127#1:172,2\n141#1:175\n141#1:176,2\n97#1:160,2\n*E\n"})
public final class SleepInterfereRequest extends BaseRequest<SleepInterfereApiService> {

    @NotNull
    private static final String TAG = "SleepInterfereRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest$createInterferePlan$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest", f = "SleepInterfereRequest.kt", i = {}, l = {28}, m = "createInterferePlan", n = {}, s = {})
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
            return SleepInterfereRequest.this.createInterferePlan(0L, 0L, 0, 0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest$getCurrentSleepInterferePlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest", f = "SleepInterfereRequest.kt", i = {}, l = {125}, m = "getCurrentSleepInterferePlan", n = {}, s = {})
    public static final class C24901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24901(Continuation<? super C24901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepInterfereRequest.this.getCurrentSleepInterferePlan(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest$getDayTasks$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest", f = "SleepInterfereRequest.kt", i = {}, l = {74}, m = "getDayTasks", n = {}, s = {})
    public static final class C24911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24911(Continuation<? super C24911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepInterfereRequest.this.getDayTasks(0L, 0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest$getHistoryInterferePlans$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest", f = "SleepInterfereRequest.kt", i = {}, l = {137}, m = "getHistoryInterferePlans", n = {}, s = {})
    public static final class C24921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24921(Continuation<? super C24921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepInterfereRequest.this.getHistoryInterferePlans(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest$getSleepInterferePlanById$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest", f = "SleepInterfereRequest.kt", i = {}, l = {113}, m = "getSleepInterferePlanById", n = {}, s = {})
    public static final class C24931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24931(Continuation<? super C24931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepInterfereRequest.this.getSleepInterferePlanById(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest$updateInterferePlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest", f = "SleepInterfereRequest.kt", i = {}, l = {53}, m = "updateInterferePlan", n = {}, s = {})
    public static final class C24941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24941(Continuation<? super C24941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepInterfereRequest.this.updateInterferePlan(0L, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest$updateTask$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest", f = "SleepInterfereRequest.kt", i = {}, l = {93}, m = "updateTask", n = {}, s = {})
    public static final class C24951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24951(Continuation<? super C24951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepInterfereRequest.this.updateTask(0L, 0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object createInterferePlan(long j, long j2, int i, int i2, int i3, @NotNull String str, @NotNull Continuation<? super SleepInterferePlan> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i4 = anonymousClass1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i4 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCreateInterferePlan = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = anonymousClass1.label;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(objCreateInterferePlan);
                SleepInterfereApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("startDate", j);
                jSONObject.put("endDate", j2);
                jSONObject.put("targetBedtime", i);
                jSONObject.put("targetWakeUpTime", i2);
                jSONObject.put(CloudContract.COL_ZONE_OFFSET, i3);
                jSONObject.put("zoneName", str);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                anonymousClass1.label = 1;
                objCreateInterferePlan = mService.createInterferePlan(string, anonymousClass1);
                if (objCreateInterferePlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateInterferePlan);
            }
            return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCreateInterferePlan);
        } catch (Exception e) {
            Logger.e(TAG, "createInterferePlan exception", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCurrentSleepInterferePlan(@NotNull Continuation<? super List<SleepInterferePlan>> continuation) {
        C24901 c24901;
        if (continuation instanceof C24901) {
            c24901 = (C24901) continuation;
            int i = c24901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24901.label = i - Integer.MIN_VALUE;
            } else {
                c24901 = new C24901(continuation);
            }
        } else {
            c24901 = new C24901(continuation);
        }
        Object planList = c24901.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24901.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(planList);
                SleepInterfereApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("limit", 1);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c24901.label = 1;
                planList = mService.getPlanList(string, c24901);
                if (planList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(planList);
            }
            return ((SleepInterferePlanListResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(planList)).getPlans();
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getSleepInterferePlan:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDayTasks(long j, long j2, long j3, @NotNull Continuation<? super List<SleepInterfereDayTask>> continuation) {
        C24911 c24911;
        if (continuation instanceof C24911) {
            c24911 = (C24911) continuation;
            int i = c24911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24911.label = i - Integer.MIN_VALUE;
            } else {
                c24911 = new C24911(continuation);
            }
        } else {
            c24911 = new C24911(continuation);
        }
        Object interfereTaskList = c24911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24911.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(interfereTaskList);
                SleepInterfereApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("planId", j);
                jSONObject.put("startDate", j2);
                jSONObject.put("endDate", j3);
                jSONObject.put("limit", 21);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c24911.label = 1;
                interfereTaskList = mService.getInterfereTaskList(string, c24911);
                if (interfereTaskList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(interfereTaskList);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(interfereTaskList);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlanTaskResult");
            return ((SleepInterferePlanTaskResult) objHandleResponse).getDayTasks();
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getDayTasks exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getHistoryInterferePlans(@Nullable String str, @NotNull Continuation<? super SleepInterferePlanListResult> continuation) {
        C24921 c24921;
        if (continuation instanceof C24921) {
            c24921 = (C24921) continuation;
            int i = c24921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24921.label = i - Integer.MIN_VALUE;
            } else {
                c24921 = new C24921(continuation);
            }
        } else {
            c24921 = new C24921(continuation);
        }
        Object planList = c24921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24921.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(planList);
                SleepInterfereApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("next", str);
                }
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c24921.label = 1;
                planList = mService.getPlanList(string, c24921);
                if (planList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(planList);
            }
            return (SleepInterferePlanListResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(planList);
        } catch (Exception e) {
            Logger.e(TAG, "getHistoryInterferePlans exception", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSleepInterferePlanById(long j, @NotNull Continuation<? super SleepInterferePlan> continuation) {
        C24931 c24931;
        if (continuation instanceof C24931) {
            c24931 = (C24931) continuation;
            int i = c24931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24931.label = i - Integer.MIN_VALUE;
            } else {
                c24931 = new C24931(continuation);
            }
        } else {
            c24931 = new C24931(continuation);
        }
        Object interventionPlanById = c24931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24931.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(interventionPlanById);
                SleepInterfereApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", j);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c24931.label = 1;
                interventionPlanById = mService.getInterventionPlanById(string, c24931);
                if (interventionPlanById == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(interventionPlanById);
            }
            return (SleepInterferePlan) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(interventionPlanById);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getSleepInterferePlanById exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateInterferePlan(long j, @Nullable Integer num, @Nullable Integer num2, int i, @NotNull Continuation<? super SleepInterferePlan> continuation) {
        C24941 c24941;
        if (continuation instanceof C24941) {
            c24941 = (C24941) continuation;
            int i2 = c24941.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c24941.label = i2 - Integer.MIN_VALUE;
            } else {
                c24941 = new C24941(continuation);
            }
        } else {
            c24941 = new C24941(continuation);
        }
        Object objUpdateInterferePlan = c24941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c24941.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUpdateInterferePlan);
                SleepInterfereApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", j);
                if (num != null) {
                    jSONObject.put("targetBedtime", num.intValue());
                }
                if (num2 != null) {
                    jSONObject.put("targetWakeUpTime", num2.intValue());
                }
                jSONObject.put("status", i);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c24941.label = 1;
                objUpdateInterferePlan = mService.updateInterferePlan(string, c24941);
                if (objUpdateInterferePlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateInterferePlan);
            }
            return (SleepInterferePlan) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateInterferePlan);
        } catch (Exception e) {
            Logger.e(TAG, "updateInterferePlan", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateTask(long j, long j2, @NotNull List<Pair<String, Integer>> list, @NotNull Continuation<? super SleepInterfereDayTask> continuation) {
        C24951 c24951;
        if (continuation instanceof C24951) {
            c24951 = (C24951) continuation;
            int i = c24951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24951.label = i - Integer.MIN_VALUE;
            } else {
                c24951 = new C24951(continuation);
            }
        } else {
            c24951 = new C24951(continuation);
        }
        Object objUpdateTaskList = c24951.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24951.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateTaskList);
                SleepInterfereApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("planId", j);
                jSONObject.put(DialWidgetType.DATE, j2);
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", pair.getFirst());
                    jSONObject2.put("status", ((Number) pair.getSecond()).intValue());
                    jSONArray.put(jSONObject2);
                }
                Unit unit = Unit.INSTANCE;
                jSONObject.put("tasks", jSONArray);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c24951.label = 1;
                objUpdateTaskList = mService.updateTaskList(string, c24951);
                if (objUpdateTaskList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateTaskList);
            }
            return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateTaskList);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "completeTask exception:" + e.getMessage());
            return null;
        }
    }
}
