package j03;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import h73.u;
import h73.v;
import h73.w;
import h73.x;
import i03.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class p extends i03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f96177a = new ArrayList(0);

    public interface a {
        void a();
    }

    public static void g(i03.n nVar, String str, String str2, h73.a aVar) {
        nVar.b();
        int iD = nVar.d();
        t tVar = nVar.f86958c;
        tVar.f86967a.append((char) 160);
        StringBuilder sb3 = tVar.f86967a;
        sb3.append('\n');
        nVar.f86956a.f86935b.getClass();
        tVar.b(sb3.length(), str2);
        sb3.append((CharSequence) str2);
        nVar.c();
        tVar.a((char) 160);
        q.f96184g.b(nVar.f86957b, str);
        nVar.e(aVar, iD);
        nVar.a(aVar);
    }

    @Override // i03.a, i03.i
    public final void b(i03.j.a aVar) {
        k03.b bVar = new k03.b();
        aVar.b(v.class, new k03.h());
        aVar.b(h73.f.class, new k03.d());
        aVar.b(h73.b.class, new k03.a());
        aVar.b(h73.d.class, new k03.c());
        aVar.b(h73.g.class, bVar);
        aVar.b(h73.m.class, bVar);
        aVar.b(h73.q.class, new k03.g());
        aVar.b(h73.i.class, new k03.e());
        aVar.b(h73.n.class, new k03.f());
        aVar.b(x.class, new k03.i());
    }

    @Override // i03.a, i03.i
    public final void c(TextView textView) {
        if (textView.getMovementMethod() == null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // i03.a, i03.i
    public final void d(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        l03.i[] iVarArr = (l03.i[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), l03.i.class);
        if (iVarArr != null) {
            TextPaint paint = textView.getPaint();
            for (l03.i iVar : iVarArr) {
                iVar.f108041d = (int) (paint.measureText(iVar.f108039b) + 0.5f);
            }
        }
        l03.k[] kVarArr = (l03.k[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), l03.k.class);
        if (kVarArr != null) {
            for (l03.k kVar : kVarArr) {
                spannableStringBuilder.removeSpan(kVar);
            }
        }
        spannableStringBuilder.setSpan(new l03.k(textView), 0, spannableStringBuilder.length(), 18);
    }

    @Override // i03.a, i03.i
    public final void e(i03.n.a aVar) {
        aVar.a(w.class, new g(this));
        aVar.a(v.class, new h());
        aVar.a(h73.f.class, new i());
        aVar.a(h73.b.class, new j());
        aVar.a(h73.d.class, new k());
        aVar.a(h73.g.class, new l());
        aVar.a(h73.m.class, new m());
        aVar.a(h73.l.class, new n());
        aVar.a(h73.c.class, new s());
        aVar.a(h73.s.class, new s());
        aVar.a(h73.q.class, new o());
        aVar.a(x.class, new j03.a());
        aVar.a(h73.i.class, new b());
        aVar.a(u.class, new c());
        aVar.a(h73.h.class, new d());
        aVar.a(h73.t.class, new e());
        aVar.a(h73.n.class, new f());
    }
}
