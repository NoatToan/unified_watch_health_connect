package com.huami.training.api.pojo;

import com.huami.training.api.PlanDifficultyBo;
import com.huami.training.api.PlanTypeBo;
import com.huami.training.api.ks.PlanDifficultyBoSerializer;
import com.huami.training.api.ks.PlanTypeBoSerializer;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/training/api/pojo/TrainingPlanBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/training/api/pojo/TrainingPlanBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class TrainingPlanBean$$serializer implements GeneratedSerializer<TrainingPlanBean> {

    @NotNull
    public static final TrainingPlanBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TrainingPlanBean$$serializer trainingPlanBean$$serializer = new TrainingPlanBean$$serializer();
        INSTANCE = trainingPlanBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.training.api.pojo.TrainingPlanBean", trainingPlanBean$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("trainingPlanId", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("listPageIllustrated", true);
        pluginGeneratedSerialDescriptor.addElement("detailsPageIllustrated", true);
        pluginGeneratedSerialDescriptor.addElement("consumption", false);
        pluginGeneratedSerialDescriptor.addElement("introduction", true);
        pluginGeneratedSerialDescriptor.addElement("trainingType", false);
        pluginGeneratedSerialDescriptor.addElement("difficultyDegree", false);
        pluginGeneratedSerialDescriptor.addElement("startDay", false);
        pluginGeneratedSerialDescriptor.addElement("time", false);
        pluginGeneratedSerialDescriptor.addElement("totalDays", false);
        pluginGeneratedSerialDescriptor.addElement("trainingDays", false);
        pluginGeneratedSerialDescriptor.addElement("dayTrainingItems", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrainingPlanBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), new PlanTypeBoSerializer(), new PlanDifficultyBoSerializer(), stringSerializer, longSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(new ArrayListSerializer(PlanTrainingBean$$serializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public TrainingPlanBean deserialize(@NotNull Decoder decoder) {
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        long jDecodeLongElement;
        Object objDecodeSerializableElement2;
        Object obj;
        Object objDecodeNullableSerializableElement2;
        String str;
        int i;
        long j;
        String str2;
        Object objDecodeNullableSerializableElement3;
        int i2;
        int i3;
        int i4;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i5 = 11;
        int i6 = 8;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            Object objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            Object objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new PlanTypeBoSerializer(), null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new PlanDifficultyBoSerializer(), null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 8);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 9);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 11);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, new ArrayListSerializer(PlanTrainingBean$$serializer.INSTANCE), null);
            i3 = iDecodeIntElement3;
            i4 = iDecodeIntElement2;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement4;
            str = strDecodeStringElement3;
            jDecodeLongElement = jDecodeLongElement2;
            j = jDecodeLongElement3;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            i = iDecodeIntElement;
            str2 = strDecodeStringElement2;
            obj = objDecodeNullableSerializableElement5;
            i2 = 8191;
        } else {
            int i7 = 12;
            Object objDecodeNullableSerializableElement6 = null;
            objDecodeSerializableElement = null;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeNullableSerializableElement7 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement8 = null;
            String strDecodeStringElement4 = null;
            jDecodeLongElement = 0;
            long jDecodeLongElement4 = 0;
            int i8 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i7 = 12;
                        z = false;
                        break;
                    case 0:
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
                        i8 |= 1;
                        i7 = 12;
                        i5 = 11;
                        break;
                    case 1:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i8 |= 2;
                        i7 = 12;
                        i5 = 11;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i8 |= 4;
                        i7 = 12;
                        i5 = 11;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i8 |= 8;
                        i7 = 12;
                        i5 = 11;
                        break;
                    case 4:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 4);
                        i8 |= 16;
                        i7 = 12;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i8 |= 32;
                        i7 = 12;
                        break;
                    case 6:
                        objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 6, new PlanTypeBoSerializer(), objDecodeSerializableElement);
                        i8 |= 64;
                        i7 = 12;
                        break;
                    case 7:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new PlanDifficultyBoSerializer(), objDecodeSerializableElement4);
                        i8 |= 128;
                        i7 = 12;
                        break;
                    case 8:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, i6);
                        i8 |= 256;
                        break;
                    case 9:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 9);
                        i8 |= 512;
                        i6 = 8;
                        break;
                    case 10:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 10);
                        i8 |= 1024;
                        i6 = 8;
                        break;
                    case 11:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, i5);
                        i8 |= 2048;
                        i6 = 8;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i7, new ArrayListSerializer(PlanTrainingBean$$serializer.INSTANCE), objDecodeNullableSerializableElement6);
                        i8 |= 4096;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            obj = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement8;
            str = strDecodeStringElement4;
            i = iDecodeIntElement6;
            j = jDecodeLongElement4;
            str2 = strDecodeStringElement;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement6;
            i2 = i8;
            int i9 = iDecodeIntElement5;
            i3 = iDecodeIntElement4;
            i4 = i9;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new TrainingPlanBean(i2, jDecodeLongElement, str2, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, i, (String) obj, (PlanTypeBo) objDecodeSerializableElement, (PlanDifficultyBo) objDecodeSerializableElement2, str, j, i4, i3, (List) objDecodeNullableSerializableElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull TrainingPlanBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        TrainingPlanBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
