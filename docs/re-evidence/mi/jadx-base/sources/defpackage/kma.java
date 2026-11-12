package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kma extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final SwitchButtonTwoLineTextView B;

    public kma(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = switchButtonTwoLineTextView2;
    }
}
