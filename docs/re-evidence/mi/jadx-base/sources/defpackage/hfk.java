package defpackage;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hfk extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final RadioButton E;
    public final RadioGroup F;
    public final RadioButton G;
    public final RadioButton H;

    public hfk(Object obj, View view, int i, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, RadioButton radioButton3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = constraintLayout;
        this.D = textView3;
        this.E = radioButton;
        this.F = radioGroup;
        this.G = radioButton2;
        this.H = radioButton3;
    }
}
