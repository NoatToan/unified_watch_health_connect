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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/femalehealth/logiclib/api/pojo/BaseSettingBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class BaseSettingBean$$serializer implements GeneratedSerializer<BaseSettingBean> {

    @NotNull
    public static final BaseSettingBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        BaseSettingBean$$serializer baseSettingBean$$serializer = new BaseSettingBean$$serializer();
        INSTANCE = baseSettingBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.femalehealth.logiclib.api.pojo.BaseSettingBean", baseSettingBean$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("appBeforeMenstruationPush", true);
        pluginGeneratedSerialDescriptor.addElement("appBeforeOvulationPush", true);
        pluginGeneratedSerialDescriptor.addElement("appPush", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedMenstrualDays", true);
        pluginGeneratedSerialDescriptor.addElement("firstTime", true);
        pluginGeneratedSerialDescriptor.addElement("hardwareBeforeMenstruationPush", true);
        pluginGeneratedSerialDescriptor.addElement("hardwareBeforeOvulationPush", true);
        pluginGeneratedSerialDescriptor.addElement("hardwarePush", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("intelligentPrediction", true);
        pluginGeneratedSerialDescriptor.addElement("lastMenstrualTime", true);
        pluginGeneratedSerialDescriptor.addElement("menstrualCycle", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BaseSettingBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public BaseSettingBean deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object obj;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        int i;
        Object obj2;
        Object objDecodeNullableSerializableElement11;
        int i2;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, longSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, longSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, booleanSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, longSerializer, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, longSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, longSerializer, null);
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, longSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, longSerializer, null);
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, longSerializer, null);
            Object objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement17;
            obj = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement14;
            obj2 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement16;
            i = 8191;
        } else {
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            objDecodeNullableSerializableElement3 = null;
            objDecodeNullableSerializableElement4 = null;
            objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement26 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = i3;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        z = false;
                        i3 = i2;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, LongSerializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i2 = i3 | 1;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        i3 = i2;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, LongSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i2 = i3 | 2;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i2 = i3 | 4;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, LongSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i2 = i3 | 8;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, LongSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i2 = i3 | 16;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i2 = i3 | 32;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, LongSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i2 = i3 | 64;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i2 = i3 | 128;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i2 = i3 | 256;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, LongSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i2 = i3 | 512;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, LongSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i2 = i3 | 1024;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i2 = i3 | 2048;
                        objDecodeNullableSerializableElement21 = objDecodeNullableSerializableElement21;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        i3 = i2;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i3 |= 4096;
                        objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj3 = objDecodeNullableSerializableElement20;
            int i4 = i3;
            Object obj4 = objDecodeNullableSerializableElement21;
            obj = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement9 = obj4;
            objDecodeNullableSerializableElement10 = obj3;
            Object obj5 = objDecodeNullableSerializableElement22;
            i = i4;
            obj2 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement11 = obj5;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new BaseSettingBean(i, (Long) obj, (Long) objDecodeNullableSerializableElement10, (Boolean) objDecodeNullableSerializableElement5, (Long) objDecodeNullableSerializableElement8, (Long) objDecodeNullableSerializableElement4, (Long) objDecodeNullableSerializableElement7, (Long) objDecodeNullableSerializableElement3, (Boolean) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement11, (Long) objDecodeNullableSerializableElement2, (Long) obj2, (Integer) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement9, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull BaseSettingBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        BaseSettingBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
