package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class ArraysKt___ArraysJvmKt extends c {

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractList<Byte> implements RandomAccess {
        public final /* synthetic */ byte[] a;

        public AnonymousClass1(byte[] bArr) {
            this.a = bArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return contains(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return indexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return lastIndexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean contains(byte b) {
            return ArraysKt___ArraysKt.contains(this.a, b);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Byte get(int i) {
            return Byte.valueOf(this.a[i]);
        }

        public int indexOf(byte b) {
            return ArraysKt___ArraysKt.indexOf(this.a, b);
        }

        public int lastIndexOf(byte b) {
            return ArraysKt___ArraysKt.lastIndexOf(this.a, b);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractList<Short> implements RandomAccess {
        public final /* synthetic */ short[] a;

        public AnonymousClass2(short[] sArr) {
            this.a = sArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return contains(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return indexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return lastIndexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        public boolean contains(short s) {
            return ArraysKt___ArraysKt.contains(this.a, s);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Short get(int i) {
            return Short.valueOf(this.a[i]);
        }

        public int indexOf(short s) {
            return ArraysKt___ArraysKt.indexOf(this.a, s);
        }

        public int lastIndexOf(short s) {
            return ArraysKt___ArraysKt.lastIndexOf(this.a, s);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractList<Integer> implements RandomAccess {
        public final /* synthetic */ int[] a;

        public AnonymousClass3(int[] iArr) {
            this.a = iArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return contains(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return indexOf(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return lastIndexOf(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean contains(int i) {
            return ArraysKt___ArraysKt.contains(this.a, i);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Integer get(int i) {
            return Integer.valueOf(this.a[i]);
        }

        public int indexOf(int i) {
            return ArraysKt___ArraysKt.indexOf(this.a, i);
        }

        public int lastIndexOf(int i) {
            return ArraysKt___ArraysKt.lastIndexOf(this.a, i);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractList<Long> implements RandomAccess {
        public final /* synthetic */ long[] a;

        public AnonymousClass4(long[] jArr) {
            this.a = jArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return contains(((Number) obj).longValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return indexOf(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return lastIndexOf(((Number) obj).longValue());
            }
            return -1;
        }

        public boolean contains(long j) {
            return ArraysKt___ArraysKt.contains(this.a, j);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Long get(int i) {
            return Long.valueOf(this.a[i]);
        }

        public int indexOf(long j) {
            return ArraysKt___ArraysKt.indexOf(this.a, j);
        }

        public int lastIndexOf(long j) {
            return ArraysKt___ArraysKt.lastIndexOf(this.a, j);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$5, reason: invalid class name */
    public static final class AnonymousClass5 extends AbstractList<Float> implements RandomAccess {
        public final /* synthetic */ float[] a;

        public AnonymousClass5(float[] fArr) {
            this.a = fArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return contains(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return indexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return lastIndexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean contains(float f) {
            float[] fArr = this.a;
            int length = fArr.length;
            int i = 0;
            while (i < length) {
                float f2 = fArr[i];
                i++;
                if (Float.floatToIntBits(f2) == Float.floatToIntBits(f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Float get(int i) {
            return Float.valueOf(this.a[i]);
        }

        public int indexOf(float f) {
            float[] fArr = this.a;
            int length = fArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    return i;
                }
                i = i2;
            }
            return -1;
        }

        public int lastIndexOf(float f) {
            float[] fArr = this.a;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$6, reason: invalid class name */
    public static final class AnonymousClass6 extends AbstractList<Double> implements RandomAccess {
        public final /* synthetic */ double[] a;

        public AnonymousClass6(double[] dArr) {
            this.a = dArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return contains(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return indexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return lastIndexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        public boolean contains(double d) {
            double[] dArr = this.a;
            int length = dArr.length;
            int i = 0;
            while (i < length) {
                double d2 = dArr[i];
                i++;
                if (Double.doubleToLongBits(d2) == Double.doubleToLongBits(d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Double get(int i) {
            return Double.valueOf(this.a[i]);
        }

        public int indexOf(double d) {
            double[] dArr = this.a;
            int length = dArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return i;
                }
                i = i2;
            }
            return -1;
        }

        public int lastIndexOf(double d) {
            double[] dArr = this.a;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$7, reason: invalid class name */
    public static final class AnonymousClass7 extends AbstractList<Boolean> implements RandomAccess {
        public final /* synthetic */ boolean[] a;

        public AnonymousClass7(boolean[] zArr) {
            this.a = zArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return contains(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return indexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return lastIndexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        public boolean contains(boolean z) {
            return ArraysKt___ArraysKt.contains(this.a, z);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Boolean get(int i) {
            return Boolean.valueOf(this.a[i]);
        }

        public int indexOf(boolean z) {
            return ArraysKt___ArraysKt.indexOf(this.a, z);
        }

        public int lastIndexOf(boolean z) {
            return ArraysKt___ArraysKt.lastIndexOf(this.a, z);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$8, reason: invalid class name */
    public static final class AnonymousClass8 extends AbstractList<Character> implements RandomAccess {
        public final /* synthetic */ char[] a;

        public AnonymousClass8(char[] cArr) {
            this.a = cArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return contains(((Character) obj).charValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.a.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean contains(char c) {
            return ArraysKt___ArraysKt.contains(this.a, c);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        @NotNull
        public Character get(int i) {
            return Character.valueOf(this.a[i]);
        }

        public int indexOf(char c) {
            return ArraysKt___ArraysKt.indexOf(this.a, c);
        }

        public int lastIndexOf(char c) {
            return ArraysKt___ArraysKt.lastIndexOf(this.a, c);
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean A(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @InlineOnly
    private static final short[] A0(short[] sArr) {
        return Arrays.copyOf(sArr, sArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean B(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @InlineOnly
    private static final short[] B0(short[] sArr, int i) {
        return Arrays.copyOf(sArr, i);
    }

    @InlineOnly
    private static final boolean[] C0(boolean[] zArr) {
        return Arrays.copyOf(zArr, zArr.length);
    }

    @InlineOnly
    private static final boolean[] D0(boolean[] zArr, int i) {
        return Arrays.copyOf(zArr, i);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final byte[] E0(byte[] bArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(bArr, i, i2);
        }
        if (i2 <= bArr.length) {
            return Arrays.copyOfRange(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + bArr.length);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final char[] F0(char[] cArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(cArr, i, i2);
        }
        if (i2 <= cArr.length) {
            return Arrays.copyOfRange(cArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + cArr.length);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final double[] G0(double[] dArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(dArr, i, i2);
        }
        if (i2 <= dArr.length) {
            return Arrays.copyOfRange(dArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + dArr.length);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final float[] H0(float[] fArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(fArr, i, i2);
        }
        if (i2 <= fArr.length) {
            return Arrays.copyOfRange(fArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + fArr.length);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final int[] I0(int[] iArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(iArr, i, i2);
        }
        if (i2 <= iArr.length) {
            return Arrays.copyOfRange(iArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + iArr.length);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final long[] J0(long[] jArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(jArr, i, i2);
        }
        if (i2 <= jArr.length) {
            return Arrays.copyOfRange(jArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + jArr.length);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final <T> T[] K0(T[] tArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return (T[]) ArraysKt.copyOfRange(tArr, i, i2);
        }
        if (i2 <= tArr.length) {
            return (T[]) Arrays.copyOfRange(tArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + tArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int L(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final short[] L0(short[] sArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(sArr, i, i2);
        }
        if (i2 <= sArr.length) {
            return Arrays.copyOfRange(sArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + sArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int M(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final boolean[] M0(boolean[] zArr, int i, int i2) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(zArr, i, i2);
        }
        if (i2 <= zArr.length) {
            return Arrays.copyOfRange(zArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + zArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int N(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @InlineOnly
    private static final byte N0(byte[] bArr, int i) {
        return bArr[i];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int O(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @InlineOnly
    private static final char O0(char[] cArr, int i) {
        return cArr[i];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int P(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @InlineOnly
    private static final double P0(double[] dArr, int i) {
        return dArr[i];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int Q(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @InlineOnly
    private static final float Q0(float[] fArr, int i) {
        return fArr[i];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final <T> int R(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @InlineOnly
    private static final int R0(int[] iArr, int i) {
        return iArr[i];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int S(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @InlineOnly
    private static final long S0(long[] jArr, int i) {
        return jArr[i];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int T(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @InlineOnly
    private static final <T> T T0(T[] tArr, int i) {
        return tArr[i];
    }

    @InlineOnly
    private static final short U0(short[] sArr, int i) {
        return sArr[i];
    }

    @InlineOnly
    private static final boolean V0(boolean[] zArr, int i) {
        return zArr[i];
    }

    @InlineOnly
    private static final <T> T[] W0(T[] tArr, T t) {
        return (T[]) ArraysKt.plus(tArr, t);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> void X0(T[] tArr) {
        sort(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal Y0(byte[] bArr, Function1<? super Byte, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Byte.valueOf(b)));
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal Z0(char[] cArr, Function1<? super Character, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            char c = cArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Character.valueOf(c)));
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal a1(double[] dArr, Function1<? super Double, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = dArr.length;
        int i = 0;
        while (i < length) {
            double d = dArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Double.valueOf(d)));
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static <T> List<T> asList(@NotNull T[] tArr) {
        return d.a(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal b1(float[] fArr, Function1<? super Float, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float f = fArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Float.valueOf(f)));
        }
        return bigDecimalValueOf;
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal c1(int[] iArr, Function1<? super Integer, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Integer.valueOf(i2)));
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static <T> T[] copyInto(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return ArraysKt.copyInto(objArr, objArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static <T> T[] copyOfRange(@NotNull T[] tArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String d0(byte[] bArr) {
        return Arrays.toString(bArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal d1(long[] jArr, Function1<? super Long, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            long j = jArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Long.valueOf(j)));
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @JvmName(name = "contentDeepEqualsInline")
    @LowPriorityInOverloadResolution
    private static final <T> boolean e(T[] tArr, T[] tArr2) {
        return c.contentDeepEquals(tArr, tArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String e0(char[] cArr) {
        return Arrays.toString(cArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigDecimal e1(T[] tArr, Function1<? super T, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(t));
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentDeepEqualsNullable")
    private static final <T> boolean f(T[] tArr, T[] tArr2) {
        return PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0) ? c.contentDeepEquals(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String f0(double[] dArr) {
        return Arrays.toString(dArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal f1(short[] sArr, Function1<? super Short, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            short s = sArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Short.valueOf(s)));
        }
        return bigDecimalValueOf;
    }

    public static <T> void fill(@NotNull T[] tArr, T t, int i, int i2) {
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        fill(objArr, obj, i, i2);
    }

    @NotNull
    public static final <R> List<R> filterIsInstance(@NotNull Object[] objArr, @NotNull Class<R> cls) {
        return (List) filterIsInstanceTo(objArr, new ArrayList(), cls);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] objArr, @NotNull C c, @NotNull Class<R> cls) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @JvmName(name = "contentDeepHashCodeInline")
    @LowPriorityInOverloadResolution
    private static final <T> int g(T[] tArr) {
        return b.contentDeepHashCode(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String g0(float[] fArr) {
        return Arrays.toString(fArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal g1(boolean[] zArr, Function1<? super Boolean, ? extends BigDecimal> function1) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        int length = zArr.length;
        int i = 0;
        while (i < length) {
            boolean z = zArr[i];
            i++;
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(Boolean.valueOf(z)));
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentDeepHashCodeNullable")
    private static final <T> int h(T[] tArr) {
        return PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0) ? b.contentDeepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String h0(int[] iArr) {
        return Arrays.toString(iArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger h1(byte[] bArr, Function1<? super Byte, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Byte.valueOf(b)));
        }
        return bigIntegerValueOf;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @JvmName(name = "contentDeepToStringInline")
    @LowPriorityInOverloadResolution
    private static final <T> String i(T[] tArr) {
        return c.contentDeepToString(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String i0(long[] jArr) {
        return Arrays.toString(jArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger i1(char[] cArr, Function1<? super Character, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            char c = cArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Character.valueOf(c)));
        }
        return bigIntegerValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentDeepToStringNullable")
    private static final <T> String j(T[] tArr) {
        return PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0) ? c.contentDeepToString(tArr) : Arrays.deepToString(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final <T> String j0(T[] tArr) {
        return Arrays.toString(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger j1(double[] dArr, Function1<? super Double, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = dArr.length;
        int i = 0;
        while (i < length) {
            double d = dArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Double.valueOf(d)));
        }
        return bigIntegerValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String k0(short[] sArr) {
        return Arrays.toString(sArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger k1(float[] fArr, Function1<? super Float, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float f = fArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Float.valueOf(f)));
        }
        return bigIntegerValueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String l0(boolean[] zArr) {
        return Arrays.toString(zArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger l1(int[] iArr, Function1<? super Integer, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Integer.valueOf(i2)));
        }
        return bigIntegerValueOf;
    }

    @InlineOnly
    private static final byte[] m0(byte[] bArr) {
        return Arrays.copyOf(bArr, bArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger m1(long[] jArr, Function1<? super Long, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            long j = jArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Long.valueOf(j)));
        }
        return bigIntegerValueOf;
    }

    @InlineOnly
    private static final byte[] n0(byte[] bArr, int i) {
        return Arrays.copyOf(bArr, i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigInteger n1(T[] tArr, Function1<? super T, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(t));
        }
        return bigIntegerValueOf;
    }

    @InlineOnly
    private static final char[] o0(char[] cArr) {
        return Arrays.copyOf(cArr, cArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger o1(short[] sArr, Function1<? super Short, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            short s = sArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Short.valueOf(s)));
        }
        return bigIntegerValueOf;
    }

    @InlineOnly
    private static final char[] p0(char[] cArr, int i) {
        return Arrays.copyOf(cArr, i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger p1(boolean[] zArr, Function1<? super Boolean, ? extends BigInteger> function1) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = zArr.length;
        int i = 0;
        while (i < length) {
            boolean z = zArr[i];
            i++;
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(Boolean.valueOf(z)));
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static <T> T[] plus(@NotNull T[] tArr, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        return tArr2;
    }

    @InlineOnly
    private static final double[] q0(double[] dArr) {
        return Arrays.copyOf(dArr, dArr.length);
    }

    @InlineOnly
    private static final double[] r0(double[] dArr, int i) {
        return Arrays.copyOf(dArr, i);
    }

    @InlineOnly
    private static final float[] s0(float[] fArr) {
        return Arrays.copyOf(fArr, fArr.length);
    }

    public static final void sort(@NotNull int[] iArr) {
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        sort(comparableArr, i, i2);
    }

    public static final <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        sortWith(objArr, comparator, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean t(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @InlineOnly
    private static final float[] t0(float[] fArr, int i) {
        return Arrays.copyOf(fArr, i);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] tArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet());
    }

    @NotNull
    public static Byte[] toTypedArray(@NotNull byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean u(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @InlineOnly
    private static final int[] u0(int[] iArr) {
        return Arrays.copyOf(iArr, iArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean v(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @InlineOnly
    private static final int[] v0(int[] iArr, int i) {
        return Arrays.copyOf(iArr, i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean w(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @InlineOnly
    private static final long[] w0(long[] jArr) {
        return Arrays.copyOf(jArr, jArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean x(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @InlineOnly
    private static final long[] x0(long[] jArr, int i) {
        return Arrays.copyOf(jArr, i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean y(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @InlineOnly
    private static final <T> T[] y0(T[] tArr) {
        return (T[]) Arrays.copyOf(tArr, tArr.length);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final <T> boolean z(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @InlineOnly
    private static final <T> T[] z0(T[] tArr, int i) {
        return (T[]) Arrays.copyOf(tArr, i);
    }

    @NotNull
    public static List<Byte> asList(@NotNull byte[] bArr) {
        return new AnonymousClass1(bArr);
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t, int i, int i2) {
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return binarySearch(objArr, obj, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static byte[] copyInto(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return copyInto(bArr, bArr2, i, i2, i3);
    }

    public static void fill(@NotNull byte[] bArr, byte b, int i, int i2) {
        Arrays.fill(bArr, i, i2, b);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        fill(bArr, b, i, i2);
    }

    public static final void sort(@NotNull long[] jArr) {
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        sort(bArr, i, i2);
    }

    public static <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i, int i2) {
        Arrays.sort(tArr, i, i2, comparator);
    }

    @NotNull
    public static final SortedSet<Byte> toSortedSet(@NotNull byte[] bArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(bArr, new TreeSet());
    }

    @NotNull
    public static final List<Short> asList(@NotNull short[] sArr) {
        return new AnonymousClass2(sArr);
    }

    public static final int binarySearch(@NotNull byte[] bArr, byte b, int i, int i2) {
        return Arrays.binarySearch(bArr, i, i2, b);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return binarySearch(bArr, b, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static short[] copyInto(@NotNull short[] sArr, @NotNull short[] sArr2, int i, int i2, int i3) {
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return copyInto(sArr, sArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static byte[] copyOfRange(@NotNull byte[] bArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static void fill(@NotNull short[] sArr, short s, int i, int i2) {
        Arrays.fill(sArr, i, i2, s);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        fill(sArr, s, i, i2);
    }

    public static final void sort(@NotNull byte[] bArr) {
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        sort(sArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Short> toSortedSet(@NotNull short[] sArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(sArr, new TreeSet());
    }

    @NotNull
    public static List<Integer> asList(@NotNull int[] iArr) {
        return new AnonymousClass3(iArr);
    }

    public static final int binarySearch(@NotNull short[] sArr, short s, int i, int i2) {
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return binarySearch(sArr, s, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static int[] copyInto(@NotNull int[] iArr, @NotNull int[] iArr2, int i, int i2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return copyInto(iArr, iArr2, i, i2, i3);
    }

    public static void fill(@NotNull int[] iArr, int i, int i2, int i3) {
        Arrays.fill(iArr, i2, i3, i);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        fill(iArr, i, i2, i3);
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] bArr, byte b) {
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b;
        return bArrCopyOf;
    }

    public static final void sort(@NotNull short[] sArr) {
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        sort(iArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Integer> toSortedSet(@NotNull int[] iArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(iArr, new TreeSet());
    }

    @NotNull
    public static final Short[] toTypedArray(@NotNull short[] sArr) {
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    @NotNull
    public static List<Long> asList(@NotNull long[] jArr) {
        return new AnonymousClass4(jArr);
    }

    public static final int binarySearch(@NotNull int[] iArr, int i, int i2, int i3) {
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return binarySearch(iArr, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static long[] copyInto(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return copyInto(jArr, jArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static short[] copyOfRange(@NotNull short[] sArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, sArr.length);
        return Arrays.copyOfRange(sArr, i, i2);
    }

    public static void fill(@NotNull long[] jArr, long j, int i, int i2) {
        Arrays.fill(jArr, i, i2, j);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        fill(jArr, j, i, i2);
    }

    public static final void sort(@NotNull double[] dArr) {
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        sort(jArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Long> toSortedSet(@NotNull long[] jArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(jArr, new TreeSet());
    }

    @NotNull
    public static final List<Float> asList(@NotNull float[] fArr) {
        return new AnonymousClass5(fArr);
    }

    public static final int binarySearch(@NotNull long[] jArr, long j, int i, int i2) {
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return binarySearch(jArr, j, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static float[] copyInto(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i2, int i3) {
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return copyInto(fArr, fArr2, i, i2, i3);
    }

    public static final void fill(@NotNull float[] fArr, float f, int i, int i2) {
        Arrays.fill(fArr, i, i2, f);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        fill(fArr, f, i, i2);
    }

    public static final void sort(@NotNull float[] fArr) {
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        sort(fArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Float> toSortedSet(@NotNull float[] fArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(fArr, new TreeSet());
    }

    @NotNull
    public static List<Double> asList(@NotNull double[] dArr) {
        return new AnonymousClass6(dArr);
    }

    public static final int binarySearch(@NotNull float[] fArr, float f, int i, int i2) {
        return Arrays.binarySearch(fArr, i, i2, f);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return binarySearch(fArr, f, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final double[] copyInto(@NotNull double[] dArr, @NotNull double[] dArr2, int i, int i2, int i3) {
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return copyInto(dArr, dArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static int[] copyOfRange(@NotNull int[] iArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, iArr.length);
        return Arrays.copyOfRange(iArr, i, i2);
    }

    public static final void fill(@NotNull double[] dArr, double d, int i, int i2) {
        Arrays.fill(dArr, i, i2, d);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        fill(dArr, d, i, i2);
    }

    @NotNull
    public static short[] plus(@NotNull short[] sArr, short s) {
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s;
        return sArrCopyOf;
    }

    public static final void sort(@NotNull char[] cArr) {
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        sort(dArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Double> toSortedSet(@NotNull double[] dArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(dArr, new TreeSet());
    }

    @NotNull
    public static final Integer[] toTypedArray(@NotNull int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @NotNull
    public static final List<Boolean> asList(@NotNull boolean[] zArr) {
        return new AnonymousClass7(zArr);
    }

    public static final int binarySearch(@NotNull double[] dArr, double d, int i, int i2) {
        return Arrays.binarySearch(dArr, i, i2, d);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return binarySearch(dArr, d, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final boolean[] copyInto(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, int i, int i2, int i3) {
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return copyInto(zArr, zArr2, i, i2, i3);
    }

    public static final void fill(@NotNull boolean[] zArr, boolean z, int i, int i2) {
        Arrays.fill(zArr, i, i2, z);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        fill(zArr, z, i, i2);
    }

    public static <T> void sort(@NotNull T[] tArr) {
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        sort(cArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] zArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(zArr, new TreeSet());
    }

    @NotNull
    public static final List<Character> asList(@NotNull char[] cArr) {
        return new AnonymousClass8(cArr);
    }

    public static final int binarySearch(@NotNull char[] cArr, char c, int i, int i2) {
        return Arrays.binarySearch(cArr, i, i2, c);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return binarySearch(cArr, c, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static char[] copyInto(@NotNull char[] cArr, @NotNull char[] cArr2, int i, int i2, int i3) {
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return copyInto(cArr, cArr2, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static long[] copyOfRange(@NotNull long[] jArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, jArr.length);
        return Arrays.copyOfRange(jArr, i, i2);
    }

    public static final void fill(@NotNull char[] cArr, char c, int i, int i2) {
        Arrays.fill(cArr, i, i2, c);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        fill(cArr, c, i, i2);
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sort(@NotNull T[] tArr, int i, int i2) {
        Arrays.sort(tArr, i, i2);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        sort(objArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull char[] cArr) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(cArr, new TreeSet());
    }

    @NotNull
    public static int[] plus(@NotNull int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        return iArrCopyOf;
    }

    public static final void sort(@NotNull byte[] bArr, int i, int i2) {
        Arrays.sort(bArr, i, i2);
    }

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }

    @NotNull
    public static final Long[] toTypedArray(@NotNull long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static float[] copyOfRange(@NotNull float[] fArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, fArr.length);
        return Arrays.copyOfRange(fArr, i, i2);
    }

    public static final void sort(@NotNull short[] sArr, int i, int i2) {
        Arrays.sort(sArr, i, i2);
    }

    public static final void sort(@NotNull int[] iArr, int i, int i2) {
        Arrays.sort(iArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final double[] copyOfRange(@NotNull double[] dArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, dArr.length);
        return Arrays.copyOfRange(dArr, i, i2);
    }

    @NotNull
    public static long[] plus(@NotNull long[] jArr, long j) {
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j;
        return jArrCopyOf;
    }

    public static final void sort(@NotNull long[] jArr, int i, int i2) {
        Arrays.sort(jArr, i, i2);
    }

    @NotNull
    public static Float[] toTypedArray(@NotNull float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    public static final void sort(@NotNull float[] fArr, int i, int i2) {
        Arrays.sort(fArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final boolean[] copyOfRange(@NotNull boolean[] zArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, zArr.length);
        return Arrays.copyOfRange(zArr, i, i2);
    }

    public static final void sort(@NotNull double[] dArr, int i, int i2) {
        Arrays.sort(dArr, i, i2);
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, float f) {
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f;
        return fArrCopyOf;
    }

    public static final void sort(@NotNull char[] cArr, int i, int i2) {
        Arrays.sort(cArr, i, i2);
    }

    @NotNull
    public static final Double[] toTypedArray(@NotNull double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    @PublishedApi
    public static final char[] copyOfRange(@NotNull char[] cArr, int i, int i2) {
        b.copyOfRangeToIndexCheck(i2, cArr.length);
        return Arrays.copyOfRange(cArr, i, i2);
    }

    public static final <T> void sort(@NotNull T[] tArr, int i, int i2) {
        Arrays.sort(tArr, i, i2);
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, double d) {
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d;
        return dArrCopyOf;
    }

    @NotNull
    public static final Boolean[] toTypedArray(@NotNull boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, boolean z) {
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z;
        return zArrCopyOf;
    }

    @NotNull
    public static final Character[] toTypedArray(@NotNull char[] cArr) {
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, char c) {
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c;
        return cArrCopyOf;
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, @NotNull Collection<? extends T> collection) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it2 = collection.iterator();
        while (it2.hasNext()) {
            tArr2[length] = it2.next();
            length++;
        }
        return tArr2;
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] bArr, @NotNull Collection<Byte> collection) {
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, collection.size() + length);
        Iterator<Byte> it2 = collection.iterator();
        while (it2.hasNext()) {
            bArrCopyOf[length] = it2.next().byteValue();
            length++;
        }
        return bArrCopyOf;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, @NotNull Collection<Short> collection) {
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, collection.size() + length);
        Iterator<Short> it2 = collection.iterator();
        while (it2.hasNext()) {
            sArrCopyOf[length] = it2.next().shortValue();
            length++;
        }
        return sArrCopyOf;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, collection.size() + length);
        Iterator<Integer> it2 = collection.iterator();
        while (it2.hasNext()) {
            iArrCopyOf[length] = it2.next().intValue();
            length++;
        }
        return iArrCopyOf;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] jArr, @NotNull Collection<Long> collection) {
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, collection.size() + length);
        Iterator<Long> it2 = collection.iterator();
        while (it2.hasNext()) {
            jArrCopyOf[length] = it2.next().longValue();
            length++;
        }
        return jArrCopyOf;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, @NotNull Collection<Float> collection) {
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, collection.size() + length);
        Iterator<Float> it2 = collection.iterator();
        while (it2.hasNext()) {
            fArrCopyOf[length] = it2.next().floatValue();
            length++;
        }
        return fArrCopyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, @NotNull Collection<Double> collection) {
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, collection.size() + length);
        Iterator<Double> it2 = collection.iterator();
        while (it2.hasNext()) {
            dArrCopyOf[length] = it2.next().doubleValue();
            length++;
        }
        return dArrCopyOf;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull Collection<Boolean> collection) {
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, collection.size() + length);
        Iterator<Boolean> it2 = collection.iterator();
        while (it2.hasNext()) {
            zArrCopyOf[length] = it2.next().booleanValue();
            length++;
        }
        return zArrCopyOf;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull Collection<Character> collection) {
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, collection.size() + length);
        Iterator<Character> it2 = collection.iterator();
        while (it2.hasNext()) {
            cArrCopyOf[length] = it2.next().charValue();
            length++;
        }
        return cArrCopyOf;
    }

    @NotNull
    public static <T> T[] plus(@NotNull T[] tArr, @NotNull T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    @NotNull
    public static short[] plus(@NotNull short[] sArr, @NotNull short[] sArr2) {
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
        return sArrCopyOf;
    }

    @NotNull
    public static int[] plus(@NotNull int[] iArr, @NotNull int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    @NotNull
    public static long[] plus(@NotNull long[] jArr, @NotNull long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        return jArrCopyOf;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, @NotNull float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        return fArrCopyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, @NotNull double[] dArr2) {
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
        return dArrCopyOf;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        return zArrCopyOf;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull char[] cArr2) {
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
        return cArrCopyOf;
    }
}
