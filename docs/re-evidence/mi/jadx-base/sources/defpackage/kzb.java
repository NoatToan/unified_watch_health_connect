package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kzb extends ViewDataBinding {
    public final ImageView A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public kzb(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = linearLayout;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }

    public static kzb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kzb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kzb) ViewDataBinding.G(layoutInflater, jui.K4, viewGroup, z, obj);
    }
}
