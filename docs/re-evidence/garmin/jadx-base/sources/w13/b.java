package w13;

import aa2.k;
import aa2.o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.inputmethod.ExtractedText;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.util.InvalidApduResponseException;
import gl1.y;
import i3.mc;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.t1;
import l72.c1;
import l72.w;
import o13.p;
import o13.r;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.u;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import pt2.g;
import s5.w0;
import t13.i;
import vb.h;
import w21.d;
import w51.j;
import w51.n0;
import w52.h1;
import wd2.f0;
import wv0.v;
import x5.l0;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    public static final void a(e23.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-192987826);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_behavior_selection_limit_reached);
            String strP = y.P(R.string.msg_behavior_selection_limit_reached, new Object[]{50}, o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new j(aVar, 22);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j(aVar, 22);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, strQ, strP, null, null, strQ2, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(aVar, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    public static final void b(String str, mc mcVar, e23.a aVar, e eVar, m mVar, int i14) {
        e eVar2;
        o0 o0VarL = h.l(-530183377, aVar, str, mVar);
        int i15 = 16;
        int i16 = i14 | (o0VarL.B(str) ? 4 : 2) | (o0VarL.B(mcVar) ? 32 : 16) | (o0VarL.r(aVar) ? 256 : 128);
        if (o0VarL.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            w wVar = w.f111301a;
            e eVarC = f.c(-1796903248, new n0(aVar, 15), o0VarL);
            boolean z14 = (i16 & 896) == 256;
            Object objQ = o0VarL.q();
            if (z14) {
                objQ = new v(aVar, 18);
                o0VarL.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new v(aVar, 18);
                    o0VarL.K(objQ);
                }
            }
            eVar2 = eVar;
            wVar.f(str, null, null, eVarC, (e23.a) objQ, mcVar, true, null, f.c(-2001280314, new k(eVar2, i15), o0VarL), o0VarL, (i16 & 14) | 806882304 | ((i16 << 12) & 458752), 390);
        } else {
            eVar2 = eVar;
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(str, mcVar, aVar, eVar2, i14, 26);
        }
    }

    public static final void c(e eVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1835214508);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            eVar.invoke(h1.f182536a, o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(eVar, i14, 18);
        }
    }

    public static byte[] d(int i14) {
        return new byte[]{(byte) ((i14 >> 24) % 256), (byte) ((i14 >> 16) % 256), (byte) ((i14 >> 8) % 256), (byte) (i14 % 256)};
    }

    public static final void e(com.garmin.android.apps.connectmobile.repcounting.model.e eVar, xd1.d dVar, xd1.c cVar, String str) {
        double dLongValue;
        Long lH;
        Long lZ;
        List<String> list = dVar.f190025h;
        boolean z14 = eVar.Z() == null || ((lZ = eVar.Z()) != null && lZ.longValue() == -1);
        Long lH2 = (eVar.H() == null || ((lH = eVar.H()) != null && lH.longValue() == -2)) ? 0L : eVar.H();
        double dA = ss.f.a(eVar.Z());
        if (z14) {
            dLongValue = -1.0d;
        } else {
            dLongValue = (lH2 != null ? lH2.longValue() : 0L) * dA;
        }
        long j8 = cVar.f190013b;
        Double D = eVar.D();
        cVar.f190013b = j8 + (D != null ? MathKt.d(D.doubleValue()) : 0L);
        cVar.f190014c += lH2 != null ? lH2.longValue() : 0L;
        cVar.f190015d += dA;
        cVar.f190016e += dLongValue;
        cVar.f190017f = cVar.f190017f && z14;
        long j14 = dVar.f190019b;
        Double D2 = eVar.D();
        dVar.f190019b = j14 + (D2 != null ? MathKt.d(D2.doubleValue()) : 0L);
        dVar.f190020c += lH2 != null ? lH2.longValue() : 0L;
        dVar.f190021d += dA;
        dVar.f190022e += dLongValue;
        dVar.f190023f = dVar.f190023f && z14;
        if (str != null) {
            list.add(str);
            return;
        }
        List<String> list2 = eVar.f41124n;
        if (list2 != null) {
            list.addAll(list2);
        }
        List<String> list3 = eVar.f41125o;
        if (list3 != null) {
            dVar.f190026i.addAll(list3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [byte[], java.io.Serializable] */
    public static final Serializable f(ul2.c cVar, byte[] bArr, long j8, v13.c cVar2) throws InvalidApduResponseException {
        yr2.c cVar3;
        if (cVar2 instanceof yr2.c) {
            cVar3 = (yr2.c) cVar2;
            int i14 = cVar3.f199137b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar3.f199137b = i14 - Integer.MIN_VALUE;
            } else {
                cVar3 = new yr2.c(cVar2);
            }
        } else {
            cVar3 = new yr2.c(cVar2);
        }
        Object objA = cVar3.f199136a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f199137b;
        if (i15 == 0) {
            r.b(objA);
            cVar3.f199137b = 1;
            i iVar = new i(u13.f.b(cVar3));
            cVar.l(bArr, new yr2.b(iVar), j8);
            objA = iVar.a();
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        byte[] bArr2 = (byte[]) objA;
        if (bArr2 == null) {
            throw new InvalidApduResponseException("Null response");
        }
        p pVar = new p(h0.V0(u.B(bArr2)), h0.V0(u.b0(2, bArr2)));
        ?? r14 = (byte[]) pVar.f128594a;
        byte[] bArr3 = (byte[]) pVar.f128595b;
        if (Arrays.equals(bArr3, new byte[]{-112, 0})) {
            return r14;
        }
        throw new InvalidApduResponseException(am.j.m("Did not execute command successfully, status: ", hb2.d.b(bArr3), "."));
    }

    public static final c g(Enum[] enumArr) {
        enumArr.getClass();
        return new c(enumArr);
    }

    public static e13.p h(ul2.c cVar, byte[] bArr) {
        cVar.getClass();
        bArr.getClass();
        xj1.b bVar = new xj1.b(8, cVar, bArr);
        int i14 = w03.b.f181178a;
        return new e13.a(bVar).g(l13.a.f108328c);
    }

    public static final int i(int i14) {
        if (i14 < 3) {
            return R.color.lime_20_static;
        }
        if (3 <= i14 && i14 < 6) {
            return R.color.yellow_50_static;
        }
        if (6 > i14 || i14 >= 9) {
            return (9 > i14 || i14 >= 12) ? R.color.red_70_static : R.color.red_30_static;
        }
        return R.color.orange_30_static;
    }

    public static final float j(m mVar) {
        x1 x1Var = n.f135158a;
        float f75990b = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f75990b > 1.0f && f75990b <= 1.5f) {
            return wz1.b.f188181a;
        }
        if (f75990b > 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            return j92.b.f97901d.f97908g;
        }
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        return j92.b.f97901d.f97906e;
    }

    public static final SpannableStringBuilder k(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        String string = context.getString(R.string.no_value);
        string.getClass();
        int iG = 0;
        if (d53.u.y(str, string, false)) {
            iG = string.length();
        } else if (d53.w.z(str, ": ", false)) {
            length = d53.w.H(str, ": ", 0, false, 6) + 2;
        } else {
            iG = d53.w.G(' ', 0, 6, str);
        }
        if (iG != -1) {
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.GCMCardSecondaryValueCaption), iG, length, 18);
        }
        return spannableStringBuilder;
    }

    public static final void l(es2.a aVar, fs2.a aVar2) {
        aVar.getClass();
        fs2.a aVarI = aVar.i(aVar2.f73431f, aVar2.f73426a);
        if (aVarI == null) {
            aVar.d(aVar2);
            return;
        }
        long jCurrentTimeMillis = aVarI.f73436k;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        aVar2.f73436k = jCurrentTimeMillis;
        aVar.d(aVar2);
    }

    public static final boolean m(Throwable th3) {
        Class<?> superclass = th3.getClass();
        while (!s.g(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final ExtractedText n(l0 l0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = l0Var.f188878a.f157138b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j8 = l0Var.f188879b;
        extractedText.selectionStart = w0.h(j8);
        extractedText.selectionEnd = w0.g(j8);
        extractedText.flags = !d53.w.A(l0Var.f188878a.f157138b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final f0 o(g gVar) {
        gVar.getClass();
        return new f0(gVar.f141042a, gVar.f141043b);
    }
}
