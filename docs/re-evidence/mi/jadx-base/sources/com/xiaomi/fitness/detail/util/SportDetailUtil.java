package com.xiaomi.fitness.detail.util;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fit.data.common.data.sport.DivingSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.GroupSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.ITSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.OneGolfShot;
import com.xiaomi.fit.data.common.data.sport.OneSkiGlide;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.model.SportCourseInfoModel;
import com.xiaomi.fitness.detail.model.SportDivingInfoModel;
import com.xiaomi.fitness.detail.model.SportGolfInfoModel;
import com.xiaomi.fitness.detail.model.SportSkiingInfoModel;
import com.xiaomi.fitness.util.SportRecordUtil;
import defpackage.b0o;
import defpackage.byi;
import defpackage.dki;
import defpackage.j1j;
import defpackage.oyi;
import defpackage.pz6;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\\\u0010TJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010\u0005J\u0017\u0010,\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010\u0005J+\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J-\u00105\u001a\u0012\u0012\u0004\u0012\u00020103j\b\u0012\u0004\u0012\u000201`42\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\r¢\u0006\u0004\b5\u00106J-\u0010:\u001a\u0012\u0012\u0004\u0012\u00020903j\b\u0012\u0004\u0012\u000209`42\u000e\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\r¢\u0006\u0004\b:\u00106J-\u0010>\u001a\u0012\u0012\u0004\u0012\u00020=03j\b\u0012\u0004\u0012\u00020=`42\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\r¢\u0006\u0004\b>\u00106J-\u0010B\u001a\u0012\u0012\u0004\u0012\u00020A03j\b\u0012\u0004\u0012\u00020A`42\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010\r¢\u0006\u0004\bB\u00106J-\u0010E\u001a\u0012\u0012\u0004\u0012\u00020C03j\b\u0012\u0004\u0012\u00020C`42\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\r¢\u0006\u0004\bE\u00106J=\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u000e03j\b\u0012\u0004\u0012\u00020\u000e`42\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\bG\u0010HJ#\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\u0006\u0010I\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KJ-\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\u0006\u0010I\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u001d\u0010Q\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u001f¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020!¢\u0006\u0004\bS\u0010TJ\u001d\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u00020U2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lcom/xiaomi/fitness/detail/util/SportDetailUtil;", "", "", "index", "getModelColorByIndex", "(I)I", "Landroid/content/Context;", "context", "", "getModelStrByIndex", "(Landroid/content/Context;I)Ljava/lang/String;", "bestIndex", "currentIndex", "", "Lcom/xiaomi/fitness/detail/model/SportCourseInfoModel;", "modelList", DailyRecordKey.sportType, "findBestInfoIndex", "(IILjava/util/List;I)I", "model", "", "getAvgSpeedByInfoModel", "(Lcom/xiaomi/fitness/detail/model/SportCourseInfoModel;)Ljava/lang/Float;", "Lcom/xiaomi/fit/data/common/data/sport/ITSportDetailInfo;", "getAvgPace", "(Lcom/xiaomi/fit/data/common/data/sport/ITSportDetailInfo;)Ljava/lang/Integer;", "getAvgSpeed", "(Lcom/xiaomi/fit/data/common/data/sport/ITSportDetailInfo;)Ljava/lang/Float;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "basicList", "", "addDistance", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;)V", "type", "getSportWaterBodyTypeString", "(I)Ljava/lang/String;", "floatValue", "pluralsResourceId", "getPluralsFloatUnit", "(FI)Ljava/lang/String;", "getSportTypeInfoBinary", "getExtraSportTypeInfoBinary", "duration", "Lb0o;", "createPaceSportSegmentModel", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;I)Ljava/util/List;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "sparseArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "computeDistancePoint", "(Ljava/util/List;)Ljava/util/ArrayList;", "Lcom/xiaomi/fit/data/common/data/sport/OneSkiGlide;", "oneSkiTripList", "Lcom/xiaomi/fitness/detail/model/SportSkiingInfoModel;", "createSkiingInfoList", "Lcom/xiaomi/fit/data/common/data/sport/DivingSportDetailInfo;", "oneDivingTripList", "Lcom/xiaomi/fitness/detail/model/SportDivingInfoModel;", "createDivingInfoList", "Lcom/xiaomi/fit/data/common/data/sport/OneGolfShot;", "golfShotList", "Lcom/xiaomi/fitness/detail/model/SportGolfInfoModel;", "createGolfInfoList", "Lcom/xiaomi/fit/data/common/data/sport/GroupSportDetailInfo;", "groupDetailList", "createTrainingInfoList", "sportDetailInfoList", "createCourseInfoList", "(Landroid/content/Context;Ljava/util/List;I)Ljava/util/ArrayList;", "report", "initCompactTraceBasicItemList", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;I)Ljava/util/List;", "", "shareType", "initBasicList", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;IZ)Ljava/util/List;", "basicItemInfo", "updateExtraToBasicList", "(ILcom/xiaomi/fitness/detail/data/BasicItemInfo;)V", "clearExtraBasicList", "()V", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "key", "getSportKeyName", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;I)Ljava/lang/String;", "", "mExtraDataListMap", "Ljava/util/Map;", "<init>", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailUtil {

    @NotNull
    public static final SportDetailUtil INSTANCE = new SportDetailUtil();

    @NotNull
    private static final Map<Integer, BasicItemInfo> mExtraDataListMap = new HashMap();

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
                iArr[SportRecordKey.Pace.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportRecordKey.Frequency.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportRecordKey.StepsLength.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeFreq.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportRecordKey.Stress.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SportRecordKey.Power.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SportRecordKey.Height.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SportRecordKey.SkippingHeight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SportRecordKey.SwimSwolf.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SportRecordKey.Resistance.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SportRecordKey.DivingDepth.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SportRecordKey.DivingTemperature.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SportRecordKey.TouchdownTime.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SportRecordKey.InTheAirTime.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SportRecordKey.TouchAirRatio.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SportRecordKey.LandingImpact.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SportDetailUtil() {
    }

    private final void addDistance(SportBasicReport sportValues, List<BasicItemInfo> basicList) {
        if (sportValues.getDistance() != null) {
            Integer correctedDistance = sportValues.getCorrectedDistance();
            Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValues.getDistance() : sportValues.getCorrectedDistance();
            Intrinsics.checkNotNull(distance);
            String strE = pz6.e(distance.intValue());
            String strG = pz6.g(distance.intValue());
            int i = (sportValues.getSportType() == 708 || sportValues.getSportType() == 709) ? j1j.m7 : j1j.P;
            Intrinsics.checkNotNull(strE);
            Intrinsics.checkNotNull(strG);
            basicList.add(new BasicItemInfo(i, strE, strG, 0, null, null, 56, null));
        }
    }

    private final int findBestInfoIndex(int bestIndex, int currentIndex, List<SportCourseInfoModel> modelList, int sportType) {
        Integer count;
        SportCourseInfoModel sportCourseInfoModel = modelList.get(currentIndex);
        FitnessSportTypeUtils fitnessSportTypeUtils = FitnessSportTypeUtils.INSTANCE;
        if (fitnessSportTypeUtils.supportSpeedSport(sportType) || fitnessSportTypeUtils.supportPaceSport(sportType) || sportType == 10 || sportType == 9) {
            if (bestIndex == -1 && sportCourseInfoModel.getDistance() != null && sportCourseInfoModel.getDuration() != 0) {
                return currentIndex;
            }
            if (bestIndex == -1) {
                return bestIndex;
            }
            SportCourseInfoModel sportCourseInfoModel2 = modelList.get(bestIndex);
            Float avgSpeedByInfoModel = getAvgSpeedByInfoModel(sportCourseInfoModel);
            Float avgSpeedByInfoModel2 = getAvgSpeedByInfoModel(sportCourseInfoModel2);
            if (avgSpeedByInfoModel == null || avgSpeedByInfoModel2 == null) {
                return bestIndex;
            }
            if (avgSpeedByInfoModel.floatValue() > avgSpeedByInfoModel2.floatValue()) {
                return currentIndex;
            }
            if (!Intrinsics.areEqual(avgSpeedByInfoModel, avgSpeedByInfoModel2)) {
                return bestIndex;
            }
            Float distance = sportCourseInfoModel.getDistance();
            Intrinsics.checkNotNull(distance);
            float fFloatValue = distance.floatValue();
            Float distance2 = sportCourseInfoModel2.getDistance();
            Intrinsics.checkNotNull(distance2);
            return fFloatValue > distance2.floatValue() ? currentIndex : bestIndex;
        }
        if (sportCourseInfoModel.getCount() != null && (count = sportCourseInfoModel.getCount()) != null && count.intValue() == 0) {
            return bestIndex;
        }
        if (bestIndex == -1 && sportCourseInfoModel.getDuration() != 0) {
            return currentIndex;
        }
        if (bestIndex == -1) {
            return bestIndex;
        }
        SportCourseInfoModel sportCourseInfoModel3 = modelList.get(bestIndex);
        if (sportCourseInfoModel.getCount() == null || sportCourseInfoModel.getDuration() == 0 || sportCourseInfoModel3.getCount() == null || sportCourseInfoModel3.getDuration() == 0) {
            return bestIndex;
        }
        Integer count2 = sportCourseInfoModel.getCount();
        Intrinsics.checkNotNull(count2);
        long jIntValue = ((long) count2.intValue()) / sportCourseInfoModel.getDuration();
        Integer count3 = sportCourseInfoModel3.getCount();
        Intrinsics.checkNotNull(count3);
        long jIntValue2 = ((long) count3.intValue()) / sportCourseInfoModel3.getDuration();
        if (jIntValue > jIntValue2) {
            return currentIndex;
        }
        if (jIntValue != jIntValue2) {
            return bestIndex;
        }
        Integer count4 = sportCourseInfoModel.getCount();
        Intrinsics.checkNotNull(count4);
        int iIntValue = count4.intValue();
        Integer count5 = sportCourseInfoModel3.getCount();
        Intrinsics.checkNotNull(count5);
        return iIntValue > count5.intValue() ? currentIndex : bestIndex;
    }

    private final Integer getAvgPace(ITSportDetailInfo model) {
        if (model.getAvgPace() != null) {
            return model.getAvgPace();
        }
        if (model.getDistance() == null || model.getDuration() == 0) {
            return null;
        }
        Float distance = model.getDistance();
        Intrinsics.checkNotNull(distance);
        return Integer.valueOf(SportReportComputeUtil.computeAvgPace(distance.floatValue(), (int) model.getDuration()));
    }

    private final Float getAvgSpeed(ITSportDetailInfo model) {
        if (model.getAvgSpeed() != null) {
            return model.getAvgSpeed();
        }
        if (model.getAvgPace() != null) {
            Integer avgPace = model.getAvgPace();
            Intrinsics.checkNotNull(avgPace);
            if (avgPace.intValue() > 0) {
                Integer avgPace2 = model.getAvgPace();
                Intrinsics.checkNotNull(avgPace2);
                return Float.valueOf(3600.0f / avgPace2.intValue());
            }
        }
        if (model.getDistance() == null || model.getDuration() == 0) {
            return null;
        }
        Float distance = model.getDistance();
        Intrinsics.checkNotNull(distance);
        return Float.valueOf(SportReportComputeUtil.computeAvgSpeed(distance.floatValue(), (int) model.getDuration()));
    }

    private final Float getAvgSpeedByInfoModel(SportCourseInfoModel model) {
        if (model.getAvgSpeed() != null) {
            Float avgSpeed = model.getAvgSpeed();
            Intrinsics.checkNotNull(avgSpeed);
            if (avgSpeed.floatValue() > 0.0f) {
                Float avgSpeed2 = model.getAvgSpeed();
                Intrinsics.checkNotNull(avgSpeed2);
                return avgSpeed2;
            }
        }
        if (model.getAvgPace() != null) {
            Integer avgPace = model.getAvgPace();
            Intrinsics.checkNotNull(avgPace);
            if (avgPace.intValue() > 0) {
                Integer avgPace2 = model.getAvgPace();
                Intrinsics.checkNotNull(avgPace2);
                return Float.valueOf(3600.0f / avgPace2.intValue());
            }
        }
        if (model.getDistance() == null || model.getDuration() == 0) {
            return null;
        }
        Float distance = model.getDistance();
        Intrinsics.checkNotNull(distance);
        return Float.valueOf(distance.floatValue() / model.getDuration());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    private final int getExtraSportTypeInfoBinary(int sportType) {
        int sport_data_info_distance;
        int sport_data_info_dribble_duration;
        if (sportType == 19) {
            BasicItemInfo.Companion companion = BasicItemInfo.INSTANCE;
            sport_data_info_distance = companion.getSPORT_DATA_INFO_DISTANCE() + companion.getSPORT_DATA_INFO_SHOOT_COUNT();
            sport_data_info_dribble_duration = companion.getSPORT_DATA_INFO_DRIBBLE_DURATION();
        } else if (sportType != 207) {
            if (sportType != 608 && sportType != 609) {
                switch (sportType) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        BasicItemInfo.Companion companion2 = BasicItemInfo.INSTANCE;
                        sport_data_info_distance = companion2.getSPORT_DATA_INFO_STEPS_FREQ();
                        sport_data_info_dribble_duration = companion2.getSPORT_DATA_INFO_STEP_LENGTH();
                        break;
                    case 6:
                        return BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_TOTAL_CLIMBING();
                    default:
                        switch (sportType) {
                            case 9:
                            case 10:
                                BasicItemInfo.Companion companion3 = BasicItemInfo.INSTANCE;
                                sport_data_info_distance = companion3.getSPORT_DATA_INFO_AVG_SWOLF();
                                sport_data_info_dribble_duration = companion3.getSPORT_DATA_INFO_BEST_SWOLF();
                                break;
                            case 11:
                                BasicItemInfo.Companion companion4 = BasicItemInfo.INSTANCE;
                                sport_data_info_distance = companion4.getSPORT_DATA_INFO_STEPS_FREQ();
                                sport_data_info_dribble_duration = companion4.getSPORT_DATA_INFO_REST_DURATION();
                                break;
                            default:
                                switch (sportType) {
                                    case 13:
                                        BasicItemInfo.Companion companion5 = BasicItemInfo.INSTANCE;
                                        sport_data_info_distance = companion5.getSPORT_DATA_INFO_DURATION() + companion5.getSPORT_DATA_INFO_REST_DURATION() + companion5.getSPORT_DATA_INFO_LAY_OARS();
                                        sport_data_info_dribble_duration = companion5.getSPORT_DATA_INFO_PULL_OARS();
                                        break;
                                    case 14:
                                        BasicItemInfo.Companion companion6 = BasicItemInfo.INSTANCE;
                                        sport_data_info_distance = companion6.getSPORT_DATA_INFO_DURATION() + companion6.getSPORT_DATA_INFO_REST_DURATION() + companion6.getSPORT_DATA_INFO_HANG_IN_AIR_DURATION() + companion6.getSPORT_DATA_INFO_AVG_SKIP_FREQ();
                                        sport_data_info_dribble_duration = companion6.getSPORT_DATA_INFO_ENERGY_WORKING();
                                        break;
                                    case 15:
                                        BasicItemInfo.Companion companion7 = BasicItemInfo.INSTANCE;
                                        sport_data_info_distance = companion7.getSPORT_DATA_INFO_STEPS_FREQ();
                                        sport_data_info_dribble_duration = companion7.getSPORT_DATA_INFO_STEP_LENGTH();
                                        break;
                                    case 16:
                                        BasicItemInfo.Companion companion8 = BasicItemInfo.INSTANCE;
                                        sport_data_info_distance = companion8.getSPORT_DATA_INFO_DURATION() + companion8.getSPORT_DATA_INFO_REST_DURATION() + companion8.getSPORT_DATA_INFO_RECOVERY_HRM();
                                        sport_data_info_dribble_duration = companion8.getSPORT_DATA_INFO_ENERGY_WORKING();
                                        break;
                                    case 17:
                                        return BasicItemInfo.INSTANCE.getSPORT_DATA_INFO_DURATION();
                                    default:
                                        return 0;
                                }
                                break;
                        }
                        break;
                }
            } else {
                BasicItemInfo.Companion companion9 = BasicItemInfo.INSTANCE;
                sport_data_info_distance = companion9.getSPORT_DATA_INFO_DISTANCE() + companion9.getSPORT_DATA_INFO_FOREHAND_SWING_COUNT() + companion9.getSPORT_DATA_INFO_BACKHAND_SWING_COUNT() + companion9.getSPORT_DATA_INFO_SMASH_BALL_COUNT();
                sport_data_info_dribble_duration = companion9.getSPORT_DATA_INFO_SERVE_BALL_COUNT();
            }
        } else {
            BasicItemInfo.Companion companion10 = BasicItemInfo.INSTANCE;
            sport_data_info_distance = companion10.getSPORT_DATA_INFO_STEPS_FREQ();
            sport_data_info_dribble_duration = companion10.getSPORT_DATA_INFO_STEP_LENGTH();
        }
        return sport_data_info_distance + sport_data_info_dribble_duration;
    }

    private final int getModelColorByIndex(int index) {
        if (index == 0) {
            return AppUtil.getApp().getColor(dki.k0);
        }
        if (index == 1) {
            return AppUtil.getApp().getColor(dki.m0);
        }
        if (index == 2) {
            return AppUtil.getApp().getColor(dki.l0);
        }
        if (index != 3) {
            return index != 4 ? AppUtil.getApp().getColor(dki.k0) : AppUtil.getApp().getColor(dki.i0);
        }
        return AppUtil.getApp().getColor(dki.j0);
    }

    private final String getModelStrByIndex(Context context, int index) {
        if (index == 0) {
            String string = context.getString(j1j.h3);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (index == 1) {
            String string2 = context.getString(j1j.i3);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (index == 2) {
            String string3 = context.getString(j1j.j3);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (index == 3) {
            String string4 = context.getString(j1j.k3);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (index != 4) {
            String string5 = context.getString(j1j.h3);
            Intrinsics.checkNotNull(string5);
            return string5;
        }
        String string6 = context.getString(j1j.l3);
        Intrinsics.checkNotNull(string6);
        return string6;
    }

    private final String getPluralsFloatUnit(float floatValue, int pluralsResourceId) {
        Application app = AppUtil.getApp();
        String quantityString = app.getResources().getQuantityString(pluralsResourceId, xr5.j(floatValue));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0212  */
    /* JADX WARN: Code duplicated, block: B:65:0x031c  */
    /* JADX WARN: Code duplicated, block: B:67:0x035c  */
    /* JADX WARN: Switch 'out' block B:65:0x031c for B:35:0x0043 already processed. Defaulting to fallback option. */
    private final int getSportTypeInfoBinary(int sportType) {
        int sport_info_duration;
        int sport_info_avg_hrm;
        if (sportType == 19) {
            BasicItemInfo.Companion companion = BasicItemInfo.INSTANCE;
            sport_info_duration = companion.getSPORT_INFO_DURATION() + companion.getSPORT_INFO_CALORIE();
            sport_info_avg_hrm = companion.getSPORT_INFO_AVG_HRM();
        } else if (sportType == 20) {
            BasicItemInfo.Companion companion2 = BasicItemInfo.INSTANCE;
            sport_info_duration = companion2.getSPORT_INFO_DURATION() + companion2.getSPORT_INFO_CALORIE() + companion2.getSPORT_INFO_AVG_HRM() + companion2.getSPORT_INFO_TOTAL_GOLF_SCORES() + companion2.getSPORT_INFO_AVG_SWING_SPEED() + companion2.getSPORT_INFO_AVG_SWING_TIME() + companion2.getSPORT_INFO_AVG_DOWN_SWING_TIME();
            sport_info_avg_hrm = companion2.getSPORT_INFO_AVG_SWING_RHYTHM();
        } else if (sportType == 100 || sportType == 105 || sportType == 107) {
            BasicItemInfo.Companion companion3 = BasicItemInfo.INSTANCE;
            sport_info_duration = companion3.getSPORT_INFO_DURATION() + companion3.getSPORT_INFO_CALORIE() + companion3.getSPORT_INFO_AVG_SPEED();
            sport_info_avg_hrm = companion3.getSPORT_INFO_AVG_HRM();
        } else if (sportType == 207) {
            BasicItemInfo.Companion companion4 = BasicItemInfo.INSTANCE;
            sport_info_duration = companion4.getSPORT_INFO_DURATION() + companion4.getSPORT_INFO_CALORIE() + companion4.getSPORT_INFO_AVG_PACE() + companion4.getSPORT_INFO_AVG_HRM() + companion4.getSPORT_INFO_STEPS() + companion4.getSPORT_INFO_RISE_HEIGHT() + companion4.getSPORT_INFO_FALL_HEIGHT();
            sport_info_avg_hrm = companion4.getSPORT_INFO_AVG_HEIGHT();
        } else if (sportType == 333) {
            BasicItemInfo.Companion companion5 = BasicItemInfo.INSTANCE;
            sport_info_duration = companion5.getSPORT_INFO_DURATION() + companion5.getSPORT_INFO_CALORIE() + companion5.getSPORT_INFO_AVG_SPEED() + companion5.getSPORT_INFO_AVG_HRM();
            sport_info_avg_hrm = companion5.getSPORT_INFO_STEPS();
        } else if (sportType == 700) {
            BasicItemInfo.Companion companion6 = BasicItemInfo.INSTANCE;
            sport_info_duration = companion6.getSPORT_INFO_DURATION() + companion6.getSPORT_INFO_CALORIE() + companion6.getSPORT_INFO_AVG_SPEED();
            sport_info_avg_hrm = companion6.getSPORT_INFO_AVG_HRM();
        } else if (sportType == 807) {
            BasicItemInfo.Companion companion7 = BasicItemInfo.INSTANCE;
            sport_info_duration = companion7.getSPORT_INFO_DURATION() + companion7.getSPORT_INFO_CALORIE() + companion7.getSPORT_INFO_AVG_HRM() + companion7.getSPORT_INFO_TIMES() + companion7.getSPORT_DATA_INFO_FOREHAND_SWING_COUNT();
            sport_info_avg_hrm = companion7.getSPORT_DATA_INFO_BACKHAND_SWING_COUNT();
        } else if (sportType != 10000 && sportType != 201 && sportType != 202) {
            if (sportType != 608 && sportType != 609) {
                if (sportType != 1000 && sportType != 1001) {
                    switch (sportType) {
                        case 1:
                        case 2:
                            BasicItemInfo.Companion companion8 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion8.getSPORT_INFO_DURATION() + companion8.getSPORT_INFO_CALORIE() + companion8.getSPORT_INFO_AVG_PACE() + companion8.getSPORT_INFO_AVG_HRM() + companion8.getSPORT_INFO_STEPS() + companion8.getSPORT_INFO_RISE_HEIGHT() + companion8.getSPORT_INFO_FALL_HEIGHT() + companion8.getSPORT_INFO_AVG_POWER();
                            sport_info_avg_hrm = companion8.getSPORT_INFO_AVG_HEIGHT();
                            break;
                        case 3:
                            BasicItemInfo.Companion companion9 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion9.getSPORT_INFO_DURATION() + companion9.getSPORT_INFO_CALORIE() + companion9.getSPORT_INFO_AVG_PACE() + companion9.getSPORT_INFO_AVG_HRM();
                            sport_info_avg_hrm = companion9.getSPORT_INFO_STEPS();
                            break;
                        case 4:
                            BasicItemInfo.Companion companion10 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion10.getSPORT_INFO_DURATION() + companion10.getSPORT_INFO_CALORIE() + companion10.getSPORT_INFO_AVG_SPEED() + companion10.getSPORT_INFO_AVG_HRM() + companion10.getSPORT_INFO_STEPS() + companion10.getSPORT_INFO_RISE_HEIGHT() + companion10.getSPORT_INFO_FALL_HEIGHT();
                            sport_info_avg_hrm = companion10.getSPORT_INFO_AVG_HEIGHT();
                            break;
                        case 5:
                            BasicItemInfo.Companion companion11 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion11.getSPORT_INFO_DURATION() + companion11.getSPORT_INFO_CALORIE() + companion11.getSPORT_INFO_AVG_SPEED() + companion11.getSPORT_INFO_AVG_HRM() + companion11.getSPORT_INFO_STEPS() + companion11.getSPORT_INFO_RISE_HEIGHT() + companion11.getSPORT_INFO_FALL_HEIGHT() + companion11.getSPORT_INFO_AVG_POWER();
                            sport_info_avg_hrm = companion11.getSPORT_INFO_AVG_HEIGHT();
                            break;
                        case 6:
                            BasicItemInfo.Companion companion12 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion12.getSPORT_INFO_DURATION() + companion12.getSPORT_INFO_CALORIE() + companion12.getSPORT_INFO_AVG_SPEED() + companion12.getSPORT_INFO_AVG_HRM() + companion12.getSPORT_INFO_RISE_HEIGHT() + companion12.getSPORT_INFO_FALL_HEIGHT() + companion12.getSPORT_INFO_AVG_CADENCE();
                            sport_info_avg_hrm = companion12.getSPORT_INFO_AVG_HEIGHT();
                            break;
                        case 7:
                            BasicItemInfo.Companion companion13 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion13.getSPORT_INFO_DURATION() + companion13.getSPORT_INFO_CALORIE() + companion13.getSPORT_INFO_AVG_HRM() + companion13.getSPORT_INFO_AVG_RESISTANCE() + companion13.getSPORT_INFO_AVG_CADENCE() + companion13.getSPORT_INFO_AVG_POWER();
                            sport_info_avg_hrm = companion13.getSPORT_INFO_AVG_SPEED();
                            break;
                        case 8:
                            BasicItemInfo.Companion companion14 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion14.getSPORT_INFO_DURATION() + companion14.getSPORT_INFO_CALORIE();
                            sport_info_avg_hrm = companion14.getSPORT_INFO_AVG_HRM();
                            break;
                        case 9:
                            BasicItemInfo.Companion companion15 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion15.getSPORT_INFO_DURATION() + companion15.getSPORT_INFO_CALORIE() + companion15.getSPORT_INFO_AVG_PACE() + companion15.getSPORT_INFO_POSTURE() + companion15.getSPORT_INFO_SKIING_COUNT() + companion15.getSPORT_INFO_AVG_ROW_FREQ() + companion15.getSPORT_INFO_TIMES();
                            sport_info_avg_hrm = companion15.getSPORT_INFO_AVG_HRM();
                            break;
                        case 10:
                            BasicItemInfo.Companion companion16 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion16.getSPORT_INFO_DURATION() + companion16.getSPORT_INFO_CALORIE() + companion16.getSPORT_INFO_AVG_PACE() + companion16.getSPORT_INFO_POSTURE() + companion16.getSPORT_INFO_AVG_ROW_FREQ() + companion16.getSPORT_INFO_TIMES();
                            sport_info_avg_hrm = companion16.getSPORT_INFO_AVG_HRM();
                            break;
                        case 11:
                            BasicItemInfo.Companion companion17 = BasicItemInfo.INSTANCE;
                            sport_info_duration = companion17.getSPORT_INFO_DURATION() + companion17.getSPORT_INFO_CALORIE() + companion17.getSPORT_INFO_AVG_HRM();
                            sport_info_avg_hrm = companion17.getSPORT_INFO_STEPS();
                            break;
                        default:
                            switch (sportType) {
                                case 13:
                                    BasicItemInfo.Companion companion18 = BasicItemInfo.INSTANCE;
                                    sport_info_duration = companion18.getSPORT_INFO_DURATION() + companion18.getSPORT_INFO_CALORIE() + companion18.getSPORT_INFO_AVG_HRM() + companion18.getSPORT_INFO_TIMES();
                                    sport_info_avg_hrm = companion18.getSPORT_INFO_AVG_ROW_FREQ();
                                    break;
                                case 14:
                                    BasicItemInfo.Companion companion19 = BasicItemInfo.INSTANCE;
                                    sport_info_duration = companion19.getSPORT_INFO_DURATION() + companion19.getSPORT_INFO_CALORIE() + companion19.getSPORT_INFO_AVG_HRM() + companion19.getSPORT_INFO_TIMES();
                                    sport_info_avg_hrm = companion19.getSPORT_INFO_STUMBLE_TIMES();
                                    break;
                                case 15:
                                    BasicItemInfo.Companion companion110 = BasicItemInfo.INSTANCE;
                                    sport_info_duration = companion110.getSPORT_INFO_DURATION() + companion110.getSPORT_INFO_CALORIE() + companion110.getSPORT_INFO_AVG_SPEED() + companion110.getSPORT_INFO_AVG_HRM() + companion110.getSPORT_INFO_STEPS() + companion110.getSPORT_INFO_RISE_HEIGHT() + companion110.getSPORT_INFO_FALL_HEIGHT();
                                    sport_info_avg_hrm = companion110.getSPORT_INFO_AVG_HEIGHT();
                                    break;
                                case 16:
                                case 17:
                                    BasicItemInfo.Companion companion111 = BasicItemInfo.INSTANCE;
                                    sport_info_duration = companion111.getSPORT_INFO_DURATION() + companion111.getSPORT_INFO_CALORIE();
                                    sport_info_avg_hrm = companion111.getSPORT_INFO_AVG_HRM();
                                    break;
                                default:
                                    switch (sportType) {
                                        case 115:
                                            BasicItemInfo.Companion companion20 = BasicItemInfo.INSTANCE;
                                            sport_info_duration = companion20.getSPORT_INFO_DURATION() + companion20.getSPORT_INFO_CALORIE() + companion20.getSPORT_INFO_AVG_SPEED();
                                            sport_info_avg_hrm = companion20.getSPORT_INFO_AVG_HRM();
                                            break;
                                        case 116:
                                        case 117:
                                        case 118:
                                            return BasicItemInfo.INSTANCE.getSPORT_INFO_DURATION();
                                        default:
                                            switch (sportType) {
                                                case 708:
                                                case 709:
                                                    BasicItemInfo.Companion companion21 = BasicItemInfo.INSTANCE;
                                                    sport_info_duration = companion21.getSPORT_INFO_DURATION() + companion21.getSPORT_INFO_CALORIE() + companion21.getSPORT_INFO_AVG_SPEED() + companion21.getSPORT_INFO_AVG_HRM() + companion21.getSPORT_INFO_FALL_HEIGHT() + companion21.getSPORT_INFO_SKIING_COUNT() + companion21.getSPORT_INFO_MAX_SLOPE() + companion21.getSPORT_INFO_MAX_SPEED();
                                                    sport_info_avg_hrm = companion21.getSPORT_INFO_SKIING_TIME();
                                                    break;
                                                case 710:
                                                    BasicItemInfo.Companion companion22 = BasicItemInfo.INSTANCE;
                                                    sport_info_duration = companion22.getSPORT_INFO_DURATION() + companion22.getSPORT_INFO_CALORIE() + companion22.getSPORT_INFO_AVG_SPEED() + companion22.getSPORT_INFO_AVG_HRM() + companion22.getSPORT_INFO_FALL_HEIGHT() + companion22.getSPORT_INFO_SKIING_COUNT() + companion22.getSPORT_INFO_MAX_SLOPE() + companion22.getSPORT_INFO_RISE_HEIGHT();
                                                    sport_info_avg_hrm = companion22.getSPORT_INFO_AVG_HEIGHT();
                                                    break;
                                                default:
                                                    switch (sportType) {
                                                        case 810:
                                                            BasicItemInfo.Companion companion23 = BasicItemInfo.INSTANCE;
                                                            sport_info_duration = companion23.getSPORT_INFO_DURATION() + companion23.getSPORT_INFO_CALORIE() + companion23.getSPORT_INFO_AVG_HRM();
                                                            sport_info_avg_hrm = companion23.getSPORT_INFO_SOMATOSENSORY_GAME();
                                                            break;
                                                        case 811:
                                                            BasicItemInfo.Companion companion24 = BasicItemInfo.INSTANCE;
                                                            sport_info_duration = companion24.getSPORT_INFO_DURATION() + companion24.getSPORT_INFO_CALORIE() + companion24.getSPORT_INFO_AVG_HRM();
                                                            sport_info_avg_hrm = companion24.getSPORT_INFO_AVG_STRESS();
                                                            break;
                                                        case 812:
                                                            BasicItemInfo.Companion companion25 = BasicItemInfo.INSTANCE;
                                                            sport_info_duration = companion25.getSPORT_INFO_DURATION();
                                                            sport_info_avg_hrm = companion25.getSPORT_INFO_AVG_HRM();
                                                            break;
                                                        default:
                                                            BasicItemInfo.Companion companion26 = BasicItemInfo.INSTANCE;
                                                            sport_info_duration = companion26.getSPORT_INFO_DURATION() + companion26.getSPORT_INFO_CALORIE();
                                                            sport_info_avg_hrm = companion26.getSPORT_INFO_AVG_HRM();
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    BasicItemInfo.Companion companion27 = BasicItemInfo.INSTANCE;
                    sport_info_duration = companion27.getSPORT_INFO_DURATION() + companion27.getSPORT_INFO_CALORIE() + companion27.getSPORT_INFO_AVG_HRM() + companion27.getSPORT_INFO_RISE_HEIGHT();
                    sport_info_avg_hrm = companion27.getSPORT_INFO_AVG_HEIGHT();
                }
            } else {
                BasicItemInfo.Companion companion28 = BasicItemInfo.INSTANCE;
                sport_info_duration = companion28.getSPORT_INFO_DURATION() + companion28.getSPORT_INFO_CALORIE() + companion28.getSPORT_INFO_AVG_HRM();
                sport_info_avg_hrm = companion28.getSPORT_INFO_SWING_COUNT();
            }
        } else {
            BasicItemInfo.Companion companion29 = BasicItemInfo.INSTANCE;
            sport_info_duration = companion29.getSPORT_INFO_DURATION() + companion29.getSPORT_INFO_CALORIE() + companion29.getSPORT_INFO_AVG_SPEED();
            sport_info_avg_hrm = companion29.getSPORT_INFO_AVG_HRM();
        }
        return sport_info_duration + sport_info_avg_hrm;
    }

    private final String getSportWaterBodyTypeString(int type) {
        if (type == 0) {
            String string = AppUtil.getApp().getString(j1j.c4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (type == 1) {
            String string2 = AppUtil.getApp().getString(j1j.j4);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (type != 2) {
            String string3 = AppUtil.getApp().getString(j1j.O6);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = AppUtil.getApp().getString(j1j.Z3);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static /* synthetic */ List initBasicList$default(SportDetailUtil sportDetailUtil, SportBasicReport sportBasicReport, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return sportDetailUtil.initBasicList(sportBasicReport, i, z);
    }

    public final void clearExtraBasicList() {
        mExtraDataListMap.clear();
    }

    @NotNull
    public final ArrayList<SportRecordItem> computeDistancePoint(@Nullable List<SportRecordItem> sparseArray) {
        if (sparseArray == null || sparseArray.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<SportRecordItem> arrayList = new ArrayList<>();
        arrayList.addAll(sparseArray);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    @NotNull
    public final ArrayList<SportCourseInfoModel> createCourseInfoList(@NotNull Context context, @Nullable List<ITSportDetailInfo> sportDetailInfoList, int sportType) {
        int iFindBestInfoIndex;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<SportCourseInfoModel> arrayList = new ArrayList<>();
        if (sportDetailInfoList != null) {
            List<ITSportDetailInfo> list = sportDetailInfoList;
            if (!list.isEmpty()) {
                int size = list.size();
                iFindBestInfoIndex = -1;
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    ITSportDetailInfo iTSportDetailInfo = sportDetailInfoList.get(i3);
                    if (sportType == 9 || sportType == 10 || iTSportDetailInfo.getSportState() != 2) {
                        i = i2;
                        i2++;
                    } else {
                        i = -1;
                    }
                    int sportState = iTSportDetailInfo.getSportState();
                    Float distance = iTSportDetailInfo.getDistance();
                    long duration = iTSportDetailInfo.getDuration();
                    Integer count = iTSportDetailInfo.getCount();
                    Integer calories = iTSportDetailInfo.getCalories();
                    Integer avgHr = iTSportDetailInfo.getAvgHr();
                    Integer maxHr = iTSportDetailInfo.getMaxHr();
                    Integer maxPace = iTSportDetailInfo.getMaxPace();
                    Float totalUpHeight = iTSportDetailInfo.getTotalUpHeight();
                    arrayList.add(new SportCourseInfoModel(i, sportState, distance, duration, count, calories, avgHr, maxHr, maxPace, totalUpHeight != null ? totalUpHeight.floatValue() : 0.0f, iTSportDetailInfo.getTotalSteps(), getAvgPace(iTSportDetailInfo), getAvgSpeed(iTSportDetailInfo), iTSportDetailInfo.getSwolf(), iTSportDetailInfo.getActionCount(), false, 32768, null));
                    iFindBestInfoIndex = findBestInfoIndex(iFindBestInfoIndex, i3, arrayList, sportType);
                }
            } else {
                iFindBestInfoIndex = -1;
            }
        } else {
            iFindBestInfoIndex = -1;
        }
        if (iFindBestInfoIndex != -1 && sportDetailInfoList != null && sportDetailInfoList.size() > 1) {
            arrayList.get(iFindBestInfoIndex).setBestInfoModel(true);
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<SportDivingInfoModel> createDivingInfoList(@Nullable List<DivingSportDetailInfo> oneDivingTripList) {
        int i;
        ArrayList<SportDivingInfoModel> arrayList = new ArrayList<>();
        if (oneDivingTripList != null) {
            int i2 = 1;
            if (!oneDivingTripList.isEmpty()) {
                for (DivingSportDetailInfo divingSportDetailInfo : oneDivingTripList) {
                    if (divingSportDetailInfo.getOutDiving()) {
                        i = -1;
                    } else {
                        i = i2;
                        i2++;
                    }
                    int duration = divingSportDetailInfo.getDuration();
                    Float avgTemperature = divingSportDetailInfo.getAvgTemperature();
                    float fFloatValue = 0.0f;
                    float fFloatValue2 = avgTemperature != null ? avgTemperature.floatValue() : 0.0f;
                    Float avgDivingDepth = divingSportDetailInfo.getAvgDivingDepth();
                    float fFloatValue3 = avgDivingDepth != null ? avgDivingDepth.floatValue() : 0.0f;
                    Float maxDivingDepth = divingSportDetailInfo.getMaxDivingDepth();
                    SportDivingInfoModel sportDivingInfoModel = new SportDivingInfoModel(i, duration, fFloatValue2, fFloatValue3, maxDivingDepth != null ? maxDivingDepth.floatValue() : 0.0f);
                    Float minTemperature = divingSportDetailInfo.getMinTemperature();
                    sportDivingInfoModel.f = minTemperature != null ? minTemperature.floatValue() : -10000.0f;
                    Float avgDownSpeed = divingSportDetailInfo.getAvgDownSpeed();
                    sportDivingInfoModel.h = avgDownSpeed != null ? avgDownSpeed.floatValue() : 0.0f;
                    Float avgUpSpeed = divingSportDetailInfo.getAvgUpSpeed();
                    if (avgUpSpeed != null) {
                        fFloatValue = avgUpSpeed.floatValue();
                    }
                    sportDivingInfoModel.g = fFloatValue;
                    arrayList.add(sportDivingInfoModel);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<SportGolfInfoModel> createGolfInfoList(@Nullable List<OneGolfShot> golfShotList) {
        ArrayList<SportGolfInfoModel> arrayList = new ArrayList<>();
        if (golfShotList != null) {
            List<OneGolfShot> list = golfShotList;
            if (!list.isEmpty()) {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    OneGolfShot oneGolfShot = golfShotList.get(i);
                    i++;
                    arrayList.add(new SportGolfInfoModel(Integer.valueOf(i), oneGolfShot.getSwingSpeed(), oneGolfShot.getBackSwingDuration(), oneGolfShot.getDownSwingDuration(), oneGolfShot.getSwingRhythm()));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<b0o> createPaceSportSegmentModel(@NotNull Context context, @NotNull SportBasicReport sportValues, int duration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!sportValues.checkPaceDistributeValid()) {
            return arrayList;
        }
        Integer onePaceZoneDuration = sportValues.getOnePaceZoneDuration();
        Intrinsics.checkNotNull(onePaceZoneDuration);
        ListExtKt.add(arrayList2, onePaceZoneDuration);
        Integer twoPaceZoneDuration = sportValues.getTwoPaceZoneDuration();
        Intrinsics.checkNotNull(twoPaceZoneDuration);
        ListExtKt.add(arrayList2, twoPaceZoneDuration);
        Integer threePaceZoneDuration = sportValues.getThreePaceZoneDuration();
        Intrinsics.checkNotNull(threePaceZoneDuration);
        ListExtKt.add(arrayList2, threePaceZoneDuration);
        Integer fourPaceZoneDuration = sportValues.getFourPaceZoneDuration();
        Intrinsics.checkNotNull(fourPaceZoneDuration);
        ListExtKt.add(arrayList2, fourPaceZoneDuration);
        Integer fivePaceZoneDuration = sportValues.getFivePaceZoneDuration();
        Intrinsics.checkNotNull(fivePaceZoneDuration);
        ListExtKt.add(arrayList2, fivePaceZoneDuration);
        if (duration != 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                int iIntValue = ((Number) arrayList2.get(i)).intValue();
                arrayList.add(new b0o(i, iIntValue, getModelStrByIndex(context, i), MathKt__MathJVMKt.roundToInt((iIntValue * 100.0f) / duration), getModelColorByIndex(i), 0));
            }
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<SportSkiingInfoModel> createSkiingInfoList(@Nullable List<OneSkiGlide> oneSkiTripList) {
        ArrayList<SportSkiingInfoModel> arrayList = new ArrayList<>();
        if (oneSkiTripList != null && (!oneSkiTripList.isEmpty())) {
            int i = 1;
            for (OneSkiGlide oneSkiGlide : oneSkiTripList) {
                float fE = xr5.e(1, SportReportComputeUtil.computeAvgSpeed(oneSkiGlide.getDistance(), oneSkiGlide.getDuration()));
                int i2 = i + 1;
                int duration = oneSkiGlide.getDuration();
                int distance = oneSkiGlide.getDistance();
                Float maxSpeed = oneSkiGlide.getMaxSpeed();
                float fFloatValue = maxSpeed != null ? maxSpeed.floatValue() : 0.0f;
                Integer skiSlope = oneSkiGlide.getSkiSlope();
                int iIntValue = skiSlope != null ? skiSlope.intValue() : 0;
                Integer avgHr = oneSkiGlide.getAvgHr();
                arrayList.add(new SportSkiingInfoModel(i, duration, distance, fE, fFloatValue, iIntValue, avgHr != null ? avgHr.intValue() : 0));
                i = i2;
            }
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<GroupSportDetailInfo> createTrainingInfoList(@Nullable List<GroupSportDetailInfo> groupDetailList) {
        ArrayList<GroupSportDetailInfo> arrayList = new ArrayList<>();
        if (groupDetailList != null) {
            List<GroupSportDetailInfo> list = groupDetailList;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(groupDetailList.get(i));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final String getSportKeyName(@NotNull SportRecordKey key, int sportType) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
            case 1:
                return "heart_rate";
            case 2:
                return "pace";
            case 3:
                return "swim_pace";
            case 4:
                return "speed";
            case 5:
                if (sportType == 6 || sportType == 7) {
                    return "riding_frequency";
                }
                if (sportType != 13) {
                    return sportType != 14 ? "Frequency" : "jump_frequency";
                }
                return "rowing_frequency";
            case 6:
                return "stride_frequency";
            case 7:
                return "swim_frequency";
            case 8:
                return FitnessRecordKey.cadence;
            case 9:
                return "stress";
            case 10:
                return "power";
            case 11:
                return "altitude";
            case 12:
                return "jump_height";
            case 13:
                return "swim_swolf";
            case 14:
                return "resistence";
            case 15:
                return "depth";
            case 16:
                return "temperature";
            case 17:
                return "touchdown_time";
            case 18:
                return "soaring_time";
            case 19:
                return "touchdown_soaring";
            case 20:
                return "impact_force";
            default:
                return key.toString();
        }
    }

    @NotNull
    public final List<BasicItemInfo> initBasicList(@NotNull SportBasicReport report, int sportType, boolean shareType) {
        String string;
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        SportRecordUtil sportRecordUtil = SportRecordUtil.INSTANCE;
        boolean zAddFirstBasicItemInfo = sportRecordUtil.addFirstBasicItemInfo(report, arrayList, shareType);
        int sportTypeInfoBinary = getSportTypeInfoBinary(sportType);
        BasicItemInfo.Companion companion = BasicItemInfo.INSTANCE;
        if ((companion.getSPORT_INFO_DURATION() & sportTypeInfoBinary) == companion.getSPORT_INFO_DURATION()) {
            sportRecordUtil.addDuration(report, arrayList);
        }
        if ((companion.getSPORT_INFO_CALORIE() & sportTypeInfoBinary) == companion.getSPORT_INFO_CALORIE()) {
            if (!zAddFirstBasicItemInfo) {
                sportRecordUtil.addCalories(report, arrayList, false);
            }
            sportRecordUtil.addTotalCalories(report, arrayList);
        }
        if ((companion.getSPORT_INFO_SKIING_TIME() & sportTypeInfoBinary) == companion.getSPORT_INFO_SKIING_TIME()) {
            sportRecordUtil.addValidDuration(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_PACE() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_PACE()) {
            sportRecordUtil.addAvgPace(report, arrayList);
            sportRecordUtil.addAvgEqualPace(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_SPEED() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_SPEED()) {
            if (report.supportPace()) {
                sportRecordUtil.addAvgPace(report, arrayList);
                if (report.getAvgEqualPace() != null) {
                    Integer avgEqualPace = report.getAvgEqualPace();
                    Intrinsics.checkNotNull(avgEqualPace);
                    if (avgEqualPace.intValue() > 0) {
                        sportRecordUtil.addAvgEqualPace(report, arrayList);
                    }
                }
            } else {
                sportRecordUtil.addAvgSpeed(report, arrayList);
            }
        }
        if ((companion.getSPORT_INFO_MAX_SPEED() & sportTypeInfoBinary) == companion.getSPORT_INFO_MAX_SPEED()) {
            sportRecordUtil.addMaxSpeed(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_HRM() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_HRM()) {
            sportRecordUtil.addAvgRate(report, arrayList);
        }
        if ((companion.getSPORT_INFO_TOTAL_GOLF_SCORES() & sportTypeInfoBinary) == companion.getSPORT_INFO_TOTAL_GOLF_SCORES()) {
            sportRecordUtil.addTotalGolfScores(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_SWING_SPEED() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_SWING_SPEED()) {
            sportRecordUtil.addSwingSpeed(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_SWING_TIME() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_SWING_TIME()) {
            sportRecordUtil.addAvgSwingTime(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_DOWN_SWING_TIME() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_DOWN_SWING_TIME()) {
            sportRecordUtil.addAvgDownSwingTime(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_SWING_RHYTHM() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_SWING_RHYTHM()) {
            sportRecordUtil.addAvgSwingRhythm(report, arrayList);
        }
        if ((companion.getSPORT_INFO_TIMES() & sportTypeInfoBinary) == companion.getSPORT_INFO_TIMES()) {
            sportRecordUtil.addCounts(report, arrayList);
        }
        if ((companion.getSPORT_INFO_STUMBLE_TIMES() & sportTypeInfoBinary) == companion.getSPORT_INFO_STUMBLE_TIMES()) {
            sportRecordUtil.addStumbleTimes(report, arrayList);
        }
        if ((companion.getSPORT_INFO_STEPS() & sportTypeInfoBinary) == companion.getSPORT_INFO_STEPS()) {
            sportRecordUtil.addSteps(report, arrayList);
        }
        if ((companion.getSPORT_INFO_RISE_HEIGHT() & sportTypeInfoBinary) == companion.getSPORT_INFO_RISE_HEIGHT()) {
            sportRecordUtil.addRiseHeight(report, arrayList);
        }
        if ((companion.getSPORT_INFO_FALL_HEIGHT() & sportTypeInfoBinary) == companion.getSPORT_INFO_FALL_HEIGHT()) {
            sportRecordUtil.addFallHeight(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_HEIGHT() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_HEIGHT()) {
            sportRecordUtil.addAvgHeight(report, arrayList);
        }
        if ((companion.getSPORT_INFO_POSTURE() & sportTypeInfoBinary) == companion.getSPORT_INFO_POSTURE()) {
            sportRecordUtil.addSwimPosture(report, arrayList);
        }
        if ((companion.getSPORT_INFO_SKIING_COUNT() & sportTypeInfoBinary) == companion.getSPORT_INFO_SKIING_COUNT()) {
            sportRecordUtil.addTurnCount(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_ROW_FREQ() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_ROW_FREQ()) {
            if (sportType == 13) {
                sportRecordUtil.addAvgRowFreq(report, arrayList);
            } else {
                sportRecordUtil.addAvgStrokeFreq(report, arrayList);
            }
        }
        if ((companion.getSPORT_INFO_SWING_COUNT() & sportTypeInfoBinary) == companion.getSPORT_INFO_SWING_COUNT()) {
            sportRecordUtil.addSwingCount(report, arrayList);
        }
        if ((companion.getSPORT_INFO_MAX_SLOPE() & sportTypeInfoBinary) == companion.getSPORT_INFO_MAX_SLOPE()) {
            sportRecordUtil.addMaxSlope(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_RESISTANCE() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_RESISTANCE()) {
            sportRecordUtil.addAvgResistance(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_CADENCE() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_CADENCE()) {
            sportRecordUtil.addAvgCadence(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_POWER() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_POWER()) {
            sportRecordUtil.addAvgPower(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_STRESS() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_STRESS()) {
            sportRecordUtil.addAvgStress(report, arrayList);
        }
        if ((companion.getSPORT_INFO_SOMATOSENSORY_GAME() & sportTypeInfoBinary) == companion.getSPORT_INFO_SOMATOSENSORY_GAME()) {
            sportRecordUtil.addTotalPunchCount(report, arrayList);
            sportRecordUtil.addPunchHitRate(report, arrayList);
        }
        if (report.getProtoType() == 25) {
            if (report.getEntryTime() != null) {
                Long entryTime = report.getEntryTime();
                Intrinsics.checkNotNull(entryTime);
                if (entryTime.longValue() > 0 && report.getSportType() != 116) {
                    Long entryTime2 = report.getEntryTime();
                    Intrinsics.checkNotNull(entryTime2);
                    arrayList.add(new BasicItemInfo(j1j.a4, TimeDateUtil.getDateHHmmssFormat(entryTime2.longValue()), "", 0, null, null, 56, null));
                }
            }
            if (report.getExitTime() != null) {
                Long exitTime = report.getExitTime();
                Intrinsics.checkNotNull(exitTime);
                if (exitTime.longValue() > 0 && report.getSportType() != 116) {
                    Long exitTime2 = report.getExitTime();
                    Intrinsics.checkNotNull(exitTime2);
                    arrayList.add(new BasicItemInfo(j1j.b4, TimeDateUtil.getDateHHmmssFormat(exitTime2.longValue()), "", 0, null, null, 56, null));
                }
            }
            if (report.getDescentCount() != null) {
                Integer descentCount = report.getDescentCount();
                Intrinsics.checkNotNull(descentCount);
                if (descentCount.intValue() > 0 && report.getSportType() == 116) {
                    arrayList.add(new BasicItemInfo(j1j.X3, String.valueOf(report.getDescentCount()), "", 0, null, null, 56, null));
                }
            }
            if (report.getMaxWaterTemperature() != null && report.getMinWaterTemperature() != null) {
                Float maxWaterTemperature = report.getMaxWaterTemperature();
                Intrinsics.checkNotNull(maxWaterTemperature);
                int iRoundToInt = MathKt__MathJVMKt.roundToInt(maxWaterTemperature.floatValue());
                Float minWaterTemperature = report.getMinWaterTemperature();
                Intrinsics.checkNotNull(minWaterTemperature);
                if (iRoundToInt == MathKt__MathJVMKt.roundToInt(minWaterTemperature.floatValue())) {
                    Float maxWaterTemperature2 = report.getMaxWaterTemperature();
                    Intrinsics.checkNotNull(maxWaterTemperature2);
                    string = String.valueOf(MathKt__MathJVMKt.roundToInt(maxWaterTemperature2.floatValue()));
                } else {
                    Application app = AppUtil.getApp();
                    int i = j1j.m4;
                    Float minWaterTemperature2 = report.getMinWaterTemperature();
                    Intrinsics.checkNotNull(minWaterTemperature2);
                    Integer numValueOf = Integer.valueOf(MathKt__MathJVMKt.roundToInt(minWaterTemperature2.floatValue()));
                    Float maxWaterTemperature3 = report.getMaxWaterTemperature();
                    Intrinsics.checkNotNull(maxWaterTemperature3);
                    string = app.getString(i, numValueOf, Integer.valueOf(MathKt__MathJVMKt.roundToInt(maxWaterTemperature3.floatValue())));
                    Intrinsics.checkNotNull(string);
                }
                String str = string;
                String string2 = AppUtil.getApp().getString(j1j.n4);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList.add(new BasicItemInfo(j1j.l4, str, string2, 0, null, null, 56, null));
            }
            if (report.getAvgDivingDepth() != null) {
                Float avgDivingDepth = report.getAvgDivingDepth();
                Intrinsics.checkNotNull(avgDivingDepth);
                if (avgDivingDepth.floatValue() > 0.0f) {
                    Float avgDivingDepth2 = report.getAvgDivingDepth();
                    Intrinsics.checkNotNull(avgDivingDepth2);
                    String strG = xr5.g(1, avgDivingDepth2.floatValue());
                    Resources resources = AppUtil.getApp().getResources();
                    int i2 = oyi.n;
                    Float avgDivingDepth3 = report.getAvgDivingDepth();
                    Intrinsics.checkNotNull(avgDivingDepth3);
                    String quantityString = resources.getQuantityString(i2, (int) avgDivingDepth3.floatValue());
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    int i3 = j1j.H2;
                    Intrinsics.checkNotNull(strG);
                    arrayList.add(new BasicItemInfo(i3, strG, quantityString, 0, null, null, 56, null));
                }
            }
            if (report.getAvgAscentRate() != null) {
                Float avgAscentRate = report.getAvgAscentRate();
                Intrinsics.checkNotNull(avgAscentRate);
                if (avgAscentRate.floatValue() > 0.0f && report.getSportType() == 116) {
                    Float avgAscentRate2 = report.getAvgAscentRate();
                    Intrinsics.checkNotNull(avgAscentRate2);
                    String strG2 = xr5.g(1, avgAscentRate2.floatValue());
                    Float avgAscentRate3 = report.getAvgAscentRate();
                    Intrinsics.checkNotNull(avgAscentRate3);
                    String pluralsFloatUnit = getPluralsFloatUnit(avgAscentRate3.floatValue(), byi.n);
                    int i4 = j1j.P3;
                    Intrinsics.checkNotNull(strG2);
                    arrayList.add(new BasicItemInfo(i4, strG2, pluralsFloatUnit, 0, null, null, 56, null));
                }
            }
            if (report.getAvgDescentRate() != null) {
                Float avgDescentRate = report.getAvgDescentRate();
                Intrinsics.checkNotNull(avgDescentRate);
                if (avgDescentRate.floatValue() > 0.0f && report.getSportType() == 116) {
                    Float avgAscentRate4 = report.getAvgAscentRate();
                    Intrinsics.checkNotNull(avgAscentRate4);
                    String pluralsFloatUnit2 = getPluralsFloatUnit(avgAscentRate4.floatValue(), byi.n);
                    Float avgDescentRate2 = report.getAvgDescentRate();
                    Intrinsics.checkNotNull(avgDescentRate2);
                    String strG3 = xr5.g(1, avgDescentRate2.floatValue());
                    int i5 = j1j.Q3;
                    Intrinsics.checkNotNull(strG3);
                    arrayList.add(new BasicItemInfo(i5, strG3, pluralsFloatUnit2, 0, null, null, 56, null));
                }
            }
            if (report.getWaterBodyType() != null) {
                Integer waterBodyType = report.getWaterBodyType();
                Intrinsics.checkNotNull(waterBodyType);
                arrayList.add(new BasicItemInfo(j1j.o4, getSportWaterBodyTypeString(waterBodyType.intValue()), "", 0, null, null, 56, null));
            }
            if (report.getOxygenConcentration() != null) {
                Integer oxygenConcentration = report.getOxygenConcentration();
                Intrinsics.checkNotNull(oxygenConcentration);
                if (oxygenConcentration.intValue() > 0 && report.getSportType() != 116) {
                    arrayList.add(new BasicItemInfo(j1j.h4, String.valueOf(report.getOxygenConcentration()), "%", 0, null, null, 56, null));
                }
            }
            if (report.getOxygenPartialPressureThreshold() != null) {
                Float oxygenPartialPressureThreshold = report.getOxygenPartialPressureThreshold();
                Intrinsics.checkNotNull(oxygenPartialPressureThreshold);
                if (oxygenPartialPressureThreshold.floatValue() > 0.0f && report.getSportType() != 116) {
                    arrayList.add(new BasicItemInfo(j1j.i4, String.valueOf(report.getOxygenPartialPressureThreshold()), "", 0, null, null, 56, null));
                }
            }
        }
        if (report.getProtoType() == 9 || report.getProtoType() == 10) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(System.currentTimeMillis() / ((long) 1000));
            if (report.getFreeSwimDuration() != null) {
                Integer freeSwimDuration = report.getFreeSwimDuration();
                Intrinsics.checkNotNull(freeSwimDuration);
                arrayList.add(new BasicItemInfo(j1j.N4, TimeDateUtil.getDateHHmmssFormat(((long) freeSwimDuration.intValue()) + jChangZeroOfTheDay), "", 0, null, null, 56, null));
            }
            if (report.getFrogSwimDuration() != null) {
                Integer frogSwimDuration = report.getFrogSwimDuration();
                Intrinsics.checkNotNull(frogSwimDuration);
                arrayList.add(new BasicItemInfo(j1j.Q4, TimeDateUtil.getDateHHmmssFormat(((long) frogSwimDuration.intValue()) + jChangZeroOfTheDay), "", 0, null, null, 56, null));
            }
            if (report.getFrogSkiDuration() != null) {
                Integer frogSkiDuration = report.getFrogSkiDuration();
                Intrinsics.checkNotNull(frogSkiDuration);
                if (frogSkiDuration.intValue() > 0) {
                    Integer frogSkiDuration2 = report.getFrogSkiDuration();
                    Intrinsics.checkNotNull(frogSkiDuration2);
                    arrayList.add(new BasicItemInfo(j1j.R4, TimeDateUtil.getDateHHmmssFormat(((long) frogSkiDuration2.intValue()) + jChangZeroOfTheDay), "", 0, null, null, 56, null));
                }
            }
            if (report.getVentilationFrequency() != null) {
                Integer ventilationFrequency = report.getVentilationFrequency();
                Intrinsics.checkNotNull(ventilationFrequency);
                arrayList.add(new BasicItemInfo(j1j.P4, String.valueOf(ventilationFrequency.intValue()), "", 0, null, null, 56, null));
            }
        }
        Map<Integer, BasicItemInfo> map = mExtraDataListMap;
        Logger.i("SPORT_INFO", "mExtraDataListMap = " + map);
        int extraSportTypeInfoBinary = getExtraSportTypeInfoBinary(sportType);
        if ((companion.getSPORT_DATA_INFO_STEPS_FREQ() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_STEPS_FREQ() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_STEPS_FREQ())) == null) {
            sportRecordUtil.addStepCadence(report, arrayList);
            sportRecordUtil.addSportRunningTechnology(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_STEP_LENGTH() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_STEP_LENGTH() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_STEP_LENGTH())) == null) {
            sportRecordUtil.addAvgStepLength(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_AVG_SWOLF() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_AVG_SWOLF() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_AVG_SWOLF())) == null) {
            sportRecordUtil.addAvgSwolf(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_BEST_SWOLF() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_BEST_SWOLF() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_BEST_SWOLF())) == null) {
            sportRecordUtil.addBestSwolf(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_REST_DURATION() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_REST_DURATION() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_REST_DURATION())) == null) {
            sportRecordUtil.addGroupRestDuration(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_CHANGE_DURATION() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_CHANGE_DURATION() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_CHANGE_DURATION())) == null) {
            sportRecordUtil.addTriathlonChangeDuration(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_HANG_IN_AIR_DURATION() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_HANG_IN_AIR_DURATION() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_HANG_IN_AIR_DURATION())) == null) {
            sportRecordUtil.addHangInAirDuration(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_DISTANCE() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_DISTANCE() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_DISTANCE())) == null) {
            sportRecordUtil.addRunDistance(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_SHOOT_COUNT() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_SHOOT_COUNT() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_SHOOT_COUNT())) == null) {
            sportRecordUtil.addShootCount(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_DRIBBLE_DURATION() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_DRIBBLE_DURATION() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_DRIBBLE_DURATION())) == null) {
            sportRecordUtil.addDribbleDuration(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_FOREHAND_SWING_COUNT() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_FOREHAND_SWING_COUNT() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_FOREHAND_SWING_COUNT())) == null) {
            sportRecordUtil.addForehandSwingCount(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_BACKHAND_SWING_COUNT() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_BACKHAND_SWING_COUNT() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_BACKHAND_SWING_COUNT())) == null) {
            sportRecordUtil.addBackhandSwingCount(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_SMASH_BALL_COUNT() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_SMASH_BALL_COUNT() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_SMASH_BALL_COUNT())) == null) {
            sportRecordUtil.addSmashBallCount(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_SERVE_BALL_COUNT() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_SERVE_BALL_COUNT() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_SERVE_BALL_COUNT())) == null) {
            sportRecordUtil.addServeBallCount(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_AVG_SKIP_FREQ() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_AVG_SKIP_FREQ() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_AVG_SKIP_FREQ())) == null) {
            sportRecordUtil.addAvgSkipFreq(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_BEST_SKIP_FREQ() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_BEST_SKIP_FREQ() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_BEST_SKIP_FREQ())) == null) {
            sportRecordUtil.addBestSkipFreq(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_LAY_OARS() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_LAY_OARS() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_LAY_OARS())) == null) {
            sportRecordUtil.addLayOars(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_PULL_OARS() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_PULL_OARS() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_PULL_OARS())) == null) {
            sportRecordUtil.addPullOars(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_RECOVERY_HRM() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_RECOVERY_HRM() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_RECOVERY_HRM())) == null) {
            sportRecordUtil.addRecoveryHrm(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_ENERGY_WORKING() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_ENERGY_WORKING() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_ENERGY_WORKING())) == null) {
            sportRecordUtil.addEnergyWorking(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_TOTAL_CLIMBING() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_TOTAL_CLIMBING() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_TOTAL_CLIMBING())) == null) {
            sportRecordUtil.addTotalClimbing(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_MAX_HRM() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_MAX_HRM() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_MAX_HRM())) == null) {
            sportRecordUtil.addMaxHrm(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_BEST_ROW_FREQ() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_BEST_ROW_FREQ() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_BEST_ROW_FREQ())) == null) {
            sportRecordUtil.addBestRowFreq(report, arrayList);
        }
        if ((companion.getSPORT_DATA_INFO_AVG_STARTING_HEIGHT() & extraSportTypeInfoBinary) == companion.getSPORT_DATA_INFO_AVG_STARTING_HEIGHT() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_AVG_STARTING_HEIGHT())) == null) {
            sportRecordUtil.addAvgStartingHeight(report, arrayList);
        }
        if ((extraSportTypeInfoBinary & companion.getSPORT_DATA_INFO_MIN_STARTING_HEIGHT()) == companion.getSPORT_DATA_INFO_MIN_STARTING_HEIGHT() && map.get(Integer.valueOf(companion.getSPORT_DATA_INFO_MIN_STARTING_HEIGHT())) == null) {
            sportRecordUtil.addMinStartingHeight(report, arrayList);
        }
        return arrayList;
    }

    @NotNull
    public final List<BasicItemInfo> initCompactTraceBasicItemList(@NotNull SportBasicReport report, int sportType) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        if (report.getDistance() != null) {
            Integer distance = report.getDistance();
            Intrinsics.checkNotNull(distance);
            if (distance.intValue() > 0) {
                addDistance(report, arrayList);
            }
        }
        int sportTypeInfoBinary = getSportTypeInfoBinary(sportType);
        BasicItemInfo.Companion companion = BasicItemInfo.INSTANCE;
        if ((companion.getSPORT_INFO_DURATION() & sportTypeInfoBinary) == companion.getSPORT_INFO_DURATION()) {
            SportRecordUtil.INSTANCE.addDuration(report, arrayList);
        }
        if ((companion.getSPORT_INFO_CALORIE() & sportTypeInfoBinary) == companion.getSPORT_INFO_CALORIE()) {
            SportRecordUtil.INSTANCE.addTotalCalories(report, arrayList);
        }
        if ((companion.getSPORT_INFO_AVG_PACE() & sportTypeInfoBinary) == companion.getSPORT_INFO_AVG_PACE()) {
            SportRecordUtil.INSTANCE.addAvgPace(report, arrayList);
        }
        if ((sportTypeInfoBinary & companion.getSPORT_INFO_AVG_SPEED()) == companion.getSPORT_INFO_AVG_SPEED()) {
            SportRecordUtil.INSTANCE.addAvgSpeed(report, arrayList);
        }
        return arrayList;
    }

    public final void updateExtraToBasicList(int index, @NotNull BasicItemInfo basicItemInfo) {
        Intrinsics.checkNotNullParameter(basicItemInfo, "basicItemInfo");
        mExtraDataListMap.put(Integer.valueOf(index), basicItemInfo);
    }
}
