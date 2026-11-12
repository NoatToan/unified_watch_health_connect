package com.xiaomi.fitness.util;

import cn.miao.health.bean.ManualInputInfo;
import cn.miao.health.bean.MiaoHealthBaseInfo;
import cn.miao.health.bean.MiaoHealthManualInputInfo;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.trail.data.ExerciseRecord;
import com.xiaomi.fitness.trail.model.AddSportTypeModel;
import com.xiaomi.fitness.util.AddTrailHelper;
import com.xiaomi.onetrack.OneTrack;
import defpackage.bxf;
import defpackage.byi;
import defpackage.j1j;
import defpackage.j7m;
import defpackage.ywf;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002OPB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0018¢\u0006\u0002\u0010\u0019J.\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0014J(\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001bH\u0002J \u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001bH\u0002J(\u0010)\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0018\u0010*\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010+\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016J\u001e\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202J\"\u0010\u001a\u001a\u00020\u000b2\u0006\u00103\u001a\u00020,2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b05J\u000e\u00106\u001a\u00020,2\u0006\u00103\u001a\u00020,J\u000e\u00107\u001a\u00020,2\u0006\u00103\u001a\u00020,J\"\u00108\u001a\u00020\u000b2\u0006\u00100\u001a\u00020,2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b05J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u00100\u001a\u00020,J\u000e\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u001fJ\u0010\u0010>\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u000e\u0010?\u001a\u00020\u000b2\u0006\u00100\u001a\u00020,J\u0018\u0010@\u001a\u00020A2\u0006\u00100\u001a\u00020,2\u0006\u0010B\u001a\u00020\u0016H\u0002J\u0018\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020E2\u0006\u00100\u001a\u00020,H\u0002J\u0010\u0010F\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u0010\u0010G\u001a\u00020\u00162\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020I2\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u000e\u0010K\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0016J\u0010\u0010L\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u0010\u0010M\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u0010\u0010N\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/util/AddTrailHelper;", "", "<init>", "()V", "mConsumeChangeByUser", "", "mIntensityChangeByUser", "mDistanceChangeByUser", "mStepChangeByUser", "IsUserChange", "DistanceChangeByUser", "", "ConsumeChangeByUser", "IntensityChangeByUser", "StepChangeByUser", "reset", "initSportList", "", "Lcom/xiaomi/fitness/util/AddTrailHelper$SportTypeInfo;", "getSportName", "", "type", "", "constructPostureArray", "", "()[Ljava/lang/String;", "getExactlyExerciseData", "", DailyRecordKey.sportType, "stepCount", "duration", "", "height", "sex", "getStepSpeed", "getStepFrequency", "minutes", "getWalkStride", "stepCadence", "getPedalSpeed", "durationMinutes", "calculateWalkOrRunDistance", "calculateRidingDistance", "getDefaultRecord", "Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "generate", "manualInputInfo", "Lcn/miao/health/bean/ManualInputInfo;", "exerciseRecord", "callback", "Lcom/xiaomi/fitness/util/AddTrailHelper$OnGenerateResult;", "record", "call", "Lkotlin/Function1;", "fillingExerciseBaseData", "calculateExerciseDistance", "calculateExerciseDerivedData", "constructExerciseEditItem", "", "Lcom/xiaomi/fitness/trail/model/AddSportTypeModel$DetailItem;", "getMinuteBySeconds", "startTime", "switchHmToMiSportType", "syncSportRecord", "constructDataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", OneTrack.Param.TZ, "convertToExerciseRecord", "info", "Lcn/miao/health/bean/MiaoHealthManualInputInfo;", "matchSwimType", "convertToLocalSportType", "infoType", "Lcn/miao/health/bean/ManualInputInfo$SportType;", "convertToManualType", "isSwimType", "isStepType", "isRideType", "deepCopy", "OnGenerateResult", "SportTypeInfo", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddTrailHelper {

    @NotNull
    public static final AddTrailHelper INSTANCE = new AddTrailHelper();
    private static boolean mConsumeChangeByUser;
    private static boolean mDistanceChangeByUser;
    private static boolean mIntensityChangeByUser;
    private static boolean mStepChangeByUser;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/util/AddTrailHelper$OnGenerateResult;", "", "onResult", "", "result", "Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "onError", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnGenerateResult {
        void onError();

        void onResult(@NotNull ExerciseRecord result);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/util/AddTrailHelper$SportTypeInfo;", "", "typeInt", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getTypeInt", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SportTypeInfo {

        @NotNull
        private final String name;
        private final int typeInt;

        public SportTypeInfo(int i, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.typeInt = i;
            this.name = name;
        }

        public static /* synthetic */ SportTypeInfo copy$default(SportTypeInfo sportTypeInfo, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = sportTypeInfo.typeInt;
            }
            if ((i2 & 2) != 0) {
                str = sportTypeInfo.name;
            }
            return sportTypeInfo.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTypeInt() {
            return this.typeInt;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final SportTypeInfo copy(int typeInt, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new SportTypeInfo(typeInt, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SportTypeInfo)) {
                return false;
            }
            SportTypeInfo sportTypeInfo = (SportTypeInfo) other;
            return this.typeInt == sportTypeInfo.typeInt && Intrinsics.areEqual(this.name, sportTypeInfo.name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getTypeInt() {
            return this.typeInt;
        }

        public int hashCode() {
            return (Integer.hashCode(this.typeInt) * 31) + this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "SportTypeInfo(typeInt=" + this.typeInt + ", name=" + this.name + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ManualInputInfo.SportType.values().length];
            try {
                iArr[ManualInputInfo.SportType.WALK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManualInputInfo.SportType.RUN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManualInputInfo.SportType.CLIMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ManualInputInfo.SportType.CYCLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ManualInputInfo.SportType.FREESTYLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ManualInputInfo.SportType.BUTTERFLYSTROKE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ManualInputInfo.SportType.BREASTSTROKE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ManualInputInfo.SportType.FREELANCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ManualInputInfo.SportType.MEDLEYSTROKE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ManualInputInfo.SportType.BACKSTROKE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AddTrailHelper() {
    }

    private final boolean IsUserChange() {
        return mConsumeChangeByUser || mDistanceChangeByUser || mIntensityChangeByUser;
    }

    private final float calculateRidingDistance(int stepCount, long duration) {
        float f = duration;
        return (((getPedalSpeed(stepCount, f / TimeUnit.MINUTES.toMillis(1L)) * 1000) / 3600) * f) / TimeUnit.SECONDS.toMillis(1L);
    }

    private final float calculateWalkOrRunDistance(int stepCount, long duration, float height, String sex) {
        return getStepSpeed(stepCount, duration, height, sex) * duration;
    }

    private final FitnessDataId constructDataId(ExerciseRecord exerciseRecord, int tz) {
        FitnessDataId.Builder builder = new FitnessDataId.Builder();
        builder.setFileType(1);
        builder.setVersion(2);
        builder.setDataType(1);
        builder.setTzIn15Min(tz / 900);
        builder.setTimeStamp(exerciseRecord.getStartTime());
        builder.setSportType(INSTANCE.switchHmToMiSportType(exerciseRecord.getSportType()));
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExerciseRecord convertToExerciseRecord(MiaoHealthManualInputInfo info, ExerciseRecord exerciseRecord) {
        if (info.getDistance() != null && !mDistanceChangeByUser) {
            exerciseRecord.setDistance(info.getDistance().intValue());
        }
        if (info.getCalories() != null && !mConsumeChangeByUser) {
            exerciseRecord.setCalories(info.getCalories().doubleValue());
        }
        if (info.getIntensity() != null && !mIntensityChangeByUser) {
            exerciseRecord.setIntensity(info.getIntensity().intValue());
        }
        if (info.getStep() != null && !mStepChangeByUser && isStepType(exerciseRecord.getSportType()) && exerciseRecord.getSportType() != 4) {
            exerciseRecord.setStep(info.getStep().intValue());
        }
        return exerciseRecord;
    }

    private final int convertToLocalSportType(ManualInputInfo.SportType infoType) {
        switch (WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 5;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return 0;
        }
    }

    private final ManualInputInfo.SportType convertToManualType(int sportType) {
        switch (sportType) {
            case 1:
            case 12:
                return ManualInputInfo.SportType.RUN;
            case 2:
                return ManualInputInfo.SportType.WALK;
            case 3:
                return ManualInputInfo.SportType.CYCLING;
            case 4:
                return ManualInputInfo.SportType.CLIMB;
            case 5:
                return ManualInputInfo.SportType.FREELANCE;
            case 6:
                return ManualInputInfo.SportType.FREESTYLE;
            case 7:
                return ManualInputInfo.SportType.BUTTERFLYSTROKE;
            case 8:
                return ManualInputInfo.SportType.BREASTSTROKE;
            case 9:
                return ManualInputInfo.SportType.MEDLEYSTROKE;
            case 10:
                return ManualInputInfo.SportType.BACKSTROKE;
            case 11:
            default:
                return ManualInputInfo.SportType.WALK;
        }
    }

    private final ExerciseRecord deepCopy(ExerciseRecord exerciseRecord) {
        ExerciseRecord exerciseRecord2 = new ExerciseRecord();
        exerciseRecord2.setDistance(exerciseRecord.getDistance());
        exerciseRecord2.setSportType(exerciseRecord.getSportType());
        exerciseRecord2.setStartTime(exerciseRecord.getStartTime());
        exerciseRecord2.setDuration(exerciseRecord.getDuration());
        exerciseRecord2.setCalories(exerciseRecord.getCalories());
        exerciseRecord2.setStep(exerciseRecord.getStep());
        exerciseRecord2.setIntensity(exerciseRecord.getIntensity());
        return exerciseRecord2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getExactlyExerciseData$lambda$0(Function1 call, ExerciseRecord it) {
        Intrinsics.checkNotNullParameter(call, "$call");
        Intrinsics.checkNotNullParameter(it, "it");
        call.invoke2(it);
        return Unit.INSTANCE;
    }

    private final float getPedalSpeed(int stepCount, float durationMinutes) {
        return (((getStepFrequency(stepCount, durationMinutes) * 1.625f) * 60) * 2.074f) / 1000;
    }

    private final float getStepFrequency(int stepCount, float minutes) {
        if (minutes <= 0.0f) {
            return 0.0f;
        }
        return stepCount / minutes;
    }

    private final float getStepSpeed(int stepCount, long duration, float height, String sex) {
        float stepFrequency = getStepFrequency(stepCount, duration);
        float f = 10;
        return MathKt__MathJVMKt.roundToInt((stepFrequency * getWalkStride(stepFrequency, height, sex)) * f) / f;
    }

    private final float getWalkStride(float stepCadence, float height, String sex) {
        if (height == 0.0f) {
            return 0.0f;
        }
        return (((Intrinsics.areEqual(sex, "male") ? 0.3139f : 0.2975f) * height) * ((float) Math.pow(stepCadence / TimeUnit.MINUTES.toSeconds(1L), 0.5d))) / 100;
    }

    private final boolean isRideType(int sportType) {
        return sportType == 3;
    }

    private final boolean isStepType(int sportType) {
        return sportType == 1 || sportType == 2 || sportType == 4 || sportType == 12;
    }

    private final int matchSwimType(int sportType) {
        switch (sportType) {
            case 6:
                return 2;
            case 7:
                return 4;
            case 8:
                return 1;
            case 9:
                return 0;
            case 10:
                return 3;
            default:
                return -1;
        }
    }

    private final int switchHmToMiSportType(int sportType) {
        switch (sportType) {
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 301;
            case 5:
            case 11:
            default:
                return 8;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return 9;
            case 12:
                return 1;
        }
    }

    public final void ConsumeChangeByUser() {
        mConsumeChangeByUser = true;
    }

    public final void DistanceChangeByUser() {
        mDistanceChangeByUser = true;
    }

    public final void IntensityChangeByUser() {
        mIntensityChangeByUser = true;
    }

    public final void StepChangeByUser() {
        mStepChangeByUser = true;
    }

    public final void calculateExerciseDerivedData(@NotNull ExerciseRecord exerciseRecord, @NotNull final Function1<? super ExerciseRecord, Unit> callback) {
        Intrinsics.checkNotNullParameter(exerciseRecord, "exerciseRecord");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ManualInputInfo manualInputInfo = new ManualInputInfo();
        manualInputInfo.setUserId(AddTrailHelperKt.UNKNOWN_USER);
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        manualInputInfo.setHeight(userProfile$default.getHeight() <= 0.0f ? null : Integer.valueOf((int) userProfile$default.getHeight()));
        manualInputInfo.setWeight(userProfile$default.getWeight() <= 0.0f ? null : Double.valueOf(userProfile$default.getWeight()));
        manualInputInfo.setDuration(Double.valueOf(exerciseRecord.getDuration()));
        manualInputInfo.setSex(Integer.valueOf(Intrinsics.areEqual(userProfile$default.getSex(), "male") ? 1 : 2));
        manualInputInfo.setSportType(convertToManualType(exerciseRecord.getSportType()));
        manualInputInfo.setDistance(Double.valueOf(exerciseRecord.getDistance()));
        manualInputInfo.setVelocity(null);
        Logger.i("pre calculate height: " + manualInputInfo.getHeight() + " weight: " + manualInputInfo.getWeight() + " distance: " + manualInputInfo.getDistance(), new Object[0]);
        generate(manualInputInfo, exerciseRecord, new OnGenerateResult() { // from class: com.xiaomi.fitness.util.AddTrailHelper.calculateExerciseDerivedData.1
            @Override // com.xiaomi.fitness.util.AddTrailHelper.OnGenerateResult
            public void onError() {
            }

            @Override // com.xiaomi.fitness.util.AddTrailHelper.OnGenerateResult
            public void onResult(ExerciseRecord result) {
                Intrinsics.checkNotNullParameter(result, "result");
                callback.invoke2(result);
            }
        });
    }

    @NotNull
    public final ExerciseRecord calculateExerciseDistance(@NotNull ExerciseRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (!isStepType(record.getSportType()) && !isRideType(record.getSportType())) {
            return record;
        }
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        float height = userProfile$default.getHeight();
        String sex = userProfile$default.getSex();
        if (sex == null) {
            sex = "male";
        }
        int step = record.getStep();
        record.setDistance((int) getExactlyExerciseData(record.getSportType(), step, (long) record.getDuration(), height, sex));
        return record;
    }

    @NotNull
    public final List<AddSportTypeModel.DetailItem> constructExerciseEditItem(@NotNull ExerciseRecord exerciseRecord) {
        Intrinsics.checkNotNullParameter(exerciseRecord, "exerciseRecord");
        ArrayList arrayList = new ArrayList();
        int sportType = exerciseRecord.getSportType();
        String string = ResourceExtKt.getString(j1j.F0);
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(byi.b0, (int) exerciseRecord.getDuration());
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        arrayList.add(new AddSportTypeModel.DetailItem(1, string, quantityString, Integer.valueOf(MathKt__MathJVMKt.roundToInt(exerciseRecord.getDuration()))));
        arrayList.add(new AddSportTypeModel.DetailItem(2, ResourceExtKt.getString(j1j.G0), "", Integer.valueOf((int) exerciseRecord.getStartTime())));
        if (isSwimType(sportType) || sportType == 1 || sportType == 12 || sportType == 3 || sportType == 2) {
            String string2 = ResourceExtKt.getString(j1j.P0);
            String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(byi.s, exerciseRecord.getDistance());
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            arrayList.add(new AddSportTypeModel.DetailItem(3, string2, quantityString2, Integer.valueOf(exerciseRecord.getDistance())));
        }
        String string3 = ResourceExtKt.getString(j1j.n2);
        String quantityString3 = ApplicationExtKt.getApplication().getResources().getQuantityString(byi.f4729r, (int) exerciseRecord.getCalories());
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        arrayList.add(new AddSportTypeModel.DetailItem(4, string3, quantityString3, Integer.valueOf(MathKt__MathJVMKt.roundToInt(exerciseRecord.getCalories()))));
        if (isStepType(sportType)) {
            String string4 = ResourceExtKt.getString(j1j.t8);
            String quantityString4 = ApplicationExtKt.getApplication().getResources().getQuantityString(byi.u, exerciseRecord.getStep());
            Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
            arrayList.add(new AddSportTypeModel.DetailItem(5, string4, quantityString4, Integer.valueOf(exerciseRecord.getStep())));
        }
        if (isSwimType(sportType)) {
            arrayList.add(new AddSportTypeModel.DetailItem(6, ResourceExtKt.getString(j1j.Y9), "", Integer.valueOf(j7m.a().b("key_trail_main_posture", 1))));
        }
        return arrayList;
    }

    @NotNull
    public final String[] constructPostureArray() {
        return new String[]{ResourceExtKt.getString(j1j.aa), ResourceExtKt.getString(j1j.ba), ResourceExtKt.getString(j1j.ca), ResourceExtKt.getString(j1j.da), ResourceExtKt.getString(j1j.Z9)};
    }

    @NotNull
    public final ExerciseRecord fillingExerciseBaseData(@NotNull ExerciseRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        float height = userProfile$default.getHeight();
        String sex = userProfile$default.getSex();
        if (sex == null) {
            sex = "male";
        }
        String str = sex;
        if (isStepType(record.getSportType()) || isRideType(record.getSportType())) {
            record.setDistance((int) getExactlyExerciseData(record.getSportType(), record.getStep(), (long) record.getDuration(), height, str));
        }
        return record;
    }

    public final void generate(@NotNull ManualInputInfo manualInputInfo, @NotNull final ExerciseRecord exerciseRecord, @NotNull final OnGenerateResult callback) {
        Intrinsics.checkNotNullParameter(manualInputInfo, "manualInputInfo");
        Intrinsics.checkNotNullParameter(exerciseRecord, "exerciseRecord");
        Intrinsics.checkNotNullParameter(callback, "callback");
        bxf.d().b(manualInputInfo, new ywf() { // from class: com.xiaomi.fitness.util.AddTrailHelper.generate.1
            @Override // defpackage.ywf
            public void onError(int p0, String p1) {
                Logger.i("MiaoHealthService code: " + p0 + " msg " + p1, new Object[0]);
                callback.onError();
            }

            @Override // defpackage.ywf
            public void onResponse(MiaoHealthBaseInfo p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                MiaoHealthManualInputInfo miaoHealthManualInputInfo = (MiaoHealthManualInputInfo) p0;
                Logger.i("MiaoHealthManualInputInfo: " + miaoHealthManualInputInfo, new Object[0]);
                callback.onResult(AddTrailHelper.INSTANCE.convertToExerciseRecord(miaoHealthManualInputInfo, exerciseRecord));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    @NotNull
    public final ExerciseRecord getDefaultRecord(int sportType, int minutes) {
        Logger.i("getDefaultRecord sportType: " + sportType + " minutes: " + minutes, new Object[0]);
        ExerciseRecord exerciseRecord = new ExerciseRecord();
        exerciseRecord.setSportType(sportType);
        exerciseRecord.setDuration((double) minutes);
        exerciseRecord.setStartTime((System.currentTimeMillis() / ((long) 1000)) - ((long) (exerciseRecord.getDuration() * ((double) 60))));
        if (sportType == 1) {
            exerciseRecord.setStep(minutes * 140);
        } else if (sportType == 2) {
            exerciseRecord.setStep(minutes * 80);
        } else if (sportType == 3) {
            exerciseRecord.setStep(minutes * 70);
        } else if (sportType == 4) {
            exerciseRecord.setStep(minutes * 80);
        } else if (sportType == 8) {
            exerciseRecord.setDistance(minutes * 42);
        } else if (sportType == 12) {
            exerciseRecord.setStep(minutes * 140);
        }
        Logger.i("getDefaultRecord: " + exerciseRecord, new Object[0]);
        return exerciseRecord;
    }

    public final float getExactlyExerciseData(int sportType, int stepCount, long duration, float height, @NotNull String sex) {
        Intrinsics.checkNotNullParameter(sex, "sex");
        if (sportType != 1 && sportType != 2) {
            if (sportType == 3) {
                return calculateRidingDistance(stepCount, duration);
            }
            if (sportType != 12) {
                return 0.0f;
            }
        }
        return calculateWalkOrRunDistance(stepCount, duration, height, sex);
    }

    public final int getMinuteBySeconds(long startTime) {
        long j = startTime * ((long) 1000);
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        return (timeUtils.getHourOfDay(j) * 60) + timeUtils.getMinute(j);
    }

    @NotNull
    public final String getSportName(int type) {
        switch (type) {
            case 1:
                return ResourceExtKt.getString(j1j.V6);
            case 2:
                return ResourceExtKt.getString(j1j.C9);
            case 3:
                return ResourceExtKt.getString(j1j.T6);
            case 4:
                return ResourceExtKt.getString(j1j.d3);
            case 5:
                return ResourceExtKt.getString(j1j.O4);
            case 6:
                return ResourceExtKt.getString(j1j.ca);
            case 7:
                return ResourceExtKt.getString(j1j.ba);
            case 8:
                return ResourceExtKt.getString(j1j.aa);
            case 9:
                return ResourceExtKt.getString(j1j.da);
            case 10:
                return ResourceExtKt.getString(j1j.Z9);
            default:
                return "";
        }
    }

    @NotNull
    public final List<SportTypeInfo> initSportList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SportTypeInfo(1, ResourceExtKt.getString(j1j.W6)));
        arrayList.add(new SportTypeInfo(12, ResourceExtKt.getString(j1j.X6)));
        arrayList.add(new SportTypeInfo(2, ResourceExtKt.getString(j1j.C9)));
        arrayList.add(new SportTypeInfo(3, ResourceExtKt.getString(j1j.T6)));
        arrayList.add(new SportTypeInfo(8, ResourceExtKt.getString(j1j.I8)));
        arrayList.add(new SportTypeInfo(5, ResourceExtKt.getString(j1j.O4)));
        return arrayList;
    }

    public final boolean isSwimType(int sportType) {
        switch (sportType) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public final void reset() {
        mConsumeChangeByUser = false;
        mIntensityChangeByUser = false;
        mDistanceChangeByUser = false;
        mStepChangeByUser = false;
    }

    public final void syncSportRecord(@NotNull ExerciseRecord exerciseRecord) {
        Intrinsics.checkNotNullParameter(exerciseRecord, "exerciseRecord");
        long j = 1000;
        long startTime = exerciseRecord.getStartTime() * j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int seconds = (int) timeUnit.toSeconds(TimeZone.getDefault().getOffset(timeUnit.toMillis(startTime)));
        FitnessDataId fitnessDataIdConstructDataId = constructDataId(exerciseRecord, seconds);
        SportBasicReport sportBasicReport = new SportBasicReport(fitnessDataIdConstructDataId);
        sportBasicReport.setSportType(fitnessDataIdConstructDataId.getSportType());
        sportBasicReport.setStartTime(startTime / j);
        sportBasicReport.setDuration(((int) exerciseRecord.getDuration()) * 60);
        sportBasicReport.setCalories(Integer.valueOf((int) exerciseRecord.getCalories()));
        AddTrailHelper addTrailHelper = INSTANCE;
        sportBasicReport.setSteps(addTrailHelper.isStepType(exerciseRecord.getStep()) ? Integer.valueOf(exerciseRecord.getStep()) : null);
        sportBasicReport.setMainPosture(addTrailHelper.isSwimType(exerciseRecord.getSportType()) ? Integer.valueOf(exerciseRecord.getMainPosture()) : null);
        sportBasicReport.setDistance(Integer.valueOf(exerciseRecord.getDistance()));
        sportBasicReport.setEndTime(sportBasicReport.getStartTime() + ((long) (sportBasicReport.getDuration() * 60)));
        boolean zRecordSportReport = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordSportReport("xiaomiwear_app_manually", seconds, sportBasicReport);
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), zRecordSportReport ? j1j.common_set_success : j1j.common_set_error);
        FitnessDataChangedUtils.sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils.INSTANCE, FitnessDataChangedSource.ManualRecord, zRecordSportReport, null, null, false, 16, null);
    }

    public final void getExactlyExerciseData(@NotNull ExerciseRecord record, @NotNull final Function1<? super ExerciseRecord, Unit> call) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(call, "call");
        ExerciseRecord exerciseRecordDeepCopy = deepCopy(record);
        if (!IsUserChange()) {
            exerciseRecordDeepCopy = fillingExerciseBaseData(record);
        } else if (!mDistanceChangeByUser) {
            exerciseRecordDeepCopy = calculateExerciseDistance(record);
        }
        ExerciseRecord exerciseRecordDeepCopy2 = deepCopy(exerciseRecordDeepCopy);
        Logger.i("pre getExactlyExerciseData exerciseRecord: " + exerciseRecordDeepCopy2, new Object[0]);
        calculateExerciseDerivedData(exerciseRecordDeepCopy2, new Function1() { // from class: ju0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddTrailHelper.getExactlyExerciseData$lambda$0(call, (ExerciseRecord) obj);
            }
        });
    }
}
