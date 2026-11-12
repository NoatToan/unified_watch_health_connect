package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vsr extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final SwitchButtonTwoLineTextView C;
    public final View D;
    public final Button E;
    public final SwitchButtonTwoLineTextView F;
    public final TextView G;
    public final TextView H;

    public vsr(Object obj, View view, int i, ImageView imageView, TextView textView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, View view2, Button button, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = switchButtonTwoLineTextView;
        this.D = view2;
        this.E = button;
        this.F = switchButtonTwoLineTextView2;
        this.G = textView2;
        this.H = textView3;
    }

    public static vsr A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static vsr B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vsr) ViewDataBinding.G(layoutInflater, wvi.f38407a, viewGroup, z, obj);
    }
}
