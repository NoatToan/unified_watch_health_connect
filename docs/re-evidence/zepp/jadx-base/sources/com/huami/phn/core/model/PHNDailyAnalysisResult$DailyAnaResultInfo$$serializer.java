package com.huami.phn.core.model;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/phn/core/model/PHNDailyAnalysisResult.DailyAnaResultInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult$DailyAnaResultInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer implements GeneratedSerializer<PHNDailyAnalysisResult.DailyAnaResultInfo> {

    @NotNull
    public static final PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer pHNDailyAnalysisResult$DailyAnaResultInfo$$serializer = new PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer();
        INSTANCE = pHNDailyAnalysisResult$DailyAnaResultInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.phn.core.model.PHNDailyAnalysisResult.DailyAnaResultInfo", pHNDailyAnalysisResult$DailyAnaResultInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("trimp", true);
        pluginGeneratedSerialDescriptor.addElement("atl", true);
        pluginGeneratedSerialDescriptor.addElement("ctl", true);
        pluginGeneratedSerialDescriptor.addElement("tsb", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PHNDailyAnalysisResult$DailyAnaResultInfo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, floatSerializer, floatSerializer, floatSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PHNDailyAnalysisResult.DailyAnaResultInfo deserialize(@NotNull Decoder decoder) {
        int i;
        float fDecodeFloatElement;
        float f;
        float f2;
        int i2;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
            i = iDecodeIntElement;
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            f = fDecodeFloatElement3;
            f2 = fDecodeFloatElement2;
            i2 = 15;
        } else {
            int iDecodeIntElement2 = 0;
            float fDecodeFloatElement4 = 0.0f;
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 2);
                    i3 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                    i3 |= 8;
                }
            }
            i = iDecodeIntElement2;
            fDecodeFloatElement = fDecodeFloatElement4;
            f = fDecodeFloatElement5;
            f2 = fDecodeFloatElement6;
            i2 = i3;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new PHNDailyAnalysisResult.DailyAnaResultInfo(i2, i, f2, f, fDecodeFloatElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PHNDailyAnalysisResult.DailyAnaResultInfo value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        PHNDailyAnalysisResult.DailyAnaResultInfo.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
