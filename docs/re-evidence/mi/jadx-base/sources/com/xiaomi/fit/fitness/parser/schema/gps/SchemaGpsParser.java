package com.xiaomi.fit.fitness.parser.schema.gps;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.GpsRecord;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fit.fitness.parser.schema.BaseParser;
import com.xiaomi.fit.fitness.parser.schema.BinarySchemaDecoder;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessGpsKey;
import com.xiaomi.fit.fitness.parser.schema.sport.SchemaRecordParser;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016JB\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00142\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J4\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J6\u0010\"\u001a\u00020\u001c2\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00140\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170$H\u0004R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/gps/SchemaGpsParser;", "Lcom/xiaomi/fit/fitness/parser/schema/BaseParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "parser", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", SchemaNetUtils.SchemaDir, "parseTriItemsGps", "", "", "", "Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "map", "", DailyRecordKey.sportType, "convertReportData", "", "key", "value", "gps", "Lcom/xiaomi/fit/fitness/parser/schema/gps/SchemaGpsParser$Gps;", "parseSportGps", "buildGpsRecord", "recordList", "Ljava/util/LinkedList;", "Gps", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchemaGpsParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaGpsParser.kt\ncom/xiaomi/fit/fitness/parser/schema/gps/SchemaGpsParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,228:1\n1863#2:229\n1863#2:231\n1864#2:236\n1864#2:245\n216#3:230\n216#3:232\n216#3,2:233\n217#3:235\n217#3:244\n216#3,2:246\n381#4,7:237\n*S KotlinDebug\n*F\n+ 1 SchemaGpsParser.kt\ncom/xiaomi/fit/fitness/parser/schema/gps/SchemaGpsParser\n*L\n69#1:229\n80#1:231\n80#1:236\n69#1:245\n77#1:230\n82#1:232\n85#1:233,2\n82#1:235\n77#1:244\n174#1:246,2\n108#1:237,7\n*E\n"})
public class SchemaGpsParser extends BaseParser {

    @NotNull
    private String TAG = "Schema_GpsParser";

    @NotNull
    private final Gson gson = new Gson();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/gps/SchemaGpsParser$Gps;", "", "<init>", "()V", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "longitude", "", "getLongitude", "()F", "setLongitude", "(F)V", "latitude", "getLatitude", "setLatitude", FitnessGpsKey.horizontalAccuracy, "getHorizontalAccuracy", "setHorizontalAccuracy", "speed", "getSpeed", "setSpeed", FitnessGpsKey.gpsSource, "", "getGpsSource", "()I", "setGpsSource", "(I)V", "altitude", "getAltitude", "setAltitude", FitnessGpsKey.hdop, "getHdop", "setHdop", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gps {
        private float altitude;
        private int gpsSource;
        private float hdop;
        private float horizontalAccuracy;
        private float latitude;
        private float longitude;
        private float speed;
        private long timestamp;

        public final float getAltitude() {
            return this.altitude;
        }

        public final int getGpsSource() {
            return this.gpsSource;
        }

        public final float getHdop() {
            return this.hdop;
        }

        public final float getHorizontalAccuracy() {
            return this.horizontalAccuracy;
        }

        public final float getLatitude() {
            return this.latitude;
        }

        public final float getLongitude() {
            return this.longitude;
        }

