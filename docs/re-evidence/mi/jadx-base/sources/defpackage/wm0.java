package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingVM;
import com.xiaomi.fitness.sport_eco.view.interval.ScrollViewPager;
import com.xiaomi.fitness.sport_eco.view.widget.ExpandableTextView;
import com.xiaomi.fitness.widget.view.RatioImageView;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wm0 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ExpandableTextView B;
    public final FilterSortView C;
    public final RatioImageView D;
    public final TextView E;
    public final ScrollViewPager F;
    public IntervalTrainingVM G;

    public wm0(Object obj, View view, int i, ConstraintLayout constraintLayout, ExpandableTextView expandableTextView, FilterSortView filterSortView, RatioImageView ratioImageView, TextView textView, ScrollViewPager scrollViewPager) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = expandableTextView;
        this.C = filterSortView;
        this.D = ratioImageView;
        this.E = textView;
        this.F = scrollViewPager;
    }
}
