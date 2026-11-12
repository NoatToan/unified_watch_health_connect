package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class eja extends ViewDataBinding {
    public final TextView A;
    public final jde B;
    public final LinearLayout C;

    public eja(Object obj, View view, int i, TextView textView, jde jdeVar, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = jdeVar;
        this.C = linearLayout;
    }
}
