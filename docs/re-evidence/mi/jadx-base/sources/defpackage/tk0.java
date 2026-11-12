package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.electronic.scale.model.UserDataViewModel;
import com.xiaomi.fitness.electronic.scale.widget.NoSwipeViewPager;
import com.xiaomi.fitness.electronic.scale.widget.titlebar.TitleBarAlphaView;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tk0 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final FilterSortView B;
    public final LinearLayoutCompat C;
    public final LinearLayout D;
    public final RecyclerView E;
    public final RelativeLayout F;
    public final TitleBarAlphaView G;
    public final NoSwipeViewPager H;
    public UserDataViewModel I;

    public tk0(Object obj, View view, int i, ConstraintLayout constraintLayout, FilterSortView filterSortView, LinearLayoutCompat linearLayoutCompat, LinearLayout linearLayout, RecyclerView recyclerView, RelativeLayout relativeLayout, TitleBarAlphaView titleBarAlphaView, NoSwipeViewPager noSwipeViewPager) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = filterSortView;
        this.C = linearLayoutCompat;
        this.D = linearLayout;
        this.E = recyclerView;
        this.F = relativeLayout;
        this.G = titleBarAlphaView;
        this.H = noSwipeViewPager;
    }
}
