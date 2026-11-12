package com.huami.training.api.pojo;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/training/api/pojo/PlanTrainingBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/training/api/pojo/PlanTrainingBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class PlanTrainingBean$$serializer implements GeneratedSerializer<PlanTrainingBean> {

    @NotNull
    public static final PlanTrainingBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PlanTrainingBean$$serializer planTrainingBean$$serializer = new PlanTrainingBean$$serializer();
        INSTANCE = planTrainingBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.training.api.pojo.PlanTrainingBean", planTrainingBean$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("trainingId", false);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.addElement("time", true);
        pluginGeneratedSerialDescriptor.addElement("consumption", true);
        pluginGeneratedSerialDescriptor.addElement("isFinished", false);
        pluginGeneratedSerialDescriptor.addElement("isToday", true);
        pluginGeneratedSerialDescriptor.addElement("dayIndex", false);
        pluginGeneratedSerialDescriptor.addElement("articleId", true);
        pluginGeneratedSerialDescriptor.addElement("articleTitle", true);
        pluginGeneratedSerialDescriptor.addElement("articleDescription", true);
        pluginGeneratedSerialDescriptor.addElement("articleLink", true);
        pluginGeneratedSerialDescriptor.addElement("articleImgUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PlanTrainingBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(intSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), intSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PlanTrainingBean deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        int iDecodeIntElement;
        boolean zDecodeBooleanElement;
        int iDecodeIntElement2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object objDecodeNullableSerializableElement3;
        long j;
        Object obj5;
        Object objDecodeNullableSerializableElement4;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 9;
        int i3 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, longSerializer, null);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, IntSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 5);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, BooleanSerializer.INSTANCE, null);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, longSerializer, null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            iDecodeIntElement = iDecodeIntElement4;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            obj4 = objDecodeNullableSerializableElement10;
            iDecodeIntElement2 = iDecodeIntElement3;
            obj = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement8;
            obj3 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement7;
            i = 8191;
            obj5 = objDecodeNullableSerializableElement6;
            j = jDecodeLongElement;
            obj2 = objDecodeNullableSerializableElement11;
        } else {
            int i4 = 12;
            Object objDecodeNullableSerializableElement12 = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            long jDecodeLongElement2 = 0;
            iDecodeIntElement = 0;
            zDecodeBooleanElement = false;
            iDecodeIntElement2 = 0;
            boolean z = true;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            int i5 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = 9;
                        i4 = 12;
                        z = false;
                        break;
                    case 0:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
                        i5 |= 1;
                        i2 = 9;
                        i3 = 8;
                        i4 = 12;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i5 |= 2;
                        i2 = 9;
                        i3 = 8;
                        i4 = 12;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 2);
                        i5 |= 4;
                        i2 = 9;
                        i3 = 8;
                        i4 = 12;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i5 |= 8;
                        i2 = 9;
                        i3 = 8;
                        i4 = 12;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, IntSerializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i5 |= 16;
                        i2 = 9;
                        i3 = 8;
                        i4 = 12;
                        break;
                    case 5:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor2, 5);
                        i5 |= 32;
                        i2 = 9;
                        i3 = 8;
                        i4 = 12;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i5 |= 64;
                        i2 = 9;
                        i3 = 8;
                        i4 = 12;
                        break;
                    case 7:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i5 |= 128;
                        i4 = 12;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i3, LongSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i5 |= 256;
                        i4 = 12;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i5 |= 512;
                        i4 = 12;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i5 |= 1024;
                        i4 = 12;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i5 |= 2048;
                        i4 = 12;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i5 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            obj = objDecodeNullableSerializableElement17;
            obj2 = objDecodeNullableSerializableElement14;
            obj3 = objDecodeNullableSerializableElement15;
            obj4 = objDecodeNullableSerializableElement16;
            i = i5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement18;
            j = jDecodeLongElement2;
            Object obj6 = objDecodeNullableSerializableElement13;
            obj5 = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement4 = obj6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new PlanTrainingBean(i, j, (String) obj, iDecodeIntElement2, (Long) objDecodeNullableSerializableElement3, (Integer) obj5, zDecodeBooleanElement, (Boolean) objDecodeNullableSerializableElement2, iDecodeIntElement, (Long) objDecodeNullableSerializableElement, (String) obj3, (String) obj4, (String) obj2, (String) objDecodeNullableSerializableElement4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PlanTrainingBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        PlanTrainingBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
