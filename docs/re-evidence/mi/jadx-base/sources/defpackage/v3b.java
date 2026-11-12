package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;

/* JADX INFO: loaded from: classes7.dex */
public class v3b extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f36433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36434b;

    public v3b(boolean z) {
        initPaint();
        this.f36434b = z;
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.f36433a = paint;
        paint.reset();
        this.f36433a.setAntiAlias(true);
        this.f36433a.setStyle(Paint.Style.STROKE);
        this.f36433a.setStrokeWidth(0.75f);
        this.f36433a.setColor(-16777216);
        this.f36433a.setAlpha(160);
    }

    public final boolean c(int i) {
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || UIUtils.INSTANCE.isTabletAndLandscape(AppUtil.getApp())) {
            return i % 3 != 0;
        }
        return i % 2 != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int childCount = recyclerView.getChildCount();
        this.f36433a.setColor(x44.a(gki.common_divider_bg_color));
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                View childAt = recyclerView.getChildAt(i);
                float left = childAt.getLeft();
                Path path = new Path();
                path.moveTo(left, childAt.getTop() + DisplayUtil.dip2px(6.0f));
                path.lineTo(left, childAt.getBottom() - DisplayUtil.dip2px(2.0f));
                canvas.drawPath(path, this.f36433a);
            }
        }
    }
}
