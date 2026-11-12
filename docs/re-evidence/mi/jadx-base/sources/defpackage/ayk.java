package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ayk extends ViewDataBinding {
    public final RecyclerView A;
    public final ViewPager2 B;

    public ayk(Object obj, View view, int i, RecyclerView recyclerView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = viewPager2;
    }
}
