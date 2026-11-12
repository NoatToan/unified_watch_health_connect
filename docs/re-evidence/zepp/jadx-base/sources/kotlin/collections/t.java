package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
interface t<K, V> extends Map<K, V>, n<K, V>, KMutableMap {
    @Override // kotlin.collections.n
    @NotNull
    Map<K, V> getMap();
}
