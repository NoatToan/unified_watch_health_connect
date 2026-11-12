package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dan extends ViewDataBinding {
    public final CheckBox A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;

    public dan(Object obj, View view, int i, CheckBox checkBox, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = checkBox;
        this.B = linearLayout;
        this.C = textView;
        this.D = textView2;
    }

    public static dan A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static dan B0(LayoutInflater layoutInflater, Object obj) {
        return (dan) ViewDataBinding.G(layoutInflater, dvi.Q, null, false, obj);
    }
}