        public final float getSpeed() {
            return this.speed;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final void setAltitude(float f) {
            this.altitude = f;
        }

        public final void setGpsSource(int i) {
            this.gpsSource = i;
        }

        public final void setHdop(float f) {
            this.hdop = f;
        }

        public final void setHorizontalAccuracy(float f) {
            this.horizontalAccuracy = f;
        }

        public final void setLatitude(float f) {
            this.latitude = f;
        }

        public final void setLongitude(float f) {
            this.longitude = f;
        }

        public final void setSpeed(float f) {
            this.speed = f;
        }

        public final void setTimestamp(long j) {
            this.timestamp = j;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(String key, Object value, Gps gps) {
        switch (key.hashCode()) {
            case -1730919107:
                if (key.equals(FitnessGpsKey.horizontalAccuracy)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setHorizontalAccuracy((float) ((Double) value).doubleValue());
                    break;
                }
                break;
            case -1439978388:
                if (key.equals("latitude")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setLatitude((float) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 3197917:
                if (key.equals(FitnessGpsKey.hdop)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setHdop((float) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 55126294:
                if (key.equals("timestamp")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setTimestamp((long) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 109641799:
                if (key.equals("speed")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setSpeed(((float) ((Double) value).doubleValue()) / 10.0f);
                    break;
                }
                break;
            case 137365935:
                if (key.equals("longitude")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setLongitude((float) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 1903050085:
                if (key.equals(FitnessGpsKey.gpsSource)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setGpsSource((int) ((Double) value).doubleValue());
                    break;
                }
                break;
            case 2036550306:
                if (key.equals("altitude")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    gps.setAltitude((float) ((Double) value).doubleValue());
                    break;
                }
                break;
        }
    }

    private final Map<Integer, List<GpsRecord>> parseTriItemsGps(Map<String, ? extends Object> map, FitnessBinaryData binaryData, int sportType) {
        Object obj = map.get("body");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object objFromJson = SchemaRecordParser.INSTANCE.getGson().fromJson((String) it.next(), new TypeToken<Map<String, ? extends Object>>() { // from class: com.xiaomi.fit.fitness.parser.schema.gps.SchemaGpsParser$parseTriItemsGps$1$mapType$1
            }.getType());
            Map map2 = objFromJson instanceof Map ? (Map) objFromJson : null;
            LinkedList linkedList = new LinkedList();
            if (map2 != null) {
                int iDoubleValue = 0;
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry.getValue() instanceof List) {
                        Object value = entry.getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
                        List<Map> list = (List) value;
                        if (list != null) {
                            for (Map map3 : list) {
                                Gps gps = new Gps();
                                for (Map.Entry entry2 : map3.entrySet()) {
                                    if (entry2.getValue() instanceof Map) {
                                        Object value2 = entry2.getValue();
                                        Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                                        for (Map.Entry entry3 : ((Map) value2).entrySet()) {
                                            convertReportData((String) entry3.getKey(), entry3.getValue(), gps);
                                        }
                                    } else {
                                        convertReportData((String) entry2.getKey(), entry2.getValue(), gps);
                                    }
                                }
                                GpsRecord gpsRecord = new GpsRecord(gps.getTimestamp(), gps.getLongitude(), gps.getLatitude());
                                gpsRecord.setSpeed(Float.valueOf(gps.getSpeed()));
                                gpsRecord.setAccuracy(Float.valueOf(gps.getHorizontalAccuracy()));
                                gpsRecord.setAltitude(Float.valueOf(gps.getAltitude()));
                                gpsRecord.setHdop(Float.valueOf(gps.getHdop()));
                                gpsRecord.setGpsSource(Integer.valueOf(gps.getGpsSource()));
                                linkedList.add(gpsRecord);
                            }
                        }
                    } else if (Intrinsics.areEqual(entry.getKey(), "routeType")) {
                        Object value3 = entry.getValue();
                        Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Double");
                        iDoubleValue = (int) ((Double) value3).doubleValue();
                    }
                    Integer numValueOf = Integer.valueOf(iDoubleValue);
                    Object arrayList = linkedHashMap.get(numValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList);
                    }
                    ListExtKt.addAll((List) arrayList, linkedList);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    public final void buildGpsRecord(@NotNull Map<String, ? extends Map<String, ? extends Object>> map, @NotNull LinkedList<GpsRecord> recordList) {
        String str;
        String str2;
        Float fValueOf;
        Long lValueOf;
        String str3 = FitnessGpsKey.hdop;
        String str4 = "time";
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        try {
            Iterator<Map.Entry<String, ? extends Map<String, ? extends Object>>> it = map.entrySet().iterator();
            Float fValueOf2 = null;
            Integer numValueOf = null;
            Long l = null;
            Float fValueOf3 = null;
            Float fValueOf4 = null;
            Float fValueOf5 = null;
            Float fValueOf6 = null;
            Float fValueOf7 = null;
            while (it.hasNext()) {
                Map.Entry<String, ? extends Map<String, ? extends Object>> next = it.next();
                Iterator<Map.Entry<String, ? extends Map<String, ? extends Object>>> it2 = it;
                String tag = getTAG();
                Float f = fValueOf2;
                Object obj = next.getValue().get("timestamp");
                Integer num = numValueOf;
                Collection<? extends Object> collectionValues = next.getValue().values();
                Float f2 = fValueOf6;
                StringBuilder sb = new StringBuilder();
                Float f3 = fValueOf5;
                sb.append("value:");
                sb.append(obj);
                sb.append(" , ");
                sb.append(collectionValues);
                FitnessLogUtils.d(tag, sb.toString());
                String key = next.getKey();
                switch (key.hashCode()) {
                    case -1980018613:
                        str = str3;
                        str2 = str4;
                        if (key.equals(FitnessGpsKey.speedAndSource)) {
                            Object obj2 = next.getValue().get(FitnessGpsKey.speedAndSource);
                            Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                            if (map2 != null) {
                                Object obj3 = map2.get("speed");
                                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Double");
                                fValueOf = Float.valueOf(((float) ((Double) obj3).doubleValue()) / 10.0f);
                                Object obj4 = map2.get(FitnessGpsKey.gpsSource);
                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Double");
                                numValueOf = Integer.valueOf((int) ((Double) obj4).doubleValue());
                                fValueOf6 = fValueOf;
                                fValueOf2 = f;
                                fValueOf5 = f3;
                            }
                            break;
                        }
                        fValueOf6 = f2;
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    case -1807812206:
                        str = str3;
                        str2 = str4;
                        if (key.equals(FitnessGpsKey.locationSpeed)) {
                            Object obj5 = next.getValue().get(FitnessGpsKey.locationSpeed);
                            Double d = obj5 instanceof Double ? (Double) obj5 : null;
                            fValueOf6 = d != null ? Float.valueOf((float) d.doubleValue()) : null;
                        } else {
                            fValueOf6 = f2;
                        }
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    case -1638597166:
                        str = str3;
                        str2 = str4;
                        if (!key.equals(FitnessGpsKey.locationHorizontalAccuracy)) {
                            fValueOf6 = f2;
                            fValueOf2 = f;
                            numValueOf = num;
                            fValueOf5 = f3;
                        } else {
                            Object obj6 = next.getValue().get(FitnessGpsKey.locationHorizontalAccuracy);
                            Double d2 = obj6 instanceof Double ? (Double) obj6 : null;
                            fValueOf5 = d2 != null ? Float.valueOf((float) d2.doubleValue()) : null;
                            fValueOf6 = f2;
                            fValueOf2 = f;
                            numValueOf = num;
                        }
                        break;
                    case -1439978388:
                        str = str3;
                        str2 = str4;
                        if (key.equals("latitude")) {
                            Object obj7 = next.getValue().get("latitude");
                            Double d3 = obj7 instanceof Double ? (Double) obj7 : null;
                            fValueOf4 = d3 != null ? Float.valueOf((float) d3.doubleValue()) : null;
                        }
                        fValueOf6 = f2;
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    case -482637824:
                        if (!key.equals(FitnessGpsKey.locationSpeedAndGpsSource)) {
                            str = str3;
                            str2 = str4;
                            fValueOf6 = f2;
                            fValueOf2 = f;
                            numValueOf = num;
                            fValueOf5 = f3;
                        } else {
                            Map<String, ? extends Object> value = next.getValue();
                            Object obj8 = value.get(FitnessGpsKey.locationSpeed);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Double");
                            str = str3;
                            str2 = str4;
                            fValueOf = Float.valueOf(((float) ((Double) obj8).doubleValue()) / 10.0f);
                            Object obj9 = value.get(FitnessGpsKey.gpsSource);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Double");
                            numValueOf = Integer.valueOf((int) ((Double) obj9).doubleValue());
                            fValueOf6 = fValueOf;
                            fValueOf2 = f;
                            fValueOf5 = f3;
                        }
                        break;
                    case 3197917:
                        if (key.equals(str3)) {
                            Object obj10 = next.getValue().get(str3);
                            Double d4 = obj10 instanceof Double ? (Double) obj10 : null;
                            fValueOf7 = d4 != null ? Float.valueOf((float) d4.doubleValue()) : null;
                        }
                        str = str3;
                        str2 = str4;
                        fValueOf6 = f2;
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    case 3560141:
                        if (key.equals(str4)) {
                            Object obj11 = next.getValue().get(str4);
                            Double d5 = obj11 instanceof Double ? (Double) obj11 : null;
                            if (d5 != null) {
                                lValueOf = Long.valueOf((long) d5.doubleValue());
                                l = lValueOf;
                            } else {
                                l = null;
                            }
                        }
                        str = str3;
                        str2 = str4;
                        fValueOf6 = f2;
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    case 55126294:
                        if (key.equals("timestamp")) {
                            Object obj12 = next.getValue().get("timestamp");
                            Double d6 = obj12 instanceof Double ? (Double) obj12 : null;
                            if (d6 != null) {
                                lValueOf = Long.valueOf((long) d6.doubleValue());
                                l = lValueOf;
                            } else {
                                l = null;
                            }
                        }
                        str = str3;
                        str2 = str4;
                        fValueOf6 = f2;
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    case 137365935:
                        if (key.equals("longitude")) {
                            Object obj13 = next.getValue().get("longitude");
                            Double d7 = obj13 instanceof Double ? (Double) obj13 : null;
                            fValueOf3 = d7 != null ? Float.valueOf((float) d7.doubleValue()) : null;
                        }
                        str = str3;
                        str2 = str4;
                        fValueOf6 = f2;
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    case 1903050085:
                        if (!key.equals(FitnessGpsKey.gpsSource)) {
                            str = str3;
                            str2 = str4;
                            fValueOf6 = f2;
                            fValueOf2 = f;
                            numValueOf = num;
                            fValueOf5 = f3;
                        } else {
                            Object obj14 = next.getValue().get(FitnessGpsKey.gpsSource);
                            Double d8 = obj14 instanceof Double ? (Double) obj14 : null;
                            numValueOf = d8 != null ? Integer.valueOf((int) d8.doubleValue()) : null;
                            str = str3;
                            str2 = str4;
                            fValueOf6 = f2;
                            fValueOf2 = f;
                            fValueOf5 = f3;
                        }
                        break;
                    case 2036550306:
                        if (key.equals("altitude")) {
                            Object obj15 = next.getValue().get("altitude");
                            Double d9 = obj15 instanceof Double ? (Double) obj15 : null;
                            fValueOf2 = d9 != null ? Float.valueOf((float) d9.doubleValue()) : null;
                            str = str3;
                            str2 = str4;
                            fValueOf6 = f2;
                        } else {
                            str = str3;
                            str2 = str4;
                            fValueOf6 = f2;
                            fValueOf2 = f;
                        }
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                    default:
                        str = str3;
                        str2 = str4;
                        fValueOf6 = f2;
                        fValueOf2 = f;
                        numValueOf = num;
                        fValueOf5 = f3;
                        break;
                }
                it = it2;
                str3 = str;
                str4 = str2;
            }
            Float f4 = fValueOf2;
            Intrinsics.checkNotNull(l);
            long jLongValue = l.longValue();
            Intrinsics.checkNotNull(fValueOf3);
            float fFloatValue = fValueOf3.floatValue();
            Intrinsics.checkNotNull(fValueOf4);
            GpsRecord gpsRecord = new GpsRecord(jLongValue, fFloatValue, fValueOf4.floatValue());
            gpsRecord.setAccuracy(fValueOf5);
            gpsRecord.setSpeed(fValueOf6);
            gpsRecord.setGpsSource(numValueOf);
            gpsRecord.setAltitude(f4);
            gpsRecord.setHdop(fValueOf7);
            recordList.add(gpsRecord);
        } catch (Exception e) {
            FitnessLogUtils.e(getTAG(), "e:" + e + " , trace:" + Log.getStackTraceString(e));
        }
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @NotNull
    public List<GpsRecord> parseSportGps(@NotNull Map<String, ? extends Object> map, @NotNull FitnessBinaryData binaryData, int sportType) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Object obj = map.get("body");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.util.ArrayList<kotlin.String>>");
        Object obj2 = ((Map) obj).get("gpsPoints");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        LinkedList<GpsRecord> linkedList = new LinkedList<>();
        Iterator it = ((ArrayList) obj2).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Object objFromJson = SchemaRecordParser.INSTANCE.getGson().fromJson((String) next, new TypeToken<Map<String, ? extends Object>>() { // from class: com.xiaomi.fit.fitness.parser.schema.gps.SchemaGpsParser$parseSportGps$mapType$1
            }.getType());
            Map<String, ? extends Map<String, ? extends Object>> map2 = objFromJson instanceof Map ? (Map) objFromJson : null;
            if (map2 != null) {
                buildGpsRecord(map2, linkedList);
            }
        }
        return linkedList;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @Nullable
    public FitnessParseResult parser(@NotNull FitnessBinaryData binaryData, @NotNull String schema) {
        Object obj;
        Map<Integer, List<GpsRecord>> mapSingletonMap;
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(schema, "schema");
        JsonObject schemaElement = getSchemaElement(schema);
        Intrinsics.checkNotNull(schemaElement);
        BinarySchemaDecoder binarySchemaDecoder = new BinarySchemaDecoder(schemaElement);
        binarySchemaDecoder.setBuffer(getBinaryData(binaryData));
        Map<String, Object> mapDecode = binarySchemaDecoder.decode();
        FitnessLogUtils.i(getTAG(), "result:" + mapDecode);
        if (binaryData.getDataId().getSportType() == 21) {
            obj = mapDecode != null ? mapDecode.get("root") : null;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            mapSingletonMap = parseTriItemsGps((Map) obj, binaryData, binaryData.getDataId().getSportType());
        } else {
            Integer numValueOf = Integer.valueOf(binaryData.getDataId().getSportType());
            obj = mapDecode != null ? mapDecode.get("root") : null;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            mapSingletonMap = Collections.singletonMap(numValueOf, parseSportGps((Map) obj, binaryData, binaryData.getDataId().getSportType()));
        }
        FitnessParseResult.Builder builder = new FitnessParseResult.Builder();
        Intrinsics.checkNotNull(mapSingletonMap);
        return builder.gpsRecord(mapSingletonMap).build();
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.TAG = str;
    }
}
