package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes8.dex */
public class a0o extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        int childCount = recyclerView.getChildCount();
        pin pinVar = (pin) recyclerView.getAdapter();
        for (int i = 0; i < childCount; i++) {
            b0o b0oVarL = pinVar.l(recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i)));
            if (b0oVarL == null || b0oVarL.f != 1) {
                rect.top = DisplayUtil.dip2px(5.0f);
                rect.bottom = DisplayUtil.dip2px(5.0f);
            } else {
                rect.top = DisplayUtil.dip2px(2.0f);
                rect.bottom = DisplayUtil.dip2px(2.0f);
            }
        }
    }
}
