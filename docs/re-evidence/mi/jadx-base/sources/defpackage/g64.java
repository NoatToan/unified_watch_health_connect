package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class g64 extends RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18644b;
    public int c;
    public boolean d;

    public g64(int i, boolean z) {
        this(i, i, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int iC = zVar.c() - 1;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (this.d || childAdapterPosition < iC) {
            rect.set(this.f18643a, 0, this.f18644b, this.c);
        } else {
            rect.set(this.f18643a, 0, this.f18644b, 0);
        }
    }

    public g64(int i, int i2, int i3, boolean z) {
        this.f18643a = i;
        this.f18644b = i2;
        this.c = i3;
        this.d = z;
    }
}
