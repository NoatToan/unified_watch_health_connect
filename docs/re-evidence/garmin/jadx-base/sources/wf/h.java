package wf;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import androidx.lifecycle.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hf.f.c<cg.d.a> f184985a = new hf.f.c<>(cg.d.a.f27115a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hf.f.c<Bitmap.Config> f184986b = new hf.f.c<>(dg.u.f59505b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hf.f.c<ColorSpace> f184987c = new hf.f.c<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hf.f.c<Boolean> f184988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hf.f.c<b0> f184989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hf.f.c<Boolean> f184990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hf.f.c<Boolean> f184991g;

    static {
        Boolean bool = Boolean.TRUE;
        f184988d = new hf.f.c<>(bool);
        f184989e = new hf.f.c<>(null);
        f184990f = new hf.f.c<>(bool);
        f184991g = new hf.f.c<>(Boolean.FALSE);
    }

    public static final void a(f.a aVar) {
        aVar.b().b(f184990f, Boolean.FALSE);
    }

    public static final Bitmap.Config b(m mVar) {
        return (Bitmap.Config) hf.g.b(mVar, f184986b);
    }
}
