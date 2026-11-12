package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class m1g extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final ImageView D;

    public m1g(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = imageView2;
    }

    public static m1g A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static m1g B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (m1g) ViewDataBinding.G(layoutInflater, rui.m, viewGroup, z, obj);
    }
}
