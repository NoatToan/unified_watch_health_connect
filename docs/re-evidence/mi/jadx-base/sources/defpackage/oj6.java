package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oj6 extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final NestedScrollView C;

    public oj6(Object obj, View view, int i, Button button, Button button2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = button;
        this.B = button2;
        this.C = nestedScrollView;
    }
}
