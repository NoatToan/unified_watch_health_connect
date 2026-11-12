package r22;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr22/w1;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", ModelSourceWrapper.ORIENTATION, "firstAndLastItemSpacing", "defaultItemSpacing", "<init>", "(III)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w1 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149917c;

    public /* synthetic */ w1(int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 1 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.getClass();
        view2.getClass();
        recyclerView.getClass();
        b0Var.getClass();
        super.getItemOffsets(rect, view2, recyclerView, b0Var);
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
            int i14 = this.f149915a;
            int i15 = this.f149916b;
            int i16 = this.f149917c;
            if (childAdapterPosition == 0) {
                if (i14 == 0) {
                    rect.left = i15;
                    rect.right = i16;
                    return;
                } else {
                    rect.top = i15;
                    rect.bottom = i16;
                    return;
                }
            }
            if (childAdapterPosition == itemCount - 1) {
                if (i14 == 0) {
                    rect.left = i16;
                    rect.right = i15;
                    return;
                } else {
                    rect.top = i16;
                    rect.bottom = i15;
                    return;
                }
            }
            if (i14 == 0) {
                rect.left = i16;
                rect.right = i16;
            } else {
                rect.top = i16;
                rect.bottom = i16;
            }
        }
    }

    public w1(int i14, int i15, int i16) {
        this.f149915a = i14;
        this.f149916b = i15;
        this.f149917c = i16;
    }

    public w1() {
        this(0, 0, 0, 7, null);
    }
}
