package com.huami.message.api.pojo;

import com.huami.message.api.WebConst;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/message/api/pojo/NotificationBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/message/api/pojo/NotificationBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class NotificationBean$$serializer implements GeneratedSerializer<NotificationBean> {

    @NotNull
    public static final NotificationBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        NotificationBean$$serializer notificationBean$$serializer = new NotificationBean$$serializer();
        INSTANCE = notificationBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.message.api.pojo.NotificationBean", notificationBean$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement(WebConst.QueryParam.MESSAGE_ID, true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("generateTime", true);
        pluginGeneratedSerialDescriptor.addElement("typeName", true);
        pluginGeneratedSerialDescriptor.addElement("subTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("jumpType", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("pushUrl", true);
        pluginGeneratedSerialDescriptor.addElement("groupExType", true);
        pluginGeneratedSerialDescriptor.addElement(WebConst.QueryParam.NOTICE_TYPE, true);
        pluginGeneratedSerialDescriptor.addElement("subType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NotificationBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public NotificationBean deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        long jDecodeLongElement;
        Object obj;
        Object objDecodeNullableSerializableElement3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        Object obj8;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, stringSerializer, null);
            obj6 = objDecodeNullableSerializableElement11;
            obj = objDecodeNullableSerializableElement6;
            obj5 = objDecodeNullableSerializableElement15;
            jDecodeLongElement = jDecodeLongElement2;
            obj3 = objDecodeNullableSerializableElement12;
            obj7 = objDecodeNullableSerializableElement10;
            obj4 = objDecodeNullableSerializableElement8;
            obj2 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement13;
            obj8 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement14;
            i = 16383;
        } else {
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            jDecodeLongElement = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                Object obj9 = objDecodeNullableSerializableElement16;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        z = false;
                        break;
                    case 0:
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
                        i2 |= 1;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, obj9);
                        i2 |= 2;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i2 |= 4;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement16 = obj9;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i2 |= 8;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i2 |= 16;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i2 |= 32;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i2 |= 64;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i2 |= 128;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i2 |= 256;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i2 |= 512;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i2 |= 1024;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i2 |= 2048;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i2 |= 4096;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i2 |= 8192;
                        objDecodeNullableSerializableElement16 = obj9;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            obj = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement16;
            obj2 = objDecodeNullableSerializableElement22;
            obj3 = objDecodeNullableSerializableElement23;
            obj4 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement26;
            obj5 = objDecodeNullableSerializableElement18;
            i = i2;
            obj6 = objDecodeNullableSerializableElement19;
            obj7 = objDecodeNullableSerializableElement20;
            obj8 = objDecodeNullableSerializableElement21;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new NotificationBean(i, jDecodeLongElement, (String) objDecodeNullableSerializableElement3, (String) obj, (String) objDecodeNullableSerializableElement4, (String) obj2, (Long) obj4, (String) obj8, (String) obj7, (String) obj6, (String) obj3, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, (String) obj5, (String) objDecodeNullableSerializableElement5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull NotificationBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        NotificationBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
