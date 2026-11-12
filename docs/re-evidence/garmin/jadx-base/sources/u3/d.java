package u3;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface d<K, V> extends Map, f23.a {

    public interface a<K, V> extends Map<K, V>, f23.d {
        d<K, V> build();
    }

    a<K, V> builder();
}
