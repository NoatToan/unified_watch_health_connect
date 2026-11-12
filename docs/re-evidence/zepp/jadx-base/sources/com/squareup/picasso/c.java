package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
class c implements Runnable {
    private static final Object t = new Object();
    private static final ThreadLocal<StringBuilder> u = new a();
    private static final AtomicInteger v = new AtomicInteger();
    private static final RequestHandler w = new b();
    public final int a = v.incrementAndGet();
    public final Picasso b;
    public final g c;
    public final Cache d;
    public final s e;
    public final String f;
    public final Request g;
    public final int h;
    public int i;
    public final RequestHandler j;
    public com.squareup.picasso.a k;
    public List<com.squareup.picasso.a> l;
    public Bitmap m;
    public Future<?> n;
    public Picasso.LoadedFrom o;
    public Exception p;
    public int q;
    public int r;
    public Picasso.Priority s;

    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder(u.a);
        }
    }

    public static class b extends RequestHandler {
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public RequestHandler.Result load(Request request, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    public static class RunnableC0746c implements Runnable {
        public final /* synthetic */ Transformation a;
        public final /* synthetic */ RuntimeException b;

        public RunnableC0746c(Transformation transformation, RuntimeException runtimeException) {
            this.a = transformation;
            this.b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.a.key() + " crashed with exception.", this.b);
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ StringBuilder a;

        public d(StringBuilder sb) {
            this.a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.a.toString());
        }
    }

    public static class e implements Runnable {
        public final /* synthetic */ Transformation a;

        public e(Transformation transformation) {
            this.a = transformation;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.a.key() + " returned input Bitmap but recycled it.");
        }
    }

    public static class f implements Runnable {
        public final /* synthetic */ Transformation a;

        public f(Transformation transformation) {
            this.a = transformation;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public c(Picasso picasso, g gVar, Cache cache, s sVar, com.squareup.picasso.a aVar, RequestHandler requestHandler) {
        this.b = picasso;
        this.c = gVar;
        this.d = cache;
        this.e = sVar;
        this.k = aVar;
        this.f = aVar.d();
        this.g = aVar.i();
        this.s = aVar.h();
        this.h = aVar.e();
        this.i = aVar.f();
        this.j = requestHandler;
        this.r = requestHandler.d();
    }

    public static Bitmap a(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Transformation transformation = list.get(i);
            try {
                Bitmap bitmapTransform = transformation.transform(bitmap);
                if (bitmapTransform == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(transformation.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<Transformation> it2 = list.iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next().key());
                        sb.append('\n');
                    }
                    Picasso.q.post(new d(sb));
                    return null;
                }
                if (bitmapTransform == bitmap && bitmap.isRecycled()) {
                    Picasso.q.post(new e(transformation));
                    return null;
                }
                if (bitmapTransform != bitmap && !bitmap.isRecycled()) {
                    Picasso.q.post(new f(transformation));
                    return null;
                }
                i++;
                bitmap = bitmapTransform;
            } catch (RuntimeException e2) {
                Picasso.q.post(new RunnableC0746c(transformation, e2));
                return null;
            }
        }
        return bitmap;
    }

    private Picasso.Priority d() {
        Picasso.Priority priorityH = Picasso.Priority.LOW;
        List<com.squareup.picasso.a> list = this.l;
        boolean z = true;
        boolean z2 = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.k;
        if (aVar == null && !z2) {
            z = false;
        }
        if (!z) {
            return priorityH;
        }
        if (aVar != null) {
            priorityH = aVar.h();
        }
        if (z2) {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                Picasso.Priority priorityH2 = this.l.get(i).h();
                if (priorityH2.ordinal() > priorityH.ordinal()) {
                    priorityH = priorityH2;
                }
            }
        }
        return priorityH;
    }

    public static Bitmap e(InputStream inputStream, Request request) throws IOException {
        l lVar = new l(inputStream);
        long jB = lVar.b(65536);
        BitmapFactory.Options optionsC = RequestHandler.c(request);
        boolean zE = RequestHandler.e(optionsC);
        boolean zU = u.u(lVar);
        lVar.a(jB);
        if (zU) {
            byte[] bArrY = u.y(lVar);
            if (zE) {
                BitmapFactory.decodeByteArray(bArrY, 0, bArrY.length, optionsC);
                RequestHandler.b(request.targetWidth, request.targetHeight, optionsC, request);
            }
            return BitmapFactory.decodeByteArray(bArrY, 0, bArrY.length, optionsC);
        }
        if (zE) {
            BitmapFactory.decodeStream(lVar, null, optionsC);
            RequestHandler.b(request.targetWidth, request.targetHeight, optionsC, request);
            lVar.a(jB);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(lVar, null, optionsC);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static c g(Picasso picasso, g gVar, Cache cache, s sVar, com.squareup.picasso.a aVar) {
        Request requestI = aVar.i();
        List<RequestHandler> listG = picasso.g();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            RequestHandler requestHandler = listG.get(i);
            if (requestHandler.canHandleRequest(requestI)) {
                return new c(picasso, gVar, cache, sVar, aVar, requestHandler);
            }
        }
        return new c(picasso, gVar, cache, sVar, aVar, w);
    }

    private static boolean t(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    public static Bitmap w(Request request, Bitmap bitmap, int i) {
        int i2;
        int i3;
        int i4;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int iCeil;
        int i5;
        int i6;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = request.onlyScaleDown;
        Matrix matrix = new Matrix();
        int i7 = 0;
        if (request.d()) {
            int i8 = request.targetWidth;
            int i9 = request.targetHeight;
            float f7 = request.rotationDegrees;
            if (f7 != 0.0f) {
                if (request.hasRotationPivot) {
                    matrix.setRotate(f7, request.rotationPivotX, request.rotationPivotY);
                } else {
                    matrix.setRotate(f7);
                }
            }
            if (request.centerCrop) {
                float f8 = i8;
                float f9 = width;
                float f10 = f8 / f9;
                float f11 = i9;
                float f12 = height;
                float f13 = f11 / f12;
                if (f10 > f13) {
                    iCeil = (int) Math.ceil(f12 * (f13 / f10));
                    i6 = (height - iCeil) / 2;
                    f13 = f11 / iCeil;
                    f6 = f10;
                    i5 = width;
                } else {
                    int iCeil2 = (int) Math.ceil(f9 * (f10 / f13));
                    f6 = f8 / iCeil2;
                    iCeil = height;
                    i7 = (width - iCeil2) / 2;
                    i5 = iCeil2;
                    i6 = 0;
                }
                if (t(z, width, height, i8, i9)) {
                    matrix.preScale(f6, f13);
                }
                i4 = i6;
                i2 = i5;
                i3 = iCeil;
            } else {
                if (request.centerInside) {
                    float f14 = i8 / width;
                    float f15 = i9 / height;
                    if (f14 >= f15) {
                        f14 = f15;
                    }
                    if (t(z, width, height, i8, i9)) {
                        matrix.preScale(f14, f14);
                    }
                } else if ((i8 != 0 || i9 != 0) && (i8 != width || i9 != height)) {
                    if (i8 != 0) {
                        f2 = i8;
                        f3 = width;
                    } else {
                        f2 = i9;
                        f3 = height;
                    }
                    float f16 = f2 / f3;
                    if (i9 != 0) {
                        f4 = i9;
                        f5 = height;
                    } else {
                        f4 = i8;
                        f5 = width;
                    }
                    float f17 = f4 / f5;
                    if (t(z, width, height, i8, i9)) {
                        matrix.preScale(f16, f17);
                    }
                }
                i2 = width;
                i3 = height;
                i4 = 0;
            }
        } else {
            i2 = width;
            i3 = height;
            i4 = 0;
        }
        if (i != 0) {
            matrix.preRotate(i);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i7, i4, i2, i3, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static void x(Request request) {
        String strA = request.a();
        StringBuilder sb = u.get();
        sb.ensureCapacity(strA.length() + 8);
        sb.replace(8, sb.length(), strA);
        Thread.currentThread().setName(sb.toString());
    }

    public void b(com.squareup.picasso.a aVar) {
        boolean z = this.b.n;
        Request request = aVar.b;
        if (this.k == null) {
            this.k = aVar;
            if (z) {
                List<com.squareup.picasso.a> list = this.l;
                if (list == null || list.isEmpty()) {
                    u.w(u.o, u.z, request.c(), "to empty hunter");
                    return;
                } else {
                    u.w(u.o, u.z, request.c(), u.n(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.l == null) {
            this.l = new ArrayList(3);
        }
        this.l.add(aVar);
        if (z) {
            u.w(u.o, u.z, request.c(), u.n(this, "to "));
        }
        Picasso.Priority priorityH = aVar.h();
        if (priorityH.ordinal() > this.s.ordinal()) {
            this.s = priorityH;
        }
    }

    public boolean c() {
        Future<?> future;
        if (this.k != null) {
            return false;
        }
        List<com.squareup.picasso.a> list = this.l;
        return (list == null || list.isEmpty()) && (future = this.n) != null && future.cancel(false);
    }

    public void f(com.squareup.picasso.a aVar) {
        boolean zRemove;
        if (this.k == aVar) {
            this.k = null;
            zRemove = true;
        } else {
            List<com.squareup.picasso.a> list = this.l;
            zRemove = list != null ? list.remove(aVar) : false;
        }
        if (zRemove && aVar.h() == this.s) {
            this.s = d();
        }
        if (this.b.n) {
            u.w(u.o, u.A, aVar.b.c(), u.n(this, "from "));
        }
    }

    public com.squareup.picasso.a h() {
        return this.k;
    }

    public List<com.squareup.picasso.a> i() {
        return this.l;
    }

    public Request j() {
        return this.g;
    }

    public Exception k() {
        return this.p;
    }

    public String l() {
        return this.f;
    }

    public Picasso.LoadedFrom m() {
        return this.o;
    }

    public int n() {
        return this.h;
    }

    public Picasso o() {
        return this.b;
    }

    public Picasso.Priority p() {
        return this.s;
    }

    public Bitmap q() {
        return this.m;
    }

    public Bitmap r() throws IOException {
        Bitmap bitmapW;
        if (MemoryPolicy.a(this.h)) {
            bitmapW = this.d.get(this.f);
            if (bitmapW != null) {
                this.e.d();
                this.o = Picasso.LoadedFrom.MEMORY;
                if (this.b.n) {
                    u.w(u.o, u.x, this.g.c(), "from cache");
                }
                return bitmapW;
            }
        } else {
            bitmapW = null;
        }
        Request request = this.g;
        request.c = this.r == 0 ? NetworkPolicy.OFFLINE.index : this.i;
        RequestHandler.Result resultLoad = this.j.load(request, this.i);
        if (resultLoad != null) {
            this.o = resultLoad.getLoadedFrom();
            this.q = resultLoad.a();
            bitmapW = resultLoad.getBitmap();
            if (bitmapW == null) {
                InputStream stream = resultLoad.getStream();
                try {
                    Bitmap bitmapE = e(stream, this.g);
                    u.f(stream);
                    bitmapW = bitmapE;
                } catch (Throwable th) {
                    u.f(stream);
                    throw th;
                }
            }
        }
        if (bitmapW != null) {
            if (this.b.n) {
                u.v(u.o, u.x, this.g.c());
            }
            this.e.b(bitmapW);
            if (this.g.e() || this.q != 0) {
                synchronized (t) {
                    if (this.g.d() || this.q != 0) {
                        bitmapW = w(this.g, bitmapW, this.q);
                        if (this.b.n) {
                            u.v(u.o, u.y, this.g.c());
                        }
                    }
                    if (this.g.b()) {
                        bitmapW = a(this.g.transformations, bitmapW);
                        if (this.b.n) {
                            u.w(u.o, u.y, this.g.c(), "from custom transformations");
                        }
                    }
                }
                if (bitmapW != null) {
                    this.e.c(bitmapW);
                }
            }
        }
        return bitmapW;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        x(this.g);
                        if (this.b.n) {
                            u.v(u.o, u.w, u.m(this));
                        }
                        Bitmap bitmapR = r();
                        this.m = bitmapR;
                        if (bitmapR == null) {
                            this.c.e(this);
                        } else {
                            this.c.d(this);
                        }
                    } catch (IOException e2) {
                        this.p = e2;
                        this.c.i(this);
                    }
                } catch (Downloader.ResponseException e3) {
                    if (!e3.a || e3.b != 504) {
                        this.p = e3;
                    }
                    this.c.e(this);
                } catch (n.a e4) {
                    this.p = e4;
                    this.c.i(this);
                }
            } catch (Exception e5) {
                this.p = e5;
                this.c.e(this);
            } catch (OutOfMemoryError e6) {
                StringWriter stringWriter = new StringWriter();
                this.e.a().dump(new PrintWriter(stringWriter));
                this.p = new RuntimeException(stringWriter.toString(), e6);
                this.c.e(this);
            }
        } finally {
            Thread.currentThread().setName(u.b);
        }
    }

    public boolean s() {
        Future<?> future = this.n;
        return future != null && future.isCancelled();
    }

    public boolean u(boolean z, NetworkInfo networkInfo) {
        int i = this.r;
        if (!(i > 0)) {
            return false;
        }
        this.r = i - 1;
        return this.j.f(z, networkInfo);
    }

    public boolean v() {
        return this.j.g();
    }
}
