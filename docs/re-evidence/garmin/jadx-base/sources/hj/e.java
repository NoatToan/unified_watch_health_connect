package hj;

import android.graphics.Bitmap;
import com.bumptech.glide.k;

/* JADX INFO: loaded from: classes7.dex */
public class e extends fj.c<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // wi.u
    public final Class<c> a() {
        return c.class;
    }

    @Override // wi.u
    public final void b() {
        c cVar = (c) this.f71823a;
        cVar.stop();
        cVar.f83926d = true;
        g gVar = cVar.f83923a.f83933a;
        k kVar = gVar.f83938d;
        gVar.f83937c.clear();
        Bitmap bitmap = gVar.f83946l;
        if (bitmap != null) {
            gVar.f83939e.c(bitmap);
            gVar.f83946l = null;
        }
        gVar.f83940f = false;
        g.a aVar = gVar.f83943i;
        if (aVar != null) {
            kVar.j(aVar);
            gVar.f83943i = null;
        }
        g.a aVar2 = gVar.f83945k;
        if (aVar2 != null) {
            kVar.j(aVar2);
            gVar.f83945k = null;
        }
        g.a aVar3 = gVar.f83948n;
        if (aVar3 != null) {
            kVar.j(aVar3);
            gVar.f83948n = null;
        }
        gVar.f83935a.clear();
        gVar.f83944j = true;
    }

    @Override // wi.u
    public final int getSize() {
        g gVar = ((c) this.f71823a).f83923a.f83933a;
        return gVar.f83935a.a() + gVar.f83949o;
    }

    @Override // fj.c, wi.q
    public final void initialize() {
        ((c) this.f71823a).f83923a.f83933a.f83946l.prepareToDraw();
    }
}
