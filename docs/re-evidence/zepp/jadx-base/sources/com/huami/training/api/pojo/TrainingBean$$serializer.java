package com.huami.training.api.pojo;

import com.huami.training.api.DifficultyBo;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.ks.DifficultyBoSerializer;
import com.huami.training.api.ks.GenderLongPairSerializer;
import com.huami.training.api.ks.GenderStringPairSerializer;
import com.huami.training.api.ks.TrainingTypeBoSerializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/training/api/pojo/TrainingBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/training/api/pojo/TrainingBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class TrainingBean$$serializer implements GeneratedSerializer<TrainingBean> {

    @NotNull
    public static final TrainingBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TrainingBean$$serializer trainingBean$$serializer = new TrainingBean$$serializer();
        INSTANCE = trainingBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.training.api.pojo.TrainingBean", trainingBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("trainingType", true);
        pluginGeneratedSerialDescriptor.addElement("difficultyDegree", true);
        pluginGeneratedSerialDescriptor.addElement("listPageIllustrated", true);
        pluginGeneratedSerialDescriptor.addElement("time", false);
        pluginGeneratedSerialDescriptor.addElement("actionAmount", true);
        pluginGeneratedSerialDescriptor.addElement("consumption", false);
        pluginGeneratedSerialDescriptor.addElement("participantNumber", false);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("squareIllustrated", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrainingBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(new TrainingTypeBoSerializer()), BuiltinSerializersKt.getNullable(new DifficultyBoSerializer()), BuiltinSerializersKt.getNullable(new GenderStringPairSerializer()), new GenderLongPairSerializer(), BuiltinSerializersKt.getNullable(intSerializer), intSerializer, intSerializer, BuiltinSerializersKt.getNullable(new ArrayListSerializer(LabelBean$$serializer.INSTANCE)), BuiltinSerializersKt.getNullable(new GenderStringPairSerializer())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public TrainingBean deserialize(@NotNull Decoder decoder) {
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        int iDecodeIntElement;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        int i;
        int i2;
        String str;
        long jDecodeLongElement;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i3 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new TrainingTypeBoSerializer(), null);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new DifficultyBoSerializer(), null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new GenderStringPairSerializer(), null);
            Object objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new GenderLongPairSerializer(), null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, new ArrayListSerializer(LabelBean$$serializer.INSTANCE), null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, new GenderStringPairSerializer(), null);
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement8;
            i = iDecodeIntElement3;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            objDecodeSerializableElement = objDecodeSerializableElement2;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement9;
            i2 = 2047;
            str = strDecodeStringElement;
            iDecodeIntElement = iDecodeIntElement2;
        } else {
            Object objDecodeNullableSerializableElement10 = null;
            Object objDecodeNullableSerializableElement11 = null;
            objDecodeSerializableElement = null;
            Object objDecodeNullableSerializableElement12 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            objDecodeNullableSerializableElement3 = null;
            long jDecodeLongElement2 = 0;
            iDecodeIntElement = 0;
            int i4 = 0;
            boolean z = true;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = 10;
                        z = false;
                        break;
                    case 0:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
                        i4 |= 1;
                        i3 = 10;
                        break;
                    case 1:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i4 |= 2;
                        i3 = 10;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new TrainingTypeBoSerializer(), objDecodeNullableSerializableElement3);
                        i4 |= 4;
                        i3 = 10;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new DifficultyBoSerializer(), objDecodeNullableSerializableElement2);
                        i4 |= 8;
                        i3 = 10;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new GenderStringPairSerializer(), objDecodeNullableSerializableElement);
                        i4 |= 16;
                        i3 = 10;
                        break;
                    case 5:
                        objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 5, new GenderLongPairSerializer(), objDecodeSerializableElement);
                        i4 |= 32;
                        i3 = 10;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i4 |= 64;
                        i3 = 10;
                        break;
                    case 7:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i4 |= 128;
                        i3 = 10;
                        break;
                    case 8:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
                        i4 |= 256;
                        i3 = 10;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, new ArrayListSerializer(LabelBean$$serializer.INSTANCE), objDecodeNullableSerializableElement11);
                        i4 |= 512;
                        i3 = 10;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i3, new GenderStringPairSerializer(), objDecodeNullableSerializableElement10);
                        i4 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement10;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement11;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement12;
            i = iDecodeIntElement4;
            i2 = i4;
            str = strDecodeStringElement2;
            jDecodeLongElement = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new TrainingBean(i2, jDecodeLongElement, str, (TrainingTypeBo) objDecodeNullableSerializableElement3, (DifficultyBo) objDecodeNullableSerializableElement2, (GenderStringPair) objDecodeNullableSerializableElement, (GenderLongPair) objDecodeSerializableElement, (Integer) objDecodeNullableSerializableElement6, iDecodeIntElement, i, (List) objDecodeNullableSerializableElement5, (GenderStringPair) objDecodeNullableSerializableElement4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull TrainingBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        TrainingBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
