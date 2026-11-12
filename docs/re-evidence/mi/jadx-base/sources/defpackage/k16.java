package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class k16 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final Button H;
    public final Button I;

    public k16(Object obj, View view, int i, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, Button button, Button button2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatTextView3;
        this.E = appCompatTextView4;
        this.F = appCompatTextView5;
        this.G = appCompatTextView6;
        this.H = button;
        this.I = button2;
    }
}
