package v2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv2/c0;", "", "Lv2/h2;", "textFieldState", "Lv2/g2;", "textLayoutState", "Lv2/q;", "composeImm", "Lo53/b0;", "monitorScope", "<init>", "(Lv2/h2;Lv2/g2;Lv2/q;Lo53/b0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f174896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f174897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f174898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.b0 f174899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o53.c2 f174900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f174901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f174902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f174903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f174904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f174905j = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f174906k = o4.a1.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f174907l = new Matrix();

    public c0(h2 h2Var, g2 g2Var, q qVar, o53.b0 b0Var) {
        this.f174896a = h2Var;
        this.f174897b = g2Var;
        this.f174898c = qVar;
        this.f174899d = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final CursorAnchorInfo a() {
        f5.c0 c0Var;
        f5.c0 c0VarB;
        s5.q0 q0VarC;
        ?? r14;
        g2 g2Var = this.f174897b;
        f5.c0 c0VarE = g2Var.e();
        if (c0VarE != null) {
            if (!c0VarE.isAttached()) {
                c0VarE = null;
            }
            if (c0VarE != null && (c0Var = (f5.c0) g2Var.f174999e.getF182175a()) != null) {
                if (!c0Var.isAttached()) {
                    c0Var = null;
                }
                if (c0Var != null && (c0VarB = g2Var.b()) != null) {
                    if (!c0VarB.isAttached()) {
                        c0VarB = null;
                    }
                    if (c0VarB != null && (q0VarC = g2Var.c()) != null) {
                        u2.e eVarD = this.f174896a.d();
                        float[] fArr = this.f174906k;
                        o4.a1.e(fArr);
                        c0VarE.i0(fArr);
                        Matrix matrix = this.f174907l;
                        o4.l1.e(fArr, matrix);
                        n4.d dVarC = z2.p1.c(c0Var);
                        n4.c.f123541b.getClass();
                        n4.d dVarO = dVarC.o(c0VarE.b0(c0Var, 0L));
                        n4.d dVarO2 = z2.p1.c(c0VarB).o(c0VarE.b0(c0VarB, 0L));
                        long j8 = eVarD.f167840d;
                        s5.w0 w0Var = eVarD.f167841e;
                        boolean z14 = this.f174901f;
                        boolean z15 = this.f174902g;
                        boolean z16 = this.f174903h;
                        boolean z17 = this.f174904i;
                        CursorAnchorInfo.Builder builder = this.f174905j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iH = s5.w0.h(j8);
                        builder.setSelectionRange(iH, s5.w0.g(j8));
                        if (z14 && iH >= 0) {
                            n4.d dVarC2 = q0VarC.c(iH);
                            float fD = j23.t.d(dVarC2.f123547a, 0.0f, (int) (q0VarC.f157282c >> 32));
                            boolean zA = z0.a(dVarO, fD, dVarC2.f123548b);
                            boolean zA2 = z0.a(dVarO, fD, dVarC2.f123550d);
                            int i14 = 1;
                            boolean z18 = q0VarC.a(iH) == d6.g.Rtl;
                            if (!zA && !zA2) {
                                i14 = 0;
                            }
                            if (!zA || !zA2) {
                                i14 |= 2;
                            }
                            if (z18) {
                                i14 |= 4;
                            }
                            float f14 = dVarC2.f123548b;
                            float f15 = dVarC2.f123550d;
                            builder.setInsertionMarkerLocation(fD, f14, f15, f15, i14);
                        }
                        if (z15) {
                            int iH2 = w0Var != null ? s5.w0.h(w0Var.f157317a) : -1;
                            int iG = w0Var != null ? s5.w0.g(w0Var.f157317a) : -1;
                            if (iH2 >= 0 && iH2 < iG) {
                                builder.setComposingText(iH2, eVarD.f167839c.subSequence(iH2, iG));
                                float[] fArr2 = new float[(iG - iH2) * 4];
                                q0VarC.f157281b.a(og.a.l(iH2, iG), fArr2);
                                for (int i15 = iH2; i15 < iG; i15++) {
                                    int i16 = (i15 - iH2) * 4;
                                    n4.d dVar = new n4.d(fArr2[i16], fArr2[i16 + 1], fArr2[i16 + 2], fArr2[i16 + 3]);
                                    boolean zM = dVarO.m(dVar);
                                    if (!z0.a(dVarO, dVar.f123547a, dVar.f123548b) || !z0.a(dVarO, dVar.f123549c, dVar.f123550d)) {
                                        r14 = zM;
                                        r14 = (zM ? 1 : 0) | 2;
                                    }
                                    r14 = zM;
                                    if (q0VarC.a(i15) == d6.g.Rtl) {
                                        r14 = (r14 == true ? 1 : 0) | 4;
                                    }
                                    builder.addCharacterBounds(i15, dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d, r14 == true ? 1 : 0);
                                }
                            }
                        }
                        int i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 33 && z16) {
                            int i18 = z.f175270a;
                            builder.setEditorBoundsInfo(ua1.k.c().setEditorBounds(o4.l1.i(dVarO2)).setHandwritingBounds(o4.l1.i(dVarO2)).build());
                        }
                        if (i17 >= 34 && z17) {
                            a0.a(builder, q0VarC, dVarO);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
