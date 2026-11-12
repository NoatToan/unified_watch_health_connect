package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u00108\u001a\u000204\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bI\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020\rH\u0016J\u0010\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0007H\u0016R\u0019\u00108\u001a\u0002048\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0016\u0010=\u001a\u00020<8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010C\u001a\u00020?8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0016\u0010H\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010G¨\u0006K"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "", "a", "", GoogleApiAvailabilityLight.a, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "index", "", "b", "e", "", "key", "g", "c", "f", "Lkotlinx/serialization/json/JsonElement;", "decodeJsonElement", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "endStructure", "decodeNotNullMark", "", "decodeNull", "decodeElementIndex", "decodeBoolean", "", "decodeByte", "", "decodeShort", "decodeInt", "", "decodeLong", "", "decodeFloat", "", "decodeDouble", "", "decodeChar", "decodeString", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "decodeInline", "enumDescriptor", "decodeEnum", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "Lkotlinx/serialization/json/internal/JsonLexer;", "lexer", "Lkotlinx/serialization/json/internal/JsonLexer;", "Lkotlinx/serialization/modules/SerializersModule;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", LogUtil.I, "currentIndex", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/JsonLexer;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Json json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WriteMode mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SerializersModule serializersModule;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int currentIndex = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final JsonConfiguration configuration;

    @JvmField
    @NotNull
    public final JsonReader lexer;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            iArr[WriteMode.LIST.ordinal()] = 1;
            iArr[WriteMode.MAP.ordinal()] = 2;
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            iArr[WriteMode.OBJ.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonDecoder(@NotNull Json json, @NotNull WriteMode writeMode, @NotNull JsonReader jsonReader) {
        this.json = json;
        this.mode = writeMode;
        this.lexer = jsonReader;
        this.serializersModule = json.getSerializersModule();
        this.configuration = json.getConfiguration();
    }

    private final void a() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        JsonReader.fail$default(this.lexer, "Unexpected leading comma", 0, 2, null);
        throw new KotlinNothingValueException();
    }

    private final boolean b(SerialDescriptor descriptor, int index) {
        String strPeekString;
        Json json = this.json;
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (elementDescriptor.isNullable() || !(!this.lexer.tryConsumeNotNull())) {
            if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || (strPeekString = this.lexer.peekString(this.configuration.getIsLenient())) == null || JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, strPeekString) != -3) {
                return false;
            }
            this.lexer.consumeString();
        }
        return true;
    }

    private final int c() {
        boolean zTryConsumeComma = this.lexer.tryConsumeComma();
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma) {
                return -1;
            }
            JsonReader.fail$default(this.lexer, "Unexpected trailing comma", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        int i = this.currentIndex;
        if (i != -1 && !zTryConsumeComma) {
            JsonReader.fail$default(this.lexer, "Expected end of the array or comma", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        int i2 = i + 1;
        this.currentIndex = i2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private final int d() {
        boolean zTryConsumeComma;
        JsonReader jsonReader;
        int i;
        JsonReader jsonReader2;
        boolean z;
        int i2;
        int i3 = this.currentIndex;
        boolean z2 = i3 % 2 != 0;
        if (z2) {
            zTryConsumeComma = i3 != -1 ? this.lexer.tryConsumeComma() : false;
            if (this.lexer.canConsumeValue()) {
                if (!zTryConsumeComma) {
                    return -1;
                }
                JsonReader.fail$default(this.lexer, "Expected '}', but had ',' instead", 0, 2, null);
                throw new KotlinNothingValueException();
            }
            if (z2) {
                if (this.currentIndex == -1) {
                    jsonReader2 = this.lexer;
                    z = !zTryConsumeComma;
                    i2 = jsonReader2.currentPosition;
                    if (!z) {
                        jsonReader2.fail("Unexpected trailing comma", i2);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    jsonReader = this.lexer;
                    i = jsonReader.currentPosition;
                    if (!zTryConsumeComma) {
                        jsonReader.fail("Expected comma after the key-value pair", i);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            int i4 = this.currentIndex + 1;
            this.currentIndex = i4;
            return i4;
        }
        this.lexer.consumeNextToken(JsonLexerKt.COLON);
        if (this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma) {
                return -1;
            }
            JsonReader.fail$default(this.lexer, "Expected '}', but had ',' instead", 0, 2, null);
            throw new KotlinNothingValueException();
        }
        if (z2) {
            if (this.currentIndex == -1) {
                jsonReader2 = this.lexer;
                z = !zTryConsumeComma;
                i2 = jsonReader2.currentPosition;
                if (!z) {
                    jsonReader2.fail("Unexpected trailing comma", i2);
                    throw new KotlinNothingValueException();
                }
            } else {
                jsonReader = this.lexer;
                i = jsonReader.currentPosition;
                if (!zTryConsumeComma) {
                    jsonReader.fail("Expected comma after the key-value pair", i);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i5 = this.currentIndex + 1;
        this.currentIndex = i5;
        return i5;
    }

    private final int e(SerialDescriptor descriptor) {
        boolean zTryConsumeComma;
        boolean zTryConsumeComma2 = this.lexer.tryConsumeComma();
        while (true) {
            boolean z = false;
            if (!this.lexer.canConsumeValue()) {
                if (!zTryConsumeComma2) {
                    return -1;
                }
                JsonReader.fail$default(this.lexer, "Unexpected trailing comma", 0, 2, null);
                throw new KotlinNothingValueException();
            }
            String strF = f();
            this.lexer.consumeNextToken(JsonLexerKt.COLON);
            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(descriptor, this.json, strF);
            if (jsonNameIndex == -3) {
                zTryConsumeComma = false;
                z = true;
            } else {
                if (!this.configuration.getCoerceInputValues() || !b(descriptor, jsonNameIndex)) {
                    return jsonNameIndex;
                }
                zTryConsumeComma = this.lexer.tryConsumeComma();
            }
            zTryConsumeComma2 = z ? g(strF) : zTryConsumeComma;
        }
    }

    private final String f() {
        return this.configuration.getIsLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeKeyString();
    }

    private final boolean g(String key) {
        if (this.configuration.getIgnoreUnknownKeys()) {
            this.lexer.skipElement(this.configuration.getIsLenient());
        } else {
            this.lexer.failOnUnknownKey(key);
        }
        return this.lexer.tryConsumeComma();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.consumeNextToken(writeModeSwitchMode.begin);
        a();
        int i = WhenMappings.$EnumSwitchMapping$0[writeModeSwitchMode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer);
        }
        return this.mode == writeModeSwitchMode ? this : new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.configuration.getIsLenient() ? this.lexer.consumeBooleanLenient() : this.lexer.consumeBoolean();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b = (byte) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == b) {
            return b;
        }
        JsonReader.fail$default(this.lexer, "Failed to parse byte for input '" + jConsumeNumericLiteral + '\'', 0, 2, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String strConsumeStringLenient = this.lexer.consumeStringLenient();
        if (strConsumeStringLenient.length() == 1) {
            return strConsumeStringLenient.charAt(0);
        }
        JsonReader.fail$default(this.lexer, "Expected single char, but got '" + strConsumeStringLenient + '\'', 0, 2, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        JsonReader jsonReader = this.lexer;
        String strConsumeStringLenient = jsonReader.consumeStringLenient();
        boolean z = false;
        try {
            double d = Double.parseDouble(strConsumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    z = true;
                }
                if (!z) {
                    JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(d));
                    throw new KotlinNothingValueException();
                }
            }
            return d;
        } catch (IllegalArgumentException unused) {
            JsonReader.fail$default(jsonReader, "Failed to parse type 'double' for input '" + strConsumeStringLenient + '\'', 0, 2, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i != 2) {
            return i != 4 ? c() : e(descriptor);
        }
        return d();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        JsonReader jsonReader = this.lexer;
        String strConsumeStringLenient = jsonReader.consumeStringLenient();
        boolean z = false;
        try {
            float f = Float.parseFloat(strConsumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                    z = true;
                }
                if (!z) {
                    JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(f));
                    throw new KotlinNothingValueException();
                }
            }
            return f;
        } catch (IllegalArgumentException unused) {
            JsonReader.fail$default(jsonReader, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + strConsumeStringLenient + '\'', 0, 2, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor inlineDescriptor) {
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(inlineDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i = (int) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == i) {
            return i;
        }
        JsonReader.fail$default(this.lexer, "Failed to parse int for input '" + jConsumeNumericLiteral + '\'', 0, 2, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return this.lexer.tryConsumeNotNull();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(@NotNull DeserializationStrategy<T> deserializer) {
        return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s = (short) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == s) {
            return s;
        }
        JsonReader.fail$default(this.lexer, "Failed to parse short for input '" + jConsumeNumericLiteral + '\'', 0, 2, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        return this.configuration.getIsLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        this.lexer.consumeNextToken(this.mode.end);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    @NotNull
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
