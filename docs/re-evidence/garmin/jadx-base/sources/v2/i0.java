package v2;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final void a(EditorInfo editorInfo, CharSequence charSequence, long j8, x5.q qVar, String[] strArr) {
        String str;
        int i14 = qVar.f188936e;
        boolean z14 = qVar.f188932a;
        int i15 = qVar.f188935d;
        x5.p.f188918b.getClass();
        int i16 = 3;
        int i17 = 6;
        if (i14 == x5.p.f188920d) {
            if (!z14) {
                i17 = 0;
            }
        } else if (i14 == 0) {
            i17 = 1;
        } else if (i14 == x5.p.f188921e) {
            i17 = 2;
        } else if (i14 == x5.p.f188925i) {
            i17 = 5;
        } else if (i14 == x5.p.f188924h) {
            i17 = 7;
        } else if (i14 == x5.p.f188922f) {
            i17 = 3;
        } else if (i14 == x5.p.f188923g) {
            i17 = 4;
        } else if (i14 != x5.p.f188926j) {
            vb.h.z("invalid ImeAction");
            return;
        }
        editorInfo.imeOptions = i17;
        x5.f0 f0Var = qVar.f188937f;
        if (f0Var != null && (str = f0Var.f188836a) != null) {
            editorInfo.privateImeOptions = str;
        }
        f1 f1Var = f1.f174990a;
        z5.c cVar = qVar.f188938g;
        f1Var.getClass();
        z5.c.f202441c.getClass();
        if (p005kotlin.jvm.internal.s.g(cVar, z5.c.f202442d)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<z5.b> it = cVar.f202443a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f202440a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        x5.v.f188954b.getClass();
        if (i15 == x5.v.f188955c) {
            i16 = 1;
        } else if (i15 == x5.v.f188956d) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i16 = 1;
        } else if (i15 == x5.v.f188957e) {
            i16 = 2;
        } else if (i15 != x5.v.f188958f) {
            if (i15 == x5.v.f188959g) {
                i16 = 17;
            } else if (i15 == x5.v.f188960h) {
                i16 = 33;
            } else if (i15 == x5.v.f188961i) {
                i16 = 129;
            } else if (i15 == x5.v.f188962j) {
                i16 = 18;
            } else {
                if (i15 != x5.v.f188963k) {
                    vb.h.z("Invalid Keyboard Type");
                    return;
                }
                i16 = 8194;
            }
        }
        editorInfo.inputType = i16;
        if (!z14 && (i16 & 1) == 1) {
            editorInfo.inputType = 131072 | i16;
            int i18 = qVar.f188936e;
            x5.p.f188918b.getClass();
            if (i18 == x5.p.f188920d) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int i19 = qVar.f188933b;
            x5.u.f188948b.getClass();
            if (i19 == x5.u.f188950d) {
                editorInfo.inputType |= 4096;
            } else if (i19 == x5.u.f188951e) {
                editorInfo.inputType |= 8192;
            } else if (i19 == x5.u.f188952f) {
                editorInfo.inputType |= 16384;
            }
            if (qVar.f188934c) {
                editorInfo.inputType |= 32768;
            }
        }
        s5.w0.a aVar = s5.w0.f157315b;
        editorInfo.initialSelStart = (int) (j8 >> 32);
        editorInfo.initialSelEnd = (int) (j8 & 4294967295L);
        m7.a.a(editorInfo, charSequence);
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        editorInfo.imeOptions |= 33554432;
        if (!t2.d.f161762a || i15 == x5.v.f188961i || i15 == x5.v.f188962j) {
            m7.a.b(editorInfo, false);
            return;
        }
        m7.a.b(editorInfo, true);
        h0.f175033a.getClass();
        editorInfo.setSupportedHandwritingGestures(p13.x.k(t8.n.p(), t8.n.z(), t8.n.x(), t8.n.y(), t8.n.A(), t8.n.B(), t8.n.C()));
        editorInfo.setSupportedHandwritingGesturePreviews(p13.u.m0(new Class[]{t8.n.p(), t8.n.z(), t8.n.x(), t8.n.y()}));
    }
}
