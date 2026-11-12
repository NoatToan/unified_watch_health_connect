package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b4q {
    public static void a(Spannable spannable, int i, int i2, c4q c4qVar, z3q z3qVar, Map<String, c4q> map, int i3) {
        z3q z3qVarE;
        int i4;
        if (c4qVar.l() != -1) {
            spannable.setSpan(new StyleSpan(c4qVar.l()), i, i2, 33);
        }
        if (c4qVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c4qVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c4qVar.q()) {
            d5n.a(spannable, new ForegroundColorSpan(c4qVar.c()), i, i2, 33);
        }
        if (c4qVar.p()) {
            d5n.a(spannable, new BackgroundColorSpan(c4qVar.b()), i, i2, 33);
        }
        if (c4qVar.d() != null) {
            d5n.a(spannable, new TypefaceSpan(c4qVar.d()), i, i2, 33);
        }
        if (c4qVar.o() != null) {
            v7p v7pVar = (v7p) rk1.e(c4qVar.o());
            int i5 = v7pVar.f36598a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = v7pVar.f36599b;
            }
            int i6 = v7pVar.c;
            if (i6 == -2) {
                i6 = 1;
            }
            d5n.a(spannable, new w7p(i5, i4, i6), i, i2, 33);
        }
        int iJ = c4qVar.j();
        if (iJ == 2) {
            z3q z3qVarD = d(z3qVar, map);
            if (z3qVarD != null && (z3qVarE = e(z3qVarD, map)) != null) {
                if (z3qVarE.g() != 1 || z3qVarE.f(0).f40850b == null) {
                    toe.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) wlq.j(z3qVarE.f(0).f40850b);
                    c4q c4qVar2 = z3qVarD.f;
                    spannable.setSpan(new r0l(str, c4qVar2 != null ? c4qVar2.i() : -1), i, i2, 33);
                }
            }
        } else if (iJ == 3 || iJ == 4) {
            spannable.setSpan(new yy5(), i, i2, 33);
        }
        if (c4qVar.n()) {
            d5n.a(spannable, new qac(), i, i2, 33);
        }
        int iF = c4qVar.f();
        if (iF == 1) {
            d5n.a(spannable, new AbsoluteSizeSpan((int) c4qVar.e(), true), i, i2, 33);
        } else if (iF == 2) {
            d5n.a(spannable, new RelativeSizeSpan(c4qVar.e()), i, i2, 33);
        } else {
            if (iF != 3) {
                return;
            }
            d5n.a(spannable, new RelativeSizeSpan(c4qVar.e() / 100.0f), i, i2, 33);
        }
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static z3q d(z3q z3qVar, Map<String, c4q> map) {
        while (z3qVar != null) {
            c4q c4qVarF = f(z3qVar.f, z3qVar.l(), map);
            if (c4qVarF != null && c4qVarF.j() == 1) {
                return z3qVar;
            }
            z3qVar = z3qVar.j;
        }
        return null;
    }

    public static z3q e(z3q z3qVar, Map<String, c4q> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(z3qVar);
        while (!arrayDeque.isEmpty()) {
            z3q z3qVar2 = (z3q) arrayDeque.pop();
            c4q c4qVarF = f(z3qVar2.f, z3qVar2.l(), map);
            if (c4qVarF != null && c4qVarF.j() == 3) {
                return z3qVar2;
            }
            for (int iG = z3qVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(z3qVar2.f(iG));
            }
        }
        return null;
    }

    public static c4q f(c4q c4qVar, String[] strArr, Map<String, c4q> map) {
        int i = 0;
        if (c4qVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                c4q c4qVar2 = new c4q();
                int length = strArr.length;
                while (i < length) {
                    c4qVar2.a(map.get(strArr[i]));
                    i++;
                }
                return c4qVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c4qVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c4qVar.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c4qVar;
    }
}
