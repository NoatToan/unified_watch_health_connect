package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bel extends ige {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public del f4126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f4127b;

    public bel(del delVar, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.f4127b = new float[2];
        this.f4126a = delVar;
    }

    public void a(Canvas canvas, wxc wxcVar) {
        if (wxcVar.O0() < 1) {
            return;
        }
        this.f4126a.getTransformer(wxcVar.m0());
        this.mAnimator.i();
        wxcVar.K();
    }

    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        for (T t : this.f4126a.getScatterData().l()) {
            if (t.isVisible()) {
                a(canvas, t);
            }
        }
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        cel scatterData = this.f4126a.getScatterData();
        for (r7c r7cVar : r7cVarArr) {
            wxc wxcVar = (wxc) scatterData.i(r7cVar.d());
            if (wxcVar != null && wxcVar.R()) {
                ?? V0 = wxcVar.v0(r7cVar.h(), r7cVar.j());
                if (isInBoundsX(V0, wxcVar)) {
                    vye vyeVarE = this.f4126a.getTransformer(wxcVar.m0()).e(V0.getX(), V0.getY() * this.mAnimator.i());
                    r7cVar.m((float) vyeVarE.c, (float) vyeVarE.d);
                    drawHighlightLines(canvas, (float) vyeVarE.c, (float) vyeVarE.d, wxcVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.f4126a)) {
            List<T> listL = this.f4126a.getScatterData().l();
            for (int i = 0; i < this.f4126a.getScatterData().j(); i++) {
                wxc wxcVar = (wxc) listL.get(i);
                if (shouldDrawValues(wxcVar) && wxcVar.O0() >= 1) {
                    applyValueTextStyle(wxcVar);
                    this.mXBounds.a(this.f4126a, wxcVar);
                    ryp transformer = this.f4126a.getTransformer(wxcVar.m0());
                    float fH = this.mAnimator.h();
                    float fI = this.mAnimator.i();
                    d12.a aVar = this.mXBounds;
                    float[] fArrD = transformer.d(wxcVar, fH, fI, aVar.f14945a, aVar.f14946b);
                    float fE = fmq.e(wxcVar.m());
                    wye wyeVarD = wye.d(wxcVar.P0());
                    wyeVarD.c = fmq.e(wyeVarD.c);
                    wyeVarD.d = fmq.e(wyeVarD.d);
                    int i2 = 0;
                    while (i2 < fArrD.length && this.mViewPortHandler.C(fArrD[i2])) {
                        if (this.mViewPortHandler.B(fArrD[i2])) {
                            int i3 = i2 + 1;
                            if (this.mViewPortHandler.F(fArrD[i3])) {
                                int i4 = i2 / 2;
                                ?? I = wxcVar.i(this.mXBounds.f14945a + i4);
                                if (wxcVar.l0()) {
                                    drawValue(canvas, wxcVar.d0(), I.getY(), I, i, fArrD[i2], fArrD[i3] - fE, wxcVar.n(i4 + this.mXBounds.f14945a));
                                }
                                if (I.getIcon() != null && wxcVar.D()) {
                                    Drawable icon = I.getIcon();
                                    fmq.f(canvas, icon, (int) (fArrD[i2] + wyeVarD.c), (int) (fArrD[i3] + wyeVarD.d), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            } else {
                                i2 = i2;
                                wyeVarD = wyeVarD;
                            }
                        } else {
                            i2 = i2;
                            wyeVarD = wyeVarD;
                        }
                        i2 += 2;
                        wyeVarD = wyeVarD;
                    }
                    wye.f(wyeVarD);
                }
            }
        }
    }

    @Override // defpackage.dn5
    public void initBuffers() {
    }
}
