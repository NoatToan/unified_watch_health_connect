package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.emptyMap());
    private int a;
    private final Map<String, byte[]> b;

    public DefaultContentMetadata() {
        this(Collections.emptyMap());
    }

    private static void a(HashMap<String, byte[]> metadata, Map<String, Object> values) {
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            metadata.put(entry.getKey(), c(entry.getValue()));
        }
    }

    private static Map<String, byte[]> b(Map<String, byte[]> otherMetadata, ContentMetadataMutations mutations) {
        HashMap map = new HashMap(otherMetadata);
        e(map, mutations.getRemovedValues());
        a(map, mutations.getEditedValues());
        return map;
    }

    private static byte[] c(Object value) {
        if (value instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
        }
        if (value instanceof String) {
            return ((String) value).getBytes(Charsets.UTF_8);
        }
        if (value instanceof byte[]) {
            return (byte[]) value;
        }
        throw new IllegalArgumentException();
    }

    private static boolean d(Map<String, byte[]> first, Map<String, byte[]> second) {
        if (first.size() != second.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : first.entrySet()) {
            if (!Arrays.equals(entry.getValue(), second.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void e(HashMap<String, byte[]> metadata, List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            metadata.remove(names.get(i));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(String key) {
        return this.b.containsKey(key);
    }

    public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations mutations) {
        Map<String, byte[]> mapB = b(this.b, mutations);
        return d(this.b, mapB) ? this : new DefaultContentMetadata(mapB);
    }

    public Set<Map.Entry<String, byte[]>> entrySet() {
        return this.b.entrySet();
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || DefaultContentMetadata.class != o.getClass()) {
            return false;
        }
        return d(this.b, ((DefaultContentMetadata) o).b);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @Nullable
    public final byte[] get(String key, @Nullable byte[] defaultValue) {
        byte[] bArr = this.b.get(key);
        return bArr != null ? Arrays.copyOf(bArr, bArr.length) : defaultValue;
    }

    public int hashCode() {
        if (this.a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.a = iHashCode;
        }
        return this.a;
    }

    public DefaultContentMetadata(Map<String, byte[]> metadata) {
        this.b = Collections.unmodifiableMap(metadata);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @Nullable
    public final String get(String key, @Nullable String defaultValue) {
        byte[] bArr = this.b.get(key);
        return bArr != null ? new String(bArr, Charsets.UTF_8) : defaultValue;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final long get(String key, long defaultValue) {
        byte[] bArr = this.b.get(key);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : defaultValue;
    }
}
