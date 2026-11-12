package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;

/* JADX INFO: loaded from: classes10.dex */
public class so8 extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33835b;
    public int c;
    public int d;
    public boolean e = false;

    public so8(int i, int i2, boolean z) {
        this.c = i;
        this.d = i2;
        this.f33834a = z;
    }

    public so8 c(int i) {
        this.e = true;
        this.c = i;
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (this.e) {
            this.c = FaceIcon.LIST_SPACE;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iU = gridLayoutManager.u();
        if (this.d == 1) {
            int i = childAdapterPosition % iU;
            rect.left = i == 0 ? ExtUtilsKt.getDp(15) : this.c / 2;
            rect.right = i == iU + (-1) ? ExtUtilsKt.getDp(15) : this.c / 2;
            if (childAdapterPosition >= iU) {
                rect.top = this.f33835b;
                return;
            }
            return;
        }
        Logger.d("FaceDecor", "getItemOffsets: count = " + (gridLayoutManager.getItemCount() - 1) + " ;pos = " + childAdapterPosition);
        if (childAdapterPosition == gridLayoutManager.getItemCount()) {
            rect.right = 0;
            rect.left = 0;
            return;
        }
        if (!this.f33834a) {
            int i2 = childAdapterPosition % iU;
            rect.left = i2 == 0 ? 0 : this.c / 2;
            rect.right = i2 != iU - 1 ? this.c / 2 : 0;
        } else {
            if (childAdapterPosition == 0) {
                rect.right = 0;
                rect.left = 0;
                return;
            }
            int i3 = this.c;
            float f = (childAdapterPosition - 1) % iU;
            float f2 = iU;
            rect.left = Math.round(i3 - (((f * 1.0f) * i3) / f2));
            rect.right = Math.round(((f + 1.0f) * this.c) / f2);
        }
    }
}
