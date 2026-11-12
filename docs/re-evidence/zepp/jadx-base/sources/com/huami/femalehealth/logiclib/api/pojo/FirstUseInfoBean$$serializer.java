package com.huami.femalehealth.logiclib.api.pojo;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class FirstUseInfoBean$$serializer implements GeneratedSerializer<FirstUseInfoBean> {

    @NotNull
    public static final FirstUseInfoBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FirstUseInfoBean$$serializer firstUseInfoBean$$serializer = new FirstUseInfoBean$$serializer();
        INSTANCE = firstUseInfoBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.femalehealth.logiclib.api.pojo.FirstUseInfoBean", firstUseInfoBean$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("userId", false);
        pluginGeneratedSerialDescriptor.addElement("firstTime", false);
        pluginGeneratedSerialDescriptor.addElement("estimatedMenstrualDays", false);
        pluginGeneratedSerialDescriptor.addElement("menstrualCycle", false);
        pluginGeneratedSerialDescriptor.addElement("lastMenstrualTime", false);
        pluginGeneratedSerialDescriptor.addElement("intelligentPrediction", false);
        pluginGeneratedSerialDescriptor.addElement("appPush", false);
        pluginGeneratedSerialDescriptor.addElement("appBeforeMenstruationPush", false);
        pluginGeneratedSerialDescriptor.addElement("appBeforeOvulationPush", false);
        pluginGeneratedSerialDescriptor.addElement("hardwarePush", false);
        pluginGeneratedSerialDescriptor.addElement("hardwareBeforeMenstruationPush", false);
        pluginGeneratedSerialDescriptor.addElement("hardwareBeforeOvulationPush", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FirstUseInfoBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public FirstUseInfoBean deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object obj;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        int i;
        int i2;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, stringSerializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, longSerializer, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, longSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, longSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, longSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, longSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, booleanSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, longSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, longSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, booleanSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, longSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, longSerializer, null);
            obj = objDecodeNullableSerializableElement14;
            i = 8191;
        } else {
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        objDecodeNullableSerializableElement15 = objDecodeNullableSerializableElement15;
                        z = false;
                        i3 = i3;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        objDecodeNullableSerializableElement15 = objDecodeNullableSerializableElement15;
                        i3 |= 1;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i2 = i3 | 2;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i2 = i3 | 4;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i2 = i3 | 8;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, LongSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i2 = i3 | 16;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i2 = i3 | 32;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, LongSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i2 = i3 | 64;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i2 = i3 | 128;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, LongSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i2 = i3 | 256;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, LongSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i2 = i3 | 512;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i2 = i3 | 1024;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, LongSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i2 = i3 | 2048;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        i3 = i2;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, LongSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i3 |= 4096;
                        objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj2 = objDecodeNullableSerializableElement15;
            int i4 = i3;
            Object obj3 = objDecodeNullableSerializableElement17;
            Object obj4 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement3 = obj3;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement7 = obj2;
            obj = obj4;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement26;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new FirstUseInfoBean(i, (String) obj, (String) objDecodeNullableSerializableElement, (Long) objDecodeNullableSerializableElement7, (Long) objDecodeNullableSerializableElement12, (Long) objDecodeNullableSerializableElement6, (Long) objDecodeNullableSerializableElement11, (Long) objDecodeNullableSerializableElement5, (Boolean) objDecodeNullableSerializableElement10, (Long) objDecodeNullableSerializableElement4, (Long) objDecodeNullableSerializableElement9, (Boolean) objDecodeNullableSerializableElement2, (Long) objDecodeNullableSerializableElement8, (Long) objDecodeNullableSerializableElement3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull FirstUseInfoBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        FirstUseInfoBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
