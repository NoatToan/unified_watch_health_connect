package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GlideContext extends ContextWrapper {

    @VisibleForTesting
    public static final TransitionOptions<?, ?> i = new GenericTransitionOptions();
    private final Handler a;
    private final ArrayPool b;
    private final Registry c;
    private final ImageViewTargetFactory d;
    private final RequestOptions e;
    private final Map<Class<?>, TransitionOptions<?, ?>> f;
    private final Engine g;
    private final int h;

    public GlideContext(@NonNull Context context, @NonNull ArrayPool arrayPool, @NonNull Registry registry, @NonNull ImageViewTargetFactory imageViewTargetFactory, @NonNull RequestOptions requestOptions, @NonNull Map<Class<?>, TransitionOptions<?, ?>> map, @NonNull Engine engine, int i2) {
        super(context.getApplicationContext());
        this.b = arrayPool;
        this.c = registry;
        this.d = imageViewTargetFactory;
        this.e = requestOptions;
        this.f = map;
        this.g = engine;
        this.h = i2;
        this.a = new Handler(Looper.getMainLooper());
    }

    @NonNull
    public <X> ViewTarget<ImageView, X> buildImageViewTarget(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.d.buildTarget(imageView, cls);
    }

    @NonNull
    public ArrayPool getArrayPool() {
        return this.b;
    }

    public RequestOptions getDefaultRequestOptions() {
        return this.e;
    }

    @NonNull
    public <T> TransitionOptions<?, T> getDefaultTransitionOptions(@NonNull Class<T> cls) {
        TransitionOptions<?, T> transitionOptions = (TransitionOptions) this.f.get(cls);
        if (transitionOptions == null) {
            for (Map.Entry<Class<?>, TransitionOptions<?, ?>> entry : this.f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        return transitionOptions == null ? (TransitionOptions<?, T>) i : transitionOptions;
    }

    @NonNull
    public Engine getEngine() {
        return this.g;
    }

    public int getLogLevel() {
        return this.h;
    }

    @NonNull
    public Handler getMainHandler() {
        return this.a;
    }

    @NonNull
    public Registry getRegistry() {
        return this.c;
    }
}
