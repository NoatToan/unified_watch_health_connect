package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: zad, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005\u001aI\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032#\u0010\u0007\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001aQ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\f\u001a\u00020\r2#\u0010\u0007\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0001\u001a(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\t\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\f\u001a\u00020\rH\u0001\u001a4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\tH\u0001\u001aC\u0010\u0011\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00122\u0006\u0010\u0013\u001a\u0002H\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0015H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a:\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0018\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0019\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\u001a@\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u001b\u001aY\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0018\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0019\"\u0004\b\u0001\u0010\u00032*\u0010\u001d\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u001e\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005¢\u0006\u0002\u0010\u001f\u001aa\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u001b2*\u0010\u001d\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u001e\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u0007¢\u0006\u0002\u0010 \u001a\u0019\u0010!\u001a\u00020\"*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\u0001H\u0087\b\u001a1\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0081\b\u001a2\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0000\u001a\u0010\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\rH\u0001\"\u000e\u0010(\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"mapOf", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "pair", "Lkotlin/Pair;", "buildMapInternal", "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "createMapBuilder", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "builder", "getOrPut", "Ljava/util/concurrent/ConcurrentMap;", MedalConstants.EVENT_KEY, "defaultValue", "Lkotlin/Function0;", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toSortedMap", "Ljava/util/SortedMap;", "", "comparator", "Ljava/util/Comparator;", "sortedMapOf", "pairs", "", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "(Ljava/util/Comparator;[Lkotlin/Pair;)Ljava/util/SortedMap;", "toProperties", "Ljava/util/Properties;", "", "toSingletonMapOrSelf", "toSingletonMap", "mapCapacity", "expectedSize", "INT_MAX_POWER_OF_TWO", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class mapOf extends getOrImplicitDefault {
    public static final int e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> a(yyu<? extends K, ? extends V> yyuVar) {
        zcp.c(yyuVar, "");
        Map<K, V> mapSingletonMap = Collections.singletonMap(yyuVar.c(), yyuVar.d());
        zcp.b((Object) mapSingletonMap, "");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> c() {
        return new zam();
    }

    public static final <K, V> Map<K, V> a(int i) {
        return new zam(i);
    }

    public static final <K, V> Map<K, V> c(Map<K, V> map) {
        zcp.c(map, "");
        return ((zam) map).b();
    }

    public static final <K, V> Map<K, V> e(Map<? extends K, ? extends V> map) {
        zcp.c(map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        zcp.b((Object) mapSingletonMap, "");
        return mapSingletonMap;
    }
}
