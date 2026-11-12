package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cpp extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;

    public cpp(Object obj, View view, int i, TextView textView, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
    }

    public static cpp A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static cpp B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (cpp) ViewDataBinding.G(layoutInflater, ivi.R1, viewGroup, z, obj);
    }
}
