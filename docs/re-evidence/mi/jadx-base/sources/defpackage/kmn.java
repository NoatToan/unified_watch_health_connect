package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.tab.adapter.RunningRouteView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kmn extends ViewDataBinding {
    public final LinearLayout A;
    public final Button B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final LinearLayout G;
    public final TextView H;
    public final RunningRouteView I;

    public kmn(Object obj, View view, int i, LinearLayout linearLayout, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, LinearLayout linearLayout4, TextView textView3, RunningRouteView runningRouteView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = button;
        this.C = linearLayout2;
        this.D = linearLayout3;
        this.E = textView;
        this.F = textView2;
        this.G = linearLayout4;
        this.H = textView3;
        this.I = runningRouteView;
    }

    public static kmn A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kmn B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kmn) ViewDataBinding.G(layoutInflater, dvi.j0, viewGroup, z, obj);
    }
}
