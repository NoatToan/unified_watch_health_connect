package com.xiaomi.fit.fitness.parser.schema;

import com.google.gson.Gson;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 J2\u00020\u0001:\u0001JB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dJ\u001e\u0010 \u001a\u00020\u00192\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0002J\u001c\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u0010H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0010H\u0002J&\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0010H\u0002J \u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001012\u0006\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0018\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0018\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010H\u0002J#\u00106\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u00107J(\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0010H\u0002J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020'H\u0002J\u0018\u0010=\u001a\u00020\u00012\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020'H\u0002J \u0010>\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u0001H\u0002J\u0010\u0010@\u001a\u00020'2\u0006\u0010&\u001a\u00020'H\u0002J\u001e\u0010A\u001a\u0004\u0018\u00010\u00012\u0006\u0010B\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010C\u001a\u0004\u0018\u00010\u0003*\u00020'H\u0002J\u0018\u0010H\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u0004\u0018\u00010\u0007*\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/BinarySchemaDecoder;", "", SchemaNetUtils.SchemaDir, "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Lkotlinx/serialization/json/JsonObject;)V", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "buffer", "Ljava/nio/ByteBuffer;", "decodedData", "", "", "littleEndian", "", "defs", "structure", "lastRecordCount", "gson", "Lcom/google/gson/Gson;", "setBuffer", "", "byteArray", "", "decode", "", "dataList", "", "parseData", "result", "isEnd", "isCloudCourseIdValid", "preOffset", "parseElement", "element", "Lkotlinx/serialization/json/JsonElement;", "path", "saveFeatureData", "numericTypes", "", "isValid", "obj", "type", "parseObject", "parseArray", "", "eofList", "parseEOF", "itemsDef", "parseEofItems", "resolveItemCount", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Ljava/lang/Integer;", "parseBitField", "applyTransform", "", "value", "def", "applyValueType", "storeDecodedData", "key", "resolveRef", "resolveJsonPointer", "pointer", "jsonObjectOrNull", "intOrNull", "Lkotlinx/serialization/json/JsonPrimitive;", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "getParentNodeItemCount", "child", "Companion", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBinarySchemaDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinarySchemaDecoder.kt\ncom/xiaomi/fit/fitness/parser/schema/BinarySchemaDecoder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,539:1\n1755#2,2:540\n1757#2:543\n1611#2,9:544\n1863#2:553\n1864#2:555\n1620#2:556\n774#2:557\n865#2,2:558\n1#3:542\n1#3:554\n381#4,7:560\n*S KotlinDebug\n*F\n+ 1 BinarySchemaDecoder.kt\ncom/xiaomi/fit/fitness/parser/schema/BinarySchemaDecoder\n*L\n131#1:540,2\n131#1:543\n445#1:544,9\n445#1:553\n445#1:555\n445#1:556\n462#1:557\n462#1:558,2\n445#1:554\n466#1:560,7\n*E\n"})
public final class BinarySchemaDecoder {

    @NotNull
    public static final String TAG = "Schema_BinarySchemaDecoder";
    private ByteBuffer buffer;

    @NotNull
    private final List<Map<String, Object>> dataList;

    @NotNull
    private final Map<String, Object> decodedData;

    @NotNull
    private final JsonObject defs;

    @NotNull
    private List<Object> eofList;

    @NotNull
    private final Gson gson;
    private boolean isCloudCourseIdValid;
    private boolean isEnd;
    private int lastRecordCount;
    private final boolean littleEndian;

    @NotNull
    private final Set<String> numericTypes;
    private int offset;
    private int preOffset;

    @NotNull
    private final JsonObject schema;

    @NotNull
    private final JsonObject structure;

