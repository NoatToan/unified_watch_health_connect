package v2;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import kotlin.a4;
import kotlin.g3;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f175046a = {"*/*", "image/*", "video/*"};

    public static final boolean a(int i14, KeyEvent keyEvent) {
        return ((int) (z4.d.a(keyEvent) >> 32)) == i14;
    }

    public static final ExtractedText b(x5.l0 l0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = l0Var.f188878a.f157138b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j8 = l0Var.f188879b;
        extractedText.selectionStart = s5.w0.h(j8);
        extractedText.selectionEnd = s5.w0.g(j8);
        extractedText.flags = !d53.w.A(l0Var.f188878a.f157138b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long c(long j8, n4.d dVar) {
        int i14 = (int) (j8 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        float fIntBitsToFloat2 = dVar.f123547a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i14);
            fIntBitsToFloat2 = dVar.f123549c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i14);
            }
        }
        int i15 = (int) (j8 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i15);
        float fIntBitsToFloat5 = dVar.f123548b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i15);
            fIntBitsToFloat5 = dVar.f123550d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i15);
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final float d(long j8, n4.d dVar) {
        if (z2.p1.a(j8, dVar)) {
            return 0.0f;
        }
        float f14 = n4.c.f(n4.c.i(dVar.i(), j8));
        if (f14 >= Float.MAX_VALUE) {
            f14 = Float.MAX_VALUE;
        }
        float f15 = n4.c.f(n4.c.i(dVar.j(), j8));
        if (f15 < f14) {
            f14 = f15;
        }
        float f16 = n4.c.f(n4.c.i(dVar.d(), j8));
        if (f16 < f14) {
            f14 = f16;
        }
        float f17 = n4.c.f(n4.c.i(dVar.e(), j8));
        return f17 < f14 ? f17 : f14;
    }

    public static final long e(g2 g2Var, long j8) {
        n4.c cVarA;
        f5.c0 c0VarE = g2Var.e();
        if (c0VarE != null) {
            f5.c0 c0VarB = g2Var.b();
            if (c0VarB != null) {
                cVarA = n4.c.a((c0VarE.isAttached() && c0VarB.isAttached()) ? c0VarE.b0(c0VarB, j8) : j8);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                return cVarA.f123544a;
            }
        }
        return j8;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final h4.r g(h4.r rVar, b1 b1Var, p006l2.b2 b2Var, z2.h2 h2Var) {
        return rVar.then(new w0(b1Var, b2Var, h2Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final u13.a h(g3 g3Var, h2 h2Var, g2 g2Var, x5.q qVar, w1.a aVar, e23.l lVar, e23.a aVar2, t tVar, r53.y1 y1Var, a4 a4Var, e23.l lVar2, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f174956b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f174956b = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar);
            }
        } else {
            eVar = new e(cVar);
        }
        Object obj = eVar.f174955a;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f174956b;
        if (i15 == 0) {
            o13.r.b(obj);
            h hVar = new h(y1Var, h2Var, g2Var, tVar, g3Var, qVar, aVar, lVar, aVar2, a4Var, lVar2, null);
            eVar.f174956b = 1;
            if (o53.c0.e(hVar, eVar) == aVar3) {
                return aVar3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final u13.a i(g3 g3Var, h2 h2Var, g2 g2Var, x5.q qVar, w1.a aVar, w1.h.a.C3263a c3263a, u1 u1Var, r53.y1 y1Var, a4 a4Var, v1 v1Var, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f174942b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f174942b = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f174941a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f174942b;
        if (i15 == 0) {
            o13.r.b(obj);
            View f91361a = g3Var.getF91361a();
            t uVar = Build.VERSION.SDK_INT >= 34 ? new u(f91361a) : new t(f91361a);
            dVar2.f174942b = 1;
            if (h(g3Var, h2Var, g2Var, qVar, aVar, c3263a, u1Var, uVar, y1Var, a4Var, v1Var, dVar2) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }

    public static final void j(CharSequence charSequence, char[] cArr, int i14, int i15, int i16) {
        if (charSequence instanceof u2.e) {
            j(((u2.e) charSequence).f167839c, cArr, i14, i15, i16);
            return;
        }
        while (i15 < i16) {
            cArr[i14] = charSequence.charAt(i15);
            i15++;
            i14++;
        }
    }
}
