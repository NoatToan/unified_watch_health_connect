package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.detail.view.SportShareEditView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gpp extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final RecyclerView C;
    public final TextView D;
    public final View E;
    public final SportShareEditView F;
    public final ImageView G;
    public final TabLayout H;
    public final ViewPager2 I;
    public final ConstraintLayout J;

    public gpp(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, TextView textView, View view2, SportShareEditView sportShareEditView, ImageView imageView2, TabLayout tabLayout, ViewPager2 viewPager2, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = recyclerView;
        this.D = textView;
        this.E = view2;
        this.F = sportShareEditView;
        this.G = imageView2;
        this.H = tabLayout;
        this.I = viewPager2;
        this.J = constraintLayout2;
    }
}
