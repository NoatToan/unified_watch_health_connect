package com.xiaomi.fitness.health.curse;

import com.mi.fitness.menstrual.data.MenstrualCycleElement;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.AlgoCurseItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.TimeExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.AlgoCurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 z2\u00020\u0001:\u0001zB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010Y\u001a\u00020ZJ\u0006\u0010[\u001a\u00020\\J\u0006\u0010]\u001a\u00020\u001dJ\u000e\u0010^\u001a\u00020\u00052\u0006\u0010_\u001a\u00020%J \u0010`\u001a\u0014\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\\0a2\u0006\u0010_\u001a\u00020%J\b\u0010b\u001a\u00020\u0005H\u0002J\u000e\u0010c\u001a\u00020\u00052\u0006\u0010d\u001a\u00020%J\u000e\u0010e\u001a\u00020\u00052\u0006\u0010d\u001a\u00020%J\u000e\u0010Q\u001a\u00020\u00052\u0006\u0010d\u001a\u00020%J\b\u0010f\u001a\u00020TH\u0002J\u000e\u0010g\u001a\u00020T2\u0006\u0010d\u001a\u00020%J\u0010\u0010h\u001a\u0004\u0018\u00010%2\u0006\u0010d\u001a\u00020%J\u000e\u0010i\u001a\u00020\\2\u0006\u0010j\u001a\u00020\u001dJ\u0010\u0010k\u001a\u00020\u001d2\u0006\u0010j\u001a\u00020\u001dH\u0002J\u0010\u0010l\u001a\u00020\u001d2\b\b\u0002\u0010m\u001a\u00020\u001dJ\u0018\u0010n\u001a\u00020\u001d2\b\b\u0002\u0010m\u001a\u00020\u001d2\u0006\u0010o\u001a\u00020\u0005J\u0018\u0010p\u001a\u00020\u001d2\b\b\u0002\u0010m\u001a\u00020\u001d2\u0006\u0010o\u001a\u00020\u0005J\u000e\u0010q\u001a\u00020\\2\u0006\u0010d\u001a\u00020%J \u0010r\u001a\u00020\\2\u0006\u0010d\u001a\u00020%2\u0006\u0010s\u001a\u00020%2\u0006\u0010t\u001a\u00020%H\u0002J\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020w0v2\u0006\u0010x\u001a\u00020\u001d2\u0006\u0010y\u001a\u00020\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u001c\u00100\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001c\u00103\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u001c\u00106\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u001c\u00109\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010'\"\u0004\b;\u0010)R\u001c\u0010<\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\u001c\u0010?\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R\u001c\u0010B\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010'\"\u0004\bD\u0010)R\u001a\u0010E\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\u001a\u0010M\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0007\"\u0004\bO\u0010\tR\u001a\u0010P\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0007\"\u0004\bR\u0010\tR\u001a\u0010S\u001a\u00020TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006{"}, d2 = {"Lcom/xiaomi/fitness/health/curse/AlgoCurseManager;", "", "<init>", "()V", "inDaysByAlgo", "", "getInDaysByAlgo", "()I", "setInDaysByAlgo", "(I)V", "intervalByAlgo", "getIntervalByAlgo", "setIntervalByAlgo", "currentCurseByAlgo", "Lcom/mi/fitness/menstrual/data/MenstrualCycleElement;", "getCurrentCurseByAlgo", "()Lcom/mi/fitness/menstrual/data/MenstrualCycleElement;", "setCurrentCurseByAlgo", "(Lcom/mi/fitness/menstrual/data/MenstrualCycleElement;)V", "nextCurseByAlgo", "getNextCurseByAlgo", "setNextCurseByAlgo", "next2ndCurseByAlgo", "getNext2ndCurseByAlgo", "setNext2ndCurseByAlgo", "algoPredictStatus", "getAlgoPredictStatus", "setAlgoPredictStatus", "firstPredictionStart", "", "firstPredictionEnd", "secondPredictionStart", "secondPredictionEnd", "latestPredictionStart", "latestPredictionEnd", "predictionCycleEnd", "currentStartDateLocal", "Lorg/joda/time/LocalDate;", "getCurrentStartDateLocal", "()Lorg/joda/time/LocalDate;", "setCurrentStartDateLocal", "(Lorg/joda/time/LocalDate;)V", "currentCurseEndDateLocal", "getCurrentCurseEndDateLocal", "setCurrentCurseEndDateLocal", "currentOvuDateLocal", "getCurrentOvuDateLocal", "setCurrentOvuDateLocal", "nextStartDateLocal", "getNextStartDateLocal", "setNextStartDateLocal", "nextCurseEndDateLocal", "getNextCurseEndDateLocal", "setNextCurseEndDateLocal", "nextOvuDateLocal", "getNextOvuDateLocal", "setNextOvuDateLocal", "next2ndStartDateLocal", "getNext2ndStartDateLocal", "setNext2ndStartDateLocal", "next2ndCurseEndDateLocal", "getNext2ndCurseEndDateLocal", "setNext2ndCurseEndDateLocal", "next2ndOvuDateLocal", "getNext2ndOvuDateLocal", "setNext2ndOvuDateLocal", "predictionEndDateLocal", "getPredictionEndDateLocal", "setPredictionEndDateLocal", "latestStart", "getLatestStart", "()J", "setLatestStart", "(J)V", "latestInEnd", "getLatestInEnd", "setLatestInEnd", "latestInDays", "getLatestInDays", "setLatestInDays", "ovumIndex", "getOvumIndex", "setOvumIndex", "riskRange", "Lkotlin/ranges/IntRange;", "getRiskRange", "()Lkotlin/ranges/IntRange;", "setRiskRange", "(Lkotlin/ranges/IntRange;)V", "refreshAlgoCurseData", "", "isAlgoNoData", "", "getAlgoLatestInEnd", "inDayCount", "startDate", "isWhichDuration", "Lkotlin/Triple;", "initOvumIndex", "getInDays", DialWidgetType.DATE, "getInterval", "initRiskRange", "getRisRange", "getIntervalStart", "inPredictionDate", "time", "getAlgoIntervalStartDay", "getNextInMillis", "mills", "getNextNotifyOvumMillis", "beforeDays", "getNextRiskNotifyMillis", "isIn", "isBetween", StatConstants.PARAM_START, StatConstants.PARAM_END, "getPredictRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "startMills", "endMills", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlgoCurseManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlgoCurseManager.kt\ncom/xiaomi/fitness/health/curse/AlgoCurseManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n1#2:657\n*E\n"})
public final class AlgoCurseManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AlgoCurseManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: q51
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlgoCurseManager.instance_delegate$lambda$6();
        }
    });

    @Nullable
    private MenstrualCycleElement currentCurseByAlgo;

    @Nullable
    private LocalDate currentCurseEndDateLocal;

    @Nullable
    private LocalDate currentOvuDateLocal;

    @Nullable
    private LocalDate currentStartDateLocal;
    private long firstPredictionEnd;
    private long firstPredictionStart;
    private int latestInDays;
    private long latestInEnd;
    private long latestPredictionEnd;
    private long latestPredictionStart;
    private long latestStart;

    @Nullable
    private MenstrualCycleElement next2ndCurseByAlgo;

    @Nullable
    private LocalDate next2ndCurseEndDateLocal;

    @Nullable
    private LocalDate next2ndOvuDateLocal;

    @Nullable
    private LocalDate next2ndStartDateLocal;

    @Nullable
    private MenstrualCycleElement nextCurseByAlgo;

    @Nullable
    private LocalDate nextCurseEndDateLocal;

    @Nullable
    private LocalDate nextOvuDateLocal;

    @Nullable
    private LocalDate nextStartDateLocal;
    private long predictionCycleEnd;

    @Nullable
    private LocalDate predictionEndDateLocal;
    private long secondPredictionEnd;
    private long secondPredictionStart;
    private int inDaysByAlgo = -1;
    private int intervalByAlgo = -1;
    private int algoPredictStatus = -1;
    private int ovumIndex = -1;

    @NotNull
    private IntRange riskRange = IntRange.Companion.getEMPTY();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/curse/AlgoCurseManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/health/curse/AlgoCurseManager;", "getInstance", "()Lcom/xiaomi/fitness/health/curse/AlgoCurseManager;", "instance$delegate", "Lkotlin/Lazy;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AlgoCurseManager getInstance() {
            return (AlgoCurseManager) AlgoCurseManager.instance$delegate.getValue();
        }
    }

    private final long getAlgoIntervalStartDay(long time) {
        long j = this.firstPredictionStart;
        long j2 = this.secondPredictionStart;
        if (time >= j2 || j > time) {
            j = this.latestPredictionStart;
            if (time < j && j2 <= time) {
                return j2 * ((long) 1000);
            }
        }
        return j * ((long) 1000);
    }

    public static /* synthetic */ long getNextInMillis$default(AlgoCurseManager algoCurseManager, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return algoCurseManager.getNextInMillis(j);
    }

    public static /* synthetic */ long getNextNotifyOvumMillis$default(AlgoCurseManager algoCurseManager, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return algoCurseManager.getNextNotifyOvumMillis(j, i);
    }

    public static /* synthetic */ long getNextRiskNotifyMillis$default(AlgoCurseManager algoCurseManager, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return algoCurseManager.getNextRiskNotifyMillis(j, i);
    }

    private final int initOvumIndex() {
        int i;
        int i2 = this.intervalByAlgo;
        if (i2 >= 60 || i2 < 12) {
            i = -1;
        } else {
            i = (12 > i2 || i2 >= 20) ? i2 - 13 : 6;
        }
        this.ovumIndex = i;
        Logger.i("AlgoCurseManager", "initOvumIndex:  " + i);
        return this.ovumIndex;
    }

    private final IntRange initRiskRange() {
        int i = this.ovumIndex;
        IntRange empty = i <= 0 ? IntRange.Companion.getEMPTY() : new IntRange(i - 5, i + 4);
        this.riskRange = empty;
        Logger.i("AlgoCurseManager", "initRiskRange: " + empty);
        return this.riskRange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlgoCurseManager instance_delegate$lambda$6() {
        return new AlgoCurseManager();
    }

    private final boolean isBetween(LocalDate date, LocalDate start, LocalDate end) {
        return date.isEqual(start) || date.isEqual(end) || (date.isAfter(start) && date.isBefore(end));
    }

    /* JADX INFO: renamed from: getAlgoLatestInEnd, reason: from getter */
    public final long getFirstPredictionEnd() {
        return this.firstPredictionEnd;
    }

    public final int getAlgoPredictStatus() {
        return this.algoPredictStatus;
    }

    @Nullable
    public final MenstrualCycleElement getCurrentCurseByAlgo() {
        return this.currentCurseByAlgo;
    }

    @Nullable
    public final LocalDate getCurrentCurseEndDateLocal() {
        return this.currentCurseEndDateLocal;
    }

    @Nullable
    public final LocalDate getCurrentOvuDateLocal() {
        return this.currentOvuDateLocal;
    }

    @Nullable
    public final LocalDate getCurrentStartDateLocal() {
        return this.currentStartDateLocal;
    }

    public final int getInDays(@NotNull LocalDate date) {
        int intervalDay;
        Intrinsics.checkNotNullParameter(date, "date");
        Triple<Boolean, Boolean, Boolean> tripleIsWhichDuration = isWhichDuration(date);
        if (tripleIsWhichDuration.getFirst().booleanValue()) {
            intervalDay = TimeDateUtil.getIntervalDay(this.currentStartDateLocal, this.currentCurseEndDateLocal);
        } else if (tripleIsWhichDuration.getSecond().booleanValue()) {
            intervalDay = TimeDateUtil.getIntervalDay(this.nextStartDateLocal, this.nextCurseEndDateLocal);
        } else {
            if (!tripleIsWhichDuration.getThird().booleanValue()) {
                return this.inDaysByAlgo;
            }
            intervalDay = TimeDateUtil.getIntervalDay(this.next2ndStartDateLocal, this.next2ndCurseEndDateLocal);
        }
        return intervalDay + 1;
    }

    public final int getInDaysByAlgo() {
        return this.inDaysByAlgo;
    }

    public final int getInterval(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Triple<Boolean, Boolean, Boolean> tripleIsWhichDuration = isWhichDuration(date);
        if (tripleIsWhichDuration.getFirst().booleanValue()) {
            return TimeDateUtil.getIntervalDay(this.currentStartDateLocal, this.nextStartDateLocal);
        }
        return tripleIsWhichDuration.getSecond().booleanValue() ? TimeDateUtil.getIntervalDay(this.nextStartDateLocal, this.next2ndStartDateLocal) : this.intervalByAlgo;
    }

    public final int getIntervalByAlgo() {
        return this.intervalByAlgo;
    }

    @Nullable
    public final LocalDate getIntervalStart(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Logger.d("AlgoCurseManager", "algo getIntervalStart: date = " + date + ",algoPredictStatus: " + this.algoPredictStatus + ", algoInDays:" + this.inDaysByAlgo + ", algoIntervl" + this.intervalByAlgo);
        if (isAlgoNoData()) {
            return null;
        }
        long jLocalDateToTimestamp = TimeDateUtil.localDateToTimestamp(date);
        Logger.d("AlgoCurseManager", "algo getIntervalStart: date = " + date + "; dateTime = " + jLocalDateToTimestamp);
        if (inPredictionDate(jLocalDateToTimestamp)) {
            return new LocalDate(getAlgoIntervalStartDay(jLocalDateToTimestamp));
        }
        if (jLocalDateToTimestamp <= this.predictionCycleEnd) {
            return null;
        }
        LocalDate localDate = new LocalDate(this.latestPredictionStart * ((long) 1000));
        int intervalDay = TimeDateUtil.getIntervalDay(localDate, date);
        int i = this.intervalByAlgo;
        int i2 = (intervalDay < 0 && intervalDay % i != 0) ? (intervalDay / i) - 1 : intervalDay / i;
        LocalDate localDatePlusDays = localDate.plusDays(i2 * i);
        Logger.d("AlgoCurseManager", "algo getIntervalStart: date = " + date + "; gapDays = " + intervalDay + "; interval = " + i + "; intervalNum = " + i2 + "; intervalStart = " + localDatePlusDays);
        return localDatePlusDays;
    }

    public final int getLatestInDays() {
        return this.latestInDays;
    }

    public final long getLatestInEnd() {
        return this.latestInEnd;
    }

    public final long getLatestStart() {
        return this.latestStart;
    }

    @Nullable
    public final MenstrualCycleElement getNext2ndCurseByAlgo() {
        return this.next2ndCurseByAlgo;
    }

    @Nullable
    public final LocalDate getNext2ndCurseEndDateLocal() {
        return this.next2ndCurseEndDateLocal;
    }

    @Nullable
    public final LocalDate getNext2ndOvuDateLocal() {
        return this.next2ndOvuDateLocal;
    }

    @Nullable
    public final LocalDate getNext2ndStartDateLocal() {
        return this.next2ndStartDateLocal;
    }

    @Nullable
    public final MenstrualCycleElement getNextCurseByAlgo() {
        return this.nextCurseByAlgo;
    }

    @Nullable
    public final LocalDate getNextCurseEndDateLocal() {
        return this.nextCurseEndDateLocal;
    }

    public final long getNextInMillis(long mills) {
        if (isAlgoNoData()) {
            return -1L;
        }
        long j = 1000;
        long j2 = mills / j;
        if (!inPredictionDate(j2)) {
            if (j2 > this.predictionCycleEnd) {
                LocalDate intervalStart = getIntervalStart(new LocalDate(CurseExtKt.getZeroMills(mills)));
                Intrinsics.checkNotNull(intervalStart);
                return CurseExtKt.getZeroMills(ExtUtilKt.getMills(intervalStart)) + (((long) this.intervalByAlgo) * 86400000);
            }
            long j3 = this.firstPredictionStart;
            if (j2 < j3 - (((long) this.intervalByAlgo) * 86400000) || j2 >= j3) {
                return -1L;
            }
            return CurseExtKt.getZeroMills(j3 * j);
        }
        MenstrualCycleElement menstrualCycleElement = this.currentCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement);
        if (j2 >= menstrualCycleElement.startDate) {
            MenstrualCycleElement menstrualCycleElement2 = this.nextCurseByAlgo;
            Intrinsics.checkNotNull(menstrualCycleElement2);
            if (j2 < menstrualCycleElement2.startDate) {
                MenstrualCycleElement menstrualCycleElement3 = this.nextCurseByAlgo;
                Intrinsics.checkNotNull(menstrualCycleElement3);
                return CurseExtKt.getZeroMills(menstrualCycleElement3.startDate * j);
            }
        }
        MenstrualCycleElement menstrualCycleElement4 = this.nextCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement4);
        if (j2 >= menstrualCycleElement4.startDate) {
            MenstrualCycleElement menstrualCycleElement5 = this.next2ndCurseByAlgo;
            Intrinsics.checkNotNull(menstrualCycleElement5);
            if (j2 < menstrualCycleElement5.startDate) {
                MenstrualCycleElement menstrualCycleElement6 = this.next2ndCurseByAlgo;
                Intrinsics.checkNotNull(menstrualCycleElement6);
                return CurseExtKt.getZeroMills(menstrualCycleElement6.startDate * j);
            }
        }
        return CurseExtKt.getZeroMills((this.latestPredictionStart * j) + (((long) this.intervalByAlgo) * 86400000));
    }

    public final long getNextNotifyOvumMillis(long mills, int beforeDays) {
        if (isAlgoNoData() || this.ovumIndex == -1) {
            return -1L;
        }
        LocalDate localDateTimestampToLocalDateInner = TimeDateUtil.timestampToLocalDateInner(mills);
        long j = 1000;
        long j2 = mills / j;
        if (!inPredictionDate(j2)) {
            if (j2 > this.predictionCycleEnd) {
                return CurseExtKt.getZeroMills((getNextInMillis(j2) + (((long) (getOvumIndex(localDateTimestampToLocalDateInner) - 1)) * 86400000)) - (((long) beforeDays) * 86400000));
            }
            MenstrualCycleElement menstrualCycleElement = this.currentCurseByAlgo;
            Intrinsics.checkNotNull(menstrualCycleElement);
            if (j2 >= menstrualCycleElement.ovulationDate - (((long) this.intervalByAlgo) * 86400000)) {
                MenstrualCycleElement menstrualCycleElement2 = this.currentCurseByAlgo;
                Intrinsics.checkNotNull(menstrualCycleElement2);
                if (j2 < menstrualCycleElement2.ovulationDate) {
                    MenstrualCycleElement menstrualCycleElement3 = this.currentCurseByAlgo;
                    Intrinsics.checkNotNull(menstrualCycleElement3);
                    return CurseExtKt.getZeroMills((menstrualCycleElement3.ovulationDate * j) - (((long) beforeDays) * 86400000));
                }
            }
            return -1L;
        }
        MenstrualCycleElement menstrualCycleElement4 = this.currentCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement4);
        if (j2 >= menstrualCycleElement4.startDate) {
            MenstrualCycleElement menstrualCycleElement5 = this.currentCurseByAlgo;
            Intrinsics.checkNotNull(menstrualCycleElement5);
            if (j2 < menstrualCycleElement5.ovulationDate) {
                MenstrualCycleElement menstrualCycleElement6 = this.currentCurseByAlgo;
                Intrinsics.checkNotNull(menstrualCycleElement6);
                return CurseExtKt.getZeroMills((menstrualCycleElement6.ovulationDate * j) - (((long) beforeDays) * 86400000));
            }
        }
        MenstrualCycleElement menstrualCycleElement7 = this.currentCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement7);
        if (j2 >= menstrualCycleElement7.ovulationDate) {
            MenstrualCycleElement menstrualCycleElement8 = this.nextCurseByAlgo;
            Intrinsics.checkNotNull(menstrualCycleElement8);
            if (j2 < menstrualCycleElement8.ovulationDate) {
                MenstrualCycleElement menstrualCycleElement9 = this.nextCurseByAlgo;
                Intrinsics.checkNotNull(menstrualCycleElement9);
                return CurseExtKt.getZeroMills((menstrualCycleElement9.ovulationDate * j) - (((long) beforeDays) * 86400000));
            }
        }
        MenstrualCycleElement menstrualCycleElement10 = this.nextCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement10);
        if (j2 >= menstrualCycleElement10.ovulationDate) {
            MenstrualCycleElement menstrualCycleElement11 = this.next2ndCurseByAlgo;
            Intrinsics.checkNotNull(menstrualCycleElement11);
            if (j2 <= menstrualCycleElement11.ovulationDate) {
                MenstrualCycleElement menstrualCycleElement12 = this.next2ndCurseByAlgo;
                Intrinsics.checkNotNull(menstrualCycleElement12);
                return CurseExtKt.getZeroMills((menstrualCycleElement12.ovulationDate * j) - (((long) beforeDays) * 86400000));
            }
        }
        return CurseExtKt.getZeroMills(this.latestPredictionStart + (((long) (getOvumIndex(localDateTimestampToLocalDateInner) - 1)) * 86400000));
    }

    @Nullable
    public final LocalDate getNextOvuDateLocal() {
        return this.nextOvuDateLocal;
    }

    public final long getNextRiskNotifyMillis(long mills, int beforeDays) {
        if (isAlgoNoData() || Intrinsics.areEqual(this.riskRange, IntRange.Companion.getEMPTY())) {
            return -1L;
        }
        MenstrualCycleElement menstrualCycleElement = this.currentCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement);
        long j = 1000;
        long j2 = (menstrualCycleElement.ovulationDate * j) - CurseRecordKt.SPACE_MIN_MILLS;
        MenstrualCycleElement menstrualCycleElement2 = this.nextCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement2);
        long j3 = (menstrualCycleElement2.ovulationDate * j) - CurseRecordKt.SPACE_MIN_MILLS;
        if (mills < j2) {
            return CurseExtKt.getZeroMills(j2 - (((long) beforeDays) * 86400000));
        }
        if (mills < j3) {
            return CurseExtKt.getZeroMills(j3 - (((long) beforeDays) * 86400000));
        }
        return -1L;
    }

    @Nullable
    public final LocalDate getNextStartDateLocal() {
        return this.nextStartDateLocal;
    }

    public final int getOvumIndex() {
        return this.ovumIndex;
    }

    @NotNull
    public final List<Record> getPredictRecords(long startMills, long endMills) {
        long zeroMills;
        if (!isAlgoNoData() && this.intervalByAlgo != -1) {
            MenstrualCycleElement menstrualCycleElement = this.currentCurseByAlgo;
            Intrinsics.checkNotNull(menstrualCycleElement);
            long zeroMills2 = CurseExtKt.getZeroMills((menstrualCycleElement.startDate * ((long) 1000)) - 86400000);
            long zeroMills3 = CurseExtKt.getZeroMills(startMills);
            long zeroMills4 = CurseExtKt.getZeroMills(endMills);
            long jMax = Math.max(Math.min(CurseExtKt.getTodayZeroMills(), zeroMills2), zeroMills3);
            if (jMax >= zeroMills4) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (zeroMills2 == 0) {
                zeroMills = this.latestStart;
            } else {
                LocalDate intervalStart = getIntervalStart(new LocalDate(jMax));
                Intrinsics.checkNotNull(intervalStart);
                zeroMills = CurseExtKt.getZeroMills(TimeExtKt.toMillis(intervalStart));
            }
            long j = ((long) (this.inDaysByAlgo - 1)) * 86400000;
            long j2 = ((long) this.intervalByAlgo) * 86400000;
            if (j2 <= 0) {
                throw new IllegalArgumentException("Step must be positive, was: " + j2 + ".");
            }
            long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(zeroMills, zeroMills4, j2);
            if (zeroMills <= progressionLastElement) {
                while (true) {
                    long j3 = zeroMills + j;
                    if (j3 >= zeroMills3) {
                        long j4 = this.latestStart;
                        if (zeroMills == j4) {
                            int i = this.latestInDays;
                            if (i == 0) {
                                i = this.inDaysByAlgo;
                            }
                            long j5 = j4 + (((long) (i - 1)) * 86400000);
                            if (j5 > CurseExtKt.getTodayZeroMills()) {
                                arrayList.add(new Record(zeroMills, j5, 0L, this.intervalByAlgo, 0, 16, null));
                            }
                        } else {
                            arrayList.add(new Record(zeroMills, j3, 0L, this.intervalByAlgo, 0, 16, null));
                        }
                    }
                    if (zeroMills == progressionLastElement) {
                        break;
                    }
                    zeroMills += j2;
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    public final LocalDate getPredictionEndDateLocal() {
        return this.predictionEndDateLocal;
    }

    @NotNull
    public final IntRange getRisRange(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        int ovumIndex = getOvumIndex(date);
        IntRange empty = ovumIndex <= 0 ? IntRange.Companion.getEMPTY() : new IntRange(ovumIndex - 5, ovumIndex + 4);
        this.riskRange = empty;
        Logger.i("AlgoCurseManager", "initRiskRange: " + empty + ",ovumDay: " + ovumIndex);
        return this.riskRange;
    }

    @NotNull
    public final IntRange getRiskRange() {
        return this.riskRange;
    }

    public final int inDayCount(@NotNull LocalDate startDate) {
        int intervalDay;
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Triple<Boolean, Boolean, Boolean> tripleIsWhichDuration = isWhichDuration(startDate);
        if (tripleIsWhichDuration.getFirst().booleanValue()) {
            intervalDay = TimeDateUtil.getIntervalDay(this.currentStartDateLocal, this.currentCurseEndDateLocal);
        } else if (tripleIsWhichDuration.getSecond().booleanValue()) {
            intervalDay = TimeDateUtil.getIntervalDay(this.nextStartDateLocal, this.nextCurseEndDateLocal);
        } else {
            if (!tripleIsWhichDuration.getThird().booleanValue()) {
                return this.inDaysByAlgo;
            }
            intervalDay = TimeDateUtil.getIntervalDay(this.next2ndStartDateLocal, this.next2ndCurseEndDateLocal);
        }
        return intervalDay + 1;
    }

    public final boolean inPredictionDate(long time) {
        Logger.d("AlgoCurseManager", "inPredictionDate: time = " + time + ",firstPredictionStart = " + this.firstPredictionStart + ",predictionCycleEnd = " + this.predictionCycleEnd);
        return time >= this.firstPredictionStart && time <= this.predictionCycleEnd;
    }

    public final boolean isAlgoNoData() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getAlgoCurseStatus() != 0;
    }

    public final boolean isIn(@NotNull LocalDate date) {
        int iInDayCount;
        Intrinsics.checkNotNullParameter(date, "date");
        long zeroMills = CurseExtKt.getZeroMills(ExtUtilKt.getMills(date));
        Logger.d("AlgoCurseManager", "isIn: date = " + date + "; date getmills = " + ExtUtilKt.getMills(date) + "; latestart = " + this.latestStart + "; latestInend = " + getFirstPredictionEnd() + ",curseManager = " + CurseManager.INSTANCE.getInstance() + ", proxy = " + this);
        long j = this.latestStart + 1;
        if (zeroMills <= getFirstPredictionEnd() && j <= zeroMills) {
            return true;
        }
        LocalDate intervalStart = getIntervalStart(date);
        Logger.d("AlgoCurseManager", "isIn: start = " + intervalStart);
        if (intervalStart == null || (iInDayCount = inDayCount(intervalStart)) == -1) {
            return false;
        }
        LocalDate localDatePlusDays = intervalStart.plusDays(iInDayCount - 1);
        Intrinsics.checkNotNull(localDatePlusDays);
        boolean zIsBetween = isBetween(date, intervalStart, localDatePlusDays);
        Logger.d("AlgoCurseManager", "isIn: date = " + date + "; start = " + intervalStart + "; inDays = " + iInDayCount + "; isIn = " + zIsBetween + "; inEnd = " + localDatePlusDays);
        return zIsBetween;
    }

    @NotNull
    public final Triple<Boolean, Boolean, Boolean> isWhichDuration(@NotNull LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        if (isAlgoNoData()) {
            Boolean bool = Boolean.FALSE;
            return new Triple<>(bool, bool, bool);
        }
        LocalDate localDate = this.currentStartDateLocal;
        if (localDate != null) {
            if (startDate.isAfter(localDate != null ? localDate.minusDays(1) : null) && startDate.isBefore(this.nextStartDateLocal)) {
                Boolean bool2 = Boolean.TRUE;
                Boolean bool3 = Boolean.FALSE;
                return new Triple<>(bool2, bool3, bool3);
            }
        }
        LocalDate localDate2 = this.nextStartDateLocal;
        if (localDate2 != null) {
            if (startDate.isAfter(localDate2 != null ? localDate2.minusDays(1) : null) && startDate.isBefore(this.next2ndStartDateLocal)) {
                Boolean bool4 = Boolean.FALSE;
                return new Triple<>(bool4, Boolean.TRUE, bool4);
            }
        }
        LocalDate localDate3 = this.next2ndStartDateLocal;
        if (localDate3 != null) {
            if (startDate.isAfter(localDate3 != null ? localDate3.minusDays(1) : null)) {
                LocalDate localDate4 = this.predictionEndDateLocal;
                if (startDate.isBefore(localDate4 != null ? localDate4.plusDays(1) : null)) {
                    Boolean bool5 = Boolean.FALSE;
                    return new Triple<>(bool5, bool5, Boolean.TRUE);
                }
            }
        }
        Boolean bool6 = Boolean.FALSE;
        return new Triple<>(bool6, bool6, bool6);
    }

    public final void refreshAlgoCurseData() {
        Object obj;
        Object next;
        Object next2;
        List<AlgoCurseItem> algoCurseData = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getAlgoCurseData();
        if (algoCurseData.isEmpty()) {
            return;
        }
        List<AlgoCurseItem> list = algoCurseData;
        Iterator<T> it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AlgoCurseItem) next).getId() != 0);
        AlgoCurseItem algoCurseItem = (AlgoCurseItem) next;
        if (algoCurseItem == null) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((AlgoCurseItem) next2).getId() != 1);
        AlgoCurseItem algoCurseItem2 = (AlgoCurseItem) next2;
        if (algoCurseItem2 == null) {
            return;
        }
        for (Object obj2 : list) {
            if (((AlgoCurseItem) obj2).getId() == 2) {
                obj = obj2;
                break;
            }
        }
        AlgoCurseItem algoCurseItem3 = (AlgoCurseItem) obj;
        if (algoCurseItem3 == null) {
            return;
        }
        this.inDaysByAlgo = algoCurseItem.getCursePeriod();
        this.intervalByAlgo = algoCurseItem.getMenstrualPeriod();
        this.algoPredictStatus = algoCurseItem.getStatus();
        MenstrualCycleElement menstrualCycleElement = new MenstrualCycleElement();
        menstrualCycleElement.startDate = algoCurseItem.getStartTime();
        menstrualCycleElement.endDate = algoCurseItem.getEndTime();
        menstrualCycleElement.ovulationDate = algoCurseItem.getOvulationTime();
        this.currentCurseByAlgo = menstrualCycleElement;
        MenstrualCycleElement menstrualCycleElement2 = new MenstrualCycleElement();
        menstrualCycleElement2.startDate = algoCurseItem2.getStartTime();
        menstrualCycleElement2.endDate = algoCurseItem2.getEndTime();
        menstrualCycleElement2.ovulationDate = algoCurseItem2.getOvulationTime();
        this.nextCurseByAlgo = menstrualCycleElement2;
        MenstrualCycleElement menstrualCycleElement3 = new MenstrualCycleElement();
        menstrualCycleElement3.startDate = algoCurseItem3.getStartTime();
        menstrualCycleElement3.endDate = algoCurseItem3.getEndTime();
        menstrualCycleElement3.ovulationDate = algoCurseItem3.getOvulationTime();
        this.next2ndCurseByAlgo = menstrualCycleElement3;
        long j = 1000;
        this.firstPredictionStart = CurseExtKt.getZeroMills(((long) algoCurseItem.getStartTime()) * 1000) / j;
        this.firstPredictionEnd = CurseExtKt.getZeroMills(((long) algoCurseItem.getEndTime()) * 1000) / j;
        this.secondPredictionStart = CurseExtKt.getZeroMills(((long) algoCurseItem2.getStartTime()) * 1000) / j;
        this.secondPredictionEnd = CurseExtKt.getZeroMills(((long) algoCurseItem2.getEndTime()) * 1000) / j;
        this.latestPredictionStart = CurseExtKt.getZeroMills(((long) algoCurseItem3.getStartTime()) * 1000) / j;
        this.latestPredictionEnd = CurseExtKt.getZeroMills(((long) algoCurseItem3.getEndTime()) * 1000) / j;
        this.predictionCycleEnd = this.latestPredictionStart + ((((long) this.intervalByAlgo) * 86400000) / j);
        MenstrualCycleElement menstrualCycleElement4 = this.currentCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement4);
        this.currentStartDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement4.startDate);
        MenstrualCycleElement menstrualCycleElement5 = this.currentCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement5);
        this.currentCurseEndDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement5.endDate);
        MenstrualCycleElement menstrualCycleElement6 = this.currentCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement6);
        this.currentOvuDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement6.ovulationDate);
        MenstrualCycleElement menstrualCycleElement7 = this.nextCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement7);
        this.nextStartDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement7.startDate);
        MenstrualCycleElement menstrualCycleElement8 = this.nextCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement8);
        this.nextCurseEndDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement8.endDate);
        MenstrualCycleElement menstrualCycleElement9 = this.nextCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement9);
        this.nextOvuDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement9.ovulationDate);
        MenstrualCycleElement menstrualCycleElement10 = this.next2ndCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement10);
        this.next2ndStartDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement10.startDate);
        MenstrualCycleElement menstrualCycleElement11 = this.next2ndCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement11);
        this.next2ndCurseEndDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement11.endDate);
        MenstrualCycleElement menstrualCycleElement12 = this.next2ndCurseByAlgo;
        Intrinsics.checkNotNull(menstrualCycleElement12);
        this.next2ndOvuDateLocal = TimeDateUtil.timestampToLocalDate(menstrualCycleElement12.ovulationDate);
        this.predictionEndDateLocal = TimeDateUtil.timestampToLocalDate(this.predictionCycleEnd);
        initOvumIndex();
        initRiskRange();
        Logger.d("AlgoCurseManager", "setAlgoCurseData: " + this.currentStartDateLocal + "," + this.currentCurseEndDateLocal + "," + this.currentOvuDateLocal + "," + this.nextStartDateLocal + "," + this.nextCurseEndDateLocal + "," + this.nextOvuDateLocal + "," + this.next2ndStartDateLocal + "," + this.next2ndCurseEndDateLocal + "," + this.next2ndOvuDateLocal + "," + this.predictionEndDateLocal);
    }

    public final void setAlgoPredictStatus(int i) {
        this.algoPredictStatus = i;
    }

    public final void setCurrentCurseByAlgo(@Nullable MenstrualCycleElement menstrualCycleElement) {
        this.currentCurseByAlgo = menstrualCycleElement;
    }

    public final void setCurrentCurseEndDateLocal(@Nullable LocalDate localDate) {
        this.currentCurseEndDateLocal = localDate;
    }

    public final void setCurrentOvuDateLocal(@Nullable LocalDate localDate) {
        this.currentOvuDateLocal = localDate;
    }

    public final void setCurrentStartDateLocal(@Nullable LocalDate localDate) {
        this.currentStartDateLocal = localDate;
    }

    public final void setInDaysByAlgo(int i) {
        this.inDaysByAlgo = i;
    }

    public final void setIntervalByAlgo(int i) {
        this.intervalByAlgo = i;
    }

    public final void setLatestInDays(int i) {
        this.latestInDays = i;
    }

    public final void setLatestInEnd(long j) {
        this.latestInEnd = j;
    }

    public final void setLatestStart(long j) {
        this.latestStart = j;
    }

    public final void setNext2ndCurseByAlgo(@Nullable MenstrualCycleElement menstrualCycleElement) {
        this.next2ndCurseByAlgo = menstrualCycleElement;
    }

    public final void setNext2ndCurseEndDateLocal(@Nullable LocalDate localDate) {
        this.next2ndCurseEndDateLocal = localDate;
    }

    public final void setNext2ndOvuDateLocal(@Nullable LocalDate localDate) {
        this.next2ndOvuDateLocal = localDate;
    }

    public final void setNext2ndStartDateLocal(@Nullable LocalDate localDate) {
        this.next2ndStartDateLocal = localDate;
    }

    public final void setNextCurseByAlgo(@Nullable MenstrualCycleElement menstrualCycleElement) {
        this.nextCurseByAlgo = menstrualCycleElement;
    }

    public final void setNextCurseEndDateLocal(@Nullable LocalDate localDate) {
        this.nextCurseEndDateLocal = localDate;
    }

    public final void setNextOvuDateLocal(@Nullable LocalDate localDate) {
        this.nextOvuDateLocal = localDate;
    }

    public final void setNextStartDateLocal(@Nullable LocalDate localDate) {
        this.nextStartDateLocal = localDate;
    }

    public final void setOvumIndex(int i) {
        this.ovumIndex = i;
    }

    public final void setPredictionEndDateLocal(@Nullable LocalDate localDate) {
        this.predictionEndDateLocal = localDate;
    }

    public final void setRiskRange(@NotNull IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<set-?>");
        this.riskRange = intRange;
    }

    public final int getOvumIndex(@NotNull LocalDate date) {
        int intervalDay;
        Intrinsics.checkNotNullParameter(date, "date");
        Triple<Boolean, Boolean, Boolean> tripleIsWhichDuration = isWhichDuration(date);
        if (tripleIsWhichDuration.getFirst().booleanValue()) {
            intervalDay = TimeDateUtil.getIntervalDay(this.currentStartDateLocal, this.currentOvuDateLocal);
        } else if (tripleIsWhichDuration.getSecond().booleanValue()) {
            intervalDay = TimeDateUtil.getIntervalDay(this.nextStartDateLocal, this.nextOvuDateLocal);
        } else {
            if (!tripleIsWhichDuration.getThird().booleanValue()) {
                return this.ovumIndex;
            }
            intervalDay = TimeDateUtil.getIntervalDay(this.next2ndStartDateLocal, this.next2ndOvuDateLocal);
        }
        return intervalDay + 1;
    }
}
