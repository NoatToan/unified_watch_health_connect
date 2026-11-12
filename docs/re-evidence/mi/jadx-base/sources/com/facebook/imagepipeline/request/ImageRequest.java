package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.b5i;
import defpackage.c83;
import defpackage.c93;
import defpackage.fmf;
import defpackage.i4h;
import defpackage.idq;
import defpackage.jxk;
import defpackage.l3d;
import defpackage.ook;
import defpackage.ypk;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ImageRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheChoice f7128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f7129b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final l3d g;
    public final ypk h;
    public final jxk i;
    public final c83 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Priority f7130k;
    public final RequestLevel l;
    public final boolean m;
    public final boolean n;
    public final Boolean o;
    public final b5i p;
    public final ook q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f7131r;

    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        RequestLevel(int i) {
            this.mValue = i;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            return requestLevel.getValue() > requestLevel2.getValue() ? requestLevel : requestLevel2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        this.f7128a = imageRequestBuilder.d();
        Uri uriM = imageRequestBuilder.m();
        this.f7129b = uriM;
        this.c = s(uriM);
        this.e = imageRequestBuilder.q();
        this.f = imageRequestBuilder.o();
        this.g = imageRequestBuilder.e();
        this.h = imageRequestBuilder.j();
        this.i = imageRequestBuilder.l() == null ? jxk.a() : imageRequestBuilder.l();
        this.j = imageRequestBuilder.c();
        this.f7130k = imageRequestBuilder.i();
        this.l = imageRequestBuilder.f();
        this.m = imageRequestBuilder.n();
        this.n = imageRequestBuilder.p();
        this.o = imageRequestBuilder.G();
        this.p = imageRequestBuilder.g();
        this.q = imageRequestBuilder.h();
        this.f7131r = imageRequestBuilder.k();
    }

    public static ImageRequest a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.r(uri).a();
    }

    public static int s(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (idq.k(uri)) {
            return 0;
        }
        if (idq.i(uri)) {
            return fmf.c(fmf.b(uri.getPath())) ? 2 : 3;
        }
        if (idq.h(uri)) {
            return 4;
        }
        if (idq.e(uri)) {
            return 5;
        }
        if (idq.j(uri)) {
            return 6;
        }
        if (idq.d(uri)) {
            return 7;
        }
        return idq.l(uri) ? 8 : -1;
    }

    public c83 b() {
        return this.j;
    }

    public CacheChoice c() {
        return this.f7128a;
    }

    public l3d d() {
        return this.g;
    }

    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (!i4h.a(this.f7129b, imageRequest.f7129b) || !i4h.a(this.f7128a, imageRequest.f7128a) || !i4h.a(this.d, imageRequest.d) || !i4h.a(this.j, imageRequest.j) || !i4h.a(this.g, imageRequest.g) || !i4h.a(this.h, imageRequest.h) || !i4h.a(this.i, imageRequest.i)) {
            return false;
        }
        b5i b5iVar = this.p;
        c93 c93VarB = b5iVar != null ? b5iVar.b() : null;
        b5i b5iVar2 = imageRequest.p;
        return i4h.a(c93VarB, b5iVar2 != null ? b5iVar2.b() : null);
    }

    public RequestLevel f() {
        return this.l;
    }

    public b5i g() {
        return this.p;
    }

    public int h() {
        ypk ypkVar = this.h;
        if (ypkVar != null) {
            return ypkVar.f40405b;
        }
        return 2048;
    }

    public int hashCode() {
        b5i b5iVar = this.p;
        return i4h.b(this.f7128a, this.f7129b, this.d, this.j, this.g, this.h, this.i, b5iVar != null ? b5iVar.b() : null, this.f7131r);
    }

    public int i() {
        ypk ypkVar = this.h;
        if (ypkVar != null) {
            return ypkVar.f40404a;
        }
        return 2048;
    }

    public Priority j() {
        return this.f7130k;
    }

    public boolean k() {
        return this.e;
    }

    public ook l() {
        return this.q;
    }

    public ypk m() {
        return this.h;
    }

    public Boolean n() {
        return this.f7131r;
    }

    public jxk o() {
        return this.i;
    }

    public synchronized File p() {
        try {
            if (this.d == null) {
                this.d = new File(this.f7129b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public Uri q() {
        return this.f7129b;
    }

    public int r() {
        return this.c;
    }

    public boolean t() {
        return this.m;
    }

    public String toString() {
        return i4h.d(this).b(SportRecordBundleKey.BUNDLE_PARAM_URI, this.f7129b).b("cacheChoice", this.f7128a).b("decodeOptions", this.g).b("postprocessor", this.p).b("priority", this.f7130k).b("resizeOptions", this.h).b("rotationOptions", this.i).b("bytesRange", this.j).b("resizingAllowedOverride", this.f7131r).toString();
    }

    public boolean u() {
        return this.n;
    }

    public Boolean v() {
        return this.o;
    }
}
