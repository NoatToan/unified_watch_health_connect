package com.xiaomi.fit.fitness.parser.schema.gps;

import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.GpsRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessGpsKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016JB\u0010\u000f\u001a\u00020\u00102*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\t\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\b0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/gps/OutdoorHasStepGpsParser;", "Lcom/xiaomi/fit/fitness/parser/schema/gps/SchemaGpsParser;", "<init>", "()V", "parseSportGps", "", "Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "map", "", "", "", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", DailyRecordKey.sportType, "", "buildOutdoorStepGpsRecord", "", "recordList", "Ljava/util/LinkedList;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOutdoorHasStepGpsParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutdoorHasStepGpsParser.kt\ncom/xiaomi/fit/fitness/parser/schema/gps/OutdoorHasStepGpsParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,95:1\n216#2:96\n216#2,2:97\n217#2:99\n*S KotlinDebug\n*F\n+ 1 OutdoorHasStepGpsParser.kt\ncom/xiaomi/fit/fitness/parser/schema/gps/OutdoorHasStepGpsParser\n*L\n41#1:96\n42#1:97,2\n41#1:99\n*E\n"})
public final class OutdoorHasStepGpsParser extends SchemaGpsParser {
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void buildOutdoorStepGpsRecord(Map<String, ? extends Map<String, ? extends Map<String, ? extends Object>>> map, LinkedList<GpsRecord> recordList) {
        Long l;
        Float f;
        Float f2;
        Float fValueOf;
        Integer num;
        Float f3;
        Float f4;
        Float f5;
        Map<String, ? extends Map<String, ? extends Object>> value;
        Integer numValueOf;
        Long lValueOf;
        if (map != null) {
            Long l2 = null;
            f = null;
            Float f6 = null;
            f2 = null;
            fValueOf = null;
            num = null;
            f3 = null;
            f4 = null;
            for (Map.Entry<String, ? extends Map<String, ? extends Map<String, ? extends Object>>> entry : map.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    for (Map.Entry<String, ? extends Map<String, ? extends Object>> entry2 : value.entrySet()) {
                        String key = entry2.getKey();
                        switch (key.hashCode()) {
                            case -1980018613:
                                if (key.equals(FitnessGpsKey.speedAndSource)) {
                                    Map<String, ? extends Object> value2 = entry2.getValue();
                                    Map<String, ? extends Object> map2 = value2 instanceof Map ? value2 : null;
                                    if (map2 != null) {
                                        Object obj = map2.get("speed");
                                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
                                        fValueOf = Float.valueOf(((Float) obj).floatValue() / 10.0f);
                                        Object obj2 = map2.get(FitnessGpsKey.gpsSource);
                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                                        numValueOf = (Integer) obj2;
                                        num = numValueOf;
                                    }
                                }
                                break;
                            case -1807812206:
                                if (key.equals(FitnessGpsKey.locationSpeed)) {
                                    Object value3 = entry2.getValue();
                                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Int");
                                    fValueOf = Float.valueOf(((Integer) value3).intValue() / 10.0f);
                                }
                                break;
                            case -1638597166:
                                if (key.equals(FitnessGpsKey.locationHorizontalAccuracy)) {
                                    Object value4 = entry2.getValue();
                                    f2 = value4 instanceof Float ? (Float) value4 : null;
                                }
                                break;
                            case -1439978388:
                                if (key.equals("latitude")) {
                                    Object value5 = entry2.getValue();
                                    f = value5 instanceof Float ? (Float) value5 : null;
                                }
                                break;
                            case -482637824:
                                if (key.equals(FitnessGpsKey.locationSpeedAndGpsSource)) {
                                    Map<String, ? extends Object> value6 = entry2.getValue();
                                    Object obj3 = value6.get(FitnessGpsKey.locationSpeed);
                                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                                    Float fValueOf2 = Float.valueOf(((((Integer) obj3).intValue() & 65520) >> 4) / 10.0f);
                                    Object obj4 = value6.get(FitnessGpsKey.gpsSource);
                                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                                    numValueOf = Integer.valueOf(((Integer) obj4).intValue() & 15);
                                    fValueOf = fValueOf2;
                                    num = numValueOf;
                                }
                                break;
                            case 3197917:
                                if (key.equals(FitnessGpsKey.hdop)) {
                                    Object value7 = entry2.getValue();
                                    f4 = value7 instanceof Float ? (Float) value7 : null;
                                }
                                break;
                            case 3560141:
                                if (key.equals("time")) {
                                    Object value8 = entry2.getValue();
                                    Integer num2 = value8 instanceof Integer ? (Integer) value8 : null;
                                    if (num2 != null) {
                                        lValueOf = Long.valueOf(num2.intValue());
                                    } else {
                                        lValueOf = null;
                                    }
                                    l2 = lValueOf;
                                }
                                break;
                            case 55126294:
                                if (key.equals("timestamp")) {
                                    Object value9 = entry2.getValue();
                                    if (value9 instanceof Long) {
                                        lValueOf = (Long) value9;
                                    } else {
                                        lValueOf = null;
                                    }
                                    l2 = lValueOf;
                                }
                                break;
                            case 137365935:
                                if (key.equals("longitude")) {
                                    Object value10 = entry2.getValue();
                                    f6 = value10 instanceof Float ? (Float) value10 : null;
                                }
                                break;
                            case 1903050085:
                                if (key.equals(FitnessGpsKey.gpsSource)) {
                                    Object value11 = entry2.getValue();
                                    Intrinsics.checkNotNull(value11, "null cannot be cast to non-null type kotlin.Int");
                                    numValueOf = (Integer) value11;
                                    num = numValueOf;
                                }
                                break;
                            case 2036550306:
                                if (key.equals("altitude")) {
                                    Object value12 = entry2.getValue();
                                    f3 = value12 instanceof Float ? (Float) value12 : null;
                                }
                                break;
                        }
                    }
                }
            }
            l = l2;
            f5 = f6;
        } else {
            l = null;
            f = null;
            f2 = null;
            fValueOf = null;
            num = null;
            f3 = null;
            f4 = null;
            f5 = null;
        }
        Intrinsics.checkNotNull(l);
        long jLongValue = l.longValue();
        Intrinsics.checkNotNull(f5);
        float fFloatValue = f5.floatValue();
        Intrinsics.checkNotNull(f);
        GpsRecord gpsRecord = new GpsRecord(jLongValue, fFloatValue, f.floatValue());
        gpsRecord.setAccuracy(f2);
        gpsRecord.setSpeed(fValueOf);
        gpsRecord.setGpsSource(num);
        gpsRecord.setAltitude(f3);
        gpsRecord.setHdop(f4);
        recordList.add(gpsRecord);
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.gps.SchemaGpsParser
    @NotNull
    public List<GpsRecord> parseSportGps(@NotNull Map<String, ? extends Object> map, @NotNull FitnessBinaryData binaryData, int sportType) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Object obj = map.get("body");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.util.ArrayList<kotlin.String>>");
        Object obj2 = ((Map) obj).get("gpsPoints");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any>>>>");
        LinkedList<GpsRecord> linkedList = new LinkedList<>();
        Iterator it = ((ArrayList) obj2).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            buildOutdoorStepGpsRecord((Map) next, linkedList);
        }
        return linkedList;
    }
}
