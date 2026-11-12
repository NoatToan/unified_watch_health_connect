package com.xiaomi.hm.health.healthdata.api.pojo;

import com.google.firebase.remoteconfig.internal.Personalization;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/xiaomi/hm/health/healthdata/api/pojo/HealthDataBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class HealthDataBean$$serializer implements GeneratedSerializer<HealthDataBean> {

    @NotNull
    public static final HealthDataBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        HealthDataBean$$serializer healthDataBean$$serializer = new HealthDataBean$$serializer();
        INSTANCE = healthDataBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.xiaomi.hm.health.healthdata.api.pojo.HealthDataBean", healthDataBean$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("eventType", true);
        pluginGeneratedSerialDescriptor.addElement("subType", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        pluginGeneratedSerialDescriptor.addElement("chest_value", true);
        pluginGeneratedSerialDescriptor.addElement("waist_value", true);
        pluginGeneratedSerialDescriptor.addElement("hip_value", true);
        pluginGeneratedSerialDescriptor.addElement(Personalization.EXTERNAL_ARM_VALUE_PARAM, true);
        pluginGeneratedSerialDescriptor.addElement("thigh_value", true);
        pluginGeneratedSerialDescriptor.addElement("calf_value", true);
        pluginGeneratedSerialDescriptor.addElement("body_fat_value", true);
        pluginGeneratedSerialDescriptor.addElement("bmi_value", true);
        pluginGeneratedSerialDescriptor.addElement("muscle_value", true);
        pluginGeneratedSerialDescriptor.addElement("water_value", true);
        pluginGeneratedSerialDescriptor.addElement("protein_value", true);
        pluginGeneratedSerialDescriptor.addElement("basal_metabolism_value", true);
        pluginGeneratedSerialDescriptor.addElement("visceral_fat_value", true);
        pluginGeneratedSerialDescriptor.addElement("bone_value", true);
        pluginGeneratedSerialDescriptor.addElement("temperature_value", true);
        pluginGeneratedSerialDescriptor.addElement("blood_sugar_value", true);
        pluginGeneratedSerialDescriptor.addElement("blood_pressure_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HealthDataBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), LongSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public HealthDataBean deserialize(@NotNull Decoder decoder) {
        long jDecodeLongElement;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object objDecodeNullableSerializableElement;
        Object obj8;
        String str;
        String str2;
        Object obj9;
        int i;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
            Object objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            Object objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, stringSerializer, null);
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, stringSerializer, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, stringSerializer, null);
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, stringSerializer, null);
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, stringSerializer, null);
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, stringSerializer, null);
            obj9 = objDecodeNullableSerializableElement2;
            str2 = strDecodeStringElement2;
            obj13 = objDecodeNullableSerializableElement3;
            obj = objDecodeNullableSerializableElement7;
            obj8 = objDecodeNullableSerializableElement17;
            obj17 = objDecodeNullableSerializableElement16;
            obj15 = objDecodeNullableSerializableElement15;
            obj2 = objDecodeNullableSerializableElement14;
            jDecodeLongElement = jDecodeLongElement2;
            obj16 = objDecodeNullableSerializableElement6;
            obj10 = objDecodeNullableSerializableElement11;
            i = 2097151;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, stringSerializer, null);
            obj12 = objDecodeNullableSerializableElement4;
            obj4 = objDecodeNullableSerializableElement13;
            obj7 = objDecodeNullableSerializableElement8;
            obj11 = objDecodeNullableSerializableElement5;
            obj14 = objDecodeNullableSerializableElement18;
            obj5 = objDecodeNullableSerializableElement12;
            obj6 = objDecodeNullableSerializableElement9;
            obj3 = objDecodeNullableSerializableElement10;
            str = strDecodeStringElement;
        } else {
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            Object objDecodeNullableSerializableElement30 = null;
            Object objDecodeNullableSerializableElement31 = null;
            Object objDecodeNullableSerializableElement32 = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object objDecodeNullableSerializableElement34 = null;
            Object objDecodeNullableSerializableElement35 = null;
            Object objDecodeNullableSerializableElement36 = null;
            jDecodeLongElement = 0;
            boolean z = true;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i2 = 0;
            while (z) {
                Object obj18 = objDecodeNullableSerializableElement25;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        z = false;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement25 = obj18;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 |= 1;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj18);
                        i2 |= 2;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 2:
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 2);
                        i2 |= 4;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        break;
                    case 3:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 3);
                        i2 |= 8;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        break;
                    case 4:
                        i2 |= 16;
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement32 = objDecodeNullableSerializableElement32;
                        objDecodeNullableSerializableElement25 = obj18;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i2 |= 32;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i2 |= 64;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i2 |= 128;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i2 |= 256;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i2 |= 512;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i2 |= 1024;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i2 |= 2048;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i2 |= 4096;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i2 |= 8192;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 14:
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, StringSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i2 |= 16384;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 15:
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i2 |= 32768;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement33 = objDecodeNullableSerializableElement33;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 16:
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i2 |= 65536;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement34 = objDecodeNullableSerializableElement34;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 17:
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, StringSerializer.INSTANCE, objDecodeNullableSerializableElement34);
                        i2 |= 131072;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement35 = objDecodeNullableSerializableElement35;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 18:
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement35 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, StringSerializer.INSTANCE, objDecodeNullableSerializableElement35);
                        i2 |= 262144;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 19:
                        objDecodeNullableSerializableElement36 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, StringSerializer.INSTANCE, objDecodeNullableSerializableElement36);
                        i2 |= 524288;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    case 20:
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i2 |= 1048576;
                        objDecodeNullableSerializableElement25 = obj18;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            obj = objDecodeNullableSerializableElement20;
            Object obj19 = objDecodeNullableSerializableElement26;
            obj2 = objDecodeNullableSerializableElement32;
            Object obj20 = objDecodeNullableSerializableElement19;
            obj3 = objDecodeNullableSerializableElement23;
            obj4 = objDecodeNullableSerializableElement27;
            obj5 = objDecodeNullableSerializableElement28;
            obj6 = objDecodeNullableSerializableElement30;
            obj7 = objDecodeNullableSerializableElement31;
            objDecodeNullableSerializableElement = obj19;
            obj8 = objDecodeNullableSerializableElement35;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            obj9 = objDecodeNullableSerializableElement25;
            i = i2;
            obj10 = objDecodeNullableSerializableElement29;
            obj11 = objDecodeNullableSerializableElement21;
            obj12 = objDecodeNullableSerializableElement24;
            obj13 = obj20;
            obj14 = objDecodeNullableSerializableElement36;
            obj15 = objDecodeNullableSerializableElement33;
            obj16 = objDecodeNullableSerializableElement22;
            obj17 = objDecodeNullableSerializableElement34;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new HealthDataBean(i, str, (String) obj9, jDecodeLongElement, str2, (String) obj13, (String) obj12, (String) obj11, (String) obj16, (String) obj, (String) obj7, (String) obj6, (String) obj3, (String) obj10, (String) obj5, (String) obj4, (String) obj2, (String) obj15, (String) obj17, (String) obj8, (String) obj14, (String) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull HealthDataBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        HealthDataBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
