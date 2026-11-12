package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kzg extends ViewDataBinding {
    public final View A;
    public final EditText B;
    public final ImageView C;
    public final ImageView D;

    public kzg(Object obj, View view, int i, View view2, EditText editText, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.A = view2;
        this.B = editText;
        this.C = imageView;
        this.D = imageView2;
    }

    public static kzg A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kzg B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kzg) ViewDataBinding.G(layoutInflater, tui.e, viewGroup, z, obj);
    }
}
