package defpackage;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class g5d extends mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7g f18614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5d f18615b;

    public g5d(q7g q7gVar, h5d h5dVar) {
        this.f18614a = q7gVar;
        this.f18615b = h5dVar;
    }

    @Override // defpackage.mb2, defpackage.ook
    public void b(ImageRequest imageRequest, String str, boolean z) {
        this.f18615b.n(this.f18614a.now());
        this.f18615b.m(imageRequest);
        this.f18615b.t(str);
        this.f18615b.s(z);
    }

    @Override // defpackage.mb2, defpackage.ook
    public void e(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f18615b.o(this.f18614a.now());
        this.f18615b.m(imageRequest);
        this.f18615b.c(obj);
        this.f18615b.t(str);
        this.f18615b.s(z);
    }

    @Override // defpackage.mb2, defpackage.ook
    public void j(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.f18615b.n(this.f18614a.now());
        this.f18615b.m(imageRequest);
        this.f18615b.t(str);
        this.f18615b.s(z);
    }

    @Override // defpackage.mb2, defpackage.ook
    public void k(String str) {
        this.f18615b.n(this.f18614a.now());
        this.f18615b.t(str);
    }
}
