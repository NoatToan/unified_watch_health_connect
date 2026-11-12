package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes8.dex */
public class ofr extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f29122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29123b;

    public ofr() {
        initPaint();
        this.f29123b = false;
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.f29122a = paint;
        paint.reset();
        this.f29122a.setAntiAlias(true);
        this.f29122a.setStyle(Paint.Style.STROKE);
        this.f29122a.setStrokeWidth(0.75f);
        this.f29122a.setColor(-16777216);
        this.f29122a.setAlpha(160);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int childCount = recyclerView.getChildCount();
        this.f29122a.setColor(x44.a(gki.common_divider_bg_color));
        for (int i = 0; i < childCount; i++) {
            if (i == 1) {
                View childAt = recyclerView.getChildAt(i);
                float left = childAt.getLeft();
                Path path = new Path();
                path.moveTo(left, childAt.getTop() + DisplayUtil.dip2px(6.0f));
                path.lineTo(left, childAt.getBottom() - DisplayUtil.dip2px(2.0f));
                canvas.drawPath(path, this.f29122a);
            }
        }
    }
}
