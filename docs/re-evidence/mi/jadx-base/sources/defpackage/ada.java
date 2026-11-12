package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ada extends ViewDataBinding {
    public final TextView A;
    public final tce B;
    public final LinearLayout C;

    public ada(Object obj, View view, int i, TextView textView, tce tceVar, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = tceVar;
        this.C = linearLayout;
    }
}
