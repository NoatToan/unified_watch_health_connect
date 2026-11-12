package com.xiaomi.hm.health.healthdata.api.pojo;

import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/xiaomi/hm/health/healthdata/api/pojo/UserEventsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class UserEventsItem$$serializer implements GeneratedSerializer<UserEventsItem> {

    @NotNull
    public static final UserEventsItem$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        UserEventsItem$$serializer userEventsItem$$serializer = new UserEventsItem$$serializer();
        INSTANCE = userEventsItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.xiaomi.hm.health.healthdata.api.pojo.UserEventsItem", userEventsItem$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("eventType", true);
        pluginGeneratedSerialDescriptor.addElement("lastUpdateTime", true);
        pluginGeneratedSerialDescriptor.addElement("subType", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        pluginGeneratedSerialDescriptor.addElement("extra", true);
        pluginGeneratedSerialDescriptor.addElement("odiNum", true);
        pluginGeneratedSerialDescriptor.addElement(HMFwOnlineAnalyticsKt.COST, true);
        pluginGeneratedSerialDescriptor.addElement("odi", true);
        pluginGeneratedSerialDescriptor.addElement("deviceSource", true);
        pluginGeneratedSerialDescriptor.addElement("date", true);
        pluginGeneratedSerialDescriptor.addElement("valid", true);
        pluginGeneratedSerialDescriptor.addElement("deviceId", true);
        pluginGeneratedSerialDescriptor.addElement("sn", true);
        pluginGeneratedSerialDescriptor.addElement("appName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserEventsItem$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, longSerializer, stringSerializer, longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public UserEventsItem deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        String strDecodeStringElement;
        long jDecodeLongElement;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        String str2;
        Object obj4;
        Object objDecodeNullableSerializableElement5;
        long jDecodeLongElement2;
        int i;
        String str3;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, intSerializer, null);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, intSerializer, null);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, FloatSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, intSerializer, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, intSerializer, null);
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, stringSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 14);
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement9;
            obj3 = objDecodeNullableSerializableElement7;
            str2 = strDecodeStringElement5;
            obj2 = objDecodeNullableSerializableElement10;
            jDecodeLongElement = jDecodeLongElement3;
            str3 = strDecodeStringElement3;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement8;
            obj = objDecodeNullableSerializableElement11;
            i = 32767;
            obj4 = objDecodeNullableSerializableElement6;
            str = strDecodeStringElement4;
        } else {
            int i2 = 14;
            long jDecodeLongElement4 = 0;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            objDecodeNullableSerializableElement2 = null;
            objDecodeNullableSerializableElement3 = null;
            objDecodeNullableSerializableElement4 = null;
            Object objDecodeNullableSerializableElement18 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            strDecodeStringElement = null;
            jDecodeLongElement = 0;
            int i3 = 0;
            boolean z = true;
            while (true) {
                String str4 = strDecodeStringElement2;
                if (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                    switch (iDecodeElementIndex) {
                        case -1:
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            z = false;
                            break;
                        case 0:
                            i3 |= 1;
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                            i2 = 14;
                            break;
                        case 1:
                            i3 |= 2;
                            jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 1);
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 2:
                            strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
                            i3 |= 4;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 3:
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 3);
                            i3 |= 8;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 4:
                            strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                            i3 |= 16;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 5:
                            objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                            i3 |= 32;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 6:
                            objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                            i3 |= 64;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 7:
                            objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, IntSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                            i3 |= 128;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 8:
                            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, FloatSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                            i3 |= 256;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 9:
                            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                            i3 |= 512;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 10:
                            objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                            i3 |= 1024;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 11:
                            objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                            i3 |= 2048;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 12:
                            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                            i3 |= 4096;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 13:
                            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                            i3 |= 8192;
                            strDecodeStringElement2 = str4;
                            i2 = 14;
                            break;
                        case 14:
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, i2);
                            i3 |= 16384;
                            strDecodeStringElement2 = str4;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    obj = objDecodeNullableSerializableElement16;
                    obj2 = objDecodeNullableSerializableElement17;
                    obj3 = objDecodeNullableSerializableElement18;
                    str = strDecodeStringElement6;
                    str2 = strDecodeStringElement7;
                    obj4 = objDecodeNullableSerializableElement14;
                    objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement15;
                    jDecodeLongElement2 = jDecodeLongElement4;
                    i = i3;
                    str3 = str4;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new UserEventsItem(i, str3, jDecodeLongElement2, str, jDecodeLongElement, str2, (String) obj4, (Integer) objDecodeNullableSerializableElement5, (Integer) obj3, (Float) objDecodeNullableSerializableElement2, (Integer) objDecodeNullableSerializableElement4, (String) obj2, (Integer) obj, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement3, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull UserEventsItem value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        UserEventsItem.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
