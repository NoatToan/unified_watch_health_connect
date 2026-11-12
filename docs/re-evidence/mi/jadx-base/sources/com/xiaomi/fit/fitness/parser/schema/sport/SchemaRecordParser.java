package com.xiaomi.fit.fitness.parser.schema.sport;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.OneSportRecord;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fit.fitness.parser.schema.BaseParser;
import com.xiaomi.fit.fitness.parser.schema.BinarySchemaDecoder;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J@\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00182\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0017\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0002\b-J\b\u0010.\u001a\u00020\u001aH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010)\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/sport/SchemaRecordParser;", "Lcom/xiaomi/fit/fitness/parser/schema/BaseParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "parser", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", SchemaNetUtils.SchemaDir, "convertSportRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "mapResult", "", "", DailyRecordKey.sportType, "", "heightChangeSign", "", "getHeightChangeSign", "()Z", "setHeightChangeSign", "(Z)V", "buildSportRecord", "", "thisSportRecord", "Lcom/xiaomi/fit/fitness/parser/data/OneSportRecord;", "sportRecord", "subKey", "subValue", "map", "tzDiffInSec", "getCurTzDiffInSec", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getCurTzDiffInSec$fitness_parser_release", "getDistanceRecordTimes", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchemaRecordParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaRecordParser.kt\ncom/xiaomi/fit/fitness/parser/schema/sport/SchemaRecordParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,443:1\n1863#2:444\n1864#2:449\n1863#2:450\n1863#2,2:452\n1864#2:455\n216#3:445\n216#3,2:446\n217#3:448\n216#3:451\n217#3:454\n*S KotlinDebug\n*F\n+ 1 SchemaRecordParser.kt\ncom/xiaomi/fit/fitness/parser/schema/sport/SchemaRecordParser\n*L\n100#1:444\n100#1:449\n374#1:450\n376#1:452,2\n374#1:455\n102#1:445\n104#1:446,2\n102#1:448\n375#1:451\n375#1:454\n*E\n"})
public final class SchemaRecordParser extends BaseParser {

    @NotNull
    public static final SchemaRecordParser INSTANCE = new SchemaRecordParser();

    @NotNull
    private static String TAG = "Schema_RecordParser";

    @NotNull
    private static final Gson gson = new Gson();
    private static boolean heightChangeSign = true;
    private static int tzDiffInSec;

    private SchemaRecordParser() {
    }

