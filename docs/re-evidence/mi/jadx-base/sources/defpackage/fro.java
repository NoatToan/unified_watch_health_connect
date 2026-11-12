package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes8.dex */
public class fro extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        int childCount = recyclerView.getChildCount();
        dro droVar = (dro) recyclerView.getAdapter();
        for (int i = 0; i < childCount; i++) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i));
            gro groVarK = droVar.k(childAdapterPosition);
            if (groVarK != null && groVarK.f == 0) {
                rect.bottom = DisplayUtil.dip2px(5.0f);
            }
            if (droVar.isBottomView(childAdapterPosition)) {
                rect.top = DisplayUtil.dip2px(20.0f);
            }
        }
    }
}
