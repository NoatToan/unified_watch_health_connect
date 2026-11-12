package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mxb extends ViewDataBinding {
    public final FlexboxLayout A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public mxb(Object obj, View view, int i, FlexboxLayout flexboxLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = flexboxLayout;
        this.B = imageView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
    }

    public static mxb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static mxb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mxb) ViewDataBinding.G(layoutInflater, jui.f4, viewGroup, z, obj);
    }
}
