package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vnh extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final ConstraintLayout E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public vnh(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, ImageView imageView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = constraintLayout;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
    }

    public static vnh A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static vnh B0(LayoutInflater layoutInflater, Object obj) {
        return (vnh) ViewDataBinding.G(layoutInflater, uui.f36157k, null, false, obj);
    }
}
