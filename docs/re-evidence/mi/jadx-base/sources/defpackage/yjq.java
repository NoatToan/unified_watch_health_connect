package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class yjq extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final SwitchButtonBindingSingleLineTextView C;
    public final SwitchButtonBindingSingleLineTextView D;

    public yjq(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, SwitchButtonBindingSingleLineTextView switchButtonBindingSingleLineTextView, SwitchButtonBindingSingleLineTextView switchButtonBindingSingleLineTextView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = switchButtonBindingSingleLineTextView;
        this.D = switchButtonBindingSingleLineTextView2;
    }
}
