package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uln extends ViewDataBinding {
    public final LinearLayout A;
    public final Button B;
    public final Button C;
    public final TextView D;
    public final LinearLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final RecyclerView H;

    public uln(Object obj, View view, int i, LinearLayout linearLayout, Button button, Button button2, TextView textView, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = button;
        this.C = button2;
        this.D = textView;
        this.E = linearLayout2;
        this.F = textView2;
        this.G = linearLayout3;
        this.H = recyclerView;
    }

    public static uln A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static uln B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uln) ViewDataBinding.G(layoutInflater, dvi.b0, viewGroup, z, obj);
    }
}
