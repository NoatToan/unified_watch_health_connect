package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b {
    private final LinkedHashMap<Uri, byte[]> a;

    public class a extends LinkedHashMap<Uri, byte[]> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final b this$0, int initialCapacity, float loadFactor, boolean accessOrder, final int val$maxSize) {
            super(initialCapacity, loadFactor, accessOrder);
            this.a = val$maxSize;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> eldest) {
            return size() > this.a;
        }
    }

    public b(int maxSize) {
        this.a = new a(this, maxSize + 1, 1.0f, false, maxSize);
    }

    public boolean a(Uri uri) {
        return this.a.containsKey(Assertions.checkNotNull(uri));
    }

    @Nullable
    public byte[] b(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.a.get(uri);
    }

    @Nullable
    public byte[] c(Uri uri, byte[] encryptionKey) {
        return this.a.put((Uri) Assertions.checkNotNull(uri), (byte[]) Assertions.checkNotNull(encryptionKey));
    }

    @Nullable
    public byte[] d(Uri uri) {
        return this.a.remove(Assertions.checkNotNull(uri));
    }
}
