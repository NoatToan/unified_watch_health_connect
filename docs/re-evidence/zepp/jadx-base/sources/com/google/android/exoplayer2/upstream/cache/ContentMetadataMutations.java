package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ContentMetadataMutations {
    private final Map<String, Object> a = new HashMap();
    private final List<String> b = new ArrayList();

    private ContentMetadataMutations a(String name, Object value) {
        this.a.put((String) Assertions.checkNotNull(name), Assertions.checkNotNull(value));
        this.b.remove(name);
        return this;
    }

    public static ContentMetadataMutations setContentLength(ContentMetadataMutations mutations, long length) {
        return mutations.set(ContentMetadata.KEY_CONTENT_LENGTH, length);
    }

    public static ContentMetadataMutations setRedirectedUri(ContentMetadataMutations mutations, @Nullable Uri uri) {
        return uri == null ? mutations.remove(ContentMetadata.KEY_REDIRECTED_URI) : mutations.set(ContentMetadata.KEY_REDIRECTED_URI, uri.toString());
    }

    public Map<String, Object> getEditedValues() {
        HashMap map = new HashMap(this.a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> getRemovedValues() {
        return Collections.unmodifiableList(new ArrayList(this.b));
    }

    public ContentMetadataMutations remove(String name) {
        this.b.add(name);
        this.a.remove(name);
        return this;
    }

    public ContentMetadataMutations set(String name, String value) {
        return a(name, value);
    }

    public ContentMetadataMutations set(String name, long value) {
        return a(name, Long.valueOf(value));
    }

    public ContentMetadataMutations set(String name, byte[] value) {
        return a(name, Arrays.copyOf(value, value.length));
    }
}
