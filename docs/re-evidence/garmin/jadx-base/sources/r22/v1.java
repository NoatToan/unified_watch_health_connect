package r22;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr22/v1;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", "space", "", TtmlNode.START, TtmlNode.END, "top", "bottom", "<init>", "(IZZZZ)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v1 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f149906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f149907e;

    public /* synthetic */ v1(int i14, boolean z14, boolean z15, boolean z16, boolean z17, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? false : z16, (i15 & 16) != 0 ? false : z17);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        if (recyclerView.getChildAdapterPosition(view2) == 0) {
            int iApplyDimension = (int) TypedValue.applyDimension(1, this.f149903a, view2.getResources().getDisplayMetrics());
            if (this.f149904b) {
                rect.left = iApplyDimension;
            }
            if (this.f149905c) {
                rect.right = iApplyDimension;
            }
            if (this.f149906d) {
                rect.top = iApplyDimension;
            }
            if (this.f149907e) {
                rect.bottom = iApplyDimension;
            }
        }
    }

    public v1(int i14, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f149903a = i14;
        this.f149904b = z14;
        this.f149905c = z15;
        this.f149906d = z16;
        this.f149907e = z17;
    }
}
