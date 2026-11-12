package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageReader;
import android.os.Build;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.j;
import defpackage.adp;
import defpackage.cb3;
import defpackage.ch8;
import defpackage.d4n;
import defpackage.dh3;
import defpackage.eem;
import defpackage.fk3;
import defpackage.g6i;
import defpackage.ha1;
import defpackage.jua;
import defpackage.k7g;
import defpackage.kh8;
import defpackage.lhe;
import defpackage.li3;
import defpackage.m0m;
import defpackage.mj3;
import defpackage.n6d;
import defpackage.nj3;
import defpackage.odg;
import defpackage.oua;
import defpackage.p5d;
import defpackage.r1s;
import defpackage.u6d;
import defpackage.v0s;
import defpackage.w0p;
import defpackage.we3;
import defpackage.wf3;
import defpackage.zhd;
import defpackage.zj3;
import defpackage.zpe;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class j extends s {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final g I = new g();
    public static final kh8 J = new kh8();
    public q A;
    public p B;
    public lhe<Void> C;
    public we3 D;
    public DeferrableSurface E;
    public i F;
    public final Executor G;
    public Matrix H;
    public final p5d.a l;
    public final Executor m;
    public final int n;

    @GuardedBy("mLockedFlashMode")
    public final AtomicReference<Integer> o;
    public final int p;

    @GuardedBy("mLockedFlashMode")
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rational f1762r;
    public ExecutorService s;
    public androidx.camera.core.impl.e t;
    public mj3 u;
    public int v;
    public zj3 w;
    public boolean x;
    public boolean y;
    public SessionConfig.b z;

    public class a extends we3 {
        public a() {
        }
    }

    public class b extends we3 {
        public b() {
        }
    }

    public class c implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v0s f1765a;

        public c(v0s v0sVar) {
            this.f1765a = v0sVar;
        }

        @Override // androidx.camera.core.j.i.c
        public void a(h hVar) {
            this.f1765a.h(hVar.f1774b);
            this.f1765a.i(hVar.f1773a);
        }
    }

    public class d implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb3.a f1767a;

        public d(cb3.a aVar) {
            this.f1767a = aVar;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            j.this.s0();
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            j.this.s0();
            this.f1767a.f(th);
        }
    }

    public class e implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f1769a = new AtomicInteger(0);

        public e() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f1769a.getAndIncrement());
        }
    }

    public static final class f implements androidx.camera.core.impl.r.a<j, androidx.camera.core.impl.i, f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.camera.core.impl.m f1771a;

        public f() {
            this(androidx.camera.core.impl.m.O());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static f d(Config config) {
            return new f(androidx.camera.core.impl.m.P(config));
        }

        @Override // defpackage.zj8
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.impl.l a() {
            return this.f1771a;
        }

        public j c() {
            int iIntValue;
            if (a().d(androidx.camera.core.impl.k.l, null) != null && a().d(androidx.camera.core.impl.k.o, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            Integer num = (Integer) a().d(androidx.camera.core.impl.i.E, null);
            if (num != null) {
                g6i.b(a().d(androidx.camera.core.impl.i.D, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                a().z(androidx.camera.core.impl.j.f1737k, num);
            } else if (a().d(androidx.camera.core.impl.i.D, null) != null) {
                a().z(androidx.camera.core.impl.j.f1737k, 35);
            } else {
                a().z(androidx.camera.core.impl.j.f1737k, 256);
            }
            j jVar = new j(b());
            Size size = (Size) a().d(androidx.camera.core.impl.k.o, null);
            if (size != null) {
                jVar.p0(new Rational(size.getWidth(), size.getHeight()));
            }
            g6i.b(((Integer) a().d(androidx.camera.core.impl.i.F, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
            g6i.h((Executor) a().d(zhd.f41274a, li3.c()), "The IO executor can't be null");
            androidx.camera.core.impl.l lVarA = a();
            Config.a<Integer> aVar = androidx.camera.core.impl.i.B;
            if (!lVarA.f(aVar) || (iIntValue = ((Integer) a().a(aVar)).intValue()) == 0 || iIntValue == 1 || iIntValue == 2) {
                return jVar;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + iIntValue);
        }

        @Override // androidx.camera.core.impl.r.a
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.i b() {
            return new androidx.camera.core.impl.i(androidx.camera.core.impl.n.M(this.f1771a));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public f f(int i) {
            a().z(androidx.camera.core.impl.r.w, Integer.valueOf(i));
            return this;
        }

        public f g(int i) {
            a().z(androidx.camera.core.impl.k.l, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public f h(Class<j> cls) {
            a().z(w0p.c, cls);
            if (a().d(w0p.f37423b, null) == null) {
                i(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public f i(String str) {
            a().z(w0p.f37423b, str);
            return this;
        }

        public f(androidx.camera.core.impl.m mVar) {
            this.f1771a = mVar;
            Class cls = (Class) mVar.d(w0p.c, null);
            if (cls == null || cls.equals(j.class)) {
                h(j.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.camera.core.impl.i f1772a = new f().f(4).g(0).b();

        public androidx.camera.core.impl.i a() {
            return f1772a;
        }
    }

    @VisibleForTesting
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @IntRange(from = 1, to = 100)
        public final int f1774b;
        public final Rational c;
        public final Executor d;
        public AtomicBoolean e;
        public final Rect f;
        public final Matrix g;

        public void c(m mVar) {
            Size size;
            int iJ;
            if (!this.e.compareAndSet(false, true)) {
                mVar.close();
                return;
            }
            if (j.J.b(mVar)) {
                try {
                    ByteBuffer buffer = mVar.x()[0].getBuffer();
                    buffer.rewind();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.get(bArr);
                    ch8 ch8VarD = ch8.d(new ByteArrayInputStream(bArr));
                    buffer.rewind();
                    size = new Size(ch8VarD.l(), ch8VarD.g());
                    iJ = ch8VarD.j();
                } catch (IOException e) {
                    f(1, "Unable to parse JPEG exif", e);
                    mVar.close();
                    return;
                }
            } else {
                size = new Size(mVar.getWidth(), mVar.getHeight());
                iJ = this.f1773a;
            }
            final m0m m0mVar = new m0m(mVar, size, u6d.e(mVar.H().a(), mVar.H().getTimestamp(), iJ, this.g));
            m0mVar.a0(j.V(this.f, this.c, this.f1773a, size, iJ));
            try {
                this.d.execute(new Runnable() { // from class: f3d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17361a.d(m0mVar);
                    }
                });
            } catch (RejectedExecutionException unused) {
                zpe.c("ImageCapture", "Unable to post to the supplied executor.");
                mVar.close();
            }
        }

        public final /* synthetic */ void d(m mVar) {
            throw null;
        }

        public final /* synthetic */ void e(int i, String str, Throwable th) {
            new ImageCaptureException(i, str, th);
            throw null;
        }

        public void f(final int i, final String str, final Throwable th) {
            if (this.e.compareAndSet(false, true)) {
                try {
                    this.d.execute(new Runnable() { // from class: e3d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f16217a.e(i, str, th);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    zpe.c("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    @VisibleForTesting
    public static class i implements androidx.camera.core.f.a {

        @GuardedBy("mLock")
        public final b e;
        public final int f;
        public final c g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("mLock")
        public final Deque<h> f1775a = new ArrayDeque();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @GuardedBy("mLock")
        public h f1776b = null;

        @GuardedBy("mLock")
        public lhe<m> c = null;

        @GuardedBy("mLock")
        public int d = 0;
        public final Object h = new Object();

        public class a implements jua<m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f1777a;

            public a(h hVar) {
                this.f1777a = hVar;
            }

            @Override // defpackage.jua
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(m mVar) {
                synchronized (i.this.h) {
                    g6i.g(mVar);
                    eem eemVar = new eem(mVar);
                    eemVar.addOnImageCloseListener(i.this);
                    i.this.d++;
                    this.f1777a.c(eemVar);
                    i iVar = i.this;
                    iVar.f1776b = null;
                    iVar.c = null;
                    iVar.b();
                }
            }

            @Override // defpackage.jua
            public void onFailure(Throwable th) {
                synchronized (i.this.h) {
                    try {
                        if (!(th instanceof CancellationException)) {
                            this.f1777a.f(j.a0(th), th != null ? th.getMessage() : "Unknown error", th);
                        }
                        i iVar = i.this;
                        iVar.f1776b = null;
                        iVar.c = null;
                        iVar.b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public interface b {
            lhe<m> a(h hVar);
        }

        public interface c {
            void a(h hVar);
        }

        public i(int i, b bVar, c cVar) {
            this.f = i;
            this.e = bVar;
            this.g = cVar;
        }

        public void a(Throwable th) {
            h hVar;
            lhe<m> lheVar;
            ArrayList arrayList;
            synchronized (this.h) {
                hVar = this.f1776b;
                this.f1776b = null;
                lheVar = this.c;
                this.c = null;
                arrayList = new ArrayList(this.f1775a);
                this.f1775a.clear();
            }
            if (hVar != null && lheVar != null) {
                hVar.f(j.a0(th), th.getMessage(), th);
                lheVar.cancel(true);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((h) it.next()).f(j.a0(th), th.getMessage(), th);
            }
        }

        public void b() {
            synchronized (this.h) {
                try {
                    if (this.f1776b != null) {
                        return;
                    }
                    if (this.d >= this.f) {
                        zpe.k("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    h hVarPoll = this.f1775a.poll();
                    if (hVarPoll == null) {
                        return;
                    }
                    this.f1776b = hVarPoll;
                    c cVar = this.g;
                    if (cVar != null) {
                        cVar.a(hVarPoll);
                    }
                    lhe<m> lheVarA = this.e.a(hVarPoll);
                    this.c = lheVarA;
                    oua.b(lheVarA, new a(hVarPoll), li3.a());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.core.f.a
        public void f(m mVar) {
            synchronized (this.h) {
                this.d--;
                b();
            }
        }
    }

    public j(androidx.camera.core.impl.i iVar) {
        super(iVar);
        this.l = new p5d.a() { // from class: v2d
            @Override // p5d.a
            public final void a(p5d p5dVar) {
                j.j0(p5dVar);
            }
        };
        this.o = new AtomicReference<>(null);
        this.q = -1;
        this.f1762r = null;
        this.x = false;
        this.y = true;
        this.C = oua.h(null);
        this.H = new Matrix();
        androidx.camera.core.impl.i iVar2 = (androidx.camera.core.impl.i) g();
        if (iVar2.f(androidx.camera.core.impl.i.A)) {
            this.n = iVar2.L();
        } else {
            this.n = 1;
        }
        this.p = iVar2.O(0);
        Executor executor = (Executor) g6i.g(iVar2.Q(li3.c()));
        this.m = executor;
        this.G = li3.f(executor);
    }

    public static Rect V(Rect rect, Rational rational, int i2, Size size, int i3) {
        if (rect != null) {
            return ImageUtil.b(rect, i2, size, i3);
        }
        if (rational != null) {
            if (i3 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (ImageUtil.f(size, rational)) {
                return ImageUtil.a(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static boolean X(androidx.camera.core.impl.l lVar) {
        Config.a<Boolean> aVar = androidx.camera.core.impl.i.H;
        Boolean bool = Boolean.FALSE;
        boolean z = false;
        if (((Boolean) lVar.d(aVar, bool)).booleanValue()) {
            Integer num = (Integer) lVar.d(androidx.camera.core.impl.i.E, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                zpe.k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                zpe.k("ImageCapture", "Unable to support software JPEG. Disabling.");
                lVar.z(aVar, bool);
            }
        }
        return z;
    }

    public static int a0(Throwable th) {
        if (th instanceof wf3) {
            return 3;
        }
        if (th instanceof ImageCaptureException) {
            return ((ImageCaptureException) th).getImageCaptureError();
        }
        return 0;
    }

    public static boolean d0(List<Pair<Integer, Size[]>> list, int i2) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void h0(h hVar, String str, Throwable th) {
        zpe.c("ImageCapture", "Processing image failed! " + str);
        hVar.f(2, str, th);
    }

    public static /* synthetic */ Void i0(List list) {
        return null;
    }

    public static /* synthetic */ void j0(p5d p5dVar) {
        try {
            m mVarG = p5dVar.g();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Discarding ImageProxy which was inadvertently acquired: ");
                sb.append(mVarG);
                if (mVarG != null) {
                    mVarG.close();
                }
            } catch (Throwable th) {
                if (mVarG != null) {
                    try {
                        mVarG.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static /* synthetic */ void l0(cb3.a aVar, p5d p5dVar) {
        try {
            m mVarG = p5dVar.g();
            if (mVarG == null) {
                aVar.f(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.c(mVarG)) {
                mVarG.close();
            }
        } catch (IllegalStateException e2) {
            aVar.f(e2);
        }
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void A() {
        lhe<Void> lheVar = this.C;
        T();
        U();
        this.x = false;
        final ExecutorService executorService = this.s;
        lheVar.addListener(new Runnable() { // from class: y2d
            @Override // java.lang.Runnable
            public final void run() {
                executorService.shutdown();
            }
        }, li3.a());
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> B(dh3 dh3Var, androidx.camera.core.impl.r.a<?, ?, ?> aVar) {
        androidx.camera.core.impl.r rVarB = aVar.b();
        Config.a<zj3> aVar2 = androidx.camera.core.impl.i.D;
        if (rVarB.d(aVar2, null) != null && Build.VERSION.SDK_INT >= 29) {
            zpe.e("ImageCapture", "Requesting software JPEG due to a CaptureProcessor is set.");
            aVar.a().z(androidx.camera.core.impl.i.H, Boolean.TRUE);
        } else if (dh3Var.f().a(d4n.class)) {
            androidx.camera.core.impl.l lVarA = aVar.a();
            Config.a<Boolean> aVar3 = androidx.camera.core.impl.i.H;
            Boolean bool = Boolean.TRUE;
            if (((Boolean) lVarA.d(aVar3, bool)).booleanValue()) {
                zpe.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.a().z(aVar3, bool);
            } else {
                zpe.k("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            }
        }
        boolean zX = X(aVar.a());
        Integer num = (Integer) aVar.a().d(androidx.camera.core.impl.i.E, null);
        if (num != null) {
            g6i.b(aVar.a().d(aVar2, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
            aVar.a().z(androidx.camera.core.impl.j.f1737k, Integer.valueOf(zX ? 35 : num.intValue()));
        } else if (aVar.a().d(aVar2, null) != null || zX) {
            aVar.a().z(androidx.camera.core.impl.j.f1737k, 35);
        } else {
            List list = (List) aVar.a().d(androidx.camera.core.impl.k.f1738r, null);
            if (list == null || d0(list, 256)) {
                aVar.a().z(androidx.camera.core.impl.j.f1737k, 256);
            } else if (d0(list, 35)) {
                aVar.a().z(androidx.camera.core.impl.j.f1737k, 35);
            }
        }
        g6i.b(((Integer) aVar.a().d(androidx.camera.core.impl.i.F, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
        return aVar.b();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void D() {
        T();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size E(Size size) {
        SessionConfig.b bVarW = W(f(), (androidx.camera.core.impl.i) g(), size);
        this.z = bVarW;
        I(bVarW.m());
        r();
        return size;
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void G(Matrix matrix) {
        this.H = matrix;
    }

    public final void T() {
        if (this.F != null) {
            this.F.a(new wf3("Camera is closed."));
        }
    }

    public void U() {
        adp.a();
        i iVar = this.F;
        if (iVar != null) {
            iVar.a(new CancellationException("Request is canceled."));
            this.F = null;
        }
        DeferrableSurface deferrableSurface = this.E;
        this.E = null;
        this.A = null;
        this.B = null;
        this.C = oua.h(null);
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0197  */
    /* JADX WARN: Code duplicated, block: B:40:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f5  */
    public SessionConfig.b W(final String str, final androidx.camera.core.impl.i iVar, final Size size) {
        zj3 zj3Var;
        v0s v0sVar;
        v0s v0sVar2;
        zj3 fk3Var;
        p5d ha1Var;
        i iVar2;
        c cVar;
        DeferrableSurface deferrableSurface;
        p pVar;
        lhe<Void> lheVarH;
        adp.a();
        SessionConfig.b bVarO = SessionConfig.b.o(iVar);
        if (Z() == 2) {
            e().b(size, bVarO);
        }
        if (iVar.P() == null) {
            int i2 = 256;
            if (this.y) {
                if (i() == 256) {
                    ha1Var = new ha1(ImageReader.newInstance(size.getWidth(), size.getHeight(), i(), 2));
                    v0sVar2 = null;
                } else {
                    if (i() != 35) {
                        throw new IllegalArgumentException("Unsupported image format:" + i());
                    }
                    v0s v0sVar3 = new v0s(c0(), 2);
                    k7g k7gVar = new k7g(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 2));
                    mj3 mj3VarC = nj3.c();
                    p pVarA = new p.e(k7gVar, mj3VarC, v0sVar3).c(this.s).b(256).a();
                    odg odgVarF = odg.f();
                    odgVarF.h(pVarA.o(), Integer.valueOf(mj3VarC.a().get(0).getId()));
                    k7gVar.m(odgVarF);
                    v0sVar2 = v0sVar3;
                    ha1Var = pVarA;
                }
                this.D = new b();
                this.A = new q(ha1Var);
            } else {
                zj3 zj3Var2 = this.w;
                if (zj3Var2 != null || this.x) {
                    int i3 = i();
                    int i4 = i();
                    if (this.x) {
                        zpe.e("ImageCapture", "Using software JPEG encoder.");
                        if (this.w != null) {
                            v0sVar = new v0s(c0(), this.v);
                            fk3Var = new fk3(this.w, this.v, v0sVar, this.s);
                        } else {
                            v0sVar = new v0s(c0(), this.v);
                            fk3Var = v0sVar;
                        }
                        zj3Var = fk3Var;
                    } else {
                        zj3Var = zj3Var2;
                        v0sVar = null;
                        i2 = i4;
                    }
                    p pVarA2 = new p.e(size.getWidth(), size.getHeight(), i3, this.v, Y(nj3.c()), zj3Var).c(this.s).b(i2).a();
                    this.B = pVarA2;
                    this.D = pVarA2.m();
                    this.A = new q(this.B);
                    v0sVar2 = v0sVar;
                } else {
                    n nVar = new n(size.getWidth(), size.getHeight(), i(), 2);
                    this.D = nVar.n();
                    this.A = new q(nVar);
                }
            }
            iVar2 = this.F;
            if (iVar2 != null) {
                iVar2.a(new CancellationException("Request is canceled."));
            }
            i.b bVar = new i.b() { // from class: w2d
                @Override // androidx.camera.core.j.i.b
                public final lhe a(j.h hVar) {
                    return this.f37477a.f0(hVar);
                }
            };
            if (v0sVar2 == null) {
                cVar = null;
            } else {
                cVar = new c(v0sVar2);
            }
            this.F = new i(2, bVar, cVar);
            this.A.d(this.l, li3.d());
            deferrableSurface = this.E;
            if (deferrableSurface != null) {
                deferrableSurface.c();
            }
            this.E = new n6d(this.A.a(), new Size(this.A.getWidth(), this.A.getHeight()), this.A.b());
            pVar = this.B;
            if (pVar != null) {
                lheVarH = pVar.n();
            } else {
                lheVarH = oua.h(null);
            }
            this.C = lheVarH;
            lhe<Void> lheVarI = this.E.i();
            q qVar = this.A;
            Objects.requireNonNull(qVar);
            lheVarI.addListener(new r1s(qVar), li3.d());
            bVarO.h(this.E);
            bVarO.f(new SessionConfig.c() { // from class: x2d
                @Override // androidx.camera.core.impl.SessionConfig.c
                public final void a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                    this.f38606a.g0(str, iVar, size, sessionConfig, sessionError);
                }
            });
            return bVarO;
        }
        this.A = new q(iVar.P().a(size.getWidth(), size.getHeight(), i(), 2, 0L));
        this.D = new a();
        v0sVar2 = null;
        iVar2 = this.F;
        if (iVar2 != null) {
            iVar2.a(new CancellationException("Request is canceled."));
        }
        i.b bVar2 = new i.b() { // from class: w2d
            @Override // androidx.camera.core.j.i.b
            public final lhe a(j.h hVar) {
                return this.f37477a.f0(hVar);
            }
        };
        if (v0sVar2 == null) {
            cVar = null;
        } else {
            cVar = new c(v0sVar2);
        }
        this.F = new i(2, bVar2, cVar);
        this.A.d(this.l, li3.d());
        deferrableSurface = this.E;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        this.E = new n6d(this.A.a(), new Size(this.A.getWidth(), this.A.getHeight()), this.A.b());
        pVar = this.B;
        if (pVar != null) {
            lheVarH = pVar.n();
        } else {
            lheVarH = oua.h(null);
        }
        this.C = lheVarH;
        lhe<Void> lheVarI2 = this.E.i();
        q qVar2 = this.A;
        Objects.requireNonNull(qVar2);
        lheVarI2.addListener(new r1s(qVar2), li3.d());
        bVarO.h(this.E);
        bVarO.f(new SessionConfig.c() { // from class: x2d
            @Override // androidx.camera.core.impl.SessionConfig.c
            public final void a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f38606a.g0(str, iVar, size, sessionConfig, sessionError);
            }
        });
        return bVarO;
    }

    public final mj3 Y(mj3 mj3Var) {
        List<androidx.camera.core.impl.f> listA = this.u.a();
        return (listA == null || listA.isEmpty()) ? mj3Var : nj3.a(listA);
    }

    public int Z() {
        return this.n;
    }

    public int b0() {
        int iN;
        synchronized (this.o) {
            iN = this.q;
            if (iN == -1) {
                iN = ((androidx.camera.core.impl.i) g()).N(2);
            }
        }
        return iN;
    }

    @IntRange(from = 1, to = 100)
    public final int c0() {
        androidx.camera.core.impl.i iVar = (androidx.camera.core.impl.i) g();
        if (iVar.f(androidx.camera.core.impl.i.J)) {
            return iVar.R();
        }
        int i2 = this.n;
        if (i2 == 0) {
            return 100;
        }
        if (i2 == 1 || i2 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.n + " is invalid");
    }

    public lhe<Void> e0(final h hVar) {
        mj3 mj3VarY;
        String strO;
        zpe.a("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.B != null) {
            mj3VarY = Y(nj3.c());
            if (mj3VarY == null) {
                return oua.f(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.w == null && mj3VarY.a().size() > 1) {
                return oua.f(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (mj3VarY.a().size() > this.v) {
                return oua.f(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.B.t(mj3VarY);
            this.B.u(li3.a(), new p.f() { // from class: c3d
                @Override // androidx.camera.core.p.f
                public final void a(String str, Throwable th) {
                    j.h0(hVar, str, th);
                }
            });
            strO = this.B.o();
        } else {
            mj3VarY = Y(nj3.c());
            if (mj3VarY.a().size() > 1) {
                return oua.f(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            strO = null;
        }
        for (androidx.camera.core.impl.f fVar : mj3VarY.a()) {
            androidx.camera.core.impl.e.a aVar = new androidx.camera.core.impl.e.a();
            aVar.p(this.t.g());
            aVar.e(this.t.d());
            aVar.a(this.z.p());
            aVar.f(this.E);
            if (i() == 256) {
                if (J.a()) {
                    aVar.d(androidx.camera.core.impl.e.h, Integer.valueOf(hVar.f1773a));
                }
                aVar.d(androidx.camera.core.impl.e.i, Integer.valueOf(hVar.f1774b));
            }
            aVar.e(fVar.a().d());
            if (strO != null) {
                aVar.g(strO, Integer.valueOf(fVar.getId()));
            }
            aVar.c(this.D);
            arrayList.add(aVar.h());
        }
        return oua.o(e().c(arrayList, this.n, this.p), new Function() { // from class: d3d
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return j.i0((List) obj);
            }
        }, li3.a());
    }

    public final /* synthetic */ void g0(String str, androidx.camera.core.impl.i iVar, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        U();
        if (p(str)) {
            SessionConfig.b bVarW = W(str, iVar, size);
            this.z = bVarW;
            I(bVarW.m());
            t();
        }
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> h(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config configA = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, Z());
        if (z) {
            configA = Config.G(configA, I.a());
        }
        if (configA == null) {
            return null;
        }
        return n(configA).b();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r.a<?, ?, ?> n(Config config) {
        return f.d(config);
    }

    public final /* synthetic */ Object n0(h hVar, final cb3.a aVar) throws Exception {
        this.A.d(new p5d.a() { // from class: a3d
            @Override // p5d.a
            public final void a(p5d p5dVar) {
                j.l0(aVar, p5dVar);
            }
        }, li3.d());
        o0();
        final lhe<Void> lheVarE0 = e0(hVar);
        oua.b(lheVarE0, new d(aVar), this.s);
        aVar.a(new Runnable() { // from class: b3d
            @Override // java.lang.Runnable
            public final void run() {
                lheVarE0.cancel(true);
            }
        }, li3.a());
        return "takePictureInternal";
    }

    public final void o0() {
        synchronized (this.o) {
            try {
                if (this.o.get() != null) {
                    return;
                }
                this.o.set(Integer.valueOf(b0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p0(Rational rational) {
        this.f1762r = rational;
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final lhe<m> f0(final h hVar) {
        return cb3.a(new cb3.c() { // from class: z2d
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f40807a.n0(hVar, aVar);
            }
        });
    }

    public final void r0() {
        synchronized (this.o) {
            try {
                if (this.o.get() != null) {
                    return;
                }
                e().g(b0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s0() {
        synchronized (this.o) {
            try {
                Integer andSet = this.o.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != b0()) {
                    r0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "ImageCapture:" + j();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void x() {
        androidx.camera.core.impl.i iVar = (androidx.camera.core.impl.i) g();
        this.t = androidx.camera.core.impl.e.a.j(iVar).h();
        this.w = iVar.M(null);
        this.v = iVar.S(2);
        this.u = iVar.K(nj3.c());
        this.x = iVar.V();
        this.y = iVar.U();
        g6i.h(d(), "Attached camera cannot be null");
        this.s = Executors.newFixedThreadPool(1, new e());
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void y() {
        r0();
    }
}
