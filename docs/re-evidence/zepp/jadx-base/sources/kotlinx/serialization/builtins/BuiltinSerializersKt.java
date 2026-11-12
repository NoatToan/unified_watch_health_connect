package kotlinx.serialization.builtins;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ì\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a@\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001aZ\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f0\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002*\u00020\u0011\u001a\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002*\u00020\u0016\u001a\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002*\u00020\u001a\u001a\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002*\u00020\u001e\u001a\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020#0\u0002*\u00020\"\u001a\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020'0\u0002*\u00020&\u001a\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020+0\u0002*\u00020*\u001a\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0002\u001a\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020/0\u0002*\u00020.¢\u0006\u0004\b\u0013\u00100\u001a\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0002\u001a\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002030\u0002*\u000203¢\u0006\u0004\b\u0013\u00104\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002060\u0002*\u000205\u001a=\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010;0\u0002\"\n\b\u0000\u00108\u0018\u0001*\u000207\"\f\b\u0001\u00109\u0018\u0001*\u0004\u0018\u00018\u00002\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b\u001aF\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010;0\u0002\"\b\b\u0000\u00108*\u000207\"\n\b\u0001\u00109*\u0004\u0018\u00018\u00002\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a&\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000?0\u0002\"\u0004\b\u0000\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A0\u0002\"\u0004\b\u0000\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a@\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020F0\u0002*\u00020EH\u0007ø\u0001\u0000\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020H0\u0002*\u00020GH\u0007ø\u0001\u0000\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020J0\u0002*\u00020IH\u0007ø\u0001\u0000\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020L0\u0002*\u00020KH\u0007ø\u0001\u0000\"5\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u00108*\u000207*\b\u0012\u0004\u0012\u00028\u00000\u00028F@\u0006¢\u0006\f\u0012\u0004\bO\u0010P\u001a\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"K", "V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "Lkotlin/Pair;", "PairSerializer", "", "MapEntrySerializer", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "aSerializer", "bSerializer", "cSerializer", "Lkotlin/Triple;", "TripleSerializer", "Lkotlin/Char$Companion;", "", "serializer", "", "CharArraySerializer", "Lkotlin/Byte$Companion;", "", "", "ByteArraySerializer", "Lkotlin/Short$Companion;", "", "", "ShortArraySerializer", "Lkotlin/Int$Companion;", "", "", "IntArraySerializer", "Lkotlin/Long$Companion;", "", "", "LongArraySerializer", "Lkotlin/Float$Companion;", "", "", "FloatArraySerializer", "Lkotlin/Double$Companion;", "", "", "DoubleArraySerializer", "Lkotlin/Boolean$Companion;", "", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Lkotlinx/serialization/KSerializer;", "", "BooleanArraySerializer", "", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", "", ExifInterface.GPS_DIRECTION_TRUE, "E", "elementSerializer", "", "ArraySerializer", "Lkotlin/reflect/KClass;", "kClass", "", "ListSerializer", "", "SetSerializer", "", "MapSerializer", "Lkotlin/UInt$Companion;", "Lkotlin/UInt;", "Lkotlin/ULong$Companion;", "Lkotlin/ULong;", "Lkotlin/UByte$Companion;", "Lkotlin/UByte;", "Lkotlin/UShort$Companion;", "Lkotlin/UShort;", "getNullable", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class BuiltinSerializersKt {
    @ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> ArraySerializer(KSerializer<E> kSerializer) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ArraySerializer(Reflection.getOrCreateKotlinClass(Object.class), kSerializer);
    }

    @NotNull
    public static final KSerializer<boolean[]> BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<byte[]> ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<char[]> CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<double[]> DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<float[]> FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<int[]> IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    @NotNull
    public static final <T> KSerializer<List<T>> ListSerializer(@NotNull KSerializer<T> kSerializer) {
        return new ArrayListSerializer(kSerializer);
    }

    @NotNull
    public static final KSerializer<long[]> LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    @NotNull
    public static final <K, V> KSerializer<Map.Entry<K, V>> MapEntrySerializer(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        return new MapEntrySerializer(kSerializer, kSerializer2);
    }

    @NotNull
    public static final <K, V> KSerializer<Map<K, V>> MapSerializer(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        return new LinkedHashMapSerializer(kSerializer, kSerializer2);
    }

    @NotNull
    public static final <K, V> KSerializer<Pair<K, V>> PairSerializer(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        return new PairSerializer(kSerializer, kSerializer2);
    }

    @NotNull
    public static final <T> KSerializer<Set<T>> SetSerializer(@NotNull KSerializer<T> kSerializer) {
        return new LinkedHashSetSerializer(kSerializer);
    }

    @NotNull
    public static final KSerializer<short[]> ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    @NotNull
    public static final <A, B, C> KSerializer<Triple<A, B, C>> TripleSerializer(@NotNull KSerializer<A> kSerializer, @NotNull KSerializer<B> kSerializer2, @NotNull KSerializer<C> kSerializer3) {
        return new TripleSerializer(kSerializer, kSerializer2, kSerializer3);
    }

    @NotNull
    public static final <T> KSerializer<T> getNullable(@NotNull KSerializer<T> kSerializer) {
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new NullableSerializer(kSerializer);
    }

    public static /* synthetic */ void getNullable$annotations(KSerializer kSerializer) {
    }

    @NotNull
    public static final KSerializer<Character> serializer(@NotNull CharCompanionObject charCompanionObject) {
        return CharSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final <T, E extends T> KSerializer<E[]> ArraySerializer(@NotNull KClass<T> kClass, @NotNull KSerializer<E> kSerializer) {
        return new ReferenceArraySerializer(kClass, kSerializer);
    }

    @NotNull
    public static final KSerializer<Byte> serializer(@NotNull ByteCompanionObject byteCompanionObject) {
        return ByteSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Short> serializer(@NotNull ShortCompanionObject shortCompanionObject) {
        return ShortSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Integer> serializer(@NotNull IntCompanionObject intCompanionObject) {
        return IntSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Long> serializer(@NotNull LongCompanionObject longCompanionObject) {
        return LongSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Float> serializer(@NotNull FloatCompanionObject floatCompanionObject) {
        return FloatSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Double> serializer(@NotNull DoubleCompanionObject doubleCompanionObject) {
        return DoubleSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Boolean> serializer(@NotNull BooleanCompanionObject booleanCompanionObject) {
        return BooleanSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<Unit> serializer(@NotNull Unit unit) {
        return UnitSerializer.INSTANCE;
    }

    @NotNull
    public static final KSerializer<String> serializer(@NotNull StringCompanionObject stringCompanionObject) {
        return StringSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UInt> serializer(@NotNull UInt.Companion companion) {
        return UIntSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<ULong> serializer(@NotNull ULong.Companion companion) {
        return ULongSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UByte> serializer(@NotNull UByte.Companion companion) {
        return UByteSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    @ExperimentalUnsignedTypes
    @NotNull
    public static final KSerializer<UShort> serializer(@NotNull UShort.Companion companion) {
        return UShortSerializer.INSTANCE;
    }
}
