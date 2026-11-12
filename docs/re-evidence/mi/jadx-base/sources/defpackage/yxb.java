package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yxb extends ViewDataBinding {
    public final FlexboxLayout A;
    public final ImageView B;
    public final LinearLayout C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public yxb(Object obj, View view, int i, FlexboxLayout flexboxLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = flexboxLayout;
        this.B = imageView;
        this.C = linearLayout;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
    }

    public static yxb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yxb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yxb) ViewDataBinding.G(layoutInflater, jui.o4, viewGroup, z, obj);
    }
}
