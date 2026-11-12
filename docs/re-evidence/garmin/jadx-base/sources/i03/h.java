package i03;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import j20.x;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView.BufferType f86946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i73.c f86947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f86948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<i> f86949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f86950e;

    public h(TextView.BufferType bufferType, e.a aVar, i73.c cVar, m mVar, g gVar, List<i> list, boolean z14) {
        this.f86946a = bufferType;
        this.f86947b = cVar;
        this.f86948c = mVar;
        this.f86949d = list;
        this.f86950e = z14;
    }

    public final void a(TextView textView, String str) {
        List<i> list = this.f86949d;
        Iterator<i> it = list.iterator();
        String strA = str;
        while (it.hasNext()) {
            strA = it.next().a(strA);
        }
        i73.c cVar = this.f86947b;
        cVar.getClass();
        if (strA == null) {
            x.l("input must not be null");
            return;
        }
        e73.h hVar = new e73.h(cVar.f92207a, cVar.f92209c, cVar.f92208b);
        int i14 = 0;
        while (true) {
            int length = strA.length();
            int i15 = i14;
            while (true) {
                if (i15 >= length) {
                    i15 = -1;
                    break;
                }
                char cCharAt = strA.charAt(i15);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 == -1) {
                break;
            }
            hVar.i(strA.substring(i14, i15));
            i14 = i15 + 1;
            if (i14 < strA.length() && strA.charAt(i15) == '\r' && strA.charAt(i14) == '\n') {
                i14 = i15 + 2;
            }
        }
        if (strA.length() > 0 && (i14 == 0 || i14 < strA.length())) {
            hVar.i(strA.substring(i14));
        }
        hVar.f(hVar.f63366n);
        e73.m mVar = new e73.m(hVar.f63363k, hVar.f63365m);
        ((i73.d) hVar.f63362j).getClass();
        e73.n nVar = new e73.n(mVar);
        Iterator it3 = hVar.f63367o.iterator();
        while (it3.hasNext()) {
            ((j73.d) it3.next()).f(nVar);
        }
        h73.r rVarA = hVar.f63364l.f63350a;
        Iterator it4 = cVar.f92210d.iterator();
        while (it4.hasNext()) {
            rVarA = ((i73.e) it4.next()).a();
        }
        Iterator<i> it5 = list.iterator();
        while (it5.hasNext()) {
            it5.next().getClass();
        }
        n nVarA = this.f86948c.a();
        rVarA.a(nVarA);
        Iterator<i> it6 = list.iterator();
        while (it6.hasNext()) {
            it6.next().getClass();
        }
        t tVar = nVarA.f86958c;
        tVar.getClass();
        SpannableStringBuilder bVar = new t.b(tVar.f86967a);
        for (t.a aVar : tVar.f86968b) {
            bVar.setSpan(aVar.f86969a, aVar.f86970b, aVar.f86971c, aVar.f86972d);
        }
        if (TextUtils.isEmpty(bVar) && this.f86950e && !TextUtils.isEmpty(str)) {
            bVar = new SpannableStringBuilder(str);
        }
        Iterator<i> it7 = list.iterator();
        while (it7.hasNext()) {
            it7.next().d(textView, bVar);
        }
        textView.setText(bVar, this.f86946a);
        Iterator<i> it8 = list.iterator();
        while (it8.hasNext()) {
            it8.next().c(textView);
        }
    }
}
