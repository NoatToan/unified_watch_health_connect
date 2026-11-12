package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qln extends ViewDataBinding {
    public final nan A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;

    public qln(Object obj, View view, int i, nan nanVar, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = nanVar;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
    }

    public static qln A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qln B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qln) ViewDataBinding.G(layoutInflater, dvi.Z, viewGroup, z, obj);
    }
}
