package defpackage;

import android.net.Uri;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class j5d {
    public static final CancellationException m = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ibi f22432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ook f22433b;
    public final tpo<Boolean> c;
    public final gpf<c93, u14> d;
    public final gpf<c93, PooledByteBuffer> e;
    public final z53 f;
    public final z53 g;
    public final f93 h;
    public final scp i;
    public final tpo<Boolean> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicLong f22434k = new AtomicLong();
    public final tpo<Boolean> l;

    public class a implements j6i<c93> {
        public a() {
        }

        @Override // defpackage.j6i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(c93 c93Var) {
            return true;
        }
    }

    public class b implements j6i<c93> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f22436a;

        public b(Uri uri) {
            this.f22436a = uri;
        }

        @Override // defpackage.j6i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(c93 c93Var) {
            return c93Var.b(this.f22436a);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22438a;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            f22438a = iArr;
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22438a[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public j5d(ibi ibiVar, Set<ook> set, tpo<Boolean> tpoVar, gpf<c93, u14> gpfVar, gpf<c93, PooledByteBuffer> gpfVar2, z53 z53Var, z53 z53Var2, f93 f93Var, scp scpVar, tpo<Boolean> tpoVar2, tpo<Boolean> tpoVar3) {
        this.f22432a = ibiVar;
        this.f22433b = new v1a(set);
        this.c = tpoVar;
        this.d = gpfVar;
        this.e = gpfVar2;
        this.f = z53Var;
        this.g = z53Var2;
        this.h = f93Var;
        this.i = scpVar;
        this.j = tpoVar2;
        this.l = tpoVar3;
    }

    public void a() {
        c();
        b();
    }

    public void b() {
        this.f.i();
        this.g.i();
    }

    public void c() {
        a aVar = new a();
        this.d.c(aVar);
        this.e.c(aVar);
    }

    public cp5<w14<u14>> d(ImageRequest imageRequest, Object obj) {
        return e(imageRequest, obj, ImageRequest.RequestLevel.FULL_FETCH);
    }

    public cp5<w14<u14>> e(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        return f(imageRequest, obj, requestLevel, null);
    }

    public cp5<w14<u14>> f(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, ook ookVar) {
        try {
            return t(this.f22432a.g(imageRequest), imageRequest, requestLevel, obj, ookVar);
        } catch (Exception e) {
            return gp5.b(e);
        }
    }

    public cp5<w14<u14>> g(ImageRequest imageRequest, Object obj) {
        return e(imageRequest, obj, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
    }

    public String h() {
        return String.valueOf(this.f22434k.getAndIncrement());
    }

    public gpf<c93, u14> i() {
        return this.d;
    }

    public f93 j() {
        return this.h;
    }

    public ook k(ImageRequest imageRequest, ook ookVar) {
        if (ookVar == null) {
            return imageRequest.l() == null ? this.f22433b : new v1a(this.f22433b, imageRequest.l());
        }
        return imageRequest.l() == null ? new v1a(this.f22433b, ookVar) : new v1a(this.f22433b, ookVar, imageRequest.l());
    }

    public boolean l(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.d.b(q(uri));
    }

    public boolean m(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        w14<u14> w14Var = this.d.get(this.h.c(imageRequest, null));
        try {
            return w14.y(w14Var);
        } finally {
            w14.l(w14Var);
        }
    }

    public boolean n(Uri uri) {
        return o(uri, ImageRequest.CacheChoice.SMALL) || o(uri, ImageRequest.CacheChoice.DEFAULT);
    }

    public boolean o(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        return p(ImageRequestBuilder.r(uri).u(cacheChoice).a());
    }

    public boolean p(ImageRequest imageRequest) {
        c93 c93VarB = this.h.b(imageRequest, null);
        int i = c.f22438a[imageRequest.c().ordinal()];
        if (i == 1) {
            return this.f.k(c93VarB);
        }
        if (i != 2) {
            return false;
        }
        return this.g.k(c93VarB);
    }

    public final j6i<c93> q(Uri uri) {
        return new b(uri);
    }

    public cp5<Void> r(ImageRequest imageRequest, Object obj) {
        return s(imageRequest, obj, Priority.MEDIUM);
    }

    public cp5<Void> s(ImageRequest imageRequest, Object obj, Priority priority) {
        if (!this.c.get().booleanValue()) {
            return gp5.b(m);
        }
        try {
            return u(this.f22432a.h(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, priority);
        } catch (Exception e) {
            return gp5.b(e);
        }
    }

    public final <T> cp5<w14<T>> t(dbi<w14<T>> dbiVar, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, ook ookVar) {
        if (epa.d()) {
            epa.a("ImagePipeline#submitFetchRequest");
        }
        ook ookVarK = k(imageRequest, ookVar);
        try {
            return v14.z(dbiVar, new o0m(imageRequest, h(), ookVarK, obj, ImageRequest.RequestLevel.getMax(imageRequest.f(), requestLevel), false, imageRequest.k() || !idq.k(imageRequest.q()), imageRequest.j()), ookVarK);
        } catch (Exception e) {
            return gp5.b(e);
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    public final cp5<Void> u(dbi<Void> dbiVar, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, Priority priority) {
        ook ookVarK = k(imageRequest, null);
        try {
            return jbi.y(dbiVar, new o0m(imageRequest, h(), ookVarK, obj, ImageRequest.RequestLevel.getMax(imageRequest.f(), requestLevel), true, false, priority), ookVarK);
        } catch (Exception e) {
            return gp5.b(e);
        }
    }
}
