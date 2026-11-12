package com.huami.moving.config;

import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\bd\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:W\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'\u0010()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefB#\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0093\u0001ghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001¨\u0006½\u0001"}, d2 = {"Lcom/huami/moving/config/DataItem;", "", "", "a", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "b", "getId", "id", "c", "getUnit", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "AerobicTE", "AnaerobicTE", "AverageAltitude", "AverageFreq", "AverageHr", "AveragePace", "AveragePaddleTime", "AveragePower", "AveragePullingTime", "AverageRowingFreq", "AverageSlope", "AverageSpeed", "AverageStepFreq", "AverageStress", "AverageStride", "AverageStrokeDistance", "AverageStrokeRate", "AverageTemperature", "AverageUpstairsFloors", "BackhandPercentage", "BackhandSwing", "BestPace", "Calorie", "CyclingTime", SportAnalytics.ParamValue.DataName.DISTANCE, "DownhillDistance", "DownhillDropMax", "DownhillDropTotal", "DownhillTimes", "DownstairsFloors", "DownstairsHeight", "ExerciseLoad", "ExerciseTime", "ForehandPercentage", "ForehandSwing", "GolfAvgAngle", "GolfAvgBeat", "GolfAvgDownTime", "GolfAvgScore", "GolfAvgUpTime", "GolfSwingCount", "HighestAltitude", "HighestFreq", "HighestRowingFreq", "LowestAltitude", "MaxHr", "MaxPower", "MaxSlope", "MaxSpO2", "MaxSpeed", "MaxStepFreq", "MaxStress", "MaxStrokeRate", "MaxTemperature", "MaxVO2", "MinHr", "MinSpO2", "MinStress", "MinTemperature", "PauseTime", "PoolLength", "PoolUnit", "RopeBreaks", "RunningTime", "ServePercentage", "ServeTimes", "Step", "SubItemTime", "SwimStyle", "SwimmingTime", "SwitchTime", "Swolf", "TotalClimb", "TotalDown", "TotalGroups", "TotalJumps", "TotalRestTime", "TotalRows", "TotalStrokes", "TotalSwing", "TotalTime", "TotalUp", "Trips", "UpstairsFloors", "UpstairsHeight", "WorkValue", "Lcom/huami/moving/config/DataItem$Distance;", "Lcom/huami/moving/config/DataItem$TotalJumps;", "Lcom/huami/moving/config/DataItem$TotalRows;", "Lcom/huami/moving/config/DataItem$RopeBreaks;", "Lcom/huami/moving/config/DataItem$DownhillTimes;", "Lcom/huami/moving/config/DataItem$DownhillDistance;", "Lcom/huami/moving/config/DataItem$DownhillDropMax;", "Lcom/huami/moving/config/DataItem$DownhillDropTotal;", "Lcom/huami/moving/config/DataItem$TotalTime;", "Lcom/huami/moving/config/DataItem$ExerciseTime;", "Lcom/huami/moving/config/DataItem$PauseTime;", "Lcom/huami/moving/config/DataItem$TotalRestTime;", "Lcom/huami/moving/config/DataItem$SwimmingTime;", "Lcom/huami/moving/config/DataItem$CyclingTime;", "Lcom/huami/moving/config/DataItem$RunningTime;", "Lcom/huami/moving/config/DataItem$SwitchTime;", "Lcom/huami/moving/config/DataItem$UpstairsFloors;", "Lcom/huami/moving/config/DataItem$DownstairsFloors;", "Lcom/huami/moving/config/DataItem$UpstairsHeight;", "Lcom/huami/moving/config/DataItem$DownstairsHeight;", "Lcom/huami/moving/config/DataItem$AverageUpstairsFloors;", "Lcom/huami/moving/config/DataItem$SwimStyle;", "Lcom/huami/moving/config/DataItem$Trips;", "Lcom/huami/moving/config/DataItem$TotalStrokes;", "Lcom/huami/moving/config/DataItem$AverageStrokeDistance;", "Lcom/huami/moving/config/DataItem$Swolf;", "Lcom/huami/moving/config/DataItem$AverageStrokeRate;", "Lcom/huami/moving/config/DataItem$MaxStrokeRate;", "Lcom/huami/moving/config/DataItem$PoolLength;", "Lcom/huami/moving/config/DataItem$PoolUnit;", "Lcom/huami/moving/config/DataItem$AveragePace;", "Lcom/huami/moving/config/DataItem$BestPace;", "Lcom/huami/moving/config/DataItem$AverageSpeed;", "Lcom/huami/moving/config/DataItem$MaxSpeed;", "Lcom/huami/moving/config/DataItem$AverageStepFreq;", "Lcom/huami/moving/config/DataItem$MaxStepFreq;", "Lcom/huami/moving/config/DataItem$AverageStride;", "Lcom/huami/moving/config/DataItem$Step;", "Lcom/huami/moving/config/DataItem$HighestAltitude;", "Lcom/huami/moving/config/DataItem$LowestAltitude;", "Lcom/huami/moving/config/DataItem$AverageAltitude;", "Lcom/huami/moving/config/DataItem$TotalClimb;", "Lcom/huami/moving/config/DataItem$TotalUp;", "Lcom/huami/moving/config/DataItem$TotalDown;", "Lcom/huami/moving/config/DataItem$AverageSlope;", "Lcom/huami/moving/config/DataItem$MaxSlope;", "Lcom/huami/moving/config/DataItem$TotalSwing;", "Lcom/huami/moving/config/DataItem$ForehandSwing;", "Lcom/huami/moving/config/DataItem$BackhandSwing;", "Lcom/huami/moving/config/DataItem$ServeTimes;", "Lcom/huami/moving/config/DataItem$ForehandPercentage;", "Lcom/huami/moving/config/DataItem$BackhandPercentage;", "Lcom/huami/moving/config/DataItem$ServePercentage;", "Lcom/huami/moving/config/DataItem$GolfSwingCount;", "Lcom/huami/moving/config/DataItem$GolfAvgBeat;", "Lcom/huami/moving/config/DataItem$GolfAvgUpTime;", "Lcom/huami/moving/config/DataItem$GolfAvgDownTime;", "Lcom/huami/moving/config/DataItem$GolfAvgAngle;", "Lcom/huami/moving/config/DataItem$GolfAvgScore;", "Lcom/huami/moving/config/DataItem$Calorie;", "Lcom/huami/moving/config/DataItem$AverageRowingFreq;", "Lcom/huami/moving/config/DataItem$HighestRowingFreq;", "Lcom/huami/moving/config/DataItem$AveragePullingTime;", "Lcom/huami/moving/config/DataItem$AveragePaddleTime;", "Lcom/huami/moving/config/DataItem$AverageFreq;", "Lcom/huami/moving/config/DataItem$HighestFreq;", "Lcom/huami/moving/config/DataItem$AverageHr;", "Lcom/huami/moving/config/DataItem$MaxHr;", "Lcom/huami/moving/config/DataItem$MinHr;", "Lcom/huami/moving/config/DataItem$AverageStress;", "Lcom/huami/moving/config/DataItem$MaxStress;", "Lcom/huami/moving/config/DataItem$MinStress;", "Lcom/huami/moving/config/DataItem$AverageTemperature;", "Lcom/huami/moving/config/DataItem$MaxTemperature;", "Lcom/huami/moving/config/DataItem$MinTemperature;", "Lcom/huami/moving/config/DataItem$TotalGroups;", "Lcom/huami/moving/config/DataItem$MaxSpO2;", "Lcom/huami/moving/config/DataItem$MinSpO2;", "Lcom/huami/moving/config/DataItem$AerobicTE;", "Lcom/huami/moving/config/DataItem$AnaerobicTE;", "Lcom/huami/moving/config/DataItem$ExerciseLoad;", "Lcom/huami/moving/config/DataItem$MaxVO2;", "Lcom/huami/moving/config/DataItem$AveragePower;", "Lcom/huami/moving/config/DataItem$MaxPower;", "Lcom/huami/moving/config/DataItem$WorkValue;", "Lcom/huami/moving/config/DataItem$SubItemTime;", "moving_release"}, k = 1, mv = {1, 5, 1})
public abstract class DataItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String unit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AerobicTE;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AerobicTE extends DataItem {