    public BinarySchemaDecoder(@NotNull JsonObject schema) {
        JsonObject jsonObjectJsonObjectOrNull;
        JsonObject jsonObjectJsonObjectOrNull2;
        Intrinsics.checkNotNullParameter(schema, "schema");
        this.schema = schema;
        this.decodedData = new LinkedHashMap();
        this.littleEndian = true;
        JsonElement jsonElement = (JsonElement) schema.get("$defs");
        this.defs = (jsonElement == null || (jsonObjectJsonObjectOrNull2 = jsonObjectOrNull(jsonElement)) == null) ? new JsonObject(MapsKt__MapsKt.emptyMap()) : jsonObjectJsonObjectOrNull2;
        JsonElement jsonElement2 = (JsonElement) schema.get("structure");
        this.structure = (jsonElement2 == null || (jsonObjectJsonObjectOrNull = jsonObjectOrNull(jsonElement2)) == null) ? new JsonObject(MapsKt__MapsKt.emptyMap()) : jsonObjectJsonObjectOrNull;
        this.gson = new Gson();
        this.dataList = new ArrayList();
        this.numericTypes = SetsKt__SetsKt.setOf((Object[]) new String[]{"uint8", "uint16", "uint32", "uint64", "int8", "int16", "int32", "float", "double", "bitField", "object"});
        this.eofList = new ArrayList();
    }

