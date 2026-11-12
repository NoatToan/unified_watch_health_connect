package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.EcgEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qb7 extends zfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vfe f31308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f31309b;
    public onq c;

    public qb7(vfe vfeVar, onq onqVar) {
        super(vfeVar, onqVar);
        this.f31308a = vfeVar;
        this.c = onqVar;
        initChartPaint();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0098 A[LOOP:1: B:24:0x0092->B:26:0x0098, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0098, please report this as an issue */
    public <T extends RecyclerBarEntry> void a(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        float f;
        int i;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        Path path = new Path();
        path.reset();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i3 < childCount) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof EcgEntry) {
                List<Float> list = ((EcgEntry) recyclerBarEntry).f11751b;
                if (list.isEmpty()) {
                    break;
                }
                RectF rectFD = eu3.d(childAt, recyclerView, rtrVar, this.f31308a, recyclerBarEntry);
                float fWidth = rectFD.width() / list.size();
                float f2 = rectFD.left;
                if (i3 != 0 || f2 < paddingLeft) {
                    if (f2 < paddingLeft) {
                        float fB = b(list, list.size() - 1);
                        f = rectFD.right;
                        path.moveTo(f, eu3.k(fB, recyclerView, rtrVar, this.f31308a));
                    }
                    if (rectFD.left >= paddingLeft && rectFD.right <= width) {
                        for (i = i2; i < list.size(); i++) {
                            float fK = eu3.k(b(list, i), recyclerView, rtrVar, this.f31308a);
                            Logger.d("EcgLineChartRender", " values:" + b(list, i) + " yPosition:" + fK + " size:" + list.size());
                            path.lineTo((((float) i) * fWidth) + f2, fK);
                        }
                    }
                    z = true;
                } else {
                    float fB2 = b(list, i2);
                    f = rectFD.left;
                    path.moveTo(f, eu3.k(fB2, recyclerView, rtrVar, this.f31308a));
                }
                f2 = f;
                if (rectFD.left >= paddingLeft) {
                    while (i < list.size()) {
                        float fK2 = eu3.k(b(list, i), recyclerView, rtrVar, this.f31308a);
                        Logger.d("EcgLineChartRender", " values:" + b(list, i) + " yPosition:" + fK2 + " size:" + list.size());
                        path.lineTo((((float) i) * fWidth) + f2, fK2);
                    }
                }
                z = true;
            }
            i3++;
            i2 = 0;
        }
        if (z) {
            this.f31309b.setStrokeWidth(DisplayUtil.dip2px(0.8f));
            canvas.save();
            this.f31309b.setColor(x44.a(aji.j0));
            canvas.drawPath(path, this.f31309b);
            canvas.restore();
            this.f31309b.setColor(this.f31308a.O0);
        }
    }

    public final float b(List<Float> list, int i) {
        return list.get(i).floatValue();
    }

    @Override // defpackage.zfe
    public <T extends RecyclerBarEntry> void drawEcgChart(Canvas canvas, RecyclerView recyclerView, rtr rtrVar) {
        float f;
        float width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        float paddingLeft = recyclerView.getPaddingLeft();
        int childCount = recyclerView.getChildCount();
        this.f31309b.setStrokeWidth(DisplayUtil.dip2px(2.3f));
        Path path = new Path();
        path.reset();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) childAt.getTag();
            if (recyclerBarEntry instanceof EcgEntry) {
                List<Float> list = ((EcgEntry) recyclerBarEntry).f11750a;
                RectF rectFD = eu3.d(childAt, recyclerView, rtrVar, this.f31308a, recyclerBarEntry);
                float fWidth = rectFD.width() / list.size();
                float f2 = rectFD.left;
                if (i == 0 && f2 >= paddingLeft) {
                    float fB = b(list, 0);
                    f = rectFD.left;
                    path.moveTo(f, eu3.k(fB, recyclerView, rtrVar, this.f31308a));
                } else if (f2 < paddingLeft) {
                    float fB2 = b(list, list.size() - 1);
                    f = rectFD.right;
                    path.moveTo(f, eu3.k(fB2, recyclerView, rtrVar, this.f31308a));
                } else if (rectFD.left < paddingLeft && rectFD.right <= width) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        path.lineTo((i2 * fWidth) + f2, eu3.k(b(list, i2), recyclerView, rtrVar, this.f31308a));
                    }
                }
                f2 = f;
                if (rectFD.left < paddingLeft) {
                }
            }
        }
        canvas.drawPath(path, this.f31309b);
    }

    public final void initChartPaint() {
        Paint paint = new Paint();
        this.f31309b = paint;
        paint.reset();
        this.f31309b.setAntiAlias(true);
        this.f31309b.setStyle(Paint.Style.STROKE);
        this.f31309b.setStrokeCap(Paint.Cap.ROUND);
        this.f31309b.setStrokeJoin(Paint.Join.ROUND);
        this.f31309b.setStrokeWidth(DisplayUtil.dip2px(2.3f));
        this.f31309b.setColor(this.f31308a.O0);
    }
}
