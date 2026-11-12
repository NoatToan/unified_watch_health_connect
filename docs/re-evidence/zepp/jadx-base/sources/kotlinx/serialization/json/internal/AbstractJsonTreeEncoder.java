package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010<\u001a\u000207\u0012\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050=¢\u0006\u0004\bI\u0010JJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0014J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\tH\u0014J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0019H\u0014J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001bH\u0014J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001dH\u0014J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001fH\u0014J+\u0010$\u001a\u00020\u0005\"\u0004\b\u0000\u0010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020&H\u0014J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000bH\u0014J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020)H\u0014J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0014J \u0010.\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\tH\u0014J\u0018\u00100\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020/H\u0014J\u0018\u00103\u001a\u0002022\u0006\u0010\u0015\u001a\u00020\r2\u0006\u00101\u001a\u00020\u0007H\u0014J\u0010\u00105\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014R\u0019\u0010<\u001a\u0002078\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010>R\u0016\u0010B\u001a\u00020@8\u0004@\u0005X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010AR\u0016\u0010D\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010CR\u0013\u0010H\u001a\u00020E8F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0001\u0003KLM¨\u0006N"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/json/JsonElement;", "element", "", "encodeJsonElement", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "shouldEncodeElementDefault", "", "parentName", "childName", "composeName", "key", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "encodeNull", "tag", "l", "value", z.j, "", GoogleApiAvailabilityLight.a, "", "m", "", hl.k, "", "h", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "", "f", "c", "", "e", GoogleApiAvailabilityLight.b, "enumDescriptor", "ordinal", "g", "", "o", "inlineDescriptor", "Lkotlinx/serialization/encoding/Encoder;", "i", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginStructure", "endEncode", "Lkotlinx/serialization/json/Json;", "b", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "nodeConsumer", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Z", "writePolymorphic", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/serialization/json/internal/c;", "Lkotlinx/serialization/json/internal/e;", "Lkotlinx/serialization/json/internal/g;", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
@ExperimentalSerializationApi
abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Json json;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<JsonElement, Unit> nodeConsumer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final JsonConfiguration configuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean writePolymorphic;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonElement;", "node", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JsonElement, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull JsonElement jsonElement) {
            AbstractJsonTreeEncoder abstractJsonTreeEncoder = AbstractJsonTreeEncoder.this;
            abstractJsonTreeEncoder.q(AbstractJsonTreeEncoder.b(abstractJsonTreeEncoder), jsonElement);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonElement jsonElement) {
            a(jsonElement);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractJsonTreeEncoder(Json json, Function1<? super JsonElement, Unit> function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    public static final /* synthetic */ String b(AbstractJsonTreeEncoder abstractJsonTreeEncoder) {
        return abstractJsonTreeEncoder.getCurrentTag();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
        AbstractJsonTreeEncoder eVar;
        Function1 aVar = getCurrentTagOrNull() == null ? this.nodeConsumer : new a();
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) ? true : kind instanceof PolymorphicKind) {
            eVar = new g(this.json, aVar);
        } else if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json = this.json;
            SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = serialDescriptorCarrierDescriptor.getKind();
            if ((kind2 instanceof PrimitiveKind) || Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                eVar = new i(getJson(), aVar);
            } else {
                if (!json.getConfiguration().getAllowStructuredMapKeys()) {
                    throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
                }
                eVar = new g(getJson(), aVar);
            }
        } else {
            eVar = new e(this.json, aVar);
        }
        if (this.writePolymorphic) {
            this.writePolymorphic = false;
            eVar.q(this.configuration.getClassDiscriminator(), JsonElementKt.JsonPrimitive(descriptor.getSerialName()));
        }
        return eVar;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedBoolean(@NotNull String tag, boolean value) {
        q(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    @NotNull
    public String composeName(@NotNull String parentName, @NotNull String childName) {
        return childName;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedByte(@NotNull String tag, byte value) {
        q(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedChar(@NotNull String tag, char value) {
        q(tag, JsonElementKt.JsonPrimitive(String.valueOf(value)));
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(@NotNull JsonElement element) {
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
        if (getCurrentTagOrNull() == null && ((serializer.getDescriptor().getKind() instanceof PrimitiveKind) || serializer.getDescriptor().getKind() == SerialKind.ENUM.INSTANCE)) {
            c cVar = new c(this.json, this.nodeConsumer);
            cVar.encodeSerializableValue(serializer, value);
            cVar.endEncode(serializer.getDescriptor());
        } else {
            if (!(serializer instanceof AbstractPolymorphicSerializer) || getJson().getConfiguration().getUseArrayPolymorphism()) {
                serializer.serialize(this, value);
                return;
            }
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Any");
            SerializationStrategy serializationStrategyA = PolymorphicKt.a(this, serializer, value);
            this.writePolymorphic = true;
            serializationStrategyA.serialize(this, value);
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void endEncode(@NotNull SerialDescriptor descriptor) {
        this.nodeConsumer.invoke(p());
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedDouble(@NotNull String tag, double value) {
        q(tag, JsonElementKt.JsonPrimitive(Double.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Double.isInfinite(value) || Double.isNaN(value)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), tag, p().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedEnum(@NotNull String tag, @NotNull SerialDescriptor enumDescriptor, int ordinal) {
        q(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(ordinal)));
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    @NotNull
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public final SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedFloat(@NotNull String tag, float value) {
        q(tag, JsonElementKt.JsonPrimitive(Float.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Float.isInfinite(value) || Float.isNaN(value)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), tag, p().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Encoder encodeTaggedInline(@NotNull final String tag, @NotNull SerialDescriptor inlineDescriptor) {
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.encodeTaggedInline.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final SerializersModule serializersModule;

            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte value) {
                putUnquotedString(UByte.m3859toStringimpl(UByte.m3855constructorimpl(value)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int value) {
                putUnquotedString(UInt.m3884toStringimpl(UInt.m3880constructorimpl(value)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long value) {
                putUnquotedString(ULong.m3909toStringimpl(ULong.m3905constructorimpl(value)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short value) {
                putUnquotedString(UShort.m3934toStringimpl(UShort.m3930constructorimpl(value)));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            @NotNull
            public SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(@NotNull String s) {
                AbstractJsonTreeEncoder.this.q(tag, new JsonLiteral(s, false));
            }
        } : super.encodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedInt(@NotNull String tag, int value) {
        q(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedLong(@NotNull String tag, long value) {
        q(tag, JsonElementKt.JsonPrimitive(Long.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedNull(@NotNull String tag) {
        q(tag, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedShort(@NotNull String tag, short value) {
        q(tag, JsonElementKt.JsonPrimitive(Short.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedString(@NotNull String tag, @NotNull String value) {
        q(tag, JsonElementKt.JsonPrimitive(value));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedValue(@NotNull String tag, @NotNull Object value) {
        q(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }

    @NotNull
    public abstract JsonElement p();

    public abstract void q(@NotNull String key, @NotNull JsonElement element);

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
        return this.configuration.getEncodeDefaults();
    }
}
