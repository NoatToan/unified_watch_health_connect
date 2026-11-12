package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class cod extends ViewDataBinding {
    public final ImageView A;
    public final CheckBox B;
    public final TextView C;
    public final TextView D;

    public cod(Object obj, View view, int i, ImageView imageView, CheckBox checkBox, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = checkBox;
        this.C = textView;
        this.D = textView2;
    }

    public static cod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static cod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (cod) ViewDataBinding.G(layoutInflater, jui.m6, viewGroup, z, obj);
    }
}
