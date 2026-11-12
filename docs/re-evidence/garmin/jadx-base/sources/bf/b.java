package bf;

import cf.t;
import p005kotlin.jvm.internal.s;
import ue.f;
import ve.p;
import ve.y0;
import ye.l;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f17779b;

    public b(c cVar, String str) {
        this.f17779b = cVar;
        this.f17778a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        p pVar = this.f17779b.f17781a.f177609g;
        String str = this.f17778a;
        synchronized (pVar.f177591k) {
            try {
                y0 y0VarC = pVar.c(str);
                tVar = y0VarC != null ? y0VarC.f177633a : null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (tVar == null || s.g(f.f170042j, tVar.f26950j)) {
            return;
        }
        synchronized (this.f17779b.f17783c) {
            this.f17779b.f17786f.put(jg.b.w(tVar), tVar);
            c cVar = this.f17779b;
            this.f17779b.f17787g.put(jg.b.w(tVar), l.a(cVar.f17788h, tVar, cVar.f17782b.a(), this.f17779b));
        }
    }
}