        @NotNull
        public static final AerobicTE INSTANCE = new AerobicTE();

        private AerobicTE() {
            super("有氧TE", "aerobicTrainingEffect", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AnaerobicTE;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnaerobicTE extends DataItem {

        @NotNull
        public static final AnaerobicTE INSTANCE = new AnaerobicTE();

        private AnaerobicTE() {
            super("无氧TE", "anaerobicTrainingEffect", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageAltitude;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageAltitude extends DataItem {

        @NotNull
        public static final AverageAltitude INSTANCE = new AverageAltitude();

        private AverageAltitude() {
            super("平均海拔", "averageAltitude", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageFreq;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageFreq extends DataItem {

        @NotNull
        public static final AverageFreq INSTANCE = new AverageFreq();

        private AverageFreq() {
            super("平均频率", "averageFrequency", "次/分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageHr;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageHr extends DataItem {

        @NotNull
        public static final AverageHr INSTANCE = new AverageHr();

        private AverageHr() {
            super("平均心率", "averageHeartRate", "次/分（bpm）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AveragePace;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AveragePace extends DataItem {

        @NotNull
        public static final AveragePace INSTANCE = new AveragePace();

        private AveragePace() {
            super("平均配速", "averagePace", "秒/米", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AveragePaddleTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AveragePaddleTime extends DataItem {

        @NotNull
        public static final AveragePaddleTime INSTANCE = new AveragePaddleTime();

        private AveragePaddleTime() {
            super("平均收桨用时", "averagePaddleTime", "秒（s）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AveragePower;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AveragePower extends DataItem {

        @NotNull
        public static final AveragePower INSTANCE = new AveragePower();

        private AveragePower() {
            super("平均功率", "averagePower", "W", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AveragePullingTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AveragePullingTime extends DataItem {

        @NotNull
        public static final AveragePullingTime INSTANCE = new AveragePullingTime();

        private AveragePullingTime() {
            super("平均拉桨用时", "averagePullingTime", "秒（s）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageRowingFreq;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageRowingFreq extends DataItem {

        @NotNull
        public static final AverageRowingFreq INSTANCE = new AverageRowingFreq();

        private AverageRowingFreq() {
            super("平均划频", "averageRowingFrequency", "次/分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageSlope;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageSlope extends DataItem {

        @NotNull
        public static final AverageSlope INSTANCE = new AverageSlope();

        private AverageSlope() {
            super("平均坡度", "averageSlope", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageSpeed;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageSpeed extends DataItem {

        @NotNull
        public static final AverageSpeed INSTANCE = new AverageSpeed();

        private AverageSpeed() {
            super("平均速度", "averageSpeed", "公里/时（km/h）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageStepFreq;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageStepFreq extends DataItem {

        @NotNull
        public static final AverageStepFreq INSTANCE = new AverageStepFreq();

        private AverageStepFreq() {
            super("平均步频", "averageCadence", "步/分（spm）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageStress;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageStress extends DataItem {

        @NotNull
        public static final AverageStress INSTANCE = new AverageStress();

        private AverageStress() {
            super("平均压力", "averageStress", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageStride;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageStride extends DataItem {

        @NotNull
        public static final AverageStride INSTANCE = new AverageStride();

        private AverageStride() {
            super("平均步幅", "averageStride", "厘米（cm）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageStrokeDistance;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageStrokeDistance extends DataItem {

        @NotNull
        public static final AverageStrokeDistance INSTANCE = new AverageStrokeDistance();

        private AverageStrokeDistance() {
            super("平均划水距离", "averageDistancePerStroke", "米", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageStrokeRate;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageStrokeRate extends DataItem {

        @NotNull
        public static final AverageStrokeRate INSTANCE = new AverageStrokeRate();

        private AverageStrokeRate() {
            super("平均划水速率", "averageStrokeRate", "次/分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageTemperature;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageTemperature extends DataItem {

        @NotNull
        public static final AverageTemperature INSTANCE = new AverageTemperature();

        private AverageTemperature() {
            super("平均温度", "averageTemperature", "摄氏度（℃）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$AverageUpstairsFloors;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class AverageUpstairsFloors extends DataItem {

        @NotNull
        public static final AverageUpstairsFloors INSTANCE = new AverageUpstairsFloors();

        private AverageUpstairsFloors() {
            super("平均每分钟上楼层数", "averageFloorsClimbedPerMinute", "层/分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$BackhandPercentage;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BackhandPercentage extends DataItem {

        @NotNull
        public static final BackhandPercentage INSTANCE = new BackhandPercentage();

        private BackhandPercentage() {
            super("反手比例", "backhandPercentage", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$BackhandSwing;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BackhandSwing extends DataItem {

        @NotNull
        public static final BackhandSwing INSTANCE = new BackhandSwing();

        private BackhandSwing() {
            super("反手挥拍次数", "timesOfBackhandSwing", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$BestPace;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class BestPace extends DataItem {

        @NotNull
        public static final BestPace INSTANCE = new BestPace();

        private BestPace() {
            super("最佳配速", "bestPace", "秒/米", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$Calorie;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Calorie extends DataItem {

        @NotNull
        public static final Calorie INSTANCE = new Calorie();

        private Calorie() {
            super("消耗", "cal", "千卡（kcal）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/moving/config/DataItem$Companion;", "", "", "id", "Lcom/huami/moving/config/DataItem;", "getItemById", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final DataItem getItemById(@NotNull String id) {
            Object next;
            Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new DataItem[]{Distance.INSTANCE, TotalJumps.INSTANCE, TotalRows.INSTANCE, RopeBreaks.INSTANCE, DownhillTimes.INSTANCE, DownhillDistance.INSTANCE, DownhillDropMax.INSTANCE, DownhillDropTotal.INSTANCE, TotalTime.INSTANCE, ExerciseTime.INSTANCE, PauseTime.INSTANCE, TotalRestTime.INSTANCE, SwimmingTime.INSTANCE, CyclingTime.INSTANCE, RunningTime.INSTANCE, SwitchTime.INSTANCE, UpstairsFloors.INSTANCE, DownstairsFloors.INSTANCE, UpstairsHeight.INSTANCE, DownstairsHeight.INSTANCE, AverageUpstairsFloors.INSTANCE, SwimStyle.INSTANCE, Trips.INSTANCE, TotalStrokes.INSTANCE, AverageStrokeDistance.INSTANCE, Swolf.INSTANCE, AverageStrokeRate.INSTANCE, MaxStrokeRate.INSTANCE, PoolLength.INSTANCE, PoolUnit.INSTANCE, AveragePace.INSTANCE, BestPace.INSTANCE, AverageSpeed.INSTANCE, MaxSpeed.INSTANCE, AverageStepFreq.INSTANCE, MaxStepFreq.INSTANCE, AverageStride.INSTANCE, Step.INSTANCE, HighestAltitude.INSTANCE, LowestAltitude.INSTANCE, AverageAltitude.INSTANCE, TotalClimb.INSTANCE, TotalUp.INSTANCE, TotalDown.INSTANCE, AverageSlope.INSTANCE, MaxSlope.INSTANCE, TotalSwing.INSTANCE, ForehandSwing.INSTANCE, BackhandSwing.INSTANCE, ServeTimes.INSTANCE, ForehandPercentage.INSTANCE, BackhandPercentage.INSTANCE, ServePercentage.INSTANCE, GolfSwingCount.INSTANCE, GolfAvgBeat.INSTANCE, GolfAvgUpTime.INSTANCE, GolfAvgDownTime.INSTANCE, GolfAvgAngle.INSTANCE, GolfAvgScore.INSTANCE, Calorie.INSTANCE, AverageRowingFreq.INSTANCE, HighestRowingFreq.INSTANCE, AveragePullingTime.INSTANCE, AveragePaddleTime.INSTANCE, AverageFreq.INSTANCE, HighestFreq.INSTANCE, AverageHr.INSTANCE, MaxHr.INSTANCE, MinHr.INSTANCE, AverageStress.INSTANCE, MaxStress.INSTANCE, MinStress.INSTANCE, AverageTemperature.INSTANCE, MaxTemperature.INSTANCE, MinTemperature.INSTANCE, TotalGroups.INSTANCE, MaxSpO2.INSTANCE, MinSpO2.INSTANCE, AerobicTE.INSTANCE, AnaerobicTE.INSTANCE, ExerciseLoad.INSTANCE, MaxVO2.INSTANCE, AveragePower.INSTANCE, MaxPower.INSTANCE, WorkValue.INSTANCE, SubItemTime.INSTANCE}).iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.areEqual(((DataItem) next).getId(), id)) {
                    return (DataItem) next;
                }
            }
            next = null;
            return (DataItem) next;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$CyclingTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class CyclingTime extends DataItem {

        @NotNull
        public static final CyclingTime INSTANCE = new CyclingTime();

        private CyclingTime() {
            super("骑行用时", "cyclingTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$Distance;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Distance extends DataItem {

        @NotNull
        public static final Distance INSTANCE = new Distance();

        private Distance() {
            super("距离", "distance", "米", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$DownhillDistance;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownhillDistance extends DataItem {

        @NotNull
        public static final DownhillDistance INSTANCE = new DownhillDistance();

        private DownhillDistance() {
            super("累计滑降距离", "totalDistanceOfDownhill", "米", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$DownhillDropMax;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownhillDropMax extends DataItem {

        @NotNull
        public static final DownhillDropMax INSTANCE = new DownhillDropMax();

        private DownhillDropMax() {
            super("最大滑降落差", "maximumDownhillDrop", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$DownhillDropTotal;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownhillDropTotal extends DataItem {

        @NotNull
        public static final DownhillDropTotal INSTANCE = new DownhillDropTotal();

        private DownhillDropTotal() {
            super("累计滑降落差", "totalDownhillDrop", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$DownhillTimes;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownhillTimes extends DataItem {

        @NotNull
        public static final DownhillTimes INSTANCE = new DownhillTimes();

        private DownhillTimes() {
            super("滑降次数", "timesOfDownhill", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$DownstairsFloors;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownstairsFloors extends DataItem {

        @NotNull
        public static final DownstairsFloors INSTANCE = new DownstairsFloors();

        private DownstairsFloors() {
            super("下楼层数", "decentFloors", "层", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$DownstairsHeight;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class DownstairsHeight extends DataItem {

        @NotNull
        public static final DownstairsHeight INSTANCE = new DownstairsHeight();

        private DownstairsHeight() {
            super("下楼高度", "decentHeight", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$ExerciseLoad;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ExerciseLoad extends DataItem {

        @NotNull
        public static final ExerciseLoad INSTANCE = new ExerciseLoad();

        private ExerciseLoad() {
            super("本次运动负荷", "trainingLoadOfThisActivity", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$ExerciseTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ExerciseTime extends DataItem {

        @NotNull
        public static final ExerciseTime INSTANCE = new ExerciseTime();

        private ExerciseTime() {
            super("运动用时", "exerciseTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$ForehandPercentage;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ForehandPercentage extends DataItem {

        @NotNull
        public static final ForehandPercentage INSTANCE = new ForehandPercentage();

        private ForehandPercentage() {
            super("正手比例", "forehandPercentage", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$ForehandSwing;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ForehandSwing extends DataItem {

        @NotNull
        public static final ForehandSwing INSTANCE = new ForehandSwing();

        private ForehandSwing() {
            super("正手挥拍次数", "timesOfForehandSwing", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$GolfAvgAngle;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfAvgAngle extends DataItem {

        @NotNull
        public static final GolfAvgAngle INSTANCE = new GolfAvgAngle();

        private GolfAvgAngle() {
            super("平均平面", "averageGolfAngle", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$GolfAvgBeat;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfAvgBeat extends DataItem {

        @NotNull
        public static final GolfAvgBeat INSTANCE = new GolfAvgBeat();

        private GolfAvgBeat() {
            super("平均节奏", "averageGolfBeat", "无", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$GolfAvgDownTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfAvgDownTime extends DataItem {

        @NotNull
        public static final GolfAvgDownTime INSTANCE = new GolfAvgDownTime();

        private GolfAvgDownTime() {
            super("平均下杆", "averageGolfDownTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$GolfAvgScore;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfAvgScore extends DataItem {

        @NotNull
        public static final GolfAvgScore INSTANCE = new GolfAvgScore();

        private GolfAvgScore() {
            super("平均得分", "averageGolfScore", "分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$GolfAvgUpTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfAvgUpTime extends DataItem {

        @NotNull
        public static final GolfAvgUpTime INSTANCE = new GolfAvgUpTime();

        private GolfAvgUpTime() {
            super("平均上杆", "averageGolfUpTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$GolfSwingCount;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class GolfSwingCount extends DataItem {

        @NotNull
        public static final GolfSwingCount INSTANCE = new GolfSwingCount();

        private GolfSwingCount() {
            super("总杆数", "golfSwingCounter", "无", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$HighestAltitude;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HighestAltitude extends DataItem {

        @NotNull
        public static final HighestAltitude INSTANCE = new HighestAltitude();

        private HighestAltitude() {
            super("最高海拔", "highestAltitude", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$HighestFreq;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HighestFreq extends DataItem {

        @NotNull
        public static final HighestFreq INSTANCE = new HighestFreq();

        private HighestFreq() {
            super("最高频率", "highestFrequency", "次/分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$HighestRowingFreq;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class HighestRowingFreq extends DataItem {

        @NotNull
        public static final HighestRowingFreq INSTANCE = new HighestRowingFreq();

        private HighestRowingFreq() {
            super("最高划频", "highestRowingFrequency", "次/分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$LowestAltitude;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class LowestAltitude extends DataItem {

        @NotNull
        public static final LowestAltitude INSTANCE = new LowestAltitude();

        private LowestAltitude() {
            super("最低海拔", "lowestAltitude", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxHr;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxHr extends DataItem {

        @NotNull
        public static final MaxHr INSTANCE = new MaxHr();

        private MaxHr() {
            super("最高心率", "maximumHeartRate", "次/分（bpm）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxPower;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxPower extends DataItem {

        @NotNull
        public static final MaxPower INSTANCE = new MaxPower();

        private MaxPower() {
            super("最大功率", "maximumPower", "W", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxSlope;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxSlope extends DataItem {

        @NotNull
        public static final MaxSlope INSTANCE = new MaxSlope();

        private MaxSlope() {
            super("最大坡度", "maximumSlope", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxSpO2;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxSpO2 extends DataItem {

        @NotNull
        public static final MaxSpO2 INSTANCE = new MaxSpO2();

        private MaxSpO2() {
            super("最高血氧饱和度", "maximumSpO2", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxSpeed;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxSpeed extends DataItem {

        @NotNull
        public static final MaxSpeed INSTANCE = new MaxSpeed();

        private MaxSpeed() {
            super("最大速度", "maxSpeed", "公里/时（km/h）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxStepFreq;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxStepFreq extends DataItem {

        @NotNull
        public static final MaxStepFreq INSTANCE = new MaxStepFreq();

        private MaxStepFreq() {
            super("最高步频", "maximumCadence", "步/分（spm）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxStress;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxStress extends DataItem {

        @NotNull
        public static final MaxStress INSTANCE = new MaxStress();

        private MaxStress() {
            super("最高压力", "maximumStress", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxStrokeRate;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxStrokeRate extends DataItem {

        @NotNull
        public static final MaxStrokeRate INSTANCE = new MaxStrokeRate();

        private MaxStrokeRate() {
            super("最大划水速率", "maximumStrokeRate", "次/分", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxTemperature;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxTemperature extends DataItem {

        @NotNull
        public static final MaxTemperature INSTANCE = new MaxTemperature();

        private MaxTemperature() {
            super("最高温度", "highestTemperature", "摄氏度（℃）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MaxVO2;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MaxVO2 extends DataItem {

        @NotNull
        public static final MaxVO2 INSTANCE = new MaxVO2();

        private MaxVO2() {
            super("最大摄氧量", "VO2max", "ml/kg/min", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MinHr;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MinHr extends DataItem {

        @NotNull
        public static final MinHr INSTANCE = new MinHr();

        private MinHr() {
            super("最低心率", "minimumHeartRate", "次/分（bpm）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MinSpO2;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MinSpO2 extends DataItem {

        @NotNull
        public static final MinSpO2 INSTANCE = new MinSpO2();

        private MinSpO2() {
            super("最低血氧饱和度", "minimumSpO2", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MinStress;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MinStress extends DataItem {

        @NotNull
        public static final MinStress INSTANCE = new MinStress();

        private MinStress() {
            super("最低压力", "minimumStress", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$MinTemperature;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class MinTemperature extends DataItem {

        @NotNull
        public static final MinTemperature INSTANCE = new MinTemperature();

        private MinTemperature() {
            super("最低温度", "lowestTemperature", "摄氏度（℃）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$PauseTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class PauseTime extends DataItem {

        @NotNull
        public static final PauseTime INSTANCE = new PauseTime();

        private PauseTime() {
            super("暂停用时", "pauseTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$PoolLength;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class PoolLength extends DataItem {

        @NotNull
        public static final PoolLength INSTANCE = new PoolLength();

        private PoolLength() {
            super("泳池长度", "poolLength", "米或码", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$PoolUnit;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class PoolUnit extends DataItem {

        @NotNull
        public static final PoolUnit INSTANCE = new PoolUnit();

        private PoolUnit() {
            super("泳池长度单位", "unit", "米或码", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$RopeBreaks;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RopeBreaks extends DataItem {

        @NotNull
        public static final RopeBreaks INSTANCE = new RopeBreaks();

        private RopeBreaks() {
            super("断绳次数", "numberOfRopeBreaks", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$RunningTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class RunningTime extends DataItem {

        @NotNull
        public static final RunningTime INSTANCE = new RunningTime();

        private RunningTime() {
            super("跑步用时", "runningTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$ServePercentage;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ServePercentage extends DataItem {

        @NotNull
        public static final ServePercentage INSTANCE = new ServePercentage();

        private ServePercentage() {
            super("发球比例", "percentageOfServeTimes", "%", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$ServeTimes;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ServeTimes extends DataItem {

        @NotNull
        public static final ServeTimes INSTANCE = new ServeTimes();

        private ServeTimes() {
            super("发球次数", "serveTimes", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$Step;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Step extends DataItem {

        @NotNull
        public static final Step INSTANCE = new Step();

        private Step() {
            super("步数", GetWatermarkAPI.KEY_NAME_STEPS, "步", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$SubItemTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SubItemTime extends DataItem {

        @NotNull
        public static final SubItemTime INSTANCE = new SubItemTime();

        private SubItemTime() {
            super("分项用时", "subItemTime", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$SwimStyle;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SwimStyle extends DataItem {

        @NotNull
        public static final SwimStyle INSTANCE = new SwimStyle();

        private SwimStyle() {
            super("主泳姿", "mainSwimmingStyle", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$SwimmingTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SwimmingTime extends DataItem {

        @NotNull
        public static final SwimmingTime INSTANCE = new SwimmingTime();

        private SwimmingTime() {
            super("游泳用时", "swimmingTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$SwitchTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class SwitchTime extends DataItem {

        @NotNull
        public static final SwitchTime INSTANCE = new SwitchTime();

        private SwitchTime() {
            super("换项用时1", "switchTime1", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$Swolf;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Swolf extends DataItem {

        @NotNull
        public static final Swolf INSTANCE = new Swolf();

        private Swolf() {
            super("Swolf", "swolf", "无单位", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalClimb;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalClimb extends DataItem {

        @NotNull
        public static final TotalClimb INSTANCE = new TotalClimb();

        private TotalClimb() {
            super("累计爬坡", "totalClimbDistance", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalDown;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalDown extends DataItem {

        @NotNull
        public static final TotalDown INSTANCE = new TotalDown();

        private TotalDown() {
            super("累计下降", "elevationLoss", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalGroups;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalGroups extends DataItem {

        @NotNull
        public static final TotalGroups INSTANCE = new TotalGroups();

        private TotalGroups() {
            super("总组数", "totalGroups", "组", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalJumps;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalJumps extends DataItem {

        @NotNull
        public static final TotalJumps INSTANCE = new TotalJumps();

        private TotalJumps() {
            super("总计数", "totalNumberOfJumps", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalRestTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalRestTime extends DataItem {

        @NotNull
        public static final TotalRestTime INSTANCE = new TotalRestTime();

        private TotalRestTime() {
            super("组间休息总用时", "restTimeBetweenGroups", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalRows;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalRows extends DataItem {

        @NotNull
        public static final TotalRows INSTANCE = new TotalRows();

        private TotalRows() {
            super("总划次", "totalTimesOfRowing", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalStrokes;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalStrokes extends DataItem {

        @NotNull
        public static final TotalStrokes INSTANCE = new TotalStrokes();

        private TotalStrokes() {
            super("总划水次数", "totalStrokes", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalSwing;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalSwing extends DataItem {

        @NotNull
        public static final TotalSwing INSTANCE = new TotalSwing();

        private TotalSwing() {
            super("总挥拍次数", "totalTimesOfSwing", "次", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalTime;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalTime extends DataItem {

        @NotNull
        public static final TotalTime INSTANCE = new TotalTime();

        private TotalTime() {
            super("总用时", "totalTime", "秒", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$TotalUp;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class TotalUp extends DataItem {

        @NotNull
        public static final TotalUp INSTANCE = new TotalUp();

        private TotalUp() {
            super("累计上升", "elevationGain", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$Trips;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Trips extends DataItem {

        @NotNull
        public static final Trips INSTANCE = new Trips();

        private Trips() {
            super("趟数", "trips", "趟", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$UpstairsFloors;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpstairsFloors extends DataItem {

        @NotNull
        public static final UpstairsFloors INSTANCE = new UpstairsFloors();

        private UpstairsFloors() {
            super("上楼层数", "upstairFloors", "层", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$UpstairsHeight;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpstairsHeight extends DataItem {

        @NotNull
        public static final UpstairsHeight INSTANCE = new UpstairsHeight();

        private UpstairsHeight() {
            super("上楼高度", "upstairHeight", "米（m）", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/config/DataItem$WorkValue;", "Lcom/huami/moving/config/DataItem;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class WorkValue extends DataItem {

        @NotNull
        public static final WorkValue INSTANCE = new WorkValue();

        private WorkValue() {
            super("功", "deviceWork", "KJ", null);
        }
    }

    private DataItem(String str, String str2, String str3) {
        this.desc = str;
        this.id = str2;
        this.unit = str3;
    }

    public /* synthetic */ DataItem(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    @JvmStatic
    @Nullable
    public static final DataItem getItemById(@NotNull String str) {
        return INSTANCE.getItemById(str);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public /* synthetic */ DataItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, null);
    }
}
