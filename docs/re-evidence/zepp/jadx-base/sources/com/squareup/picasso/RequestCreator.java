package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
public class RequestCreator {
    private static final AtomicInteger m = new AtomicInteger();
    private final Picasso a;
    private final Request.Builder b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private Drawable k;
    private Object l;

    public RequestCreator(Picasso picasso, Uri uri, int i) {
        this.e = true;
        if (picasso.o) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.a = picasso;
        this.b = new Request.Builder(uri, i, picasso.l);
    }

    private Request a(long j) {
        int andIncrement = m.getAndIncrement();
        Request requestBuild = this.b.build();
        requestBuild.a = andIncrement;
        requestBuild.b = j;
        boolean z = this.a.n;
        if (z) {
            u.w(u.m, u.p, requestBuild.f(), requestBuild.toString());
        }
        Request requestK = this.a.k(requestBuild);
        if (requestK != requestBuild) {
            requestK.a = andIncrement;
            requestK.b = j;
            if (z) {
                u.w(u.m, u.q, requestK.c(), "into " + requestK);
            }
        }
        return requestK;
    }

    private Drawable b() {
        return this.f != 0 ? this.a.e.getResources().getDrawable(this.f) : this.j;
    }

    private void c(q qVar) {
        Bitmap bitmapH;
        if (MemoryPolicy.a(this.h) && (bitmapH = this.a.h(qVar.d())) != null) {
            qVar.b(bitmapH, Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i = this.f;
        if (i != 0) {
            qVar.o(i);
        }
        this.a.f(qVar);
    }

    public RequestCreator centerCrop() {
        this.b.centerCrop();
        return this;
    }

    public RequestCreator centerInside() {
        this.b.centerInside();
        return this;
    }

    public RequestCreator config(Bitmap.Config config) {
        this.b.config(config);
        return this;
    }

    public RequestCreator d() {
        this.d = false;
        return this;
    }

    public RequestCreator error(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.g = i;
        return this;
    }

    public void fetch() {
        fetch(null);
    }

    public RequestCreator fit() {
        this.d = true;
        return this;
    }

    public Bitmap get() throws IOException {
        long jNanoTime = System.nanoTime();
        u.d();
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.b.a()) {
            return null;
        }
        Request requestA = a(jNanoTime);
        j jVar = new j(this.a, requestA, this.h, this.i, this.l, u.j(requestA, new StringBuilder()));
        Picasso picasso = this.a;
        return c.g(picasso, picasso.f, picasso.g, picasso.h, jVar).r();
    }

    public void into(Target target) {
        Bitmap bitmapH;
        long jNanoTime = System.nanoTime();
        u.c();
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.b.a()) {
            this.a.cancelRequest(target);
            target.onPrepareLoad(this.e ? b() : null);
            return;
        }
        Request requestA = a(jNanoTime);
        String strI = u.i(requestA);
        if (!MemoryPolicy.a(this.h) || (bitmapH = this.a.h(strI)) == null) {
            target.onPrepareLoad(this.e ? b() : null);
            this.a.f(new t(this.a, target, requestA, this.h, this.i, this.k, strI, this.l, this.g));
        } else {
            this.a.cancelRequest(target);
            target.onBitmapLoaded(bitmapH, Picasso.LoadedFrom.MEMORY);
        }
    }

    public RequestCreator memoryPolicy(MemoryPolicy memoryPolicy, MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        this.h = memoryPolicy.index | this.h;
        if (memoryPolicyArr == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (memoryPolicyArr.length > 0) {
            for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                this.h = memoryPolicy2.index | this.h;
            }
        }
        return this;
    }

