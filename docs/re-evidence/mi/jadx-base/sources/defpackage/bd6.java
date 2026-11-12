package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class bd6 extends ViewDataBinding {
    public final FilterSortView A;
    public final ViewPager2 B;

    public bd6(Object obj, View view, int i, FilterSortView filterSortView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = filterSortView;
        this.B = viewPager2;
    }
}
