package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class emn extends ViewDataBinding {
    public final LinearLayout A;
    public final Button B;
    public final Button C;
    public final Button D;
    public final CardView E;
    public final TextView F;
    public final LinearLayout G;
    public final TextView H;
    public final FlexboxLayout I;
    public final AppCompatEditText J;
    public final ConstraintLayout K;

    public emn(Object obj, View view, int i, LinearLayout linearLayout, Button button, Button button2, Button button3, CardView cardView, TextView textView, LinearLayout linearLayout2, TextView textView2, FlexboxLayout flexboxLayout, AppCompatEditText appCompatEditText, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = button;
        this.C = button2;
        this.D = button3;
        this.E = cardView;
        this.F = textView;
        this.G = linearLayout2;
        this.H = textView2;
        this.I = flexboxLayout;
        this.J = appCompatEditText;
        this.K = constraintLayout;
    }

    public static emn A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static emn B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (emn) ViewDataBinding.G(layoutInflater, dvi.g0, viewGroup, z, obj);
    }
}
