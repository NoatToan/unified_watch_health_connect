package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ak6 extends ViewDataBinding {
    public final LinearLayout A;
    public final SwitchButtonBindingTwoLineTextView B;

    public ak6(Object obj, View view, int i, LinearLayout linearLayout, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = switchButtonBindingTwoLineTextView;
    }
}
