package ie;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class d implements RecyclerView.r {
    public d(ViewPager2 viewPager2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(View view2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void d(View view2) {
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) qVar).width == -1 && ((ViewGroup.MarginLayoutParams) qVar).height == -1) {
            return;
        }
        h.z("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
