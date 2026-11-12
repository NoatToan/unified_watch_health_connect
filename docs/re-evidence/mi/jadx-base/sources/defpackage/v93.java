package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes7.dex */
public class v93 extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        rect.bottom = DisplayUtil.dip2px(20.0f);
        rect.top = DisplayUtil.dip2px(20.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.onDrawOver(canvas, recyclerView, zVar);
    }
}
