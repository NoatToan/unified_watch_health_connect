package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ida extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final FilterSortView B;
    public final NestedScrollView C;
    public final TabLayout D;
    public final TitleBarAlphaView E;

    public ida(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, FilterSortView filterSortView, NestedScrollView nestedScrollView, TabLayout tabLayout, TitleBarAlphaView titleBarAlphaView) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = filterSortView;
        this.C = nestedScrollView;
        this.D = tabLayout;
        this.E = titleBarAlphaView;
    }

    public static ida A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ida B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ida) ViewDataBinding.G(layoutInflater, jui.g1, viewGroup, z, obj);
    }
}
