package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z1g extends ViewDataBinding {
    public final TextView A;
    public final TextView B;

    public z1g(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
    }
}
