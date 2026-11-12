package ff0;

import android.app.Activity;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lff0/k;", "Lff0/i;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lff0/h;", "apiService", "<init>", "(Lff0/h;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements i, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f71075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf1.b f71076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jf0.a f71077c;

    public k(h hVar) {
        hVar.getClass();
        this.f71075a = hVar;
        this.f71076b = (qf1.b) KoinJavaComponent.get$default(qf1.b.class, null, null, 6, null);
        this.f71077c = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
    }

    @Override // ff0.i
    public final String a(long j8) {
        return this.f71077c.a(j8);
    }

    @Override // ff0.i
    public final Object b(v13.c cVar) {
        return this.f71076b.b(cVar);
    }

    @Override // ff0.i
    public final void d(long j8) {
        this.f71077c.d(j8);
    }

    @Override // ff0.i
    public final Exception f(Intent intent) {
        intent.getClass();
        return this.f71076b.f(intent);
    }

    @Override // ff0.i
    public final Object g(long j8, double d14, double d15, nf0.t tVar) {
        return f0.J(this, new j(this, j8, d14, d15, null), tVar);
    }

    @Override // ff0.i
    public final Object h(long j8, String str, v13.c cVar) {
        return this.f71076b.k(j8, str, cVar);
    }

    @Override // ff0.i
    public final Boolean i() {
        return Boolean.valueOf(this.f71076b.e());
    }

    @Override // ff0.i
    public final Object j(String str, nf0.j jVar) {
        return this.f71076b.a(str, jVar);
    }

    @Override // ff0.i
    public final Object k(long j8, String str, nf0.u uVar) {
        return this.f71076b.j(j8, str, uVar);
    }

    @Override // ff0.i
    public final Object l(Activity activity, nf0.g gVar) {
        return this.f71076b.h(activity, gVar);
    }

    @Override // ff0.i
    public final Object m(nf0.k kVar) {
        return this.f71076b.l(kVar);
    }

    @Override // ff0.i
    public final Object n(String str, nf0.f fVar) {
        return this.f71076b.i(str, fVar);
    }

    @Override // ff0.i
    public final Object o(long j8, String str, vf1.d dVar) {
        return this.f71076b.g(j8, str, dVar);
    }

    @Override // ff0.i
    public final Object q(t13.d<? super Boolean> dVar) {
        return this.f71076b.d((v13.c) dVar);
    }
}
