package kotlin.collections;

import java.util.Map;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class MapsKt extends s {
    private MapsKt() {
    }

    @SinceKotlin(version = "1.1")
    public static /* bridge */ /* synthetic */ <K, V> V getValue(@NotNull Map<K, ? extends V> map, K k) {
        return (V) r.getValue(map, k);
    }
}
