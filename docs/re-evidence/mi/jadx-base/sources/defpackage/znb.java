package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class znb extends ViewDataBinding {
    public final FilterSortView A;
    public final ViewPager B;

    public znb(Object obj, View view, int i, FilterSortView filterSortView, ViewPager viewPager) {
        super(obj, view, i);
        this.A = filterSortView;
        this.B = viewPager;
    }
}
