package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b68 extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;

    public b68(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
    }
}
