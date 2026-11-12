package a92;

import com.google.android.exoplayer2.audio.WavUtil;
import d53.w;
import d6.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.q1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.y;
import p3.n;
import p3.x1;
import q4.g;
import s5.c;
import s5.i0;
import s5.m;
import s5.r0;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final c a(CharSequence charSequence, List list) {
        c.b bVar = new c.b(0, 1, null);
        int iH = w.H(charSequence, "<link>", 0, false, 6);
        int iH2 = w.H(charSequence, "</link>", 0, false, 6);
        if (iH != -1 && iH2 != -1) {
            bVar.b(charSequence.subSequence(0, iH).toString());
            String string = charSequence.subSequence(6 + iH, iH2).toString();
            m mVar = (m) h0.d0(list);
            if (mVar != null) {
                int iG = bVar.g(mVar);
                try {
                    bVar.b(string);
                    Unit unit = Unit.INSTANCE;
                    bVar.f(iG);
                } catch (Throwable th3) {
                    bVar.f(iG);
                    throw th3;
                }
            } else {
                bVar.b(string);
            }
            bVar.c(a(charSequence.subSequence(7 + iH2, charSequence.length()).toString(), h0.U(list, 1)));
        } else if (charSequence instanceof c) {
            bVar.c((c) charSequence);
        } else {
            bVar.f157141a.append(charSequence);
        }
        return bVar.k();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0097  */
    public static final c b(String str, List list, p3.m mVar) {
        str.getClass();
        list.getClass();
        d92.b.f58623a.getClass();
        long jA = d92.b.a(mVar).k().a();
        x1 x1Var = n.f135158a;
        mVar.C(1201295332);
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e23.a aVar = (e23.a) it.next();
            ArrayList arrayList2 = arrayList;
            r0 r0Var = new r0(new i0(jA, 0L, (f0) null, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (i) null, (q1) null, (s5.b0) null, (g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (j) null), null, null, null, 14, null);
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new a(aVar, 0);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVar, 0);
                    mVar.K(objQ);
                }
            }
            arrayList2.add(new m.a("", r0Var, (s5.n) objQ));
            arrayList = arrayList2;
        }
        mVar.f();
        c cVarA = a(str, arrayList);
        x1 x1Var2 = n.f135158a;
        return cVarA;
    }
}
