package com.huami.sleep.service;

import android.util.SparseArray;
import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.util.HMColor;
import com.huami.sky.service.RelaxDataService;
import com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo;
import com.huami.sleep.koin.ISleepDataManager;
import com.huami.sleep.service.bean.SleepDataWithMode;
import com.huami.sleep.sleepintrodetail.dto.SleepDetail;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.repo.ISleepStatisticRepo;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.sleep.util.SleepDataUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntProgression;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 T2\u00020\u0001:\u0001TB7\u0012\u0006\u0010>\u001a\u00020\u001b\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010K\u001a\u00020I\u0012\u0006\u0010N\u001a\u00020L¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0003J*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J(\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H\u0002J1\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002H\u0003JR\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00000$2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&\u0012\u0006\u0012\u0004\u0018\u00010'0%H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0002H\u0002J)\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010-\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u0002H\u0016J\u0019\u00102\u001a\u0004\u0018\u00010\b2\u0006\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u00103J\u0014\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001d0\u0002H\u0017J\u0010\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u0002H\u0017J\u0010\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0017J\u0010\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u0002H\u0017J\u0010\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0002H\u0017J\u0010\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u0002H\u0017R\u0016\u0010>\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010=R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010MR%\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bF\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Lcom/huami/sleep/service/SleepServiceImpl;", "Lcom/huami/sleep/service/SleepService;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/service/SleepChanges;", "e", "", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "napStage", "", "baseTime", "Lkotlin/Pair;", "Ljava/util/Date;", "b", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "recentSleepInfo", "todaySleepInfo", "yesterdaySleepInfo", "h", "stageSleep", "Lcom/huami/sleep/service/SleepChartSection;", z.j, "nearSevenSleepInfoList", "", "Lcom/huami/sleep/service/ChartPoint;", "i", "startIndex", "endIndex", "", "dateKey", "Landroid/util/SparseArray;", "g", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/service/SleepDurationInLast7Days;", "f", ExifInterface.GPS_DIRECTION_TRUE, "R", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", TransportUri.ACTION_BLOCK, "a", "(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "", "c", "queryTimeStamp", "fetchMainSleepFallAndWakeTimestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/service/SleepWithTonalityInfo;", "fetchTodaySleepInfoWithTonality", "fetchIntoSleepTimeStampByTimeStamp", "(J)Ljava/lang/Long;", "getHeartRateChartData", "Lcom/huami/sleep/service/SleepData;", "getLatestSleepData", "getSleepChanges", "Lcom/huami/sleep/service/SleepChartData;", "getSleepChartData", "getSleepDurationInLast7DaysChartData", "Lcom/huami/sleep/service/ServiceSleepInfo;", "getSleepInfo", "Ljava/lang/String;", "userId", "Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;", "Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;", "sleepStatisticRepo", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", "sleepStageRepo", "Lcom/huami/sleep/koin/ISleepDataManager;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleep/koin/ISleepDataManager;", "sleepDataManager", "Lcom/huami/sleep/service/ISleepServiceDataSource;", "Lcom/huami/sleep/service/ISleepServiceDataSource;", "sleepServiceDataDSource", "Lcom/huami/sky/service/RelaxDataService;", "Lcom/huami/sky/service/RelaxDataService;", "tonalityService", "Lkotlin/Lazy;", "()Landroidx/lifecycle/LiveData;", "latestSleepDataLiveData", "<init>", "(Ljava/lang/String;Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;Lcom/huami/sleep/koin/ISleepDataManager;Lcom/huami/sleep/service/ISleepServiceDataSource;Lcom/huami/sky/service/RelaxDataService;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepServiceImpl implements SleepService {

    @NotNull
    private static final String h = "SleepServiceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ISleepStatisticRepo sleepStatisticRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IDaySleepStageRepo sleepStageRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ISleepDataManager sleepDataManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ISleepServiceDataSource sleepServiceDataDSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final RelaxDataService tonalityService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy latestSleepDataLiveData = LazyKt__LazyJVMKt.lazy(new p());

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$asFlowWithMap$1", f = "SleepServiceImpl.kt", i = {}, l = {533}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<R, T> extends SuspendLambda implements Function2<T, Continuation<? super R>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<T, Continuation<? super R>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t, @Nullable Continuation<? super R> continuation) {
            return ((a) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.huami.sleep.service.SleepServiceImpl$a<R, T> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.b
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = r1.invoke(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.sleep.service.SleepServiceImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ Ref.IntRef d;
        public final /* synthetic */ Ref.IntRef e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, long j3, Ref.IntRef intRef, Ref.IntRef intRef2) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = intRef;
            this.e = intRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "calculateNapSleepInfo baseTime = " + this.a + " - startTime = " + this.b + " - endTime = " + this.c + " - startIndex = " + this.d.element + " - endIndex = " + this.e.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Long l) {
            super(0);
            this.a = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "intoSleepTimeStamp = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Pair;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$fetchMainSleepFallAndWakeTimestamp$2", f = "SleepServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Long, ? extends Long>>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepServiceImpl.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Long, ? extends Long>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<Long, Long>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Pair<Long, Long>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SleepServiceImpl.this.sleepServiceDataDSource.fetchMainSleepFallAndWakeTime(this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$flowNull$1", f = "SleepServiceImpl.kt", i = {}, l = {540}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                this.a = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Landroid/util/SparseArray;", "Lcom/huami/sleep/service/ChartPoint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$getHeartRateChartData$1", f = "SleepServiceImpl.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<SleepInfo, Continuation<? super SparseArray<ChartPoint>>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepInfo sleepInfo, @Nullable Continuation<? super SparseArray<ChartPoint>> continuation) {
            return ((f) create(sleepInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = SleepServiceImpl.this.new f(continuation);
            fVar.b = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            SparseArray sparseArray = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInfo sleepInfo = (SleepInfo) this.b;
                if (sleepInfo != null) {
                    if ((Boxing.boxBoolean(sleepInfo.getHasSleep()).booleanValue() ? sleepInfo : null) != null) {
                        SleepServiceImpl sleepServiceImpl = SleepServiceImpl.this;
                        Pair<Integer, Integer> sleepStartEndIndex = sleepServiceImpl.sleepStageRepo.getSleepStartEndIndex(sleepInfo);
                        if (sleepStartEndIndex != null) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(sleepInfo.getStopDate());
                            IDaySleepStageRepo iDaySleepStageRepo = sleepServiceImpl.sleepStageRepo;
                            String str = sleepServiceImpl.userId;
                            String key = new SportDay(calendar).getKey();
                            int iIntValue = sleepStartEndIndex.getFirst().intValue();
                            int iIntValue2 = sleepStartEndIndex.getSecond().intValue();
                            this.a = 1;
                            obj = iDaySleepStageRepo.loadheartRateData(str, key, iIntValue, iIntValue2, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
                if (sparseArray == null) {
                    return new SparseArray();
                }
                return sparseArray;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChartDataList chartDataList = (ChartDataList) obj;
            SparseArray sparseArray2 = new SparseArray();
            for (Integer num : chartDataList.getDataKeyList()) {
                ChartData dataByPositionIndex = chartDataList.getDataByPositionIndex(num.intValue());
                if (dataByPositionIndex != null) {
                    sparseArray2.put(num.intValue(), new ChartPoint(num.intValue(), dataByPositionIndex.getValues()[0]));
                }
            }
            sparseArray = sparseArray2;
            if (sparseArray == null) {
                return new SparseArray();
            }
            return sparseArray;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Lcom/huami/sleep/service/SleepData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$getLatestSleepData$1", f = "SleepServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<SleepInfo, Continuation<? super SleepData>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepInfo sleepInfo, @Nullable Continuation<? super SleepData> continuation) {
            return ((g) create(sleepInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepInfo sleepInfo = (SleepInfo) this.b;
            if (sleepInfo == null) {
                return null;
            }
            if (!Boxing.boxBoolean(sleepInfo.getHasSleep()).booleanValue()) {
                sleepInfo = null;
            }
            if (sleepInfo == null) {
                return null;
            }
            return new SleepData(sleepInfo.getStartDate(), sleepInfo.getStopDate(), sleepInfo.getSleepScore(), sleepInfo.getSleepCount(), sleepInfo.getNonRemCount(), sleepInfo.getIntoSleepCount());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "it", "Lcom/huami/sleep/service/SleepChartData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$getSleepChartData$1", f = "SleepServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<SleepInfo, Continuation<? super SleepChartData>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepInfo sleepInfo, @Nullable Continuation<? super SleepChartData> continuation) {
            return ((h) create(sleepInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = SleepServiceImpl.this.new h(continuation);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepInfo sleepInfo = (SleepInfo) this.b;
            if (sleepInfo == null) {
                return null;
            }
            if (!Boxing.boxBoolean(sleepInfo.getHasSleep()).booleanValue()) {
                sleepInfo = null;
            }
            if (sleepInfo == null) {
                return null;
            }
            List<SleepDataWithMode> stageSleepChartDataWithMode = SleepServiceImpl.this.sleepStageRepo.getStageSleepChartDataWithMode(sleepInfo);
            ArrayList arrayList = new ArrayList();
            if (stageSleepChartDataWithMode != null) {
                for (SleepDataWithMode sleepDataWithMode : stageSleepChartDataWithMode) {
                    ChartData chartData = sleepDataWithMode.getChartData();
                    SleepMode sleepMode = sleepDataWithMode.getSleepMode();
                    BaseIndex baseIndex = chartData.getBaseIndex();
                    Object obj2 = chartData.getDataExtends().get(0).get(baseIndex);
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.huami.chart.util.HMColor");
                    arrayList.add(new SleepChartSection(baseIndex.getStart(), baseIndex.getEnd(), (int) chartData.getValues()[0], ((HMColor) obj2).getRawColor(), sleepMode));
                }
            }
            return new SleepChartData(arrayList, sleepInfo.getStartDate(), sleepInfo.getStopDate());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u0003\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0002\u0018\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "", "it", "Lcom/huami/sleep/service/ServiceSleepInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$getSleepInfo$1", f = "SleepServiceImpl.kt", i = {0, 0, 0}, l = {255}, m = "invokeSuspend", n = {"recentSleepInfo", "sleepChanges", "sevenPair"}, s = {"L$0", "L$1", "L$2"})
    public static final class i extends SuspendLambda implements Function2<Pair<? extends SleepInfo, ? extends List<? extends SleepInfo>>, Continuation<? super ServiceSleepInfo>, Object> {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getSleepInfo sleepInfo is null";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getSleepInfo has main sleep";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ SleepInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SleepInfo sleepInfo) {
                super(0);
                this.a = sleepInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getSleepInfo result st = " + this.a.getStartDate() + " - ed = " + this.a.getStopDate();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public static final d a = new d();

            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getSleepInfo has nap sleep";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ SleepInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(SleepInfo sleepInfo) {
                super(0);
                this.a = sleepInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getSleepInfo result st = " + this.a.getStartDate() + " - ed = " + this.a.getStopDate();
            }
        }

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable Pair<? extends SleepInfo, ? extends List<? extends SleepInfo>> pair, @Nullable Continuation<? super ServiceSleepInfo> continuation) {
            return ((i) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            i iVar = SleepServiceImpl.this.new i(continuation);
            iVar.d = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepInfo sleepInfo;
            Object objG;
            Pair pair;
            SleepChanges sleepChanges;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Pair pair2 = (Pair) this.d;
                if ((pair2 == null ? null : (SleepInfo) pair2.getFirst()) == null) {
                    HMLog.info(SleepServiceImpl.h, a.a);
                    return null;
                }
                sleepInfo = (SleepInfo) pair2.getFirst();
                List list = (List) pair2.getSecond();
                SleepChanges sleepChangesH = SleepServiceImpl.this.h(sleepInfo, (SleepInfo) CollectionsKt.lastOrNull(list), (SleepInfo) CollectionsKt.getOrNull(list, list.size() - 2));
                Pair pairI = SleepServiceImpl.this.i(list);
                if (!sleepInfo.getHasSleep()) {
                    HMLog.info(SleepServiceImpl.h, d.a);
                    Pair pairB = SleepServiceImpl.this.b(sleepInfo.getOddStageSleep(), sleepInfo.getSportDay().getTimestamp());
                    int duration = SleepDataUtil.INSTANCE.parse2Nap(sleepInfo).getDuration();
                    HMLog.info(SleepServiceImpl.h, new e(sleepInfo));
                    return new ServiceSleepInfo((Date) pairB.getFirst(), (Date) pairB.getSecond(), 0, duration, 0, 0, sleepChangesH, SleepServiceImpl.this.j(sleepInfo.getOddStageSleep()), ((Number) pairI.getFirst()).intValue(), (List) pairI.getSecond(), false, null);
                }
                HMLog.info(SleepServiceImpl.h, b.a);
                SleepServiceImpl sleepServiceImpl = SleepServiceImpl.this;
                ChartTransmitUtil chartTransmitUtil = ChartTransmitUtil.INSTANCE;
                int iTransmitDateTimeToSpecialInt = chartTransmitUtil.transmitDateTimeToSpecialInt(sleepInfo.getStartDate().getTime(), sleepInfo.getSportDay().getTimestamp());
                int iTransmitDateTimeToSpecialInt2 = chartTransmitUtil.transmitDateTimeToSpecialInt(sleepInfo.getStopDate().getTime(), sleepInfo.getSportDay().getTimestamp());
                String key = sleepInfo.getSportDay().getKey();
                this.d = sleepInfo;
                this.a = sleepChangesH;
                this.b = pairI;
                this.c = 1;
                objG = sleepServiceImpl.g(iTransmitDateTimeToSpecialInt, iTransmitDateTimeToSpecialInt2, key, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pair = pairI;
                sleepChanges = sleepChangesH;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pair = (Pair) this.b;
                SleepChanges sleepChanges2 = (SleepChanges) this.a;
                sleepInfo = (SleepInfo) this.d;
                ResultKt.throwOnFailure(obj);
                objG = obj;
                sleepChanges = sleepChanges2;
            }
            SparseArray sparseArray = (SparseArray) objG;
            HMLog.info(SleepServiceImpl.h, new c(sleepInfo));
            return new ServiceSleepInfo(sleepInfo.getStartDate(), sleepInfo.getStopDate(), sleepInfo.getSleepScore(), sleepInfo.getSleepCount(), sleepInfo.getNonRemCount(), sleepInfo.getIntoSleepCount(), sleepChanges, SleepServiceImpl.this.j(sleepInfo.getStageSleep()), ((Number) pair.getFirst()).intValue(), (List) pair.getSecond(), true, sparseArray);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "info", "Lcom/huami/sleep/service/SleepChanges;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$getTodaySleepChanges$2", f = "SleepServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<List<? extends SleepAllInfo>, Continuation<? super SleepChanges>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ SportDay c;
        public final /* synthetic */ SportDay d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SportDay sportDay, SportDay sportDay2, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = sportDay;
            this.d = sportDay2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<SleepAllInfo> list, @Nullable Continuation<? super SleepChanges> continuation) {
            return ((j) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            j jVar = new j(this.c, this.d, continuation);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object next;
            Object next2;
            SleepDetail mainSleepDetail;
            SleepDetail mainSleepDetail2;
            Integer numBoxInt;
            SleepDetail mainSleepDetail3;
            Integer numBoxInt2;
            SleepDetail mainSleepDetail4;
            Integer numBoxInt3;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            SportDay sportDay = this.c;
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Boxing.boxBoolean(Intrinsics.areEqual(((SleepAllInfo) next).getDate(), sportDay.getKey())).booleanValue());
            SleepAllInfo sleepAllInfo = (SleepAllInfo) next;
            SportDay sportDay2 = this.d;
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!Boxing.boxBoolean(Intrinsics.areEqual(((SleepAllInfo) next2).getDate(), sportDay2.getKey())).booleanValue());
            SleepAllInfo sleepAllInfo2 = (SleepAllInfo) next2;
            if (sleepAllInfo2 == null || (mainSleepDetail = sleepAllInfo2.getMainSleepDetail()) == null) {
                return null;
            }
            return new SleepChanges(((sleepAllInfo != null && (mainSleepDetail2 = sleepAllInfo.getMainSleepDetail()) != null && (numBoxInt = Boxing.boxInt(mainSleepDetail2.getScore())) != null) ? numBoxInt.intValue() : 0) > mainSleepDetail.getScore(), ((sleepAllInfo != null && (mainSleepDetail3 = sleepAllInfo.getMainSleepDetail()) != null && (numBoxInt2 = Boxing.boxInt(mainSleepDetail3.getTotalDur())) != null) ? numBoxInt2.intValue() : 0) > mainSleepDetail.getTotalDur(), ((sleepAllInfo != null && (mainSleepDetail4 = sleepAllInfo.getMainSleepDetail()) != null && (numBoxInt3 = Boxing.boxInt(mainSleepDetail4.getDeepDur())) != null) ? numBoxInt3.intValue() : 0) > mainSleepDetail.getDeepDur(), false, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "info", "Lcom/huami/sleep/service/SleepDurationInLast7Days;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl$getTodaySleepDurationInLast7DaysChartData$1", f = "SleepServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<List<? extends SleepAllInfo>, Continuation<? super SleepDurationInLast7Days>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ List<SportDay> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(List<? extends SportDay> list, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<SleepAllInfo> list, @Nullable Continuation<? super SleepDurationInLast7Days> continuation) {
            return ((k) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            k kVar = new k(this.c, continuation);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object next;
            SleepDetail mainSleepDetail;
            Integer numBoxInt;
            SleepDetail mainSleepDetail2;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            int totalDur = 0;
            for (Object obj2 : this.c) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SportDay sportDay = (SportDay) obj2;
                int iIntValue = Boxing.boxInt(i2).intValue();
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Boxing.boxBoolean(Intrinsics.areEqual(((SleepAllInfo) next).getDate(), sportDay.getKey())).booleanValue());
                SleepAllInfo sleepAllInfo = (SleepAllInfo) next;
                if (sleepAllInfo != null && (mainSleepDetail2 = sleepAllInfo.getMainSleepDetail()) != null && mainSleepDetail2.getTotalDur() > 0) {
                    totalDur += mainSleepDetail2.getTotalDur();
                    i++;
                }
                arrayList.add(new ChartPoint(iIntValue, (sleepAllInfo == null || (mainSleepDetail = sleepAllInfo.getMainSleepDetail()) == null || (numBoxInt = Boxing.boxInt(mainSleepDetail.getTotalDur())) == null) ? 0 : numBoxInt.intValue()));
                i2 = i3;
            }
            return new SleepDurationInLast7Days(i != 0 ? totalDur / i : 0, arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.SleepServiceImpl", f = "SleepServiceImpl.kt", i = {}, l = {472}, m = "heartData", n = {}, s = {})
    public static final class l extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return SleepServiceImpl.this.g(0, 0, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "infoChange --->  todaySleepInfo IS NULL OR NOT REAL TODAY";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "infoChange ---> yesterdaySleepInfo IS NULL";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ SleepInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(SleepInfo sleepInfo) {
            super(0);
            this.a = sleepInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "infoChange ---> recentSleepInfo.hasSleep = " + this.a.getHasSleep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<LiveData<SleepInfo>> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<SleepInfo> invoke() {
            return SleepServiceImpl.this.sleepDataManager.getLatestSleepData(SleepServiceImpl.this.userId);
        }
    }

    public SleepServiceImpl(@NotNull String str, @NotNull ISleepStatisticRepo iSleepStatisticRepo, @NotNull IDaySleepStageRepo iDaySleepStageRepo, @NotNull ISleepDataManager iSleepDataManager, @NotNull ISleepServiceDataSource iSleepServiceDataSource, @NotNull RelaxDataService relaxDataService) {
        this.userId = str;
        this.sleepStatisticRepo = iSleepStatisticRepo;
        this.sleepStageRepo = iDaySleepStageRepo;
        this.sleepDataManager = iSleepDataManager;
        this.sleepServiceDataDSource = iSleepServiceDataSource;
        this.tonalityService = relaxDataService;
    }

    @FlowPreview
    @ExperimentalCoroutinesApi
    private final <T, R> Flow<R> a(LiveData<T> liveData, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt.distinctUntilChanged(FlowKt.debounce(FlowKt.mapLatest(FlowLiveDataConversions.asFlow(liveData), new a(function2, null)), 300L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Date, Date> b(List<? extends StageSleep> napStage, long baseTime) {
        int i2;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = napStage.iterator();
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((((StageSleep) next).mode == 7 ? 1 : 0) == 0) {
                arrayList.add(next);
            }
        }
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StageSleep stageSleep = (StageSleep) obj;
            if (intRef.element == -1 && intRef2.element == -1) {
                intRef.element = stageSleep.start;
                intRef2.element = stageSleep.stop;
            } else {
                intRef2.element = Math.max(intRef2.element, stageSleep.stop);
            }
            i2 = i3;
        }
        ChartTransmitUtil chartTransmitUtil = ChartTransmitUtil.INSTANCE;
        long jTransmitIndexToDateTime = chartTransmitUtil.transmitIndexToDateTime(intRef.element, baseTime);
        long jTransmitIndexToDateTime2 = chartTransmitUtil.transmitIndexToDateTime(intRef2.element, baseTime);
        HMLog.info(h, new b(baseTime, jTransmitIndexToDateTime, jTransmitIndexToDateTime2, intRef, intRef2));
        return new Pair<>(new Date(jTransmitIndexToDateTime), new Date(jTransmitIndexToDateTime2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow c() {
        return FlowKt.flow(new e(null));
    }

    private final LiveData<SleepInfo> d() {
        return (LiveData) this.latestSleepDataLiveData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FlowPreview
    @ExperimentalCoroutinesApi
    public final Flow<SleepChanges> e() {
        SportDay today = SportDay.getToday();
        SportDay sportDayAddDay = today.addDay(-1);
        ISleepStatisticRepo iSleepStatisticRepo = this.sleepStatisticRepo;
        String str = this.userId;
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        return a(Transformations.map(iSleepStatisticRepo.getSleepInfo(str, sleepTimeUtil.getDayStartTime(sportDayAddDay.getTimestamp()), sleepTimeUtil.getDayEndTime(today.getTimestamp())), new Function<List<? extends SleepAllInfo>, List<? extends SleepAllInfo>>() { // from class: com.huami.sleep.service.SleepServiceImpl$getTodaySleepChanges$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends SleepAllInfo> apply(List<? extends SleepAllInfo> list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(((SleepAllInfo) obj).getMainSleepDetail().getTotalDur() == 0)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }), new j(today, sportDayAddDay, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FlowPreview
    @ExperimentalCoroutinesApi
    public final Flow<SleepDurationInLast7Days> f() {
        IntProgression intProgressionDownTo = kotlin.ranges.e.downTo(6, 0);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionDownTo, 10));
        Iterator<Integer> it2 = intProgressionDownTo.iterator();
        while (it2.hasNext()) {
            arrayList.add(SportDay.getToday().addDay(-((IntIterator) it2).nextInt()));
        }
        ISleepStatisticRepo iSleepStatisticRepo = this.sleepStatisticRepo;
        String str = this.userId;
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        return a(iSleepStatisticRepo.getSleepInfo(str, sleepTimeUtil.getDayStartTime(((SportDay) CollectionsKt.first((List) arrayList)).getTimestamp()), sleepTimeUtil.getDayEndTime(((SportDay) CollectionsKt.last((List) arrayList)).getTimestamp())), new k(arrayList, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(int i2, int i3, String str, Continuation<? super SparseArray<ChartPoint>> continuation) {
        l lVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i4 = lVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lVar.c = i4 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        l lVar2 = lVar;
        Object objLoadheartRateData = lVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i5 = lVar2.c;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objLoadheartRateData);
            IDaySleepStageRepo iDaySleepStageRepo = this.sleepStageRepo;
            String str2 = this.userId;
            lVar2.c = 1;
            objLoadheartRateData = iDaySleepStageRepo.loadheartRateData(str2, str, i2, i3, lVar2);
            if (objLoadheartRateData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoadheartRateData);
        }
        ChartDataList chartDataList = (ChartDataList) objLoadheartRateData;
        SparseArray sparseArray = new SparseArray();
        for (Integer num : chartDataList.getDataKeyList()) {
            ChartData dataByPositionIndex = chartDataList.getDataByPositionIndex(num.intValue());
            if (dataByPositionIndex != null) {
                sparseArray.put(num.intValue(), new ChartPoint(num.intValue(), dataByPositionIndex.getValues()[0]));
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepChanges h(SleepInfo recentSleepInfo, SleepInfo todaySleepInfo, SleepInfo yesterdaySleepInfo) {
        if (todaySleepInfo == null || !Intrinsics.areEqual(todaySleepInfo.getSportDay().getKey(), SportDay.getToday().getKey())) {
            HMLog.info("SleepServiceImplForMI", m.a);
            return null;
        }
        if (yesterdaySleepInfo == null) {
            HMLog.info("SleepServiceImplForMI", n.a);
            return null;
        }
        if (!Intrinsics.areEqual(recentSleepInfo.getSportDay().getKey(), todaySleepInfo.getSportDay().getKey())) {
            return null;
        }
        HMLog.info("SleepServiceImplForMI", new o(recentSleepInfo));
        if (recentSleepInfo.getHasSleep()) {
            if (yesterdaySleepInfo.getHasSleep()) {
                return new SleepChanges(recentSleepInfo.getSleepScore() > yesterdaySleepInfo.getSleepScore(), recentSleepInfo.getSleepCount() > yesterdaySleepInfo.getSleepCount(), recentSleepInfo.getNonRemCount() > yesterdaySleepInfo.getNonRemCount(), false);
            }
            return null;
        }
        ArrayList<StageSleep> oddStageSleep = yesterdaySleepInfo.getOddStageSleep();
        if (oddStageSleep == null || oddStageSleep.isEmpty()) {
            return null;
        }
        SleepDataUtil sleepDataUtil = SleepDataUtil.INSTANCE;
        return new SleepChanges(false, false, false, SleepDataUtil.statisticNapSleepCountByMode$default(sleepDataUtil, recentSleepInfo, 0, 2, null) > SleepDataUtil.statisticNapSleepCountByMode$default(sleepDataUtil, yesterdaySleepInfo, 0, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, List<ChartPoint>> i(List<? extends SleepInfo> nearSevenSleepInfoList) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int sleepCount = 0;
        for (Object obj : nearSevenSleepInfoList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SleepInfo sleepInfo = (SleepInfo) obj;
            if (sleepInfo.getHasSleep()) {
                sleepCount += sleepInfo.getSleepCount();
                i2++;
            }
            arrayList.add(new ChartPoint(i3, sleepInfo.getSleepCount()));
            i3 = i4;
        }
        return new Pair<>(Integer.valueOf(i2 != 0 ? sleepCount / i2 : 0), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SleepChartSection> j(List<? extends StageSleep> stageSleep) {
        List<SleepDataWithMode> listFetchMainSleepChartDataWithMode$default = ChartTransmitUtil.fetchMainSleepChartDataWithMode$default(ChartTransmitUtil.INSTANCE, stageSleep, 0.0f, 0.0f, 6, null);
        ArrayList arrayList = new ArrayList();
        for (SleepDataWithMode sleepDataWithMode : listFetchMainSleepChartDataWithMode$default) {
            ChartData chartData = sleepDataWithMode.getChartData();
            SleepMode sleepMode = sleepDataWithMode.getSleepMode();
            BaseIndex baseIndex = chartData.getBaseIndex();
            Object obj = chartData.getDataExtends().get(0).get(baseIndex);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.chart.util.HMColor");
            arrayList.add(new SleepChartSection(baseIndex.getStart(), baseIndex.getEnd(), (int) chartData.getValues()[0], ((HMColor) obj).getRawColor(), sleepMode));
        }
        return arrayList;
    }

    @Override // com.huami.sleep.service.SleepService
    public void exitService() {
        SleepService.DefaultImpls.exitService(this);
    }

    @Override // com.huami.sleep.service.SleepService
    @Nullable
    public Long fetchIntoSleepTimeStampByTimeStamp(long queryTimeStamp) {
        Long lFetchIIntoSleepTimeStampByTimeStamp = this.sleepServiceDataDSource.fetchIIntoSleepTimeStampByTimeStamp(queryTimeStamp);
        HMLog.info(h, new c(lFetchIIntoSleepTimeStampByTimeStamp));
        return lFetchIIntoSleepTimeStampByTimeStamp;
    }

    @Override // com.huami.sleep.service.SleepService
    @Nullable
    public Object fetchMainSleepFallAndWakeTimestamp(long j2, @NotNull Continuation<? super Pair<Long, Long>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(j2, null), continuation);
    }

    @Override // com.huami.sleep.service.SleepService
    @NotNull
    public Flow<SleepWithTonalityInfo> fetchTodaySleepInfoWithTonality() {
        return this.sleepServiceDataDSource.fetchWithTonalityMainSleepInfo(this.tonalityService);
    }

    @Override // com.huami.sleep.service.SleepService
    @FlowPreview
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<SparseArray<ChartPoint>> getHeartRateChartData() {
        return a(d(), new f(null));
    }

    @Override // com.huami.sleep.service.SleepService
    @FlowPreview
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<SleepData> getLatestSleepData() {
        return a(this.sleepDataManager.getLatestSleepData(this.userId), new g(null));
    }

    @Override // com.huami.sleep.service.SleepService
    @FlowPreview
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<SleepChanges> getSleepChanges() {
        return FlowKt.transformLatest(FlowLiveDataConversions.asFlow(d()), new SleepServiceImpl$getSleepChanges$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.huami.sleep.service.SleepService
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<SleepChartData> getSleepChartData() {
        return FlowKt.mapLatest(FlowLiveDataConversions.asFlow(d()), new h(null));
    }

    @Override // com.huami.sleep.service.SleepService
    @FlowPreview
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<SleepDurationInLast7Days> getSleepDurationInLast7DaysChartData() {
        return FlowKt.transformLatest(FlowLiveDataConversions.asFlow(d()), new SleepServiceImpl$getSleepDurationInLast7DaysChartData$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.huami.sleep.service.SleepService
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<ServiceSleepInfo> getSleepInfo() {
        return FlowKt.mapLatest(this.sleepServiceDataDSource.getRecentSleepInfoByDB(), new i(null));
    }
}
