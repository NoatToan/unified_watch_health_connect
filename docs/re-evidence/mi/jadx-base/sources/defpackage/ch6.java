package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ch6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final NestedScrollView B;

    public ch6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = nestedScrollView;
    }
}
