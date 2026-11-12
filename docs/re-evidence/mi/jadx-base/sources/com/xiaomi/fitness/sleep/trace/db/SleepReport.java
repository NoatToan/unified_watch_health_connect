package com.xiaomi.fitness.sleep.trace.db;

import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.sleep.behavior.AccSleepReport;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes;
import com.xiaomi.fitness.sleep.trace.util.DateNumHelper;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 A2\u00020\u0001:\u0001AB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u0013\u0010;\u001a\u00020/2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010=\u001a\u00020>H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u00178F¢\u0006\u0006\u001a\u0004\b2\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010\u000eR\u0011\u00104\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u00107\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u00106R\u0011\u00109\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b:\u00106R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u00178F¢\u0006\u0006\u001a\u0004\b@\u0010\u0013¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "", "dateNum", "", "<init>", "(J)V", Scopes.PROFILE, "Lcom/xiaomi/fitness/sleep/trace/db/SleepReportProfile;", "list", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;", "(Lcom/xiaomi/fitness/sleep/trace/db/SleepReportProfile;Ljava/util/List;)V", "sleepReportProfile", "getSleepReportProfile", "()Lcom/xiaomi/fitness/sleep/trace/db/SleepReportProfile;", "setSleepReportProfile", "(Lcom/xiaomi/fitness/sleep/trace/db/SleepReportProfile;)V", "sleepStageList", "getSleepStageList", "()Ljava/util/List;", "setSleepStageList", "(Ljava/util/List;)V", "mSortedSleepStageList", "", "accReport", "Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport;", "getAccReport", "()Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport;", "setAccReport", "(Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport;)V", "snoreList", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "getSnoreList", "setSnoreList", "dreamTalkList", "getDreamTalkList", "setDreamTalkList", "noiseList", "getNoiseList", "setNoiseList", "snorePureTotalTime", "", "getSnorePureTotalTime", "()I", "setSnorePureTotalTime", "(I)V", "hasManualAdjustSleepWakeTime", "", "hasDefaultSleepWakeTime", "sleepStages", "getSleepStages", "getProfile", "sleepTime", "getSleepTime", "()J", "sleepStageDuration", "getSleepStageDuration", "wakeTime", "getWakeTime", "equals", "other", "toString", "", "rawSleepStages", "getRawSleepStages", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepReport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SleepReport EMPTY = new SleepReport(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    @Nullable
    private AccSleepReport accReport;

    @Nullable
    private List<AudioAttributes> dreamTalkList;

    @Nullable
    private List<SleepStage> mSortedSleepStageList;

    @Nullable
    private List<AudioAttributes> noiseList;

    @Nullable
    private SleepReportProfile sleepReportProfile;

    @Nullable
    private List<SleepStage> sleepStageList;

    @Nullable
    private List<AudioAttributes> snoreList;
    private int snorePureTotalTime;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepReport$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "empty", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepReport empty() {
            return SleepReport.EMPTY;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SleepReport() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(SleepReport.class, other.getClass())) {
            return false;
        }
        SleepReportProfile sleepReportProfile = ((SleepReport) other).sleepReportProfile;
        SleepReportProfile sleepReportProfile2 = this.sleepReportProfile;
        Intrinsics.checkNotNull(sleepReportProfile2);
        long dateNum = sleepReportProfile2.getDateNum();
        Intrinsics.checkNotNull(sleepReportProfile);
        if (dateNum == sleepReportProfile.getDateNum()) {
            SleepReportProfile sleepReportProfile3 = this.sleepReportProfile;
            Intrinsics.checkNotNull(sleepReportProfile3);
            if (sleepReportProfile3.getSleepTime() == sleepReportProfile.getSleepTime()) {
                SleepReportProfile sleepReportProfile4 = this.sleepReportProfile;
                Intrinsics.checkNotNull(sleepReportProfile4);
                if (sleepReportProfile4.getWakeTime() == sleepReportProfile.getWakeTime()) {
                    SleepReportProfile sleepReportProfile5 = this.sleepReportProfile;
                    Intrinsics.checkNotNull(sleepReportProfile5);
                    if (sleepReportProfile5.getManualSleepTime() == sleepReportProfile.getManualSleepTime()) {
                        SleepReportProfile sleepReportProfile6 = this.sleepReportProfile;
                        Intrinsics.checkNotNull(sleepReportProfile6);
                        if (sleepReportProfile6.getManualWakeTime() == sleepReportProfile.getManualWakeTime()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public final AccSleepReport getAccReport() {
        return this.accReport;
    }

    @Nullable
    public final List<AudioAttributes> getDreamTalkList() {
        return this.dreamTalkList;
    }

    @Nullable
    public final List<AudioAttributes> getNoiseList() {
        return this.noiseList;
    }

    @NotNull
    public final SleepReportProfile getProfile() {
        SleepReportProfile sleepReportProfileEmpty = this.sleepReportProfile;
        if (sleepReportProfileEmpty == null) {
            sleepReportProfileEmpty = SleepReportProfile.INSTANCE.empty();
        }
        Intrinsics.checkNotNull(sleepReportProfileEmpty);
        return sleepReportProfileEmpty;
    }

    @NotNull
    public final List<SleepStage> getRawSleepStages() {
        if (this.sleepStageList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (this.mSortedSleepStageList == null) {
            LinkedList linkedList = new LinkedList();
            List<SleepStage> list = this.sleepStageList;
            Intrinsics.checkNotNull(list);
            for (SleepStage sleepStage : list) {
                if (sleepStage.isSleepStage()) {
                    linkedList.add(sleepStage);
                }
            }
            CollectionsKt__MutableCollectionsJVMKt.sort(linkedList);
            this.mSortedSleepStageList = Collections.unmodifiableList(linkedList);
        }
        List<SleepStage> list2 = this.mSortedSleepStageList;
        Intrinsics.checkNotNull(list2);
        return list2;
    }

    @Nullable
    public final SleepReportProfile getSleepReportProfile() {
        return this.sleepReportProfile;
    }

    public final long getSleepStageDuration() {
        if (hasManualAdjustSleepWakeTime()) {
            return getWakeTime() - getSleepTime();
        }
        long endTime = 0;
        for (SleepStage sleepStage : getRawSleepStages()) {
            if (sleepStage.getStage() == 8) {
                endTime += sleepStage.getEndTime() - sleepStage.getBeginTime();
            }
        }
        return endTime;
    }

    @Nullable
    public final List<SleepStage> getSleepStageList() {
        return this.sleepStageList;
    }

    @NotNull
    public final List<SleepStage> getSleepStages() {
        if (!hasManualAdjustSleepWakeTime()) {
            return getRawSleepStages();
        }
        SleepReportProfile profile = getProfile();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new SleepStage(8, profile.getManualSleepTime(), profile.getManualWakeTime()));
        return linkedList;
    }

    public final long getSleepTime() {
        SleepReportProfile profile = getProfile();
        return hasManualAdjustSleepWakeTime() ? profile.getManualSleepTime() : profile.getSleepTime();
    }

    @Nullable
    public final List<AudioAttributes> getSnoreList() {
        return this.snoreList;
    }

    public final int getSnorePureTotalTime() {
        return this.snorePureTotalTime;
    }

    public final long getWakeTime() {
        SleepReportProfile profile = getProfile();
        return hasManualAdjustSleepWakeTime() ? profile.getManualWakeTime() : profile.getWakeTime();
    }

    public final boolean hasDefaultSleepWakeTime() {
        SleepReportProfile profile = getProfile();
        return (profile.getWakeTime() == profile.getSleepTime() || profile.getWakeTime() == 0 || profile.getSleepTime() == 0) ? false : true;
    }

    public final boolean hasManualAdjustSleepWakeTime() {
        SleepReportProfile profile = getProfile();
        return (profile.getManualSleepTime() == 0 || profile.getManualWakeTime() == 0) ? false : true;
    }

    public final void setAccReport(@Nullable AccSleepReport accSleepReport) {
        this.accReport = accSleepReport;
    }

    public final void setDreamTalkList(@Nullable List<AudioAttributes> list) {
        this.dreamTalkList = list;
    }

    public final void setNoiseList(@Nullable List<AudioAttributes> list) {
        this.noiseList = list;
    }

    public final void setSleepReportProfile(@Nullable SleepReportProfile sleepReportProfile) {
        this.sleepReportProfile = sleepReportProfile;
    }

    public final void setSleepStageList(@Nullable List<SleepStage> list) {
        this.sleepStageList = list;
    }

    public final void setSnoreList(@Nullable List<AudioAttributes> list) {
        this.snoreList = list;
    }

    public final void setSnorePureTotalTime(int i) {
        this.snorePureTotalTime = i;
    }

    @NotNull
    public String toString() {
        SleepReportProfile sleepReportProfile = this.sleepReportProfile;
        List<SleepStage> list = this.sleepStageList;
        return "SleepReport(sleepReportProfile=" + sleepReportProfile + ", sleepStageList=" + (list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null) : null) + ", mSortedSleepStageList=" + this.mSortedSleepStageList + ", accReport=" + this.accReport + ", snoreList=" + this.snoreList + ", dreamTalkList=" + this.dreamTalkList + ", noiseList=" + this.noiseList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SleepReport(@Nullable SleepReportProfile sleepReportProfile) {
        this(sleepReportProfile, null, 2, 0 == true ? 1 : 0);
    }

    public SleepReport(long j) {
        SleepReportProfile sleepReportProfile = new SleepReportProfile();
        this.sleepReportProfile = sleepReportProfile;
        Intrinsics.checkNotNull(sleepReportProfile);
        sleepReportProfile.setDateNum(j);
        long jCalcTimestamp = DateNumHelper.INSTANCE.calcTimestamp(j);
        SleepReportProfile sleepReportProfile2 = this.sleepReportProfile;
        Intrinsics.checkNotNull(sleepReportProfile2);
        sleepReportProfile2.setSleepTime(jCalcTimestamp);
        SleepReportProfile sleepReportProfile3 = this.sleepReportProfile;
        Intrinsics.checkNotNull(sleepReportProfile3);
        sleepReportProfile3.setWakeTime(jCalcTimestamp);
        this.sleepStageList = new LinkedList();
        SleepStage sleepStage = new SleepStage(0, jCalcTimestamp, jCalcTimestamp);
        sleepStage.setDateNum(j);
        List<SleepStage> list = this.sleepStageList;
        Intrinsics.checkNotNull(list);
        list.add(sleepStage);
    }

    public /* synthetic */ SleepReport(SleepReportProfile sleepReportProfile, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sleepReportProfile, (i & 2) != 0 ? null : list);
    }

    @JvmOverloads
    public SleepReport(@Nullable SleepReportProfile sleepReportProfile, @Nullable List<SleepStage> list) {
        this.sleepReportProfile = sleepReportProfile;
        this.sleepStageList = list;
    }
}
