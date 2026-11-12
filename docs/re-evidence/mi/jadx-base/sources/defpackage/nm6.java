package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nm6 extends ViewDataBinding {
    public final TextView A;
    public final EditText B;
    public final RightArrowTwoLineTextView C;
    public final RightArrowTwoLineTextView D;

    public nm6(Object obj, View view, int i, TextView textView, EditText editText, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = editText;
        this.C = rightArrowTwoLineTextView;
        this.D = rightArrowTwoLineTextView2;
    }
}
