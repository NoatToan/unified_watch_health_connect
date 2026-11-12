package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class EncoderRegistry {
    private final List<a<?>> a = new ArrayList();

    public static final class a<T> {
        private final Class<T> a;
        public final Encoder<T> b;

        public a(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
            this.a = cls;
            this.b = encoder;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void append(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.a.add(new a<>(cls, encoder));
    }

    @Nullable
    public synchronized <T> Encoder<T> getEncoder(@NonNull Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a(cls)) {
                return (Encoder<T>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.a.add(0, new a<>(cls, encoder));
    }
}
