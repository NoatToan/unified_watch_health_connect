package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dng extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final LinearLayout C;
    public final LinearLayout D;

    public dng(Object obj, View view, int i, TextView textView, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = linearLayout;
        this.D = linearLayout2;
    }
}
