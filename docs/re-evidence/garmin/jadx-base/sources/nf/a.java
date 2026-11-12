package nf;

import android.graphics.Bitmap;
import dg.u;
import hf.y;
import lf.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import w63.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnf/a;", "Lnf/j;", "Lhf/y;", "data", "Lwf/m;", "options", "<init>", "(Lhf/y;Lwf/m;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f125737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125738b;

    /* JADX INFO: renamed from: nf.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/a$a;", "Lnf/j$a;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2419a implements j.a<y> {
        @Override // nf.j.a
        public final j a(y yVar, wf.m mVar, hf.j jVar) {
            y yVar2 = yVar;
            Bitmap.Config[] configArr = u.f59504a;
            if (s.g(yVar2.f83620c, "file") && s.g(h0.d0(gg.b.C(yVar2)), "android_asset")) {
                return new a(yVar2, mVar);
            }
            return null;
        }
    }

    public a(y yVar, wf.m mVar) {
        this.f125737a = yVar;
        this.f125738b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) {
        String strK0 = h0.k0(h0.U(gg.b.C(this.f125737a), 1), "/", null, null, null, 62);
        wf.m mVar = this.f125738b;
        r rVar = new r(new b0(w5.r.y(mVar.f184996a.getAssets().open(strK0))), mVar.f185001f, new lf.a(strK0));
        dg.n.f59492a.getClass();
        return new o(rVar, dg.n.b(strK0), lf.e.DISK);
    }
}
