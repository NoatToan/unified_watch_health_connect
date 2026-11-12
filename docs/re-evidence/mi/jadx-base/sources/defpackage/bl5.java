package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;

/* JADX INFO: loaded from: classes7.dex */
public class bl5 extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f4330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4331b;

    public bl5() {
        initPaint();
        this.f4331b = false;
    }

    public final boolean c(int i, Context context) {
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (uIUtils.isTabletAndLandscape(context)) {
            return i % 4 != 1;
        }
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || uIUtils.isTabletAndPortrait(context)) {
            return i % 3 != 1;
        }
        return i % 2 == 0;
    }

    public final void initPaint() {
        Paint paint = new Paint();
        this.f4330a = paint;
        paint.reset();
        this.f4330a.setAntiAlias(true);
        this.f4330a.setStyle(Paint.Style.STROKE);
        this.f4330a.setStrokeWidth(0.75f);
        this.f4330a.setColor(-16777216);
        this.f4330a.setAlpha(160);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int childCount = recyclerView.getChildCount();
        this.f4330a.setColor(x44.a(gki.common_divider_bg_color));
        for (int i = 0; i < childCount; i++) {
            if (i == 0) {
                if (this.f4331b) {
                    View childAt = recyclerView.getChildAt(i);
                    float bottom = childAt.getBottom();
                    Path path = new Path();
                    path.moveTo(childAt.getLeft() + DisplayUtil.dip2px(20.0f), bottom);
                    path.lineTo(childAt.getRight() - DisplayUtil.dip2px(20.0f), bottom);
                    canvas.drawPath(path, this.f4330a);
                }
            } else if (c(i, recyclerView.getContext())) {
                View childAt2 = recyclerView.getChildAt(i);
                float left = childAt2.getLeft();
                Path path2 = new Path();
                path2.moveTo(left, childAt2.getTop() + DisplayUtil.dip2px(6.0f));
                path2.lineTo(left, childAt2.getBottom() - DisplayUtil.dip2px(2.0f));
                canvas.drawPath(path2, this.f4330a);
            }
        }
    }

    public bl5(boolean z) {
        initPaint();
        this.f4331b = z;
    }
}
