package nf;

import android.graphics.Bitmap;
import d53.w;
import dg.t;
import dg.u;
import hf.y;
import lf.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnf/k;", "Lnf/j;", "Lhf/y;", "uri", "Lwf/m;", "options", "<init>", "(Lhf/y;Lwf/m;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f125753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125754b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/k$a;", "Lnf/j$a;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<y> {
        @Override // nf.j.a
        public final j a(y yVar, wf.m mVar, hf.j jVar) {
            y yVar2 = yVar;
            t.a aVar = t.f59501a;
            String str = yVar2.f83620c;
            if ((str != null && !str.equals("file")) || yVar2.f83622e == null) {
                return null;
            }
            Bitmap.Config[] configArr = u.f59504a;
            if (s.g(yVar2.f83620c, "file") && s.g(h0.d0(gg.b.C(yVar2)), "android_asset")) {
                return null;
            }
            return new k(yVar2, mVar);
        }
    }

    public k(y yVar, wf.m mVar) {
        this.f125753a = yVar;
        this.f125754b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) {
        w63.y.a aVar = w63.y.f183408b;
        String strV = gg.b.v(this.f125753a);
        if (strV == null) {
            vb.h.z("filePath == null");
            return null;
        }
        aVar.getClass();
        w63.y yVarA = w63.y.a.a(strV);
        lf.n nVarA = p.a(yVarA, this.f125754b.f185001f, null, null, 28);
        dg.n nVar = dg.n.f59492a;
        String strD0 = w.d0('.', yVarA.b(), "");
        nVar.getClass();
        return new o(nVarA, dg.n.a(strD0), lf.e.DISK);
    }
}
