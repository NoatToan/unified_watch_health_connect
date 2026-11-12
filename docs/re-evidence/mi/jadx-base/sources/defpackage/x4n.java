package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class x4n extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38695a;

    public x4n(int i) {
        this.f38695a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int i = this.f38695a;
        rect.left = i;
        rect.right = i;
        rect.bottom = i;
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = this.f38695a;
        }
    }
}
