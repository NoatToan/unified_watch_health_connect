package com.xiaomi.fit.fitness.impl.internal.sport;

import com.xiaomi.fit.data.common.data.sport.DivingSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.GroupSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.GroupSportRecord;
import com.xiaomi.fit.data.common.data.sport.ITSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.OneGolfShot;
import com.xiaomi.fit.data.common.data.sport.OneSkiGlide;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.SwimmingPassage;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.OneSportRecord;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0013H\u0002JS\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0019J0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u00062\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0013H\u0002J*\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0002J0\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0013H\u0002J\u001e\u0010#\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u0006\u0010$\u001a\u00020%H\u0002J0\u0010&\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0013H\u0002J\u001e\u0010'\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u0006\u0010$\u001a\u00020(H\u0002¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/internal/sport/SportRecordConverter;", "", "<init>", "()V", "convertSportRecord", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", DailyRecordKey.sportType, "", "recordList", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordVersion", "(ILjava/util/List;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/lang/Integer;)Ljava/util/Map;", "processIntervalDivingInfo", "", "recordMap", "", "processCommonSportRecord", "supportRecordKey", "", "correctionValue", "", "([Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Ljava/util/List;Ljava/util/Map;FI)V", "getSportRecordList", "sportKey", "getTheValueBySportKey", "", "key", "sportRecord", "Lcom/xiaomi/fit/fitness/parser/data/OneSportRecord;", "processIntervalTrainingSpecialInfo", "sportRecordList", "computeITSportDetailInfo", "recordInfo", "Lcom/xiaomi/fit/data/common/data/sport/ITSportDetailInfo;", "processGroupSportSpecialInfo", "computeGroupRecord", "Lcom/xiaomi/fit/data/common/data/sport/GroupSportRecord;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordConverter.kt\ncom/xiaomi/fit/fitness/impl/internal/sport/SportRecordConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1863#2:647\n1863#2,2:648\n1864#2:650\n1863#2,2:651\n1863#2,2:655\n13402#3:653\n13403#3:657\n1#4:654\n*S KotlinDebug\n*F\n+ 1 SportRecordConverter.kt\ncom/xiaomi/fit/fitness/impl/internal/sport/SportRecordConverter\n*L\n87#1:647\n88#1:648,2\n87#1:650\n111#1:651,2\n296#1:655,2\n155#1:653\n155#1:657\n*E\n"})
public final class SportRecordConverter {

