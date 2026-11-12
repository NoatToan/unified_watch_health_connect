package mx0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmx0/d;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", "spacingPx", "<init>", "(F)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121346a;

    public d(float f14) {
        this.f121346a = MathKt.c(f14 / 2);
    }

    public static void e(d dVar, RecyclerView recyclerView, int i14) {
        boolean z14 = (i14 & 2) != 0;
        boolean z15 = (i14 & 4) != 0;
        int i15 = dVar.f121346a;
        recyclerView.getClass();
        recyclerView.setPaddingRelative(i15, z14 ? i15 : 0, i15, z15 ? i15 : 0);
        recyclerView.removeItemDecoration(dVar);
        recyclerView.addItemDecoration(dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        int i14 = this.f121346a;
        rect.set(i14, i14, i14, i14);
    }
}
