package v2;

import android.view.inputmethod.HandwritingGesture;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/m0;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f175086a = new m0();

    private m0() {
    }

    public static int a(h2 h2Var, HandwritingGesture handwritingGesture) {
        u2.h hVar = h2Var.f175039a;
        h2.a aVar = h2.f175038e;
        x2.c cVar = x2.c.MergeIfPossible;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        dVar.f167836g = null;
        h2Var.l(dVar);
        u2.h.a(hVar, true, cVar);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        h2.h(h2Var, fallbackText, null, false, 12);
        return 5;
    }

    public static int b(HandwritingGesture handwritingGesture, uo1.a aVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        aVar.invoke(new x5.b(fallbackText, 1));
        return 5;
    }

    public static void c(h2 h2Var, long j8, int i14) {
        if (s5.w0.e(j8)) {
            u2.h hVar = h2Var.f175039a;
            h2.a aVar = h2.f175038e;
            x2.c cVar = x2.c.MergeIfPossible;
            hVar.f167847b.a().b();
            u2.d dVar = hVar.f167847b;
            dVar.f167836g = null;
            h2Var.l(dVar);
            u2.h.a(hVar, true, cVar);
            return;
        }
        long jE = h2Var.e(j8);
        u2.h hVar2 = h2Var.f175039a;
        x2.c cVar2 = x2.c.MergeIfPossible;
        hVar2.f167847b.a().b();
        u2.d dVar2 = hVar2.f167847b;
        int i15 = (int) (jE >> 32);
        int i16 = (int) (jE & 4294967295L);
        h1 h1Var = dVar2.f167831b;
        if (i15 >= i16) {
            vb.h.s(tn.k.e(i15, i16, "Do not set reversed or empty range: ", " > "));
            return;
        }
        dVar2.f167836g = new o13.p<>(u2.j.a(i14), s5.w0.a(og.a.l(j23.t.e(i15, 0, h1Var.length()), j23.t.e(i16, 0, h1Var.length()))));
        u2.h.a(hVar2, true, cVar2);
    }

    public static void d(long j8, s5.c cVar, boolean z14, uo1.a aVar) {
        if (z14) {
            j8 = o0.a(j8, cVar);
        }
        s5.w0.a aVar2 = s5.w0.f157315b;
        int i14 = (int) (4294967295L & j8);
        aVar.invoke(new n0(new x5.k[]{new x5.k0(i14, i14), new x5.i(s5.w0.f(j8), 0)}));
    }

    public static int e(int i14) {
        if (i14 == 1) {
            s5.m0.f157245b.getClass();
            return s5.m0.f157246c;
        }
        if (i14 != 2) {
            s5.m0.f157245b.getClass();
            return 0;
        }
        s5.m0.f157245b.getClass();
        return 0;
    }
}
