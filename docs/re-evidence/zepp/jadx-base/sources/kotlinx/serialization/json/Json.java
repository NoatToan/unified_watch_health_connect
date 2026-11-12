package kotlinx.serialization.json;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonReader;
import kotlinx.serialization.json.internal.JsonStringBuilder;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StreamingJsonEncoder;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0019\b\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+J)\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\"\u001a\u00020\u001d8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u001b\u001a\u0004\b&\u0010'\u0082\u0001\u0002-.¨\u0006/"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/StringFormat;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "", "encodeToString", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "string", "decodeFromString", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "encodeToJsonElement", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "element", "decodeFromJsonElement", "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "parseToJsonElement", "Lkotlinx/serialization/json/JsonConfiguration;", "a", "Lkotlinx/serialization/json/JsonConfiguration;", "getConfiguration", "()Lkotlinx/serialization/json/JsonConfiguration;", "getConfiguration$annotations", "()V", "configuration", "Lkotlinx/serialization/modules/SerializersModule;", "b", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "c", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "get_schemaCache$kotlinx_serialization_json", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "get_schemaCache$kotlinx_serialization_json$annotations", "_schemaCache", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/modules/SerializersModule;)V", "Default", "Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/a;", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public abstract class Json implements StringFormat {

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JsonConfiguration configuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SerializersModule serializersModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DescriptorSchemaCache _schemaCache;

    /* JADX INFO: renamed from: kotlinx.serialization.json.Json$Default, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/Json;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
    public static final class Companion extends Json {
        private Companion() {
            super(new JsonConfiguration(false, false, false, false, false, null, false, false, null, false, false, 2047, null), SerializersModuleKt.getEmptySerializersModule(), null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        this.configuration = jsonConfiguration;
        this.serializersModule = serializersModule;
        this._schemaCache = new DescriptorSchemaCache();
    }

    public /* synthetic */ Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, serializersModule);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getConfiguration$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @ReplaceWith(expression = "schemaCache", imports = {}))
    public static /* synthetic */ void get_schemaCache$kotlinx_serialization_json$annotations() {
    }

    public final <T> T decodeFromJsonElement(@NotNull DeserializationStrategy<T> deserializer, @NotNull JsonElement element) {
        return (T) TreeJsonDecoderKt.readJson(this, element, deserializer);
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> T decodeFromString(@NotNull DeserializationStrategy<T> deserializer, @NotNull String string) {
        JsonReader jsonLexer = new JsonReader(string);
        T t = (T) new StreamingJsonDecoder(this, WriteMode.OBJ, jsonLexer).decodeSerializableValue(deserializer);
        jsonLexer.expectEof();
        return t;
    }

    @NotNull
    public final <T> JsonElement encodeToJsonElement(@NotNull SerializationStrategy<? super T> serializer, T value) {
        return TreeJsonEncoderKt.writeJson(this, value, serializer);
    }

    @Override // kotlinx.serialization.StringFormat
    @NotNull
    public final <T> String encodeToString(@NotNull SerializationStrategy<? super T> serializer, T value) {
        JsonStringBuilder jsonStringBuilder = new JsonStringBuilder();
        try {
            new StreamingJsonEncoder(jsonStringBuilder, this, WriteMode.OBJ, new JsonEncoder[WriteMode.values().length]).encodeSerializableValue(serializer, value);
            return jsonStringBuilder.toString();
        } finally {
            jsonStringBuilder.release();
        }
    }

    @NotNull
    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // kotlinx.serialization.SerialFormat
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @NotNull
    /* JADX INFO: renamed from: get_schemaCache$kotlinx_serialization_json, reason: from getter */
    public final DescriptorSchemaCache get_schemaCache() {
        return this._schemaCache;
    }

    @NotNull
    public final JsonElement parseToJsonElement(@NotNull String string) {
        return (JsonElement) decodeFromString(JsonElementSerializer.INSTANCE, string);
    }
}
