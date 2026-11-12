package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mia extends ViewDataBinding {
    public final TextView A;
    public final hde B;
    public final LinearLayout C;

    public mia(Object obj, View view, int i, TextView textView, hde hdeVar, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = hdeVar;
        this.C = linearLayout;
    }
}
