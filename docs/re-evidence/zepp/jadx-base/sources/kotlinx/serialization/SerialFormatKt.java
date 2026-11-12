package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.internal.InternalHexConverter;
import kotlinx.serialization.modules.SerializersModule;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a$\u0010\f\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\f\u0010\u0013\u001a$\u0010\u0011\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0014\u001a$\u0010\u0016\u001a\u00020\u0015\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a$\u0010\u0019\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/StringFormat;", "value", "", "encodeToString", "(Lkotlinx/serialization/StringFormat;Ljava/lang/Object;)Ljava/lang/String;", "string", "decodeFromString", "(Lkotlinx/serialization/StringFormat;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/BinaryFormat;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeToHexString", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "hex", "decodeFromHexString", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/String;)Ljava/lang/Object;", "", "encodeToByteArray", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)[B", HTTP.CONTENT_RANGE_BYTES, "decodeFromByteArray", "(Lkotlinx/serialization/BinaryFormat;[B)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {1, 5, 1})
public final class SerialFormatKt {
    public static final /* synthetic */ <T> T decodeFromByteArray(BinaryFormat binaryFormat, byte[] bArr) {
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) binaryFormat.decodeFromByteArray(SerializersKt.serializer(serializersModule, (KType) null), bArr);
    }

    public static final <T> T decodeFromHexString(@NotNull BinaryFormat binaryFormat, @NotNull DeserializationStrategy<T> deserializationStrategy, @NotNull String str) {
        return (T) binaryFormat.decodeFromByteArray(deserializationStrategy, InternalHexConverter.INSTANCE.parseHexBinary(str));
    }

    public static final /* synthetic */ <T> T decodeFromString(StringFormat stringFormat, String str) {
        SerializersModule serializersModule = stringFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) stringFormat.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), str);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(BinaryFormat binaryFormat, T t) {
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return binaryFormat.encodeToByteArray(SerializersKt.serializer(serializersModule, (KType) null), t);
    }

    @NotNull
    public static final <T> String encodeToHexString(@NotNull BinaryFormat binaryFormat, @NotNull SerializationStrategy<? super T> serializationStrategy, T t) {
        return InternalHexConverter.INSTANCE.printHexBinary(binaryFormat.encodeToByteArray(serializationStrategy, t), true);
    }

    public static final /* synthetic */ <T> String encodeToString(StringFormat stringFormat, T t) {
        SerializersModule serializersModule = stringFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return stringFormat.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromHexString(BinaryFormat binaryFormat, String str) {
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) decodeFromHexString(binaryFormat, SerializersKt.serializer(serializersModule, (KType) null), str);
    }

    public static final /* synthetic */ <T> String encodeToHexString(BinaryFormat binaryFormat, T t) {
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return encodeToHexString(binaryFormat, SerializersKt.serializer(serializersModule, (KType) null), t);
    }
}
