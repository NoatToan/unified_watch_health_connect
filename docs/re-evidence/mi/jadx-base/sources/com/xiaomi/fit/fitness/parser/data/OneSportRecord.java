package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0003\b\u0095\u0001\n\u0002\u0010 \n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010*\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010-\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001e\u00100\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\u001e\u00103\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R\u001e\u00106\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u001e\u00109\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R\u001e\u0010<\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R\u001e\u0010?\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R\u001e\u0010A\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010\u001eR\u001e\u0010D\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010\u001eR\u001e\u0010G\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u0010\u0017R\u001e\u0010J\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bK\u0010\u0015\"\u0004\bL\u0010\u0017R\u001e\u0010M\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bN\u0010\u0015\"\u0004\bO\u0010\u0017R\u001e\u0010P\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bQ\u0010\u0015\"\u0004\bR\u0010\u0017R\u001e\u0010S\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bT\u0010\u0015\"\u0004\bU\u0010\u0017R\u001e\u0010V\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bW\u0010\u0015\"\u0004\bX\u0010\u0017R\u001e\u0010Y\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bZ\u0010\u0015\"\u0004\b[\u0010\u0017R\u001e\u0010\\\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b]\u0010\u0015\"\u0004\b^\u0010\u0017R\u001e\u0010_\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b`\u0010\u0015\"\u0004\ba\u0010\u0017R\u001e\u0010b\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010\u0017R\u001e\u0010e\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bf\u0010\u0015\"\u0004\bg\u0010\u0017R\u001e\u0010h\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bi\u0010\u0015\"\u0004\bj\u0010\u0017R\u001e\u0010k\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bl\u0010\u0015\"\u0004\bm\u0010\u0017R\u001e\u0010n\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bo\u0010\u0015\"\u0004\bp\u0010\u0017R\u001e\u0010q\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\br\u0010\u0015\"\u0004\bs\u0010\u0017R\u001e\u0010t\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bu\u0010\u001c\"\u0004\bv\u0010\u001eR\u001e\u0010w\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bx\u0010\u001c\"\u0004\by\u0010\u001eR\u001e\u0010z\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b{\u0010\u001c\"\u0004\b|\u0010\u001eR\u001e\u0010}\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b~\u0010\u001c\"\u0004\b\u007f\u0010\u001eR!\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u0081\u0001\u0010\u0015\"\u0005\b\u0082\u0001\u0010\u0017R!\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u0084\u0001\u0010\u0015\"\u0005\b\u0085\u0001\u0010\u0017R!\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u0087\u0001\u0010\u0015\"\u0005\b\u0088\u0001\u0010\u0017R!\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u008a\u0001\u0010\u0015\"\u0005\b\u008b\u0001\u0010\u0017R!\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001f\u001a\u0005\b\u008d\u0001\u0010\u001c\"\u0005\b\u008e\u0001\u0010\u001eR!\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u0090\u0001\u0010\u0015\"\u0005\b\u0091\u0001\u0010\u0017R!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u0093\u0001\u0010\u0015\"\u0005\b\u0094\u0001\u0010\u0017R!\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001f\u001a\u0005\b\u0096\u0001\u0010\u001c\"\u0005\b\u0097\u0001\u0010\u001eR!\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u0099\u0001\u0010\u0015\"\u0005\b\u009a\u0001\u0010\u0017R!\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u009c\u0001\u0010\u0015\"\u0005\b\u009d\u0001\u0010\u0017R!\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b\u009f\u0001\u0010\u0015\"\u0005\b \u0001\u0010\u0017R!\u0010¡\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b¢\u0001\u0010\u0015\"\u0005\b£\u0001\u0010\u0017R!\u0010¤\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b¥\u0001\u0010\u0015\"\u0005\b¦\u0001\u0010\u0017R!\u0010§\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b¨\u0001\u0010\u0015\"\u0005\b©\u0001\u0010\u0017R!\u0010ª\u0001\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001f\u001a\u0005\b«\u0001\u0010\u001c\"\u0005\b¬\u0001\u0010\u001eR!\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001f\u001a\u0005\b®\u0001\u0010\u001c\"\u0005\b¯\u0001\u0010\u001eR!\u0010°\u0001\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001f\u001a\u0005\b±\u0001\u0010\u001c\"\u0005\b²\u0001\u0010\u001eR!\u0010³\u0001\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u001f\u001a\u0005\b´\u0001\u0010\u001c\"\u0005\bµ\u0001\u0010\u001eR!\u0010¶\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\b·\u0001\u0010\u0015\"\u0005\b¸\u0001\u0010\u0017R(\u0010¹\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010º\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R!\u0010¿\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\bÀ\u0001\u0010\u0015\"\u0005\bÁ\u0001\u0010\u0017R!\u0010Â\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\bÃ\u0001\u0010\u0015\"\u0005\bÄ\u0001\u0010\u0017R!\u0010Å\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\bÆ\u0001\u0010\u0015\"\u0005\bÇ\u0001\u0010\u0017R!\u0010È\u0001\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0002\u0010\u0018\u001a\u0005\bÉ\u0001\u0010\u0015\"\u0005\bÊ\u0001\u0010\u0017¨\u0006Ë\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/OneSportRecord;", "", "startTime", "", "endTime", "<init>", "(JJ)V", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "type", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "height", "", "getHeight", "()Ljava/lang/Float;", "setHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "heightChange", "getHeightChange", "setHeightChange", FitnessRecordKey.updateType, "", "getUpdateType", "()Ljava/lang/Boolean;", "setUpdateType", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "calories", "getCalories", "setCalories", "totalCal", "getTotalCal", "setTotalCal", "steps", "getSteps", "setSteps", FitnessRecordKey.stride, "getStride", "setStride", FitnessRecordKey.cadence, "getCadence", "setCadence", FitnessRecordKey.cycleCadence, "getCycleCadence", "setCycleCadence", "hr", "getHr", "setHr", "isWholeKMPoint", "setWholeKMPoint", "distance", "getDistance", "setDistance", "speed", "getSpeed", "setSpeed", "count", "getCount", FitnessReportKey.setCount, FitnessReportKey.mainPosture, "getMainPosture", "setMainPosture", "pace", "getPace", "setPace", "swolf", "getSwolf", "setSwolf", FitnessReportKey.strokeCount, "getStrokeCount", "setStrokeCount", "strokeFreq", "getStrokeFreq", "setStrokeFreq", "unknownStrokeFreq", "getUnknownStrokeFreq", "setUnknownStrokeFreq", "breastStrokeFreq", "getBreastStrokeFreq", "setBreastStrokeFreq", "crawlStrokeFreq", "getCrawlStrokeFreq", "setCrawlStrokeFreq", "backStrokeFreq", "getBackStrokeFreq", "setBackStrokeFreq", "butterflyStrokeFreq", "getButterflyStrokeFreq", "setButterflyStrokeFreq", "resistance", "getResistance", "setResistance", "pullOars", "getPullOars", "setPullOars", "layOars", "getLayOars", "setLayOars", FitnessReportKey.dribbleDuration, "getDribbleDuration", "setDribbleDuration", "backSwingDuration", "getBackSwingDuration", "setBackSwingDuration", "downSwingDuration", "getDownSwingDuration", "setDownSwingDuration", FitnessRecordKey.swingRhythm, "getSwingRhythm", "setSwingRhythm", FitnessRecordKey.swingSpeed, "getSwingSpeed", "setSwingSpeed", "stumbleTimes", "getStumbleTimes", "setStumbleTimes", "skipStartingHeight", "getSkipStartingHeight", "setSkipStartingHeight", "spo2", "getSpo2", "setSpo2", "stress", "getStress", "setStress", "landingImpact", "getLandingImpact", "setLandingImpact", "touchdownTime", "getTouchdownTime", "setTouchdownTime", "inTheAirTime", "getInTheAirTime", "setInTheAirTime", "touchdownAirRatio", "getTouchdownAirRatio", "setTouchdownAirRatio", "power", "getPower", "setPower", "rowingCadence", "getRowingCadence", "setRowingCadence", "jumpCadence", "getJumpCadence", "setJumpCadence", FitnessRecordKey.equalIntensityPace, "getEqualIntensityPace", "setEqualIntensityPace", FitnessRecordKey.runningPower, "getRunningPower", "setRunningPower", "divingStatus", "getDivingStatus", "setDivingStatus", "divingDepth", "getDivingDepth", "setDivingDepth", "divingTemperature", "getDivingTemperature", "setDivingTemperature", FitnessRecordKey.verticalStrideRatio, "getVerticalStrideRatio", "setVerticalStrideRatio", FitnessRecordKey.verticalAmplitude, "getVerticalAmplitude", "setVerticalAmplitude", "swimmingHrCount", "getSwimmingHrCount", "setSwimmingHrCount", "swimmingHr", "", "getSwimmingHr", "()Ljava/util/List;", "setSwimmingHr", "(Ljava/util/List;)V", "freeBreathAngle", "getFreeBreathAngle", "setFreeBreathAngle", "freePitchAngle", "getFreePitchAngle", "setFreePitchAngle", "frogBreathAngle", "getFrogBreathAngle", "setFrogBreathAngle", "frogSkiDuration", "getFrogSkiDuration", "setFrogSkiDuration", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OneSportRecord {

    @Nullable
    private Integer backStrokeFreq;

    @Nullable
    private Float backSwingDuration;

    @Nullable
    private Integer breastStrokeFreq;

    @Nullable
    private Integer butterflyStrokeFreq;

    @Nullable
    private Integer cadence;

    @Nullable
    private Integer calories;

    @Nullable
    private Integer count;

    @Nullable
    private Integer crawlStrokeFreq;

    @Nullable
    private Integer cycleCadence;

    @Nullable
    private Float distance;

    @Nullable
    private Float divingDepth;

    @Nullable
    private Integer divingStatus;

    @Nullable
    private Float divingTemperature;

    @Nullable
    private Float downSwingDuration;

    @Nullable
    private Integer dribbleDuration;
    private int duration;
    private long endTime;

    @Nullable
    private Integer equalIntensityPace;

    @Nullable
    private Integer freeBreathAngle;

    @Nullable
    private Integer freePitchAngle;

    @Nullable
    private Integer frogBreathAngle;

    @Nullable
    private Integer frogSkiDuration;

    @Nullable
    private Float height;

    @Nullable
    private Float heightChange;

    @Nullable
    private Integer hr;

    @Nullable
    private Integer inTheAirTime;

    @Nullable
    private Boolean isWholeKMPoint;

    @Nullable
    private Integer jumpCadence;

    @Nullable
    private Float landingImpact;

    @Nullable
    private Integer layOars;

    @Nullable
    private Integer mainPosture;

    @Nullable
    private Integer pace;

    @Nullable
    private Integer power;

    @Nullable
    private Integer pullOars;

    @Nullable
    private Integer resistance;

    @Nullable
    private Integer rowingCadence;

    @Nullable
    private Integer runningPower;

    @Nullable
    private Integer skipStartingHeight;

    @Nullable
    private Float speed;

    @Nullable
    private Integer spo2;
    private long startTime;

    @Nullable
    private Integer steps;

    @Nullable
    private Integer stress;

    @Nullable
    private Integer stride;

    @Nullable
    private Integer strokeCount;

    @Nullable
    private Integer strokeFreq;

    @Nullable
    private Integer stumbleTimes;

    @Nullable
    private List<Integer> swimmingHr;

    @Nullable
    private Integer swimmingHrCount;

    @Nullable
    private Float swingRhythm;

    @Nullable
    private Float swingSpeed;

    @Nullable
    private Integer swolf;

    @Nullable
    private Integer totalCal;

    @Nullable
    private Float touchdownAirRatio;

    @Nullable
    private Integer touchdownTime;

    @Nullable
    private Integer type;

    @Nullable
    private Integer unknownStrokeFreq;

    @Nullable
    private Boolean updateType;

    @Nullable
    private Float verticalAmplitude;

    @Nullable
    private Float verticalStrideRatio;

    public OneSportRecord(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    @Nullable
    public final Integer getBackStrokeFreq() {
        return this.backStrokeFreq;
    }

    @Nullable
    public final Float getBackSwingDuration() {
        return this.backSwingDuration;
    }

    @Nullable
    public final Integer getBreastStrokeFreq() {
        return this.breastStrokeFreq;
    }

    @Nullable
    public final Integer getButterflyStrokeFreq() {
        return this.butterflyStrokeFreq;
    }

    @Nullable
    public final Integer getCadence() {
        return this.cadence;
    }

    @Nullable
    public final Integer getCalories() {
        return this.calories;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getCrawlStrokeFreq() {
        return this.crawlStrokeFreq;
    }

    @Nullable
    public final Integer getCycleCadence() {
        return this.cycleCadence;
    }

    @Nullable
    public final Float getDistance() {
        return this.distance;
    }

    @Nullable
    public final Float getDivingDepth() {
        return this.divingDepth;
    }

    @Nullable
    public final Integer getDivingStatus() {
        return this.divingStatus;
    }

    @Nullable
    public final Float getDivingTemperature() {
        return this.divingTemperature;
    }

    @Nullable
    public final Float getDownSwingDuration() {
        return this.downSwingDuration;
    }

    @Nullable
    public final Integer getDribbleDuration() {
        return this.dribbleDuration;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Integer getEqualIntensityPace() {
        return this.equalIntensityPace;
    }

    @Nullable
    public final Integer getFreeBreathAngle() {
        return this.freeBreathAngle;
    }

    @Nullable
    public final Integer getFreePitchAngle() {
        return this.freePitchAngle;
    }

    @Nullable
    public final Integer getFrogBreathAngle() {
        return this.frogBreathAngle;
    }

    @Nullable
    public final Integer getFrogSkiDuration() {
        return this.frogSkiDuration;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final Float getHeightChange() {
        return this.heightChange;
    }

    @Nullable
    public final Integer getHr() {
        return this.hr;
    }

    @Nullable
    public final Integer getInTheAirTime() {
        return this.inTheAirTime;
    }

    @Nullable
    public final Integer getJumpCadence() {
        return this.jumpCadence;
    }

    @Nullable
    public final Float getLandingImpact() {
        return this.landingImpact;
    }

    @Nullable
    public final Integer getLayOars() {
        return this.layOars;
    }

    @Nullable
    public final Integer getMainPosture() {
        return this.mainPosture;
    }

    @Nullable
    public final Integer getPace() {
        return this.pace;
    }

    @Nullable
    public final Integer getPower() {
        return this.power;
    }

    @Nullable
    public final Integer getPullOars() {
        return this.pullOars;
    }

    @Nullable
    public final Integer getResistance() {
        return this.resistance;
    }

    @Nullable
    public final Integer getRowingCadence() {
        return this.rowingCadence;
    }

    @Nullable
    public final Integer getRunningPower() {
        return this.runningPower;
    }

    @Nullable
    public final Integer getSkipStartingHeight() {
        return this.skipStartingHeight;
    }

    @Nullable
    public final Float getSpeed() {
        return this.speed;
    }

    @Nullable
    public final Integer getSpo2() {
        return this.spo2;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Integer getSteps() {
        return this.steps;
    }

    @Nullable
    public final Integer getStress() {
        return this.stress;
    }

    @Nullable
    public final Integer getStride() {
        return this.stride;
    }

    @Nullable
    public final Integer getStrokeCount() {
        return this.strokeCount;
    }

    @Nullable
    public final Integer getStrokeFreq() {
        return this.strokeFreq;
    }

    @Nullable
    public final Integer getStumbleTimes() {
        return this.stumbleTimes;
    }

    @Nullable
    public final List<Integer> getSwimmingHr() {
        return this.swimmingHr;
    }

    @Nullable
    public final Integer getSwimmingHrCount() {
        return this.swimmingHrCount;
    }

    @Nullable
    public final Float getSwingRhythm() {
        return this.swingRhythm;
    }

    @Nullable
    public final Float getSwingSpeed() {
        return this.swingSpeed;
    }

    @Nullable
    public final Integer getSwolf() {
        return this.swolf;
    }

    @Nullable
    public final Integer getTotalCal() {
        return this.totalCal;
    }

    @Nullable
    public final Float getTouchdownAirRatio() {
        return this.touchdownAirRatio;
    }

    @Nullable
    public final Integer getTouchdownTime() {
        return this.touchdownTime;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUnknownStrokeFreq() {
        return this.unknownStrokeFreq;
    }

    @Nullable
    public final Boolean getUpdateType() {
        return this.updateType;
    }

    @Nullable
    public final Float getVerticalAmplitude() {
        return this.verticalAmplitude;
    }

    @Nullable
    public final Float getVerticalStrideRatio() {
        return this.verticalStrideRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: isWholeKMPoint, reason: from getter */
    public final Boolean getIsWholeKMPoint() {
        return this.isWholeKMPoint;
    }

    public final void setBackStrokeFreq(@Nullable Integer num) {
        this.backStrokeFreq = num;
    }

    public final void setBackSwingDuration(@Nullable Float f) {
        this.backSwingDuration = f;
    }

    public final void setBreastStrokeFreq(@Nullable Integer num) {
        this.breastStrokeFreq = num;
    }

    public final void setButterflyStrokeFreq(@Nullable Integer num) {
        this.butterflyStrokeFreq = num;
    }

    public final void setCadence(@Nullable Integer num) {
        this.cadence = num;
    }

    public final void setCalories(@Nullable Integer num) {
        this.calories = num;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setCrawlStrokeFreq(@Nullable Integer num) {
        this.crawlStrokeFreq = num;
    }

    public final void setCycleCadence(@Nullable Integer num) {
        this.cycleCadence = num;
    }

    public final void setDistance(@Nullable Float f) {
        this.distance = f;
    }

    public final void setDivingDepth(@Nullable Float f) {
        this.divingDepth = f;
    }

    public final void setDivingStatus(@Nullable Integer num) {
        this.divingStatus = num;
    }

    public final void setDivingTemperature(@Nullable Float f) {
        this.divingTemperature = f;
    }

    public final void setDownSwingDuration(@Nullable Float f) {
        this.downSwingDuration = f;
    }

    public final void setDribbleDuration(@Nullable Integer num) {
        this.dribbleDuration = num;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setEqualIntensityPace(@Nullable Integer num) {
        this.equalIntensityPace = num;
    }

    public final void setFreeBreathAngle(@Nullable Integer num) {
        this.freeBreathAngle = num;
    }

    public final void setFreePitchAngle(@Nullable Integer num) {
        this.freePitchAngle = num;
    }

    public final void setFrogBreathAngle(@Nullable Integer num) {
        this.frogBreathAngle = num;
    }

    public final void setFrogSkiDuration(@Nullable Integer num) {
        this.frogSkiDuration = num;
    }

    public final void setHeight(@Nullable Float f) {
        this.height = f;
    }

    public final void setHeightChange(@Nullable Float f) {
        this.heightChange = f;
    }

    public final void setHr(@Nullable Integer num) {
        this.hr = num;
    }

    public final void setInTheAirTime(@Nullable Integer num) {
        this.inTheAirTime = num;
    }

    public final void setJumpCadence(@Nullable Integer num) {
        this.jumpCadence = num;
    }

    public final void setLandingImpact(@Nullable Float f) {
        this.landingImpact = f;
    }

    public final void setLayOars(@Nullable Integer num) {
        this.layOars = num;
    }

    public final void setMainPosture(@Nullable Integer num) {
        this.mainPosture = num;
    }

    public final void setPace(@Nullable Integer num) {
        this.pace = num;
    }

    public final void setPower(@Nullable Integer num) {
        this.power = num;
    }

    public final void setPullOars(@Nullable Integer num) {
        this.pullOars = num;
    }

    public final void setResistance(@Nullable Integer num) {
        this.resistance = num;
    }

    public final void setRowingCadence(@Nullable Integer num) {
        this.rowingCadence = num;
    }

    public final void setRunningPower(@Nullable Integer num) {
        this.runningPower = num;
    }

    public final void setSkipStartingHeight(@Nullable Integer num) {
        this.skipStartingHeight = num;
    }

    public final void setSpeed(@Nullable Float f) {
        this.speed = f;
    }

    public final void setSpo2(@Nullable Integer num) {
        this.spo2 = num;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSteps(@Nullable Integer num) {
        this.steps = num;
    }

    public final void setStress(@Nullable Integer num) {
        this.stress = num;
    }

    public final void setStride(@Nullable Integer num) {
        this.stride = num;
    }

    public final void setStrokeCount(@Nullable Integer num) {
        this.strokeCount = num;
    }

    public final void setStrokeFreq(@Nullable Integer num) {
        this.strokeFreq = num;
    }

    public final void setStumbleTimes(@Nullable Integer num) {
        this.stumbleTimes = num;
    }

    public final void setSwimmingHr(@Nullable List<Integer> list) {
        this.swimmingHr = list;
    }

    public final void setSwimmingHrCount(@Nullable Integer num) {
        this.swimmingHrCount = num;
    }

    public final void setSwingRhythm(@Nullable Float f) {
        this.swingRhythm = f;
    }

    public final void setSwingSpeed(@Nullable Float f) {
        this.swingSpeed = f;
    }

    public final void setSwolf(@Nullable Integer num) {
        this.swolf = num;
    }

    public final void setTotalCal(@Nullable Integer num) {
        this.totalCal = num;
    }

    public final void setTouchdownAirRatio(@Nullable Float f) {
        this.touchdownAirRatio = f;
    }

    public final void setTouchdownTime(@Nullable Integer num) {
        this.touchdownTime = num;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUnknownStrokeFreq(@Nullable Integer num) {
        this.unknownStrokeFreq = num;
    }

    public final void setUpdateType(@Nullable Boolean bool) {
        this.updateType = bool;
    }

    public final void setVerticalAmplitude(@Nullable Float f) {
        this.verticalAmplitude = f;
    }

    public final void setVerticalStrideRatio(@Nullable Float f) {
        this.verticalStrideRatio = f;
    }

    public final void setWholeKMPoint(@Nullable Boolean bool) {
        this.isWholeKMPoint = bool;
    }
}
