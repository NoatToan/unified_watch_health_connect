package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wm6 extends ViewDataBinding {
    public final CardView A;
    public final EditText B;
    public final TextView C;
    public final LinearLayout D;
    public final RightArrowTwoLineTextView E;
    public final RightArrowTwoLineTextView F;
    public final SwitchButtonTwoLineTextView G;

    public wm6(Object obj, View view, int i, CardView cardView, EditText editText, TextView textView, LinearLayout linearLayout, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView2, SwitchButtonTwoLineTextView switchButtonTwoLineTextView) {
        super(obj, view, i);
        this.A = cardView;
        this.B = editText;
        this.C = textView;
        this.D = linearLayout;
        this.E = rightArrowTwoLineTextView;
        this.F = rightArrowTwoLineTextView2;
        this.G = switchButtonTwoLineTextView;
    }
}