    private final void buildSportRecord(OneSportRecord thisSportRecord, SportRecord sportRecord, String subKey, Object subValue, Map<String, ? extends Object> map) {
        int i;
        switch (subKey.hashCode()) {
            case -1971318991:
                if (subKey.equals(FitnessRecordKey.breastStrokeGlidingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setFrogSkiDuration(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1970624770:
                if (subKey.equals(FitnessRecordKey.movementsType)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setType(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1822074451:
                if (subKey.equals(FitnessRecordKey.verticalAmplitude)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setVerticalAmplitude(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case -1642832491:
                subKey.equals(FitnessRecordKey.speedInfo);
                return;
            case -1628259822:
                if (subKey.equals(FitnessRecordKey.equalIntensityPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setEqualIntensityPace(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1607243192:
                if (subKey.equals("endTime")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setEndTime(((long) ((Double) subValue).doubleValue()) + ((long) getCurTzDiffInSec$fitness_parser_release(null)));
                    return;
                }
                return;
            case -1403358331:
                if (subKey.equals(FitnessRecordKey.newImpactForce)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setLandingImpact(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case -1376017918:
                if (subKey.equals(FitnessRecordKey.sectionUnknownSwimmingStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setUnknownStrokeFreq(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1331326691:
                if (subKey.equals(FitnessRecordKey.newFlightTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setInTheAirTime(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1281392663:
                if (subKey.equals(FitnessRecordKey.swingSpeed)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setSwingSpeed(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1109659744:
                if (subKey.equals(FitnessRecordKey.runDistance)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiTotalDistance(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1103873740:
                if (subKey.equals(FitnessRecordKey.swingRhythm)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setSwingRhythm(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -1005060158:
                if (subKey.equals(FitnessRecordKey.minTemperature)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingMinTemperature(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -961606546:
                if (subKey.equals(FitnessRecordKey.descentDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingInSectionDuration(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -935813025:
                if (subKey.equals(FitnessRecordKey.sectionStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setStrokeFreq(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -907602187:
                if (subKey.equals(FitnessRecordKey.jumpHeight)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setSkipStartingHeight(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -892481550:
                if (subKey.equals("status")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setDivingStatus(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -891986215:
                if (subKey.equals(FitnessRecordKey.stride)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setStride(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -635140388:
                if (subKey.equals("totalWeight")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setPower(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -630967586:
                if (subKey.equals(FitnessRecordKey.avgDeep)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingAvgDepth(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -582320600:
                if (subKey.equals(FitnessRecordKey.updateValue) && sportRecord.getHeight() != null) {
                    i = heightChangeSign ? 1 : -1;
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    float fDoubleValue = (i * ((int) ((Double) subValue).doubleValue())) / 10.0f;
                    Float height = sportRecord.getHeight();
                    Intrinsics.checkNotNull(height);
                    thisSportRecord.setHeight(Float.valueOf(height.floatValue() + fDoubleValue));
                    thisSportRecord.setHeightChange(Float.valueOf(fDoubleValue));
                    sportRecord.setHeight(thisSportRecord.getHeight());
                    return;
                }
                return;
            case -577281999:
                if (subKey.equals("totalTime")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiTotalTime(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -564129845:
                if (subKey.equals(FitnessRecordKey.cycleCadence)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setCycleCadence(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -536808599:
                if (subKey.equals(FitnessRecordKey.climbDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setBackSwingDuration(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -494160302:
                if (subKey.equals(FitnessRecordKey.isAltitudeRising)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    heightChangeSign = ((int) ((Double) subValue).doubleValue()) > 0;
                    return;
                }
                return;
            case -465206778:
                if (subKey.equals(FitnessRecordKey.initialAltitude)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setHeight(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -463416785:
                if (subKey.equals("totalMovementsCount")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setCount(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -412125485:
                if (subKey.equals(FitnessRecordKey.sectionFreeStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setCrawlStrokeFreq(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -295915613:
                if (subKey.equals(FitnessRecordKey.updateType)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    heightChangeSign = ((int) ((Double) subValue).doubleValue()) > 0;
                    return;
                }
                return;
            case -286415170:
                if (subKey.equals(FitnessRecordKey.isKilometer)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setWholeKMPoint(Boolean.valueOf(((int) ((Double) subValue).doubleValue()) > 0));
                    return;
                }
                return;
            case -260193847:
                if (subKey.equals(FitnessRecordKey.tripCounts)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setStumbleTimes(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -184527139:
                if (subKey.equals("totalArmPull")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setCount(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -150231406:
                if (subKey.equals("turnCount")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setCount(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -142506390:
                if (subKey.equals("totalCalories")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setTotalCal(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -63512521:
                if (subKey.equals(FitnessRecordKey.freeStrokepitchAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setFreePitchAngle(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case -13073202:
                if (subKey.equals(FitnessRecordKey.jumpFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setJumpCadence(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 3079404:
                if (subKey.equals(FitnessRecordKey.deep)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setDivingDepth(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 3432979:
                if (subKey.equals("pace")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setPace(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 64765322:
                if (subKey.equals(FitnessRecordKey.upwardFloatingSpeed)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingAvgUpSpeed(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 106858757:
                if (subKey.equals("power")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setPower(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 109641799:
                if (subKey.equals("speed")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setSpeed(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 167668003:
                if (subKey.equals("routeType")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setSkiPath(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 200416838:
                if (subKey.equals("heartRate")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setHr(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 314918745:
                if (subKey.equals("totalDistance")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setDistance(Float.valueOf(((int) ((Double) subValue).doubleValue()) / (getDistanceRecordTimes() * 1.0f)));
                    return;
                }
                return;
            case 321701236:
                if (subKey.equals("temperature")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setDivingTemperature(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 336720075:
                if (!subKey.equals(FitnessRecordKey.totalSlipCount)) {
                    return;
                }
                break;
            case 343825218:
                if (subKey.equals(FitnessRecordKey.avgTemperature)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingAvgTemperature(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 396787367:
                if (subKey.equals("maxSlope")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiSlope(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 396896579:
                if (subKey.equals("maxSpeed")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiMaxSpeed(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 425198928:
                if (subKey.equals(FitnessRecordKey.downswingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setDownSwingDuration(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 464943441:
                if (subKey.equals("mainStroke")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setMainPosture(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 469628841:
                if (!subKey.equals(FitnessRecordKey.jumpsCounts)) {
                    return;
                }
                break;
            case 541048721:
                if (subKey.equals(FitnessRecordKey.cadence)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    Double d = (Double) subValue;
                    thisSportRecord.setCadence(Integer.valueOf((int) d.doubleValue()));
                    thisSportRecord.setCycleCadence(Integer.valueOf((int) d.doubleValue()));
                    return;
                }
                return;
            case 543921485:
                if (subKey.equals(FitnessRecordKey.newContactTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setTouchdownTime(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 573655282:
                if (subKey.equals(FitnessRecordKey.altitudeChange)) {
                    Object obj = map != null ? map.get(FitnessRecordKey.isAltitudeRising) : null;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
                    i = ((int) ((Double) obj).doubleValue()) != 0 ? 1 : -1;
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    float fDoubleValue2 = (i * ((int) ((Double) subValue).doubleValue())) / 10.0f;
                    Float height2 = sportRecord.getHeight();
                    Intrinsics.checkNotNull(height2);
                    thisSportRecord.setHeight(Float.valueOf(height2.floatValue() + fDoubleValue2));
                    thisSportRecord.setHeightChange(Float.valueOf(fDoubleValue2));
                    sportRecord.setHeight(thisSportRecord.getHeight());
                    return;
                }
                return;
            case 574708376:
                if (subKey.equals(FitnessRecordKey.sectionPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setPace(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 639528288:
                if (subKey.equals(FitnessRecordKey.sectionSwolf)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setSwolf(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 826229382:
                if (subKey.equals(FitnessRecordKey.runningPower)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setRunningPower(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 843629680:
                if (subKey.equals(FitnessRecordKey.maxDeep)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingMaxDepth(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 904835391:
                if (subKey.equals(FitnessRecordKey.runDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiTotalTime(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 939312676:
                if (subKey.equals(FitnessRecordKey.sectionPointCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setSwimmingHrCount(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1087781062:
                if (subKey.equals("newCalories")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setCalories(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1114340188:
                if (subKey.equals(FitnessRecordKey.verticalStrideRatio)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setVerticalStrideRatio(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 1174520326:
                if (subKey.equals(FitnessRecordKey.newSkiingDistance)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setDistance(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1220494058:
                if (subKey.equals(FitnessRecordKey.heartRatePoint)) {
                    ArrayList arrayList = new ArrayList();
                    if (subValue instanceof List) {
                        for (Map map2 : (List) subValue) {
                            if (map2 != null) {
                                Iterator it = map2.entrySet().iterator();
                                while (it.hasNext()) {
                                    for (Object obj2 : ((Map) ((Map.Entry) it.next()).getValue()).values()) {
                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Double");
                                        arrayList.add(Integer.valueOf((int) ((Double) obj2).doubleValue()));
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }
                    thisSportRecord.setSwimmingHr(arrayList);
                    return;
                }
                return;
            case 1257903450:
                if (subKey.equals(FitnessRecordKey.freeStrokeVentilationAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setFreeBreathAngle(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1261265656:
                if (subKey.equals(FitnessRecordKey.sectionBackStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setBackStrokeFreq(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1265356747:
                if (subKey.equals(FitnessRecordKey.contactRatio)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setTouchdownAirRatio(Float.valueOf(((float) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 1269488658:
                if (subKey.equals(FitnessRecordKey.sectionBreastStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setBreastStrokeFreq(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1366244711:
                if (subKey.equals("newSteps")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setSteps(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1380298244:
                if (subKey.equals("strokeFrequency")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setRowingCadence(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1493678203:
                if (subKey.equals(FitnessRecordKey.breastStrokeVentilationAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setFrogBreathAngle(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1545206197:
                if (subKey.equals("newDistance")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setDistance(Float.valueOf(((float) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 1789070852:
                if (subKey.equals("dataType")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setType(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1863800889:
                if (subKey.equals("resistance")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setResistance(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1875980054:
                if (subKey.equals(FitnessRecordKey.sectionButterflyStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setButterflyStrokeFreq(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1923303468:
                if (subKey.equals("activeCalories")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setCalories(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1927312414:
                if (subKey.equals(FitnessRecordKey.surfaceWaterDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingOutSectionDuration(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 1929021589:
                if (subKey.equals("avgSpeed")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiAvgSpeed(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 2036550306:
                if (subKey.equals("altitude")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    thisSportRecord.setHeight(Float.valueOf(((int) ((Double) subValue).doubleValue()) / 10.0f));
                    return;
                }
                return;
            case 2104583071:
                if (subKey.equals(FitnessRecordKey.avgDescentSpeed)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setDivingAvgDownSpeed(Float.valueOf((float) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            case 2146477270:
                if (subKey.equals(FitnessRecordKey.skiPath)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setSkiPath(Integer.valueOf((int) ((Double) subValue).doubleValue()));
                    return;
                }
                return;
            default:
                return;
        }
        Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Double");
        thisSportRecord.setCount(Integer.valueOf((int) ((Double) subValue).doubleValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void buildSportRecord$default(SchemaRecordParser schemaRecordParser, OneSportRecord oneSportRecord, SportRecord sportRecord, String str, Object obj, Map map, int i, Object obj2) {
        if ((i & 16) != 0) {
            map = null;
        }
        schemaRecordParser.buildSportRecord(oneSportRecord, sportRecord, str, obj, map);
    }

    private final List<SportRecord> convertSportRecord(Map<String, ? extends Object> mapResult, FitnessBinaryData binaryData, int sportType) {
        Integer iTState;
        OneSportRecord oneSportRecord;
        Integer type;
        OneSportRecord oneSportRecord2;
        long j;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(mapResult);
        Object obj = mapResult.get("body");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        ArrayList arrayList2 = (ArrayList) obj;
        Logger.d(getTAG(), "dataList:" + arrayList2.toArray());
        Iterator it = arrayList2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Map map = (Map) gson.fromJson((String) next, new TypeToken<Map<String, ? extends Object>>() { // from class: com.xiaomi.fit.fitness.parser.schema.sport.SchemaRecordParser$convertSportRecord$mapType$1
            }.getType());
            if (map != null) {
                Object obj2 = map.get(FitnessRecordKey.resumeTimestamp);
                Double d = obj2 instanceof Double ? (Double) obj2 : null;
                Long lValueOf = d != null ? Long.valueOf(((long) d.doubleValue()) + ((long) getCurTzDiffInSec$fitness_parser_release(binaryData.getDataId()))) : null;
                Intrinsics.checkNotNull(lValueOf);
                long jLongValue = lValueOf.longValue();
                Object obj3 = map.get("recordCount");
                Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
                SportRecord sportRecord = new SportRecord(jLongValue, d2 != null ? (long) d2.doubleValue() : 0L);
                Object obj4 = map.get(FitnessRecordKey.totalSlipCount);
                Double d3 = obj4 instanceof Double ? (Double) obj4 : null;
                sportRecord.setITTotalCount(d3 != null ? Integer.valueOf((int) d3.doubleValue()) : null);
                if (map.get(FitnessRecordKey.initialAltitude) != null) {
                    Object obj5 = map.get(FitnessRecordKey.initialAltitude);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setHeight(Float.valueOf((float) ((Double) obj5).doubleValue()));
                }
                LinkedList linkedList = new LinkedList();
                if (map.get("dataPoints") != null) {
                    Object obj6 = map.get("dataPoints");
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any>>>");
                    ArrayList<Map> arrayList3 = (ArrayList) obj6;
                    Logger.d(getTAG(), "dataPoints:" + arrayList3.size());
                    long startTime = sportRecord.getStartTime();
                    long startTime2 = sportRecord.getStartTime();
                    long endTime = startTime2;
                    for (Map map2 : arrayList3) {
                        OneSportRecord oneSportRecord3 = new OneSportRecord(startTime, startTime + 1);
                        if (map2 != null) {
                            for (Map.Entry entry : map2.entrySet()) {
                                if (entry.getValue() instanceof Map) {
                                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                                        INSTANCE.buildSportRecord(oneSportRecord3, sportRecord, (String) entry2.getKey(), entry2.getValue(), (Map) entry.getValue());
                                        endTime = endTime;
                                        oneSportRecord3 = oneSportRecord3;
                                    }
                                    oneSportRecord2 = oneSportRecord3;
                                    j = endTime;
                                } else {
                                    oneSportRecord2 = oneSportRecord3;
                                    j = endTime;
                                    buildSportRecord$default(INSTANCE, oneSportRecord2, sportRecord, (String) entry.getKey(), entry.getValue(), null, 16, null);
                                }
                                endTime = j;
                                it = it;
                                oneSportRecord3 = oneSportRecord2;
                            }
                        }
                        Iterator it2 = it;
                        OneSportRecord oneSportRecord4 = oneSportRecord3;
                        long j2 = endTime;
                        if (sportType == 10 && (type = oneSportRecord4.getType()) != null && type.intValue() == 1) {
                            oneSportRecord = oneSportRecord4;
                            oneSportRecord.setStartTime(j2);
                            endTime = oneSportRecord.getEndTime();
                        } else {
                            oneSportRecord = oneSportRecord4;
                            endTime = j2;
                        }
                        oneSportRecord.setDuration((int) (oneSportRecord.getEndTime() - oneSportRecord.getStartTime()));
                        long endTime2 = oneSportRecord.getEndTime();
                        linkedList.add(oneSportRecord);
                        startTime = endTime2;
                        it = it2;
                    }
                }
                Iterator it3 = it;
                sportRecord.setRecordList(linkedList);
                Object obj7 = map.get("routeType");
                Double d4 = obj7 instanceof Double ? (Double) obj7 : null;
                sportRecord.setSkiPath(d4 != null ? Integer.valueOf((int) d4.doubleValue()) : null);
                Object obj8 = map.get(FitnessRecordKey.avgTemperature);
                Double d5 = obj8 instanceof Double ? (Double) obj8 : null;
                sportRecord.setDivingAvgTemperature(d5 != null ? Float.valueOf(((float) d5.doubleValue()) / 10) : null);
                Object obj9 = map.get(FitnessRecordKey.maxDeep);
                Double d6 = obj9 instanceof Double ? (Double) obj9 : null;
                sportRecord.setDivingMaxDepth(d6 != null ? Float.valueOf(((float) d6.doubleValue()) / 10) : null);
                Object obj10 = map.get(FitnessRecordKey.avgDeep);
                Double d7 = obj10 instanceof Double ? (Double) obj10 : null;
                sportRecord.setDivingAvgDepth(d7 != null ? Float.valueOf(((float) d7.doubleValue()) / 10) : null);
                Object obj11 = map.get(FitnessRecordKey.descentDuration);
                Double d8 = obj11 instanceof Double ? (Double) obj11 : null;
                sportRecord.setDivingInSectionDuration(d8 != null ? Integer.valueOf((int) d8.doubleValue()) : null);
                Object obj12 = map.get(FitnessRecordKey.surfaceWaterDuration);
                Double d9 = obj12 instanceof Double ? (Double) obj12 : null;
                sportRecord.setDivingOutSectionDuration(d9 != null ? Integer.valueOf((int) d9.doubleValue()) : null);
                Object obj13 = map.get(FitnessRecordKey.minTemperature);
                Double d10 = obj13 instanceof Double ? (Double) obj13 : null;
                sportRecord.setDivingMinTemperature(d10 != null ? Float.valueOf(((float) d10.doubleValue()) / 10) : null);
                Object obj14 = map.get(FitnessRecordKey.avgDescentSpeed);
                Double d11 = obj14 instanceof Double ? (Double) obj14 : null;
                sportRecord.setDivingAvgDownSpeed(d11 != null ? Float.valueOf(((float) d11.doubleValue()) / 10) : null);
                Object obj15 = map.get(FitnessRecordKey.upwardFloatingSpeed);
                Double d12 = obj15 instanceof Double ? (Double) obj15 : null;
                sportRecord.setDivingAvgUpSpeed(d12 != null ? Float.valueOf(((float) d12.doubleValue()) / 10) : null);
                Object obj16 = map.get("totalMovementsCount");
                Double d13 = obj16 instanceof Double ? (Double) obj16 : null;
                sportRecord.setItActionCount(d13 != null ? Integer.valueOf((int) d13.doubleValue()) : null);
                Object obj17 = map.get("totalWeight");
                Double d14 = obj17 instanceof Double ? (Double) obj17 : null;
                sportRecord.setItTotalWeight(d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null);
                Object obj18 = map.get(FitnessRecordKey.movementsType);
                Double d15 = obj18 instanceof Double ? (Double) obj18 : null;
                sportRecord.setItActionType(d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null);
                if (map.get("totalTime") != null) {
                    Object obj19 = map.get("totalTime");
                    Double d16 = obj19 instanceof Double ? (Double) obj19 : null;
                    sportRecord.setItTotalDuration(d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null);
                }
                Object obj20 = map.get(FitnessRecordKey.segmentInfo_segmentPace);
                if (obj20 != null) {
                    Double d17 = obj20 instanceof Double ? (Double) obj20 : null;
                    sportRecord.setItAvgPaces(d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null);
                }
                Object obj21 = map.get(FitnessRecordKey.segmentInfo);
                Map map3 = obj21 instanceof Map ? (Map) obj21 : null;
                if (map3 != null) {
                    Object obj22 = map3.get(FitnessRecordKey.segmentType);
                    if (obj22 != null) {
                        Double d18 = obj22 instanceof Double ? (Double) obj22 : null;
                        sportRecord.setITState(d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null);
                    }
                    Object obj23 = map3.get("pauseType");
                    if (obj23 != null) {
                        boolean z = obj23 instanceof Double;
                        Double d19 = z ? (Double) obj23 : null;
                        boolean z2 = false;
                        if (d19 != null && ((int) d19.doubleValue()) == 0) {
                            z2 = true;
                        }
                        sportRecord.setSportPause(z2);
                        Double d20 = z ? (Double) obj23 : null;
                        sportRecord.setDivingType(d20 != null ? Integer.valueOf((int) d20.doubleValue()) : null);
                    }
                }
                if (map.get("maxSpeed") != null) {
                    Object obj24 = map.get("maxSpeed");
                    Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiMaxSpeed(Float.valueOf(((int) ((Double) obj24).doubleValue()) / 10.0f));
                }
                if (map.get("maxSlope") != null) {
                    Object obj25 = map.get("maxSlope");
                    Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type kotlin.Double");
                    sportRecord.setItSkiSlope(Integer.valueOf((int) ((Double) obj25).doubleValue()));
                }
                Object obj26 = map.get("totalDistance");
                if (obj26 != null) {
                    sportRecord.setITTotalDistance(Integer.valueOf((int) ((Double) obj26).doubleValue()));
                }
                Object obj27 = map.get(FitnessReportKey.totalDuration);
                if (obj27 != null) {
                    sportRecord.setItTotalDuration(Integer.valueOf((int) ((Double) obj27).doubleValue()));
                }
                if (sportRecord.getIsSportPause() && (iTState = sportRecord.getITState()) != null && iTState.intValue() == 32) {
                    sportRecord.setITState(128);
                }
                arrayList.add(sportRecord);
                it = it3;
            }
        }
        return arrayList;
    }

    private final int getDistanceRecordTimes() {
        return 1;
    }

    public final int getCurTzDiffInSec$fitness_parser_release(@Nullable FitnessDataId dataId) {
        if (dataId == null) {
            return tzDiffInSec;
        }
        int tzOffsetInSec = dataId.getTzOffsetInSec() - FitnessDateUtils.getCurrentTZOffsetInSec();
        tzDiffInSec = tzOffsetInSec;
        return tzOffsetInSec;
    }

    @NotNull
    public final Gson getGson() {
        return gson;
    }

    public final boolean getHeightChangeSign() {
        return heightChangeSign;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @NotNull
    public String getTAG() {
        return TAG;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @Nullable
    public FitnessParseResult parser(@NotNull FitnessBinaryData binaryData, @NotNull String schema) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(schema, "schema");
        JsonObject schemaElement = getSchemaElement(schema);
        Intrinsics.checkNotNull(schemaElement);
        BinarySchemaDecoder binarySchemaDecoder = new BinarySchemaDecoder(schemaElement);
        binarySchemaDecoder.setBuffer(getBinaryData(binaryData));
        Map<String, Object> mapDecode = binarySchemaDecoder.decode();
        FitnessLogUtils.i(getTAG(), "result:" + mapDecode);
        Integer numValueOf = Integer.valueOf(binaryData.getDataId().getSportType());
        Object obj = mapDecode != null ? mapDecode.get("root") : null;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map<Integer, ? extends List<SportRecord>> mapSingletonMap = Collections.singletonMap(numValueOf, convertSportRecord((Map) obj, binaryData, binaryData.getDataId().getSportType()));
        FitnessParseResult.Builder builder = new FitnessParseResult.Builder();
        Intrinsics.checkNotNull(mapSingletonMap);
        return builder.sportRecord(mapSingletonMap).build();
    }

    public final void setHeightChangeSign(boolean z) {
        heightChangeSign = z;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        TAG = str;
    }
}
