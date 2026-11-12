package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gmn extends ViewDataBinding {
    public final LinearLayout A;
    public final Button B;
    public final Button C;
    public final TextView D;
    public final LinearLayout E;
    public final TextView F;
    public final FrameLayout G;
    public final LinearLayout H;
    public final RecyclerView I;

    public gmn(Object obj, View view, int i, LinearLayout linearLayout, Button button, Button button2, TextView textView, LinearLayout linearLayout2, TextView textView2, FrameLayout frameLayout, LinearLayout linearLayout3, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = button;
        this.C = button2;
        this.D = textView;
        this.E = linearLayout2;
        this.F = textView2;
        this.G = frameLayout;
        this.H = linearLayout3;
        this.I = recyclerView;
    }

    public static gmn A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static gmn B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (gmn) ViewDataBinding.G(layoutInflater, dvi.h0, viewGroup, z, obj);
    }
}
