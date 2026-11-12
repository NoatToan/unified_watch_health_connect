package com.huami.sleep.daysleep.tonality;

import androidx.p008lifecycle.LiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.sky.service.RelaxData;
import com.huami.sky.service.RelaxScore;
import com.huami.sleep.daysleep.tonality.bean.QueryTonalityBean;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.huami.sleep.daysleep.tonality.bean.TonalityDisplayDataInfo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$JZ\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J0\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002J*\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00150\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J,\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/TonalityRepos;", "Lcom/huami/sleep/daysleep/tonality/ITonalityRepos;", "Lcom/huami/sky/service/RelaxData;", "relaxData", "", "dayKey", "", "intoSleepCount", "", "intoSleepTime", "baseSleepTime", "", "beMainSleep", "", "intoSleepTimes", "beToday", "awakeTimeIndex", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", GoogleApiAvailabilityLight.a, "Lkotlin/Triple;", "b", "Lkotlin/Pair;", "c", "Lcom/huami/sky/service/RelaxScore;", "scoreArray", "a", "userId", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepData", "Lcom/huami/sleep/daysleep/tonality/bean/TonalityDisplayDataInfo;", "tonalityDisplayDataInfo", "Lkotlinx/coroutines/flow/Flow;", "fetchSleepTonalityData", "(Lcom/huami/sleep/daysleep/tonality/bean/TonalityDisplayDataInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class TonalityRepos implements ITonalityRepos {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "more than 240 intoSleepTime = " + this.a + " - index = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.LongRef a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ Ref.IntRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.LongRef longRef, Ref.IntRef intRef, Ref.IntRef intRef2) {
            super(0);
            this.a = longRef;
            this.b = intRef;
            this.c = intRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "more than 240 validScoreTime = " + this.a.element + " - sumScore = " + this.b.element + " - validCount = " + this.c.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.TonalityRepos", f = "TonalityRepos.kt", i = {0, 0}, l = {43}, m = "fetchSleepTonalityData", n = {"this", "tonalityDisplayDataInfo"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return TonalityRepos.this.fetchSleepTonalityData(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/service/RelaxData;", "it", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.TonalityRepos$fetchSleepTonalityData$2", f = "TonalityRepos.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<RelaxData, Continuation<? super SleepTonalityBean>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ TonalityDisplayDataInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TonalityDisplayDataInfo tonalityDisplayDataInfo, Continuation<? super d> continuation) {
            super(2, continuation);
            this.d = tonalityDisplayDataInfo;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable RelaxData relaxData, @Nullable Continuation<? super SleepTonalityBean> continuation) {
            return ((d) create(relaxData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = TonalityRepos.this.new d(this.d, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TonalityRepos.this.d((RelaxData) this.b, this.d.getSelectDateKey(), this.d.getIntoSleepCount(), this.d.getSleepStartTime(), this.d.getSelectDateTime(), this.d.getBeMainSleep(), this.d.getIntoSleepTimes(), SportDay.fromString(this.d.getSelectDateKey()).isToday(), this.d.getAwakeTimeIndex());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "more than 240 last count = " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Triple<Long, Long, Long> a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Triple<Long, Long, Long> triple, long j) {
            super(0);
            this.a = triple;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "transmitSleepTonality tonalityStartTime = " + this.a.getFirst() + "  - tonalityEndTime = " + this.a.getSecond() + " - intoSleepTime = " + this.b + " - newIntoSleepTime = " + this.a.getThird();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "transmitSleepTonality validTonalityData is empty";
        }
    }

    private final Pair<Long, Integer> a(List<RelaxScore> scoreArray, long intoSleepTime) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = -1L;
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        int i = 0;
        for (Object obj : scoreArray) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RelaxScore relaxScore = (RelaxScore) obj;
            if (i == 0) {
                longRef.element = relaxScore.getCreateTime();
            }
            if (intoSleepTime == relaxScore.getCreateTime()) {
                HMLog.info("DaySleepRepo", new a(intoSleepTime, i));
                longRef.element = intoSleepTime;
            }
            int value = relaxScore.getValue();
            if (value >= 0 && value <= 100) {
                intRef.element += relaxScore.getValue();
                intRef2.element++;
            }
            i = i2;
        }
        if (longRef.element == -1) {
            return null;
        }
        HMLog.info("DaySleepRepo", new b(longRef, intRef, intRef2));
        return new Pair<>(Long.valueOf(longRef.element), Integer.valueOf(intRef.element / intRef2.element));
    }

    private final Triple<Long, Long, Long> b(RelaxData relaxData, List<Long> intoSleepTimes) {
        List<RelaxScore> scores = relaxData.getScores();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(scores, 10));
        long j = -1;
        long jMin = -1;
        long jMax = -1;
        int i = 0;
        for (Object obj : scores) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            long createTime = ((RelaxScore) obj).getCreateTime();
            jMin = jMin == -1 ? createTime : Math.min(jMin, createTime);
            jMax = jMax == -1 ? createTime : Math.max(jMax, createTime);
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        Iterator<T> it2 = intoSleepTimes.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            if (jMin <= jLongValue && jLongValue <= jMax) {
                j = jLongValue;
            }
        }
        return new Triple<>(Long.valueOf(jMin), Long.valueOf(jMax), Long.valueOf(j));
    }

    private final List<Pair<Long, Integer>> c(RelaxData relaxData, long intoSleepTime) {
        ArrayList arrayList = new ArrayList();
        if (relaxData.getScores().size() < 240) {
            List<RelaxScore> scores = relaxData.getScores();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(scores, 10));
            int i = 0;
            for (Object obj : scores) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RelaxScore relaxScore = (RelaxScore) obj;
                int value = relaxScore.getValue();
                if (value >= 0 && value <= 100) {
                    arrayList.add(new Pair(Long.valueOf(relaxScore.getCreateTime()), Integer.valueOf(relaxScore.getValue())));
                }
                arrayList2.add(Unit.INSTANCE);
                i = i2;
            }
        } else {
            Ref.IntRef intRef = new Ref.IntRef();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            for (Object obj2 : relaxData.getScores()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RelaxScore relaxScore2 = (RelaxScore) obj2;
                if (intRef.element == 5) {
                    Pair<Long, Integer> pairA = a(arrayList3, intoSleepTime);
                    if (pairA != null) {
                        arrayList.add(pairA);
                    }
                    intRef.element = 0;
                    arrayList3.clear();
                }
                arrayList3.add(relaxScore2);
                intRef.element++;
                i3 = i4;
            }
            if (intRef.element > 0) {
                HMLog.info("DaySleepRepo", new e(intRef));
                Pair<Long, Integer> pairA2 = a(arrayList3, intoSleepTime);
                if (pairA2 != null) {
                    arrayList.add(pairA2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepTonalityBean d(RelaxData relaxData, String dayKey, int intoSleepCount, long intoSleepTime, long baseSleepTime, boolean beMainSleep, List<Long> intoSleepTimes, boolean beToday, int awakeTimeIndex) {
        if (relaxData == null || relaxData.getScores().isEmpty()) {
            return null;
        }
        SleepTonalityBean sleepTonalityBean = new SleepTonalityBean();
        sleepTonalityBean.setDayKey(dayKey);
        sleepTonalityBean.setIntoSleepTimeCount(intoSleepCount);
        sleepTonalityBean.setTagList(relaxData.getTags());
        Triple<Long, Long, Long> tripleB = b(relaxData, intoSleepTimes);
        sleepTonalityBean.setRelaxStartTimeMS(tripleB.getFirst().longValue());
        sleepTonalityBean.setRelaxEndTimeMS(tripleB.getSecond().longValue());
        sleepTonalityBean.setIntoSleepTime(tripleB.getThird().longValue());
        if (tripleB.getThird().longValue() == -1) {
            sleepTonalityBean.setIntoSleepSignIndex(-1);
        } else {
            sleepTonalityBean.setIntoSleepSignIndex(ChartTransmitUtil.INSTANCE.transmitDateTimeToSpecialInt(tripleB.getThird().longValue(), baseSleepTime));
        }
        HMLog.info("DaySleepRepo", new f(tripleB, intoSleepTime));
        List<Pair<Long, Integer>> listC = c(relaxData, tripleB.getThird().longValue());
        if (listC.isEmpty()) {
            HMLog.info("DaySleepRepo", g.a);
            return null;
        }
        sleepTonalityBean.setOffsetRelaxEndTimeMS(((Number) ((Pair) CollectionsKt.last((List) listC)).getFirst()).longValue());
        ChartTransmitUtil chartTransmitUtil = ChartTransmitUtil.INSTANCE;
        Triple<ChartDataList, Integer, Integer> tripleTransmitSleepTonalityData = chartTransmitUtil.transmitSleepTonalityData(baseSleepTime, tripleB.getFirst().longValue(), tripleB.getSecond().longValue(), listC);
        sleepTonalityBean.setRelaxChartDataList(tripleTransmitSleepTonalityData.getFirst());
        sleepTonalityBean.setRelaxMinScore(tripleTransmitSleepTonalityData.getSecond().intValue());
        sleepTonalityBean.setRelaxMaxScore(tripleTransmitSleepTonalityData.getThird().intValue());
        sleepTonalityBean.setBeMainSleep(beMainSleep);
        sleepTonalityBean.setContinueListenDaysCount(relaxData.getDaysOfContinuous());
        if (sleepTonalityBean.getIntoSleepTime() != -1) {
            sleepTonalityBean.setMusicListenTimeCount((int) (((sleepTonalityBean.getIntoSleepTime() - sleepTonalityBean.getRelaxStartTimeMS()) / ((long) 1000)) / ((long) 60)));
        }
        sleepTonalityBean.setMusicPlayTimeCount((int) (((sleepTonalityBean.getRelaxEndTimeMS() - sleepTonalityBean.getRelaxStartTimeMS()) / ((long) 1000)) / ((long) 60)));
        sleepTonalityBean.setBeToday(beToday);
        sleepTonalityBean.setAwakeTimeIndex(chartTransmitUtil.transmitIndexByZeroClock(awakeTimeIndex + 1));
        return sleepTonalityBean;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sleep.daysleep.tonality.ITonalityRepos
    @Nullable
    public Object fetchSleepTonalityData(@NotNull TonalityDisplayDataInfo tonalityDisplayDataInfo, @NotNull Continuation<? super Flow<SleepTonalityBean>> continuation) {
        c cVar;
        TonalityRepos tonalityRepos;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object sleepTonalityOriginalData = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sleepTonalityOriginalData);
            QueryTonalityBean queryTonalityBean = new QueryTonalityBean(tonalityDisplayDataInfo.getSelectDateTime(), tonalityDisplayDataInfo.getSleepStartTime(), tonalityDisplayDataInfo.getSleepEndTime());
            ITonalityDataInterface sleepSkySource = KoinExtKt.getSleepSkySource();
            cVar.a = this;
            cVar.b = tonalityDisplayDataInfo;
            cVar.e = 1;
            sleepTonalityOriginalData = sleepSkySource.getSleepTonalityOriginalData(queryTonalityBean, cVar);
            if (sleepTonalityOriginalData == coroutine_suspended) {
                return coroutine_suspended;
            }
            tonalityRepos = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tonalityDisplayDataInfo = (TonalityDisplayDataInfo) cVar.b;
            tonalityRepos = (TonalityRepos) cVar.a;
            ResultKt.throwOnFailure(sleepTonalityOriginalData);
        }
        return FlowKt.mapLatest((Flow) sleepTonalityOriginalData, tonalityRepos.new d(tonalityDisplayDataInfo, null));
    }

    @Override // com.huami.sleep.daysleep.tonality.ITonalityRepos
    @NotNull
    public LiveData<SleepInfo> getSleepData(@NotNull String userId, @NotNull String dayKey) {
        return KoinExtKt.getSleepSource().getSleepInfo(userId, dayKey);
    }
}
