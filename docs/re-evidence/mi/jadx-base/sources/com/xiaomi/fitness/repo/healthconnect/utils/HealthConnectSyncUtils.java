package com.xiaomi.fitness.repo.healthconnect.utils;

import android.app.Application;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.StepsRecord;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.CalorieSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.HrSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.SleepSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.Spo2SyncBiz;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.StepSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020&2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)J\u000e\u0010*\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u000e\u0010.\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u000e\u0010/\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u000e\u00100\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectSyncUtils;", "", "<init>", "()V", "TAG", "", "stepBiz", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/StepSyncBiz;", "getStepBiz", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/StepSyncBiz;", "stepBiz$delegate", "Lkotlin/Lazy;", "hrBiz", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/HrSyncBiz;", "getHrBiz", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/HrSyncBiz;", "hrBiz$delegate", "calorieBiz", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/CalorieSyncBiz;", "getCalorieBiz", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/CalorieSyncBiz;", "calorieBiz$delegate", "spo2Biz", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/Spo2SyncBiz;", "getSpo2Biz", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/Spo2SyncBiz;", "spo2Biz$delegate", "sleepBiz", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/SleepSyncBiz;", "getSleepBiz", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/SleepSyncBiz;", "sleepBiz$delegate", "sportBiz", "Lcom/xiaomi/fitness/repo/healthconnect/biz/sport/SportSyncBiz;", "getSportBiz", "()Lcom/xiaomi/fitness/repo/healthconnect/biz/sport/SportSyncBiz;", "sportBiz$delegate", "syncReport", "", "syncDailyRecords", "types", "", "syncStepRecordIfNeeded", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncHeartRecordIfNeeded", "syncCaloriesRecordIfNeeded", "syncSpo2RecordIfNeeded", "syncSleepSegmentIfNeeded", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectSyncUtils {

    @NotNull
    private static final String TAG = "HealthConnectSyncUtils";

    @NotNull
    public static final HealthConnectSyncUtils INSTANCE = new HealthConnectSyncUtils();

    /* JADX INFO: renamed from: stepBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy stepBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: asb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthConnectSyncUtils.stepBiz_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: hrBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy hrBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bsb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthConnectSyncUtils.hrBiz_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: calorieBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy calorieBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: csb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthConnectSyncUtils.calorieBiz_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: spo2Biz$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy spo2Biz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dsb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthConnectSyncUtils.spo2Biz_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: sleepBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy sleepBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: esb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthConnectSyncUtils.sleepBiz_delegate$lambda$4();
        }
    });

    /* JADX INFO: renamed from: sportBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy sportBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fsb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HealthConnectSyncUtils.sportBiz_delegate$lambda$5();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncCaloriesRecordIfNeeded$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils", f = "HealthConnectSyncUtils.kt", i = {0}, l = {139, 141}, m = "syncCaloriesRecordIfNeeded", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return HealthConnectSyncUtils.this.syncCaloriesRecordIfNeeded(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncDailyRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncDailyRecords$1", f = "HealthConnectSyncUtils.kt", i = {0, 1, 2, 3, 4}, l = {65, 72, 79, 87, 95}, m = "invokeSuspend", n = {"failureSet", "failureSet", "failureSet", "failureSet", "failureSet"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class C28201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $types;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28201(List<String> list, Continuation<? super C28201> continuation) {
            super(2, continuation);
            this.$types = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28201(this.$types, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008b  */
        /* JADX WARN: Code duplicated, block: B:28:0x009c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:40:0x00cd A[PHI: r1
          0x00cd: PHI (r1v6 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v7 java.util.ArrayList), (r1v7 java.util.ArrayList) binds: [B:33:0x00ae, B:38:0x00c8, B:39:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[PHI: r1
          0x00f2: PHI (r1v8 java.util.ArrayList) = (r1v6 java.util.ArrayList), (r1v9 java.util.ArrayList), (r1v9 java.util.ArrayList) binds: [B:41:0x00d3, B:46:0x00ed, B:47:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:52:0x010b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x010c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0115  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                arrayList = new ArrayList();
                if (!this.$types.contains("step")) {
                    if (!this.$types.contains("hr")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync hr");
                        HealthConnectSyncUtils healthConnectSyncUtils = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 2;
                        obj = healthConnectSyncUtils.syncHeartRecordIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            arrayList.add("hr");
                        }
                    }
                    if (this.$types.contains("sleep")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync sleep");
                        HealthConnectSyncUtils healthConnectSyncUtils2 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 4;
                        obj = healthConnectSyncUtils2.syncSleepSegmentIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            arrayList.add("sleep");
                        }
                        if (this.$types.contains("calorie")) {
                            Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                            HealthConnectSyncUtils healthConnectSyncUtils3 = HealthConnectSyncUtils.INSTANCE;
                            this.L$0 = arrayList;
                            this.label = 5;
                            obj = healthConnectSyncUtils3.syncCaloriesRecordIfNeeded(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            arrayList2 = arrayList;
                            if (!((Boolean) obj).booleanValue()) {
                                arrayList2.add("calorie");
                            }
                            arrayList = arrayList2;
                        }
                    } else if (this.$types.contains("calorie")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                        HealthConnectSyncUtils healthConnectSyncUtils4 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 5;
                        obj = healthConnectSyncUtils4.syncCaloriesRecordIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arrayList2 = arrayList;
                        if (!((Boolean) obj).booleanValue()) {
                            arrayList2.add("calorie");
                        }
                        arrayList = arrayList2;
                    }
                    Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                    return Unit.INSTANCE;
                }
                Logger.d(HealthConnectSyncUtils.TAG, "sync step");
                HealthConnectSyncUtils healthConnectSyncUtils5 = HealthConnectSyncUtils.INSTANCE;
                this.L$0 = arrayList;
                this.label = 1;
                obj = healthConnectSyncUtils5.syncStepRecordIfNeeded(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (this.$types.contains("spo2")) {
                    if (this.$types.contains("sleep")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync sleep");
                        HealthConnectSyncUtils healthConnectSyncUtils6 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 4;
                        obj = healthConnectSyncUtils6.syncSleepSegmentIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            arrayList.add("sleep");
                        }
                    }
                    Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                    return Unit.INSTANCE;
                }
                Logger.d(HealthConnectSyncUtils.TAG, "sync spo2");
                HealthConnectSyncUtils healthConnectSyncUtils7 = HealthConnectSyncUtils.INSTANCE;
                this.L$0 = arrayList;
                this.label = 3;
                obj = healthConnectSyncUtils7.syncSpo2RecordIfNeeded(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    arrayList.add("spo2");
                }
                if (this.$types.contains("sleep")) {
                    Logger.d(HealthConnectSyncUtils.TAG, "sync sleep");
                    HealthConnectSyncUtils healthConnectSyncUtils8 = HealthConnectSyncUtils.INSTANCE;
                    this.L$0 = arrayList;
                    this.label = 4;
                    obj = healthConnectSyncUtils8.syncSleepSegmentIfNeeded(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList.add("sleep");
                    }
                }
                Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                return Unit.INSTANCE;
                if (this.$types.contains("calorie")) {
                    Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                    HealthConnectSyncUtils healthConnectSyncUtils9 = HealthConnectSyncUtils.INSTANCE;
                    this.L$0 = arrayList;
                    this.label = 5;
                    obj = healthConnectSyncUtils9.syncCaloriesRecordIfNeeded(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList2 = arrayList;
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList2.add("calorie");
                    }
                    arrayList = arrayList2;
                }
                Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                return Unit.INSTANCE;
            }
            if (i == 1) {
                arrayList = (ArrayList) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    arrayList = (ArrayList) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList.add("hr");
                    }
                    if (this.$types.contains("spo2")) {
                        if (this.$types.contains("sleep")) {
                            Logger.d(HealthConnectSyncUtils.TAG, "sync sleep");
                            HealthConnectSyncUtils healthConnectSyncUtils10 = HealthConnectSyncUtils.INSTANCE;
                            this.L$0 = arrayList;
                            this.label = 4;
                            obj = healthConnectSyncUtils10.syncSleepSegmentIfNeeded(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (!((Boolean) obj).booleanValue()) {
                                arrayList.add("sleep");
                            }
                        }
                        Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                        return Unit.INSTANCE;
                    }
                    Logger.d(HealthConnectSyncUtils.TAG, "sync spo2");
                    HealthConnectSyncUtils healthConnectSyncUtils11 = HealthConnectSyncUtils.INSTANCE;
                    this.L$0 = arrayList;
                    this.label = 3;
                    obj = healthConnectSyncUtils11.syncSpo2RecordIfNeeded(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList.add("spo2");
                    }
                    if (this.$types.contains("sleep")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync sleep");
                        HealthConnectSyncUtils healthConnectSyncUtils12 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 4;
                        obj = healthConnectSyncUtils12.syncSleepSegmentIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            arrayList.add("sleep");
                        }
                    }
                    Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                    return Unit.INSTANCE;
                    if (this.$types.contains("calorie")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                        HealthConnectSyncUtils healthConnectSyncUtils13 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 5;
                        obj = healthConnectSyncUtils13.syncCaloriesRecordIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arrayList2 = arrayList;
                    }
                    Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    arrayList = (ArrayList) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList.add("spo2");
                    }
                    if (this.$types.contains("sleep")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync sleep");
                        HealthConnectSyncUtils healthConnectSyncUtils14 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 4;
                        obj = healthConnectSyncUtils14.syncSleepSegmentIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            arrayList.add("sleep");
                        }
                        if (this.$types.contains("calorie")) {
                            Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                            HealthConnectSyncUtils healthConnectSyncUtils15 = HealthConnectSyncUtils.INSTANCE;
                            this.L$0 = arrayList;
                            this.label = 5;
                            obj = healthConnectSyncUtils15.syncCaloriesRecordIfNeeded(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            arrayList2 = arrayList;
                        }
                    } else if (this.$types.contains("calorie")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                        HealthConnectSyncUtils healthConnectSyncUtils16 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 5;
                        obj = healthConnectSyncUtils16.syncCaloriesRecordIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arrayList2 = arrayList;
                    }
                    Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                    return Unit.INSTANCE;
                }
                if (i == 4) {
                    arrayList = (ArrayList) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList.add("sleep");
                    }
                    if (this.$types.contains("calorie")) {
                        Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                        HealthConnectSyncUtils healthConnectSyncUtils17 = HealthConnectSyncUtils.INSTANCE;
                        this.L$0 = arrayList;
                        this.label = 5;
                        obj = healthConnectSyncUtils17.syncCaloriesRecordIfNeeded(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arrayList2 = arrayList;
                    }
                    Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                    return Unit.INSTANCE;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList2 = (ArrayList) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                arrayList2.add("calorie");
            }
            arrayList = arrayList2;
            Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
            return Unit.INSTANCE;
            if (!((Boolean) obj).booleanValue()) {
                arrayList.add("step");
            }
            if (!this.$types.contains("hr")) {
                if (this.$types.contains("spo2")) {
                    Logger.d(HealthConnectSyncUtils.TAG, "sync spo2");
                    HealthConnectSyncUtils healthConnectSyncUtils18 = HealthConnectSyncUtils.INSTANCE;
                    this.L$0 = arrayList;
                    this.label = 3;
                    obj = healthConnectSyncUtils18.syncSpo2RecordIfNeeded(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList.add("spo2");
                    }
                }
                if (this.$types.contains("calorie")) {
                    Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                    HealthConnectSyncUtils healthConnectSyncUtils19 = HealthConnectSyncUtils.INSTANCE;
                    this.L$0 = arrayList;
                    this.label = 5;
                    obj = healthConnectSyncUtils19.syncCaloriesRecordIfNeeded(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList2 = arrayList;
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList2.add("calorie");
                    }
                    arrayList = arrayList2;
                }
                Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
                return Unit.INSTANCE;
            }
            Logger.d(HealthConnectSyncUtils.TAG, "sync hr");
            HealthConnectSyncUtils healthConnectSyncUtils20 = HealthConnectSyncUtils.INSTANCE;
            this.L$0 = arrayList;
            this.label = 2;
            obj = healthConnectSyncUtils20.syncHeartRecordIfNeeded(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                arrayList.add("hr");
            }
            if (this.$types.contains("spo2")) {
                Logger.d(HealthConnectSyncUtils.TAG, "sync spo2");
                HealthConnectSyncUtils healthConnectSyncUtils110 = HealthConnectSyncUtils.INSTANCE;
                this.L$0 = arrayList;
                this.label = 3;
                obj = healthConnectSyncUtils110.syncSpo2RecordIfNeeded(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    arrayList.add("spo2");
                }
            }
            if (this.$types.contains("calorie")) {
                Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                HealthConnectSyncUtils healthConnectSyncUtils111 = HealthConnectSyncUtils.INSTANCE;
                this.L$0 = arrayList;
                this.label = 5;
                obj = healthConnectSyncUtils111.syncCaloriesRecordIfNeeded(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList2 = arrayList;
                if (!((Boolean) obj).booleanValue()) {
                    arrayList2.add("calorie");
                }
                arrayList = arrayList2;
            }
            Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
            return Unit.INSTANCE;
            if (this.$types.contains("sleep")) {
                Logger.d(HealthConnectSyncUtils.TAG, "sync sleep");
                HealthConnectSyncUtils healthConnectSyncUtils112 = HealthConnectSyncUtils.INSTANCE;
                this.L$0 = arrayList;
                this.label = 4;
                obj = healthConnectSyncUtils112.syncSleepSegmentIfNeeded(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    arrayList.add("sleep");
                }
                if (this.$types.contains("calorie")) {
                    Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                    HealthConnectSyncUtils healthConnectSyncUtils113 = HealthConnectSyncUtils.INSTANCE;
                    this.L$0 = arrayList;
                    this.label = 5;
                    obj = healthConnectSyncUtils113.syncCaloriesRecordIfNeeded(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList2 = arrayList;
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList2.add("calorie");
                    }
                    arrayList = arrayList2;
                }
            } else if (this.$types.contains("calorie")) {
                Logger.d(HealthConnectSyncUtils.TAG, "sync calorie");
                HealthConnectSyncUtils healthConnectSyncUtils114 = HealthConnectSyncUtils.INSTANCE;
                this.L$0 = arrayList;
                this.label = 5;
                obj = healthConnectSyncUtils114.syncCaloriesRecordIfNeeded(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList2 = arrayList;
                if (!((Boolean) obj).booleanValue()) {
                    arrayList2.add("calorie");
                }
                arrayList = arrayList2;
            }
            Logger.i(HealthConnectSyncUtils.TAG, "sync daily record result:" + arrayList.isEmpty());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncHeartRecordIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils", f = "HealthConnectSyncUtils.kt", i = {0}, l = {128, 130}, m = "syncHeartRecordIfNeeded", n = {"this"}, s = {"L$0"})
    public static final class C28211 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28211(Continuation<? super C28211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectSyncUtils.this.syncHeartRecordIfNeeded(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncReport$1", f = "HealthConnectSyncUtils.kt", i = {}, l = {43, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C28221(Continuation<? super C28221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28221(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Logger.i(HealthConnectSyncUtils.TAG, "sync report result:" + ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class));
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            this.label = 1;
            obj = healthConnectUtils.hasPermission(application, writePermission, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                Logger.i(HealthConnectSyncUtils.TAG, "lack sport report write permission !!");
                return Unit.INSTANCE;
            }
            SportSyncBiz sportBiz = HealthConnectSyncUtils.INSTANCE.getSportBiz();
            this.label = 2;
            obj = sportBiz.syncBiz(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Logger.i(HealthConnectSyncUtils.TAG, "sync report result:" + ((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncSleepSegmentIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils", f = "HealthConnectSyncUtils.kt", i = {0}, l = {161, 163}, m = "syncSleepSegmentIfNeeded", n = {"this"}, s = {"L$0"})
    public static final class C28231 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28231(Continuation<? super C28231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectSyncUtils.this.syncSleepSegmentIfNeeded(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncSpo2RecordIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils", f = "HealthConnectSyncUtils.kt", i = {0}, l = {150, 152}, m = "syncSpo2RecordIfNeeded", n = {"this"}, s = {"L$0"})
    public static final class C28241 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28241(Continuation<? super C28241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectSyncUtils.this.syncSpo2RecordIfNeeded(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils$syncStepRecordIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectSyncUtils", f = "HealthConnectSyncUtils.kt", i = {0}, l = {113, 115}, m = "syncStepRecordIfNeeded", n = {"this"}, s = {"L$0"})
    public static final class C28251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28251(Continuation<? super C28251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectSyncUtils.this.syncStepRecordIfNeeded(this);
        }
    }

    private HealthConnectSyncUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CalorieSyncBiz calorieBiz_delegate$lambda$2() {
        return new CalorieSyncBiz();
    }

    private final CalorieSyncBiz getCalorieBiz() {
        return (CalorieSyncBiz) calorieBiz.getValue();
    }

    private final HrSyncBiz getHrBiz() {
        return (HrSyncBiz) hrBiz.getValue();
    }

    private final SleepSyncBiz getSleepBiz() {
        return (SleepSyncBiz) sleepBiz.getValue();
    }

    private final Spo2SyncBiz getSpo2Biz() {
        return (Spo2SyncBiz) spo2Biz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SportSyncBiz getSportBiz() {
        return (SportSyncBiz) sportBiz.getValue();
    }

    private final StepSyncBiz getStepBiz() {
        return (StepSyncBiz) stepBiz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrSyncBiz hrBiz_delegate$lambda$1() {
        return new HrSyncBiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSyncBiz sleepBiz_delegate$lambda$4() {
        return new SleepSyncBiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spo2SyncBiz spo2Biz_delegate$lambda$3() {
        return new Spo2SyncBiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportSyncBiz sportBiz_delegate$lambda$5() {
        return new SportSyncBiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StepSyncBiz stepBiz_delegate$lambda$0() {
        return new StepSyncBiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncCaloriesRecordIfNeeded(Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        HealthConnectSyncUtils healthConnectSyncUtils;
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
        Object objHasPermission = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                healthConnectSyncUtils = (HealthConnectSyncUtils) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objHasPermission);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHasPermission);
            }
        }
        ResultKt.throwOnFailure(objHasPermission);
        String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(ActiveCaloriesBurnedRecord.class));
        HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        objHasPermission = healthConnectUtils.hasPermission(application, writePermission, anonymousClass1);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        healthConnectSyncUtils = this;
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(TAG, "lack heart record write permission !!");
            return Boxing.boxBoolean(true);
        }
        Logger.d(TAG, "sync calorie record");
        CalorieSyncBiz calorieBiz2 = healthConnectSyncUtils.getCalorieBiz();
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        objHasPermission = calorieBiz2.syncBiz(anonymousClass1);
        return objHasPermission == coroutine_suspended ? coroutine_suspended : objHasPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncHeartRecordIfNeeded(Continuation<? super Boolean> continuation) {
        C28211 c28211;
        HealthConnectSyncUtils healthConnectSyncUtils;
        if (continuation instanceof C28211) {
            c28211 = (C28211) continuation;
            int i = c28211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28211.label = i - Integer.MIN_VALUE;
            } else {
                c28211 = new C28211(continuation);
            }
        } else {
            c28211 = new C28211(continuation);
        }
        Object objHasPermission = c28211.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28211.label;
        if (i2 != 0) {
            if (i2 == 1) {
                healthConnectSyncUtils = (HealthConnectSyncUtils) c28211.L$0;
                ResultKt.throwOnFailure(objHasPermission);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHasPermission);
            }
        }
        ResultKt.throwOnFailure(objHasPermission);
        String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(HeartRateRecord.class));
        HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        c28211.L$0 = this;
        c28211.label = 1;
        objHasPermission = healthConnectUtils.hasPermission(application, writePermission, c28211);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        healthConnectSyncUtils = this;
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(TAG, "lack heart record write permission !!");
            return Boxing.boxBoolean(true);
        }
        Logger.d(TAG, "sync hr record");
        HrSyncBiz hrBiz2 = healthConnectSyncUtils.getHrBiz();
        c28211.L$0 = null;
        c28211.label = 2;
        objHasPermission = hrBiz2.syncBiz(c28211);
        return objHasPermission == coroutine_suspended ? coroutine_suspended : objHasPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncSleepSegmentIfNeeded(Continuation<? super Boolean> continuation) {
        C28231 c28231;
        HealthConnectSyncUtils healthConnectSyncUtils;
        if (continuation instanceof C28231) {
            c28231 = (C28231) continuation;
            int i = c28231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28231.label = i - Integer.MIN_VALUE;
            } else {
                c28231 = new C28231(continuation);
            }
        } else {
            c28231 = new C28231(continuation);
        }
        Object objHasPermission = c28231.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28231.label;
        if (i2 != 0) {
            if (i2 == 1) {
                healthConnectSyncUtils = (HealthConnectSyncUtils) c28231.L$0;
                ResultKt.throwOnFailure(objHasPermission);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHasPermission);
            }
        }
        ResultKt.throwOnFailure(objHasPermission);
        String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class));
        HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        c28231.L$0 = this;
        c28231.label = 1;
        objHasPermission = healthConnectUtils.hasPermission(application, writePermission, c28231);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        healthConnectSyncUtils = this;
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(TAG, "lack sleep record write permission !!");
            return Boxing.boxBoolean(true);
        }
        Logger.d(TAG, "sync sleep record");
        SleepSyncBiz sleepBiz2 = healthConnectSyncUtils.getSleepBiz();
        c28231.L$0 = null;
        c28231.label = 2;
        objHasPermission = sleepBiz2.syncBiz(c28231);
        return objHasPermission == coroutine_suspended ? coroutine_suspended : objHasPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncSpo2RecordIfNeeded(Continuation<? super Boolean> continuation) {
        C28241 c28241;
        HealthConnectSyncUtils healthConnectSyncUtils;
        if (continuation instanceof C28241) {
            c28241 = (C28241) continuation;
            int i = c28241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28241.label = i - Integer.MIN_VALUE;
            } else {
                c28241 = new C28241(continuation);
            }
        } else {
            c28241 = new C28241(continuation);
        }
        Object objHasPermission = c28241.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28241.label;
        if (i2 != 0) {
            if (i2 == 1) {
                healthConnectSyncUtils = (HealthConnectSyncUtils) c28241.L$0;
                ResultKt.throwOnFailure(objHasPermission);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHasPermission);
            }
        }
        ResultKt.throwOnFailure(objHasPermission);
        String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class));
        HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        c28241.L$0 = this;
        c28241.label = 1;
        objHasPermission = healthConnectUtils.hasPermission(application, writePermission, c28241);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        healthConnectSyncUtils = this;
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(TAG, "lack heart record write permission !!");
            return Boxing.boxBoolean(true);
        }
        Logger.d(TAG, "sync spo2 record");
        Spo2SyncBiz spo2Biz2 = healthConnectSyncUtils.getSpo2Biz();
        c28241.L$0 = null;
        c28241.label = 2;
        objHasPermission = spo2Biz2.syncBiz(c28241);
        return objHasPermission == coroutine_suspended ? coroutine_suspended : objHasPermission;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncStepRecordIfNeeded(Continuation<? super Boolean> continuation) {
        C28251 c28251;
        HealthConnectSyncUtils healthConnectSyncUtils;
        if (continuation instanceof C28251) {
            c28251 = (C28251) continuation;
            int i = c28251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28251.label = i - Integer.MIN_VALUE;
            } else {
                c28251 = new C28251(continuation);
            }
        } else {
            c28251 = new C28251(continuation);
        }
        Object objHasPermission = c28251.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28251.label;
        if (i2 != 0) {
            if (i2 == 1) {
                healthConnectSyncUtils = (HealthConnectSyncUtils) c28251.L$0;
                ResultKt.throwOnFailure(objHasPermission);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHasPermission);
            }
        }
        ResultKt.throwOnFailure(objHasPermission);
        String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(StepsRecord.class));
        HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        c28251.L$0 = this;
        c28251.label = 1;
        objHasPermission = healthConnectUtils.hasPermission(application, writePermission, c28251);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        healthConnectSyncUtils = this;
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(TAG, "lack step record write permission !!");
            return Boxing.boxBoolean(true);
        }
        Logger.d(TAG, "sync step record");
        StepSyncBiz stepBiz2 = healthConnectSyncUtils.getStepBiz();
        c28251.L$0 = null;
        c28251.label = 2;
        objHasPermission = stepBiz2.syncBiz(c28251);
        return objHasPermission == coroutine_suspended ? coroutine_suspended : objHasPermission;
    }

    public final void syncDailyRecords(@Nullable List<String> types) {
        List<String> list = types;
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            ScopeExtKt.scope(Dispatchers.getIO(), new C28201(types, null));
        } catch (Exception e) {
            Logger.e(TAG, "syncDailyRecords exception", e);
        }
    }

    public final void syncReport() {
        ScopeExtKt.scope(Dispatchers.getIO(), new C28221(null));
    }
}
