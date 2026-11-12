package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
interface MapWithDefault<K, V> extends Map<K, V>, KMappedMarker {
    @NotNull
    Map<K, V> getMap();

    V getOrImplicitDefault(K k2);
}
