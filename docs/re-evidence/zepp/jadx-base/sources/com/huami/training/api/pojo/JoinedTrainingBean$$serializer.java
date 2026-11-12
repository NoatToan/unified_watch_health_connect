package com.huami.training.api.pojo;

import com.huami.ecg.core.db.entity.EcgData;
import com.huami.training.api.DifficultyBo;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.ks.DifficultyBoSerializer;
import com.huami.training.api.ks.GenderLongPairSerializer;
import com.huami.training.api.ks.GenderStringPairSerializer;
import com.huami.training.api.ks.IdNamePairSerializer;
import com.huami.training.api.ks.TrainingTypeBoSerializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/training/api/pojo/JoinedTrainingBean.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class JoinedTrainingBean$$serializer implements GeneratedSerializer<JoinedTrainingBean> {

    @NotNull
    public static final JoinedTrainingBean$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        JoinedTrainingBean$$serializer joinedTrainingBean$$serializer = new JoinedTrainingBean$$serializer();
        INSTANCE = joinedTrainingBean$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.training.api.pojo.JoinedTrainingBean", joinedTrainingBean$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("trainingType", true);
        pluginGeneratedSerialDescriptor.addElement("difficultyDegree", true);
        pluginGeneratedSerialDescriptor.addElement("listPageIllustrated", true);
        pluginGeneratedSerialDescriptor.addElement("location", true);
        pluginGeneratedSerialDescriptor.addElement("instrument", true);
        pluginGeneratedSerialDescriptor.addElement("time", false);
        pluginGeneratedSerialDescriptor.addElement("actionAmount", true);
        pluginGeneratedSerialDescriptor.addElement("finishedNumber", true);
        pluginGeneratedSerialDescriptor.addElement("expireAt", true);
        pluginGeneratedSerialDescriptor.addElement(EcgData.TIMESTAMP_SERVER_UPDATED, false);
        pluginGeneratedSerialDescriptor.addElement("lastTrainingTime", true);
        pluginGeneratedSerialDescriptor.addElement("squareIllustrated", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JoinedTrainingBean$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(new TrainingTypeBoSerializer()), BuiltinSerializersKt.getNullable(new DifficultyBoSerializer()), BuiltinSerializersKt.getNullable(new GenderStringPairSerializer()), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(new IdNamePairSerializer()), new GenderLongPairSerializer(), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(longSerializer), longSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(new GenderStringPairSerializer())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public JoinedTrainingBean deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        long jDecodeLongElement;
        int i;
        Object objDecodeNullableSerializableElement4;
        Object obj;
        Object obj2;
        Object obj3;
        long jDecodeLongElement2;
        String str;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new TrainingTypeBoSerializer(), null);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new DifficultyBoSerializer(), null);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new GenderStringPairSerializer(), null);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, new IdNamePairSerializer(), null);
            Object objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new GenderLongPairSerializer(), null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, intSerializer, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, intSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, longSerializer, null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 11);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, longSerializer, null);
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement5;
            obj = objDecodeNullableSerializableElement11;
            obj6 = objDecodeNullableSerializableElement10;
            jDecodeLongElement = jDecodeLongElement3;
            str = strDecodeStringElement2;
            obj2 = objDecodeNullableSerializableElement12;
            obj3 = objDecodeNullableSerializableElement9;
            obj7 = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, new GenderStringPairSerializer(), null);
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement8;
            obj5 = objDecodeNullableSerializableElement7;
            i = 16383;
            obj4 = objDecodeSerializableElement;
        } else {
            Object objDecodeNullableSerializableElement13 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeSerializableElement2 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            objDecodeNullableSerializableElement3 = null;
            long jDecodeLongElement4 = 0;
            jDecodeLongElement = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 0);
                        i2 |= 1;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        break;
                    case 2:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, new TrainingTypeBoSerializer(), objDecodeNullableSerializableElement3);
                        i2 |= 4;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new DifficultyBoSerializer(), objDecodeNullableSerializableElement13);
                        i2 |= 8;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new GenderStringPairSerializer(), objDecodeNullableSerializableElement19);
                        i2 |= 16;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i2 |= 32;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, new IdNamePairSerializer(), objDecodeNullableSerializableElement18);
                        i2 |= 64;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 7:
                        objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 7, new GenderLongPairSerializer(), objDecodeSerializableElement2);
                        i2 |= 128;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, IntSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i2 |= 256;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i2 |= 512;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, LongSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i2 |= 1024;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 11:
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 11);
                        i2 |= 2048;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, LongSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i2 |= 4096;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, new GenderStringPairSerializer(), objDecodeNullableSerializableElement);
                        i2 |= 8192;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str2 = strDecodeStringElement;
            i = i2;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement14;
            obj = objDecodeNullableSerializableElement15;
            obj2 = objDecodeNullableSerializableElement17;
            obj3 = objDecodeNullableSerializableElement18;
            jDecodeLongElement2 = jDecodeLongElement4;
            str = str2;
            obj4 = objDecodeSerializableElement2;
            obj5 = objDecodeNullableSerializableElement19;
            obj6 = objDecodeNullableSerializableElement16;
            obj7 = objDecodeNullableSerializableElement13;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new JoinedTrainingBean(i, jDecodeLongElement2, str, (TrainingTypeBo) objDecodeNullableSerializableElement3, (DifficultyBo) obj7, (GenderStringPair) obj5, (String) objDecodeNullableSerializableElement2, (IdNamePair) obj3, (GenderLongPair) obj4, (Integer) obj6, (Integer) obj, (Long) obj2, jDecodeLongElement, (Long) objDecodeNullableSerializableElement4, (GenderStringPair) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull JoinedTrainingBean value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        JoinedTrainingBean.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