    private final double applyTransform(double value, JsonElement def) {
        JsonElement jsonElement;
        JsonObject jsonObjectJsonObjectOrNull;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive;
        JsonObject jsonObjectJsonObjectOrNull2 = jsonObjectOrNull(def);
        String contentOrNull = (jsonObjectJsonObjectOrNull2 == null || (jsonElement = (JsonElement) jsonObjectJsonObjectOrNull2.get("transform")) == null || (jsonObjectJsonObjectOrNull = jsonObjectOrNull(jsonElement)) == null || (jsonElement2 = (JsonElement) jsonObjectJsonObjectOrNull.get("$data")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive);
        if (contentOrNull == null || !StringsKt__StringsKt.contains$default((CharSequence) contentOrNull, (CharSequence) "/", false, 2, (Object) null)) {
            return value;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) contentOrNull, new String[]{"/"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) it.next());
            if (doubleOrNull != null) {
                arrayList.add(doubleOrNull);
            }
        }
        double dDoubleValue = ((Number) arrayList.get(0)).doubleValue();
        double dDoubleValue2 = ((Number) arrayList.get(1)).doubleValue();
        if (dDoubleValue == 0.0d) {
            dDoubleValue = 1.0d;
        }
        return dDoubleValue2 == 0.0d ? value : value * (dDoubleValue / dDoubleValue2);
    }

    private final Object applyValueType(double value, JsonElement def) {
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive2;
        JsonObject jsonObjectJsonObjectOrNull = jsonObjectOrNull(def);
        if (jsonObjectJsonObjectOrNull != null && (jsonElement2 = (JsonElement) jsonObjectJsonObjectOrNull.get("valueType")) != null && (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) != null) {
            JsonElementKt.getContentOrNull(jsonPrimitive2);
        }
        JsonObject jsonObjectJsonObjectOrNull2 = jsonObjectOrNull(def);
        String contentOrNull = (jsonObjectJsonObjectOrNull2 == null || (jsonElement = (JsonElement) jsonObjectJsonObjectOrNull2.get("valueType")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive);
        if (contentOrNull != null) {
            int iHashCode = contentOrNull.hashCode();
            if (iHashCode != -1034364087) {
                if (iHashCode != -891985903) {
                    if (iHashCode == 64711720 && contentOrNull.equals("boolean")) {
                        return Boolean.valueOf(!(value == 0.0d));
                    }
                } else if (contentOrNull.equals("string")) {
                    return String.valueOf(value);
                }
            } else if (contentOrNull.equals(RealNameWebViewActivity.NUMBER)) {
                return Double.valueOf(value);
            }
        }
        return Integer.valueOf((int) value);
    }

    private final Integer getIntOrNull(JsonPrimitive jsonPrimitive) {
        return getIntOrNull(jsonPrimitive);
    }

    private final int getParentNodeItemCount(String pointer, String child) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.removePrefix(pointer, (CharSequence) "/"), new String[]{"/"}, false, 0, 6, (Object) null);
        String str = (String) CollectionsKt___CollectionsKt.last(StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.removePrefix(child, (CharSequence) "/"), new String[]{"/"}, false, 0, 6, (Object) null));
        int size = listSplit$default.size() - Integer.parseInt((String) CollectionsKt___CollectionsKt.first(StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.removePrefix(child, (CharSequence) "/"), new String[]{"/"}, false, 0, 6, (Object) null)));
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(listSplit$default.get(i));
        }
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.removePrefix(child, (CharSequence) "/"), new String[]{"/"}, false, 0, 6, (Object) null);
        int size2 = listSplit$default2.size();
        for (int i2 = 1; i2 < size2; i2++) {
            arrayList.add(listSplit$default2.get(i2));
        }
        Map<String, Object> mapAsMutableMap = this.decodedData;
        long jLongValue = 0;
        for (String str2 : arrayList) {
            if (!(mapAsMutableMap instanceof Map)) {
                mapAsMutableMap = null;
            }
            Object obj = mapAsMutableMap != null ? mapAsMutableMap.get(str2) : null;
            if (!(obj instanceof Map)) {
                break;
            }
            mapAsMutableMap = TypeIntrinsics.asMutableMap(obj);
            Object obj2 = mapAsMutableMap != null ? mapAsMutableMap.get(str) : null;
            if (obj2 instanceof Integer) {
                jLongValue = ((Number) obj2).intValue();
            } else if (obj2 instanceof Long) {
                jLongValue = ((Number) obj2).longValue();
            }
            if (jLongValue != 0) {
                break;
            }
        }
        return (int) jLongValue;
    }

    private final boolean isValid(JsonObject obj, String type) {
        JsonObject jsonObjectJsonObjectOrNull;
        JsonElement jsonElement = (JsonElement) obj.get(TSMAuthContants.PARAM_VALID);
        if (((jsonElement == null || (jsonObjectJsonObjectOrNull = jsonObjectOrNull(jsonElement)) == null) ? null : (JsonElement) jsonObjectJsonObjectOrNull.get("$data")) == null) {
            return true;
        }
        Object obj2 = obj.get(TSMAuthContants.PARAM_VALID);
        Intrinsics.checkNotNull(obj2);
        JsonObject jsonObjectJsonObjectOrNull2 = jsonObjectOrNull((JsonElement) obj2);
        Intrinsics.checkNotNull(jsonObjectJsonObjectOrNull2);
        Object obj3 = jsonObjectJsonObjectOrNull2.get("$data");
        Intrinsics.checkNotNull(obj3);
        Object objResolveJsonPointer$default = resolveJsonPointer$default(this, JsonElementKt.getJsonPrimitive((JsonElement) obj3).getContent(), null, 2, null);
        if (!Intrinsics.areEqual(objResolveJsonPointer$default, Double.valueOf(0.0d)) && !Intrinsics.areEqual(objResolveJsonPointer$default, (Object) 0)) {
            return true;
        }
        this.offset += getOffset(type);
        return false;
    }

    private final JsonObject jsonObjectOrNull(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            return (JsonObject) jsonElement;
        }
        return null;
    }

    private final List<Object> parseArray(JsonObject obj, String path) {
        Integer numResolveItemCount = resolveItemCount((JsonElement) obj.get("itemCount"), path);
        int iIntValue = numResolveItemCount != null ? numResolveItemCount.intValue() : 1;
        JsonElement jsonElement = (JsonElement) obj.get("items");
        if (jsonElement == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        JsonElement jsonElementResolveRef = resolveRef(jsonElement);
        Object obj2 = obj.get("itemCount");
        JsonPrimitive jsonPrimitive = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
        if (Intrinsics.areEqual(jsonPrimitive != null ? jsonPrimitive.getContent() : null, "EOF")) {
            parseEOF(jsonElementResolveRef, path);
            return this.eofList;
        }
        ArrayList arrayList = new ArrayList(iIntValue);
        for (int i = 0; i < iIntValue; i++) {
            arrayList.add(parseElement(jsonElementResolveRef, path + "[" + i + "]"));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0228  */
    /* JADX WARN: Code duplicated, block: B:123:0x0257  */
    /* JADX WARN: Code duplicated, block: B:148:0x0332  */
    /* JADX WARN: Code duplicated, block: B:149:0x0340  */
    private final Map<String, Object> parseBitField(JsonObject obj, String path) {
        JsonObject jsonObjectJsonObjectOrNull;
        String str;
        Object objValueOf;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        Object objValueOf2;
        JsonElement jsonElement;
        Object objValueOf3;
        JsonObject jsonObjectJsonObjectOrNull2;
        Number numberValueOf;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive3;
        JsonObject jsonObjectJsonObjectOrNull3;
        JsonElement jsonElement3;
        JsonPrimitive jsonPrimitive4;
        JsonElement jsonElement4;
        JsonPrimitive jsonPrimitive5;
        String contentOrNull;
        JsonObject jsonObjectJsonObjectOrNull4;
        JsonElement jsonElement5;
        JsonPrimitive jsonPrimitive6;
        JsonPrimitive jsonPrimitive7;
        JsonPrimitive jsonPrimitive8;
        JsonElement jsonElement6 = (JsonElement) obj.get("byteSize");
        int i = (jsonElement6 == null || (jsonPrimitive8 = JsonElementKt.getJsonPrimitive(jsonElement6)) == null) ? 1 : JsonElementKt.getInt(jsonPrimitive8);
        int i2 = this.offset + i;
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = null;
        if (byteBuffer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buffer");
            byteBuffer = null;
        }
        if (i2 > byteBuffer.limit()) {
            return null;
        }
        JsonElement jsonElement7 = (JsonElement) obj.get("highBitFirst");
        boolean z = (jsonElement7 == null || (jsonPrimitive7 = JsonElementKt.getJsonPrimitive(jsonElement7)) == null) ? false : JsonElementKt.getBoolean(jsonPrimitive7);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonElement jsonElement8 = (JsonElement) obj.get("properties");
        if (jsonElement8 == null || (jsonObjectJsonObjectOrNull = jsonObjectOrNull(jsonElement8)) == null) {
            return MapsKt__MapsKt.emptyMap();
        }
        JsonElement jsonElement9 = (JsonElement) obj.get("exists");
        Object obj2 = "$data";
        String content = (jsonElement9 == null || (jsonObjectJsonObjectOrNull4 = jsonObjectOrNull(jsonElement9)) == null || (jsonElement5 = (JsonElement) jsonObjectJsonObjectOrNull4.get("$data")) == null || (jsonPrimitive6 = JsonElementKt.getJsonPrimitive(jsonElement5)) == null) ? null : jsonPrimitive6.getContent();
        if (content != null) {
            resolveJsonPointer$default(this, content, null, 2, null);
        }
        String str2 = "";
        String str3 = "";
        for (Map.Entry<String, JsonElement> entry : jsonObjectJsonObjectOrNull.entrySet()) {
            String key = entry.getKey();
            JsonObject jsonObjectJsonObjectOrNull5 = jsonObjectOrNull(entry.getValue());
            if (jsonObjectJsonObjectOrNull5 != null && (jsonElement4 = (JsonElement) jsonObjectJsonObjectOrNull5.get("valueType")) != null && (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement4)) != null && (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive5)) != null) {
                str2 = contentOrNull;
                str3 = key;
            }
        }
        boolean z2 = i > 8;
        if (Intrinsics.areEqual(str2, "float")) {
            ByteBuffer byteBuffer3 = this.buffer;
            if (byteBuffer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buffer");
            } else {
                byteBuffer2 = byteBuffer3;
            }
            Float fValueOf = Float.valueOf(byteBuffer2.getFloat(this.offset));
            this.offset += 4;
            linkedHashMap.put(str3, fValueOf);
            storeDecodedData(path, str3, fValueOf);
        } else {
            String str4 = "shiftLeft(...)";
            if (z2) {
                BigInteger element = BigInteger.ZERO;
                for (int i3 = 0; i3 < i; i3++) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    if (byteBuffer4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buffer");
                        byteBuffer4 = null;
                    }
                    int i4 = this.offset;
                    this.offset = i4 + 1;
                    int i5 = byteBuffer4.get(i4) & 255;
                    int i6 = z ? (i - 1) - i3 : i3;
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    BigInteger bigIntegerValueOf = BigInteger.valueOf(i5);
                    Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
                    BigInteger bigIntegerShiftLeft = bigIntegerValueOf.shiftLeft(i6 * 8);
                    Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft, "shiftLeft(...)");
                    element = element.or(bigIntegerShiftLeft);
                    Intrinsics.checkNotNullExpressionValue(element, "or(...)");
                }
                objValueOf = element;
                str = "shiftLeft(...)";
            } else {
                long j = 0;
                int i7 = 0;
                while (i7 < i) {
                    ByteBuffer byteBuffer5 = this.buffer;
                    if (byteBuffer5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buffer");
                        byteBuffer5 = null;
                    }
                    int i8 = this.offset;
                    this.offset = i8 + 1;
                    j |= ((long) (byteBuffer5.get(i8) & 255)) << ((z ? (i - 1) - i7 : i7) * 8);
                    i7++;
                    str4 = str4;
                }
                str = str4;
                objValueOf = Long.valueOf(j);
            }
            Iterator<Map.Entry<String, JsonElement>> it = jsonObjectJsonObjectOrNull.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, JsonElement> next = it.next();
                String key2 = next.getKey();
                JsonObject jsonObjectJsonObjectOrNull6 = jsonObjectOrNull(next.getValue());
                if (jsonObjectJsonObjectOrNull6 != null) {
                    JsonElement jsonElement10 = (JsonElement) jsonObjectJsonObjectOrNull6.get("startBit");
                    if (jsonElement10 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement10)) != null) {
                        int i9 = JsonElementKt.getInt(jsonPrimitive);
                        JsonElement jsonElement11 = (JsonElement) jsonObjectJsonObjectOrNull6.get("endBit");
                        if (jsonElement11 != null && (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement11)) != null) {
                            int i10 = JsonElementKt.getInt(jsonPrimitive2);
                            int i11 = (i9 - i10) + 1;
                            JsonElement jsonElement12 = (JsonElement) jsonObjectJsonObjectOrNull6.get(TSMAuthContants.PARAM_VALID);
                            String content2 = (jsonElement12 == null || (jsonObjectJsonObjectOrNull3 = jsonObjectOrNull(jsonElement12)) == null || (jsonElement3 = (JsonElement) jsonObjectJsonObjectOrNull3.get(obj2)) == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive4.getContent();
                            if (content2 != null) {
                                Object objResolveJsonPointer$default = resolveJsonPointer$default(this, content2, null, 2, null);
                                if (!Intrinsics.areEqual(objResolveJsonPointer$default, Double.valueOf(1.0d))) {
                                    if (Intrinsics.areEqual(objResolveJsonPointer$default, (Object) 1)) {
                                        if (z2) {
                                            BigInteger ONE = BigInteger.ONE;
                                            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                                            BigInteger bigIntegerShiftLeft2 = ONE.shiftLeft(i11);
                                            Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft2, str);
                                            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                                            BigInteger bigIntegerSubtract = bigIntegerShiftLeft2.subtract(ONE);
                                            Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
                                            Intrinsics.checkNotNull(objValueOf, "null cannot be cast to non-null type java.math.BigInteger");
                                            BigInteger bigIntegerShiftRight = ((BigInteger) objValueOf).shiftRight(i10);
                                            Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight, "shiftRight(...)");
                                            objValueOf2 = bigIntegerShiftRight.and(bigIntegerSubtract);
                                            Intrinsics.checkNotNullExpressionValue(objValueOf2, "and(...)");
                                        } else {
                                            Intrinsics.checkNotNull(objValueOf, "null cannot be cast to non-null type kotlin.Long");
                                            objValueOf2 = Long.valueOf((((Long) objValueOf).longValue() >> i10) & ((1 << i11) - 1));
                                        }
                                        jsonElement = (JsonElement) jsonObjectJsonObjectOrNull6.get("bits");
                                        if (jsonElement != null || (jsonObjectJsonObjectOrNull2 = jsonObjectOrNull(jsonElement)) == null) {
                                            if (z2) {
                                                Intrinsics.checkNotNull(objValueOf2, "null cannot be cast to non-null type java.math.BigInteger");
                                                objValueOf3 = Double.valueOf(((BigInteger) objValueOf2).doubleValue());
                                            } else {
                                                Intrinsics.checkNotNull(objValueOf2, "null cannot be cast to non-null type kotlin.Long");
                                                objValueOf3 = Integer.valueOf((int) ((Long) objValueOf2).longValue());
                                            }
                                            linkedHashMap.put(key2, objValueOf3);
                                            storeDecodedData(path, key2, objValueOf3);
                                            it = it;
                                            obj2 = obj2;
                                        } else {
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            Iterator<Map.Entry<String, JsonElement>> it2 = jsonObjectJsonObjectOrNull2.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                Map.Entry<String, JsonElement> next2 = it2.next();
                                                Object obj3 = objValueOf;
                                                String key3 = next2.getKey();
                                                Iterator<Map.Entry<String, JsonElement>> it3 = it2;
                                                JsonObject jsonObjectJsonObjectOrNull7 = jsonObjectOrNull(next2.getValue());
                                                Object obj4 = obj2;
                                                Integer numValueOf = (jsonObjectJsonObjectOrNull7 == null || (jsonElement2 = (JsonElement) jsonObjectJsonObjectOrNull7.get("position")) == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : Integer.valueOf(JsonElementKt.getInt(jsonPrimitive3));
                                                Intrinsics.checkNotNull(numValueOf);
                                                int iIntValue = numValueOf.intValue();
                                                if (z2) {
                                                    Intrinsics.checkNotNull(objValueOf2, "null cannot be cast to non-null type java.math.BigInteger");
                                                    BigInteger bigIntegerShiftRight2 = ((BigInteger) objValueOf2).shiftRight(iIntValue - i10);
                                                    Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight2, "shiftRight(...)");
                                                    BigInteger ONE2 = BigInteger.ONE;
                                                    Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
                                                    numberValueOf = bigIntegerShiftRight2.and(ONE2);
                                                    Intrinsics.checkNotNullExpressionValue(numberValueOf, "and(...)");
                                                } else {
                                                    Intrinsics.checkNotNull(objValueOf2, "null cannot be cast to non-null type kotlin.Long");
                                                    numberValueOf = Long.valueOf((((Long) objValueOf2).longValue() >> (iIntValue - i10)) & 1);
                                                }
                                                linkedHashMap2.put(key3, Integer.valueOf(numberValueOf.intValue()));
                                                obj2 = obj4;
                                                it2 = it3;
                                                objValueOf = obj3;
                                            }
                                            objValueOf = objValueOf;
                                            linkedHashMap.put(key2, linkedHashMap2);
                                            storeDecodedData(path, key2, linkedHashMap2);
                                            it = it;
                                        }
                                        objValueOf = objValueOf;
                                    }
                                }
                            }
                            if (z2) {
                                BigInteger ONE3 = BigInteger.ONE;
                                Intrinsics.checkNotNullExpressionValue(ONE3, "ONE");
                                BigInteger bigIntegerShiftLeft3 = ONE3.shiftLeft(i11);
                                Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft3, str);
                                Intrinsics.checkNotNullExpressionValue(ONE3, "ONE");
                                BigInteger bigIntegerSubtract2 = bigIntegerShiftLeft3.subtract(ONE3);
                                Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract2, "subtract(...)");
                                Intrinsics.checkNotNull(objValueOf, "null cannot be cast to non-null type java.math.BigInteger");
                                BigInteger bigIntegerShiftRight3 = ((BigInteger) objValueOf).shiftRight(i10);
                                Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight3, "shiftRight(...)");
                                objValueOf2 = bigIntegerShiftRight3.and(bigIntegerSubtract2);
                                Intrinsics.checkNotNullExpressionValue(objValueOf2, "and(...)");
                            } else {
                                Intrinsics.checkNotNull(objValueOf, "null cannot be cast to non-null type kotlin.Long");
                                objValueOf2 = Long.valueOf((((Long) objValueOf).longValue() >> i10) & ((1 << i11) - 1));
                            }
                            jsonElement = (JsonElement) jsonObjectJsonObjectOrNull6.get("bits");
                            if (jsonElement != null) {
                            }
                            if (z2) {
                                Intrinsics.checkNotNull(objValueOf2, "null cannot be cast to non-null type java.math.BigInteger");
                                objValueOf3 = Double.valueOf(((BigInteger) objValueOf2).doubleValue());
                            } else {
                                Intrinsics.checkNotNull(objValueOf2, "null cannot be cast to non-null type kotlin.Long");
                                objValueOf3 = Integer.valueOf((int) ((Long) objValueOf2).longValue());
                            }
                            linkedHashMap.put(key2, objValueOf3);
                            storeDecodedData(path, key2, objValueOf3);
                            it = it;
                            obj2 = obj2;
                            objValueOf = objValueOf;
                        }
                    }
                    it = it;
                    it = it;
                    obj2 = obj2;
                    objValueOf = objValueOf;
                }
            }
        }
        return linkedHashMap;
    }

    private final void parseData(Map<String, Object> result) {
        JsonElement jsonElement = (JsonElement) this.structure.get((Object) "data");
        ByteBuffer byteBuffer = null;
        if (jsonElement != null) {
            Object element = parseElement(resolveRef(jsonElement), "data");
            Map<String, Object> mapEmptyMap = element instanceof Map ? (Map) element : null;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt__MapsKt.emptyMap();
            }
            this.dataList.add(mapEmptyMap);
            result.put("data", this.dataList);
        }
        Object obj = result.get("header");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("fileType") : null;
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        Object obj3 = map2 != null ? map2.get("fileType") : null;
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (this.isEnd) {
            return;
        }
        if (num != null && num.intValue() == 1) {
            return;
        }
        ByteBuffer byteBuffer2 = this.buffer;
        if (byteBuffer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buffer");
            byteBuffer2 = null;
        }
        int iLimit = byteBuffer2.limit();
        int i = this.offset;
        ByteBuffer byteBuffer3 = this.buffer;
        if (byteBuffer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buffer");
        } else {
            byteBuffer = byteBuffer3;
        }
        boolean zHasRemaining = byteBuffer.hasRemaining();
        StringBuilder sb = new StringBuilder();
        sb.append("sss:");
        sb.append(iLimit);
        sb.append(" , offset:");
        sb.append(i);
        sb.append(" , is:");
        sb.append(zHasRemaining);
    }

    private final void parseEOF(JsonElement itemsDef, String path) {
        while (!this.isEnd) {
            this.eofList.add(this.gson.toJson(parseElement(itemsDef, String.valueOf(path))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x017e, code lost:
    
        if (((java.lang.Integer) r7).intValue() > r9.intValue()) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0190, code lost:
    
        if (((java.lang.Integer) r7).intValue() == r12.intValue()) goto L107;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object parseElement(kotlinx.serialization.json.JsonElement r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.parser.schema.BinarySchemaDecoder.parseElement(kotlinx.serialization.json.JsonElement, java.lang.String):java.lang.Object");
    }

    public static /* synthetic */ Object parseElement$default(BinarySchemaDecoder binarySchemaDecoder, JsonElement jsonElement, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return binarySchemaDecoder.parseElement(jsonElement, str);
    }

    private final void parseEofItems(JsonElement itemsDef, String path) {
    }

    private final Map<String, Object> parseObject(JsonObject obj, String path) {
        JsonObject jsonObjectJsonObjectOrNull;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonElement jsonElement = (JsonElement) obj.get("properties");
        if (jsonElement != null && (jsonObjectJsonObjectOrNull = jsonObjectOrNull(jsonElement)) != null) {
            for (Map.Entry<String, JsonElement> entry : jsonObjectJsonObjectOrNull.entrySet()) {
                String key = entry.getKey();
                Object element = parseElement(entry.getValue(), path + "/" + key);
                if (element != null) {
                    linkedHashMap.put(key, element);
                    storeDecodedData(path, key, element);
                }
            }
        }
        return linkedHashMap;
    }

    private final Integer resolveItemCount(JsonElement element, String path) {
        JsonPrimitive jsonPrimitive;
        if (element == null) {
            return null;
        }
        if (element instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive2 = (JsonPrimitive) element;
            if (!jsonPrimitive2.getIsString()) {
                return Integer.valueOf(JsonElementKt.getInt(jsonPrimitive2));
            }
            Object objResolveJsonPointer$default = resolveJsonPointer$default(this, jsonPrimitive2.getContent(), null, 2, null);
            if (objResolveJsonPointer$default instanceof Integer) {
                return (Integer) objResolveJsonPointer$default;
            }
            return null;
        }
        if (!(element instanceof JsonObject)) {
            return null;
        }
        JsonElement jsonElement = (JsonElement) ((JsonObject) element).get((Object) "$data");
        String contentOrNull = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive);
        if (contentOrNull == null) {
            return null;
        }
        Object objResolveJsonPointer = resolveJsonPointer(contentOrNull, path);
        Intrinsics.checkNotNull(objResolveJsonPointer, "null cannot be cast to non-null type kotlin.Int");
        Integer num = (Integer) objResolveJsonPointer;
        num.intValue();
        return num;
    }

    private final Object resolveJsonPointer(String pointer, String path) {
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.removePrefix(pointer, (CharSequence) "/"), new String[]{"/"}, false, 0, 6, (Object) null);
        Object obj = this.decodedData;
        if (Intrinsics.areEqual(listSplit$default.get(0), "EOF")) {
            return 1;
        }
        if (StringsKt__StringNumberConversionsKt.toIntOrNull((String) listSplit$default.get(0)) != null) {
            Intrinsics.checkNotNull(path);
            return Integer.valueOf(getParentNodeItemCount(path, pointer));
        }
        for (String str : listSplit$default) {
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null || (obj = map.get(str)) == null) {
                return null;
            }
        }
        return obj;
    }

    public static /* synthetic */ Object resolveJsonPointer$default(BinarySchemaDecoder binarySchemaDecoder, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return binarySchemaDecoder.resolveJsonPointer(str, str2);
    }

    private final JsonElement resolveRef(JsonElement element) {
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        String contentOrNull;
        JsonObject jsonObjectJsonObjectOrNull = jsonObjectOrNull(element);
        if (jsonObjectJsonObjectOrNull == null || (jsonElement = (JsonElement) jsonObjectJsonObjectOrNull.get("$ref")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null || (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive)) == null || !StringsKt__StringsJVMKt.startsWith$default(contentOrNull, "#/$defs/", false, 2, null)) {
            return element;
        }
        JsonElement jsonElement2 = (JsonElement) this.defs.get((Object) StringsKt__StringsKt.removePrefix(contentOrNull, (CharSequence) "#/$defs/"));
        return jsonElement2 == null ? element : jsonElement2;
    }

    private final byte[] saveFeatureData(ByteBuffer buffer) {
        if (buffer.remaining() <= 0) {
            return null;
        }
        byte[] bArr = new byte[buffer.limit() - this.offset];
        buffer.get(bArr);
        return bArr;
    }

    private final void storeDecodedData(String path, String key, Object value) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Map<String, Object> mapAsMutableMap = this.decodedData;
        for (String str : arrayList) {
            Object linkedHashMap = mapAsMutableMap.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                mapAsMutableMap.put(str, linkedHashMap);
            }
            mapAsMutableMap = TypeIntrinsics.asMutableMap(linkedHashMap);
        }
        mapAsMutableMap.put(key, value);
    }

    @NotNull
    public final Map<String, Object> decode() {
        if (this.buffer == null) {
            throw new IllegalStateException("Buffer not set");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("root", parseElement$default(this, this.structure, null, 2, null));
        return linkedHashMap;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final void setBuffer(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
        this.buffer = byteBufferWrap;
        if (byteBufferWrap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buffer");
            byteBufferWrap = null;
        }
        byteBufferWrap.order(this.littleEndian ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
        this.offset = 0;
        this.decodedData.clear();
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r6.equals("int32") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r6.equals("int16") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r6.equals("float") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r6.equals("int8") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r6.equals("uint32") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r6.equals("uint16") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6.equals("uint8") == false) goto L35;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getOffset(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L65
            int r0 = r6.hashCode()
            r1 = 8
            r2 = 2
            r3 = 1
            r4 = 4
            switch(r0) {
                case -1325958191: goto L5d;
                case -844996865: goto L54;
                case -844996807: goto L4b;
                case -844996712: goto L42;
                case 3237417: goto L39;
                case 97526364: goto L30;
                case 100359764: goto L25;
                case 100359822: goto L1a;
                case 111289374: goto Lf;
                default: goto Le;
            }
        Le:
            goto L65
        Lf:
            java.lang.String r0 = "uint8"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L18
            goto L65
        L18:
            r1 = r3
            goto L66
        L1a:
            java.lang.String r0 = "int32"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L23
            goto L65
        L23:
            r1 = r4
            goto L66
        L25:
            java.lang.String r0 = "int16"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e
            goto L65
        L2e:
            r1 = r2
            goto L66
        L30:
            java.lang.String r0 = "float"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L23
            goto L65
        L39:
            java.lang.String r0 = "int8"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L18
            goto L65
        L42:
            java.lang.String r0 = "uint64"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L66
            goto L65
        L4b:
            java.lang.String r0 = "uint32"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L23
            goto L65
        L54:
            java.lang.String r0 = "uint16"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e
            goto L65
        L5d:
            java.lang.String r0 = "double"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L66
        L65:
            r1 = 0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.parser.schema.BinarySchemaDecoder.getOffset(java.lang.String):int");
    }
}
