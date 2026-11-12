package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_export.data.RouteInfo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ip0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final ConstraintLayout E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public RouteInfo J;

    public ip0(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = imageView;
        this.E = constraintLayout;
        this.F = imageView2;
        this.G = textView4;
        this.H = textView5;
        this.I = textView6;
    }

    public static ip0 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ip0 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ip0) ViewDataBinding.G(layoutInflater, dvi.f15971k, viewGroup, z, obj);
    }
}
