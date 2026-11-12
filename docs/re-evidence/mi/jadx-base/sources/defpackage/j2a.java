package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j2a extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final LinearLayout H;
    public final TextView I;
    public final TextView J;
    public final ViewPager K;

    public j2a(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout, TextView textView7, TextView textView8, ViewPager viewPager) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
        this.G = textView6;
        this.H = linearLayout;
        this.I = textView7;
        this.J = textView8;
        this.K = viewPager;
    }

    public static j2a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static j2a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j2a) ViewDataBinding.G(layoutInflater, jvi.F, viewGroup, z, obj);
    }
}
