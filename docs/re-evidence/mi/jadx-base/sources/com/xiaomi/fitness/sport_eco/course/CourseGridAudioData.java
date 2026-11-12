package com.xiaomi.fitness.sport_eco.course;

import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import defpackage.e1j;
import defpackage.foi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B1\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\n\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "Ljava/io/Serializable;", "icon", "", "title", "scene", "", DailyRecordKey.sportType, "<init>", "(IILjava/lang/String;I)V", "getIcon", "()I", "getTitle", "getScene", "()Ljava/lang/String;", "getSportType", "BurningRun", "BriskWalk", "Endurance", "HrRun", "BasicTraining", "BurningTraining", "EfficientTraining", "EnduranceTraining", "PrimaryGreaseBurning", "EfficientAndAdvanced", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BasicTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BriskWalk;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BurningRun;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BurningTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$EfficientAndAdvanced;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$EfficientTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$Endurance;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$EnduranceTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$HrRun;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$PrimaryGreaseBurning;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CourseGridAudioData implements Serializable {
    private final int icon;

    @NotNull
    private final String scene;
    private final int sportType;
    private final int title;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BasicTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BasicTraining extends CourseGridAudioData {

        @NotNull
        public static final BasicTraining INSTANCE = new BasicTraining();

        private BasicTraining() {
            super(foi.course_audio_bike_tag_zero, e1j.q0, CourseApiKt.TAG_EXERCISE_BIKE_ERO_BASIS, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BriskWalk;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BriskWalk extends CourseGridAudioData {

        @NotNull
        public static final BriskWalk INSTANCE = new BriskWalk();

        private BriskWalk() {
            super(foi.course_audio_tag_2, e1j.f0, CourseApiKt.TAG_BRISK_WALK, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BurningRun;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BurningRun extends CourseGridAudioData {

        @NotNull
        public static final BurningRun INSTANCE = new BurningRun();

        private BurningRun() {
            super(foi.course_audio_tag_1, e1j.g0, CourseApiKt.TAG_BURNING_RUN, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$BurningTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BurningTraining extends CourseGridAudioData {

        @NotNull
        public static final BurningTraining INSTANCE = new BurningTraining();

        private BurningTraining() {
            super(foi.course_audio_bike_tag_burning, e1j.h0, CourseApiKt.TAG_EXERCISE_BIKE_FAT_BURN, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$EfficientAndAdvanced;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EfficientAndAdvanced extends CourseGridAudioData {

        @NotNull
        public static final EfficientAndAdvanced INSTANCE = new EfficientAndAdvanced();

        private EfficientAndAdvanced() {
            super(foi.B, e1j.i0, CourseApiKt.TAG_SKIPPING_ROPE_EFFICIENT_ADVANCED, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$EfficientTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EfficientTraining extends CourseGridAudioData {

        @NotNull
        public static final EfficientTraining INSTANCE = new EfficientTraining();

        private EfficientTraining() {
            super(foi.course_audio_bike_tag_efficient, e1j.j0, CourseApiKt.TAG_EXERCISE_BIKE_EFFICIENT_METABOLISM, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$Endurance;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Endurance extends CourseGridAudioData {

        @NotNull
        public static final Endurance INSTANCE = new Endurance();

        private Endurance() {
            super(foi.course_audio_tag_3, e1j.k0, CourseApiKt.TAG_ENDURANCE, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$EnduranceTraining;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnduranceTraining extends CourseGridAudioData {

        @NotNull
        public static final EnduranceTraining INSTANCE = new EnduranceTraining();

        private EnduranceTraining() {
            super(foi.course_audio_bike_tag_endurance, e1j.l0, CourseApiKt.TAG_EXERCISE_BIKE_INCREASE_ENDURANCE, 0, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$HrRun;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HrRun extends CourseGridAudioData {

        @NotNull
        public static final HrRun INSTANCE = new HrRun();

        private HrRun() {
            super(foi.course_audio_tag_4, e1j.m0, null, 3, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData$PrimaryGreaseBurning;", "Lcom/xiaomi/fitness/sport_eco/course/CourseGridAudioData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PrimaryGreaseBurning extends CourseGridAudioData {

        @NotNull
        public static final PrimaryGreaseBurning INSTANCE = new PrimaryGreaseBurning();

        private PrimaryGreaseBurning() {
            super(foi.A, e1j.n0, CourseApiKt.TAG_SKIPPING_ROPE_FAT_BURN, 0, 8, null);
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
