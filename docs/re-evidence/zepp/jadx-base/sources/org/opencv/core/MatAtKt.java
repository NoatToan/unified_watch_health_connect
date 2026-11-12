package org.opencv.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.watch.transport.httpsupport.model.DataItem;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a/\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u0007\u001a'\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\f\u001a/\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0012\u001a'\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014\u001a+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0086\b\u001a \u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a \u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b\u001c\u0010 \u001a \u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b\u001e\u0010 \u001a \u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b!\u0010 \u001a \u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\b\u001c\u0010#\u001a \u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\b\u001e\u0010#\u001a \u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\b!\u0010#\u001a \u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\b$\u0010#\u001a)\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u00172\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(\u001a1\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u00172\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+\u001a9\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u00172\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u0000¢\u0006\u0004\b-\u0010.\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lorg/opencv/core/Mat;", "", WorkoutExercises.ROW, "col", "Lkotlin/UByteArray;", "data", "get-K0TZSog", "(Lorg/opencv/core/Mat;II[B)I", "get", "", "indices", "get-7tiRaYo", "(Lorg/opencv/core/Mat;[I[B)I", "put-K0TZSog", DataItem.HTTP_METHOD_PUT, "put-7tiRaYo", "Lkotlin/UShortArray;", "get-rFce7Xw", "(Lorg/opencv/core/Mat;II[S)I", "get-N38XRpM", "(Lorg/opencv/core/Mat;[I[S)I", "put-rFce7Xw", "put-N38XRpM", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/opencv/core/Mat$Atable;", "at", "idx", "Lorg/opencv/core/Mat$Tuple2;", "component1", "(Lorg/opencv/core/Mat$Tuple2;)Ljava/lang/Object;", "component2", "Lorg/opencv/core/Mat$Tuple3;", "(Lorg/opencv/core/Mat$Tuple3;)Ljava/lang/Object;", "component3", "Lorg/opencv/core/Mat$Tuple4;", "(Lorg/opencv/core/Mat$Tuple4;)Ljava/lang/Object;", "component4", "_0", "_1", "T2", "(Ljava/lang/Object;Ljava/lang/Object;)Lorg/opencv/core/Mat$Tuple2;", "_2", "T3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/opencv/core/Mat$Tuple3;", "_3", "T4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/opencv/core/Mat$Tuple4;", "opencv_release"}, k = 2, mv = {1, 5, 1})
public final class MatAtKt {
    @NotNull
    public static final <T> Mat.Tuple2<T> T2(T t, T t2) {
        return new Mat.Tuple2<>(t, t2);
    }

    @NotNull
    public static final <T> Mat.Tuple3<T> T3(T t, T t2, T t3) {
        return new Mat.Tuple3<>(t, t2, t3);
    }

    @NotNull
    public static final <T> Mat.Tuple4<T> T4(T t, T t2, T t3, T t4) {
        return new Mat.Tuple4<>(t, t2, t3, t4);
    }

    public static final /* synthetic */ <T> Mat.Atable<T> at(Mat mat, int i, int i2) {
        Mat.Atable<T> atableUShort;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return mat.at(Object.class, i, i2);
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(UByte.class))) {
            atableUShort = new AtableUByte(mat, i, i2);
        } else {
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(UShort.class))) {
                throw new RuntimeException("Unsupported class type");
            }
            atableUShort = new AtableUShort(mat, i, i2);
        }
        return atableUShort;
    }

    public static final <T> T component1(@NotNull Mat.Tuple2<T> tuple2) {
        return tuple2.get_0();
    }

    public static final <T> T component2(@NotNull Mat.Tuple2<T> tuple2) {
        return tuple2.get_1();
    }

    public static final <T> T component3(@NotNull Mat.Tuple3<T> tuple3) {
        return tuple3.get_2();
    }

    public static final <T> T component4(@NotNull Mat.Tuple4<T> tuple4) {
        return tuple4.get_3();
    }

    /* JADX INFO: renamed from: get-7tiRaYo, reason: not valid java name */
    public static final int m4501get7tiRaYo(@NotNull Mat mat, @NotNull int[] iArr, @NotNull byte[] bArr) {
        return mat.get(iArr, bArr);
    }

    /* JADX INFO: renamed from: get-K0TZSog, reason: not valid java name */
    public static final int m4502getK0TZSog(@NotNull Mat mat, int i, int i2, @NotNull byte[] bArr) {
        return mat.get(i, i2, bArr);
    }

    /* JADX INFO: renamed from: get-N38XRpM, reason: not valid java name */
    public static final int m4503getN38XRpM(@NotNull Mat mat, @NotNull int[] iArr, @NotNull short[] sArr) {
        return mat.get(iArr, sArr);
    }

    /* JADX INFO: renamed from: get-rFce7Xw, reason: not valid java name */
    public static final int m4504getrFce7Xw(@NotNull Mat mat, int i, int i2, @NotNull short[] sArr) {
        return mat.get(i, i2, sArr);
    }

    /* JADX INFO: renamed from: put-7tiRaYo, reason: not valid java name */
    public static final int m4505put7tiRaYo(@NotNull Mat mat, @NotNull int[] iArr, @NotNull byte[] bArr) {
        return mat.put(iArr, bArr);
    }

    /* JADX INFO: renamed from: put-K0TZSog, reason: not valid java name */
    public static final int m4506putK0TZSog(@NotNull Mat mat, int i, int i2, @NotNull byte[] bArr) {
        return mat.put(i, i2, bArr);
    }

    /* JADX INFO: renamed from: put-N38XRpM, reason: not valid java name */
    public static final int m4507putN38XRpM(@NotNull Mat mat, @NotNull int[] iArr, @NotNull short[] sArr) {
        return mat.put(iArr, sArr);
    }

    /* JADX INFO: renamed from: put-rFce7Xw, reason: not valid java name */
    public static final int m4508putrFce7Xw(@NotNull Mat mat, int i, int i2, @NotNull short[] sArr) {
        return mat.put(i, i2, sArr);
    }

    public static final <T> T component1(@NotNull Mat.Tuple3<T> tuple3) {
        return tuple3.get_0();
    }

    public static final <T> T component2(@NotNull Mat.Tuple3<T> tuple3) {
        return tuple3.get_1();
    }

    public static final <T> T component3(@NotNull Mat.Tuple4<T> tuple4) {
        return tuple4.get_2();
    }

    public static final <T> T component1(@NotNull Mat.Tuple4<T> tuple4) {
        return tuple4.get_0();
    }

    public static final <T> T component2(@NotNull Mat.Tuple4<T> tuple4) {
        return tuple4.get_1();
    }

    public static final /* synthetic */ <T> Mat.Atable<T> at(Mat mat, int[] iArr) {
        Mat.Atable<T> atableUShort;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return mat.at(Object.class, iArr);
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(UByte.class))) {
            atableUShort = new AtableUByte(mat, iArr);
        } else {
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(UShort.class))) {
                throw new RuntimeException("Unsupported class type");
            }
            atableUShort = new AtableUShort(mat, iArr);
        }
        return atableUShort;
    }
}
