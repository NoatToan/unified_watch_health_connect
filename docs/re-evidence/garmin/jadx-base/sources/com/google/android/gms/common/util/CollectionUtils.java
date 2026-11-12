package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1.a;
import p1.b;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        Map mapZzb = zzb(6, false);
        mapZzb.put(k14, v14);
        mapZzb.put(k15, v15);
        mapZzb.put(k16, v16);
        mapZzb.put(k17, v17);
        mapZzb.put(k18, v18);
        mapZzb.put(k19, v19);
        return Collections.unmodifiableMap(mapZzb);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb3.append("Key and values array lengths not equal: ");
            sb3.append(length);
            sb3.append(" != ");
            sb3.append(length2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZzb = zzb(length, false);
        for (int i14 = 0; i14 < kArr.length; i14++) {
            mapZzb.put(kArr[i14], vArr[i14]);
        }
        return Collections.unmodifiableMap(mapZzb);
    }

    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i14) {
        return i14 == 0 ? new b() : zza(i14, true);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t7 = tArr[0];
            T t14 = tArr[1];
            Set setZza = zza(2, false);
            setZza.add(t7);
            setZza.add(t14);
            return Collections.unmodifiableSet(setZza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZza2 = zza(length, false);
            Collections.addAll(setZza2, tArr);
            return Collections.unmodifiableSet(setZza2);
        }
        T t15 = tArr[0];
        T t16 = tArr[1];
        T t17 = tArr[2];
        T t18 = tArr[3];
        Set setZza3 = zza(4, false);
        setZza3.add(t15);
        setZza3.add(t16);
        setZza3.add(t17);
        setZza3.add(t18);
        return Collections.unmodifiableSet(setZza3);
    }

    private static Set zza(int i14, boolean z14) {
        if (i14 <= (true != z14 ? 256 : 128)) {
            return new b(i14);
        }
        return new HashSet(i14, true != z14 ? 1.0f : 0.75f);
    }

    private static Map zzb(int i14, boolean z14) {
        return i14 <= 256 ? new a(i14) : new HashMap(i14, 1.0f);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T t7) {
        return Collections.singletonList(t7);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k14, V v14, K k15, V v15, K k16, V v16) {
        Map mapZzb = zzb(3, false);
        mapZzb.put(k14, v14);
        mapZzb.put(k15, v15);
        mapZzb.put(k16, v16);
        return Collections.unmodifiableMap(mapZzb);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T t7, T t14, T t15) {
        Set setZza = zza(3, false);
        setZza.add(t7);
        setZza.add(t14);
        setZza.add(t15);
        return Collections.unmodifiableSet(setZza);
    }
}
