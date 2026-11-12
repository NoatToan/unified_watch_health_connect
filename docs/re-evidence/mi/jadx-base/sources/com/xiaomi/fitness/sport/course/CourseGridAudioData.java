package com.xiaomi.fitness.sport.course;

import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import defpackage.c1j;
import defpackage.eoi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B1\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;", "Ljava/io/Serializable;", "icon", "", "title", "scene", "", DailyRecordKey.sportType, "<init>", "(IILjava/lang/String;I)V", "getIcon", "()I", "getTitle", "getScene", "()Ljava/lang/String;", "getSportType", "BurningRun", "BriskWalk", "Endurance", "HrRun", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$BriskWalk;", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$BurningRun;", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$Endurance;", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$HrRun;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CourseGridAudioData implements Serializable {
    private final int icon;

    @NotNull
    private final String scene;
    private final int sportType;
    private final int title;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$BriskWalk;", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BriskWalk extends CourseGridAudioData {

        @NotNull
        public static final BriskWalk INSTANCE = new BriskWalk();

        private BriskWalk() {
            super(eoi.course_audio_tag_2, c1j.Q0, CourseApiKt.TAG_BRISK_WALK, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$BurningRun;", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BurningRun extends CourseGridAudioData {

        @NotNull
        public static final BurningRun INSTANCE = new BurningRun();

        private BurningRun() {
            super(eoi.course_audio_tag_1, c1j.R0, CourseApiKt.TAG_BURNING_RUN, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$Endurance;", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Endurance extends CourseGridAudioData {

        @NotNull
        public static final Endurance INSTANCE = new Endurance();

        private Endurance() {
            super(eoi.course_audio_tag_3, c1j.S0, CourseApiKt.TAG_ENDURANCE, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseGridAudioData$HrRun;", "Lcom/xiaomi/fitness/sport/course/CourseGridAudioData;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HrRun extends CourseGridAudioData {

        @NotNull
        public static final HrRun INSTANCE = new HrRun();

        private HrRun() {
            super(eoi.course_audio_tag_4, c1j.T0, null, 3, 4, null);
        }
    }

    public /* synthetic */ CourseGridAudioData(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, i3);
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getScene() {
        return this.scene;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getTitle() {
        return this.title;
    }

    private CourseGridAudioData(int i, int i2, String str, int i3) {
        this.icon = i;
        this.title = i2;
        this.scene = str;
        this.sportType = i3;
    }

    public /* synthetic */ CourseGridAudioData(int i, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 2 : i3, null);
    }
}
