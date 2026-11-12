package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wsb extends ViewDataBinding {
    public final RadioButton A;
    public final RadioButton B;
    public final RadioButton C;
    public final RadioGroup D;
    public final TextView E;

    public wsb(Object obj, View view, int i, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, TextView textView) {
        super(obj, view, i);
        this.A = radioButton;
        this.B = radioButton2;
        this.C = radioButton3;
        this.D = radioGroup;
        this.E = textView;
    }

    public static wsb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static wsb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wsb) ViewDataBinding.G(layoutInflater, jui.b3, viewGroup, z, obj);
    }
}
