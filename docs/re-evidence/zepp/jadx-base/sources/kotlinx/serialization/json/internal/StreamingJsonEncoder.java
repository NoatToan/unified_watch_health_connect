package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00106\u001a\u000201\u0012\u0006\u0010:\u001a\u000207\u0012\u0010\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010;¢\u0006\u0004\bN\u0010OB1\b\u0010\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u00106\u001a\u000201\u0012\u0006\u0010:\u001a\u000207\u0012\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010;¢\u0006\u0004\bN\u0010RJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J+\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020$H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001c\u00106\u001a\u0002018\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010D\u001a\u00020?8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010J¨\u0006S"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "a", "Lkotlinx/serialization/json/JsonElement;", "element", "encodeJsonElement", "", "index", "", "shouldEncodeElementDefault", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginStructure", "endStructure", "encodeElement", "inlineDescriptor", "Lkotlinx/serialization/encoding/Encoder;", "encodeInline", "encodeNull", "encodeBoolean", "", "encodeByte", "", "encodeShort", "encodeInt", "", "encodeLong", "", "encodeFloat", "", "encodeDouble", "", "encodeChar", "", "encodeString", "enumDescriptor", "encodeEnum", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/Composer;", com.twitter.sdk.android.tweetcomposer.g.c, "Lkotlinx/serialization/json/Json;", "b", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", "c", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "", GoogleApiAvailabilityLight.a, "[Lkotlinx/serialization/json/JsonEncoder;", "modeReuseCache", "Lkotlinx/serialization/modules/SerializersModule;", "e", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/json/JsonConfiguration;", "f", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "g", "Z", "forceQuoting", "h", "writePolymorphic", "<init>", "(Lkotlinx/serialization/json/internal/Composer;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "Lkotlinx/serialization/json/internal/JsonStringBuilder;", "output", "(Lkotlinx/serialization/json/internal/JsonStringBuilder;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Composer composer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Json json;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WriteMode mode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final JsonEncoder[] modeReuseCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SerializersModule serializersModule;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final JsonConfiguration configuration;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean forceQuoting;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean writePolymorphic;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            iArr[WriteMode.LIST.ordinal()] = 1;
            iArr[WriteMode.MAP.ordinal()] = 2;
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonEncoder(@NotNull Composer composer, @NotNull Json json, @NotNull WriteMode writeMode, @Nullable JsonEncoder[] jsonEncoderArr) {
        this.composer = composer;
        this.json = json;
        this.mode = writeMode;
        this.modeReuseCache = jsonEncoderArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = writeMode.ordinal();
        if (jsonEncoderArr != null) {
            if (jsonEncoderArr[iOrdinal] == null && jsonEncoderArr[iOrdinal] == this) {
                return;
            }
            jsonEncoderArr[iOrdinal] = this;
        }
    }

    private final void a(SerialDescriptor descriptor) {
        this.composer.nextItem();
        encodeString(this.configuration.getClassDiscriminator());
        this.composer.print(JsonLexerKt.COLON);
        this.composer.space();
        encodeString(descriptor.getSerialName());
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(getJson(), descriptor);
        char c = writeModeSwitchMode.begin;
        if (c != 0) {
            this.composer.print(c);
            this.composer.indent();
        }
        if (this.writePolymorphic) {
            this.writePolymorphic = false;
            a(descriptor);
        }
        if (this.mode == writeModeSwitchMode) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        JsonEncoder jsonEncoder = jsonEncoderArr == null ? null : jsonEncoderArr[writeModeSwitchMode.ordinal()];
        return jsonEncoder == null ? new StreamingJsonEncoder(this.composer, getJson(), writeModeSwitchMode, this.modeReuseCache) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char value) {
        encodeString(String.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Double.isInfinite(value) || Double.isNaN(value)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), this.composer.sb.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.print(',');
                    }
                    this.composer.nextItem();
                    encodeString(descriptor.getElementName(index));
                    this.composer.print(JsonLexerKt.COLON);
                    this.composer.space();
                } else {
                    if (index == 0) {
                        this.forceQuoting = true;
                    }
                    if (index == 1) {
                        this.composer.print(',');
                        this.composer.space();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.nextItem();
            } else {
                if (index % 2 == 0) {
                    this.composer.print(',');
                    this.composer.nextItem();
                    z = true;
                } else {
                    this.composer.print(JsonLexerKt.COLON);
                    this.composer.space();
                }
                this.forceQuoting = z;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.print(',');
            }
            this.composer.nextItem();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
        encodeString(enumDescriptor.getElementName(index));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Float.isInfinite(value) || Float.isNaN(value)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), this.composer.sb.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor inlineDescriptor) {
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new StreamingJsonEncoder(new ComposerForUnsignedNumbers(this.composer.sb, getJson()), getJson(), this.mode, (JsonEncoder[]) null) : super.encodeInline(inlineDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(@NotNull JsonElement element) {
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.composer.print("null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
        if (!(serializer instanceof AbstractPolymorphicSerializer) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, value);
            return;
        }
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Any");
        SerializationStrategy serializationStrategyA = PolymorphicKt.a(this, serializer, value);
        this.writePolymorphic = true;
        serializationStrategyA.serialize(this, value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String value) {
        this.composer.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        if (this.mode.end != 0) {
            this.composer.unIndent();
            this.composer.nextItem();
            this.composer.print(this.mode.end);
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
        return this.configuration.getEncodeDefaults();
    }

    public StreamingJsonEncoder(@NotNull JsonStringBuilder jsonStringBuilder, @NotNull Json json, @NotNull WriteMode writeMode, @NotNull JsonEncoder[] jsonEncoderArr) {
        this(new Composer(jsonStringBuilder, json), json, writeMode, jsonEncoderArr);
    }
}
