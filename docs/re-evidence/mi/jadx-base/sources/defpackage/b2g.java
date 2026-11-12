package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b2g extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final ImageView E;
    public final RecyclerView F;
    public final TextView G;
    public final i2g H;
    public final ConstraintLayout I;
    public final ImageView J;

    public b2g(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, ImageView imageView3, RecyclerView recyclerView, TextView textView3, i2g i2gVar, ConstraintLayout constraintLayout, ImageView imageView4) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
        this.D = imageView2;
        this.E = imageView3;
        this.F = recyclerView;
        this.G = textView3;
        this.H = i2gVar;
        this.I = constraintLayout;
        this.J = imageView4;
    }

    public static b2g A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static b2g B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (b2g) ViewDataBinding.G(layoutInflater, rui.f32917r, viewGroup, z, obj);
    }
}
