package kotlin.collections;

import defpackage.a04;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends Lambda implements Function0<Iterator<? extends T>> {
        public final /* synthetic */ T[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T[] tArr) {
            super(0);
            this.a = tArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke() {
            return ArrayIteratorKt.iterator(this.a);
        }
    }

    public static final class b extends Lambda implements Function0<Iterator<? extends Byte>> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Byte> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    public static final class c extends Lambda implements Function0<Iterator<? extends Short>> {
        public final /* synthetic */ short[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(short[] sArr) {
            super(0);
            this.a = sArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Short> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    public static final class d extends Lambda implements Function0<Iterator<? extends Integer>> {
        public final /* synthetic */ int[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int[] iArr) {
            super(0);
            this.a = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Integer> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    public static final class e extends Lambda implements Function0<Iterator<? extends Long>> {
        public final /* synthetic */ long[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long[] jArr) {
            super(0);
            this.a = jArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Long> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    public static final class f extends Lambda implements Function0<Iterator<? extends Float>> {
        public final /* synthetic */ float[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float[] fArr) {
            super(0);
            this.a = fArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Float> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    public static final class g extends Lambda implements Function0<Iterator<? extends Double>> {
        public final /* synthetic */ double[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(double[] dArr) {
            super(0);
            this.a = dArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Double> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    public static final class h extends Lambda implements Function0<Iterator<? extends Boolean>> {
        public final /* synthetic */ boolean[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean[] zArr) {
            super(0);
            this.a = zArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Boolean> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    public static final class i extends Lambda implements Function0<Iterator<? extends Character>> {
        public final /* synthetic */ char[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(char[] cArr) {
            super(0);
            this.a = cArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<Character> invoke() {
            return ArrayIteratorsKt.iterator(this.a);
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Double, ? super V>> M A1(double[] dArr, M m, Function1<? super Double, ? extends V> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            m.put(Double.valueOf(d2), function1.invoke(Double.valueOf(d2)));
        }
        return m;
    }

    @InlineOnly
    private static final int A2(char[] cArr) {
        return cArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> A3(T[] tArr, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), t));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float A4(double[] dArr, Function1<? super Double, Float> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Double.valueOf(dArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R A5(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double A6(short[] sArr, Function1<? super Short, Double> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Short.valueOf(sArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long A7(long[] jArr) {
        return random(jArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> A8(boolean[] zArr, R r, Function2<? super R, ? super Boolean, ? extends R> function2) {
        int i2 = 0;
        if (zArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            r = function2.invoke(r, Boolean.valueOf(z));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long A9(short[] sArr, Function1<? super Short, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = sArr.length;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Short.valueOf(s)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Float, ? super V>> M B1(float[] fArr, M m, Function1<? super Float, ? extends V> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            m.put(Float.valueOf(f2), function1.invoke(Float.valueOf(f2)));
        }
        return m;
    }

    @InlineOnly
    private static final int B2(double[] dArr) {
        return dArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> B3(short[] sArr, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Short.valueOf(s)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float B4(float[] fArr, Function1<? super Float, Float> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Float.valueOf(fArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R B5(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double B6(boolean[] zArr, Function1<? super Boolean, Double> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T B7(T[] tArr) {
        return (T) random(tArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> B8(byte[] bArr, R r, Function3<? super Integer, ? super R, ? super Byte, ? extends R> function3) {
        if (bArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Byte.valueOf(bArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long B9(boolean[] zArr, Function1<? super Boolean, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = zArr.length;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Boolean.valueOf(z)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Integer, ? super V>> M C1(int[] iArr, M m, Function1<? super Integer, ? extends V> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            m.put(Integer.valueOf(i3), function1.invoke(Integer.valueOf(i3)));
        }
        return m;
    }

    @InlineOnly
    private static final int C2(float[] fArr) {
        return fArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> C3(boolean[] zArr, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float C4(int[] iArr, Function1<? super Integer, Float> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Integer.valueOf(iArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R C5(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float C6(byte[] bArr, Function1<? super Byte, Float> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Byte.valueOf(bArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final short C7(short[] sArr) {
        return random(sArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> C8(char[] cArr, R r, Function3<? super Integer, ? super R, ? super Character, ? extends R> function3) {
        if (cArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Character.valueOf(cArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Long, ? super V>> M D1(long[] jArr, M m, Function1<? super Long, ? extends V> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            m.put(Long.valueOf(j), function1.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @InlineOnly
    private static final int D2(int[] iArr) {
        return iArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C D3(byte[] bArr, C c2, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> function2) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float D4(long[] jArr, Function1<? super Long, Float> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Long.valueOf(jArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R D5(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float D6(char[] cArr, Function1<? super Character, Float> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Character.valueOf(cArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean D7(boolean[] zArr) {
        return random(zArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> D8(double[] dArr, R r, Function3<? super Integer, ? super R, ? super Double, ? extends R> function3) {
        if (dArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Double.valueOf(dArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Short, ? super V>> M E1(short[] sArr, M m, Function1<? super Short, ? extends V> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            m.put(Short.valueOf(s), function1.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @InlineOnly
    private static final int E2(long[] jArr) {
        return jArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C E3(char[] cArr, C c2, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> function2) {
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Character.valueOf(c3)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> float E4(T[] tArr, Function1<? super T, Float> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(tArr[i2]).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R E5(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float E6(double[] dArr, Function1<? super Double, Float> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Double.valueOf(dArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Boolean E7(boolean[] zArr) {
        return randomOrNull(zArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> E8(float[] fArr, R r, Function3<? super Integer, ? super R, ? super Float, ? extends R> function3) {
        if (fArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Float.valueOf(fArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Boolean, ? super V>> M F1(boolean[] zArr, M m, Function1<? super Boolean, ? extends V> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            m.put(Boolean.valueOf(z), function1.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    @InlineOnly
    private static final <T> int F2(T[] tArr) {
        return tArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C F3(double[] dArr, C c2, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> function2) {
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Double.valueOf(d2)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float F4(short[] sArr, Function1<? super Short, Float> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Short.valueOf(sArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R F5(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float F6(float[] fArr, Function1<? super Float, Float> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Float.valueOf(fArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Byte F7(byte[] bArr) {
        return randomOrNull(bArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> F8(int[] iArr, R r, Function3<? super Integer, ? super R, ? super Integer, ? extends R> function3) {
        if (iArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Integer.valueOf(iArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @InlineOnly
    private static final byte G1(byte[] bArr) {
        return bArr[0];
    }

    @InlineOnly
    private static final int G2(short[] sArr) {
        return sArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C G3(float[] fArr, C c2, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> function2) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Float.valueOf(f2)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float G4(boolean[] zArr, Function1<? super Boolean, Float> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R G5(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float G6(int[] iArr, Function1<? super Integer, Float> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Integer.valueOf(iArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character G7(char[] cArr) {
        return randomOrNull(cArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> G8(long[] jArr, R r, Function3<? super Integer, ? super R, ? super Long, ? extends R> function3) {
        if (jArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Long.valueOf(jArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @InlineOnly
    private static final char H1(char[] cArr) {
        return cArr[0];
    }

    @InlineOnly
    private static final int H2(boolean[] zArr) {
        return zArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C H3(int[] iArr, C c2, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> function2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R H4(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R H5(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float H6(long[] jArr, Function1<? super Long, Float> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Long.valueOf(jArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Double H7(double[] dArr) {
        return randomOrNull(dArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> H8(short[] sArr, R r, Function3<? super Integer, ? super R, ? super Short, ? extends R> function3) {
        if (sArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Short.valueOf(sArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @InlineOnly
    private static final double I1(double[] dArr) {
        return dArr[0];
    }

    @InlineOnly
    private static final byte I2(byte[] bArr, int i2, Function1<? super Integer, Byte> function1) {
        return (i2 < 0 || i2 > getLastIndex(bArr)) ? function1.invoke(Integer.valueOf(i2)).byteValue() : bArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C I3(long[] jArr, C c2, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> function2) {
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Long.valueOf(j)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R I4(char[] cArr, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R I5(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Float I6(T[] tArr, Function1<? super T, Float> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(tArr[i2]).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Float I7(float[] fArr) {
        return randomOrNull(fArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> I8(boolean[] zArr, R r, Function3<? super Integer, ? super R, ? super Boolean, ? extends R> function3) {
        if (zArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Boolean.valueOf(zArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @InlineOnly
    private static final float J1(float[] fArr) {
        return fArr[0];
    }

    @InlineOnly
    private static final char J2(char[] cArr, int i2, Function1<? super Integer, Character> function1) {
        return (i2 < 0 || i2 > getLastIndex(cArr)) ? function1.invoke(Integer.valueOf(i2)).charValue() : cArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C J3(T[] tArr, C c2, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> function2) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), t));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R J4(double[] dArr, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double J5(byte[] bArr, Function1<? super Byte, Double> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float J6(short[] sArr, Function1<? super Short, Float> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Short.valueOf(sArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Integer J7(int[] iArr) {
        return randomOrNull(iArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double J8(byte[] bArr, Function1<? super Byte, Double> function1) {
        int length = bArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Byte.valueOf(b2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final int K1(int[] iArr) {
        return iArr[0];
    }

    @InlineOnly
    private static final double K2(double[] dArr, int i2, Function1<? super Integer, Double> function1) {
        return (i2 < 0 || i2 > getLastIndex(dArr)) ? function1.invoke(Integer.valueOf(i2)).doubleValue() : dArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C K3(short[] sArr, C c2, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> function2) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Short.valueOf(s)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R K4(float[] fArr, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double K5(char[] cArr, Function1<? super Character, Double> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Character.valueOf(cArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float K6(boolean[] zArr, Function1<? super Boolean, Float> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Long K7(long[] jArr) {
        return randomOrNull(jArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double K8(char[] cArr, Function1<? super Character, Double> function1) {
        int length = cArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Character.valueOf(c2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final long L1(long[] jArr) {
        return jArr[0];
    }

    @InlineOnly
    private static final float L2(float[] fArr, int i2, Function1<? super Integer, Float> function1) {
        return (i2 < 0 || i2 > getLastIndex(fArr)) ? function1.invoke(Integer.valueOf(i2)).floatValue() : fArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C L3(boolean[] zArr, C c2, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> function2) {
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z)));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R L4(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double L5(double[] dArr, Function1<? super Double, Double> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Double.valueOf(dArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R L6(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <T> T L7(T[] tArr) {
        return (T) randomOrNull(tArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double L8(double[] dArr, Function1<? super Double, Double> function1) {
        int length = dArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Double.valueOf(d2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final <T> T M1(T[] tArr) {
        return tArr[0];
    }

    @InlineOnly
    private static final int M2(int[] iArr, int i2, Function1<? super Integer, Integer> function1) {
        return (i2 < 0 || i2 > getLastIndex(iArr)) ? function1.invoke(Integer.valueOf(i2)).intValue() : iArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequence")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> M3(T[] tArr, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), t));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R M4(long[] jArr, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double M5(float[] fArr, Function1<? super Float, Double> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Float.valueOf(fArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R M6(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Short M7(short[] sArr) {
        return randomOrNull(sArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double M8(float[] fArr, Function1<? super Float, Double> function1) {
        int length = fArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Float.valueOf(f2)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final short N1(short[] sArr) {
        return sArr[0];
    }

    @InlineOnly
    private static final long N2(long[] jArr, int i2, Function1<? super Integer, Long> function1) {
        return (i2 < 0 || i2 > getLastIndex(jArr)) ? function1.invoke(Integer.valueOf(i2)).longValue() : jArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequenceTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C N3(T[] tArr, C c2, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> function2) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function2.invoke(Integer.valueOf(i3), t));
            i3++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R N4(T[] tArr, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double N5(int[] iArr, Function1<? super Integer, Double> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R N6(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> N7(byte[] bArr, R r, Function2<? super R, ? super Byte, ? extends R> function2) {
        int i2 = 0;
        if (bArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            r = function2.invoke(r, Byte.valueOf(b2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double N8(int[] iArr, Function1<? super Integer, Double> function1) {
        int length = iArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Integer.valueOf(i3)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final boolean O1(boolean[] zArr) {
        return zArr[0];
    }

    @InlineOnly
    private static final <T> T O2(T[] tArr, int i2, Function1<? super Integer, ? extends T> function1) {
        return (i2 < 0 || i2 > getLastIndex(tArr)) ? function1.invoke(Integer.valueOf(i2)) : tArr[i2];
    }

    @InlineOnly
    private static final byte O3(byte[] bArr, int i2, Function1<? super Integer, Byte> function1) {
        return (i2 < 0 || i2 > getLastIndex(bArr)) ? function1.invoke(Integer.valueOf(i2)).byteValue() : bArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R O4(short[] sArr, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double O5(long[] jArr, Function1<? super Long, Double> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Long.valueOf(jArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R O6(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> O7(char[] cArr, R r, Function2<? super R, ? super Character, ? extends R> function2) {
        int i2 = 0;
        if (cArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            r = function2.invoke(r, Character.valueOf(c2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double O8(long[] jArr, Function1<? super Long, Double> function1) {
        int length = jArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Long.valueOf(j)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final byte P1(byte[] bArr) {
        return bArr[1];
    }

    @InlineOnly
    private static final short P2(short[] sArr, int i2, Function1<? super Integer, Short> function1) {
        return (i2 < 0 || i2 > getLastIndex(sArr)) ? function1.invoke(Integer.valueOf(i2)).shortValue() : sArr[i2];
    }

    @InlineOnly
    private static final char P3(char[] cArr, int i2, Function1<? super Integer, Character> function1) {
        return (i2 < 0 || i2 > getLastIndex(cArr)) ? function1.invoke(Integer.valueOf(i2)).charValue() : cArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R P4(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double P5(T[] tArr, Function1<? super T, Double> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(tArr[i2]).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R P6(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> P7(double[] dArr, R r, Function2<? super R, ? super Double, ? extends R> function2) {
        int i2 = 0;
        if (dArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            r = function2.invoke(r, Double.valueOf(d2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final <T> double P8(T[] tArr, Function1<? super T, Double> function1) {
        int length = tArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            dDoubleValue += function1.invoke(t).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final char Q1(char[] cArr) {
        return cArr[1];
    }

    @InlineOnly
    private static final boolean Q2(boolean[] zArr, int i2, Function1<? super Integer, Boolean> function1) {
        return (i2 < 0 || i2 > getLastIndex(zArr)) ? function1.invoke(Integer.valueOf(i2)).booleanValue() : zArr[i2];
    }

    @InlineOnly
    private static final double Q3(double[] dArr, int i2, Function1<? super Integer, Double> function1) {
        return (i2 < 0 || i2 > getLastIndex(dArr)) ? function1.invoke(Integer.valueOf(i2)).doubleValue() : dArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R Q4(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double Q5(short[] sArr, Function1<? super Short, Double> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Short.valueOf(sArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R Q6(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> Q7(float[] fArr, R r, Function2<? super R, ? super Float, ? extends R> function2) {
        int i2 = 0;
        if (fArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            r = function2.invoke(r, Float.valueOf(f2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double Q8(short[] sArr, Function1<? super Short, Double> function1) {
        int length = sArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Short.valueOf(s)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final double R1(double[] dArr) {
        return dArr[1];
    }

    @InlineOnly
    private static final Boolean R2(boolean[] zArr, int i2) {
        return getOrNull(zArr, i2);
    }

    @InlineOnly
    private static final float R3(float[] fArr, int i2, Function1<? super Integer, Float> function1) {
        return (i2 < 0 || i2 > getLastIndex(fArr)) ? function1.invoke(Integer.valueOf(i2)).floatValue() : fArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R R4(char[] cArr, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double R5(boolean[] zArr, Function1<? super Boolean, Double> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R R6(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> R7(int[] iArr, R r, Function2<? super R, ? super Integer, ? extends R> function2) {
        int i2 = 0;
        if (iArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            r = function2.invoke(r, Integer.valueOf(i3));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double R8(boolean[] zArr, Function1<? super Boolean, Double> function1) {
        int length = zArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return dDoubleValue;
    }

    @InlineOnly
    private static final float S1(float[] fArr) {
        return fArr[1];
    }

    @InlineOnly
    private static final Byte S2(byte[] bArr, int i2) {
        return getOrNull(bArr, i2);
    }

    @InlineOnly
    private static final int S3(int[] iArr, int i2, Function1<? super Integer, Integer> function1) {
        return (i2 < 0 || i2 > getLastIndex(iArr)) ? function1.invoke(Integer.valueOf(i2)).intValue() : iArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R S4(double[] dArr, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float S5(byte[] bArr, Function1<? super Byte, Float> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Byte.valueOf(bArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R S6(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> S7(long[] jArr, R r, Function2<? super R, ? super Long, ? extends R> function2) {
        int i2 = 0;
        if (jArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            r = function2.invoke(r, Long.valueOf(j));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int S8(byte[] bArr, Function1<? super Byte, Integer> function1) {
        int length = bArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            iIntValue += function1.invoke(Byte.valueOf(b2)).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final int T1(int[] iArr) {
        return iArr[1];
    }

    @InlineOnly
    private static final Character T2(char[] cArr, int i2) {
        return getOrNull(cArr, i2);
    }

    @InlineOnly
    private static final long T3(long[] jArr, int i2, Function1<? super Integer, Long> function1) {
        return (i2 < 0 || i2 > getLastIndex(jArr)) ? function1.invoke(Integer.valueOf(i2)).longValue() : jArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R T4(float[] fArr, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float T5(char[] cArr, Function1<? super Character, Float> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Character.valueOf(cArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R T6(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> T7(short[] sArr, R r, Function2<? super R, ? super Short, ? extends R> function2) {
        int i2 = 0;
        if (sArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            r = function2.invoke(r, Short.valueOf(s));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int T8(char[] cArr, Function1<? super Character, Integer> function1) {
        int length = cArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            iIntValue += function1.invoke(Character.valueOf(c2)).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final long U1(long[] jArr) {
        return jArr[1];
    }

    @InlineOnly
    private static final Double U2(double[] dArr, int i2) {
        return getOrNull(dArr, i2);
    }

    @InlineOnly
    private static final <T> T U3(T[] tArr, int i2, Function1<? super Integer, ? extends T> function1) {
        return (i2 < 0 || i2 > getLastIndex(tArr)) ? function1.invoke(Integer.valueOf(i2)) : tArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R U4(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float U5(double[] dArr, Function1<? super Double, Float> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Double.valueOf(dArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R U6(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> U7(boolean[] zArr, R r, Function2<? super R, ? super Boolean, ? extends R> function2) {
        int i2 = 0;
        if (zArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            r = function2.invoke(r, Boolean.valueOf(z));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int U8(double[] dArr, Function1<? super Double, Integer> function1) {
        int length = dArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            iIntValue += function1.invoke(Double.valueOf(d2)).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final <T> T V1(T[] tArr) {
        return tArr[1];
    }

    @InlineOnly
    private static final Float V2(float[] fArr, int i2) {
        return getOrNull(fArr, i2);
    }

    @InlineOnly
    private static final short V3(short[] sArr, int i2, Function1<? super Integer, Short> function1) {
        return (i2 < 0 || i2 > getLastIndex(sArr)) ? function1.invoke(Integer.valueOf(i2)).shortValue() : sArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R V4(long[] jArr, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float V5(float[] fArr, Function1<? super Float, Float> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Float.valueOf(fArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R V6(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> V7(byte[] bArr, R r, Function3<? super Integer, ? super R, ? super Byte, ? extends R> function3) {
        if (bArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Byte.valueOf(bArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int V8(float[] fArr, Function1<? super Float, Integer> function1) {
        int length = fArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            iIntValue += function1.invoke(Float.valueOf(f2)).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final short W1(short[] sArr) {
        return sArr[1];
    }

    @InlineOnly
    private static final Integer W2(int[] iArr, int i2) {
        return getOrNull(iArr, i2);
    }

    @InlineOnly
    private static final boolean W3(boolean[] zArr, int i2, Function1<? super Integer, Boolean> function1) {
        return (i2 < 0 || i2 > getLastIndex(zArr)) ? function1.invoke(Integer.valueOf(i2)).booleanValue() : zArr[i2];
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R W4(T[] tArr, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float W5(int[] iArr, Function1<? super Integer, Float> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Integer.valueOf(iArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R W6(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> W7(char[] cArr, R r, Function3<? super Integer, ? super R, ? super Character, ? extends R> function3) {
        if (cArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Character.valueOf(cArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int W8(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            iIntValue += function1.invoke(Integer.valueOf(i3)).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final boolean X1(boolean[] zArr) {
        return zArr[1];
    }

    @InlineOnly
    private static final Long X2(long[] jArr, int i2) {
        return getOrNull(jArr, i2);
    }

    @InlineOnly
    private static final boolean X3(byte[] bArr) {
        return bArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R X4(short[] sArr, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float X5(long[] jArr, Function1<? super Long, Float> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Long.valueOf(jArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R X6(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> X7(double[] dArr, R r, Function3<? super Integer, ? super R, ? super Double, ? extends R> function3) {
        if (dArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Double.valueOf(dArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int X8(long[] jArr, Function1<? super Long, Integer> function1) {
        int length = jArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            iIntValue += function1.invoke(Long.valueOf(j)).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final byte Y1(byte[] bArr) {
        return bArr[2];
    }

    @InlineOnly
    private static final <T> T Y2(T[] tArr, int i2) {
        return (T) ArraysKt.getOrNull(tArr, i2);
    }

    @InlineOnly
    private static final boolean Y3(char[] cArr) {
        return cArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R Y4(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> float Y5(T[] tArr, Function1<? super T, Float> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(tArr[i2]).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R Y6(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> Y7(float[] fArr, R r, Function3<? super Integer, ? super R, ? super Float, ? extends R> function3) {
        if (fArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Float.valueOf(fArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final <T> int Y8(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            iIntValue += function1.invoke(t).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final char Z1(char[] cArr) {
        return cArr[2];
    }

    @InlineOnly
    private static final Short Z2(short[] sArr, int i2) {
        return getOrNull(sArr, i2);
    }

    @InlineOnly
    private static final boolean Z3(double[] dArr) {
        return dArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double Z4(byte[] bArr, Function1<? super Byte, Double> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float Z5(short[] sArr, Function1<? super Short, Float> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Short.valueOf(sArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R Z6(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> Z7(int[] iArr, R r, Function3<? super Integer, ? super R, ? super Integer, ? extends R> function3) {
        if (iArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Integer.valueOf(iArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int Z8(short[] sArr, Function1<? super Short, Integer> function1) {
        int length = sArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            iIntValue += function1.invoke(Short.valueOf(s)).intValue();
        }
        return iIntValue;
    }

    @InlineOnly
    private static final double a2(double[] dArr) {
        return dArr[2];
    }

    @InlineOnly
    private static final Boolean a3(boolean[] zArr, Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean a4(float[] fArr) {
        return fArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double a5(char[] cArr, Function1<? super Character, Double> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Character.valueOf(cArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float a6(boolean[] zArr, Function1<? super Boolean, Float> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R a7(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> a8(long[] jArr, R r, Function3<? super Integer, ? super R, ? super Long, ? extends R> function3) {
        if (jArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Long.valueOf(jArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int a9(boolean[] zArr, Function1<? super Boolean, Integer> function1) {
        int length = zArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            iIntValue += function1.invoke(Boolean.valueOf(z)).intValue();
        }
        return iIntValue;
    }

    public static final <T> boolean all(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (!function1.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull T[] tArr) {
        return !(tArr.length == 0);
    }

    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull T[] tArr) {
        return tArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(tArr);
    }

    @NotNull
    public static <T> Sequence<T> asSequence(@NotNull final T[] tArr) {
        return tArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<T>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(tArr.length), 16));
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            a04 a04Var = tArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(a04Var);
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(tArr.length), 16));
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(t), t);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull T[] tArr, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            m.put(function1.invoke(t), t);
        }
        return m;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull T[] tArr, @NotNull M m, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(t);
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <K, V> Map<K, V> associateWith(@NotNull K[] kArr, @NotNull Function1<? super K, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(kArr.length), 16));
        int length = kArr.length;
        int i2 = 0;
        while (i2 < length) {
            K k = kArr[i2];
            i2++;
            linkedHashMap.put(k, function1.invoke(k));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull K[] kArr, @NotNull M m, @NotNull Function1<? super K, ? extends V> function1) {
        int length = kArr.length;
        int i2 = 0;
        while (i2 < length) {
            K k = kArr[i2];
            i2++;
            m.put(k, function1.invoke(k));
        }
        return m;
    }

    public static final double average(@NotNull byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            d2 += (double) b2;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            byte bByteValue = bArr[i2].byteValue();
            i2++;
            d2 += (double) bByteValue;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Double[] dArr) {
        int length = dArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            double dDoubleValue = dArr[i2].doubleValue();
            i2++;
            d2 += dDoubleValue;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Float[] fArr) {
        int length = fArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            float fFloatValue = fArr[i2].floatValue();
            i2++;
            d2 += (double) fFloatValue;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Integer[] numArr) {
        int length = numArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            int iIntValue = numArr[i2].intValue();
            i2++;
            d2 += (double) iIntValue;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Long[] lArr) {
        int length = lArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            long jLongValue = lArr[i2].longValue();
            i2++;
            d2 += jLongValue;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Short[] shArr) {
        int length = shArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            short sShortValue = shArr[i2].shortValue();
            i2++;
            d2 += (double) sShortValue;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @InlineOnly
    private static final float b2(float[] fArr) {
        return fArr[2];
    }

    @InlineOnly
    private static final Byte b3(byte[] bArr, Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean b4(int[] iArr) {
        return iArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double b5(double[] dArr, Function1<? super Double, Double> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Double.valueOf(dArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R b6(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R b7(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> b8(short[] sArr, R r, Function3<? super Integer, ? super R, ? super Short, ? extends R> function3) {
        if (sArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Short.valueOf(sArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long b9(byte[] bArr, Function1<? super Byte, Long> function1) {
        int length = bArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            jLongValue += function1.invoke(Byte.valueOf(b2)).longValue();
        }
        return jLongValue;
    }

    @InlineOnly
    private static final int c2(int[] iArr) {
        return iArr[2];
    }

    @InlineOnly
    private static final Character c3(char[] cArr, Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean c4(long[] jArr) {
        return jArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double c5(float[] fArr, Function1<? super Float, Double> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Float.valueOf(fArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R c6(char[] cArr, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R c7(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> c8(boolean[] zArr, R r, Function3<? super Integer, ? super R, ? super Boolean, ? extends R> function3) {
        if (zArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, Boolean.valueOf(zArr[i2]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long c9(char[] cArr, Function1<? super Character, Long> function1) {
        int length = cArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            jLongValue += function1.invoke(Character.valueOf(c2)).longValue();
        }
        return jLongValue;
    }

    public static <T> boolean contains(@NotNull T[] tArr, T t) {
        return indexOf(tArr, t) >= 0;
    }

    public static final <T> int count(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @InlineOnly
    private static final long d2(long[] jArr) {
        return jArr[2];
    }

    @InlineOnly
    private static final Double d3(double[] dArr, Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> boolean d4(T[] tArr) {
        return tArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double d5(int[] iArr, Function1<? super Integer, Double> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R d6(double[] dArr, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte[] d7(byte[] bArr, Function1<? super Byte, Unit> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            function1.invoke(Byte.valueOf(b2));
        }
        return bArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Byte> d8(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> function2) {
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            bByteValue = function2.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long d9(double[] dArr, Function1<? super Double, Long> function1) {
        int length = dArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            jLongValue += function1.invoke(Double.valueOf(d2)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <T> List<T> distinct(@NotNull T[] tArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(tArr));
    }

    @NotNull
    public static final <T, K> List<T> distinctBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> drop(@NotNull T[] tArr, int i2) {
        if (i2 >= 0) {
            return takeLast(tArr, kotlin.ranges.e.coerceAtLeast(tArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLast(@NotNull T[] tArr, int i2) {
        if (i2 >= 0) {
            return take(tArr, kotlin.ranges.e.coerceAtLeast(tArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int lastIndex = getLastIndex(tArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(tArr[lastIndex]).booleanValue()) {
                    return take(tArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <T> List<T> dropWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (z) {
                arrayList.add(t);
            } else if (!function1.invoke(t).booleanValue()) {
                arrayList.add(t);
                z = true;
            }
        }
        return arrayList;
    }

    @InlineOnly
    private static final <T> T e2(T[] tArr) {
        return tArr[2];
    }

    @InlineOnly
    private static final Float e3(float[] fArr, Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean e4(short[] sArr) {
        return sArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double e5(long[] jArr, Function1<? super Long, Double> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Long.valueOf(jArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R e6(float[] fArr, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final char[] e7(char[] cArr, Function1<? super Character, Unit> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            function1.invoke(Character.valueOf(c2));
        }
        return cArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Character> e8(char[] cArr, Function2<? super Character, ? super Character, Character> function2) {
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharValue = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(cCharValue));
        int length = cArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            cCharValue = function2.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
            arrayList.add(Character.valueOf(cCharValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long e9(float[] fArr, Function1<? super Float, Long> function1) {
        int length = fArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            jLongValue += function1.invoke(Float.valueOf(f2)).longValue();
        }
        return jLongValue;
    }

    @InlineOnly
    private static final short f2(short[] sArr) {
        return sArr[2];
    }

    @InlineOnly
    private static final Integer f3(int[] iArr, Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return Integer.valueOf(i3);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean f4(boolean[] zArr) {
        return zArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Double f5(T[] tArr, Function1<? super T, Double> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(tArr[i2]).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R f6(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final double[] f7(double[] dArr, Function1<? super Double, Unit> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            function1.invoke(Double.valueOf(d2));
        }
        return dArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Double> f8(double[] dArr, Function2<? super Double, ? super Double, Double> function2) {
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            dDoubleValue = function2.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long f9(int[] iArr, Function1<? super Integer, Long> function1) {
        int length = iArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            jLongValue += function1.invoke(Integer.valueOf(i3)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <T> List<T> filter(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> filterIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), t).booleanValue()) {
                arrayList.add(t);
            }
            i3 = i4;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), t).booleanValue()) {
                c2.add(t);
            }
            i3 = i4;
        }
        return c2;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C c2) {
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                c2.add(obj);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T> List<T> filterNot(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (!function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> filterNotNull(@NotNull T[] tArr) {
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull T[] tArr, @NotNull C c2) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (!function1.invoke(t).booleanValue()) {
                c2.add(t);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static <T> T first(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    @Nullable
    public static <T> T firstOrNull(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @NotNull
    public static final <T, R> List<R> flatMap(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(t));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequence")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> List<R> flatMapSequence(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(t));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapSequenceTo")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(t));
        }
        return c2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(t));
        }
        return c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R fold(@NotNull T[] tArr, R r, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            a04 a04Var = tArr[i2];
            i2++;
            r = function2.invoke(r, a04Var);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldIndexed(@NotNull T[] tArr, R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> function3) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            a04 a04Var = tArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, a04Var);
            i3++;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRight(@NotNull T[] tArr, R r, @NotNull Function2<? super T, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(tArr[lastIndex], r);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRightIndexed(@NotNull T[] tArr, R r, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r);
        }
        return r;
    }

    public static final <T> void forEach(@NotNull T[] tArr, @NotNull Function1<? super T, Unit> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            function1.invoke(t);
        }
    }

    public static final <T> void forEachIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), t);
            i3++;
        }
    }

    @InlineOnly
    private static final boolean g2(boolean[] zArr) {
        return zArr[2];
    }

    @InlineOnly
    private static final Long g3(long[] jArr, Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean g4(byte[] bArr) {
        return !(bArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double g5(short[] sArr, Function1<? super Short, Double> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Short.valueOf(sArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R g6(long[] jArr, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final float[] g7(float[] fArr, Function1<? super Float, Unit> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            function1.invoke(Float.valueOf(f2));
        }
        return fArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Float> g8(float[] fArr, Function2<? super Float, ? super Float, Float> function2) {
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            fFloatValue = function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long g9(long[] jArr, Function1<? super Long, Long> function1) {
        int length = jArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            jLongValue += function1.invoke(Long.valueOf(j)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <T> IntRange getIndices(@NotNull T[] tArr) {
        return new IntRange(0, getLastIndex(tArr));
    }

    public static <T> int getLastIndex(@NotNull T[] tArr) {
        return tArr.length - 1;
    }

    @Nullable
    public static <T> T getOrNull(@NotNull T[] tArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(tArr)) {
            return null;
        }
        return tArr[i2];
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            K kInvoke = function1.invoke(t);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull T[] tArr, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            K kInvoke = function1.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return m;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final T[] tArr, @NotNull final Function1<? super T, ? extends K> function1) {
        return new Grouping<T, K>() { // from class: kotlin.collections.ArraysKt___ArraysKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public K keyOf(T t) {
                return function1.invoke(t);
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<T> sourceIterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    @InlineOnly
    private static final byte h2(byte[] bArr) {
        return bArr[3];
    }

    @InlineOnly
    private static final <T> T h3(T[] tArr, Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean h4(char[] cArr) {
        return !(cArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double h5(boolean[] zArr, Function1<? super Boolean, Double> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R h6(T[] tArr, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int[] h7(int[] iArr, Function1<? super Integer, Unit> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            function1.invoke(Integer.valueOf(i3));
        }
        return iArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Integer> h8(int[] iArr, Function2<? super Integer, ? super Integer, Integer> function2) {
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            iIntValue = function2.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final <T> long h9(T[] tArr, Function1<? super T, Long> function1) {
        int length = tArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            jLongValue += function1.invoke(t).longValue();
        }
        return jLongValue;
    }

    @InlineOnly
    private static final char i2(char[] cArr) {
        return cArr[3];
    }

    @InlineOnly
    private static final Short i3(short[] sArr, Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean i4(double[] dArr) {
        return !(dArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float i5(byte[] bArr, Function1<? super Byte, Float> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Byte.valueOf(bArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R i6(short[] sArr, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long[] i7(long[] jArr, Function1<? super Long, Unit> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            function1.invoke(Long.valueOf(j));
        }
        return jArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Long> i8(long[] jArr, Function2<? super Long, ? super Long, Long> function2) {
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            jLongValue = function2.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long i9(short[] sArr, Function1<? super Short, Long> function1) {
        int length = sArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            jLongValue += function1.invoke(Short.valueOf(s)).longValue();
        }
        return jLongValue;
    }

    public static <T> int indexOf(@NotNull T[] tArr, T t) {
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (tArr[i2] == null) {
                    return i2;
                }
                i2 = i3;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            int i4 = i2 + 1;
            if (Intrinsics.areEqual(t, tArr[i2])) {
                return i2;
            }
            i2 = i4;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(tArr[i2]).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <T> Set<T> intersect(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        Set<T> mutableSet = toMutableSet(tArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @InlineOnly
    private static final double j2(double[] dArr) {
        return dArr[3];
    }

    @InlineOnly
    private static final Boolean j3(boolean[] zArr, Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                boolean z = zArr[length];
                if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                    return Boolean.valueOf(z);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean j4(float[] fArr) {
        return !(fArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float j5(char[] cArr, Function1<? super Character, Float> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Character.valueOf(cArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R j6(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> T[] j7(T[] tArr, Function1<? super T, Unit> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            function1.invoke(t);
        }
        return tArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Short> j8(short[] sArr, Function2<? super Short, ? super Short, Short> function2) {
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sShortValue = function2.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long j9(boolean[] zArr, Function1<? super Boolean, Long> function1) {
        int length = zArr.length;
        long jLongValue = 0;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            jLongValue += function1.invoke(Boolean.valueOf(z)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull T[] tArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = tArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            T t = tArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            kotlin.text.e.appendElement(a2, t, function1);
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @NotNull
    public static final <T> String joinToString(@NotNull T[] tArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(objArr, charSequence, charSequence5, charSequence6, i4, charSequence7, function1);
    }

    @InlineOnly
    private static final float k2(float[] fArr) {
        return fArr[3];
    }

    @InlineOnly
    private static final Byte k3(byte[] bArr, Function1<? super Byte, Boolean> function1) {
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                byte b2 = bArr[length];
                if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                    return Byte.valueOf(b2);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean k4(int[] iArr) {
        return !(iArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float k5(double[] dArr, Function1<? super Double, Float> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Double.valueOf(dArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R k6(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short[] k7(short[] sArr, Function1<? super Short, Unit> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            function1.invoke(Short.valueOf(s));
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Boolean> k8(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> function2) {
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean zBooleanValue = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(zBooleanValue));
        int length = zArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            zBooleanValue = function2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
            arrayList.add(Boolean.valueOf(zBooleanValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int k9(byte[] bArr, Function1<? super Byte, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = bArr.length;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Byte.valueOf(b2)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @InlineOnly
    private static final int l2(int[] iArr) {
        return iArr[3];
    }

    @InlineOnly
    private static final Character l3(char[] cArr, Function1<? super Character, Boolean> function1) {
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char c2 = cArr[length];
                if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                    return Character.valueOf(c2);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean l4(long[] jArr) {
        return !(jArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float l5(float[] fArr, Function1<? super Float, Float> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Float.valueOf(fArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R l6(char[] cArr, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean[] l7(boolean[] zArr, Function1<? super Boolean, Unit> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            function1.invoke(Boolean.valueOf(z));
        }
        return zArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Byte> l8(byte[] bArr, Function3<? super Integer, ? super Byte, ? super Byte, Byte> function3) {
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            bByteValue = function3.invoke(Integer.valueOf(i2), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int l9(char[] cArr, Function1<? super Character, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = cArr.length;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Character.valueOf(c2)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    public static <T> T last(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[getLastIndex(tArr)];
    }

    public static <T> int lastIndexOf(@NotNull T[] tArr, T t) {
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i2 >= 0) {
                        length = i2;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (Intrinsics.areEqual(t, tArr[length2])) {
                        return length2;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static <T> T lastOrNull(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @InlineOnly
    private static final long m2(long[] jArr) {
        return jArr[3];
    }

    @InlineOnly
    private static final Double m3(double[] dArr, Function1<? super Double, Boolean> function1) {
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                double d2 = dArr[length];
                if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                    return Double.valueOf(d2);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> boolean m4(T[] tArr) {
        return !(tArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float m5(int[] iArr, Function1<? super Integer, Float> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Integer.valueOf(iArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R m6(double[] dArr, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte[] m7(byte[] bArr, Function2<? super Integer, ? super Byte, Unit> function2) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2));
            i3++;
        }
        return bArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Character> m8(char[] cArr, Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char cCharValue = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(cCharValue));
        int length = cArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            cCharValue = function3.invoke(Integer.valueOf(i2), Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
            arrayList.add(Character.valueOf(cCharValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int m9(double[] dArr, Function1<? super Double, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = dArr.length;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Double.valueOf(d2)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @NotNull
    public static <T, R> List<R> map(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            arrayList.add(function1.invoke(t));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), t));
            i3++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexedNotNull(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            int i4 = i3 + 1;
            R rInvoke = function2.invoke(Integer.valueOf(i3), t);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i3 = i4;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            int i4 = i3 + 1;
            R rInvoke = function2.invoke(Integer.valueOf(i3), t);
            if (rInvoke != null) {
                c2.add(rInvoke);
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), t));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <T, R> List<R> mapNotNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            R rInvoke = function1.invoke(t);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function1<? super T, ? extends R> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            R rInvoke = function1.invoke(t);
            if (rInvoke != null) {
                c2.add(rInvoke);
            }
        }
        return c2;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull T[] tArr, @NotNull C c2, @NotNull Function1<? super T, ? extends R> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            c2.add(function1.invoke(t));
        }
        return c2;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(t);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    T t2 = tArr[i2];
                    R rInvoke2 = function1.invoke(t2);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t = t2;
                        rInvoke = rInvoke2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return t;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t;
        }
        R rInvoke = function1.invoke(t);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                T t2 = tArr[i2];
                R rInvoke2 = function1.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return t;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull Double[] dArr) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, dArr[i2].doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T maxWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                T t2 = tArr[i2];
                if (comparator.compare(t, t2) < 0) {
                    t = t2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return t;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(t);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    T t2 = tArr[i2];
                    R rInvoke2 = function1.invoke(t2);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t = t2;
                        rInvoke = rInvoke2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return t;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t;
        }
        R rInvoke = function1.invoke(t);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                T t2 = tArr[i2];
                R rInvoke2 = function1.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return t;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull Double[] dArr) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, dArr[i2].doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T minWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                T t2 = tArr[i2];
                if (comparator.compare(t, t2) > 0) {
                    t = t2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return t;
    }

    @InlineOnly
    private static final <T> T n2(T[] tArr) {
        return tArr[3];
    }

    @InlineOnly
    private static final Float n3(float[] fArr, Function1<? super Float, Boolean> function1) {
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                float f2 = fArr[length];
                if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                    return Float.valueOf(f2);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean n4(short[] sArr) {
        return !(sArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float n5(long[] jArr, Function1<? super Long, Float> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Long.valueOf(jArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R n6(float[] fArr, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final char[] n7(char[] cArr, Function2<? super Integer, ? super Character, Unit> function2) {
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Character.valueOf(c2));
            i3++;
        }
        return cArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Double> n8(double[] dArr, Function3<? super Integer, ? super Double, ? super Double, Double> function3) {
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            dDoubleValue = function3.invoke(Integer.valueOf(i2), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int n9(float[] fArr, Function1<? super Float, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = fArr.length;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Float.valueOf(f2)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    public static final <T> boolean none(@NotNull T[] tArr) {
        return tArr.length == 0;
    }

    @InlineOnly
    private static final short o2(short[] sArr) {
        return sArr[3];
    }

    @InlineOnly
    private static final Integer o3(int[] iArr, Function1<? super Integer, Boolean> function1) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                int i3 = iArr[length];
                if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                    return Integer.valueOf(i3);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @InlineOnly
    private static final boolean o4(boolean[] zArr) {
        return !(zArr.length == 0);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Float o5(T[] tArr, Function1<? super T, Float> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(tArr[i2]).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R o6(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final double[] o7(double[] dArr, Function2<? super Integer, ? super Double, Unit> function2) {
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Double.valueOf(d2));
            i3++;
        }
        return dArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Float> o8(float[] fArr, Function3<? super Integer, ? super Float, ? super Float, Float> function3) {
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            fFloatValue = function3.invoke(Integer.valueOf(i2), Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int o9(int[] iArr, Function1<? super Integer, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = iArr.length;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Integer.valueOf(i3)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @InlineOnly
    private static final boolean p2(boolean[] zArr) {
        return zArr[3];
    }

    @InlineOnly
    private static final Long p3(long[] jArr, Function1<? super Long, Boolean> function1) {
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                long j = jArr[length];
                if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                    return Long.valueOf(j);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double p4(byte[] bArr, Function1<? super Byte, Double> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float p5(short[] sArr, Function1<? super Short, Float> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Short.valueOf(sArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R p6(long[] jArr, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final float[] p7(float[] fArr, Function2<? super Integer, ? super Float, Unit> function2) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Float.valueOf(f2));
            i3++;
        }
        return fArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Integer> p8(int[] iArr, Function3<? super Integer, ? super Integer, ? super Integer, Integer> function3) {
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            iIntValue = function3.invoke(Integer.valueOf(i2), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int p9(long[] jArr, Function1<? super Long, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = jArr.length;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Long.valueOf(j)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Byte, V> q1(byte[] bArr, Function1<? super Byte, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(bArr.length), 16));
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            linkedHashMap.put(Byte.valueOf(b2), function1.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final byte q2(byte[] bArr) {
        return bArr[4];
    }

    @InlineOnly
    private static final <T> T q3(T[] tArr, Function1<? super T, Boolean> function1) {
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                T t = tArr[length];
                if (function1.invoke(t).booleanValue()) {
                    return t;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double q4(char[] cArr, Function1<? super Character, Double> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Character.valueOf(cArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Float q5(boolean[] zArr, Function1<? super Boolean, Float> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = function1.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Boolean.valueOf(zArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R q6(T[] tArr, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int[] q7(int[] iArr, Function2<? super Integer, ? super Integer, Unit> function2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4));
            i3++;
        }
        return iArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Long> q8(long[] jArr, Function3<? super Integer, ? super Long, ? super Long, Long> function3) {
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            jLongValue = function3.invoke(Integer.valueOf(i2), Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> int q9(T[] tArr, Function1<? super T, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = tArr.length;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(t).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Character, V> r1(char[] cArr, Function1<? super Character, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(kotlin.ranges.e.coerceAtMost(cArr.length, 128)), 16));
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            linkedHashMap.put(Character.valueOf(c2), function1.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final char r2(char[] cArr) {
        return cArr[4];
    }

    @InlineOnly
    private static final Short r3(short[] sArr, Function1<? super Short, Boolean> function1) {
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                short s = sArr[length];
                if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                    return Short.valueOf(s);
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double r4(double[] dArr, Function1<? super Double, Double> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Double.valueOf(dArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R r5(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Byte.valueOf(bArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R r6(short[] sArr, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long[] r7(long[] jArr, Function2<? super Integer, ? super Long, Unit> function2) {
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Long.valueOf(j));
            i3++;
        }
        return jArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Short> r8(short[] sArr, Function3<? super Integer, ? super Short, ? super Short, Short> function3) {
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sShortValue = function3.invoke(Integer.valueOf(i2), Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int r9(short[] sArr, Function1<? super Short, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = sArr.length;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Short.valueOf(s)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    public static final <T> T random(@NotNull T[] tArr, @NotNull Random random) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[random.nextInt(tArr.length)];
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <T> T randomOrNull(@NotNull T[] tArr, @NotNull Random random) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    public static final <S, T extends S> S reduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                sInvoke = function2.invoke(sInvoke, (Object) tArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> function3) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                sInvoke = function3.invoke(Integer.valueOf(i2), sInvoke, (Object) tArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return sInvoke;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> function3) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                sInvoke = function3.invoke(Integer.valueOf(i2), sInvoke, (Object) tArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return sInvoke;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceOrNull(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                sInvoke = function2.invoke(sInvoke, (Object) tArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRight(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> function2) {
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            sInvoke = function2.invoke((Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRightIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> function3) {
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            sInvoke = function3.invoke(Integer.valueOf(i2), (Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceRightIndexedOrNull(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super T, ? super S, ? extends S> function3) {
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            sInvoke = function3.invoke(Integer.valueOf(i2), (Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceRightOrNull(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> function2) {
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            sInvoke = function2.invoke((Object) tArr[i2], sInvoke);
        }
        return sInvoke;
    }

    @NotNull
    public static final <T> T[] requireNoNulls(@NotNull T[] tArr) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (t == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    public static <T> void reverse(@NotNull T[] tArr) {
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            T t = tArr[i2];
            tArr[i2] = tArr[lastIndex];
            tArr[lastIndex] = t;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @NotNull
    public static <T> List<T> reversed(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final <T> T[] reversedArray(@NotNull T[] tArr) {
        int i2 = 0;
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) kotlin.collections.b.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                tArr2[lastIndex - i2] = tArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return tArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFold(@NotNull T[] tArr, R r, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        int i2 = 0;
        if (tArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        while (i2 < length) {
            a04 a04Var = tArr[i2];
            i2++;
            r = function2.invoke(r, a04Var);
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFoldIndexed(@NotNull T[] tArr, R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> function3) {
        if (tArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, tArr[i2]);
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <S, T extends S> List<S> runningReduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sInvoke = function2.invoke(sInvoke, (Object) tArr[i2]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> runningReduceIndexed(@NotNull T[] tArr, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> function3) {
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            sInvoke = function3.invoke(Integer.valueOf(i2), sInvoke, (Object) tArr[i2]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Double, V> s1(double[] dArr, Function1<? super Double, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(dArr.length), 16));
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            linkedHashMap.put(Double.valueOf(d2), function1.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final double s2(double[] dArr) {
        return dArr[4];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:9:0x0012 A[RETURN] */
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R s3(T[] tArr, Function1<? super T, ? extends R> function1) {
        R rInvoke;
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            rInvoke = function1.invoke(t);
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double s4(float[] fArr, Function1<? super Float, Double> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Float.valueOf(fArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R s5(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Character.valueOf(cArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R s6(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> T[] s7(T[] tArr, Function2<? super Integer, ? super T, Unit> function2) {
        int length = tArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), t);
            i3++;
        }
        return tArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Boolean> s8(boolean[] zArr, Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> function3) {
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean zBooleanValue = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(zBooleanValue));
        int length = zArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            zBooleanValue = function3.invoke(Integer.valueOf(i2), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
            arrayList.add(Boolean.valueOf(zBooleanValue));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int s9(boolean[] zArr, Function1<? super Boolean, UInt> function1) {
        int i2 = 0;
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        int length = zArr.length;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(Boolean.valueOf(z)).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> List<R> scan(@NotNull T[] tArr, R r, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        int i2 = 0;
        if (tArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        while (i2 < length) {
            a04 a04Var = tArr[i2];
            i2++;
            r = function2.invoke(r, a04Var);
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> List<R> scanIndexed(@NotNull T[] tArr, R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> function3) {
        if (tArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r = function3.invoke(Integer.valueOf(i2), r, tArr[i2]);
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr) {
        shuffle(tArr, Random.Default);
    }

    public static <T> T single(@NotNull T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static <T> T singleOrNull(@NotNull T[] tArr) {
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    public static <T> List<T> slice(@NotNull T[] tArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt.copyOfRange(tArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull Collection<Integer> collection) {
        T[] tArr2 = (T[]) kotlin.collections.b.arrayOfNulls(tArr, collection.size());
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            tArr2[i2] = tArr[it2.next().intValue()];
            i2++;
        }
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
        }
    }

    public static <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr) {
        ArraysKt___ArraysJvmKt.sortWith(tArr, ComparisonsKt__ComparisonsKt.reverseOrder());
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sorted(@NotNull T[] tArr) {
        return ArraysKt___ArraysJvmKt.asList(sortedArray(tArr));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArray(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Comparable[]) Arrays.copyOf(tArr, tArr.length));
        ArraysKt___ArraysJvmKt.sort(tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Comparable[]) Arrays.copyOf(tArr, tArr.length));
        ArraysKt___ArraysJvmKt.sortWith(tArr2, ComparisonsKt__ComparisonsKt.reverseOrder());
        return tArr2;
    }

    @NotNull
    public static final <T> T[] sortedArrayWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        ArraysKt___ArraysJvmKt.sortWith(tArr2, comparator);
        return tArr2;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        return sortedWith(tArr, new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> function1) {
        return sortedWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sortedDescending(@NotNull T[] tArr) {
        return sortedWith(tArr, ComparisonsKt__ComparisonsKt.reverseOrder());
    }

    @NotNull
    public static <T> List<T> sortedWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        return ArraysKt___ArraysJvmKt.asList(sortedArrayWith(tArr, comparator));
    }

    @NotNull
    public static final <T> Set<T> subtract(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        Set<T> mutableSet = toMutableSet(tArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final int sum(@NotNull byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            i3 += b2;
        }
        return i3;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(@NotNull T[] tArr, @NotNull Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            iIntValue += function1.invoke(t).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double sumByDouble(@NotNull T[] tArr, @NotNull Function1<? super T, Double> function1) {
        int length = tArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            dDoubleValue += function1.invoke(t).doubleValue();
        }
        return dDoubleValue;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte bByteValue = bArr[i2].byteValue();
            i2++;
            i3 += bByteValue;
        }
        return i3;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Double[] dArr) {
        int length = dArr.length;
        double d2 = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            double dDoubleValue = dArr[i2].doubleValue();
            i2++;
            d2 += dDoubleValue;
        }
        return d2;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Float[] fArr) {
        int length = fArr.length;
        float f2 = 0.0f;
        int i2 = 0;
        while (i2 < length) {
            float fFloatValue = fArr[i2].floatValue();
            i2++;
            f2 += fFloatValue;
        }
        return f2;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Integer[] numArr) {
        int length = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int iIntValue = numArr[i2].intValue();
            i2++;
            i3 += iIntValue;
        }
        return i3;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Long[] lArr) {
        int length = lArr.length;
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            long jLongValue = lArr[i2].longValue();
            i2++;
            j += jLongValue;
        }
        return j;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Short[] shArr) {
        int length = shArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short sShortValue = shArr[i2].shortValue();
            i2++;
            i3 += sShortValue;
        }
        return i3;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Float, V> t1(float[] fArr, Function1<? super Float, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(fArr.length), 16));
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            linkedHashMap.put(Float.valueOf(f2), function1.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final float t2(float[] fArr) {
        return fArr[4];
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R t3(T[] tArr, Function1<? super T, ? extends R> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            R rInvoke = function1.invoke(t);
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double t4(int[] iArr, Function1<? super Integer, Double> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R t5(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Double.valueOf(dArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double t6(byte[] bArr, Function1<? super Byte, Double> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Byte.valueOf(bArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short[] t7(short[] sArr, Function2<? super Integer, ? super Short, Unit> function2) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Short.valueOf(s));
            i3++;
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> t8(byte[] bArr, R r, Function2<? super R, ? super Byte, ? extends R> function2) {
        int i2 = 0;
        if (bArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            r = function2.invoke(r, Byte.valueOf(b2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long t9(byte[] bArr, Function1<? super Byte, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = bArr.length;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Byte.valueOf(b2)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @NotNull
    public static final <T> List<T> take(@NotNull T[] tArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= tArr.length) {
            return toList(tArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = tArr.length;
        int i4 = 0;
        while (i3 < length) {
            T t = tArr[i3];
            i3++;
            arrayList.add(t);
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> takeLast(@NotNull T[] tArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = tArr.length;
        if (i2 >= length) {
            return toList(tArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(tArr[i3]);
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> takeLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int lastIndex = getLastIndex(tArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(tArr[lastIndex]).booleanValue()) {
                    return drop(tArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(tArr);
    }

    @NotNull
    public static final <T> List<T> takeWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (!function1.invoke(t).booleanValue()) {
                break;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    @NotNull
    public static boolean[] toBooleanArray(@NotNull Boolean[] boolArr) {
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = boolArr[i2].booleanValue();
        }
        return zArr;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = bArr[i2].byteValue();
        }
        return bArr2;
    }

    @NotNull
    public static final char[] toCharArray(@NotNull Character[] chArr) {
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = chArr[i2].charValue();
        }
        return cArr;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull T[] tArr, @NotNull C c2) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            c2.add(t);
        }
        return c2;
    }

    @NotNull
    public static final double[] toDoubleArray(@NotNull Double[] dArr) {
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr2[i2] = dArr[i2].doubleValue();
        }
        return dArr2;
    }

    @NotNull
    public static final float[] toFloatArray(@NotNull Float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = fArr[i2].floatValue();
        }
        return fArr2;
    }

    @NotNull
    public static <T> HashSet<T> toHashSet(@NotNull T[] tArr) {
        return (HashSet) toCollection(tArr, new HashSet(q.mapCapacity(tArr.length)));
    }

    @NotNull
    public static int[] toIntArray(@NotNull Integer[] numArr) {
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    @NotNull
    public static <T> List<T> toList(@NotNull T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? toMutableList(tArr) : kotlin.collections.e.listOf(tArr[0]);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final long[] toLongArray(@NotNull Long[] lArr) {
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = lArr[i2].longValue();
        }
        return jArr;
    }

    @NotNull
    public static <T> List<T> toMutableList(@NotNull T[] tArr) {
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(tArr));
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull T[] tArr) {
        return (Set) toCollection(tArr, new LinkedHashSet(q.mapCapacity(tArr.length)));
    }

    @NotNull
    public static <T> Set<T> toSet(@NotNull T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) toCollection(tArr, new LinkedHashSet(q.mapCapacity(tArr.length))) : x.setOf(tArr[0]);
        }
        return y.emptySet();
    }

    @NotNull
    public static final short[] toShortArray(@NotNull Short[] shArr) {
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr[i2] = shArr[i2].shortValue();
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Integer, V> u1(int[] iArr, Function1<? super Integer, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(iArr.length), 16));
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            linkedHashMap.put(Integer.valueOf(i3), function1.invoke(Integer.valueOf(i3)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final int u2(int[] iArr) {
        return iArr[4];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> u3(byte[] bArr, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double u4(long[] jArr, Function1<? super Long, Double> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Long.valueOf(jArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R u5(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Float.valueOf(fArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double u6(char[] cArr, Function1<? super Character, Double> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Character.valueOf(cArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean[] u7(boolean[] zArr, Function2<? super Integer, ? super Boolean, Unit> function2) {
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z));
            i3++;
        }
        return zArr;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> u8(char[] cArr, R r, Function2<? super R, ? super Character, ? extends R> function2) {
        int i2 = 0;
        if (cArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            r = function2.invoke(r, Character.valueOf(c2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long u9(char[] cArr, Function1<? super Character, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = cArr.length;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Character.valueOf(c2)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @NotNull
    public static final <T> Set<T> union(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        Set<T> mutableSet = toMutableSet(tArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Long, V> v1(long[] jArr, Function1<? super Long, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(jArr.length), 16));
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            linkedHashMap.put(Long.valueOf(j), function1.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final long v2(long[] jArr) {
        return jArr[4];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> v3(char[] cArr, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Character.valueOf(c2)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double v4(T[] tArr, Function1<? super T, Double> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(tArr[i2]).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R v5(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Integer.valueOf(iArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double v6(double[] dArr, Function1<? super Double, Double> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Double.valueOf(dArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final byte v7(byte[] bArr) {
        return random(bArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> v8(double[] dArr, R r, Function2<? super R, ? super Double, ? extends R> function2) {
        int i2 = 0;
        if (dArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            r = function2.invoke(r, Double.valueOf(d2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long v9(double[] dArr, Function1<? super Double, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = dArr.length;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Double.valueOf(d2)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Short, V> w1(short[] sArr, Function1<? super Short, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(sArr.length), 16));
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            linkedHashMap.put(Short.valueOf(s), function1.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final <T> T w2(T[] tArr) {
        return tArr[4];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> w3(double[] dArr, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Double.valueOf(d2)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double w4(short[] sArr, Function1<? super Short, Double> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Short.valueOf(sArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R w5(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Long.valueOf(jArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double w6(float[] fArr, Function1<? super Float, Double> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Float.valueOf(fArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char w7(char[] cArr) {
        return random(cArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> w8(float[] fArr, R r, Function2<? super R, ? super Float, ? extends R> function2) {
        int i2 = 0;
        if (fArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            r = function2.invoke(r, Float.valueOf(f2));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long w9(float[] fArr, Function1<? super Float, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = fArr.length;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Float.valueOf(f2)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @NotNull
    public static <T> Iterable<IndexedValue<T>> withIndex(@NotNull T[] tArr) {
        return new IndexingIterable(new a(tArr));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Boolean, V> x1(boolean[] zArr, Function1<? super Boolean, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(zArr.length), 16));
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            linkedHashMap.put(Boolean.valueOf(z), function1.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final short x2(short[] sArr) {
        return sArr[4];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> x3(float[] fArr, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Float.valueOf(f2)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double x4(boolean[] zArr, Function1<? super Boolean, Double> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(Boolean.valueOf(zArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R x5(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(tArr[i2]);
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double x6(int[] iArr, Function1<? super Integer, Double> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Integer.valueOf(iArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final double x7(double[] dArr) {
        return random(dArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> x8(int[] iArr, R r, Function2<? super R, ? super Integer, ? extends R> function2) {
        int i2 = 0;
        if (iArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            r = function2.invoke(r, Integer.valueOf(i3));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long x9(int[] iArr, Function1<? super Integer, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = iArr.length;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Integer.valueOf(i3)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Byte, ? super V>> M y1(byte[] bArr, M m, Function1<? super Byte, ? extends V> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            m.put(Byte.valueOf(b2), function1.invoke(Byte.valueOf(b2)));
        }
        return m;
    }

    @InlineOnly
    private static final boolean y2(boolean[] zArr) {
        return zArr[4];
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> y3(int[] iArr, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float y4(byte[] bArr, Function1<? super Byte, Float> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Byte.valueOf(bArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R y5(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Short.valueOf(sArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final Double y6(long[] jArr, Function1<? super Long, Double> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(Long.valueOf(jArr[i2])).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final float y7(float[] fArr) {
        return random(fArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> y8(long[] jArr, R r, Function2<? super R, ? super Long, ? extends R> function2) {
        int i2 = 0;
        if (jArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            r = function2.invoke(r, Long.valueOf(j));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long y9(long[] jArr, Function1<? super Long, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = jArr.length;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(Long.valueOf(j)).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Character, ? super V>> M z1(char[] cArr, M m, Function1<? super Character, ? extends V> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            m.put(Character.valueOf(c2), function1.invoke(Character.valueOf(c2)));
        }
        return m;
    }

    @InlineOnly
    private static final int z2(byte[] bArr) {
        return bArr.length;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> z3(long[] jArr, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function2.invoke(Integer.valueOf(i3), Long.valueOf(j)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final float z4(char[] cArr, Function1<? super Character, Float> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(Character.valueOf(cArr[i2])).floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R z5(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                R rInvoke2 = function1.invoke(Boolean.valueOf(zArr[i2]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> Double z6(T[] tArr, Function1<? super T, Double> function1) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = function1.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(tArr[i2]).doubleValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int z7(int[] iArr) {
        return random(iArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> z8(short[] sArr, R r, Function2<? super R, ? super Short, ? extends R> function2) {
        int i2 = 0;
        if (sArr.length == 0) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            r = function2.invoke(r, Short.valueOf(s));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> long z9(T[] tArr, Function1<? super T, ULong> function1) {
        int i2 = 0;
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        int length = tArr.length;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(t).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull R[] rArr, @NotNull Function2<? super T, ? super R, ? extends V> function2) {
        int iMin = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(tArr[i2], rArr[i2]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (!function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull byte[] bArr) {
        return !(bArr.length == 0);
    }

    public static final double average(@NotNull short[] sArr) {
        int length = sArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            d2 += (double) s;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    public static boolean contains(@NotNull byte[] bArr, byte b2) {
        return indexOf(bArr, b2) >= 0;
    }

    public static final int count(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static final List<Byte> distinct(@NotNull byte[] bArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(bArr));
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterNotTo(@NotNull byte[] bArr, @NotNull C c2, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (!function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                c2.add(Byte.valueOf(b2));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterTo(@NotNull byte[] bArr, @NotNull C c2, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                c2.add(Byte.valueOf(b2));
            }
        }
        return c2;
    }

    @Nullable
    public static Byte firstOrNull(@NotNull byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    public static final <R> R fold(@NotNull byte[] bArr, R r, @NotNull Function2<? super R, ? super Byte, ? extends R> function2) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            r = function2.invoke(r, Byte.valueOf(b2));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull byte[] bArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Byte, ? extends R> function3) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Byte.valueOf(b2));
            i3++;
        }
        return r;
    }

    public static final void forEach(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Unit> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            function1.invoke(Byte.valueOf(b2));
        }
    }

    public static final void forEachIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Unit> function2) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2));
            i3++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull byte[] bArr) {
        return new IntRange(0, getLastIndex(bArr));
    }

    public static int getLastIndex(@NotNull byte[] bArr) {
        return bArr.length - 1;
    }

    @Nullable
    public static Byte getOrNull(@NotNull byte[] bArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i2]);
    }

    @NotNull
    public static final String joinToString(@NotNull byte[] bArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Byte, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(bArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Byte, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final boolean none(@NotNull byte[] bArr) {
        return bArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr) {
        shuffle(bArr, (Random) Random.Default);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr) {
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull byte[] bArr) {
        if (bArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(bArr);
            reverse(bArr);
        }
    }

    @NotNull
    public static final List<Byte> sorted(@NotNull byte[] bArr) {
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> function1) {
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> function1) {
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Byte> sortedDescending(@NotNull byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        ArraysKt___ArraysJvmKt.sort(bArrCopyOf);
        return reversed(bArrCopyOf);
    }

    @NotNull
    public static final List<Byte> sortedWith(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final int sum(@NotNull short[] sArr) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            i3 += s;
        }
        return i3;
    }

    @NotNull
    public static final HashSet<Byte> toHashSet(@NotNull byte[] bArr) {
        return (HashSet) toCollection(bArr, new HashSet(q.mapCapacity(bArr.length)));
    }

    @NotNull
    public static List<Byte> toMutableList(@NotNull byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Byte> toMutableSet(@NotNull byte[] bArr) {
        return (Set) toCollection(bArr, new LinkedHashSet(q.mapCapacity(bArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Byte>> withIndex(@NotNull byte[] bArr) {
        return new IndexingIterable(new b(bArr));
    }

    public static final boolean all(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (!function1.invoke(Short.valueOf(s)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull short[] sArr) {
        return !(sArr.length == 0);
    }

    @NotNull
    public static Iterable<Byte> asIterable(@NotNull byte[] bArr) {
        return bArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(bArr);
    }

    @NotNull
    public static final Sequence<Byte> asSequence(@NotNull final byte[] bArr) {
        return bArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Byte>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Byte> iterator() {
                return ArrayIteratorsKt.iterator(bArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(@NotNull byte[] bArr, @NotNull M m, @NotNull Function1<? super Byte, ? extends K> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            m.put(function1.invoke(Byte.valueOf(b2)), Byte.valueOf(b2));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull byte[] bArr, @NotNull M m, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Byte.valueOf(b2));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    public static final double average(@NotNull int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            d2 += (double) i4;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    public static boolean contains(@NotNull short[] sArr, short s) {
        return indexOf(sArr, s) >= 0;
    }

    public static final int count(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static final List<Short> distinct(@NotNull short[] sArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(sArr));
    }

    @NotNull
    public static List<Byte> drop(@NotNull byte[] bArr, int i2) {
        if (i2 >= 0) {
            return takeLast(bArr, kotlin.ranges.e.coerceAtLeast(bArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> dropLast(@NotNull byte[] bArr, int i2) {
        if (i2 >= 0) {
            return take(bArr, kotlin.ranges.e.coerceAtLeast(bArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> filter(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterIndexedTo(@NotNull byte[] bArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Byte, Boolean> function2) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2)).booleanValue()) {
                c2.add(Byte.valueOf(b2));
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final List<Byte> filterNot(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (!function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterNotTo(@NotNull short[] sArr, @NotNull C c2, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (!function1.invoke(Short.valueOf(s)).booleanValue()) {
                c2.add(Short.valueOf(s));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterTo(@NotNull short[] sArr, @NotNull C c2, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                c2.add(Short.valueOf(s));
            }
        }
        return c2;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr) {
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R fold(@NotNull short[] sArr, R r, @NotNull Function2<? super R, ? super Short, ? extends R> function2) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            r = function2.invoke(r, Short.valueOf(s));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull short[] sArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Short, ? extends R> function3) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Short.valueOf(s));
            i3++;
        }
        return r;
    }

    public static final <R> R foldRight(@NotNull byte[] bArr, R r, @NotNull Function2<? super Byte, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Byte.valueOf(bArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull byte[] bArr, R r, @NotNull Function3<? super Integer, ? super Byte, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@NotNull short[] sArr, @NotNull Function1<? super Short, Unit> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            function1.invoke(Short.valueOf(s));
        }
    }

    public static final void forEachIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Unit> function2) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Short.valueOf(s));
            i3++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull short[] sArr) {
        return new IntRange(0, getLastIndex(sArr));
    }

    public static int getLastIndex(@NotNull short[] sArr) {
        return sArr.length - 1;
    }

    @Nullable
    public static final Short getOrNull(@NotNull short[] sArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i2]);
    }

    public static final int indexOfFirst(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Byte.valueOf(bArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Byte> intersect(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        Set<Byte> mutableSet = toMutableSet(bArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final String joinToString(@NotNull short[] sArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Short, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(sArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Short, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr) {
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull byte[] bArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Byte, ? extends R> function2) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull byte[] bArr, @NotNull C c2, @NotNull Function1<? super Byte, ? extends R> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            c2.add(function1.invoke(Byte.valueOf(b2)));
        }
        return c2;
    }

    public static final boolean none(@NotNull short[] sArr) {
        return sArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte randomOrNull(@NotNull byte[] bArr, @NotNull Random random) {
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr) {
        shuffle(sArr, (Random) Random.Default);
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr) {
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    @NotNull
    public static List<Byte> slice(@NotNull byte[] bArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(bArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final List<Short> sorted(@NotNull short[] sArr) {
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final byte[] sortedArray(@NotNull byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        ArraysKt___ArraysJvmKt.sort(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final byte[] sortedArrayDescending(@NotNull byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        sortDescending(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> function1) {
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> function1) {
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Short> sortedDescending(@NotNull short[] sArr) {
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        ArraysKt___ArraysJvmKt.sort(sArrCopyOf);
        return reversed(sArrCopyOf);
    }

    @NotNull
    public static final List<Short> sortedWith(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Byte> subtract(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        Set<Byte> mutableSet = toMutableSet(bArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    public static int sum(@NotNull int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            i3 += i4;
        }
        return i3;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Integer> function1) {
        int length = bArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            iIntValue += function1.invoke(Byte.valueOf(b2)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Double> function1) {
        int length = bArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Byte.valueOf(b2)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C toCollection(@NotNull byte[] bArr, @NotNull C c2) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            c2.add(Byte.valueOf(b2));
        }
        return c2;
    }

    @NotNull
    public static final HashSet<Short> toHashSet(@NotNull short[] sArr) {
        return (HashSet) toCollection(sArr, new HashSet(q.mapCapacity(sArr.length)));
    }

    @NotNull
    public static final Set<Short> toMutableSet(@NotNull short[] sArr) {
        return (Set) toCollection(sArr, new LinkedHashSet(q.mapCapacity(sArr.length)));
    }

    @NotNull
    public static final Set<Byte> union(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        Set<Byte> mutableSet = toMutableSet(bArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Short>> withIndex(@NotNull short[] sArr) {
        return new IndexingIterable(new c(sArr));
    }

    public static final boolean all(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (!function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull int[] iArr) {
        return !(iArr.length == 0);
    }

    public static final double average(@NotNull long[] jArr) {
        int length = jArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            d2 += j;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    public static boolean contains(@NotNull int[] iArr, int i2) {
        return indexOf(iArr, i2) >= 0;
    }

    public static final int count(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i4)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static List<Integer> distinct(@NotNull int[] iArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(iArr));
    }

    @NotNull
    public static final List<Byte> filterIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            }
            i3 = i4;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterNotTo(@NotNull int[] iArr, @NotNull C c2, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (!function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                c2.add(Integer.valueOf(i3));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterTo(@NotNull int[] iArr, @NotNull C c2, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                c2.add(Integer.valueOf(i3));
            }
        }
        return c2;
    }

    public static byte first(@NotNull byte[] bArr) {
        if (!(bArr.length == 0)) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull byte[] bArr, @NotNull C c2, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Byte.valueOf(b2)));
        }
        return c2;
    }

    public static final <R> R fold(@NotNull int[] iArr, R r, @NotNull Function2<? super R, ? super Integer, ? extends R> function2) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            r = function2.invoke(r, Integer.valueOf(i3));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull int[] iArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Integer, ? extends R> function3) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Integer.valueOf(i4));
            i3++;
        }
        return r;
    }

    public static final void forEach(@NotNull int[] iArr, @NotNull Function1<? super Integer, Unit> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            function1.invoke(Integer.valueOf(i3));
        }
    }

    public static final void forEachIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4));
            i3++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull int[] iArr) {
        return new IntRange(0, getLastIndex(iArr));
    }

    public static int getLastIndex(@NotNull int[] iArr) {
        return iArr.length - 1;
    }

    @Nullable
    public static Integer getOrNull(@NotNull int[] iArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i2]);
    }

    @NotNull
    public static final String joinToString(@NotNull int[] iArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Integer, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(iArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Integer, ? extends CharSequence>) function1);
    }

    public static byte last(@NotNull byte[] bArr) {
        if (!(bArr.length == 0)) {
            return bArr[getLastIndex(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            arrayList.add(function1.invoke(Byte.valueOf(b2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Byte.valueOf(b2)));
            i3++;
        }
        return arrayList;
    }

    public static final boolean none(@NotNull int[] iArr) {
        return iArr.length == 0;
    }

    @SinceKotlin(version = "1.3")
    public static final byte random(@NotNull byte[] bArr, @NotNull Random random) {
        if (!(bArr.length == 0)) {
            return bArr[random.nextInt(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceRightIndexedOrNull(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> function3) {
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            bByteValue = function3.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceRightOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> function2) {
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            bByteValue = function2.invoke(Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @NotNull
    public static final List<Byte> reversed(@NotNull byte[] bArr) {
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Byte> mutableList = toMutableList(bArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr) {
        shuffle(iArr, (Random) Random.Default);
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr) {
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull Collection<Integer> collection) {
        byte[] bArr2 = new byte[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            bArr2[i2] = bArr[it2.next().intValue()];
            i2++;
        }
        return bArr2;
    }

    @NotNull
    public static final List<Integer> sorted(@NotNull int[] iArr) {
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> function1) {
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> function1) {
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Integer> sortedDescending(@NotNull int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        ArraysKt___ArraysJvmKt.sort(iArrCopyOf);
        return reversed(iArrCopyOf);
    }

    @NotNull
    public static final List<Integer> sortedWith(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static long sum(@NotNull long[] jArr) {
        int length = jArr.length;
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            long j2 = jArr[i2];
            i2++;
            j += j2;
        }
        return j;
    }

    @NotNull
    public static final HashSet<Integer> toHashSet(@NotNull int[] iArr) {
        return (HashSet) toCollection(iArr, new HashSet(q.mapCapacity(iArr.length)));
    }

    @NotNull
    public static final List<Short> toMutableList(@NotNull short[] sArr) {
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Integer> toMutableSet(@NotNull int[] iArr) {
        return (Set) toCollection(iArr, new LinkedHashSet(q.mapCapacity(iArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Integer>> withIndex(@NotNull int[] iArr) {
        return new IndexingIterable(new d(iArr));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull R[] rArr, @NotNull Function2<? super Byte, ? super R, ? extends V> function2) {
        int iMin = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Byte.valueOf(bArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (!function1.invoke(Long.valueOf(j)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull long[] jArr) {
        return !(jArr.length == 0);
    }

    @NotNull
    public static final Iterable<Short> asIterable(@NotNull short[] sArr) {
        return sArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(sArr);
    }

    @NotNull
    public static final Sequence<Short> asSequence(@NotNull final short[] sArr) {
        return sArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Short>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Short> iterator() {
                return ArrayIteratorsKt.iterator(sArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(bArr.length), 16));
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Byte.valueOf(b2));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Byte> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(bArr.length), 16));
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Byte.valueOf(b2)), Byte.valueOf(b2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(@NotNull short[] sArr, @NotNull M m, @NotNull Function1<? super Short, ? extends K> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            m.put(function1.invoke(Short.valueOf(s)), Short.valueOf(s));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull short[] sArr, @NotNull M m, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Short.valueOf(s));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    public static final double average(@NotNull float[] fArr) {
        int length = fArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            d2 += (double) f2;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    public static boolean contains(@NotNull long[] jArr, long j) {
        return indexOf(jArr, j) >= 0;
    }

    public static final int count(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static final List<Long> distinct(@NotNull long[] jArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(jArr));
    }

    @NotNull
    public static final List<Short> drop(@NotNull short[] sArr, int i2) {
        if (i2 >= 0) {
            return takeLast(sArr, kotlin.ranges.e.coerceAtLeast(sArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropLast(@NotNull short[] sArr, int i2) {
        if (i2 >= 0) {
            return take(sArr, kotlin.ranges.e.coerceAtLeast(sArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> dropLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                    return take(bArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Short> filter(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterIndexedTo(@NotNull short[] sArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Short, Boolean> function2) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Short.valueOf(s)).booleanValue()) {
                c2.add(Short.valueOf(s));
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final List<Short> filterNot(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (!function1.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterNotTo(@NotNull long[] jArr, @NotNull C c2, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (!function1.invoke(Long.valueOf(j)).booleanValue()) {
                c2.add(Long.valueOf(j));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterTo(@NotNull long[] jArr, @NotNull C c2, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                c2.add(Long.valueOf(j));
            }
        }
        return c2;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr) {
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Byte.valueOf(b2)));
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull long[] jArr, R r, @NotNull Function2<? super R, ? super Long, ? extends R> function2) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            r = function2.invoke(r, Long.valueOf(j));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull long[] jArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Long, ? extends R> function3) {
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Long.valueOf(j));
            i3++;
        }
        return r;
    }

    public static final <R> R foldRight(@NotNull short[] sArr, R r, @NotNull Function2<? super Short, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Short.valueOf(sArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull short[] sArr, R r, @NotNull Function3<? super Integer, ? super Short, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@NotNull long[] jArr, @NotNull Function1<? super Long, Unit> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            function1.invoke(Long.valueOf(j));
        }
    }

    public static final void forEachIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Unit> function2) {
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Long.valueOf(j));
            i3++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull long[] jArr) {
        return new IntRange(0, getLastIndex(jArr));
    }

    public static int getLastIndex(@NotNull long[] jArr) {
        return jArr.length - 1;
    }

    @Nullable
    public static final Long getOrNull(@NotNull long[] jArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i2]);
    }

    public static int indexOf(@NotNull byte[] bArr, byte b2) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (b2 == bArr[i2]) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Short.valueOf(sArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Short> intersect(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        Set<Short> mutableSet = toMutableSet(sArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final String joinToString(@NotNull long[] jArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Long, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(jArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Long, ? extends CharSequence>) function1);
    }

    public static int lastIndexOf(@NotNull byte[] bArr, byte b2) {
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (b2 == bArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr) {
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull short[] sArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Short, ? extends R> function2) {
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Short.valueOf(s)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull short[] sArr, @NotNull C c2, @NotNull Function1<? super Short, ? extends R> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            c2.add(function1.invoke(Short.valueOf(s)));
        }
        return c2;
    }

    public static final boolean none(@NotNull long[] jArr) {
        return jArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short randomOrNull(@NotNull short[] sArr, @NotNull Random random) {
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte reduceIndexedOrNull(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> function3) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                bByteValue = function3.invoke(Integer.valueOf(i2), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Byte reduceOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> function2) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                bByteValue = function2.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    public static final byte reduceRight(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> function2) {
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                bByteValue = function2.invoke(Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceRightIndexed(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> function3) {
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            byte bByteValue = bArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                bByteValue = function3.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i2]), Byte.valueOf(bByteValue)).byteValue();
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static byte[] reversedArray(@NotNull byte[] bArr) {
        int i2 = 0;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                bArr2[lastIndex - i2] = bArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return bArr2;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr) {
        shuffle(jArr, (Random) Random.Default);
    }

    public static byte single(@NotNull byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr) {
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(sArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull short[] sArr) {
        if (sArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(sArr);
            reverse(sArr);
        }
    }

    @NotNull
    public static final List<Long> sorted(@NotNull long[] jArr) {
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final short[] sortedArray(@NotNull short[] sArr) {
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        ArraysKt___ArraysJvmKt.sort(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final short[] sortedArrayDescending(@NotNull short[] sArr) {
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        sortDescending(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> function1) {
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> function1) {
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Long> sortedDescending(@NotNull long[] jArr) {
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        ArraysKt___ArraysJvmKt.sort(jArrCopyOf);
        return reversed(jArrCopyOf);
    }

    @NotNull
    public static final List<Long> sortedWith(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Short> subtract(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        Set<Short> mutableSet = toMutableSet(sArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final float sum(@NotNull float[] fArr) {
        int length = fArr.length;
        float f2 = 0.0f;
        int i2 = 0;
        while (i2 < length) {
            float f3 = fArr[i2];
            i2++;
            f2 += f3;
        }
        return f2;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull short[] sArr, @NotNull Function1<? super Short, Integer> function1) {
        int length = sArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            iIntValue += function1.invoke(Short.valueOf(s)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull short[] sArr, @NotNull Function1<? super Short, Double> function1) {
        int length = sArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Short.valueOf(s)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Byte> takeLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                    return drop(bArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(bArr);
    }

    @NotNull
    public static final List<Byte> takeWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (!function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C toCollection(@NotNull short[] sArr, @NotNull C c2) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            c2.add(Short.valueOf(s));
        }
        return c2;
    }

    @NotNull
    public static final HashSet<Long> toHashSet(@NotNull long[] jArr) {
        return (HashSet) toCollection(jArr, new HashSet(q.mapCapacity(jArr.length)));
    }

    @NotNull
    public static List<Byte> toList(@NotNull byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(bArr);
        }
        return kotlin.collections.e.listOf(Byte.valueOf(bArr[0]));
    }

    @NotNull
    public static final Set<Long> toMutableSet(@NotNull long[] jArr) {
        return (Set) toCollection(jArr, new LinkedHashSet(q.mapCapacity(jArr.length)));
    }

    @NotNull
    public static final Set<Byte> toSet(@NotNull byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(bArr, new LinkedHashSet(q.mapCapacity(bArr.length)));
        }
        return x.setOf(Byte.valueOf(bArr[0]));
    }

    @NotNull
    public static final Set<Short> union(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        Set<Short> mutableSet = toMutableSet(sArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Long>> withIndex(@NotNull long[] jArr) {
        return new IndexingIterable(new e(jArr));
    }

    public static final boolean all(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (!function1.invoke(Float.valueOf(f2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull float[] fArr) {
        return !(fArr.length == 0);
    }

    public static final double average(@NotNull double[] dArr) {
        int length = dArr.length;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (i2 < length) {
            double d3 = dArr[i2];
            i2++;
            d2 += d3;
            i3++;
        }
        if (i3 == 0) {
            return Double.NaN;
        }
        return d2 / ((double) i3);
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
    public static final boolean contains(@NotNull float[] fArr, float f2) {
        return indexOf(fArr, f2) >= 0;
    }

    public static final int count(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static final List<Float> distinct(@NotNull float[] fArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(fArr));
    }

    @NotNull
    public static final List<Byte> dropWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (z) {
                arrayList.add(Byte.valueOf(b2));
            } else if (!function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterNotTo(@NotNull float[] fArr, @NotNull C c2, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (!function1.invoke(Float.valueOf(f2)).booleanValue()) {
                c2.add(Float.valueOf(f2));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterTo(@NotNull float[] fArr, @NotNull C c2, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                c2.add(Float.valueOf(f2));
            }
        }
        return c2;
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R fold(@NotNull float[] fArr, R r, @NotNull Function2<? super R, ? super Float, ? extends R> function2) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            r = function2.invoke(r, Float.valueOf(f2));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull float[] fArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Float, ? extends R> function3) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Float.valueOf(f2));
            i3++;
        }
        return r;
    }

    public static final void forEach(@NotNull float[] fArr, @NotNull Function1<? super Float, Unit> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            function1.invoke(Float.valueOf(f2));
        }
    }

    public static final void forEachIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Unit> function2) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Float.valueOf(f2));
            i3++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull float[] fArr) {
        return new IntRange(0, getLastIndex(fArr));
    }

    public static final int getLastIndex(@NotNull float[] fArr) {
        return fArr.length - 1;
    }

    @Nullable
    public static final Float getOrNull(@NotNull float[] fArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i2]);
    }

    @NotNull
    public static final String joinToString(@NotNull float[] fArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Float, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(fArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Float, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) < 0) {
                    b2 = b3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                if (comparator.compare(Byte.valueOf(b2), Byte.valueOf(b3)) > 0) {
                    b2 = b3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    public static final boolean none(@NotNull float[] fArr) {
        return fArr.length == 0;
    }

    public static final byte reduce(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> function2) {
        int i2 = 1;
        if (!(bArr.length == 0)) {
            byte bByteValue = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    bByteValue = function2.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte reduceIndexed(@NotNull byte[] bArr, @NotNull Function3<? super Integer, ? super Byte, ? super Byte, Byte> function3) {
        int i2 = 1;
        if (!(bArr.length == 0)) {
            byte bByteValue = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    bByteValue = function3.invoke(Integer.valueOf(i2), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i2])).byteValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return bByteValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(@NotNull byte[] bArr) {
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(bArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            bArr[i2] = bArr[lastIndex];
            bArr[lastIndex] = b2;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr) {
        shuffle(fArr, (Random) Random.Default);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr) {
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Float> sorted(@NotNull float[] fArr) {
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> function1) {
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> function1) {
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Float> sortedDescending(@NotNull float[] fArr) {
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        ArraysKt___ArraysJvmKt.sort(fArrCopyOf);
        return reversed(fArrCopyOf);
    }

    @NotNull
    public static final List<Float> sortedWith(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final double sum(@NotNull double[] dArr) {
        int length = dArr.length;
        double d2 = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            double d3 = dArr[i2];
            i2++;
            d2 += d3;
        }
        return d2;
    }

    @NotNull
    public static final HashSet<Float> toHashSet(@NotNull float[] fArr) {
        return (HashSet) toCollection(fArr, new HashSet(q.mapCapacity(fArr.length)));
    }

    @NotNull
    public static List<Integer> toMutableList(@NotNull int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Float> toMutableSet(@NotNull float[] fArr) {
        return (Set) toCollection(fArr, new LinkedHashSet(q.mapCapacity(fArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Float>> withIndex(@NotNull float[] fArr) {
        return new IndexingIterable(new f(fArr));
    }

    public static final boolean all(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (!function1.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull double[] dArr) {
        return !(dArr.length == 0);
    }

    @NotNull
    public static final Iterable<Integer> asIterable(@NotNull int[] iArr) {
        return iArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(iArr);
    }

    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final int[] iArr) {
        return iArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Integer>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Integer> iterator() {
                return ArrayIteratorsKt.iterator(iArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(@NotNull int[] iArr, @NotNull M m, @NotNull Function1<? super Integer, ? extends K> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            m.put(function1.invoke(Integer.valueOf(i3)), Integer.valueOf(i3));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull int[] iArr, @NotNull M m, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Integer.valueOf(i3));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
    public static final boolean contains(@NotNull double[] dArr, double d2) {
        return indexOf(dArr, d2) >= 0;
    }

    public static final int count(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static final List<Double> distinct(@NotNull double[] dArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(dArr));
    }

    @NotNull
    public static final <K> List<Byte> distinctBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Byte.valueOf(b2)))) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> drop(@NotNull int[] iArr, int i2) {
        if (i2 >= 0) {
            return takeLast(iArr, kotlin.ranges.e.coerceAtLeast(iArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> dropLast(@NotNull int[] iArr, int i2) {
        if (i2 >= 0) {
            return take(iArr, kotlin.ranges.e.coerceAtLeast(iArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> filter(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> filterIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
            i3 = i4;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterIndexedTo(@NotNull int[] iArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            int i5 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4)).booleanValue()) {
                c2.add(Integer.valueOf(i4));
            }
            i3 = i5;
        }
        return c2;
    }

    @NotNull
    public static final List<Integer> filterNot(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (!function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterNotTo(@NotNull double[] dArr, @NotNull C c2, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (!function1.invoke(Double.valueOf(d2)).booleanValue()) {
                c2.add(Double.valueOf(d2));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterTo(@NotNull double[] dArr, @NotNull C c2, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                c2.add(Double.valueOf(d2));
            }
        }
        return c2;
    }

    public static short first(@NotNull short[] sArr) {
        if (!(sArr.length == 0)) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr) {
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull short[] sArr, @NotNull C c2, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Short.valueOf(s)));
        }
        return c2;
    }

    public static final <R> R fold(@NotNull double[] dArr, R r, @NotNull Function2<? super R, ? super Double, ? extends R> function2) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            r = function2.invoke(r, Double.valueOf(d2));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull double[] dArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Double, ? extends R> function3) {
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Double.valueOf(d2));
            i3++;
        }
        return r;
    }

    public static final <R> R foldRight(@NotNull int[] iArr, R r, @NotNull Function2<? super Integer, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Integer.valueOf(iArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull int[] iArr, R r, @NotNull Function3<? super Integer, ? super Integer, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@NotNull double[] dArr, @NotNull Function1<? super Double, Unit> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            function1.invoke(Double.valueOf(d2));
        }
    }

    public static final void forEachIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Unit> function2) {
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Double.valueOf(d2));
            i3++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull double[] dArr) {
        return new IntRange(0, getLastIndex(dArr));
    }

    public static final int getLastIndex(@NotNull double[] dArr) {
        return dArr.length - 1;
    }

    @Nullable
    public static final Double getOrNull(@NotNull double[] dArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i2]);
    }

    public static int indexOf(@NotNull short[] sArr, short s) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (s == sArr[i2]) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Integer> intersect(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        Set<Integer> mutableSet = toMutableSet(iArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull byte[] bArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b2 = bArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Byte.valueOf(b2)));
            } else {
                a2.append(String.valueOf((int) b2));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @NotNull
    public static final String joinToString(@NotNull double[] dArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Double, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(dArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Double, ? extends CharSequence>) function1);
    }

    public static short last(@NotNull short[] sArr) {
        if (!(sArr.length == 0)) {
            return sArr[getLastIndex(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int lastIndexOf(@NotNull short[] sArr, short s) {
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (s == sArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr) {
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            arrayList.add(function1.invoke(Short.valueOf(s)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Short.valueOf(s)));
            i3++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull int[] iArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Integer, ? extends R> function2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull int[] iArr, @NotNull C c2, @NotNull Function1<? super Integer, ? extends R> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            c2.add(function1.invoke(Integer.valueOf(i3)));
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull Float[] fArr) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.max(fFloatValue, fArr[i2].floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull Float[] fArr) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = Math.min(fFloatValue, fArr[i2].floatValue());
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static final boolean none(@NotNull double[] dArr) {
        return dArr.length == 0;
    }

    @SinceKotlin(version = "1.3")
    public static final short random(@NotNull short[] sArr, @NotNull Random random) {
        if (!(sArr.length == 0)) {
            return sArr[random.nextInt(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer randomOrNull(@NotNull int[] iArr, @NotNull Random random) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    @NotNull
    public static final List<Short> reversed(@NotNull short[] sArr) {
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Short> mutableList = toMutableList(sArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr) {
        shuffle(dArr, Random.Default);
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr) {
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(iArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull Collection<Integer> collection) {
        short[] sArr2 = new short[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            sArr2[i2] = sArr[it2.next().intValue()];
            i2++;
        }
        return sArr2;
    }

    @NotNull
    public static final List<Double> sorted(@NotNull double[] dArr) {
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static int[] sortedArray(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        ArraysKt___ArraysJvmKt.sort(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final int[] sortedArrayDescending(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        sortDescending(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> function1) {
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> function1) {
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Double> sortedDescending(@NotNull double[] dArr) {
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        ArraysKt___ArraysJvmKt.sort(dArrCopyOf);
        return reversed(dArrCopyOf);
    }

    @NotNull
    public static final List<Double> sortedWith(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Integer> subtract(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        Set<Integer> mutableSet = toMutableSet(iArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            iIntValue += function1.invoke(Integer.valueOf(i3)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull int[] iArr, @NotNull Function1<? super Integer, Double> function1) {
        int length = iArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Integer.valueOf(i3)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C toCollection(@NotNull int[] iArr, @NotNull C c2) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            c2.add(Integer.valueOf(i3));
        }
        return c2;
    }

    @NotNull
    public static final HashSet<Double> toHashSet(@NotNull double[] dArr) {
        return (HashSet) toCollection(dArr, new HashSet(q.mapCapacity(dArr.length)));
    }

    @NotNull
    public static final Set<Double> toMutableSet(@NotNull double[] dArr) {
        return (Set) toCollection(dArr, new LinkedHashSet(q.mapCapacity(dArr.length)));
    }

    @NotNull
    public static final Set<Integer> union(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        Set<Integer> mutableSet = toMutableSet(iArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Double>> withIndex(@NotNull double[] dArr) {
        return new IndexingIterable(new g(dArr));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull R[] rArr, @NotNull Function2<? super Short, ? super R, ? extends V> function2) {
        int iMin = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Short.valueOf(sArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (!function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull boolean[] zArr) {
        return !(zArr.length == 0);
    }

    public static final boolean contains(@NotNull boolean[] zArr, boolean z) {
        return indexOf(zArr, z) >= 0;
    }

    public static final int count(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static final List<Boolean> distinct(@NotNull boolean[] zArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(zArr));
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterNotTo(@NotNull boolean[] zArr, @NotNull C c2, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (!function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                c2.add(Boolean.valueOf(z));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterTo(@NotNull boolean[] zArr, @NotNull C c2, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                c2.add(Boolean.valueOf(z));
            }
        }
        return c2;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr) {
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    public static final <R> R fold(@NotNull boolean[] zArr, R r, @NotNull Function2<? super R, ? super Boolean, ? extends R> function2) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            r = function2.invoke(r, Boolean.valueOf(z));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull boolean[] zArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Boolean, ? extends R> function3) {
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Boolean.valueOf(z));
            i3++;
        }
        return r;
    }

    public static final void forEach(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Unit> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void forEachIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Unit> function2) {
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z));
            i3++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull boolean[] zArr) {
        return new IntRange(0, getLastIndex(zArr));
    }

    public static int getLastIndex(@NotNull boolean[] zArr) {
        return zArr.length - 1;
    }

    @Nullable
    public static final Boolean getOrNull(@NotNull boolean[] zArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i2]);
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(@NotNull byte[] bArr, @NotNull M m, @NotNull Function1<? super Byte, ? extends K> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            K kInvoke = function1.invoke(Byte.valueOf(b2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b2));
        }
        return m;
    }

    @NotNull
    public static final String joinToString(@NotNull boolean[] zArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(zArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(zArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Boolean, ? extends CharSequence>) function1);
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr) {
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = function1.invoke(Byte.valueOf(b2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                R rInvoke2 = function1.invoke(Byte.valueOf(b3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b2 = b3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte maxByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = function1.invoke(Byte.valueOf(b2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                R rInvoke2 = function1.invoke(Byte.valueOf(b3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b2 = b3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = function1.invoke(Byte.valueOf(b2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                R rInvoke2 = function1.invoke(Byte.valueOf(b3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b2 = b3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte minByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> function1) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b2);
        }
        R rInvoke = function1.invoke(Byte.valueOf(b2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                R rInvoke2 = function1.invoke(Byte.valueOf(b3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b2 = b3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    public static final boolean none(@NotNull boolean[] zArr) {
        return zArr.length == 0;
    }

    @NotNull
    public static final Pair<List<Byte>, List<Byte>> partition(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                arrayList.add(Byte.valueOf(b2));
            } else {
                arrayList2.add(Byte.valueOf(b2));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceRightIndexedOrNull(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> function3) {
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            sShortValue = function3.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceRightOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> function2) {
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            sShortValue = function2.invoke(Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr) {
        shuffle(zArr, Random.Default);
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr) {
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull int[] iArr) {
        if (iArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(iArr);
            reverse(iArr);
        }
    }

    @NotNull
    public static final List<Character> sorted(@NotNull char[] cArr) {
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sort(typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> function1) {
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> function1) {
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Character> sortedDescending(@NotNull char[] cArr) {
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        ArraysKt___ArraysJvmKt.sort(cArrCopyOf);
        return reversed(cArrCopyOf);
    }

    @NotNull
    public static final List<Boolean> sortedWith(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Boolean[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(zArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final List<Byte> take(@NotNull byte[] bArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= bArr.length) {
            return toList(bArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = bArr.length;
        int i4 = 0;
        while (i3 < length) {
            byte b2 = bArr[i3];
            i3++;
            arrayList.add(Byte.valueOf(b2));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> takeLast(@NotNull byte[] bArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = bArr.length;
        if (i2 >= length) {
            return toList(bArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Byte.valueOf(bArr[i3]));
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Boolean> toHashSet(@NotNull boolean[] zArr) {
        return (HashSet) toCollection(zArr, new HashSet(q.mapCapacity(zArr.length)));
    }

    @NotNull
    public static final List<Long> toMutableList(@NotNull long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Boolean> toMutableSet(@NotNull boolean[] zArr) {
        return (Set) toCollection(zArr, new LinkedHashSet(q.mapCapacity(zArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Boolean>> withIndex(@NotNull boolean[] zArr) {
        return new IndexingIterable(new h(zArr));
    }

    public static final boolean all(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull char[] cArr) {
        return !(cArr.length == 0);
    }

    @NotNull
    public static final Iterable<Long> asIterable(@NotNull long[] jArr) {
        return jArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(jArr);
    }

    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final long[] jArr) {
        return jArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Long>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Long> iterator() {
                return ArrayIteratorsKt.iterator(jArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(sArr.length), 16));
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Short.valueOf(s));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Short> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(sArr.length), 16));
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Short.valueOf(s)), Short.valueOf(s));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(@NotNull long[] jArr, @NotNull M m, @NotNull Function1<? super Long, ? extends K> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            m.put(function1.invoke(Long.valueOf(j)), Long.valueOf(j));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull long[] jArr, @NotNull M m, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Long.valueOf(j));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    public static boolean contains(@NotNull char[] cArr, char c2) {
        return indexOf(cArr, c2) >= 0;
    }

    public static final int count(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    @NotNull
    public static final List<Character> distinct(@NotNull char[] cArr) {
        return CollectionsKt___CollectionsKt.toList(toMutableSet(cArr));
    }

    @NotNull
    public static final List<Long> drop(@NotNull long[] jArr, int i2) {
        if (i2 >= 0) {
            return takeLast(jArr, kotlin.ranges.e.coerceAtLeast(jArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> dropLast(@NotNull long[] jArr, int i2) {
        if (i2 >= 0) {
            return take(jArr, kotlin.ranges.e.coerceAtLeast(jArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                    return take(sArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Long> filter(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterIndexedTo(@NotNull long[] jArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Long, Boolean> function2) {
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Long.valueOf(j)).booleanValue()) {
                c2.add(Long.valueOf(j));
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final List<Long> filterNot(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (!function1.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterNotTo(@NotNull char[] cArr, @NotNull C c2, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            if (!function1.invoke(Character.valueOf(c3)).booleanValue()) {
                c2.add(Character.valueOf(c3));
            }
        }
        return c2;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterTo(@NotNull char[] cArr, @NotNull C c2, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c3)).booleanValue()) {
                c2.add(Character.valueOf(c3));
            }
        }
        return c2;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Short.valueOf(s)));
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull char[] cArr, R r, @NotNull Function2<? super R, ? super Character, ? extends R> function2) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            r = function2.invoke(r, Character.valueOf(c2));
        }
        return r;
    }

    public static final <R> R foldIndexed(@NotNull char[] cArr, R r, @NotNull Function3<? super Integer, ? super R, ? super Character, ? extends R> function3) {
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            r = function3.invoke(Integer.valueOf(i3), r, Character.valueOf(c2));
            i3++;
        }
        return r;
    }

    public static final <R> R foldRight(@NotNull long[] jArr, R r, @NotNull Function2<? super Long, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Long.valueOf(jArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull long[] jArr, R r, @NotNull Function3<? super Integer, ? super Long, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r);
        }
        return r;
    }

    public static final void forEach(@NotNull char[] cArr, @NotNull Function1<? super Character, Unit> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            function1.invoke(Character.valueOf(c2));
        }
    }

    public static final void forEachIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Unit> function2) {
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            function2.invoke(Integer.valueOf(i3), Character.valueOf(c2));
            i3++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull char[] cArr) {
        return new IntRange(0, getLastIndex(cArr));
    }

    public static final int getLastIndex(@NotNull char[] cArr) {
        return cArr.length - 1;
    }

    @Nullable
    public static final Character getOrNull(@NotNull char[] cArr, int i2) {
        if (i2 < 0 || i2 > getLastIndex(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i2]);
    }

    @NotNull
    public static final <K> Map<K, List<Byte>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            K kInvoke = function1.invoke(Byte.valueOf(b2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b2));
        }
        return linkedHashMap;
    }

    public static int indexOf(@NotNull int[] iArr, int i2) {
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (i2 == iArr[i3]) {
                return i3;
            }
            i3 = i4;
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Long.valueOf(jArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Long> intersect(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        Set<Long> mutableSet = toMutableSet(jArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final String joinToString(@NotNull char[] cArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Character, ? extends CharSequence> function1) {
        return ((StringBuilder) joinTo(cArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return joinToString(cArr, charSequence, charSequence5, charSequence6, i4, charSequence7, (Function1<? super Character, ? extends CharSequence>) function1);
    }

    public static int lastIndexOf(@NotNull int[] iArr, int i2) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (i2 == iArr[length]) {
                    return length;
                }
                if (i3 >= 0) {
                    length = i3;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull long[] jArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Long, ? extends R> function2) {
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Long.valueOf(j)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull long[] jArr, @NotNull C c2, @NotNull Function1<? super Long, ? extends R> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            c2.add(function1.invoke(Long.valueOf(j)));
        }
        return c2;
    }

    public static final boolean none(@NotNull char[] cArr) {
        return cArr.length == 0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long randomOrNull(@NotNull long[] jArr, @NotNull Random random) {
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    public static final short reduceRight(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> function2) {
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                sShortValue = function2.invoke(Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceRightIndexed(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> function3) {
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                sShortValue = function3.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i2]), Short.valueOf(sShortValue)).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static short[] reversedArray(@NotNull short[] sArr) {
        int i2 = 0;
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                sArr2[lastIndex - i2] = sArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return sArr2;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr) {
        shuffle(cArr, (Random) Random.Default);
    }

    public static short single(@NotNull short[] sArr) {
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr) {
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(jArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final long[] sortedArray(@NotNull long[] jArr) {
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        ArraysKt___ArraysJvmKt.sort(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final long[] sortedArrayDescending(@NotNull long[] jArr) {
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        sortDescending(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> function1) {
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt.AnonymousClass2(function1));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> function1) {
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(function1));
    }

    @NotNull
    public static final List<Character> sortedWith(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Long> subtract(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        Set<Long> mutableSet = toMutableSet(jArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull long[] jArr, @NotNull Function1<? super Long, Integer> function1) {
        int length = jArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            iIntValue += function1.invoke(Long.valueOf(j)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull long[] jArr, @NotNull Function1<? super Long, Double> function1) {
        int length = jArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Long.valueOf(j)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Short> takeLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                    return drop(sArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(sArr);
    }

    @NotNull
    public static final List<Short> takeWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (!function1.invoke(Short.valueOf(s)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C toCollection(@NotNull long[] jArr, @NotNull C c2) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            c2.add(Long.valueOf(j));
        }
        return c2;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull char[] cArr) {
        return (HashSet) toCollection(cArr, new HashSet(q.mapCapacity(kotlin.ranges.e.coerceAtMost(cArr.length, 128))));
    }

    @NotNull
    public static List<Short> toList(@NotNull short[] sArr) {
        int length = sArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(sArr);
        }
        return kotlin.collections.e.listOf(Short.valueOf(sArr[0]));
    }

    @NotNull
    public static final Set<Character> toMutableSet(@NotNull char[] cArr) {
        return (Set) toCollection(cArr, new LinkedHashSet(q.mapCapacity(kotlin.ranges.e.coerceAtMost(cArr.length, 128))));
    }

    @NotNull
    public static final Set<Short> toSet(@NotNull short[] sArr) {
        int length = sArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(sArr, new LinkedHashSet(q.mapCapacity(sArr.length)));
        }
        return x.setOf(Short.valueOf(sArr[0]));
    }

    @NotNull
    public static final Set<Long> union(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        Set<Long> mutableSet = toMutableSet(jArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull char[] cArr) {
        return new IndexingIterable(new i(cArr));
    }

    public static final <T> boolean any(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Integer> filterIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            int i5 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4)).booleanValue()) {
                arrayList.add(Integer.valueOf(i4));
            }
            i3 = i5;
        }
        return arrayList;
    }

    public static int first(@NotNull int[] iArr) {
        if (!(iArr.length == 0)) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T firstOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull int[] iArr, @NotNull C c2, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Integer.valueOf(i3)));
        }
        return c2;
    }

    public static int last(@NotNull int[] iArr) {
        if (!(iArr.length == 0)) {
            return iArr[getLastIndex(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            T t = tArr[length];
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            arrayList.add(function1.invoke(Integer.valueOf(i3)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Integer.valueOf(i4)));
            i3++;
        }
        return arrayList;
    }

    public static final <T> boolean none(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull int[] iArr, @NotNull Random random) {
        if (!(iArr.length == 0)) {
            return iArr[random.nextInt(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short reduceIndexedOrNull(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> function3) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                sShortValue = function3.invoke(Integer.valueOf(i2), Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(sShortValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Short reduceOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> function2) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                sShortValue = function2.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(sShortValue);
    }

    @NotNull
    public static final List<Integer> reversed(@NotNull int[] iArr) {
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Integer> mutableList = toMutableList(iArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr, @NotNull Random random) {
        int lastIndex = getLastIndex(tArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            T t = tArr[lastIndex];
            tArr[lastIndex] = tArr[iNextInt];
            tArr[iNextInt] = t;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        T t = null;
        boolean z = false;
        while (i2 < length) {
            T t2 = tArr[i2];
            i2++;
            if (function1.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        int[] iArr2 = new int[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            iArr2[i2] = iArr[it2.next().intValue()];
            i2++;
        }
        return iArr2;
    }

    @NotNull
    public static final List<Float> toMutableList(@NotNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull R[] rArr, @NotNull Function2<? super Integer, ? super R, ? extends V> function2) {
        int iMin = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Integer.valueOf(iArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Float> asIterable(@NotNull float[] fArr) {
        return fArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(fArr);
    }

    @NotNull
    public static final Sequence<Float> asSequence(@NotNull final float[] fArr) {
        return fArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Float>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Float> iterator() {
                return ArrayIteratorsKt.iterator(fArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(@NotNull float[] fArr, @NotNull M m, @NotNull Function1<? super Float, ? extends K> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            m.put(function1.invoke(Float.valueOf(f2)), Float.valueOf(f2));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull float[] fArr, @NotNull M m, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Float.valueOf(f2));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final List<Float> drop(@NotNull float[] fArr, int i2) {
        if (i2 >= 0) {
            return takeLast(fArr, kotlin.ranges.e.coerceAtLeast(fArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> dropLast(@NotNull float[] fArr, int i2) {
        if (i2 >= 0) {
            return take(fArr, kotlin.ranges.e.coerceAtLeast(fArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (z) {
                arrayList.add(Short.valueOf(s));
            } else if (!function1.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filter(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterIndexedTo(@NotNull float[] fArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Float, Boolean> function2) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Float.valueOf(f2)).booleanValue()) {
                c2.add(Float.valueOf(f2));
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final List<Float> filterNot(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (!function1.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull float[] fArr, R r, @NotNull Function2<? super Float, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Float.valueOf(fArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull float[] fArr, R r, @NotNull Function3<? super Integer, ? super Float, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r);
        }
        return r;
    }

    public static int indexOf(@NotNull long[] jArr, long j) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (j == jArr[i2]) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Float> intersect(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        Set<Float> mutableSet = toMutableSet(fArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    public static int lastIndexOf(@NotNull long[] jArr, long j) {
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (j == jArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull float[] fArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Float, ? extends R> function2) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Float.valueOf(f2)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull float[] fArr, @NotNull C c2, @NotNull Function1<? super Float, ? extends R> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            c2.add(function1.invoke(Float.valueOf(f2)));
        }
        return c2;
    }

    public static final boolean none(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float randomOrNull(@NotNull float[] fArr, @NotNull Random random) {
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    public static final short reduce(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> function2) {
        int i2 = 1;
        if (!(sArr.length == 0)) {
            short sShortValue = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    sShortValue = function2.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceIndexed(@NotNull short[] sArr, @NotNull Function3<? super Integer, ? super Short, ? super Short, Short> function3) {
        int i2 = 1;
        if (!(sArr.length == 0)) {
            short sShortValue = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    sShortValue = function3.invoke(Integer.valueOf(i2), Short.valueOf(sShortValue), Short.valueOf(sArr[i2])).shortValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(@NotNull short[] sArr) {
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(sArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            short s = sArr[i2];
            sArr[i2] = sArr[lastIndex];
            sArr[lastIndex] = s;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @NotNull
    public static List<Float> slice(@NotNull float[] fArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(fArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull long[] jArr) {
        if (jArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(jArr);
            reverse(jArr);
        }
    }

    @NotNull
    public static final float[] sortedArray(@NotNull float[] fArr) {
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        ArraysKt___ArraysJvmKt.sort(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final float[] sortedArrayDescending(@NotNull float[] fArr) {
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        sortDescending(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final Set<Float> subtract(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        Set<Float> mutableSet = toMutableSet(fArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull float[] fArr, @NotNull Function1<? super Float, Integer> function1) {
        int length = fArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            iIntValue += function1.invoke(Float.valueOf(f2)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull float[] fArr, @NotNull Function1<? super Float, Double> function1) {
        int length = fArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Float.valueOf(f2)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C toCollection(@NotNull float[] fArr, @NotNull C c2) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            c2.add(Float.valueOf(f2));
        }
        return c2;
    }

    @NotNull
    public static final Set<Float> union(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        Set<Float> mutableSet = toMutableSet(fArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final boolean any(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) < 0) {
                    s = s2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) > 0) {
                    s = s2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    public static final boolean none(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceRightIndexedOrNull(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> function3) {
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            iIntValue = function3.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceRightOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> function2) {
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            iIntValue = function2.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        Byte bValueOf = null;
        boolean z = false;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                if (z) {
                    return null;
                }
                bValueOf = Byte.valueOf(b2);
                z = true;
            }
        }
        if (z) {
            return bValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Double> toMutableList(@NotNull double[] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Double> asIterable(@NotNull double[] dArr) {
        return dArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(dArr);
    }

    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final double[] dArr) {
        return dArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Double>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Double> iterator() {
                return ArrayIteratorsKt.iterator(dArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(iArr.length), 16));
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Integer.valueOf(i3));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Integer> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(iArr.length), 16));
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Integer.valueOf(i3)), Integer.valueOf(i3));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(@NotNull double[] dArr, @NotNull M m, @NotNull Function1<? super Double, ? extends K> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            m.put(function1.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull double[] dArr, @NotNull M m, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Double.valueOf(d2));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <K> List<Short> distinctBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Short.valueOf(s)))) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> drop(@NotNull double[] dArr, int i2) {
        if (i2 >= 0) {
            return takeLast(dArr, kotlin.ranges.e.coerceAtLeast(dArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> dropLast(@NotNull double[] dArr, int i2) {
        if (i2 >= 0) {
            return take(dArr, kotlin.ranges.e.coerceAtLeast(dArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> dropLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                    return take(iArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Double> filter(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> filterIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
            i3 = i4;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterIndexedTo(@NotNull double[] dArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Double, Boolean> function2) {
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Double.valueOf(d2)).booleanValue()) {
                c2.add(Double.valueOf(d2));
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final List<Double> filterNot(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (!function1.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    public static long first(@NotNull long[] jArr) {
        if (!(jArr.length == 0)) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return Integer.valueOf(i3);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Integer.valueOf(i3)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull long[] jArr, @NotNull C c2, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Long.valueOf(j)));
        }
        return c2;
    }

    public static final <R> R foldRight(@NotNull double[] dArr, R r, @NotNull Function2<? super Double, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Double.valueOf(dArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull double[] dArr, R r, @NotNull Function3<? super Integer, ? super Double, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r);
        }
        return r;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
    public static final int indexOf(@NotNull float[] fArr, float f2) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (f2 == fArr[i2]) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Double.valueOf(dArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Double> intersect(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        Set<Double> mutableSet = toMutableSet(dArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    public static long last(@NotNull long[] jArr) {
        if (!(jArr.length == 0)) {
            return jArr[getLastIndex(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
    public static final int lastIndexOf(@NotNull float[] fArr, float f2) {
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (f2 == fArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            byte b2 = bArr[length];
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                return Byte.valueOf(b2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            arrayList.add(function1.invoke(Long.valueOf(j)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Long.valueOf(j)));
            i3++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull double[] dArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Double, ? extends R> function2) {
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Double.valueOf(d2)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull double[] dArr, @NotNull C c2, @NotNull Function1<? super Double, ? extends R> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            c2.add(function1.invoke(Double.valueOf(d2)));
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T maxOrNull(@NotNull T[] tArr) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                T t2 = tArr[i2];
                if (t.compareTo(t2) < 0) {
                    t = t2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return t;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T minOrNull(@NotNull T[] tArr) {
        int i2 = 1;
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                T t2 = tArr[i2];
                if (t.compareTo(t2) > 0) {
                    t = t2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return t;
    }

    public static final boolean none(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull long[] jArr, @NotNull Random random) {
        if (!(jArr.length == 0)) {
            return jArr[random.nextInt(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double randomOrNull(@NotNull double[] dArr, @NotNull Random random) {
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    public static final int reduceRight(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> function2) {
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                iIntValue = function2.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceRightIndexed(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> function3) {
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                iIntValue = function3.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Long> reversed(@NotNull long[] jArr) {
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Long> mutableList = toMutableList(jArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static int[] reversedArray(@NotNull int[] iArr) {
        int i2 = 0;
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                iArr2[lastIndex - i2] = iArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr2;
    }

    public static int single(@NotNull int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(dArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull Collection<Integer> collection) {
        long[] jArr2 = new long[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            jArr2[i2] = jArr[it2.next().intValue()];
            i2++;
        }
        return jArr2;
    }

    @NotNull
    public static final double[] sortedArray(@NotNull double[] dArr) {
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        ArraysKt___ArraysJvmKt.sort(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final double[] sortedArrayDescending(@NotNull double[] dArr) {
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        sortDescending(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final Set<Double> subtract(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        Set<Double> mutableSet = toMutableSet(dArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull double[] dArr, @NotNull Function1<? super Double, Integer> function1) {
        int length = dArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            iIntValue += function1.invoke(Double.valueOf(d2)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull double[] dArr, @NotNull Function1<? super Double, Double> function1) {
        int length = dArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Double.valueOf(d2)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Integer> takeLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                    return drop(iArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(iArr);
    }

    @NotNull
    public static final List<Integer> takeWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (!function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C toCollection(@NotNull double[] dArr, @NotNull C c2) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            c2.add(Double.valueOf(d2));
        }
        return c2;
    }

    @NotNull
    public static List<Integer> toList(@NotNull int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(iArr);
        }
        return kotlin.collections.e.listOf(Integer.valueOf(iArr[0]));
    }

    @NotNull
    public static final Set<Integer> toSet(@NotNull int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(iArr, new LinkedHashSet(q.mapCapacity(iArr.length)));
        }
        return x.setOf(Integer.valueOf(iArr[0]));
    }

    @NotNull
    public static final Set<Double> union(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        Set<Double> mutableSet = toMutableSet(dArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull R[] rArr, @NotNull Function2<? super Long, ? super R, ? extends V> function2) {
        int iMin = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Long.valueOf(jArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
        }
        return null;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull short[] sArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Short, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = sArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            short s = sArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Short.valueOf(s)));
            } else {
                a2.append(String.valueOf((int) s));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final boolean none(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void sortDescending(@NotNull float[] fArr) {
        if (fArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(fArr);
            reverse(fArr);
        }
    }

    @NotNull
    public static final List<Boolean> toMutableList(@NotNull boolean[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Boolean> asIterable(@NotNull boolean[] zArr) {
        return zArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(zArr);
    }

    @NotNull
    public static final Sequence<Boolean> asSequence(@NotNull final boolean[] zArr) {
        return zArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Boolean>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Boolean> iterator() {
                return ArrayIteratorsKt.iterator(zArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(@NotNull boolean[] zArr, @NotNull M m, @NotNull Function1<? super Boolean, ? extends K> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            m.put(function1.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull boolean[] zArr, @NotNull M m, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Boolean.valueOf(z));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final List<Boolean> drop(@NotNull boolean[] zArr, int i2) {
        if (i2 >= 0) {
            return takeLast(zArr, kotlin.ranges.e.coerceAtLeast(zArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> dropLast(@NotNull boolean[] zArr, int i2) {
        if (i2 >= 0) {
            return take(zArr, kotlin.ranges.e.coerceAtLeast(zArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> filter(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(@NotNull boolean[] zArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Boolean, Boolean> function2) {
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z)).booleanValue()) {
                c2.add(Boolean.valueOf(z));
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final List<Boolean> filterNot(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (!function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull boolean[] zArr, R r, @NotNull Function2<? super Boolean, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Boolean.valueOf(zArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull boolean[] zArr, R r, @NotNull Function3<? super Integer, ? super Boolean, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r);
        }
        return r;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(@NotNull short[] sArr, @NotNull M m, @NotNull Function1<? super Short, ? extends K> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            K kInvoke = function1.invoke(Short.valueOf(s));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s));
        }
        return m;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
    public static final int indexOf(@NotNull double[] dArr, double d2) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (d2 == dArr[i2]) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Boolean.valueOf(zArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Boolean> intersect(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        Set<Boolean> mutableSet = toMutableSet(zArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
    public static final int lastIndexOf(@NotNull double[] dArr, double d2) {
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (d2 == dArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull boolean[] zArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> function2) {
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull boolean[] zArr, @NotNull C c2, @NotNull Function1<? super Boolean, ? extends R> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            c2.add(function1.invoke(Boolean.valueOf(z)));
        }
        return c2;
    }

    public static final boolean none(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Pair<List<Short>, List<Short>> partition(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            } else {
                arrayList2.add(Short.valueOf(s));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean randomOrNull(@NotNull boolean[] zArr, @NotNull Random random) {
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer reduceIndexedOrNull(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> function3) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                iIntValue = function3.invoke(Integer.valueOf(i2), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer reduceOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> function2) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                iIntValue = function2.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr, @NotNull Random random) {
        int lastIndex = getLastIndex(bArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            byte b2 = bArr[lastIndex];
            bArr[lastIndex] = bArr[iNextInt];
            bArr[iNextInt] = b2;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        Short shValueOf = null;
        boolean z = false;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                if (z) {
                    return null;
                }
                shValueOf = Short.valueOf(s);
                z = true;
            }
        }
        if (z) {
            return shValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(zArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    @NotNull
    public static final char[] sortedArray(@NotNull char[] cArr) {
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        ArraysKt___ArraysJvmKt.sort(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final char[] sortedArrayDescending(@NotNull char[] cArr) {
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        sortDescending(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final Set<Boolean> subtract(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        Set<Boolean> mutableSet = toMutableSet(zArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Integer> function1) {
        int length = zArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            iIntValue += function1.invoke(Boolean.valueOf(z)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Double> function1) {
        int length = zArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Short> take(@NotNull short[] sArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= sArr.length) {
            return toList(sArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = sArr.length;
        int i4 = 0;
        while (i3 < length) {
            short s = sArr[i3];
            i3++;
            arrayList.add(Short.valueOf(s));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> takeLast(@NotNull short[] sArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = sArr.length;
        if (i2 >= length) {
            return toList(sArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Short.valueOf(sArr[i3]));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C toCollection(@NotNull boolean[] zArr, @NotNull C c2) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            c2.add(Boolean.valueOf(z));
        }
        return c2;
    }

    @NotNull
    public static final Set<Boolean> union(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        Set<Boolean> mutableSet = toMutableSet(zArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final boolean any(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List<Integer> dropWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (z) {
                arrayList.add(Integer.valueOf(i3));
            } else if (!function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                arrayList.add(Integer.valueOf(i3));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filterIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            }
            i3 = i4;
        }
        return arrayList;
    }

    public static final float first(@NotNull float[] fArr) {
        if (!(fArr.length == 0)) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
        }
        return null;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull float[] fArr, @NotNull C c2, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Float.valueOf(f2)));
        }
        return c2;
    }

    public static float last(@NotNull float[] fArr) {
        if (!(fArr.length == 0)) {
            return fArr[getLastIndex(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            short s = sArr[length];
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            arrayList.add(function1.invoke(Float.valueOf(f2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Float.valueOf(f2)));
            i3++;
        }
        return arrayList;
    }

    public static final boolean none(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    public static final float random(@NotNull float[] fArr, @NotNull Random random) {
        if (!(fArr.length == 0)) {
            return fArr[random.nextInt(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int reduce(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> function2) {
        int i2 = 1;
        if (!(iArr.length == 0)) {
            int iIntValue = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    iIntValue = function2.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceIndexed(@NotNull int[] iArr, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Integer> function3) {
        int i2 = 1;
        if (!(iArr.length == 0)) {
            int iIntValue = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    iIntValue = function3.invoke(Integer.valueOf(i2), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i2])).intValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceRightIndexedOrNull(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> function3) {
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            jLongValue = function3.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceRightOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> function2) {
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            jLongValue = function2.invoke(Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static void reverse(@NotNull int[] iArr) {
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(iArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            iArr[i2] = iArr[lastIndex];
            iArr[lastIndex] = i4;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @NotNull
    public static final List<Float> reversed(@NotNull float[] fArr) {
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Float> mutableList = toMutableList(fArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull Collection<Integer> collection) {
        float[] fArr2 = new float[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            fArr2[i2] = fArr[it2.next().intValue()];
            i2++;
        }
        return fArr2;
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull char[] cArr) {
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull R[] rArr, @NotNull Function2<? super Float, ? super R, ? extends V> function2) {
        int iMin = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Float.valueOf(fArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull char[] cArr) {
        return cArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(cArr);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final char[] cArr) {
        return cArr.length == 0 ? SequencesKt__SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Character> iterator() {
                return ArrayIteratorsKt.iterator(cArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(jArr.length), 16));
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Long.valueOf(j));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Long> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(jArr.length), 16));
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Long.valueOf(j)), Long.valueOf(j));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull char[] cArr, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            m.put(function1.invoke(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull char[] cArr, @NotNull M m, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Character.valueOf(c2));
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final List<Character> drop(@NotNull char[] cArr, int i2) {
        if (i2 >= 0) {
            return takeLast(cArr, kotlin.ranges.e.coerceAtLeast(cArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Character> dropLast(@NotNull char[] cArr, int i2) {
        if (i2 >= 0) {
            return take(cArr, kotlin.ranges.e.coerceAtLeast(cArr.length - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> dropLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                    return take(jArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> filter(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterIndexedTo(@NotNull char[] cArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Character, Boolean> function2) {
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Character.valueOf(c3)).booleanValue()) {
                c2.add(Character.valueOf(c3));
            }
            i3 = i4;
        }
        return c2;
    }

    @NotNull
    public static final List<Character> filterNot(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Long.valueOf(j)));
        }
        return arrayList;
    }

    public static final <R> R foldRight(@NotNull char[] cArr, R r, @NotNull Function2<? super Character, ? super R, ? extends R> function2) {
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(Character.valueOf(cArr[lastIndex]), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(@NotNull char[] cArr, R r, @NotNull Function3<? super Integer, ? super Character, ? super R, ? extends R> function3) {
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r);
        }
        return r;
    }

    @NotNull
    public static final <K> Map<K, List<Short>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            K kInvoke = function1.invoke(Short.valueOf(s));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s));
        }
        return linkedHashMap;
    }

    public static final int indexOf(@NotNull boolean[] zArr, boolean z) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (z == zArr[i2]) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (function1.invoke(Character.valueOf(cArr[i2])).booleanValue()) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (function1.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Character> intersect(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        Set<Character> mutableSet = toMutableSet(cArr);
        kotlin.collections.h.retainAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final int lastIndexOf(@NotNull boolean[] zArr, boolean z) {
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (z == zArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull char[] cArr, @NotNull C c2, @NotNull Function2<? super Integer, ? super Character, ? extends R> function2) {
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            c2.add(function2.invoke(Integer.valueOf(i3), Character.valueOf(c3)));
            i3++;
        }
        return c2;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull char[] cArr, @NotNull C c2, @NotNull Function1<? super Character, ? extends R> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            c2.add(function1.invoke(Character.valueOf(c3)));
        }
        return c2;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = function1.invoke(Short.valueOf(s));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                R rInvoke2 = function1.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short maxByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = function1.invoke(Short.valueOf(s));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                R rInvoke2 = function1.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = function1.invoke(Short.valueOf(s));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                R rInvoke2 = function1.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short minByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> function1) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = function1.invoke(Short.valueOf(s));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                R rInvoke2 = function1.invoke(Short.valueOf(s2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s = s2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    public static final boolean none(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character randomOrNull(@NotNull char[] cArr, @NotNull Random random) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    public static final long reduceRight(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> function2) {
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                jLongValue = function2.invoke(Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceRightIndexed(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> function3) {
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            long jLongValue = jArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                jLongValue = function3.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i2]), Long.valueOf(jLongValue)).longValue();
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static long[] reversedArray(@NotNull long[] jArr) {
        int i2 = 0;
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                jArr2[lastIndex - i2] = jArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return jArr2;
    }

    public static long single(@NotNull long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(cArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    public static final void sortDescending(@NotNull double[] dArr) {
        if (dArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(dArr);
            reverse(dArr);
        }
    }

    @NotNull
    public static final Set<Character> subtract(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        Set<Character> mutableSet = toMutableSet(cArr);
        kotlin.collections.h.removeAll(mutableSet, iterable);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(@NotNull char[] cArr, @NotNull Function1<? super Character, Integer> function1) {
        int length = cArr.length;
        int i2 = 0;
        int iIntValue = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            iIntValue += function1.invoke(Character.valueOf(c2)).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(@NotNull char[] cArr, @NotNull Function1<? super Character, Double> function1) {
        int length = cArr.length;
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            dDoubleValue += function1.invoke(Character.valueOf(c2)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Long> takeLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                    return drop(jArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(jArr);
    }

    @NotNull
    public static final List<Long> takeWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (!function1.invoke(Long.valueOf(j)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull char[] cArr, @NotNull C c2) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            c2.add(Character.valueOf(c3));
        }
        return c2;
    }

    @NotNull
    public static List<Long> toList(@NotNull long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(jArr);
        }
        return kotlin.collections.e.listOf(Long.valueOf(jArr[0]));
    }

    @NotNull
    public static final Set<Long> toSet(@NotNull long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(jArr, new LinkedHashSet(q.mapCapacity(jArr.length)));
        }
        return x.setOf(Long.valueOf(jArr[0]));
    }

    @NotNull
    public static final Set<Character> union(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        Set<Character> mutableSet = toMutableSet(cArr);
        kotlin.collections.h.addAll(mutableSet, iterable);
        return mutableSet;
    }

    public static final boolean any(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte maxOrNull(@NotNull byte[] bArr) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                if (b2 < b3) {
                    b2 = b3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (comparator.compare(Integer.valueOf(i3), Integer.valueOf(i5)) < 0) {
                    i3 = i5;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Byte minOrNull(@NotNull byte[] bArr) {
        int i2 = 1;
        if (bArr.length == 0) {
            return null;
        }
        byte b2 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                if (b2 > b3) {
                    b2 = b3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Byte.valueOf(b2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer minWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (comparator.compare(Integer.valueOf(i3), Integer.valueOf(i5)) > 0) {
                    i3 = i5;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    public static final boolean none(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        Integer numValueOf = null;
        boolean z = false;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                if (z) {
                    return null;
                }
                numValueOf = Integer.valueOf(i3);
                z = true;
            }
        }
        if (z) {
            return numValueOf;
        }
        return null;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull T[] tArr, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            m.put(function1.invoke(t), function2.invoke(t));
        }
        return m;
    }

    @NotNull
    public static final <K> List<Integer> distinctBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Integer.valueOf(i3)))) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> filterIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            }
            i3 = i4;
        }
        return arrayList;
    }

    public static final double first(@NotNull double[] dArr) {
        if (!(dArr.length == 0)) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull double[] dArr, @NotNull C c2, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Double.valueOf(d2)));
        }
        return c2;
    }

    public static final int indexOf(@NotNull char[] cArr, char c2) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (c2 == cArr[i2]) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final double last(@NotNull double[] dArr) {
        if (!(dArr.length == 0)) {
            return dArr[getLastIndex(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int lastIndexOf(@NotNull char[] cArr, char c2) {
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (c2 == cArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            int i3 = iArr[length];
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return Integer.valueOf(i3);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            arrayList.add(function1.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Double.valueOf(d2)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    public static final double random(@NotNull double[] dArr, @NotNull Random random) {
        if (!(dArr.length == 0)) {
            return dArr[random.nextInt(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Double> reversed(@NotNull double[] dArr) {
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Double> mutableList = toMutableList(dArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final <T> List<T> slice(@NotNull T[] tArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(tArr[it2.next().intValue()]);
        }
        return arrayList;
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull Collection<Integer> collection) {
        double[] dArr2 = new double[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            dArr2[i2] = dArr[it2.next().intValue()];
            i2++;
        }
        return dArr2;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull R[] rArr, @NotNull Function2<? super Double, ? super R, ? extends V> function2) {
        int iMin = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Double.valueOf(dArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long reduceIndexedOrNull(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> function3) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                jLongValue = function3.invoke(Integer.valueOf(i2), Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(jLongValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Long reduceOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> function2) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                jLongValue = function2.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(jLongValue);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceRightIndexedOrNull(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> function3) {
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            fFloatValue = function3.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceRightOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> function2) {
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            fFloatValue = function2.invoke(Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr, @NotNull Random random) {
        int lastIndex = getLastIndex(sArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            short s = sArr[lastIndex];
            sArr[lastIndex] = sArr[iNextInt];
            sArr[iNextInt] = s;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    public static final void sortDescending(@NotNull char[] cArr) {
        if (cArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(cArr);
            reverse(cArr);
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(fArr.length), 16));
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Float.valueOf(f2));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Float> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(fArr.length), 16));
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Float.valueOf(f2)), Float.valueOf(f2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull byte[] bArr, @NotNull M m, @NotNull Function1<? super Byte, ? extends K> function1, @NotNull Function1<? super Byte, ? extends V> function2) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            m.put(function1.invoke(Byte.valueOf(b2)), function2.invoke(Byte.valueOf(b2)));
        }
        return m;
    }

    @NotNull
    public static final List<Float> dropLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                    return take(fArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Long> dropWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (z) {
                arrayList.add(Long.valueOf(j));
            } else if (!function1.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Float.valueOf(f2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull int[] iArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Integer, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Integer.valueOf(i5)));
            } else {
                a2.append(String.valueOf(i5));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final long reduce(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> function2) {
        int i2 = 1;
        if (!(jArr.length == 0)) {
            long jLongValue = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    jLongValue = function2.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceIndexed(@NotNull long[] jArr, @NotNull Function3<? super Integer, ? super Long, ? super Long, Long> function3) {
        int i2 = 1;
        if (!(jArr.length == 0)) {
            long jLongValue = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    jLongValue = function3.invoke(Integer.valueOf(i2), Long.valueOf(jLongValue), Long.valueOf(jArr[i2])).longValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRight(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> function2) {
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                fFloatValue = function2.invoke(Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceRightIndexed(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> function3) {
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            float fFloatValue = fArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                fFloatValue = function3.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]), Float.valueOf(fFloatValue)).floatValue();
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static void reverse(@NotNull long[] jArr) {
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(jArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            long j = jArr[i2];
            jArr[i2] = jArr[lastIndex];
            jArr[lastIndex] = j;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @NotNull
    public static final float[] reversedArray(@NotNull float[] fArr) {
        int i2 = 0;
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                fArr2[lastIndex - i2] = fArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return fArr2;
    }

    public static final float single(@NotNull float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        Long lValueOf = null;
        boolean z = false;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                if (z) {
                    return null;
                }
                lValueOf = Long.valueOf(j);
                z = true;
            }
        }
        if (z) {
            return lValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Float> takeLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                    return drop(fArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(fArr);
    }

    @NotNull
    public static final List<Float> takeWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (!function1.invoke(Float.valueOf(f2)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f2));
        }
        return arrayList;
    }

    @NotNull
    public static List<Float> toList(@NotNull float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(fArr);
        }
        return kotlin.collections.e.listOf(Float.valueOf(fArr[0]));
    }

    @NotNull
    public static final Set<Float> toSet(@NotNull float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(fArr, new LinkedHashSet(q.mapCapacity(fArr.length)));
        }
        return x.setOf(Float.valueOf(fArr[0]));
    }

    @NotNull
    public static final List<Boolean> filterIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
            i3 = i4;
        }
        return arrayList;
    }

    public static final boolean first(@NotNull boolean[] zArr) {
        if (!(zArr.length == 0)) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull boolean[] zArr, @NotNull C c2, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Boolean.valueOf(z)));
        }
        return c2;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(@NotNull int[] iArr, @NotNull M m, @NotNull Function1<? super Integer, ? extends K> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            K kInvoke = function1.invoke(Integer.valueOf(i3));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i3));
        }
        return m;
    }

    public static final boolean last(@NotNull boolean[] zArr) {
        if (!(zArr.length == 0)) {
            return zArr[getLastIndex(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            long j = jArr[length];
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            arrayList.add(function1.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Boolean.valueOf(z)));
            i3++;
        }
        return arrayList;
    }

    @NotNull
    public static final Pair<List<Integer>, List<Integer>> partition(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                arrayList.add(Integer.valueOf(i3));
            } else {
                arrayList2.add(Integer.valueOf(i3));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    public static final boolean random(@NotNull boolean[] zArr, @NotNull Random random) {
        if (!(zArr.length == 0)) {
            return zArr[random.nextInt(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Boolean> reversed(@NotNull boolean[] zArr) {
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Boolean> mutableList = toMutableList(zArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull Collection<Integer> collection) {
        boolean[] zArr2 = new boolean[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            zArr2[i2] = zArr[it2.next().intValue()];
            i2++;
        }
        return zArr2;
    }

    @NotNull
    public static final List<Integer> take(@NotNull int[] iArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= iArr.length) {
            return toList(iArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = iArr.length;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i3++;
            arrayList.add(Integer.valueOf(i5));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> takeLast(@NotNull int[] iArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = iArr.length;
        if (i2 >= length) {
            return toList(iArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Integer.valueOf(iArr[i3]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull R[] rArr, @NotNull Function2<? super Boolean, ? super R, ? extends V> function2) {
        int iMin = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Boolean.valueOf(zArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull short[] sArr, @NotNull M m, @NotNull Function1<? super Short, ? extends K> function1, @NotNull Function1<? super Short, ? extends V> function2) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            m.put(function1.invoke(Short.valueOf(s)), function2.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short maxOrNull(@NotNull short[] sArr) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                if (s < s2) {
                    s = s2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Short minOrNull(@NotNull short[] sArr) {
        int i2 = 1;
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                short s2 = sArr[i2];
                if (s > s2) {
                    s = s2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Short.valueOf(s);
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sortWith(tArr, ComparisonsKt__ComparisonsKt.reverseOrder(), i2, i3);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) < 0) {
                    j = j2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) > 0) {
                    j = j2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceRightIndexedOrNull(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> function3) {
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            dDoubleValue = function3.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceRightOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> function2) {
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            dDoubleValue = function2.invoke(Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        Float fValueOf = null;
        boolean z = false;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                if (z) {
                    return null;
                }
                fValueOf = Float.valueOf(f2);
                z = true;
            }
        }
        if (z) {
            return fValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Byte> slice(@NotNull byte[] bArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull byte[] bArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sort(bArr, i2, i3);
        reverse(bArr, i2, i3);
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(dArr.length), 16));
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Double.valueOf(d2));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Double> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(dArr.length), 16));
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Double.valueOf(d2)), Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull int[] iArr, @NotNull M m, @NotNull Function1<? super Integer, ? extends K> function1, @NotNull Function1<? super Integer, ? extends V> function2) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            m.put(function1.invoke(Integer.valueOf(i3)), function2.invoke(Integer.valueOf(i3)));
        }
        return m;
    }

    @NotNull
    public static final <K> List<Long> distinctBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Long.valueOf(j)))) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                    return take(dArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> filterIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            int i4 = i3 + 1;
            if (function2.invoke(Integer.valueOf(i3), Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            }
            i3 = i4;
        }
        return arrayList;
    }

    public static final char first(@NotNull char[] cArr) {
        if (!(cArr.length == 0)) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Double.valueOf(d2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull char[] cArr, @NotNull C c2, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c3 = cArr[i2];
            i2++;
            kotlin.collections.h.addAll(c2, function1.invoke(Character.valueOf(c3)));
        }
        return c2;
    }

    @NotNull
    public static final <K> Map<K, List<Integer>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            K kInvoke = function1.invoke(Integer.valueOf(i3));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i3));
        }
        return linkedHashMap;
    }

    public static final char last(@NotNull char[] cArr) {
        if (!(cArr.length == 0)) {
            return cArr[getLastIndex(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            float f2 = fArr[length];
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                return Float.valueOf(f2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            arrayList.add(function1.invoke(Character.valueOf(c2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            arrayList.add(function2.invoke(Integer.valueOf(i3), Character.valueOf(c2)));
            i3++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull char[] cArr, @NotNull Random random) {
        if (!(cArr.length == 0)) {
            return cArr[random.nextInt(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float reduceIndexedOrNull(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> function3) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = function3.invoke(Integer.valueOf(i2), Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Float reduceOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> function2) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fFloatValue = function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double reduceRight(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> function2) {
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                dDoubleValue = function2.invoke(Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceRightIndexed(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> function3) {
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            double dDoubleValue = dArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                dDoubleValue = function3.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i2]), Double.valueOf(dDoubleValue)).doubleValue();
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Character> reversed(@NotNull char[] cArr) {
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Character> mutableList = toMutableList(cArr);
        j.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final double[] reversedArray(@NotNull double[] dArr) {
        int i2 = 0;
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                dArr2[lastIndex - i2] = dArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return dArr2;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr, @NotNull Random random) {
        int lastIndex = getLastIndex(iArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            int i3 = iArr[lastIndex];
            iArr[lastIndex] = iArr[iNextInt];
            iArr[iNextInt] = i3;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    public static final double single(@NotNull double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull Collection<Integer> collection) {
        char[] cArr2 = new char[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            cArr2[i2] = cArr[it2.next().intValue()];
            i2++;
        }
        return cArr2;
    }

    @NotNull
    public static final List<Double> takeLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                    return drop(dArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(dArr);
    }

    @NotNull
    public static final List<Double> takeWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (!function1.invoke(Double.valueOf(d2)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    @NotNull
    public static List<Double> toList(@NotNull double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(dArr);
        }
        return kotlin.collections.e.listOf(Double.valueOf(dArr[0]));
    }

    @NotNull
    public static final Set<Double> toSet(@NotNull double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(dArr, new LinkedHashSet(q.mapCapacity(dArr.length)));
        }
        return x.setOf(Double.valueOf(dArr[0]));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull R[] rArr, @NotNull Function2<? super Character, ? super R, ? extends V> function2) {
        int iMin = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Character.valueOf(cArr[i2]), rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> dropWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (z) {
                arrayList.add(Float.valueOf(f2));
            } else if (!function1.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
                z = true;
            }
        }
        return arrayList;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i3);
        }
        R rInvoke = function1.invoke(Integer.valueOf(i3));
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                R rInvoke2 = function1.invoke(Integer.valueOf(i5));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i3 = i5;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer maxByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i3);
        }
        R rInvoke = function1.invoke(Integer.valueOf(i3));
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                R rInvoke2 = function1.invoke(Integer.valueOf(i5));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i3 = i5;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i3);
        }
        R rInvoke = function1.invoke(Integer.valueOf(i3));
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                R rInvoke2 = function1.invoke(Integer.valueOf(i5));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i3 = i5;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer minByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> function1) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i3);
        }
        R rInvoke = function1.invoke(Integer.valueOf(i3));
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                R rInvoke2 = function1.invoke(Integer.valueOf(i5));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i3 = i5;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    public static final float reduce(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> function2) {
        int i2 = 1;
        if (!(fArr.length == 0)) {
            float fFloatValue = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    fFloatValue = function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceIndexed(@NotNull float[] fArr, @NotNull Function3<? super Integer, ? super Float, ? super Float, Float> function3) {
        int i2 = 1;
        if (!(fArr.length == 0)) {
            float fFloatValue = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    fFloatValue = function3.invoke(Integer.valueOf(i2), Float.valueOf(fFloatValue), Float.valueOf(fArr[i2])).floatValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@NotNull float[] fArr) {
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            float f2 = fArr[i2];
            fArr[i2] = fArr[lastIndex];
            fArr[lastIndex] = f2;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull short[] sArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sort(sArr, i2, i3);
        reverse(sArr, i2, i3);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull long[] jArr, @NotNull M m, @NotNull Function1<? super Long, ? extends K> function1, @NotNull Function1<? super Long, ? extends V> function2) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            m.put(function1.invoke(Long.valueOf(j)), function2.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        Double dValueOf = null;
        boolean z = false;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                if (z) {
                    return null;
                }
                dValueOf = Double.valueOf(d2);
                z = true;
            }
        }
        if (z) {
            return dValueOf;
        }
        return null;
    }

    public static final <T> T first(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull long[] jArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Long, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = jArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            long j = jArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Long.valueOf(j)));
            } else {
                a2.append(String.valueOf(j));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> T last(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                T t = tArr[length];
                if (function1.invoke(t).booleanValue()) {
                    return t;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            double d2 = dArr[length];
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                return Double.valueOf(d2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer maxOrNull(@NotNull int[] iArr) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (i3 < i5) {
                    i3 = i5;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static Integer minOrNull(@NotNull int[] iArr) {
        int i2 = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (1 <= lastIndex) {
            while (true) {
                int i4 = i2 + 1;
                int i5 = iArr[i2];
                if (i3 > i5) {
                    i3 = i5;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i4;
            }
        }
        return Integer.valueOf(i3);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceRightIndexedOrNull(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> function3) {
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            zBooleanValue = function3.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceRightOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> function2) {
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            zBooleanValue = function2.invoke(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? (T[]) ArraysKt.copyOfRange(tArr, 0, 0) : (T[]) ArraysKt.copyOfRange(tArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull int[] iArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sort(iArr, i2, i3);
        reverse(iArr, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super T, ? super R, ? extends V> function2) {
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(tArr[i2], r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(zArr.length), 16));
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Boolean.valueOf(z));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Boolean> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(zArr.length), 16));
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull float[] fArr, @NotNull M m, @NotNull Function1<? super Float, ? extends K> function1, @NotNull Function1<? super Float, ? extends V> function2) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            m.put(function1.invoke(Float.valueOf(f2)), function2.invoke(Float.valueOf(f2)));
        }
        return m;
    }

    @NotNull
    public static final List<Boolean> dropLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                    return take(zArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(@NotNull long[] jArr, @NotNull M m, @NotNull Function1<? super Long, ? extends K> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            K kInvoke = function1.invoke(Long.valueOf(j));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j));
        }
        return m;
    }

    @NotNull
    public static final Pair<List<Long>, List<Long>> partition(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            } else {
                arrayList2.add(Long.valueOf(j));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduceRight(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> function2) {
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                zBooleanValue = function2.invoke(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceRightIndexed(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> function3) {
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                zBooleanValue = function3.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i2]), Boolean.valueOf(zBooleanValue)).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final boolean[] reversedArray(@NotNull boolean[] zArr) {
        int i2 = 0;
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                zArr2[lastIndex - i2] = zArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return zArr2;
    }

    public static final boolean single(@NotNull boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> take(@NotNull long[] jArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= jArr.length) {
            return toList(jArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = jArr.length;
        int i4 = 0;
        while (i3 < length) {
            long j = jArr[i3];
            i3++;
            arrayList.add(Long.valueOf(j));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> takeLast(@NotNull long[] jArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = jArr.length;
        if (i2 >= length) {
            return toList(jArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Long.valueOf(jArr[i3]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> takeLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                    return drop(zArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(zArr);
    }

    @NotNull
    public static final List<Boolean> takeWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (!function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @NotNull
    public static List<Boolean> toList(@NotNull boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(zArr);
        }
        return kotlin.collections.e.listOf(Boolean.valueOf(zArr[0]));
    }

    @NotNull
    public static final Set<Boolean> toSet(@NotNull boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(zArr, new LinkedHashSet(q.mapCapacity(zArr.length)));
        }
        return x.setOf(Boolean.valueOf(zArr[0]));
    }

    public static final byte first(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                return b2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                float f3 = fArr[i2];
                if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) < 0) {
                    f2 = f3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(f2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                float f3 = fArr[i2];
                if (comparator.compare(Float.valueOf(f2), Float.valueOf(f3)) > 0) {
                    f2 = f3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(f2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double reduceIndexedOrNull(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> function3) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = function3.invoke(Integer.valueOf(i2), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Double reduceOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> function2) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dDoubleValue = function2.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr, @NotNull Random random) {
        int lastIndex = getLastIndex(jArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            long j = jArr[lastIndex];
            jArr[lastIndex] = jArr[iNextInt];
            jArr[iNextInt] = j;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        Boolean boolValueOf = null;
        boolean z = false;
        while (i2 < length) {
            boolean z2 = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (z) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z2);
                z = true;
            }
        }
        if (z) {
            return boolValueOf;
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new byte[0] : ArraysKt___ArraysJvmKt.copyOfRange(bArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull long[] jArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sort(jArr, i2, i3);
        reverse(jArr, i2, i3);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull double[] dArr, @NotNull M m, @NotNull Function1<? super Double, ? extends K> function1, @NotNull Function1<? super Double, ? extends V> function2) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            m.put(function1.invoke(Double.valueOf(d2)), function2.invoke(Double.valueOf(d2)));
        }
        return m;
    }

    @NotNull
    public static final <K> List<Float> distinctBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Float.valueOf(f2)))) {
                arrayList.add(Float.valueOf(f2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (z) {
                arrayList.add(Double.valueOf(d2));
            } else if (!function1.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
                z = true;
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            boolean z = zArr[length];
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    public static final double reduce(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> function2) {
        int i2 = 1;
        if (!(dArr.length == 0)) {
            double dDoubleValue = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    dDoubleValue = function2.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceIndexed(@NotNull double[] dArr, @NotNull Function3<? super Integer, ? super Double, ? super Double, Double> function3) {
        int i2 = 1;
        if (!(dArr.length == 0)) {
            double dDoubleValue = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    dDoubleValue = function3.invoke(Integer.valueOf(i2), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i2])).doubleValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@NotNull double[] dArr) {
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(dArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            double d2 = dArr[i2];
            dArr[i2] = dArr[lastIndex];
            dArr[lastIndex] = d2;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public static final short first(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                return s;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte last(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                byte b2 = bArr[length];
                if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                    return b2;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            cCharValue = function3.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceRightOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
            cCharValue = function2.invoke(Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new short[0] : ArraysKt___ArraysJvmKt.copyOfRange(sArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull float[] fArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sort(fArr, i2, i3);
        reverse(fArr, i2, i3);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Byte, ? super R, ? extends V> function2) {
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Byte.valueOf(bArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(cArr.length), 16));
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(Character.valueOf(c2));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(cArr.length), 16));
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Character.valueOf(c2)), Character.valueOf(c2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull boolean[] zArr, @NotNull M m, @NotNull Function1<? super Boolean, ? extends K> function1, @NotNull Function1<? super Boolean, ? extends V> function2) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            m.put(function1.invoke(Boolean.valueOf(z)), function2.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    @NotNull
    public static final List<Character> dropLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                    return take(cArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            kotlin.collections.h.addAll(arrayList, function1.invoke(Character.valueOf(c2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Long>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            K kInvoke = function1.invoke(Long.valueOf(j));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long maxOrNull(@NotNull long[] jArr) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                if (j < j2) {
                    j = j2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long minOrNull(@NotNull long[] jArr) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                if (j > j2) {
                    j = j2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    public static final char reduceRight(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                cCharValue = function2.invoke(Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceRightIndexed(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i2 = lastIndex - 1; i2 >= 0; i2--) {
                cCharValue = function3.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i2]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final char[] reversedArray(@NotNull char[] cArr) {
        int i2 = 0;
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            while (true) {
                int i3 = i2 + 1;
                cArr2[lastIndex - i2] = cArr[i2];
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return cArr2;
    }

    public static char single(@NotNull char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        Character chValueOf = null;
        boolean z = false;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                if (z) {
                    return null;
                }
                chValueOf = Character.valueOf(c2);
                z = true;
            }
        }
        if (z) {
            return chValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Character> takeLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            while (true) {
                int i2 = lastIndex - 1;
                if (!function1.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                    return drop(cArr, lastIndex + 1);
                }
                if (i2 >= 0) {
                    lastIndex = i2;
                }
            }
        }
        return toList(cArr);
    }

    @NotNull
    public static final List<Character> takeWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    @NotNull
    public static List<Character> toList(@NotNull char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(cArr);
        }
        return kotlin.collections.e.listOf(Character.valueOf(cArr[0]));
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            return y.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(cArr, new LinkedHashSet(q.mapCapacity(kotlin.ranges.e.coerceAtMost(cArr.length, 128))));
        }
        return x.setOf(Character.valueOf(cArr[0]));
    }

    public static final int first(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                return i3;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i2 = length - 1;
            char c2 = cArr[length];
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                return Character.valueOf(c2);
            }
            if (i2 < 0) {
                return null;
            }
            length = i2;
        }
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new int[0] : ArraysKt___ArraysJvmKt.copyOfRange(iArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull double[] dArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sort(dArr, i2, i3);
        reverse(dArr, i2, i3);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull char[] cArr, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            m.put(function1.invoke(Character.valueOf(c2)), function2.invoke(Character.valueOf(c2)));
        }
        return m;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull float[] fArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Float, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = fArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            float f2 = fArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Float.valueOf(f2)));
            } else {
                a2.append(String.valueOf(f2));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = function1.invoke(Long.valueOf(j));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                R rInvoke2 = function1.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long maxByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = function1.invoke(Long.valueOf(j));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                R rInvoke2 = function1.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = function1.invoke(Long.valueOf(j));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                R rInvoke2 = function1.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long minByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> function1) {
        int i2 = 1;
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = function1.invoke(Long.valueOf(j));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long j2 = jArr[i2];
                R rInvoke2 = function1.invoke(Long.valueOf(j2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j = j2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Long.valueOf(j);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean reduceIndexedOrNull(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> function3) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                zBooleanValue = function3.invoke(Integer.valueOf(i2), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Boolean reduceOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> function2) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                zBooleanValue = function2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr, @NotNull Random random) {
        int lastIndex = getLastIndex(fArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            float f2 = fArr[lastIndex];
            fArr[lastIndex] = fArr[iNextInt];
            fArr[iNextInt] = f2;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    @NotNull
    public static final List<Boolean> dropWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            boolean z2 = zArr[i2];
            i2++;
            if (z) {
                arrayList.add(Boolean.valueOf(z2));
            } else if (!function1.invoke(Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
                z = true;
            }
        }
        return arrayList;
    }

    public static final long first(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                return j;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(@NotNull float[] fArr, @NotNull M m, @NotNull Function1<? super Float, ? extends K> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            K kInvoke = function1.invoke(Float.valueOf(f2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f2));
        }
        return m;
    }

    public static final short last(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                short s = sArr[length];
                if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                    return s;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                double d3 = dArr[i2];
                if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) < 0) {
                    d2 = d3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(d2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                double d3 = dArr[i2];
                if (comparator.compare(Double.valueOf(d2), Double.valueOf(d3)) > 0) {
                    d2 = d3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(d2);
    }

    @NotNull
    public static final Pair<List<Float>, List<Float>> partition(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                arrayList.add(Float.valueOf(f2));
            } else {
                arrayList2.add(Float.valueOf(f2));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduce(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> function2) {
        int i2 = 1;
        if (!(zArr.length == 0)) {
            boolean zBooleanValue = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    zBooleanValue = function2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceIndexed(@NotNull boolean[] zArr, @NotNull Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> function3) {
        int i2 = 1;
        if (!(zArr.length == 0)) {
            boolean zBooleanValue = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    zBooleanValue = function3.invoke(Integer.valueOf(i2), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i2])).booleanValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@NotNull boolean[] zArr) {
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            boolean z = zArr[i2];
            zArr[i2] = zArr[lastIndex];
            zArr[lastIndex] = z;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new long[0] : ArraysKt___ArraysJvmKt.copyOfRange(jArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(@NotNull char[] cArr, int i2, int i3) {
        ArraysKt___ArraysJvmKt.sort(cArr, i2, i3);
        reverse(cArr, i2, i3);
    }

    @NotNull
    public static final List<Float> take(@NotNull float[] fArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= fArr.length) {
            return toList(fArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = fArr.length;
        int i4 = 0;
        while (i3 < length) {
            float f2 = fArr[i3];
            i3++;
            arrayList.add(Float.valueOf(f2));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> takeLast(@NotNull float[] fArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = fArr.length;
        if (i2 >= length) {
            return toList(fArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Float.valueOf(fArr[i3]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Short, ? super R, ? extends V> function2) {
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Short.valueOf(sArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(tArr.length), 16));
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(t), function2.invoke(t));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Double> distinctBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Double.valueOf(d2)))) {
                arrayList.add(Double.valueOf(d2));
            }
        }
        return arrayList;
    }

    public static final <T> T single(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> function1) {
        int length = tArr.length;
        int i2 = 0;
        T t = null;
        boolean z = false;
        while (i2 < length) {
            T t2 = tArr[i2];
            i2++;
            if (function1.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                return f2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull float[] fArr) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fMax = Math.max(fMax, fArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fMax);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull float[] fArr) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                fMin = Math.min(fMin, fArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(fMin);
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new float[0] : ArraysKt___ArraysJvmKt.copyOfRange(fArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    public static final double first(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                return d2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                int i3 = iArr[length];
                if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                    return i3;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                cCharValue = function3.invoke(Integer.valueOf(i2), Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(cCharValue);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Character reduceOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                cCharValue = function2.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(cCharValue);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr, @NotNull Random random) {
        int lastIndex = getLastIndex(dArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            double d2 = dArr[lastIndex];
            dArr[lastIndex] = dArr[iNextInt];
            dArr[iNextInt] = d2;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new double[0] : ArraysKt___ArraysJvmKt.copyOfRange(dArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Integer, ? super R, ? extends V> function2) {
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Integer.valueOf(iArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> function1, @NotNull Function1<? super Byte, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(bArr.length), 16));
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Byte.valueOf(b2)), function2.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<Character> dropWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (z) {
                arrayList.add(Character.valueOf(c2));
            } else if (!function1.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Float>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            K kInvoke = function1.invoke(Float.valueOf(f2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f2));
        }
        return linkedHashMap;
    }

    public static final char reduce(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> function2) {
        int i2 = 1;
        if (!(cArr.length == 0)) {
            char cCharValue = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    cCharValue = function2.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceIndexed(@NotNull char[] cArr, @NotNull Function3<? super Integer, ? super Character, ? super Character, Character> function3) {
        int i2 = 1;
        if (!(cArr.length == 0)) {
            char cCharValue = cArr[0];
            int lastIndex = getLastIndex(cArr);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = i2 + 1;
                    cCharValue = function3.invoke(Integer.valueOf(i2), Character.valueOf(cCharValue), Character.valueOf(cArr[i2])).charValue();
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@NotNull char[] cArr) {
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(cArr);
        int i2 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            char c2 = cArr[i2];
            cArr[i2] = cArr[lastIndex];
            cArr[lastIndex] = c2;
            lastIndex--;
            if (i2 == length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public static final byte single(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> function1) {
        int length = bArr.length;
        int i2 = 0;
        Byte bValueOf = null;
        boolean z = false;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            if (function1.invoke(Byte.valueOf(b2)).booleanValue()) {
                if (!z) {
                    bValueOf = Byte.valueOf(b2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
            return bValueOf.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                return z;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull double[] dArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Double, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = dArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            double d2 = dArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Double.valueOf(d2)));
            } else {
                a2.append(String.valueOf(d2));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean maxWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                boolean z2 = zArr[i2];
                if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) < 0) {
                    z = z2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Boolean minWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                boolean z2 = zArr[i2];
                if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) > 0) {
                    z = z2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new boolean[0] : ArraysKt___ArraysJvmKt.copyOfRange(zArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <K> List<Boolean> distinctBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Boolean.valueOf(z)))) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(@NotNull double[] dArr, @NotNull M m, @NotNull Function1<? super Double, ? extends K> function1) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            K kInvoke = function1.invoke(Double.valueOf(d2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d2));
        }
        return m;
    }

    @NotNull
    public static final Pair<List<Double>, List<Double>> partition(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                arrayList.add(Double.valueOf(d2));
            } else {
                arrayList2.add(Double.valueOf(d2));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static final List<Double> take(@NotNull double[] dArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= dArr.length) {
            return toList(dArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = dArr.length;
        int i4 = 0;
        while (i3 < length) {
            double d2 = dArr[i3];
            i3++;
            arrayList.add(Double.valueOf(d2));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> takeLast(@NotNull double[] dArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = dArr.length;
        if (i2 >= length) {
            return toList(dArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Double.valueOf(dArr[i3]));
        }
        return arrayList;
    }

    public static final char first(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                return c2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                long j = jArr[length];
                if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                    return j;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = function1.invoke(Float.valueOf(f2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                float f3 = fArr[i2];
                R rInvoke2 = function1.invoke(Float.valueOf(f3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f2 = f3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(f2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float maxByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = function1.invoke(Float.valueOf(f2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                float f3 = fArr[i2];
                R rInvoke2 = function1.invoke(Float.valueOf(f3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f2 = f3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(f2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull double[] dArr) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dMax = Math.max(dMax, dArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dMax);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = function1.invoke(Float.valueOf(f2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                float f3 = fArr[i2];
                R rInvoke2 = function1.invoke(Float.valueOf(f3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f2 = f3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(f2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float minByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> function1) {
        int i2 = 1;
        if (fArr.length == 0) {
            return null;
        }
        float f2 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f2);
        }
        R rInvoke = function1.invoke(Float.valueOf(f2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                float f3 = fArr[i2];
                R rInvoke2 = function1.invoke(Float.valueOf(f3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f2 = f3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Float.valueOf(f2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull double[] dArr) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                dMin = Math.min(dMin, dArr[i2]);
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(dMin);
    }

    @NotNull
    public static final List<Float> slice(@NotNull float[] fArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? new char[0] : ArraysKt___ArraysJvmKt.copyOfRange(cArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Long, ? super R, ? extends V> function2) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Long.valueOf(jArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> function1, @NotNull Function1<? super Short, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(sArr.length), 16));
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Short.valueOf(s)), function2.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr, @NotNull Random random) {
        int lastIndex = getLastIndex(zArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            boolean z = zArr[lastIndex];
            zArr[lastIndex] = zArr[iNextInt];
            zArr[iNextInt] = z;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void reverse(@NotNull T[] tArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, tArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            T t = tArr[i2];
            tArr[i2] = tArr[i5];
            tArr[i5] = t;
            i5--;
            i2++;
        }
    }

    public static final short single(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> function1) {
        int length = sArr.length;
        int i2 = 0;
        Short shValueOf = null;
        boolean z = false;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            if (function1.invoke(Short.valueOf(s)).booleanValue()) {
                if (!z) {
                    shValueOf = Short.valueOf(s);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(shValueOf, "null cannot be cast to non-null type kotlin.Short");
            return shValueOf.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                float f2 = fArr[length];
                if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                    return f2;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) < 0) {
                    c2 = c3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                if (comparator.compare(Character.valueOf(c2), Character.valueOf(c3)) > 0) {
                    c2 = c3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Float, ? super R, ? extends V> function2) {
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Float.valueOf(fArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> function1, @NotNull Function1<? super Integer, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(iArr.length), 16));
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Integer.valueOf(i3)), function2.invoke(Integer.valueOf(i3)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Character> distinctBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> function1) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (hashSet.add(function1.invoke(Character.valueOf(c2)))) {
                arrayList.add(Character.valueOf(c2));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Double>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            K kInvoke = function1.invoke(Double.valueOf(d2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull boolean[] zArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = zArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            boolean z = zArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Boolean.valueOf(z)));
            } else {
                a2.append(String.valueOf(z));
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M m, @NotNull Function1<? super Boolean, ? extends K> function1) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            K kInvoke = function1.invoke(Boolean.valueOf(z));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z));
        }
        return m;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull char[] cArr) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                if (Intrinsics.compare((int) c2, (int) c3) < 0) {
                    c2 = c3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull char[] cArr) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                if (Intrinsics.compare((int) c2, (int) c3) > 0) {
                    c2 = c3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @NotNull
    public static final Pair<List<Boolean>, List<Boolean>> partition(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            } else {
                arrayList2.add(Boolean.valueOf(z));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr, @NotNull Random random) {
        int lastIndex = getLastIndex(cArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i2 = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            char c2 = cArr[lastIndex];
            cArr[lastIndex] = cArr[iNextInt];
            cArr[iNextInt] = c2;
            if (1 > i2) {
                return;
            } else {
                lastIndex = i2;
            }
        }
    }

    @NotNull
    public static final List<Boolean> take(@NotNull boolean[] zArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= zArr.length) {
            return toList(zArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = zArr.length;
        int i4 = 0;
        while (i3 < length) {
            boolean z = zArr[i3];
            i3++;
            arrayList.add(Boolean.valueOf(z));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> takeLast(@NotNull boolean[] zArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = zArr.length;
        if (i2 >= length) {
            return toList(zArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Boolean.valueOf(zArr[i3]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull byte[] bArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, bArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            bArr[i2] = bArr[i5];
            bArr[i5] = b2;
            i5--;
            i2++;
        }
    }

    public static final double last(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                double d2 = dArr[length];
                if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                    return d2;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Double, ? super R, ? extends V> function2) {
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Double.valueOf(dArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> function1, @NotNull Function1<? super Long, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(jArr.length), 16));
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Long.valueOf(j)), function2.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = function1.invoke(Double.valueOf(d2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                double d3 = dArr[i2];
                R rInvoke2 = function1.invoke(Double.valueOf(d3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d2 = d3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(d2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double maxByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = function1.invoke(Double.valueOf(d2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                double d3 = dArr[i2];
                R rInvoke2 = function1.invoke(Double.valueOf(d3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d2 = d3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(d2);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = function1.invoke(Double.valueOf(d2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                double d3 = dArr[i2];
                R rInvoke2 = function1.invoke(Double.valueOf(d3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d2 = d3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(d2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double minByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> function1) {
        int i2 = 1;
        if (dArr.length == 0) {
            return null;
        }
        double d2 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d2);
        }
        R rInvoke = function1.invoke(Double.valueOf(d2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                double d3 = dArr[i2];
                R rInvoke2 = function1.invoke(Double.valueOf(d3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d2 = d3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Double.valueOf(d2);
    }

    public static final int single(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> function1) {
        int length = iArr.length;
        int i2 = 0;
        Integer numValueOf = null;
        boolean z = false;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            if (function1.invoke(Integer.valueOf(i3)).booleanValue()) {
                if (!z) {
                    numValueOf = Integer.valueOf(i3);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(numValueOf, "null cannot be cast to non-null type kotlin.Int");
            return numValueOf.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull char[] cArr, @NotNull A a2, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i2, @NotNull CharSequence charSequence4, @Nullable Function1<? super Character, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int length = cArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            char c2 = cArr[i3];
            i3++;
            i4++;
            if (i4 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            if (function1 != null) {
                a2.append(function1.invoke(Character.valueOf(c2)));
            } else {
                a2.append(c2);
            }
        }
        if (i2 >= 0 && i4 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final boolean last(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                boolean z = zArr[length];
                if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
                    return z;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull short[] sArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, sArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            short s = sArr[i2];
            sArr[i2] = sArr[i5];
            sArr[i5] = s;
            i5--;
            i2++;
        }
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Boolean, ? super R, ? extends V> function2) {
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Boolean.valueOf(zArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> function1, @NotNull Function1<? super Float, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(fArr.length), 16));
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Float.valueOf(f2)), function2.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Boolean>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            K kInvoke = function1.invoke(Boolean.valueOf(z));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull char[] cArr, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            K kInvoke = function1.invoke(Character.valueOf(c2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c2));
        }
        return m;
    }

    @NotNull
    public static final Pair<List<Character>, List<Character>> partition(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                arrayList.add(Character.valueOf(c2));
            } else {
                arrayList2.add(Character.valueOf(c2));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static final List<Character> take(@NotNull char[] cArr, int i2) {
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 >= cArr.length) {
            return toList(cArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = cArr.length;
        int i4 = 0;
        while (i3 < length) {
            char c2 = cArr[i3];
            i3++;
            arrayList.add(Character.valueOf(c2));
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> takeLast(@NotNull char[] cArr, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = cArr.length;
        if (i2 >= length) {
            return toList(cArr);
        }
        if (i2 == 1) {
            return kotlin.collections.e.listOf(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = length - i2; i3 < length; i3++) {
            arrayList.add(Character.valueOf(cArr[i3]));
        }
        return arrayList;
    }

    public static final long single(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> function1) {
        int length = jArr.length;
        int i2 = 0;
        Long lValueOf = null;
        boolean z = false;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                if (!z) {
                    lValueOf = Long.valueOf(j);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(lValueOf, "null cannot be cast to non-null type kotlin.Long");
            return lValueOf.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it2.next().intValue()]));
        }
        return arrayList;
    }

    public static final char last(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char c2 = cArr[length];
                if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                    return c2;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> iterable, @NotNull Function2<? super Character, ? super R, ? extends V> function2) {
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(function2.invoke(Character.valueOf(cArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> function1, @NotNull Function1<? super Double, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(dArr.length), 16));
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Double.valueOf(d2)), function2.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull int[] iArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, iArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            int i6 = iArr[i2];
            iArr[i2] = iArr[i5];
            iArr[i5] = i6;
            i5--;
            i2++;
        }
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = function1.invoke(Boolean.valueOf(z));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                boolean z2 = zArr[i2];
                R rInvoke2 = function1.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = function1.invoke(Boolean.valueOf(z));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                boolean z2 = zArr[i2];
                R rInvoke2 = function1.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(z);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = function1.invoke(Boolean.valueOf(z));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                boolean z2 = zArr[i2];
                R rInvoke2 = function1.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(z);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean minByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> function1) {
        int i2 = 1;
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = function1.invoke(Boolean.valueOf(z));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                boolean z2 = zArr[i2];
                R rInvoke2 = function1.invoke(Boolean.valueOf(z2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z = z2;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull T[] tArr, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            T t = tArr[i2];
            i2++;
            K kInvoke = function1.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(t));
        }
        return m;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull Function2<? super Byte, ? super Byte, ? extends V> function2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Byte.valueOf(bArr[i2]), Byte.valueOf(bArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> function1, @NotNull Function1<? super Boolean, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(zArr.length), 16));
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Boolean.valueOf(z)), function2.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            K kInvoke = function1.invoke(Character.valueOf(c2));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c2));
        }
        return linkedHashMap;
    }

    public static final float single(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> function1) {
        int length = fArr.length;
        int i2 = 0;
        Float fValueOf = null;
        boolean z = false;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            if (function1.invoke(Float.valueOf(f2)).booleanValue()) {
                if (!z) {
                    fValueOf = Float.valueOf(f2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(fValueOf, "null cannot be cast to non-null type kotlin.Float");
            return fValueOf.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(@NotNull long[] jArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, jArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            long j = jArr[i2];
            jArr[i2] = jArr[i5];
            jArr[i5] = j;
            i5--;
            i2++;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull short[] sArr, @NotNull short[] sArr2, @NotNull Function2<? super Short, ? super Short, ? extends V> function2) {
        int iMin = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Short.valueOf(sArr[i2]), Short.valueOf(sArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(cArr.length), 16));
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            linkedHashMap.put(function1.invoke(Character.valueOf(c2)), function2.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull int[] iArr, @NotNull int[] iArr2, @NotNull Function2<? super Integer, ? super Integer, ? extends V> function2) {
        int iMin = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(iArr2[i2])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull byte[] bArr, @NotNull M m, @NotNull Function1<? super Byte, ? extends K> function1, @NotNull Function1<? super Byte, ? extends V> function2) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            K kInvoke = function1.invoke(Byte.valueOf(b2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Byte.valueOf(b2)));
        }
        return m;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = function1.invoke(Character.valueOf(c2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                R rInvoke2 = function1.invoke(Character.valueOf(c3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c2 = c3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = function1.invoke(Character.valueOf(c2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                R rInvoke2 = function1.invoke(Character.valueOf(c3));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c2 = c3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = function1.invoke(Character.valueOf(c2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                R rInvoke2 = function1.invoke(Character.valueOf(c3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c2 = c3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> function1) {
        int i2 = 1;
        if (cArr.length == 0) {
            return null;
        }
        char c2 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c2);
        }
        R rInvoke = function1.invoke(Character.valueOf(c2));
        if (1 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                char c3 = cArr[i2];
                R rInvoke2 = function1.invoke(Character.valueOf(c3));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c2 = c3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return Character.valueOf(c2);
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull float[] fArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, fArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            float f2 = fArr[i2];
            fArr[i2] = fArr[i5];
            fArr[i5] = f2;
            i5--;
            i2++;
        }
    }

    public static final double single(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> function1) {
        int length = dArr.length;
        int i2 = 0;
        Double dValueOf = null;
        boolean z = false;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            if (function1.invoke(Double.valueOf(d2)).booleanValue()) {
                if (!z) {
                    dValueOf = Double.valueOf(d2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(dValueOf, "null cannot be cast to non-null type kotlin.Double");
            return dValueOf.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tArr.length;
        int i2 = 0;
        while (i2 < length) {
            a04 a04Var = tArr[i2];
            i2++;
            K kInvoke = function1.invoke(a04Var);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(a04Var));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull long[] jArr, @NotNull long[] jArr2, @NotNull Function2<? super Long, ? super Long, ? extends V> function2) {
        int iMin = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Long.valueOf(jArr[i2]), Long.valueOf(jArr2[i2])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull double[] dArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, dArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            double d2 = dArr[i2];
            dArr[i2] = dArr[i5];
            dArr[i5] = d2;
            i5--;
            i2++;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull Function2<? super Float, ? super Float, ? extends V> function2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Float.valueOf(fArr[i2]), Float.valueOf(fArr2[i2])));
        }
        return arrayList;
    }

    public static final boolean single(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> function1) {
        int length = zArr.length;
        int i2 = 0;
        Boolean boolValueOf = null;
        boolean z = false;
        while (i2 < length) {
            boolean z2 = zArr[i2];
            i2++;
            if (function1.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (!z) {
                    boolValueOf = Boolean.valueOf(z2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
            return boolValueOf.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull short[] sArr, @NotNull M m, @NotNull Function1<? super Short, ? extends K> function1, @NotNull Function1<? super Short, ? extends V> function2) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            K kInvoke = function1.invoke(Short.valueOf(s));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull double[] dArr, @NotNull double[] dArr2, @NotNull Function2<? super Double, ? super Double, ? extends V> function2) {
        int iMin = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Double.valueOf(dArr[i2]), Double.valueOf(dArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> function1, @NotNull Function1<? super Byte, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            K kInvoke = function1.invoke(Byte.valueOf(b2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Byte.valueOf(b2)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull boolean[] zArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, zArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            boolean z = zArr[i2];
            zArr[i2] = zArr[i5];
            zArr[i5] = z;
            i5--;
            i2++;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, @NotNull Function2<? super Boolean, ? super Boolean, ? extends V> function2) {
        int iMin = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zArr2[i2])));
        }
        return arrayList;
    }

    public static final char single(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> function1) {
        int length = cArr.length;
        int i2 = 0;
        Character chValueOf = null;
        boolean z = false;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            if (function1.invoke(Character.valueOf(c2)).booleanValue()) {
                if (!z) {
                    chValueOf = Character.valueOf(c2);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z) {
            Objects.requireNonNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull int[] iArr, @NotNull M m, @NotNull Function1<? super Integer, ? extends K> function1, @NotNull Function1<? super Integer, ? extends V> function2) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            K kInvoke = function1.invoke(Integer.valueOf(i3));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Integer.valueOf(i3)));
        }
        return m;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull char[] cArr, @NotNull char[] cArr2, @NotNull Function2<? super Character, ? super Character, ? extends V> function2) {
        int iMin = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(Character.valueOf(cArr[i2]), Character.valueOf(cArr2[i2])));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(@NotNull char[] cArr, int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, cArr.length);
        int i4 = (i2 + i3) / 2;
        if (i2 == i4) {
            return;
        }
        int i5 = i3 - 1;
        while (i2 < i4) {
            char c2 = cArr[i2];
            cArr[i2] = cArr[i5];
            cArr[i5] = c2;
            i5--;
            i2++;
        }
    }

    @NotNull
    public static <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull R[] rArr) {
        int iMin = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(TuplesKt.to(tArr[i2], rArr[i2]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> function1, @NotNull Function1<? super Short, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            short s = sArr[i2];
            i2++;
            K kInvoke = function1.invoke(Short.valueOf(s));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull long[] jArr, @NotNull M m, @NotNull Function1<? super Long, ? extends K> function1, @NotNull Function1<? super Long, ? extends V> function2) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            K kInvoke = function1.invoke(Long.valueOf(j));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull R[] rArr) {
        int iMin = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            arrayList.add(TuplesKt.to(Byte.valueOf(b2), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull R[] rArr) {
        int iMin = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            short s = sArr[i2];
            arrayList.add(TuplesKt.to(Short.valueOf(s), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> function1, @NotNull Function1<? super Integer, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            K kInvoke = function1.invoke(Integer.valueOf(i3));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Integer.valueOf(i3)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull float[] fArr, @NotNull M m, @NotNull Function1<? super Float, ? extends K> function1, @NotNull Function1<? super Float, ? extends V> function2) {
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            K kInvoke = function1.invoke(Float.valueOf(f2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Float.valueOf(f2)));
        }
        return m;
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull R[] rArr) {
        int iMin = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            arrayList.add(TuplesKt.to(Integer.valueOf(i4), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull R[] rArr) {
        int iMin = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            long j = jArr[i2];
            arrayList.add(TuplesKt.to(Long.valueOf(j), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> function1, @NotNull Function1<? super Long, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            K kInvoke = function1.invoke(Long.valueOf(j));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull double[] dArr, @NotNull M m, @NotNull Function1<? super Double, ? extends K> function1, @NotNull Function1<? super Double, ? extends V> function2) {
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            K kInvoke = function1.invoke(Double.valueOf(d2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Double.valueOf(d2)));
        }
        return m;
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull R[] rArr) {
        int iMin = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            float f2 = fArr[i2];
            arrayList.add(TuplesKt.to(Float.valueOf(f2), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull R[] rArr) {
        int iMin = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            double d2 = dArr[i2];
            arrayList.add(TuplesKt.to(Double.valueOf(d2), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> function1, @NotNull Function1<? super Float, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = fArr.length;
        int i2 = 0;
        while (i2 < length) {
            float f2 = fArr[i2];
            i2++;
            K kInvoke = function1.invoke(Float.valueOf(f2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Float.valueOf(f2)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M m, @NotNull Function1<? super Boolean, ? extends K> function1, @NotNull Function1<? super Boolean, ? extends V> function2) {
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            K kInvoke = function1.invoke(Boolean.valueOf(z));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull R[] rArr) {
        int iMin = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            boolean z = zArr[i2];
            arrayList.add(TuplesKt.to(Boolean.valueOf(z), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull char[] cArr, @NotNull M m, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            K kInvoke = function1.invoke(Character.valueOf(c2));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(Character.valueOf(c2)));
        }
        return m;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull R[] rArr) {
        int iMin = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            char c2 = cArr[i2];
            arrayList.add(TuplesKt.to(Character.valueOf(c2), rArr[i2]));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> function1, @NotNull Function1<? super Double, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = dArr.length;
        int i2 = 0;
        while (i2 < length) {
            double d2 = dArr[i2];
            i2++;
            K kInvoke = function1.invoke(Double.valueOf(d2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Double.valueOf(d2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> iterable) {
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(tArr[i2], r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> function1, @NotNull Function1<? super Boolean, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = zArr.length;
        int i2 = 0;
        while (i2 < length) {
            boolean z = zArr[i2];
            i2++;
            K kInvoke = function1.invoke(Boolean.valueOf(z));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> iterable) {
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> iterable) {
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> function1, @NotNull Function1<? super Character, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = cArr[i2];
            i2++;
            K kInvoke = function1.invoke(Character.valueOf(c2));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(Character.valueOf(c2)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> iterable) {
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> iterable) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> iterable) {
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> iterable) {
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> iterable) {
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> iterable) {
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i2 = 0;
        for (R r : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i2]), r));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Byte, Byte>> zip(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i2]), Byte.valueOf(bArr2[i2])));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Short, Short>> zip(@NotNull short[] sArr, @NotNull short[] sArr2) {
        int iMin = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i2]), Short.valueOf(sArr2[i2])));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Integer, Integer>> zip(@NotNull int[] iArr, @NotNull int[] iArr2) {
        int iMin = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i2]), Integer.valueOf(iArr2[i2])));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Long, Long>> zip(@NotNull long[] jArr, @NotNull long[] jArr2) {
        int iMin = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i2]), Long.valueOf(jArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Float, Float>> zip(@NotNull float[] fArr, @NotNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i2]), Float.valueOf(fArr2[i2])));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Double, Double>> zip(@NotNull double[] dArr, @NotNull double[] dArr2) {
        int iMin = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i2]), Double.valueOf(dArr2[i2])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Boolean, Boolean>> zip(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        int iMin = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i2]), Boolean.valueOf(zArr2[i2])));
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull char[] cArr, @NotNull char[] cArr2) {
        int iMin = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            int i3 = i2 + 1;
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i2]), Character.valueOf(cArr2[i2])));
            i2 = i3;
        }
        return arrayList;
    }
}
