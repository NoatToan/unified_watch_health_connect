package com.xiaomi.fitness.sleep.trace.analyze;

import android.content.Context;
import com.xiaomi.fitness.sleep.trace.SleepAnalyzeContract;
import com.xiaomi.fitness.sleep.trace.analyze.SleepStageAnalyzer;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.db.SleepReportProfile;
import com.xiaomi.fitness.sleep.trace.db.SleepStage;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.util.DateNumHelper;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.njh;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000 ;2\u00020\u0001:\u0002<;B\u0007¢\u0006\u0004\b9\u0010:J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00120\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\"\u0010 J-\u0010#\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b#\u0010 J-\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H$¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0014H\u0017¢\u0006\u0004\b-\u0010.J'\u00100\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0014H%¢\u0006\u0004\b0\u00101R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepStageAnalyzer;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepAnalyzer;", "Landroid/content/Context;", "appContext", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "sleepTraceLogs", "Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;", "onMergeStages", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "raw", "", "tar", "", "onAdjustSleepStage", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Z", "onCalculateMissedSleepingStage", "(Ljava/util/List;)Ljava/util/List;", "Lnjh;", "", "", "points", "performCalculateMissedSleepingStage", "ss", "ssNext", "findLessSleepStage", "(Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;)Ljava/util/List;", "context", "dateTime", "stageList", "", "onRemoveInvalidSleepStage", "(Landroid/content/Context;JLjava/util/List;)V", "ctx", "onRemoveInvalidEndSleepStage", "onRemoveInvalidBeginSleepStage", "log", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;", "factory", "", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "onParseSleepStage", "(Landroid/content/Context;Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;)[Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "dateNum", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "analyzeSleep", "(Landroid/content/Context;J)Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "dateTimeMillis", "onLoadSleepTraceLog", "(Landroid/content/Context;J)Ljava/util/List;", "", "getName", "()Ljava/lang/String;", "name", "getVersion", "()I", "version", "<init>", "()V", "Companion", "StageMerger", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class SleepStageAnalyzer implements SleepAnalyzer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "SleepStageAnalyzer";

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J>\u0010\u0013\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepStageAnalyzer$Companion;", "", "<init>", "()V", "TAG", "", "isValidSleepStage", "", StepsInfo.KEY_STAGE, "Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;", "duration", "", "doTrimList", "", "stageList", "", "begin", "", StatConstants.PARAM_END, "trimStageList", "sleepFilter", "Lkotlin/Function1;", "wakeupFilter", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSleepStageAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepStageAnalyzer.kt\ncom/xiaomi/fitness/sleep/trace/analyze/SleepStageAnalyzer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,367:1\n360#2,7:368\n388#2,7:375\n*S KotlinDebug\n*F\n+ 1 SleepStageAnalyzer.kt\ncom/xiaomi/fitness/sleep/trace/analyze/SleepStageAnalyzer$Companion\n*L\n358#1:368,7\n361#1:375,7\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void doTrimList(List<SleepStage> stageList, int begin, int end) {
            if (begin == -1 && end == -1) {
                stageList.clear();
            }
            Iterator<SleepStage> it = stageList.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                if ((begin != -1 && i < begin) || (end != -1 && i > end)) {
                    it.remove();
                }
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isValidSleepStage(SleepStage stage, long duration) {
            return stage != null && stage.getStage() == 8 && stage.getDuration() >= duration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void trimStageList(List<SleepStage> stageList, Function1<? super SleepStage, Boolean> sleepFilter, Function1<? super SleepStage, Boolean> wakeupFilter) {
            int iNextIndex;
            Iterator<SleepStage> it = stageList.iterator();
            int i = 0;
            while (true) {
                iNextIndex = -1;
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (sleepFilter.invoke2(it.next()).booleanValue()) {
                    break;
                } else {
                    i++;
                }
            }
            ListIterator<SleepStage> listIterator = stageList.listIterator(stageList.size());
            while (listIterator.hasPrevious()) {
                if (wakeupFilter.invoke2(listIterator.previous()).booleanValue()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            doTrimList(stageList, i, iNextIndex);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepStageAnalyzer$StageMerger;", "", "<init>", "()V", "stageList", "Ljava/util/LinkedList;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;", "offer", "", StepsInfo.KEY_STAGE, "", "time", "", "peekLast", "sleepStageList", "", "getSleepStageList", "()Ljava/util/List;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StageMerger {

        @NotNull
        private final LinkedList<SleepStage> stageList = new LinkedList<>();

        @NotNull
        public final List<SleepStage> getSleepStageList() {
            return this.stageList;
        }

        public final void offer(int stage, long time) {
            if (stage == 0) {
                return;
            }
            SleepStage sleepStagePeekLast = peekLast();
            if (sleepStagePeekLast.getStage() == stage) {
                sleepStagePeekLast.setEndTime(time);
                sleepStagePeekLast.addPoints(time);
                return;
            }
            if (sleepStagePeekLast != SleepStage.INSTANCE.empty()) {
                sleepStagePeekLast.setEndTime(sleepStagePeekLast.getStage() != 8 ? sleepStagePeekLast.getEndTime() : time);
            }
            SleepStage sleepStage = new SleepStage(stage, time, time);
            sleepStage.addPoints(time);
            this.stageList.addLast(sleepStage);
        }

        @NotNull
        public final SleepStage peekLast() {
            SleepStage sleepStagePeekLast = this.stageList.peekLast();
            return sleepStagePeekLast == null ? SleepStage.INSTANCE.empty() : sleepStagePeekLast;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean analyzeSleep$lambda$0(int i, SleepStage sleepStage) {
        return INSTANCE.isValidSleepStage(sleepStage, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean analyzeSleep$lambda$1(int i, SleepStage sleepStage) {
        return INSTANCE.isValidSleepStage(sleepStage, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean analyzeSleep$lambda$2(int i, SleepStage sleepStage) {
        return INSTANCE.isValidSleepStage(sleepStage, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean analyzeSleep$lambda$3(int i, SleepStage sleepStage) {
        return INSTANCE.isValidSleepStage(sleepStage, i);
    }

    private final List<SleepStage> findLessSleepStage(SleepStage ss, SleepStage ssNext) {
        if (ss == null || ssNext == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (ssNext.getBeginTime() - ss.getEndTime() < SleepAnalyzeContract.INSTANCE.getUnprotectedSleepDuration()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new SleepStage(6, ss.getEndTime(), ss.getEndTime()));
        linkedList.add(new SleepStage(8, ss.getEndTime(), ssNext.getBeginTime()));
        return linkedList;
    }

    private final boolean onAdjustSleepStage(Context appContext, List<SleepStage> raw, List<SleepStage> tar) {
        int iLastIndexOf;
        if (tar.isEmpty()) {
            return tar.addAll(onCalculateMissedSleepingStage(raw));
        }
        SleepStage sleepStage = tar.get(tar.size() - 1);
        long jCalcPredictWakeupTime = UserSleepModel.INSTANCE.getInstance().calcPredictWakeupTime(appContext, sleepStage.getEndTime(), 0L);
        if ((jCalcPredictWakeupTime == 0 || sleepStage.getEndTime() <= jCalcPredictWakeupTime) && (iLastIndexOf = raw.lastIndexOf(sleepStage)) < raw.size() - 1 && iLastIndexOf >= 0) {
            return tar.addAll(findLessSleepStage(sleepStage, raw.get(iLastIndexOf + 1)));
        }
        return false;
    }

    private final List<SleepStage> onCalculateMissedSleepingStage(List<SleepStage> raw) {
        if (new LinkedList(raw).isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (SleepStage sleepStage : raw) {
            Iterator<Long> it = sleepStage.getPoints().iterator();
            while (it.hasNext()) {
                linkedList.add(new njh(Integer.valueOf(sleepStage.getStage()), Long.valueOf(it.next().longValue())));
            }
        }
        return performCalculateMissedSleepingStage(linkedList);
    }

    private final List<SleepStage> onMergeStages(Context appContext, List<SleepTraceLog> sleepTraceLogs) {
        StageMerger stageMerger = new StageMerger();
        SleepTracePoint.RecyclerFactory recyclerFactoryNewRecyclerFactory = SleepTracePoint.INSTANCE.newRecyclerFactory();
        Iterator<SleepTraceLog> it = sleepTraceLogs.iterator();
        while (it.hasNext()) {
            for (SleepTracePoint sleepTracePoint : onParseSleepStage(appContext, it.next(), recyclerFactoryNewRecyclerFactory)) {
                stageMerger.offer(sleepTracePoint.getStage(), sleepTracePoint.getTimestamp());
                recyclerFactoryNewRecyclerFactory.recycle(sleepTracePoint);
            }
        }
        return stageMerger.getSleepStageList();
    }

    private final void onRemoveInvalidBeginSleepStage(Context context, long dateTime, List<SleepStage> stageList) {
        if (stageList.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        long earliestSleepTime = UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(context, dateTime).getEarliestSleepTime();
        for (SleepStage sleepStage : stageList) {
            if (sleepStage.getEndTime() < earliestSleepTime) {
                linkedList.add(sleepStage);
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        Iterator itDescendingIterator = linkedList.descendingIterator();
        while (itDescendingIterator.hasNext() && ((SleepStage) itDescendingIterator.next()).getStage() == 8) {
            itDescendingIterator.remove();
        }
        stageList.removeAll(linkedList);
    }

    private final void onRemoveInvalidEndSleepStage(Context ctx, long dateTime, List<SleepStage> stageList) {
        if (stageList.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        long latestWakeupTime = UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(ctx, dateTime).getLatestWakeupTime();
        int size = stageList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                SleepStage sleepStage = stageList.get(size);
                if (sleepStage.getBeginTime() < latestWakeupTime) {
                    break;
                }
                linkedList.add(sleepStage);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        SleepStage sleepStage2 = (SleepStage) linkedList.getLast();
        if (sleepStage2 != null && sleepStage2.getStage() == 8) {
            linkedList.removeLast();
        }
        Iterator itDescendingIterator = linkedList.descendingIterator();
        long[] jArr = new long[3];
        while (itDescendingIterator.hasNext()) {
            SleepStage sleepStage3 = (SleepStage) itDescendingIterator.next();
            if (sleepStage3.getStage() == 6) {
                System.arraycopy(jArr, 0, jArr, 1, 2);
                jArr[0] = sleepStage3.getBeginTime();
            }
            if (jArr[0] - jArr[2] < SleepAnalyzeContract.INSTANCE.getUnprotectedSleepDuration()) {
                stageList.removeAll(linkedList);
                return;
            }
        }
    }

    private final void onRemoveInvalidSleepStage(Context context, long dateTime, List<SleepStage> stageList) {
        if (stageList.isEmpty()) {
            return;
        }
        onRemoveInvalidBeginSleepStage(context, dateTime, stageList);
        onRemoveInvalidEndSleepStage(context, dateTime, stageList);
    }

    private final List<SleepStage> performCalculateMissedSleepingStage(List<? extends njh<Integer, Long>> points) {
        int iIntValue;
        long jLongValue;
        long j;
        LinkedList linkedList = new LinkedList();
        int size = points.size() - 1;
        long j2 = -1;
        long j3 = -1;
        while (-1 < size) {
            njh<Integer, Long> njhVar = points.get(size);
            Integer num = njhVar.f27979a;
            if (num != null) {
                Intrinsics.checkNotNull(num);
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            Long l = njhVar.f27980b;
            if (l != null) {
                Intrinsics.checkNotNull(l);
                jLongValue = l.longValue();
            } else {
                jLongValue = j2;
            }
            if (iIntValue != -1 && jLongValue != j2) {
                if (j3 == j2) {
                    j = jLongValue;
                } else if (j3 - jLongValue >= SleepAnalyzeContract.INSTANCE.getSleepingCycleDuration()) {
                    long j4 = jLongValue;
                    SleepStage sleepStage = new SleepStage(8, jLongValue, j3);
                    if (linkedList.size() > 0 && ((SleepStage) linkedList.getFirst()).getStage() == 8) {
                        linkedList.addFirst(new SleepStage(6, j3, j3));
                    }
                    linkedList.addFirst(sleepStage);
                    j = j4;
                } else {
                    j = jLongValue;
                    if (linkedList.size() > 0) {
                        SleepStage sleepStage2 = (SleepStage) linkedList.getFirst();
                        if (sleepStage2.getStage() == iIntValue) {
                            sleepStage2.setBeginTime(j);
                        } else {
                            linkedList.addFirst(new SleepStage(iIntValue, j, j));
                        }
                    }
                }
                j3 = j;
            }
            size--;
            j2 = -1;
        }
        return linkedList;
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzer
    @Nullable
    public SleepReport analyzeSleep(@NotNull Context appContext, long dateNum) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        long jCalcTimestamp = DateNumHelper.INSTANCE.calcTimestamp(dateNum);
        List<SleepTraceLog> listOnLoadSleepTraceLog = onLoadSleepTraceLog(appContext, jCalcTimestamp);
        LogExtKt.logi("Merged stage " + (listOnLoadSleepTraceLog != null ? Integer.valueOf(listOnLoadSleepTraceLog.size()) : AbstractJsonLexerKt.NULL));
        if (listOnLoadSleepTraceLog == null || listOnLoadSleepTraceLog.isEmpty()) {
            return null;
        }
        List<SleepStage> listUnmodifiableList = Collections.unmodifiableList(onMergeStages(appContext, listOnLoadSleepTraceLog));
        Intrinsics.checkNotNull(listUnmodifiableList);
        LogExtKt.logi("Merged stage " + CollectionsKt___CollectionsKt.joinToString$default(listUnmodifiableList, null, null, null, 0, null, null, 63, null));
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList(listUnmodifiableList);
        SleepAnalyzeContract sleepAnalyzeContract = SleepAnalyzeContract.INSTANCE;
        final int prepareSleepDuration = sleepAnalyzeContract.getPrepareSleepDuration();
        final int unprotectedSleepDuration = sleepAnalyzeContract.getUnprotectedSleepDuration();
        Companion companion = INSTANCE;
        companion.trimStageList(linkedList, new Function1() { // from class: ozm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepStageAnalyzer.analyzeSleep$lambda$0(prepareSleepDuration, (SleepStage) obj));
            }
        }, new Function1() { // from class: pzm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepStageAnalyzer.analyzeSleep$lambda$1(unprotectedSleepDuration, (SleepStage) obj));
            }
        });
        onRemoveInvalidSleepStage(appContext, jCalcTimestamp, linkedList);
        companion.trimStageList(linkedList, new Function1() { // from class: qzm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepStageAnalyzer.analyzeSleep$lambda$2(prepareSleepDuration, (SleepStage) obj));
            }
        }, new Function1() { // from class: rzm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepStageAnalyzer.analyzeSleep$lambda$3(unprotectedSleepDuration, (SleepStage) obj));
            }
        });
        LogExtKt.logi("After filter stage " + CollectionsKt___CollectionsKt.joinToString$default(linkedList, null, null, null, 0, null, null, 63, null));
        Intrinsics.checkNotNull(listUnmodifiableList);
        if (onAdjustSleepStage(appContext, listUnmodifiableList, linkedList)) {
            CollectionsKt__MutableCollectionsJVMKt.sort(linkedList);
            onRemoveInvalidSleepStage(appContext, jCalcTimestamp, linkedList);
            LogExtKt.logi("After adjust stage " + CollectionsKt___CollectionsKt.joinToString$default(linkedList, null, null, null, 0, null, null, 63, null));
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        if (linkedList.size() == 1) {
            if (Math.abs(UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(appContext, jCalcTimestamp).getEarliestSleepTime() - linkedList.get(0).getBeginTime()) < TimeUnit.SECONDS.toMillis(1L)) {
                return null;
            }
        }
        Iterator<SleepStage> it = linkedList.iterator();
        while (it.hasNext()) {
            SleepStage next = it.next();
            if (next.isSleepStage()) {
                next.setDateNum(dateNum);
            } else {
                it.remove();
            }
        }
        SleepReportProfile sleepReportProfile = new SleepReportProfile();
        sleepReportProfile.setDateNum(dateNum);
        sleepReportProfile.setSleepTime(linkedList.get(0).getBeginTime());
        sleepReportProfile.setWakeTime(linkedList.get(linkedList.size() - 1).getEndTime());
        return new SleepReport(sleepReportProfile, linkedList);
    }

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzer
    @NotNull
    public abstract String getName();

    @Override // com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzer
    public abstract int getVersion();

    @Nullable
    public abstract List<SleepTraceLog> onLoadSleepTraceLog(@NotNull Context appContext, long dateTimeMillis);

    @NotNull
    public abstract SleepTracePoint[] onParseSleepStage(@NotNull Context appContext, @NotNull SleepTraceLog log, @NotNull SleepTracePoint.RecyclerFactory factory);
}
