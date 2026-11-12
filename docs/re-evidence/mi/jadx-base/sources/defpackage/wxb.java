package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.ecg.view.EcgCombineView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wxb extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final EcgCombineView C;
    public final ConstraintLayout D;
    public final TextView E;
    public final RadioButton F;
    public final TextView G;
    public final ImageView H;
    public final TextView I;

    public wxb(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, EcgCombineView ecgCombineView, ConstraintLayout constraintLayout2, TextView textView2, RadioButton radioButton, TextView textView3, ImageView imageView, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = ecgCombineView;
        this.D = constraintLayout2;
        this.E = textView2;
        this.F = radioButton;
        this.G = textView3;
        this.H = imageView;
        this.I = textView4;
    }
}
