package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListViewModel;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kmh extends ViewDataBinding {
    public final FilterSortView A;
    public final ViewPager2 B;
    public PaymentOrderPageListViewModel C;

    public kmh(Object obj, View view, int i, FilterSortView filterSortView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = filterSortView;
        this.B = viewPager2;
    }
}
