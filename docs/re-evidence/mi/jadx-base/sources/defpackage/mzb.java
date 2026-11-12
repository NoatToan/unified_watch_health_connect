package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.view.wm.SleepRegularView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mzb extends ViewDataBinding {
    public final a7e A;
    public final ConstraintLayout B;
    public final SleepRegularView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public mzb(Object obj, View view, int i, a7e a7eVar, ConstraintLayout constraintLayout, SleepRegularView sleepRegularView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = a7eVar;
        this.B = constraintLayout;
        this.C = sleepRegularView;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
    }
}
