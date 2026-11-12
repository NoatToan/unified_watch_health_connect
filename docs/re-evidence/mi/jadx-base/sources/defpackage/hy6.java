package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class hy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20598b;
    public final tpo<File> c;
    public final long d;
    public final long e;
    public final long f;
    public final fc8 g;
    public final CacheErrorLogger h;
    public final CacheEventListener i;
    public final uy6 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f20599k;
    public final boolean l;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20601b;
        public tpo<File> c;
        public long d;
        public long e;
        public long f;
        public fc8 g;
        public CacheErrorLogger h;
        public CacheEventListener i;
        public uy6 j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f20602k;
        public final Context l;

        public class a implements tpo<File> {
            public a() {
            }

            @Override // defpackage.tpo
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public File get() {
                return b.this.l.getApplicationContext().getCacheDir();
            }
        }

        public hy6 m() {
            b6i.j((this.c == null && this.l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.c == null && this.l != null) {
                this.c = new a();
            }
            return new hy6(this);
        }

        public b n(long j) {
            this.d = j;
            return this;
        }

        public b(Context context) {
            this.f20600a = 1;
            this.f20601b = "image_cache";
            this.d = 41943040L;
            this.e = 10485760L;
            this.f = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            this.g = new tu5();
            this.l = context;
        }
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String a() {
        return this.f20598b;
    }

    public tpo<File> b() {
        return this.c;
    }

    public CacheErrorLogger c() {
        return this.h;
    }

    public CacheEventListener d() {
        return this.i;
    }

    public Context e() {
        return this.f20599k;
    }

    public long f() {
        return this.d;
    }

    public uy6 g() {
        return this.j;
    }

    public fc8 h() {
        return this.g;
    }

    public boolean i() {
        return this.l;
    }

    public long j() {
        return this.e;
    }

    public long k() {
        return this.f;
    }

    public int l() {
        return this.f20597a;
    }

    public hy6(b bVar) {
        this.f20597a = bVar.f20600a;
        this.f20598b = (String) b6i.g(bVar.f20601b);
        this.c = (tpo) b6i.g(bVar.c);
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = (fc8) b6i.g(bVar.g);
        this.h = bVar.h == null ? com.facebook.cache.common.b.b() : bVar.h;
        this.i = bVar.i == null ? rug.i() : bVar.i;
        this.j = bVar.j == null ? tug.b() : bVar.j;
        this.f20599k = bVar.l;
        this.l = bVar.f20602k;
    }
}
