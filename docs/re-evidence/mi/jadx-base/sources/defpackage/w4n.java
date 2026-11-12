package defpackage;

import android.app.Application;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes6.dex */
public class w4n extends h62 {
    @Override // defpackage.h62
    public void getCustomItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.getCustomItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getChildAdapterPosition(view);
        recyclerView.getChildCount();
        Application app = AppUtil.getApp();
        rect.top = app.getResources().getDimensionPixelSize(ili.common_margin_end);
        rect.right = app.getResources().getDimensionPixelSize(ili.common_margin_end);
    }
}
