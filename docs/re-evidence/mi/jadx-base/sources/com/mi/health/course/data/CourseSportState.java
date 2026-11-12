package com.mi.health.course.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/mi/health/course/data/CourseSportState;", "", "state", "", "desc", "", "<init>", "(ILjava/lang/String;)V", "getState", "()I", "getDesc", "()Ljava/lang/String;", "toString", "Start", "Idle", "Pause", "Restart", "Finish", "Lcom/mi/health/course/data/CourseSportState$Finish;", "Lcom/mi/health/course/data/CourseSportState$Idle;", "Lcom/mi/health/course/data/CourseSportState$Pause;", "Lcom/mi/health/course/data/CourseSportState$Restart;", "Lcom/mi/health/course/data/CourseSportState$Start;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CourseSportState {

    @NotNull
    private final String desc;
    private final int state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mi/health/course/data/CourseSportState$Finish;", "Lcom/mi/health/course/data/CourseSportState;", "validSport", "", "<init>", "(Z)V", "getValidSport", "()Z", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Finish extends CourseSportState {
        private final boolean validSport;

        public Finish(boolean z) {
            super(4, "finish", null);
            this.validSport = z;
        }

        public final boolean getValidSport() {
            return this.validSport;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mi/health/course/data/CourseSportState$Idle;", "Lcom/mi/health/course/data/CourseSportState;", "<init>", "()V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends CourseSportState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(0, "idle", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mi/health/course/data/CourseSportState$Pause;", "Lcom/mi/health/course/data/CourseSportState;", "<init>", "()V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pause extends CourseSportState {

        @NotNull
        public static final Pause INSTANCE = new Pause();

        private Pause() {
            super(2, "pause", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mi/health/course/data/CourseSportState$Restart;", "Lcom/mi/health/course/data/CourseSportState;", "<init>", "()V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Restart extends CourseSportState {

        @NotNull
        public static final Restart INSTANCE = new Restart();

        private Restart() {
            super(3, "restart", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/mi/health/course/data/CourseSportState$Start;", "Lcom/mi/health/course/data/CourseSportState;", "startTime", "", DailyRecordKey.sportType, "<init>", "(II)V", "getStartTime", "()I", "getSportType", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Start extends CourseSportState {
        private final int sportType;
        private final int startTime;

        public Start(int i, int i2) {
            super(1, StatConstants.PARAM_START, null);
            this.startTime = i;
            this.sportType = i2;
        }

        public final int getSportType() {
            return this.sportType;
        }

        public final int getStartTime() {
            return this.startTime;
        }
    }

    public /* synthetic */ CourseSportState(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public String toString() {
        return "CourseSportState(state=" + this.state + ", desc=" + this.desc + ")";
    }

    private CourseSportState(int i, String str) {
        this.state = i;
        this.desc = str;
    }
}
