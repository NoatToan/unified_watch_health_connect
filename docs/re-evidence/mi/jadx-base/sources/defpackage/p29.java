package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p29 extends ViewDataBinding {
    public final ImageView A;
    public final View B;
    public final ImageView C;
    public final EditText D;
    public final Group E;
    public final TextView F;

    public p29(Object obj, View view, int i, ImageView imageView, View view2, ImageView imageView2, EditText editText, Group group, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = view2;
        this.C = imageView2;
        this.D = editText;
        this.E = group;
        this.F = textView;
    }

    public static p29 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static p29 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (p29) ViewDataBinding.G(layoutInflater, ovi.J, viewGroup, z, obj);
    }
}
