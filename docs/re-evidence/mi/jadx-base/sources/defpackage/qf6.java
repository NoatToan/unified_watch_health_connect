package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qf6 extends ViewDataBinding {
    public final TextView A;
    public final SwitchButtonTwoLineTextView B;

    public qf6(Object obj, View view, int i, TextView textView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView) {
        super(obj, view, i);
        this.A = textView;
        this.B = switchButtonTwoLineTextView;
    }
}
