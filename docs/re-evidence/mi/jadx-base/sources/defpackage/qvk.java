package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qvk extends ViewDataBinding {
    public final FilterSortView A;
    public final ViewPager B;

    public qvk(Object obj, View view, int i, FilterSortView filterSortView, ViewPager viewPager) {
        super(obj, view, i);
        this.A = filterSortView;
        this.B = viewPager;
    }
}
