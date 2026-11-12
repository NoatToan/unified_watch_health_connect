package yr2;

import android.text.SpannableStringBuilder;
import o13.t;
import wr2.u;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f199140a = o13.m.b(new ya0.j(25));

    public static final SpannableStringBuilder a(e23.l lVar, String str) {
        d53.j jVarB;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = 0;
        int i14 = 0;
        do {
            jVarB = ((d53.k) f199140a.getValue()).b(length, str);
            if (jVarB != null) {
                SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(str.subSequence(length, jVarB.b().f96796a));
                CharSequence charSequence = (CharSequence) ((d53.j.a) jVarB.a()).get(1);
                u uVar = u.f186888a;
                e23.a aVar = (e23.a) lVar.invoke(Integer.valueOf(i14));
                uVar.getClass();
                aVar.getClass();
                spannableStringBuilderAppend.append(charSequence, new wr2.t(aVar), 0);
                length = jVarB.b().f96797b + 1;
                i14++;
            } else {
                spannableStringBuilder.append(str.subSequence(length, str.length()));
                length = str.length();
            }
        } while (jVarB != null);
        return spannableStringBuilder;
    }
}
