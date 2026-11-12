package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.alipay.sdk.m.u.i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class RequestManager implements LifecycleListener, com.bumptech.glide.c<RequestBuilder<Drawable>> {
    private static final RequestOptions i = RequestOptions.decodeTypeOf(Bitmap.class).lock();
    private static final RequestOptions j = RequestOptions.decodeTypeOf(GifDrawable.class).lock();
    private static final RequestOptions k = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
    public final Lifecycle a;
    private final RequestTracker b;
    private final RequestManagerTreeNode c;
    public final Context context;
    private final TargetTracker d;
    private final Runnable e;
    private final Handler f;
    private final ConnectivityMonitor g;
    public final Glide glide;
    private RequestOptions h;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestManager requestManager = RequestManager.this;
            requestManager.a.addListener(requestManager);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Target a;

        public b(Target target) {
            this.a = target;
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestManager.this.clear(this.a);
        }
    }

    public static class c extends ViewTarget<View, Object> {
        public c(@NonNull View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@NonNull Object obj, @Nullable Transition<? super Object> transition) {
        }
    }

    public static class d implements ConnectivityMonitor.ConnectivityListener {
        private final RequestTracker a;

        public d(@NonNull RequestTracker requestTracker) {
            this.a = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean z) {
            if (z) {
                this.a.restartRequests();
            }
        }
    }

    public RequestManager(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        this(glide, lifecycle, requestManagerTreeNode, new RequestTracker(), glide.c(), context);
    }

    private void e(@NonNull Target<?> target) {
        if (d(target) || this.glide.i(target) || target.getRequest() == null) {
            return;
        }
        Request request = target.getRequest();
        target.setRequest(null);
        request.clear();
    }

    private void f(@NonNull RequestOptions requestOptions) {
        this.h = this.h.apply(requestOptions);
    }

    public RequestOptions a() {
        return this.h;
    }

    @NonNull
    public RequestManager applyDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        f(requestOptions);
        return this;
    }

    @NonNull
    @CheckResult
    public <ResourceType> RequestBuilder<ResourceType> as(@NonNull Class<ResourceType> cls) {
        return new RequestBuilder<>(this.glide, this, cls, this.context);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<Bitmap> asBitmap() {
        return as(Bitmap.class).apply(i);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> asFile() {
        return as(File.class).apply(RequestOptions.skipMemoryCacheOf(true));
    }

    @NonNull
    @CheckResult
    public RequestBuilder<GifDrawable> asGif() {
        return as(GifDrawable.class).apply(j);
    }

    @NonNull
    public <T> TransitionOptions<?, T> b(Class<T> cls) {
        return this.glide.d().getDefaultTransitionOptions(cls);
    }

    public void c(@NonNull Target<?> target, @NonNull Request request) {
        this.d.track(target);
        this.b.runRequest(request);
    }

    public void clear(@NonNull View view) {
        clear(new c(view));
    }

    public boolean d(@NonNull Target<?> target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.b.clearRemoveAndRecycle(request)) {
            return false;
        }
        this.d.untrack(target);
        target.setRequest(null);
        return true;
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> download(@Nullable Object obj) {
        return downloadOnly().load(obj);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> downloadOnly() {
        return as(File.class).apply(k);
    }

    public boolean isPaused() {
        Util.assertMainThread();
        return this.b.isPaused();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
        this.d.onDestroy();
        Iterator<Target<?>> it2 = this.d.getAll().iterator();
        while (it2.hasNext()) {
            clear(it2.next());
        }
        this.d.clear();
        this.b.clearRequests();
        this.a.removeListener(this);
        this.a.removeListener(this.g);
        this.f.removeCallbacks(this.e);
        this.glide.k(this);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        resumeRequests();
        this.d.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        pauseRequests();
        this.d.onStop();
    }

    public void pauseAllRequests() {
        Util.assertMainThread();
        this.b.pauseAllRequests();
    }

    public void pauseRequests() {
        Util.assertMainThread();
        this.b.pauseRequests();
    }

    public void pauseRequestsRecursive() {
        Util.assertMainThread();
        pauseRequests();
        Iterator<RequestManager> it2 = this.c.getDescendants().iterator();
        while (it2.hasNext()) {
            it2.next().pauseRequests();
        }
    }

    public void resumeRequests() {
        Util.assertMainThread();
        this.b.resumeRequests();
    }

    public void resumeRequestsRecursive() {
        Util.assertMainThread();
        resumeRequests();
        Iterator<RequestManager> it2 = this.c.getDescendants().iterator();
        while (it2.hasNext()) {
            it2.next().resumeRequests();
        }
    }

    @NonNull
    public RequestManager setDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        setRequestOptions(requestOptions);
        return this;
    }

    public void setRequestOptions(@NonNull RequestOptions requestOptions) {
        this.h = requestOptions.mo3297clone().autoClone();
    }

    public String toString() {
        return super.toString() + "{tracker=" + this.b + ", treeNode=" + this.c + i.d;
    }

    public void clear(@Nullable Target<?> target) {
        if (target == null) {
            return;
        }
        if (Util.isOnMainThread()) {
            e(target);
        } else {
            this.f.post(new b(target));
        }
    }

    public RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, RequestTracker requestTracker, ConnectivityMonitorFactory connectivityMonitorFactory, Context context) {
        this.d = new TargetTracker();
        a aVar = new a();
        this.e = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f = handler;
        this.glide = glide;
        this.a = lifecycle;
        this.c = requestManagerTreeNode;
        this.b = requestTracker;
        this.context = context;
        ConnectivityMonitor connectivityMonitorBuild = connectivityMonitorFactory.build(context.getApplicationContext(), new d(requestTracker));
        this.g = connectivityMonitorBuild;
        if (Util.isOnBackgroundThread()) {
            handler.post(aVar);
        } else {
            lifecycle.addListener(this);
        }
        lifecycle.addListener(connectivityMonitorBuild);
        setRequestOptions(glide.d().getDefaultRequestOptions());
        glide.h(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable Drawable drawable) {
        return asDrawable().load(drawable);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable String str) {
        return asDrawable().load(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable Uri uri) {
        return asDrawable().load(uri);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable File file) {
        return asDrawable().load(file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable @DrawableRes @RawRes Integer num) {
        return asDrawable().load(num);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @CheckResult
    @Deprecated
    public RequestBuilder<Drawable> load(@Nullable URL url) {
        return asDrawable().load(url);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable byte[] bArr) {
        return asDrawable().load(bArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.c
    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> load(@Nullable Object obj) {
        return asDrawable().load(obj);
    }
}
