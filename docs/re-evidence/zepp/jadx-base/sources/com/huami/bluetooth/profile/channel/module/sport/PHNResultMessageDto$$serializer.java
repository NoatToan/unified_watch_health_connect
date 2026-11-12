package com.huami.bluetooth.profile.channel.module.sport;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/bluetooth/profile/channel/module/sport/PHNResultMessageDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNResultMessageDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class PHNResultMessageDto$$serializer implements GeneratedSerializer<PHNResultMessageDto> {

    @NotNull
    public static final PHNResultMessageDto$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PHNResultMessageDto$$serializer pHNResultMessageDto$$serializer = new PHNResultMessageDto$$serializer();
        INSTANCE = pHNResultMessageDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.bluetooth.profile.channel.module.sport.PHNResultMessageDto", pHNResultMessageDto$$serializer, 25);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("daily_trimp_scores", true);
        pluginGeneratedSerialDescriptor.addElement("minutes_over_20m", true);
        pluginGeneratedSerialDescriptor.addElement("trimp_42_days", true);
        pluginGeneratedSerialDescriptor.addElement("atl_42_days", true);
        pluginGeneratedSerialDescriptor.addElement("ctl_42_days", true);
        pluginGeneratedSerialDescriptor.addElement("tsb_42_days", true);
        pluginGeneratedSerialDescriptor.addElement("current_weekday", true);
        pluginGeneratedSerialDescriptor.addElement("flag_tsb_below_20_in_a_week", true);
        pluginGeneratedSerialDescriptor.addElement("flag_tsb_below_20_in_10_days", true);
        pluginGeneratedSerialDescriptor.addElement("flag_tsb_below_20_ever", true);
        pluginGeneratedSerialDescriptor.addElement("flag_historical_trimp", true);
        pluginGeneratedSerialDescriptor.addElement("thelast_historical_trimp_ctl", true);
        pluginGeneratedSerialDescriptor.addElement("thelast_trimp_ctl_last_week", true);
        pluginGeneratedSerialDescriptor.addElement("thelast_trimp_ctl_a_week_before_last_week", true);
        pluginGeneratedSerialDescriptor.addElement("count_daily_exercise", true);
        pluginGeneratedSerialDescriptor.addElement("trimp_weekly_recommend", true);
        pluginGeneratedSerialDescriptor.addElement("trimp_daily_max", true);
        pluginGeneratedSerialDescriptor.addElement("trimp_daily_recommended", true);
        pluginGeneratedSerialDescriptor.addElement("trimp_week_completed", true);
        pluginGeneratedSerialDescriptor.addElement("percent_completed_week_trimp", true);
        pluginGeneratedSerialDescriptor.addElement("percent_completed_daily_trimp", true);
        pluginGeneratedSerialDescriptor.addElement("exercise_recommended_info", true);
        pluginGeneratedSerialDescriptor.addElement("last_update_time", true);
        pluginGeneratedSerialDescriptor.addElement("last_update_time_zone", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PHNResultMessageDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(new ArrayListSerializer(intSerializer)), BuiltinSerializersKt.getNullable(new ArrayListSerializer(floatSerializer)), BuiltinSerializersKt.getNullable(new ArrayListSerializer(floatSerializer)), BuiltinSerializersKt.getNullable(new ArrayListSerializer(floatSerializer)), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(PHNExerciseInfoMessageDto$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PHNResultMessageDto deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object obj;
        Object obj2;
        Object obj3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object obj4;
        int i;
        Object objDecodeNullableSerializableElement13;
        Object obj5;
        Object objDecodeNullableSerializableElement14;
        Object obj6;
        Object objDecodeNullableSerializableElement15;
        Object objDecodeNullableSerializableElement16;
        Object objDecodeNullableSerializableElement17;
        Object objDecodeNullableSerializableElement18;
        Object objDecodeNullableSerializableElement19;
        int i2;
        int i3;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement20 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, intSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, intSerializer, null);
            objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new ArrayListSerializer(intSerializer), null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(floatSerializer), null);
            Object objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, new ArrayListSerializer(floatSerializer), null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, new ArrayListSerializer(floatSerializer), null);
            Object objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, intSerializer, null);
            Object objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, intSerializer, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, intSerializer, null);
            Object objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, intSerializer, null);
            objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, intSerializer, null);
            objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, floatSerializer, null);
            objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, floatSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, floatSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, intSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, floatSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, floatSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, floatSerializer, null);
            Object objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, floatSerializer, null);
            objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, intSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, intSerializer, null);
            Object objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 22, PHNExerciseInfoMessageDto$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 23, intSerializer, null);
            Object objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 24, intSerializer, null);
            obj3 = objDecodeNullableSerializableElement24;
            obj2 = objDecodeNullableSerializableElement23;
            obj4 = objDecodeNullableSerializableElement25;
            obj = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement27;
            i = 33554431;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement29;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement28;
            obj5 = objDecodeNullableSerializableElement21;
            obj6 = objDecodeNullableSerializableElement26;
        } else {
            Object objDecodeNullableSerializableElement30 = null;
            Object objDecodeNullableSerializableElement31 = null;
            Object objDecodeNullableSerializableElement32 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object objDecodeNullableSerializableElement34 = null;
            Object objDecodeNullableSerializableElement35 = null;
            Object objDecodeNullableSerializableElement36 = null;
            Object objDecodeNullableSerializableElement37 = null;
            Object objDecodeNullableSerializableElement38 = null;
            objDecodeNullableSerializableElement2 = null;
            objDecodeNullableSerializableElement3 = null;
            Object objDecodeNullableSerializableElement39 = null;
            Object objDecodeNullableSerializableElement40 = null;
            Object objDecodeNullableSerializableElement41 = null;
            Object objDecodeNullableSerializableElement42 = null;
            Object objDecodeNullableSerializableElement43 = null;
            Object objDecodeNullableSerializableElement44 = null;
            Object objDecodeNullableSerializableElement45 = null;
            Object objDecodeNullableSerializableElement46 = null;
            Object objDecodeNullableSerializableElement47 = null;
            Object objDecodeNullableSerializableElement48 = null;
            Object objDecodeNullableSerializableElement49 = null;
            Object objDecodeNullableSerializableElement50 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                Object obj7 = objDecodeNullableSerializableElement38;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement38 = obj7;
                        z = false;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement39 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement39);
                        i4 |= 1;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement40 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement40);
                        i4 |= 2;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement41 = objDecodeNullableSerializableElement41;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement41 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, objDecodeNullableSerializableElement41);
                        i4 |= 4;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement42 = objDecodeNullableSerializableElement42;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement42 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new ArrayListSerializer(IntSerializer.INSTANCE), objDecodeNullableSerializableElement42);
                        i4 |= 8;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement43 = objDecodeNullableSerializableElement43;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement43 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(FloatSerializer.INSTANCE), objDecodeNullableSerializableElement43);
                        i4 |= 16;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement44 = objDecodeNullableSerializableElement44;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement44 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, new ArrayListSerializer(FloatSerializer.INSTANCE), objDecodeNullableSerializableElement44);
                        i4 |= 32;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement45 = objDecodeNullableSerializableElement45;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement45 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, new ArrayListSerializer(FloatSerializer.INSTANCE), objDecodeNullableSerializableElement45);
                        i4 |= 64;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement46 = objDecodeNullableSerializableElement46;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement46 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, IntSerializer.INSTANCE, objDecodeNullableSerializableElement46);
                        i4 |= 128;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement47 = objDecodeNullableSerializableElement47;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement47 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, IntSerializer.INSTANCE, objDecodeNullableSerializableElement47);
                        i4 |= 256;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement48 = objDecodeNullableSerializableElement48;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement48 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, objDecodeNullableSerializableElement48);
                        i4 |= 512;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement49 = objDecodeNullableSerializableElement49;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement49 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, IntSerializer.INSTANCE, objDecodeNullableSerializableElement49);
                        i4 |= 1024;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement50 = objDecodeNullableSerializableElement50;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement50 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, objDecodeNullableSerializableElement50);
                        i4 |= 2048;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement38 = obj7;
                        break;
                    case 12:
                        i4 |= 4096;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement38 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, FloatSerializer.INSTANCE, obj7);
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i4 |= 8192;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement38 = obj7;
                        break;
                    case 14:
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        objDecodeNullableSerializableElement36 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement36);
                        i4 |= 16384;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 15:
                        objDecodeNullableSerializableElement37 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, IntSerializer.INSTANCE, objDecodeNullableSerializableElement37);
                        i2 = 32768;
                        i4 |= i2;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 16:
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement34);
                        i2 = 65536;
                        i4 |= i2;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 17:
                        objDecodeNullableSerializableElement35 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement35);
                        i2 = 131072;
                        i4 |= i2;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 18:
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 18, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i2 = 262144;
                        i4 |= i2;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 19:
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 19, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i2 = 524288;
                        i4 |= i2;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 20:
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 20, IntSerializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i3 = 1048576;
                        i4 |= i3;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 21:
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 21, IntSerializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i3 = 2097152;
                        i4 |= i3;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 22:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 22, PHNExerciseInfoMessageDto$$serializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i3 = 4194304;
                        i4 |= i3;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 23:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 23, IntSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i3 = 8388608;
                        i4 |= i3;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    case 24:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 24, IntSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i3 = 16777216;
                        i4 |= i3;
                        objDecodeNullableSerializableElement38 = obj7;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj8 = objDecodeNullableSerializableElement38;
            obj = objDecodeNullableSerializableElement44;
            obj2 = objDecodeNullableSerializableElement46;
            obj3 = objDecodeNullableSerializableElement47;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement30;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement33;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement34;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement35;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement36;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement37;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement41;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement45;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement48;
            obj4 = objDecodeNullableSerializableElement49;
            i = i4;
            objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement40;
            obj5 = objDecodeNullableSerializableElement39;
            objDecodeNullableSerializableElement14 = objDecodeNullableSerializableElement32;
            obj6 = objDecodeNullableSerializableElement31;
            objDecodeNullableSerializableElement15 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement16 = obj8;
            objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement50;
            objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement42;
            objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement43;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new PHNResultMessageDto(i, (String) obj5, (Integer) objDecodeNullableSerializableElement13, (Integer) objDecodeNullableSerializableElement10, (List) objDecodeNullableSerializableElement18, (List) objDecodeNullableSerializableElement19, (List) obj, (List) objDecodeNullableSerializableElement11, (Integer) obj2, (Integer) obj3, (Integer) objDecodeNullableSerializableElement12, (Integer) obj4, (Integer) objDecodeNullableSerializableElement17, (Float) objDecodeNullableSerializableElement16, (Float) objDecodeNullableSerializableElement15, (Float) objDecodeNullableSerializableElement8, (Integer) objDecodeNullableSerializableElement9, (Float) objDecodeNullableSerializableElement6, (Float) objDecodeNullableSerializableElement7, (Float) objDecodeNullableSerializableElement5, (Float) obj6, (Integer) objDecodeNullableSerializableElement14, (Integer) objDecodeNullableSerializableElement4, (PHNExerciseInfoMessageDto) objDecodeNullableSerializableElement3, (Integer) objDecodeNullableSerializableElement2, (Integer) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PHNResultMessageDto value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        PHNResultMessageDto.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
