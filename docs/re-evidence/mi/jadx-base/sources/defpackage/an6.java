package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class an6 extends ViewDataBinding {
    public final CheckBox A;
    public final CheckBox B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public an6(Object obj, View view, int i, CheckBox checkBox, CheckBox checkBox2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = checkBox;
        this.B = checkBox2;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }

    public static an6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static an6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (an6) ViewDataBinding.G(layoutInflater, eui.Y1, viewGroup, z, obj);
    }
}
