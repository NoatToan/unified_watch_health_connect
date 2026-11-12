package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k1g extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final Button C;
    public final TextView D;

    public k1g(Object obj, View view, int i, TextView textView, ImageView imageView, Button button, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = button;
        this.D = textView2;
    }

    public static k1g A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static k1g B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (k1g) ViewDataBinding.G(layoutInflater, rui.l, viewGroup, z, obj);
    }
}
