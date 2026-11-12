package go1;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.lifecycle.v1;
import b0.c1;
import com.garmin.android.apps.connectmobile.q1;
import com.google.common.util.concurrent.ListenableFuture;
import fo1.o0;
import fo1.w0;
import o53.s0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements q1.a, l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f78248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f78249e;

    public /* synthetic */ i(k kVar, String str, String str2, String str3, int i14) {
        this.f78246b = kVar;
        this.f78247c = str;
        this.f78248d = str2;
        this.f78249e = str3;
        this.f78245a = i14;
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        r0.o oVar = (r0.o) this.f78246b;
        r0.o.a aVar = (r0.o.a) this.f78247c;
        b0.g gVar = (b0.g) this.f78248d;
        c1.a aVar2 = (c1.a) this.f78249e;
        Surface surface = (Surface) obj;
        oVar.getClass();
        surface.getClass();
        try {
            aVar.d();
            r0.p pVar = new r0.p(surface, oVar.f148748f, this.f78245a, oVar.f148749g.f(), gVar, aVar2, oVar.f148744b);
            pVar.f148772k.addListener(new r0.m(aVar, 1), k0.b.a());
            k7.h.f(aVar.f148761q == null, "Consumer can only be linked once.");
            aVar.f148761q = pVar;
            return l0.j.e(pVar);
        } catch (DeferrableSurface.SurfaceClosedException e4) {
            l0.j.a aVar3 = l0.j.f107810a;
            return new l0.m.a(e4);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        k kVar = (k) this.f78246b;
        String str = (String) this.f78247c;
        String str2 = (String) this.f78248d;
        String str3 = (String) this.f78249e;
        int i14 = k.C;
        if (!z14) {
            kVar.y6().notifyItemChanged(this.f78245a);
            return;
        }
        g22.e.l(kVar);
        o0 o0VarC6 = kVar.C6();
        str.getClass();
        str2.getClass();
        str3.getClass();
        w9.a aVarA = v1.a(o0VarC6);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new w0(o0VarC6, str, str2, str3, null), 2);
        kVar.f78262l = false;
    }

    public /* synthetic */ i(r0.o oVar, r0.o.a aVar, int i14, b0.g gVar, c1.a aVar2) {
        this.f78246b = oVar;
        this.f78247c = aVar;
        this.f78245a = i14;
        this.f78248d = gVar;
        this.f78249e = aVar2;
    }
}
