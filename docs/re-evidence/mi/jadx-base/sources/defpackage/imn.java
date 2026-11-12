package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.baseui.SportNumberPicker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class imn extends ViewDataBinding {
    public final LinearLayout A;
    public final Button B;
    public final Button C;
    public final LinearLayout D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final ConstraintLayout G;
    public final SportNumberPicker H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;

    public imn(Object obj, View view, int i, LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ConstraintLayout constraintLayout, SportNumberPicker sportNumberPicker, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = button;
        this.C = button2;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = linearLayout4;
        this.G = constraintLayout;
        this.H = sportNumberPicker;
        this.I = textView;
        this.J = textView2;
        this.K = textView3;
        this.L = textView4;
    }

    public static imn A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static imn B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (imn) ViewDataBinding.G(layoutInflater, dvi.i0, viewGroup, z, obj);
    }
}
