package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import defpackage.b5i;
import defpackage.b6i;
import defpackage.c83;
import defpackage.idq;
import defpackage.jxk;
import defpackage.k5d;
import defpackage.l3d;
import defpackage.ook;
import defpackage.ypk;

/* JADX INFO: loaded from: classes4.dex */
public class ImageRequestBuilder {
    public ook n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f7132a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageRequest.RequestLevel f7133b = ImageRequest.RequestLevel.FULL_FETCH;
    public ypk c = null;
    public jxk d = null;
    public l3d e = l3d.a();
    public ImageRequest.CacheChoice f = ImageRequest.CacheChoice.DEFAULT;
    public boolean g = k5d.g().a();
    public boolean h = false;
    public Priority i = Priority.HIGH;
    public b5i j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7134k = true;
    public boolean l = true;
    public Boolean m = null;
    public c83 o = null;
    public Boolean p = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    public static ImageRequestBuilder b(ImageRequest imageRequest) {
        return r(imageRequest.q()).v(imageRequest.d()).t(imageRequest.b()).u(imageRequest.c()).w(imageRequest.e()).x(imageRequest.f()).y(imageRequest.g()).z(imageRequest.k()).B(imageRequest.j()).C(imageRequest.m()).A(imageRequest.l()).D(imageRequest.o()).E(imageRequest.v());
    }

    public static ImageRequestBuilder r(Uri uri) {
        return new ImageRequestBuilder().F(uri);
    }

    public ImageRequestBuilder A(ook ookVar) {
        this.n = ookVar;
        return this;
    }

    public ImageRequestBuilder B(Priority priority) {
        this.i = priority;
        return this;
    }

    public ImageRequestBuilder C(ypk ypkVar) {
        this.c = ypkVar;
        return this;
    }

    public ImageRequestBuilder D(jxk jxkVar) {
        this.d = jxkVar;
        return this;
    }

    public ImageRequestBuilder E(Boolean bool) {
        this.m = bool;
        return this;
    }

    public ImageRequestBuilder F(Uri uri) {
        b6i.g(uri);
        this.f7132a = uri;
        return this;
    }

    public Boolean G() {
        return this.m;
    }

    public void H() {
        Uri uri = this.f7132a;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (idq.j(uri)) {
            if (!this.f7132a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.f7132a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f7132a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (idq.e(this.f7132a) && !this.f7132a.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
    }

    public ImageRequest a() {
        H();
        return new ImageRequest(this);
    }

    public c83 c() {
        return this.o;
    }

    public ImageRequest.CacheChoice d() {
        return this.f;
    }

    public l3d e() {
        return this.e;
    }

    public ImageRequest.RequestLevel f() {
        return this.f7133b;
    }

    public b5i g() {
        return this.j;
    }

    public ook h() {
        return this.n;
    }

    public Priority i() {
        return this.i;
    }

    public ypk j() {
        return this.c;
    }

    public Boolean k() {
        return this.p;
    }

    public jxk l() {
        return this.d;
    }

    public Uri m() {
        return this.f7132a;
    }

    public boolean n() {
        return this.f7134k && idq.k(this.f7132a);
    }

    public boolean o() {
        return this.h;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.g;
    }

    @Deprecated
    public ImageRequestBuilder s(boolean z) {
        return z ? D(jxk.a()) : D(jxk.d());
    }

    public ImageRequestBuilder t(c83 c83Var) {
        this.o = c83Var;
        return this;
    }

    public ImageRequestBuilder u(ImageRequest.CacheChoice cacheChoice) {
        this.f = cacheChoice;
        return this;
    }

    public ImageRequestBuilder v(l3d l3dVar) {
        this.e = l3dVar;
        return this;
    }

    public ImageRequestBuilder w(boolean z) {
        this.h = z;
        return this;
    }

    public ImageRequestBuilder x(ImageRequest.RequestLevel requestLevel) {
        this.f7133b = requestLevel;
        return this;
    }

    public ImageRequestBuilder y(b5i b5iVar) {
        this.j = b5iVar;
        return this;
    }

    public ImageRequestBuilder z(boolean z) {
        this.g = z;
        return this;
    }
}
