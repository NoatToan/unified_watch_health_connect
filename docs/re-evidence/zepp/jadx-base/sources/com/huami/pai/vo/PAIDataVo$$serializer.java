package com.huami.pai.vo;

import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.xiaomi.hm.health.Constant;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/huami/pai/vo/PAIDataVo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/huami/pai/vo/PAIDataVo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class PAIDataVo$$serializer implements GeneratedSerializer<PAIDataVo> {

    @NotNull
    public static final PAIDataVo$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PAIDataVo$$serializer pAIDataVo$$serializer = new PAIDataVo$$serializer();
        INSTANCE = pAIDataVo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.pai.vo.PAIDataVo", pAIDataVo$$serializer, 30);
        pluginGeneratedSerialDescriptor.addElement("date", false);
        pluginGeneratedSerialDescriptor.addElement("activityScores", true);
        pluginGeneratedSerialDescriptor.addElement("nextActivityScores", true);
        pluginGeneratedSerialDescriptor.addElement("lowZonePai", true);
        pluginGeneratedSerialDescriptor.addElement("mediumZonePai", true);
        pluginGeneratedSerialDescriptor.addElement("highZonePai", true);
        pluginGeneratedSerialDescriptor.addElement("lowZoneMinutes", true);
        pluginGeneratedSerialDescriptor.addElement("mediumZoneMinutes", true);
        pluginGeneratedSerialDescriptor.addElement("highZoneMinutes", true);
        pluginGeneratedSerialDescriptor.addElement("dailyPai", true);
        pluginGeneratedSerialDescriptor.addElement("totalPai", true);
        pluginGeneratedSerialDescriptor.addElement("age", true);
        pluginGeneratedSerialDescriptor.addElement("gender", true);
        pluginGeneratedSerialDescriptor.addElement("lowZoneLowerLimit", true);
        pluginGeneratedSerialDescriptor.addElement("mediumZoneLowerLimit", true);
        pluginGeneratedSerialDescriptor.addElement("highZoneLowerLimit", true);
        pluginGeneratedSerialDescriptor.addElement(Constant.PAI_KEY_RHR, true);
        pluginGeneratedSerialDescriptor.addElement(Constant.PAI_KEY_MAX_HR, true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("time", true);
        pluginGeneratedSerialDescriptor.addElement("timeZone", true);
        pluginGeneratedSerialDescriptor.addElement("index", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("uploadTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("deviceSource", true);
        pluginGeneratedSerialDescriptor.addElement("deviceId", true);
        pluginGeneratedSerialDescriptor.addElement("sn", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        pluginGeneratedSerialDescriptor.addElement("eventType", true);
        pluginGeneratedSerialDescriptor.addElement("subType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PAIDataVo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, floatSerializer, floatSerializer, floatSerializer, intSerializer, intSerializer, intSerializer, floatSerializer, floatSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, longSerializer, longSerializer, longSerializer, intSerializer, intSerializer, longSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PAIDataVo deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        float f;
        int i2;
        String str2;
        String str3;
        float f2;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        float fDecodeFloatElement;
        long j;
        int i6;
        int i7;
        int i8;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement;
        long j2;
        long j3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str7;
        long j4;
        int i15;
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i16 = 4;
        int i17 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 4);
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
            float fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 9);
            float fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 10);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 11);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 13);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
            int iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 15);
            int iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 16);
            int iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 17);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 18);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 19);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 20);
            int iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 21);
            int iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 22);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 23);
            int iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 24);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 25);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 26);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 27);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 28);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 29);
            j = jDecodeLongElement4;
            i8 = iDecodeIntElement13;
            str7 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            i6 = iDecodeIntElement11;
            j2 = jDecodeLongElement2;
            j3 = jDecodeLongElement3;
            i7 = iDecodeIntElement12;
            i10 = iDecodeIntElement10;
            i9 = iDecodeIntElement9;
            i12 = iDecodeIntElement8;
            i11 = iDecodeIntElement7;
            j4 = jDecodeLongElement;
            i2 = iDecodeIntElement3;
            i13 = iDecodeIntElement5;
            f3 = fDecodeFloatElement5;
            f4 = fDecodeFloatElement4;
            i4 = iDecodeIntElement2;
            i14 = iDecodeIntElement6;
            i = LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            f2 = fDecodeFloatElement2;
            i5 = iDecodeIntElement;
            f = fDecodeFloatElement3;
            i3 = iDecodeIntElement4;
            str = strDecodeStringElement2;
        } else {
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            String str8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            int iDecodeIntElement14 = 0;
            int iDecodeIntElement15 = 0;
            int iDecodeIntElement16 = 0;
            int iDecodeIntElement17 = 0;
            int iDecodeIntElement18 = 0;
            int iDecodeIntElement19 = 0;
            int iDecodeIntElement20 = 0;
            float fDecodeFloatElement6 = 0.0f;
            int iDecodeIntElement21 = 0;
            float fDecodeFloatElement7 = 0.0f;
            int iDecodeIntElement22 = 0;
            int iDecodeIntElement23 = 0;
            float fDecodeFloatElement8 = 0.0f;
            float fDecodeFloatElement9 = 0.0f;
            int iDecodeIntElement24 = 0;
            int iDecodeIntElement25 = 0;
            float fDecodeFloatElement10 = 0.0f;
            int iDecodeIntElement26 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i16 = 4;
                        break;
                    case 0:
                        String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i17 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str8 = strDecodeStringElement16;
                        i16 = 4;
                        break;
                    case 1:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i17 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 2:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
                        i17 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 3:
                        fDecodeFloatElement7 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 3);
                        i17 |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 4:
                        fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, i16);
                        i17 |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 5:
                        fDecodeFloatElement10 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 5);
                        i17 |= 32;
                        Unit unit7 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 6:
                        iDecodeIntElement25 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 6);
                        i17 |= 64;
                        Unit unit8 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 7:
                        iDecodeIntElement24 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 7);
                        i17 |= 128;
                        Unit unit9 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 8:
                        iDecodeIntElement21 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 8);
                        i17 |= 256;
                        Unit unit10 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 9:
                        fDecodeFloatElement9 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 9);
                        i17 |= 512;
                        Unit unit11 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 10:
                        fDecodeFloatElement8 = compositeDecoderBeginStructure.decodeFloatElement(descriptor2, 10);
                        i17 |= 1024;
                        Unit unit12 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 11:
                        iDecodeIntElement23 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 11);
                        i17 |= 2048;
                        Unit unit13 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 12:
                        iDecodeIntElement22 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 12);
                        i17 |= 4096;
                        Unit unit14 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 13:
                        iDecodeIntElement26 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 13);
                        i17 |= 8192;
                        Unit unit15 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 14:
                        iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 14);
                        i17 |= 16384;
                        Unit unit16 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 15:
                        iDecodeIntElement15 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 15);
                        i17 |= 32768;
                        Unit unit17 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 16:
                        iDecodeIntElement16 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 16);
                        i17 |= 65536;
                        Unit unit18 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 17:
                        iDecodeIntElement17 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 17);
                        i17 |= 131072;
                        Unit unit19 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 18:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 18);
                        i17 |= 262144;
                        Unit unit20 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 19:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 19);
                        i15 = 524288;
                        i17 |= i15;
                        Unit unit21 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 20:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 20);
                        i15 = 1048576;
                        i17 |= i15;
                        Unit unit22 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 21:
                        iDecodeIntElement18 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 21);
                        i15 = 2097152;
                        i17 |= i15;
                        Unit unit23 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 22:
                        iDecodeIntElement19 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 22);
                        i15 = 4194304;
                        i17 |= i15;
                        Unit unit24 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 23:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 23);
                        i15 = 8388608;
                        i17 |= i15;
                        Unit unit25 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 24:
                        iDecodeIntElement20 = compositeDecoderBeginStructure.decodeIntElement(descriptor2, 24);
                        i15 = 16777216;
                        i17 |= i15;
                        Unit unit26 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 25:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 25);
                        i15 = 33554432;
                        i17 |= i15;
                        Unit unit27 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 26:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 26);
                        i15 = 67108864;
                        i17 |= i15;
                        Unit unit28 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 27:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 27);
                        i15 = AMapEngineUtils.HALF_MAX_P20_WIDTH;
                        i17 |= i15;
                        Unit unit29 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 28:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 28);
                        i15 = 268435456;
                        i17 |= i15;
                        Unit unit210 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    case 29:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 29);
                        i15 = 536870912;
                        i17 |= i15;
                        Unit unit211 = Unit.INSTANCE;
                        i16 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str8;
            i = i17;
            f = fDecodeFloatElement6;
            i2 = iDecodeIntElement21;
            str2 = strDecodeStringElement14;
            str3 = strDecodeStringElement15;
            f2 = fDecodeFloatElement7;
            i3 = iDecodeIntElement23;
            f3 = fDecodeFloatElement8;
            f4 = fDecodeFloatElement9;
            i4 = iDecodeIntElement24;
            i5 = iDecodeIntElement25;
            fDecodeFloatElement = fDecodeFloatElement10;
            j = jDecodeLongElement8;
            i6 = iDecodeIntElement18;
            i7 = iDecodeIntElement19;
            i8 = iDecodeIntElement20;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            strDecodeStringElement = strDecodeStringElement13;
            j2 = jDecodeLongElement6;
            j3 = jDecodeLongElement7;
            i9 = iDecodeIntElement16;
            i10 = iDecodeIntElement17;
            i11 = iDecodeIntElement14;
            i12 = iDecodeIntElement15;
            i13 = iDecodeIntElement22;
            i14 = iDecodeIntElement26;
            str7 = strDecodeStringElement9;
            j4 = jDecodeLongElement5;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new PAIDataVo(i, str, str3, str2, f2, f, fDecodeFloatElement, i5, i4, i2, f4, f3, i3, i13, i14, i11, i12, i9, i10, j4, j2, j3, i6, i7, j, i8, str7, str4, str5, str6, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PAIDataVo value) {
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        PAIDataVo.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
