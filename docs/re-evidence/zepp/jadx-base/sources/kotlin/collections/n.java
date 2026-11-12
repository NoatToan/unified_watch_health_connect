package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
interface n<K, V> extends Map<K, V>, KMappedMarker {
    V b(K k);

    @NotNull
    Map<K, V> getMap();
}
