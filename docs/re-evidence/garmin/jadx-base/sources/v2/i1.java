package v2;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.a4;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p006l2.i3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv2/i1;", "Landroid/view/inputmethod/InputConnection;", "Lx5/l0;", "initState", "Lv2/t0;", "eventCallback", "", "autoCorrect", "Ll2/b2;", "legacyTextFieldState", "Lz2/h2;", "textFieldSelectionManager", "Li5/a4;", "viewConfiguration", "<init>", "(Lx5/l0;Lv2/t0;ZLl2/b2;Lz2/h2;Li5/a4;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f175047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f175048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p006l2.b2 f175049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z2.h2 f175050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a4 f175051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f175052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x5.l0 f175053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f175054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f175055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f175056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f175057k;

    public /* synthetic */ i1(x5.l0 l0Var, t0 t0Var, boolean z14, p006l2.b2 b2Var, z2.h2 h2Var, a4 a4Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l0Var, t0Var, z14, (i14 & 8) != 0 ? null : b2Var, (i14 & 16) != 0 ? null : h2Var, (i14 & 32) != 0 ? null : a4Var);
    }

    public final void b(x5.k kVar) {
        this.f175052f++;
        try {
            this.f175056j.add(kVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z14 = this.f175057k;
        if (!z14) {
            return z14;
        }
        this.f175052f++;
        return true;
    }

    public final boolean c() {
        int i14 = this.f175052f - 1;
        this.f175052f = i14;
        if (i14 == 0) {
            ArrayList arrayList = this.f175056j;
            if (!arrayList.isEmpty()) {
                this.f175047a.d(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f175052f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i14) {
        boolean z14 = this.f175057k;
        if (z14) {
            return false;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f175056j.clear();
        this.f175052f = 0;
        this.f175057k = false;
        this.f175047a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z14 = this.f175057k;
        if (z14) {
            return false;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i14, Bundle bundle) {
        boolean z14 = this.f175057k;
        if (z14) {
            return false;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z14 = this.f175057k;
        return z14 ? this.f175048b : z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i14) {
        boolean z14 = this.f175057k;
        if (z14) {
            b(new x5.b(String.valueOf(charSequence), i14));
        }
        return z14;
    }

    public final void d(int i14) {
        sendKeyEvent(new KeyEvent(0, i14));
        sendKeyEvent(new KeyEvent(1, i14));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i14, int i15) {
        boolean z14 = this.f175057k;
        if (!z14) {
            return z14;
        }
        b(new x5.i(i14, i15));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i14, int i15) {
        boolean z14 = this.f175057k;
        if (!z14) {
            return z14;
        }
        b(new x5.j(i14, i15));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z14 = this.f175057k;
        if (!z14) {
            return z14;
        }
        b(new x5.n());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i14) {
        x5.l0 l0Var = this.f175053g;
        return TextUtils.getCapsMode(l0Var.f188878a.f157138b, s5.w0.h(l0Var.f188879b), i14);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i14) {
        boolean z14 = (i14 & 1) != 0;
        this.f175055i = z14;
        if (z14) {
            this.f175054h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return i.b(this.f175053g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i14) {
        if (s5.w0.e(this.f175053g.f188879b)) {
            return null;
        }
        return w2.a0.j(this.f175053g).f157138b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i14, int i15) {
        return w2.a0.k(this.f175053g, i14).f157138b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i14, int i15) {
        return w2.a0.l(this.f175053g, i14).f157138b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i14) {
        boolean z14 = this.f175057k;
        if (z14) {
            z14 = false;
            switch (i14) {
                case R.id.selectAll:
                    b(new x5.k0(0, this.f175053g.f188878a.f157138b.length()));
                    break;
                case R.id.cut:
                    d(277);
                    return false;
                case R.id.copy:
                    d(278);
                    return false;
                case R.id.paste:
                    d(279);
                    return false;
                default:
                    return false;
            }
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i14) {
        int i15;
        boolean z14 = this.f175057k;
        if (!z14) {
            return z14;
        }
        if (i14 != 0) {
            switch (i14) {
                case 2:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188921e;
                    break;
                case 3:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188922f;
                    break;
                case 4:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188923g;
                    break;
                case 5:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188925i;
                    break;
                case 6:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188926j;
                    break;
                case 7:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188924h;
                    break;
                default:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188920d;
                    break;
            }
        } else {
            x5.p.f188918b.getClass();
            i15 = x5.p.f188920d;
        }
        this.f175047a.a(i15);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0323 A[PHI: r6
      0x0323: PHI (r6v1 int) = 
      (r6v0 int)
      (r6v0 int)
      (r6v0 int)
      (r6v16 int)
      (r6v18 int)
      (r6v21 int)
      (r6v23 int)
      (r6v25 int)
      (r6v27 int)
      (r6v31 int)
      (r6v33 int)
      (r6v38 int)
     binds: [B:5:0x001c, B:7:0x0025, B:18:0x0040, B:114:0x02ae, B:106:0x0271, B:88:0x0216, B:83:0x01fe, B:62:0x018f, B:52:0x0164, B:44:0x0112, B:34:0x00c5, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i14;
        int i15;
        i3 i3VarD;
        s5.q0 q0Var;
        s5.q0 q0Var2;
        s5.o oVar;
        i3 i3VarD2;
        s5.q0 q0Var3;
        s5.q0 q0Var4;
        s5.o oVar2;
        s5.q0 q0Var5;
        s5.p0 p0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            l lVar = l.f175077a;
            uo1.a aVar = new uo1.a(this, 9);
            lVar.getClass();
            p006l2.b2 b2Var = this.f175049c;
            int iB = 3;
            if (b2Var != null) {
                m0.f175086a.getClass();
                s5.c cVar = b2Var.f108400j;
                if (cVar == null) {
                    i14 = 0;
                } else {
                    i3 i3VarD3 = b2Var.d();
                    if (cVar.equals((i3VarD3 == null || (q0Var5 = i3VarD3.f108575a) == null || (p0Var = q0Var5.f157280a) == null) ? null : p0Var.f157265a)) {
                        boolean zU = t8.n.u(handwritingGesture);
                        z2.h2 h2Var = this.f175050d;
                        if (zU) {
                            SelectGesture selectGestureR = k0.r(handwritingGesture);
                            n4.d dVarK = o4.l1.k(selectGestureR.getSelectionArea());
                            int iE = m0.e(selectGestureR.getGranularity());
                            s5.n0.f157248u0.getClass();
                            long j8 = o0.j(b2Var, dVarK, iE, s5.n0.a.f157251c);
                            if (s5.w0.e(j8)) {
                                iB = m0.b(k0.n(selectGestureR), aVar);
                                i14 = 0;
                            } else {
                                aVar.invoke(new x5.k0((int) (j8 >> 32), (int) (j8 & 4294967295L)));
                                if (h2Var != null) {
                                    h2Var.n(true);
                                }
                                i14 = 0;
                                iB = 1;
                            }
                        } else if (k0.C(handwritingGesture)) {
                            DeleteGesture deleteGestureL = k0.l(handwritingGesture);
                            int iE2 = m0.e(deleteGestureL.getGranularity());
                            n4.d dVarK2 = o4.l1.k(deleteGestureL.getDeletionArea());
                            s5.n0.f157248u0.getClass();
                            long j14 = o0.j(b2Var, dVarK2, iE2, s5.n0.a.f157251c);
                            if (s5.w0.e(j14)) {
                                iB = m0.b(k0.n(deleteGestureL), aVar);
                                i14 = 0;
                            } else {
                                s5.m0.f157245b.getClass();
                                m0.d(j14, cVar, iE2 == s5.m0.f157246c, aVar);
                                i14 = 0;
                                iB = 1;
                            }
                        } else if (k0.D(handwritingGesture)) {
                            SelectRangeGesture selectRangeGestureS = k0.s(handwritingGesture);
                            n4.d dVarK3 = o4.l1.k(selectRangeGestureS.getSelectionStartArea());
                            n4.d dVarK4 = o4.l1.k(selectRangeGestureS.getSelectionEndArea());
                            int iE3 = m0.e(selectRangeGestureS.getGranularity());
                            s5.n0.f157248u0.getClass();
                            long jC = o0.c(b2Var, dVarK3, dVarK4, iE3, s5.n0.a.f157251c);
                            if (s5.w0.e(jC)) {
                                iB = m0.b(k0.n(selectRangeGestureS), aVar);
                                i14 = 0;
                            } else {
                                aVar.invoke(new x5.k0((int) (jC >> 32), (int) (jC & 4294967295L)));
                                if (h2Var != null) {
                                    h2Var.n(true);
                                }
                                i14 = 0;
                                iB = 1;
                            }
                        } else if (k0.v(handwritingGesture)) {
                            DeleteRangeGesture deleteRangeGestureM = k0.m(handwritingGesture);
                            int iE4 = m0.e(deleteRangeGestureM.getGranularity());
                            n4.d dVarK5 = o4.l1.k(deleteRangeGestureM.getDeletionStartArea());
                            n4.d dVarK6 = o4.l1.k(deleteRangeGestureM.getDeletionEndArea());
                            s5.n0.f157248u0.getClass();
                            long jC2 = o0.c(b2Var, dVarK5, dVarK6, iE4, s5.n0.a.f157251c);
                            if (s5.w0.e(jC2)) {
                                iB = m0.b(k0.n(deleteRangeGestureM), aVar);
                                i14 = 0;
                            } else {
                                s5.m0.f157245b.getClass();
                                m0.d(jC2, cVar, iE4 == s5.m0.f157246c, aVar);
                                i14 = 0;
                                iB = 1;
                            }
                        } else {
                            boolean z14 = k0.z(handwritingGesture);
                            a4 a4Var = this.f175051e;
                            if (z14) {
                                JoinOrSplitGesture joinOrSplitGestureP = k0.p(handwritingGesture);
                                if (a4Var == null) {
                                    iB = m0.b(k0.n(joinOrSplitGestureP), aVar);
                                } else {
                                    long jG = o0.g(joinOrSplitGestureP.getJoinOrSplitPoint());
                                    i3 i3VarD4 = b2Var.d();
                                    int i16 = (i3VarD4 == null || (q0Var4 = i3VarD4.f108575a) == null || (oVar2 = q0Var4.f157281b) == null) ? -1 : o0.i(oVar2, jG, b2Var.c(), a4Var);
                                    if (i16 == -1 || !((i3VarD2 = b2Var.d()) == null || (q0Var3 = i3VarD2.f108575a) == null || !o0.e(q0Var3, i16))) {
                                        iB = m0.b(k0.n(joinOrSplitGestureP), aVar);
                                    } else {
                                        long jF = o0.f(i16, cVar);
                                        if (s5.w0.e(jF)) {
                                            int i17 = (int) (jF >> 32);
                                            aVar.invoke(new n0(new x5.k[]{new x5.k0(i17, i17), new x5.b(StringUtils.SPACE, 1)}));
                                        } else {
                                            m0.d(jF, cVar, false, aVar);
                                        }
                                        i14 = 0;
                                        iB = 1;
                                    }
                                }
                                i14 = 0;
                            } else {
                                if (k0.A(handwritingGesture)) {
                                    InsertGesture insertGestureO = k0.o(handwritingGesture);
                                    if (a4Var == null) {
                                        iB = m0.b(k0.n(insertGestureO), aVar);
                                    } else {
                                        long jG2 = o0.g(insertGestureO.getInsertionPoint());
                                        i3 i3VarD5 = b2Var.d();
                                        int i18 = (i3VarD5 == null || (q0Var2 = i3VarD5.f108575a) == null || (oVar = q0Var2.f157281b) == null) ? -1 : o0.i(oVar, jG2, b2Var.c(), a4Var);
                                        if (i18 == -1 || !((i3VarD = b2Var.d()) == null || (q0Var = i3VarD.f108575a) == null || !o0.e(q0Var, i18))) {
                                            iB = m0.b(k0.n(insertGestureO), aVar);
                                        } else {
                                            aVar.invoke(new n0(new x5.k[]{new x5.k0(i18, i18), new x5.b(insertGestureO.getTextToInsert(), 1)}));
                                            i14 = 0;
                                            iB = 1;
                                        }
                                    }
                                } else if (k0.B(handwritingGesture)) {
                                    RemoveSpaceGesture removeSpaceGestureQ = k0.q(handwritingGesture);
                                    i3 i3VarD6 = b2Var.d();
                                    long jB = o0.b(i3VarD6 != null ? i3VarD6.f108575a : null, o0.g(removeSpaceGestureQ.getStartPoint()), o0.g(removeSpaceGestureQ.getEndPoint()), b2Var.c(), a4Var);
                                    if (s5.w0.e(jB)) {
                                        iB = m0.b(k0.n(removeSpaceGestureQ), aVar);
                                    } else {
                                        p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
                                        p0Var2.f105807a = -1;
                                        p005kotlin.jvm.internal.p0 p0Var3 = new p005kotlin.jvm.internal.p0();
                                        p0Var3.f105807a = -1;
                                        String strE = new d53.k("\\s+").e(new l0(p0Var2, p0Var3, 0), og.a.b0(jB, cVar));
                                        int i19 = p0Var2.f105807a;
                                        if (i19 == -1 || (i15 = p0Var3.f105807a) == -1) {
                                            i14 = 0;
                                            iB = m0.b(k0.n(removeSpaceGestureQ), aVar);
                                        } else {
                                            i14 = 0;
                                            int i24 = (int) (jB >> 32);
                                            aVar.invoke(new n0(new x5.k[]{new x5.k0(i24 + i19, i24 + i15), new x5.b(strE.substring(i19, strE.length() - (s5.w0.f(jB) - p0Var3.f105807a)), 1)}));
                                            iB = 1;
                                        }
                                    }
                                } else {
                                    i14 = 0;
                                    iB = 2;
                                }
                                i14 = 0;
                            }
                        }
                    } else {
                        i14 = 0;
                    }
                }
            } else {
                i14 = 0;
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new k(intConsumer, iB, i14));
            } else {
                intConsumer.accept(iB);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z14 = this.f175057k;
        if (z14) {
            return true;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        s5.q0 q0Var;
        s5.p0 p0Var;
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        l.f175077a.getClass();
        p006l2.b2 b2Var = this.f175049c;
        if (b2Var == null) {
            return false;
        }
        m0.f175086a.getClass();
        s5.c cVar = b2Var.f108400j;
        if (cVar == null) {
            return false;
        }
        i3 i3VarD = b2Var.d();
        if (!cVar.equals((i3VarD == null || (q0Var = i3VarD.f108575a) == null || (p0Var = q0Var.f157280a) == null) ? null : p0Var.f157265a)) {
            return false;
        }
        boolean zU = t8.n.u(previewableHandwritingGesture);
        z2.h2 h2Var = this.f175050d;
        if (zU) {
            SelectGesture selectGestureR = k0.r(previewableHandwritingGesture);
            if (h2Var != null) {
                n4.d dVarK = o4.l1.k(selectGestureR.getSelectionArea());
                int iE = m0.e(selectGestureR.getGranularity());
                s5.n0.f157248u0.getClass();
                h2Var.A(o0.j(b2Var, dVarK, iE, s5.n0.a.f157251c));
            }
        } else if (k0.C(previewableHandwritingGesture)) {
            DeleteGesture deleteGestureL = k0.l(previewableHandwritingGesture);
            if (h2Var != null) {
                n4.d dVarK2 = o4.l1.k(deleteGestureL.getDeletionArea());
                int iE2 = m0.e(deleteGestureL.getGranularity());
                s5.n0.f157248u0.getClass();
                h2Var.y(o0.j(b2Var, dVarK2, iE2, s5.n0.a.f157251c));
            }
        } else if (k0.D(previewableHandwritingGesture)) {
            SelectRangeGesture selectRangeGestureS = k0.s(previewableHandwritingGesture);
            if (h2Var != null) {
                n4.d dVarK3 = o4.l1.k(selectRangeGestureS.getSelectionStartArea());
                n4.d dVarK4 = o4.l1.k(selectRangeGestureS.getSelectionEndArea());
                int iE3 = m0.e(selectRangeGestureS.getGranularity());
                s5.n0.f157248u0.getClass();
                h2Var.A(o0.c(b2Var, dVarK3, dVarK4, iE3, s5.n0.a.f157251c));
            }
        } else {
            if (!k0.v(previewableHandwritingGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGestureM = k0.m(previewableHandwritingGesture);
            if (h2Var != null) {
                n4.d dVarK5 = o4.l1.k(deleteRangeGestureM.getDeletionStartArea());
                n4.d dVarK6 = o4.l1.k(deleteRangeGestureM.getDeletionEndArea());
                int iE4 = m0.e(deleteRangeGestureM.getGranularity());
                s5.n0.f157248u0.getClass();
                h2Var.y(o0.c(b2Var, dVarK5, dVarK6, iE4, s5.n0.a.f157251c));
            }
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new f7.a(h2Var, 3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z14) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i14) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = this.f175057k;
        if (!z18) {
            return z18;
        }
        boolean z19 = false;
        boolean z24 = (i14 & 1) != 0;
        boolean z25 = (i14 & 2) != 0;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            boolean z26 = (i14 & 16) != 0;
            boolean z27 = (i14 & 8) != 0;
            boolean z28 = (i14 & 4) != 0;
            if (i15 >= 34 && (i14 & 32) != 0) {
                z19 = true;
            }
            if (z26 || z27 || z28 || z19) {
                z15 = z19;
                z14 = z28;
                z17 = z27;
                z16 = z26;
            } else if (i15 >= 34) {
                z16 = true;
                z17 = true;
                z14 = true;
                z15 = true;
            } else {
                z15 = z19;
                z16 = true;
                z17 = true;
                z14 = true;
            }
        } else {
            z14 = false;
            z15 = false;
            z16 = true;
            z17 = true;
        }
        this.f175047a.b(z24, z25, z16, z17, z14, z15);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z14 = this.f175057k;
        if (!z14) {
            return z14;
        }
        this.f175047a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i14, int i15) {
        boolean z14 = this.f175057k;
        if (z14) {
            b(new x5.i0(i14, i15));
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i14) {
        boolean z14 = this.f175057k;
        if (z14) {
            b(new x5.j0(String.valueOf(charSequence), i14));
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i14, int i15) {
        boolean z14 = this.f175057k;
        if (!z14) {
            return z14;
        }
        b(new x5.k0(i14, i15));
        return true;
    }

    public i1(x5.l0 l0Var, t0 t0Var, boolean z14, p006l2.b2 b2Var, z2.h2 h2Var, a4 a4Var) {
        this.f175047a = t0Var;
        this.f175048b = z14;
        this.f175049c = b2Var;
        this.f175050d = h2Var;
        this.f175051e = a4Var;
        this.f175053g = l0Var;
        this.f175056j = new ArrayList();
        this.f175057k = true;
    }
}
