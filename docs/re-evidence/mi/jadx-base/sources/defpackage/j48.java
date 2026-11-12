package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j48 extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;

    public j48(Object obj, View view, int i, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
    }
}
