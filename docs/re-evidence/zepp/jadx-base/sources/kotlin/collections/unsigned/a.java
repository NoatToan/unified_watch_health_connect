package kotlin.collections.unsigned;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.UArraySortingKt;
import kotlin.collections.h;
import kotlin.collections.j;
import kotlin.collections.q;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class a extends UArraysKt___UArraysJvmKt {

    /* JADX INFO: renamed from: kotlin.collections.unsigned.a$a, reason: collision with other inner class name */
    public static final class C1158a extends Lambda implements Function0<Iterator<? extends UInt>> {
        public final /* synthetic */ int[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1158a(int[] iArr) {
            super(0);
            this.a = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<UInt> getA() {
            return UIntArray.m3897iteratorimpl(this.a);
        }
    }

    public static final class b extends Lambda implements Function0<Iterator<? extends ULong>> {
        public final /* synthetic */ long[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long[] jArr) {
            super(0);
            this.a = jArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<ULong> getA() {
            return ULongArray.m3922iteratorimpl(this.a);
        }
    }

    public static final class c extends Lambda implements Function0<Iterator<? extends UByte>> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<UByte> getA() {
            return UByteArray.m3872iteratorimpl(this.a);
        }
    }

    public static final class d extends Lambda implements Function0<Iterator<? extends UShort>> {
        public final /* synthetic */ short[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(short[] sArr) {
            super(0);
            this.a = sArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<UShort> getA() {
            return UShortArray.m3947iteratorimpl(this.a);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] A(long[] jArr) {
        return jArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] A0(short[] sArr, int i, int i2) {
        return UShortArray.m3938constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(sArr, i, i2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt A1(int[] iArr, Function1<? super UInt, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(iArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, last);
                if (function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA)).booleanValue()) {
                    return UInt.m3879boximpl(iM3893getpVg5ArA);
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void A2(long[] jArr, Function2<? super Integer, ? super ULong, Unit> function2) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
            i++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> A3(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr));
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            arrayList.add(function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R A4(short[] sArr, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] A5(int[] iArr, Function1<? super UInt, Unit> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
        }
        return iArr;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final ULong A6(long[] jArr, Function2<? super ULong, ? super ULong, ULong> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM3918getsVKNKU = function2.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), ULong.m3904boximpl(jM3918getsVKNKU)).m3910unboximpl();
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long A7(long[] jArr) {
        return ULong.m3905constructorimpl(ArraysKt___ArraysKt.sum(jArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> A8(long[] jArr, Iterable<? extends R> iterable, Function2<? super ULong, ? super R, ? extends V> function2) {
        int iM3919getSizeimpl = ULongArray.m3919getSizeimpl(jArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3919getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3919getSizeimpl) {
                break;
            }
            arrayList.add(function2.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] B(short[] sArr) {
        return sArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] B0(int[] iArr, int i, int i2) {
        return UIntArray.m3888constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(iArr, i, i2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort B1(short[] sArr, Function1<? super UShort, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(sArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, last);
                if (function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg)).booleanValue()) {
                    return UShort.m3929boximpl(sM3943getMh2AYeg);
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void B2(short[] sArr, Function2<? super Integer, ? super UShort, Unit> function2) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
            i++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> B3(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr));
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            arrayList.add(function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R B4(int[] iArr, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] B5(short[] sArr, Function1<? super UShort, Unit> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UShort B6(short[] sArr, Function2<? super UShort, ? super UShort, UShort> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM3943getMh2AYeg = function2.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), UShort.m3929boximpl(sM3943getMh2AYeg)).m3935unboximpl();
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int B7(short[] sArr) {
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(itM3947iteratorimpl.next().m3935unboximpl() & UShort.MAX_VALUE));
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> B8(byte[] bArr, Iterable<? extends R> iterable, Function2<? super UByte, ? super R, ? extends V> function2) {
        int iM3869getSizeimpl = UByteArray.m3869getSizeimpl(bArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3869getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3869getSizeimpl) {
                break;
            }
            arrayList.add(function2.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] C(byte[] bArr) {
        return UByteArray.m3863constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int C0(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            if (function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int C1(int[] iArr) {
        return UInt.m3880constructorimpl(ArraysKt___ArraysKt.first(iArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short C2(short[] sArr, int i, Function1<? super Integer, UShort> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(sArr)) ? function1.invoke(Integer.valueOf(i)).m3935unboximpl() : UShortArray.m3943getMh2AYeg(sArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> C3(byte[] bArr, Function2<? super Integer, ? super UByte, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr));
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            arrayList.add(function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte C4(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                    R rInvoke2 = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        bM3868getw2LRezQ = bM3868getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] C5(byte[] bArr, Function2<? super Integer, ? super UByte, Unit> function2) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
            i++;
        }
        return bArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void C6(int[] iArr) {
        ArraysKt___ArraysKt.reverse(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final int C7(byte[] bArr, Function1<? super UByte, UInt> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int iM3880constructorimpl = 0;
        while (itM3872iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> C8(int[] iArr, R[] rArr, Function2<? super UInt, ? super R, ? extends V> function2) {
        int iMin = Math.min(UIntArray.m3894getSizeimpl(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] D(int[] iArr) {
        return UIntArray.m3888constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int D0(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            if (function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte D1(byte[] bArr) {
        return UByte.m3855constructorimpl(ArraysKt___ArraysKt.first(bArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int D2(int[] iArr, int i, Function1<? super Integer, UInt> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(iArr)) ? function1.invoke(Integer.valueOf(i)).m3885unboximpl() : UIntArray.m3893getpVg5ArA(iArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> D3(int[] iArr, Function2<? super Integer, ? super UInt, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr));
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            arrayList.add(function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong D4(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                    R rInvoke2 = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        jM3918getsVKNKU = jM3918getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] D5(int[] iArr, Function2<? super Integer, ? super UInt, Unit> function2) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
            i++;
        }
        return iArr;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void D6(long[] jArr, int i, int i2) {
        ArraysKt___ArraysKt.reverse(jArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final int D7(long[] jArr, Function1<? super ULong, UInt> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int iM3880constructorimpl = 0;
        while (itM3922iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> D8(short[] sArr, R[] rArr, Function2<? super UShort, ? super R, ? extends V> function2) {
        int iMin = Math.min(UShortArray.m3944getSizeimpl(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] E(long[] jArr) {
        return ULongArray.m3913constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int E0(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            if (function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte E1(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                return bM3860unboximpl;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long E2(long[] jArr, int i, Function1<? super Integer, ULong> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(jArr)) ? function1.invoke(Integer.valueOf(i)).m3910unboximpl() : ULongArray.m3918getsVKNKU(jArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> E3(long[] jArr, Function2<? super Integer, ? super ULong, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr));
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            arrayList.add(function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt E4(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                    R rInvoke2 = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        iM3893getpVg5ArA = iM3893getpVg5ArA2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] E5(long[] jArr, Function2<? super Integer, ? super ULong, Unit> function2) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
            i++;
        }
        return jArr;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void E6(byte[] bArr, int i, int i2) {
        ArraysKt___ArraysKt.reverse(bArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final int E7(int[] iArr, Function1<? super UInt, UInt> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int iM3880constructorimpl = 0;
        while (itM3897iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> List<V> E8(short[] sArr, short[] sArr2, Function2<? super UShort, ? super UShort, ? extends V> function2) {
        int iMin = Math.min(UShortArray.m3944getSizeimpl(sArr), UShortArray.m3944getSizeimpl(sArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr2, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] F(short[] sArr) {
        return UShortArray.m3938constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int F0(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            if (function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long F1(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                return jM3910unboximpl;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte F2(byte[] bArr, int i, Function1<? super Integer, UByte> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(bArr)) ? function1.invoke(Integer.valueOf(i)).m3860unboximpl() : UByteArray.m3868getw2LRezQ(bArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> F3(short[] sArr, Function2<? super Integer, ? super UShort, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr));
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            arrayList.add(function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort F4(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                    R rInvoke2 = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        sM3943getMh2AYeg = sM3943getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] F5(short[] sArr, Function2<? super Integer, ? super UShort, Unit> function2) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
            i++;
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void F6(short[] sArr, int i, int i2) {
        ArraysKt___ArraysKt.reverse(sArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final int F7(short[] sArr, Function1<? super UShort, UInt> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int iM3880constructorimpl = 0;
        while (itM3947iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> F8(short[] sArr, Iterable<? extends R> iterable, Function2<? super UShort, ? super R, ? extends V> function2) {
        int iM3944getSizeimpl = UShortArray.m3944getSizeimpl(sArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3944getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3944getSizeimpl) {
                break;
            }
            arrayList.add(function2.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> Map<UByte, V> G(byte[] bArr, Function1<? super UByte, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(UByteArray.m3869getSizeimpl(bArr)), 16));
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            linkedHashMap.put(UByte.m3854boximpl(bM3860unboximpl), function1.invoke(UByte.m3854boximpl(bM3860unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> G0(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, lastIndex))).booleanValue()) {
                    return m4192takePpDY95g(bArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long G1(long[] jArr) {
        return ULong.m3905constructorimpl(ArraysKt___ArraysKt.first(jArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V> Map<K, List<V>> G2(long[] jArr, Function1<? super ULong, ? extends K> function1, Function1<? super ULong, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            K kInvoke = function1.invoke(ULong.m3904boximpl(jM3910unboximpl));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(ULong.m3904boximpl(jM3910unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C G3(int[] iArr, C c2, Function2<? super Integer, ? super UInt, ? extends R> function2) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            c2.add(function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
            i++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> UByte G4(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m3854boximpl(bM3868getw2LRezQ);
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bM3868getw2LRezQ = bM3868getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] G5(long[] jArr, long j) {
        return ULongArray.m3913constructorimpl(ArraysKt___ArraysJvmKt.plus(jArr, j));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void G6(byte[] bArr) {
        ArraysKt___ArraysKt.reverse(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final double G7(byte[] bArr, Function1<? super UByte, Double> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        double dDoubleValue = 0.0d;
        while (itM3872iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> Map<ULong, V> H(long[] jArr, Function1<? super ULong, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(ULongArray.m3919getSizeimpl(jArr)), 16));
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            linkedHashMap.put(ULong.m3904boximpl(jM3910unboximpl), function1.invoke(ULong.m3904boximpl(jM3910unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> H0(long[] jArr, Function1<? super ULong, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, lastIndex))).booleanValue()) {
                    return m4195taker7IrZao(jArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int H1(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                return iM3885unboximpl;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V> Map<K, List<V>> H2(short[] sArr, Function1<? super UShort, ? extends K> function1, Function1<? super UShort, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            K kInvoke = function1.invoke(UShort.m3929boximpl(sM3935unboximpl));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(UShort.m3929boximpl(sM3935unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C H3(short[] sArr, C c2, Function2<? super Integer, ? super UShort, ? extends R> function2) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            c2.add(function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
            i++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> ULong H4(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m3904boximpl(jM3918getsVKNKU);
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jM3918getsVKNKU = jM3918getsVKNKU2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] H5(short[] sArr, short s) {
        return UShortArray.m3938constructorimpl(ArraysKt___ArraysJvmKt.plus(sArr, s));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void H6(long[] jArr) {
        ArraysKt___ArraysKt.reverse(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final double H7(long[] jArr, Function1<? super ULong, Double> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        double dDoubleValue = 0.0d;
        while (itM3922iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> Map<UInt, V> I(int[] iArr, Function1<? super UInt, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(UIntArray.m3894getSizeimpl(iArr)), 16));
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            linkedHashMap.put(UInt.m3879boximpl(iM3885unboximpl), function1.invoke(UInt.m3879boximpl(iM3885unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> I0(int[] iArr, Function1<? super UInt, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, lastIndex))).booleanValue()) {
                    return m4194takeqFRl0hI(iArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short I1(short[] sArr) {
        return UShort.m3930constructorimpl(ArraysKt___ArraysKt.first(sArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K> Map<K, List<UByte>> I2(byte[] bArr, Function1<? super UByte, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            K kInvoke = function1.invoke(UByte.m3854boximpl(bM3860unboximpl));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(UByte.m3854boximpl(bM3860unboximpl));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C I3(byte[] bArr, C c2, Function2<? super Integer, ? super UByte, ? extends R> function2) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            c2.add(function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
            i++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> UInt I4(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m3879boximpl(iM3893getpVg5ArA);
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM3893getpVg5ArA = iM3893getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] I5(int[] iArr, int[] iArr2) {
        return UIntArray.m3888constructorimpl(ArraysKt___ArraysJvmKt.plus(iArr, iArr2));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void I6(int[] iArr, int i, int i2) {
        ArraysKt___ArraysKt.reverse(iArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final double I7(int[] iArr, Function1<? super UInt, Double> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        double dDoubleValue = 0.0d;
        while (itM3897iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> Map<UShort, V> J(short[] sArr, Function1<? super UShort, ? extends V> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(UShortArray.m3944getSizeimpl(sArr)), 16));
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            linkedHashMap.put(UShort.m3929boximpl(sM3935unboximpl), function1.invoke(UShort.m3929boximpl(sM3935unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> J0(short[] sArr, Function1<? super UShort, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, lastIndex))).booleanValue()) {
                    return m4193takenggk6HY(sArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short J1(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                return sM3935unboximpl;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V> Map<K, List<V>> J2(int[] iArr, Function1<? super UInt, ? extends K> function1, Function1<? super UInt, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            K kInvoke = function1.invoke(UInt.m3879boximpl(iM3885unboximpl));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(UInt.m3879boximpl(iM3885unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C J3(long[] jArr, C c2, Function2<? super Integer, ? super ULong, ? extends R> function2) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            c2.add(function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
            i++;
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> UShort J4(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m3929boximpl(sM3943getMh2AYeg);
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sM3943getMh2AYeg = sM3943getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] J5(byte[] bArr, byte b2) {
        return UByteArray.m3863constructorimpl(ArraysKt___ArraysJvmKt.plus(bArr, b2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void J6(short[] sArr) {
        ArraysKt___ArraysKt.reverse(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    private static final double J7(short[] sArr, Function1<? super UShort, Double> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        double dDoubleValue = 0.0d;
        while (itM3947iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V, M extends Map<? super UInt, ? super V>> M K(int[] iArr, M m, Function1<? super UInt, ? extends V> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            m.put(UInt.m3879boximpl(iM3885unboximpl), function1.invoke(UInt.m3879boximpl(iM3885unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> K0(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        boolean z = false;
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (z) {
                arrayList.add(UByte.m3854boximpl(bM3860unboximpl));
            } else if (!function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                arrayList.add(UByte.m3854boximpl(bM3860unboximpl));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte K1(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                return UByte.m3854boximpl(bM3860unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K> Map<K, List<ULong>> K2(long[] jArr, Function1<? super ULong, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            K kInvoke = function1.invoke(ULong.m3904boximpl(jM3910unboximpl));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(ULong.m3904boximpl(jM3910unboximpl));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C K3(long[] jArr, C c2, Function1<? super ULong, ? extends R> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            c2.add(function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double K4(byte[] bArr, Function1<? super UByte, Double> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] K5(byte[] bArr, byte[] bArr2) {
        return UByteArray.m3863constructorimpl(ArraysKt___ArraysJvmKt.plus(bArr, bArr2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] K6(int[] iArr) {
        return UIntArray.m3888constructorimpl(ArraysKt___ArraysKt.reversedArray(iArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double K7(byte[] bArr, Function1<? super UByte, Double> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        double dDoubleValue = 0.0d;
        while (itM3872iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V, M extends Map<? super UByte, ? super V>> M L(byte[] bArr, M m, Function1<? super UByte, ? extends V> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            m.put(UByte.m3854boximpl(bM3860unboximpl), function1.invoke(UByte.m3854boximpl(bM3860unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> L0(long[] jArr, Function1<? super ULong, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        boolean z = false;
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (z) {
                arrayList.add(ULong.m3904boximpl(jM3910unboximpl));
            } else if (!function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                arrayList.add(ULong.m3904boximpl(jM3910unboximpl));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong L1(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                return ULong.m3904boximpl(jM3910unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V> Map<K, List<V>> L2(byte[] bArr, Function1<? super UByte, ? extends K> function1, Function1<? super UByte, ? extends V> function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            K kInvoke = function1.invoke(UByte.m3854boximpl(bM3860unboximpl));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function2.invoke(UByte.m3854boximpl(bM3860unboximpl)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C L3(short[] sArr, C c2, Function1<? super UShort, ? extends R> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            c2.add(function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float L4(byte[] bArr, Function1<? super UByte, Float> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] L5(short[] sArr, short[] sArr2) {
        return UShortArray.m3938constructorimpl(ArraysKt___ArraysJvmKt.plus(sArr, sArr2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] L6(byte[] bArr) {
        return UByteArray.m3863constructorimpl(ArraysKt___ArraysKt.reversedArray(bArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double L7(int[] iArr, Function1<? super UInt, Double> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        double dDoubleValue = 0.0d;
        while (itM3897iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V, M extends Map<? super ULong, ? super V>> M M(long[] jArr, M m, Function1<? super ULong, ? extends V> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            m.put(ULong.m3904boximpl(jM3910unboximpl), function1.invoke(ULong.m3904boximpl(jM3910unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> M0(int[] iArr, Function1<? super UInt, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        boolean z = false;
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (z) {
                arrayList.add(UInt.m3879boximpl(iM3885unboximpl));
            } else if (!function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                arrayList.add(UInt.m3879boximpl(iM3885unboximpl));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt M1(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                return UInt.m3879boximpl(iM3885unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K> Map<K, List<UInt>> M2(int[] iArr, Function1<? super UInt, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            K kInvoke = function1.invoke(UInt.m3879boximpl(iM3885unboximpl));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(UInt.m3879boximpl(iM3885unboximpl));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C M3(int[] iArr, C c2, Function1<? super UInt, ? extends R> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            c2.add(function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R M4(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] M5(int[] iArr, int i) {
        return UIntArray.m3888constructorimpl(ArraysKt___ArraysJvmKt.plus(iArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] M6(long[] jArr) {
        return ULongArray.m3913constructorimpl(ArraysKt___ArraysKt.reversedArray(jArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double M7(long[] jArr, Function1<? super ULong, Double> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        double dDoubleValue = 0.0d;
        while (itM3922iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V, M extends Map<? super UShort, ? super V>> M N(short[] sArr, M m, Function1<? super UShort, ? extends V> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            m.put(UShort.m3929boximpl(sM3935unboximpl), function1.invoke(UShort.m3929boximpl(sM3935unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> N0(short[] sArr, Function1<? super UShort, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        boolean z = false;
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (z) {
                arrayList.add(UShort.m3929boximpl(sM3935unboximpl));
            } else if (!function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                arrayList.add(UShort.m3929boximpl(sM3935unboximpl));
                z = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort N1(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                return UShort.m3929boximpl(sM3935unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K> Map<K, List<UShort>> N2(short[] sArr, Function1<? super UShort, ? extends K> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            K kInvoke = function1.invoke(UShort.m3929boximpl(sM3935unboximpl));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(UShort.m3929boximpl(sM3935unboximpl));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C N3(byte[] bArr, C c2, Function1<? super UByte, ? extends R> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            c2.add(function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double N4(long[] jArr, Function1<? super ULong, Double> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] N5(long[] jArr, long[] jArr2) {
        return ULongArray.m3913constructorimpl(ArraysKt___ArraysJvmKt.plus(jArr, jArr2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] N6(short[] sArr) {
        return UShortArray.m3938constructorimpl(ArraysKt___ArraysKt.reversedArray(sArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double N7(short[] sArr, Function1<? super UShort, Double> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        double dDoubleValue = 0.0d;
        while (itM3947iteratorimpl.hasNext()) {
            dDoubleValue += function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).doubleValue();
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int O(int[] iArr) {
        return UIntArray.m3893getpVg5ArA(iArr, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short O0(short[] sArr, int i, Function1<? super Integer, UShort> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(sArr)) ? function1.invoke(Integer.valueOf(i)).m3935unboximpl() : UShortArray.m3943getMh2AYeg(sArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> O1(byte[] bArr, Function1<? super UByte, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            h.addAll(arrayList, function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, M extends Map<? super K, List<UInt>>> M O2(int[] iArr, M m, Function1<? super UInt, ? extends K> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            K kInvoke = function1.invoke(UInt.m3879boximpl(iM3885unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(UInt.m3879boximpl(iM3885unboximpl));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte O3(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                    R rInvoke2 = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        bM3868getw2LRezQ = bM3868getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float O4(long[] jArr, Function1<? super ULong, Float> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int O5(int[] iArr) {
        return m4116random2D5oskM(iArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> O6(long[] jArr, R r, Function2<? super R, ? super ULong, ? extends R> function2) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr) + 1);
        arrayList.add(r);
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            r = function2.invoke(r, ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int O7(byte[] bArr, Function1<? super UByte, Integer> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int iIntValue = 0;
        while (itM3872iteratorimpl.hasNext()) {
            iIntValue += function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte P(byte[] bArr) {
        return UByteArray.m3868getw2LRezQ(bArr, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int P0(int[] iArr, int i, Function1<? super Integer, UInt> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(iArr)) ? function1.invoke(Integer.valueOf(i)).m3885unboximpl() : UIntArray.m3893getpVg5ArA(iArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> P1(long[] jArr, Function1<? super ULong, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            h.addAll(arrayList, function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, M extends Map<? super K, List<UByte>>> M P2(byte[] bArr, M m, Function1<? super UByte, ? extends K> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            K kInvoke = function1.invoke(UByte.m3854boximpl(bM3860unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(UByte.m3854boximpl(bM3860unboximpl));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong P3(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                    R rInvoke2 = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        jM3918getsVKNKU = jM3918getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R P4(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte P5(byte[] bArr) {
        return m4118randomoSF2wD8(bArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> P6(byte[] bArr, R r, Function2<? super R, ? super UByte, ? extends R> function2) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr) + 1);
        arrayList.add(r);
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            r = function2.invoke(r, UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int P7(int[] iArr, Function1<? super UInt, Integer> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int iIntValue = 0;
        while (itM3897iteratorimpl.hasNext()) {
            iIntValue += function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long Q(long[] jArr) {
        return ULongArray.m3918getsVKNKU(jArr, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long Q0(long[] jArr, int i, Function1<? super Integer, ULong> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(jArr)) ? function1.invoke(Integer.valueOf(i)).m3910unboximpl() : ULongArray.m3918getsVKNKU(jArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> Q1(int[] iArr, Function1<? super UInt, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            h.addAll(arrayList, function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V, M extends Map<? super K, List<V>>> M Q2(int[] iArr, M m, Function1<? super UInt, ? extends K> function1, Function1<? super UInt, ? extends V> function2) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            K kInvoke = function1.invoke(UInt.m3879boximpl(iM3885unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(UInt.m3879boximpl(iM3885unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt Q3(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                    R rInvoke2 = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        iM3893getpVg5ArA = iM3893getpVg5ArA2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double Q4(int[] iArr, Function1<? super UInt, Double> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long Q5(long[] jArr) {
        return m4117randomJzugnMA(jArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> Q6(int[] iArr, R r, Function2<? super R, ? super UInt, ? extends R> function2) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr) + 1);
        arrayList.add(r);
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            r = function2.invoke(r, UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int Q7(long[] jArr, Function1<? super ULong, Integer> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int iIntValue = 0;
        while (itM3922iteratorimpl.hasNext()) {
            iIntValue += function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short R(short[] sArr) {
        return UShortArray.m3943getMh2AYeg(sArr, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte R0(byte[] bArr, int i, Function1<? super Integer, UByte> function1) {
        return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(bArr)) ? function1.invoke(Integer.valueOf(i)).m3860unboximpl() : UByteArray.m3868getw2LRezQ(bArr, i);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> R1(short[] sArr, Function1<? super UShort, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            h.addAll(arrayList, function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V, M extends Map<? super K, List<V>>> M R2(long[] jArr, M m, Function1<? super ULong, ? extends K> function1, Function1<? super ULong, ? extends V> function2) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            K kInvoke = function1.invoke(ULong.m3904boximpl(jM3910unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(ULong.m3904boximpl(jM3910unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort R3(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex != 0) {
            R rInvoke = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i2 = i + 1;
                    short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                    R rInvoke2 = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        sM3943getMh2AYeg = sM3943getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float R4(int[] iArr, Function1<? super UInt, Float> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short R5(short[] sArr) {
        return m4119randoms5X_as8(sArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> R6(short[] sArr, R r, Function2<? super R, ? super UShort, ? extends R> function2) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr) + 1);
        arrayList.add(r);
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            r = function2.invoke(r, UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int R7(short[] sArr, Function1<? super UShort, Integer> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int iIntValue = 0;
        while (itM3947iteratorimpl.hasNext()) {
            iIntValue += function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).intValue();
        }
        return iIntValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int S(int[] iArr) {
        return UIntArray.m3893getpVg5ArA(iArr, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte S0(byte[] bArr, int i) {
        return m4072getOrNullPpDY95g(bArr, i);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> S1(byte[] bArr, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            h.addAll(arrayList, function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, M extends Map<? super K, List<ULong>>> M S2(long[] jArr, M m, Function1<? super ULong, ? extends K> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            K kInvoke = function1.invoke(ULong.m3904boximpl(jM3910unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(ULong.m3904boximpl(jM3910unboximpl));
        }
        return m;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> UByte S3(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m3854boximpl(bM3868getw2LRezQ);
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bM3868getw2LRezQ = bM3868getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R S4(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UInt S5(int[] iArr) {
        return m4120randomOrNull2D5oskM(iArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> S6(byte[] bArr, R r, Function3<? super Integer, ? super R, ? super UByte, ? extends R> function3) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(bArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long S7(byte[] bArr, Function1<? super UByte, Long> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        long jLongValue = 0;
        while (itM3872iteratorimpl.hasNext()) {
            jLongValue += function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte T(byte[] bArr) {
        return UByteArray.m3868getw2LRezQ(bArr, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort T0(short[] sArr, int i) {
        return m4073getOrNullnggk6HY(sArr, i);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> T1(int[] iArr, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            h.addAll(arrayList, function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, M extends Map<? super K, List<UShort>>> M T2(short[] sArr, M m, Function1<? super UShort, ? extends K> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            K kInvoke = function1.invoke(UShort.m3929boximpl(sM3935unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(UShort.m3929boximpl(sM3935unboximpl));
        }
        return m;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> ULong T3(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m3904boximpl(jM3918getsVKNKU);
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jM3918getsVKNKU = jM3918getsVKNKU2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double T4(short[] sArr, Function1<? super UShort, Double> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UByte T5(byte[] bArr) {
        return m4122randomOrNulloSF2wD8(bArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> T6(short[] sArr, R r, Function3<? super Integer, ? super R, ? super UShort, ? extends R> function3) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(sArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long T7(int[] iArr, Function1<? super UInt, Long> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        long jLongValue = 0;
        while (itM3897iteratorimpl.hasNext()) {
            jLongValue += function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long U(long[] jArr) {
        return ULongArray.m3918getsVKNKU(jArr, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt U0(int[] iArr, int i) {
        return m4074getOrNullqFRl0hI(iArr, i);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> U1(long[] jArr, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            h.addAll(arrayList, function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
            i++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V, M extends Map<? super K, List<V>>> M U2(short[] sArr, M m, Function1<? super UShort, ? extends K> function1, Function1<? super UShort, ? extends V> function2) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            K kInvoke = function1.invoke(UShort.m3929boximpl(sM3935unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(UShort.m3929boximpl(sM3935unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> UInt U3(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m3879boximpl(iM3893getpVg5ArA);
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM3893getpVg5ArA = iM3893getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float U4(short[] sArr, Function1<? super UShort, Float> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final ULong U5(long[] jArr) {
        return m4121randomOrNullJzugnMA(jArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> U6(long[] jArr, R r, Function3<? super Integer, ? super R, ? super ULong, ? extends R> function3) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(jArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long U7(long[] jArr, Function1<? super ULong, Long> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        long jLongValue = 0;
        while (itM3922iteratorimpl.hasNext()) {
            jLongValue += function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short V(short[] sArr) {
        return UShortArray.m3943getMh2AYeg(sArr, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong V0(long[] jArr, int i) {
        return m4075getOrNullr7IrZao(jArr, i);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> V1(short[] sArr, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            h.addAll(arrayList, function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
            i++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <K, V, M extends Map<? super K, List<V>>> M V2(byte[] bArr, M m, Function1<? super UByte, ? extends K> function1, Function1<? super UByte, ? extends V> function2) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            K kInvoke = function1.invoke(UByte.m3854boximpl(bM3860unboximpl));
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function2.invoke(UByte.m3854boximpl(bM3860unboximpl)));
        }
        return m;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R extends Comparable<? super R>> UShort V3(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m3929boximpl(sM3943getMh2AYeg);
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sM3943getMh2AYeg = sM3943getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R V4(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UShort V5(short[] sArr) {
        return m4123randomOrNulls5X_as8(sArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> V6(int[] iArr, R r, Function3<? super Integer, ? super R, ? super UInt, ? extends R> function3) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(iArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long V7(short[] sArr, Function1<? super UShort, Long> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        long jLongValue = 0;
        while (itM3947iteratorimpl.hasNext()) {
            jLongValue += function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).longValue();
        }
        return jLongValue;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int W(int[] iArr) {
        return UIntArray.m3893getpVg5ArA(iArr, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> W0(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                arrayList.add(UByte.m3854boximpl(bM3860unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C W1(int[] iArr, C c2, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> function2) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            int i2 = i + 1;
            h.addAll(c2, function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int W2(long[] jArr, long j) {
        return ArraysKt___ArraysKt.indexOf(jArr, j);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double W3(byte[] bArr, Function1<? super UByte, Double> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R W4(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte W5(byte[] bArr, Function2<? super UByte, ? super UByte, UByte> function2) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                bM3868getw2LRezQ = function2.invoke(UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).m3860unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return bM3868getw2LRezQ;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> W6(byte[] bArr, Function2<? super UByte, ? super UByte, UByte> function2) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr));
        arrayList.add(UByte.m3854boximpl(bM3868getw2LRezQ));
        int iM3869getSizeimpl = UByteArray.m3869getSizeimpl(bArr);
        for (int i = 1; i < iM3869getSizeimpl; i++) {
            bM3868getw2LRezQ = function2.invoke(UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).m3860unboximpl();
            arrayList.add(UByte.m3854boximpl(bM3868getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int W7(byte[] bArr, Function1<? super UByte, UInt> function1) {
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte X(byte[] bArr) {
        return UByteArray.m3868getw2LRezQ(bArr, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> X0(long[] jArr, Function1<? super ULong, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                arrayList.add(ULong.m3904boximpl(jM3910unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C X1(short[] sArr, C c2, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> function2) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            int i2 = i + 1;
            h.addAll(c2, function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int X2(short[] sArr, short s) {
        return ArraysKt___ArraysKt.indexOf(sArr, s);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float X3(byte[] bArr, Function1<? super UByte, Float> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double X4(byte[] bArr, Function1<? super UByte, Double> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int X5(int[] iArr, Function2<? super UInt, ? super UInt, UInt> function2) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                iM3893getpVg5ArA = function2.invoke(UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).m3885unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return iM3893getpVg5ArA;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> X6(int[] iArr, Function2<? super UInt, ? super UInt, UInt> function2) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr));
        arrayList.add(UInt.m3879boximpl(iM3893getpVg5ArA));
        int iM3894getSizeimpl = UIntArray.m3894getSizeimpl(iArr);
        for (int i = 1; i < iM3894getSizeimpl; i++) {
            iM3893getpVg5ArA = function2.invoke(UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).m3885unboximpl();
            arrayList.add(UInt.m3879boximpl(iM3893getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int X7(int[] iArr, Function1<? super UInt, UInt> function1) {
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long Y(long[] jArr) {
        return ULongArray.m3918getsVKNKU(jArr, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> Y0(int[] iArr, Function1<? super UInt, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                arrayList.add(UInt.m3879boximpl(iM3885unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C Y1(byte[] bArr, C c2, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> function2) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            int i2 = i + 1;
            h.addAll(c2, function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int Y2(byte[] bArr, byte b2) {
        return ArraysKt___ArraysKt.indexOf(bArr, b2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R Y3(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float Y4(byte[] bArr, Function1<? super UByte, Float> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long Y5(long[] jArr, Function2<? super ULong, ? super ULong, ULong> function2) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                jM3918getsVKNKU = function2.invoke(ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).m3910unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return jM3918getsVKNKU;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> Y6(long[] jArr, Function2<? super ULong, ? super ULong, ULong> function2) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr));
        arrayList.add(ULong.m3904boximpl(jM3918getsVKNKU));
        int iM3919getSizeimpl = ULongArray.m3919getSizeimpl(jArr);
        for (int i = 1; i < iM3919getSizeimpl; i++) {
            jM3918getsVKNKU = function2.invoke(ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).m3910unboximpl();
            arrayList.add(ULong.m3904boximpl(jM3918getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int Y7(long[] jArr, Function1<? super ULong, UInt> function1) {
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short Z(short[] sArr) {
        return UShortArray.m3943getMh2AYeg(sArr, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> Z0(short[] sArr, Function1<? super UShort, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                arrayList.add(UShort.m3929boximpl(sM3935unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C Z1(long[] jArr, C c2, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> function2) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            int i2 = i + 1;
            h.addAll(c2, function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int Z2(int[] iArr, int i) {
        return ArraysKt___ArraysKt.indexOf(iArr, i);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double Z3(long[] jArr, Function1<? super ULong, Double> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R Z4(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short Z5(short[] sArr, Function2<? super UShort, ? super UShort, UShort> function2) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                sM3943getMh2AYeg = function2.invoke(UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).m3935unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return sM3943getMh2AYeg;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> Z6(short[] sArr, Function2<? super UShort, ? super UShort, UShort> function2) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr));
        arrayList.add(UShort.m3929boximpl(sM3943getMh2AYeg));
        int iM3944getSizeimpl = UShortArray.m3944getSizeimpl(sArr);
        for (int i = 1; i < iM3944getSizeimpl; i++) {
            sM3943getMh2AYeg = function2.invoke(UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).m3935unboximpl();
            arrayList.add(UShort.m3929boximpl(sM3943getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int Z7(short[] sArr, Function1<? super UShort, UInt> function1) {
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).m3885unboximpl());
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int a0(int[] iArr) {
        return UIntArray.m3893getpVg5ArA(iArr, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> a1(byte[] bArr, Function2<? super Integer, ? super UByte, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                arrayList.add(UByte.m3854boximpl(bM3860unboximpl));
            }
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C a2(long[] jArr, C c2, Function1<? super ULong, ? extends Iterable<? extends R>> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            h.addAll(c2, function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int a3(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (function1.invoke(UByte.m3854boximpl(UByte.m3855constructorimpl(bArr[i]))).booleanValue()) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float a4(long[] jArr, Function1<? super ULong, Float> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double a5(long[] jArr, Function1<? super ULong, Double> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int a6(int[] iArr, Function3<? super Integer, ? super UInt, ? super UInt, UInt> function3) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                iM3893getpVg5ArA = function3.invoke(Integer.valueOf(i), UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).m3885unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return iM3893getpVg5ArA;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> a7(int[] iArr, Function3<? super Integer, ? super UInt, ? super UInt, UInt> function3) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr));
        arrayList.add(UInt.m3879boximpl(iM3893getpVg5ArA));
        int iM3894getSizeimpl = UIntArray.m3894getSizeimpl(iArr);
        for (int i = 1; i < iM3894getSizeimpl; i++) {
            iM3893getpVg5ArA = function3.invoke(Integer.valueOf(i), UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).m3885unboximpl();
            arrayList.add(UInt.m3879boximpl(iM3893getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long a8(byte[] bArr, Function1<? super UByte, ULong> function1) {
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte b0(byte[] bArr) {
        return UByteArray.m3868getw2LRezQ(bArr, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> b1(int[] iArr, Function2<? super Integer, ? super UInt, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                arrayList.add(UInt.m3879boximpl(iM3885unboximpl));
            }
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C b2(short[] sArr, C c2, Function1<? super UShort, ? extends Iterable<? extends R>> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            h.addAll(c2, function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int b3(long[] jArr, Function1<? super ULong, Boolean> function1) {
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (function1.invoke(ULong.m3904boximpl(ULong.m3905constructorimpl(jArr[i]))).booleanValue()) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R b4(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float b5(long[] jArr, Function1<? super ULong, Float> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte b6(byte[] bArr, Function3<? super Integer, ? super UByte, ? super UByte, UByte> function3) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                bM3868getw2LRezQ = function3.invoke(Integer.valueOf(i), UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).m3860unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return bM3868getw2LRezQ;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> b7(byte[] bArr, Function3<? super Integer, ? super UByte, ? super UByte, UByte> function3) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr));
        arrayList.add(UByte.m3854boximpl(bM3868getw2LRezQ));
        int iM3869getSizeimpl = UByteArray.m3869getSizeimpl(bArr);
        for (int i = 1; i < iM3869getSizeimpl; i++) {
            bM3868getw2LRezQ = function3.invoke(Integer.valueOf(i), UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).m3860unboximpl();
            arrayList.add(UByte.m3854boximpl(bM3868getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long b8(int[] iArr, Function1<? super UInt, ULong> function1) {
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long c0(long[] jArr) {
        return ULongArray.m3918getsVKNKU(jArr, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> c1(long[] jArr, Function2<? super Integer, ? super ULong, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                arrayList.add(ULong.m3904boximpl(jM3910unboximpl));
            }
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C c2(int[] iArr, C c2, Function1<? super UInt, ? extends Iterable<? extends R>> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            h.addAll(c2, function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int c3(int[] iArr, Function1<? super UInt, Boolean> function1) {
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (function1.invoke(UInt.m3879boximpl(UInt.m3880constructorimpl(iArr[i]))).booleanValue()) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double c4(int[] iArr, Function1<? super UInt, Double> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R c5(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short c6(short[] sArr, Function3<? super Integer, ? super UShort, ? super UShort, UShort> function3) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                sM3943getMh2AYeg = function3.invoke(Integer.valueOf(i), UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).m3935unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return sM3943getMh2AYeg;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> c7(short[] sArr, Function3<? super Integer, ? super UShort, ? super UShort, UShort> function3) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr));
        arrayList.add(UShort.m3929boximpl(sM3943getMh2AYeg));
        int iM3944getSizeimpl = UShortArray.m3944getSizeimpl(sArr);
        for (int i = 1; i < iM3944getSizeimpl; i++) {
            sM3943getMh2AYeg = function3.invoke(Integer.valueOf(i), UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).m3935unboximpl();
            arrayList.add(UShort.m3929boximpl(sM3943getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long c8(long[] jArr, Function1<? super ULong, ULong> function1) {
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m4012contentEqualsFGO6Aew(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m4013contentEqualsKJPZfPQ(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m4015contentEqualskV0jMPg(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m4017contentEqualslec5QzE(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m4021contentHashCode2csIQuQ(@Nullable byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m4024contentHashCodeXUkPCBk(@Nullable int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m4025contentHashCoded6D3K8(@Nullable short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m4027contentHashCodeuLth9ew(@Nullable long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m4029contentToString2csIQuQ(@Nullable byte[] bArr) {
        return bArr == null ? "null" : CollectionsKt___CollectionsKt.joinToString$default(UByteArray.m3861boximpl(bArr), ", ", "[", "]", 0, null, null, 56, null);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m4032contentToStringXUkPCBk(@Nullable int[] iArr) {
        return iArr == null ? "null" : CollectionsKt___CollectionsKt.joinToString$default(UIntArray.m3886boximpl(iArr), ", ", "[", "]", 0, null, null, 56, null);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m4033contentToStringd6D3K8(@Nullable short[] sArr) {
        return sArr == null ? "null" : CollectionsKt___CollectionsKt.joinToString$default(UShortArray.m3936boximpl(sArr), ", ", "[", "]", 0, null, null, 56, null);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m4035contentToStringuLth9ew(@Nullable long[] jArr) {
        return jArr == null ? "null" : CollectionsKt___CollectionsKt.joinToString$default(ULongArray.m3911boximpl(jArr), ", ", "[", "]", 0, null, null, 56, null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short d0(short[] sArr) {
        return UShortArray.m3943getMh2AYeg(sArr, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> d1(short[] sArr, Function2<? super Integer, ? super UShort, Boolean> function2) {
        ArrayList arrayList = new ArrayList();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                arrayList.add(UShort.m3929boximpl(sM3935unboximpl));
            }
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, C extends Collection<? super R>> C d2(byte[] bArr, C c2, Function1<? super UByte, ? extends Iterable<? extends R>> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            h.addAll(c2, function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int d3(short[] sArr, Function1<? super UShort, Boolean> function1) {
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (function1.invoke(UShort.m3929boximpl(UShort.m3930constructorimpl(sArr[i]))).booleanValue()) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float d4(int[] iArr, Function1<? super UInt, Float> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double d5(int[] iArr, Function1<? super UInt, Double> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long d6(long[] jArr, Function3<? super Integer, ? super ULong, ? super ULong, ULong> function3) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                jM3918getsVKNKU = function3.invoke(Integer.valueOf(i), ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).m3910unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return jM3918getsVKNKU;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> d7(long[] jArr, Function3<? super Integer, ? super ULong, ? super ULong, ULong> function3) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr));
        arrayList.add(ULong.m3904boximpl(jM3918getsVKNKU));
        int iM3919getSizeimpl = ULongArray.m3919getSizeimpl(jArr);
        for (int i = 1; i < iM3919getSizeimpl; i++) {
            jM3918getsVKNKU = function3.invoke(Integer.valueOf(i), ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).m3910unboximpl();
            arrayList.add(ULong.m3904boximpl(jM3918getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long d8(short[] sArr, Function1<? super UShort, ULong> function1) {
        long jM3905constructorimpl = ULong.m3905constructorimpl(0);
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).m3910unboximpl());
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4036dropPpDY95g(@NotNull byte[] bArr, int i) {
        if (i >= 0) {
            return m4196takeLastPpDY95g(bArr, e.coerceAtLeast(UByteArray.m3869getSizeimpl(bArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4037dropnggk6HY(@NotNull short[] sArr, int i) {
        if (i >= 0) {
            return m4197takeLastnggk6HY(sArr, e.coerceAtLeast(UShortArray.m3944getSizeimpl(sArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4038dropqFRl0hI(@NotNull int[] iArr, int i) {
        if (i >= 0) {
            return m4198takeLastqFRl0hI(iArr, e.coerceAtLeast(UIntArray.m3894getSizeimpl(iArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4039dropr7IrZao(@NotNull long[] jArr, int i) {
        if (i >= 0) {
            return m4199takeLastr7IrZao(jArr, e.coerceAtLeast(ULongArray.m3919getSizeimpl(jArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4040dropLastPpDY95g(@NotNull byte[] bArr, int i) {
        if (i >= 0) {
            return m4192takePpDY95g(bArr, e.coerceAtLeast(UByteArray.m3869getSizeimpl(bArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4041dropLastnggk6HY(@NotNull short[] sArr, int i) {
        if (i >= 0) {
            return m4193takenggk6HY(sArr, e.coerceAtLeast(UShortArray.m3944getSizeimpl(sArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4042dropLastqFRl0hI(@NotNull int[] iArr, int i) {
        if (i >= 0) {
            return m4194takeqFRl0hI(iArr, e.coerceAtLeast(UIntArray.m3894getSizeimpl(iArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4043dropLastr7IrZao(@NotNull long[] jArr, int i) {
        if (i >= 0) {
            return m4195taker7IrZao(jArr, e.coerceAtLeast(ULongArray.m3919getSizeimpl(jArr) - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int e0(int[] iArr) {
        return UIntArray.m3893getpVg5ArA(iArr, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UInt>> C e1(int[] iArr, C c2, Function2<? super Integer, ? super UInt, Boolean> function2) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                c2.add(UInt.m3879boximpl(iM3885unboximpl));
            }
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R e2(long[] jArr, R r, Function2<? super R, ? super ULong, ? extends R> function2) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            r = function2.invoke(r, ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int e3(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (function1.invoke(UByte.m3854boximpl(UByte.m3855constructorimpl(bArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R e4(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float e5(int[] iArr, Function1<? super UInt, Float> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt e6(int[] iArr, Function3<? super Integer, ? super UInt, ? super UInt, UInt> function3) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                iM3893getpVg5ArA = function3.invoke(Integer.valueOf(i), UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).m3885unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> e7(long[] jArr, R r, Function2<? super R, ? super ULong, ? extends R> function2) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr) + 1);
        arrayList.add(r);
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            r = function2.invoke(r, ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> e8(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, lastIndex))).booleanValue()) {
                    return m4036dropPpDY95g(bArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(UByteArray.m3861boximpl(bArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte f0(byte[] bArr) {
        return UByteArray.m3868getw2LRezQ(bArr, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UShort>> C f1(short[] sArr, C c2, Function2<? super Integer, ? super UShort, Boolean> function2) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                c2.add(UShort.m3929boximpl(sM3935unboximpl));
            }
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R f2(byte[] bArr, R r, Function2<? super R, ? super UByte, ? extends R> function2) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            r = function2.invoke(r, UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int f3(long[] jArr, Function1<? super ULong, Boolean> function1) {
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (function1.invoke(ULong.m3904boximpl(ULong.m3905constructorimpl(jArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final double f4(short[] sArr, Function1<? super UShort, Double> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R f5(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte f6(byte[] bArr, Function3<? super Integer, ? super UByte, ? super UByte, UByte> function3) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                bM3868getw2LRezQ = function3.invoke(Integer.valueOf(i), UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).m3860unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> f7(byte[] bArr, R r, Function2<? super R, ? super UByte, ? extends R> function2) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr) + 1);
        arrayList.add(r);
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            r = function2.invoke(r, UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> f8(long[] jArr, Function1<? super ULong, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, lastIndex))).booleanValue()) {
                    return m4039dropr7IrZao(jArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(ULongArray.m3911boximpl(jArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m4044fill2fe2U9s(@NotNull int[] iArr, int i, int i2, int i3) {
        ArraysKt___ArraysJvmKt.fill(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m4045fill2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m3894getSizeimpl(iArr);
        }
        m4044fill2fe2U9s(iArr, i, i2, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m4046fillEtDCXyQ(@NotNull short[] sArr, short s, int i, int i2) {
        ArraysKt___ArraysJvmKt.fill(sArr, s, i, i2);
    }

    /* JADX INFO: renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m4047fillEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m3944getSizeimpl(sArr);
        }
        m4046fillEtDCXyQ(sArr, s, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m4048fillK6DWlUc(@NotNull long[] jArr, long j, int i, int i2) {
        ArraysKt___ArraysJvmKt.fill(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m4049fillK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m3919getSizeimpl(jArr);
        }
        m4048fillK6DWlUc(jArr, j, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m4050fillWpHrYlw(@NotNull byte[] bArr, byte b2, int i, int i2) {
        ArraysKt___ArraysJvmKt.fill(bArr, b2, i, i2);
    }

    /* JADX INFO: renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m4051fillWpHrYlw$default(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m3869getSizeimpl(bArr);
        }
        m4050fillWpHrYlw(bArr, b2, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4052firstOrNullajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        return UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4053firstOrNullGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        return UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4054firstOrNullQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        return ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4055firstOrNullrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        return UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long g0(long[] jArr) {
        return ULongArray.m3918getsVKNKU(jArr, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UByte>> C g1(byte[] bArr, C c2, Function2<? super Integer, ? super UByte, Boolean> function2) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                c2.add(UByte.m3854boximpl(bM3860unboximpl));
            }
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R g2(int[] iArr, R r, Function2<? super R, ? super UInt, ? extends R> function2) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            r = function2.invoke(r, UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int g3(int[] iArr, Function1<? super UInt, Boolean> function1) {
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (function1.invoke(UInt.m3879boximpl(UInt.m3880constructorimpl(iArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final float g4(short[] sArr, Function1<? super UShort, Float> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return fFloatValue;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double g5(short[] sArr, Function1<? super UShort, Double> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.min(dDoubleValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort g6(short[] sArr, Function3<? super Integer, ? super UShort, ? super UShort, UShort> function3) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                sM3943getMh2AYeg = function3.invoke(Integer.valueOf(i), UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).m3935unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> g7(int[] iArr, R r, Function2<? super R, ? super UInt, ? extends R> function2) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr) + 1);
        arrayList.add(r);
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            r = function2.invoke(r, UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> g8(int[] iArr, Function1<? super UInt, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, lastIndex))).booleanValue()) {
                    return m4038dropqFRl0hI(iArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(UIntArray.m3886boximpl(iArr));
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final IntRange m4056getIndicesajY9A(@NotNull int[] iArr) {
        return ArraysKt___ArraysKt.getIndices(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m4057getIndicesajY9A$annotations(int[] iArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final IntRange m4058getIndicesGBYM_sE(@NotNull byte[] bArr) {
        return ArraysKt___ArraysKt.getIndices(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m4059getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final IntRange m4060getIndicesQwZRm1k(@NotNull long[] jArr) {
        return ArraysKt___ArraysKt.getIndices(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m4061getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    @NotNull
    /* JADX INFO: renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final IntRange m4062getIndicesrL5Bavg(@NotNull short[] sArr) {
        return ArraysKt___ArraysKt.getIndices(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m4063getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* JADX INFO: renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m4064getLastIndexajY9A(@NotNull int[] iArr) {
        return ArraysKt___ArraysKt.getLastIndex(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m4065getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m4066getLastIndexGBYM_sE(@NotNull byte[] bArr) {
        return ArraysKt___ArraysKt.getLastIndex(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m4067getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m4068getLastIndexQwZRm1k(@NotNull long[] jArr) {
        return ArraysKt___ArraysKt.getLastIndex(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m4069getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* JADX INFO: renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m4070getLastIndexrL5Bavg(@NotNull short[] sArr) {
        return ArraysKt___ArraysKt.getLastIndex(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m4071getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final UByte m4072getOrNullPpDY95g(@NotNull byte[] bArr, int i) {
        if (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(bArr)) {
            return null;
        }
        return UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final UShort m4073getOrNullnggk6HY(@NotNull short[] sArr, int i) {
        if (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(sArr)) {
            return null;
        }
        return UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final UInt m4074getOrNullqFRl0hI(@NotNull int[] iArr, int i) {
        if (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(iArr)) {
            return null;
        }
        return UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final ULong m4075getOrNullr7IrZao(@NotNull long[] jArr, int i) {
        if (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(jArr)) {
            return null;
        }
        return ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short h0(short[] sArr) {
        return UShortArray.m3943getMh2AYeg(sArr, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super ULong>> C h1(long[] jArr, C c2, Function2<? super Integer, ? super ULong, Boolean> function2) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            int i2 = i + 1;
            if (function2.invoke(Integer.valueOf(i), ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                c2.add(ULong.m3904boximpl(jM3910unboximpl));
            }
            i = i2;
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R h2(short[] sArr, R r, Function2<? super R, ? super UShort, ? extends R> function2) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            r = function2.invoke(r, UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int h3(short[] sArr, Function1<? super UShort, Boolean> function1) {
        int length = sArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (function1.invoke(UShort.m3929boximpl(UShort.m3930constructorimpl(sArr[length]))).booleanValue()) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R h4(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float h5(short[] sArr, Function1<? super UShort, Float> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.min(fFloatValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong h6(long[] jArr, Function3<? super Integer, ? super ULong, ? super ULong, ULong> function3) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                jM3918getsVKNKU = function3.invoke(Integer.valueOf(i), ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).m3910unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> h7(short[] sArr, R r, Function2<? super R, ? super UShort, ? extends R> function2) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr) + 1);
        arrayList.add(r);
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            r = function2.invoke(r, UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
            arrayList.add(r);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> h8(short[] sArr, Function1<? super UShort, Boolean> function1) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex >= 0) {
            while (true) {
                int i = lastIndex - 1;
                if (!function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, lastIndex))).booleanValue()) {
                    return m4037dropnggk6HY(sArr, lastIndex + 1);
                }
                if (i >= 0) {
                    lastIndex = i;
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(UShortArray.m3936boximpl(sArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] i0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        ArraysKt___ArraysJvmKt.copyInto(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> i1(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (!function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                arrayList.add(UByte.m3854boximpl(bM3860unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R i2(byte[] bArr, R r, Function3<? super Integer, ? super R, ? super UByte, ? extends R> function3) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            R r2 = r;
            r = function3.invoke(Integer.valueOf(i), r2, UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
            i++;
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int i3(int[] iArr) {
        return UInt.m3880constructorimpl(ArraysKt___ArraysKt.last(iArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R i4(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R i5(long[] jArr, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UByte i6(byte[] bArr, Function2<? super UByte, ? super UByte, UByte> function2) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                bM3868getw2LRezQ = function2.invoke(UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).m3860unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> i7(byte[] bArr, R r, Function3<? super Integer, ? super R, ? super UByte, ? extends R> function3) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(bArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UByte> i8(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (!function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                break;
            }
            arrayList.add(UByte.m3854boximpl(bM3860unboximpl));
        }
        return arrayList;
    }

    public static /* synthetic */ long[] j0(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = ULongArray.m3919getSizeimpl(jArr);
        }
        ArraysKt___ArraysJvmKt.copyInto(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> j1(long[] jArr, Function1<? super ULong, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (!function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                arrayList.add(ULong.m3904boximpl(jM3910unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R j2(short[] sArr, R r, Function3<? super Integer, ? super R, ? super UShort, ? extends R> function3) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        int i = 0;
        while (itM3947iteratorimpl.hasNext()) {
            R r2 = r;
            r = function3.invoke(Integer.valueOf(i), r2, UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
            i++;
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte j3(byte[] bArr) {
        return UByte.m3855constructorimpl(ArraysKt___ArraysKt.last(bArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double j4(byte[] bArr, Function1<? super UByte, Double> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R j5(byte[] bArr, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UInt j6(int[] iArr, Function2<? super UInt, ? super UInt, UInt> function2) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                iM3893getpVg5ArA = function2.invoke(UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).m3885unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> j7(short[] sArr, R r, Function3<? super Integer, ? super R, ? super UShort, ? extends R> function3) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m3944getSizeimpl(sArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(sArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<ULong> j8(long[] jArr, Function1<? super ULong, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (!function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                break;
            }
            arrayList.add(ULong.m3904boximpl(jM3910unboximpl));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] k0(short[] sArr, short[] sArr2, int i, int i2, int i3) {
        ArraysKt___ArraysJvmKt.copyInto(sArr, sArr2, i, i2, i3);
        return sArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> k1(int[] iArr, Function1<? super UInt, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (!function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                arrayList.add(UInt.m3879boximpl(iM3885unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R k2(long[] jArr, R r, Function3<? super Integer, ? super R, ? super ULong, ? extends R> function3) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        int i = 0;
        while (itM3922iteratorimpl.hasNext()) {
            R r2 = r;
            r = function3.invoke(Integer.valueOf(i), r2, ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
            i++;
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte k3(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(bArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, last);
                if (function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ)).booleanValue()) {
                    return bM3868getw2LRezQ;
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float k4(byte[] bArr, Function1<? super UByte, Float> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R k5(short[] sArr, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final ULong k6(long[] jArr, Function2<? super ULong, ? super ULong, ULong> function2) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                jM3918getsVKNKU = function2.invoke(ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).m3910unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> k7(long[] jArr, R r, Function3<? super Integer, ? super R, ? super ULong, ? extends R> function3) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(jArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UInt> k8(int[] iArr, Function1<? super UInt, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (!function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                break;
            }
            arrayList.add(UInt.m3879boximpl(iM3885unboximpl));
        }
        return arrayList;
    }

    public static /* synthetic */ short[] l0(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UShortArray.m3944getSizeimpl(sArr);
        }
        ArraysKt___ArraysJvmKt.copyInto(sArr, sArr2, i, i2, i3);
        return sArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> l1(short[] sArr, Function1<? super UShort, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (!function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                arrayList.add(UShort.m3929boximpl(sM3935unboximpl));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R l2(int[] iArr, R r, Function3<? super Integer, ? super R, ? super UInt, ? extends R> function3) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            R r2 = r;
            r = function3.invoke(Integer.valueOf(i), r2, UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
            i++;
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long l3(long[] jArr, Function1<? super ULong, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(jArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, last);
                if (function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU)).booleanValue()) {
                    return jM3918getsVKNKU;
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R l4(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R l5(int[] iArr, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UShort l6(short[] sArr, Function2<? super UShort, ? super UShort, UShort> function2) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                sM3943getMh2AYeg = function2.invoke(UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).m3935unboximpl();
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final <R> List<R> l7(int[] iArr, R r, Function3<? super Integer, ? super R, ? super UInt, ? extends R> function3) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return kotlin.collections.e.listOf(r);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m3894getSizeimpl(iArr) + 1);
        arrayList.add(r);
        IntRange indices = ArraysKt___ArraysKt.getIndices(iArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = first + 1;
                r = function3.invoke(Integer.valueOf(first), r, UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, first)));
                arrayList.add(r);
                if (first == last) {
                    break;
                }
                first = i;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final List<UShort> l8(short[] sArr, Function1<? super UShort, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (!function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                break;
            }
            arrayList.add(UShort.m3929boximpl(sM3935unboximpl));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4076lastOrNullajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        return UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, UIntArray.m3894getSizeimpl(iArr) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4077lastOrNullGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        return UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, UByteArray.m3869getSizeimpl(bArr) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4078lastOrNullQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        return ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, ULongArray.m3919getSizeimpl(jArr) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4079lastOrNullrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        return UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, UShortArray.m3944getSizeimpl(sArr) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean m(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            if (!function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] m0(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        ArraysKt___ArraysJvmKt.copyInto(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super ULong>> C m1(long[] jArr, C c2, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (!function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                c2.add(ULong.m3904boximpl(jM3910unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R m2(long[] jArr, R r, Function2<? super ULong, ? super R, ? extends R> function2) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long m3(long[] jArr) {
        return ULong.m3905constructorimpl(ArraysKt___ArraysKt.last(jArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double m4(long[] jArr, Function1<? super ULong, Double> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R m5(long[] jArr, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte m6(byte[] bArr, Function2<? super UByte, ? super UByte, UByte> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM3868getw2LRezQ = function2.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), UByte.m3854boximpl(bM3868getw2LRezQ)).m3860unboximpl();
        }
        return bM3868getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int m7(int[] iArr) {
        return UInt.m3880constructorimpl(ArraysKt___ArraysKt.single(iArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] m8(byte[] bArr) {
        return Arrays.copyOf(bArr, bArr.length);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4084maxOrNullajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                if (UnsignedKt.uintCompare(iM3893getpVg5ArA, iM3893getpVg5ArA2) < 0) {
                    iM3893getpVg5ArA = iM3893getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4085maxOrNullGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                if (Intrinsics.compare(bM3868getw2LRezQ & 255, bM3868getw2LRezQ2 & 255) < 0) {
                    bM3868getw2LRezQ = bM3868getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4086maxOrNullQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                if (UnsignedKt.ulongCompare(jM3918getsVKNKU, jM3918getsVKNKU2) < 0) {
                    jM3918getsVKNKU = jM3918getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4087maxOrNullrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                if (Intrinsics.compare(sM3943getMh2AYeg & UShort.MAX_VALUE, 65535 & sM3943getMh2AYeg2) < 0) {
                    sM3943getMh2AYeg = sM3943getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m4092maxWithOrNullXMRcp5o(@NotNull byte[] bArr, @NotNull Comparator<? super UByte> comparator) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                if (comparator.compare(UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(bM3868getw2LRezQ2)) < 0) {
                    bM3868getw2LRezQ = bM3868getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m4093maxWithOrNullYmdZ_VM(@NotNull int[] iArr, @NotNull Comparator<? super UInt> comparator) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                if (comparator.compare(UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(iM3893getpVg5ArA2)) < 0) {
                    iM3893getpVg5ArA = iM3893getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m4094maxWithOrNulleOHTfZs(@NotNull short[] sArr, @NotNull Comparator<? super UShort> comparator) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                if (comparator.compare(UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(sM3943getMh2AYeg2)) < 0) {
                    sM3943getMh2AYeg = sM3943getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m4095maxWithOrNullzrEWJaI(@NotNull long[] jArr, @NotNull Comparator<? super ULong> comparator) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                if (comparator.compare(ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(jM3918getsVKNKU2)) < 0) {
                    jM3918getsVKNKU = jM3918getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4100minOrNullajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                if (UnsignedKt.uintCompare(iM3893getpVg5ArA, iM3893getpVg5ArA2) > 0) {
                    iM3893getpVg5ArA = iM3893getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4101minOrNullGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                if (Intrinsics.compare(bM3868getw2LRezQ & 255, bM3868getw2LRezQ2 & 255) > 0) {
                    bM3868getw2LRezQ = bM3868getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4102minOrNullQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                if (UnsignedKt.ulongCompare(jM3918getsVKNKU, jM3918getsVKNKU2) > 0) {
                    jM3918getsVKNKU = jM3918getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4103minOrNullrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                if (Intrinsics.compare(sM3943getMh2AYeg & UShort.MAX_VALUE, 65535 & sM3943getMh2AYeg2) > 0) {
                    sM3943getMh2AYeg = sM3943getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m4108minWithOrNullXMRcp5o(@NotNull byte[] bArr, @NotNull Comparator<? super UByte> comparator) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                byte bM3868getw2LRezQ2 = UByteArray.m3868getw2LRezQ(bArr, i);
                if (comparator.compare(UByte.m3854boximpl(bM3868getw2LRezQ), UByte.m3854boximpl(bM3868getw2LRezQ2)) > 0) {
                    bM3868getw2LRezQ = bM3868getw2LRezQ2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m4109minWithOrNullYmdZ_VM(@NotNull int[] iArr, @NotNull Comparator<? super UInt> comparator) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                int iM3893getpVg5ArA2 = UIntArray.m3893getpVg5ArA(iArr, i);
                if (comparator.compare(UInt.m3879boximpl(iM3893getpVg5ArA), UInt.m3879boximpl(iM3893getpVg5ArA2)) > 0) {
                    iM3893getpVg5ArA = iM3893getpVg5ArA2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m4110minWithOrNulleOHTfZs(@NotNull short[] sArr, @NotNull Comparator<? super UShort> comparator) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                short sM3943getMh2AYeg2 = UShortArray.m3943getMh2AYeg(sArr, i);
                if (comparator.compare(UShort.m3929boximpl(sM3943getMh2AYeg), UShort.m3929boximpl(sM3943getMh2AYeg2)) > 0) {
                    sM3943getMh2AYeg = sM3943getMh2AYeg2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m4111minWithOrNullzrEWJaI(@NotNull long[] jArr, @NotNull Comparator<? super ULong> comparator) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                long jM3918getsVKNKU2 = ULongArray.m3918getsVKNKU(jArr, i);
                if (comparator.compare(ULong.m3904boximpl(jM3918getsVKNKU), ULong.m3904boximpl(jM3918getsVKNKU2)) > 0) {
                    jM3918getsVKNKU = jM3918getsVKNKU2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean n(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            if (!function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ byte[] n0(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UByteArray.m3869getSizeimpl(bArr);
        }
        ArraysKt___ArraysJvmKt.copyInto(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UShort>> C n1(short[] sArr, C c2, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (!function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                c2.add(UShort.m3929boximpl(sM3935unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R n2(byte[] bArr, R r, Function2<? super UByte, ? super R, ? extends R> function2) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int n3(int[] iArr, Function1<? super UInt, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(iArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, last);
                if (function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA)).booleanValue()) {
                    return iM3893getpVg5ArA;
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float n4(long[] jArr, Function1<? super ULong, Float> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R n5(byte[] bArr, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int n6(int[] iArr, Function2<? super UInt, ? super UInt, UInt> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM3893getpVg5ArA = function2.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), UInt.m3879boximpl(iM3893getpVg5ArA)).m3885unboximpl();
        }
        return iM3893getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte n7(byte[] bArr) {
        return UByte.m3855constructorimpl(ArraysKt___ArraysKt.single(bArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] n8(int[] iArr) {
        return Arrays.copyOf(iArr, iArr.length);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean o(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            if (!function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] o0(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UInt>> C o1(int[] iArr, C c2, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (!function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                c2.add(UInt.m3879boximpl(iM3885unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R o2(int[] iArr, R r, Function2<? super UInt, ? super R, ? extends R> function2) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short o3(short[] sArr) {
        return UShort.m3930constructorimpl(ArraysKt___ArraysKt.last(sArr));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R o4(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R o5(short[] sArr, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long o6(long[] jArr, Function2<? super ULong, ? super ULong, ULong> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM3918getsVKNKU = function2.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), ULong.m3904boximpl(jM3918getsVKNKU)).m3910unboximpl();
        }
        return jM3918getsVKNKU;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte o7(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        UByte uByteM3854boximpl = null;
        boolean z = false;
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uByteM3854boximpl = UByte.m3854boximpl(bM3860unboximpl);
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Objects.requireNonNull(uByteM3854boximpl, "null cannot be cast to non-null type kotlin.UByte");
        return uByteM3854boximpl.m3860unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] o8(long[] jArr) {
        return Arrays.copyOf(jArr, jArr.length);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean p(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            if (!function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int[] p0(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UIntArray.m3894getSizeimpl(iArr);
        }
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UByte>> C p1(byte[] bArr, C c2, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (!function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                c2.add(UByte.m3854boximpl(bM3860unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R p2(short[] sArr, R r, Function2<? super UShort, ? super R, ? extends R> function2) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = function2.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short p3(short[] sArr, Function1<? super UShort, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(sArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, last);
                if (function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg)).booleanValue()) {
                    return sM3943getMh2AYeg;
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double p4(int[] iArr, Function1<? super UInt, Double> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R p5(int[] iArr, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short p6(short[] sArr, Function2<? super UShort, ? super UShort, UShort> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM3943getMh2AYeg = function2.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), UShort.m3929boximpl(sM3943getMh2AYeg)).m3935unboximpl();
        }
        return sM3943getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long p7(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        ULong uLongM3904boximpl = null;
        boolean z = false;
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uLongM3904boximpl = ULong.m3904boximpl(jM3910unboximpl);
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Objects.requireNonNull(uLongM3904boximpl, "null cannot be cast to non-null type kotlin.ULong");
        return uLongM3904boximpl.m3910unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] p8(short[] sArr) {
        return Arrays.copyOf(sArr, sArr.length);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m4112plusCFIt9YE(@NotNull int[] iArr, @NotNull Collection<UInt> collection) {
        int iM3894getSizeimpl = UIntArray.m3894getSizeimpl(iArr);
        int[] iArrCopyOf = Arrays.copyOf(iArr, UIntArray.m3894getSizeimpl(iArr) + collection.size());
        Iterator<UInt> it2 = collection.iterator();
        while (it2.hasNext()) {
            iArrCopyOf[iM3894getSizeimpl] = it2.next().m3885unboximpl();
            iM3894getSizeimpl++;
        }
        return UIntArray.m3888constructorimpl(iArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m4113pluskzHmqpY(@NotNull long[] jArr, @NotNull Collection<ULong> collection) {
        int iM3919getSizeimpl = ULongArray.m3919getSizeimpl(jArr);
        long[] jArrCopyOf = Arrays.copyOf(jArr, ULongArray.m3919getSizeimpl(jArr) + collection.size());
        Iterator<ULong> it2 = collection.iterator();
        while (it2.hasNext()) {
            jArrCopyOf[iM3919getSizeimpl] = it2.next().m3910unboximpl();
            iM3919getSizeimpl++;
        }
        return ULongArray.m3913constructorimpl(jArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m4114plusojwP5H8(@NotNull short[] sArr, @NotNull Collection<UShort> collection) {
        int iM3944getSizeimpl = UShortArray.m3944getSizeimpl(sArr);
        short[] sArrCopyOf = Arrays.copyOf(sArr, UShortArray.m3944getSizeimpl(sArr) + collection.size());
        Iterator<UShort> it2 = collection.iterator();
        while (it2.hasNext()) {
            sArrCopyOf[iM3944getSizeimpl] = it2.next().m3935unboximpl();
            iM3944getSizeimpl++;
        }
        return UShortArray.m3938constructorimpl(sArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m4115plusxo_DsdI(@NotNull byte[] bArr, @NotNull Collection<UByte> collection) {
        int iM3869getSizeimpl = UByteArray.m3869getSizeimpl(bArr);
        byte[] bArrCopyOf = Arrays.copyOf(bArr, UByteArray.m3869getSizeimpl(bArr) + collection.size());
        Iterator<UByte> it2 = collection.iterator();
        while (it2.hasNext()) {
            bArrCopyOf[iM3869getSizeimpl] = it2.next().m3860unboximpl();
            iM3869getSizeimpl++;
        }
        return UByteArray.m3863constructorimpl(bArrCopyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean q(int[] iArr) {
        return ArraysKt___ArraysKt.any(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] q0(int[] iArr) {
        return UIntArray.m3888constructorimpl(Arrays.copyOf(iArr, iArr.length));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super ULong>> C q1(long[] jArr, C c2, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                c2.add(ULong.m3904boximpl(jM3910unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R q2(byte[] bArr, R r, Function3<? super Integer, ? super UByte, ? super R, ? extends R> function3) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int q3(long[] jArr, long j) {
        return ArraysKt___ArraysKt.lastIndexOf(jArr, j);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float q4(int[] iArr, Function1<? super UInt, Float> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean q5(int[] iArr) {
        return UIntArray.m3896isEmptyimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int q6(int[] iArr, Function3<? super Integer, ? super UInt, ? super UInt, UInt> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM3893getpVg5ArA = function3.invoke(Integer.valueOf(i), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), UInt.m3879boximpl(iM3893getpVg5ArA)).m3885unboximpl();
        }
        return iM3893getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long q7(long[] jArr) {
        return ULong.m3905constructorimpl(ArraysKt___ArraysKt.single(jArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] q8(byte[] bArr) {
        return UByteArray.m3863constructorimpl(Arrays.copyOf(bArr, bArr.length));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean r(byte[] bArr) {
        return ArraysKt___ArraysKt.any(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] r0(byte[] bArr) {
        return UByteArray.m3863constructorimpl(Arrays.copyOf(bArr, bArr.length));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UShort>> C r1(short[] sArr, C c2, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                c2.add(UShort.m3929boximpl(sM3935unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R r2(short[] sArr, R r, Function3<? super Integer, ? super UShort, ? super R, ? extends R> function3) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int r3(short[] sArr, short s) {
        return ArraysKt___ArraysKt.lastIndexOf(sArr, s);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R extends Comparable<? super R>> R r4(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean r5(byte[] bArr) {
        return UByteArray.m3871isEmptyimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte r6(byte[] bArr, Function3<? super Integer, ? super UByte, ? super UByte, UByte> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM3868getw2LRezQ = function3.invoke(Integer.valueOf(i), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), UByte.m3854boximpl(bM3868getw2LRezQ)).m3860unboximpl();
        }
        return bM3868getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int r7(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        UInt uIntM3879boximpl = null;
        boolean z = false;
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uIntM3879boximpl = UInt.m3879boximpl(iM3885unboximpl);
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Objects.requireNonNull(uIntM3879boximpl, "null cannot be cast to non-null type kotlin.UInt");
        return uIntM3879boximpl.m3885unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] r8(int[] iArr) {
        return UIntArray.m3888constructorimpl(Arrays.copyOf(iArr, iArr.length));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m4116random2D5oskM(@NotNull int[] iArr, @NotNull Random random) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.m3893getpVg5ArA(iArr, random.nextInt(UIntArray.m3894getSizeimpl(iArr)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m4117randomJzugnMA(@NotNull long[] jArr, @NotNull Random random) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.m3918getsVKNKU(jArr, random.nextInt(ULongArray.m3919getSizeimpl(jArr)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m4118randomoSF2wD8(@NotNull byte[] bArr, @NotNull Random random) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.m3868getw2LRezQ(bArr, random.nextInt(UByteArray.m3869getSizeimpl(bArr)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m4119randoms5X_as8(@NotNull short[] sArr, @NotNull Random random) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.m3943getMh2AYeg(sArr, random.nextInt(UShortArray.m3944getSizeimpl(sArr)));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final UInt m4120randomOrNull2D5oskM(@NotNull int[] iArr, @NotNull Random random) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return null;
        }
        return UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, random.nextInt(UIntArray.m3894getSizeimpl(iArr))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final ULong m4121randomOrNullJzugnMA(@NotNull long[] jArr, @NotNull Random random) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        return ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, random.nextInt(ULongArray.m3919getSizeimpl(jArr))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final UByte m4122randomOrNulloSF2wD8(@NotNull byte[] bArr, @NotNull Random random) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        return UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, random.nextInt(UByteArray.m3869getSizeimpl(bArr))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @Nullable
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final UShort m4123randomOrNulls5X_as8(@NotNull short[] sArr, @NotNull Random random) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        return UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, random.nextInt(UShortArray.m3944getSizeimpl(sArr))));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<UInt> m4124reversedajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UInt> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UIntArray.m3886boximpl(iArr));
        j.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m4125reversedGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UByte> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UByteArray.m3861boximpl(bArr));
        j.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m4126reversedQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<ULong> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) ULongArray.m3911boximpl(jArr));
        j.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m4127reversedrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<UShort> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) UShortArray.m3936boximpl(sArr));
        j.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean s(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            if (function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] s0(byte[] bArr, int i) {
        return UByteArray.m3863constructorimpl(Arrays.copyOf(bArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UInt>> C s1(int[] iArr, C c2, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                c2.add(UInt.m3879boximpl(iM3885unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R s2(long[] jArr, R r, Function3<? super Integer, ? super ULong, ? super R, ? extends R> function3) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int s3(byte[] bArr, byte b2) {
        return ArraysKt___ArraysKt.lastIndexOf(bArr, b2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Double s4(short[] sArr, Function1<? super UShort, Double> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        double dDoubleValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).doubleValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                dDoubleValue = Math.max(dDoubleValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).doubleValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean s5(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            if (function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short s6(short[] sArr, Function3<? super Integer, ? super UShort, ? super UShort, UShort> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM3943getMh2AYeg = function3.invoke(Integer.valueOf(i), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), UShort.m3929boximpl(sM3943getMh2AYeg)).m3935unboximpl();
        }
        return sM3943getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short s7(short[] sArr) {
        return UShort.m3930constructorimpl(ArraysKt___ArraysKt.single(sArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] s8(long[] jArr) {
        return ULongArray.m3913constructorimpl(Arrays.copyOf(jArr, jArr.length));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m4128shuffleajY9A(@NotNull int[] iArr) {
        m4129shuffle2D5oskM(iArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m4129shuffle2D5oskM(@NotNull int[] iArr, @NotNull Random random) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, lastIndex);
            UIntArray.m3898setVXSXFK8(iArr, lastIndex, UIntArray.m3893getpVg5ArA(iArr, iNextInt));
            UIntArray.m3898setVXSXFK8(iArr, iNextInt, iM3893getpVg5ArA);
            if (1 > i) {
                return;
            } else {
                lastIndex = i;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m4130shuffleGBYM_sE(@NotNull byte[] bArr) {
        m4133shuffleoSF2wD8(bArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m4131shuffleJzugnMA(@NotNull long[] jArr, @NotNull Random random) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, lastIndex);
            ULongArray.m3923setk8EXiF4(jArr, lastIndex, ULongArray.m3918getsVKNKU(jArr, iNextInt));
            ULongArray.m3923setk8EXiF4(jArr, iNextInt, jM3918getsVKNKU);
            if (1 > i) {
                return;
            } else {
                lastIndex = i;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m4132shuffleQwZRm1k(@NotNull long[] jArr) {
        m4131shuffleJzugnMA(jArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m4133shuffleoSF2wD8(@NotNull byte[] bArr, @NotNull Random random) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, lastIndex);
            UByteArray.m3873setVurrAj0(bArr, lastIndex, UByteArray.m3868getw2LRezQ(bArr, iNextInt));
            UByteArray.m3873setVurrAj0(bArr, iNextInt, bM3868getw2LRezQ);
            if (1 > i) {
                return;
            } else {
                lastIndex = i;
            }
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m4134shufflerL5Bavg(@NotNull short[] sArr) {
        m4135shuffles5X_as8(sArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m4135shuffles5X_as8(@NotNull short[] sArr, @NotNull Random random) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int i = lastIndex - 1;
            int iNextInt = random.nextInt(lastIndex + 1);
            short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, lastIndex);
            UShortArray.m3948set01HTLdE(sArr, lastIndex, UShortArray.m3943getMh2AYeg(sArr, iNextInt));
            UShortArray.m3948set01HTLdE(sArr, iNextInt, sM3943getMh2AYeg);
            if (1 > i) {
                return;
            } else {
                lastIndex = i;
            }
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m4136singleOrNullajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3894getSizeimpl(iArr) == 1) {
            return UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m4137singleOrNullGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3869getSizeimpl(bArr) == 1) {
            return UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m4138singleOrNullQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3919getSizeimpl(jArr) == 1) {
            return ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Nullable
    /* JADX INFO: renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m4139singleOrNullrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3944getSizeimpl(sArr) == 1) {
            return UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<ULong> m4140sliceF7u83W8(@NotNull long[] jArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, it2.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<UInt> m4141sliceHwE9HBo(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, it2.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<UShort> m4142sliceJGPC0M(@NotNull short[] sArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, it2.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<UByte> m4143sliceJQknh5Q(@NotNull byte[] bArr, @NotNull Iterable<Integer> iterable) {
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, it2.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<UShort> m4144sliceQ6IL4kU(@NotNull short[] sArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m3987asListrL5Bavg(UShortArray.m3938constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(sArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<ULong> m4145sliceZRhS8yI(@NotNull long[] jArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m3986asListQwZRm1k(ULongArray.m3913constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(jArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<UByte> m4146slicec0bezYM(@NotNull byte[] bArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m3985asListGBYM_sE(UByteArray.m3863constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(bArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<UInt> m4147slicetAntMlw(@NotNull int[] iArr, @NotNull IntRange intRange) {
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m3984asListajY9A(UIntArray.m3888constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(iArr, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m4148sliceArrayCFIt9YE(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        return UIntArray.m3888constructorimpl(ArraysKt___ArraysKt.sliceArray(iArr, collection));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m4149sliceArrayQ6IL4kU(@NotNull short[] sArr, @NotNull IntRange intRange) {
        return UShortArray.m3938constructorimpl(ArraysKt___ArraysKt.sliceArray(sArr, intRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m4150sliceArrayZRhS8yI(@NotNull long[] jArr, @NotNull IntRange intRange) {
        return ULongArray.m3913constructorimpl(ArraysKt___ArraysKt.sliceArray(jArr, intRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m4151sliceArrayc0bezYM(@NotNull byte[] bArr, @NotNull IntRange intRange) {
        return UByteArray.m3863constructorimpl(ArraysKt___ArraysKt.sliceArray(bArr, intRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m4152sliceArraykzHmqpY(@NotNull long[] jArr, @NotNull Collection<Integer> collection) {
        return ULongArray.m3913constructorimpl(ArraysKt___ArraysKt.sliceArray(jArr, collection));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m4153sliceArrayojwP5H8(@NotNull short[] sArr, @NotNull Collection<Integer> collection) {
        return UShortArray.m3938constructorimpl(ArraysKt___ArraysKt.sliceArray(sArr, collection));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m4154sliceArraytAntMlw(@NotNull int[] iArr, @NotNull IntRange intRange) {
        return UIntArray.m3888constructorimpl(ArraysKt___ArraysKt.sliceArray(iArr, intRange));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m4155sliceArrayxo_DsdI(@NotNull byte[] bArr, @NotNull Collection<Integer> collection) {
        return UByteArray.m3863constructorimpl(ArraysKt___ArraysKt.sliceArray(bArr, collection));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m4156sortajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3894getSizeimpl(iArr) > 1) {
            UArraySortingKt.m3971sortArrayoBK06Vg(iArr, 0, UIntArray.m3894getSizeimpl(iArr));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m4157sortnroSd4(@NotNull long[] jArr, int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, ULongArray.m3919getSizeimpl(jArr));
        UArraySortingKt.m3968sortArraynroSd4(jArr, i, i2);
    }

    /* JADX INFO: renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m4158sortnroSd4$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = ULongArray.m3919getSizeimpl(jArr);
        }
        m4157sortnroSd4(jArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m4159sort4UcCI2c(@NotNull byte[] bArr, int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UByteArray.m3869getSizeimpl(bArr));
        UArraySortingKt.m3969sortArray4UcCI2c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m4160sort4UcCI2c$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UByteArray.m3869getSizeimpl(bArr);
        }
        m4159sort4UcCI2c(bArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m4161sortAa5vz7o(@NotNull short[] sArr, int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UShortArray.m3944getSizeimpl(sArr));
        UArraySortingKt.m3970sortArrayAa5vz7o(sArr, i, i2);
    }

    /* JADX INFO: renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m4162sortAa5vz7o$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UShortArray.m3944getSizeimpl(sArr);
        }
        m4161sortAa5vz7o(sArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m4163sortGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3869getSizeimpl(bArr) > 1) {
            UArraySortingKt.m3969sortArray4UcCI2c(bArr, 0, UByteArray.m3869getSizeimpl(bArr));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m4164sortQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3919getSizeimpl(jArr) > 1) {
            UArraySortingKt.m3968sortArraynroSd4(jArr, 0, ULongArray.m3919getSizeimpl(jArr));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m4165sortoBK06Vg(@NotNull int[] iArr, int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, UIntArray.m3894getSizeimpl(iArr));
        UArraySortingKt.m3971sortArrayoBK06Vg(iArr, i, i2);
    }

    /* JADX INFO: renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m4166sortoBK06Vg$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = UIntArray.m3894getSizeimpl(iArr);
        }
        m4165sortoBK06Vg(iArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m4167sortrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3944getSizeimpl(sArr) > 1) {
            UArraySortingKt.m3970sortArrayAa5vz7o(sArr, 0, UShortArray.m3944getSizeimpl(sArr));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m4168sortDescendingajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3894getSizeimpl(iArr) > 1) {
            m4156sortajY9A(iArr);
            ArraysKt___ArraysKt.reverse(iArr);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m4169sortDescendingnroSd4(@NotNull long[] jArr, int i, int i2) {
        m4157sortnroSd4(jArr, i, i2);
        ArraysKt___ArraysKt.reverse(jArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m4170sortDescending4UcCI2c(@NotNull byte[] bArr, int i, int i2) {
        m4159sort4UcCI2c(bArr, i, i2);
        ArraysKt___ArraysKt.reverse(bArr, i, i2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m4171sortDescendingAa5vz7o(@NotNull short[] sArr, int i, int i2) {
        m4161sortAa5vz7o(sArr, i, i2);
        ArraysKt___ArraysKt.reverse(sArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m4172sortDescendingGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3869getSizeimpl(bArr) > 1) {
            m4163sortGBYM_sE(bArr);
            ArraysKt___ArraysKt.reverse(bArr);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m4173sortDescendingQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3919getSizeimpl(jArr) > 1) {
            m4164sortQwZRm1k(jArr);
            ArraysKt___ArraysKt.reverse(jArr);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m4174sortDescendingoBK06Vg(@NotNull int[] iArr, int i, int i2) {
        m4165sortoBK06Vg(iArr, i, i2);
        ArraysKt___ArraysKt.reverse(iArr, i, i2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m4175sortDescendingrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3944getSizeimpl(sArr) > 1) {
            m4167sortrL5Bavg(sArr);
            ArraysKt___ArraysKt.reverse(sArr);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<UInt> m4176sortedajY9A(@NotNull int[] iArr) {
        int[] iArrM3888constructorimpl = UIntArray.m3888constructorimpl(Arrays.copyOf(iArr, iArr.length));
        m4156sortajY9A(iArrM3888constructorimpl);
        return UArraysKt___UArraysJvmKt.m3984asListajY9A(iArrM3888constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m4177sortedGBYM_sE(@NotNull byte[] bArr) {
        byte[] bArrM3863constructorimpl = UByteArray.m3863constructorimpl(Arrays.copyOf(bArr, bArr.length));
        m4163sortGBYM_sE(bArrM3863constructorimpl);
        return UArraysKt___UArraysJvmKt.m3985asListGBYM_sE(bArrM3863constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m4178sortedQwZRm1k(@NotNull long[] jArr) {
        long[] jArrM3913constructorimpl = ULongArray.m3913constructorimpl(Arrays.copyOf(jArr, jArr.length));
        m4164sortQwZRm1k(jArrM3913constructorimpl);
        return UArraysKt___UArraysJvmKt.m3986asListQwZRm1k(jArrM3913constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m4179sortedrL5Bavg(@NotNull short[] sArr) {
        short[] sArrM3938constructorimpl = UShortArray.m3938constructorimpl(Arrays.copyOf(sArr, sArr.length));
        m4167sortrL5Bavg(sArrM3938constructorimpl);
        return UArraysKt___UArraysJvmKt.m3987asListrL5Bavg(sArrM3938constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m4180sortedArrayajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return iArr;
        }
        int[] iArrM3888constructorimpl = UIntArray.m3888constructorimpl(Arrays.copyOf(iArr, iArr.length));
        m4156sortajY9A(iArrM3888constructorimpl);
        return iArrM3888constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m4181sortedArrayGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return bArr;
        }
        byte[] bArrM3863constructorimpl = UByteArray.m3863constructorimpl(Arrays.copyOf(bArr, bArr.length));
        m4163sortGBYM_sE(bArrM3863constructorimpl);
        return bArrM3863constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m4182sortedArrayQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return jArr;
        }
        long[] jArrM3913constructorimpl = ULongArray.m3913constructorimpl(Arrays.copyOf(jArr, jArr.length));
        m4164sortQwZRm1k(jArrM3913constructorimpl);
        return jArrM3913constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m4183sortedArrayrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return sArr;
        }
        short[] sArrM3938constructorimpl = UShortArray.m3938constructorimpl(Arrays.copyOf(sArr, sArr.length));
        m4167sortrL5Bavg(sArrM3938constructorimpl);
        return sArrM3938constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m4184sortedArrayDescendingajY9A(@NotNull int[] iArr) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            return iArr;
        }
        int[] iArrM3888constructorimpl = UIntArray.m3888constructorimpl(Arrays.copyOf(iArr, iArr.length));
        m4168sortDescendingajY9A(iArrM3888constructorimpl);
        return iArrM3888constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m4185sortedArrayDescendingGBYM_sE(@NotNull byte[] bArr) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return bArr;
        }
        byte[] bArrM3863constructorimpl = UByteArray.m3863constructorimpl(Arrays.copyOf(bArr, bArr.length));
        m4172sortDescendingGBYM_sE(bArrM3863constructorimpl);
        return bArrM3863constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m4186sortedArrayDescendingQwZRm1k(@NotNull long[] jArr) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return jArr;
        }
        long[] jArrM3913constructorimpl = ULongArray.m3913constructorimpl(Arrays.copyOf(jArr, jArr.length));
        m4173sortDescendingQwZRm1k(jArrM3913constructorimpl);
        return jArrM3913constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m4187sortedArrayDescendingrL5Bavg(@NotNull short[] sArr) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return sArr;
        }
        short[] sArrM3938constructorimpl = UShortArray.m3938constructorimpl(Arrays.copyOf(sArr, sArr.length));
        m4175sortDescendingrL5Bavg(sArrM3938constructorimpl);
        return sArrM3938constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<UInt> m4188sortedDescendingajY9A(@NotNull int[] iArr) {
        int[] iArrM3888constructorimpl = UIntArray.m3888constructorimpl(Arrays.copyOf(iArr, iArr.length));
        m4156sortajY9A(iArrM3888constructorimpl);
        return m4124reversedajY9A(iArrM3888constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m4189sortedDescendingGBYM_sE(@NotNull byte[] bArr) {
        byte[] bArrM3863constructorimpl = UByteArray.m3863constructorimpl(Arrays.copyOf(bArr, bArr.length));
        m4163sortGBYM_sE(bArrM3863constructorimpl);
        return m4125reversedGBYM_sE(bArrM3863constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m4190sortedDescendingQwZRm1k(@NotNull long[] jArr) {
        long[] jArrM3913constructorimpl = ULongArray.m3913constructorimpl(Arrays.copyOf(jArr, jArr.length));
        m4164sortQwZRm1k(jArrM3913constructorimpl);
        return m4126reversedQwZRm1k(jArrM3913constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m4191sortedDescendingrL5Bavg(@NotNull short[] sArr) {
        short[] sArrM3938constructorimpl = UShortArray.m3938constructorimpl(Arrays.copyOf(sArr, sArr.length));
        m4167sortrL5Bavg(sArrM3938constructorimpl);
        return m4127reversedrL5Bavg(sArrM3938constructorimpl);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull UByte[] uByteArr) {
        int length = uByteArr.length;
        int i = 0;
        int iM3880constructorimpl = 0;
        while (i < length) {
            byte bM3860unboximpl = uByteArr[i].m3860unboximpl();
            i++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(bM3860unboximpl & 255));
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull UInt[] uIntArr) {
        int length = uIntArr.length;
        int i = 0;
        int iM3880constructorimpl = 0;
        while (i < length) {
            int iM3885unboximpl = uIntArr[i].m3885unboximpl();
            i++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + iM3885unboximpl);
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull ULong[] uLongArr) {
        int length = uLongArr.length;
        long jM3905constructorimpl = 0;
        int i = 0;
        while (i < length) {
            long jM3910unboximpl = uLongArr[i].m3910unboximpl();
            i++;
            jM3905constructorimpl = ULong.m3905constructorimpl(jM3905constructorimpl + jM3910unboximpl);
        }
        return jM3905constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull UShort[] uShortArr) {
        int length = uShortArr.length;
        int i = 0;
        int iM3880constructorimpl = 0;
        while (i < length) {
            short sM3935unboximpl = uShortArr[i].m3935unboximpl();
            i++;
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(sM3935unboximpl & UShort.MAX_VALUE));
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean t(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            if (function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] t0(long[] jArr) {
        return ULongArray.m3913constructorimpl(Arrays.copyOf(jArr, jArr.length));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <C extends Collection<? super UByte>> C t1(byte[] bArr, C c2, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                c2.add(UByte.m3854boximpl(bM3860unboximpl));
            }
        }
        return c2;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> R t2(int[] iArr, R r, Function3<? super Integer, ? super UInt, ? super R, ? extends R> function3) {
        for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r = function3.invoke(Integer.valueOf(lastIndex), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, lastIndex)), r);
        }
        return r;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int t3(int[] iArr, int i) {
        return ArraysKt___ArraysKt.lastIndexOf(iArr, i);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final Float t4(short[] sArr, Function1<? super UShort, Float> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            return null;
        }
        float fFloatValue = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0))).floatValue();
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                fFloatValue = Math.max(fFloatValue, function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i))).floatValue());
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean t5(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            if (function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long t6(long[] jArr, Function3<? super Integer, ? super ULong, ? super ULong, ULong> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM3918getsVKNKU = function3.invoke(Integer.valueOf(i), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), ULong.m3904boximpl(jM3918getsVKNKU)).m3910unboximpl();
        }
        return jM3918getsVKNKU;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short t7(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        UShort uShortM3929boximpl = null;
        boolean z = false;
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uShortM3929boximpl = UShort.m3929boximpl(sM3935unboximpl);
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Objects.requireNonNull(uShortM3929boximpl, "null cannot be cast to non-null type kotlin.UShort");
        return uShortM3929boximpl.m3935unboximpl();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] t8(short[] sArr) {
        return UShortArray.m3938constructorimpl(Arrays.copyOf(sArr, sArr.length));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4192takePpDY95g(@NotNull byte[] bArr, int i) {
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= UByteArray.m3869getSizeimpl(bArr)) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.m3861boximpl(bArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            arrayList.add(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4193takenggk6HY(@NotNull short[] sArr, int i) {
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= UShortArray.m3944getSizeimpl(sArr)) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.m3936boximpl(sArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            arrayList.add(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4194takeqFRl0hI(@NotNull int[] iArr, int i) {
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= UIntArray.m3894getSizeimpl(iArr)) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.m3886boximpl(iArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            arrayList.add(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4195taker7IrZao(@NotNull long[] jArr, int i) {
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= ULongArray.m3919getSizeimpl(jArr)) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.m3911boximpl(jArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            arrayList.add(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m4196takeLastPpDY95g(@NotNull byte[] bArr, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM3869getSizeimpl = UByteArray.m3869getSizeimpl(bArr);
        if (i >= iM3869getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UByteArray.m3861boximpl(bArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, iM3869getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM3869getSizeimpl - i; i2 < iM3869getSizeimpl; i2++) {
            arrayList.add(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m4197takeLastnggk6HY(@NotNull short[] sArr, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM3944getSizeimpl = UShortArray.m3944getSizeimpl(sArr);
        if (i >= iM3944getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UShortArray.m3936boximpl(sArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, iM3944getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM3944getSizeimpl - i; i2 < iM3944getSizeimpl; i2++) {
            arrayList.add(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m4198takeLastqFRl0hI(@NotNull int[] iArr, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM3894getSizeimpl = UIntArray.m3894getSizeimpl(iArr);
        if (i >= iM3894getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(UIntArray.m3886boximpl(iArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, iM3894getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM3894getSizeimpl - i; i2 < iM3894getSizeimpl; i2++) {
            arrayList.add(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m4199takeLastr7IrZao(@NotNull long[] jArr, int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iM3919getSizeimpl = ULongArray.m3919getSizeimpl(jArr);
        if (i >= iM3919getSizeimpl) {
            return CollectionsKt___CollectionsKt.toList(ULongArray.m3911boximpl(jArr));
        }
        if (i == 1) {
            return kotlin.collections.e.listOf(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, iM3919getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = iM3919getSizeimpl - i; i2 < iM3919getSizeimpl; i2++) {
            arrayList.add(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final UInt[] m4200toTypedArrayajY9A(@NotNull int[] iArr) {
        int iM3894getSizeimpl = UIntArray.m3894getSizeimpl(iArr);
        UInt[] uIntArr = new UInt[iM3894getSizeimpl];
        for (int i = 0; i < iM3894getSizeimpl; i++) {
            uIntArr[i] = UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i));
        }
        return uIntArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final UByte[] m4201toTypedArrayGBYM_sE(@NotNull byte[] bArr) {
        int iM3869getSizeimpl = UByteArray.m3869getSizeimpl(bArr);
        UByte[] uByteArr = new UByte[iM3869getSizeimpl];
        for (int i = 0; i < iM3869getSizeimpl; i++) {
            uByteArr[i] = UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i));
        }
        return uByteArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final ULong[] m4202toTypedArrayQwZRm1k(@NotNull long[] jArr) {
        int iM3919getSizeimpl = ULongArray.m3919getSizeimpl(jArr);
        ULong[] uLongArr = new ULong[iM3919getSizeimpl];
        for (int i = 0; i < iM3919getSizeimpl; i++) {
            uLongArr[i] = ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i));
        }
        return uLongArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final UShort[] m4203toTypedArrayrL5Bavg(@NotNull short[] sArr) {
        int iM3944getSizeimpl = UShortArray.m3944getSizeimpl(sArr);
        UShort[] uShortArr = new UShort[iM3944getSizeimpl];
        for (int i = 0; i < iM3944getSizeimpl; i++) {
            uShortArr[i] = UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i));
        }
        return uShortArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull UByte[] uByteArr) {
        int length = uByteArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = uByteArr[i].m3860unboximpl();
        }
        return UByteArray.m3863constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull UInt[] uIntArr) {
        int length = uIntArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = uIntArr[i].m3885unboximpl();
        }
        return UIntArray.m3888constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull ULong[] uLongArr) {
        int length = uLongArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = uLongArr[i].m3910unboximpl();
        }
        return ULongArray.m3913constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull UShort[] uShortArr) {
        int length = uShortArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = uShortArr[i].m3935unboximpl();
        }
        return UShortArray.m3938constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean u(long[] jArr) {
        return ArraysKt___ArraysKt.any(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] u0(short[] sArr, int i) {
        return UShortArray.m3938constructorimpl(Arrays.copyOf(sArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte u1(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                return UByte.m3854boximpl(bM3860unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void u2(byte[] bArr, Function1<? super UByte, Unit> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte u3(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(bArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return null;
        }
        while (true) {
            int i = last - 1;
            byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, last);
            if (function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ)).booleanValue()) {
                return UByte.m3854boximpl(bM3868getw2LRezQ);
            }
            if (last == first) {
                return null;
            }
            last = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R u4(long[] jArr, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean u5(long[] jArr) {
        return ULongArray.m3921isEmptyimpl(jArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt u6(int[] iArr, Function3<? super Integer, ? super UInt, ? super UInt, UInt> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM3893getpVg5ArA = function3.invoke(Integer.valueOf(i), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), UInt.m3879boximpl(iM3893getpVg5ArA)).m3885unboximpl();
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte u7(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        boolean z = false;
        UByte uByteM3854boximpl = null;
        while (itM3872iteratorimpl.hasNext()) {
            byte bM3860unboximpl = itM3872iteratorimpl.next().m3860unboximpl();
            if (function1.invoke(UByte.m3854boximpl(bM3860unboximpl)).booleanValue()) {
                if (z) {
                    return null;
                }
                uByteM3854boximpl = UByte.m3854boximpl(bM3860unboximpl);
                z = true;
            }
        }
        if (z) {
            return uByteM3854boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> u8(int[] iArr, Iterable<? extends R> iterable, Function2<? super UInt, ? super R, ? extends V> function2) {
        int iM3894getSizeimpl = UIntArray.m3894getSizeimpl(iArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3894getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3894getSizeimpl) {
                break;
            }
            arrayList.add(function2.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean v(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            if (function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] v0(int[] iArr, int i) {
        return UIntArray.m3888constructorimpl(Arrays.copyOf(iArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong v1(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                return ULong.m3904boximpl(jM3910unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void v2(long[] jArr, Function1<? super ULong, Unit> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong v3(long[] jArr, Function1<? super ULong, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(jArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return null;
        }
        while (true) {
            int i = last - 1;
            long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, last);
            if (function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU)).booleanValue()) {
                return ULong.m3904boximpl(jM3918getsVKNKU);
            }
            if (last == first) {
                return null;
            }
            last = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R v4(byte[] bArr, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean v5(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            if (function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte v6(byte[] bArr, Function3<? super Integer, ? super UByte, ? super UByte, UByte> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM3868getw2LRezQ = function3.invoke(Integer.valueOf(i), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), UByte.m3854boximpl(bM3868getw2LRezQ)).m3860unboximpl();
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong v7(long[] jArr, Function1<? super ULong, Boolean> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        boolean z = false;
        ULong uLongM3904boximpl = null;
        while (itM3922iteratorimpl.hasNext()) {
            long jM3910unboximpl = itM3922iteratorimpl.next().m3910unboximpl();
            if (function1.invoke(ULong.m3904boximpl(jM3910unboximpl)).booleanValue()) {
                if (z) {
                    return null;
                }
                uLongM3904boximpl = ULong.m3904boximpl(jM3910unboximpl);
                z = true;
            }
        }
        if (z) {
            return uLongM3904boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> v8(long[] jArr, R[] rArr, Function2<? super ULong, ? super R, ? extends V> function2) {
        int iMin = Math.min(ULongArray.m3919getSizeimpl(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean w(short[] sArr) {
        return ArraysKt___ArraysKt.any(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] w0(long[] jArr, int i) {
        return ULongArray.m3913constructorimpl(Arrays.copyOf(jArr, i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt w1(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                return UInt.m3879boximpl(iM3885unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void w2(int[] iArr, Function1<? super UInt, Unit> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            function1.invoke(UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt w3(int[] iArr, Function1<? super UInt, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(iArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return null;
        }
        while (true) {
            int i = last - 1;
            int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, last);
            if (function1.invoke(UInt.m3879boximpl(iM3893getpVg5ArA)).booleanValue()) {
                return UInt.m3879boximpl(iM3893getpVg5ArA);
            }
            if (last == first) {
                return null;
            }
            last = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R w4(short[] sArr, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> function1) {
        if (UShortArray.m3946isEmptyimpl(sArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean w5(short[] sArr) {
        return UShortArray.m3946isEmptyimpl(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort w6(short[] sArr, Function3<? super Integer, ? super UShort, ? super UShort, UShort> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            sM3943getMh2AYeg = function3.invoke(Integer.valueOf(i), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), UShort.m3929boximpl(sM3943getMh2AYeg)).m3935unboximpl();
        }
        return UShort.m3929boximpl(sM3943getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UInt w7(int[] iArr, Function1<? super UInt, Boolean> function1) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        boolean z = false;
        UInt uIntM3879boximpl = null;
        while (itM3897iteratorimpl.hasNext()) {
            int iM3885unboximpl = itM3897iteratorimpl.next().m3885unboximpl();
            if (function1.invoke(UInt.m3879boximpl(iM3885unboximpl)).booleanValue()) {
                if (z) {
                    return null;
                }
                uIntM3879boximpl = UInt.m3879boximpl(iM3885unboximpl);
                z = true;
            }
        }
        if (z) {
            return uIntM3879boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> List<V> w8(byte[] bArr, byte[] bArr2, Function2<? super UByte, ? super UByte, ? extends V> function2) {
        int iMin = Math.min(UByteArray.m3869getSizeimpl(bArr), UByteArray.m3869getSizeimpl(bArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr2, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<IndexedValue<UInt>> m4204withIndexajY9A(@NotNull int[] iArr) {
        return new IndexingIterable(new C1158a(iArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<IndexedValue<UByte>> m4205withIndexGBYM_sE(@NotNull byte[] bArr) {
        return new IndexingIterable(new c(bArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<IndexedValue<ULong>> m4206withIndexQwZRm1k(@NotNull long[] jArr) {
        return new IndexingIterable(new b(jArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<IndexedValue<UShort>> m4207withIndexrL5Bavg(@NotNull short[] sArr) {
        return new IndexingIterable(new d(sArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean x(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            if (function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] x0(short[] sArr) {
        return UShortArray.m3938constructorimpl(Arrays.copyOf(sArr, sArr.length));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort x1(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                return UShort.m3929boximpl(sM3935unboximpl);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void x2(short[] sArr, Function1<? super UShort, Unit> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl()));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort x3(short[] sArr, Function1<? super UShort, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(sArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return null;
        }
        while (true) {
            int i = last - 1;
            short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, last);
            if (function1.invoke(UShort.m3929boximpl(sM3943getMh2AYeg)).booleanValue()) {
                return UShort.m3929boximpl(sM3943getMh2AYeg);
            }
            if (last == first) {
                return null;
            }
            last = i;
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R x4(int[] iArr, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> function1) {
        if (UIntArray.m3896isEmptyimpl(iArr)) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final boolean x5(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            if (function1.invoke(UShort.m3929boximpl(itM3947iteratorimpl.next().m3935unboximpl())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong x6(long[] jArr, Function3<? super Integer, ? super ULong, ? super ULong, ULong> function3) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            jM3918getsVKNKU = function3.invoke(Integer.valueOf(i), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), ULong.m3904boximpl(jM3918getsVKNKU)).m3910unboximpl();
        }
        return ULong.m3904boximpl(jM3918getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UShort x7(short[] sArr, Function1<? super UShort, Boolean> function1) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        boolean z = false;
        UShort uShortM3929boximpl = null;
        while (itM3947iteratorimpl.hasNext()) {
            short sM3935unboximpl = itM3947iteratorimpl.next().m3935unboximpl();
            if (function1.invoke(UShort.m3929boximpl(sM3935unboximpl)).booleanValue()) {
                if (z) {
                    return null;
                }
                uShortM3929boximpl = UShort.m3929boximpl(sM3935unboximpl);
                z = true;
            }
        }
        if (z) {
            return uShortM3929boximpl;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> List<V> x8(int[] iArr, int[] iArr2, Function2<? super UInt, ? super UInt, ? extends V> function2) {
        int iMin = Math.min(UIntArray.m3894getSizeimpl(iArr), UIntArray.m3894getSizeimpl(iArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr2, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] y(byte[] bArr) {
        return bArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] y0(long[] jArr, int i, int i2) {
        return ULongArray.m3913constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(jArr, i, i2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final UByte y1(byte[] bArr, Function1<? super UByte, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(bArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, last);
                if (function1.invoke(UByte.m3854boximpl(bM3868getw2LRezQ)).booleanValue()) {
                    return UByte.m3854boximpl(bM3868getw2LRezQ);
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void y2(byte[] bArr, Function2<? super Integer, ? super UByte, Unit> function2) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        int i = 0;
        while (itM3872iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
            i++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> y3(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(UByteArray.m3869getSizeimpl(bArr));
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            arrayList.add(function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R y4(long[] jArr, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> function1) {
        if (ULongArray.m3921isEmptyimpl(jArr)) {
            return null;
        }
        R rInvoke = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] y5(byte[] bArr, Function1<? super UByte, Unit> function1) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            function1.invoke(UByte.m3854boximpl(itM3872iteratorimpl.next().m3860unboximpl()));
        }
        return bArr;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UByte y6(byte[] bArr, Function2<? super UByte, ? super UByte, UByte> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            bM3868getw2LRezQ = function2.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), UByte.m3854boximpl(bM3868getw2LRezQ)).m3860unboximpl();
        }
        return UByte.m3854boximpl(bM3868getw2LRezQ);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int y7(int[] iArr) {
        return UInt.m3880constructorimpl(ArraysKt___ArraysKt.sum(iArr));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R, V> List<V> y8(byte[] bArr, R[] rArr, Function2<? super UByte, ? super R, ? extends V> function2) {
        int iMin = Math.min(UByteArray.m3869getSizeimpl(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), rArr[i]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] z(int[] iArr) {
        return iArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] z0(byte[] bArr, int i, int i2) {
        return UByteArray.m3863constructorimpl(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final ULong z1(long[] jArr, Function1<? super ULong, Boolean> function1) {
        IntRange indices = ArraysKt___ArraysKt.getIndices(jArr);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                int i = last - 1;
                long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, last);
                if (function1.invoke(ULong.m3904boximpl(jM3918getsVKNKU)).booleanValue()) {
                    return ULong.m3904boximpl(jM3918getsVKNKU);
                }
                if (last != first) {
                    last = i;
                }
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final void z2(int[] iArr, Function2<? super Integer, ? super UInt, Unit> function2) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        int i = 0;
        while (itM3897iteratorimpl.hasNext()) {
            function2.invoke(Integer.valueOf(i), UInt.m3879boximpl(itM3897iteratorimpl.next().m3885unboximpl()));
            i++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <R> List<R> z3(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(ULongArray.m3919getSizeimpl(jArr));
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            arrayList.add(function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final <R> R z4(byte[] bArr, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> function1) {
        if (UByteArray.m3871isEmptyimpl(bArr)) {
            return null;
        }
        R rInvoke = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, 0)));
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i2 = i + 1;
                R rInvoke2 = function1.invoke(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i = i2;
            }
        }
        return rInvoke;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] z5(long[] jArr, Function1<? super ULong, Unit> function1) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            function1.invoke(ULong.m3904boximpl(itM3922iteratorimpl.next().m3910unboximpl()));
        }
        return jArr;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final UInt z6(int[] iArr, Function2<? super UInt, ? super UInt, UInt> function2) {
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            iM3893getpVg5ArA = function2.invoke(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), UInt.m3879boximpl(iM3893getpVg5ArA)).m3885unboximpl();
        }
        return UInt.m3879boximpl(iM3893getpVg5ArA);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int z7(byte[] bArr) {
        int iM3880constructorimpl = UInt.m3880constructorimpl(0);
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            iM3880constructorimpl = UInt.m3880constructorimpl(iM3880constructorimpl + UInt.m3880constructorimpl(itM3872iteratorimpl.next().m3860unboximpl() & 255));
        }
        return iM3880constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final <V> List<V> z8(long[] jArr, long[] jArr2, Function2<? super ULong, ? super ULong, ? extends V> function2) {
        int iMin = Math.min(ULongArray.m3919getSizeimpl(jArr), ULongArray.m3919getSizeimpl(jArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(function2.invoke(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr2, i))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m4208zipCE_24M(@NotNull int[] iArr, @NotNull R[] rArr) {
        int iMin = Math.min(UIntArray.m3894getSizeimpl(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            int iM3893getpVg5ArA = UIntArray.m3893getpVg5ArA(iArr, i);
            arrayList.add(TuplesKt.to(UInt.m3879boximpl(iM3893getpVg5ArA), rArr[i]));
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m4209zipF7u83W8(@NotNull long[] jArr, @NotNull Iterable<? extends R> iterable) {
        int iM3919getSizeimpl = ULongArray.m3919getSizeimpl(jArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3919getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3919getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m4210zipHwE9HBo(@NotNull int[] iArr, @NotNull Iterable<? extends R> iterable) {
        int iM3894getSizeimpl = UIntArray.m3894getSizeimpl(iArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3894getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3894getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m4211zipJGPC0M(@NotNull short[] sArr, @NotNull Iterable<? extends R> iterable) {
        int iM3944getSizeimpl = UShortArray.m3944getSizeimpl(sArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3944getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3944getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m4212zipJQknh5Q(@NotNull byte[] bArr, @NotNull Iterable<? extends R> iterable) {
        int iM3869getSizeimpl = UByteArray.m3869getSizeimpl(bArr);
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), iM3869getSizeimpl));
        int i = 0;
        for (R r : iterable) {
            if (i >= iM3869getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), r));
            i++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<Pair<UInt, UInt>> m4213zipctEhBpI(@NotNull int[] iArr, @NotNull int[] iArr2) {
        int iMin = Math.min(UIntArray.m3894getSizeimpl(iArr), UIntArray.m3894getSizeimpl(iArr2));
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            arrayList.add(TuplesKt.to(UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr, i)), UInt.m3879boximpl(UIntArray.m3893getpVg5ArA(iArr2, i))));
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m4214zipf7H3mmw(@NotNull long[] jArr, @NotNull R[] rArr) {
        int iMin = Math.min(ULongArray.m3919getSizeimpl(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            long jM3918getsVKNKU = ULongArray.m3918getsVKNKU(jArr, i);
            arrayList.add(TuplesKt.to(ULong.m3904boximpl(jM3918getsVKNKU), rArr[i]));
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<Pair<UByte, UByte>> m4215zipkdPth3s(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int iMin = Math.min(UByteArray.m3869getSizeimpl(bArr), UByteArray.m3869getSizeimpl(bArr2));
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            arrayList.add(TuplesKt.to(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr, i)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArr2, i))));
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<Pair<UShort, UShort>> m4216zipmazbYpA(@NotNull short[] sArr, @NotNull short[] sArr2) {
        int iMin = Math.min(UShortArray.m3944getSizeimpl(sArr), UShortArray.m3944getSizeimpl(sArr2));
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            arrayList.add(TuplesKt.to(UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr, i)), UShort.m3929boximpl(UShortArray.m3943getMh2AYeg(sArr2, i))));
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m4217zipnl983wc(@NotNull byte[] bArr, @NotNull R[] rArr) {
        int iMin = Math.min(UByteArray.m3869getSizeimpl(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            byte bM3868getw2LRezQ = UByteArray.m3868getw2LRezQ(bArr, i);
            arrayList.add(TuplesKt.to(UByte.m3854boximpl(bM3868getw2LRezQ), rArr[i]));
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m4218zipuaTIQ5s(@NotNull short[] sArr, @NotNull R[] rArr) {
        int iMin = Math.min(UShortArray.m3944getSizeimpl(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            short sM3943getMh2AYeg = UShortArray.m3943getMh2AYeg(sArr, i);
            arrayList.add(TuplesKt.to(UShort.m3929boximpl(sM3943getMh2AYeg), rArr[i]));
            i = i2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<Pair<ULong, ULong>> m4219zipus8wMrg(@NotNull long[] jArr, @NotNull long[] jArr2) {
        int iMin = Math.min(ULongArray.m3919getSizeimpl(jArr), ULongArray.m3919getSizeimpl(jArr2));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(TuplesKt.to(ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr, i)), ULong.m3904boximpl(ULongArray.m3918getsVKNKU(jArr2, i))));
        }
        return arrayList;
    }
}
