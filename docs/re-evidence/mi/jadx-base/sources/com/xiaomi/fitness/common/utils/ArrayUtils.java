package com.xiaomi.fitness.common.utils;

import androidx.collection.ArraySet;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\t¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0014\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\t¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0007J!\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\t¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007J\u001a\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0007H\u0007J\u0016\u0010$\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0007J\u0016\u0010&\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0007J\u0016\u0010'\u001a\u00020(2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020(0\u0014H\u0007J\u0016\u0010)\u001a\u00020(2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020(0\u0014H\u0007J\u0018\u0010*\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ArrayUtils;", "", "<init>", "()V", "TAG", "", "indexOf", "", "dict", "", "key", "([Ljava/lang/Object;Ljava/lang/Object;)I", "filterNonNullSet", "", "T", "src", "([Ljava/lang/Object;)Ljava/util/Set;", "filterNonNullString", "([Ljava/lang/String;)[Ljava/lang/String;", "filterNonNullList", "", "([Ljava/lang/Object;)Ljava/util/List;", "isEmpty", "", "collection", "", "array", "([Ljava/lang/Object;)Z", "toIntArray", "", "data", "toIntegerList", "decodeInt32", "result", "", "offset", "getMaxValueInArray", "srcList", "getMinValueInArray", "getMaxValueInFloatArray", "", "getMinValueInFloatArray", "contains", "valueToFind", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArrayUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayUtils.kt\ncom/xiaomi/fitness/common/utils/ArrayUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,152:1\n37#2:153\n36#2,3:154\n*S KotlinDebug\n*F\n+ 1 ArrayUtils.kt\ncom/xiaomi/fitness/common/utils/ArrayUtils\n*L\n37#1:153\n37#1:154,3\n*E\n"})
public final class ArrayUtils {

    @NotNull
    public static final ArrayUtils INSTANCE = new ArrayUtils();

    @NotNull
    private static final String TAG = "ArrayUtils";

    private ArrayUtils() {
    }

    @JvmStatic
    public static final boolean contains(@NotNull int[] array, int valueToFind) {
        Intrinsics.checkNotNullParameter(array, "array");
        return Arrays.binarySearch(array, valueToFind) != -1;
    }

    @JvmStatic
    public static final int decodeInt32(@Nullable byte[] result, int offset) {
        if (result == null) {
            Logger.e(TAG, "decodeInt32:result is null");
            return 0;
        }
        try {
            return ByteUtilKt.and(result[offset], 255) | (ByteUtilKt.and(result[offset + 1], 255) << 8) | (ByteUtilKt.and(result[offset + 2], 255) << 16) | (ByteUtilKt.and(result[offset + 3], 255) << 24);
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.e(TAG, "ArrayIndexOutOfBoundsException offset = %d, array length =%d, msg = %s", Integer.valueOf(offset + 3), Integer.valueOf(result.length), e.getMessage());
            return 0;
        }
    }

    @JvmStatic
    public static final int getMaxValueInArray(@NotNull List<Integer> srcList) {
        Intrinsics.checkNotNullParameter(srcList, "srcList");
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(srcList, ComparisonsKt__ComparisonsKt.naturalOrder());
        int size = listSortedWith.size();
        if (size != 0) {
            return size != 1 ? ((Number) listSortedWith.get(size - 1)).intValue() : ((Number) listSortedWith.get(0)).intValue();
        }
        return 0;
    }

    @JvmStatic
    public static final float getMaxValueInFloatArray(@NotNull List<Float> srcList) {
        Intrinsics.checkNotNullParameter(srcList, "srcList");
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(srcList, ComparisonsKt__ComparisonsKt.naturalOrder());
        int size = listSortedWith.size();
        if (size != 0) {
            return size != 1 ? ((Number) listSortedWith.get(size - 1)).floatValue() : ((Number) listSortedWith.get(0)).floatValue();
        }
        return 0.0f;
    }

    @JvmStatic
    public static final int getMinValueInArray(@NotNull List<Integer> srcList) {
        Intrinsics.checkNotNullParameter(srcList, "srcList");
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(srcList, ComparisonsKt__ComparisonsKt.naturalOrder());
        if (listSortedWith.size() == 0) {
            return 0;
        }
        return ((Number) listSortedWith.get(0)).intValue();
    }

    @JvmStatic
    public static final float getMinValueInFloatArray(@NotNull List<Float> srcList) {
        Intrinsics.checkNotNullParameter(srcList, "srcList");
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(srcList, ComparisonsKt__ComparisonsKt.naturalOrder());
        if (listSortedWith.size() == 0) {
            return 0.0f;
        }
        return ((Number) listSortedWith.get(0)).floatValue();
    }

    @JvmStatic
    public static final boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @JvmStatic
    @NotNull
    public static final List<Integer> toIntegerList(@Nullable int[] data) {
        ArrayList arrayList = new ArrayList();
        if (data == null) {
            return arrayList;
        }
        for (int i : data) {
            ListExtKt.add(arrayList, Integer.valueOf(i));
        }
        return arrayList;
    }

    @NotNull
    public final <T> List<T> filterNonNullList(@NotNull T[] src) {
        Intrinsics.checkNotNullParameter(src, "src");
        LinkedList linkedList = new LinkedList();
        for (T t : src) {
            if (t != null) {
                linkedList.add(t);
            }
        }
        return linkedList;
    }

    @NotNull
    public final <T> Set<T> filterNonNullSet(@NotNull T[] src) {
        Intrinsics.checkNotNullParameter(src, "src");
        ArraySet arraySet = new ArraySet();
        for (T t : src) {
            if (t != null) {
                arraySet.add(t);
            }
        }
        return arraySet;
    }

    @NotNull
    public final String[] filterNonNullString(@NotNull String[] src) {
        Intrinsics.checkNotNullParameter(src, "src");
        return (String[]) filterNonNullList(src).toArray(new String[0]);
    }

    public final int indexOf(@Nullable Object[] dict, @Nullable Object key) {
        if (dict == null) {
            return -1;
        }
        int length = dict.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual(dict[i], key)) {
                return i;
            }
        }
        return -1;
    }

    @NotNull
    public final int[] toIntArray(@NotNull List<Integer> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int[] iArr = new int[data.size()];
        int size = data.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = data.get(i).intValue();
        }
        return iArr;
    }

    public final <T> boolean isEmpty(@Nullable T[] array) {
        return array == null || array.length == 0;
    }
}
