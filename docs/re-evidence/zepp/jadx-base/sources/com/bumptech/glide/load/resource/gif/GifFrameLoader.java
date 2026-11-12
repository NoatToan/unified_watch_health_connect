package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class GifFrameLoader {
    private final GifDecoder a;
    private final Handler b;
    private final List<FrameCallback> c;
    public final RequestManager d;
    private final BitmapPool e;
    private boolean f;
    private boolean g;
    private boolean h;
    private RequestBuilder<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private Transformation<Bitmap> n;
    private a o;

    @Nullable
    private c p;

    public interface FrameCallback {
        void onFrameReady();
    }

    @VisibleForTesting
    public static class a extends SimpleTarget<Bitmap> {
        private final Handler d;
        public final int e;
        private final long f;
        private Bitmap g;

        public a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        public Bitmap a() {
            return this.g;
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
            onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
            this.g = bitmap;
            this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.f);
        }
    }

    public class b implements Handler.Callback {
        public static final int b = 1;
        public static final int c = 2;

        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GifFrameLoader.this.p((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            GifFrameLoader.this.d.clear((a) message.obj);
            return false;
        }
    }

    @VisibleForTesting
    public interface c {
        void onFrameReady();
    }

    public GifFrameLoader(Glide glide, GifDecoder gifDecoder, int i, int i2, Transformation<Bitmap> transformation, Bitmap bitmap) {
        this(glide.getBitmapPool(), Glide.with(glide.getContext()), gifDecoder, null, l(Glide.with(glide.getContext()), i, i2), transformation, bitmap);
    }

    private static Key g() {
        return new ObjectKey(Double.valueOf(Math.random()));
    }

    private int h() {
        return Util.getBitmapByteSize(c().getWidth(), c().getHeight(), c().getConfig());
    }

    private static RequestBuilder<Bitmap> l(RequestManager requestManager, int i, int i2) {
        return requestManager.asBitmap().apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).useAnimationPool(true).skipMemoryCache(true).override(i, i2));
    }

    private void o() {
        if (!this.f || this.g) {
            return;
        }
        if (this.h) {
            Preconditions.checkArgument(this.o == null, "Pending target must be null when starting from the first frame");
            this.a.resetFrameIndex();
            this.h = false;
        }
        a aVar = this.o;
        if (aVar != null) {
            this.o = null;
            p(aVar);
            return;
        }
        this.g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.getNextDelay());
        this.a.advance();
        this.l = new a(this.b, this.a.getCurrentFrameIndex(), jUptimeMillis);
        this.i.apply(RequestOptions.signatureOf(g())).load((Object) this.a).into(this.l);
    }

    private void q() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.put(bitmap);
            this.m = null;
        }
    }

    private void u() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        o();
    }

    private void v() {
        this.f = false;
    }

    public void a() {
        this.c.clear();
        q();
        v();
        a aVar = this.j;
        if (aVar != null) {
            this.d.clear(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.clear(aVar2);
            this.l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.d.clear(aVar3);
            this.o = null;
        }
        this.a.clear();
        this.k = true;
    }

    public ByteBuffer b() {
        return this.a.getData().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.a() : this.m;
    }

    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    public Bitmap e() {
        return this.m;
    }

    public int f() {
        return this.a.getFrameCount();
    }

    public Transformation<Bitmap> i() {
        return this.n;
    }

    public int j() {
        return c().getHeight();
    }

    public int k() {
        return this.a.getTotalIterationCount();
    }

    public int m() {
        return this.a.getByteSize() + h();
    }

    public int n() {
        return c().getWidth();
    }

    @VisibleForTesting
    public void p(a aVar) {
        c cVar = this.p;
        if (cVar != null) {
            cVar.onFrameReady();
        }
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.o = aVar;
            return;
        }
        if (aVar.a() != null) {
            q();
            a aVar2 = this.j;
            this.j = aVar;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                this.c.get(size).onFrameReady();
            }
            if (aVar2 != null) {
                this.b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        o();
    }

    public void r(Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.n = (Transformation) Preconditions.checkNotNull(transformation);
        this.m = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.i = this.i.apply(new RequestOptions().transform(transformation));
    }

    public void s() {
        Preconditions.checkArgument(!this.f, "Can't restart a running animation");
        this.h = true;
        a aVar = this.o;
        if (aVar != null) {
            this.d.clear(aVar);
            this.o = null;
        }
    }

    @VisibleForTesting
    public void t(@Nullable c cVar) {
        this.p = cVar;
    }

    public void w(FrameCallback frameCallback) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.c.contains(frameCallback)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.c.isEmpty();
        this.c.add(frameCallback);
        if (zIsEmpty) {
            u();
        }
    }

    public void x(FrameCallback frameCallback) {
        this.c.remove(frameCallback);
        if (this.c.isEmpty()) {
            v();
        }
    }

    public GifFrameLoader(BitmapPool bitmapPool, RequestManager requestManager, GifDecoder gifDecoder, Handler handler, RequestBuilder<Bitmap> requestBuilder, Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = requestManager;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new b()) : handler;
        this.e = bitmapPool;
        this.b = handler;
        this.i = requestBuilder;
        this.a = gifDecoder;
        r(transformation, bitmap);
    }
}
