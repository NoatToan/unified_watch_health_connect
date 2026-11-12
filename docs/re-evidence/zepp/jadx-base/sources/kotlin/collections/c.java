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
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
class c extends b {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void b(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append(JsonLexerKt.BEGIN_LIST);
        int i = 0;
        int length = tArr.length;
        while (i < length) {
            int i2 = i + 1;
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                b(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                sb.append(Arrays.toString((byte[]) objArr));
            } else if (objArr instanceof short[]) {
                sb.append(Arrays.toString((short[]) objArr));
            } else if (objArr instanceof int[]) {
                sb.append(Arrays.toString((int[]) objArr));
            } else if (objArr instanceof long[]) {
                sb.append(Arrays.toString((long[]) objArr));
            } else if (objArr instanceof float[]) {
                sb.append(Arrays.toString((float[]) objArr));
            } else if (objArr instanceof double[]) {
                sb.append(Arrays.toString((double[]) objArr));
            } else if (objArr instanceof char[]) {
                sb.append(Arrays.toString((char[]) objArr));
            } else if (objArr instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) objArr));
            } else if (objArr instanceof UByteArray) {
                sb.append(kotlin.collections.unsigned.a.m4029contentToString2csIQuQ(((UByteArray) objArr).m3877unboximpl()));
            } else if (objArr instanceof UShortArray) {
                sb.append(kotlin.collections.unsigned.a.m4033contentToStringd6D3K8(((UShortArray) objArr).m3952unboximpl()));
            } else if (objArr instanceof UIntArray) {
                sb.append(kotlin.collections.unsigned.a.m4032contentToStringXUkPCBk(((UIntArray) objArr).m3902unboximpl()));
            } else if (objArr instanceof ULongArray) {
                sb.append(kotlin.collections.unsigned.a.m4035contentToStringuLth9ew(((ULongArray) objArr).m3927unboximpl()));
            } else {
                sb.append(objArr.toString());
            }
            i = i2;
        }
        sb.append(JsonLexerKt.END_LIST);
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object c(Object[] objArr, Function0 function0) {
        return objArr.length == 0 ? function0.invoke() : objArr;
    }

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
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
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
                    if (!kotlin.collections.unsigned.a.m4015contentEqualskV0jMPg(((UByteArray) objArr).m3877unboximpl(), ((UByteArray) objArr2).m3877unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof UShortArray) && (objArr2 instanceof UShortArray)) {
                    if (!kotlin.collections.unsigned.a.m4012contentEqualsFGO6Aew(((UShortArray) objArr).m3952unboximpl(), ((UShortArray) objArr2).m3952unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof UIntArray) && (objArr2 instanceof UIntArray)) {
                    if (!kotlin.collections.unsigned.a.m4013contentEqualsKJPZfPQ(((UIntArray) objArr).m3902unboximpl(), ((UIntArray) objArr2).m3902unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof ULongArray) && (objArr2 instanceof ULongArray)) {
                    if (!kotlin.collections.unsigned.a.m4017contentEqualslec5QzE(((ULongArray) objArr).m3927unboximpl(), ((ULongArray) objArr2).m3927unboximpl())) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
            i = i2;
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    @PublishedApi
    public static final <T> String contentDeepToString(@Nullable T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((kotlin.ranges.e.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        b(tArr, sb, new ArrayList());
        return sb.toString();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean d(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        int length2 = 0;
        while (i2 < length) {
            T[] tArr2 = tArr[i2];
            i2++;
            length2 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length2);
        int length3 = tArr.length;
        while (i < length3) {
            T[] tArr3 = tArr[i];
            i++;
            h.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        int length = pairArr.length;
        int i = 0;
        while (i < length) {
            Pair<? extends T, ? extends R> pair = pairArr[i];
            i++;
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