    @NotNull
    public static final String TAG = "SportRecordConverter";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SportRecordConverter instance = new SportRecordConverter();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/internal/sport/SportRecordConverter$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/impl/internal/sport/SportRecordConverter;", "getInstance", "()Lcom/xiaomi/fit/fitness/impl/internal/sport/SportRecordConverter;", "TAG", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportRecordConverter getInstance() {
            return SportRecordConverter.instance;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            try {
                iArr[SportRecordKey.WholeKMPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportRecordKey.SwimmingInfo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.RopeSkipStumbleInfo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.SwimPassage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportRecordKey.GolfInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportRecordKey.SkiInfo.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportRecordKey.SwimmingHr.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportRecordKey.Hr.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportRecordKey.Stress.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SportRecordKey.Spo2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SportRecordKey.Power.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SportRecordKey.Resistance.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SportRecordKey.Count.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SportRecordKey.Frequency.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SportRecordKey.Distance.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SportRecordKey.Pace.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SportRecordKey.Step.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SportRecordKey.StepsLength.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SportRecordKey.Height.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SportRecordKey.LandingImpact.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[SportRecordKey.TouchdownTime.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[SportRecordKey.InTheAirTime.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[SportRecordKey.TouchAirRatio.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[SportRecordKey.SkippingHeight.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[SportRecordKey.SwimSwolf.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeCount.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeFreq.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[SportRecordKey.EqualIntensityPace.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[SportRecordKey.RunningPower.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[SportRecordKey.DivingDepth.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[SportRecordKey.DivingTemperature.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[SportRecordKey.VerticalAmplitude.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[SportRecordKey.VerticalStrideRatio.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[SportRecordKey.FrogBreathAngle.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[SportRecordKey.FrogSkiDuration.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[SportRecordKey.FreePitchAngle.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[SportRecordKey.FreeBreathAngle.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SportRecordConverter() {
    }

    private final void computeGroupRecord(List<OneSportRecord> recordList, GroupSportRecord recordInfo) {
        if (recordList.isEmpty()) {
            return;
        }
        int i = 0;
        int iIntValue = 0;
        int i2 = 0;
        int iIntValue2 = 0;
        for (OneSportRecord oneSportRecord : recordList) {
            Integer calories = oneSportRecord.getCalories();
            iIntValue += calories != null ? calories.intValue() : 0;
            Integer count = oneSportRecord.getCount();
            iIntValue2 += count != null ? count.intValue() : 0;
            Integer hr = oneSportRecord.getHr();
            int iIntValue3 = hr != null ? hr.intValue() : 0;
            i2 += iIntValue3;
            if (iIntValue3 > 0) {
                i++;
            }
        }
        recordInfo.setAvgHr(Integer.valueOf(i != 0 ? i2 / i : 0));
        recordInfo.setCalories(Integer.valueOf(iIntValue));
        recordInfo.setCount(Integer.valueOf(iIntValue2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    private final void computeITSportDetailInfo(List<OneSportRecord> recordList, ITSportDetailInfo recordInfo) {
        int iFloatValue;
        Float distance;
        Float speed;
        float f = 0.0f;
        float fFloatValue = 0.0f;
        int i = 0;
        int iIntValue = 0;
        int i2 = 0;
        int iCoerceAtMost = 0;
        int iIntValue2 = 0;
        int iMax = 0;
        int iIntValue3 = 0;
        for (OneSportRecord oneSportRecord : recordList) {
            Integer calories = oneSportRecord.getCalories();
            iIntValue += calories != null ? calories.intValue() : 0;
            Integer count = oneSportRecord.getCount();
            iIntValue2 += count != null ? count.intValue() : 0;
            Float distance2 = oneSportRecord.getDistance();
            fFloatValue += distance2 != null ? distance2.floatValue() : 0.0f;
            Integer steps = oneSportRecord.getSteps();
            iIntValue3 += steps != null ? steps.intValue() : 0;
            int duration = oneSportRecord.getDuration();
            if (oneSportRecord.getPace() != null) {
                Integer pace = oneSportRecord.getPace();
                Intrinsics.checkNotNull(pace);
                if (pace.intValue() > 0) {
                    Integer pace2 = oneSportRecord.getPace();
                    Intrinsics.checkNotNull(pace2);
                    iFloatValue = pace2.intValue();
                } else if (oneSportRecord.getSpeed() != null) {
                    speed = oneSportRecord.getSpeed();
                    Intrinsics.checkNotNull(speed);
                    if (speed.floatValue() > 0.0f) {
                        Float speed2 = oneSportRecord.getSpeed();
                        Intrinsics.checkNotNull(speed2);
                        iFloatValue = MathKt__MathJVMKt.roundToInt(3600.0d / ((double) speed2.floatValue()));
                    } else if (oneSportRecord.getDistance() != null) {
                        distance = oneSportRecord.getDistance();
                        Intrinsics.checkNotNull(distance);
                        if (distance.floatValue() > 0.0f) {
                            Float distance3 = oneSportRecord.getDistance();
                            Intrinsics.checkNotNull(distance3);
                            iFloatValue = (int) ((duration * 1000) / distance3.floatValue());
                        } else {
                            iFloatValue = 0;
                        }
                    } else {
                        iFloatValue = 0;
                    }
                } else if (oneSportRecord.getDistance() != null) {
                    distance = oneSportRecord.getDistance();
                    Intrinsics.checkNotNull(distance);
                    if (distance.floatValue() > 0.0f) {
                        Float distance4 = oneSportRecord.getDistance();
                        Intrinsics.checkNotNull(distance4);
                        iFloatValue = (int) ((duration * 1000) / distance4.floatValue());
                    } else {
                        iFloatValue = 0;
                    }
                } else {
                    iFloatValue = 0;
                }
            } else if (oneSportRecord.getSpeed() != null) {
                speed = oneSportRecord.getSpeed();
                Intrinsics.checkNotNull(speed);
                if (speed.floatValue() > 0.0f) {
                    Float speed3 = oneSportRecord.getSpeed();
                    Intrinsics.checkNotNull(speed3);
                    iFloatValue = MathKt__MathJVMKt.roundToInt(3600.0d / ((double) speed3.floatValue()));
                } else if (oneSportRecord.getDistance() != null) {
                    distance = oneSportRecord.getDistance();
                    Intrinsics.checkNotNull(distance);
                    if (distance.floatValue() > 0.0f) {
                        Float distance5 = oneSportRecord.getDistance();
                        Intrinsics.checkNotNull(distance5);
                        iFloatValue = (int) ((duration * 1000) / distance5.floatValue());
                    } else {
                        iFloatValue = 0;
                    }
                } else {
                    iFloatValue = 0;
                }
            } else if (oneSportRecord.getDistance() != null) {
                distance = oneSportRecord.getDistance();
                Intrinsics.checkNotNull(distance);
                if (distance.floatValue() > 0.0f) {
                    Float distance6 = oneSportRecord.getDistance();
                    Intrinsics.checkNotNull(distance6);
                    iFloatValue = (int) ((duration * 1000) / distance6.floatValue());
                } else {
                    iFloatValue = 0;
                }
            } else {
                iFloatValue = 0;
            }
            if (iFloatValue > 0) {
                if (iCoerceAtMost == 0) {
                    iCoerceAtMost = iFloatValue;
                }
                iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(iCoerceAtMost, iFloatValue);
            }
            Float heightChange = oneSportRecord.getHeightChange();
            float fFloatValue2 = heightChange != null ? heightChange.floatValue() : 0.0f;
            if (fFloatValue2 <= 0.0f) {
                fFloatValue2 = 0.0f;
            }
            f += fFloatValue2;
            Integer hr = oneSportRecord.getHr();
            int iIntValue4 = hr != null ? hr.intValue() : 0;
            iMax = Math.max(iIntValue4, iMax);
            i2 += iIntValue4;
            if (iIntValue4 > 0) {
                i++;
            }
        }
        recordInfo.setAvgHr(Integer.valueOf(i != 0 ? i2 / i : 0));
        recordInfo.setTotalUpHeight(Float.valueOf(f));
        recordInfo.setMaxPace(Integer.valueOf(iCoerceAtMost));
        recordInfo.setCalories(Integer.valueOf(iIntValue));
        recordInfo.setCount(Integer.valueOf(iIntValue2));
        recordInfo.setMaxHr(Integer.valueOf(iMax));
        recordInfo.setDistance(Float.valueOf(fFloatValue));
        recordInfo.setTotalSteps(Integer.valueOf(iIntValue3));
    }

    private final List<Object> getSportRecordList(SportRecordKey sportKey, Map<SportRecordKey, List<Object>> recordMap) {
        List<Object> list = recordMap.get(sportKey);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        recordMap.put(sportKey, arrayList);
        return arrayList;
    }

    private final Number getTheValueBySportKey(SportRecordKey key, OneSportRecord sportRecord, float correctionValue, int sportType) {
        Integer rowingCadence;
        switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
            case 8:
                return sportRecord.getHr();
            case 9:
                return sportRecord.getStress();
            case 10:
                return sportRecord.getSpo2();
            case 11:
                return sportRecord.getPower();
            case 12:
                return sportRecord.getResistance();
            case 13:
                return sportRecord.getCount();
            case 14:
                if (sportType != 13) {
                    rowingCadence = sportType != 14 ? sportRecord.getCycleCadence() : sportRecord.getJumpCadence();
                } else {
                    rowingCadence = sportRecord.getRowingCadence();
                }
                return rowingCadence;
            case 15:
                return sportRecord.getDistance();
            case 16:
                return sportRecord.getSpeed();
            case 17:
                Integer type = sportRecord.getType();
                if (type != null && type.intValue() == 0) {
                    return sportRecord.getPace();
                }
                return null;
            case 18:
                return sportRecord.getPace();
            case 19:
                return sportRecord.getSteps();
            case 20:
                return sportRecord.getCadence();
            case 21:
                if (sportRecord.getStride() == null) {
                    return null;
                }
                Integer stride = sportRecord.getStride();
                Intrinsics.checkNotNull(stride);
                return Float.valueOf(stride.intValue() * correctionValue);
            case 22:
                return sportRecord.getHeight();
            case 23:
                return sportRecord.getLandingImpact();
            case 24:
                return sportRecord.getTouchdownTime();
            case 25:
                return sportRecord.getInTheAirTime();
            case 26:
                return sportRecord.getTouchdownAirRatio();
            case 27:
                return sportRecord.getSkipStartingHeight();
            case 28:
                Integer type2 = sportRecord.getType();
                if (type2 != null && type2.intValue() == 0) {
                    return sportRecord.getSwolf();
                }
                return null;
            case 29:
                Integer type3 = sportRecord.getType();
                if (type3 != null && type3.intValue() == 0) {
                    return sportRecord.getStrokeCount();
                }
                return null;
            case 30:
                Integer type4 = sportRecord.getType();
                if (type4 != null && type4.intValue() == 0) {
                    return sportRecord.getStrokeFreq();
                }
                return null;
            case 31:
                return sportRecord.getEqualIntensityPace();
            case 32:
                return sportRecord.getRunningPower();
            case 33:
                return sportRecord.getDivingDepth();
            case 34:
                return sportRecord.getDivingTemperature();
            case 35:
                return sportRecord.getVerticalAmplitude();
            case 36:
                return sportRecord.getVerticalStrideRatio();
            case 37:
                return sportRecord.getFrogBreathAngle();
            case 38:
                return sportRecord.getFrogSkiDuration();
            case 39:
                return sportRecord.getFreePitchAngle();
            case 40:
                return sportRecord.getFreeBreathAngle();
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0154  */
    /* JADX WARN: Code duplicated, block: B:56:0x017e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Code duplicated, block: B:64:0x01af  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    private final void processCommonSportRecord(SportRecordKey[] supportRecordKey, List<SportRecord> recordList, Map<SportRecordKey, List<Object>> recordMap, float correctionValue, int sportType) {
        OneSkiGlide oneSkiGlide;
        long j;
        boolean zBooleanValue;
        Float distance;
        Float speed;
        float fFloatValue;
        Float maxSpeed;
        Iterator<SportRecord> it = recordList.iterator();
        int i = 0;
        int i2 = 0;
        SportRecordItem sportRecordItem = null;
        SportRecordItem sportRecordItem2 = null;
        float f = 0.0f;
        OneSkiGlide oneSkiGlide2 = null;
        while (it.hasNext()) {
            SportRecord next = it.next();
            for (OneSportRecord oneSportRecord : next.getRecordList()) {
                long startTime = oneSportRecord.getStartTime();
                long endTime = oneSportRecord.getEndTime();
                int length = supportRecordKey.length;
                SportRecordItem sportRecordItem3 = sportRecordItem;
                float f2 = f;
                OneSkiGlide oneSkiGlide3 = oneSkiGlide2;
                int iIntValue = i;
                int i3 = i2;
                int i4 = 0;
                while (i4 < length) {
                    SportRecordKey sportRecordKey = supportRecordKey[i4];
                    switch (WhenMappings.$EnumSwitchMapping$0[sportRecordKey.ordinal()]) {
                        case 1:
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide3;
                            oneSportRecord = oneSportRecord;
                            it = it;
                            j = startTime;
                            if (oneSportRecord.getIsWholeKMPoint() != null || oneSportRecord.getDistance() != null) {
                                if (sportRecordItem3 == null) {
                                    sportRecordItem3 = new SportRecordItem(j, j, 1, 0, 0, 24, null);
                                }
                                SportRecordItem sportRecordItem4 = sportRecordItem3;
                                sportRecordItem4.setEndTime(endTime);
                                sportRecordItem4.setDuration(sportRecordItem4.getDuration() + 1);
                                int iIntValue2 = sportRecordItem4.getValue().intValue();
                                if (oneSportRecord.getIsWholeKMPoint() != null) {
                                    Boolean isWholeKMPoint = oneSportRecord.getIsWholeKMPoint();
                                    Intrinsics.checkNotNull(isWholeKMPoint);
                                    zBooleanValue = isWholeKMPoint.booleanValue();
                                } else if (oneSportRecord.getDistance() != null) {
                                    Float distance2 = oneSportRecord.getDistance();
                                    Intrinsics.checkNotNull(distance2);
                                    float fFloatValue2 = f2 + (distance2.floatValue() * correctionValue);
                                    float f3 = iIntValue2 * 1000;
                                    if (f2 >= f3 || fFloatValue2 < f3) {
                                        f2 = fFloatValue2;
                                        zBooleanValue = false;
                                    } else {
                                        f2 = fFloatValue2;
                                        zBooleanValue = true;
                                    }
                                } else {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue) {
                                    FitnessLogUtils.i(TAG, "whole km point (" + sportRecordItem4 + ")");
                                    ListExtKt.add(getSportRecordList(SportRecordKey.WholeKMPoint, recordMap), sportRecordItem4);
                                    sportRecordItem3 = new SportRecordItem(endTime, endTime, Integer.valueOf(iIntValue2 + 1), 0, 0, 24, null);
                                } else {
                                    sportRecordItem3 = sportRecordItem4;
                                }
                            }
                            oneSkiGlide3 = oneSkiGlide;
                            break;
                        case 2:
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide3;
                            oneSportRecord = oneSportRecord;
                            it = it;
                            j = startTime;
                            Integer type = oneSportRecord.getType();
                            if (type != null && type.intValue() == 2) {
                                SwimmingPassage swimmingPassage = new SwimmingPassage(j, endTime);
                                Integer mainPosture = oneSportRecord.getMainPosture();
                                swimmingPassage.setSwimmingPosture(Integer.valueOf(mainPosture != null ? mainPosture.intValue() : -1));
                                swimmingPassage.setPace(oneSportRecord.getPace());
                                swimmingPassage.setSwolf(oneSportRecord.getSwolf());
                                ListExtKt.add(getSportRecordList(SportRecordKey.SwimmingInfo, recordMap), swimmingPassage);
                            }
                            oneSkiGlide3 = oneSkiGlide;
                            break;
                        case 3:
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide3;
                            j = startTime;
                            if (oneSportRecord.getCount() == null || oneSportRecord.getStumbleTimes() == null) {
                                it = it;
                                j = j;
                                oneSportRecord = oneSportRecord;
                                i4 = i4;
                                oneSkiGlide = oneSkiGlide;
                            } else {
                                if (sportRecordItem2 == null) {
                                    sportRecordItem2 = new SportRecordItem(j, j, 0, 0, 0, 24, null);
                                }
                                sportRecordItem2.setEndTime(endTime);
                                sportRecordItem2.setDuration(sportRecordItem2.getDuration() + 1);
                                int iIntValue3 = sportRecordItem2.getValue().intValue();
                                Integer count = oneSportRecord.getCount();
                                Intrinsics.checkNotNull(count);
                                sportRecordItem2.setValue(Integer.valueOf(iIntValue3 + count.intValue()));
                                Integer stumbleTimes = oneSportRecord.getStumbleTimes();
                                Intrinsics.checkNotNull(stumbleTimes);
                                if (stumbleTimes.intValue() > 0 && sportRecordItem2.getValue().intValue() > 0) {
                                    ListExtKt.add(getSportRecordList(SportRecordKey.RopeSkipStumbleInfo, recordMap), sportRecordItem2);
                                    sportRecordItem2 = new SportRecordItem(endTime, endTime, 0, 0, 0, 24, null);
                                }
                            }
                            oneSkiGlide3 = oneSkiGlide;
                            break;
                        case 4:
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide3;
                            Integer type2 = oneSportRecord.getType();
                            if (type2 != null && type2.intValue() == 1) {
                                j = startTime;
                                SwimmingPassage swimmingPassage2 = new SwimmingPassage(j, endTime);
                                Integer mainPosture2 = oneSportRecord.getMainPosture();
                                swimmingPassage2.setSwimmingPosture(Integer.valueOf(mainPosture2 != null ? mainPosture2.intValue() : -1));
                                swimmingPassage2.setPace(oneSportRecord.getPace());
                                swimmingPassage2.setSwolf(oneSportRecord.getSwolf());
                                ListExtKt.add(getSportRecordList(SportRecordKey.SwimPassage, recordMap), swimmingPassage2);
                                it = it;
                                j = j;
                                oneSportRecord = oneSportRecord;
                                i4 = i4;
                                oneSkiGlide = oneSkiGlide;
                                oneSkiGlide3 = oneSkiGlide;
                            }
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide;
                            it = it;
                            j = startTime;
                            oneSkiGlide3 = oneSkiGlide;
                            break;
                        case 5:
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide3;
                            OneGolfShot oneGolfShot = new OneGolfShot(oneSportRecord.getStartTime(), oneSportRecord.getEndTime());
                            oneGolfShot.setCal(oneSportRecord.getCalories());
                            oneGolfShot.setTotalCal(oneSportRecord.getTotalCal());
                            oneGolfShot.setBackSwingDuration(oneSportRecord.getBackSwingDuration());
                            oneGolfShot.setDownSwingDuration(oneSportRecord.getDownSwingDuration());
                            oneGolfShot.setSwingSpeed(oneSportRecord.getSwingSpeed());
                            oneGolfShot.setSwingRhythm(oneSportRecord.getSwingRhythm());
                            ListExtKt.add(getSportRecordList(SportRecordKey.GolfInfo, recordMap), oneGolfShot);
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide;
                            it = it;
                            j = startTime;
                            oneSkiGlide3 = oneSkiGlide;
                            break;
                        case 6:
                            if (next.getSkiPath() != null) {
                                Integer skiPath = next.getSkiPath();
                                Intrinsics.checkNotNull(skiPath);
                                int iIntValue4 = skiPath.intValue();
                                if (iIntValue4 == 1) {
                                    if (oneSkiGlide3 == null) {
                                        oneSkiGlide3 = new OneSkiGlide(iIntValue4);
                                    }
                                    if (next.getItSkiTotalTime() != null) {
                                        Integer itSkiTotalTime = next.getItSkiTotalTime();
                                        Intrinsics.checkNotNull(itSkiTotalTime);
                                        if (itSkiTotalTime.intValue() > 0) {
                                            Integer itSkiTotalTime2 = next.getItSkiTotalTime();
                                            Intrinsics.checkNotNull(itSkiTotalTime2);
                                            oneSkiGlide3.setDuration(itSkiTotalTime2.intValue());
                                        } else {
                                            oneSkiGlide3.setDuration(oneSkiGlide3.getDuration() + 1);
                                        }
                                    } else {
                                        oneSkiGlide3.setDuration(oneSkiGlide3.getDuration() + 1);
                                    }
                                    if (next.getItSkiTotalDistance() != null) {
                                        Integer itSkiTotalDistance = next.getItSkiTotalDistance();
                                        Intrinsics.checkNotNull(itSkiTotalDistance);
                                        if (itSkiTotalDistance.intValue() > 0) {
                                            Integer itSkiTotalDistance2 = next.getItSkiTotalDistance();
                                            Intrinsics.checkNotNull(itSkiTotalDistance2);
                                            oneSkiGlide3.setDistance(itSkiTotalDistance2.intValue());
                                        } else {
                                            distance = oneSportRecord.getDistance();
                                            if (distance != null) {
                                                oneSkiGlide3.setDistance(oneSkiGlide3.getDistance() + ((int) distance.floatValue()));
                                            }
                                        }
                                    } else {
                                        distance = oneSportRecord.getDistance();
                                        if (distance != null) {
                                            oneSkiGlide3.setDistance(oneSkiGlide3.getDistance() + ((int) distance.floatValue()));
                                        }
                                    }
                                    if (next.getItSkiMaxSpeed() != null) {
                                        Float itSkiMaxSpeed = next.getItSkiMaxSpeed();
                                        Intrinsics.checkNotNull(itSkiMaxSpeed);
                                        if (itSkiMaxSpeed.floatValue() > 0.0f) {
                                            oneSkiGlide3.setMaxSpeed(next.getItSkiMaxSpeed());
                                        } else {
                                            speed = oneSportRecord.getSpeed();
                                            if (speed != null) {
                                                fFloatValue = speed.floatValue();
                                                if (oneSkiGlide3.getMaxSpeed() != null) {
                                                    maxSpeed = oneSkiGlide3.getMaxSpeed();
                                                    Intrinsics.checkNotNull(maxSpeed);
                                                    if (maxSpeed.floatValue() < fFloatValue) {
                                                        oneSkiGlide3.setMaxSpeed(Float.valueOf(fFloatValue));
                                                    }
                                                } else {
                                                    oneSkiGlide3.setMaxSpeed(Float.valueOf(fFloatValue));
                                                }
                                            }
                                        }
                                    } else {
                                        speed = oneSportRecord.getSpeed();
                                        if (speed != null) {
                                            fFloatValue = speed.floatValue();
                                            if (oneSkiGlide3.getMaxSpeed() != null) {
                                                maxSpeed = oneSkiGlide3.getMaxSpeed();
                                                Intrinsics.checkNotNull(maxSpeed);
                                                if (maxSpeed.floatValue() < fFloatValue) {
                                                    oneSkiGlide3.setMaxSpeed(Float.valueOf(fFloatValue));
                                                }
                                            } else {
                                                oneSkiGlide3.setMaxSpeed(Float.valueOf(fFloatValue));
                                            }
                                        }
                                    }
                                    if (next.getItSkiAvgSpeed() != null) {
                                        Float itSkiAvgSpeed = next.getItSkiAvgSpeed();
                                        Intrinsics.checkNotNull(itSkiAvgSpeed);
                                        if (itSkiAvgSpeed.floatValue() > 0.0f) {
                                            oneSkiGlide3.setAvgSpeed(next.getItSkiAvgSpeed());
                                        }
                                    }
                                    if (next.getItSkiSlope() != null) {
                                        Integer itSkiSlope = next.getItSkiSlope();
                                        Intrinsics.checkNotNull(itSkiSlope);
                                        if (itSkiSlope.intValue() > 0) {
                                            oneSkiGlide3.setSkiSlope(next.getItSkiSlope());
                                        }
                                    }
                                    if (oneSportRecord.getHr() != null) {
                                        Integer hr = oneSportRecord.getHr();
                                        Intrinsics.checkNotNull(hr);
                                        if (hr.intValue() > 0) {
                                            Integer hr2 = oneSportRecord.getHr();
                                            Intrinsics.checkNotNull(hr2);
                                            iIntValue += hr2.intValue();
                                            i3++;
                                        }
                                    }
                                } else if (iIntValue4 == 2) {
                                    if (oneSkiGlide3 != null) {
                                        if (iIntValue > 0 && i3 > 0) {
                                            oneSkiGlide3.setAvgHr(Integer.valueOf(iIntValue / i3));
                                            iIntValue = 0;
                                            i3 = 0;
                                        }
                                        if (oneSkiGlide3.getDuration() > 0) {
                                            ListExtKt.add(getSportRecordList(SportRecordKey.SkiInfo, recordMap), oneSkiGlide3);
                                        }
                                    }
                                    oneSkiGlide3 = null;
                                }
                                it = it;
                                j = startTime;
                            } else {
                                i4 = i4;
                                oneSkiGlide = oneSkiGlide3;
                                it = it;
                                j = startTime;
                                oneSkiGlide3 = oneSkiGlide;
                            }
                            break;
                        case 7:
                            List<Integer> swimmingHr = oneSportRecord.getSwimmingHr();
                            List<Integer> list = swimmingHr;
                            if (list != null && !list.isEmpty()) {
                                Iterator<T> it2 = swimmingHr.iterator();
                                long j2 = startTime;
                                while (it2.hasNext()) {
                                    long j3 = j2 + 1;
                                    ListExtKt.add(getSportRecordList(SportRecordKey.Hr, recordMap), new SportRecordItem(j2, j3, Integer.valueOf(((Number) it2.next()).intValue()), 0, 0, 24, null));
                                    j2 = j3;
                                }
                            }
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide3;
                            it = it;
                            j = startTime;
                            oneSkiGlide3 = oneSkiGlide;
                            break;
                        default:
                            Number theValueBySportKey = getTheValueBySportKey(sportRecordKey, oneSportRecord, correctionValue, sportType);
                            if (theValueBySportKey != null) {
                                ListExtKt.add(getSportRecordList(sportRecordKey, recordMap), new SportRecordItem(startTime, endTime, theValueBySportKey, 0, 0, 24, null));
                            }
                            i4 = i4;
                            oneSkiGlide = oneSkiGlide3;
                            it = it;
                            j = startTime;
                            oneSkiGlide3 = oneSkiGlide;
                            break;
                    }
                    i4++;
                    oneSportRecord = oneSportRecord;
                    long j4 = j;
                    correctionValue = correctionValue;
                    it = it;
                    startTime = j4;
                }
                correctionValue = correctionValue;
                sportRecordItem = sportRecordItem3;
                f = f2;
                i = iIntValue;
                i2 = i3;
                oneSkiGlide2 = oneSkiGlide3;
            }
        }
        if (sportRecordItem != null && sportRecordItem.getDuration() > 0) {
            int iIntValue5 = sportRecordItem.getValue().intValue();
            sportRecordItem.setValue(((float) (iIntValue5 * 1000)) - f < 5.0f ? Integer.valueOf(iIntValue5) : Float.valueOf(0.5f));
            ListExtKt.add(getSportRecordList(SportRecordKey.WholeKMPoint, recordMap), sportRecordItem);
        }
        if (sportRecordItem2 != null && sportRecordItem2.getDuration() > 0 && sportRecordItem2.getValue().intValue() > 0) {
            ListExtKt.add(getSportRecordList(SportRecordKey.RopeSkipStumbleInfo, recordMap), sportRecordItem2);
        }
        if (oneSkiGlide2 != null) {
            if (i > 0 && i2 > 0) {
                oneSkiGlide2.setAvgHr(Integer.valueOf(i / i2));
            }
            if (oneSkiGlide2.getDuration() > 0) {
                ListExtKt.add(getSportRecordList(SportRecordKey.SkiInfo, recordMap), oneSkiGlide2);
            }
        }
    }

    private final void processGroupSportSpecialInfo(List<SportRecord> recordList, Map<SportRecordKey, List<Object>> recordMap) {
        List<Object> arrayList = new ArrayList<>();
        for (SportRecord sportRecord : recordList) {
            long startTime = sportRecord.getStartTime();
            long startTime2 = sportRecord.getStartTime() + sportRecord.getRecordCount();
            if (sportRecord.getITState() != null) {
                return;
            }
            GroupSportDetailInfo groupSportDetailInfo = new GroupSportDetailInfo(startTime, startTime2);
            GroupSportRecord groupSportRecord = new GroupSportRecord(startTime, sportRecord.getRecordList().size());
            computeGroupRecord(sportRecord.getRecordList(), groupSportRecord);
            groupSportDetailInfo.setSportRecordInfo(groupSportRecord);
            if (sportRecord.getRestSportRecord() != null) {
                SportRecord restSportRecord = sportRecord.getRestSportRecord();
                Intrinsics.checkNotNull(restSportRecord);
                GroupSportRecord groupSportRecord2 = new GroupSportRecord(restSportRecord.getStartTime(), restSportRecord.getRecordList().size());
                computeGroupRecord(restSportRecord.getRecordList(), groupSportRecord2);
                groupSportDetailInfo.setRestRecordInfo(groupSportRecord2);
            }
            arrayList.add(groupSportDetailInfo);
        }
        if (!arrayList.isEmpty()) {
            recordMap.put(SportRecordKey.GroupSportInfo, arrayList);
        }
    }

    private final void processIntervalDivingInfo(List<SportRecord> recordList, Map<SportRecordKey, List<Object>> recordMap) {
        for (SportRecord sportRecord : recordList) {
            FitnessLogUtils.i(TAG, "processIntervalDivingInfo " + sportRecord.getDivingType());
            Integer divingType = sportRecord.getDivingType();
            if (divingType != null && divingType.intValue() == 1) {
                DivingSportDetailInfo divingSportDetailInfo = new DivingSportDetailInfo(sportRecord.getStartTime(), true);
                divingSportDetailInfo.setEndTime(sportRecord.getStartTime() + sportRecord.getRecordCount());
                Integer divingOutSectionDuration = sportRecord.getDivingOutSectionDuration();
                divingSportDetailInfo.setDuration(divingOutSectionDuration != null ? divingOutSectionDuration.intValue() : 0);
                DivingSportDetailInfo divingSportDetailInfo2 = new DivingSportDetailInfo(sportRecord.getStartTime(), false);
                divingSportDetailInfo2.setEndTime(sportRecord.getStartTime() + sportRecord.getRecordCount());
                Integer divingInSectionDuration = sportRecord.getDivingInSectionDuration();
                divingSportDetailInfo2.setDuration(divingInSectionDuration != null ? divingInSectionDuration.intValue() : 0);
                divingSportDetailInfo2.setMaxDivingDepth(sportRecord.getDivingMaxDepth());
                divingSportDetailInfo2.setAvgDivingDepth(sportRecord.getDivingAvgDepth());
                divingSportDetailInfo2.setAvgTemperature(sportRecord.getDivingAvgTemperature());
                divingSportDetailInfo2.setMinTemperature(sportRecord.getDivingMinTemperature());
                divingSportDetailInfo2.setAvgUpSpeed(sportRecord.getDivingAvgUpSpeed());
                divingSportDetailInfo2.setAvgDownSpeed(sportRecord.getDivingAvgDownSpeed());
                SportRecordKey sportRecordKey = SportRecordKey.DivingSportInfo;
                ListExtKt.add(getSportRecordList(sportRecordKey, recordMap), divingSportDetailInfo2);
                ListExtKt.add(getSportRecordList(sportRecordKey, recordMap), divingSportDetailInfo);
            }
        }
    }

    private final void processIntervalTrainingSpecialInfo(List<SportRecord> sportRecordList, Map<SportRecordKey, List<Object>> recordMap) {
        Integer iTState;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < sportRecordList.size()) {
            SportRecord sportRecord = sportRecordList.get(i);
            if (sportRecord.getITState() == null || ((iTState = sportRecord.getITState()) != null && iTState.intValue() == 127)) {
                break;
            }
            long startTime = sportRecord.getStartTime();
            Integer iTState2 = sportRecord.getITState();
            Intrinsics.checkNotNull(iTState2);
            ITSportDetailInfo iTSportDetailInfo = new ITSportDetailInfo(startTime, iTState2.intValue());
            iTSportDetailInfo.setDuration(sportRecord.getRecordCount());
            iTSportDetailInfo.setEndTime(sportRecord.getStartTime() + sportRecord.getRecordCount());
            Integer iTTotalCount = sportRecord.getITTotalCount();
            Integer iTTotalDistance = sportRecord.getITTotalDistance();
            Integer itTotalSteps = sportRecord.getItTotalSteps();
            Integer itAvgPaces = sportRecord.getItAvgPaces();
            Float itAvgSpeed = sportRecord.getItAvgSpeed();
            Integer itTotalDuration = sportRecord.getItTotalDuration();
            Integer itActionCount = sportRecord.getItActionCount();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(sportRecord.getRecordList());
            if (sportRecord.getIsSportPause()) {
                int size = sportRecordList.size();
                int i2 = i;
                i++;
                while (true) {
                    if (i < size) {
                        SportRecord sportRecord2 = sportRecordList.get(i);
                        if (iTSportDetailInfo.getSportState() != 128 || sportRecord2.getIsSportPause()) {
                            int sportState = iTSportDetailInfo.getSportState();
                            Integer iTState3 = sportRecord2.getITState();
                            if (iTState3 == null || sportState != iTState3.intValue()) {
                                FitnessLogUtils.i(TAG, "it sport(sportState = " + iTSportDetailInfo.getSportState() + ",tmpRecord " + sportRecord2.getITState() + ") ");
                            }
                        } else {
                            Integer iTState4 = sportRecord2.getITState();
                            iTSportDetailInfo.setSportState(iTState4 != null ? iTState4.intValue() : 128);
                            FitnessLogUtils.i(TAG, "it sport(sportState = " + iTSportDetailInfo.getSportState());
                        }
                        Integer num = itAvgPaces;
                        Float f = itAvgSpeed;
                        iTSportDetailInfo.setDuration(iTSportDetailInfo.getDuration() + sportRecord2.getRecordCount());
                        iTSportDetailInfo.setEndTime(sportRecord2.getStartTime() + sportRecord2.getRecordCount());
                        arrayList2.addAll(sportRecord2.getRecordList());
                        if (iTTotalCount != null) {
                            int iIntValue = iTTotalCount.intValue();
                            Integer iTTotalCount2 = sportRecord2.getITTotalCount();
                            iTTotalCount = Integer.valueOf(iIntValue + (iTTotalCount2 != null ? iTTotalCount2.intValue() : 0));
                        }
                        if (iTTotalDistance != null) {
                            int iIntValue2 = iTTotalDistance.intValue();
                            Integer iTTotalDistance2 = sportRecord2.getITTotalDistance();
                            iTTotalDistance = Integer.valueOf(iIntValue2 + (iTTotalDistance2 != null ? iTTotalDistance2.intValue() : 0));
                        }
                        if (itTotalSteps != null) {
                            int iIntValue3 = itTotalSteps.intValue();
                            Integer itTotalSteps2 = sportRecord2.getItTotalSteps();
                            itTotalSteps = Integer.valueOf(iIntValue3 + (itTotalSteps2 != null ? itTotalSteps2.intValue() : 0));
                        }
                        if (itTotalDuration != null) {
                            int iIntValue4 = itTotalDuration.intValue();
                            Integer itTotalDuration2 = sportRecord2.getItTotalDuration();
                            itTotalDuration = Integer.valueOf(iIntValue4 + (itTotalDuration2 != null ? itTotalDuration2.intValue() : 0));
                        }
                        if (itActionCount != null) {
                            int iIntValue5 = itActionCount.intValue();
                            Integer itActionCount2 = sportRecord2.getItActionCount();
                            itActionCount = Integer.valueOf(iIntValue5 + (itActionCount2 != null ? itActionCount2.intValue() : 0));
                        }
                        if (sportRecord2.getIsSportPause()) {
                            itAvgSpeed = f;
                            i2 = i;
                            i++;
                            itAvgPaces = num;
                            sportRecordList = sportRecordList;
                        } else {
                            itAvgPaces = sportRecord2.getItAvgPaces();
                            itAvgSpeed = sportRecord2.getItAvgSpeed();
                        }
                    }
                    itAvgPaces = itAvgPaces;
                    itAvgSpeed = itAvgSpeed;
                    i = i2;
                }
            }
            if (iTSportDetailInfo.getSportState() == 128) {
                break;
            }
            computeITSportDetailInfo(arrayList2, iTSportDetailInfo);
            if (iTSportDetailInfo.getSportState() != 8 || arrayList2.size() >= 10) {
                if (itTotalDuration != null && itTotalDuration.intValue() > 0) {
                    FitnessLogUtils.i(TAG, "it sport(sportState = " + iTSportDetailInfo.getSportState() + "): total count = " + iTTotalCount);
                    iTSportDetailInfo.setDuration((long) itTotalDuration.intValue());
                }
                if (iTTotalCount != null && iTTotalCount.intValue() > 0) {
                    FitnessLogUtils.i(TAG, "it sport(sportState = " + iTSportDetailInfo.getSportState() + "): total count = " + iTTotalCount);
                    iTSportDetailInfo.setCount(iTTotalCount);
                }
                if (iTTotalDistance != null && iTTotalDistance.intValue() > 0) {
                    FitnessLogUtils.i(TAG, "it sport(sportState = " + iTSportDetailInfo.getSportState() + "): total distance = " + iTTotalDistance);
                    iTSportDetailInfo.setDistance(Float.valueOf((float) iTTotalDistance.intValue()));
                }
                if (itActionCount != null && itActionCount.intValue() > 0) {
                    FitnessLogUtils.i(TAG, "it sport(sportState = " + iTSportDetailInfo.getSportState() + "): total actionCount = " + itActionCount);
                    iTSportDetailInfo.setActionCount(itActionCount);
                }
                if (itAvgPaces != null && itAvgPaces.intValue() > 0) {
                    iTSportDetailInfo.setAvgPace(itAvgPaces);
                }
                if (itAvgSpeed != null && itAvgSpeed.floatValue() > 0.0f) {
                    iTSportDetailInfo.setAvgSpeed(itAvgSpeed);
                }
                arrayList.add(iTSportDetailInfo);
            } else {
                FitnessLogUtils.i(TAG, "it sport(sportState = " + iTSportDetailInfo.getSportState() + "): recordSize = " + arrayList2.size());
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            recordMap.put(SportRecordKey.ITSportInfo, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    @NotNull
    public final Map<SportRecordKey, List<Object>> convertSportRecord(int sportType, @NotNull List<SportRecord> recordList, @NotNull SportBasicReport report, @Nullable Integer recordVersion) {
        float fIntValue;
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        Intrinsics.checkNotNullParameter(report, "report");
        if (report.getCorrectedDistance() != null) {
            Integer correctedDistance = report.getCorrectedDistance();
            Intrinsics.checkNotNull(correctedDistance);
            if (correctedDistance.intValue() <= 0 || report.getSportType() != 3 || report.getDistance() == null) {
                fIntValue = 1.0f;
            } else {
                Integer distance = report.getDistance();
                Intrinsics.checkNotNull(distance);
                if (distance.intValue() > 0) {
                    Integer correctedDistance2 = report.getCorrectedDistance();
                    Intrinsics.checkNotNull(correctedDistance2);
                    float fIntValue2 = correctedDistance2.intValue();
                    Integer distance2 = report.getDistance();
                    Intrinsics.checkNotNull(distance2);
                    fIntValue = fIntValue2 / distance2.intValue();
                } else {
                    fIntValue = 1.0f;
                }
            }
        } else {
            fIntValue = 1.0f;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        int i = 0;
        long startTime = 0;
        long endTime = 0;
        for (SportRecord sportRecord : recordList) {
            if (startTime == j) {
                startTime = sportRecord.getStartTime();
                endTime = sportRecord.getStartTime();
            }
            long j2 = startTime;
            long startTime2 = sportRecord.getStartTime();
            long recordCount = sportRecord.getRecordCount();
            long j3 = startTime2 + recordCount;
            endTime += recordCount;
            if (report.getProtoType() == 10 && (!sportRecord.getRecordList().isEmpty())) {
                endTime = ((OneSportRecord) CollectionsKt___CollectionsKt.last((List) sportRecord.getRecordList())).getEndTime();
            }
            arrayList.add(new SportRecordItem(startTime2, j3, Long.valueOf(recordCount), 0, 0, 24, null));
            if (!sportRecord.getIsSportPause() || (sportRecord.getRecordCount() <= 0 && i == recordList.size() - 1)) {
                startTime = j2;
            } else {
                arrayList2.add(new SportRecordItem(j2, endTime, Long.valueOf(endTime - j2), 0, 0, 24, null));
                startTime = 0;
            }
            i++;
            j = 0;
        }
        if (startTime != j) {
            arrayList2.add(new SportRecordItem(startTime, endTime, Long.valueOf(endTime - startTime), 0, 0, 24, null));
        }
        linkedHashMap.put(SportRecordKey.RecordDetailInfo, arrayList);
        linkedHashMap.put(SportRecordKey.RecordPauseDetailInfo, arrayList2);
        FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
        SportRecordKey[] theSportRecordKeys = fitnessSportTypeUtils.getTheSportRecordKeys(sportType);
        processCommonSportRecord(theSportRecordKeys, recordList, linkedHashMap, fIntValue, sportType);
        if (fitnessSportTypeUtils.isGroupSport(sportType)) {
            processGroupSportSpecialInfo(recordList, linkedHashMap);
        }
        processIntervalTrainingSpecialInfo(recordList, linkedHashMap);
        if (ArraysKt___ArraysKt.contains(theSportRecordKeys, SportRecordKey.DivingSportInfo)) {
            processIntervalDivingInfo(recordList, linkedHashMap);
        }
        return linkedHashMap;
    }
}
