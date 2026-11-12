package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n48 extends ViewDataBinding {
    public final FlexboxLayout A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public n48(Object obj, View view, int i, FlexboxLayout flexboxLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = flexboxLayout;
        this.B = imageView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
    }

    public static n48 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static n48 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (n48) ViewDataBinding.G(layoutInflater, gui.I, viewGroup, z, obj);
    }
}
