package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gn6 extends ViewDataBinding {
    public final Button A;
    public final LinearLayout B;
    public final ConstraintLayout C;
    public final TextView D;
    public final ViewPager E;
    public final kn6 F;

    public gn6(Object obj, View view, int i, Button button, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, ViewPager viewPager, kn6 kn6Var) {
        super(obj, view, i);
        this.A = button;
        this.B = linearLayout;
        this.C = constraintLayout;
        this.D = textView;
        this.E = viewPager;
        this.F = kn6Var;
    }
}
