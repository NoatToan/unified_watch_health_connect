package com.xiaomi.fit.fitness.parser.utils;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.fitness.parser.data.OneSportRecord;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fit.fitness.parser.utils.SportRecordCsvUtils;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J#\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0002\u0010\u0014J7\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u0019J*\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/fitness/parser/utils/SportRecordCsvUtils;", "", "<init>", "()V", "SPLIT", "", "writeFile", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", DailyRecordKey.sportType, "", "recordList", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "writeRecordListCSV", "getColumnTitleName", "supportRecordKeys", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "(I[Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)Ljava/lang/String;", "getEachColumnStr", "sportRecord", "thisSportRecord", "Lcom/xiaomi/fit/fitness/parser/data/OneSportRecord;", "(I[Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Lcom/xiaomi/fit/fitness/parser/data/SportRecord;Lcom/xiaomi/fit/fitness/parser/data/OneSportRecord;)Ljava/lang/String;", "writeTheSportRecordKeyStr", "recordKey", "isColumnTitle", "", "builder", "Ljava/lang/StringBuilder;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordCsvUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordCsvUtils.kt\ncom/xiaomi/fit/fitness/parser/utils/SportRecordCsvUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,227:1\n1863#2,2:228\n13402#3,2:230\n*S KotlinDebug\n*F\n+ 1 SportRecordCsvUtils.kt\ncom/xiaomi/fit/fitness/parser/utils/SportRecordCsvUtils\n*L\n32#1:228,2\n62#1:230,2\n*E\n"})
public final class SportRecordCsvUtils {

    @NotNull
    public static final SportRecordCsvUtils INSTANCE = new SportRecordCsvUtils();

