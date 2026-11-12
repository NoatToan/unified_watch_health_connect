package v2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv2/a1;", "", "Lkotlin/Function1;", "Lo4/a1;", "", "localToScreen", "Lv2/u0;", "inputMethodManager", "<init>", "(Le23/l;Lv2/u0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<o4.a1, Unit> f174859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f174860b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f174862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f174863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f174864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f174865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f174866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f174867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x5.l0 f174868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s5.q0 f174869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x5.c0 f174870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n4.d f174871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n4.d f174872n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f174861c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f174873o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f174874p = o4.a1.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f174875q = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public a1(e23.l<? super o4.a1, Unit> lVar, u0 u0Var) {
        this.f174859a = lVar;
        this.f174860b = u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    public final void a() {
        ?? r14;
        u0 u0Var = this.f174860b;
        if (!u0Var.isActive() || this.f174868j == null || this.f174870l == null || this.f174869k == null || this.f174871m == null || this.f174872n == null) {
            return;
        }
        float[] fArr = this.f174874p;
        o4.a1.e(fArr);
        this.f174859a.invoke(o4.a1.a(fArr));
        n4.d dVar = this.f174872n;
        dVar.getClass();
        float f14 = -dVar.f123547a;
        n4.d dVar2 = this.f174872n;
        dVar2.getClass();
        o4.a1.i(fArr, f14, -dVar2.f123548b);
        Matrix matrix = this.f174875q;
        o4.l1.e(fArr, matrix);
        x5.l0 l0Var = this.f174868j;
        l0Var.getClass();
        long j8 = l0Var.f188879b;
        x5.c0 c0Var = this.f174870l;
        c0Var.getClass();
        s5.q0 q0Var = this.f174869k;
        q0Var.getClass();
        n4.d dVar3 = this.f174871m;
        dVar3.getClass();
        n4.d dVar4 = this.f174872n;
        dVar4.getClass();
        boolean z14 = this.f174864f;
        boolean z15 = this.f174865g;
        boolean z16 = this.f174866h;
        boolean z17 = this.f174867i;
        CursorAnchorInfo.Builder builder = this.f174873o;
        builder.reset();
        builder.setMatrix(matrix);
        s5.w0 w0Var = l0Var.f188880c;
        int iH = s5.w0.h(j8);
        builder.setSelectionRange(iH, s5.w0.g(j8));
        if (z14 && iH >= 0) {
            int iB = c0Var.b(iH);
            n4.d dVarC = q0Var.c(iB);
            float fD = j23.t.d(dVarC.f123547a, 0.0f, (int) (q0Var.f157282c >> 32));
            boolean zA = z0.a(dVar3, fD, dVarC.f123548b);
            boolean zA2 = z0.a(dVar3, fD, dVarC.f123550d);
            int i14 = 1;
            boolean z18 = q0Var.a(iB) == d6.g.Rtl;
            if (!zA && !zA2) {
                i14 = 0;
            }
            if (!zA || !zA2) {
                i14 |= 2;
            }
            if (z18) {
                i14 |= 4;
            }
            float f15 = dVarC.f123548b;
            float f16 = dVarC.f123550d;
            builder.setInsertionMarkerLocation(fD, f15, f16, f16, i14);
        }
        if (z15) {
            int iH2 = w0Var != null ? s5.w0.h(w0Var.f157317a) : -1;
            int iG = w0Var != null ? s5.w0.g(w0Var.f157317a) : -1;
            if (iH2 >= 0 && iH2 < iG) {
                builder.setComposingText(iH2, l0Var.f188878a.f157138b.subSequence(iH2, iG));
                int iB2 = c0Var.b(iH2);
                int iB3 = c0Var.b(iG);
                float[] fArr2 = new float[(iB3 - iB2) * 4];
                q0Var.f157281b.a(og.a.l(iB2, iB3), fArr2);
                int i15 = iH2;
                while (i15 < iG) {
                    int iB4 = c0Var.b(i15);
                    int i16 = (iB4 - iB2) * 4;
                    int i17 = iB2;
                    n4.d dVar5 = new n4.d(fArr2[i16], fArr2[i16 + 1], fArr2[i16 + 2], fArr2[i16 + 3]);
                    boolean zM = dVar3.m(dVar5);
                    if (!z0.a(dVar3, dVar5.f123547a, dVar5.f123548b) || !z0.a(dVar3, dVar5.f123549c, dVar5.f123550d)) {
                        r14 = zM;
                        r14 = (zM ? 1 : 0) | 2;
                    }
                    r14 = zM;
                    if (q0Var.a(iB4) == d6.g.Rtl) {
                        r14 = (r14 == true ? 1 : 0) | 4;
                    }
                    builder.addCharacterBounds(i15, dVar5.f123547a, dVar5.f123548b, dVar5.f123549c, dVar5.f123550d, r14 == true ? 1 : 0);
                    i15++;
                    iB2 = i17;
                }
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 33 && z16) {
            int i19 = z.f175270a;
            builder.setEditorBoundsInfo(ua1.k.c().setEditorBounds(o4.l1.i(dVar4)).setHandwritingBounds(o4.l1.i(dVar4)).build());
        }
        if (i18 >= 34 && z17) {
            a0.a(builder, q0Var, dVar3);
        }
        u0Var.updateCursorAnchorInfo(builder.build());
        this.f174863e = false;
    }
}
