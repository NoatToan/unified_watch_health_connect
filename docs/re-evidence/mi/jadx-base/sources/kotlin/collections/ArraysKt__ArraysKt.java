package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepEquals")
    public static <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Object[] objArr = tArr[i];
            Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof UByteArray) && (objArr2 instanceof UByteArray)) {
                    if (!UArraysKt___UArraysKt.m1466contentEqualskV0jMPg(((UByteArray) objArr).m971unboximpl(), ((UByteArray) objArr2).m971unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof UShortArray) && (objArr2 instanceof UShortArray)) {
                    if (!UArraysKt___UArraysKt.m1464contentEqualsFGO6Aew(((UShortArray) objArr).m1234unboximpl(), ((UShortArray) objArr2).m1234unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof UIntArray) && (objArr2 instanceof UIntArray)) {
                    if (!UArraysKt___UArraysKt.m1465contentEqualsKJPZfPQ(((UIntArray) objArr).m1050unboximpl(), ((UIntArray) objArr2).m1050unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof ULongArray) && (objArr2 instanceof ULongArray)) {
                    if (!UArraysKt___UArraysKt.m1467contentEqualslec5QzE(((ULongArray) objArr).m1129unboximpl(), ((ULongArray) objArr2).m1129unboximpl())) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    @PublishedApi
    public static <T> String contentDeepToString(@Nullable T[] tArr) {
        if (tArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder((RangesKt___RangesKt.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else if (objArr instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
                Unit unit = Unit.INSTANCE;
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                sb.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                sb.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                sb.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                sb.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                sb.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                sb.append(string8);
            } else if (objArr instanceof UByteArray) {
                sb.append(UArraysKt___UArraysKt.m1472contentToString2csIQuQ(((UByteArray) objArr).m971unboximpl()));
            } else if (objArr instanceof UShortArray) {
                sb.append(UArraysKt___UArraysKt.m1474contentToStringd6D3K8(((UShortArray) objArr).m1234unboximpl()));
            } else if (objArr instanceof UIntArray) {
                sb.append(UArraysKt___UArraysKt.m1473contentToStringXUkPCBk(((UIntArray) objArr).m1050unboximpl()));
            } else if (objArr instanceof ULongArray) {
                sb.append(UArraysKt___UArraysKt.m1475contentToStringuLth9ew(((ULongArray) objArr).m1129unboximpl()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Object[] objArr, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean isNullOrEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
