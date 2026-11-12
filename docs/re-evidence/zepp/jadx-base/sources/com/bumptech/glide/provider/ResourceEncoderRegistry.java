package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceEncoderRegistry {
    private final List<a<?>> a = new ArrayList();

    public static final class a<T> {
        private final Class<T> a;
        public final ResourceEncoder<T> b;

        public a(@NonNull Class<T> cls, @NonNull ResourceEncoder<T> resourceEncoder) {
            this.a = cls;
            this.b = resourceEncoder;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void append(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.a.add(new a<>(cls, resourceEncoder));
    }

    @Nullable
    public synchronized <Z> ResourceEncoder<Z> get(@NonNull Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a(cls)) {
                return (ResourceEncoder<Z>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.a.add(0, new a<>(cls, resourceEncoder));
    }
}
