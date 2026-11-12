package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BubbleEntry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class n53 extends d12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p53 f27559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f27560b;
    public float[] c;
    public float[] d;

    public n53(p53 p53Var, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.f27560b = new float[4];
        this.c = new float[2];
        this.d = new float[3];
        this.f27559a = p53Var;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(fmq.e(1.5f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Canvas canvas, npc npcVar) {
        if (npcVar.O0() < 1) {
            return;
        }
        ryp transformer = this.f27559a.getTransformer(npcVar.m0());
        float fI = this.mAnimator.i();
        this.mXBounds.a(this.f27559a, npcVar);
        float[] fArr = this.f27560b;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        transformer.k(fArr);
        boolean zW = npcVar.w();
        float[] fArr2 = this.f27560b;
        float fMin = Math.min(Math.abs(this.mViewPortHandler.f() - this.mViewPortHandler.j()), Math.abs(fArr2[2] - fArr2[0]));
        int i = this.mXBounds.f14945a;
        while (true) {
            d12.a aVar = this.mXBounds;
            if (i > aVar.c + aVar.f14945a) {
                return;
            }
            BubbleEntry bubbleEntry = (BubbleEntry) npcVar.i(i);
            this.c[0] = bubbleEntry.getX();
            this.c[1] = bubbleEntry.getY() * fI;
            transformer.k(this.c);
            float fB = b(bubbleEntry.c(), npcVar.getMaxSize(), fMin, zW) / 2.0f;
            if (this.mViewPortHandler.D(this.c[1] + fB) && this.mViewPortHandler.A(this.c[1] - fB) && this.mViewPortHandler.B(this.c[0] + fB)) {
                if (!this.mViewPortHandler.C(this.c[0] - fB)) {
                    return;
                }
                this.mRenderPaint.setColor(npcVar.E0(i));
                float[] fArr3 = this.c;
                canvas.drawCircle(fArr3[0], fArr3[1], fB, this.mRenderPaint);
            }
            i++;
        }
    }

    public float b(float f, float f2, float f3, boolean z) {
        if (z) {
            f = f2 == 0.0f ? 1.0f : (float) Math.sqrt(f / f2);
        }
        return f3 * f;
    }

    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        for (T t : this.f27559a.getBubbleData().l()) {
            if (t.isVisible()) {
                a(canvas, t);
            }
        }
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        o53 bubbleData = this.f27559a.getBubbleData();
        float fI = this.mAnimator.i();
        for (r7c r7cVar : r7cVarArr) {
            npc npcVar = (npc) bubbleData.i(r7cVar.d());
            if (npcVar != null && npcVar.R()) {
                BubbleEntry bubbleEntry = (BubbleEntry) npcVar.v0(r7cVar.h(), r7cVar.j());
                if (bubbleEntry.getY() == r7cVar.j() && isInBoundsX(bubbleEntry, npcVar)) {
                    ryp transformer = this.f27559a.getTransformer(npcVar.m0());
                    float[] fArr = this.f27560b;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.k(fArr);
                    boolean zW = npcVar.w();
                    float[] fArr2 = this.f27560b;
                    float fMin = Math.min(Math.abs(this.mViewPortHandler.f() - this.mViewPortHandler.j()), Math.abs(fArr2[2] - fArr2[0]));
                    this.c[0] = bubbleEntry.getX();
                    this.c[1] = bubbleEntry.getY() * fI;
                    transformer.k(this.c);
                    float[] fArr3 = this.c;
                    r7cVar.m(fArr3[0], fArr3[1]);
                    float fB = b(bubbleEntry.c(), npcVar.getMaxSize(), fMin, zW) / 2.0f;
                    if (this.mViewPortHandler.D(this.c[1] + fB) && this.mViewPortHandler.A(this.c[1] - fB) && this.mViewPortHandler.B(this.c[0] + fB)) {
                        if (!this.mViewPortHandler.C(this.c[0] - fB)) {
                            return;
                        }
                        int iE0 = npcVar.E0((int) bubbleEntry.getX());
                        Color.RGBToHSV(Color.red(iE0), Color.green(iE0), Color.blue(iE0), this.d);
                        float[] fArr4 = this.d;
                        fArr4[2] = fArr4[2] * 0.5f;
                        this.mHighlightPaint.setColor(Color.HSVToColor(Color.alpha(iE0), this.d));
                        this.mHighlightPaint.setStrokeWidth(npcVar.k0());
                        float[] fArr5 = this.c;
                        canvas.drawCircle(fArr5[0], fArr5[1], fB, this.mHighlightPaint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        o53 bubbleData = this.f27559a.getBubbleData();
        if (bubbleData != null && isDrawingValuesAllowed(this.f27559a)) {
            List<T> listL = bubbleData.l();
            float fA = fmq.a(this.mValuePaint, "1");
            for (int i = 0; i < listL.size(); i++) {
                npc npcVar = (npc) listL.get(i);
                if (shouldDrawValues(npcVar) && npcVar.O0() >= 1) {
                    applyValueTextStyle(npcVar);
                    float fMax = Math.max(0.0f, Math.min(1.0f, this.mAnimator.h()));
                    float fI = this.mAnimator.i();
                    this.mXBounds.a(this.f27559a, npcVar);
                    ryp transformer = this.f27559a.getTransformer(npcVar.m0());
                    d12.a aVar = this.mXBounds;
                    float[] fArrA = transformer.a(npcVar, fI, aVar.f14945a, aVar.f14946b);
                    float f = fMax == 1.0f ? fI : fMax;
                    wye wyeVarD = wye.d(npcVar.P0());
                    wyeVarD.c = fmq.e(wyeVarD.c);
                    wyeVarD.d = fmq.e(wyeVarD.d);
                    int i2 = 0;
                    while (i2 < fArrA.length) {
                        int i3 = i2 / 2;
                        int iN = npcVar.n(this.mXBounds.f14945a + i3);
                        int iArgb = Color.argb(Math.round(255.0f * f), Color.red(iN), Color.green(iN), Color.blue(iN));
                        float f2 = fArrA[i2];
                        float f3 = fArrA[i2 + 1];
                        if (!this.mViewPortHandler.C(f2)) {
                            break;
                        }
                        if (this.mViewPortHandler.B(f2) && this.mViewPortHandler.F(f3)) {
                            BubbleEntry bubbleEntry = (BubbleEntry) npcVar.i(i3 + this.mXBounds.f14945a);
                            if (npcVar.l0()) {
                                drawValue(canvas, npcVar.d0(), bubbleEntry.c(), bubbleEntry, i, f2, f3 + (0.5f * fA), iArgb);
                            }
                            if (bubbleEntry.getIcon() != null && npcVar.D()) {
                                Drawable icon = bubbleEntry.getIcon();
                                fmq.f(canvas, icon, (int) (f2 + wyeVarD.c), (int) (f3 + wyeVarD.d), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
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
