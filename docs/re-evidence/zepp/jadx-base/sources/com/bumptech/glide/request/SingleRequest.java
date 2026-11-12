package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleRequest<R> implements Request, SizeReadyCallback, ResourceCallback, FactoryPools.Poolable {
    private static final String B = "Glide";
    private boolean a;

    @Nullable
    private final String b;
    private final StateVerifier c;

    @Nullable
    private RequestListener<R> d;
    private RequestCoordinator e;
    private Context f;
    private GlideContext g;

    @Nullable
    private Object h;
    private Class<R> i;
    private RequestOptions j;
    private int k;
    private int l;
    private Priority m;
    private Target<R> n;

    @Nullable
    private List<RequestListener<R>> o;
    private Engine p;
    private TransitionFactory<? super R> q;
    private Resource<R> r;
    private Engine.LoadStatus s;
    private long t;
    private b u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private int y;
    private int z;
    private static final Pools.Pool<SingleRequest<?>> C = FactoryPools.simple(150, new a());
    private static final String A = "Request";
    private static final boolean D = Log.isLoggable(A, 2);

    public class a implements FactoryPools.Factory<SingleRequest<?>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleRequest<?> create() {
            return new SingleRequest<>();
        }
    }

    public enum b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest() {
        this.b = D ? String.valueOf(super.hashCode()) : null;
        this.c = StateVerifier.newInstance();
    }

    private void a() {
        if (this.a) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean b() {
        RequestCoordinator requestCoordinator = this.e;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    private boolean c() {
        RequestCoordinator requestCoordinator = this.e;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    private boolean d() {
        RequestCoordinator requestCoordinator = this.e;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    private void e() {
        a();
        this.c.throwIfRecycled();
        this.n.removeCallback(this);
        Engine.LoadStatus loadStatus = this.s;
        if (loadStatus != null) {
            loadStatus.cancel();
            this.s = null;
        }
    }

    private Drawable f() {
        if (this.v == null) {
            Drawable errorPlaceholder = this.j.getErrorPlaceholder();
            this.v = errorPlaceholder;
            if (errorPlaceholder == null && this.j.getErrorId() > 0) {
                this.v = l(this.j.getErrorId());
            }
        }
        return this.v;
    }

    private Drawable g() {
        if (this.x == null) {
            Drawable fallbackDrawable = this.j.getFallbackDrawable();
            this.x = fallbackDrawable;
            if (fallbackDrawable == null && this.j.getFallbackId() > 0) {
                this.x = l(this.j.getFallbackId());
            }
        }
        return this.x;
    }

    private Drawable h() {
        if (this.w == null) {
            Drawable placeholderDrawable = this.j.getPlaceholderDrawable();
            this.w = placeholderDrawable;
            if (placeholderDrawable == null && this.j.getPlaceholderId() > 0) {
                this.w = l(this.j.getPlaceholderId());
            }
        }
        return this.w;
    }

    private void i(Context context, GlideContext glideContext, Object obj, Class<R> cls, RequestOptions requestOptions, int i, int i2, Priority priority, Target<R> target, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory) {
        this.f = context;
        this.g = glideContext;
        this.h = obj;
        this.i = cls;
        this.j = requestOptions;
        this.k = i;
        this.l = i2;
        this.m = priority;
        this.n = target;
        this.d = requestListener;
        this.o = list;
        this.e = requestCoordinator;
        this.p = engine;
        this.q = transitionFactory;
        this.u = b.PENDING;
    }

    private boolean j() {
        RequestCoordinator requestCoordinator = this.e;
        return requestCoordinator == null || !requestCoordinator.isAnyResourceSet();
    }

    private static boolean k(SingleRequest<?> singleRequest, SingleRequest<?> singleRequest2) {
        List<RequestListener<?>> list = ((SingleRequest) singleRequest).o;
        int size = list == null ? 0 : list.size();
        List<RequestListener<?>> list2 = ((SingleRequest) singleRequest2).o;
        return size == (list2 == null ? 0 : list2.size());
    }

    private Drawable l(@DrawableRes int i) {
        return DrawableDecoderCompat.getDrawable(this.g, i, this.j.getTheme() != null ? this.j.getTheme() : this.f.getTheme());
    }

    private void m(String str) {
        Log.v(A, str + " this: " + this.b);
    }

    private static int n(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    private void o() {
        RequestCoordinator requestCoordinator = this.e;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestFailed(this);
        }
    }

    public static <R> SingleRequest<R> obtain(Context context, GlideContext glideContext, Object obj, Class<R> cls, RequestOptions requestOptions, int i, int i2, Priority priority, Target<R> target, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory) {
        SingleRequest<R> singleRequest = (SingleRequest) C.acquire();
        if (singleRequest == null) {
            singleRequest = new SingleRequest<>();
        }
        singleRequest.i(context, glideContext, obj, cls, requestOptions, i, i2, priority, target, requestListener, list, requestCoordinator, engine, transitionFactory);
        return singleRequest;
    }

    private void p() {
        RequestCoordinator requestCoordinator = this.e;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
    }

    private void q(GlideException glideException, int i) {
        boolean zOnLoadFailed;
        this.c.throwIfRecycled();
        int logLevel = this.g.getLogLevel();
        if (logLevel <= i) {
            Log.w(B, "Load failed for " + this.h + " with size [" + this.y + "x" + this.z + "]", glideException);
            if (logLevel <= 4) {
                glideException.logRootCauses(B);
            }
        }
        this.s = null;
        this.u = b.FAILED;
        boolean z = true;
        this.a = true;
        try {
            List<RequestListener<R>> list = this.o;
            if (list != null) {
                Iterator<RequestListener<R>> it2 = list.iterator();
                zOnLoadFailed = false;
                while (it2.hasNext()) {
                    zOnLoadFailed |= it2.next().onLoadFailed(glideException, this.h, this.n, j());
                }
            } else {
                zOnLoadFailed = false;
            }
            RequestListener<R> requestListener = this.d;
            if (requestListener == null || !requestListener.onLoadFailed(glideException, this.h, this.n, j())) {
                z = false;
            }
            if (!(zOnLoadFailed | z)) {
                t();
            }
            this.a = false;
            o();
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    private void r(Resource<R> resource, R r, DataSource dataSource) {
        boolean zOnResourceReady;
        boolean zJ = j();
        this.u = b.COMPLETE;
        this.r = resource;
        if (this.g.getLogLevel() <= 3) {
            Log.d(B, "Finished loading " + r.getClass().getSimpleName() + " from " + dataSource + " for " + this.h + " with size [" + this.y + "x" + this.z + "] in " + LogTime.getElapsedMillis(this.t) + " ms");
        }
        boolean z = true;
        this.a = true;
        try {
            List<RequestListener<R>> list = this.o;
            if (list != null) {
                Iterator<RequestListener<R>> it2 = list.iterator();
                zOnResourceReady = false;
                while (it2.hasNext()) {
                    zOnResourceReady |= it2.next().onResourceReady(r, this.h, this.n, dataSource, zJ);
                }
            } else {
                zOnResourceReady = false;
            }
            RequestListener<R> requestListener = this.d;
            if (requestListener == null || !requestListener.onResourceReady(r, this.h, this.n, dataSource, zJ)) {
                z = false;
            }
            if (!(z | zOnResourceReady)) {
                this.n.onResourceReady(r, this.q.build(dataSource, zJ));
            }
            this.a = false;
            p();
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    private void s(Resource<?> resource) {
        this.p.release(resource);
        this.r = null;
    }

    private void t() {
        if (c()) {
            Drawable drawableG = this.h == null ? g() : null;
            if (drawableG == null) {
                drawableG = f();
            }
            if (drawableG == null) {
                drawableG = h();
            }
            this.n.onLoadFailed(drawableG);
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        a();
        this.c.throwIfRecycled();
        this.t = LogTime.getLogTime();
        if (this.h == null) {
            if (Util.isValidDimensions(this.k, this.l)) {
                this.y = this.k;
                this.z = this.l;
            }
            q(new GlideException("Received null model"), g() == null ? 5 : 3);
            return;
        }
        b bVar = this.u;
        b bVar2 = b.RUNNING;
        if (bVar == bVar2) {
            throw new IllegalArgumentException("Cannot restart a running request");
        }
        if (bVar == b.COMPLETE) {
            onResourceReady(this.r, DataSource.MEMORY_CACHE);
            return;
        }
        b bVar3 = b.WAITING_FOR_SIZE;
        this.u = bVar3;
        if (Util.isValidDimensions(this.k, this.l)) {
            onSizeReady(this.k, this.l);
        } else {
            this.n.getSize(this);
        }
        b bVar4 = this.u;
        if ((bVar4 == bVar2 || bVar4 == bVar3) && c()) {
            this.n.onLoadStarted(h());
        }
        if (D) {
            m("finished run method in " + LogTime.getElapsedMillis(this.t));
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        Util.assertMainThread();
        a();
        this.c.throwIfRecycled();
        b bVar = this.u;
        b bVar2 = b.CLEARED;
        if (bVar == bVar2) {
            return;
        }
        e();
        Resource<R> resource = this.r;
        if (resource != null) {
            s(resource);
        }
        if (b()) {
            this.n.onLoadCleared(h());
        }
        this.u = bVar2;
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public StateVerifier getVerifier() {
        return this.c;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        return this.u == b.CLEARED;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        return this.u == b.COMPLETE;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        SingleRequest singleRequest = (SingleRequest) request;
        return this.k == singleRequest.k && this.l == singleRequest.l && Util.bothModelsNullEquivalentOrEquals(this.h, singleRequest.h) && this.i.equals(singleRequest.i) && this.j.equals(singleRequest.j) && this.m == singleRequest.m && k(this, singleRequest);
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isFailed() {
        return this.u == b.FAILED;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isResourceSet() {
        return isComplete();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        b bVar = this.u;
        return bVar == b.RUNNING || bVar == b.WAITING_FOR_SIZE;
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(GlideException glideException) {
        q(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.ResourceCallback
    public void onResourceReady(Resource<?> resource, DataSource dataSource) {
        this.c.throwIfRecycled();
        this.s = null;
        if (resource == null) {
            onLoadFailed(new GlideException("Expected to receive a Resource<R> with an object of " + this.i + " inside, but instead got null."));
            return;
        }
        Object obj = resource.get();
        if (obj != null && this.i.isAssignableFrom(obj.getClass())) {
            if (d()) {
                r(resource, obj, dataSource);
                return;
            } else {
                s(resource);
                this.u = b.COMPLETE;
                return;
            }
        }
        s(resource);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.i);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(resource);
        sb.append("}.");
        sb.append(obj == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "");
        onLoadFailed(new GlideException(sb.toString()));
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        this.c.throwIfRecycled();
        boolean z = D;
        if (z) {
            m("Got onSizeReady in " + LogTime.getElapsedMillis(this.t));
        }
        if (this.u != b.WAITING_FOR_SIZE) {
            return;
        }
        b bVar = b.RUNNING;
        this.u = bVar;
        float sizeMultiplier = this.j.getSizeMultiplier();
        this.y = n(i, sizeMultiplier);
        this.z = n(i2, sizeMultiplier);
        if (z) {
            m("finished setup for calling load in " + LogTime.getElapsedMillis(this.t));
        }
        this.s = this.p.load(this.g, this.h, this.j.getSignature(), this.y, this.z, this.j.getResourceClass(), this.i, this.m, this.j.getDiskCacheStrategy(), this.j.getTransformations(), this.j.isTransformationRequired(), this.j.a(), this.j.getOptions(), this.j.isMemoryCacheable(), this.j.getUseUnlimitedSourceGeneratorsPool(), this.j.getUseAnimationPool(), this.j.getOnlyRetrieveFromCache(), this);
        if (this.u != bVar) {
            this.s = null;
        }
        if (z) {
            m("finished onSizeReady in " + LogTime.getElapsedMillis(this.t));
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void recycle() {
        a();
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = -1;
        this.l = -1;
        this.n = null;
        this.o = null;
        this.d = null;
        this.e = null;
        this.q = null;
        this.s = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = -1;
        this.z = -1;
        C.release(this);
    }
}