    public RequestCreator networkPolicy(NetworkPolicy networkPolicy, NetworkPolicy... networkPolicyArr) {
        if (networkPolicy == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.i = networkPolicy.index | this.i;
        if (networkPolicyArr == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        if (networkPolicyArr.length > 0) {
            for (NetworkPolicy networkPolicy2 : networkPolicyArr) {
                if (networkPolicy2 == null) {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                this.i = networkPolicy2.index | this.i;
            }
        }
        return this;
    }

    public RequestCreator noFade() {
        this.c = true;
        return this;
    }

    public RequestCreator noPlaceholder() {
        if (this.f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.e = false;
        return this;
    }

    public RequestCreator onlyScaleDown() {
        this.b.onlyScaleDown();
        return this;
    }

    public RequestCreator placeholder(int i) {
        if (!this.e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f = i;
        return this;
    }

    public RequestCreator priority(Picasso.Priority priority) {
        this.b.priority(priority);
        return this;
    }

    public RequestCreator resize(int i, int i2) {
        this.b.resize(i, i2);
        return this;
    }

    public RequestCreator resizeDimen(int i, int i2) {
        Resources resources = this.a.e.getResources();
        return resize(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2));
    }

    public RequestCreator rotate(float f) {
        this.b.rotate(f);
        return this;
    }

    @Deprecated
    public RequestCreator skipMemoryCache() {
        return memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE);
    }

    public RequestCreator stableKey(String str) {
        this.b.stableKey(str);
        return this;
    }

    public RequestCreator tag(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (this.l != null) {
            throw new IllegalStateException("Tag already set.");
        }
        this.l = obj;
        return this;
    }

    public RequestCreator transform(Transformation transformation) {
        this.b.transform(transformation);
        return this;
    }

    public void fetch(Callback callback) {
        long jNanoTime = System.nanoTime();
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.b.a()) {
            if (!this.b.b()) {
                this.b.priority(Picasso.Priority.LOW);
            }
            Request requestA = a(jNanoTime);
            String strJ = u.j(requestA, new StringBuilder());
            if (this.a.h(strJ) == null) {
                this.a.j(new h(this.a, requestA, this.h, this.i, this.l, strJ, callback));
                return;
            }
            if (this.a.n) {
                u.w(u.m, u.D, requestA.f(), "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (callback != null) {
                callback.onSuccess();
            }
        }
    }

    public RequestCreator rotate(float f, float f2, float f3) {
        this.b.rotate(f, f2, f3);
        return this;
    }

    public RequestCreator transform(List<? extends Transformation> list) {
        this.b.transform(list);
        return this;
    }

    public RequestCreator error(Drawable drawable) {
        if (drawable != null) {
            if (this.g == 0) {
                this.k = drawable;
                return this;
            }
            throw new IllegalStateException("Error image already set.");
        }
        throw new IllegalArgumentException("Error image may not be null.");
    }

    public RequestCreator() {
        this.e = true;
        this.a = null;
        this.b = new Request.Builder(null, 0, null);
    }

    public RequestCreator placeholder(Drawable drawable) {
        if (this.e) {
            if (this.f == 0) {
                this.j = drawable;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    public void into(RemoteViews remoteViews, int i, int i2, Notification notification) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification != null) {
            if (!this.d) {
                if (this.j == null && this.f == 0 && this.k == null) {
                    Request requestA = a(jNanoTime);
                    c(new q.b(this.a, requestA, remoteViews, i, i2, notification, this.h, this.i, u.j(requestA, new StringBuilder()), this.l, this.g));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        throw new IllegalArgumentException("Notification must not be null.");
    }

    public void into(RemoteViews remoteViews, int i, int[] iArr) {
        long jNanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr != null) {
            if (!this.d) {
                if (this.j == null && this.f == 0 && this.k == null) {
                    Request requestA = a(jNanoTime);
                    c(new q.a(this.a, requestA, remoteViews, i, iArr, this.h, this.i, u.j(requestA, new StringBuilder()), this.l, this.g));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        throw new IllegalArgumentException("appWidgetIds must not be null.");
    }

    public void into(ImageView imageView) {
        into(imageView, null);
    }

    public void into(ImageView imageView, Callback callback) {
        Bitmap bitmapH;
        long jNanoTime = System.nanoTime();
        u.c();
        if (imageView != null) {
            if (!this.b.a()) {
                this.a.cancelRequest(imageView);
                if (this.e) {
                    o.d(imageView, b());
                    return;
                }
                return;
            }
            if (this.d) {
                if (!this.b.c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.b.resize(width, height);
                    } else {
                        if (this.e) {
                            o.d(imageView, b());
                        }
                        this.a.d(imageView, new f(this, imageView, callback));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            Request requestA = a(jNanoTime);
            String strI = u.i(requestA);
            if (MemoryPolicy.a(this.h) && (bitmapH = this.a.h(strI)) != null) {
                this.a.cancelRequest(imageView);
                Picasso picasso = this.a;
                Context context = picasso.e;
                Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
                o.c(imageView, context, bitmapH, loadedFrom, this.c, picasso.m);
                if (this.a.n) {
                    u.w(u.m, u.D, requestA.f(), "from " + loadedFrom);
                }
                if (callback != null) {
                    callback.onSuccess();
                    return;
                }
                return;
            }
            if (this.e) {
                o.d(imageView, b());
            }
            this.a.f(new k(this.a, imageView, requestA, this.h, this.i, this.g, this.k, strI, this.l, callback, this.c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
