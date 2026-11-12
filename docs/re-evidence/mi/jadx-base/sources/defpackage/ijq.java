package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ijq extends ViewDataBinding {
    public final Button A;
    public final RightArrowSingleLineTextView B;
    public final RightArrowSingleLineTextView C;
    public final RightArrowSingleLineTextView D;
    public final RadioButton E;
    public final RadioButton F;
    public final RadioGroup G;
    public final NestedScrollView H;
    public final TextView I;

    public ijq(Object obj, View view, int i, Button button, RightArrowSingleLineTextView rightArrowSingleLineTextView, RightArrowSingleLineTextView rightArrowSingleLineTextView2, RightArrowSingleLineTextView rightArrowSingleLineTextView3, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, NestedScrollView nestedScrollView, TextView textView) {
        super(obj, view, i);
        this.A = button;
        this.B = rightArrowSingleLineTextView;
        this.C = rightArrowSingleLineTextView2;
        this.D = rightArrowSingleLineTextView3;
        this.E = radioButton;
        this.F = radioButton2;
        this.G = radioGroup;
        this.H = nestedScrollView;
        this.I = textView;
    }
}
