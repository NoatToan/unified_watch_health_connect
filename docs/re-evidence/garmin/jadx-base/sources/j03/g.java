package j03;

import h73.w;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class g implements i03.k.c<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f96176a;

    public g(p pVar) {
        this.f96176a = pVar;
    }

    @Override // i03.k.c
    public final void a(i03.n nVar, h73.r rVar) {
        String str = ((w) rVar).f82386f;
        nVar.f86958c.f86967a.append(str);
        p pVar = this.f96176a;
        if (pVar.f96177a.isEmpty()) {
            return;
        }
        nVar.d();
        str.length();
        Iterator it = pVar.f96177a.iterator();
        while (it.hasNext()) {
            ((p.a) it.next()).a();
        }
    }
}
