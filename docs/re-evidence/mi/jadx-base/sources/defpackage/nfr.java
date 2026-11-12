package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;

/* JADX INFO: loaded from: classes9.dex */
public class nfr extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f27892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27893b;

    public nfr(int i) {
        this.f27893b = i;
        initPaint();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.f27892a = paint;
        paint.reset();
        this.f27892a.setAntiAlias(true);
        this.f27892a.setStyle(Paint.Style.STROKE);
        this.f27892a.setStrokeWidth(0.75f);
        this.f27892a.setColor(x44.a(gki.common_divider_bg_color));
    }

    public final boolean c(int i, boolean z) {
        if (z) {
            return i % 3 != 0;
        }
        return i % 2 != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int childCount = recyclerView.getChildCount();
        boolean z = SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || UIUtils.INSTANCE.isTabletAndLandscape(recyclerView.getContext());
        for (int i = 0; i < childCount; i++) {
            if (c(i, z)) {
                View childAt = recyclerView.getChildAt(i);
                float left = childAt.getLeft();
                Path path = new Path();
                path.moveTo(left, childAt.getTop() + this.f27893b);
                path.lineTo(left, childAt.getBottom() - this.f27893b);
                canvas.drawPath(path, this.f27892a);
            }
        }
    }
}
