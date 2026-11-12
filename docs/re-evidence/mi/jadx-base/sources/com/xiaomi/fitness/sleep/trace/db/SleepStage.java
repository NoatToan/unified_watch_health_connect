package com.xiaomi.fitness.sleep.trace.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.onetrack.b.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00010B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\b\u0010&\u001a\u00020\u0003H\u0016J\u0013\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0011\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0000H\u0096\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010.\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010\u000e¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;", "", StepsInfo.KEY_STAGE, "", "beginTime", "", "endTime", "<init>", "(IJJ)V", "()V", "mPoints", "", "id", "getId", "()J", "setId", "(J)V", "dateNum", "getDateNum", "setDateNum", "getStage", "()I", "setStage", "(I)V", "getBeginTime", "setBeginTime", "getEndTime", "setEndTime", "isSleepStage", "", "()Z", "addPoints", "", e.f13808a, "points", "", "getPoints", "()Ljava/util/List;", "hashCode", "equals", "other", "", "toString", "", "compareTo", "that", "duration", "getDuration", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Entity(foreignKeys = {@ForeignKey(childColumns = {"date_num"}, entity = SleepReportProfile.class, onDelete = 5, onUpdate = 5, parentColumns = {"date_num"})}, tableName = "sleep_stage")
@SourceDebugExtension({"SMAP\nSleepStage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepStage.kt\ncom/xiaomi/fitness/sleep/trace/db/SleepStage\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,124:1\n37#2:125\n36#2,3:126\n*S KotlinDebug\n*F\n+ 1 SleepStage.kt\ncom/xiaomi/fitness/sleep/trace/db/SleepStage\n*L\n95#1:125\n95#1:126,3\n*E\n"})
public final class SleepStage implements Comparable<SleepStage> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SleepStage EMPTY = new SleepStage();

    @ColumnInfo(name = "begin_time")
    private long beginTime;

    @ColumnInfo(index = true, name = "date_num")
    private long dateNum;

    @ColumnInfo(name = SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private long endTime;

    @PrimaryKey(autoGenerate = true)
    private long id;

    @NotNull
    private final transient List<Long> mPoints;

    @ColumnInfo(name = StepsInfo.KEY_STAGE)
    private int stage;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepStage$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;", "empty", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepStage empty() {
            return SleepStage.EMPTY;
        }
    }

    public SleepStage(int i, long j, long j2) {
        this.mPoints = new ArrayList();
        this.stage = i;
        this.beginTime = j;
        this.endTime = j2;
    }

    public final void addPoints(long l) {
        this.mPoints.add(Long.valueOf(l));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepStage)) {
            return false;
        }
        SleepStage sleepStage = (SleepStage) other;
        if (this.id == sleepStage.id && this.dateNum == sleepStage.dateNum && this.stage == sleepStage.stage) {
            return this.beginTime == sleepStage.beginTime && this.endTime == sleepStage.endTime;
        }
        return false;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final long getDateNum() {
        return this.dateNum;
    }

    public final long getDuration() {
        long j = this.endTime - this.beginTime;
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final List<Long> getPoints() {
        List<Long> listUnmodifiableList = Collections.unmodifiableList(this.mPoints);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public final int getStage() {
        return this.stage;
    }

    public int hashCode() {
        long j = this.id;
        long j2 = this.dateNum;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.stage) * 31;
        long j3 = this.beginTime;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.endTime;
        return i2 + ((int) ((j4 >>> 32) ^ j4));
    }

    public final boolean isSleepStage() {
        int i = this.stage;
        return (i == 6 || i == 0) ? false : true;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setDateNum(long j) {
        this.dateNum = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setStage(int i) {
        this.stage = i;
    }

    @NotNull
    public String toString() {
        return "SleepStage{mPoints=" + Arrays.toString(this.mPoints.toArray(new Long[0])) + ", id=" + this.id + ", dateNum=" + this.dateNum + ", stage=" + this.stage + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + "}";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SleepStage that) {
        Intrinsics.checkNotNullParameter(that, "that");
        if (Intrinsics.areEqual(this, that)) {
            return 0;
        }
        long j = this.dateNum;
        long j2 = that.dateNum;
        if (j == j2) {
            j = this.beginTime;
            j2 = that.beginTime;
            if (j == j2) {
                int i = this.stage;
                int i2 = that.stage;
                return i != i2 ? i - i2 : (int) (this.endTime - that.endTime);
            }
        }
        return (int) (j - j2);
    }

    public SleepStage() {
        this(0, 0L, 0L);
    }
}