    @NotNull
    private static final String SPLIT = DebugFileCsvUtils.INSTANCE.getSPLIT();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            try {
                iArr[SportRecordKey.Hr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportRecordKey.Spo2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.Stress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.Resistance.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportRecordKey.Power.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportRecordKey.Distance.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportRecordKey.Pace.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportRecordKey.Step.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SportRecordKey.StepsLength.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SportRecordKey.WholeKMPoint.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SportRecordKey.Height.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SportRecordKey.Count.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SportRecordKey.Frequency.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SportRecordKey.TouchdownTime.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SportRecordKey.InTheAirTime.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SportRecordKey.TouchAirRatio.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SportRecordKey.LandingImpact.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SportRecordKey.SkippingHeight.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SportRecordKey.RopeSkipStumbleInfo.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SportRecordKey.SwimSwolf.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeFreq.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeCount.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[SportRecordKey.SwimPassage.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[SportRecordKey.GolfInfo.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[SportRecordKey.DivingDepth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[SportRecordKey.DivingTemperature.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[SportRecordKey.RunningPower.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[SportRecordKey.EqualIntensityPace.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[SportRecordKey.VerticalAmplitude.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[SportRecordKey.VerticalStrideRatio.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[SportRecordKey.SwimmingHr.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[SportRecordKey.FreePitchAngle.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[SportRecordKey.FreeBreathAngle.ordinal()] = 36;
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SportRecordCsvUtils() {
    }

    private final String getColumnTitleName(int sportType, SportRecordKey[] supportRecordKeys) {
        return getEachColumnStr(sportType, supportRecordKeys, null, null);
    }

    private final String getEachColumnStr(int sportType, SportRecordKey[] supportRecordKeys, SportRecord sportRecord, OneSportRecord thisSportRecord) {
        boolean z = thisSportRecord == null;
        StringBuilder sb = new StringBuilder();
        sb.append(thisSportRecord != null ? Long.valueOf(thisSportRecord.getStartTime()) : "startTime");
        String str = SPLIT;
        sb.append(str);
        Object calories = null;
        if (sportType == 21) {
            sb.append(z ? "path" : sportRecord != null ? sportRecord.getSkiPath() : null);
            sb.append(str);
        }
        for (SportRecordKey sportRecordKey : supportRecordKeys) {
            INSTANCE.writeTheSportRecordKeyStr(sportRecordKey, z, thisSportRecord, sb);
        }
        if (z) {
            calories = "calories";
        } else if (thisSportRecord != null) {
            calories = thisSportRecord.getCalories();
        }
        sb.append(calories);
        sb.append(SPLIT);
        sb.append("\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeFile$lambda$0(FitnessDataId dataId, int i, List recordList) {
        Intrinsics.checkNotNullParameter(dataId, "$dataId");
        Intrinsics.checkNotNullParameter(recordList, "$recordList");
        INSTANCE.writeRecordListCSV(dataId, i, recordList);
    }

    private final void writeRecordListCSV(FitnessDataId dataId, int sportType, List<SportRecord> recordList) {
        DebugFileCsvUtils debugFileCsvUtils = DebugFileCsvUtils.INSTANCE;
        File theCsvStorageFile = debugFileCsvUtils.getTheCsvStorageFile(dataId, sportType);
        SportRecordKey[] theSportRecordKeys = FitnessSportTypeUtils.INSTANCE.getTheSportRecordKeys(sportType);
        if (debugFileCsvUtils.writeCSV(theCsvStorageFile, getColumnTitleName(sportType, theSportRecordKeys), false)) {
            for (SportRecord sportRecord : recordList) {
                Iterator<OneSportRecord> it = sportRecord.getRecordList().iterator();
                while (it.hasNext()) {
                    DebugFileCsvUtils.INSTANCE.writeCSV(theCsvStorageFile, INSTANCE.getEachColumnStr(sportType, theSportRecordKeys, sportRecord, it.next()), true);
                }
                if (sportRecord.getRestSportRecord() != null) {
                    SportRecord restSportRecord = sportRecord.getRestSportRecord();
                    Intrinsics.checkNotNull(restSportRecord);
                    Iterator<OneSportRecord> it2 = restSportRecord.getRecordList().iterator();
                    while (it2.hasNext()) {
                        DebugFileCsvUtils.INSTANCE.writeCSV(theCsvStorageFile, INSTANCE.getEachColumnStr(sportType, theSportRecordKeys, sportRecord, it2.next()), true);
                    }
                }
            }
        }
    }

    private final void writeTheSportRecordKeyStr(SportRecordKey recordKey, boolean isColumnTitle, OneSportRecord thisSportRecord, StringBuilder builder) {
        Object height;
        Object type;
        Object mainPosture;
        Object count;
        Object unknownStrokeFreq;
        Object breastStrokeFreq;
        Object crawlStrokeFreq;
        Object backStrokeFreq;
        Object butterflyStrokeFreq;
        Object backSwingDuration;
        Object downSwingDuration;
        Object swingRhythm;
        Object swimmingHrCount;
        String strValueOf;
        int i = WhenMappings.$EnumSwitchMapping$0[recordKey.ordinal()];
        Object cadence = FitnessRecordKey.cadence;
        Object distance = "distance";
        Object pace = "pace";
        Object totalCal = "totalCal";
        Object objValueOf = "endTime";
        Object hr = null;
        switch (i) {
            case 1:
                if (isColumnTitle) {
                    hr = "hr";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getHr();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 2:
                if (isColumnTitle) {
                    hr = "spo2";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getSpo2();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 3:
                if (isColumnTitle) {
                    hr = "stress";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getStress();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 4:
                if (isColumnTitle) {
                    hr = "resistance";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getResistance();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 5:
                if (isColumnTitle) {
                    hr = "power";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getPower();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 6:
                if (!isColumnTitle) {
                    distance = thisSportRecord != null ? thisSportRecord.getDistance() : null;
                }
                builder.append(distance);
                builder.append(SPLIT);
                break;
            case 7:
                if (isColumnTitle) {
                    hr = "speed";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getSpeed();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 8:
                if (!isColumnTitle) {
                    pace = thisSportRecord != null ? thisSportRecord.getPace() : null;
                }
                builder.append(pace);
                builder.append(SPLIT);
                break;
            case 9:
                if (isColumnTitle) {
                    hr = "steps";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getSteps();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 10:
                if (isColumnTitle) {
                    hr = FitnessRecordKey.stride;
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getStride();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 11:
                if (!isColumnTitle) {
                    cadence = thisSportRecord != null ? thisSportRecord.getCadence() : null;
                }
                builder.append(cadence);
                builder.append(SPLIT);
                break;
            case 12:
                if (isColumnTitle) {
                    hr = "isWholeKMPoint";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getIsWholeKMPoint();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 13:
                if (isColumnTitle) {
                    height = "height";
                } else {
                    height = thisSportRecord != null ? thisSportRecord.getHeight() : null;
                }
                builder.append(height);
                String str = SPLIT;
                builder.append(str);
                if (isColumnTitle) {
                    hr = "heightChange";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getHeightChange();
                }
                builder.append(hr);
                builder.append(str);
                break;
            case 14:
                if (isColumnTitle) {
                    hr = "count";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getCount();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 15:
                if (!isColumnTitle) {
                    if ((thisSportRecord != null ? thisSportRecord.getJumpCadence() : null) != null) {
                        cadence = thisSportRecord.getJumpCadence();
                    } else {
                        if ((thisSportRecord != null ? thisSportRecord.getRowingCadence() : null) != null) {
                            cadence = thisSportRecord.getRowingCadence();
                        } else {
                            cadence = thisSportRecord != null ? thisSportRecord.getCycleCadence() : null;
                        }
                    }
                }
                builder.append(cadence);
                builder.append(SPLIT);
                break;
            case 16:
                if (isColumnTitle) {
                    hr = "touchdownTime";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getTouchdownTime();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 17:
                if (isColumnTitle) {
                    hr = "inTheAirTime";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getInTheAirTime();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 18:
                if (isColumnTitle) {
                    hr = "touchdownAirRatio";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getTouchdownAirRatio();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 19:
                if (isColumnTitle) {
                    hr = "landingImpact";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getLandingImpact();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 20:
                if (isColumnTitle) {
                    hr = "skipStartingHeight";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getSkipStartingHeight();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 21:
                if (isColumnTitle) {
                    hr = "stumbleTimes";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getStumbleTimes();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 22:
                if (isColumnTitle) {
                    hr = "swolf";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getSwolf();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 23:
                if (isColumnTitle) {
                    hr = "strokeFreq";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getStrokeFreq();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 24:
                if (isColumnTitle) {
                    hr = FitnessReportKey.strokeCount;
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getStrokeCount();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 25:
                if (isColumnTitle) {
                    hr = "swimPace";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getPace();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 26:
                if (!isColumnTitle) {
                    objValueOf = thisSportRecord != null ? Long.valueOf(thisSportRecord.getEndTime()) : null;
                }
                builder.append(objValueOf);
                String str2 = SPLIT;
                builder.append(str2);
                if (isColumnTitle) {
                    type = "type";
                } else {
                    type = thisSportRecord != null ? thisSportRecord.getType() : null;
                }
                builder.append(type);
                builder.append(str2);
                if (isColumnTitle) {
                    mainPosture = FitnessReportKey.mainPosture;
                } else {
                    mainPosture = thisSportRecord != null ? thisSportRecord.getMainPosture() : null;
                }
                builder.append(mainPosture);
                builder.append(str2);
                if (!isColumnTitle) {
                    pace = thisSportRecord != null ? thisSportRecord.getPace() : null;
                }
                builder.append(pace);
                builder.append(str2);
                if (!isColumnTitle) {
                    distance = thisSportRecord != null ? thisSportRecord.getDistance() : null;
                }
                builder.append(distance);
                builder.append(str2);
                if (isColumnTitle) {
                    count = "turnCount";
                } else {
                    count = thisSportRecord != null ? thisSportRecord.getCount() : null;
                }
                builder.append(count);
                builder.append(str2);
                if (isColumnTitle) {
                    unknownStrokeFreq = "unknownStrokeFreq";
                } else {
                    unknownStrokeFreq = thisSportRecord != null ? thisSportRecord.getUnknownStrokeFreq() : null;
                }
                builder.append(unknownStrokeFreq);
                builder.append(str2);
                if (isColumnTitle) {
                    breastStrokeFreq = "breastStrokeFreq";
                } else {
                    breastStrokeFreq = thisSportRecord != null ? thisSportRecord.getBreastStrokeFreq() : null;
                }
                builder.append(breastStrokeFreq);
                builder.append(str2);
                if (isColumnTitle) {
                    crawlStrokeFreq = "crawlStrokeFreq";
                } else {
                    crawlStrokeFreq = thisSportRecord != null ? thisSportRecord.getCrawlStrokeFreq() : null;
                }
                builder.append(crawlStrokeFreq);
                builder.append(str2);
                if (isColumnTitle) {
                    backStrokeFreq = "backStrokeFreq";
                } else {
                    backStrokeFreq = thisSportRecord != null ? thisSportRecord.getBackStrokeFreq() : null;
                }
                builder.append(backStrokeFreq);
                builder.append(str2);
                if (isColumnTitle) {
                    butterflyStrokeFreq = "butterflyStrokeFreq";
                } else {
                    butterflyStrokeFreq = thisSportRecord != null ? thisSportRecord.getButterflyStrokeFreq() : null;
                }
                builder.append(butterflyStrokeFreq);
                builder.append(str2);
                if (!isColumnTitle) {
                    totalCal = thisSportRecord != null ? thisSportRecord.getTotalCal() : null;
                }
                builder.append(totalCal);
                builder.append(str2);
                break;
            case 27:
                if (!isColumnTitle) {
                    objValueOf = thisSportRecord != null ? Long.valueOf(thisSportRecord.getEndTime()) : null;
                }
                builder.append(objValueOf);
                String str3 = SPLIT;
                builder.append(str3);
                if (!isColumnTitle) {
                    totalCal = thisSportRecord != null ? thisSportRecord.getTotalCal() : null;
                }
                builder.append(totalCal);
                builder.append(str3);
                if (isColumnTitle) {
                    backSwingDuration = "backSwingDuration";
                } else {
                    backSwingDuration = thisSportRecord != null ? thisSportRecord.getBackSwingDuration() : null;
                }
                builder.append(backSwingDuration);
                builder.append(str3);
                if (isColumnTitle) {
                    downSwingDuration = "downSwingDuration";
                } else {
                    downSwingDuration = thisSportRecord != null ? thisSportRecord.getDownSwingDuration() : null;
                }
                builder.append(downSwingDuration);
                builder.append(str3);
                if (isColumnTitle) {
                    swingRhythm = FitnessRecordKey.swingRhythm;
                } else {
                    swingRhythm = thisSportRecord != null ? thisSportRecord.getSwingRhythm() : null;
                }
                builder.append(swingRhythm);
                builder.append(str3);
                if (isColumnTitle) {
                    hr = FitnessRecordKey.swingSpeed;
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getSwingSpeed();
                }
                builder.append(hr);
                builder.append(str3);
                break;
            case 28:
                if (isColumnTitle) {
                    hr = "divingDepth";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getDivingDepth();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 29:
                if (isColumnTitle) {
                    hr = "divingTemperature";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getDivingTemperature();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 30:
                if (isColumnTitle) {
                    hr = FitnessRecordKey.runningPower;
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getRunningPower();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 31:
                if (isColumnTitle) {
                    hr = FitnessRecordKey.equalIntensityPace;
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getEqualIntensityPace();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 32:
                if (isColumnTitle) {
                    hr = "VerticalAmplitude";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getVerticalAmplitude();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 33:
                if (isColumnTitle) {
                    hr = "VerticalStrideRatio";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getVerticalStrideRatio();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 34:
                if (isColumnTitle) {
                    swimmingHrCount = "swimmingHrCount";
                } else {
                    swimmingHrCount = thisSportRecord != null ? thisSportRecord.getSwimmingHrCount() : null;
                }
                builder.append(swimmingHrCount);
                String str4 = SPLIT;
                builder.append(str4);
                if (isColumnTitle) {
                    strValueOf = "swimmingHrValue";
                } else {
                    strValueOf = String.valueOf(thisSportRecord != null ? thisSportRecord.getSwimmingHr() : null);
                }
                builder.append(strValueOf);
                builder.append(str4);
                break;
            case 35:
                if (isColumnTitle) {
                    hr = "FreePitchAngle";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getFreePitchAngle();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 36:
                if (isColumnTitle) {
                    hr = "FreeBreathAngle";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getFreeBreathAngle();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 37:
                if (isColumnTitle) {
                    hr = "FrogBreathAngle";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getFrogBreathAngle();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
            case 38:
                if (isColumnTitle) {
                    hr = "FrogSkiDuration";
                } else if (thisSportRecord != null) {
                    hr = thisSportRecord.getFrogSkiDuration();
                }
                builder.append(hr);
                builder.append(SPLIT);
                break;
        }
    }

    public final void writeFile(@NotNull final FitnessDataId dataId, final int sportType, @NotNull final List<SportRecord> recordList) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        if (recordList.isEmpty()) {
            return;
        }
        ExecutorHelper.INSTANCE.getIoThreadPool().execute(new Runnable() { // from class: itn
            @Override // java.lang.Runnable
            public final void run() {
                SportRecordCsvUtils.writeFile$lambda$0(dataId, sportType, recordList);
            }
        });
    }
}
