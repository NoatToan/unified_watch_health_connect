package x5;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import o4.a1;
import o4.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx5/g;", "", "Lb5/l;", "rootPositionCalculator", "Lx5/s;", "inputMethodManager", "<init>", "(Lb5/l;Lx5/s;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.l f188837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f188838b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f188840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f188841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f188842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f188843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f188844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f188845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l0 f188846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s5.q0 f188847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c0 f188848l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n4.d f188850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n4.d f188851o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f188839c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e23.l<? super a1, Unit> f188849m = a.f188855a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f188852p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f188853q = a1.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f188854r = new Matrix();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/a1;", "it", "", "invoke-58bKbWc", "([F)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<a1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f188855a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final /* synthetic */ Unit invoke(a1 a1Var) {
            float[] fArr = a1Var.f128808a;
            return Unit.INSTANCE;
        }
    }

    public g(b5.l lVar, s sVar) {
        this.f188837a = lVar;
        this.f188838b = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    public final void a() {
        ?? r14;
        s sVar = this.f188838b;
        if (sVar.isActive()) {
            e23.l<? super a1, Unit> lVar = this.f188849m;
            float[] fArr = this.f188853q;
            lVar.invoke(a1.a(fArr));
            this.f188837a.i(fArr);
            Matrix matrix = this.f188854r;
            l1.e(fArr, matrix);
            l0 l0Var = this.f188846j;
            l0Var.getClass();
            long j8 = l0Var.f188879b;
            c0 c0Var = this.f188848l;
            c0Var.getClass();
            s5.q0 q0Var = this.f188847k;
            q0Var.getClass();
            s5.o oVar = q0Var.f157281b;
            n4.d dVar = this.f188850n;
            dVar.getClass();
            n4.d dVar2 = this.f188851o;
            dVar2.getClass();
            boolean z14 = this.f188842f;
            boolean z15 = this.f188843g;
            boolean z16 = this.f188844h;
            boolean z17 = this.f188845i;
            CursorAnchorInfo.Builder builder = this.f188852p;
            builder.reset();
            builder.setMatrix(matrix);
            w0 w0Var = l0Var.f188880c;
            int iH = w0.h(j8);
            builder.setSelectionRange(iH, w0.g(j8));
            if (z14 && iH >= 0) {
                int iB = c0Var.b(iH);
                n4.d dVarC = q0Var.c(iB);
                float fD = j23.t.d(dVarC.f123547a, 0.0f, (int) (q0Var.f157282c >> 32));
                boolean zA = e.a(dVar, fD, dVarC.f123548b);
                boolean zA2 = e.a(dVar, fD, dVarC.f123550d);
                boolean z18 = q0Var.a(iB) == d6.g.Rtl;
                int i14 = (zA || zA2) ? 1 : 0;
                if (!zA || !zA2) {
                    i14 |= 2;
                }
                if (z18) {
                    i14 |= 4;
                }
                int i15 = i14;
                float f14 = dVarC.f123548b;
                float f15 = dVarC.f123550d;
                builder.setInsertionMarkerLocation(fD, f14, f15, f15, i15);
            }
            if (z15) {
                int iH2 = w0Var != null ? w0.h(w0Var.f157317a) : -1;
                int iG = w0Var != null ? w0.g(w0Var.f157317a) : -1;
                if (iH2 >= 0 && iH2 < iG) {
                    builder.setComposingText(iH2, l0Var.f188878a.f157138b.subSequence(iH2, iG));
                    int iB2 = c0Var.b(iH2);
                    int iB3 = c0Var.b(iG);
                    float[] fArr2 = new float[(iB3 - iB2) * 4];
                    oVar.a(og.a.l(iB2, iB3), fArr2);
                    while (iH2 < iG) {
                        int iB4 = c0Var.b(iH2);
                        int i16 = (iB4 - iB2) * 4;
                        int i17 = iB2;
                        int i18 = iG;
                        int i19 = iH2;
                        n4.d dVar3 = new n4.d(fArr2[i16], fArr2[i16 + 1], fArr2[i16 + 2], fArr2[i16 + 3]);
                        boolean zM = dVar.m(dVar3);
                        if (!e.a(dVar, dVar3.f123547a, dVar3.f123548b) || !e.a(dVar, dVar3.f123549c, dVar3.f123550d)) {
                            r14 = zM;
                            r14 = (zM ? 1 : 0) | 2;
                        }
                        r14 = zM;
                        if (q0Var.a(iB4) == d6.g.Rtl) {
                            r14 = (r14 == true ? 1 : 0) | 4;
                        }
                        builder.addCharacterBounds(i19, dVar3.f123547a, dVar3.f123548b, dVar3.f123549c, dVar3.f123550d, r14 == true ? 1 : 0);
                        iH2 = i19 + 1;
                        iB2 = i17;
                        iG = i18;
                    }
                }
            }
            int i24 = Build.VERSION.SDK_INT;
            if (i24 >= 33 && z16) {
                int i25 = c.f188825a;
                builder.setEditorBoundsInfo(ua1.k.c().setEditorBounds(l1.i(dVar2)).setHandwritingBounds(l1.i(dVar2)).build());
            }
            if (i24 >= 34 && z17) {
                int i26 = d.f188829a;
                if (!dVar.l()) {
                    int i27 = oVar.f157257f - 1;
                    if (i27 < 0) {
                        i27 = 0;
                    }
                    int iE = j23.t.e(oVar.e(dVar.f123548b), 0, i27);
                    int iE2 = j23.t.e(oVar.e(dVar.f123550d), 0, i27);
                    if (iE <= iE2) {
                        while (true) {
                            builder.addVisibleLineBounds(q0Var.g(iE), oVar.f(iE), q0Var.h(iE), oVar.b(iE));
                            if (iE == iE2) {
                                break;
                            } else {
                                iE++;
                            }
                        }
                    }
                }
            }
            sVar.updateCursorAnchorInfo(builder.build());
            this.f188841e = false;
        }
    }
}
