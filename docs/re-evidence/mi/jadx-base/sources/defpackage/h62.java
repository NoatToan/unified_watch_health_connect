package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h62 extends RecyclerView.n {
    public void getCustomItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        getCustomItemOffsets(rect, view, recyclerView, zVar);
        if (q8p.a(view.getContext().getResources().getConfiguration().locale) == 1) {
            int i = rect.left;
            int i2 = rect.right ^ i;
            int i3 = i ^ i2;
            rect.left = i3;
            rect.right = i3 ^ i2;
        }
    }
}
