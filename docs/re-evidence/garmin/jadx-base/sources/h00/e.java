package h00;

import android.graphics.Canvas;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh00/e;", "Lh00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "Lpz/a;", "dotPattern", "Lpz/b;", "labelPattern", "", "emptyLabelsValid", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Lpz/a;Lpz/b;Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e extends h00.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pz.a f80612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final pz.b f80613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f80614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f80615p;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h00/e$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ValueFormatter {
        public a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            int iC = MathKt.c(f14);
            List<String> list = e.this.f80597a;
            if (list != null) {
                String str = (iC < 0 || iC >= list.size()) ? "" : list.get(iC);
                if (str != null) {
                    return str;
                }
            }
            return "";
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f80618b;

        static {
            int[] iArr = new int[pz.a.values().length];
            try {
                iArr[pz.a.ALL_LARGE_DOT_PATTERN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pz.a.LARGE_LIMIT_DOT_PATTERN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pz.a.ONE_BIG_THREE_SMALL_DOT_PATTERN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80617a = iArr;
            int[] iArr2 = new int[pz.b.values().length];
            try {
                iArr2[pz.b.BOUNDARY_LABEL_PATTERN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[pz.b.COMB_LABEL_PATTERN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f80618b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, pz.a aVar, pz.b bVar, boolean z14) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        aVar.getClass();
        bVar.getClass();
        this.f80612m = aVar;
        this.f80613n = bVar;
        this.f80614o = z14;
        this.f80601e = new a();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void computeAxisValues(float f14, float f15) {
        List<String> list = this.f80597a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                Float fValueOf = (this.f80614o || ((String) obj).length() > 0) ? Float.valueOf(i14) : null;
                if (fValueOf != null) {
                    arrayList.add(fValueOf);
                }
                i14 = i15;
            }
            float[] fArrY0 = h0.Y0(arrayList);
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = fArrY0;
            axisBase.mEntryCount = fArrY0.length;
            this.f80602f = fArrY0.length;
        }
        computeSize();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x0134  */
    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:6:0x0020 A[PHI: r1
      0x0020: PHI (r1v38 float) = (r1v4 float), (r1v3 float) binds: [B:10:0x0031, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        float f17;
        float f18;
        int i14;
        int i15;
        canvas.getClass();
        str.getClass();
        mPPointF.getClass();
        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, str) / 2;
        int i16 = this.f80615p;
        if (i16 != 0) {
            if (i16 == this.f80602f - 1) {
                fCalcTextWidth = this.mViewPortHandler.getChartWidth() - fCalcTextWidth;
                if (fCalcTextWidth < f14) {
                    f17 = fCalcTextWidth;
                }
            }
            f17 = f14;
        } else if (fCalcTextWidth > f14) {
            f17 = fCalcTextWidth;
        } else {
            f17 = f14;
        }
        int i17 = b.f80617a[this.f80612m.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                int i18 = this.f80615p;
                if (i18 == 0 || i18 == this.mXAxis.mEntryCount - 1) {
                    Utils.drawXAxisValue(canvas, "●", f14, f15 + (pz.d.f141919b / 4), this.f80599c, mPPointF, f16);
                } else {
                    f18 = f15 + (pz.d.f141919b / 4);
                    Utils.drawXAxisValue(canvas, "•", f14, f15, this.f80599c, mPPointF, f16);
                }
            } else if (i17 != 3) {
                f18 = f15 + (pz.d.f141919b / 4);
                Utils.drawXAxisValue(canvas, "•", f14, f15, this.f80599c, mPPointF, f16);
            } else if (this.f80615p % 4 == 0) {
                Utils.drawXAxisValue(canvas, "●", f14, f15 + (pz.d.f141919b / 4), this.mAxisLabelPaint, mPPointF, 0.0f);
            } else {
                f18 = f15 + (pz.d.f141919b / 4);
                Utils.drawXAxisValue(canvas, "•", f14, f15, this.mAxisLabelPaint, mPPointF, 0.0f);
            }
            i14 = b.f80618b[this.f80613n.ordinal()];
            if (i14 != 1) {
                i15 = this.f80615p;
                if (i15 != 0 || i15 == this.mXAxis.mEntryCount - 1) {
                    Utils.drawXAxisValue(canvas, str, f17, f18 + pz.d.f141918a, this.f80598b, mPPointF, f16);
                }
            } else if (i14 == 2 || this.f80615p % 4 == 0) {
                Utils.drawXAxisValue(canvas, str, f17, f18 + pz.d.f141918a, this.f80598b, mPPointF, f16);
            }
            this.f80615p++;
        }
        Utils.drawXAxisValue(canvas, "●", f14, f15 + (pz.d.f141919b / 4), this.f80599c, mPPointF, f16);
        f18 = f15;
        i14 = b.f80618b[this.f80613n.ordinal()];
        if (i14 != 1) {
            i15 = this.f80615p;
            if (i15 != 0) {
                Utils.drawXAxisValue(canvas, str, f17, f18 + pz.d.f141918a, this.f80598b, mPPointF, f16);
            } else {
                Utils.drawXAxisValue(canvas, str, f17, f18 + pz.d.f141918a, this.f80598b, mPPointF, f16);
            }
        } else if (i14 == 2) {
            Utils.drawXAxisValue(canvas, str, f17, f18 + pz.d.f141918a, this.f80598b, mPPointF, f16);
        } else {
            Utils.drawXAxisValue(canvas, str, f17, f18 + pz.d.f141918a, this.f80598b, mPPointF, f16);
        }
        this.f80615p++;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        canvas.getClass();
        mPPointF.getClass();
        this.f80615p = 0;
        super.drawLabels(canvas, f14, mPPointF);
    }

    public /* synthetic */ e(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, pz.a aVar, pz.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewPortHandler, xAxis, transformer, aVar, bVar, (i14 & 32) != 0 ? true : z14);
    }
}
