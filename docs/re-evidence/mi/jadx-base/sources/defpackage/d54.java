package defpackage;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class d54 extends dn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<dn5> f15095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<Chart> f15096b;
    public List<r7c> c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15097a;

        static {
            int[] iArr = new int[CombinedChart.DrawOrder.values().length];
            f15097a = iArr;
            try {
                iArr[CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15097a[CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15097a[CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15097a[CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15097a[CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d54(CombinedChart combinedChart, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.f15095a = new ArrayList(5);
        this.c = new ArrayList();
        this.f15096b = new WeakReference<>(combinedChart);
        a();
    }

    public void a() {
        this.f15095a.clear();
        CombinedChart combinedChart = (CombinedChart) this.f15096b.get();
        if (combinedChart == null) {
            return;
        }
        for (CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
            int i = a.f15097a[drawOrder.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && combinedChart.getScatterData() != null) {
                                this.f15095a.add(new bel(combinedChart, this.mAnimator, this.mViewPortHandler));
                            }
                        } else if (combinedChart.getCandleData() != null) {
                            this.f15095a.add(new xi3(combinedChart, this.mAnimator, this.mViewPortHandler));
                        }
                    } else if (combinedChart.getLineData() != null) {
                        this.f15095a.add(new age(combinedChart, this.mAnimator, this.mViewPortHandler));
                    }
                } else if (combinedChart.getBubbleData() != null) {
                    this.f15095a.add(new n53(combinedChart, this.mAnimator, this.mViewPortHandler));
                }
            } else if (combinedChart.getBarData() != null) {
                this.f15095a.add(new u02(combinedChart, this.mAnimator, this.mViewPortHandler));
            }
        }
    }

    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        Iterator<dn5> it = this.f15095a.iterator();
        while (it.hasNext()) {
            it.next().drawData(canvas);
        }
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
        Iterator<dn5> it = this.f15095a.iterator();
        while (it.hasNext()) {
            it.next().drawExtras(canvas);
        }
    }

    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        Object bubbleData;
        Chart chart = this.f15096b.get();
        if (chart == null) {
            return;
        }
        for (dn5 dn5Var : this.f15095a) {
            if (dn5Var instanceof u02) {
                bubbleData = ((u02) dn5Var).mChart.getBarData();
            } else if (dn5Var instanceof age) {
                bubbleData = ((age) dn5Var).mChart.getLineData();
            } else if (dn5Var instanceof xi3) {
                bubbleData = ((xi3) dn5Var).f39149a.getCandleData();
            } else if (dn5Var instanceof bel) {
                bubbleData = ((bel) dn5Var).f4126a.getScatterData();
            } else {
                bubbleData = dn5Var instanceof n53 ? ((n53) dn5Var).f27559a.getBubbleData() : null;
            }
            int iIndexOf = bubbleData == null ? -1 : ((h54) chart.getData()).y().indexOf(bubbleData);
            this.c.clear();
            for (r7c r7cVar : r7cVarArr) {
                if (r7cVar.c() == iIndexOf || r7cVar.c() == -1) {
                    this.c.add(r7cVar);
                }
            }
            List<r7c> list = this.c;
            dn5Var.drawHighlighted(canvas, (r7c[]) list.toArray(new r7c[list.size()]));
        }
    }

    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        Iterator<dn5> it = this.f15095a.iterator();
        while (it.hasNext()) {
            it.next().drawValues(canvas);
        }
    }

    @Override // defpackage.dn5
    public void initBuffers() {
        Iterator<dn5> it = this.f15095a.iterator();
        while (it.hasNext()) {
            it.next().initBuffers();
        }
    }
}
