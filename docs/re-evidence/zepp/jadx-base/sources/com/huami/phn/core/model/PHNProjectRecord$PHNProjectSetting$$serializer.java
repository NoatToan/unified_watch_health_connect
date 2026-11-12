package com.huami.phn.core.model;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/phn/core/model/PHNProjectRecord.PHNProjectSetting.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class PHNProjectRecord$PHNProjectSetting$$serializer implements GeneratedSerializer<PHNProjectRecord.PHNProjectSetting> {

    @NotNull
    public static final PHNProjectRecord$PHNProjectSetting$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PHNProjectRecord$PHNProjectSetting$$serializer pHNProjectRecord$PHNProjectSetting$$serializer = new PHNProjectRecord$PHNProjectSetting$$serializer();
        INSTANCE = pHNProjectRecord$PHNProjectSetting$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.phn.core.model.PHNProjectRecord.PHNProjectSetting", pHNProjectRecord$PHNProjectSetting$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.START_DATE, false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.END_DATE, true);
        pluginGeneratedSerialDescriptor.addElement("rest_days", false);
        pluginGeneratedSerialDescriptor.addElement("end_type", true);
        pluginGeneratedSerialDescriptor.addElement("end_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PHNProjectRecord$PHNProjectSetting$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer = PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer.INSTANCE;
        return new KSerializer[]{pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer, BuiltinSerializersKt.getNullable(pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer), IntArraySerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PHNProjectRecord.PHNProjectSetting deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        Object objDecodeSerializableElement2;
        String strDecodeStringElement;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer = PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer.INSTANCE;
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, pHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, IntArraySerializer.INSTANCE, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            i = 31;
        } else {
            Object objDecodeSerializableElement3 = null;
            Object objDecodeNullableSerializableElement2 = null;
            Object objDecodeSerializableElement4 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer.INSTANCE, objDecodeSerializableElement3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, PHNProjectRecord$PHNProjectSetting$TimeStampAndZone$$serializer.INSTANCE, objDecodeNullableSerializableElement2);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, IntArraySerializer.INSTANCE, objDecodeSerializableElement4);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                    i2 |= 16;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i2;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new PHNProjectRecord.PHNProjectSetting(i, (PHNProjectRecord.PHNProjectSetting.TimeStampAndZone) objDecodeSerializableElement, (PHNProjectRecord.PHNProjectSetting.TimeStampAndZone) objDecodeNullableSerializableElement, (int[]) objDecodeSerializableElement2, iDecodeIntElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PHNProjectRecord.PHNProjectSetting value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        PHNProjectRecord.PHNProjectSetting.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
