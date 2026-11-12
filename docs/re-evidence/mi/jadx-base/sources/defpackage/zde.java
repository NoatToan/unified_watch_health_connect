package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zde extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final TextView F;

    public zde(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = imageView3;
        this.D = imageView4;
        this.E = imageView5;
        this.F = textView;
    }

    public static zde A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static zde B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zde) ViewDataBinding.G(layoutInflater, uvi.f36191b, viewGroup, z, obj);
    }
}
