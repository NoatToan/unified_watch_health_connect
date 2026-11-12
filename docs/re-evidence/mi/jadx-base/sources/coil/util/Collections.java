package coil.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: coil.util.-Collections, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0005H\u0080\b¢\u0006\u0002\u0010\u0006\u001aF\u0010\u0007\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\b\u001a\u0002H\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\nH\u0080\b¢\u0006\u0002\u0010\u000b\u001a3\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\r0\nH\u0080\b\u001a-\u0010\u0010\u001a\u00020\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\r0\u0005H\u0080\b\u001a]\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010\u0002*\u00020\u0015*\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u00122 \u0010\u0004\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0005H\u0080\b\u001a-\u0010\u0017\u001a\u00020\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u001a0\u0005H\u0080\b\u001a\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0000\u001a0\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0012\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0014*\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0012H\u0000¨\u0006\u001d"}, d2 = {"firstNotNullOfOrNullIndices", "T", "R", "", "transform", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "foldIndices", "initial", "operation", "Lkotlin/Function2;", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "forEachIndexedIndices", "", "action", "", "forEachIndices", "mapNotNullValues", "", "K", "V", "", "", "removeIfIndices", "", "predicate", "", "toImmutableList", "toImmutableMap", "coil-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "-Collections")
public final class Collections {
    @Nullable
    public static final <R, T> T firstNotNullOfOrNullIndices(@NotNull List<? extends R> list, @NotNull Function1<? super R, ? extends T> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T tInvoke2 = function1.invoke2(list.get(i));
            if (tInvoke2 != null) {
                return tInvoke2;
            }
        }
        return null;
    }

    public static final <T, R> R foldIndices(@NotNull List<? extends T> list, R r2, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r2 = function2.invoke(r2, list.get(i));
        }
        return r2;
    }

    public static final <T> void forEachIndexedIndices(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T> void forEachIndices(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke2(list.get(i));
        }
    }

    @NotNull
    public static final <K, V, R> Map<K, R> mapNotNullValues(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            R rInvoke2 = function1.invoke2(entry);
            if (rInvoke2 != null) {
                linkedHashMap.put(entry.getKey(), rInvoke2);
            }
        }
        return linkedHashMap;
    }

    public static final <T> void removeIfIndices(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 - i;
            if (function1.invoke2(list.get(i3)).booleanValue()) {
                list.remove(i3);
                i++;
            }
        }
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? java.util.Collections.unmodifiableList(new ArrayList(list)) : java.util.Collections.singletonList(CollectionsKt___CollectionsKt.first((List) list));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt__MapsKt.emptyMap();
        }
        if (size != 1) {
            return java.util.Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.first(map.entrySet());
        return java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
