package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: yzm, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a0\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0006j\b\u0012\u0004\u0012\u0002H\u0002`\u0007\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\bH\u0081\b¢\u0006\u0002\u0010\t\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0081\bø\u0001\u0000\u001a?\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0081\bø\u0001\u0000\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\"\u0004\b\u0000\u0010\u000bH\u0001\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0001\u001a\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0017H\u0087\b\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0019H\u0007\u001a&\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0081\b¢\u0006\u0002\u0010 \u001a4\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0081\b¢\u0006\u0002\u0010\"\u001a/\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010$\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0000¢\u0006\u0002\u0010%\u001a1\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\b\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\b2\u0006\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\u0010)\u001a\u0011\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0081\b\u001a\u0011\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0081\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"listOf", "", ExifInterface.GPS_DIRECTION_TRUE, FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)Ljava/util/List;", "asArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildListInternal", ExifInterface.LONGITUDE_EAST, "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "createListBuilder", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "builder", "toList", "Ljava/util/Enumeration;", "shuffled", "", "random", "Ljava/util/Random;", "collectionToArray", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "terminateCollectionToArray", "collectionSize", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "checkIndexOverflow", "index", "checkCountOverflow", "count", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class listOf {
    public static final <T> List<T> e(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        zcp.b((Object) listSingletonList, "");
        return listSingletonList;
    }

    public static final <E> List<E> c() {
        return new zak(0, 1, null);
    }

    public static final <E> List<E> d(int i) {
        return new zak(i);
    }

    public static final <E> List<E> c(List<E> list) {
        zcp.c(list, "");
        return ((zak) list).c();
    }

    public static final <T> T[] d(int i, T[] tArr) {
        zcp.c(tArr, "");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    public static final <T> Object[] a(T[] tArr, boolean z) {
        zcp.c(tArr, "");
        if (z && zcp.b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        zcp.b((Object) objArrCopyOf, "");
        return objArrCopyOf;
    }
}
