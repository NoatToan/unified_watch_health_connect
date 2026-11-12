package v2;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public static final void a(u2.d dVar, int i14, int i15) {
        s5.w0 w0Var = dVar.f167834e;
        int iMin = Math.min(i14, i15);
        int iMax = Math.max(i14, i15);
        dVar.c(iMin, iMax, "");
        if (w0Var != null) {
            long jM = og2.k.m(iMin, iMax, 0, w0Var.f157317a);
            if (s5.w0.e(jM)) {
                dVar.e(null);
            } else {
                dVar.d(s5.w0.h(jM), s5.w0.g(jM), null);
            }
        }
    }

    public static final void b(u2.d dVar, int i14, int i15, CharSequence charSequence) {
        int iMin = Math.min(i14, i15);
        int iMax = Math.max(i14, i15);
        int i16 = 0;
        int i17 = iMin;
        while (i17 < iMax && i16 < charSequence.length() && charSequence.charAt(i16) == dVar.f167831b.charAt(i17)) {
            i16++;
            i17++;
        }
        int length = charSequence.length();
        while (iMax > i17 && length > i16 && charSequence.charAt(length - 1) == dVar.f167831b.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i17 == iMax && i16 == length) {
            dVar.e(null);
            dVar.f167836g = null;
        } else {
            dVar.c(i17, iMax, charSequence.subSequence(i16, length));
        }
        int length2 = charSequence.length() + iMin;
        dVar.f(og.a.l(length2, length2));
    }
}
