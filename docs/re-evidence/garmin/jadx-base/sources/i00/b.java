package i00;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Li00/b;", "Lcom/github/mikephil/charting/renderer/YAxisRenderer;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "transformer", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends YAxisRenderer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f86710h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ValueFormatter f86714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f86717g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        h.o(viewPortHandler, yAxis, transformer);
        this.f86711a = true;
        this.f86712b = true;
        this.f86713c = true;
        this.f86714d = new yz.e();
        this.f86715e = 5;
        this.f86716f = true;
        this.f86717g = 5.0f;
    }

    public boolean a() {
        return false;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getF86711a() {
        return this.f86711a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getF86712b() {
        return this.f86712b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getF86713c() {
        return this.f86713c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public ValueFormatter getF86714d() {
        return this.f86714d;
    }

    public void f() {
    }

    public void g() {
        this.f86711a = false;
    }

    public void h() {
        this.f86712b = false;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fContentRight;
        float fContentRight2;
        float f14;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled() && canvas != null) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            float xOffset = this.mYAxis.getXOffset();
            float yOffset = this.mYAxis.getYOffset() + (Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f);
            YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            YAxis.YAxisLabelPosition labelPosition = this.mYAxis.getLabelPosition();
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                Paint paint = this.mAxisLabelPaint;
                if (labelPosition == yAxisLabelPosition) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    fContentRight = this.mViewPortHandler.offsetLeft();
                    f14 = fContentRight - xOffset;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    fContentRight2 = this.mViewPortHandler.offsetLeft();
                    f14 = fContentRight2 + xOffset;
                }
            } else {
                YAxis.YAxisLabelPosition yAxisLabelPosition2 = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                Paint paint2 = this.mAxisLabelPaint;
                if (labelPosition == yAxisLabelPosition2) {
                    paint2.setTextAlign(Paint.Align.LEFT);
                    fContentRight2 = this.mViewPortHandler.contentRight();
                    f14 = fContentRight2 + xOffset;
                } else {
                    paint2.setTextAlign(Paint.Align.RIGHT);
                    fContentRight = this.mViewPortHandler.contentRight();
                    f14 = fContentRight - xOffset;
                }
            }
            drawYLabels(canvas, f14, transformedPositions, yOffset);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li00/b$a;", "", "<init>", "()V", "", "DEFAULT_Y_LABEL_COUNT", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
