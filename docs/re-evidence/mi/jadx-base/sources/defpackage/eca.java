package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class eca extends ViewDataBinding {
    public final SwitchButtonBindingTwoLineTextView A;
    public final View B;
    public final SwitchButtonBindingSingleLineTextView C;
    public final TextView D;
    public final TextView E;
    public final RightArrowBindingSingleLineTextView F;
    public final SwitchButtonBindingTwoLineTextView G;
    public final RightArrowBindingSingleLineTextView H;
    public SleepModelViewModel I;

    public eca(Object obj, View view, int i, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, View view2, SwitchButtonBindingSingleLineTextView switchButtonBindingSingleLineTextView, TextView textView, TextView textView2, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView2) {
        super(obj, view, i);
        this.A = switchButtonBindingTwoLineTextView;
        this.B = view2;
        this.C = switchButtonBindingSingleLineTextView;
        this.D = textView;
        this.E = textView2;
        this.F = rightArrowBindingSingleLineTextView;
        this.G = switchButtonBindingTwoLineTextView2;
        this.H = rightArrowBindingSingleLineTextView2;
    }
}
