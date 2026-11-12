package io.netty.util.collection;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface ByteObjectMap<V> extends Map<Byte, V> {

    public interface PrimitiveEntry<V> {
        byte key();

        void setValue(V v);

        V value();
    }

    boolean containsKey(byte b2);

    Iterable<PrimitiveEntry<V>> entries();

    V get(byte b2);

    V put(byte b2, V v);

    V remove(byte b2);
}
